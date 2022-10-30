package MazeRecursion;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest30 {

    public static boolean debug = false;

    @Test
    public void test15001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15001");
        int[] intArray5 = new int[] { (byte) 10, 0, (short) 100, (short) -1, 'a' };
        int[] intArray11 = new int[] { (byte) 10, 0, (short) 100, (short) -1, 'a' };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 0, 100, -1, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 0, 100, -1, 97]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test15002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15002");
        int[] intArray1 = new int[] { ' ' };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[32]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test15003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15003");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray3 = new int[] { (short) 1 };
        int[] intArray5 = new int[] { (short) 1 };
        int[] intArray7 = new int[] { (short) 1 };
        int[] intArray9 = new int[] { (short) 1 };
        int[] intArray11 = new int[] { (short) 1 };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (short) 1, 0);
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
    public void test15004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15004");
        int[] intArray5 = new int[] { 100, (short) 1, (short) -1, (-1), ' ' };
        int[] intArray11 = new int[] { 100, (short) 1, (short) -1, (-1), ' ' };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, -1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, -1, -1, 32]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test15005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15005");
        int[] intArray5 = new int[] { (short) 10, (short) 1, (byte) 1, '#', (byte) -1 };
        int[] intArray11 = new int[] { (short) 10, (short) 1, (byte) 1, '#', (byte) -1 };
        int[] intArray17 = new int[] { (short) 10, (short) 1, (byte) 1, '#', (byte) -1 };
        int[] intArray23 = new int[] { (short) 10, (short) 1, (byte) 1, '#', (byte) -1 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1, 1, 35, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 1, 1, 35, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 1, 1, 35, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 1, 1, 35, -1]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test15006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15006");
        int[] intArray3 = new int[] { '4', 100, (short) 10 };
        int[] intArray7 = new int[] { '4', 100, (short) 10 };
        int[] intArray11 = new int[] { '4', 100, (short) 10 };
        int[] intArray15 = new int[] { '4', 100, (short) 10 };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray16, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 100, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[52, 100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 100, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[52, 100, 10]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test15007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15007");
        int[] intArray6 = new int[] { '#', (short) 0, 1, (byte) 10, (short) 10, (short) 0 };
        int[] intArray13 = new int[] { '#', (short) 0, 1, (byte) 10, (short) 10, (short) 0 };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray14, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 0, 1, 10, 10, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[35, 0, 1, 10, 10, 0]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test15008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15008");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15009");
        int[] intArray6 = new int[] { (byte) 0, '#', (byte) -1, '#', (byte) 0, (short) 100 };
        int[] intArray13 = new int[] { (byte) 0, '#', (byte) -1, '#', (byte) 0, (short) 100 };
        int[] intArray20 = new int[] { (byte) 0, '#', (byte) -1, '#', (byte) 0, (short) 100 };
        int[] intArray27 = new int[] { (byte) 0, '#', (byte) -1, '#', (byte) 0, (short) 100 };
        int[] intArray34 = new int[] { (byte) 0, '#', (byte) -1, '#', (byte) 0, (short) 100 };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray35, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 35, -1, 35, 0, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 35, -1, 35, 0, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 35, -1, 35, 0, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 35, -1, 35, 0, 100]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[0, 35, -1, 35, 0, 100]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test15010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15010");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test15011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15011");
        int[] intArray6 = new int[] { '#', ' ', (byte) 1, 1, (byte) 10, (short) 10 };
        int[] intArray13 = new int[] { '#', ' ', (byte) 1, 1, (byte) 10, (short) 10 };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray14, (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 32, 1, 1, 10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[35, 32, 1, 1, 10, 10]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test15012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15012");
        int[] intArray4 = new int[] { '4', '4', (byte) 100, (byte) 10 };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 52, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test15013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15013");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = new int[] { (byte) -1 };
        int[] intArray5 = new int[] { (byte) -1 };
        int[] intArray7 = new int[] { (byte) -1 };
        int[] intArray9 = new int[] { (byte) -1 };
        int[] intArray11 = new int[] { (byte) -1 };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (-1), (int) (short) 10);
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
    public void test15014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15014");
        int[] intArray5 = new int[] { (short) 100, (-1), (byte) 10, (byte) 0, 'a' };
        int[] intArray11 = new int[] { (short) 100, (-1), (byte) 10, (byte) 0, 'a' };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, 10, 0, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, -1, 10, 0, 97]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test15015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15015");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray3 = new int[] { (short) 10 };
        int[] intArray5 = new int[] { (short) 10 };
        int[] intArray7 = new int[] { (short) 10 };
        int[][] intArray8 = new int[][] { intArray1, intArray3, intArray5, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, (int) (byte) 1, (-1));
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
    public void test15016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15016");
        int[] intArray2 = new int[] { (short) 0, (byte) 100 };
        int[] intArray5 = new int[] { (short) 0, (byte) 100 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test15017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15017");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[][] intArray3 = new int[][] { intArray0, intArray1, intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray3, (int) '4', 1);
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
    public void test15018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15018");
        int[] intArray5 = new int[] { (byte) 10, (byte) 1, (byte) 10, 10, (short) -1 };
        int[] intArray11 = new int[] { (byte) 10, (byte) 1, (byte) 10, 10, (short) -1 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1, 10, 10, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 1, 10, 10, -1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test15019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15019");
        int[] intArray3 = new int[] { (short) -1, 1, ' ' };
        int[][] intArray4 = new int[][] { intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 1, 32]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test15020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15020");
        int[] intArray4 = new int[] { (short) 0, (byte) 10, '4', (byte) 100 };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 52, 100]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test15021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15021");
        int[] intArray4 = new int[] { (short) 1, (short) 10, 10, (byte) 1 };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test15022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15022");
        int[] intArray5 = new int[] { 0, (-1), (short) 100, (byte) 1, 100 };
        int[] intArray11 = new int[] { 0, (-1), (short) 100, (byte) 1, 100 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 100, 1, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, -1, 100, 1, 100]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test15023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15023");
        int[] intArray1 = new int[] { 'a' };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[97]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test15024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15024");
        int[] intArray6 = new int[] { (short) -1, (short) 100, (byte) 0, (byte) 1, 'a', '4' };
        int[] intArray13 = new int[] { (short) -1, (short) 100, (byte) 0, (byte) 1, 'a', '4' };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray14, (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 0, 1, 97, 52]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 100, 0, 1, 97, 52]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test15025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15025");
        int[] intArray6 = new int[] { (short) 100, 100, 100, 100, (byte) 1, 0 };
        int[] intArray13 = new int[] { (short) 100, 100, 100, 100, (byte) 1, 0 };
        int[] intArray20 = new int[] { (short) 100, 100, 100, 100, (byte) 1, 0 };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray21, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100, 100, 100, 1, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100, 100, 100, 1, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100, 100, 100, 1, 0]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test15026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15026");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray3 = new int[] { (short) 1 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test15027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15027");
        int[] intArray6 = new int[] { 10, (byte) 1, (short) 10, (-1), '#', '4' };
        int[] intArray13 = new int[] { 10, (byte) 1, (short) 10, (-1), '#', '4' };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray14, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 1, 10, -1, 35, 52]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 1, 10, -1, 35, 52]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test15028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15028");
        int[] intArray4 = new int[] { (byte) -1, 1, ' ', 10 };
        int[] intArray9 = new int[] { (byte) -1, 1, ' ', 10 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 1, 32, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 1, 32, 10]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test15029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15029");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray3 = new int[] { (byte) 1 };
        int[] intArray5 = new int[] { (byte) 1 };
        int[][] intArray6 = new int[][] { intArray1, intArray3, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) '#', (int) '#');
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
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test15030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15030");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15031");
        int[] intArray4 = new int[] { 0, '#', (short) 0, (byte) 1 };
        int[] intArray9 = new int[] { 0, '#', (short) 0, (byte) 1 };
        int[] intArray14 = new int[] { 0, '#', (short) 0, (byte) 1 };
        int[] intArray19 = new int[] { 0, '#', (short) 0, (byte) 1 };
        int[] intArray24 = new int[] { 0, '#', (short) 0, (byte) 1 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray25, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 35, 0, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 35, 0, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 35, 0, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 35, 0, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 35, 0, 1]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test15032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15032");
        int[] intArray5 = new int[] { (byte) -1, 'a', ' ', 10, (byte) -1 };
        int[] intArray11 = new int[] { (byte) -1, 'a', ' ', 10, (byte) -1 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 32, 10, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32, 10, -1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test15033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15033");
        int[] intArray6 = new int[] { ' ', '#', (byte) 1, (short) 100, '#', 10 };
        int[] intArray13 = new int[] { ' ', '#', (byte) 1, (short) 100, '#', 10 };
        int[] intArray20 = new int[] { ' ', '#', (byte) 1, (short) 100, '#', 10 };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray21, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 35, 1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 35, 1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 35, 1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test15034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15034");
        int[] intArray2 = new int[] { (byte) 10, (byte) 100 };
        int[] intArray5 = new int[] { (byte) 10, (byte) 100 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, 0, (int) '#');
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
    public void test15035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15035");
        int[] intArray4 = new int[] { (byte) 1, 10, 100, (byte) 0 };
        int[] intArray9 = new int[] { (byte) 1, 10, 100, (byte) 0 };
        int[] intArray14 = new int[] { (byte) 1, 10, 100, (byte) 0 };
        int[] intArray19 = new int[] { (byte) 1, 10, 100, (byte) 0 };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, 100, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 10, 100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 10, 100, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 10, 100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test15036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15036");
        int[] intArray4 = new int[] { 100, 10, (byte) 1, (-1) };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray5, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 10, 1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test15037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15037");
        int[] intArray3 = new int[] { 100, (short) 10, (byte) -1 };
        int[] intArray7 = new int[] { 100, (short) 10, (byte) -1 };
        int[] intArray11 = new int[] { 100, (short) 10, (byte) -1 };
        int[] intArray15 = new int[] { 100, (short) 10, (byte) -1 };
        int[] intArray19 = new int[] { 100, (short) 10, (byte) -1 };
        int[] intArray23 = new int[] { 100, (short) 10, (byte) -1 };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 10, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 10, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 10, -1]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test15038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15038");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray3 = new int[] { (short) 10 };
        int[] intArray5 = new int[] { (short) 10 };
        int[] intArray7 = new int[] { (short) 10 };
        int[] intArray9 = new int[] { (short) 10 };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, (int) (short) 0, 100);
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
    public void test15039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15039");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = new int[] { (short) 100 };
        int[] intArray5 = new int[] { (short) 100 };
        int[] intArray7 = new int[] { (short) 100 };
        int[] intArray9 = new int[] { (short) 100 };
        int[] intArray11 = new int[] { (short) 100 };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (short) -1, 0);
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
    public void test15040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15040");
        int[] intArray4 = new int[] { (byte) 0, (-1), 'a', 100 };
        int[] intArray9 = new int[] { (byte) 0, (-1), 'a', 100 };
        int[] intArray14 = new int[] { (byte) 0, (-1), 'a', 100 };
        int[] intArray19 = new int[] { (byte) 0, (-1), 'a', 100 };
        int[] intArray24 = new int[] { (byte) 0, (-1), 'a', 100 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray25, (int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 97, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, -1, 97, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, -1, 97, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, -1, 97, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, -1, 97, 100]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test15041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15041");
        int[] intArray2 = new int[] { (-1), (-1) };
        int[] intArray5 = new int[] { (-1), (-1) };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) (short) 100, (int) 'a');
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
    public void test15042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15042");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray0, intArray1, intArray2, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) (byte) 1, (int) 'a');
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
    public void test15043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15043");
        int[] intArray4 = new int[] { '#', 0, (short) 1, ' ' };
        int[] intArray9 = new int[] { '#', 0, (short) 1, ' ' };
        int[] intArray14 = new int[] { '#', 0, (short) 1, ' ' };
        int[] intArray19 = new int[] { '#', 0, (short) 1, ' ' };
        int[] intArray24 = new int[] { '#', 0, (short) 1, ' ' };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray25, (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 0, 1, 32]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[35, 0, 1, 32]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35, 0, 1, 32]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35, 0, 1, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[35, 0, 1, 32]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test15044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15044");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray3 = new int[] { (byte) 1 };
        int[] intArray5 = new int[] { (byte) 1 };
        int[][] intArray6 = new int[][] { intArray1, intArray3, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) '4', 0);
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
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test15045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15045");
        int[] intArray4 = new int[] { 100, 0, '#', (byte) 100 };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray5, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 0, 35, 100]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test15046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15046");
        int[] intArray3 = new int[] { 10, (byte) 0, (short) 10 };
        int[] intArray7 = new int[] { 10, (byte) 0, (short) 10 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 0, 10]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test15047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15047");
        int[] intArray5 = new int[] { '4', ' ', 'a', '4', (short) 1 };
        int[] intArray11 = new int[] { '4', ' ', 'a', '4', (short) 1 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 32, 97, 52, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 32, 97, 52, 1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test15048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15048");
        int[] intArray2 = new int[] { 100, (-1) };
        int[] intArray5 = new int[] { 100, (-1) };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test15049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15049");
        int[] intArray4 = new int[] { 1, (byte) 10, (byte) 0, '#' };
        int[] intArray9 = new int[] { 1, (byte) 10, (byte) 0, '#' };
        int[] intArray14 = new int[] { 1, (byte) 10, (byte) 0, '#' };
        int[] intArray19 = new int[] { 1, (byte) 10, (byte) 0, '#' };
        int[] intArray24 = new int[] { 1, (byte) 10, (byte) 0, '#' };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray25, (int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, 0, 35]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 10, 0, 35]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 10, 0, 35]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 10, 0, 35]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 10, 0, 35]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test15050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15050");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray3 = new int[] { (byte) 0 };
        int[] intArray5 = new int[] { (byte) 0 };
        int[] intArray7 = new int[] { (byte) 0 };
        int[] intArray9 = new int[] { (byte) 0 };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, (int) (byte) 0, (int) (short) 100);
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
    public void test15051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15051");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, (byte) 100, 'a', (byte) 10, 0 };
        int[] intArray13 = new int[] { (short) -1, (byte) -1, (byte) 100, 'a', (byte) 10, 0 };
        int[] intArray20 = new int[] { (short) -1, (byte) -1, (byte) 100, 'a', (byte) 10, 0 };
        int[] intArray27 = new int[] { (short) -1, (byte) -1, (byte) 100, 'a', (byte) 10, 0 };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray28, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 100, 97, 10, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1, 100, 97, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1, 100, 97, 10, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, -1, 100, 97, 10, 0]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test15052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15052");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15053");
        int[] intArray5 = new int[] { (byte) -1, 0, (byte) 1, (short) 1, (byte) 10 };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0, 1, 1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test15054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15054");
        int[] intArray6 = new int[] { (short) 0, 'a', (short) 1, (short) 1, (byte) 0, 0 };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray7, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 97, 1, 1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test15055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15055");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray3 = new int[] { (byte) 10 };
        int[] intArray5 = new int[] { (byte) 10 };
        int[][] intArray6 = new int[][] { intArray1, intArray3, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) (byte) 0, (int) '#');
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
    public void test15056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15056");
        int[] intArray6 = new int[] { (byte) 1, '4', (byte) 0, ' ', 1, (short) 1 };
        int[] intArray13 = new int[] { (byte) 1, '4', (byte) 0, ' ', 1, (short) 1 };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray14, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 52, 0, 32, 1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 52, 0, 32, 1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test15057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15057");
        int[] intArray4 = new int[] { (byte) 100, (short) 1, ' ', '#' };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray5, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 32, 35]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test15058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15058");
        int[] intArray3 = new int[] { 10, (byte) 10, (byte) 1 };
        int[][] intArray4 = new int[][] { intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, 1]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test15059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15059");
        int[] intArray5 = new int[] { (byte) 0, (byte) 100, (short) 0, (byte) 10, (short) 1 };
        int[] intArray11 = new int[] { (byte) 0, (byte) 100, (short) 0, (byte) 10, (short) 1 };
        int[] intArray17 = new int[] { (byte) 0, (byte) 100, (short) 0, (byte) 10, (short) 1 };
        int[] intArray23 = new int[] { (byte) 0, (byte) 100, (short) 0, (byte) 10, (short) 1 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 0, 10, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 100, 0, 10, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 100, 0, 10, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 100, 0, 10, 1]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test15060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15060");
        int[] intArray6 = new int[] { (byte) 1, 1, (byte) 0, (short) 10, '4', 1 };
        int[] intArray13 = new int[] { (byte) 1, 1, (byte) 0, (short) 10, '4', 1 };
        int[] intArray20 = new int[] { (byte) 1, 1, (byte) 0, (short) 10, '4', 1 };
        int[] intArray27 = new int[] { (byte) 1, 1, (byte) 0, (short) 10, '4', 1 };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray28, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1, 0, 10, 52, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1, 0, 10, 52, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 1, 0, 10, 52, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1, 0, 10, 52, 1]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test15061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15061");
        int[] intArray6 = new int[] { (byte) 0, (short) 10, 1, (short) 10, (short) 10, ' ' };
        int[] intArray13 = new int[] { (byte) 0, (short) 10, 1, (short) 10, (short) 10, ' ' };
        int[] intArray20 = new int[] { (byte) 0, (short) 10, 1, (short) 10, (short) 10, ' ' };
        int[] intArray27 = new int[] { (byte) 0, (short) 10, 1, (short) 10, (short) 10, ' ' };
        int[] intArray34 = new int[] { (byte) 0, (short) 10, 1, (short) 10, (short) 10, ' ' };
        int[] intArray41 = new int[] { (byte) 0, (short) 10, 1, (short) 10, (short) 10, ' ' };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray42, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 10, 1, 10, 10, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 10, 1, 10, 10, 32]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 10, 1, 10, 10, 32]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 10, 1, 10, 10, 32]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[0, 10, 1, 10, 10, 32]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[0, 10, 1, 10, 10, 32]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test15062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15062");
        int[] intArray5 = new int[] { (short) 1, 0, ' ', 0, (short) 1 };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0, 32, 0, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test15063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15063");
        int[] intArray4 = new int[] { (short) -1, '#', 'a', (short) 100 };
        int[] intArray9 = new int[] { (short) -1, '#', 'a', (short) 100 };
        int[] intArray14 = new int[] { (short) -1, '#', 'a', (short) 100 };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 35, 97, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 35, 97, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 35, 97, 100]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test15064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15064");
        int[] intArray3 = new int[] { (byte) 10, (byte) 0, 0 };
        int[] intArray7 = new int[] { (byte) 10, (byte) 0, 0 };
        int[] intArray11 = new int[] { (byte) 10, (byte) 0, 0 };
        int[] intArray15 = new int[] { (byte) 10, (byte) 0, 0 };
        int[] intArray19 = new int[] { (byte) 10, (byte) 0, 0 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test15065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15065");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, (int) (short) 100, (int) (short) 10);
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
    public void test15066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15066");
        int[] intArray1 = new int[] { (-1) };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test15067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15067");
        int[] intArray3 = new int[] { (short) 0, (byte) 10, (-1) };
        int[] intArray7 = new int[] { (short) 0, (byte) 10, (-1) };
        int[] intArray11 = new int[] { (short) 0, (byte) 10, (-1) };
        int[] intArray15 = new int[] { (short) 0, (byte) 10, (-1) };
        int[] intArray19 = new int[] { (short) 0, (byte) 10, (-1) };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test15068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15068");
        int[] intArray6 = new int[] { (-1), (short) 1, ' ', (short) -1, 1, (-1) };
        int[] intArray13 = new int[] { (-1), (short) 1, ' ', (short) -1, 1, (-1) };
        int[] intArray20 = new int[] { (-1), (short) 1, ' ', (short) -1, 1, (-1) };
        int[] intArray27 = new int[] { (-1), (short) 1, ' ', (short) -1, 1, (-1) };
        int[] intArray34 = new int[] { (-1), (short) 1, ' ', (short) -1, 1, (-1) };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray35, (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 1, 32, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 1, 32, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, 1, 32, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-1, 1, 32, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test15069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15069");
        int[] intArray4 = new int[] { 0, 10, 10, (byte) 100 };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 10, 100]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test15070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15070");
        int[] intArray3 = new int[] { '#', 10, (short) 1 };
        int[] intArray7 = new int[] { '#', 10, (short) 1 };
        int[] intArray11 = new int[] { '#', 10, (short) 1 };
        int[] intArray15 = new int[] { '#', 10, (short) 1 };
        int[] intArray19 = new int[] { '#', 10, (short) 1 };
        int[] intArray23 = new int[] { '#', 10, (short) 1 };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[35, 10, 1]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test15071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15071");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray1, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test15072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15072");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15073");
        int[] intArray4 = new int[] { (short) 10, 1, (byte) 100, (short) 10 };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 1, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test15074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15074");
        int[] intArray2 = new int[] { 0, 'a' };
        int[] intArray5 = new int[] { 0, 'a' };
        int[] intArray8 = new int[] { 0, 'a' };
        int[] intArray11 = new int[] { 0, 'a' };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test15075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15075");
        int[] intArray3 = new int[] { (short) 10, (short) -1, (short) -1 };
        int[][] intArray4 = new int[][] { intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, -1, -1]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test15076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15076");
        int[] intArray4 = new int[] { 100, 100, ' ', (short) 1 };
        int[] intArray9 = new int[] { 100, 100, ' ', (short) 1 };
        int[] intArray14 = new int[] { 100, 100, ' ', (short) 1 };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, (int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100, 32, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100, 32, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100, 32, 1]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test15077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15077");
        int[] intArray3 = new int[] { 0, (short) 1, 10 };
        int[][] intArray4 = new int[][] { intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 1, 10]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test15078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15078");
        int[] intArray4 = new int[] { (short) 10, (byte) 1, '#', (byte) 1 };
        int[] intArray9 = new int[] { (short) 10, (byte) 1, '#', (byte) 1 };
        int[] intArray14 = new int[] { (short) 10, (byte) 1, '#', (byte) 1 };
        int[] intArray19 = new int[] { (short) 10, (byte) 1, '#', (byte) 1 };
        int[] intArray24 = new int[] { (short) 10, (byte) 1, '#', (byte) 1 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray25, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 1, 35, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 1, 35, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 1, 35, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 1, 35, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[10, 1, 35, 1]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test15079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15079");
        int[] intArray6 = new int[] { '4', 'a', '4', (short) -1, 0, (short) 1 };
        int[] intArray13 = new int[] { '4', 'a', '4', (short) -1, 0, (short) 1 };
        int[] intArray20 = new int[] { '4', 'a', '4', (short) -1, 0, (short) 1 };
        int[] intArray27 = new int[] { '4', 'a', '4', (short) -1, 0, (short) 1 };
        int[] intArray34 = new int[] { '4', 'a', '4', (short) -1, 0, (short) 1 };
        int[] intArray41 = new int[] { '4', 'a', '4', (short) -1, 0, (short) 1 };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray42, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 97, 52, -1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[52, 97, 52, -1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[52, 97, 52, -1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[52, 97, 52, -1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[52, 97, 52, -1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[52, 97, 52, -1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test15080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15080");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[] intArray5 = new int[] { (short) 0 };
        int[] intArray7 = new int[] { (short) 0 };
        int[] intArray9 = new int[] { (short) 0 };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, 1, (int) 'a');
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
    public void test15081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15081");
        int[] intArray3 = new int[] { '#', 1, (byte) -1 };
        int[] intArray7 = new int[] { '#', 1, (byte) -1 };
        int[] intArray11 = new int[] { '#', 1, (byte) -1 };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35, 1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[35, 1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, 1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test15082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15082");
        int[] intArray1 = new int[] { '4' };
        int[] intArray3 = new int[] { '4' };
        int[] intArray5 = new int[] { '4' };
        int[] intArray7 = new int[] { '4' };
        int[] intArray9 = new int[] { '4' };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, (int) 'a', (int) (short) -1);
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
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test15083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15083");
        int[] intArray4 = new int[] { (byte) 0, (short) 10, 10, (short) -1 };
        int[] intArray9 = new int[] { (byte) 0, (short) 10, 10, (short) -1 };
        int[] intArray14 = new int[] { (byte) 0, (short) 10, 10, (short) -1 };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 10, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 10, 10, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 10, 10, -1]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test15084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15084");
        int[] intArray6 = new int[] { 1, '#', (byte) 1, (byte) -1, (short) 100, 0 };
        int[] intArray13 = new int[] { 1, '#', (byte) 1, (byte) -1, (short) 100, 0 };
        int[] intArray20 = new int[] { 1, '#', (byte) 1, (byte) -1, (short) 100, 0 };
        int[] intArray27 = new int[] { 1, '#', (byte) 1, (byte) -1, (short) 100, 0 };
        int[] intArray34 = new int[] { 1, '#', (byte) 1, (byte) -1, (short) 100, 0 };
        int[] intArray41 = new int[] { 1, '#', (byte) 1, (byte) -1, (short) 100, 0 };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray42, (int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 35, 1, -1, 100, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 1, -1, 100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 35, 1, -1, 100, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 35, 1, -1, 100, 0]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 35, 1, -1, 100, 0]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[1, 35, 1, -1, 100, 0]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test15085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15085");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray3 = new int[] { (short) 10 };
        int[] intArray5 = new int[] { (short) 10 };
        int[] intArray7 = new int[] { (short) 10 };
        int[][] intArray8 = new int[][] { intArray1, intArray3, intArray5, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, 0, (int) '#');
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
    public void test15086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15086");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, (int) '4', (int) (short) 0);
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
    public void test15087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15087");
        int[] intArray5 = new int[] { (byte) 0, '#', ' ', (byte) 1, (byte) 1 };
        int[] intArray11 = new int[] { (byte) 0, '#', ' ', (byte) 1, (byte) 1 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 35, 32, 1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 35, 32, 1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test15088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15088");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray3 = new int[] { (short) 10 };
        int[] intArray5 = new int[] { (short) 10 };
        int[] intArray7 = new int[] { (short) 10 };
        int[] intArray9 = new int[] { (short) 10 };
        int[] intArray11 = new int[] { (short) 10 };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) ' ', 100);
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
    public void test15089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15089");
        int[] intArray3 = new int[] { (byte) 10, (short) 1, (short) 0 };
        int[] intArray7 = new int[] { (byte) 10, (short) 1, (short) 0 };
        int[] intArray11 = new int[] { (byte) 10, (short) 1, (short) 0 };
        int[] intArray15 = new int[] { (byte) 10, (short) 1, (short) 0 };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray16, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test15090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15090");
        int[] intArray6 = new int[] { (byte) 100, (byte) -1, (short) 100, ' ', '4', (short) 10 };
        int[] intArray13 = new int[] { (byte) 100, (byte) -1, (short) 100, ' ', '4', (short) 10 };
        int[] intArray20 = new int[] { (byte) 100, (byte) -1, (short) 100, ' ', '4', (short) 10 };
        int[] intArray27 = new int[] { (byte) 100, (byte) -1, (short) 100, ' ', '4', (short) 10 };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray28, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 100, 32, 52, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, -1, 100, 32, 52, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, -1, 100, 32, 52, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, -1, 100, 32, 52, 10]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test15091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15091");
        int[] intArray3 = new int[] { 0, (short) 10, (byte) -1 };
        int[] intArray7 = new int[] { 0, (short) 10, (byte) -1 };
        int[] intArray11 = new int[] { 0, (short) 10, (byte) -1 };
        int[] intArray15 = new int[] { 0, (short) 10, (byte) -1 };
        int[] intArray19 = new int[] { 0, (short) 10, (byte) -1 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test15092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15092");
        int[] intArray3 = new int[] { (byte) 1, (byte) 100, (short) 1 };
        int[] intArray7 = new int[] { (byte) 1, (byte) 100, (short) 1 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test15093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15093");
        int[] intArray4 = new int[] { '4', 1, (byte) 10, (short) -1 };
        int[] intArray9 = new int[] { '4', 1, (byte) 10, (short) -1 };
        int[] intArray14 = new int[] { '4', 1, (byte) 10, (short) -1 };
        int[] intArray19 = new int[] { '4', 1, (byte) 10, (short) -1 };
        int[] intArray24 = new int[] { '4', 1, (byte) 10, (short) -1 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray25, (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[52, 1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[52, 1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[52, 1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[52, 1, 10, -1]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test15094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15094");
        int[] intArray5 = new int[] { 1, 1, 0, 0, (byte) 1 };
        int[] intArray11 = new int[] { 1, 1, 0, 0, (byte) 1 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1, 0, 0, 1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test15095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15095");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray3 = new int[] { (byte) 0 };
        int[] intArray5 = new int[] { (byte) 0 };
        int[] intArray7 = new int[] { (byte) 0 };
        int[][] intArray8 = new int[][] { intArray1, intArray3, intArray5, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, (int) (short) 10, (int) ' ');
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
    public void test15096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15096");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15097");
        int[] intArray2 = new int[] { 10, 10 };
        int[] intArray5 = new int[] { 10, 10 };
        int[] intArray8 = new int[] { 10, 10 };
        int[] intArray11 = new int[] { 10, 10 };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test15098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15098");
        int[] intArray6 = new int[] { 10, '4', 1, 10, (short) 100, 1 };
        int[] intArray13 = new int[] { 10, '4', 1, 10, (short) 100, 1 };
        int[] intArray20 = new int[] { 10, '4', 1, 10, (short) 100, 1 };
        int[] intArray27 = new int[] { 10, '4', 1, 10, (short) 100, 1 };
        int[] intArray34 = new int[] { 10, '4', 1, 10, (short) 100, 1 };
        int[] intArray41 = new int[] { 10, '4', 1, 10, (short) 100, 1 };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray42, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 52, 1, 10, 100, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 52, 1, 10, 100, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10, 52, 1, 10, 100, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 52, 1, 10, 100, 1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[10, 52, 1, 10, 100, 1]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[10, 52, 1, 10, 100, 1]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test15099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15099");
        int[] intArray6 = new int[] { 1, '4', (short) 100, (byte) 1, (short) 10, (byte) 10 };
        int[] intArray13 = new int[] { 1, '4', (short) 100, (byte) 1, (short) 10, (byte) 10 };
        int[] intArray20 = new int[] { 1, '4', (short) 100, (byte) 1, (short) 10, (byte) 10 };
        int[] intArray27 = new int[] { 1, '4', (short) 100, (byte) 1, (short) 10, (byte) 10 };
        int[] intArray34 = new int[] { 1, '4', (short) 100, (byte) 1, (short) 10, (byte) 10 };
        int[] intArray41 = new int[] { 1, '4', (short) 100, (byte) 1, (short) 10, (byte) 10 };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray42, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 52, 100, 1, 10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 52, 100, 1, 10, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 52, 100, 1, 10, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 52, 100, 1, 10, 10]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 52, 100, 1, 10, 10]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[1, 52, 100, 1, 10, 10]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test15100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15100");
        int[] intArray2 = new int[] { (short) 0, (short) 10 };
        int[] intArray5 = new int[] { (short) 0, (short) 10 };
        int[] intArray8 = new int[] { (short) 0, (short) 10 };
        int[] intArray11 = new int[] { (short) 0, (short) 10 };
        int[] intArray14 = new int[] { (short) 0, (short) 10 };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, (int) '#', (int) (short) -1);
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
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 10]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test15101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15101");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = new int[] { (short) 100 };
        int[] intArray5 = new int[] { (short) 100 };
        int[][] intArray6 = new int[][] { intArray1, intArray3, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) (byte) 1, (int) 'a');
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
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test15102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15102");
        int[] intArray6 = new int[] { (byte) 1, 0, '4', '4', (-1), 100 };
        int[] intArray13 = new int[] { (byte) 1, 0, '4', '4', (-1), 100 };
        int[] intArray20 = new int[] { (byte) 1, 0, '4', '4', (-1), 100 };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray21, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0, 52, 52, -1, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 0, 52, 52, -1, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 0, 52, 52, -1, 100]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test15103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15103");
        int[] intArray4 = new int[] { 100, 100, (short) -1, (short) 1 };
        int[] intArray9 = new int[] { 100, 100, (short) -1, (short) 1 };
        int[] intArray14 = new int[] { 100, 100, (short) -1, (short) 1 };
        int[] intArray19 = new int[] { 100, 100, (short) -1, (short) 1 };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100, -1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100, -1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100, -1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100, -1, 1]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test15104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15104");
        int[] intArray2 = new int[] { 10, (-1) };
        int[] intArray5 = new int[] { 10, (-1) };
        int[] intArray8 = new int[] { 10, (-1) };
        int[] intArray11 = new int[] { 10, (-1) };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (short) 0, (int) (byte) -1);
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
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test15105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15105");
        int[] intArray5 = new int[] { 1, (byte) -1, '#', 'a', (byte) 0 };
        int[] intArray11 = new int[] { 1, (byte) -1, '#', 'a', (byte) 0 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, -1, 35, 97, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, -1, 35, 97, 0]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test15106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15106");
        int[] intArray5 = new int[] { (byte) 1, ' ', 1, (byte) 0, (short) 1 };
        int[] intArray11 = new int[] { (byte) 1, ' ', 1, (byte) 0, (short) 1 };
        int[] intArray17 = new int[] { (byte) 1, ' ', 1, (byte) 0, (short) 1 };
        int[] intArray23 = new int[] { (byte) 1, ' ', 1, (byte) 0, (short) 1 };
        int[] intArray29 = new int[] { (byte) 1, ' ', 1, (byte) 0, (short) 1 };
        int[] intArray35 = new int[] { (byte) 1, ' ', 1, (byte) 0, (short) 1 };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray36, (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 32, 1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 32, 1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 32, 1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 32, 1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 32, 1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 32, 1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test15107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15107");
        int[] intArray1 = new int[] { 0 };
        int[] intArray3 = new int[] { 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (int) (short) 0, (int) (byte) -1);
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
    public void test15108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15108");
        int[] intArray6 = new int[] { (short) 0, 'a', (byte) -1, (short) 100, (byte) 100, (short) -1 };
        int[][] intArray7 = new int[][] { intArray6 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray7, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 97, -1, 100, 100, -1]");
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test15109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15109");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray3 = new int[] { (short) -1 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (int) (short) -1, (-1));
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
    public void test15110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15110");
        int[] intArray6 = new int[] { 100, (byte) 10, (byte) -1, (short) 100, (short) 1, (byte) 100 };
        int[] intArray13 = new int[] { 100, (byte) 10, (byte) -1, (short) 100, (short) 1, (byte) 100 };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray14, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 10, -1, 100, 1, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 10, -1, 100, 1, 100]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test15111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15111");
        int[] intArray6 = new int[] { (short) 100, (byte) 0, 100, 0, 0, (short) -1 };
        int[] intArray13 = new int[] { (short) 100, (byte) 0, 100, 0, 0, (short) -1 };
        int[] intArray20 = new int[] { (short) 100, (byte) 0, 100, 0, 0, (short) -1 };
        int[] intArray27 = new int[] { (short) 100, (byte) 0, 100, 0, 0, (short) -1 };
        int[] intArray34 = new int[] { (short) 100, (byte) 0, 100, 0, 0, (short) -1 };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray35, 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 0, 100, 0, 0, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 0, 100, 0, 0, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0, 100, 0, 0, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 0, 100, 0, 0, -1]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 0, 100, 0, 0, -1]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test15112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15112");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray3 = new int[] { (short) 1 };
        int[] intArray5 = new int[] { (short) 1 };
        int[] intArray7 = new int[] { (short) 1 };
        int[][] intArray8 = new int[][] { intArray1, intArray3, intArray5, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray8, 1, (int) (byte) 1);
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
    public void test15113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15113");
        int[] intArray5 = new int[] { 100, '4', (byte) 10, (short) 10, (byte) 0 };
        int[] intArray11 = new int[] { 100, '4', (byte) 10, (short) 10, (byte) 0 };
        int[] intArray17 = new int[] { 100, '4', (byte) 10, (short) 10, (byte) 0 };
        int[] intArray23 = new int[] { 100, '4', (byte) 10, (short) 10, (byte) 0 };
        int[] intArray29 = new int[] { 100, '4', (byte) 10, (short) 10, (byte) 0 };
        int[] intArray35 = new int[] { 100, '4', (byte) 10, (short) 10, (byte) 0 };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray36, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 52, 10, 10, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 52, 10, 10, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 52, 10, 10, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 52, 10, 10, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 52, 10, 10, 0]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[100, 52, 10, 10, 0]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test15114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15114");
        int[] intArray4 = new int[] { (-1), 1, '#', (byte) 100 };
        int[] intArray9 = new int[] { (-1), 1, '#', (byte) 100 };
        int[] intArray14 = new int[] { (-1), 1, '#', (byte) 100 };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 1, 35, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 1, 35, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 1, 35, 100]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test15115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15115");
        int[] intArray2 = new int[] { (byte) 10, (short) 0 };
        int[] intArray5 = new int[] { (byte) 10, (short) 0 };
        int[] intArray8 = new int[] { (byte) 10, (short) 0 };
        int[] intArray11 = new int[] { (byte) 10, (short) 0 };
        int[] intArray14 = new int[] { (byte) 10, (short) 0 };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, 0, (-1));
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
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test15116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15116");
        int[] intArray3 = new int[] { 10, '#', (short) 0 };
        int[] intArray7 = new int[] { 10, '#', (short) 0 };
        int[] intArray11 = new int[] { 10, '#', (short) 0 };
        int[] intArray15 = new int[] { 10, '#', (short) 0 };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray16, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test15117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15117");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray5 = new int[] { (short) -1, 1 };
        int[] intArray8 = new int[] { (short) -1, 1 };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray9, 1, 10);
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
    public void test15118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15118");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = new int[] { (byte) -1 };
        int[] intArray5 = new int[] { (byte) -1 };
        int[] intArray7 = new int[] { (byte) -1 };
        int[] intArray9 = new int[] { (byte) -1 };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, 0, (int) '#');
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
    public void test15119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15119");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray1, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test15120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15120");
        int[] intArray4 = new int[] { (-1), (-1), (short) -1, (byte) -1 };
        int[] intArray9 = new int[] { (-1), (-1), (short) -1, (byte) -1 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test15121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15121");
        int[] intArray2 = new int[] { '#', '#' };
        int[] intArray5 = new int[] { '#', '#' };
        int[] intArray8 = new int[] { '#', '#' };
        int[] intArray11 = new int[] { '#', '#' };
        int[] intArray14 = new int[] { '#', '#' };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 35]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, 35]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, 35]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35, 35]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test15122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15122");
        int[] intArray5 = new int[] { (byte) 100, (byte) 1, 100, (byte) 100, (short) -1 };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 100, 100, -1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test15123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15123");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray0, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test15124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15124");
        int[] intArray2 = new int[] { '#', (short) -1 };
        int[][] intArray3 = new int[][] { intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray3, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, -1]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test15125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15125");
        int[] intArray2 = new int[] { 'a', ' ' };
        int[] intArray5 = new int[] { 'a', ' ' };
        int[] intArray8 = new int[] { 'a', ' ' };
        int[] intArray11 = new int[] { 'a', ' ' };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[97, 32]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 32]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test15126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15126");
        int[] intArray3 = new int[] { 1, 0, (short) 1 };
        int[] intArray7 = new int[] { 1, 0, (short) 1 };
        int[] intArray11 = new int[] { 1, 0, (short) 1 };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 0, 1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test15127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15127");
        int[] intArray2 = new int[] { '#', 0 };
        int[] intArray5 = new int[] { '#', 0 };
        int[] intArray8 = new int[] { '#', 0 };
        int[] intArray11 = new int[] { '#', 0 };
        int[] intArray14 = new int[] { '#', 0 };
        int[] intArray17 = new int[] { '#', 0 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray18, (int) '#', (int) (short) -1);
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
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test15128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15128");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray6, 10, 100);
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
    public void test15129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15129");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray3 = new int[] { (byte) 1 };
        int[] intArray5 = new int[] { (byte) 1 };
        int[] intArray7 = new int[] { (byte) 1 };
        int[] intArray9 = new int[] { (byte) 1 };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, (int) (byte) 1, (int) (byte) 1);
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
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test15130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15130");
        int[] intArray3 = new int[] { (-1), (short) 100, (-1) };
        int[] intArray7 = new int[] { (-1), (short) 100, (-1) };
        int[] intArray11 = new int[] { (-1), (short) 100, (-1) };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test15131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15131");
        int[] intArray4 = new int[] { (byte) 10, (byte) -1, (short) 1, (short) 1 };
        int[] intArray9 = new int[] { (byte) 10, (byte) -1, (short) 1, (short) 1 };
        int[] intArray14 = new int[] { (byte) 10, (byte) -1, (short) 1, (short) 1 };
        int[] intArray19 = new int[] { (byte) 10, (byte) -1, (short) 1, (short) 1 };
        int[][] intArray20 = new int[][] { intArray4, intArray9, intArray14, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray20, (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, -1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, -1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, -1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, -1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test15132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15132");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = new int[] { (short) 100 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (int) (byte) -1, 100);
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
    public void test15133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15133");
        int[] intArray6 = new int[] { '4', (byte) 0, (short) 100, (short) 10, '#', 'a' };
        int[] intArray13 = new int[] { '4', (byte) 0, (short) 100, (short) 10, '#', 'a' };
        int[] intArray20 = new int[] { '4', (byte) 0, (short) 100, (short) 10, '#', 'a' };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray21, (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 0, 100, 10, 35, 97]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[52, 0, 100, 10, 35, 97]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[52, 0, 100, 10, 35, 97]");
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test15134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15134");
        int[] intArray6 = new int[] { (short) 0, 100, (byte) 10, 100, (short) 0, (byte) 100 };
        int[] intArray13 = new int[] { (short) 0, 100, (byte) 10, 100, (short) 0, (byte) 100 };
        int[] intArray20 = new int[] { (short) 0, 100, (byte) 10, 100, (short) 0, (byte) 100 };
        int[] intArray27 = new int[] { (short) 0, 100, (byte) 10, 100, (short) 0, (byte) 100 };
        int[] intArray34 = new int[] { (short) 0, 100, (byte) 10, 100, (short) 0, (byte) 100 };
        int[][] intArray35 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray35, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, 10, 100, 0, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 100, 10, 100, 0, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 100, 10, 100, 0, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 100, 10, 100, 0, 100]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[0, 100, 10, 100, 0, 100]");
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test15135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15135");
        int[] intArray5 = new int[] { (-1), 1, (byte) -1, (short) 1, (byte) 0 };
        int[] intArray11 = new int[] { (-1), 1, (byte) -1, (short) 1, (byte) 0 };
        int[] intArray17 = new int[] { (-1), 1, (byte) -1, (short) 1, (byte) 0 };
        int[] intArray23 = new int[] { (-1), 1, (byte) -1, (short) 1, (byte) 0 };
        int[] intArray29 = new int[] { (-1), 1, (byte) -1, (short) 1, (byte) 0 };
        int[] intArray35 = new int[] { (-1), 1, (byte) -1, (short) 1, (byte) 0 };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray36, (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, -1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 1, -1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 1, -1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 1, -1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 1, -1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1, 1, -1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test15136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15136");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, (int) '#', (int) (byte) 100);
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
    public void test15137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15137");
        int[] intArray2 = new int[] { (short) 1, (short) 0 };
        int[] intArray5 = new int[] { (short) 1, (short) 0 };
        int[] intArray8 = new int[] { (short) 1, (short) 0 };
        int[] intArray11 = new int[] { (short) 1, (short) 0 };
        int[] intArray14 = new int[] { (short) 1, (short) 0 };
        int[] intArray17 = new int[] { (short) 1, (short) 0 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray18, (int) (short) -1, (int) (short) 1);
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
    public void test15138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15138");
        int[] intArray5 = new int[] { 0, 1, (byte) 1, 'a', (short) 100 };
        int[] intArray11 = new int[] { 0, 1, (byte) 1, 'a', (short) 100 };
        int[] intArray17 = new int[] { 0, 1, (byte) 1, 'a', (short) 100 };
        int[] intArray23 = new int[] { 0, 1, (byte) 1, 'a', (short) 100 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1, 1, 97, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1, 1, 97, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 1, 1, 97, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 1, 1, 97, 100]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test15139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15139");
        int[] intArray6 = new int[] { '#', 1, (short) 100, 'a', (byte) 10, 0 };
        int[] intArray13 = new int[] { '#', 1, (short) 100, 'a', (byte) 10, 0 };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray14, (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 1, 100, 97, 10, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[35, 1, 100, 97, 10, 0]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test15140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15140");
        int[] intArray2 = new int[] { (byte) 0, 10 };
        int[] intArray5 = new int[] { (byte) 0, 10 };
        int[] intArray8 = new int[] { (byte) 0, 10 };
        int[] intArray11 = new int[] { (byte) 0, 10 };
        int[] intArray14 = new int[] { (byte) 0, 10 };
        int[] intArray17 = new int[] { (byte) 0, 10 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray18, (int) (byte) 1, 1);
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
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 10]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test15141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15141");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[] intArray5 = new int[] { (short) 0 };
        int[][] intArray6 = new int[][] { intArray1, intArray3, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) (byte) 1, (int) (byte) 0);
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
    public void test15142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15142");
        int[] intArray3 = new int[] { (short) -1, (short) 1, (byte) 100 };
        int[] intArray7 = new int[] { (short) -1, (short) 1, (byte) 100 };
        int[] intArray11 = new int[] { (short) -1, (short) 1, (byte) 100 };
        int[] intArray15 = new int[] { (short) -1, (short) 1, (byte) 100 };
        int[] intArray19 = new int[] { (short) -1, (short) 1, (byte) 100 };
        int[] intArray23 = new int[] { (short) -1, (short) 1, (byte) 100 };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, (int) (byte) 10, (int) '4');
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
    public void test15143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15143");
        int[] intArray3 = new int[] { 0, 'a', 'a' };
        int[] intArray7 = new int[] { 0, 'a', 'a' };
        int[] intArray11 = new int[] { 0, 'a', 'a' };
        int[] intArray15 = new int[] { 0, 'a', 'a' };
        int[][] intArray16 = new int[][] { intArray3, intArray7, intArray11, intArray15 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray16, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 97, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 97, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 97, 97]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 97, 97]");
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test15144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15144");
        int[] intArray4 = new int[] { (byte) 0, '4', (short) 100, '#' };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 52, 100, 35]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test15145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15145");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[][] intArray3 = new int[][] { intArray0, intArray1, intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray3, (int) ' ', (int) (short) 10);
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
    public void test15146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15146");
        int[] intArray3 = new int[] { (short) 1, 100, (short) 1 };
        int[] intArray7 = new int[] { (short) 1, 100, (short) 1 };
        int[] intArray11 = new int[] { (short) 1, 100, (short) 1 };
        int[] intArray15 = new int[] { (short) 1, 100, (short) 1 };
        int[] intArray19 = new int[] { (short) 1, 100, (short) 1 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray20, (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test15147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15147");
        int[] intArray2 = new int[] { 10, (-1) };
        int[] intArray5 = new int[] { 10, (-1) };
        int[] intArray8 = new int[] { 10, (-1) };
        int[] intArray11 = new int[] { 10, (-1) };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) (byte) 0, (int) (byte) 1);
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
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test15148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15148");
        int[] intArray4 = new int[] { '#', ' ', '4', (byte) 100 };
        int[] intArray9 = new int[] { '#', ' ', '4', (byte) 100 };
        int[] intArray14 = new int[] { '#', ' ', '4', (byte) 100 };
        int[][] intArray15 = new int[][] { intArray4, intArray9, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray15, (int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 32, 52, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[35, 32, 52, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35, 32, 52, 100]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test15149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15149");
        int[] intArray1 = new int[] { (short) 0 };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray2, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test15150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15150");
        int[] intArray4 = new int[] { (byte) 10, (short) -1, 'a', (short) 100 };
        int[][] intArray5 = new int[][] { intArray4 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray5, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, -1, 97, 100]");
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test15151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15151");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray0, intArray1, intArray2, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray4, (-1), 1);
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
    public void test15152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15152");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray0, intArray1, intArray2, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray4, (int) (byte) 0, (int) (byte) 10);
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
    public void test15153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15153");
        int[] intArray1 = new int[] { 10 };
        int[] intArray3 = new int[] { 10 };
        int[] intArray5 = new int[] { 10 };
        int[] intArray7 = new int[] { 10 };
        int[] intArray9 = new int[] { 10 };
        int[] intArray11 = new int[] { 10 };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (int) '4', 10);
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
    public void test15154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15154");
        int[] intArray3 = new int[] { 100, (byte) 10, (short) -1 };
        int[] intArray7 = new int[] { 100, (byte) 10, (short) -1 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray8, 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, -1]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test15155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15155");
        int[] intArray3 = new int[] { (-1), 100, 1 };
        int[] intArray7 = new int[] { (-1), 100, 1 };
        int[] intArray11 = new int[] { (-1), 100, 1 };
        int[][] intArray12 = new int[][] { intArray3, intArray7, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray12, (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test15156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15156");
        int[] intArray5 = new int[] { 100, (short) 10, (byte) 1, '#', 0 };
        int[] intArray11 = new int[] { 100, (short) 10, (byte) 1, '#', 0 };
        int[] intArray17 = new int[] { 100, (short) 10, (byte) 1, '#', 0 };
        int[] intArray23 = new int[] { 100, (short) 10, (byte) 1, '#', 0 };
        int[] intArray29 = new int[] { 100, (short) 10, (byte) 1, '#', 0 };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray30, (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 10, 1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 10, 1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 10, 1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test15157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15157");
        int[] intArray4 = new int[] { 0, (byte) -1, (-1), 1 };
        int[] intArray9 = new int[] { 0, (byte) -1, (-1), 1 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray10, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, -1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, -1, -1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test15158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15158");
        int[] intArray6 = new int[] { (short) 10, (short) 10, (byte) 100, 1, '#', 100 };
        int[] intArray13 = new int[] { (short) 10, (short) 10, (byte) 100, 1, '#', 100 };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray14, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10, 100, 1, 35, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10, 100, 1, 35, 100]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test15159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15159");
        int[] intArray6 = new int[] { (byte) 10, 1, (byte) -1, (short) 10, (byte) 1, (short) 10 };
        int[] intArray13 = new int[] { (byte) 10, 1, (byte) -1, (short) 10, (byte) 1, (short) 10 };
        int[] intArray20 = new int[] { (byte) 10, 1, (byte) -1, (short) 10, (byte) 1, (short) 10 };
        int[] intArray27 = new int[] { (byte) 10, 1, (byte) -1, (short) 10, (byte) 1, (short) 10 };
        int[] intArray34 = new int[] { (byte) 10, 1, (byte) -1, (short) 10, (byte) 1, (short) 10 };
        int[] intArray41 = new int[] { (byte) 10, 1, (byte) -1, (short) 10, (byte) 1, (short) 10 };
        int[][] intArray42 = new int[][] { intArray6, intArray13, intArray20, intArray27, intArray34, intArray41 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray42, (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 1, -1, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 1, -1, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10, 1, -1, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, 1, -1, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[10, 1, -1, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[10, 1, -1, 10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test15160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15160");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray3 = new int[] { (short) 1 };
        int[] intArray5 = new int[] { (short) 1 };
        int[] intArray7 = new int[] { (short) 1 };
        int[] intArray9 = new int[] { (short) 1 };
        int[] intArray11 = new int[] { (short) 1 };
        int[][] intArray12 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray12, 1, 0);
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
    public void test15161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15161");
        int[] intArray1 = new int[] { 'a' };
        int[][] intArray2 = new int[][] { intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[97]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test15162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15162");
        int[] intArray6 = new int[] { (short) 10, 100, (short) 100, 10, (short) -1, '#' };
        int[] intArray13 = new int[] { (short) 10, 100, (short) 100, 10, (short) -1, '#' };
        int[][] intArray14 = new int[][] { intArray6, intArray13 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray14, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 100, 100, 10, -1, 35]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 100, 100, 10, -1, 35]");
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test15163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15163");
        int[] intArray2 = new int[] { 'a', (short) -1 };
        int[][] intArray3 = new int[][] { intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray3, (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[97, -1]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test15164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15164");
        int[] intArray5 = new int[] { 1, (short) 10, (short) 0, 0, (byte) 1 };
        int[] intArray11 = new int[] { 1, (short) 10, (short) 0, 0, (byte) 1 };
        int[] intArray17 = new int[] { 1, (short) 10, (short) 0, 0, (byte) 1 };
        int[] intArray23 = new int[] { 1, (short) 10, (short) 0, 0, (byte) 1 };
        int[] intArray29 = new int[] { 1, (short) 10, (short) 0, 0, (byte) 1 };
        int[] intArray35 = new int[] { 1, (short) 10, (short) 0, 0, (byte) 1 };
        int[][] intArray36 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray36, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 10, 0, 0, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 10, 0, 0, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 10, 0, 0, 1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 10, 0, 0, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 10, 0, 0, 1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 10, 0, 0, 1]");
        org.junit.Assert.assertNotNull(intArray36);
    }

    @Test
    public void test15165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15165");
        int[] intArray5 = new int[] { (byte) 0, ' ', 'a', 1, (short) -1 };
        int[] intArray11 = new int[] { (byte) 0, ' ', 'a', 1, (short) -1 };
        int[] intArray17 = new int[] { (byte) 0, ' ', 'a', 1, (short) -1 };
        int[] intArray23 = new int[] { (byte) 0, ' ', 'a', 1, (short) -1 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray24, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 32, 97, 1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 32, 97, 1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 32, 97, 1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 32, 97, 1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test15166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15166");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray3 = new int[] { ' ' };
        int[] intArray5 = new int[] { ' ' };
        int[] intArray7 = new int[] { ' ' };
        int[] intArray9 = new int[] { ' ' };
        int[][] intArray10 = new int[][] { intArray1, intArray3, intArray5, intArray7, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray10, (int) (byte) 100, (int) (byte) -1);
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
    public void test15167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15167");
        int[] intArray3 = new int[] { (byte) -1, '#', (byte) 100 };
        int[] intArray7 = new int[] { (byte) -1, '#', (byte) 100 };
        int[] intArray11 = new int[] { (byte) -1, '#', (byte) 100 };
        int[] intArray15 = new int[] { (byte) -1, '#', (byte) 100 };
        int[] intArray19 = new int[] { (byte) -1, '#', (byte) 100 };
        int[] intArray23 = new int[] { (byte) -1, '#', (byte) 100 };
        int[][] intArray24 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray24, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 35, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 35, 100]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test15168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15168");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray2, 10, (int) '4');
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
    public void test15169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15169");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray0, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test15170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15170");
        int[] intArray5 = new int[] { 100, 0, 'a', 100, 0 };
        int[][] intArray6 = new int[][] { intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray6, (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 0, 97, 100, 0]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test15171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15171");
        int[] intArray2 = new int[] { '#', (byte) 100 };
        int[] intArray5 = new int[] { '#', (byte) 100 };
        int[] intArray8 = new int[] { '#', (byte) 100 };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray9, 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test15172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15172");
        int[] intArray2 = new int[] { (short) 0, (byte) 0 };
        int[] intArray5 = new int[] { (short) 0, (byte) 0 };
        int[] intArray8 = new int[] { (short) 0, (byte) 0 };
        int[] intArray11 = new int[] { (short) 0, (byte) 0 };
        int[] intArray14 = new int[] { (short) 0, (byte) 0 };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.thealgorithms.backtracking.MazeRecursion.setWay(intArray15, 100, 1);
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
    public void test15173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15173");
        int[] intArray2 = new int[] { (byte) 1, (-1) };
        int[] intArray5 = new int[] { (byte) 1, (-1) };
        int[] intArray8 = new int[] { (byte) 1, (-1) };
        int[][] intArray9 = new int[][] { intArray2, intArray5, intArray8 };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.thealgorithms.backtracking.MazeRecursion.setWay2(intArray9, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
}

