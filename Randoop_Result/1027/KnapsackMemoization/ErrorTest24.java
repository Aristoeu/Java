package KnapsackMemoization;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest24 {

    public static boolean debug = false;

    @Test
    public void test12001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12001");
        int[] intArray4 = new int[] { '#', (short) 100, (short) 0, (byte) 1 };
        int[] intArray9 = new int[] { 'a', (-1), ' ', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) 100, 1);
    }

    @Test
    public void test12002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12002");
        int[] intArray6 = new int[] { (byte) 1, (short) 1, (short) 0, 100, 100, '#' };
        int[] intArray13 = new int[] { (byte) 1, (byte) 10, (short) -1, 100, 'a', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 100, (int) (short) -1);
    }

    @Test
    public void test12003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12003");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray3 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) 0, (int) '#');
    }

    @Test
    public void test12004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12004");
        int[] intArray5 = new int[] { (byte) -1, (byte) -1, (-1), (short) 1, 1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 100, (int) (short) -1);
    }

    @Test
    public void test12005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12005");
        int[] intArray2 = new int[] { '#', (short) 100 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 1, (int) '#');
    }

    @Test
    public void test12006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12006");
        int[] intArray6 = new int[] { 'a', (short) 1, '#', ' ', 0, (short) 0 };
        int[] intArray8 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 100, (int) (short) 100);
    }

    @Test
    public void test12007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12007");
        int[] intArray3 = new int[] { (byte) 1, (byte) 100, (byte) 1 };
        int[] intArray10 = new int[] { (byte) 0, (byte) 100, (short) 10, '4', (short) 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 10, (int) (short) 10);
    }

    @Test
    public void test12008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12008");
        int[] intArray5 = new int[] { (short) 10, (short) 100, 0, (short) 100, 10 };
        int[] intArray7 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (short) 100, (int) '#');
    }

    @Test
    public void test12009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12009");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 1, 'a', '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) '4', (-1));
    }

    @Test
    public void test12010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12010");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, 10 };
        int[] intArray9 = new int[] { (byte) 0, (short) -1, (byte) 1, '#', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (byte) 1, (-1));
    }

    @Test
    public void test12011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12011");
        int[] intArray5 = new int[] { (byte) 0, 10, ' ', (-1), (byte) 10 };
        int[] intArray12 = new int[] { (short) -1, ' ', ' ', (byte) -1, 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) 1, (int) (byte) 0);
    }

    @Test
    public void test12012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12012");
        int[] intArray1 = new int[] { '#' };
        int[] intArray5 = new int[] { 100, (byte) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) 1, (int) ' ');
    }

    @Test
    public void test12013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12013");
        int[] intArray2 = new int[] { (short) 1, (byte) 100 };
        int[] intArray8 = new int[] { (short) 1, 100, 10, 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) 100, (int) '4');
    }

    @Test
    public void test12014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12014");
        int[] intArray3 = new int[] { 1, (byte) -1, '4' };
        int[] intArray7 = new int[] { (byte) 10, (short) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 1, (int) '#');
    }

    @Test
    public void test12015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12015");
        int[] intArray6 = new int[] { (byte) -1, '4', 1, 'a', (short) 10, '4' };
        int[] intArray10 = new int[] { (short) 1, (byte) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) 0, (int) '#');
    }

    @Test
    public void test12016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12016");
        int[] intArray3 = new int[] { 1, 'a', (byte) 0 };
        int[] intArray9 = new int[] { 10, (-1), '4', (short) 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test12017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12017");
        int[] intArray1 = new int[] { 1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 1, 10);
    }

    @Test
    public void test12018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12018");
        int[] intArray2 = new int[] { 100, (-1) };
        int[] intArray7 = new int[] { 'a', '#', (short) 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 1, (int) (byte) 100);
    }

    @Test
    public void test12019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12019");
        int[] intArray5 = new int[] { (byte) 0, ' ', (short) -1, (byte) -1, (byte) 100 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 0, (int) (short) 0);
    }

    @Test
    public void test12020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12020");
        int[] intArray2 = new int[] { (short) 10, 100 };
        int[] intArray4 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (short) 10, (int) (short) 10);
    }

    @Test
    public void test12021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12021");
        int[] intArray2 = new int[] { (short) 0, (byte) 100 };
        int[] intArray4 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 10, (int) (short) -1);
    }

    @Test
    public void test12022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12022");
        int[] intArray2 = new int[] { (short) 0, 'a' };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) 10, (int) (byte) -1);
    }

    @Test
    public void test12023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12023");
        int[] intArray3 = new int[] { (short) 1, '4', ' ' };
        int[] intArray7 = new int[] { 100, ' ', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) 100, (int) '#');
    }

    @Test
    public void test12024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12024");
        int[] intArray5 = new int[] { (short) 100, 0, (short) -1, (byte) 1, (short) 0 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) '4', (int) '4');
    }

    @Test
    public void test12025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12025");
        int[] intArray4 = new int[] { '4', 'a', (byte) 10, 0 };
        int[] intArray7 = new int[] { (byte) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) '4', 10);
    }

    @Test
    public void test12026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12026");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray4 = new int[] { (byte) 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, 0, 0);
    }

    @Test
    public void test12027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12027");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray7 = new int[] { (byte) -1, (short) 1, '4', (short) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) ' ', (int) (byte) -1);
    }

    @Test
    public void test12028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12028");
        int[] intArray2 = new int[] { (short) 100, 100 };
        int[] intArray9 = new int[] { 0, 0, (byte) 1, (byte) 100, 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 1, (int) ' ');
    }

    @Test
    public void test12029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12029");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (byte) 100, 1, 10, '#', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) '#', 100);
    }

    @Test
    public void test12030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12030");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (-1), (-1));
    }

    @Test
    public void test12031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12031");
        int[] intArray3 = new int[] { (byte) -1, 'a', 1 };
        int[] intArray5 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) -1, 0);
    }

    @Test
    public void test12032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12032");
        int[] intArray6 = new int[] { (-1), (byte) 10, (byte) 1, (byte) 1, 100, 0 };
        int[] intArray13 = new int[] { 100, (byte) 10, 0, 10, (short) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (byte) 10, 1);
    }

    @Test
    public void test12033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12033");
        int[] intArray5 = new int[] { (byte) 100, (byte) -1, '4', '4', (byte) 10 };
        int[] intArray8 = new int[] { (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) 10, (int) (short) 1);
    }

    @Test
    public void test12034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12034");
        int[] intArray5 = new int[] { (short) 10, (-1), '4', (short) 0, (byte) -1 };
        int[] intArray9 = new int[] { (short) 10, 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (-1), (int) (byte) 1);
    }

    @Test
    public void test12035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12035");
        int[] intArray2 = new int[] { (byte) 100, 10 };
        int[] intArray5 = new int[] { (short) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 0, (int) (byte) 1);
    }

    @Test
    public void test12036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12036");
        int[] intArray2 = new int[] { '#', ' ' };
        int[] intArray5 = new int[] { (short) 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (byte) -1, (int) (byte) -1);
    }

    @Test
    public void test12037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12037");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, 100, (byte) -1, (short) 1, (short) 100 };
        int[] intArray13 = new int[] { (byte) 10, 10, (byte) 10, '4', 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test12038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12038");
        int[] intArray4 = new int[] { 1, 10, ' ', 10 };
        int[] intArray8 = new int[] { (byte) -1, (short) 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) -1, (int) ' ');
    }

    @Test
    public void test12039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12039");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) 0, 'a', (byte) 0, 10, 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) 100, 0);
    }

    @Test
    public void test12040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12040");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { '4', '4', '#', (-1), (short) 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (-1), 0);
    }

    @Test
    public void test12041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12041");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) -1, (int) (byte) 10);
    }

    @Test
    public void test12042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12042");
        int[] intArray2 = new int[] { ' ', '4' };
        int[] intArray4 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (short) 100, (int) '#');
    }

    @Test
    public void test12043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12043");
        int[] intArray3 = new int[] { (short) 100, 100, 0 };
        int[] intArray5 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (-1), (int) (short) 10);
    }

    @Test
    public void test12044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12044");
        int[] intArray4 = new int[] { (byte) 10, 0, (-1), 0 };
        int[] intArray8 = new int[] { (short) -1, 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 100, 0);
    }

    @Test
    public void test12045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12045");
        int[] intArray2 = new int[] { 0, ' ' };
        int[] intArray8 = new int[] { (byte) 1, 100, (byte) -1, (short) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (byte) 100, 0);
    }

    @Test
    public void test12046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12046");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (byte) 100, 0);
    }

    @Test
    public void test12047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12047");
        int[] intArray2 = new int[] { '4', 'a' };
        int[] intArray6 = new int[] { 'a', (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 0, (int) '4');
    }

    @Test
    public void test12048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12048");
        int[] intArray1 = new int[] { 100 };
        int[] intArray6 = new int[] { (short) 100, (byte) 0, '#', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (short) -1, (int) (byte) 0);
    }

    @Test
    public void test12049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12049");
        int[] intArray4 = new int[] { 0, (-1), (byte) 10, (short) 10 };
        int[] intArray7 = new int[] { (short) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) 1, (int) (short) 10);
    }

    @Test
    public void test12050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12050");
        int[] intArray2 = new int[] { (byte) 1, ' ' };
        int[] intArray6 = new int[] { '#', '4', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (short) -1, 100);
    }

    @Test
    public void test12051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12051");
        int[] intArray4 = new int[] { (short) 1, 10, (byte) 10, (byte) 100 };
        int[] intArray6 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) 'a', (int) (short) 0);
    }

    @Test
    public void test12052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12052");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (byte) 100, (-1));
    }

    @Test
    public void test12053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12053");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray8 = new int[] { (-1), (short) 0, 'a', '4', '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 1, (int) '#');
    }

    @Test
    public void test12054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12054");
        int[] intArray5 = new int[] { (byte) 0, (byte) 100, ' ', (byte) 1, ' ' };
        int[] intArray11 = new int[] { (short) -1, (byte) 100, 1, (byte) 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) '4', (int) (short) -1);
    }

    @Test
    public void test12055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12055");
        int[] intArray5 = new int[] { (short) 0, ' ', 1, (short) 0, (byte) 0 };
        int[] intArray11 = new int[] { 1, (byte) 0, (short) 100, (short) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) -1, (int) (short) -1);
    }

    @Test
    public void test12056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12056");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int[] intArray5 = new int[] { (byte) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 0, (int) 'a');
    }

    @Test
    public void test12057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12057");
        int[] intArray4 = new int[] { (short) 100, 100, (byte) 0, (byte) 0 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (byte) 100, (int) (short) 100);
    }

    @Test
    public void test12058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12058");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 'a', '#', '4', (short) 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, 100, (int) '4');
    }

    @Test
    public void test12059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12059");
        int[] intArray2 = new int[] { 10, (byte) -1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) 10, (int) (short) 1);
    }

    @Test
    public void test12060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12060");
        int[] intArray3 = new int[] { ' ', (byte) 100, 'a' };
        int[] intArray7 = new int[] { (byte) 1, (-1), 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) 'a', 100);
    }

    @Test
    public void test12061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12061");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 100, '#', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) ' ', 100);
    }

    @Test
    public void test12062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12062");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 100, (int) (short) -1);
    }

    @Test
    public void test12063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12063");
        int[] intArray3 = new int[] { '#', 100, (byte) 10 };
        int[] intArray8 = new int[] { '#', (short) 1, 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 10, (int) (short) 1);
    }

    @Test
    public void test12064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12064");
        int[] intArray5 = new int[] { (short) 0, 10, 0, (short) 0, (byte) 0 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 0, (int) (short) -1);
    }

    @Test
    public void test12065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12065");
        int[] intArray3 = new int[] { ' ', (-1), (short) -1 };
        int[] intArray9 = new int[] { 100, (byte) 10, (byte) 1, (byte) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test12066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12066");
        int[] intArray6 = new int[] { (-1), '4', (short) 100, (byte) 1, 'a', (short) -1 };
        int[] intArray13 = new int[] { (byte) 0, (short) -1, (short) 1, 10, (short) 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 0, (int) (byte) 100);
    }

    @Test
    public void test12067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12067");
        int[] intArray6 = new int[] { (short) 10, (short) 0, (byte) 1, (byte) 100, 1, 0 };
        int[] intArray8 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (-1), (int) ' ');
    }

    @Test
    public void test12068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12068");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray4 = new int[] { 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) ' ', 0);
    }

    @Test
    public void test12069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12069");
        int[] intArray6 = new int[] { (short) -1, (byte) 10, (short) 1, (byte) 100, (-1), (short) 10 };
        int[] intArray11 = new int[] { '4', 100, (short) -1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 100, (int) (byte) 0);
    }

    @Test
    public void test12070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12070");
        int[] intArray4 = new int[] { (short) 100, '#', (byte) 10, (short) 100 };
        int[] intArray10 = new int[] { (byte) -1, (-1), (short) 100, (byte) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test12071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12071");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 0, (byte) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) -1, 1);
    }

    @Test
    public void test12072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12072");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray5 = new int[] { (short) -1, (-1), (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (byte) 10, (int) '#');
    }

    @Test
    public void test12073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12073");
        int[] intArray3 = new int[] { 1, (short) 1, 1 };
        int[] intArray10 = new int[] { 10, 1, (byte) -1, (short) 0, (short) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) 'a', (int) (short) 0);
    }

    @Test
    public void test12074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12074");
        int[] intArray2 = new int[] { 10, 'a' };
        int[] intArray8 = new int[] { (byte) 10, ' ', 1, 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) 10, (-1));
    }

    @Test
    public void test12075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12075");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) 100, 100);
    }

    @Test
    public void test12076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12076");
        int[] intArray6 = new int[] { 1, 100, (byte) 0, (byte) -1, (short) 0, (byte) 0 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) 0, (int) '4');
    }

    @Test
    public void test12077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12077");
        int[] intArray3 = new int[] { (byte) 100, 10, 1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (byte) 10, (int) 'a');
    }

    @Test
    public void test12078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12078");
        int[] intArray1 = new int[] { '#' };
        int[] intArray7 = new int[] { (byte) 100, (short) 1, (short) 0, (short) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) 10, 10);
    }

    @Test
    public void test12079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12079");
        int[] intArray2 = new int[] { 10, (byte) -1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (-1), (int) (short) -1);
    }

    @Test
    public void test12080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12080");
        int[] intArray3 = new int[] { 'a', 0, (short) 1 };
        int[] intArray6 = new int[] { 'a', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) '4', (int) (short) 1);
    }

    @Test
    public void test12081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12081");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) 1, 'a', (-1), (byte) -1, '4', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) 10, (int) '4');
    }

    @Test
    public void test12082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12082");
        int[] intArray5 = new int[] { (short) 10, (short) 0, (short) 1, (short) 0, (short) 100 };
        int[] intArray7 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (-1), 10);
    }

    @Test
    public void test12083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12083");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) ' ', 0);
    }

    @Test
    public void test12084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12084");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray9 = new int[] { (short) 10, 0, 1, (short) -1, (-1), (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (short) 0, (int) 'a');
    }

    @Test
    public void test12085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12085");
        int[] intArray4 = new int[] { (short) 0, (short) 10, (short) 100, 100 };
        int[] intArray7 = new int[] { (short) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) -1, 0);
    }

    @Test
    public void test12086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12086");
        int[] intArray5 = new int[] { (short) 100, 'a', (byte) -1, ' ', ' ' };
        int[] intArray11 = new int[] { 100, (short) 100, 1, 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) '#', (int) '4');
    }

    @Test
    public void test12087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12087");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        int[] intArray9 = new int[] { '#', 0, (short) 10, (byte) 10, 'a', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) '#', 0);
    }

    @Test
    public void test12088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12088");
        int[] intArray1 = new int[] { '#' };
        int[] intArray8 = new int[] { 100, (byte) -1, 'a', (short) 10, '#', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) 0, (int) '4');
    }

    @Test
    public void test12089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12089");
        int[] intArray4 = new int[] { 100, (-1), 0, 0 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (short) -1, (int) '4');
    }

    @Test
    public void test12090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12090");
        int[] intArray3 = new int[] { (-1), 0, (byte) -1 };
        int[] intArray8 = new int[] { (short) -1, (-1), (short) 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 1, (int) (short) -1);
    }

    @Test
    public void test12091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12091");
        int[] intArray3 = new int[] { (byte) 100, (short) -1, (short) 100 };
        int[] intArray7 = new int[] { 1, (short) 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) -1, 1);
    }

    @Test
    public void test12092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12092");
        int[] intArray2 = new int[] { (byte) 1, (short) 0 };
        int[] intArray5 = new int[] { (short) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) 'a', (-1));
    }

    @Test
    public void test12093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12093");
        int[] intArray3 = new int[] { (short) 1, (byte) 1, 100 };
        int[] intArray9 = new int[] { 0, (short) 100, (byte) 0, 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) '#', (int) (byte) 0);
    }

    @Test
    public void test12094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12094");
        int[] intArray2 = new int[] { (short) 100, (byte) 10 };
        int[] intArray9 = new int[] { (short) 1, (byte) 10, ' ', (byte) -1, (byte) 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 100, (int) (short) -1);
    }

    @Test
    public void test12095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12095");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) -1, (short) -1, ' ', 'a', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, 0, 1);
    }

    @Test
    public void test12096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12096");
        int[] intArray6 = new int[] { (short) 0, (short) 100, ' ', 100, (short) 10, 100 };
        int[] intArray10 = new int[] { (byte) 1, 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 0, (int) '#');
    }

    @Test
    public void test12097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12097");
        int[] intArray6 = new int[] { (short) 0, 100, (byte) 1, 1, 10, 100 };
        int[] intArray12 = new int[] { 10, (short) 10, '4', (short) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) ' ', (int) (byte) 1);
    }

    @Test
    public void test12098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12098");
        int[] intArray5 = new int[] { (short) 1, (short) -1, (short) -1, (short) -1, ' ' };
        int[] intArray9 = new int[] { (byte) -1, 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (byte) 1, (int) (byte) -1);
    }

    @Test
    public void test12099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12099");
        int[] intArray2 = new int[] { (byte) 100, 0 };
        int[] intArray4 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (byte) -1, 100);
    }

    @Test
    public void test12100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12100");
        int[] intArray2 = new int[] { (byte) 100, (short) 10 };
        int[] intArray5 = new int[] { '#', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) ' ', (int) (byte) -1);
    }

    @Test
    public void test12101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12101");
        int[] intArray4 = new int[] { (byte) 0, (-1), (byte) 100, (byte) 0 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (short) 100, (int) (byte) 0);
    }

    @Test
    public void test12102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12102");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray5 = new int[] { 10, (byte) -1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (byte) -1, (int) ' ');
    }

    @Test
    public void test12103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12103");
        int[] intArray2 = new int[] { (byte) -1, (short) 1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 0, (int) (short) 0);
    }

    @Test
    public void test12104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12104");
        int[] intArray6 = new int[] { (byte) 10, 10, (byte) 0, (short) 0, (-1), (short) 10 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) 10, 0);
    }

    @Test
    public void test12105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12105");
        int[] intArray2 = new int[] { (short) -1, 100 };
        int[] intArray4 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) '4', (int) (byte) -1);
    }

    @Test
    public void test12106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12106");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (byte) -1, 100);
    }

    @Test
    public void test12107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12107");
        int[] intArray6 = new int[] { (byte) -1, (short) 10, 1, (byte) 0, (byte) 100, (byte) 100 };
        int[] intArray12 = new int[] { (short) 0, (short) 10, (-1), (byte) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) ' ', (int) (byte) 0);
    }

    @Test
    public void test12108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12108");
        int[] intArray4 = new int[] { 100, (byte) -1, (byte) 100, 1 };
        int[] intArray7 = new int[] { 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) 0, (int) (short) 10);
    }

    @Test
    public void test12109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12109");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, 0, (int) (byte) 0);
    }

    @Test
    public void test12110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12110");
        int[] intArray4 = new int[] { (byte) 100, 0, ' ', 100 };
        int[] intArray11 = new int[] { '4', 1, (byte) 10, 100, ' ', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) ' ', (int) (byte) 10);
    }

    @Test
    public void test12111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12111");
        int[] intArray4 = new int[] { (short) 1, '#', (short) 1, (byte) 1 };
        int[] intArray6 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, 10, 10);
    }

    @Test
    public void test12112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12112");
        int[] intArray3 = new int[] { (short) -1, (byte) 1, (byte) 100 };
        int[] intArray5 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) 0, (int) (byte) -1);
    }

    @Test
    public void test12113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12113");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) '#', (int) (short) 100);
    }

    @Test
    public void test12114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12114");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { ' ', 0, (short) 100, '4', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test12115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12115");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray5 = new int[] { (short) 100, (short) 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (byte) 10, 100);
    }

    @Test
    public void test12116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12116");
        int[] intArray6 = new int[] { (short) 0, 10, (short) 100, 100, 10, (short) 1 };
        int[] intArray10 = new int[] { (byte) 10, 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) '#', (int) (short) 100);
    }

    @Test
    public void test12117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12117");
        int[] intArray5 = new int[] { (short) -1, (byte) 1, (byte) -1, '#', (short) 1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) 1, (int) ' ');
    }

    @Test
    public void test12118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12118");
        int[] intArray4 = new int[] { (short) 1, (short) -1, 'a', 10 };
        int[] intArray9 = new int[] { 10, (byte) 10, '#', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) '4', 10);
    }

    @Test
    public void test12119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12119");
        int[] intArray6 = new int[] { (byte) 0, '#', 10, (short) 0, 1, (short) 1 };
        int[] intArray9 = new int[] { (short) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 10, (int) 'a');
    }

    @Test
    public void test12120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12120");
        int[] intArray2 = new int[] { (short) 0, (byte) 100 };
        int[] intArray7 = new int[] { (short) 10, (byte) -1, (short) 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) 'a', (int) (short) 100);
    }

    @Test
    public void test12121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12121");
        int[] intArray5 = new int[] { 'a', (short) -1, (short) 0, '#', 1 };
        int[] intArray11 = new int[] { (byte) 100, (byte) 1, (byte) 100, '#', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 10, (int) 'a');
    }

    @Test
    public void test12122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12122");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray3 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) 0, 0);
    }

    @Test
    public void test12123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12123");
        int[] intArray5 = new int[] { (byte) 0, ' ', (short) 100, (-1), '4' };
        int[] intArray12 = new int[] { '#', 'a', '#', 10, (short) 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) ' ', (-1));
    }

    @Test
    public void test12124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12124");
        int[] intArray6 = new int[] { (short) 1, (short) 1, '4', ' ', (byte) -1, (short) 1 };
        int[] intArray12 = new int[] { 'a', (byte) 100, 'a', (-1), 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 1, (int) ' ');
    }

    @Test
    public void test12125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12125");
        int[] intArray3 = new int[] { ' ', (byte) 10, 0 };
        int[] intArray10 = new int[] { '4', 100, 0, 1, ' ', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 10, (int) (short) 10);
    }

    @Test
    public void test12126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12126");
        int[] intArray1 = new int[] { '4' };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) -1, (int) (byte) -1);
    }

    @Test
    public void test12127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12127");
        int[] intArray3 = new int[] { (short) 100, 100, ' ' };
        int[] intArray6 = new int[] { '#', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) 0, (int) (byte) 10);
    }

    @Test
    public void test12128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12128");
        int[] intArray4 = new int[] { (byte) -1, (byte) 1, 0, 1 };
        int[] intArray7 = new int[] { 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 0, (int) (byte) -1);
    }

    @Test
    public void test12129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12129");
        int[] intArray4 = new int[] { '#', (byte) 100, (byte) 10, 10 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (byte) 1, (int) (short) 0);
    }

    @Test
    public void test12130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12130");
        int[] intArray2 = new int[] { 0, (byte) 10 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) 'a', 0);
    }

    @Test
    public void test12131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12131");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 1, (byte) 0, 'a', '4', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) 100, (int) (short) 0);
    }

    @Test
    public void test12132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12132");
        int[] intArray6 = new int[] { (byte) 100, '#', 'a', (byte) 10, (byte) 100, 100 };
        int[] intArray10 = new int[] { (short) 10, (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (short) -1, (int) (byte) 1);
    }

    @Test
    public void test12133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12133");
        int[] intArray4 = new int[] { (byte) 1, (byte) 10, (short) 1, (-1) };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, 100, (int) (short) 100);
    }

    @Test
    public void test12134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12134");
        int[] intArray2 = new int[] { 1, 0 };
        int[] intArray7 = new int[] { (byte) 1, '#', 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 10, (int) (short) 10);
    }

    @Test
    public void test12135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12135");
        int[] intArray3 = new int[] { (byte) 100, 1, (-1) };
        int[] intArray9 = new int[] { (byte) 100, 1, (byte) 1, '#', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (byte) -1, 10);
    }

    @Test
    public void test12136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12136");
        int[] intArray5 = new int[] { (byte) 100, 0, (short) 100, 'a', (byte) 1 };
        int[] intArray11 = new int[] { '4', 1, (short) 10, (byte) 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 100, 0);
    }

    @Test
    public void test12137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12137");
        int[] intArray4 = new int[] { 0, '#', (byte) -1, 1 };
        int[] intArray9 = new int[] { (byte) 100, (short) 1, (short) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (byte) 10, 100);
    }

    @Test
    public void test12138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12138");
        int[] intArray4 = new int[] { (byte) -1, (short) 1, 1, 0 };
        int[] intArray6 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, 100, (int) ' ');
    }

    @Test
    public void test12139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12139");
        int[] intArray3 = new int[] { 100, (byte) 10, 'a' };
        int[] intArray8 = new int[] { (-1), (short) -1, 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (short) 0, 100);
    }

    @Test
    public void test12140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12140");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { '4', (byte) 0, (byte) 10, (short) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) -1, (int) (short) -1);
    }

    @Test
    public void test12141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12141");
        int[] intArray2 = new int[] { (-1), 0 };
        int[] intArray5 = new int[] { (short) 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (byte) 1, (int) (short) 1);
    }

    @Test
    public void test12142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12142");
        int[] intArray6 = new int[] { 1, '4', 1, 0, (short) 0, 100 };
        int[] intArray13 = new int[] { (byte) 1, '#', (byte) 100, ' ', '4', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (short) 10, 1);
    }

    @Test
    public void test12143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12143");
        int[] intArray6 = new int[] { (short) 100, (short) -1, (short) 1, 'a', (short) 1, 1 };
        int[] intArray8 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (byte) 0, (int) '4');
    }

    @Test
    public void test12144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12144");
        int[] intArray1 = new int[] { 0 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) ' ', (int) 'a');
    }

    @Test
    public void test12145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12145");
        int[] intArray2 = new int[] { (short) 0, '#' };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (-1), (int) (byte) 1);
    }

    @Test
    public void test12146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12146");
        int[] intArray2 = new int[] { ' ', '#' };
        int[] intArray5 = new int[] { (byte) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 0, (int) (short) 1);
    }

    @Test
    public void test12147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12147");
        int[] intArray2 = new int[] { 100, (byte) 0 };
        int[] intArray4 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (byte) 0, 0);
    }

    @Test
    public void test12148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12148");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 10, ' ', ' ', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 10, (-1));
    }

    @Test
    public void test12149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12149");
        int[] intArray6 = new int[] { (byte) -1, (byte) 10, 10, (byte) 0, 0, (-1) };
        int[] intArray13 = new int[] { 0, (byte) -1, 10, 1, (byte) 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 10, 0);
    }

    @Test
    public void test12150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12150");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray4 = new int[] { (byte) 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 100, (int) (short) 10);
    }

    @Test
    public void test12151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12151");
        int[] intArray6 = new int[] { 1, (short) 0, (short) 1, 100, (byte) 10, (short) 1 };
        int[] intArray12 = new int[] { (byte) 1, 100, 100, (byte) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 10, (int) (short) 10);
    }

    @Test
    public void test12152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12152");
        int[] intArray6 = new int[] { (short) 100, (byte) 100, 10, (short) -1, (short) -1, 100 };
        int[] intArray10 = new int[] { (short) 0, 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) 100, 0);
    }

    @Test
    public void test12153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12153");
        int[] intArray5 = new int[] { ' ', (byte) 0, 'a', (short) 100, (short) 10 };
        int[] intArray9 = new int[] { (short) 10, (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) -1, 10);
    }

    @Test
    public void test12154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12154");
        int[] intArray5 = new int[] { 100, '#', (short) 100, 100, ' ' };
        int[] intArray8 = new int[] { (short) 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) 10, 0);
    }

    @Test
    public void test12155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12155");
        int[] intArray2 = new int[] { (byte) 1, (short) 1 };
        int[] intArray6 = new int[] { (byte) 1, (byte) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 1, 1);
    }

    @Test
    public void test12156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12156");
        int[] intArray5 = new int[] { (short) 0, (-1), (byte) 1, ' ', (-1) };
        int[] intArray8 = new int[] { (short) -1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) '#', (int) (byte) -1);
    }

    @Test
    public void test12157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12157");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray4 = new int[] { '#', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (short) -1, (int) (short) -1);
    }

    @Test
    public void test12158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12158");
        int[] intArray4 = new int[] { (byte) -1, 10, 'a', 0 };
        int[] intArray11 = new int[] { 0, (short) -1, 10, 0, '4', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) '4', (int) ' ');
    }

    @Test
    public void test12159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12159");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray3 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, 100, (int) (byte) -1);
    }

    @Test
    public void test12160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12160");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray7 = new int[] { (byte) 0, (short) 1, (byte) 100, (byte) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) ' ', (int) (short) -1);
    }

    @Test
    public void test12161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12161");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray5 = new int[] { (short) 0, (short) 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, 0, (-1));
    }

    @Test
    public void test12162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12162");
        int[] intArray6 = new int[] { '4', 1, 1, (short) 1, (short) 1, 1 };
        int[] intArray12 = new int[] { (short) 0, 100, (byte) -1, (short) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) 1, (int) (byte) 0);
    }

    @Test
    public void test12163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12163");
        int[] intArray2 = new int[] { (short) 1, 100 };
        int[] intArray7 = new int[] { '4', (byte) 10, 'a', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) '4', (int) (short) 0);
    }

    @Test
    public void test12164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12164");
        int[] intArray4 = new int[] { '4', 1, (byte) 10, 0 };
        int[] intArray9 = new int[] { (byte) 0, '#', '#', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test12165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12165");
        int[] intArray6 = new int[] { (-1), 100, ' ', ' ', (-1), (short) 10 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) 1, (int) (short) 100);
    }

    @Test
    public void test12166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12166");
        int[] intArray2 = new int[] { '4', '#' };
        int[] intArray9 = new int[] { (byte) 10, 0, 10, 10, (short) 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test12167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12167");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray7 = new int[] { '4', (short) 10, (byte) -1, '4', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) 10, (int) (short) 10);
    }

    @Test
    public void test12168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12168");
        int[] intArray2 = new int[] { (byte) 0, 10 };
        int[] intArray8 = new int[] { (short) 10, ' ', (byte) -1, 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 100, (int) (byte) 1);
    }

    @Test
    public void test12169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12169");
        int[] intArray5 = new int[] { (byte) 1, (short) 100, 100, ' ', '#' };
        int[] intArray8 = new int[] { '#', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) 'a', (int) (short) 10);
    }

    @Test
    public void test12170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12170");
        int[] intArray2 = new int[] { '#', '#' };
        int[] intArray4 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (short) 0, 10);
    }

    @Test
    public void test12171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12171");
        int[] intArray5 = new int[] { 10, (short) 1, (byte) 1, (short) 100, (short) 1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (short) 0, 10);
    }

    @Test
    public void test12172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12172");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 100, (byte) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) 1, (int) (byte) 10);
    }

    @Test
    public void test12173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12173");
        int[] intArray5 = new int[] { (short) 100, 10, 10, (byte) 100, (byte) 1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (short) 0, (int) (short) 100);
    }

    @Test
    public void test12174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12174");
        int[] intArray1 = new int[] { 0 };
        int[] intArray7 = new int[] { 0, (short) 0, (byte) 0, (byte) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, 0, 100);
    }

    @Test
    public void test12175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12175");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 10, 0);
    }

    @Test
    public void test12176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12176");
        int[] intArray4 = new int[] { (short) 0, (byte) 100, (byte) 100, 100 };
        int[] intArray11 = new int[] { (short) 10, (byte) 10, '4', ' ', (short) 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test12177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12177");
        int[] intArray6 = new int[] { (short) 10, (short) 1, (byte) 10, (byte) -1, '#', (short) 100 };
        int[] intArray11 = new int[] { 'a', (byte) 1, (short) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) '4', (int) (short) -1);
    }

    @Test
    public void test12178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12178");
        int[] intArray4 = new int[] { '#', (short) 1, (short) 0, '#' };
        int[] intArray11 = new int[] { (byte) 0, (-1), 0, (short) 0, (byte) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) 1, (int) '4');
    }

    @Test
    public void test12179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12179");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray3 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (byte) -1, (int) (short) 10);
    }

    @Test
    public void test12180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12180");
        int[] intArray5 = new int[] { 0, 1, (short) 1, (short) 0, 0 };
        int[] intArray9 = new int[] { (short) 0, (short) 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) '#', 0);
    }

    @Test
    public void test12181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12181");
        int[] intArray6 = new int[] { (short) 10, (byte) 10, 1, 100, 'a', '#' };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, 100, (int) (short) 100);
    }

    @Test
    public void test12182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12182");
        int[] intArray2 = new int[] { 10, 'a' };
        int[] intArray9 = new int[] { (byte) -1, 1, (short) 1, '4', (byte) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (byte) 10, (int) (short) 0);
    }

    @Test
    public void test12183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12183");
        int[] intArray5 = new int[] { 0, 100, 1, 0, (byte) -1 };
        int[] intArray12 = new int[] { ' ', ' ', '4', '#', (short) 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) '#', (int) (short) 0);
    }

    @Test
    public void test12184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12184");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray4 = new int[] { (short) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (short) 100, (int) (short) -1);
    }

    @Test
    public void test12185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12185");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) '#', (int) (short) -1);
    }

    @Test
    public void test12186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12186");
        int[] intArray5 = new int[] { 10, (byte) -1, (short) -1, (byte) -1, (short) 0 };
        int[] intArray10 = new int[] { 'a', (-1), '4', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (short) 1, 100);
    }

    @Test
    public void test12187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12187");
        int[] intArray3 = new int[] { (short) 1, (short) 1, '#' };
        int[] intArray5 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, 0, (int) (short) 100);
    }

    @Test
    public void test12188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12188");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray8 = new int[] { 0, ' ', '#', (byte) 10, 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) 100, 10);
    }

    @Test
    public void test12189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12189");
        int[] intArray3 = new int[] { 10, (byte) -1, (byte) 100 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) -1, (int) (byte) 1);
    }

    @Test
    public void test12190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12190");
        int[] intArray6 = new int[] { (-1), '4', '4', 100, '4', '4' };
        int[] intArray10 = new int[] { 100, (short) -1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) ' ', (int) (short) 10);
    }

    @Test
    public void test12191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12191");
        int[] intArray5 = new int[] { '4', (-1), 'a', 0, (byte) 1 };
        int[] intArray10 = new int[] { '4', (byte) 0, ' ', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) '4', (int) ' ');
    }

    @Test
    public void test12192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12192");
        int[] intArray2 = new int[] { ' ', (byte) 10 };
        int[] intArray8 = new int[] { 'a', '#', (short) 10, '#', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) -1, (int) (byte) 100);
    }

    @Test
    public void test12193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12193");
        int[] intArray5 = new int[] { ' ', (-1), '#', (short) -1, (short) -1 };
        int[] intArray11 = new int[] { (byte) 100, (byte) 10, 1, (short) 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) '#', (int) (short) -1);
    }

    @Test
    public void test12194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12194");
        int[] intArray6 = new int[] { (short) -1, (short) 0, (-1), (short) 0, (-1), (byte) -1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, 100, (int) (short) -1);
    }

    @Test
    public void test12195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12195");
        int[] intArray6 = new int[] { (byte) 10, (-1), (byte) -1, (-1), (short) -1, 100 };
        int[] intArray12 = new int[] { (byte) 10, (short) 1, 1, (byte) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (byte) 0, (int) 'a');
    }

    @Test
    public void test12196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12196");
        int[] intArray5 = new int[] { (byte) 1, 10, 0, (byte) 1, (short) -1 };
        int[] intArray9 = new int[] { 1, 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test12197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12197");
        int[] intArray4 = new int[] { (-1), 1, ' ', 10 };
        int[] intArray11 = new int[] { '4', '#', (-1), (byte) 1, (short) 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (-1), (int) '4');
    }

    @Test
    public void test12198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12198");
        int[] intArray3 = new int[] { (short) 1, ' ', (byte) -1 };
        int[] intArray8 = new int[] { '#', 'a', '#', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 10, (int) (short) -1);
    }

    @Test
    public void test12199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12199");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) 1, '#', (short) 0, (byte) 100, '4', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (-1), (int) (byte) 1);
    }

    @Test
    public void test12200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12200");
        int[] intArray3 = new int[] { (byte) 0, (short) 0, 10 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, 0, (int) (short) 100);
    }

    @Test
    public void test12201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12201");
        int[] intArray5 = new int[] { 10, 100, (byte) -1, (byte) 0, (short) 0 };
        int[] intArray10 = new int[] { 'a', ' ', 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (byte) 0, (int) (byte) 100);
    }

    @Test
    public void test12202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12202");
        int[] intArray2 = new int[] { '4', 1 };
        int[] intArray5 = new int[] { (short) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 1, 10);
    }

    @Test
    public void test12203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12203");
        int[] intArray3 = new int[] { (-1), (short) 0, (-1) };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test12204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12204");
        int[] intArray4 = new int[] { (byte) 100, (byte) -1, (byte) 1, '#' };
        int[] intArray9 = new int[] { (byte) 1, 'a', 'a', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test12205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12205");
        int[] intArray1 = new int[] { 1 };
        int[] intArray6 = new int[] { (-1), 1, ' ', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 0, 10);
    }

    @Test
    public void test12206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12206");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 0, '4', 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) 0, (int) (short) 100);
    }

    @Test
    public void test12207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12207");
        int[] intArray2 = new int[] { 100, '4' };
        int[] intArray7 = new int[] { '#', (-1), (byte) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 1, (int) (byte) 1);
    }

    @Test
    public void test12208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12208");
        int[] intArray4 = new int[] { (short) 100, (short) 0, 100, (byte) 1 };
        int[] intArray6 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, 0, 0);
    }

    @Test
    public void test12209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12209");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray3 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) ' ', (int) (byte) 10);
    }

    @Test
    public void test12210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12210");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray4 = new int[] { 'a', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, 10, (int) (short) 10);
    }

    @Test
    public void test12211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12211");
        int[] intArray3 = new int[] { (byte) 100, (byte) -1, 0 };
        int[] intArray5 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, 100, 0);
    }

    @Test
    public void test12212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12212");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray6 = new int[] { (short) 0, (-1), 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (byte) 1, (int) (byte) 100);
    }

    @Test
    public void test12213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12213");
        int[] intArray3 = new int[] { (short) -1, (short) 100, (-1) };
        int[] intArray5 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) -1, (int) '#');
    }

    @Test
    public void test12214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12214");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 1, (short) -1, '4', (byte) -1, (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) '#', 10);
    }

    @Test
    public void test12215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12215");
        int[] intArray4 = new int[] { 100, (short) -1, 1, (short) 1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (byte) 1, 100);
    }

    @Test
    public void test12216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12216");
        int[] intArray5 = new int[] { (byte) 10, (-1), 'a', (short) 100, ' ' };
        int[] intArray12 = new int[] { (short) 1, (byte) 100, 'a', (byte) 10, ' ', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (byte) 1, (int) (short) 10);
    }

    @Test
    public void test12217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12217");
        int[] intArray2 = new int[] { (short) 1, (short) 100 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (byte) 10, (int) (short) 1);
    }

    @Test
    public void test12218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12218");
        int[] intArray5 = new int[] { '4', (-1), (byte) -1, (short) 100, (short) 100 };
        int[] intArray7 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, 0, 1);
    }

    @Test
    public void test12219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12219");
        int[] intArray2 = new int[] { (byte) 0, '#' };
        int[] intArray8 = new int[] { (byte) 0, '#', '4', 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) -1, (int) (byte) 1);
    }

    @Test
    public void test12220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12220");
        int[] intArray6 = new int[] { 0, 10, (short) 0, 1, (short) 10, (short) 10 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) -1, (int) (byte) 0);
    }

    @Test
    public void test12221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12221");
        int[] intArray2 = new int[] { (byte) 10, (-1) };
        int[] intArray4 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (short) 1, (int) '4');
    }

    @Test
    public void test12222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12222");
        int[] intArray4 = new int[] { (short) 100, (byte) 100, (short) -1, 0 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (short) 1, (int) (short) 10);
    }

    @Test
    public void test12223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12223");
        int[] intArray2 = new int[] { 100, (short) 1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 100, (int) (byte) 100);
    }

    @Test
    public void test12224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12224");
        int[] intArray2 = new int[] { (short) 1, (short) -1 };
        int[] intArray8 = new int[] { (byte) 10, (-1), (byte) -1, (-1), (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (-1), 0);
    }

    @Test
    public void test12225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12225");
        int[] intArray4 = new int[] { 1, ' ', (short) 10, 10 };
        int[] intArray7 = new int[] { (-1), ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) 100, (int) '4');
    }

    @Test
    public void test12226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12226");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 10, 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) 0, (int) (short) 100);
    }

    @Test
    public void test12227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12227");
        int[] intArray4 = new int[] { (short) 0, (byte) 0, 10, (short) 100 };
        int[] intArray10 = new int[] { (byte) -1, ' ', 0, (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (byte) -1, (int) ' ');
    }

    @Test
    public void test12228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12228");
        int[] intArray6 = new int[] { (byte) -1, (short) 100, (short) 1, (short) 100, (byte) -1, (short) 10 };
        int[] intArray10 = new int[] { (byte) 1, (short) 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) '#', (int) (short) 1);
    }

    @Test
    public void test12229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12229");
        int[] intArray5 = new int[] { (short) -1, (-1), (-1), (short) 1, (short) 1 };
        int[] intArray10 = new int[] { (byte) 100, (-1), (short) 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (short) 1, 0);
    }

    @Test
    public void test12230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12230");
        int[] intArray3 = new int[] { 10, '4', 1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, 100, (int) (byte) 1);
    }

    @Test
    public void test12231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12231");
        int[] intArray6 = new int[] { (-1), (byte) 10, (byte) -1, (byte) 1, (byte) 1, (short) 100 };
        int[] intArray10 = new int[] { (-1), (byte) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) 1, (int) (byte) 1);
    }

    @Test
    public void test12232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12232");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (byte) 0, 0);
    }

    @Test
    public void test12233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12233");
        int[] intArray1 = new int[] { 100 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 100, (int) (short) 100);
    }

    @Test
    public void test12234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12234");
        int[] intArray5 = new int[] { ' ', (byte) 10, '#', 'a', (byte) 100 };
        int[] intArray8 = new int[] { (byte) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (-1), 0);
    }

    @Test
    public void test12235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12235");
        int[] intArray6 = new int[] { ' ', '#', (byte) 0, (-1), (-1), (-1) };
        int[] intArray11 = new int[] { 100, 'a', (byte) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) '4', (int) '4');
    }

    @Test
    public void test12236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12236");
        int[] intArray5 = new int[] { 1, 0, (short) 10, (short) 10, (byte) 100 };
        int[] intArray11 = new int[] { 'a', (short) 100, '#', (byte) 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 100, (int) '4');
    }

    @Test
    public void test12237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12237");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 0, 100);
    }

    @Test
    public void test12238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12238");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray5 = new int[] { 1, '#', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (byte) -1, (int) (byte) 10);
    }

    @Test
    public void test12239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12239");
        int[] intArray2 = new int[] { 1, 1 };
        int[] intArray9 = new int[] { 10, (-1), 0, (short) 100, (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) 'a', (int) ' ');
    }

    @Test
    public void test12240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12240");
        int[] intArray2 = new int[] { (byte) 10, (short) 1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) 0, (int) (short) 0);
    }

    @Test
    public void test12241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12241");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, 0, (int) (short) 0);
    }

    @Test
    public void test12242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12242");
        int[] intArray3 = new int[] { (short) 100, (byte) 10, '#' };
        int[] intArray8 = new int[] { (short) 100, (byte) -1, '#', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (byte) 1, 0);
    }

    @Test
    public void test12243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12243");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, 1, (int) (byte) 1);
    }

    @Test
    public void test12244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12244");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 1, (byte) 1, 1 };
        int[] intArray9 = new int[] { 0, (short) 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 100, (-1));
    }

    @Test
    public void test12245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12245");
        int[] intArray6 = new int[] { (short) 100, '4', (byte) 100, (byte) 1, (byte) 0, 10 };
        int[] intArray11 = new int[] { 'a', (-1), (byte) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (byte) -1, (int) (short) 100);
    }

    @Test
    public void test12246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12246");
        int[] intArray1 = new int[] { '#' };
        int[] intArray6 = new int[] { '#', (short) 10, (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) '#', (int) (byte) 100);
    }

    @Test
    public void test12247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12247");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray4 = new int[] { '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) '4', (int) (byte) 100);
    }

    @Test
    public void test12248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12248");
        int[] intArray1 = new int[] { '#' };
        int[] intArray7 = new int[] { 100, 10, '4', (byte) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) 'a', (int) (byte) 100);
    }

    @Test
    public void test12249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12249");
        int[] intArray4 = new int[] { (byte) -1, (short) 0, (short) -1, ' ' };
        int[] intArray9 = new int[] { (short) 100, (byte) 10, '#', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 0, 1);
    }

    @Test
    public void test12250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12250");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray8 = new int[] { (short) 1, 10, 10, (byte) -1, (short) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (-1), (int) (byte) 100);
    }

    @Test
    public void test12251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12251");
        int[] intArray4 = new int[] { (byte) -1, (byte) 100, (short) 0, ' ' };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (byte) 0, (int) (byte) -1);
    }

    @Test
    public void test12252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12252");
        int[] intArray5 = new int[] { (short) 10, (short) 10, '4', 10, (short) 100 };
        int[] intArray9 = new int[] { (byte) -1, (-1), 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 0, (int) ' ');
    }

    @Test
    public void test12253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12253");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 10, 10, (byte) 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) -1, 0);
    }

    @Test
    public void test12254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12254");
        int[] intArray3 = new int[] { (short) 100, (byte) 1, 0 };
        int[] intArray8 = new int[] { (byte) -1, (byte) 0, (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test12255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12255");
        int[] intArray3 = new int[] { 1, (short) 0, (byte) -1 };
        int[] intArray6 = new int[] { (short) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, 100, (int) ' ');
    }

    @Test
    public void test12256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12256");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 1, (short) -1, (byte) -1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) 1, (int) (byte) 1);
    }

    @Test
    public void test12257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12257");
        int[] intArray6 = new int[] { (byte) 10, 0, 0, 0, 1, (byte) 1 };
        int[] intArray13 = new int[] { (short) 0, (short) 0, '#', (byte) 10, (short) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) '4', 0);
    }

    @Test
    public void test12258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12258");
        int[] intArray4 = new int[] { (byte) 100, 10, (byte) -1, (byte) 100 };
        int[] intArray11 = new int[] { ' ', (byte) 1, (short) 100, (byte) -1, (-1), '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) 10, (-1));
    }

    @Test
    public void test12259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12259");
        int[] intArray6 = new int[] { 10, 10, (byte) 1, (short) 0, (byte) 10, (short) 10 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) 0, (int) (byte) 10);
    }

    @Test
    public void test12260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12260");
        int[] intArray6 = new int[] { 0, (byte) 100, 100, (byte) 1, '#', (short) 10 };
        int[] intArray12 = new int[] { 0, '#', '4', 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) 'a', (int) (short) 10);
    }

    @Test
    public void test12261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12261");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) 1, (byte) 100, '4', (byte) 0, ' ', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) 1, (int) (byte) 100);
    }

    @Test
    public void test12262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12262");
        int[] intArray6 = new int[] { '#', '#', 0, (short) 100, (short) 10, (byte) 10 };
        int[] intArray8 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 1, (int) (byte) 10);
    }

    @Test
    public void test12263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12263");
        int[] intArray1 = new int[] { 10 };
        int[] intArray4 = new int[] { ' ', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) -1, 0);
    }

    @Test
    public void test12264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12264");
        int[] intArray5 = new int[] { (short) 100, (short) 100, (byte) 100, (byte) 10, 'a' };
        int[] intArray12 = new int[] { (short) 0, 1, (-1), (short) 1, (byte) 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (byte) 1, (int) (short) -1);
    }

    @Test
    public void test12265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12265");
        int[] intArray3 = new int[] { (byte) -1, ' ', (short) 1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) 0, 100);
    }

    @Test
    public void test12266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12266");
        int[] intArray5 = new int[] { (short) 1, (short) 10, (-1), (-1), (-1) };
        int[] intArray8 = new int[] { 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) 1, 0);
    }

    @Test
    public void test12267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12267");
        int[] intArray6 = new int[] { (short) 0, (byte) 1, (byte) -1, '4', (-1), ' ' };
        int[] intArray9 = new int[] { (byte) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (short) 1, (int) (short) 10);
    }

    @Test
    public void test12268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12268");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int[] intArray7 = new int[] { (short) 100, (byte) 10, (short) 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 1, (-1));
    }

    @Test
    public void test12269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12269");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray4 = new int[] { (short) 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test12270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12270");
        int[] intArray3 = new int[] { (short) 0, (-1), (short) 100 };
        int[] intArray9 = new int[] { '#', (short) -1, 100, (short) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (short) 10, (int) '#');
    }

    @Test
    public void test12271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12271");
        int[] intArray1 = new int[] { '4' };
        int[] intArray7 = new int[] { 'a', 0, 100, (short) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) 100, 0);
    }

    @Test
    public void test12272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12272");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray7 = new int[] { (-1), (short) 0, (short) -1, (byte) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) -1, (int) (short) 1);
    }

    @Test
    public void test12273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12273");
        int[] intArray2 = new int[] { (byte) 100, (-1) };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) -1, (int) (byte) 100);
    }

    @Test
    public void test12274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12274");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) -1, (short) 100, 'a', (short) -1, (short) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (-1), 100);
    }

    @Test
    public void test12275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12275");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) 1, (int) (short) 100);
    }

    @Test
    public void test12276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12276");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray4 = new int[] { 'a', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) 'a', (int) (short) 1);
    }

    @Test
    public void test12277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12277");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) 10, (int) (short) 10);
    }

    @Test
    public void test12278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12278");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (byte) 10, '4', (short) 100, (byte) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) 'a', (int) (byte) -1);
    }

    @Test
    public void test12279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12279");
        int[] intArray2 = new int[] { (byte) 100, (byte) 10 };
        int[] intArray5 = new int[] { '4', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (-1), (int) ' ');
    }

    @Test
    public void test12280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12280");
        int[] intArray4 = new int[] { (byte) 10, (byte) 10, (short) 100, (short) -1 };
        int[] intArray9 = new int[] { (short) 10, (byte) -1, 'a', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) 0, (int) (short) 1);
    }

    @Test
    public void test12281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12281");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) 10, (short) 10, (short) 1, '#', (short) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) 10, (int) (short) 1);
    }

    @Test
    public void test12282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12282");
        int[] intArray4 = new int[] { '#', 10, (byte) -1, (byte) 100 };
        int[] intArray6 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (-1), (int) (short) 10);
    }

    @Test
    public void test12283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12283");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { '4', (byte) -1, 1, 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) ' ', 0);
    }

    @Test
    public void test12284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12284");
        int[] intArray3 = new int[] { (short) 1, (byte) 1, 100 };
        int[] intArray7 = new int[] { (short) 10, 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 100, (int) 'a');
    }

    @Test
    public void test12285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12285");
        int[] intArray1 = new int[] { 1 };
        int[] intArray4 = new int[] { 'a', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (short) 10, 1);
    }

    @Test
    public void test12286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12286");
        int[] intArray5 = new int[] { (byte) 0, (short) 0, (byte) 100, (byte) -1, ' ' };
        int[] intArray8 = new int[] { 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 0, (int) (byte) 100);
    }

    @Test
    public void test12287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12287");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray7 = new int[] { (short) 1, 100, (-1), ' ', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) 100, (int) (short) 100);
    }

    @Test
    public void test12288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12288");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray7 = new int[] { (byte) 0, ' ', (byte) -1, 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, 0, (int) (short) 1);
    }

    @Test
    public void test12289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12289");
        int[] intArray5 = new int[] { '#', (byte) -1, (short) -1, 1, 1 };
        int[] intArray12 = new int[] { (short) -1, (short) 1, '4', 1, '4', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) 'a', 100);
    }

    @Test
    public void test12290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12290");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 'a', 100, (short) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 10, (-1));
    }

    @Test
    public void test12291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12291");
        int[] intArray4 = new int[] { (byte) -1, '#', (byte) 100, '#' };
        int[] intArray8 = new int[] { ' ', '#', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 0, (int) ' ');
    }

    @Test
    public void test12292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12292");
        int[] intArray2 = new int[] { (byte) 100, (short) 10 };
        int[] intArray5 = new int[] { 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (byte) 1, (int) '4');
    }

    @Test
    public void test12293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12293");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (byte) 100, (int) ' ');
    }

    @Test
    public void test12294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12294");
        int[] intArray6 = new int[] { 0, (short) 0, (byte) 1, 100, '#', 10 };
        int[] intArray10 = new int[] { 'a', 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 100, 10);
    }

    @Test
    public void test12295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12295");
        int[] intArray6 = new int[] { 0, 0, (byte) 0, (byte) -1, (short) -1, (short) -1 };
        int[] intArray11 = new int[] { ' ', (byte) 100, 'a', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (byte) 10, 10);
    }

    @Test
    public void test12296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12296");
        int[] intArray5 = new int[] { (byte) 0, (byte) 10, 10, (byte) 10, (short) -1 };
        int[] intArray11 = new int[] { (byte) -1, (short) 10, (byte) 10, (short) 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) 10, (int) (short) 100);
    }

    @Test
    public void test12297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12297");
        int[] intArray5 = new int[] { (short) 0, (byte) 10, (short) 1, 10, 100 };
        int[] intArray8 = new int[] { (short) 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 10, (int) ' ');
    }

    @Test
    public void test12298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12298");
        int[] intArray5 = new int[] { (byte) -1, (byte) 10, 0, (byte) -1, 0 };
        int[] intArray11 = new int[] { (byte) 1, '4', 0, (short) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test12299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12299");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { '#', 0, (byte) 1, 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test12300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12300");
        int[] intArray3 = new int[] { '#', (byte) 1, (short) 10 };
        int[] intArray9 = new int[] { 0, (byte) 0, '#', 'a', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (byte) 1, 1);
    }

    @Test
    public void test12301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12301");
        int[] intArray2 = new int[] { (short) 100, (short) 100 };
        int[] intArray6 = new int[] { (short) 100, (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (short) 0, (int) 'a');
    }

    @Test
    public void test12302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12302");
        int[] intArray3 = new int[] { (byte) 100, (byte) -1, (byte) 1 };
        int[] intArray6 = new int[] { (short) -1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) -1, (int) (short) 10);
    }

    @Test
    public void test12303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12303");
        int[] intArray4 = new int[] { (short) -1, 10, (byte) -1, ' ' };
        int[] intArray11 = new int[] { (byte) 100, (byte) -1, (short) 10, (byte) 0, 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (byte) -1, 0);
    }

    @Test
    public void test12304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12304");
        int[] intArray4 = new int[] { (byte) 0, (short) 10, 'a', (short) 0 };
        int[] intArray10 = new int[] { (byte) 0, (byte) -1, 'a', (short) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) 1, (int) '#');
    }

    @Test
    public void test12305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12305");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 0, 'a', (short) 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 10, 100);
    }

    @Test
    public void test12306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12306");
        int[] intArray2 = new int[] { '4', 'a' };
        int[] intArray6 = new int[] { (short) 100, (short) 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (short) 100, (int) (byte) 0);
    }

    @Test
    public void test12307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12307");
        int[] intArray3 = new int[] { 10, (short) -1, '#' };
        int[] intArray5 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) -1, (int) (byte) 1);
    }

    @Test
    public void test12308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12308");
        int[] intArray2 = new int[] { ' ', (byte) 100 };
        int[] intArray6 = new int[] { (byte) 10, 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) 'a', 0);
    }

    @Test
    public void test12309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12309");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) 0, (short) 10, (short) -1, (short) 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) 100, (int) (byte) -1);
    }

    @Test
    public void test12310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12310");
        int[] intArray4 = new int[] { ' ', (short) 10, (short) -1, (short) 100 };
        int[] intArray7 = new int[] { 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) -1, (int) (byte) 10);
    }

    @Test
    public void test12311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12311");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) -1, (int) '#');
    }

    @Test
    public void test12312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12312");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray6 = new int[] { 'a', (byte) 10, (short) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (byte) 0, 10);
    }

    @Test
    public void test12313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12313");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (-1), (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (byte) 0, 0);
    }

    @Test
    public void test12314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12314");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 0, (short) -1, (short) 1, '#', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) 1, (int) '4');
    }

    @Test
    public void test12315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12315");
        int[] intArray4 = new int[] { '4', (byte) -1, (short) 1, 'a' };
        int[] intArray11 = new int[] { (short) -1, (byte) -1, (short) 0, (byte) 100, 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) '#', (int) (short) 1);
    }

    @Test
    public void test12316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12316");
        int[] intArray6 = new int[] { (byte) 100, (short) 10, (byte) 0, (short) 100, 0, (short) 10 };
        int[] intArray9 = new int[] { 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) 'a', (int) (short) 1);
    }

    @Test
    public void test12317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12317");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray5 = new int[] { (byte) -1, '#', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (byte) 10, (int) '4');
    }

    @Test
    public void test12318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12318");
        int[] intArray3 = new int[] { '4', '#', (short) 100 };
        int[] intArray6 = new int[] { '4', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (-1), (int) '#');
    }

    @Test
    public void test12319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12319");
        int[] intArray1 = new int[] { '#' };
        int[] intArray5 = new int[] { 'a', '#', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test12320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12320");
        int[] intArray6 = new int[] { (short) 100, (byte) -1, (short) 0, 'a', (short) 1, (byte) 1 };
        int[] intArray8 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (-1), (int) 'a');
    }

    @Test
    public void test12321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12321");
        int[] intArray5 = new int[] { (-1), '4', (byte) 0, (byte) 10, 100 };
        int[] intArray7 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) ' ', (int) (byte) 0);
    }

    @Test
    public void test12322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12322");
        int[] intArray6 = new int[] { '4', (byte) 100, (short) 10, '#', '#', (byte) 100 };
        int[] intArray9 = new int[] { (byte) 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test12323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12323");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray3 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, 0, (int) 'a');
    }

    @Test
    public void test12324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12324");
        int[] intArray2 = new int[] { (byte) 100, (byte) 0 };
        int[] intArray8 = new int[] { ' ', (-1), (byte) 0, (short) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 100, (int) (byte) -1);
    }

    @Test
    public void test12325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12325");
        int[] intArray3 = new int[] { 1, (short) 1, '4' };
        int[] intArray10 = new int[] { 1, (short) 1, (byte) 100, (short) 100, 'a', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 0, 0);
    }

    @Test
    public void test12326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12326");
        int[] intArray3 = new int[] { (byte) -1, (short) 1, (-1) };
        int[] intArray5 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) 1, (int) ' ');
    }

    @Test
    public void test12327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12327");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 10, (byte) 100, 'a', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 0, (-1));
    }

    @Test
    public void test12328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12328");
        int[] intArray5 = new int[] { '#', (byte) -1, '#', 100, (-1) };
        int[] intArray7 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (short) -1, (int) (short) -1);
    }

    @Test
    public void test12329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12329");
        int[] intArray6 = new int[] { 10, 'a', ' ', (byte) -1, (short) 0, (short) 100 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) -1, 100);
    }

    @Test
    public void test12330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12330");
        int[] intArray4 = new int[] { (byte) 0, (byte) 0, 100, 100 };
        int[] intArray9 = new int[] { 100, ' ', (short) 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (byte) 100, (int) ' ');
    }

    @Test
    public void test12331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12331");
        int[] intArray4 = new int[] { 1, (byte) 100, (byte) -1, (short) 100 };
        int[] intArray7 = new int[] { (short) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 1, (int) (short) -1);
    }

    @Test
    public void test12332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12332");
        int[] intArray5 = new int[] { ' ', (byte) 100, (-1), 10, (-1) };
        int[] intArray7 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (short) 1, (int) (short) -1);
    }

    @Test
    public void test12333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12333");
        int[] intArray3 = new int[] { 10, (short) 1, 'a' };
        int[] intArray9 = new int[] { (byte) 1, (byte) -1, (byte) 100, ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 0, (int) (short) -1);
    }

    @Test
    public void test12334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12334");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 10, (-1), (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) -1, 0);
    }

    @Test
    public void test12335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12335");
        int[] intArray3 = new int[] { (byte) 100, (short) 100, '#' };
        int[] intArray6 = new int[] { '4', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, 100, (int) (short) 10);
    }

    @Test
    public void test12336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12336");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 'a', (-1), 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) -1, 0);
    }

    @Test
    public void test12337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12337");
        int[] intArray5 = new int[] { (short) 0, (byte) -1, (byte) 10, 100, '#' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) 'a', (int) (short) 10);
    }

    @Test
    public void test12338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12338");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 1, (short) 100, '#', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 1, (int) (short) 1);
    }

    @Test
    public void test12339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12339");
        int[] intArray5 = new int[] { 0, (short) 10, (byte) 10, '4', (-1) };
        int[] intArray7 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) 100, (int) (short) 1);
    }

    @Test
    public void test12340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12340");
        int[] intArray3 = new int[] { (short) 1, 1, ' ' };
        int[] intArray7 = new int[] { (byte) 100, '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test12341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12341");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray4 = new int[] { (short) 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 1, (-1));
    }

    @Test
    public void test12342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12342");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) 100, (int) (short) 0);
    }

    @Test
    public void test12343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12343");
        int[] intArray5 = new int[] { (short) 10, 0, (short) 10, (short) 100, (short) 10 };
        int[] intArray10 = new int[] { (byte) -1, (short) 100, 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) 'a', (int) '4');
    }

    @Test
    public void test12344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12344");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (short) 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (byte) 1, 100);
    }

    @Test
    public void test12345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12345");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray5 = new int[] { (short) 0, '#', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) '#', (int) (byte) 10);
    }

    @Test
    public void test12346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12346");
        int[] intArray1 = new int[] { 1 };
        int[] intArray6 = new int[] { (byte) 1, (byte) -1, (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (short) 10, (-1));
    }

    @Test
    public void test12347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12347");
        int[] intArray4 = new int[] { (-1), (short) 10, (short) 0, (byte) 100 };
        int[] intArray6 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (-1), 10);
    }

    @Test
    public void test12348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12348");
        int[] intArray3 = new int[] { (byte) 0, (short) -1, '#' };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (byte) 100, 0);
    }

    @Test
    public void test12349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12349");
        int[] intArray5 = new int[] { (byte) 100, (short) 10, 0, (short) -1, ' ' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) 0, (int) (byte) 1);
    }

    @Test
    public void test12350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12350");
        int[] intArray5 = new int[] { (short) 1, 1, (byte) -1, (byte) 10, (byte) -1 };
        int[] intArray7 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) '#', (int) '4');
    }

    @Test
    public void test12351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12351");
        int[] intArray4 = new int[] { 'a', (byte) 100, (short) 1, 'a' };
        int[] intArray6 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) '4', (int) (byte) -1);
    }

    @Test
    public void test12352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12352");
        int[] intArray1 = new int[] { 100 };
        int[] intArray6 = new int[] { (short) 1, 10, (short) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 10, (int) 'a');
    }

    @Test
    public void test12353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12353");
        int[] intArray5 = new int[] { (short) 0, 0, (short) 0, 100, 'a' };
        int[] intArray11 = new int[] { ' ', (byte) 10, (byte) 1, (short) 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) 10, (int) (short) 10);
    }

    @Test
    public void test12354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12354");
        int[] intArray6 = new int[] { (short) -1, 0, 100, ' ', (byte) 10, (short) 10 };
        int[] intArray13 = new int[] { (-1), (-1), 100, '4', '4', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (byte) 100, (int) '4');
    }

    @Test
    public void test12355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12355");
        int[] intArray5 = new int[] { (byte) 100, (-1), (byte) 100, ' ', 0 };
        int[] intArray9 = new int[] { 0, (byte) 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 1, 1);
    }

    @Test
    public void test12356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12356");
        int[] intArray5 = new int[] { '#', (byte) 0, (short) 0, (short) 10, (byte) 10 };
        int[] intArray12 = new int[] { (short) 0, (-1), (-1), (byte) 100, '4', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (byte) 10, 100);
    }

    @Test
    public void test12357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12357");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 100, 10, (-1), 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 0, (-1));
    }

    @Test
    public void test12358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12358");
        int[] intArray3 = new int[] { (byte) 1, (byte) 1, '#' };
        int[] intArray10 = new int[] { ' ', (byte) 0, (byte) 10, (short) -1, (-1), (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (-1), 0);
    }

    @Test
    public void test12359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12359");
        int[] intArray6 = new int[] { (short) 100, (short) 0, (byte) 100, (byte) -1, (short) -1, 10 };
        int[] intArray13 = new int[] { (short) -1, (short) 0, '#', (byte) 100, 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (short) 10, (-1));
    }

    @Test
    public void test12360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12360");
        int[] intArray2 = new int[] { (byte) 1, 'a' };
        int[] intArray9 = new int[] { '#', (short) 10, 1, (byte) 10, (byte) 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 10, (int) (byte) 1);
    }

    @Test
    public void test12361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12361");
        int[] intArray4 = new int[] { 'a', (byte) 0, (short) 0, (byte) -1 };
        int[] intArray10 = new int[] { (short) -1, ' ', 0, (byte) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test12362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12362");
        int[] intArray3 = new int[] { ' ', (short) 10, (byte) 100 };
        int[] intArray6 = new int[] { (short) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) '4', (int) '#');
    }

    @Test
    public void test12363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12363");
        int[] intArray2 = new int[] { 1, '4' };
        int[] intArray5 = new int[] { (byte) 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) '#', (-1));
    }

    @Test
    public void test12364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12364");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) 100, 1, (short) -1, (byte) 10, (-1), 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, 1, (int) (byte) -1);
    }

    @Test
    public void test12365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12365");
        int[] intArray5 = new int[] { (short) 1, (short) -1, 10, (short) -1, (short) -1 };
        int[] intArray12 = new int[] { 0, 1, (short) 100, (byte) -1, 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, 10, 1);
    }

    @Test
    public void test12366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12366");
        int[] intArray2 = new int[] { (short) 10, (byte) 10 };
        int[] intArray7 = new int[] { (byte) 0, (short) 1, 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 100, (int) '#');
    }

    @Test
    public void test12367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12367");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray4 = new int[] { (byte) 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (short) 0, (int) (byte) -1);
    }

    @Test
    public void test12368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12368");
        int[] intArray1 = new int[] { 0 };
        int[] intArray7 = new int[] { (byte) -1, ' ', (byte) 1, (short) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) 1, (int) '4');
    }

    @Test
    public void test12369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12369");
        int[] intArray2 = new int[] { (short) -1, (byte) 100 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 10, (int) (short) 10);
    }

    @Test
    public void test12370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12370");
        int[] intArray2 = new int[] { (short) 10, (byte) -1 };
        int[] intArray5 = new int[] { 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) ' ', 0);
    }

    @Test
    public void test12371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12371");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (-1), (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 100, 100);
    }

    @Test
    public void test12372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12372");
        int[] intArray3 = new int[] { '4', (short) -1, 10 };
        int[] intArray6 = new int[] { (-1), (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test12373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12373");
        int[] intArray6 = new int[] { (byte) 100, 0, (byte) -1, (short) 1, 1, (short) 1 };
        int[] intArray9 = new int[] { (short) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 0, 0);
    }

    @Test
    public void test12374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12374");
        int[] intArray5 = new int[] { 'a', (short) 100, (short) 1, 1, (short) -1 };
        int[] intArray7 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (-1), 0);
    }

    @Test
    public void test12375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12375");
        int[] intArray3 = new int[] { (short) -1, '4', (byte) 100 };
        int[] intArray9 = new int[] { (short) 1, (short) 10, (short) 1, (short) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 100, (int) (byte) 100);
    }

    @Test
    public void test12376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12376");
        int[] intArray2 = new int[] { (byte) 100, (short) 0 };
        int[] intArray5 = new int[] { (-1), (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 10, 1);
    }

    @Test
    public void test12377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12377");
        int[] intArray5 = new int[] { ' ', (short) 0, '#', (byte) 10, '#' };
        int[] intArray8 = new int[] { 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) 0, (int) (byte) 1);
    }

    @Test
    public void test12378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12378");
        int[] intArray3 = new int[] { (short) 0, (byte) 0, (short) 100 };
        int[] intArray10 = new int[] { 100, 0, ' ', (byte) 1, (short) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (byte) 10, (int) (short) 1);
    }

    @Test
    public void test12379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12379");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray5 = new int[] { (short) 10, (byte) 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (-1), (int) ' ');
    }

    @Test
    public void test12380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12380");
        int[] intArray5 = new int[] { (short) -1, (byte) 10, (byte) 100, (byte) 0, 100 };
        int[] intArray12 = new int[] { '4', 0, (byte) 10, (byte) 0, 'a', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) 0, (int) (short) -1);
    }

    @Test
    public void test12381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12381");
        int[] intArray6 = new int[] { (-1), (-1), (byte) 100, '#', (byte) 100, (short) 100 };
        int[] intArray9 = new int[] { (byte) 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) -1, 10);
    }

    @Test
    public void test12382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12382");
        int[] intArray2 = new int[] { (byte) 0, ' ' };
        int[] intArray9 = new int[] { (short) 100, 10, (byte) 1, (byte) -1, ' ', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test12383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12383");
        int[] intArray2 = new int[] { (short) 1, (short) 100 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) 1, (int) (short) 0);
    }

    @Test
    public void test12384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12384");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) 1, (int) (short) 100);
    }

    @Test
    public void test12385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12385");
        int[] intArray4 = new int[] { (byte) 100, '#', 100, (byte) 100 };
        int[] intArray8 = new int[] { '#', (-1), 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test12386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12386");
        int[] intArray2 = new int[] { 'a', ' ' };
        int[] intArray6 = new int[] { 10, '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) -1, (int) (byte) 100);
    }

    @Test
    public void test12387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12387");
        int[] intArray4 = new int[] { (short) 0, (byte) 0, (byte) 1, '4' };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (short) 0, 0);
    }

    @Test
    public void test12388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12388");
        int[] intArray5 = new int[] { (short) 0, 10, 1, 'a', 1 };
        int[] intArray8 = new int[] { 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) -1, 0);
    }

    @Test
    public void test12389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12389");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (-1), (byte) 100, (byte) 1, (byte) 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) ' ', 0);
    }

    @Test
    public void test12390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12390");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { ' ', (byte) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) 100, (int) 'a');
    }

    @Test
    public void test12391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12391");
        int[] intArray6 = new int[] { 10, ' ', 10, (short) 1, '#', (byte) -1 };
        int[] intArray11 = new int[] { '4', '#', (short) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 1, (-1));
    }

    @Test
    public void test12392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12392");
        int[] intArray6 = new int[] { (byte) 1, 'a', (short) 10, 100, (byte) 100, (short) 0 };
        int[] intArray12 = new int[] { (short) 10, (byte) 1, (short) 100, (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test12393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12393");
        int[] intArray6 = new int[] { 10, (-1), (byte) 100, 0, (short) 1, (short) 100 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) 1, (int) (byte) 1);
    }

    @Test
    public void test12394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12394");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 100, 1);
    }

    @Test
    public void test12395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12395");
        int[] intArray4 = new int[] { (short) 100, '4', (short) 100, '#' };
        int[] intArray6 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) '4', (int) '4');
    }

    @Test
    public void test12396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12396");
        int[] intArray6 = new int[] { '#', (byte) 10, 0, (short) -1, 0, (short) 100 };
        int[] intArray9 = new int[] { (byte) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test12397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12397");
        int[] intArray3 = new int[] { (short) 0, ' ', (short) 0 };
        int[] intArray6 = new int[] { '4', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) 0, (int) 'a');
    }

    @Test
    public void test12398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12398");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray7 = new int[] { 10, (-1), (short) 10, 'a', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) 10, (int) (byte) 0);
    }

    @Test
    public void test12399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12399");
        int[] intArray6 = new int[] { 100, ' ', (-1), (byte) -1, (byte) 100, (short) -1 };
        int[] intArray9 = new int[] { 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (short) 100, (int) (short) 10);
    }

    @Test
    public void test12400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12400");
        int[] intArray1 = new int[] { 100 };
        int[] intArray7 = new int[] { '4', (byte) 1, (byte) -1, 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, 100, (int) (byte) 10);
    }

    @Test
    public void test12401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12401");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray7 = new int[] { (byte) -1, 1, 'a', (byte) -1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) -1, 100);
    }

    @Test
    public void test12402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12402");
        int[] intArray5 = new int[] { '#', (byte) 1, (short) 1, '4', ' ' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (short) 0, 0);
    }

    @Test
    public void test12403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12403");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray8 = new int[] { 1, 1, 'a', (byte) 100, '4', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) -1, 100);
    }

    @Test
    public void test12404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12404");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (byte) 1 };
        int[] intArray8 = new int[] { 0, (byte) 0, 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) '#', (int) (short) 100);
    }

    @Test
    public void test12405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12405");
        int[] intArray2 = new int[] { (byte) 10, '#' };
        int[] intArray8 = new int[] { (short) 0, '4', 100, '#', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) '4', (int) (short) -1);
    }

    @Test
    public void test12406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12406");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) 100, (int) (short) 10);
    }

    @Test
    public void test12407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12407");
        int[] intArray6 = new int[] { (byte) -1, 100, 100, (short) 10, (byte) 100, (short) 100 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test12408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12408");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (-1), (short) -1, 1, ' ', (short) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, 0, (int) (short) 0);
    }

    @Test
    public void test12409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12409");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray7 = new int[] { (byte) -1, (short) -1, (short) -1, (short) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) 1, (int) '#');
    }

    @Test
    public void test12410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12410");
        int[] intArray3 = new int[] { (short) 0, (byte) 1, 0 };
        int[] intArray6 = new int[] { '4', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) '4', (int) (short) 1);
    }

    @Test
    public void test12411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12411");
        int[] intArray4 = new int[] { (byte) 0, (byte) 0, (short) 0, (byte) 10 };
        int[] intArray6 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, 1, (-1));
    }

    @Test
    public void test12412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12412");
        int[] intArray6 = new int[] { (short) 10, '4', (short) 10, (byte) -1, '4', (byte) -1 };
        int[] intArray9 = new int[] { 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 10, (int) (short) 1);
    }

    @Test
    public void test12413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12413");
        int[] intArray4 = new int[] { (-1), (short) 1, (short) 10, 1 };
        int[] intArray8 = new int[] { '4', (byte) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) 10, (int) ' ');
    }

    @Test
    public void test12414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12414");
        int[] intArray3 = new int[] { (short) 10, (short) 100, '4' };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (byte) 100, (int) (byte) 1);
    }

    @Test
    public void test12415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12415");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 1, (int) '#');
    }

    @Test
    public void test12416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12416");
        int[] intArray4 = new int[] { 10, 0, 10, (byte) 100 };
        int[] intArray8 = new int[] { '4', (byte) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) 10, (-1));
    }

    @Test
    public void test12417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12417");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, 100, (int) (byte) 1);
    }

    @Test
    public void test12418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12418");
        int[] intArray1 = new int[] { '4' };
        int[] intArray3 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) ' ', 1);
    }

    @Test
    public void test12419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12419");
        int[] intArray3 = new int[] { (byte) 100, (byte) 0, (byte) 0 };
        int[] intArray6 = new int[] { (byte) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) 100, (int) (byte) 0);
    }

    @Test
    public void test12420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12420");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (byte) 100, (byte) 100, (short) 10, (short) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) 0, (int) ' ');
    }

    @Test
    public void test12421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12421");
        int[] intArray5 = new int[] { (byte) 100, 10, (byte) 100, (short) 1, 1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) '4', 100);
    }

    @Test
    public void test12422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12422");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 10, (short) 0, (byte) 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test12423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12423");
        int[] intArray2 = new int[] { (short) -1, (short) 1 };
        int[] intArray9 = new int[] { (byte) -1, (-1), (-1), 'a', 'a', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) ' ', (int) (short) 10);
    }

    @Test
    public void test12424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12424");
        int[] intArray5 = new int[] { '4', 1, (byte) 1, 10, 1 };
        int[] intArray11 = new int[] { '#', 'a', (short) 10, ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (-1), (int) (byte) 1);
    }

    @Test
    public void test12425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12425");
        int[] intArray5 = new int[] { (byte) 10, 0, (byte) -1, (short) 100, (byte) 10 };
        int[] intArray7 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) ' ', (int) (short) -1);
    }

    @Test
    public void test12426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12426");
        int[] intArray4 = new int[] { (byte) 1, 10, (byte) -1, (byte) 1 };
        int[] intArray10 = new int[] { 100, (short) -1, 100, ' ', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) 10, (int) '#');
    }

    @Test
    public void test12427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12427");
        int[] intArray2 = new int[] { 100, (short) 1 };
        int[] intArray6 = new int[] { (byte) 1, (short) 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 10, (-1));
    }

    @Test
    public void test12428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12428");
        int[] intArray5 = new int[] { 10, 100, (short) 10, '#', '4' };
        int[] intArray9 = new int[] { (short) 10, (byte) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 10, (int) (byte) -1);
    }

    @Test
    public void test12429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12429");
        int[] intArray4 = new int[] { (short) 1, (short) 10, 10, (byte) 0 };
        int[] intArray7 = new int[] { (short) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) 10, (int) '4');
    }

    @Test
    public void test12430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12430");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray5 = new int[] { (byte) -1, (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) 0, (int) (short) 10);
    }

    @Test
    public void test12431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12431");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) '4', (int) (byte) -1);
    }

    @Test
    public void test12432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12432");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 1, (short) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, 100, (int) (short) 0);
    }

    @Test
    public void test12433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12433");
        int[] intArray1 = new int[] { '4' };
        int[] intArray4 = new int[] { (byte) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 10, (int) '#');
    }

    @Test
    public void test12434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12434");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (-1), (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (byte) 0, 10);
    }

    @Test
    public void test12435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12435");
        int[] intArray3 = new int[] { 100, 100, (byte) 10 };
        int[] intArray8 = new int[] { '#', (short) 10, '4', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (byte) 100, (int) '4');
    }

    @Test
    public void test12436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12436");
        int[] intArray3 = new int[] { (byte) 100, (short) 10, (short) 0 };
        int[] intArray7 = new int[] { (byte) 0, '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 0, (int) (short) 0);
    }

    @Test
    public void test12437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12437");
        int[] intArray2 = new int[] { ' ', (short) 10 };
        int[] intArray9 = new int[] { (short) 0, 1, (byte) 100, '4', (short) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) '4', 10);
    }

    @Test
    public void test12438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12438");
        int[] intArray5 = new int[] { (byte) 10, ' ', (byte) -1, 0, '4' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) 100, (-1));
    }

    @Test
    public void test12439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12439");
        int[] intArray2 = new int[] { (byte) 1, (byte) 1 };
        int[] intArray4 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 100, (int) (short) 0);
    }

    @Test
    public void test12440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12440");
        int[] intArray6 = new int[] { 1, (short) 10, (byte) -1, (byte) 1, 'a', '4' };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) '#', 0);
    }

    @Test
    public void test12441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12441");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 'a', '#', 1, (byte) -1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) 0, 0);
    }

    @Test
    public void test12442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12442");
        int[] intArray2 = new int[] { (short) 1, 0 };
        int[] intArray4 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 10, (-1));
    }

    @Test
    public void test12443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12443");
        int[] intArray2 = new int[] { 0, (byte) 10 };
        int[] intArray9 = new int[] { (short) 10, (short) 10, 'a', 'a', 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 100, (-1));
    }

    @Test
    public void test12444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12444");
        int[] intArray2 = new int[] { (short) -1, (byte) 10 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 1, (int) (byte) 10);
    }

    @Test
    public void test12445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12445");
        int[] intArray5 = new int[] { 'a', '#', (byte) 1, ' ', (byte) -1 };
        int[] intArray9 = new int[] { (short) 0, (-1), 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 100, (int) (byte) 0);
    }

    @Test
    public void test12446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12446");
        int[] intArray5 = new int[] { (byte) 1, ' ', 'a', (byte) -1, (short) 0 };
        int[] intArray11 = new int[] { (byte) 1, 100, '4', 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 10, (-1));
    }

    @Test
    public void test12447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12447");
        int[] intArray3 = new int[] { (byte) 0, (byte) 0, (short) 10 };
        int[] intArray10 = new int[] { ' ', (short) 1, (short) 100, (short) -1, 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 10, (int) '4');
    }

    @Test
    public void test12448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12448");
        int[] intArray4 = new int[] { '#', '#', (short) -1, (short) 100 };
        int[] intArray6 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) ' ', (int) (short) 100);
    }

    @Test
    public void test12449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12449");
        int[] intArray4 = new int[] { (byte) 100, (byte) 100, (short) 1, 'a' };
        int[] intArray9 = new int[] { 0, (short) -1, '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) '4', (int) 'a');
    }

    @Test
    public void test12450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12450");
        int[] intArray6 = new int[] { (byte) 0, (byte) 10, (short) 100, (-1), (short) 10, (short) 0 };
        int[] intArray13 = new int[] { (byte) 0, 'a', (short) 0, (short) 10, 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (-1), (int) (byte) 1);
    }

    @Test
    public void test12451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12451");
        int[] intArray2 = new int[] { (short) 0, 10 };
        int[] intArray5 = new int[] { (byte) 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 10, (int) (byte) 0);
    }

    @Test
    public void test12452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12452");
        int[] intArray4 = new int[] { 10, (byte) -1, 0, (short) 100 };
        int[] intArray8 = new int[] { 100, (byte) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 10, (int) ' ');
    }

    @Test
    public void test12453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12453");
        int[] intArray2 = new int[] { (short) 10, (byte) 10 };
        int[] intArray5 = new int[] { (byte) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 100, (int) 'a');
    }

    @Test
    public void test12454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12454");
        int[] intArray4 = new int[] { 100, ' ', (byte) 100, (short) 10 };
        int[] intArray10 = new int[] { (byte) -1, '4', 'a', '4', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) -1, (int) (short) 1);
    }

    @Test
    public void test12455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12455");
        int[] intArray3 = new int[] { 100, (short) 100, 1 };
        int[] intArray7 = new int[] { 10, 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) 100, (int) '4');
    }

    @Test
    public void test12456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12456");
        int[] intArray5 = new int[] { (short) 10, '#', (byte) 1, 0, (short) 1 };
        int[] intArray9 = new int[] { '#', (byte) 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) '4', (int) (byte) 10);
    }

    @Test
    public void test12457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12457");
        int[] intArray5 = new int[] { (short) 100, (byte) -1, '#', (short) 1, (byte) 1 };
        int[] intArray9 = new int[] { (byte) 1, (short) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 10, 0);
    }

    @Test
    public void test12458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12458");
        int[] intArray2 = new int[] { (short) 10, (byte) 10 };
        int[] intArray5 = new int[] { (byte) 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 1, (int) (byte) 10);
    }

    @Test
    public void test12459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12459");
        int[] intArray2 = new int[] { 1, 'a' };
        int[] intArray6 = new int[] { (short) 1, 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test12460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12460");
        int[] intArray5 = new int[] { (short) -1, (short) 10, (-1), 10, (short) -1 };
        int[] intArray9 = new int[] { (short) 1, '#', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 100, (int) (byte) 100);
    }

    @Test
    public void test12461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12461");
        int[] intArray1 = new int[] { 100 };
        int[] intArray5 = new int[] { '4', 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (byte) 0, 100);
    }

    @Test
    public void test12462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12462");
        int[] intArray3 = new int[] { (short) 0, (short) 0, (-1) };
        int[] intArray5 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test12463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12463");
        int[] intArray5 = new int[] { (byte) 0, 10, (-1), 10, 0 };
        int[] intArray9 = new int[] { '4', (byte) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 100, (int) '#');
    }

    @Test
    public void test12464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12464");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) 1, 100);
    }

    @Test
    public void test12465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12465");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (byte) -1, (int) '4');
    }

    @Test
    public void test12466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12466");
        int[] intArray3 = new int[] { ' ', (byte) 100, '4' };
        int[] intArray10 = new int[] { (short) -1, 'a', (-1), (short) 1, 'a', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 1, (int) (byte) 10);
    }

    @Test
    public void test12467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12467");
        int[] intArray3 = new int[] { (short) 1, (byte) 10, (short) 1 };
        int[] intArray7 = new int[] { 0, (short) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) 100, (int) (short) 10);
    }

    @Test
    public void test12468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12468");
        int[] intArray2 = new int[] { (byte) 0, (short) -1 };
        int[] intArray4 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 1, (int) '4');
    }

    @Test
    public void test12469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12469");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, 0, (int) (byte) 10);
    }

    @Test
    public void test12470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12470");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 100, (short) -1, ' ', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) 10, (int) '4');
    }

    @Test
    public void test12471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12471");
        int[] intArray4 = new int[] { '#', (byte) -1, 100, ' ' };
        int[] intArray9 = new int[] { (short) 10, 'a', 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (byte) 100, 0);
    }

    @Test
    public void test12472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12472");
        int[] intArray2 = new int[] { 10, (-1) };
        int[] intArray5 = new int[] { 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) -1, (int) (short) 100);
    }

    @Test
    public void test12473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12473");
        int[] intArray2 = new int[] { '#', ' ' };
        int[] intArray6 = new int[] { 100, (short) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 0, (int) '4');
    }

    @Test
    public void test12474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12474");
        int[] intArray3 = new int[] { '#', 10, (-1) };
        int[] intArray6 = new int[] { (byte) -1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) 100, (int) ' ');
    }

    @Test
    public void test12475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12475");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray6 = new int[] { 10, 1, (-1), (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) ' ', (int) 'a');
    }

    @Test
    public void test12476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12476");
        int[] intArray1 = new int[] { 0 };
        int[] intArray4 = new int[] { (-1), (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, 10, (int) (short) 100);
    }

    @Test
    public void test12477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12477");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 10, (byte) 0, (short) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 1, (int) '4');
    }

    @Test
    public void test12478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12478");
        int[] intArray5 = new int[] { (byte) 10, '#', 1, (short) -1, (short) 10 };
        int[] intArray12 = new int[] { (short) -1, '#', 100, 1, (byte) -1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, 0, (int) '#');
    }

    @Test
    public void test12479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12479");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray4 = new int[] { (short) 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) 'a', 1);
    }

    @Test
    public void test12480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12480");
        int[] intArray3 = new int[] { (short) 1, '4', (short) 1 };
        int[] intArray9 = new int[] { (short) 10, 1, (byte) -1, (short) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 0, (int) 'a');
    }

    @Test
    public void test12481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12481");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (-1), (-1));
    }

    @Test
    public void test12482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12482");
        int[] intArray5 = new int[] { '4', (short) 0, 0, (short) 0, 'a' };
        int[] intArray9 = new int[] { (byte) 10, (short) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 10, (int) (byte) 1);
    }

    @Test
    public void test12483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12483");
        int[] intArray3 = new int[] { (byte) -1, (-1), (byte) 10 };
        int[] intArray10 = new int[] { '4', 1, (short) 100, (byte) 1, (short) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) ' ', 0);
    }

    @Test
    public void test12484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12484");
        int[] intArray3 = new int[] { 0, (short) 100, (short) -1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) '4', (int) (short) 0);
    }

    @Test
    public void test12485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12485");
        int[] intArray1 = new int[] { 10 };
        int[] intArray4 = new int[] { 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (-1), 1);
    }

    @Test
    public void test12486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12486");
        int[] intArray5 = new int[] { 10, 100, (byte) 10, '#', 1 };
        int[] intArray10 = new int[] { (short) -1, 1, (short) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) ' ', (int) (short) 100);
    }

    @Test
    public void test12487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12487");
        int[] intArray4 = new int[] { (-1), (byte) -1, (-1), ' ' };
        int[] intArray11 = new int[] { (short) 1, (short) 100, '#', (byte) 100, 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) 10, 10);
    }

    @Test
    public void test12488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12488");
        int[] intArray1 = new int[] { 100 };
        int[] intArray5 = new int[] { (-1), (short) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (byte) 1, (int) (short) 100);
    }

    @Test
    public void test12489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12489");
        int[] intArray4 = new int[] { 0, (short) 100, (short) 100, 0 };
        int[] intArray8 = new int[] { (short) 1, ' ', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 10, (int) '4');
    }

    @Test
    public void test12490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12490");
        int[] intArray5 = new int[] { (byte) 100, (byte) 0, ' ', (-1), '#' };
        int[] intArray8 = new int[] { (short) 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 10, (int) (byte) 0);
    }

    @Test
    public void test12491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12491");
        int[] intArray2 = new int[] { (short) -1, 'a' };
        int[] intArray5 = new int[] { (byte) 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 100, (int) ' ');
    }

    @Test
    public void test12492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12492");
        int[] intArray5 = new int[] { 'a', (short) 0, (short) -1, 0, 10 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) ' ', (int) 'a');
    }

    @Test
    public void test12493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12493");
        int[] intArray3 = new int[] { (byte) -1, (short) 100, (-1) };
        int[] intArray6 = new int[] { (short) 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test12494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12494");
        int[] intArray4 = new int[] { 0, (byte) 0, (-1), (short) 10 };
        int[] intArray9 = new int[] { 0, 100, (byte) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 100, (int) (byte) 0);
    }

    @Test
    public void test12495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12495");
        int[] intArray5 = new int[] { (byte) -1, 1, (short) 1, '4', (byte) 0 };
        int[] intArray7 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (short) -1, (-1));
    }

    @Test
    public void test12496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12496");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int[] intArray6 = new int[] { 100, 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (short) 0, (int) (byte) 100);
    }

    @Test
    public void test12497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12497");
        int[] intArray6 = new int[] { (-1), (short) 100, (-1), 1, (short) 100, 10 };
        int[] intArray13 = new int[] { (byte) 10, (byte) -1, '#', (short) 1, 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 100, (int) ' ');
    }

    @Test
    public void test12498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12498");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) -1, (short) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) '#', (int) (short) -1);
    }

    @Test
    public void test12499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12499");
        int[] intArray5 = new int[] { (short) 10, (byte) 1, (byte) 0, 10, ' ' };
        int[] intArray10 = new int[] { '#', (-1), (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (short) 1, 1);
    }

    @Test
    public void test12500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest24.test12500");
        int[] intArray2 = new int[] { (byte) 0, (short) 0 };
        int[] intArray9 = new int[] { (short) -1, 'a', (-1), (byte) 1, (byte) 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (byte) 0, (int) (short) 10);
    }
}

