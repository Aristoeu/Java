package MazeRecursion;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest20 {

    public static boolean debug = false;

    @Test
    public void test10001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10001");
        int[] intArray5 = new int[] { (short) 100, (byte) 1, (byte) 100, (byte) -1, (short) 1 };
        int[] intArray11 = new int[] { (short) 100, (byte) 1, (byte) 100, (byte) -1, (short) 1 };
        int[] intArray17 = new int[] { (short) 100, (byte) 1, (byte) 100, (byte) -1, (short) 1 };
        int[] intArray23 = new int[] { (short) 100, (byte) 1, (byte) 100, (byte) -1, (short) 1 };
        int[] intArray29 = new int[] { (short) 100, (byte) 1, (byte) 100, (byte) -1, (short) 1 };
        int[] intArray35 = new int[] { (short) 100, (byte) 1, (byte) 100, (byte) -1, (short) 1 };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray36, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 100, -1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 100, -1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 100, -1, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 100, -1, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 1, 100, -1, 1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[100, 1, 100, -1, 1]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test10002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10002");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 1, (short) 10 };
        int[] intArray9 = new int[] { (byte) -1, (short) 10, (short) 1, (short) 10 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test10003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10003");
        int[] intArray4 = new int[] { (short) -1, 10, (short) 10, (byte) 100 };
        int[] intArray9 = new int[] { (short) -1, 10, (short) 10, (byte) 100 };
        int[] intArray14 = new int[] { (short) -1, 10, (short) 10, (byte) 100 };
        int[] intArray19 = new int[] { (short) -1, 10, (short) 10, (byte) 100 };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 10, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 10, 10, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 10, 10, 100]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test10004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10004");
        int[] intArray5 = new int[] { ' ', 0, 10, (short) 0, 'a' };
        int[] intArray11 = new int[] { ' ', 0, 10, (short) 0, 'a' };
        int[] intArray17 = new int[] { ' ', 0, 10, (short) 0, 'a' };
        int[] intArray23 = new int[] { ' ', 0, 10, (short) 0, 'a' };
        int[] intArray29 = new int[] { ' ', 0, 10, (short) 0, 'a' };
        int[] intArray35 = new int[] { ' ', 0, 10, (short) 0, 'a' };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray36, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 0, 10, 0, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 0, 10, 0, 97]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 0, 10, 0, 97]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 0, 10, 0, 97]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[32, 0, 10, 0, 97]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[32, 0, 10, 0, 97]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test10005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10005");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray3 = new int[] { (byte) 0 };
        int[] intArray5 = new int[] { (byte) 0 };
        int[] intArray7 = new int[] { (byte) 0 };
        int[] intArray9 = new int[] { (byte) 0 };
        int[] intArray11 = new int[] { (byte) 0 };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (byte) 100, (int) (byte) 1);
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
    public void test10006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10006");
        int[] intArray5 = new int[] { ' ', (byte) 1, (short) 100, 100, (byte) 1 };
        int[] intArray11 = new int[] { ' ', (byte) 1, (short) 100, 100, (byte) 1 };
        int[] intArray17 = new int[] { ' ', (byte) 1, (short) 100, 100, (byte) 1 };
        int[] intArray23 = new int[] { ' ', (byte) 1, (short) 100, 100, (byte) 1 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1, 100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 1, 100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 1, 100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 1, 100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test10007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10007");
        int[] intArray2 = new int[] { '#', 10 };
        int[] intArray5 = new int[] { '#', 10 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 10]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test10008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10008");
        int[] intArray5 = new int[] { (short) 10, (short) 100, 0, (byte) -1, '4' };
        int[] intArray11 = new int[] { (short) 10, (short) 100, 0, (byte) -1, '4' };
        int[] intArray17 = new int[] { (short) 10, (short) 100, 0, (byte) -1, '4' };
        int[] intArray23 = new int[] { (short) 10, (short) 100, 0, (byte) -1, '4' };
        int[] intArray29 = new int[] { (short) 10, (short) 100, 0, (byte) -1, '4' };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray30, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 100, 0, -1, 52]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 100, 0, -1, 52]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 100, 0, -1, 52]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 100, 0, -1, 52]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 100, 0, -1, 52]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test10009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10009");
        int[] intArray3 = new int[] { 'a', ' ', (byte) -1 };
        int[] intArray7 = new int[] { 'a', ' ', (byte) -1 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 32, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 32, -1]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test10010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10010");
        int[] intArray3 = new int[] { 'a', '4', 0 };
        int[] intArray7 = new int[] { 'a', '4', 0 };
        int[] intArray11 = new int[] { 'a', '4', 0 };
        int[] intArray15 = new int[] { 'a', '4', 0 };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray16, (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 52, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 52, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 52, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 52, 0]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test10011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10011");
        int[] intArray6 = new int[] { (short) 100, '#', (short) 100, ' ', (short) 100, (byte) 0 };
        int[] intArray13 = new int[] { (short) 100, '#', (short) 100, ' ', (short) 100, (byte) 0 };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray14, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 35, 100, 32, 100, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 35, 100, 32, 100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test10012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10012");
        int[] intArray2 = new int[] { (byte) 10, (short) 1 };
        int[] intArray5 = new int[] { (byte) 10, (short) 1 };
        int[] intArray8 = new int[] { (byte) 10, (short) 1 };
        int[] intArray11 = new int[] { (byte) 10, (short) 1 };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
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
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test10013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10013");
        int[] intArray1 = new int[] { 1 };
        int[] intArray3 = new int[] { 1 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (int) 'a', (int) (short) 0);
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
    public void test10014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10014");
        int[] intArray1 = new int[] { 1 };
        int[] intArray3 = new int[] { 1 };
        int[] intArray5 = new int[] { 1 };
        int[] intArray7 = new int[] { 1 };
        int[] intArray9 = new int[] { 1 };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, (int) (byte) 0, (int) (short) 10);
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
    public void test10015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10015");
        int[] intArray2 = new int[] { (byte) 100, (short) 0 };
        int[] intArray5 = new int[] { (byte) 100, (short) 0 };
        int[] intArray8 = new int[] { (byte) 100, (short) 0 };
        int[] intArray11 = new int[] { (byte) 100, (short) 0 };
        int[] intArray14 = new int[] { (byte) 100, (short) 0 };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (int) '#', (int) (byte) -1);
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
    public void test10016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10016");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray3 = new int[] { (byte) 100 };
        int[] intArray5 = new int[] { (byte) 100 };
        int[] intArray7 = new int[] { (byte) 100 };
        int[] intArray9 = new int[] { (byte) 100 };
        int[] intArray11 = new int[] { (byte) 100 };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, 0, (int) ' ');
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
    public void test10017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10017");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, (int) '#', (int) (short) 10);
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
    public void test10018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10018");
        int[] intArray6 = new int[] { (byte) 10, (byte) 10, 100, 1, '4', 0 };
        int[] intArray13 = new int[] { (byte) 10, (byte) 10, 100, 1, '4', 0 };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray14, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10, 100, 1, 52, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10, 100, 1, 52, 0]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test10019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10019");
        int[] intArray5 = new int[] { (byte) 1, ' ', (short) 0, (byte) 10, (short) -1 };
        int[] intArray11 = new int[] { (byte) 1, ' ', (short) 0, (byte) 10, (short) -1 };
        int[] intArray17 = new int[] { (byte) 1, ' ', (short) 0, (byte) 10, (short) -1 };
        int[] intArray23 = new int[] { (byte) 1, ' ', (short) 0, (byte) 10, (short) -1 };
        int[] intArray29 = new int[] { (byte) 1, ' ', (short) 0, (byte) 10, (short) -1 };
        int[] intArray35 = new int[] { (byte) 1, ' ', (short) 0, (byte) 10, (short) -1 };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray36, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 32, 0, 10, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 32, 0, 10, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 32, 0, 10, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 32, 0, 10, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 32, 0, 10, -1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 32, 0, 10, -1]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test10020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10020");
        int[] intArray3 = new int[] { (short) 0, (short) 10, 1 };
        int[] intArray7 = new int[] { (short) 0, (short) 10, 1 };
        int[] intArray11 = new int[] { (short) 0, (short) 10, 1 };
        int[] intArray15 = new int[] { (short) 0, (short) 10, 1 };
        int[] intArray19 = new int[] { (short) 0, (short) 10, 1 };
        int[] intArray23 = new int[] { (short) 0, (short) 10, 1 };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 10, 1]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test10021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10021");
        int[] intArray3 = new int[] { 100, (byte) 1, ' ' };
        int[] intArray7 = new int[] { 100, (byte) 1, ' ' };
        int[] intArray11 = new int[] { 100, (byte) 1, ' ' };
        int[] intArray15 = new int[] { 100, (byte) 1, ' ' };
        int[] intArray19 = new int[] { 100, (byte) 1, ' ' };
        int[] intArray23 = new int[] { 100, (byte) 1, ' ' };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 32]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 32]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 32]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test10022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10022");
        int[] intArray3 = new int[] { (byte) 0, ' ', '4' };
        int[] intArray7 = new int[] { (byte) 0, ' ', '4' };
        int[] intArray11 = new int[] { (byte) 0, ' ', '4' };
        int[] intArray15 = new int[] { (byte) 0, ' ', '4' };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray16, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 52]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 32, 52]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 32, 52]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 32, 52]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test10023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10023");
        int[] intArray5 = new int[] { (short) 100, 100, 'a', (byte) 0, (short) 10 };
        int[] intArray11 = new int[] { (short) 100, 100, 'a', (byte) 0, (short) 10 };
        int[] intArray17 = new int[] { (short) 100, 100, 'a', (byte) 0, (short) 10 };
        int[] intArray23 = new int[] { (short) 100, 100, 'a', (byte) 0, (short) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100, 97, 0, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100, 97, 0, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100, 97, 0, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100, 97, 0, 10]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test10024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10024");
        int[] intArray4 = new int[] { 1, 100, 'a', (byte) 0 };
        int[] intArray9 = new int[] { 1, 100, 'a', (byte) 0 };
        int[] intArray14 = new int[] { 1, 100, 'a', (byte) 0 };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, 97, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 100, 97, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 100, 97, 0]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test10025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10025");
        int[] intArray1 = new int[] { (short) 1 };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test10026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10026");
        int[] intArray6 = new int[] { (byte) 100, (short) 100, 'a', (byte) 10, (short) 10, (byte) -1 };
        int[] intArray13 = new int[] { (byte) 100, (short) 100, 'a', (byte) 10, (short) 10, (byte) -1 };
        int[] intArray20 = new int[] { (byte) 100, (short) 100, 'a', (byte) 10, (short) 10, (byte) -1 };
        int[] intArray27 = new int[] { (byte) 100, (short) 100, 'a', (byte) 10, (short) 10, (byte) -1 };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray28, (int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100, 97, 10, 10, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100, 97, 10, 10, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100, 97, 10, 10, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100, 97, 10, 10, -1]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test10027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10027");
        int[] intArray5 = new int[] { '4', (short) 100, (short) 10, (byte) -1, 'a' };
        int[] intArray11 = new int[] { '4', (short) 100, (short) 10, (byte) -1, 'a' };
        int[] intArray17 = new int[] { '4', (short) 100, (short) 10, (byte) -1, 'a' };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 100, 10, -1, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 100, 10, -1, 97]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 100, 10, -1, 97]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test10028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10028");
        int[] intArray3 = new int[] { (short) -1, 'a', 1 };
        int[] intArray7 = new int[] { (short) -1, 'a', 1 };
        int[] intArray11 = new int[] { (short) -1, 'a', 1 };
        int[] intArray15 = new int[] { (short) -1, 'a', 1 };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray16, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 97, 1]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test10029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10029");
        int[] intArray5 = new int[] { (byte) 10, (short) 10, ' ', (-1), (byte) 0 };
        int[] intArray11 = new int[] { (byte) 10, (short) 10, ' ', (-1), (byte) 0 };
        int[] intArray17 = new int[] { (byte) 10, (short) 10, ' ', (-1), (byte) 0 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 32, -1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10, 32, -1, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10, 32, -1, 0]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test10030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10030");
        int[] intArray1 = new int[] { (byte) 100 };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, (int) (byte) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test10031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10031");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int[] intArray5 = new int[] { '4', (short) 1 };
        int[] intArray8 = new int[] { '4', (short) 1 };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray9, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[52, 1]");
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test10032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10032");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test10033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10033");
        int[] intArray5 = new int[] { (short) 10, (short) 100, (short) -1, ' ', (byte) 10 };
        int[] intArray11 = new int[] { (short) 10, (short) 100, (short) -1, ' ', (byte) 10 };
        int[] intArray17 = new int[] { (short) 10, (short) 100, (short) -1, ' ', (byte) 10 };
        int[] intArray23 = new int[] { (short) 10, (short) 100, (short) -1, ' ', (byte) 10 };
        int[] intArray29 = new int[] { (short) 10, (short) 100, (short) -1, ' ', (byte) 10 };
        int[] intArray35 = new int[] { (short) 10, (short) 100, (short) -1, ' ', (byte) 10 };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray36, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 100, -1, 32, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 100, -1, 32, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 100, -1, 32, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 100, -1, 32, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 100, -1, 32, 10]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[10, 100, -1, 32, 10]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test10034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10034");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray3 = new int[] { (byte) 10 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test10035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10035");
        int[] intArray5 = new int[] { (byte) 1, 0, (short) 1, (byte) -1, '#' };
        int[] intArray11 = new int[] { (byte) 1, 0, (short) 1, (byte) -1, '#' };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0, 1, -1, 35]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 0, 1, -1, 35]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test10036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10036");
        int[] intArray4 = new int[] { (byte) 100, (short) 100, 'a', (short) 100 };
        int[] intArray9 = new int[] { (byte) 100, (short) 100, 'a', (short) 100 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100, 97, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100, 97, 100]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test10037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10037");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray1, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test10038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10038");
        int[] intArray2 = new int[] { 10, (short) 100 };
        int[] intArray5 = new int[] { 10, (short) 100 };
        int[] intArray8 = new int[] { 10, (short) 100 };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray9, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
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
    public void test10039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10039");
        int[] intArray4 = new int[] { (short) 10, '4', (byte) 0, (byte) 1 };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 52, 0, 1]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test10040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10040");
        int[] intArray5 = new int[] { ' ', (byte) 1, (short) 1, (byte) 10, (short) 10 };
        int[] intArray11 = new int[] { ' ', (byte) 1, (short) 1, (byte) 10, (short) 10 };
        int[] intArray17 = new int[] { ' ', (byte) 1, (short) 1, (byte) 10, (short) 10 };
        int[] intArray23 = new int[] { ' ', (byte) 1, (short) 1, (byte) 10, (short) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1, 1, 10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 1, 1, 10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 1, 1, 10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 1, 1, 10, 10]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test10041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10041");
        int[] intArray6 = new int[] { 1, '4', (short) 100, (byte) 100, (byte) 1, (short) 100 };
        int[] intArray13 = new int[] { 1, '4', (short) 100, (byte) 100, (byte) 1, (short) 100 };
        int[] intArray20 = new int[] { 1, '4', (short) 100, (byte) 100, (byte) 1, (short) 100 };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray21, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 52, 100, 100, 1, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 52, 100, 100, 1, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 52, 100, 100, 1, 100]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test10042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10042");
        int[] intArray6 = new int[] { (byte) 100, (short) 0, '#', (short) 1, (byte) 100, (short) 100 };
        int[] intArray13 = new int[] { (byte) 100, (short) 0, '#', (short) 1, (byte) 100, (short) 100 };
        int[] intArray20 = new int[] { (byte) 100, (short) 0, '#', (short) 1, (byte) 100, (short) 100 };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray21, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 0, 35, 1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 0, 35, 1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0, 35, 1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test10043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10043");
        int[] intArray2 = new int[] { (byte) 10, (-1) };
        int[][] intArray3 = new int[][] { intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray3, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test10044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10044");
        int[] intArray3 = new int[] { (short) 1, ' ', ' ' };
        int[] intArray7 = new int[] { (short) 1, ' ', ' ' };
        int[] intArray11 = new int[] { (short) 1, ' ', ' ' };
        int[] intArray15 = new int[] { (short) 1, ' ', ' ' };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray16, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 32, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 32, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 32, 32]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test10045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10045");
        int[] intArray1 = new int[] { (byte) 0 };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test10046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10046");
        int[] intArray4 = new int[] { 10, ' ', 'a', (short) 100 };
        int[] intArray9 = new int[] { 10, ' ', 'a', (short) 100 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 32, 97, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 32, 97, 100]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test10047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10047");
        int[] intArray2 = new int[] { '4', 10 };
        int[] intArray5 = new int[] { '4', 10 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, 0, 0);
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
    public void test10048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10048");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray3 = new int[] { ' ' };
        int[] intArray5 = new int[] { ' ' };
        int[] intArray7 = new int[] { ' ' };
        int[] intArray9 = new int[] { ' ' };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, (int) (short) 0, (int) (short) -1);
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
    public void test10049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10049");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[][] intArray3 = new int[][] { intArray0, intArray1, intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray3, 1, 1);
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
    public void test10050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10050");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test10051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10051");
        int[] intArray3 = new int[] { 0, 0, (byte) -1 };
        int[] intArray7 = new int[] { 0, 0, (byte) -1 };
        int[] intArray11 = new int[] { 0, 0, (byte) -1 };
        int[] intArray15 = new int[] { 0, 0, (byte) -1 };
        int[] intArray19 = new int[] { 0, 0, (byte) -1 };
        int[] intArray23 = new int[] { 0, 0, (byte) -1 };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0, -1]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test10052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10052");
        int[] intArray2 = new int[] { (-1), 1 };
        int[] intArray5 = new int[] { (-1), 1 };
        int[] intArray8 = new int[] { (-1), 1 };
        int[] intArray11 = new int[] { (-1), 1 };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, 100, (int) '4');
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
    public void test10053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10053");
        int[] intArray6 = new int[] { (short) 100, (short) 10, (byte) -1, 1, '#', (byte) 100 };
        int[] intArray13 = new int[] { (short) 100, (short) 10, (byte) -1, 1, '#', (byte) 100 };
        int[] intArray20 = new int[] { (short) 100, (short) 10, (byte) -1, 1, '#', (byte) 100 };
        int[] intArray27 = new int[] { (short) 100, (short) 10, (byte) -1, 1, '#', (byte) 100 };
        int[] intArray34 = new int[] { (short) 100, (short) 10, (byte) -1, 1, '#', (byte) 100 };
        int[] intArray41 = new int[] { (short) 100, (short) 10, (byte) -1, 1, '#', (byte) 100 };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray42, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 10, -1, 1, 35, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, -1, 1, 35, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 10, -1, 1, 35, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 10, -1, 1, 35, 100]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 10, -1, 1, 35, 100]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, 10, -1, 1, 35, 100]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test10054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10054");
        int[] intArray2 = new int[] { (short) 10, ' ' };
        int[] intArray5 = new int[] { (short) 10, ' ' };
        int[] intArray8 = new int[] { (short) 10, ' ' };
        int[] intArray11 = new int[] { (short) 10, ' ' };
        int[] intArray14 = new int[] { (short) 10, ' ' };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 32]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 32]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 32]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test10055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10055");
        int[] intArray3 = new int[] { (short) 1, ' ', (byte) 10 };
        int[] intArray7 = new int[] { (short) 1, ' ', (byte) 10 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 32, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 32, 10]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test10056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10056");
        int[] intArray5 = new int[] { (byte) 100, (byte) 1, (byte) 100, ' ', (short) 10 };
        int[] intArray11 = new int[] { (byte) 100, (byte) 1, (byte) 100, ' ', (short) 10 };
        int[] intArray17 = new int[] { (byte) 100, (byte) 1, (byte) 100, ' ', (short) 10 };
        int[] intArray23 = new int[] { (byte) 100, (byte) 1, (byte) 100, ' ', (short) 10 };
        int[] intArray29 = new int[] { (byte) 100, (byte) 1, (byte) 100, ' ', (short) 10 };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray30, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 100, 32, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 100, 32, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 100, 32, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 1, 100, 32, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 1, 100, 32, 10]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test10057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10057");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray0, intArray1, intArray2, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) (short) 100, (int) (short) 1);
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
    public void test10058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10058");
        int[] intArray2 = new int[] { ' ', '#' };
        int[] intArray5 = new int[] { ' ', '#' };
        int[] intArray8 = new int[] { ' ', '#' };
        int[] intArray11 = new int[] { ' ', '#' };
        int[] intArray14 = new int[] { ' ', '#' };
        int[] intArray17 = new int[] { ' ', '#' };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray18, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
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
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 35]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test10059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10059");
        int[] intArray3 = new int[] { (byte) -1, 100, 100 };
        int[] intArray7 = new int[] { (byte) -1, 100, 100 };
        int[] intArray11 = new int[] { (byte) -1, 100, 100 };
        int[] intArray15 = new int[] { (byte) -1, 100, 100 };
        int[] intArray19 = new int[] { (byte) -1, 100, 100 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test10060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10060");
        int[] intArray3 = new int[] { '4', '4', ' ' };
        int[] intArray7 = new int[] { '4', '4', ' ' };
        int[] intArray11 = new int[] { '4', '4', ' ' };
        int[] intArray15 = new int[] { '4', '4', ' ' };
        int[] intArray19 = new int[] { '4', '4', ' ' };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 52, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[52, 52, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 52, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[52, 52, 32]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[52, 52, 32]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test10061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10061");
        int[] intArray5 = new int[] { (byte) 1, 100, ' ', (byte) 10, (short) -1 };
        int[] intArray11 = new int[] { (byte) 1, 100, ' ', (byte) 10, (short) -1 };
        int[] intArray17 = new int[] { (byte) 1, 100, ' ', (byte) 10, (short) -1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray18, 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 100, 32, 10, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 100, 32, 10, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 100, 32, 10, -1]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test10062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10062");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10063");
        int[] intArray4 = new int[] { (byte) -1, 10, (short) 10, 100 };
        int[] intArray9 = new int[] { (byte) -1, 10, (short) 10, 100 };
        int[] intArray14 = new int[] { (byte) -1, 10, (short) 10, 100 };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 10, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 10, 10, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 10, 10, 100]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test10064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10064");
        int[] intArray3 = new int[] { 100, (byte) 100, 10 };
        int[] intArray7 = new int[] { 100, (byte) 100, 10 };
        int[] intArray11 = new int[] { 100, (byte) 100, 10 };
        int[] intArray15 = new int[] { 100, (byte) 100, 10 };
        int[] intArray19 = new int[] { 100, (byte) 100, 10 };
        int[] intArray23 = new int[] { 100, (byte) 100, 10 };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, (int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100, 10]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test10065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10065");
        int[] intArray5 = new int[] { (byte) 1, (byte) 100, 0, (-1), ' ' };
        int[] intArray11 = new int[] { (byte) 1, (byte) 100, 0, (-1), ' ' };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 100, 0, -1, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 100, 0, -1, 32]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test10066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10066");
        int[] intArray5 = new int[] { (byte) 0, '4', (byte) 10, (byte) 1, (short) 10 };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 52, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test10067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10067");
        int[] intArray4 = new int[] { '#', (short) 1, 'a', '4' };
        int[] intArray9 = new int[] { '#', (short) 1, 'a', '4' };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, (int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 1, 97, 52]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[35, 1, 97, 52]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test10068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10068");
        int[] intArray6 = new int[] { ' ', (short) -1, (-1), (byte) 0, (short) 1, (byte) 1 };
        int[] intArray13 = new int[] { ' ', (short) -1, (-1), (byte) 0, (short) 1, (byte) 1 };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray14, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, -1, 0, 1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, -1, -1, 0, 1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test10069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10069");
        int[] intArray1 = new int[] { 0 };
        int[] intArray3 = new int[] { 0 };
        int[] intArray5 = new int[] { 0 };
        int[] intArray7 = new int[] { 0 };
        int[] intArray9 = new int[] { 0 };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, (int) (short) 0, (int) (short) -1);
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
    public void test10070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10070");
        int[] intArray5 = new int[] { (byte) 1, (byte) 1, (short) 1, (short) 0, 10 };
        int[] intArray11 = new int[] { (byte) 1, (byte) 1, (short) 1, (short) 0, 10 };
        int[] intArray17 = new int[] { (byte) 1, (byte) 1, (short) 1, (short) 0, 10 };
        int[] intArray23 = new int[] { (byte) 1, (byte) 1, (short) 1, (short) 0, 10 };
        int[] intArray29 = new int[] { (byte) 1, (byte) 1, (short) 1, (short) 0, 10 };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray30, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1, 1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1, 1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1, 1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1, 1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1, 1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test10071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10071");
        int[] intArray1 = new int[] { (short) 100 };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test10072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10072");
        int[] intArray2 = new int[] { (short) 0, (byte) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray3, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test10073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10073");
        int[] intArray2 = new int[] { 0, '#' };
        int[] intArray5 = new int[] { 0, '#' };
        int[] intArray8 = new int[] { 0, '#' };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray9, (int) (short) -1, (int) 'a');
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
    public void test10074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10074");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10075");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray0, intArray1, intArray2, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) (short) 1, 10);
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
    public void test10076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10076");
        int[] intArray6 = new int[] { (short) 1, (short) 0, (byte) -1, 1, (byte) -1, '4' };
        int[] intArray13 = new int[] { (short) 1, (short) 0, (byte) -1, 1, (byte) -1, '4' };
        int[] intArray20 = new int[] { (short) 1, (short) 0, (byte) -1, 1, (byte) -1, '4' };
        int[] intArray27 = new int[] { (short) 1, (short) 0, (byte) -1, 1, (byte) -1, '4' };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray28, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, -1, 1, -1, 52]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 0, -1, 1, -1, 52]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 0, -1, 1, -1, 52]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 0, -1, 1, -1, 52]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test10077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10077");
        int[] intArray2 = new int[] { (short) 0, (byte) 100 };
        int[] intArray5 = new int[] { (short) 0, (byte) 100 };
        int[] intArray8 = new int[] { (short) 0, (byte) 100 };
        int[] intArray11 = new int[] { (short) 0, (byte) 100 };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
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
    public void test10078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10078");
        int[] intArray6 = new int[] { (byte) 0, 10, '4', 100, ' ', 1 };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray7, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 10, 52, 100, 32, 1]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test10079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10079");
        int[] intArray6 = new int[] { (short) 1, (short) 10, (short) 0, (short) 100, 0, 0 };
        int[] intArray13 = new int[] { (short) 1, (short) 10, (short) 0, (short) 100, 0, 0 };
        int[] intArray20 = new int[] { (short) 1, (short) 10, (short) 0, (short) 100, 0, 0 };
        int[] intArray27 = new int[] { (short) 1, (short) 10, (short) 0, (short) 100, 0, 0 };
        int[] intArray34 = new int[] { (short) 1, (short) 10, (short) 0, (short) 100, 0, 0 };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray35, (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, 0, 100, 0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 10, 0, 100, 0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 10, 0, 100, 0, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 10, 0, 100, 0, 0]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 10, 0, 100, 0, 0]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test10080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10080");
        int[] intArray3 = new int[] { 10, (byte) 100, (short) -1 };
        int[] intArray7 = new int[] { 10, (byte) 100, (short) -1 };
        int[] intArray11 = new int[] { 10, (byte) 100, (short) -1 };
        int[] intArray15 = new int[] { 10, (byte) 100, (short) -1 };
        int[] intArray19 = new int[] { 10, (byte) 100, (short) -1 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 100, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 100, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 100, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 100, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 100, -1]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test10081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10081");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray3 = new int[] { (byte) 100 };
        int[] intArray5 = new int[] { (byte) 100 };
        int[] intArray7 = new int[] { (byte) 100 };
        int[] intArray9 = new int[] { (byte) 100 };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, (int) (short) 10, (int) (byte) 0);
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
    public void test10082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10082");
        int[] intArray3 = new int[] { '4', (byte) 10, '#' };
        int[] intArray7 = new int[] { '4', (byte) 10, '#' };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 10, 35]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[52, 10, 35]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test10083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10083");
        int[] intArray6 = new int[] { (byte) 100, (byte) 100, 10, (byte) 10, (byte) 10, ' ' };
        int[] intArray13 = new int[] { (byte) 100, (byte) 100, 10, (byte) 10, (byte) 10, ' ' };
        int[] intArray20 = new int[] { (byte) 100, (byte) 100, 10, (byte) 10, (byte) 10, ' ' };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray21, (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100, 10, 10, 10, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100, 10, 10, 10, 32]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100, 10, 10, 10, 32]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test10084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10084");
        int[] intArray2 = new int[] { (short) 1, (byte) 100 };
        int[] intArray5 = new int[] { (short) 1, (byte) 100 };
        int[] intArray8 = new int[] { (short) 1, (byte) 100 };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray9, (int) (short) 0, (int) (byte) 0);
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
    public void test10085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10085");
        int[] intArray3 = new int[] { (short) 1, (short) -1, (short) 100 };
        int[] intArray7 = new int[] { (short) 1, (short) -1, (short) 100 };
        int[] intArray11 = new int[] { (short) 1, (short) -1, (short) 100 };
        int[] intArray15 = new int[] { (short) 1, (short) -1, (short) 100 };
        int[] intArray19 = new int[] { (short) 1, (short) -1, (short) 100 };
        int[] intArray23 = new int[] { (short) 1, (short) -1, (short) 100 };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, (int) (short) 100, (int) (byte) 1);
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
    public void test10086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10086");
        int[] intArray4 = new int[] { '#', '#', (short) -1, 100 };
        int[] intArray9 = new int[] { '#', '#', (short) -1, 100 };
        int[] intArray14 = new int[] { '#', '#', (short) -1, 100 };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 35, -1, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[35, 35, -1, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35, 35, -1, 100]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test10087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10087");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (short) -1, (int) (byte) -1);
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
    public void test10088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10088");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = new int[] { 100 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
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
    public void test10089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10089");
        int[] intArray1 = new int[] { '#' };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[35]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test10090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10090");
        int[] intArray3 = new int[] { (byte) -1, (short) 10, (short) -1 };
        int[] intArray7 = new int[] { (byte) -1, (short) 10, (short) -1 };
        int[] intArray11 = new int[] { (byte) -1, (short) 10, (short) -1 };
        int[] intArray15 = new int[] { (byte) -1, (short) 10, (short) -1 };
        int[] intArray19 = new int[] { (byte) -1, (short) 10, (short) -1 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test10091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10091");
        int[] intArray4 = new int[] { (byte) 1, 'a', 1, (byte) 0 };
        int[] intArray9 = new int[] { (byte) 1, 'a', 1, (byte) 0 };
        int[] intArray14 = new int[] { (byte) 1, 'a', 1, (byte) 0 };
        int[] intArray19 = new int[] { (byte) 1, 'a', 1, (byte) 0 };
        int[] intArray24 = new int[] { (byte) 1, 'a', 1, (byte) 0 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray25, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 97, 1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 97, 1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 97, 1, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 97, 1, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 97, 1, 0]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test10092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10092");
        int[] intArray1 = new int[] { '4' };
        int[] intArray3 = new int[] { '4' };
        int[] intArray5 = new int[] { '4' };
        int[] intArray7 = new int[] { '4' };
        int[] intArray9 = new int[] { '4' };
        int[] intArray11 = new int[] { '4' };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (short) 1, 0);
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
    public void test10093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10093");
        int[] intArray2 = new int[] { 10, (byte) -1 };
        int[] intArray5 = new int[] { 10, (byte) -1 };
        int[] intArray8 = new int[] { 10, (byte) -1 };
        int[] intArray11 = new int[] { 10, (byte) -1 };
        int[] intArray14 = new int[] { 10, (byte) -1 };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test10094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10094");
        int[] intArray6 = new int[] { 'a', 10, ' ', (byte) 0, 0, (short) -1 };
        int[] intArray13 = new int[] { 'a', 10, ' ', (byte) 0, 0, (short) -1 };
        int[] intArray20 = new int[] { 'a', 10, ' ', (byte) 0, 0, (short) -1 };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray21, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 32, 0, 0, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 32, 0, 0, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 10, 32, 0, 0, -1]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test10095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10095");
        int[] intArray4 = new int[] { 1, (byte) 0, (short) 10, 0 };
        int[] intArray9 = new int[] { 1, (byte) 0, (short) 10, 0 };
        int[] intArray14 = new int[] { 1, (byte) 0, (short) 10, 0 };
        int[] intArray19 = new int[] { 1, (byte) 0, (short) 10, 0 };
        int[] intArray24 = new int[] { 1, (byte) 0, (short) 10, 0 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray25, (int) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 0, 10, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0, 10, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 0, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 0, 10, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 0, 10, 0]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test10096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10096");
        int[] intArray1 = new int[] { 0 };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test10097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10097");
        int[] intArray4 = new int[] { '4', (-1), 1, '#' };
        int[] intArray9 = new int[] { '4', (-1), 1, '#' };
        int[] intArray14 = new int[] { '4', (-1), 1, '#' };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, -1, 1, 35]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[52, -1, 1, 35]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[52, -1, 1, 35]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test10098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10098");
        int[] intArray5 = new int[] { 100, (short) 1, (short) 100, ' ', ' ' };
        int[] intArray11 = new int[] { 100, (short) 1, (short) 100, ' ', ' ' };
        int[] intArray17 = new int[] { 100, (short) 1, (short) 100, ' ', ' ' };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray18, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 100, 32, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 100, 32, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 1, 100, 32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test10099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10099");
        int[] intArray3 = new int[] { 10, (short) 1, (byte) 1 };
        int[] intArray7 = new int[] { 10, (short) 1, (byte) 1 };
        int[] intArray11 = new int[] { 10, (short) 1, (byte) 1 };
        int[] intArray15 = new int[] { 10, (short) 1, (byte) 1 };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray16, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test10100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10100");
        int[] intArray5 = new int[] { (byte) 1, (byte) -1, (-1), (byte) 100, ' ' };
        int[] intArray11 = new int[] { (byte) 1, (byte) -1, (-1), (byte) 100, ' ' };
        int[] intArray17 = new int[] { (byte) 1, (byte) -1, (-1), (byte) 100, ' ' };
        int[] intArray23 = new int[] { (byte) 1, (byte) -1, (-1), (byte) 100, ' ' };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, -1, -1, 100, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, -1, -1, 100, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, -1, -1, 100, 32]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, -1, -1, 100, 32]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test10101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10101");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[][] intArray5 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray5, (int) (short) 1, 1);
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
    public void test10102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10102");
        int[] intArray4 = new int[] { (short) 1, ' ', 'a', (byte) 10 };
        int[] intArray9 = new int[] { (short) 1, ' ', 'a', (byte) 10 };
        int[] intArray14 = new int[] { (short) 1, ' ', 'a', (byte) 10 };
        int[] intArray19 = new int[] { (short) 1, ' ', 'a', (byte) 10 };
        int[] intArray24 = new int[] { (short) 1, ' ', 'a', (byte) 10 };
        int[] intArray29 = new int[] { (short) 1, ' ', 'a', (byte) 10 };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray30, (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 32, 97, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 32, 97, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 32, 97, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 32, 97, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 32, 97, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 32, 97, 10]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test10103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10103");
        int[] intArray3 = new int[] { (byte) 10, (byte) 10, (-1) };
        int[] intArray7 = new int[] { (byte) 10, (byte) 10, (-1) };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, (int) '#', (-1));
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
    public void test10104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10104");
        int[] intArray5 = new int[] { ' ', 10, 100, (short) 0, 0 };
        int[] intArray11 = new int[] { ' ', 10, 100, (short) 0, 0 };
        int[] intArray17 = new int[] { ' ', 10, 100, (short) 0, 0 };
        int[] intArray23 = new int[] { ' ', 10, 100, (short) 0, 0 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 10, 100, 0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 10, 100, 0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 100, 0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 10, 100, 0, 0]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test10105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10105");
        int[] intArray2 = new int[] { 10, 0 };
        int[] intArray5 = new int[] { 10, 0 };
        int[] intArray8 = new int[] { 10, 0 };
        int[] intArray11 = new int[] { 10, 0 };
        int[] intArray14 = new int[] { 10, 0 };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test10106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10106");
        int[] intArray3 = new int[] { (short) 0, (byte) -1, '#' };
        int[] intArray7 = new int[] { (short) 0, (byte) -1, '#' };
        int[] intArray11 = new int[] { (short) 0, (byte) -1, '#' };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, -1, 35]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, -1, 35]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, -1, 35]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test10107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10107");
        int[] intArray4 = new int[] { '#', (short) 0, (short) 1, (short) 10 };
        int[] intArray9 = new int[] { '#', (short) 0, (short) 1, (short) 10 };
        int[] intArray14 = new int[] { '#', (short) 0, (short) 1, (short) 10 };
        int[] intArray19 = new int[] { '#', (short) 0, (short) 1, (short) 10 };
        int[] intArray24 = new int[] { '#', (short) 0, (short) 1, (short) 10 };
        int[] intArray29 = new int[] { '#', (short) 0, (short) 1, (short) 10 };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray30, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 0, 1, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[35, 0, 1, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35, 0, 1, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35, 0, 1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[35, 0, 1, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[35, 0, 1, 10]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test10108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10108");
        int[] intArray6 = new int[] { 100, (-1), (byte) 10, (byte) 0, (byte) 1, (short) -1 };
        int[] intArray13 = new int[] { 100, (-1), (byte) 10, (byte) 0, (byte) 1, (short) -1 };
        int[] intArray20 = new int[] { 100, (-1), (byte) 10, (byte) 0, (byte) 1, (short) -1 };
        int[] intArray27 = new int[] { 100, (-1), (byte) 10, (byte) 0, (byte) 1, (short) -1 };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray28, (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 0, 1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, -1, 10, 0, 1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, -1, 10, 0, 1, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, -1, 10, 0, 1, -1]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test10109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10109");
        int[] intArray6 = new int[] { (byte) -1, '4', (-1), (byte) 0, (short) 10, (byte) -1 };
        int[] intArray13 = new int[] { (byte) -1, '4', (-1), (byte) 0, (short) 10, (byte) -1 };
        int[] intArray20 = new int[] { (byte) -1, '4', (-1), (byte) 0, (short) 10, (byte) -1 };
        int[] intArray27 = new int[] { (byte) -1, '4', (-1), (byte) 0, (short) 10, (byte) -1 };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray28, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 52, -1, 0, 10, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 52, -1, 0, 10, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 52, -1, 0, 10, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, 52, -1, 0, 10, -1]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test10110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10110");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[][] intArray5 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, (int) (short) 10, (int) (byte) 0);
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
    public void test10111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10111");
        int[] intArray6 = new int[] { (short) -1, 0, (byte) 10, (short) 100, 1, (short) 0 };
        int[] intArray13 = new int[] { (short) -1, 0, (byte) 10, (short) 100, 1, (short) 0 };
        int[] intArray20 = new int[] { (short) -1, 0, (byte) 10, (short) 100, 1, (short) 0 };
        int[] intArray27 = new int[] { (short) -1, 0, (byte) 10, (short) 100, 1, (short) 0 };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray28, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0, 10, 100, 1, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 0, 10, 100, 1, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 0, 10, 100, 1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, 0, 10, 100, 1, 0]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test10112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10112");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[][] intArray5 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, (int) (short) 100, (int) (short) 10);
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
    public void test10113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10113");
        int[] intArray2 = new int[] { 100, (short) 10 };
        int[] intArray5 = new int[] { 100, (short) 10 };
        int[] intArray8 = new int[] { 100, (short) 10 };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray9, (-1), (int) (short) 10);
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
    public void test10114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10114");
        int[] intArray6 = new int[] { (-1), 10, (short) 0, (byte) 100, (byte) 0, (short) -1 };
        int[] intArray13 = new int[] { (-1), 10, (short) 0, (byte) 100, (byte) 0, (short) -1 };
        int[] intArray20 = new int[] { (-1), 10, (short) 0, (byte) 100, (byte) 0, (short) -1 };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray21, (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 0, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 0, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 10, 0, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test10115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10115");
        int[] intArray4 = new int[] { (short) 10, '#', (short) -1, 0 };
        int[] intArray9 = new int[] { (short) 10, '#', (short) -1, 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 35, -1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 35, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test10116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10116");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray3 = new int[] { (byte) 10 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test10117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10117");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, 0, (int) (byte) 0);
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
    public void test10118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10118");
        int[] intArray1 = new int[] { (byte) -1 };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test10119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10119");
        int[] intArray3 = new int[] { 100, '#', (short) -1 };
        int[] intArray7 = new int[] { 100, '#', (short) -1 };
        int[] intArray11 = new int[] { 100, '#', (short) -1 };
        int[] intArray15 = new int[] { 100, '#', (short) -1 };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray16, 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 35, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 35, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 35, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 35, -1]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test10120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10120");
        int[] intArray4 = new int[] { 'a', (short) 100, '#', '4' };
        int[] intArray9 = new int[] { 'a', (short) 100, '#', '4' };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, 100, 35, 52]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 100, 35, 52]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test10121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10121");
        int[] intArray4 = new int[] { (byte) 0, (short) 1, (-1), (short) 100 };
        int[] intArray9 = new int[] { (byte) 0, (short) 1, (-1), (short) 100 };
        int[] intArray14 = new int[] { (byte) 0, (short) 1, (-1), (short) 100 };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 1, -1, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 1, -1, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, -1, 100]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test10122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10122");
        int[] intArray1 = new int[] { 0 };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, (int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test10123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10123");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray1, (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test10124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10124");
        int[] intArray5 = new int[] { '#', 10, (byte) 0, (byte) 10, (byte) 10 };
        int[] intArray11 = new int[] { '#', 10, (byte) 0, (byte) 10, (byte) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 10, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, 10, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test10125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10125");
        int[] intArray4 = new int[] { 'a', 'a', (byte) 1, (byte) 100 };
        int[] intArray9 = new int[] { 'a', 'a', (byte) 1, (byte) 100 };
        int[] intArray14 = new int[] { 'a', 'a', (byte) 1, (byte) 100 };
        int[] intArray19 = new int[] { 'a', 'a', (byte) 1, (byte) 100 };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, 97, 1, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, 97, 1, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 97, 1, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 97, 1, 100]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test10126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10126");
        int[] intArray4 = new int[] { (byte) 10, (short) -1, (short) 0, 1 };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, -1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test10127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10127");
        int[] intArray2 = new int[] { (byte) 10, 'a' };
        int[] intArray5 = new int[] { (byte) 10, 'a' };
        int[] intArray8 = new int[] { (byte) 10, 'a' };
        int[] intArray11 = new int[] { (byte) 10, 'a' };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) '#', 0);
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
    public void test10128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10128");
        int[] intArray2 = new int[] { 10, 100 };
        int[] intArray5 = new int[] { 10, 100 };
        int[] intArray8 = new int[] { 10, 100 };
        int[] intArray11 = new int[] { 10, 100 };
        int[] intArray14 = new int[] { 10, 100 };
        int[] intArray17 = new int[] { 10, 100 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
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
    public void test10129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10129");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, 10, (int) 'a');
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
    public void test10130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10130");
        int[] intArray1 = new int[] { '4' };
        int[] intArray3 = new int[] { '4' };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
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
    public void test10131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10131");
        int[] intArray5 = new int[] { 100, (short) 100, (short) 10, (-1), (short) 10 };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100, 10, -1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test10132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10132");
        int[] intArray5 = new int[] { (short) -1, (-1), (byte) 1, ' ', 10 };
        int[] intArray11 = new int[] { (short) -1, (-1), (byte) 1, ' ', 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 1, 32, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1, 1, 32, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test10133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10133");
        int[] intArray5 = new int[] { (-1), 10, (short) -1, (short) 0, (short) 1 };
        int[] intArray11 = new int[] { (-1), 10, (short) -1, (short) 0, (short) 1 };
        int[] intArray17 = new int[] { (-1), 10, (short) -1, (short) 0, (short) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 10, -1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, -1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, -1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test10134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10134");
        int[] intArray2 = new int[] { (byte) -1, (short) 10 };
        int[] intArray5 = new int[] { (byte) -1, (short) 10 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test10135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10135");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray3 = new int[] { (byte) 10 };
        int[] intArray5 = new int[] { (byte) 10 };
        int[] intArray7 = new int[] { (byte) 10 };
        int[] intArray9 = new int[] { (byte) 10 };
        int[] intArray11 = new int[] { (byte) 10 };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (byte) 1, 10);
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
    public void test10136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10136");
        int[] intArray6 = new int[] { (short) 1, (byte) 1, (-1), 100, 10, (byte) 10 };
        int[] intArray13 = new int[] { (short) 1, (byte) 1, (-1), 100, 10, (byte) 10 };
        int[] intArray20 = new int[] { (short) 1, (byte) 1, (-1), 100, 10, (byte) 10 };
        int[] intArray27 = new int[] { (short) 1, (byte) 1, (-1), 100, 10, (byte) 10 };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray28, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1, -1, 100, 10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1, -1, 100, 10, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 1, -1, 100, 10, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1, -1, 100, 10, 10]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test10137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10137");
        int[] intArray3 = new int[] { (short) 1, (byte) -1, '4' };
        int[] intArray7 = new int[] { (short) 1, (byte) -1, '4' };
        int[] intArray11 = new int[] { (short) 1, (byte) -1, '4' };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, -1, 52]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, -1, 52]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, -1, 52]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test10138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10138");
        int[] intArray4 = new int[] { 0, 10, 10, 10 };
        int[] intArray9 = new int[] { 0, 10, 10, 10 };
        int[] intArray14 = new int[] { 0, 10, 10, 10 };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 10, 10, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 10, 10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test10139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10139");
        int[] intArray6 = new int[] { '#', 10, ' ', (short) -1, '4', (short) -1 };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray7, (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 10, 32, -1, 52, -1]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test10140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10140");
        int[] intArray6 = new int[] { (short) 1, (short) -1, (short) 1, 10, (byte) -1, 0 };
        int[] intArray13 = new int[] { (short) 1, (short) -1, (short) 1, 10, (byte) -1, 0 };
        int[] intArray20 = new int[] { (short) 1, (short) -1, (short) 1, 10, (byte) -1, 0 };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray21, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, -1, 1, 10, -1, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, -1, 1, 10, -1, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, -1, 1, 10, -1, 0]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test10141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10141");
        int[] intArray4 = new int[] { (byte) -1, '4', '#', (byte) -1 };
        int[] intArray9 = new int[] { (byte) -1, '4', '#', (byte) -1 };
        int[] intArray14 = new int[] { (byte) -1, '4', '#', (byte) -1 };
        int[] intArray19 = new int[] { (byte) -1, '4', '#', (byte) -1 };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 52, 35, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 52, 35, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 52, 35, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 52, 35, -1]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test10142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10142");
        int[] intArray2 = new int[] { 10, 1 };
        int[] intArray5 = new int[] { 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
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
    public void test10143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10143");
        int[] intArray3 = new int[] { (short) 100, (short) 100, (short) 0 };
        int[] intArray7 = new int[] { (short) 100, (short) 100, (short) 0 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100, 0]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test10144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10144");
        int[] intArray6 = new int[] { ' ', (byte) 0, 'a', 10, '4', 'a' };
        int[] intArray13 = new int[] { ' ', (byte) 0, 'a', 10, '4', 'a' };
        int[] intArray20 = new int[] { ' ', (byte) 0, 'a', 10, '4', 'a' };
        int[] intArray27 = new int[] { ' ', (byte) 0, 'a', 10, '4', 'a' };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray28, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 0, 97, 10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 0, 97, 10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 0, 97, 10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 0, 97, 10, 52, 97]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test10145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10145");
        int[] intArray3 = new int[] { (byte) 0, '4', (-1) };
        int[] intArray7 = new int[] { (byte) 0, '4', (-1) };
        int[] intArray11 = new int[] { (byte) 0, '4', (-1) };
        int[] intArray15 = new int[] { (byte) 0, '4', (-1) };
        int[] intArray19 = new int[] { (byte) 0, '4', (-1) };
        int[] intArray23 = new int[] { (byte) 0, '4', (-1) };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, (int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
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
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 52, -1]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test10146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10146");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray1, (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test10147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10147");
        int[] intArray5 = new int[] { (byte) 0, ' ', 10, 10, (short) 10 };
        int[] intArray11 = new int[] { (byte) 0, ' ', 10, 10, (short) 10 };
        int[] intArray17 = new int[] { (byte) 0, ' ', 10, 10, (short) 10 };
        int[] intArray23 = new int[] { (byte) 0, ' ', 10, 10, (short) 10 };
        int[] intArray29 = new int[] { (byte) 0, ' ', 10, 10, (short) 10 };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray30, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 32, 10, 10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 32, 10, 10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 32, 10, 10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 32, 10, 10, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 32, 10, 10, 10]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test10148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10148");
        int[] intArray6 = new int[] { 100, (short) 0, (short) 0, (byte) 0, (-1), (byte) 100 };
        int[] intArray13 = new int[] { 100, (short) 0, (short) 0, (byte) 0, (-1), (byte) 100 };
        int[] intArray20 = new int[] { 100, (short) 0, (short) 0, (byte) 0, (-1), (byte) 100 };
        int[] intArray27 = new int[] { 100, (short) 0, (short) 0, (byte) 0, (-1), (byte) 100 };
        int[] intArray34 = new int[] { 100, (short) 0, (short) 0, (byte) 0, (-1), (byte) 100 };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray35, 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 0, 0, 0, -1, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 0, 0, 0, -1, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0, 0, 0, -1, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 0, 0, -1, 100]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 0, 0, 0, -1, 100]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test10149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10149");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray3 = new int[] { (short) 1 };
        int[] intArray5 = new int[] { (short) 1 };
        int[] intArray7 = new int[] { (short) 1 };
        int[][] intArray8 = new int[][] { intArray1, intArray3, intArray5, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, 0, 100);
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
    public void test10150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10150");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray3 = new int[] { 'a' };
        int[] intArray5 = new int[] { 'a' };
        int[][] intArray6 = new int[][] { intArray1, intArray3, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[97]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test10151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10151");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray3 = new int[] { ' ' };
        int[] intArray5 = new int[] { ' ' };
        int[] intArray7 = new int[] { ' ' };
        int[] intArray9 = new int[] { ' ' };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, 1, (int) (short) 100);
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
    public void test10152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10152");
        int[] intArray3 = new int[] { '4', ' ', ' ' };
        int[] intArray7 = new int[] { '4', ' ', ' ' };
        int[] intArray11 = new int[] { '4', ' ', ' ' };
        int[] intArray15 = new int[] { '4', ' ', ' ' };
        int[] intArray19 = new int[] { '4', ' ', ' ' };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 32, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[52, 32, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[52, 32, 32]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[52, 32, 32]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test10153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10153");
        int[] intArray4 = new int[] { (-1), (short) 1, (short) 10, 1 };
        int[] intArray9 = new int[] { (-1), (short) 1, (short) 10, 1 };
        int[] intArray14 = new int[] { (-1), (short) 1, (short) 10, 1 };
        int[] intArray19 = new int[] { (-1), (short) 1, (short) 10, 1 };
        int[] intArray24 = new int[] { (-1), (short) 1, (short) 10, 1 };
        int[] intArray29 = new int[] { (-1), (short) 1, (short) 10, 1 };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray30, (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, 1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test10154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10154");
        int[] intArray5 = new int[] { (short) -1, (short) 0, 100, 0, (short) 10 };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0, 100, 0, 10]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test10155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10155");
        int[] intArray1 = new int[] { (short) -1 };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test10156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10156");
        int[] intArray6 = new int[] { (byte) 0, (short) 10, ' ', '4', (byte) 1, '#' };
        int[] intArray13 = new int[] { (byte) 0, (short) 10, ' ', '4', (byte) 1, '#' };
        int[] intArray20 = new int[] { (byte) 0, (short) 10, ' ', '4', (byte) 1, '#' };
        int[] intArray27 = new int[] { (byte) 0, (short) 10, ' ', '4', (byte) 1, '#' };
        int[] intArray34 = new int[] { (byte) 0, (short) 10, ' ', '4', (byte) 1, '#' };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray35, (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 10, 32, 52, 1, 35]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 10, 32, 52, 1, 35]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 10, 32, 52, 1, 35]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 10, 32, 52, 1, 35]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[0, 10, 32, 52, 1, 35]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test10157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10157");
        int[] intArray6 = new int[] { 1, '4', (byte) 10, (byte) 0, (short) 100, (short) 10 };
        int[] intArray13 = new int[] { 1, '4', (byte) 10, (byte) 0, (short) 100, (short) 10 };
        int[] intArray20 = new int[] { 1, '4', (byte) 10, (byte) 0, (short) 100, (short) 10 };
        int[] intArray27 = new int[] { 1, '4', (byte) 10, (byte) 0, (short) 100, (short) 10 };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray28, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 52, 10, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 52, 10, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 52, 10, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 52, 10, 0, 100, 10]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test10158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10158");
        int[] intArray5 = new int[] { 'a', 100, (byte) -1, '#', (byte) 10 };
        int[] intArray11 = new int[] { 'a', 100, (byte) -1, '#', (byte) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 100, -1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 100, -1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test10159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10159");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray1, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test10160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10160");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[][] intArray5 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, (-1), (int) (byte) 0);
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
    public void test10161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10161");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray0, intArray1, intArray2, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (int) (byte) 100, (int) (short) 0);
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
    public void test10162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10162");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray3 = new int[] { (byte) 1 };
        int[] intArray5 = new int[] { (byte) 1 };
        int[] intArray7 = new int[] { (byte) 1 };
        int[] intArray9 = new int[] { (byte) 1 };
        int[] intArray11 = new int[] { (byte) 1 };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (byte) 10, (int) (byte) 1);
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
    public void test10163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10163");
        int[] intArray4 = new int[] { 0, 10, 10, 1 };
        int[] intArray9 = new int[] { 0, 10, 10, 1 };
        int[] intArray14 = new int[] { 0, 10, 10, 1 };
        int[] intArray19 = new int[] { 0, 10, 10, 1 };
        int[] intArray24 = new int[] { 0, 10, 10, 1 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray25, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 10, 10, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 10, 10, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 10, 10, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 10, 10, 1]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test10164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10164");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray3 = new int[] { (byte) 100 };
        int[] intArray5 = new int[] { (byte) 100 };
        int[] intArray7 = new int[] { (byte) 100 };
        int[] intArray9 = new int[] { (byte) 100 };
        int[] intArray11 = new int[] { (byte) 100 };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (byte) 10, 0);
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
    public void test10165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10165");
        int[] intArray1 = new int[] { 0 };
        int[] intArray3 = new int[] { 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (int) (short) 10, (int) '4');
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
    public void test10166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10166");
        int[] intArray5 = new int[] { (short) -1, (byte) -1, (short) -1, (byte) 10, (short) 0 };
        int[] intArray11 = new int[] { (short) -1, (byte) -1, (short) -1, (byte) 10, (short) 0 };
        int[] intArray17 = new int[] { (short) -1, (byte) -1, (short) -1, (byte) 10, (short) 0 };
        int[] intArray23 = new int[] { (short) -1, (byte) -1, (short) -1, (byte) 10, (short) 0 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, -1, 10, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1, -1, 10, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1, -1, 10, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, -1, -1, 10, 0]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test10167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10167");
        int[] intArray6 = new int[] { (byte) 10, (short) 100, (byte) 1, (short) 1, (byte) 100, (byte) 1 };
        int[] intArray13 = new int[] { (byte) 10, (short) 100, (byte) 1, (short) 1, (byte) 100, (byte) 1 };
        int[] intArray20 = new int[] { (byte) 10, (short) 100, (byte) 1, (short) 1, (byte) 100, (byte) 1 };
        int[] intArray27 = new int[] { (byte) 10, (short) 100, (byte) 1, (short) 1, (byte) 100, (byte) 1 };
        int[] intArray34 = new int[] { (byte) 10, (short) 100, (byte) 1, (short) 1, (byte) 100, (byte) 1 };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray35, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 100, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 100, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10, 100, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 100, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[10, 100, 1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test10168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10168");
        int[] intArray3 = new int[] { ' ', (short) -1, (byte) 100 };
        int[] intArray7 = new int[] { ' ', (short) -1, (byte) 100 };
        int[] intArray11 = new int[] { ' ', (short) -1, (byte) 100 };
        int[] intArray15 = new int[] { ' ', (short) -1, (byte) 100 };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray16, (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, -1, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, -1, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, -1, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, -1, 100]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test10169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10169");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[] intArray5 = new int[] { (short) 0 };
        int[][] intArray6 = new int[][] { intArray1, intArray3, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (byte) 100, (int) (short) -1);
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
    public void test10170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10170");
        int[] intArray4 = new int[] { (byte) -1, 'a', (byte) 100, 0 };
        int[] intArray9 = new int[] { (byte) -1, 'a', (byte) 100, 0 };
        int[] intArray14 = new int[] { (byte) -1, 'a', (byte) 100, 0 };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 97, 100, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 97, 100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 97, 100, 0]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test10171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10171");
        int[] intArray3 = new int[] { '4', 100, '4' };
        int[][] intArray4 = new int[][] { intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 100, 52]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test10172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10172");
        int[] intArray4 = new int[] { 1, (short) 1, (byte) 10, (byte) 10 };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1, 10, 10]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test10173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10173");
        int[] intArray5 = new int[] { 10, (byte) -1, (byte) 100, ' ', 'a' };
        int[] intArray11 = new int[] { 10, (byte) -1, (byte) 100, ' ', 'a' };
        int[] intArray17 = new int[] { 10, (byte) -1, (byte) 100, ' ', 'a' };
        int[] intArray23 = new int[] { 10, (byte) -1, (byte) 100, ' ', 'a' };
        int[] intArray29 = new int[] { 10, (byte) -1, (byte) 100, ' ', 'a' };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray30, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 32, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, -1, 100, 32, 97]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, -1, 100, 32, 97]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, -1, 100, 32, 97]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, -1, 100, 32, 97]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test10174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10174");
        int[] intArray6 = new int[] { 100, (byte) 0, '#', 'a', (short) 0, 0 };
        int[] intArray13 = new int[] { 100, (byte) 0, '#', 'a', (short) 0, 0 };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray14, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 0, 35, 97, 0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 0, 35, 97, 0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test10175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10175");
        int[] intArray3 = new int[] { (short) 1, (byte) 1, 1 };
        int[] intArray7 = new int[] { (short) 1, (byte) 1, 1 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test10176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10176");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray3 = new int[] { (short) -1 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (int) (byte) 1, 0);
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
    public void test10177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10177");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray3 = new int[] { (short) 10 };
        int[] intArray5 = new int[] { (short) 10 };
        int[] intArray7 = new int[] { (short) 10 };
        int[] intArray9 = new int[] { (short) 10 };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, (int) (byte) -1, (int) (byte) 1);
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
    public void test10178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10178");
        int[] intArray3 = new int[] { (-1), '4', 0 };
        int[] intArray7 = new int[] { (-1), '4', 0 };
        int[] intArray11 = new int[] { (-1), '4', 0 };
        int[] intArray15 = new int[] { (-1), '4', 0 };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray16, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 52, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 52, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 52, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 52, 0]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test10179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10179");
        int[] intArray5 = new int[] { ' ', (byte) 0, (byte) -1, 'a', 1 };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 0, -1, 97, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test10180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10180");
        int[] intArray6 = new int[] { (-1), (short) 1, 100, 0, 'a', (short) 1 };
        int[] intArray13 = new int[] { (-1), (short) 1, 100, 0, 'a', (short) 1 };
        int[] intArray20 = new int[] { (-1), (short) 1, 100, 0, 'a', (short) 1 };
        int[] intArray27 = new int[] { (-1), (short) 1, 100, 0, 'a', (short) 1 };
        int[] intArray34 = new int[] { (-1), (short) 1, 100, 0, 'a', (short) 1 };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray35, 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 100, 0, 97, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 1, 100, 0, 97, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 1, 100, 0, 97, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, 1, 100, 0, 97, 1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-1, 1, 100, 0, 97, 1]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test10181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10181");
        int[] intArray3 = new int[] { '#', (byte) -1, '4' };
        int[] intArray7 = new int[] { '#', (byte) -1, '4' };
        int[] intArray11 = new int[] { '#', (byte) -1, '4' };
        int[] intArray15 = new int[] { '#', (byte) -1, '4' };
        int[] intArray19 = new int[] { '#', (byte) -1, '4' };
        int[] intArray23 = new int[] { '#', (byte) -1, '4' };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35, -1, 52]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[35, -1, 52]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, -1, 52]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[35, -1, 52]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35, -1, 52]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[35, -1, 52]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test10182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10182");
        int[] intArray4 = new int[] { (byte) 10, (byte) 0, 1, (short) 1 };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 0, 1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test10183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10183");
        int[] intArray2 = new int[] { (short) 1, (byte) -1 };
        int[] intArray5 = new int[] { (short) 1, (byte) -1 };
        int[] intArray8 = new int[] { (short) 1, (byte) -1 };
        int[] intArray11 = new int[] { (short) 1, (byte) -1 };
        int[] intArray14 = new int[] { (short) 1, (byte) -1 };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test10184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10184");
        int[] intArray2 = new int[] { 1, (byte) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray3, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test10185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10185");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10186");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10187");
        int[] intArray2 = new int[] { (-1), ' ' };
        int[] intArray5 = new int[] { (-1), ' ' };
        int[] intArray8 = new int[] { (-1), ' ' };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray9, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 32]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 32]");
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test10188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10188");
        int[] intArray4 = new int[] { '4', 'a', 0, '4' };
        int[] intArray9 = new int[] { '4', 'a', 0, '4' };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 97, 0, 52]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[52, 97, 0, 52]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test10189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10189");
        int[] intArray4 = new int[] { (short) 0, (short) -1, ' ', (byte) 10 };
        int[] intArray9 = new int[] { (short) 0, (short) -1, ' ', (byte) 10 };
        int[] intArray14 = new int[] { (short) 0, (short) -1, ' ', (byte) 10 };
        int[] intArray19 = new int[] { (short) 0, (short) -1, ' ', (byte) 10 };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 32, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, -1, 32, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, -1, 32, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, -1, 32, 10]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test10190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10190");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) ' ', (int) (byte) 1);
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
    public void test10191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10191");
        int[] intArray1 = new int[] { (short) -1 };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test10192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10192");
        int[] intArray6 = new int[] { '4', '#', (short) 0, (short) 10, (short) 1, (byte) 0 };
        int[] intArray13 = new int[] { '4', '#', (short) 0, (short) 10, (short) 1, (byte) 0 };
        int[] intArray20 = new int[] { '4', '#', (short) 0, (short) 10, (short) 1, (byte) 0 };
        int[] intArray27 = new int[] { '4', '#', (short) 0, (short) 10, (short) 1, (byte) 0 };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray28, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 35, 0, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[52, 35, 0, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[52, 35, 0, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[52, 35, 0, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test10193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10193");
        int[] intArray6 = new int[] { (byte) 0, (byte) 0, 'a', 10, 0, '4' };
        int[] intArray13 = new int[] { (byte) 0, (byte) 0, 'a', 10, 0, '4' };
        int[] intArray20 = new int[] { (byte) 0, (byte) 0, 'a', 10, 0, '4' };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray21, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 97, 10, 0, 52]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, 97, 10, 0, 52]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0, 97, 10, 0, 52]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test10194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10194");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test10195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10195");
        int[] intArray2 = new int[] { (short) 1, (byte) 1 };
        int[] intArray5 = new int[] { (short) 1, (byte) 1 };
        int[] intArray8 = new int[] { (short) 1, (byte) 1 };
        int[] intArray11 = new int[] { (short) 1, (byte) 1 };
        int[] intArray14 = new int[] { (short) 1, (byte) 1 };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test10196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10196");
        int[] intArray2 = new int[] { (byte) 0, (short) 1 };
        int[] intArray5 = new int[] { (byte) 0, (short) 1 };
        int[] intArray8 = new int[] { (byte) 0, (short) 1 };
        int[] intArray11 = new int[] { (byte) 0, (short) 1 };
        int[] intArray14 = new int[] { (byte) 0, (short) 1 };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, 10, (-1));
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
    public void test10197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10197");
        int[] intArray3 = new int[] { (short) -1, (short) 100, (byte) -1 };
        int[] intArray7 = new int[] { (short) -1, (short) 100, (byte) -1 };
        int[] intArray11 = new int[] { (short) -1, (short) 100, (byte) -1 };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (-1), (int) '4');
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
    public void test10198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10198");
        int[] intArray3 = new int[] { 1, (-1), 0 };
        int[] intArray7 = new int[] { 1, (-1), 0 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test10199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10199");
        int[] intArray3 = new int[] { (byte) 10, ' ', 100 };
        int[] intArray7 = new int[] { (byte) 10, ' ', 100 };
        int[] intArray11 = new int[] { (byte) 10, ' ', 100 };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 32, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 32, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 32, 100]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test10200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10200");
        int[] intArray2 = new int[] { (byte) 0, (byte) 100 };
        int[] intArray5 = new int[] { (byte) 0, (byte) 100 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test10201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10201");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray3 = new int[] { ' ' };
        int[] intArray5 = new int[] { ' ' };
        int[] intArray7 = new int[] { ' ' };
        int[] intArray9 = new int[] { ' ' };
        int[] intArray11 = new int[] { ' ' };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (byte) -1, (int) (byte) 0);
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
    public void test10202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10202");
        int[] intArray3 = new int[] { (short) 1, ' ', (short) -1 };
        int[] intArray7 = new int[] { (short) 1, ' ', (short) -1 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, (int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 32, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 32, -1]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test10203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10203");
        int[] intArray5 = new int[] { (short) 0, (short) 10, '#', (-1), '#' };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10, 35, -1, 35]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test10204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10204");
        int[] intArray2 = new int[] { 10, '#' };
        int[] intArray5 = new int[] { 10, '#' };
        int[] intArray8 = new int[] { 10, '#' };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray9, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 35]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 35]");
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test10205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10205");
        int[] intArray5 = new int[] { 'a', (short) 100, (byte) 10, (byte) -1, (byte) 1 };
        int[] intArray11 = new int[] { 'a', (short) 100, (byte) 10, (byte) -1, (byte) 1 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 100, 10, -1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 100, 10, -1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test10206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10206");
        int[] intArray6 = new int[] { (short) 10, (byte) 10, (short) 0, (byte) 1, (byte) 10, (byte) 10 };
        int[] intArray13 = new int[] { (short) 10, (byte) 10, (short) 0, (byte) 1, (byte) 10, (byte) 10 };
        int[] intArray20 = new int[] { (short) 10, (byte) 10, (short) 0, (byte) 1, (byte) 10, (byte) 10 };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray21, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10, 0, 1, 10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10, 0, 1, 10, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10, 10, 0, 1, 10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test10207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10207");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test10208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10208");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) (short) 100, (int) (short) 10);
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
    public void test10209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10209");
        int[] intArray3 = new int[] { (byte) 1, ' ', ' ' };
        int[] intArray7 = new int[] { (byte) 1, ' ', ' ' };
        int[] intArray11 = new int[] { (byte) 1, ' ', ' ' };
        int[] intArray15 = new int[] { (byte) 1, ' ', ' ' };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray16, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 32, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 32, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 32, 32]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test10210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10210");
        int[] intArray5 = new int[] { (short) 0, (short) 10, 'a', (short) 1, (byte) 0 };
        int[] intArray11 = new int[] { (short) 0, (short) 10, 'a', (short) 1, (byte) 0 };
        int[] intArray17 = new int[] { (short) 0, (short) 10, 'a', (short) 1, (byte) 0 };
        int[] intArray23 = new int[] { (short) 0, (short) 10, 'a', (short) 1, (byte) 0 };
        int[] intArray29 = new int[] { (short) 0, (short) 10, 'a', (short) 1, (byte) 0 };
        int[] intArray35 = new int[] { (short) 0, (short) 10, 'a', (short) 1, (byte) 0 };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray36, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10, 97, 1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 10, 97, 1, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 10, 97, 1, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 10, 97, 1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 10, 97, 1, 0]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0, 10, 97, 1, 0]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test10211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10211");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test10212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10212");
        int[] intArray4 = new int[] { ' ', (-1), (byte) 100, (byte) 100 };
        int[] intArray9 = new int[] { ' ', (-1), (byte) 100, (byte) 100 };
        int[] intArray14 = new int[] { ' ', (-1), (byte) 100, (byte) 100 };
        int[] intArray19 = new int[] { ' ', (-1), (byte) 100, (byte) 100 };
        int[] intArray24 = new int[] { ' ', (-1), (byte) 100, (byte) 100 };
        int[] intArray29 = new int[] { ' ', (-1), (byte) 100, (byte) 100 };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray30, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, -1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, -1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, -1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[32, -1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, -1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[32, -1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test10213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10213");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = new int[] { (byte) -1 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (int) (byte) 0, (int) '#');
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
    public void test10214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10214");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray3 = new int[] { 'a' };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
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
    public void test10215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10215");
        int[] intArray3 = new int[] { 'a', 'a', '#' };
        int[] intArray7 = new int[] { 'a', 'a', '#' };
        int[] intArray11 = new int[] { 'a', 'a', '#' };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 97, 35]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 97, 35]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 97, 35]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test10216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10216");
        int[] intArray6 = new int[] { (short) 0, (short) 10, 'a', 0, (byte) 100, (byte) -1 };
        int[] intArray13 = new int[] { (short) 0, (short) 10, 'a', 0, (byte) 100, (byte) -1 };
        int[] intArray20 = new int[] { (short) 0, (short) 10, 'a', 0, (byte) 100, (byte) -1 };
        int[] intArray27 = new int[] { (short) 0, (short) 10, 'a', 0, (byte) 100, (byte) -1 };
        int[] intArray34 = new int[] { (short) 0, (short) 10, 'a', 0, (byte) 100, (byte) -1 };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray35, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 10, 97, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 10, 97, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 10, 97, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 10, 97, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[0, 10, 97, 0, 100, -1]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test10217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10217");
        int[] intArray5 = new int[] { (short) -1, ' ', 'a', 10, (short) 1 };
        int[] intArray11 = new int[] { (short) -1, ' ', 'a', 10, (short) 1 };
        int[] intArray17 = new int[] { (short) -1, ' ', 'a', 10, (short) 1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 32, 97, 10, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 32, 97, 10, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 32, 97, 10, 1]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test10218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10218");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[][] intArray3 = new int[][] { intArray0, intArray1, intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray3, (int) (byte) 10, (int) (short) 0);
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
    public void test10219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10219");
        int[] intArray4 = new int[] { (short) 1, (byte) 10, 10, (short) -1 };
        int[] intArray9 = new int[] { (short) 1, (byte) 10, 10, (short) -1 };
        int[] intArray14 = new int[] { (short) 1, (byte) 10, 10, (short) -1 };
        int[] intArray19 = new int[] { (short) 1, (byte) 10, 10, (short) -1 };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, 10, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 10, 10, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 10, 10, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 10, 10, -1]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test10220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10220");
        int[] intArray4 = new int[] { '#', 'a', (short) 10, (byte) 10 };
        int[] intArray9 = new int[] { '#', 'a', (short) 10, (byte) 10 };
        int[] intArray14 = new int[] { '#', 'a', (short) 10, (byte) 10 };
        int[] intArray19 = new int[] { '#', 'a', (short) 10, (byte) 10 };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 97, 10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[35, 97, 10, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35, 97, 10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35, 97, 10, 10]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test10221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10221");
        int[] intArray4 = new int[] { (byte) 10, (short) 100, 10, 1 };
        int[] intArray9 = new int[] { (byte) 10, (short) 100, 10, 1 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 100, 10, 1]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test10222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10222");
        int[] intArray4 = new int[] { (byte) 10, ' ', (short) 1, (short) 10 };
        int[] intArray9 = new int[] { (byte) 10, ' ', (short) 1, (short) 10 };
        int[] intArray14 = new int[] { (byte) 10, ' ', (short) 1, (short) 10 };
        int[] intArray19 = new int[] { (byte) 10, ' ', (short) 1, (short) 10 };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 32, 1, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 32, 1, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 32, 1, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 32, 1, 10]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test10223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10223");
        int[] intArray4 = new int[] { (byte) 1, ' ', 1, (short) -1 };
        int[] intArray9 = new int[] { (byte) 1, ' ', 1, (short) -1 };
        int[] intArray14 = new int[] { (byte) 1, ' ', 1, (short) -1 };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 32, 1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 32, 1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 32, 1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test10224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10224");
        int[] intArray3 = new int[] { (short) 10, (-1), ' ' };
        int[] intArray7 = new int[] { (short) 10, (-1), ' ' };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, -1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, -1, 32]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test10225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10225");
        int[] intArray6 = new int[] { '#', (byte) 1, '4', '#', (byte) 1, (byte) 0 };
        int[] intArray13 = new int[] { '#', (byte) 1, '4', '#', (byte) 1, (byte) 0 };
        int[] intArray20 = new int[] { '#', (byte) 1, '4', '#', (byte) 1, (byte) 0 };
        int[] intArray27 = new int[] { '#', (byte) 1, '4', '#', (byte) 1, (byte) 0 };
        int[] intArray34 = new int[] { '#', (byte) 1, '4', '#', (byte) 1, (byte) 0 };
        int[] intArray41 = new int[] { '#', (byte) 1, '4', '#', (byte) 1, (byte) 0 };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray42, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 1, 52, 35, 1, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[35, 1, 52, 35, 1, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[35, 1, 52, 35, 1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[35, 1, 52, 35, 1, 0]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[35, 1, 52, 35, 1, 0]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[35, 1, 52, 35, 1, 0]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test10226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10226");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray3 = new int[] { 'a' };
        int[] intArray5 = new int[] { 'a' };
        int[] intArray7 = new int[] { 'a' };
        int[] intArray9 = new int[] { 'a' };
        int[] intArray11 = new int[] { 'a' };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (byte) 1, (int) '4');
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
    public void test10227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10227");
        int[] intArray3 = new int[] { 1, (short) 10, (byte) -1 };
        int[] intArray7 = new int[] { 1, (short) 10, (byte) -1 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test10228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10228");
        int[] intArray6 = new int[] { 1, '4', (byte) 0, ' ', (short) 0, ' ' };
        int[] intArray13 = new int[] { 1, '4', (byte) 0, ' ', (short) 0, ' ' };
        int[] intArray20 = new int[] { 1, '4', (byte) 0, ' ', (short) 0, ' ' };
        int[] intArray27 = new int[] { 1, '4', (byte) 0, ' ', (short) 0, ' ' };
        int[] intArray34 = new int[] { 1, '4', (byte) 0, ' ', (short) 0, ' ' };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray35, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 52, 0, 32, 0, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 52, 0, 32, 0, 32]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 52, 0, 32, 0, 32]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 52, 0, 32, 0, 32]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 52, 0, 32, 0, 32]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test10229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10229");
        int[] intArray3 = new int[] { (short) -1, (byte) 10, (short) 1 };
        int[] intArray7 = new int[] { (short) -1, (byte) 10, (short) 1 };
        int[] intArray11 = new int[] { (short) -1, (byte) 10, (short) 1 };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test10230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10230");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray1, 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test10231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10231");
        int[] intArray4 = new int[] { (short) -1, (short) 1, (byte) -1, (byte) 10 };
        int[] intArray9 = new int[] { (short) -1, (short) 1, (byte) -1, (byte) 10 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 1, -1, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 1, -1, 10]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test10232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10232");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray3 = new int[] { (byte) 10 };
        int[] intArray5 = new int[] { (byte) 10 };
        int[] intArray7 = new int[] { (byte) 10 };
        int[] intArray9 = new int[] { (byte) 10 };
        int[] intArray11 = new int[] { (byte) 10 };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (short) -1, (int) (byte) -1);
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
    public void test10233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10233");
        int[] intArray2 = new int[] { (byte) 0, (byte) 1 };
        int[] intArray5 = new int[] { (byte) 0, (byte) 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (byte) 10, (int) (short) 0);
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
    public void test10234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10234");
        int[] intArray2 = new int[] { ' ', '4' };
        int[] intArray5 = new int[] { ' ', '4' };
        int[] intArray8 = new int[] { ' ', '4' };
        int[] intArray11 = new int[] { ' ', '4' };
        int[] intArray14 = new int[] { ' ', '4' };
        int[] intArray17 = new int[] { ' ', '4' };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 52]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 52]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 52]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 52]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 52]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test10235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10235");
        int[] intArray5 = new int[] { '4', (short) 100, 10, ' ', 'a' };
        int[] intArray11 = new int[] { '4', (short) 100, 10, ' ', 'a' };
        int[] intArray17 = new int[] { '4', (short) 100, 10, ' ', 'a' };
        int[] intArray23 = new int[] { '4', (short) 100, 10, ' ', 'a' };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 100, 10, 32, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 100, 10, 32, 97]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 100, 10, 32, 97]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 100, 10, 32, 97]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test10236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10236");
        int[] intArray4 = new int[] { (short) 1, (short) -1, (short) 100, ' ' };
        int[] intArray9 = new int[] { (short) 1, (short) -1, (short) 100, ' ' };
        int[] intArray14 = new int[] { (short) 1, (short) -1, (short) 100, ' ' };
        int[] intArray19 = new int[] { (short) 1, (short) -1, (short) 100, ' ' };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, -1, 100, 32]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, -1, 100, 32]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, -1, 100, 32]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, -1, 100, 32]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test10237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10237");
        int[] intArray4 = new int[] { (short) 10, (byte) -1, (short) 100, (byte) 100 };
        int[] intArray9 = new int[] { (short) 10, (byte) -1, (short) 100, (byte) 100 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, -1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, -1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test10238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10238");
        int[] intArray5 = new int[] { (short) -1, 'a', (byte) 100, 100, '#' };
        int[] intArray11 = new int[] { (short) -1, 'a', (byte) 100, 100, '#' };
        int[] intArray17 = new int[] { (short) -1, 'a', (byte) 100, 100, '#' };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 100, 100, 35]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 100, 100, 35]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 97, 100, 100, 35]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test10239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10239");
        int[] intArray2 = new int[] { (short) 100, (byte) 1 };
        int[][] intArray3 = new int[][] { intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray3, 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test10240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10240");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test10241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10241");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, (int) (short) 0, (int) (short) 100);
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
    public void test10242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10242");
        int[] intArray2 = new int[] { '4', ' ' };
        int[][] intArray3 = new int[][] { intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray3, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 32]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test10243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10243");
        int[] intArray2 = new int[] { (byte) 10, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray3, (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test10244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10244");
        int[] intArray4 = new int[] { 0, (byte) 0, (short) 10, (byte) 100 };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test10245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10245");
        int[] intArray6 = new int[] { (byte) 1, 'a', (byte) 1, (byte) 10, 1, 100 };
        int[] intArray13 = new int[] { (byte) 1, 'a', (byte) 1, (byte) 10, 1, 100 };
        int[] intArray20 = new int[] { (byte) 1, 'a', (byte) 1, (byte) 10, 1, 100 };
        int[] intArray27 = new int[] { (byte) 1, 'a', (byte) 1, (byte) 10, 1, 100 };
        int[] intArray34 = new int[] { (byte) 1, 'a', (byte) 1, (byte) 10, 1, 100 };
        int[] intArray41 = new int[] { (byte) 1, 'a', (byte) 1, (byte) 10, 1, 100 };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray42, 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 97, 1, 10, 1, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 97, 1, 10, 1, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 97, 1, 10, 1, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 97, 1, 10, 1, 100]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 97, 1, 10, 1, 100]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[1, 97, 1, 10, 1, 100]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test10246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10246");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray1, 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test10247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10247");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray3 = new int[] { (byte) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (int) (short) -1, (int) (byte) 0);
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
    public void test10248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10248");
        int[] intArray2 = new int[] { (short) 0, (short) 10 };
        int[] intArray5 = new int[] { (short) 0, (short) 10 };
        int[] intArray8 = new int[] { (short) 0, (short) 10 };
        int[] intArray11 = new int[] { (short) 0, (short) 10 };
        int[] intArray14 = new int[] { (short) 0, (short) 10 };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test10249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10249");
        int[] intArray1 = new int[] { 'a' };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[97]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test10250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10250");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = new int[] { 100 };
        int[] intArray5 = new int[] { 100 };
        int[] intArray7 = new int[] { 100 };
        int[] intArray9 = new int[] { 100 };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, 100, (int) (byte) 1);
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
    public void test10251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10251");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 1 };
        int[] intArray7 = new int[] { 10, (byte) 0, (byte) 1 };
        int[] intArray11 = new int[] { 10, (byte) 0, (byte) 1 };
        int[] intArray15 = new int[] { 10, (byte) 0, (byte) 1 };
        int[] intArray19 = new int[] { 10, (byte) 0, (byte) 1 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, (int) (byte) 1, (-1));
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
    public void test10252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10252");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray5 = new int[] { (short) 100, 10 };
        int[] intArray8 = new int[] { (short) 100, 10 };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray9, (int) (byte) 10, (int) (byte) -1);
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
    public void test10253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10253");
        int[] intArray5 = new int[] { 100, 100, (byte) 10, (short) 10, (byte) 100 };
        int[] intArray11 = new int[] { 100, 100, (byte) 10, (short) 10, (byte) 100 };
        int[] intArray17 = new int[] { 100, 100, (byte) 10, (short) 10, (byte) 100 };
        int[] intArray23 = new int[] { 100, 100, (byte) 10, (short) 10, (byte) 100 };
        int[] intArray29 = new int[] { 100, 100, (byte) 10, (short) 10, (byte) 100 };
        int[] intArray35 = new int[] { 100, 100, (byte) 10, (short) 10, (byte) 100 };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray36, (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100, 10, 10, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100, 10, 10, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100, 10, 10, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100, 10, 10, 100]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 100, 10, 10, 100]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[100, 100, 10, 10, 100]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test10254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10254");
        int[] intArray3 = new int[] { 1, (short) 0, (byte) 1 };
        int[] intArray7 = new int[] { 1, (short) 0, (byte) 1 };
        int[] intArray11 = new int[] { 1, (short) 0, (byte) 1 };
        int[] intArray15 = new int[] { 1, (short) 0, (byte) 1 };
        int[] intArray19 = new int[] { 1, (short) 0, (byte) 1 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, (int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test10255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10255");
        int[] intArray2 = new int[] { (short) 0, '4' };
        int[][] intArray3 = new int[][] { intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray3, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 52]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test10256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10256");
        int[] intArray6 = new int[] { (short) 1, (short) -1, (short) 100, '4', 1, (-1) };
        int[] intArray13 = new int[] { (short) 1, (short) -1, (short) 100, '4', 1, (-1) };
        int[] intArray20 = new int[] { (short) 1, (short) -1, (short) 100, '4', 1, (-1) };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray21, (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, -1, 100, 52, 1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, -1, 100, 52, 1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, -1, 100, 52, 1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test10257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10257");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray0, intArray1, intArray2, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) (short) 10, (int) 'a');
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
    public void test10258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10258");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int[] intArray5 = new int[] { '4', (short) 1 };
        int[] intArray8 = new int[] { '4', (short) 1 };
        int[] intArray11 = new int[] { '4', (short) 1 };
        int[] intArray14 = new int[] { '4', (short) 1 };
        int[] intArray17 = new int[] { '4', (short) 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
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
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 1]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test10259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10259");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 1, '4', 10 };
        int[] intArray11 = new int[] { '4', (short) 0, (short) 1, '4', 10 };
        int[] intArray17 = new int[] { '4', (short) 0, (short) 1, '4', 10 };
        int[] intArray23 = new int[] { '4', (short) 0, (short) 1, '4', 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 0, 1, 52, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 0, 1, 52, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 0, 1, 52, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 0, 1, 52, 10]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test10260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10260");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) (short) -1, 0);
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
    public void test10261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10261");
        int[] intArray2 = new int[] { 0, (short) 0 };
        int[][] intArray3 = new int[][] { intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray3, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test10262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10262");
        int[] intArray5 = new int[] { (short) -1, (byte) 100, 'a', (byte) 0, (byte) 1 };
        int[] intArray11 = new int[] { (short) -1, (byte) 100, 'a', (byte) 0, (byte) 1 };
        int[] intArray17 = new int[] { (short) -1, (byte) 100, 'a', (byte) 0, (byte) 1 };
        int[] intArray23 = new int[] { (short) -1, (byte) 100, 'a', (byte) 0, (byte) 1 };
        int[] intArray29 = new int[] { (short) -1, (byte) 100, 'a', (byte) 0, (byte) 1 };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray30, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 100, 97, 0, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 100, 97, 0, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 100, 97, 0, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 100, 97, 0, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 100, 97, 0, 1]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test10263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10263");
        int[] intArray2 = new int[] { (byte) 10, (short) 100 };
        int[] intArray5 = new int[] { (byte) 10, (short) 100 };
        int[] intArray8 = new int[] { (byte) 10, (short) 100 };
        int[] intArray11 = new int[] { (byte) 10, (short) 100 };
        int[] intArray14 = new int[] { (byte) 10, (short) 100 };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, (int) '#', (int) (byte) 10);
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
    public void test10264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10264");
        int[] intArray6 = new int[] { 0, 1, (-1), 100, (byte) -1, '#' };
        int[] intArray13 = new int[] { 0, 1, (-1), 100, (byte) -1, '#' };
        int[] intArray20 = new int[] { 0, 1, (-1), 100, (byte) -1, '#' };
        int[] intArray27 = new int[] { 0, 1, (-1), 100, (byte) -1, '#' };
        int[] intArray34 = new int[] { 0, 1, (-1), 100, (byte) -1, '#' };
        int[] intArray41 = new int[] { 0, 1, (-1), 100, (byte) -1, '#' };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray42, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, -1, 100, -1, 35]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, -1, 100, -1, 35]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 1, -1, 100, -1, 35]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 1, -1, 100, -1, 35]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[0, 1, -1, 100, -1, 35]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[0, 1, -1, 100, -1, 35]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test10265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10265");
        int[] intArray4 = new int[] { 10, (byte) 100, (short) 10, 100 };
        int[] intArray9 = new int[] { 10, (byte) 100, (short) 10, 100 };
        int[] intArray14 = new int[] { 10, (byte) 100, (short) 10, 100 };
        int[] intArray19 = new int[] { 10, (byte) 100, (short) 10, 100 };
        int[] intArray24 = new int[] { 10, (byte) 100, (short) 10, 100 };
        int[] intArray29 = new int[] { 10, (byte) 100, (short) 10, 100 };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray30, (int) (short) -1, (int) (byte) 100);
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
    public void test10266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10266");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[][] intArray5 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, (int) (short) -1, (int) ' ');
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
    public void test10267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10267");
        int[] intArray2 = new int[] { (byte) 1, (byte) 1 };
        int[] intArray5 = new int[] { (byte) 1, (byte) 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, 0, 0);
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
    public void test10268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10268");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) ' ', (-1));
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
    public void test10269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10269");
        int[] intArray2 = new int[] { (byte) 10, 10 };
        int[] intArray5 = new int[] { (byte) 10, 10 };
        int[] intArray8 = new int[] { (byte) 10, 10 };
        int[] intArray11 = new int[] { (byte) 10, 10 };
        int[] intArray14 = new int[] { (byte) 10, 10 };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, (int) '#', 100);
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
    public void test10270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10270");
        int[] intArray2 = new int[] { (byte) 0, 'a' };
        int[] intArray5 = new int[] { (byte) 0, 'a' };
        int[] intArray8 = new int[] { (byte) 0, 'a' };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray9, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test10271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10271");
        int[] intArray6 = new int[] { (short) 100, (short) 10, (byte) 0, 10, (short) 0, (byte) 10 };
        int[] intArray13 = new int[] { (short) 100, (short) 10, (byte) 0, 10, (short) 0, (byte) 10 };
        int[] intArray20 = new int[] { (short) 100, (short) 10, (byte) 0, 10, (short) 0, (byte) 10 };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray21, (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 10, 0, 10, 0, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 0, 10, 0, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 10, 0, 10, 0, 10]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test10272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10272");
        int[] intArray5 = new int[] { (byte) 100, (byte) 0, (short) 1, 0, ' ' };
        int[] intArray11 = new int[] { (byte) 100, (byte) 0, (short) 1, 0, ' ' };
        int[] intArray17 = new int[] { (byte) 100, (byte) 0, (short) 1, 0, ' ' };
        int[] intArray23 = new int[] { (byte) 100, (byte) 0, (short) 1, 0, ' ' };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 0, 1, 0, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0, 1, 0, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0, 1, 0, 32]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0, 1, 0, 32]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test10273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10273");
        int[] intArray2 = new int[] { ' ', ' ' };
        int[] intArray5 = new int[] { ' ', ' ' };
        int[] intArray8 = new int[] { ' ', ' ' };
        int[] intArray11 = new int[] { ' ', ' ' };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test10274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10274");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, (int) (byte) 10, 0);
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
    public void test10275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10275");
        int[] intArray4 = new int[] { (short) 1, (short) 10, (byte) 0, (short) 10 };
        int[] intArray9 = new int[] { (short) 1, (short) 10, (byte) 0, (short) 10 };
        int[] intArray14 = new int[] { (short) 1, (short) 10, (byte) 0, (short) 10 };
        int[] intArray19 = new int[] { (short) 1, (short) 10, (byte) 0, (short) 10 };
        int[] intArray24 = new int[] { (short) 1, (short) 10, (byte) 0, (short) 10 };
        int[] intArray29 = new int[] { (short) 1, (short) 10, (byte) 0, (short) 10 };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray30, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, 0, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 10, 0, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 10, 0, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 10, 0, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 10, 0, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 10, 0, 10]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test10276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10276");
        int[] intArray5 = new int[] { (short) -1, (short) 10, (short) 0, 'a', ' ' };
        int[] intArray11 = new int[] { (short) -1, (short) 10, (short) 0, 'a', ' ' };
        int[] intArray17 = new int[] { (short) -1, (short) 10, (short) 0, 'a', ' ' };
        int[] intArray23 = new int[] { (short) -1, (short) 10, (short) 0, 'a', ' ' };
        int[] intArray29 = new int[] { (short) -1, (short) 10, (short) 0, 'a', ' ' };
        int[] intArray35 = new int[] { (short) -1, (short) 10, (short) 0, 'a', ' ' };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray36, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 10, 0, 97, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 0, 97, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 10, 0, 97, 32]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 10, 0, 97, 32]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 10, 0, 97, 32]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1, 10, 0, 97, 32]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test10277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10277");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, 10, (int) '4');
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
    public void test10278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10278");
        int[] intArray6 = new int[] { (byte) 0, (byte) -1, (-1), 100, (byte) 10, 1 };
        int[] intArray13 = new int[] { (byte) 0, (byte) -1, (-1), 100, (byte) 10, 1 };
        int[] intArray20 = new int[] { (byte) 0, (byte) -1, (-1), 100, (byte) 10, 1 };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray21, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, -1, 100, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, -1, -1, 100, 10, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, -1, -1, 100, 10, 1]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test10279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10279");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, (int) (short) 100, 100);
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
    public void test10280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10280");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = new int[] { 100 };
        int[] intArray5 = new int[] { 100 };
        int[] intArray7 = new int[] { 100 };
        int[] intArray9 = new int[] { 100 };
        int[] intArray11 = new int[] { 100 };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) 'a', (int) 'a');
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
    public void test10281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10281");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray3 = new int[] { (short) 1 };
        int[] intArray5 = new int[] { (short) 1 };
        int[] intArray7 = new int[] { (short) 1 };
        int[][] intArray8 = new int[][] { intArray1, intArray3, intArray5, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, (-1), 100);
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
    public void test10282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10282");
        int[] intArray6 = new int[] { (short) 1, 10, (byte) 0, 10, (short) 10, (byte) 1 };
        int[] intArray13 = new int[] { (short) 1, 10, (byte) 0, 10, (short) 10, (byte) 1 };
        int[] intArray20 = new int[] { (short) 1, 10, (byte) 0, 10, (short) 10, (byte) 1 };
        int[] intArray27 = new int[] { (short) 1, 10, (byte) 0, 10, (short) 10, (byte) 1 };
        int[] intArray34 = new int[] { (short) 1, 10, (byte) 0, 10, (short) 10, (byte) 1 };
        int[] intArray41 = new int[] { (short) 1, 10, (byte) 0, 10, (short) 10, (byte) 1 };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray42, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, 0, 10, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 10, 0, 10, 10, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 10, 0, 10, 10, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 10, 0, 10, 10, 1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 10, 0, 10, 10, 1]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[1, 10, 0, 10, 10, 1]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test10283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10283");
        int[] intArray4 = new int[] { 100, 0, (short) -1, (short) 0 };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test10284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10284");
        int[] intArray3 = new int[] { 0, (byte) -1, (byte) 0 };
        int[] intArray7 = new int[] { 0, (byte) -1, (byte) 0 };
        int[] intArray11 = new int[] { 0, (byte) -1, (byte) 0 };
        int[] intArray15 = new int[] { 0, (byte) -1, (byte) 0 };
        int[] intArray19 = new int[] { 0, (byte) -1, (byte) 0 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, -1, 0]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test10285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10285");
        int[] intArray5 = new int[] { (byte) 1, '#', (byte) -1, 10, (short) 10 };
        int[] intArray11 = new int[] { (byte) 1, '#', (byte) -1, 10, (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 35, -1, 10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 35, -1, 10, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test10286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10286");
        int[] intArray5 = new int[] { 100, ' ', (byte) 100, (short) 100, (short) 0 };
        int[] intArray11 = new int[] { 100, ' ', (byte) 100, (short) 100, (short) 0 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 32, 100, 100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 32, 100, 100, 0]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test10287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10287");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray3 = new int[] { ' ' };
        int[] intArray5 = new int[] { ' ' };
        int[][] intArray6 = new int[][] { intArray1, intArray3, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[32]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test10288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10288");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[][] intArray5 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray5, (int) (short) 100, 1);
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
    public void test10289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10289");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = new int[] { 100 };
        int[] intArray5 = new int[] { 100 };
        int[] intArray7 = new int[] { 100 };
        int[] intArray9 = new int[] { 100 };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, 1, 1);
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
    public void test10290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10290");
        int[] intArray3 = new int[] { 0, (byte) -1, '#' };
        int[][] intArray4 = new int[][] { intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, -1, 35]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test10291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10291");
        int[] intArray3 = new int[] { '4', '4', 1 };
        int[] intArray7 = new int[] { '4', '4', 1 };
        int[] intArray11 = new int[] { '4', '4', 1 };
        int[] intArray15 = new int[] { '4', '4', 1 };
        int[] intArray19 = new int[] { '4', '4', 1 };
        int[] intArray23 = new int[] { '4', '4', 1 };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, (int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 52, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[52, 52, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 52, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[52, 52, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[52, 52, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 52, 1]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test10292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10292");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray3 = new int[] { (short) 1 };
        int[] intArray5 = new int[] { (short) 1 };
        int[] intArray7 = new int[] { (short) 1 };
        int[] intArray9 = new int[] { (short) 1 };
        int[] intArray11 = new int[] { (short) 1 };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, 100, (int) '4');
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
    public void test10293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10293");
        int[] intArray6 = new int[] { 'a', (-1), 1, (short) 1, '#', (short) 100 };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray7, 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, -1, 1, 1, 35, 100]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test10294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10294");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test10295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10295");
        int[] intArray4 = new int[] { (short) 100, 'a', 100, ' ' };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 97, 100, 32]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test10296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10296");
        int[] intArray3 = new int[] { '4', (short) 100, 100 };
        int[][] intArray4 = new int[][] { intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 100, 100]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test10297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10297");
        int[] intArray1 = new int[] { '4' };
        int[] intArray3 = new int[] { '4' };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
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
    public void test10298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10298");
        int[] intArray2 = new int[] { (byte) 100, ' ' };
        int[][] intArray3 = new int[][] { intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray3, (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 32]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test10299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10299");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray1, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test10300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10300");
        int[] intArray5 = new int[] { 10, (short) 0, (byte) 1, '4', 0 };
        int[] intArray11 = new int[] { 10, (short) 0, (byte) 1, '4', 0 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 0, 1, 52, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 0, 1, 52, 0]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test10301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10301");
        int[] intArray2 = new int[] { (byte) 0, (byte) 10 };
        int[] intArray5 = new int[] { (byte) 0, (byte) 10 };
        int[] intArray8 = new int[] { (byte) 0, (byte) 10 };
        int[] intArray11 = new int[] { (byte) 0, (byte) 10 };
        int[] intArray14 = new int[] { (byte) 0, (byte) 10 };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test10302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10302");
        int[] intArray5 = new int[] { (short) 10, (short) 1, 0, (byte) 10, (byte) 10 };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1, 0, 10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test10303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10303");
        int[] intArray5 = new int[] { (byte) 100, (byte) 0, 'a', (byte) 100, (short) 100 };
        int[] intArray11 = new int[] { (byte) 100, (byte) 0, 'a', (byte) 100, (short) 100 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 0, 97, 100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0, 97, 100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test10304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10304");
        int[] intArray6 = new int[] { '4', ' ', 'a', ' ', (short) 1, (short) 1 };
        int[] intArray13 = new int[] { '4', ' ', 'a', ' ', (short) 1, (short) 1 };
        int[] intArray20 = new int[] { '4', ' ', 'a', ' ', (short) 1, (short) 1 };
        int[] intArray27 = new int[] { '4', ' ', 'a', ' ', (short) 1, (short) 1 };
        int[] intArray34 = new int[] { '4', ' ', 'a', ' ', (short) 1, (short) 1 };
        int[] intArray41 = new int[] { '4', ' ', 'a', ' ', (short) 1, (short) 1 };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray42, (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 32, 97, 32, 1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[52, 32, 97, 32, 1, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[52, 32, 97, 32, 1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[52, 32, 97, 32, 1, 1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[52, 32, 97, 32, 1, 1]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[52, 32, 97, 32, 1, 1]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test10305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10305");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray3 = new int[] { 'a' };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
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
    public void test10306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10306");
        int[] intArray3 = new int[] { (byte) -1, (short) 100, 10 };
        int[][] intArray4 = new int[][] { intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test10307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10307");
        int[] intArray5 = new int[] { (byte) 10, (short) 0, 100, ' ', 100 };
        int[] intArray11 = new int[] { (byte) 10, (short) 0, 100, ' ', 100 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 0, 100, 32, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 0, 100, 32, 100]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test10308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10308");
        int[] intArray5 = new int[] { 10, (short) 0, 1, '4', (short) 100 };
        int[] intArray11 = new int[] { 10, (short) 0, 1, '4', (short) 100 };
        int[] intArray17 = new int[] { 10, (short) 0, 1, '4', (short) 100 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 0, 1, 52, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 0, 1, 52, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 0, 1, 52, 100]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test10309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10309");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10310");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray0, intArray1, intArray2, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (int) (short) 100, (int) ' ');
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
    public void test10311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10311");
        int[] intArray4 = new int[] { 100, (short) 10, (short) 1, '4' };
        int[] intArray9 = new int[] { 100, (short) 10, (short) 1, '4' };
        int[] intArray14 = new int[] { 100, (short) 10, (short) 1, '4' };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 10, 1, 52]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10, 1, 52]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 10, 1, 52]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test10312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10312");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray0, intArray1, intArray2, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (int) (byte) 100, (int) (short) 10);
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
    public void test10313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10313");
        int[] intArray5 = new int[] { (byte) -1, (short) 0, (byte) 10, 'a', (byte) 0 };
        int[] intArray11 = new int[] { (byte) -1, (short) 0, (byte) 10, 'a', (byte) 0 };
        int[] intArray17 = new int[] { (byte) -1, (short) 0, (byte) 10, 'a', (byte) 0 };
        int[] intArray23 = new int[] { (byte) -1, (short) 0, (byte) 10, 'a', (byte) 0 };
        int[] intArray29 = new int[] { (byte) -1, (short) 0, (byte) 10, 'a', (byte) 0 };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray30, (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0, 10, 97, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 0, 10, 97, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 0, 10, 97, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 0, 10, 97, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 0, 10, 97, 0]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test10314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10314");
        int[] intArray5 = new int[] { (short) 10, '#', 1, ' ', 1 };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 35, 1, 32, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test10315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10315");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray0, intArray1, intArray2, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) (byte) 1, (int) (byte) 1);
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
    public void test10316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10316");
        int[] intArray4 = new int[] { 10, (short) 1, (short) 1, ' ' };
        int[] intArray9 = new int[] { 10, (short) 1, (short) 1, ' ' };
        int[] intArray14 = new int[] { 10, (short) 1, (short) 1, ' ' };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 1, 1, 32]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 1, 1, 32]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 1, 1, 32]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test10317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10317");
        int[] intArray2 = new int[] { (byte) 0, (byte) 1 };
        int[] intArray5 = new int[] { (byte) 0, (byte) 1 };
        int[] intArray8 = new int[] { (byte) 0, (byte) 1 };
        int[] intArray11 = new int[] { (byte) 0, (byte) 1 };
        int[] intArray14 = new int[] { (byte) 0, (byte) 1 };
        int[] intArray17 = new int[] { (byte) 0, (byte) 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray18, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
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
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test10318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10318");
        int[] intArray4 = new int[] { (byte) 100, (byte) 100, 1, (byte) 100 };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray5, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100, 1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test10319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10319");
        int[] intArray4 = new int[] { (byte) -1, 1, (byte) 1, (short) 100 };
        int[] intArray9 = new int[] { (byte) -1, 1, (byte) 1, (short) 100 };
        int[] intArray14 = new int[] { (byte) -1, 1, (byte) 1, (short) 100 };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 1, 1, 100]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test10320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10320");
        int[] intArray3 = new int[] { 100, (byte) 1, (short) -1 };
        int[] intArray7 = new int[] { 100, (byte) 1, (short) -1 };
        int[] intArray11 = new int[] { 100, (byte) 1, (short) -1 };
        int[] intArray15 = new int[] { 100, (byte) 1, (short) -1 };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray16, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test10321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10321");
        int[] intArray6 = new int[] { (byte) 0, '#', 100, (short) 100, (byte) -1, (short) 100 };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray7, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 35, 100, 100, -1, 100]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test10322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10322");
        int[] intArray3 = new int[] { (byte) 10, 'a', (short) -1 };
        int[] intArray7 = new int[] { (byte) 10, 'a', (short) -1 };
        int[] intArray11 = new int[] { (byte) 10, 'a', (short) -1 };
        int[] intArray15 = new int[] { (byte) 10, 'a', (short) -1 };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray16, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
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
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test10323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10323");
        int[] intArray2 = new int[] { 10, (byte) 100 };
        int[] intArray5 = new int[] { 10, (byte) 100 };
        int[] intArray8 = new int[] { 10, (byte) 100 };
        int[] intArray11 = new int[] { 10, (byte) 100 };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, 0, (int) (short) 10);
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
    public void test10324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10324");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray1, (int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test10325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10325");
        int[] intArray3 = new int[] { (byte) 0, (short) -1, '4' };
        int[] intArray7 = new int[] { (byte) 0, (short) -1, '4' };
        int[] intArray11 = new int[] { (byte) 0, (short) -1, '4' };
        int[] intArray15 = new int[] { (byte) 0, (short) -1, '4' };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray16, (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, -1, 52]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, -1, 52]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, -1, 52]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, -1, 52]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test10326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10326");
        int[] intArray6 = new int[] { (byte) 10, (byte) 0, (short) -1, (byte) 0, '#', 10 };
        int[] intArray13 = new int[] { (byte) 10, (byte) 0, (short) -1, (byte) 0, '#', 10 };
        int[] intArray20 = new int[] { (byte) 10, (byte) 0, (short) -1, (byte) 0, '#', 10 };
        int[] intArray27 = new int[] { (byte) 10, (byte) 0, (short) -1, (byte) 0, '#', 10 };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray28, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 0, -1, 0, 35, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 0, -1, 0, 35, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10, 0, -1, 0, 35, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 0, -1, 0, 35, 10]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test10327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10327");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray1, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test10328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10328");
        int[] intArray3 = new int[] { (byte) 10, (byte) 0, 10 };
        int[] intArray7 = new int[] { (byte) 10, (byte) 0, 10 };
        int[] intArray11 = new int[] { (byte) 10, (byte) 0, 10 };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 0, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 0, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test10329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10329");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, 10, 1);
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
    public void test10330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10330");
        int[] intArray3 = new int[] { 1, (short) 1, (short) -1 };
        int[] intArray7 = new int[] { 1, (short) 1, (short) -1 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test10331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10331");
        int[] intArray3 = new int[] { (short) 10, (byte) 100, (byte) 0 };
        int[] intArray7 = new int[] { (short) 10, (byte) 100, (byte) 0 };
        int[] intArray11 = new int[] { (short) 10, (byte) 100, (byte) 0 };
        int[] intArray15 = new int[] { (short) 10, (byte) 100, (byte) 0 };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray16, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 100, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 100, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 100, 0]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test10332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10332");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray0, intArray1, intArray2, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) ' ', (int) (short) 100);
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
    public void test10333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10333");
        int[] intArray6 = new int[] { (byte) 0, (-1), (short) 0, (byte) 10, (short) 1, (byte) 10 };
        int[] intArray13 = new int[] { (byte) 0, (-1), (short) 0, (byte) 10, (short) 1, (byte) 10 };
        int[] intArray20 = new int[] { (byte) 0, (-1), (short) 0, (byte) 10, (short) 1, (byte) 10 };
        int[] intArray27 = new int[] { (byte) 0, (-1), (short) 0, (byte) 10, (short) 1, (byte) 10 };
        int[] intArray34 = new int[] { (byte) 0, (-1), (short) 0, (byte) 10, (short) 1, (byte) 10 };
        int[] intArray41 = new int[] { (byte) 0, (-1), (short) 0, (byte) 10, (short) 1, (byte) 10 };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray42, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 0, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, -1, 0, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, -1, 0, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, -1, 0, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[0, -1, 0, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[0, -1, 0, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test10334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10334");
        int[] intArray4 = new int[] { 1, 1, '4', (short) 10 };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray5, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1, 52, 10]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test10335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10335");
        int[] intArray1 = new int[] { ' ' };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[32]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test10336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10336");
        int[] intArray6 = new int[] { (byte) -1, 0, (short) -1, (byte) 10, '#', (byte) 0 };
        int[] intArray13 = new int[] { (byte) -1, 0, (short) -1, (byte) 10, '#', (byte) 0 };
        int[] intArray20 = new int[] { (byte) -1, 0, (short) -1, (byte) 10, '#', (byte) 0 };
        int[] intArray27 = new int[] { (byte) -1, 0, (short) -1, (byte) 10, '#', (byte) 0 };
        int[] intArray34 = new int[] { (byte) -1, 0, (short) -1, (byte) 10, '#', (byte) 0 };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray35, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0, -1, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 0, -1, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 0, -1, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, 0, -1, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-1, 0, -1, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test10337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10337");
        int[] intArray3 = new int[] { (byte) -1, 1, (short) -1 };
        int[][] intArray4 = new int[][] { intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test10338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10338");
        int[] intArray2 = new int[] { 10, (byte) -1 };
        int[] intArray5 = new int[] { 10, (byte) -1 };
        int[] intArray8 = new int[] { 10, (byte) -1 };
        int[] intArray11 = new int[] { 10, (byte) -1 };
        int[] intArray14 = new int[] { 10, (byte) -1 };
        int[] intArray17 = new int[] { 10, (byte) -1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray18, (int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
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
    public void test10339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10339");
        int[] intArray3 = new int[] { (short) 10, 100, (short) 100 };
        int[] intArray7 = new int[] { (short) 10, 100, (short) 100 };
        int[] intArray11 = new int[] { (short) 10, 100, (short) 100 };
        int[] intArray15 = new int[] { (short) 10, 100, (short) 100 };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray16, (int) (byte) -1, (int) (short) 1);
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
    public void test10340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10340");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray0, intArray1, intArray2, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (int) ' ', (-1));
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
    public void test10341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10341");
        int[] intArray3 = new int[] { (byte) 1, 10, (-1) };
        int[] intArray7 = new int[] { (byte) 1, 10, (-1) };
        int[] intArray11 = new int[] { (byte) 1, 10, (-1) };
        int[] intArray15 = new int[] { (byte) 1, 10, (-1) };
        int[] intArray19 = new int[] { (byte) 1, 10, (-1) };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test10342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10342");
        int[] intArray6 = new int[] { (byte) 100, 0, '#', (short) 100, (byte) 1, (byte) 0 };
        int[] intArray13 = new int[] { (byte) 100, 0, '#', (short) 100, (byte) 1, (byte) 0 };
        int[] intArray20 = new int[] { (byte) 100, 0, '#', (short) 100, (byte) 1, (byte) 0 };
        int[] intArray27 = new int[] { (byte) 100, 0, '#', (short) 100, (byte) 1, (byte) 0 };
        int[] intArray34 = new int[] { (byte) 100, 0, '#', (short) 100, (byte) 1, (byte) 0 };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray35, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 0, 35, 100, 1, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 0, 35, 100, 1, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0, 35, 100, 1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 35, 100, 1, 0]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 0, 35, 100, 1, 0]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test10343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10343");
        int[] intArray4 = new int[] { (byte) 0, (short) -1, 100, (byte) 100 };
        int[] intArray9 = new int[] { (byte) 0, (short) -1, 100, (byte) 100 };
        int[] intArray14 = new int[] { (byte) 0, (short) -1, 100, (byte) 100 };
        int[] intArray19 = new int[] { (byte) 0, (short) -1, 100, (byte) 100 };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, -1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, -1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, -1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test10344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10344");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10345");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10346");
        int[] intArray4 = new int[] { (short) 0, (short) -1, '4', (short) 1 };
        int[] intArray9 = new int[] { (short) 0, (short) -1, '4', (short) 1 };
        int[] intArray14 = new int[] { (short) 0, (short) -1, '4', (short) 1 };
        int[] intArray19 = new int[] { (short) 0, (short) -1, '4', (short) 1 };
        int[] intArray24 = new int[] { (short) 0, (short) -1, '4', (short) 1 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray25, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 52, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, -1, 52, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, -1, 52, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, -1, 52, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, -1, 52, 1]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test10347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10347");
        int[] intArray2 = new int[] { ' ', (-1) };
        int[] intArray5 = new int[] { ' ', (-1) };
        int[] intArray8 = new int[] { ' ', (-1) };
        int[] intArray11 = new int[] { ' ', (-1) };
        int[] intArray14 = new int[] { ' ', (-1) };
        int[] intArray17 = new int[] { ' ', (-1) };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray18, (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
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
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, -1]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test10348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10348");
        int[] intArray3 = new int[] { 10, (short) 100, (short) 0 };
        int[] intArray7 = new int[] { 10, (short) 100, (short) 0 };
        int[] intArray11 = new int[] { 10, (short) 100, (short) 0 };
        int[] intArray15 = new int[] { 10, (short) 100, (short) 0 };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray16, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 100, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 100, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 100, 0]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test10349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10349");
        int[] intArray6 = new int[] { 'a', (short) 1, '#', (-1), '4', (byte) -1 };
        int[] intArray13 = new int[] { 'a', (short) 1, '#', (-1), '4', (byte) -1 };
        int[] intArray20 = new int[] { 'a', (short) 1, '#', (-1), '4', (byte) -1 };
        int[] intArray27 = new int[] { 'a', (short) 1, '#', (-1), '4', (byte) -1 };
        int[] intArray34 = new int[] { 'a', (short) 1, '#', (-1), '4', (byte) -1 };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray35, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, 35, -1, 52, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 1, 35, -1, 52, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 1, 35, -1, 52, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, 1, 35, -1, 52, -1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[97, 1, 35, -1, 52, -1]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test10350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10350");
        int[] intArray6 = new int[] { 10, 10, (byte) 1, 'a', 1, '4' };
        int[] intArray13 = new int[] { 10, 10, (byte) 1, 'a', 1, '4' };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray14, (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10, 1, 97, 1, 52]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10, 1, 97, 1, 52]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test10351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10351");
        int[] intArray3 = new int[] { (short) 1, (short) -1, (short) -1 };
        int[] intArray7 = new int[] { (short) 1, (short) -1, (short) -1 };
        int[] intArray11 = new int[] { (short) 1, (short) -1, (short) -1 };
        int[] intArray15 = new int[] { (short) 1, (short) -1, (short) -1 };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray16, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test10352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10352");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray3 = new int[] { 'a' };
        int[] intArray5 = new int[] { 'a' };
        int[] intArray7 = new int[] { 'a' };
        int[] intArray9 = new int[] { 'a' };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, (int) 'a', (int) '4');
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
    public void test10353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10353");
        int[] intArray5 = new int[] { (short) 1, (short) 10, (byte) 0, (byte) -1, 100 };
        int[] intArray11 = new int[] { (short) 1, (short) 10, (byte) 0, (byte) -1, 100 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 0, -1, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 10, 0, -1, 100]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test10354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10354");
        int[] intArray4 = new int[] { '#', (short) 0, '#', 1 };
        int[] intArray9 = new int[] { '#', (short) 0, '#', 1 };
        int[] intArray14 = new int[] { '#', (short) 0, '#', 1 };
        int[] intArray19 = new int[] { '#', (short) 0, '#', 1 };
        int[] intArray24 = new int[] { '#', (short) 0, '#', 1 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray25, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 0, 35, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[35, 0, 35, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35, 0, 35, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35, 0, 35, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[35, 0, 35, 1]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test10355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10355");
        int[] intArray2 = new int[] { ' ', 10 };
        int[][] intArray3 = new int[][] { intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray3, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 10]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test10356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10356");
        int[] intArray5 = new int[] { (byte) 10, 10, 1, 0, (byte) 10 };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 1, 0, 10]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test10357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10357");
        int[] intArray3 = new int[] { 'a', '#', (byte) 0 };
        int[] intArray7 = new int[] { 'a', '#', (byte) 0 };
        int[] intArray11 = new int[] { 'a', '#', (byte) 0 };
        int[] intArray15 = new int[] { 'a', '#', (byte) 0 };
        int[] intArray19 = new int[] { 'a', '#', (byte) 0 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 35, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 35, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 35, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 35, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97, 35, 0]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test10358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10358");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray1, (int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test10359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10359");
        int[] intArray5 = new int[] { (byte) 1, (short) 10, 100, (short) 1, 'a' };
        int[] intArray11 = new int[] { (byte) 1, (short) 10, 100, (short) 1, 'a' };
        int[] intArray17 = new int[] { (byte) 1, (short) 10, 100, (short) 1, 'a' };
        int[] intArray23 = new int[] { (byte) 1, (short) 10, 100, (short) 1, 'a' };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 100, 1, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 10, 100, 1, 97]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 10, 100, 1, 97]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 10, 100, 1, 97]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test10360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10360");
        int[] intArray3 = new int[] { (byte) 100, (byte) 100, (short) 0 };
        int[] intArray7 = new int[] { (byte) 100, (byte) 100, (short) 0 };
        int[] intArray11 = new int[] { (byte) 100, (byte) 100, (short) 0 };
        int[] intArray15 = new int[] { (byte) 100, (byte) 100, (short) 0 };
        int[] intArray19 = new int[] { (byte) 100, (byte) 100, (short) 0 };
        int[] intArray23 = new int[] { (byte) 100, (byte) 100, (short) 0 };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
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
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100, 0]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test10361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10361");
        int[] intArray6 = new int[] { (byte) 0, (short) 0, (short) 0, (short) 10, (byte) 1, ' ' };
        int[] intArray13 = new int[] { (byte) 0, (short) 0, (short) 0, (short) 10, (byte) 1, ' ' };
        int[] intArray20 = new int[] { (byte) 0, (short) 0, (short) 0, (short) 10, (byte) 1, ' ' };
        int[] intArray27 = new int[] { (byte) 0, (short) 0, (short) 0, (short) 10, (byte) 1, ' ' };
        int[] intArray34 = new int[] { (byte) 0, (short) 0, (short) 0, (short) 10, (byte) 1, ' ' };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray35, 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 10, 1, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, 0, 10, 1, 32]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0, 0, 10, 1, 32]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0, 0, 10, 1, 32]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[0, 0, 0, 10, 1, 32]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test10362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10362");
        int[] intArray3 = new int[] { (byte) 10, '#', 10 };
        int[] intArray7 = new int[] { (byte) 10, '#', 10 };
        int[] intArray11 = new int[] { (byte) 10, '#', 10 };
        int[] intArray15 = new int[] { (byte) 10, '#', 10 };
        int[] intArray19 = new int[] { (byte) 10, '#', 10 };
        int[] intArray23 = new int[] { (byte) 10, '#', 10 };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 35, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 35, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 35, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 35, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 35, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 35, 10]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test10363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10363");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[] intArray5 = new int[] { (short) 0 };
        int[] intArray7 = new int[] { (short) 0 };
        int[] intArray9 = new int[] { (short) 0 };
        int[] intArray11 = new int[] { (short) 0 };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, 1, (int) (short) 100);
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
    public void test10364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10364");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray3 = new int[] { ' ' };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) (short) -1, (int) '4');
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
    public void test10365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10365");
        int[] intArray4 = new int[] { (short) -1, (short) 1, 100, (byte) 10 };
        int[] intArray9 = new int[] { (short) -1, (short) 1, 100, (byte) 10 };
        int[] intArray14 = new int[] { (short) -1, (short) 1, 100, (byte) 10 };
        int[] intArray19 = new int[] { (short) -1, (short) 1, 100, (byte) 10 };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, (int) (short) 10, (int) (short) 1);
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
    public void test10366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10366");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test10367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10367");
        int[] intArray3 = new int[] { (short) 100, (short) 0, (short) 10 };
        int[] intArray7 = new int[] { (short) 100, (short) 0, (short) 10 };
        int[] intArray11 = new int[] { (short) 100, (short) 0, (short) 10 };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test10368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10368");
        int[] intArray4 = new int[] { (byte) 0, 0, 0, '#' };
        int[] intArray9 = new int[] { (byte) 0, 0, 0, '#' };
        int[] intArray14 = new int[] { (byte) 0, 0, 0, '#' };
        int[] intArray19 = new int[] { (byte) 0, 0, 0, '#' };
        int[] intArray24 = new int[] { (byte) 0, 0, 0, '#' };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray25, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0, 0, 35]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0, 35]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0, 35]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0, 0, 35]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0, 0, 35]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test10369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10369");
        int[] intArray6 = new int[] { 'a', (short) 10, (short) 1, (byte) 1, (byte) -1, (short) 1 };
        int[] intArray13 = new int[] { 'a', (short) 10, (short) 1, (byte) 1, (byte) -1, (short) 1 };
        int[] intArray20 = new int[] { 'a', (short) 10, (short) 1, (byte) 1, (byte) -1, (short) 1 };
        int[] intArray27 = new int[] { 'a', (short) 10, (short) 1, (byte) 1, (byte) -1, (short) 1 };
        int[] intArray34 = new int[] { 'a', (short) 10, (short) 1, (byte) 1, (byte) -1, (short) 1 };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray35, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 1, 1, -1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 1, 1, -1, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 10, 1, 1, -1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[97, 10, 1, 1, -1, 1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[97, 10, 1, 1, -1, 1]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test10370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10370");
        int[] intArray3 = new int[] { (short) 100, (byte) 1, '4' };
        int[] intArray7 = new int[] { (short) 100, (byte) 1, '4' };
        int[] intArray11 = new int[] { (short) 100, (byte) 1, '4' };
        int[] intArray15 = new int[] { (short) 100, (byte) 1, '4' };
        int[] intArray19 = new int[] { (short) 100, (byte) 1, '4' };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 52]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1, 52]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 52]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 52]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 1, 52]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test10371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10371");
        int[] intArray2 = new int[] { '4', 0 };
        int[][] intArray3 = new int[][] { intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray3, (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 0]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test10372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10372");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray3 = new int[] { (byte) 1 };
        int[] intArray5 = new int[] { (byte) 1 };
        int[] intArray7 = new int[] { (byte) 1 };
        int[] intArray9 = new int[] { (byte) 1 };
        int[] intArray11 = new int[] { (byte) 1 };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) ' ', (int) ' ');
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
    public void test10373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10373");
        int[] intArray5 = new int[] { 'a', (byte) -1, 0, '4', 10 };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, -1, 0, 52, 10]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test10374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10374");
        int[] intArray4 = new int[] { (byte) 1, 10, (-1), (byte) 0 };
        int[] intArray9 = new int[] { (byte) 1, 10, (-1), (byte) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, (int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, -1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 10, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test10375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10375");
        int[] intArray4 = new int[] { (short) 10, (byte) 100, (short) 0, (short) -1 };
        int[] intArray9 = new int[] { (short) 10, (byte) 100, (short) 0, (short) -1 };
        int[] intArray14 = new int[] { (short) 10, (byte) 100, (short) 0, (short) -1 };
        int[] intArray19 = new int[] { (short) 10, (byte) 100, (short) 0, (short) -1 };
        int[] intArray24 = new int[] { (short) 10, (byte) 100, (short) 0, (short) -1 };
        int[] intArray29 = new int[] { (short) 10, (byte) 100, (short) 0, (short) -1 };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray30, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 100, 0, -1]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test10376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10376");
        int[] intArray5 = new int[] { '#', (byte) 10, (byte) 100, ' ', (byte) 1 };
        int[] intArray11 = new int[] { '#', (byte) 10, (byte) 100, ' ', (byte) 1 };
        int[] intArray17 = new int[] { '#', (byte) 10, (byte) 100, ' ', (byte) 1 };
        int[] intArray23 = new int[] { '#', (byte) 10, (byte) 100, ' ', (byte) 1 };
        int[] intArray29 = new int[] { '#', (byte) 10, (byte) 100, ' ', (byte) 1 };
        int[] intArray35 = new int[] { '#', (byte) 10, (byte) 100, ' ', (byte) 1 };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray36, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 10, 100, 32, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, 10, 100, 32, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[35, 10, 100, 32, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[35, 10, 100, 32, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[35, 10, 100, 32, 1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[35, 10, 100, 32, 1]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test10377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10377");
        int[] intArray4 = new int[] { (short) 10, 0, 0, (byte) 1 };
        int[] intArray9 = new int[] { (short) 10, 0, 0, (byte) 1 };
        int[] intArray14 = new int[] { (short) 10, 0, 0, (byte) 1 };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 0, 0, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 0, 0, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 0, 0, 1]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test10378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10378");
        int[] intArray3 = new int[] { '4', 100, 100 };
        int[] intArray7 = new int[] { '4', 100, 100 };
        int[] intArray11 = new int[] { '4', 100, 100 };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[52, 100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test10379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10379");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[][] intArray3 = new int[][] { intArray0, intArray1, intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray3, 1, (int) (byte) 10);
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
    public void test10380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10380");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray3 = new int[] { ' ' };
        int[] intArray5 = new int[] { ' ' };
        int[][] intArray6 = new int[][] { intArray1, intArray3, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[32]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test10381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10381");
        int[] intArray2 = new int[] { (-1), '4' };
        int[] intArray5 = new int[] { (-1), '4' };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 52]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test10382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10382");
        int[] intArray6 = new int[] { (short) 100, (byte) 0, 'a', (short) 100, (byte) 0, '#' };
        int[] intArray13 = new int[] { (short) 100, (byte) 0, 'a', (short) 100, (byte) 0, '#' };
        int[] intArray20 = new int[] { (short) 100, (byte) 0, 'a', (short) 100, (byte) 0, '#' };
        int[] intArray27 = new int[] { (short) 100, (byte) 0, 'a', (short) 100, (byte) 0, '#' };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray28, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 0, 97, 100, 0, 35]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 0, 97, 100, 0, 35]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0, 97, 100, 0, 35]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 97, 100, 0, 35]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test10383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10383");
        int[] intArray5 = new int[] { (short) 10, ' ', (short) 10, (byte) 10, ' ' };
        int[] intArray11 = new int[] { (short) 10, ' ', (short) 10, (byte) 10, ' ' };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 32, 10, 10, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 32, 10, 10, 32]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test10384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10384");
        int[] intArray4 = new int[] { '#', (byte) 10, (short) 10, (byte) 0 };
        int[] intArray9 = new int[] { '#', (byte) 10, (short) 10, (byte) 0 };
        int[] intArray14 = new int[] { '#', (byte) 10, (short) 10, (byte) 0 };
        int[] intArray19 = new int[] { '#', (byte) 10, (short) 10, (byte) 0 };
        int[] intArray24 = new int[] { '#', (byte) 10, (short) 10, (byte) 0 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray25, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 10, 10, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[35, 10, 10, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35, 10, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35, 10, 10, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[35, 10, 10, 0]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test10385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10385");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[][] intArray5 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, (int) (byte) 1, (int) (byte) 10);
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
    public void test10386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10386");
        int[] intArray4 = new int[] { (byte) 10, (byte) 1, 'a', 100 };
        int[] intArray9 = new int[] { (byte) 10, (byte) 1, 'a', 100 };
        int[] intArray14 = new int[] { (byte) 10, (byte) 1, 'a', 100 };
        int[] intArray19 = new int[] { (byte) 10, (byte) 1, 'a', 100 };
        int[] intArray24 = new int[] { (byte) 10, (byte) 1, 'a', 100 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray25, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 1, 97, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 1, 97, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 1, 97, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 1, 97, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[10, 1, 97, 100]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test10387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10387");
        int[] intArray2 = new int[] { 0, (short) 0 };
        int[] intArray5 = new int[] { 0, (short) 0 };
        int[] intArray8 = new int[] { 0, (short) 0 };
        int[] intArray11 = new int[] { 0, (short) 0 };
        int[] intArray14 = new int[] { 0, (short) 0 };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
    public void test10388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10388");
        int[] intArray2 = new int[] { ' ', (byte) -1 };
        int[] intArray5 = new int[] { ' ', (byte) -1 };
        int[] intArray8 = new int[] { ' ', (byte) -1 };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray9, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, -1]");
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test10389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10389");
        int[] intArray3 = new int[] { ' ', '4', (-1) };
        int[] intArray7 = new int[] { ' ', '4', (-1) };
        int[] intArray11 = new int[] { ' ', '4', (-1) };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 52, -1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test10390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10390");
        int[] intArray6 = new int[] { 1, (-1), (short) 100, '#', (short) -1, (short) 1 };
        int[] intArray13 = new int[] { 1, (-1), (short) 100, '#', (short) -1, (short) 1 };
        int[] intArray20 = new int[] { 1, (-1), (short) 100, '#', (short) -1, (short) 1 };
        int[] intArray27 = new int[] { 1, (-1), (short) 100, '#', (short) -1, (short) 1 };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray28, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, -1, 100, 35, -1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, -1, 100, 35, -1, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, -1, 100, 35, -1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, -1, 100, 35, -1, 1]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test10391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10391");
        int[] intArray4 = new int[] { (-1), 'a', (short) 0, '4' };
        int[] intArray9 = new int[] { (-1), 'a', (short) 0, '4' };
        int[] intArray14 = new int[] { (-1), 'a', (short) 0, '4' };
        int[] intArray19 = new int[] { (-1), 'a', (short) 0, '4' };
        int[] intArray24 = new int[] { (-1), 'a', (short) 0, '4' };
        int[] intArray29 = new int[] { (-1), 'a', (short) 0, '4' };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray30, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 97, 0, 52]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 97, 0, 52]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 97, 0, 52]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 97, 0, 52]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, 97, 0, 52]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 97, 0, 52]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test10392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10392");
        int[] intArray3 = new int[] { (byte) -1, ' ', '4' };
        int[] intArray7 = new int[] { (byte) -1, ' ', '4' };
        int[] intArray11 = new int[] { (byte) -1, ' ', '4' };
        int[] intArray15 = new int[] { (byte) -1, ' ', '4' };
        int[] intArray19 = new int[] { (byte) -1, ' ', '4' };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test10393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10393");
        int[] intArray2 = new int[] { (short) 0, (byte) -1 };
        int[] intArray5 = new int[] { (short) 0, (byte) -1 };
        int[] intArray8 = new int[] { (short) 0, (byte) -1 };
        int[] intArray11 = new int[] { (short) 0, (byte) -1 };
        int[] intArray14 = new int[] { (short) 0, (byte) -1 };
        int[] intArray17 = new int[] { (short) 0, (byte) -1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray18, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
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
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test10394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10394");
        int[] intArray5 = new int[] { (short) 1, (short) 100, (short) 1, '4', (byte) 100 };
        int[] intArray11 = new int[] { (short) 1, (short) 100, (short) 1, '4', (byte) 100 };
        int[] intArray17 = new int[] { (short) 1, (short) 100, (short) 1, '4', (byte) 100 };
        int[] intArray23 = new int[] { (short) 1, (short) 100, (short) 1, '4', (byte) 100 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 100, 1, 52, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 100, 1, 52, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 100, 1, 52, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 100, 1, 52, 100]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test10395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10395");
        int[] intArray6 = new int[] { 100, 10, 10, 1, 0, '4' };
        int[] intArray13 = new int[] { 100, 10, 10, 1, 0, '4' };
        int[] intArray20 = new int[] { 100, 10, 10, 1, 0, '4' };
        int[] intArray27 = new int[] { 100, 10, 10, 1, 0, '4' };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray28, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 10, 10, 1, 0, 52]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, 10, 1, 0, 52]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 10, 10, 1, 0, 52]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 10, 10, 1, 0, 52]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test10396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10396");
        int[] intArray4 = new int[] { (-1), (short) 100, (short) 0, '4' };
        int[] intArray9 = new int[] { (-1), (short) 100, (short) 0, '4' };
        int[] intArray14 = new int[] { (-1), (short) 100, (short) 0, '4' };
        int[] intArray19 = new int[] { (-1), (short) 100, (short) 0, '4' };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 100, 0, 52]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 100, 0, 52]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 100, 0, 52]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 100, 0, 52]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test10397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10397");
        int[] intArray3 = new int[] { (-1), 'a', (byte) 0 };
        int[] intArray7 = new int[] { (-1), 'a', (byte) 0 };
        int[] intArray11 = new int[] { (-1), 'a', (byte) 0 };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 0]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test10398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10398");
        int[] intArray2 = new int[] { (byte) 1, 10 };
        int[] intArray5 = new int[] { (byte) 1, 10 };
        int[] intArray8 = new int[] { (byte) 1, 10 };
        int[] intArray11 = new int[] { (byte) 1, 10 };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test10399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10399");
        int[] intArray3 = new int[] { 0, ' ', (short) 100 };
        int[] intArray7 = new int[] { 0, ' ', (short) 100 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, (int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 32, 100]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test10400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10400");
        int[] intArray6 = new int[] { (short) 0, (byte) 100, '#', 'a', (short) -1, (byte) 100 };
        int[] intArray13 = new int[] { (short) 0, (byte) 100, '#', 'a', (short) -1, (byte) 100 };
        int[] intArray20 = new int[] { (short) 0, (byte) 100, '#', 'a', (short) -1, (byte) 100 };
        int[] intArray27 = new int[] { (short) 0, (byte) 100, '#', 'a', (short) -1, (byte) 100 };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray28, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, 35, 97, -1, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 100, 35, 97, -1, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 100, 35, 97, -1, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 100, 35, 97, -1, 100]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test10401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10401");
        int[] intArray4 = new int[] { 1, 10, (-1), (short) 0 };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, -1, 0]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test10402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10402");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray3 = new int[] { (short) -1 };
        int[] intArray5 = new int[] { (short) -1 };
        int[] intArray7 = new int[] { (short) -1 };
        int[] intArray9 = new int[] { (short) -1 };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, (int) ' ', (int) '4');
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
    public void test10403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10403");
        int[] intArray3 = new int[] { '4', 10, 1 };
        int[] intArray7 = new int[] { '4', 10, 1 };
        int[] intArray11 = new int[] { '4', 10, 1 };
        int[] intArray15 = new int[] { '4', 10, 1 };
        int[] intArray19 = new int[] { '4', 10, 1 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test10404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10404");
        int[] intArray2 = new int[] { (short) 0, 10 };
        int[][] intArray3 = new int[][] { intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray3, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 10]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test10405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10405");
        int[] intArray5 = new int[] { (short) 1, 0, (short) -1, ' ', (byte) 100 };
        int[] intArray11 = new int[] { (short) 1, 0, (short) -1, ' ', (byte) 100 };
        int[] intArray17 = new int[] { (short) 1, 0, (short) -1, ' ', (byte) 100 };
        int[] intArray23 = new int[] { (short) 1, 0, (short) -1, ' ', (byte) 100 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0, -1, 32, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 0, -1, 32, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 0, -1, 32, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 0, -1, 32, 100]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test10406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10406");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10407");
        int[] intArray3 = new int[] { 10, ' ', 10 };
        int[] intArray7 = new int[] { 10, ' ', 10 };
        int[] intArray11 = new int[] { 10, ' ', 10 };
        int[] intArray15 = new int[] { 10, ' ', 10 };
        int[] intArray19 = new int[] { 10, ' ', 10 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 32, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 32, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 32, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 32, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 32, 10]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test10408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10408");
        int[] intArray1 = new int[] { (short) -1 };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test10409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10409");
        int[] intArray4 = new int[] { 0, 1, ' ', (byte) -1 };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 1, 32, -1]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test10410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10410");
        int[] intArray6 = new int[] { '#', (byte) 0, 100, (byte) 100, (byte) -1, (-1) };
        int[] intArray13 = new int[] { '#', (byte) 0, 100, (byte) 100, (byte) -1, (-1) };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray14, (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 0, 100, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[35, 0, 100, 100, -1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test10411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10411");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray3 = new int[] { (short) 10 };
        int[] intArray5 = new int[] { (short) 10 };
        int[] intArray7 = new int[] { (short) 10 };
        int[] intArray9 = new int[] { (short) 10 };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, 0, (int) (short) 1);
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
    public void test10412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10412");
        int[] intArray5 = new int[] { (short) 0, '#', 10, 1, (byte) 10 };
        int[] intArray11 = new int[] { (short) 0, '#', 10, 1, (byte) 10 };
        int[] intArray17 = new int[] { (short) 0, '#', 10, 1, (byte) 10 };
        int[] intArray23 = new int[] { (short) 0, '#', 10, 1, (byte) 10 };
        int[] intArray29 = new int[] { (short) 0, '#', 10, 1, (byte) 10 };
        int[] intArray35 = new int[] { (short) 0, '#', 10, 1, (byte) 10 };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray36, (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 35, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 35, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 35, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 35, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 35, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0, 35, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test10413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10413");
        int[] intArray3 = new int[] { (byte) 1, (byte) -1, 'a' };
        int[] intArray7 = new int[] { (byte) 1, (byte) -1, 'a' };
        int[] intArray11 = new int[] { (byte) 1, (byte) -1, 'a' };
        int[] intArray15 = new int[] { (byte) 1, (byte) -1, 'a' };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray16, (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, -1, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, -1, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, -1, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, -1, 97]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test10414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10414");
        int[] intArray3 = new int[] { (byte) 0, (short) 10, (byte) 100 };
        int[] intArray7 = new int[] { (byte) 0, (short) 10, (byte) 100 };
        int[] intArray11 = new int[] { (byte) 0, (short) 10, (byte) 100 };
        int[] intArray15 = new int[] { (byte) 0, (short) 10, (byte) 100 };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray16, (int) (byte) -1, (int) (short) 0);
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
    public void test10415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10415");
        int[] intArray3 = new int[] { 0, 0, 10 };
        int[] intArray7 = new int[] { 0, 0, 10 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 10]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test10416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10416");
        int[] intArray1 = new int[] { (byte) 0 };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, (int) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test10417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10417");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[][] intArray3 = new int[][] { intArray0, intArray1, intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray3, (int) (byte) 100, (int) ' ');
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
    public void test10418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10418");
        int[] intArray4 = new int[] { '4', 100, 10, (short) 1 };
        int[] intArray9 = new int[] { '4', 100, 10, (short) 1 };
        int[] intArray14 = new int[] { '4', 100, 10, (short) 1 };
        int[] intArray19 = new int[] { '4', 100, 10, (short) 1 };
        int[] intArray24 = new int[] { '4', 100, 10, (short) 1 };
        int[] intArray29 = new int[] { '4', 100, 10, (short) 1 };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray30, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 100, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[52, 100, 10, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[52, 100, 10, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[52, 100, 10, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[52, 100, 10, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[52, 100, 10, 1]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test10419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10419");
        int[] intArray5 = new int[] { (short) 1, (byte) -1, (byte) 10, (short) -1, (byte) -1 };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, -1, 10, -1, -1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test10420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10420");
        int[] intArray6 = new int[] { 'a', 10, ' ', (byte) -1, (byte) 0, (short) 0 };
        int[] intArray13 = new int[] { 'a', 10, ' ', (byte) -1, (byte) 0, (short) 0 };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray14, 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 10, 32, -1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 32, -1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test10421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10421");
        int[] intArray6 = new int[] { (short) 0, 1, 100, '#', '#', (short) 100 };
        int[] intArray13 = new int[] { (short) 0, 1, 100, '#', '#', (short) 100 };
        int[] intArray20 = new int[] { (short) 0, 1, 100, '#', '#', (short) 100 };
        int[] intArray27 = new int[] { (short) 0, 1, 100, '#', '#', (short) 100 };
        int[] intArray34 = new int[] { (short) 0, 1, 100, '#', '#', (short) 100 };
        int[] intArray41 = new int[] { (short) 0, 1, 100, '#', '#', (short) 100 };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray42, (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, 100, 35, 35, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 100, 35, 35, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 1, 100, 35, 35, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 1, 100, 35, 35, 100]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[0, 1, 100, 35, 35, 100]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[0, 1, 100, 35, 35, 100]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test10422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10422");
        int[] intArray2 = new int[] { (byte) 10, (byte) 1 };
        int[] intArray5 = new int[] { (byte) 10, (byte) 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
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
    public void test10423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10423");
        int[] intArray5 = new int[] { (byte) 1, (short) 1, (short) 0, 10, (short) 100 };
        int[] intArray11 = new int[] { (byte) 1, (short) 1, (short) 0, 10, (short) 100 };
        int[] intArray17 = new int[] { (byte) 1, (short) 1, (short) 0, 10, (short) 100 };
        int[] intArray23 = new int[] { (byte) 1, (short) 1, (short) 0, 10, (short) 100 };
        int[] intArray29 = new int[] { (byte) 1, (short) 1, (short) 0, 10, (short) 100 };
        int[] intArray35 = new int[] { (byte) 1, (short) 1, (short) 0, 10, (short) 100 };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray36, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 1, 0, 10, 100]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test10424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10424");
        int[] intArray6 = new int[] { (short) 10, (short) -1, (short) 100, (byte) -1, (byte) 100, 1 };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray7, (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, -1, 100, -1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test10425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10425");
        int[] intArray2 = new int[] { (short) 100, '4' };
        int[] intArray5 = new int[] { (short) 100, '4' };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) (short) 100, (int) (byte) 1);
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
    public void test10426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10426");
        int[] intArray3 = new int[] { (short) 0, (-1), 1 };
        int[] intArray7 = new int[] { (short) 0, (-1), 1 };
        int[] intArray11 = new int[] { (short) 0, (-1), 1 };
        int[] intArray15 = new int[] { (short) 0, (-1), 1 };
        int[] intArray19 = new int[] { (short) 0, (-1), 1 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, -1, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, -1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, -1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, -1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, -1, 1]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test10427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10427");
        int[] intArray4 = new int[] { '4', (short) -1, ' ', (byte) 1 };
        int[] intArray9 = new int[] { '4', (short) -1, ' ', (byte) 1 };
        int[] intArray14 = new int[] { '4', (short) -1, ' ', (byte) 1 };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, -1, 32, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[52, -1, 32, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[52, -1, 32, 1]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test10428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10428");
        int[] intArray5 = new int[] { (byte) 1, 1, (short) 0, (byte) 100, '#' };
        int[] intArray11 = new int[] { (byte) 1, 1, (short) 0, (byte) 100, '#' };
        int[] intArray17 = new int[] { (byte) 1, 1, (short) 0, (byte) 100, '#' };
        int[] intArray23 = new int[] { (byte) 1, 1, (short) 0, (byte) 100, '#' };
        int[] intArray29 = new int[] { (byte) 1, 1, (short) 0, (byte) 100, '#' };
        int[] intArray35 = new int[] { (byte) 1, 1, (short) 0, (byte) 100, '#' };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray36, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1, 0, 100, 35]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1, 0, 100, 35]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1, 0, 100, 35]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1, 0, 100, 35]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1, 0, 100, 35]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 1, 0, 100, 35]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test10429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10429");
        int[] intArray3 = new int[] { (byte) 0, 'a', (byte) -1 };
        int[][] intArray4 = new int[][] { intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 97, -1]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test10430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10430");
        int[] intArray6 = new int[] { 0, '#', '#', 0, 10, ' ' };
        int[] intArray13 = new int[] { 0, '#', '#', 0, 10, ' ' };
        int[] intArray20 = new int[] { 0, '#', '#', 0, 10, ' ' };
        int[] intArray27 = new int[] { 0, '#', '#', 0, 10, ' ' };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray28, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 35, 35, 0, 10, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 35, 35, 0, 10, 32]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 35, 35, 0, 10, 32]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 35, 35, 0, 10, 32]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test10431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10431");
        int[] intArray4 = new int[] { (short) 10, 'a', (byte) 0, 'a' };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray5, (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 97, 0, 97]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test10432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10432");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray0, intArray1, intArray2, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (-1), (int) (short) 100);
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
    public void test10433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10433");
        int[] intArray1 = new int[] { ' ' };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[32]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test10434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10434");
        int[] intArray2 = new int[] { 0, (byte) 10 };
        int[] intArray5 = new int[] { 0, (byte) 10 };
        int[] intArray8 = new int[] { 0, (byte) 10 };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray9, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 10]");
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test10435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10435");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray3 = new int[] { (byte) 10 };
        int[] intArray5 = new int[] { (byte) 10 };
        int[] intArray7 = new int[] { (byte) 10 };
        int[] intArray9 = new int[] { (byte) 10 };
        int[] intArray11 = new int[] { (byte) 10 };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (byte) 10, 1);
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
    public void test10436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10436");
        int[] intArray5 = new int[] { (byte) 0, (byte) 0, (byte) 100, '4', ' ' };
        int[] intArray11 = new int[] { (byte) 0, (byte) 0, (byte) 100, '4', ' ' };
        int[] intArray17 = new int[] { (byte) 0, (byte) 0, (byte) 100, '4', ' ' };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 100, 52, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 100, 52, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0, 100, 52, 32]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test10437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10437");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10438");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, ' ', (short) 0, (short) -1, ' ' };
        int[] intArray13 = new int[] { (short) -1, (byte) -1, ' ', (short) 0, (short) -1, ' ' };
        int[] intArray20 = new int[] { (short) -1, (byte) -1, ' ', (short) 0, (short) -1, ' ' };
        int[] intArray27 = new int[] { (short) -1, (byte) -1, ' ', (short) 0, (short) -1, ' ' };
        int[] intArray34 = new int[] { (short) -1, (byte) -1, ' ', (short) 0, (short) -1, ' ' };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray35, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 32, 0, -1, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1, 32, 0, -1, 32]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1, 32, 0, -1, 32]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, -1, 32, 0, -1, 32]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-1, -1, 32, 0, -1, 32]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test10439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10439");
        int[] intArray5 = new int[] { (byte) 10, (byte) 100, '4', '4', (short) -1 };
        int[] intArray11 = new int[] { (byte) 10, (byte) 100, '4', '4', (short) -1 };
        int[] intArray17 = new int[] { (byte) 10, (byte) 100, '4', '4', (short) -1 };
        int[] intArray23 = new int[] { (byte) 10, (byte) 100, '4', '4', (short) -1 };
        int[] intArray29 = new int[] { (byte) 10, (byte) 100, '4', '4', (short) -1 };
        int[] intArray35 = new int[] { (byte) 10, (byte) 100, '4', '4', (short) -1 };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray36, (int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 100, 52, 52, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 100, 52, 52, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 100, 52, 52, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 100, 52, 52, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 100, 52, 52, -1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[10, 100, 52, 52, -1]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test10440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10440");
        int[] intArray3 = new int[] { (-1), (byte) -1, (byte) -1 };
        int[] intArray7 = new int[] { (-1), (byte) -1, (byte) -1 };
        int[] intArray11 = new int[] { (-1), (byte) -1, (byte) -1 };
        int[] intArray15 = new int[] { (-1), (byte) -1, (byte) -1 };
        int[] intArray19 = new int[] { (-1), (byte) -1, (byte) -1 };
        int[] intArray23 = new int[] { (-1), (byte) -1, (byte) -1 };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test10441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10441");
        int[] intArray5 = new int[] { (-1), (-1), 1, (byte) 100, 1 };
        int[] intArray11 = new int[] { (-1), (-1), 1, (byte) 100, 1 };
        int[] intArray17 = new int[] { (-1), (-1), 1, (byte) 100, 1 };
        int[] intArray23 = new int[] { (-1), (-1), 1, (byte) 100, 1 };
        int[] intArray29 = new int[] { (-1), (-1), 1, (byte) 100, 1 };
        int[] intArray35 = new int[] { (-1), (-1), 1, (byte) 100, 1 };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray36, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, -1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, -1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1, -1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test10442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10442");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = new int[] { (short) 100 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
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
    public void test10443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10443");
        int[] intArray3 = new int[] { (short) -1, (-1), (-1) };
        int[] intArray7 = new int[] { (short) -1, (-1), (-1) };
        int[] intArray11 = new int[] { (short) -1, (-1), (-1) };
        int[] intArray15 = new int[] { (short) -1, (-1), (-1) };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray16, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test10444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10444");
        int[] intArray2 = new int[] { 1, 'a' };
        int[] intArray5 = new int[] { 1, 'a' };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 97]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 97]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test10445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10445");
        int[] intArray2 = new int[] { 'a', (short) -1 };
        int[] intArray5 = new int[] { 'a', (short) -1 };
        int[] intArray8 = new int[] { 'a', (short) -1 };
        int[] intArray11 = new int[] { 'a', (short) -1 };
        int[] intArray14 = new int[] { 'a', (short) -1 };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
    public void test10446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10446");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray3 = new int[] { 'a' };
        int[] intArray5 = new int[] { 'a' };
        int[] intArray7 = new int[] { 'a' };
        int[] intArray9 = new int[] { 'a' };
        int[] intArray11 = new int[] { 'a' };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (byte) 1, (int) 'a');
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
    public void test10447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10447");
        int[] intArray5 = new int[] { (short) 10, 'a', (short) 1, (-1), '#' };
        int[] intArray11 = new int[] { (short) 10, 'a', (short) 1, (-1), '#' };
        int[] intArray17 = new int[] { (short) 10, 'a', (short) 1, (-1), '#' };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 97, 1, -1, 35]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 1, -1, 35]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 97, 1, -1, 35]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test10448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10448");
        int[] intArray4 = new int[] { '4', (short) 1, 1, (short) 10 };
        int[] intArray9 = new int[] { '4', (short) 1, 1, (short) 10 };
        int[] intArray14 = new int[] { '4', (short) 1, 1, (short) 10 };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 1, 1, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[52, 1, 1, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[52, 1, 1, 10]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test10449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10449");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray3 = new int[] { (-1) };
        int[] intArray5 = new int[] { (-1) };
        int[] intArray7 = new int[] { (-1) };
        int[] intArray9 = new int[] { (-1) };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, (int) '#', (int) (short) 10);
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
    public void test10450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10450");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray3 = new int[] { (byte) 10 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test10451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10451");
        int[] intArray2 = new int[] { (byte) 1, (short) 1 };
        int[] intArray5 = new int[] { (byte) 1, (short) 1 };
        int[] intArray8 = new int[] { (byte) 1, (short) 1 };
        int[] intArray11 = new int[] { (byte) 1, (short) 1 };
        int[] intArray14 = new int[] { (byte) 1, (short) 1 };
        int[] intArray17 = new int[] { (byte) 1, (short) 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray18, (int) (byte) 10, (int) (byte) -1);
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
    public void test10452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10452");
        int[] intArray2 = new int[] { '#', (short) 100 };
        int[] intArray5 = new int[] { '#', (short) 100 };
        int[] intArray8 = new int[] { '#', (short) 100 };
        int[] intArray11 = new int[] { '#', (short) 100 };
        int[] intArray14 = new int[] { '#', (short) 100 };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test10453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10453");
        int[] intArray4 = new int[] { 0, (byte) 100, 100, 100 };
        int[] intArray9 = new int[] { 0, (byte) 100, 100, 100 };
        int[] intArray14 = new int[] { 0, (byte) 100, 100, 100 };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 100, 100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test10454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10454");
        int[] intArray6 = new int[] { (short) 10, (short) 100, '4', (short) 0, 100, '#' };
        int[] intArray13 = new int[] { (short) 10, (short) 100, '4', (short) 0, 100, '#' };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray14, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 100, 52, 0, 100, 35]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 100, 52, 0, 100, 35]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test10455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10455");
        int[] intArray6 = new int[] { (short) 1, (byte) 10, (byte) 10, (byte) -1, ' ', (short) 0 };
        int[] intArray13 = new int[] { (short) 1, (byte) 10, (byte) 10, (byte) -1, ' ', (short) 0 };
        int[] intArray20 = new int[] { (short) 1, (byte) 10, (byte) 10, (byte) -1, ' ', (short) 0 };
        int[] intArray27 = new int[] { (short) 1, (byte) 10, (byte) 10, (byte) -1, ' ', (short) 0 };
        int[] intArray34 = new int[] { (short) 1, (byte) 10, (byte) 10, (byte) -1, ' ', (short) 0 };
        int[] intArray41 = new int[] { (short) 1, (byte) 10, (byte) 10, (byte) -1, ' ', (short) 0 };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray42, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, 10, -1, 32, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 10, 10, -1, 32, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 10, 10, -1, 32, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 10, 10, -1, 32, 0]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 10, 10, -1, 32, 0]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[1, 10, 10, -1, 32, 0]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test10456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10456");
        int[] intArray6 = new int[] { (byte) 10, (short) 10, (byte) -1, (short) 0, '4', 1 };
        int[] intArray13 = new int[] { (byte) 10, (short) 10, (byte) -1, (short) 0, '4', 1 };
        int[] intArray20 = new int[] { (byte) 10, (short) 10, (byte) -1, (short) 0, '4', 1 };
        int[] intArray27 = new int[] { (byte) 10, (short) 10, (byte) -1, (short) 0, '4', 1 };
        int[] intArray34 = new int[] { (byte) 10, (short) 10, (byte) -1, (short) 0, '4', 1 };
        int[] intArray41 = new int[] { (byte) 10, (short) 10, (byte) -1, (short) 0, '4', 1 };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray42, 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10, -1, 0, 52, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10, -1, 0, 52, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10, 10, -1, 0, 52, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 10, -1, 0, 52, 1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[10, 10, -1, 0, 52, 1]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[10, 10, -1, 0, 52, 1]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test10457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10457");
        int[] intArray2 = new int[] { 10, '#' };
        int[] intArray5 = new int[] { 10, '#' };
        int[] intArray8 = new int[] { 10, '#' };
        int[] intArray11 = new int[] { 10, '#' };
        int[] intArray14 = new int[] { 10, '#' };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, (int) (short) 10, (int) (byte) 100);
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
    public void test10458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10458");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10459");
        int[] intArray6 = new int[] { (-1), (byte) 10, 10, 10, (short) 100, (byte) 1 };
        int[] intArray13 = new int[] { (-1), (byte) 10, 10, 10, (short) 100, (byte) 1 };
        int[] intArray20 = new int[] { (-1), (byte) 10, 10, 10, (short) 100, (byte) 1 };
        int[] intArray27 = new int[] { (-1), (byte) 10, 10, 10, (short) 100, (byte) 1 };
        int[] intArray34 = new int[] { (-1), (byte) 10, 10, 10, (short) 100, (byte) 1 };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray35, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 10, 10, 100, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 10, 10, 100, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 10, 10, 10, 100, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, 10, 10, 10, 100, 1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-1, 10, 10, 10, 100, 1]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test10460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10460");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[][] intArray3 = new int[][] { intArray0, intArray1, intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray3, 0, (int) (short) 0);
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
    public void test10461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10461");
        int[] intArray3 = new int[] { 0, (short) 0, (byte) 100 };
        int[] intArray7 = new int[] { 0, (short) 0, (byte) 100 };
        int[] intArray11 = new int[] { 0, (short) 0, (byte) 100 };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 100]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test10462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10462");
        int[] intArray2 = new int[] { (byte) 100, (byte) 100 };
        int[] intArray5 = new int[] { (byte) 100, (byte) 100 };
        int[] intArray8 = new int[] { (byte) 100, (byte) 100 };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray9, (int) (byte) -1, (int) (byte) -1);
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
    public void test10463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10463");
        int[] intArray5 = new int[] { (byte) 10, (short) 100, (byte) -1, (byte) -1, 10 };
        int[] intArray11 = new int[] { (byte) 10, (short) 100, (byte) -1, (byte) -1, 10 };
        int[] intArray17 = new int[] { (byte) 10, (short) 100, (byte) -1, (byte) -1, 10 };
        int[] intArray23 = new int[] { (byte) 10, (short) 100, (byte) -1, (byte) -1, 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 100, -1, -1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 100, -1, -1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 100, -1, -1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 100, -1, -1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test10464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10464");
        int[] intArray5 = new int[] { (byte) 100, (short) -1, ' ', 10, (byte) -1 };
        int[] intArray11 = new int[] { (byte) 100, (short) -1, ' ', 10, (byte) -1 };
        int[] intArray17 = new int[] { (byte) 100, (short) -1, ' ', 10, (byte) -1 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, 32, 10, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, -1, 32, 10, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, -1, 32, 10, -1]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test10465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10465");
        int[] intArray5 = new int[] { (short) 1, '4', 100, (short) 0, (byte) 100 };
        int[] intArray11 = new int[] { (short) 1, '4', 100, (short) 0, (byte) 100 };
        int[] intArray17 = new int[] { (short) 1, '4', 100, (short) 0, (byte) 100 };
        int[][] intArray18 = new int[][] { intArray5, intArray11, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray18, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 52, 100, 0, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 52, 100, 0, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 52, 100, 0, 100]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test10466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10466");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray1, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test10467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10467");
        int[] intArray2 = new int[] { (byte) -1, 0 };
        int[] intArray5 = new int[] { (byte) -1, 0 };
        int[] intArray8 = new int[] { (byte) -1, 0 };
        int[] intArray11 = new int[] { (byte) -1, 0 };
        int[] intArray14 = new int[] { (byte) -1, 0 };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test10468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10468");
        int[] intArray3 = new int[] { 100, (short) 10, ' ' };
        int[][] intArray4 = new int[][] { intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 32]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test10469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10469");
        int[] intArray4 = new int[] { (byte) 0, 100, (short) -1, (byte) 100 };
        int[] intArray9 = new int[] { (byte) 0, 100, (short) -1, (byte) 100 };
        int[] intArray14 = new int[] { (byte) 0, 100, (short) -1, (byte) 100 };
        int[] intArray19 = new int[] { (byte) 0, 100, (short) -1, (byte) 100 };
        int[] intArray24 = new int[] { (byte) 0, 100, (short) -1, (byte) 100 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray25, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, -1, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 100, -1, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 100, -1, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 100, -1, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 100, -1, 100]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test10470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10470");
        int[] intArray6 = new int[] { (short) 0, (-1), (short) 100, (byte) 100, (short) 0, 0 };
        int[] intArray13 = new int[] { (short) 0, (-1), (short) 100, (byte) 100, (short) 0, 0 };
        int[] intArray20 = new int[] { (short) 0, (-1), (short) 100, (byte) 100, (short) 0, 0 };
        int[] intArray27 = new int[] { (short) 0, (-1), (short) 100, (byte) 100, (short) 0, 0 };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray28, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 100, 100, 0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, -1, 100, 100, 0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, -1, 100, 100, 0, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, -1, 100, 100, 0, 0]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test10471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10471");
        int[] intArray4 = new int[] { (short) 10, 100, 10, (byte) 1 };
        int[] intArray9 = new int[] { (short) 10, 100, 10, (byte) 1 };
        int[] intArray14 = new int[] { (short) 10, 100, 10, (byte) 1 };
        int[] intArray19 = new int[] { (short) 10, 100, 10, (byte) 1 };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 100, 10, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 100, 10, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 100, 10, 1]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test10472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10472");
        int[] intArray5 = new int[] { (byte) 1, (byte) 1, (byte) -1, (short) 0, (short) 0 };
        int[] intArray11 = new int[] { (byte) 1, (byte) 1, (byte) -1, (short) 0, (short) 0 };
        int[] intArray17 = new int[] { (byte) 1, (byte) 1, (byte) -1, (short) 0, (short) 0 };
        int[] intArray23 = new int[] { (byte) 1, (byte) 1, (byte) -1, (short) 0, (short) 0 };
        int[] intArray29 = new int[] { (byte) 1, (byte) 1, (byte) -1, (short) 0, (short) 0 };
        int[] intArray35 = new int[] { (byte) 1, (byte) 1, (byte) -1, (short) 0, (short) 0 };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray36, 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1, -1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1, -1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1, -1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1, -1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1, -1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 1, -1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test10473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10473");
        int[] intArray3 = new int[] { 1, ' ', 10 };
        int[][] intArray4 = new int[][] { intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 32, 10]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test10474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10474");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray3 = new int[] { ' ' };
        int[] intArray5 = new int[] { ' ' };
        int[] intArray7 = new int[] { ' ' };
        int[] intArray9 = new int[] { ' ' };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, (-1), (int) (short) -1);
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
    public void test10475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10475");
        int[] intArray6 = new int[] { (byte) 10, (short) 1, 'a', (byte) 1, (short) 0, 100 };
        int[] intArray13 = new int[] { (byte) 10, (short) 1, 'a', (byte) 1, (short) 0, 100 };
        int[] intArray20 = new int[] { (byte) 10, (short) 1, 'a', (byte) 1, (short) 0, 100 };
        int[] intArray27 = new int[] { (byte) 10, (short) 1, 'a', (byte) 1, (short) 0, 100 };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray28, (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 1, 97, 1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 1, 97, 1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10, 1, 97, 1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 1, 97, 1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test10476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10476");
        int[] intArray3 = new int[] { 100, '4', (byte) -1 };
        int[] intArray7 = new int[] { 100, '4', (byte) -1 };
        int[] intArray11 = new int[] { 100, '4', (byte) -1 };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 52, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 52, -1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test10477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10477");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray3 = new int[] { (byte) 10 };
        int[] intArray5 = new int[] { (byte) 10 };
        int[] intArray7 = new int[] { (byte) 10 };
        int[] intArray9 = new int[] { (byte) 10 };
        int[] intArray11 = new int[] { (byte) 10 };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, 1, 0);
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
    public void test10478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10478");
        int[] intArray3 = new int[] { 1, '#', 1 };
        int[] intArray7 = new int[] { 1, '#', 1 };
        int[] intArray11 = new int[] { 1, '#', 1 };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 35, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 35, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 35, 1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test10479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10479");
        int[] intArray2 = new int[] { (byte) 0, 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray3, (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test10480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10480");
        int[] intArray4 = new int[] { 1, (byte) 10, (-1), '4' };
        int[] intArray9 = new int[] { 1, (byte) 10, (-1), '4' };
        int[] intArray14 = new int[] { 1, (byte) 10, (-1), '4' };
        int[] intArray19 = new int[] { 1, (byte) 10, (-1), '4' };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, -1, 52]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 10, -1, 52]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 10, -1, 52]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 10, -1, 52]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test10481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10481");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray3 = new int[] { 'a' };
        int[] intArray5 = new int[] { 'a' };
        int[] intArray7 = new int[] { 'a' };
        int[][] intArray8 = new int[][] { intArray1, intArray3, intArray5, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
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
    public void test10482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10482");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[][] intArray5 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, (-1), (int) (byte) -1);
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
    public void test10483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10483");
        int[] intArray1 = new int[] { 1 };
        int[] intArray3 = new int[] { 1 };
        int[] intArray5 = new int[] { 1 };
        int[] intArray7 = new int[] { 1 };
        int[][] intArray8 = new int[][] { intArray1, intArray3, intArray5, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, (int) (byte) 100, (int) (byte) -1);
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
    public void test10484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10484");
        int[] intArray4 = new int[] { 10, 100, (byte) 1, (byte) 100 };
        int[] intArray9 = new int[] { 10, 100, (byte) 1, (byte) 100 };
        int[] intArray14 = new int[] { 10, 100, (byte) 1, (byte) 100 };
        int[] intArray19 = new int[] { 10, 100, (byte) 1, (byte) 100 };
        int[] intArray24 = new int[] { 10, 100, (byte) 1, (byte) 100 };
        int[] intArray29 = new int[] { 10, 100, (byte) 1, (byte) 100 };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray30, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 100, 1, 100]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test10485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10485");
        int[] intArray4 = new int[] { 100, 0, (short) 0, (short) 10 };
        int[] intArray9 = new int[] { 100, 0, (short) 0, (short) 10 };
        int[] intArray14 = new int[] { 100, 0, (short) 0, (short) 10 };
        int[] intArray19 = new int[] { 100, 0, (short) 0, (short) 10 };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 0, 0, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0, 0, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0, 0, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0, 0, 10]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test10486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10486");
        int[] intArray2 = new int[] { 10, ' ' };
        int[] intArray5 = new int[] { 10, ' ' };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
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
    public void test10487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10487");
        int[] intArray3 = new int[] { ' ', 'a', 100 };
        int[] intArray7 = new int[] { ' ', 'a', 100 };
        int[] intArray11 = new int[] { ' ', 'a', 100 };
        int[] intArray15 = new int[] { ' ', 'a', 100 };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray16, (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 97, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 97, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 97, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 97, 100]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test10488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10488");
        int[] intArray6 = new int[] { (short) 100, (byte) 0, (short) 1, (short) 100, 100, (short) -1 };
        int[] intArray13 = new int[] { (short) 100, (byte) 0, (short) 1, (short) 100, 100, (short) -1 };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray14, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 0, 1, 100, 100, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 0, 1, 100, 100, -1]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test10489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10489");
        int[] intArray5 = new int[] { (short) 100, ' ', 1, (byte) 1, ' ' };
        int[] intArray11 = new int[] { (short) 100, ' ', 1, (byte) 1, ' ' };
        int[] intArray17 = new int[] { (short) 100, ' ', 1, (byte) 1, ' ' };
        int[] intArray23 = new int[] { (short) 100, ' ', 1, (byte) 1, ' ' };
        int[] intArray29 = new int[] { (short) 100, ' ', 1, (byte) 1, ' ' };
        int[] intArray35 = new int[] { (short) 100, ' ', 1, (byte) 1, ' ' };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray36, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 32, 1, 1, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 32, 1, 1, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 32, 1, 1, 32]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 32, 1, 1, 32]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 32, 1, 1, 32]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[100, 32, 1, 1, 32]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test10490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10490");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray1, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test10491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10491");
        int[] intArray5 = new int[] { (byte) 1, 'a', (byte) 100, (short) 1, (byte) 0 };
        int[] intArray11 = new int[] { (byte) 1, 'a', (byte) 100, (short) 1, (byte) 0 };
        int[] intArray17 = new int[] { (byte) 1, 'a', (byte) 100, (short) 1, (byte) 0 };
        int[] intArray23 = new int[] { (byte) 1, 'a', (byte) 100, (short) 1, (byte) 0 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 97, 100, 1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 97, 100, 1, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 97, 100, 1, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 97, 100, 1, 0]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test10492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10492");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, 0, (int) (byte) -1);
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
    public void test10493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10493");
        int[] intArray3 = new int[] { 1, 10, 10 };
        int[][] intArray4 = new int[][] { intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 10, 10]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test10494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10494");
        int[] intArray4 = new int[] { (short) 10, (short) 1, 'a', (byte) 1 };
        int[] intArray9 = new int[] { (short) 10, (short) 1, 'a', (byte) 1 };
        int[] intArray14 = new int[] { (short) 10, (short) 1, 'a', (byte) 1 };
        int[] intArray19 = new int[] { (short) 10, (short) 1, 'a', (byte) 1 };
        int[] intArray24 = new int[] { (short) 10, (short) 1, 'a', (byte) 1 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray25, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 1, 97, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 1, 97, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 1, 97, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 1, 97, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[10, 1, 97, 1]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test10495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10495");
        int[] intArray3 = new int[] { '4', (byte) 10, '4' };
        int[] intArray7 = new int[] { '4', (byte) 10, '4' };
        int[] intArray11 = new int[] { '4', (byte) 10, '4' };
        int[] intArray15 = new int[] { '4', (byte) 10, '4' };
        int[] intArray19 = new int[] { '4', (byte) 10, '4' };
        int[] intArray23 = new int[] { '4', (byte) 10, '4' };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
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
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 10, 52]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test10496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10496");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray3 = new int[] { (byte) 10 };
        int[] intArray5 = new int[] { (byte) 10 };
        int[] intArray7 = new int[] { (byte) 10 };
        int[] intArray9 = new int[] { (byte) 10 };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, (-1), (int) '#');
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
    public void test10497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10497");
        int[] intArray2 = new int[] { ' ', '4' };
        int[] intArray5 = new int[] { ' ', '4' };
        int[] intArray8 = new int[] { ' ', '4' };
        int[] intArray11 = new int[] { ' ', '4' };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 52]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 52]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 52]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test10498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10498");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray0, intArray1, intArray2, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, 0, (int) (short) 100);
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
    public void test10499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10499");
        int[] intArray3 = new int[] { (short) -1, ' ', (short) 1 };
        int[] intArray7 = new int[] { (short) -1, ' ', (short) 1 };
        int[] intArray11 = new int[] { (short) -1, ' ', (short) 1 };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 32, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 32, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 32, 1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test10500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10500");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray0, intArray1, intArray2, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) (byte) 100, 0);
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
}

