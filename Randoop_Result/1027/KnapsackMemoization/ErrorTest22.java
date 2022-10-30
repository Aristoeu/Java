package KnapsackMemoization;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest22 {

    public static boolean debug = false;

    @Test
    public void test11001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11001");
        int[] intArray3 = new int[] { 'a', (byte) -1, 1 };
        int[] intArray10 = new int[] { (short) 10, (short) -1, 1, 10, (short) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 10, (int) (short) 0);
    }

    @Test
    public void test11002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11002");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, '#', '#', '#', (-1) };
        int[] intArray9 = new int[] { (short) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 1, (int) ' ');
    }

    @Test
    public void test11003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11003");
        int[] intArray3 = new int[] { (byte) 1, (short) 1, (short) -1 };
        int[] intArray7 = new int[] { (byte) -1, (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 0, 0);
    }

    @Test
    public void test11004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11004");
        int[] intArray5 = new int[] { 1, 0, ' ', (short) 0, (byte) -1 };
        int[] intArray10 = new int[] { (byte) 100, (byte) 1, (byte) 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (byte) -1, (int) (short) 10);
    }

    @Test
    public void test11005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11005");
        int[] intArray4 = new int[] { 'a', 10, '#', (byte) 1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, 1, (int) (byte) 1);
    }

    @Test
    public void test11006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11006");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, 1, (int) 'a');
    }

    @Test
    public void test11007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11007");
        int[] intArray5 = new int[] { (-1), (short) 1, 100, (byte) 1, (short) 0 };
        int[] intArray8 = new int[] { 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) ' ', (int) (byte) 1);
    }

    @Test
    public void test11008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11008");
        int[] intArray4 = new int[] { 10, '#', 10, '#' };
        int[] intArray11 = new int[] { (short) 1, 1, (short) 1, (short) -1, (byte) -1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (-1), (int) ' ');
    }

    @Test
    public void test11009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11009");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) 0, ' ', (short) 1, ' ', (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test11010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11010");
        int[] intArray2 = new int[] { '4', (byte) 100 };
        int[] intArray9 = new int[] { (short) 100, 100, 10, '#', (short) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) '4', (int) '#');
    }

    @Test
    public void test11011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11011");
        int[] intArray3 = new int[] { (short) 100, (short) 0, 100 };
        int[] intArray9 = new int[] { (byte) 0, (short) 1, 10, (short) 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (short) 1, (int) (short) 0);
    }

    @Test
    public void test11012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11012");
        int[] intArray2 = new int[] { '4', 'a' };
        int[] intArray8 = new int[] { (short) 100, 0, 100, (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) '#', (int) (byte) 10);
    }

    @Test
    public void test11013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11013");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, (short) 100, '#', (byte) 1, (short) 100 };
        int[] intArray9 = new int[] { (short) 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) ' ', (int) (byte) 10);
    }

    @Test
    public void test11014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11014");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { '#', '4', (byte) 1, '4', (short) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) -1, (int) 'a');
    }

    @Test
    public void test11015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11015");
        int[] intArray5 = new int[] { '#', 0, (-1), '#', (short) 0 };
        int[] intArray11 = new int[] { (-1), (short) 1, (short) 100, 'a', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) 10, 10);
    }

    @Test
    public void test11016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11016");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray4 = new int[] { (short) -1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (short) -1, (int) (byte) 100);
    }

    @Test
    public void test11017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11017");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { '#', (short) 1, ' ', (byte) 0, (-1), (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) 1, (int) (byte) -1);
    }

    @Test
    public void test11018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11018");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray7 = new int[] { 0, (short) 10, (short) 10, (short) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) 100, (int) (short) 1);
    }

    @Test
    public void test11019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11019");
        int[] intArray3 = new int[] { (byte) -1, (-1), (short) 1 };
        int[] intArray7 = new int[] { (byte) 10, (byte) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (-1), (int) (short) 1);
    }

    @Test
    public void test11020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11020");
        int[] intArray2 = new int[] { '#', (byte) 100 };
        int[] intArray9 = new int[] { (short) 1, ' ', 0, '#', (byte) -1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (byte) 10, (int) (byte) 0);
    }

    @Test
    public void test11021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11021");
        int[] intArray3 = new int[] { (byte) -1, (short) 100, 1 };
        int[] intArray6 = new int[] { (short) 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) '#', 100);
    }

    @Test
    public void test11022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11022");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray7 = new int[] { (short) 100, (short) 1, 1, (byte) 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) -1, 10);
    }

    @Test
    public void test11023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11023");
        int[] intArray5 = new int[] { 0, (short) 1, (byte) 10, (short) 0, 1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) 100, (int) (short) 1);
    }

    @Test
    public void test11024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11024");
        int[] intArray2 = new int[] { (byte) 100, (short) 0 };
        int[] intArray5 = new int[] { 'a', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test11025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11025");
        int[] intArray3 = new int[] { (short) 10, (short) 10, 100 };
        int[] intArray6 = new int[] { (short) 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, 10, (int) (short) 10);
    }

    @Test
    public void test11026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11026");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, 1, (int) (short) 100);
    }

    @Test
    public void test11027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11027");
        int[] intArray1 = new int[] { 0 };
        int[] intArray7 = new int[] { 1, 'a', (short) 1, (short) 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, 0, (-1));
    }

    @Test
    public void test11028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11028");
        int[] intArray3 = new int[] { 0, (byte) -1, ' ' };
        int[] intArray7 = new int[] { 10, 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) 1, 0);
    }

    @Test
    public void test11029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11029");
        int[] intArray2 = new int[] { (short) 100, (short) 10 };
        int[] intArray6 = new int[] { 0, (-1), (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) 10, (int) '#');
    }

    @Test
    public void test11030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11030");
        int[] intArray3 = new int[] { (short) -1, 0, (byte) 100 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) 0, (int) (short) 1);
    }

    @Test
    public void test11031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11031");
        int[] intArray3 = new int[] { '4', 0, (short) 100 };
        int[] intArray7 = new int[] { 100, (short) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) 100, (int) (short) 10);
    }

    @Test
    public void test11032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11032");
        int[] intArray5 = new int[] { (byte) 0, (byte) 10, (byte) 1, (short) 100, '#' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) ' ', (int) '#');
    }

    @Test
    public void test11033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11033");
        int[] intArray6 = new int[] { (short) 10, '#', (byte) 10, ' ', (byte) 1, '#' };
        int[] intArray8 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (byte) -1, (int) 'a');
    }

    @Test
    public void test11034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11034");
        int[] intArray3 = new int[] { (short) 10, (byte) 1, '#' };
        int[] intArray10 = new int[] { (short) 1, (short) 10, (byte) 10, (byte) 0, (short) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 10, (int) (short) 10);
    }

    @Test
    public void test11035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11035");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) 10, (byte) 100, ' ', '#', (short) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) 1, (int) (byte) 0);
    }

    @Test
    public void test11036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11036");
        int[] intArray2 = new int[] { (byte) 1, (short) 100 };
        int[] intArray4 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) '4', 0);
    }

    @Test
    public void test11037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11037");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (byte) 100, (int) 'a');
    }

    @Test
    public void test11038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11038");
        int[] intArray6 = new int[] { '#', (byte) 0, (byte) -1, (short) 100, (byte) -1, 100 };
        int[] intArray9 = new int[] { '4', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) 'a', (int) (short) 0);
    }

    @Test
    public void test11039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11039");
        int[] intArray5 = new int[] { (short) 0, (short) 10, (short) -1, 1, (byte) 10 };
        int[] intArray10 = new int[] { (byte) 0, (byte) 10, '4', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (short) 10, (int) (byte) 1);
    }

    @Test
    public void test11040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11040");
        int[] intArray3 = new int[] { (byte) 0, ' ', (byte) 0 };
        int[] intArray5 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) '4', (int) 'a');
    }

    @Test
    public void test11041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11041");
        int[] intArray4 = new int[] { (short) 1, 1, 100, (short) 0 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (short) 0, (int) (short) 1);
    }

    @Test
    public void test11042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11042");
        int[] intArray6 = new int[] { (byte) 0, (short) 0, (byte) 100, (short) 100, '#', 10 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) ' ', (int) ' ');
    }

    @Test
    public void test11043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11043");
        int[] intArray3 = new int[] { '#', (byte) 100, ' ' };
        int[] intArray10 = new int[] { (byte) 10, (byte) 1, '4', (-1), (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 1, (int) (short) 10);
    }

    @Test
    public void test11044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11044");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) 0, ' ', ' ', '4', (-1), 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, 100, (int) 'a');
    }

    @Test
    public void test11045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11045");
        int[] intArray4 = new int[] { 100, (byte) 10, (byte) 10, (short) 1 };
        int[] intArray6 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (-1), (int) '#');
    }

    @Test
    public void test11046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11046");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 1, (int) (short) 10);
    }

    @Test
    public void test11047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11047");
        int[] intArray1 = new int[] { 100 };
        int[] intArray7 = new int[] { (short) 100, 'a', (byte) 100, 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, 10, 100);
    }

    @Test
    public void test11048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11048");
        int[] intArray5 = new int[] { 10, (byte) 100, 'a', (byte) -1, (short) 1 };
        int[] intArray12 = new int[] { '#', '4', ' ', (short) 100, (short) -1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) 10, (int) (byte) 100);
    }

    @Test
    public void test11049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11049");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) 100, (int) (byte) 100);
    }

    @Test
    public void test11050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11050");
        int[] intArray5 = new int[] { 100, (short) -1, (short) 10, (short) 10, (byte) -1 };
        int[] intArray10 = new int[] { 1, 10, (short) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 100, (-1));
    }

    @Test
    public void test11051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11051");
        int[] intArray5 = new int[] { '4', 100, (byte) 0, (short) 100, (byte) 10 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) 'a', (int) '#');
    }

    @Test
    public void test11052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11052");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (byte) 10, (int) ' ');
    }

    @Test
    public void test11053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11053");
        int[] intArray4 = new int[] { (-1), (short) 0, '4', (-1) };
        int[] intArray6 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (-1), (int) (short) 100);
    }

    @Test
    public void test11054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11054");
        int[] intArray3 = new int[] { 0, (byte) -1, 'a' };
        int[] intArray5 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) 10, (int) ' ');
    }

    @Test
    public void test11055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11055");
        int[] intArray6 = new int[] { (short) 1, ' ', (short) 0, (short) 10, 100, '4' };
        int[] intArray9 = new int[] { (short) 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, 100, 10);
    }

    @Test
    public void test11056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11056");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 0, (byte) 100, 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) '4', 1);
    }

    @Test
    public void test11057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11057");
        int[] intArray2 = new int[] { (byte) 0, 0 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 1, (int) '#');
    }

    @Test
    public void test11058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11058");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray8 = new int[] { (short) 100, (byte) 0, (short) 1, '4', '4', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 0, (int) (short) 100);
    }

    @Test
    public void test11059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11059");
        int[] intArray2 = new int[] { (byte) 100, '#' };
        int[] intArray8 = new int[] { (short) 0, (byte) 0, ' ', 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (-1), (int) (short) 100);
    }

    @Test
    public void test11060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11060");
        int[] intArray4 = new int[] { (short) 0, (short) 100, (short) 100, '#' };
        int[] intArray8 = new int[] { '4', (byte) -1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) 10, 1);
    }

    @Test
    public void test11061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11061");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray4 = new int[] { 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, 100, 100);
    }

    @Test
    public void test11062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11062");
        int[] intArray6 = new int[] { '4', '#', (short) -1, ' ', (short) 1, '4' };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) 10, (int) (byte) 10);
    }

    @Test
    public void test11063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11063");
        int[] intArray2 = new int[] { (byte) -1, 10 };
        int[] intArray9 = new int[] { '4', '#', (short) 1, (short) 100, 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) '4', (int) ' ');
    }

    @Test
    public void test11064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11064");
        int[] intArray6 = new int[] { 0, (byte) 1, (byte) 1, (short) 1, 1, 'a' };
        int[] intArray10 = new int[] { 'a', (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) '4', (int) '4');
    }

    @Test
    public void test11065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11065");
        int[] intArray2 = new int[] { (short) -1, 10 };
        int[] intArray5 = new int[] { ' ', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) '4', 0);
    }

    @Test
    public void test11066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11066");
        int[] intArray6 = new int[] { '4', (byte) 100, (short) 1, (byte) 1, (short) -1, (byte) 0 };
        int[] intArray12 = new int[] { 100, (byte) 0, 0, (byte) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) 'a', (int) '4');
    }

    @Test
    public void test11067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11067");
        int[] intArray5 = new int[] { 100, '#', (-1), (byte) 0, '#' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (short) 10, 0);
    }

    @Test
    public void test11068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11068");
        int[] intArray6 = new int[] { 'a', (short) -1, ' ', (byte) -1, (byte) 1, 1 };
        int[] intArray9 = new int[] { (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, 0, (int) (short) 0);
    }

    @Test
    public void test11069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11069");
        int[] intArray4 = new int[] { (byte) 0, 1, (byte) -1, (short) -1 };
        int[] intArray7 = new int[] { (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) 1, (int) (short) 10);
    }

    @Test
    public void test11070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11070");
        int[] intArray4 = new int[] { 'a', 'a', (-1), (short) 10 };
        int[] intArray7 = new int[] { (byte) 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (-1), (int) (short) 1);
    }

    @Test
    public void test11071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11071");
        int[] intArray6 = new int[] { 0, '#', (short) 100, '4', (short) 1, '4' };
        int[] intArray8 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 10, (int) '4');
    }

    @Test
    public void test11072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11072");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, 0, (-1) };
        int[] intArray6 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 10, 100);
    }

    @Test
    public void test11073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11073");
        int[] intArray4 = new int[] { 100, (byte) -1, (short) 100, 100 };
        int[] intArray6 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) '#', (int) (short) 1);
    }

    @Test
    public void test11074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11074");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 10, (byte) 1, (byte) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) 100, (int) (short) 100);
    }

    @Test
    public void test11075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11075");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray4 = new int[] { (byte) 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (short) 10, 0);
    }

    @Test
    public void test11076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11076");
        int[] intArray2 = new int[] { 100, ' ' };
        int[] intArray6 = new int[] { (byte) 100, (byte) 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 10, (int) '#');
    }

    @Test
    public void test11077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11077");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (short) -1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) '#', 100);
    }

    @Test
    public void test11078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11078");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) 10, 0, (short) 1, 'a', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) '4', 100);
    }

    @Test
    public void test11079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11079");
        int[] intArray6 = new int[] { (byte) 0, (short) 100, (byte) 1, (short) 0, '#', (short) 1 };
        int[] intArray8 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 1, 0);
    }

    @Test
    public void test11080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11080");
        int[] intArray4 = new int[] { (short) 10, (byte) 10, (byte) 0, (byte) -1 };
        int[] intArray7 = new int[] { 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (-1), 0);
    }

    @Test
    public void test11081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11081");
        int[] intArray4 = new int[] { (byte) 0, '#', (byte) -1, (short) 10 };
        int[] intArray9 = new int[] { 0, (short) 100, (byte) 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) 100, 100);
    }

    @Test
    public void test11082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11082");
        int[] intArray4 = new int[] { (byte) 1, (short) 0, (byte) -1, (byte) -1 };
        int[] intArray7 = new int[] { (byte) 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) 1, 1);
    }

    @Test
    public void test11083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11083");
        int[] intArray2 = new int[] { (short) 10, (-1) };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 0, (int) (byte) 0);
    }

    @Test
    public void test11084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11084");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray6 = new int[] { (short) -1, (short) 1, (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (byte) -1, (int) (byte) -1);
    }

    @Test
    public void test11085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11085");
        int[] intArray4 = new int[] { '4', (short) -1, (short) -1, (short) -1 };
        int[] intArray8 = new int[] { (short) 1, (byte) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 0, (int) (byte) -1);
    }

    @Test
    public void test11086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11086");
        int[] intArray1 = new int[] { 1 };
        int[] intArray5 = new int[] { (byte) -1, 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (-1), (int) '4');
    }

    @Test
    public void test11087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11087");
        int[] intArray4 = new int[] { (short) 0, (byte) 0, (short) 1, (byte) -1 };
        int[] intArray9 = new int[] { 100, 0, (byte) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 10, 0);
    }

    @Test
    public void test11088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11088");
        int[] intArray1 = new int[] { '#' };
        int[] intArray3 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, 100, 0);
    }

    @Test
    public void test11089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11089");
        int[] intArray5 = new int[] { (byte) 0, 'a', 100, (short) 10, (byte) 100 };
        int[] intArray12 = new int[] { (byte) 0, (-1), (byte) 1, '4', (short) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (byte) 1, 1);
    }

    @Test
    public void test11090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11090");
        int[] intArray2 = new int[] { (short) 100, (short) 1 };
        int[] intArray4 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 0, (int) '4');
    }

    @Test
    public void test11091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11091");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (short) 10, (int) ' ');
    }

    @Test
    public void test11092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11092");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray8 = new int[] { (byte) 100, '#', 1, (short) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 100, (int) '4');
    }

    @Test
    public void test11093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11093");
        int[] intArray2 = new int[] { (byte) 100, (short) -1 };
        int[] intArray7 = new int[] { (-1), '4', (short) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 0, (int) '#');
    }

    @Test
    public void test11094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11094");
        int[] intArray5 = new int[] { 10, 100, 'a', 'a', (byte) 0 };
        int[] intArray10 = new int[] { '4', ' ', (byte) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) '4', (int) (byte) 10);
    }

    @Test
    public void test11095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11095");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 10, (short) 100, (short) 10, (short) 10, (byte) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) 0, (int) (byte) 0);
    }

    @Test
    public void test11096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11096");
        int[] intArray2 = new int[] { 1, (short) 10 };
        int[] intArray4 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (byte) 1, (-1));
    }

    @Test
    public void test11097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11097");
        int[] intArray4 = new int[] { (byte) -1, (byte) 0, '#', 0 };
        int[] intArray8 = new int[] { 'a', (short) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 100, (int) (byte) 1);
    }

    @Test
    public void test11098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11098");
        int[] intArray5 = new int[] { ' ', (short) 100, (byte) -1, 'a', (short) 100 };
        int[] intArray7 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) 100, (int) '#');
    }

    @Test
    public void test11099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11099");
        int[] intArray5 = new int[] { (byte) 10, (byte) 1, ' ', (short) 10, (short) 10 };
        int[] intArray12 = new int[] { (byte) 10, ' ', 'a', (short) 1, (byte) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (byte) 1, (int) (short) 100);
    }

    @Test
    public void test11100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11100");
        int[] intArray2 = new int[] { '4', (byte) 0 };
        int[] intArray6 = new int[] { (short) 1, (short) 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (short) 0, (int) (byte) -1);
    }

    @Test
    public void test11101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11101");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray5 = new int[] { '#', (short) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (byte) -1, (int) (byte) 1);
    }

    @Test
    public void test11102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11102");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) 10, (byte) 100, 1, (byte) 10, 'a', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) 0, (-1));
    }

    @Test
    public void test11103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11103");
        int[] intArray3 = new int[] { (byte) 10, (short) -1, 0 };
        int[] intArray10 = new int[] { (short) 10, (byte) 10, (short) 1, '#', (byte) -1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 10, (-1));
    }

    @Test
    public void test11104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11104");
        int[] intArray5 = new int[] { '#', (short) 100, 0, (short) 100, (short) -1 };
        int[] intArray9 = new int[] { 100, 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (byte) 100, (int) (short) 10);
    }

    @Test
    public void test11105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11105");
        int[] intArray5 = new int[] { '#', (short) -1, (byte) 100, (byte) 10, (short) 100 };
        int[] intArray12 = new int[] { (byte) -1, (byte) -1, (short) 0, (byte) -1, (byte) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) 100, (int) 'a');
    }

    @Test
    public void test11106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11106");
        int[] intArray5 = new int[] { (byte) 1, 'a', (byte) 100, '4', (byte) 0 };
        int[] intArray7 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test11107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11107");
        int[] intArray5 = new int[] { (short) 1, (byte) 0, ' ', (-1), 0 };
        int[] intArray11 = new int[] { (byte) 100, (byte) 0, (byte) 0, (-1), (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 10, (int) (byte) -1);
    }

    @Test
    public void test11108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11108");
        int[] intArray2 = new int[] { (short) 10, 0 };
        int[] intArray4 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 10, (int) '#');
    }

    @Test
    public void test11109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11109");
        int[] intArray4 = new int[] { (short) 1, (short) 1, (-1), (short) 100 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (-1), (int) ' ');
    }

    @Test
    public void test11110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11110");
        int[] intArray4 = new int[] { ' ', '#', 0, ' ' };
        int[] intArray8 = new int[] { (byte) 10, 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 0, (int) (short) -1);
    }

    @Test
    public void test11111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11111");
        int[] intArray2 = new int[] { (byte) 100, ' ' };
        int[] intArray7 = new int[] { (byte) 10, 'a', '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) 'a', (int) (short) 1);
    }

    @Test
    public void test11112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11112");
        int[] intArray6 = new int[] { (-1), (short) -1, ' ', (short) 10, (short) 10, 10 };
        int[] intArray11 = new int[] { (short) 10, ' ', ' ', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) 'a', (int) (byte) -1);
    }

    @Test
    public void test11113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11113");
        int[] intArray4 = new int[] { (-1), (short) 10, ' ', (byte) 1 };
        int[] intArray7 = new int[] { '4', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) ' ', 0);
    }

    @Test
    public void test11114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11114");
        int[] intArray4 = new int[] { (byte) -1, 1, (byte) 0, '#' };
        int[] intArray11 = new int[] { (short) 1, ' ', (short) -1, (byte) 10, (short) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (byte) 100, (-1));
    }

    @Test
    public void test11115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11115");
        int[] intArray2 = new int[] { (short) 0, (short) 1 };
        int[] intArray7 = new int[] { (byte) 1, (byte) 0, (short) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 100, (int) (short) 10);
    }

    @Test
    public void test11116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11116");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) 1, (int) (byte) 10);
    }

    @Test
    public void test11117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11117");
        int[] intArray5 = new int[] { 0, 1, 100, 0, ' ' };
        int[] intArray7 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) 1, (int) (byte) -1);
    }

    @Test
    public void test11118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11118");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray3 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (byte) 1, 10);
    }

    @Test
    public void test11119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11119");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray6 = new int[] { 'a', (byte) 100, 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) ' ', (int) (short) 0);
    }

    @Test
    public void test11120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11120");
        int[] intArray6 = new int[] { (byte) -1, (byte) -1, '#', 1, ' ', (short) 0 };
        int[] intArray11 = new int[] { (short) 10, ' ', (short) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (byte) -1, 0);
    }

    @Test
    public void test11121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11121");
        int[] intArray1 = new int[] { 1 };
        int[] intArray3 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) 0, 0);
    }

    @Test
    public void test11122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11122");
        int[] intArray4 = new int[] { (short) 0, (short) 100, (short) 0, 100 };
        int[] intArray8 = new int[] { 'a', ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 10, (int) '#');
    }

    @Test
    public void test11123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11123");
        int[] intArray2 = new int[] { 1, 10 };
        int[] intArray6 = new int[] { (short) 100, 'a', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) 'a', (int) '4');
    }

    @Test
    public void test11124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11124");
        int[] intArray6 = new int[] { '4', (short) 0, (short) 10, (short) 100, 100, (byte) 0 };
        int[] intArray8 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 0, 100);
    }

    @Test
    public void test11125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11125");
        int[] intArray3 = new int[] { 100, 'a', (byte) -1 };
        int[] intArray6 = new int[] { 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) 10, 100);
    }

    @Test
    public void test11126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11126");
        int[] intArray6 = new int[] { (byte) 100, 'a', 'a', (short) 1, 1, (short) 1 };
        int[] intArray11 = new int[] { (byte) 0, (-1), (short) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (byte) 0, 10);
    }

    @Test
    public void test11127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11127");
        int[] intArray3 = new int[] { (short) 1, (short) 10, (short) 10 };
        int[] intArray8 = new int[] { 100, (byte) 10, 'a', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (short) 1, 100);
    }

    @Test
    public void test11128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11128");
        int[] intArray5 = new int[] { '#', (byte) 0, '#', (byte) 100, (short) 10 };
        int[] intArray7 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) ' ', (int) 'a');
    }

    @Test
    public void test11129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11129");
        int[] intArray6 = new int[] { ' ', (byte) 1, 10, (byte) 10, (byte) 1, (short) -1 };
        int[] intArray13 = new int[] { 10, (-1), (byte) 100, (short) -1, (short) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 1, (int) (short) 0);
    }

    @Test
    public void test11130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11130");
        int[] intArray6 = new int[] { (byte) 10, 100, '4', (short) 0, ' ', 0 };
        int[] intArray13 = new int[] { 100, (byte) 1, ' ', 100, (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 1, 100);
    }

    @Test
    public void test11131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11131");
        int[] intArray3 = new int[] { (byte) -1, (short) 100, 100 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (byte) 1, (int) '4');
    }

    @Test
    public void test11132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11132");
        int[] intArray4 = new int[] { '#', (short) -1, (short) -1, (byte) 0 };
        int[] intArray10 = new int[] { (byte) 1, (short) 10, (byte) 100, (short) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) 10, 1);
    }

    @Test
    public void test11133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11133");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) 1, (int) (short) 10);
    }

    @Test
    public void test11134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11134");
        int[] intArray6 = new int[] { (byte) 100, 0, (short) 10, (short) -1, 10, (short) -1 };
        int[] intArray10 = new int[] { 100, '#', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (-1), (int) (short) 1);
    }

    @Test
    public void test11135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11135");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 100, '#', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) 100, (int) (short) 0);
    }

    @Test
    public void test11136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11136");
        int[] intArray4 = new int[] { '4', '4', (short) 100, 'a' };
        int[] intArray10 = new int[] { (byte) 1, (-1), 10, 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) '#', 1);
    }

    @Test
    public void test11137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11137");
        int[] intArray2 = new int[] { 'a', 10 };
        int[] intArray9 = new int[] { 100, (short) 10, (byte) 10, (short) 10, 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (short) 1, (int) '#');
    }

    @Test
    public void test11138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11138");
        int[] intArray2 = new int[] { (byte) 1, (short) 1 };
        int[] intArray8 = new int[] { (short) -1, (short) 0, ' ', (short) 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (byte) -1, 0);
    }

    @Test
    public void test11139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11139");
        int[] intArray3 = new int[] { (short) 0, (short) 100, 0 };
        int[] intArray7 = new int[] { 10, (byte) 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 10, (int) 'a');
    }

    @Test
    public void test11140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11140");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 1, ' ', (short) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) 100, 0);
    }

    @Test
    public void test11141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11141");
        int[] intArray6 = new int[] { 0, (byte) 10, 'a', (short) 1, 1, (short) 0 };
        int[] intArray10 = new int[] { (short) 10, (short) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 0, 0);
    }

    @Test
    public void test11142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11142");
        int[] intArray3 = new int[] { (byte) 10, ' ', (short) 100 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (byte) 0, (int) (short) 1);
    }

    @Test
    public void test11143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11143");
        int[] intArray5 = new int[] { 10, 100, (short) 1, '4', (byte) 0 };
        int[] intArray9 = new int[] { (byte) 10, (short) -1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 100, 0);
    }

    @Test
    public void test11144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11144");
        int[] intArray6 = new int[] { '4', (byte) 100, 1, (-1), 10, (short) -1 };
        int[] intArray10 = new int[] { (byte) 10, '#', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 10, 0);
    }

    @Test
    public void test11145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11145");
        int[] intArray6 = new int[] { 'a', ' ', (short) 10, (short) 10, (short) -1, (byte) 10 };
        int[] intArray10 = new int[] { 10, (byte) -1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 0, (int) '#');
    }

    @Test
    public void test11146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11146");
        int[] intArray4 = new int[] { 0, (short) 1, (short) -1, (short) 10 };
        int[] intArray11 = new int[] { 1, 0, 100, (byte) 10, '4', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) '#', (int) '#');
    }

    @Test
    public void test11147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11147");
        int[] intArray6 = new int[] { '#', (short) 100, (short) 10, (byte) 0, (byte) 1, (byte) 10 };
        int[] intArray8 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 1, (int) (short) 10);
    }

    @Test
    public void test11148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11148");
        int[] intArray1 = new int[] { 0 };
        int[] intArray3 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (byte) 0, 1);
    }

    @Test
    public void test11149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11149");
        int[] intArray4 = new int[] { '4', (short) 0, (short) 10, 100 };
        int[] intArray9 = new int[] { 0, 'a', '4', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (byte) 10, (int) (short) 100);
    }

    @Test
    public void test11150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11150");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test11151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11151");
        int[] intArray1 = new int[] { 1 };
        int[] intArray7 = new int[] { (byte) 0, ' ', (byte) 1, (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) 10, (int) (byte) 0);
    }

    @Test
    public void test11152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11152");
        int[] intArray6 = new int[] { 'a', 0, (short) 0, (short) 100, (short) 0, (short) 1 };
        int[] intArray9 = new int[] { '#', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (short) 1, (int) (short) 100);
    }

    @Test
    public void test11153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11153");
        int[] intArray6 = new int[] { (byte) 10, 100, (byte) 1, 0, (short) 1, (byte) 10 };
        int[] intArray13 = new int[] { (short) 100, (short) -1, (byte) 10, (short) 1, (short) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (byte) 10, (int) (short) 100);
    }

    @Test
    public void test11154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11154");
        int[] intArray2 = new int[] { 10, (short) 1 };
        int[] intArray7 = new int[] { '#', 'a', (short) 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) -1, (int) ' ');
    }

    @Test
    public void test11155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11155");
        int[] intArray1 = new int[] { '4' };
        int[] intArray8 = new int[] { (short) 0, (short) 1, (short) 10, (short) 10, (byte) 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) 'a', 0);
    }

    @Test
    public void test11156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11156");
        int[] intArray1 = new int[] { '#' };
        int[] intArray4 = new int[] { 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test11157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11157");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) -1, (short) -1, 100, '4', 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) -1, (int) (short) 100);
    }

    @Test
    public void test11158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11158");
        int[] intArray3 = new int[] { (short) 100, (short) 0, ' ' };
        int[] intArray10 = new int[] { '#', (-1), 'a', (short) 0, (byte) -1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (byte) 100, (int) 'a');
    }

    @Test
    public void test11159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11159");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 10, (byte) -1, 'a', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) 0, (int) (byte) 10);
    }

    @Test
    public void test11160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11160");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray5 = new int[] { (byte) 100, ' ', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) 0, (int) (short) 10);
    }

    @Test
    public void test11161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11161");
        int[] intArray1 = new int[] { '#' };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 10, (int) (byte) 0);
    }

    @Test
    public void test11162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11162");
        int[] intArray6 = new int[] { (short) 0, 0, 100, (byte) 0, 'a', 'a' };
        int[] intArray10 = new int[] { 1, (short) 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (short) 10, (int) (short) 1);
    }

    @Test
    public void test11163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11163");
        int[] intArray2 = new int[] { (-1), (short) 100 };
        int[] intArray7 = new int[] { 1, (short) 0, (-1), (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 0, (int) (byte) 100);
    }

    @Test
    public void test11164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11164");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (short) -1, (int) 'a');
    }

    @Test
    public void test11165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11165");
        int[] intArray6 = new int[] { '4', (byte) 10, (short) 0, (short) 100, (short) 10, (short) 100 };
        int[] intArray11 = new int[] { ' ', (byte) 100, (byte) 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (byte) 100, (int) (short) 0);
    }

    @Test
    public void test11166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11166");
        int[] intArray6 = new int[] { 'a', (-1), '4', 'a', (short) 100, (short) 1 };
        int[] intArray13 = new int[] { 100, (short) 1, ' ', '4', 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (short) -1, (-1));
    }

    @Test
    public void test11167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11167");
        int[] intArray3 = new int[] { (byte) -1, (short) 10, (-1) };
        int[] intArray8 = new int[] { (byte) 0, (byte) 1, 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test11168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11168");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { '4', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (short) 0, (int) (short) -1);
    }

    @Test
    public void test11169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11169");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (-1), 10);
    }

    @Test
    public void test11170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11170");
        int[] intArray4 = new int[] { (short) 1, (byte) 100, (short) 1, 'a' };
        int[] intArray10 = new int[] { (short) 10, (short) 10, ' ', 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) 1, 10);
    }

    @Test
    public void test11171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11171");
        int[] intArray6 = new int[] { (short) -1, ' ', 1, (short) 10, 'a', (short) 100 };
        int[] intArray13 = new int[] { 'a', 10, (short) -1, (short) -1, (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (short) 0, (int) (byte) 0);
    }

    @Test
    public void test11172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11172");
        int[] intArray6 = new int[] { 100, 100, ' ', (-1), 0, (byte) 10 };
        int[] intArray12 = new int[] { (short) 100, (byte) 1, (byte) 10, 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) '#', (int) 'a');
    }

    @Test
    public void test11173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11173");
        int[] intArray6 = new int[] { ' ', 1, 'a', 10, '#', (byte) 1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, 1, (int) (short) -1);
    }

    @Test
    public void test11174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11174");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (short) 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (short) 0, (int) (byte) 100);
    }

    @Test
    public void test11175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11175");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) 0, 1, ' ', ' ', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) 100, 0);
    }

    @Test
    public void test11176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11176");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray5 = new int[] { 1, (byte) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, 10, (int) (byte) 10);
    }

    @Test
    public void test11177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11177");
        int[] intArray1 = new int[] { 0 };
        int[] intArray3 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, 0, (int) (short) 10);
    }

    @Test
    public void test11178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11178");
        int[] intArray5 = new int[] { 100, '#', (byte) 10, '#', 1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 100, (int) '#');
    }

    @Test
    public void test11179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11179");
        int[] intArray6 = new int[] { '#', (byte) 100, (-1), (short) 100, (short) -1, 10 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) ' ', 1);
    }

    @Test
    public void test11180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11180");
        int[] intArray2 = new int[] { (short) 1, (byte) 0 };
        int[] intArray9 = new int[] { (byte) 10, (byte) 10, (short) 10, (byte) -1, (short) 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (byte) 0, (int) '4');
    }

    @Test
    public void test11181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11181");
        int[] intArray2 = new int[] { (-1), (short) 100 };
        int[] intArray5 = new int[] { (byte) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 100, 10);
    }

    @Test
    public void test11182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11182");
        int[] intArray5 = new int[] { ' ', ' ', ' ', 0, 10 };
        int[] intArray9 = new int[] { 0, (short) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) 'a', 1);
    }

    @Test
    public void test11183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11183");
        int[] intArray4 = new int[] { '#', (short) -1, (byte) 10, (short) -1 };
        int[] intArray11 = new int[] { (byte) -1, ' ', (short) 100, (short) 100, ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) 1, (int) (byte) 1);
    }

    @Test
    public void test11184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11184");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray8 = new int[] { (byte) 0, (short) 100, (short) 100, (byte) 10, (short) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) 100, (int) (byte) 1);
    }

    @Test
    public void test11185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11185");
        int[] intArray2 = new int[] { (short) 0, (short) -1 };
        int[] intArray5 = new int[] { ' ', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (byte) 100, (int) '4');
    }

    @Test
    public void test11186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11186");
        int[] intArray3 = new int[] { 100, 10, (short) 100 };
        int[] intArray8 = new int[] { (short) 10, (short) 1, (-1), (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) ' ', 0);
    }

    @Test
    public void test11187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11187");
        int[] intArray3 = new int[] { 10, (short) -1, (short) 10 };
        int[] intArray8 = new int[] { (short) 10, '4', (byte) -1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 0, 0);
    }

    @Test
    public void test11188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11188");
        int[] intArray2 = new int[] { (short) 0, '4' };
        int[] intArray8 = new int[] { (short) 100, 0, 'a', (byte) 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) '4', (-1));
    }

    @Test
    public void test11189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11189");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (byte) 0, 0);
    }

    @Test
    public void test11190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11190");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (byte) 100, 100);
    }

    @Test
    public void test11191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11191");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, 100, (byte) 1, (byte) 1, 'a' };
        int[] intArray11 = new int[] { (byte) 0, (byte) 100, (short) 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (short) -1, (-1));
    }

    @Test
    public void test11192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11192");
        int[] intArray3 = new int[] { (byte) 10, (byte) -1, (short) 10 };
        int[] intArray10 = new int[] { (byte) 10, (byte) 10, (-1), 0, (byte) 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 0, 0);
    }

    @Test
    public void test11193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11193");
        int[] intArray5 = new int[] { 10, (-1), (short) 1, (byte) 1, (short) 10 };
        int[] intArray12 = new int[] { (short) 1, (byte) 0, 'a', (-1), (byte) 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, 100, (int) (byte) 100);
    }

    @Test
    public void test11194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11194");
        int[] intArray2 = new int[] { '#', '#' };
        int[] intArray6 = new int[] { (byte) 0, 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) ' ', (int) (short) -1);
    }

    @Test
    public void test11195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11195");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray5 = new int[] { (short) 10, (byte) 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, 10, 1);
    }

    @Test
    public void test11196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11196");
        int[] intArray6 = new int[] { 1, (byte) 1, 0, (short) 100, '#', ' ' };
        int[] intArray8 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) '#', 10);
    }

    @Test
    public void test11197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11197");
        int[] intArray5 = new int[] { (byte) -1, 'a', (short) 0, 1, (byte) 0 };
        int[] intArray12 = new int[] { (byte) -1, (-1), 1, (short) -1, 'a', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, 1, (int) (byte) 10);
    }

    @Test
    public void test11198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11198");
        int[] intArray4 = new int[] { 10, (byte) 1, (short) -1, (-1) };
        int[] intArray7 = new int[] { (short) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 10, (int) 'a');
    }

    @Test
    public void test11199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11199");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (short) 100, (int) '#');
    }

    @Test
    public void test11200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11200");
        int[] intArray6 = new int[] { (byte) 10, (byte) 1, (short) -1, (short) -1, (short) 1, 'a' };
        int[] intArray13 = new int[] { (short) 10, '#', (-1), (short) 1, (short) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) 'a', 100);
    }

    @Test
    public void test11201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11201");
        int[] intArray5 = new int[] { 1, (short) 10, (byte) 10, '4', ' ' };
        int[] intArray8 = new int[] { (short) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) '4', (int) (short) 1);
    }

    @Test
    public void test11202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11202");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray7 = new int[] { (short) 1, 10, 'a', 'a', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) -1, (-1));
    }

    @Test
    public void test11203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11203");
        int[] intArray6 = new int[] { (byte) 1, (short) 100, (short) 0, 'a', ' ', (byte) -1 };
        int[] intArray12 = new int[] { (byte) 100, (short) 1, (-1), '4', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (byte) -1, (int) (short) -1);
    }

    @Test
    public void test11204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11204");
        int[] intArray5 = new int[] { (byte) -1, (short) 10, (byte) 1, (short) -1, (short) 0 };
        int[] intArray10 = new int[] { 1, (byte) 100, (short) 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (short) 100, (int) (short) 0);
    }

    @Test
    public void test11205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11205");
        int[] intArray6 = new int[] { (byte) 1, 'a', (short) 10, (short) 100, (short) 100, 100 };
        int[] intArray10 = new int[] { (short) 0, 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 10, (int) (short) 10);
    }

    @Test
    public void test11206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11206");
        int[] intArray5 = new int[] { '#', (short) 10, (short) 100, 1, (byte) 100 };
        int[] intArray12 = new int[] { (short) 10, 0, 10, '4', '4', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (byte) 100, (int) (short) -1);
    }

    @Test
    public void test11207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11207");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, 0, (int) (byte) 0);
    }

    @Test
    public void test11208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11208");
        int[] intArray3 = new int[] { (short) -1, '4', (short) -1 };
        int[] intArray6 = new int[] { 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) 100, (int) (byte) 10);
    }

    @Test
    public void test11209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11209");
        int[] intArray5 = new int[] { (short) 100, 1, (byte) 0, (short) -1, (short) 0 };
        int[] intArray12 = new int[] { (byte) 10, (byte) 1, 0, ' ', ' ', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, 10, (int) (short) -1);
    }

    @Test
    public void test11210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11210");
        int[] intArray3 = new int[] { 100, (byte) 1, (byte) -1 };
        int[] intArray7 = new int[] { 10, (short) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 100, (int) (byte) 1);
    }

    @Test
    public void test11211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11211");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test11212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11212");
        int[] intArray3 = new int[] { (short) 10, (byte) 10, (short) 0 };
        int[] intArray7 = new int[] { (-1), 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) -1, (int) (byte) 100);
    }

    @Test
    public void test11213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11213");
        int[] intArray6 = new int[] { '#', (-1), 'a', (short) 10, '4', 'a' };
        int[] intArray13 = new int[] { 0, (short) 100, 1, (short) 100, 'a', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (byte) 1, (int) (short) 0);
    }

    @Test
    public void test11214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11214");
        int[] intArray6 = new int[] { (byte) 1, 100, 0, 100, (short) 0, (byte) 100 };
        int[] intArray12 = new int[] { '4', 0, '4', (byte) 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test11215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11215");
        int[] intArray6 = new int[] { (byte) 1, (byte) 0, 100, 10, (short) 10, (short) 0 };
        int[] intArray11 = new int[] { 0, (short) 10, (byte) 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test11216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11216");
        int[] intArray5 = new int[] { 100, (short) 10, (byte) 100, (-1), (short) 10 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 0, 10);
    }

    @Test
    public void test11217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11217");
        int[] intArray5 = new int[] { (byte) 0, (byte) 1, (short) -1, (-1), 100 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 100, (int) (byte) -1);
    }

    @Test
    public void test11218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11218");
        int[] intArray5 = new int[] { 0, 1, '4', (short) 1, 100 };
        int[] intArray8 = new int[] { 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) 0, 0);
    }

    @Test
    public void test11219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11219");
        int[] intArray5 = new int[] { '4', (short) 10, 'a', 100, (short) 1 };
        int[] intArray9 = new int[] { (short) 0, '4', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 10, (int) '#');
    }

    @Test
    public void test11220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11220");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray6 = new int[] { 'a', (byte) 0, (byte) 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) '#', (-1));
    }

    @Test
    public void test11221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11221");
        int[] intArray1 = new int[] { 100 };
        int[] intArray4 = new int[] { (byte) 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (short) 1, 1);
    }

    @Test
    public void test11222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11222");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray6 = new int[] { 0, 'a', (byte) -1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (byte) -1, (-1));
    }

    @Test
    public void test11223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11223");
        int[] intArray2 = new int[] { 1, (byte) -1 };
        int[] intArray8 = new int[] { (short) -1, (short) 10, (byte) -1, (byte) 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 1, (-1));
    }

    @Test
    public void test11224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11224");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 10, (short) 0, (short) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test11225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11225");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray5 = new int[] { (short) 100, '4', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) 100, 1);
    }

    @Test
    public void test11226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11226");
        int[] intArray4 = new int[] { (short) 10, (short) 0, 'a', (short) 10 };
        int[] intArray10 = new int[] { 'a', (short) 0, 10, '4', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) '4', (int) (byte) 0);
    }

    @Test
    public void test11227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11227");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { '#', (byte) -1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, 100, (int) (byte) -1);
    }

    @Test
    public void test11228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11228");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 0, 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, 1, (int) (short) 10);
    }

    @Test
    public void test11229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11229");
        int[] intArray3 = new int[] { (short) 1, '#', (short) 10 };
        int[] intArray10 = new int[] { (-1), (short) 1, (short) 0, (-1), (short) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 0, (int) (byte) -1);
    }

    @Test
    public void test11230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11230");
        int[] intArray2 = new int[] { '#', (short) 0 };
        int[] intArray8 = new int[] { ' ', (byte) 1, (byte) 1, (short) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) 100, (int) (byte) 10);
    }

    @Test
    public void test11231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11231");
        int[] intArray2 = new int[] { (byte) 1, (short) -1 };
        int[] intArray6 = new int[] { (short) 100, '4', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) '#', (int) (byte) 1);
    }

    @Test
    public void test11232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11232");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, 100, (int) (byte) 100);
    }

    @Test
    public void test11233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11233");
        int[] intArray2 = new int[] { (-1), (byte) 0 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 1, (int) (byte) 1);
    }

    @Test
    public void test11234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11234");
        int[] intArray5 = new int[] { (byte) 1, '#', (short) 1, 'a', (byte) 1 };
        int[] intArray7 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) '4', (int) (short) -1);
    }

    @Test
    public void test11235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11235");
        int[] intArray5 = new int[] { 0, (byte) 0, (-1), (byte) 10, (short) 0 };
        int[] intArray10 = new int[] { (byte) 0, (byte) 10, (short) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 100, (int) (short) 1);
    }

    @Test
    public void test11236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11236");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (byte) -1, 1);
    }

    @Test
    public void test11237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11237");
        int[] intArray4 = new int[] { (byte) 10, (byte) 10, (short) 100, 0 };
        int[] intArray9 = new int[] { 'a', (short) 1, '#', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) 100, 10);
    }

    @Test
    public void test11238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11238");
        int[] intArray6 = new int[] { (byte) -1, ' ', '4', 10, '#', (short) 100 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (-1), 10);
    }

    @Test
    public void test11239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11239");
        int[] intArray3 = new int[] { 10, (byte) 0, '4' };
        int[] intArray5 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) 1, (int) (byte) 1);
    }

    @Test
    public void test11240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11240");
        int[] intArray1 = new int[] { 10 };
        int[] intArray7 = new int[] { (short) 10, (short) -1, 10, 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, 0, (int) (byte) 1);
    }

    @Test
    public void test11241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11241");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, 100, (int) (short) 100);
    }

    @Test
    public void test11242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11242");
        int[] intArray5 = new int[] { (byte) 1, (short) 10, (-1), '#', 10 };
        int[] intArray7 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, 0, (int) (short) 1);
    }

    @Test
    public void test11243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11243");
        int[] intArray5 = new int[] { (short) -1, 1, ' ', (byte) 0, 100 };
        int[] intArray9 = new int[] { (byte) 0, (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 100, 1);
    }

    @Test
    public void test11244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11244");
        int[] intArray6 = new int[] { 10, (short) -1, (short) -1, (short) 0, 0, (short) 0 };
        int[] intArray8 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (byte) 1, (int) (short) 10);
    }

    @Test
    public void test11245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11245");
        int[] intArray6 = new int[] { 0, 10, (byte) 0, '#', 10, (byte) 10 };
        int[] intArray13 = new int[] { (byte) -1, (byte) 10, 'a', (byte) 10, (byte) 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (short) 0, (-1));
    }

    @Test
    public void test11246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11246");
        int[] intArray5 = new int[] { (short) 10, (byte) 0, (byte) -1, 0, (short) 0 };
        int[] intArray9 = new int[] { (short) 1, 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 100, 1);
    }

    @Test
    public void test11247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11247");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) 0, (byte) 10, '4', 'a', ' ', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) 0, 0);
    }

    @Test
    public void test11248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11248");
        int[] intArray4 = new int[] { (short) 10, 0, '4', (byte) 100 };
        int[] intArray11 = new int[] { (short) 100, 1, ' ', (byte) 0, ' ', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) '#', (int) '4');
    }

    @Test
    public void test11249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11249");
        int[] intArray2 = new int[] { 'a', (-1) };
        int[] intArray9 = new int[] { 10, (short) 100, 100, (byte) 0, ' ', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 1, (int) (short) -1);
    }

    @Test
    public void test11250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11250");
        int[] intArray4 = new int[] { 1, (short) 1, 1, (-1) };
        int[] intArray8 = new int[] { (byte) 0, 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 100, 1);
    }

    @Test
    public void test11251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11251");
        int[] intArray2 = new int[] { (byte) 10, (byte) 1 };
        int[] intArray4 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) 'a', (int) (short) 100);
    }

    @Test
    public void test11252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11252");
        int[] intArray3 = new int[] { 'a', (byte) -1, (byte) -1 };
        int[] intArray7 = new int[] { (byte) 100, 'a', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test11253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11253");
        int[] intArray5 = new int[] { (byte) -1, '#', (byte) 1, (byte) 100, ' ' };
        int[] intArray10 = new int[] { ' ', (short) -1, (byte) 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) '#', (int) '#');
    }

    @Test
    public void test11254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11254");
        int[] intArray6 = new int[] { (byte) 1, '4', (byte) 10, '#', ' ', 1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) -1, (int) '4');
    }

    @Test
    public void test11255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11255");
        int[] intArray5 = new int[] { (-1), '4', (byte) 1, 'a', (byte) 0 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) ' ', (int) (short) -1);
    }

    @Test
    public void test11256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11256");
        int[] intArray2 = new int[] { (short) 1, ' ' };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) '#', (int) (short) 1);
    }

    @Test
    public void test11257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11257");
        int[] intArray3 = new int[] { (byte) 10, (byte) 100, (byte) 10 };
        int[] intArray10 = new int[] { (-1), (short) -1, '#', 1, '4', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) 'a', 1);
    }

    @Test
    public void test11258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11258");
        int[] intArray4 = new int[] { ' ', (short) 10, (short) 1, '#' };
        int[] intArray10 = new int[] { '#', (byte) 100, (byte) 0, ' ', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) -1, (int) (short) 100);
    }

    @Test
    public void test11259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11259");
        int[] intArray2 = new int[] { 1, ' ' };
        int[] intArray8 = new int[] { 100, (short) -1, (short) -1, (byte) 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) -1, (int) 'a');
    }

    @Test
    public void test11260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11260");
        int[] intArray5 = new int[] { (byte) 1, (short) 0, 0, '4', (short) -1 };
        int[] intArray10 = new int[] { 100, (short) -1, 'a', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) ' ', 10);
    }

    @Test
    public void test11261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11261");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray5 = new int[] { (byte) 0, (short) 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) '#', (int) (byte) -1);
    }

    @Test
    public void test11262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11262");
        int[] intArray3 = new int[] { (byte) 0, 0, 10 };
        int[] intArray8 = new int[] { 0, 100, 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test11263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11263");
        int[] intArray5 = new int[] { (byte) 0, (short) 1, (byte) 1, 1, (short) 100 };
        int[] intArray12 = new int[] { ' ', (byte) 100, 100, (short) 100, ' ', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) -1, 0);
    }

    @Test
    public void test11264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11264");
        int[] intArray3 = new int[] { (short) 1, (short) -1, ' ' };
        int[] intArray7 = new int[] { (-1), (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) 0, (int) (short) 1);
    }

    @Test
    public void test11265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11265");
        int[] intArray2 = new int[] { (byte) 10, (short) 1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 0, (int) ' ');
    }

    @Test
    public void test11266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11266");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { '4', (byte) 0, (byte) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test11267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11267");
        int[] intArray2 = new int[] { 10, (short) -1 };
        int[] intArray5 = new int[] { (byte) -1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (byte) 1, (int) (byte) 1);
    }

    @Test
    public void test11268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11268");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray6 = new int[] { (-1), (short) 1, (byte) -1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 100, (int) (byte) 1);
    }

    @Test
    public void test11269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11269");
        int[] intArray6 = new int[] { '4', (byte) -1, (byte) 10, (byte) 10, 10, 1 };
        int[] intArray8 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (byte) -1, 10);
    }

    @Test
    public void test11270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11270");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray6 = new int[] { (short) 0, (byte) 10, (byte) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 0, 0);
    }

    @Test
    public void test11271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11271");
        int[] intArray2 = new int[] { 'a', (byte) 0 };
        int[] intArray8 = new int[] { 0, (-1), (byte) -1, (short) -1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) -1, (int) (byte) 0);
    }

    @Test
    public void test11272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11272");
        int[] intArray2 = new int[] { '#', (short) 100 };
        int[] intArray4 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) '#', 0);
    }

    @Test
    public void test11273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11273");
        int[] intArray6 = new int[] { (short) 0, '4', (short) 1, '4', (short) 10, (short) 1 };
        int[] intArray8 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 1, 1);
    }

    @Test
    public void test11274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11274");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) 'a', (int) '#');
    }

    @Test
    public void test11275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11275");
        int[] intArray4 = new int[] { (-1), 0, (-1), (short) -1 };
        int[] intArray7 = new int[] { (-1), (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) 0, (int) (short) 1);
    }

    @Test
    public void test11276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11276");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray6 = new int[] { (byte) 10, '#', 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) '#', (int) (short) 0);
    }

    @Test
    public void test11277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11277");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray8 = new int[] { '4', (short) -1, (byte) 100, '4', (byte) -1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) '4', (int) (byte) 1);
    }

    @Test
    public void test11278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11278");
        int[] intArray6 = new int[] { (short) 10, (byte) 1, 1, (byte) 0, (byte) 0, (short) 0 };
        int[] intArray9 = new int[] { '#', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, 10, 0);
    }

    @Test
    public void test11279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11279");
        int[] intArray5 = new int[] { (byte) 1, ' ', 10, ' ', (byte) -1 };
        int[] intArray12 = new int[] { (-1), 'a', (byte) 10, 1, (byte) 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) 0, (int) (short) 1);
    }

    @Test
    public void test11280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11280");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (-1), (byte) 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test11281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11281");
        int[] intArray5 = new int[] { 0, (byte) 1, (byte) 1, 1, 0 };
        int[] intArray12 = new int[] { (byte) 0, '#', '#', (short) 0, 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) -1, (int) (short) 100);
    }

    @Test
    public void test11282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11282");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { ' ', (short) 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) 100, 100);
    }

    @Test
    public void test11283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11283");
        int[] intArray4 = new int[] { (byte) 0, (byte) 10, '#', (byte) 0 };
        int[] intArray6 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) 'a', (-1));
    }

    @Test
    public void test11284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11284");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 'a', (byte) 100, 1, 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) -1, (int) 'a');
    }

    @Test
    public void test11285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11285");
        int[] intArray4 = new int[] { (-1), 0, 10, 'a' };
        int[] intArray6 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, 10, (int) (byte) -1);
    }

    @Test
    public void test11286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11286");
        int[] intArray6 = new int[] { (byte) 0, 1, ' ', 0, (byte) 10, (-1) };
        int[] intArray8 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 100, (int) (short) 0);
    }

    @Test
    public void test11287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11287");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 1, (short) 100 };
        int[] intArray9 = new int[] { 0, 100, (byte) 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) 100, 1);
    }

    @Test
    public void test11288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11288");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray7 = new int[] { 1, '#', (short) 1, (-1), (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) 'a', (int) (short) 1);
    }

    @Test
    public void test11289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11289");
        int[] intArray5 = new int[] { (byte) 1, (-1), (byte) 1, (byte) 0, (byte) 1 };
        int[] intArray9 = new int[] { 100, (-1), (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 0, 1);
    }

    @Test
    public void test11290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11290");
        int[] intArray3 = new int[] { ' ', (byte) 10, (byte) 1 };
        int[] intArray9 = new int[] { (-1), ' ', 1, (-1), 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 0, (int) (byte) 1);
    }

    @Test
    public void test11291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11291");
        int[] intArray5 = new int[] { 10, (short) 1, (short) 0, (byte) 10, 10 };
        int[] intArray12 = new int[] { 0, ' ', (short) -1, (short) -1, 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) -1, (int) (short) 0);
    }

    @Test
    public void test11292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11292");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, 10, (int) (short) 0);
    }

    @Test
    public void test11293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11293");
        int[] intArray4 = new int[] { 10, 100, 100, (short) -1 };
        int[] intArray11 = new int[] { 0, (short) 10, (byte) 100, 100, ' ', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) 0, (int) (byte) 1);
    }

    @Test
    public void test11294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11294");
        int[] intArray2 = new int[] { ' ', 10 };
        int[] intArray6 = new int[] { (short) -1, (byte) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (short) 10, (int) (short) 10);
    }

    @Test
    public void test11295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11295");
        int[] intArray2 = new int[] { '4', (short) 10 };
        int[] intArray7 = new int[] { (byte) 10, (byte) 100, (-1), (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) 'a', 100);
    }

    @Test
    public void test11296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11296");
        int[] intArray4 = new int[] { (short) 10, '#', (short) 1, (short) 100 };
        int[] intArray9 = new int[] { '#', (short) 0, (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) '4', (int) (byte) 1);
    }

    @Test
    public void test11297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11297");
        int[] intArray2 = new int[] { (short) 1, 100 };
        int[] intArray6 = new int[] { 0, (short) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (-1), (int) '#');
    }

    @Test
    public void test11298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11298");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (short) 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 100, (int) (short) 1);
    }

    @Test
    public void test11299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11299");
        int[] intArray3 = new int[] { (-1), 'a', (byte) 1 };
        int[] intArray9 = new int[] { (short) 100, (short) 1, (short) 0, 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) '4', (int) '#');
    }

    @Test
    public void test11300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11300");
        int[] intArray2 = new int[] { (byte) 100, ' ' };
        int[] intArray9 = new int[] { 0, (byte) 10, (short) 0, (byte) -1, 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 0, (int) (short) 0);
    }

    @Test
    public void test11301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11301");
        int[] intArray2 = new int[] { 10, ' ' };
        int[] intArray7 = new int[] { 'a', (byte) 1, (short) -1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 10, (int) 'a');
    }

    @Test
    public void test11302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11302");
        int[] intArray4 = new int[] { (short) -1, (byte) 10, (short) -1, (short) -1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (byte) 1, (int) (byte) 100);
    }

    @Test
    public void test11303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11303");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) 10, (short) 10, '4', '4', (short) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) 0, (int) (byte) 100);
    }

    @Test
    public void test11304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11304");
        int[] intArray6 = new int[] { (byte) 1, 100, (byte) 100, (byte) 10, ' ', ' ' };
        int[] intArray10 = new int[] { 10, (byte) 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (-1), 10);
    }

    @Test
    public void test11305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11305");
        int[] intArray1 = new int[] { 1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) 'a', 0);
    }

    @Test
    public void test11306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11306");
        int[] intArray2 = new int[] { 'a', 'a' };
        int[] intArray8 = new int[] { (byte) 0, 1, (short) -1, (short) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 10, (int) (byte) 10);
    }

    @Test
    public void test11307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11307");
        int[] intArray2 = new int[] { '#', (short) 100 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 0, (int) (short) 100);
    }

    @Test
    public void test11308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11308");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray7 = new int[] { (short) 10, (short) -1, (short) 0, (byte) 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) ' ', (int) (short) 1);
    }

    @Test
    public void test11309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11309");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test11310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11310");
        int[] intArray5 = new int[] { (short) -1, (byte) 100, '#', (byte) 0, '4' };
        int[] intArray9 = new int[] { (byte) 1, 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 0, (int) (byte) 0);
    }

    @Test
    public void test11311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11311");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test11312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11312");
        int[] intArray2 = new int[] { (short) 100, ' ' };
        int[] intArray7 = new int[] { 0, '4', (short) 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 0, (int) (byte) 10);
    }

    @Test
    public void test11313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11313");
        int[] intArray3 = new int[] { (byte) 100, 10, '#' };
        int[] intArray10 = new int[] { (byte) -1, 100, (byte) 10, 100, (byte) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) '#', 0);
    }

    @Test
    public void test11314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11314");
        int[] intArray3 = new int[] { (byte) 0, 10, (byte) -1 };
        int[] intArray5 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) 'a', (-1));
    }

    @Test
    public void test11315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11315");
        int[] intArray4 = new int[] { (short) 100, (byte) 100, ' ', (byte) 10 };
        int[] intArray8 = new int[] { (byte) 10, 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) '4', 0);
    }

    @Test
    public void test11316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11316");
        int[] intArray6 = new int[] { (byte) 100, 1, (short) 0, 1, 100, (short) 1 };
        int[] intArray9 = new int[] { '4', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, 1, (int) '4');
    }

    @Test
    public void test11317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11317");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray8 = new int[] { (byte) 0, 1, (byte) 0, (short) 100, (byte) 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) 100, (int) '#');
    }

    @Test
    public void test11318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11318");
        int[] intArray6 = new int[] { (short) 10, '#', '#', 0, (byte) 0, 0 };
        int[] intArray9 = new int[] { 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, 100, (int) (short) 1);
    }

    @Test
    public void test11319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11319");
        int[] intArray6 = new int[] { 'a', (byte) 10, 10, (short) 100, 100, 10 };
        int[] intArray8 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) ' ', (int) (short) 10);
    }

    @Test
    public void test11320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11320");
        int[] intArray4 = new int[] { 100, (byte) 100, 10, 1 };
        int[] intArray7 = new int[] { (byte) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) 1, 100);
    }

    @Test
    public void test11321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11321");
        int[] intArray6 = new int[] { 100, (byte) 100, (short) 100, '#', '#', (byte) 100 };
        int[] intArray13 = new int[] { (byte) 1, (short) 100, 1, ' ', (-1), (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (short) 1, (int) ' ');
    }

    @Test
    public void test11322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11322");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray8 = new int[] { (byte) 1, '#', '4', 10, (short) 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) 'a', (-1));
    }

    @Test
    public void test11323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11323");
        int[] intArray6 = new int[] { ' ', 1, (byte) 10, 0, '#', (byte) 0 };
        int[] intArray9 = new int[] { 'a', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 10, (int) (byte) 10);
    }

    @Test
    public void test11324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11324");
        int[] intArray5 = new int[] { (byte) 100, '4', (-1), (short) 10, 10 };
        int[] intArray11 = new int[] { 'a', (short) 1, '#', (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (-1), (-1));
    }

    @Test
    public void test11325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11325");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (byte) 1, 100, 10, 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) -1, (-1));
    }

    @Test
    public void test11326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11326");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        int[] intArray7 = new int[] { (byte) 10, (short) 10, '4', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 0, 100);
    }

    @Test
    public void test11327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11327");
        int[] intArray4 = new int[] { '4', 1, (byte) 1, '#' };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (byte) 10, (int) (byte) 10);
    }

    @Test
    public void test11328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11328");
        int[] intArray2 = new int[] { (-1), (byte) 0 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 10, 1);
    }

    @Test
    public void test11329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11329");
        int[] intArray1 = new int[] { '4' };
        int[] intArray7 = new int[] { (short) 1, (-1), ' ', 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) -1, (int) 'a');
    }

    @Test
    public void test11330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11330");
        int[] intArray5 = new int[] { 100, '4', 10, '4', ' ' };
        int[] intArray8 = new int[] { 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) 100, (int) '#');
    }

    @Test
    public void test11331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11331");
        int[] intArray4 = new int[] { 100, 0, (byte) 1, (byte) -1 };
        int[] intArray8 = new int[] { (short) 10, (byte) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 1, (int) '#');
    }

    @Test
    public void test11332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11332");
        int[] intArray4 = new int[] { (short) -1, 0, (byte) 0, 10 };
        int[] intArray8 = new int[] { 'a', 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 0, 0);
    }

    @Test
    public void test11333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11333");
        int[] intArray3 = new int[] { 10, (byte) 10, ' ' };
        int[] intArray9 = new int[] { (short) 1, (short) -1, (short) 100, (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test11334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11334");
        int[] intArray6 = new int[] { '4', 10, '#', (-1), (byte) 100, 10 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) -1, (int) (short) 100);
    }

    @Test
    public void test11335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11335");
        int[] intArray4 = new int[] { (byte) 100, (byte) 1, (byte) 10, (short) 1 };
        int[] intArray6 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 100, (int) (short) 100);
    }

    @Test
    public void test11336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11336");
        int[] intArray2 = new int[] { 1, (byte) 10 };
        int[] intArray6 = new int[] { 'a', (short) 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (short) 10, (int) (byte) 1);
    }

    @Test
    public void test11337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11337");
        int[] intArray4 = new int[] { 100, (byte) 100, 1, 100 };
        int[] intArray10 = new int[] { (byte) 0, 10, (short) 0, (byte) 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, 1, (int) (short) 0);
    }

    @Test
    public void test11338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11338");
        int[] intArray6 = new int[] { 0, 10, (byte) 100, ' ', (short) 0, 100 };
        int[] intArray12 = new int[] { 100, (-1), (short) 0, (short) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 10, (int) (short) -1);
    }

    @Test
    public void test11339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11339");
        int[] intArray6 = new int[] { (-1), 0, 100, 'a', (byte) 0, (byte) 100 };
        int[] intArray10 = new int[] { '#', '4', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) 1, (int) (byte) 1);
    }

    @Test
    public void test11340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11340");
        int[] intArray4 = new int[] { 100, 'a', 0, (byte) 0 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (byte) 10, (int) 'a');
    }

    @Test
    public void test11341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11341");
        int[] intArray2 = new int[] { (short) -1, ' ' };
        int[] intArray9 = new int[] { '4', '4', 0, (short) 10, (byte) 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 1, (int) (short) 100);
    }

    @Test
    public void test11342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11342");
        int[] intArray2 = new int[] { 10, (byte) 0 };
        int[] intArray4 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (short) 10, (int) (byte) 0);
    }

    @Test
    public void test11343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11343");
        int[] intArray5 = new int[] { 1, (byte) 0, '4', (short) 0, 0 };
        int[] intArray12 = new int[] { (byte) 10, (short) 10, (short) 1, '#', (short) 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, 100, 100);
    }

    @Test
    public void test11344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11344");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray4 = new int[] { (-1), (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test11345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11345");
        int[] intArray3 = new int[] { (byte) 100, 10, (short) 10 };
        int[] intArray6 = new int[] { (short) 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) -1, 1);
    }

    @Test
    public void test11346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11346");
        int[] intArray5 = new int[] { (short) 100, '#', 1, 1, ' ' };
        int[] intArray7 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (short) 100, (int) 'a');
    }

    @Test
    public void test11347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11347");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray6 = new int[] { (byte) 100, 1, (byte) 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (short) -1, (int) ' ');
    }

    @Test
    public void test11348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11348");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 'a', (byte) 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) 0, (int) (short) 1);
    }

    @Test
    public void test11349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11349");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray5 = new int[] { (byte) 1, 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) 10, 0);
    }

    @Test
    public void test11350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11350");
        int[] intArray2 = new int[] { (short) 1, (short) 1 };
        int[] intArray6 = new int[] { 10, (short) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (short) 0, (int) '4');
    }

    @Test
    public void test11351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11351");
        int[] intArray3 = new int[] { '#', (byte) 1, 1 };
        int[] intArray5 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) 0, (int) (short) 1);
    }

    @Test
    public void test11352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11352");
        int[] intArray5 = new int[] { '#', (short) 1, (short) 100, ' ', (short) 1 };
        int[] intArray8 = new int[] { 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) 100, (int) ' ');
    }

    @Test
    public void test11353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11353");
        int[] intArray6 = new int[] { (byte) 0, (byte) 0, ' ', 100, 'a', 100 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) 1, (int) (byte) 10);
    }

    @Test
    public void test11354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11354");
        int[] intArray4 = new int[] { 10, (short) -1, (short) 100, (short) 1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (byte) 0, (int) (short) -1);
    }

    @Test
    public void test11355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11355");
        int[] intArray2 = new int[] { (byte) 10, (byte) 10 };
        int[] intArray5 = new int[] { ' ', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 10, (int) (byte) 100);
    }

    @Test
    public void test11356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11356");
        int[] intArray5 = new int[] { ' ', 1, (short) 1, '4', (byte) -1 };
        int[] intArray11 = new int[] { (short) 10, '#', 10, (short) 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 10, (int) (byte) 100);
    }

    @Test
    public void test11357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11357");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int[] intArray9 = new int[] { (byte) -1, '4', (short) 100, (short) 1, 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 1, (int) (short) 1);
    }

    @Test
    public void test11358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11358");
        int[] intArray3 = new int[] { 100, (byte) 1, '4' };
        int[] intArray8 = new int[] { '#', 10, (-1), (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (byte) 1, 0);
    }

    @Test
    public void test11359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11359");
        int[] intArray5 = new int[] { '4', (short) 1, (byte) 1, (-1), ' ' };
        int[] intArray10 = new int[] { (-1), '4', '#', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) 'a', (int) (short) 1);
    }

    @Test
    public void test11360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11360");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray5 = new int[] { ' ', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 10, (-1));
    }

    @Test
    public void test11361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11361");
        int[] intArray6 = new int[] { 0, (short) -1, 'a', (short) 10, 1, (byte) -1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) 0, (int) (short) 10);
    }

    @Test
    public void test11362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11362");
        int[] intArray4 = new int[] { 0, 100, '4', (byte) 0 };
        int[] intArray9 = new int[] { (short) 100, (byte) 10, 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (byte) 10, 0);
    }

    @Test
    public void test11363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11363");
        int[] intArray5 = new int[] { (byte) 0, 1, (byte) 0, 0, (byte) 0 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) -1, (int) (short) -1);
    }

    @Test
    public void test11364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11364");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray6 = new int[] { (short) 0, (byte) 0, 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) '#', 1);
    }

    @Test
    public void test11365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11365");
        int[] intArray2 = new int[] { (byte) 0, (short) 1 };
        int[] intArray8 = new int[] { ' ', (short) 10, (short) 100, (byte) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (byte) 100, (int) (byte) -1);
    }

    @Test
    public void test11366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11366");
        int[] intArray3 = new int[] { 'a', '#', (short) 1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) ' ', (int) 'a');
    }

    @Test
    public void test11367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11367");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, 0, (int) (short) 10);
    }

    @Test
    public void test11368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11368");
        int[] intArray4 = new int[] { (byte) 10, 'a', '#', 0 };
        int[] intArray8 = new int[] { (short) 10, (byte) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 0, 0);
    }

    @Test
    public void test11369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11369");
        int[] intArray3 = new int[] { (byte) 1, 100, (byte) 100 };
        int[] intArray6 = new int[] { (byte) -1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test11370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11370");
        int[] intArray5 = new int[] { (short) 100, '#', 0, (byte) 100, 100 };
        int[] intArray7 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) ' ', (int) (byte) -1);
    }

    @Test
    public void test11371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11371");
        int[] intArray6 = new int[] { (short) 0, 1, (byte) 100, 100, 100, (byte) 1 };
        int[] intArray10 = new int[] { (byte) 100, (-1), 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) 1, 10);
    }

    @Test
    public void test11372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11372");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (byte) 0, 100);
    }

    @Test
    public void test11373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11373");
        int[] intArray6 = new int[] { ' ', 10, '#', (short) 10, (byte) -1, 10 };
        int[] intArray13 = new int[] { ' ', (short) 0, (short) 0, (byte) 10, 'a', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (short) 100, (int) (byte) 10);
    }

    @Test
    public void test11374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11374");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray3 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) 100, (int) '4');
    }

    @Test
    public void test11375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11375");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) 100, 1, '4', (byte) 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) -1, 1);
    }

    @Test
    public void test11376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11376");
        int[] intArray5 = new int[] { (short) 0, '#', (byte) 0, (short) 1, (short) 1 };
        int[] intArray12 = new int[] { 'a', (byte) 0, (short) 100, 10, (byte) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) 0, (int) (byte) -1);
    }

    @Test
    public void test11377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11377");
        int[] intArray1 = new int[] { '#' };
        int[] intArray7 = new int[] { ' ', (byte) 0, (short) -1, (-1), 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) 10, (int) '4');
    }

    @Test
    public void test11378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11378");
        int[] intArray4 = new int[] { (byte) 100, (byte) 0, (short) 1, (short) 0 };
        int[] intArray7 = new int[] { (short) -1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) 100, (int) (short) 0);
    }

    @Test
    public void test11379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11379");
        int[] intArray5 = new int[] { (byte) -1, (short) 1, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray8 = new int[] { (byte) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) 1, (int) (short) 100);
    }

    @Test
    public void test11380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11380");
        int[] intArray3 = new int[] { (byte) 10, (short) -1, (byte) 0 };
        int[] intArray5 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (-1), (int) (short) -1);
    }

    @Test
    public void test11381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11381");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 1, (short) 10, 'a', 100, (short) 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) -1, 100);
    }

    @Test
    public void test11382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11382");
        int[] intArray5 = new int[] { 'a', (-1), (byte) 0, 0, (byte) -1 };
        int[] intArray9 = new int[] { 1, (byte) 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 0, (int) 'a');
    }

    @Test
    public void test11383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11383");
        int[] intArray5 = new int[] { (byte) 0, (short) 0, (short) 0, (short) 100, (-1) };
        int[] intArray10 = new int[] { '#', (byte) 10, (byte) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) 'a', (-1));
    }

    @Test
    public void test11384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11384");
        int[] intArray5 = new int[] { (-1), (short) -1, 0, (short) 100, (byte) 0 };
        int[] intArray12 = new int[] { 10, 100, (-1), (-1), (short) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) 1, (int) (byte) 1);
    }

    @Test
    public void test11385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11385");
        int[] intArray2 = new int[] { ' ', (short) 100 };
        int[] intArray7 = new int[] { (byte) 10, (byte) 0, (short) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) '#', (int) '4');
    }

    @Test
    public void test11386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11386");
        int[] intArray6 = new int[] { (short) 100, (byte) 100, 0, 100, (byte) -1, (short) -1 };
        int[] intArray9 = new int[] { (short) 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (short) 0, (int) (byte) 0);
    }

    @Test
    public void test11387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11387");
        int[] intArray4 = new int[] { 10, '#', (short) 10, 10 };
        int[] intArray7 = new int[] { 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) 0, 100);
    }

    @Test
    public void test11388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11388");
        int[] intArray5 = new int[] { 'a', (byte) 10, '4', 100, 10 };
        int[] intArray10 = new int[] { '#', 100, (short) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (byte) -1, (int) (short) 10);
    }

    @Test
    public void test11389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11389");
        int[] intArray6 = new int[] { ' ', (byte) 100, (byte) -1, (short) -1, (byte) 1, (short) 100 };
        int[] intArray11 = new int[] { 'a', (byte) 1, (byte) 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 1, (int) (short) -1);
    }

    @Test
    public void test11390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11390");
        int[] intArray4 = new int[] { (byte) 1, 10, 1, 10 };
        int[] intArray6 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) '#', 0);
    }

    @Test
    public void test11391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11391");
        int[] intArray5 = new int[] { (short) -1, (byte) -1, (short) 1, ' ', (byte) 0 };
        int[] intArray11 = new int[] { 'a', (short) 1, '4', '#', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 0, (int) '4');
    }

    @Test
    public void test11392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11392");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (short) 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (byte) 10, (int) (byte) 0);
    }

    @Test
    public void test11393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11393");
        int[] intArray5 = new int[] { (byte) -1, 0, (byte) -1, 'a', '4' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) 0, (int) (short) -1);
    }

    @Test
    public void test11394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11394");
        int[] intArray5 = new int[] { 100, (byte) -1, 1, 1, (short) -1 };
        int[] intArray7 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test11395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11395");
        int[] intArray3 = new int[] { (short) 1, (-1), 100 };
        int[] intArray6 = new int[] { 'a', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) 10, (-1));
    }

    @Test
    public void test11396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11396");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 1, (short) 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) 100, (int) (byte) 100);
    }

    @Test
    public void test11397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11397");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) 1, (byte) 1, (short) 100, '#', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, 100, (int) (byte) 100);
    }

    @Test
    public void test11398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11398");
        int[] intArray3 = new int[] { (byte) 10, (short) 1, 0 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (-1), 100);
    }

    @Test
    public void test11399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11399");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { ' ', (short) 0, (short) 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 100, (int) (byte) 10);
    }

    @Test
    public void test11400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11400");
        int[] intArray3 = new int[] { (short) -1, '#', '#' };
        int[] intArray5 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) 10, 10);
    }

    @Test
    public void test11401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11401");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray3 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (-1), (-1));
    }

    @Test
    public void test11402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11402");
        int[] intArray4 = new int[] { ' ', (byte) 1, (byte) -1, (short) 0 };
        int[] intArray6 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (-1), (int) 'a');
    }

    @Test
    public void test11403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11403");
        int[] intArray4 = new int[] { (byte) 0, (byte) -1, 0, (-1) };
        int[] intArray9 = new int[] { (byte) 10, 100, (short) 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 1, (int) (short) -1);
    }

    @Test
    public void test11404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11404");
        int[] intArray6 = new int[] { (byte) 10, (short) 100, 1, 0, (byte) 1, (byte) 1 };
        int[] intArray8 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) '4', (int) '#');
    }

    @Test
    public void test11405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11405");
        int[] intArray5 = new int[] { 0, (-1), (short) 100, (byte) 0, ' ' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) ' ', (int) (short) 10);
    }

    @Test
    public void test11406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11406");
        int[] intArray3 = new int[] { (-1), ' ', 1 };
        int[] intArray10 = new int[] { ' ', '#', (byte) 100, (short) 10, '#', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (byte) 10, 1);
    }

    @Test
    public void test11407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11407");
        int[] intArray2 = new int[] { (byte) 10, '4' };
        int[] intArray5 = new int[] { (byte) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 0, 10);
    }

    @Test
    public void test11408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11408");
        int[] intArray3 = new int[] { 'a', '4', (-1) };
        int[] intArray5 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) '4', (int) (byte) 0);
    }

    @Test
    public void test11409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11409");
        int[] intArray3 = new int[] { (short) -1, (byte) -1, (byte) 1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (byte) 10, (int) (byte) 10);
    }

    @Test
    public void test11410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11410");
        int[] intArray5 = new int[] { (short) 1, (short) 0, (short) 1, (short) 100, (byte) 0 };
        int[] intArray9 = new int[] { 1, (byte) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) '#', (int) (byte) 10);
    }

    @Test
    public void test11411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11411");
        int[] intArray4 = new int[] { 1, '4', (-1), '#' };
        int[] intArray9 = new int[] { (short) 1, (byte) 0, 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 0, (int) (byte) 100);
    }

    @Test
    public void test11412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11412");
        int[] intArray3 = new int[] { 0, (byte) 1, (byte) 100 };
        int[] intArray10 = new int[] { 1, (short) 0, (byte) 1, '4', (short) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 0, (int) (byte) 10);
    }

    @Test
    public void test11413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11413");
        int[] intArray5 = new int[] { 100, (short) 100, (byte) 10, (short) -1, '4' };
        int[] intArray8 = new int[] { (short) 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) 1, (int) (byte) 10);
    }

    @Test
    public void test11414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11414");
        int[] intArray4 = new int[] { (short) 0, (byte) 0, (-1), (byte) 0 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (byte) 100, (-1));
    }

    @Test
    public void test11415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11415");
        int[] intArray3 = new int[] { (byte) 100, (short) 0, 0 };
        int[] intArray10 = new int[] { (byte) 100, '4', (short) -1, '4', 'a', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 0, (int) (byte) 1);
    }

    @Test
    public void test11416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11416");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) 100, (int) '#');
    }

    @Test
    public void test11417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11417");
        int[] intArray6 = new int[] { (short) -1, '4', 10, 1, 1, '#' };
        int[] intArray13 = new int[] { ' ', (short) -1, 0, (short) -1, (short) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 100, (int) (short) -1);
    }

    @Test
    public void test11418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11418");
        int[] intArray5 = new int[] { '#', 1, (-1), '4', (short) 100 };
        int[] intArray8 = new int[] { 'a', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) 0, 10);
    }

    @Test
    public void test11419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11419");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 0, (int) (byte) -1);
    }

    @Test
    public void test11420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11420");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (byte) 1, (int) '#');
    }

    @Test
    public void test11421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11421");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) 100, (int) (byte) 100);
    }

    @Test
    public void test11422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11422");
        int[] intArray3 = new int[] { (byte) 1, 0, (byte) 1 };
        int[] intArray9 = new int[] { (-1), (short) 100, (byte) 1, 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 0, (int) 'a');
    }

    @Test
    public void test11423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11423");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray3 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (byte) 1, (int) ' ');
    }

    @Test
    public void test11424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11424");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray6 = new int[] { 'a', 0, '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (-1), (int) (byte) 100);
    }

    @Test
    public void test11425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11425");
        int[] intArray5 = new int[] { 0, '#', (short) -1, (short) 100, 'a' };
        int[] intArray9 = new int[] { (byte) 10, (short) -1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 10, (-1));
    }

    @Test
    public void test11426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11426");
        int[] intArray2 = new int[] { (-1), (short) -1 };
        int[] intArray9 = new int[] { (byte) 100, (short) 10, 100, 100, (short) -1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (short) 10, (int) (byte) 0);
    }

    @Test
    public void test11427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11427");
        int[] intArray6 = new int[] { (short) 1, ' ', (byte) 1, (byte) 10, (short) 0, 10 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, 10, (int) (short) -1);
    }

    @Test
    public void test11428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11428");
        int[] intArray5 = new int[] { 10, (short) 1, 1, (short) 0, 10 };
        int[] intArray10 = new int[] { (byte) 10, 1, (short) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) '#', (int) 'a');
    }

    @Test
    public void test11429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11429");
        int[] intArray2 = new int[] { (short) 0, '4' };
        int[] intArray5 = new int[] { (short) 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) 'a', 100);
    }

    @Test
    public void test11430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11430");
        int[] intArray1 = new int[] { 10 };
        int[] intArray4 = new int[] { 'a', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (-1), (int) 'a');
    }

    @Test
    public void test11431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11431");
        int[] intArray4 = new int[] { 0, 1, (byte) 0, (byte) -1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (byte) 1, (int) (byte) -1);
    }

    @Test
    public void test11432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11432");
        int[] intArray4 = new int[] { '4', (byte) -1, 10, (short) 100 };
        int[] intArray7 = new int[] { 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) 'a', (int) (byte) 0);
    }

    @Test
    public void test11433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11433");
        int[] intArray5 = new int[] { (byte) 1, (short) -1, (short) 0, 100, (short) 0 };
        int[] intArray9 = new int[] { (byte) 10, 'a', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) '#', (int) (short) 100);
    }

    @Test
    public void test11434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11434");
        int[] intArray6 = new int[] { 10, 0, 1, (short) 1, (byte) 100, ' ' };
        int[] intArray9 = new int[] { (short) 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, 0, (int) (short) -1);
    }

    @Test
    public void test11435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11435");
        int[] intArray6 = new int[] { 0, (byte) 1, ' ', 0, 'a', (byte) 10 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) 10, (int) (short) 1);
    }

    @Test
    public void test11436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11436");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray3 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, 0, (int) (short) 1);
    }

    @Test
    public void test11437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11437");
        int[] intArray2 = new int[] { '#', (short) 100 };
        int[] intArray6 = new int[] { (byte) 1, ' ', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (short) 0, (int) '4');
    }

    @Test
    public void test11438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11438");
        int[] intArray6 = new int[] { (byte) 100, (byte) 0, 1, ' ', ' ', (short) 1 };
        int[] intArray8 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 0, (int) (short) 10);
    }

    @Test
    public void test11439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11439");
        int[] intArray3 = new int[] { (short) 1, 10, (byte) 0 };
        int[] intArray10 = new int[] { 10, (short) 10, (byte) 10, (byte) -1, (-1), 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 1, (-1));
    }

    @Test
    public void test11440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11440");
        int[] intArray6 = new int[] { 'a', (byte) 10, (short) -1, (-1), ' ', 'a' };
        int[] intArray9 = new int[] { 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) 'a', (int) (byte) 10);
    }

    @Test
    public void test11441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11441");
        int[] intArray6 = new int[] { '4', (byte) 100, '4', (short) 100, (short) 100, ' ' };
        int[] intArray8 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) -1, (int) (byte) 100);
    }

    @Test
    public void test11442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11442");
        int[] intArray5 = new int[] { '4', ' ', (byte) 100, 0, (short) 100 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (short) 1, (int) '4');
    }

    @Test
    public void test11443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11443");
        int[] intArray3 = new int[] { 0, 0, 1 };
        int[] intArray7 = new int[] { '#', ' ', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) ' ', (int) (short) 0);
    }

    @Test
    public void test11444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11444");
        int[] intArray6 = new int[] { 100, (short) 0, 10, (-1), 1, 10 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, 0, (int) '#');
    }

    @Test
    public void test11445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11445");
        int[] intArray4 = new int[] { '#', (short) 1, (byte) -1, (short) 0 };
        int[] intArray7 = new int[] { (short) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) 10, 0);
    }

    @Test
    public void test11446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11446");
        int[] intArray3 = new int[] { 1, ' ', '#' };
        int[] intArray8 = new int[] { (byte) 10, (byte) 1, (-1), (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (-1), (int) (short) 0);
    }

    @Test
    public void test11447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11447");
        int[] intArray4 = new int[] { (short) 0, 1, (short) 0, (-1) };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (short) 10, (int) (byte) 10);
    }

    @Test
    public void test11448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11448");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) 1, (int) '4');
    }

    @Test
    public void test11449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11449");
        int[] intArray2 = new int[] { (byte) 100, (byte) 100 };
        int[] intArray7 = new int[] { 0, (byte) 10, 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 10, (int) (short) -1);
    }

    @Test
    public void test11450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11450");
        int[] intArray6 = new int[] { (byte) -1, '4', (short) 100, (short) -1, 100, (byte) 100 };
        int[] intArray13 = new int[] { (short) 0, (short) -1, (short) 100, (byte) -1, '#', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (-1), (int) (short) 10);
    }

    @Test
    public void test11451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11451");
        int[] intArray1 = new int[] { 100 };
        int[] intArray8 = new int[] { (byte) 1, (short) 0, ' ', 0, (short) 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) 100, (int) (short) 100);
    }

    @Test
    public void test11452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11452");
        int[] intArray6 = new int[] { (byte) 10, ' ', 10, (short) -1, (short) 1, (byte) 100 };
        int[] intArray11 = new int[] { (byte) -1, (short) 0, 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 10, 10);
    }

    @Test
    public void test11453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11453");
        int[] intArray3 = new int[] { (short) 0, (short) 1, (short) -1 };
        int[] intArray5 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) 100, (int) (short) 0);
    }

    @Test
    public void test11454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11454");
        int[] intArray5 = new int[] { 1, 0, ' ', (short) 10, 0 };
        int[] intArray12 = new int[] { 100, 'a', 1, 100, 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (byte) 0, (int) (short) -1);
    }

    @Test
    public void test11455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11455");
        int[] intArray5 = new int[] { (byte) 0, 0, (-1), (byte) 10, 0 };
        int[] intArray8 = new int[] { (short) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) 1, 10);
    }

    @Test
    public void test11456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11456");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) 100, (int) (byte) -1);
    }

    @Test
    public void test11457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11457");
        int[] intArray4 = new int[] { 'a', (short) 0, (byte) 100, '4' };
        int[] intArray9 = new int[] { (short) -1, (byte) -1, (-1), '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (-1), 0);
    }

    @Test
    public void test11458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11458");
        int[] intArray3 = new int[] { (short) 10, '#', (short) 10 };
        int[] intArray8 = new int[] { ' ', '#', '#', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (-1), 100);
    }

    @Test
    public void test11459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11459");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray8 = new int[] { (short) 0, (-1), (short) 0, 'a', (short) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 1, (int) (short) 0);
    }

    @Test
    public void test11460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11460");
        int[] intArray2 = new int[] { 'a', 'a' };
        int[] intArray7 = new int[] { 0, (byte) 1, (byte) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (short) 100, (int) 'a');
    }

    @Test
    public void test11461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11461");
        int[] intArray5 = new int[] { (byte) 0, 0, 0, (short) 100, (short) -1 };
        int[] intArray12 = new int[] { 0, (short) 100, '#', (byte) -1, '4', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) 0, (int) '4');
    }

    @Test
    public void test11462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11462");
        int[] intArray3 = new int[] { ' ', (short) 10, 1 };
        int[] intArray5 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) -1, (int) ' ');
    }

    @Test
    public void test11463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11463");
        int[] intArray5 = new int[] { '#', (-1), 100, (short) 10, (short) -1 };
        int[] intArray9 = new int[] { (short) 0, 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (byte) -1, 1);
    }

    @Test
    public void test11464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11464");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray8 = new int[] { (short) 0, '4', (byte) 1, (byte) 100, (short) 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) ' ', (int) (short) 100);
    }

    @Test
    public void test11465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11465");
        int[] intArray2 = new int[] { 0, '#' };
        int[] intArray5 = new int[] { 'a', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 0, (int) (short) 0);
    }

    @Test
    public void test11466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11466");
        int[] intArray6 = new int[] { (byte) 100, (byte) 10, (byte) 0, (short) 100, 10, (byte) 10 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) 'a', (-1));
    }

    @Test
    public void test11467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11467");
        int[] intArray5 = new int[] { (byte) 100, '#', (byte) 0, (short) 1, (byte) 1 };
        int[] intArray10 = new int[] { (short) 10, (-1), 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 1, 10);
    }

    @Test
    public void test11468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11468");
        int[] intArray1 = new int[] { '4' };
        int[] intArray4 = new int[] { (-1), (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (short) 10, (int) '#');
    }

    @Test
    public void test11469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11469");
        int[] intArray5 = new int[] { (byte) 1, 100, (short) 10, (byte) 1, '#' };
        int[] intArray9 = new int[] { 10, (byte) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (byte) -1, (int) (byte) 0);
    }

    @Test
    public void test11470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11470");
        int[] intArray5 = new int[] { (short) 0, (-1), 'a', '4', (-1) };
        int[] intArray7 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) ' ', (int) '#');
    }

    @Test
    public void test11471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11471");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray5 = new int[] { 'a', (byte) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, 10, (int) '#');
    }

    @Test
    public void test11472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11472");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test11473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11473");
        int[] intArray2 = new int[] { '4', 1 };
        int[] intArray5 = new int[] { (short) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 1, (int) (short) 100);
    }

    @Test
    public void test11474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11474");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray6 = new int[] { '4', (byte) 10, '#', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) '4', (int) (short) 10);
    }

    @Test
    public void test11475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11475");
        int[] intArray3 = new int[] { (byte) 1, (byte) 1, (byte) 10 };
        int[] intArray5 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) 100, 0);
    }

    @Test
    public void test11476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11476");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray5 = new int[] { (short) 1, 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, 0, (int) (short) 0);
    }

    @Test
    public void test11477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11477");
        int[] intArray3 = new int[] { (short) -1, (-1), (short) 100 };
        int[] intArray5 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, 0, (int) '4');
    }

    @Test
    public void test11478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11478");
        int[] intArray3 = new int[] { ' ', (byte) -1, (byte) -1 };
        int[] intArray5 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) 100, 1);
    }

    @Test
    public void test11479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11479");
        int[] intArray1 = new int[] { 100 };
        int[] intArray5 = new int[] { (byte) 100, (byte) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) 'a', (int) (byte) 10);
    }

    @Test
    public void test11480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11480");
        int[] intArray2 = new int[] { (byte) 0, (short) 10 };
        int[] intArray4 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (short) 100, 100);
    }

    @Test
    public void test11481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11481");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray5 = new int[] { (short) 10, 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) 1, (-1));
    }

    @Test
    public void test11482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11482");
        int[] intArray3 = new int[] { 1, 1, 'a' };
        int[] intArray7 = new int[] { 100, 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) 100, (int) (byte) 100);
    }

    @Test
    public void test11483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11483");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray6 = new int[] { '#', 1, (short) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 100, (int) (short) 10);
    }

    @Test
    public void test11484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11484");
        int[] intArray6 = new int[] { (short) 10, (byte) 1, 'a', (short) 0, 10, (short) 1 };
        int[] intArray11 = new int[] { 10, 0, '4', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (byte) 1, (int) (short) 0);
    }

    @Test
    public void test11485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11485");
        int[] intArray4 = new int[] { (byte) 0, (short) 100, (short) 10, (short) 100 };
        int[] intArray7 = new int[] { (short) -1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) '#', (int) (short) -1);
    }

    @Test
    public void test11486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11486");
        int[] intArray6 = new int[] { 10, (short) 10, (short) -1, (short) 10, (byte) 100, (short) -1 };
        int[] intArray13 = new int[] { 'a', (short) 100, 10, 0, 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test11487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11487");
        int[] intArray4 = new int[] { (-1), (byte) -1, (short) 10, 1 };
        int[] intArray9 = new int[] { (-1), '#', ' ', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) -1, (int) (byte) 100);
    }

    @Test
    public void test11488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11488");
        int[] intArray5 = new int[] { (-1), '#', (byte) 1, (short) -1, '#' };
        int[] intArray10 = new int[] { (short) 100, (short) 0, (short) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (byte) 100, (int) (short) 10);
    }

    @Test
    public void test11489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11489");
        int[] intArray6 = new int[] { (short) -1, (short) 10, (-1), (byte) -1, (short) 0, (byte) 100 };
        int[] intArray11 = new int[] { (byte) 1, ' ', ' ', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (-1), (int) '4');
    }

    @Test
    public void test11490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11490");
        int[] intArray4 = new int[] { (short) 100, (byte) -1, 0, (short) -1 };
        int[] intArray11 = new int[] { 0, '#', (byte) 1, (byte) 100, 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) 'a', (int) '4');
    }

    @Test
    public void test11491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11491");
        int[] intArray2 = new int[] { (byte) 10, 100 };
        int[] intArray8 = new int[] { 1, (byte) 1, (-1), 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (-1), (int) '#');
    }

    @Test
    public void test11492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11492");
        int[] intArray6 = new int[] { (byte) 0, 'a', 100, 'a', (byte) 1, (byte) -1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) -1, (int) (short) 1);
    }

    @Test
    public void test11493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11493");
        int[] intArray3 = new int[] { 1, 1, (byte) 10 };
        int[] intArray5 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (-1), (int) '#');
    }

    @Test
    public void test11494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11494");
        int[] intArray1 = new int[] { 1 };
        int[] intArray8 = new int[] { (short) 100, (byte) -1, '#', (short) 100, 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) 100, (int) '4');
    }

    @Test
    public void test11495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11495");
        int[] intArray3 = new int[] { (byte) 0, (byte) 100, (byte) 100 };
        int[] intArray7 = new int[] { '#', (byte) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) 100, 0);
    }

    @Test
    public void test11496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11496");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 100, (byte) 10, '#', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (-1), 100);
    }

    @Test
    public void test11497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11497");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 0, (int) (byte) -1);
    }

    @Test
    public void test11498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11498");
        int[] intArray5 = new int[] { (byte) 1, 10, (short) 100, '4', (byte) 100 };
        int[] intArray11 = new int[] { (short) 100, (short) 0, (short) 10, (byte) 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) 1, (int) '#');
    }

    @Test
    public void test11499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11499");
        int[] intArray4 = new int[] { '4', (byte) 1, (byte) -1, (-1) };
        int[] intArray8 = new int[] { (byte) 10, (byte) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) 100, (int) '#');
    }

    @Test
    public void test11500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest22.test11500");
        int[] intArray1 = new int[] { 10 };
        int[] intArray3 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, 1, (int) (byte) -1);
    }
}

