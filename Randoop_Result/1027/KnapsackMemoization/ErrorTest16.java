package KnapsackMemoization;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest16 {

    public static boolean debug = false;

    @Test
    public void test08001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08001");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray6 = new int[] { (short) 10, (short) 0, (short) -1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) '#', (-1));
    }

    @Test
    public void test08002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08002");
        int[] intArray6 = new int[] { 100, 0, 1, 'a', (short) 0, 100 };
        int[] intArray13 = new int[] { (byte) 10, (byte) 0, 100, (byte) 10, (short) 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (short) -1, (-1));
    }

    @Test
    public void test08003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08003");
        int[] intArray3 = new int[] { (short) 10, ' ', ' ' };
        int[] intArray8 = new int[] { 100, '#', 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 10, (int) '#');
    }

    @Test
    public void test08004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08004");
        int[] intArray6 = new int[] { 1, (short) 1, (short) 10, 0, (byte) -1, 0 };
        int[] intArray11 = new int[] { (byte) 10, (short) 100, (byte) 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) '#', 10);
    }

    @Test
    public void test08005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08005");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) ' ', (int) (short) 10);
    }

    @Test
    public void test08006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08006");
        int[] intArray2 = new int[] { 1, (byte) -1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (-1), (int) '4');
    }

    @Test
    public void test08007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08007");
        int[] intArray5 = new int[] { (-1), 10, 'a', (byte) 100, 1 };
        int[] intArray8 = new int[] { (short) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) 1, (-1));
    }

    @Test
    public void test08008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08008");
        int[] intArray4 = new int[] { '#', (byte) 0, (byte) 100, 0 };
        int[] intArray10 = new int[] { (short) 1, (byte) 1, 10, 'a', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) '4', (int) (byte) 1);
    }

    @Test
    public void test08009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08009");
        int[] intArray1 = new int[] { '#' };
        int[] intArray3 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (byte) 1, 0);
    }

    @Test
    public void test08010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08010");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) 0, 1, (byte) 1, (short) 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, 0, 1);
    }

    @Test
    public void test08011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08011");
        int[] intArray6 = new int[] { (-1), (byte) 1, '#', (-1), ' ', (short) 100 };
        int[] intArray8 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) 'a', 0);
    }

    @Test
    public void test08012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08012");
        int[] intArray3 = new int[] { '#', '#', (byte) 0 };
        int[] intArray8 = new int[] { (byte) 10, (short) -1, (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 0, (int) (short) 0);
    }

    @Test
    public void test08013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08013");
        int[] intArray3 = new int[] { (byte) -1, '#', (short) 10 };
        int[] intArray6 = new int[] { (short) -1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, 0, (int) (byte) 10);
    }

    @Test
    public void test08014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08014");
        int[] intArray4 = new int[] { (byte) 10, (byte) -1, 100, (byte) -1 };
        int[] intArray7 = new int[] { '#', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 10, 0);
    }

    @Test
    public void test08015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08015");
        int[] intArray5 = new int[] { '#', (-1), (byte) 100, (short) 100, (short) 0 };
        int[] intArray12 = new int[] { (byte) 10, (byte) 10, 'a', (short) 10, (byte) 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) 100, (int) (byte) 1);
    }

    @Test
    public void test08016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08016");
        int[] intArray4 = new int[] { (byte) -1, (short) 1, 0, 0 };
        int[] intArray7 = new int[] { 'a', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 0, (int) '#');
    }

    @Test
    public void test08017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08017");
        int[] intArray5 = new int[] { (byte) 1, 100, '4', (-1), (byte) 1 };
        int[] intArray8 = new int[] { 'a', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) 0, (-1));
    }

    @Test
    public void test08018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08018");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray6 = new int[] { (short) 0, (byte) 1, ' ', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 0, (int) (byte) 1);
    }

    @Test
    public void test08019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08019");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 100, 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (-1), (int) '#');
    }

    @Test
    public void test08020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08020");
        int[] intArray4 = new int[] { 1, (short) -1, ' ', ' ' };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, 10, (int) '#');
    }

    @Test
    public void test08021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08021");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray3 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) 1, 100);
    }

    @Test
    public void test08022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08022");
        int[] intArray5 = new int[] { (byte) 0, '#', (byte) 10, 'a', 1 };
        int[] intArray10 = new int[] { (short) 100, 100, (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (byte) -1, (int) (short) -1);
    }

    @Test
    public void test08023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08023");
        int[] intArray5 = new int[] { '4', 'a', 100, (short) 0, 'a' };
        int[] intArray10 = new int[] { 1, '#', (short) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) '4', (-1));
    }

    @Test
    public void test08024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08024");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) 100, (int) (byte) 0);
    }

    @Test
    public void test08025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08025");
        int[] intArray4 = new int[] { 1, 100, '4', '#' };
        int[] intArray11 = new int[] { 'a', '#', ' ', (byte) 100, (short) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (byte) -1, (int) (short) 1);
    }

    @Test
    public void test08026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08026");
        int[] intArray3 = new int[] { (-1), (short) 10, 1 };
        int[] intArray7 = new int[] { (short) 100, (byte) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) 'a', (int) (byte) -1);
    }

    @Test
    public void test08027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08027");
        int[] intArray4 = new int[] { (short) 1, 0, (short) 0, (byte) 1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (short) 1, 100);
    }

    @Test
    public void test08028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08028");
        int[] intArray5 = new int[] { 0, (byte) 0, ' ', ' ', (-1) };
        int[] intArray9 = new int[] { (-1), (short) 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) '#', (int) (byte) 10);
    }

    @Test
    public void test08029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08029");
        int[] intArray6 = new int[] { 0, '#', '#', (byte) -1, (byte) 1, (byte) 100 };
        int[] intArray12 = new int[] { (byte) 10, ' ', (short) 0, (-1), 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (byte) 100, (int) (short) -1);
    }

    @Test
    public void test08030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08030");
        int[] intArray3 = new int[] { (short) 1, (short) 1, ' ' };
        int[] intArray5 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) '#', (int) '#');
    }

    @Test
    public void test08031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08031");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) 100, ' ', '4', (short) 1, 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, 0, 1);
    }

    @Test
    public void test08032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08032");
        int[] intArray1 = new int[] { 100 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) 1, (int) (short) 100);
    }

    @Test
    public void test08033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08033");
        int[] intArray4 = new int[] { (byte) 100, (short) 10, 'a', (byte) 1 };
        int[] intArray9 = new int[] { ' ', (short) 10, (short) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 10, (int) '4');
    }

    @Test
    public void test08034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08034");
        int[] intArray5 = new int[] { 'a', (short) 1, (short) 100, (byte) 10, (byte) 100 };
        int[] intArray8 = new int[] { (short) -1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 0, (-1));
    }

    @Test
    public void test08035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08035");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray4 = new int[] { (byte) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (short) -1, (int) (short) -1);
    }

    @Test
    public void test08036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08036");
        int[] intArray1 = new int[] { 0 };
        int[] intArray4 = new int[] { 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 10, (-1));
    }

    @Test
    public void test08037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08037");
        int[] intArray4 = new int[] { (short) 0, ' ', '4', (byte) 100 };
        int[] intArray7 = new int[] { (-1), 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 100, 100);
    }

    @Test
    public void test08038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08038");
        int[] intArray3 = new int[] { 'a', 1, (short) -1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, 100, (int) (short) 0);
    }

    @Test
    public void test08039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08039");
        int[] intArray3 = new int[] { (-1), (byte) 10, 10 };
        int[] intArray9 = new int[] { (byte) 10, (-1), (short) 100, (short) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (byte) 100, (int) (byte) -1);
    }

    @Test
    public void test08040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08040");
        int[] intArray5 = new int[] { 1, (short) 1, (byte) 100, (byte) 100, (short) 100 };
        int[] intArray7 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) 0, (int) '4');
    }

    @Test
    public void test08041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08041");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 0, (-1), (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) -1, 100);
    }

    @Test
    public void test08042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08042");
        int[] intArray5 = new int[] { (byte) 10, (byte) 10, (byte) 1, (byte) 10, (short) 100 };
        int[] intArray8 = new int[] { (short) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) '#', (int) '4');
    }

    @Test
    public void test08043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08043");
        int[] intArray2 = new int[] { '4', (byte) -1 };
        int[] intArray4 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (short) 100, (int) ' ');
    }

    @Test
    public void test08044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08044");
        int[] intArray3 = new int[] { (short) 1, 'a', ' ' };
        int[] intArray9 = new int[] { (short) 100, '4', ' ', 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test08045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08045");
        int[] intArray6 = new int[] { (byte) 1, '#', '4', (-1), (byte) 1, (byte) 10 };
        int[] intArray13 = new int[] { 10, (short) -1, (short) 10, 0, 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 100, (int) '#');
    }

    @Test
    public void test08046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08046");
        int[] intArray3 = new int[] { (short) 100, ' ', (short) -1 };
        int[] intArray6 = new int[] { (-1), (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (-1), 100);
    }

    @Test
    public void test08047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08047");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, 100, (int) (byte) 100);
    }

    @Test
    public void test08048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08048");
        int[] intArray3 = new int[] { (short) 1, (byte) 1, (byte) 100 };
        int[] intArray7 = new int[] { 1, 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) 100, (int) (byte) -1);
    }

    @Test
    public void test08049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08049");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 0, (byte) -1, (byte) 100, (short) -1, 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test08050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08050");
        int[] intArray6 = new int[] { (short) 0, (short) 1, '#', '#', 10, 1 };
        int[] intArray11 = new int[] { (short) 1, (byte) 1, (byte) 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 1, 100);
    }

    @Test
    public void test08051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08051");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) -1, (byte) 1, (short) 1, (short) 1, (byte) 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (-1), (int) (short) -1);
    }

    @Test
    public void test08052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08052");
        int[] intArray3 = new int[] { (byte) -1, (byte) 10, (short) 10 };
        int[] intArray10 = new int[] { '#', 'a', (byte) 1, (short) 100, (short) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 100, (int) '#');
    }

    @Test
    public void test08053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08053");
        int[] intArray6 = new int[] { 1, 100, (-1), 10, '#', (short) 1 };
        int[] intArray12 = new int[] { (short) 10, (short) 1, 1, (short) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) -1, (int) (byte) 100);
    }

    @Test
    public void test08054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08054");
        int[] intArray2 = new int[] { (byte) 100, (short) 10 };
        int[] intArray8 = new int[] { (short) 1, (short) 1, (short) -1, (short) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) '4', (int) (short) 10);
    }

    @Test
    public void test08055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08055");
        int[] intArray3 = new int[] { 100, '4', (-1) };
        int[] intArray9 = new int[] { 'a', (byte) 0, (byte) -1, ' ', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) 'a', (int) (byte) 100);
    }

    @Test
    public void test08056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08056");
        int[] intArray5 = new int[] { (short) 100, '4', 100, '#', (short) 1 };
        int[] intArray7 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, 10, (int) (byte) -1);
    }

    @Test
    public void test08057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08057");
        int[] intArray5 = new int[] { (short) 0, '4', (short) 100, (byte) 0, (short) 0 };
        int[] intArray7 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, 1, (int) (short) 0);
    }

    @Test
    public void test08058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08058");
        int[] intArray6 = new int[] { '4', 0, (short) 1, (byte) 100, ' ', (byte) 10 };
        int[] intArray12 = new int[] { (short) 1, (byte) 1, '4', 'a', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test08059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08059");
        int[] intArray4 = new int[] { (byte) -1, (short) 0, (byte) 1, 0 };
        int[] intArray11 = new int[] { (byte) 10, 'a', 0, 1, (short) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) 'a', (int) (short) 10);
    }

    @Test
    public void test08060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08060");
        int[] intArray3 = new int[] { '#', (short) 100, 100 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) -1, (int) (short) 1);
    }

    @Test
    public void test08061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08061");
        int[] intArray6 = new int[] { 0, (byte) 0, (byte) 100, (byte) 1, (short) 1, '4' };
        int[] intArray11 = new int[] { (short) 1, (byte) 0, (short) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 10, (int) '4');
    }

    @Test
    public void test08062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08062");
        int[] intArray4 = new int[] { ' ', (short) 100, (short) 1, (short) 100 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (byte) -1, (int) (short) 100);
    }

    @Test
    public void test08063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08063");
        int[] intArray3 = new int[] { 0, (short) 10, 'a' };
        int[] intArray6 = new int[] { 'a', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, 100, 0);
    }

    @Test
    public void test08064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08064");
        int[] intArray1 = new int[] { '4' };
        int[] intArray5 = new int[] { '4', '4', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) '#', (int) 'a');
    }

    @Test
    public void test08065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08065");
        int[] intArray6 = new int[] { (byte) 1, (byte) 100, ' ', '#', '#', 100 };
        int[] intArray8 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 0, 0);
    }

    @Test
    public void test08066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08066");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 100, (int) (byte) 100);
    }

    @Test
    public void test08067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08067");
        int[] intArray4 = new int[] { (short) -1, (byte) 10, (byte) -1, (short) 100 };
        int[] intArray11 = new int[] { 1, 100, ' ', 100, (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) 100, (int) (byte) 10);
    }

    @Test
    public void test08068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08068");
        int[] intArray4 = new int[] { (short) 10, (short) 100, (byte) 0, ' ' };
        int[] intArray6 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, 0, (int) (byte) 1);
    }

    @Test
    public void test08069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08069");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (short) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (short) 100, (int) '#');
    }

    @Test
    public void test08070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08070");
        int[] intArray6 = new int[] { '4', (short) 10, (short) 0, 0, (byte) 100, (-1) };
        int[] intArray10 = new int[] { (-1), (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) 'a', (int) (short) -1);
    }

    @Test
    public void test08071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08071");
        int[] intArray4 = new int[] { (byte) -1, (byte) 10, (byte) 10, (short) 0 };
        int[] intArray10 = new int[] { '#', 10, 1, 'a', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, 10, (int) (byte) -1);
    }

    @Test
    public void test08072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08072");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) 1, (-1), (-1), 0, (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) 100, (int) (short) 100);
    }

    @Test
    public void test08073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08073");
        int[] intArray6 = new int[] { (short) 0, (byte) 1, (short) 1, 'a', (byte) -1, (byte) 10 };
        int[] intArray10 = new int[] { 'a', (byte) 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) ' ', (int) '4');
    }

    @Test
    public void test08074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08074");
        int[] intArray5 = new int[] { (byte) -1, (short) -1, (byte) 1, (byte) 10, 10 };
        int[] intArray7 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test08075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08075");
        int[] intArray5 = new int[] { 100, (short) -1, 100, 100, (short) 100 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (short) 100, 1);
    }

    @Test
    public void test08076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08076");
        int[] intArray5 = new int[] { (byte) -1, (short) 0, ' ', '#', (byte) 0 };
        int[] intArray10 = new int[] { (byte) 0, 10, (byte) 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) 'a', (int) (byte) 10);
    }

    @Test
    public void test08077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08077");
        int[] intArray3 = new int[] { (byte) 1, 10, 1 };
        int[] intArray9 = new int[] { 'a', '#', (short) 100, 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) ' ', 100);
    }

    @Test
    public void test08078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08078");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 10, (-1));
    }

    @Test
    public void test08079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08079");
        int[] intArray4 = new int[] { (byte) 10, 10, (short) 1, '4' };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test08080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08080");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray5 = new int[] { '#', ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, 1, 10);
    }

    @Test
    public void test08081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08081");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray4 = new int[] { (short) 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 10, (int) (byte) 0);
    }

    @Test
    public void test08082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08082");
        int[] intArray3 = new int[] { 10, (byte) 100, '4' };
        int[] intArray7 = new int[] { (short) -1, (-1), 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) 10, (int) (byte) -1);
    }

    @Test
    public void test08083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08083");
        int[] intArray1 = new int[] { 10 };
        int[] intArray6 = new int[] { 10, 10, (short) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (short) 0, (int) '4');
    }

    @Test
    public void test08084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08084");
        int[] intArray6 = new int[] { (short) 100, '4', 1, '4', '4', (byte) -1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) 0, (int) (byte) 1);
    }

    @Test
    public void test08085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08085");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray8 = new int[] { (short) 100, 0, 0, (byte) 100, ' ', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 100, (int) 'a');
    }

    @Test
    public void test08086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08086");
        int[] intArray4 = new int[] { (short) 1, (byte) -1, 'a', (short) 0 };
        int[] intArray10 = new int[] { '4', (byte) 0, (short) -1, 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (-1), (int) (short) 1);
    }

    @Test
    public void test08087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08087");
        int[] intArray5 = new int[] { ' ', '4', ' ', 10, (byte) 1 };
        int[] intArray9 = new int[] { '4', 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 100, (int) (byte) 100);
    }

    @Test
    public void test08088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08088");
        int[] intArray3 = new int[] { 100, (byte) -1, (byte) 100 };
        int[] intArray6 = new int[] { '4', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) ' ', (int) (byte) -1);
    }

    @Test
    public void test08089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08089");
        int[] intArray5 = new int[] { 'a', (byte) 1, (byte) 1, 'a', (short) 1 };
        int[] intArray11 = new int[] { (byte) 0, (short) 1, (byte) 10, (-1), (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 100, (int) (byte) -1);
    }

    @Test
    public void test08090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08090");
        int[] intArray5 = new int[] { (byte) 100, (byte) 1, (short) 10, (byte) 10, (byte) -1 };
        int[] intArray10 = new int[] { (short) 100, (byte) 10, (short) -1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (short) 0, (int) (byte) 100);
    }

    @Test
    public void test08091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08091");
        int[] intArray3 = new int[] { (-1), '#', (byte) 0 };
        int[] intArray7 = new int[] { 10, 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) 100, 1);
    }

    @Test
    public void test08092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08092");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) 10, (int) (byte) 100);
    }

    @Test
    public void test08093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08093");
        int[] intArray2 = new int[] { (short) 1, 10 };
        int[] intArray7 = new int[] { (byte) 1, (short) 0, 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) '4', (int) (short) -1);
    }

    @Test
    public void test08094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08094");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) 1, (int) (byte) 0);
    }

    @Test
    public void test08095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08095");
        int[] intArray5 = new int[] { (byte) -1, (byte) 10, (byte) 100, 'a', (byte) -1 };
        int[] intArray7 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) ' ', (int) (byte) 0);
    }

    @Test
    public void test08096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08096");
        int[] intArray3 = new int[] { '4', (short) 1, '4' };
        int[] intArray7 = new int[] { (byte) 100, (-1), ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test08097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08097");
        int[] intArray6 = new int[] { ' ', 0, (short) 10, (short) 10, (short) -1, (short) 1 };
        int[] intArray12 = new int[] { 10, 1, (short) 100, 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) ' ', 100);
    }

    @Test
    public void test08098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08098");
        int[] intArray6 = new int[] { (byte) 1, 1, 0, '#', (byte) -1, 1 };
        int[] intArray10 = new int[] { 1, 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) '4', (int) (byte) 0);
    }

    @Test
    public void test08099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08099");
        int[] intArray3 = new int[] { (short) 0, (short) -1, '#' };
        int[] intArray10 = new int[] { 1, '4', (byte) 100, 0, (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 1, (int) (short) -1);
    }

    @Test
    public void test08100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08100");
        int[] intArray6 = new int[] { 10, '#', (short) 100, '4', '#', ' ' };
        int[] intArray12 = new int[] { (byte) 0, (byte) -1, 1, 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 0, 1);
    }

    @Test
    public void test08101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08101");
        int[] intArray3 = new int[] { (byte) -1, 'a', '4' };
        int[] intArray10 = new int[] { (short) -1, 100, 'a', (byte) -1, (byte) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 1, (int) (byte) 100);
    }

    @Test
    public void test08102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08102");
        int[] intArray3 = new int[] { (byte) 1, (short) 100, (byte) 10 };
        int[] intArray8 = new int[] { (short) 1, (short) 10, ' ', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 100, (int) (byte) -1);
    }

    @Test
    public void test08103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08103");
        int[] intArray6 = new int[] { 10, '4', 100, 10, 0, (byte) 10 };
        int[] intArray10 = new int[] { (short) 100, (byte) 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 10, (int) (byte) 1);
    }

    @Test
    public void test08104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08104");
        int[] intArray6 = new int[] { (-1), 1, (byte) 10, (-1), 'a', (byte) 100 };
        int[] intArray9 = new int[] { (byte) 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 10, 1);
    }

    @Test
    public void test08105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08105");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) '#', 10);
    }

    @Test
    public void test08106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08106");
        int[] intArray5 = new int[] { (byte) -1, (short) 100, '4', (byte) 10, 'a' };
        int[] intArray7 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (short) 1, (int) (short) 10);
    }

    @Test
    public void test08107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08107");
        int[] intArray1 = new int[] { '4' };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 0, (int) '#');
    }

    @Test
    public void test08108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08108");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) -1, (short) 10, 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test08109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08109");
        int[] intArray5 = new int[] { 1, (-1), '#', ' ', (byte) 10 };
        int[] intArray10 = new int[] { (byte) 10, 'a', 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (short) 1, (-1));
    }

    @Test
    public void test08110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08110");
        int[] intArray5 = new int[] { (byte) 10, (byte) 100, (-1), (byte) 0, (byte) 10 };
        int[] intArray8 = new int[] { '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 100, (int) (byte) 100);
    }

    @Test
    public void test08111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08111");
        int[] intArray4 = new int[] { (byte) -1, (byte) 0, (short) 0, (-1) };
        int[] intArray10 = new int[] { (short) 10, 1, 0, 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, 100, (int) '4');
    }

    @Test
    public void test08112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08112");
        int[] intArray3 = new int[] { (short) 100, (short) 1, '4' };
        int[] intArray5 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) 10, (int) ' ');
    }

    @Test
    public void test08113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08113");
        int[] intArray4 = new int[] { (byte) 1, (short) 100, 0, ' ' };
        int[] intArray8 = new int[] { (byte) 1, (byte) -1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 0, (int) '4');
    }

    @Test
    public void test08114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08114");
        int[] intArray5 = new int[] { (short) 100, 'a', 0, (byte) 100, ' ' };
        int[] intArray8 = new int[] { (short) 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) 0, (int) (short) 10);
    }

    @Test
    public void test08115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08115");
        int[] intArray2 = new int[] { (byte) 10, 10 };
        int[] intArray8 = new int[] { (byte) 100, '#', (short) 10, (byte) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (byte) 10, (int) (byte) 100);
    }

    @Test
    public void test08116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08116");
        int[] intArray2 = new int[] { (byte) 100, (short) 100 };
        int[] intArray5 = new int[] { 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 100, (int) (short) 10);
    }

    @Test
    public void test08117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08117");
        int[] intArray5 = new int[] { (short) 0, ' ', 10, 10, 10 };
        int[] intArray11 = new int[] { 1, (-1), (byte) 100, (short) 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) 0, (int) (short) 100);
    }

    @Test
    public void test08118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08118");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { ' ', (short) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (-1), (-1));
    }

    @Test
    public void test08119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08119");
        int[] intArray2 = new int[] { 'a', 1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 10, (int) (byte) 1);
    }

    @Test
    public void test08120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08120");
        int[] intArray5 = new int[] { 10, (byte) 0, (short) 100, (short) 1, (short) 0 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (-1), (int) (short) 100);
    }

    @Test
    public void test08121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08121");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { ' ', (byte) 10, 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) '4', (int) '4');
    }

    @Test
    public void test08122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08122");
        int[] intArray5 = new int[] { 10, '4', 0, (byte) 10, '#' };
        int[] intArray8 = new int[] { 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) '#', (int) (byte) -1);
    }

    @Test
    public void test08123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08123");
        int[] intArray2 = new int[] { (short) 10, 10 };
        int[] intArray5 = new int[] { (byte) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 0, (int) (byte) 0);
    }

    @Test
    public void test08124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08124");
        int[] intArray3 = new int[] { (short) -1, (short) 1, 100 };
        int[] intArray6 = new int[] { (short) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, 0, (-1));
    }

    @Test
    public void test08125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08125");
        int[] intArray6 = new int[] { (byte) 1, (short) 10, '4', '4', 0, ' ' };
        int[] intArray9 = new int[] { 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 100, (int) (byte) 100);
    }

    @Test
    public void test08126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08126");
        int[] intArray3 = new int[] { 10, (byte) -1, 1 };
        int[] intArray8 = new int[] { (byte) 10, '#', 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (byte) 100, (int) (short) -1);
    }

    @Test
    public void test08127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08127");
        int[] intArray4 = new int[] { (short) 0, (short) 1, (short) 100, 0 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (short) -1, 100);
    }

    @Test
    public void test08128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08128");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) ' ', 100);
    }

    @Test
    public void test08129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08129");
        int[] intArray2 = new int[] { 100, (byte) -1 };
        int[] intArray9 = new int[] { (short) 1, ' ', (short) 0, (short) 0, (short) 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (short) 10, (int) ' ');
    }

    @Test
    public void test08130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08130");
        int[] intArray5 = new int[] { (byte) 0, '#', (short) 0, ' ', (short) -1 };
        int[] intArray7 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, 0, (int) (short) 1);
    }

    @Test
    public void test08131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08131");
        int[] intArray1 = new int[] { 100 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 10, (int) ' ');
    }

    @Test
    public void test08132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08132");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray7 = new int[] { (byte) 100, (short) 10, 100, (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, 100, (int) '#');
    }

    @Test
    public void test08133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08133");
        int[] intArray5 = new int[] { 0, 1, (short) 1, (byte) 10, 0 };
        int[] intArray10 = new int[] { (short) 0, (short) 100, (short) 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) ' ', (int) (byte) 10);
    }

    @Test
    public void test08134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08134");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray7 = new int[] { (byte) 1, (short) 1, 'a', '#', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, 0, 0);
    }

    @Test
    public void test08135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08135");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (-1), 100, 0, 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) 100, (int) (short) 1);
    }

    @Test
    public void test08136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08136");
        int[] intArray6 = new int[] { 10, 'a', '4', (short) -1, (short) 10, (byte) -1 };
        int[] intArray11 = new int[] { (short) -1, (byte) 1, 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test08137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08137");
        int[] intArray5 = new int[] { (short) 100, (byte) 0, (short) -1, (byte) -1, ' ' };
        int[] intArray9 = new int[] { (short) 1, (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) '#', (int) (byte) 0);
    }

    @Test
    public void test08138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08138");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (byte) 100, (int) '4');
    }

    @Test
    public void test08139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08139");
        int[] intArray3 = new int[] { (-1), '#', '#' };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) 10, (-1));
    }

    @Test
    public void test08140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08140");
        int[] intArray3 = new int[] { (byte) 1, (short) 0, (short) 100 };
        int[] intArray10 = new int[] { (short) 0, 0, 0, ' ', (short) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (-1), 0);
    }

    @Test
    public void test08141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08141");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 1, (byte) -1, 'a', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test08142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08142");
        int[] intArray6 = new int[] { (byte) 100, (short) 1, '#', (short) 10, (short) 100, '#' };
        int[] intArray8 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (-1), 1);
    }

    @Test
    public void test08143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08143");
        int[] intArray3 = new int[] { (byte) 1, (short) 0, '4' };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) '4', (int) (short) 100);
    }

    @Test
    public void test08144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08144");
        int[] intArray6 = new int[] { 100, 0, 1, (byte) 0, 10, (byte) 10 };
        int[] intArray10 = new int[] { (short) 1, (short) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (short) 0, (int) 'a');
    }

    @Test
    public void test08145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08145");
        int[] intArray3 = new int[] { (byte) 1, 10, ' ' };
        int[] intArray5 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) 100, (int) '#');
    }

    @Test
    public void test08146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08146");
        int[] intArray3 = new int[] { (byte) 100, (byte) 1, (byte) 10 };
        int[] intArray7 = new int[] { (byte) 10, 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test08147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08147");
        int[] intArray2 = new int[] { (short) 10, 10 };
        int[] intArray9 = new int[] { (byte) -1, (short) -1, (short) -1, '#', (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (short) -1, 0);
    }

    @Test
    public void test08148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08148");
        int[] intArray4 = new int[] { 'a', (short) -1, (byte) 0, 100 };
        int[] intArray11 = new int[] { 'a', 10, (short) 10, (byte) 10, (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) 1, 0);
    }

    @Test
    public void test08149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08149");
        int[] intArray5 = new int[] { (short) 0, 'a', 'a', (byte) 1, '4' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (short) 0, (int) (byte) 1);
    }

    @Test
    public void test08150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08150");
        int[] intArray6 = new int[] { '4', '#', (byte) 0, (short) 1, 'a', (byte) -1 };
        int[] intArray9 = new int[] { '4', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 1, (int) (byte) -1);
    }

    @Test
    public void test08151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08151");
        int[] intArray3 = new int[] { ' ', 100, (byte) 10 };
        int[] intArray5 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) ' ', (int) '4');
    }

    @Test
    public void test08152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08152");
        int[] intArray5 = new int[] { (short) 1, (short) 0, 'a', (short) 1, (byte) 100 };
        int[] intArray7 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) '#', (int) '#');
    }

    @Test
    public void test08153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08153");
        int[] intArray2 = new int[] { 100, 1 };
        int[] intArray5 = new int[] { (short) 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test08154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08154");
        int[] intArray6 = new int[] { ' ', '#', (short) 0, (-1), 1, 10 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, 100, (int) (byte) 10);
    }

    @Test
    public void test08155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08155");
        int[] intArray4 = new int[] { (byte) -1, (short) 1, 0, 100 };
        int[] intArray11 = new int[] { (byte) 1, (short) 10, ' ', '#', 'a', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, 100, (int) (byte) 0);
    }

    @Test
    public void test08156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08156");
        int[] intArray6 = new int[] { (byte) 1, (short) 100, (short) 0, (byte) 100, (short) 10, 10 };
        int[] intArray11 = new int[] { (short) 10, (byte) 1, (-1), ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 100, (-1));
    }

    @Test
    public void test08157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08157");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, 100, (int) (byte) 10);
    }

    @Test
    public void test08158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08158");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) -1, (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) '#', (int) 'a');
    }

    @Test
    public void test08159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08159");
        int[] intArray2 = new int[] { '4', (byte) 1 };
        int[] intArray4 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (short) 1, 0);
    }

    @Test
    public void test08160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08160");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) 'a', (int) (short) -1);
    }

    @Test
    public void test08161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08161");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) 0, 100, ' ', (byte) 10, '#', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) -1, 0);
    }

    @Test
    public void test08162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08162");
        int[] intArray4 = new int[] { (byte) 1, (short) 0, (short) 0, (byte) 0 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) ' ', (int) '4');
    }

    @Test
    public void test08163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08163");
        int[] intArray4 = new int[] { (byte) 100, (byte) 100, (byte) 100, 0 };
        int[] intArray7 = new int[] { '#', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) 10, (int) 'a');
    }

    @Test
    public void test08164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08164");
        int[] intArray4 = new int[] { 10, 1, '#', (short) 0 };
        int[] intArray6 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) 'a', (int) (byte) 10);
    }

    @Test
    public void test08165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08165");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) 10, '4', (byte) 0, 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) 100, (int) (short) 0);
    }

    @Test
    public void test08166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08166");
        int[] intArray2 = new int[] { (byte) 100, 10 };
        int[] intArray7 = new int[] { (short) 100, (byte) 100, (short) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 100, 0);
    }

    @Test
    public void test08167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08167");
        int[] intArray3 = new int[] { 10, 100, (short) -1 };
        int[] intArray6 = new int[] { 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) '#', (-1));
    }

    @Test
    public void test08168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08168");
        int[] intArray6 = new int[] { 0, 10, ' ', (byte) -1, (byte) -1, (short) 10 };
        int[] intArray10 = new int[] { ' ', 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (short) -1, (int) (byte) -1);
    }

    @Test
    public void test08169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08169");
        int[] intArray2 = new int[] { (byte) 100, (short) 0 };
        int[] intArray4 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) ' ', (int) (byte) -1);
    }

    @Test
    public void test08170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08170");
        int[] intArray1 = new int[] { 10 };
        int[] intArray4 = new int[] { ' ', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, 100, 100);
    }

    @Test
    public void test08171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08171");
        int[] intArray6 = new int[] { (byte) 10, (byte) 0, ' ', (short) 1, (short) 0, (short) 0 };
        int[] intArray8 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (-1), (int) (short) 100);
    }

    @Test
    public void test08172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08172");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (byte) 100, (-1));
    }

    @Test
    public void test08173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08173");
        int[] intArray3 = new int[] { (short) -1, (short) 100, (short) 100 };
        int[] intArray6 = new int[] { 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) 10, 0);
    }

    @Test
    public void test08174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08174");
        int[] intArray6 = new int[] { ' ', (short) 1, (byte) 10, (byte) -1, (short) -1, (short) 1 };
        int[] intArray8 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (byte) 0, 1);
    }

    @Test
    public void test08175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08175");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, 0, (int) ' ');
    }

    @Test
    public void test08176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08176");
        int[] intArray6 = new int[] { (byte) 10, '#', 'a', (short) 1, (short) 1, ' ' };
        int[] intArray13 = new int[] { 10, (byte) -1, '#', ' ', (short) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (-1), (int) ' ');
    }

    @Test
    public void test08177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08177");
        int[] intArray4 = new int[] { '4', (short) 0, ' ', (short) 100 };
        int[] intArray8 = new int[] { (short) 10, (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 100, (int) (byte) 1);
    }

    @Test
    public void test08178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08178");
        int[] intArray4 = new int[] { 1, ' ', (-1), 0 };
        int[] intArray8 = new int[] { 100, (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 0, (int) (byte) 1);
    }

    @Test
    public void test08179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08179");
        int[] intArray2 = new int[] { 100, 10 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) -1, (int) '#');
    }

    @Test
    public void test08180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08180");
        int[] intArray3 = new int[] { '4', (short) 10, (-1) };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) 'a', 10);
    }

    @Test
    public void test08181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08181");
        int[] intArray4 = new int[] { ' ', '4', 100, (byte) 1 };
        int[] intArray8 = new int[] { 1, (-1), 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) '#', (int) (byte) -1);
    }

    @Test
    public void test08182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08182");
        int[] intArray3 = new int[] { (short) -1, (short) -1, (short) 1 };
        int[] intArray7 = new int[] { 0, (-1), (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) 1, (int) (byte) 10);
    }

    @Test
    public void test08183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08183");
        int[] intArray5 = new int[] { 0, (short) 1, (-1), 100, (short) 1 };
        int[] intArray8 = new int[] { (short) 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) '#', (int) (short) 10);
    }

    @Test
    public void test08184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08184");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) 1, 100, (short) -1, 0, (short) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) '#', (int) (byte) 0);
    }

    @Test
    public void test08185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08185");
        int[] intArray2 = new int[] { '4', (short) 100 };
        int[] intArray7 = new int[] { 100, 0, (byte) 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (short) 100, (int) (byte) -1);
    }

    @Test
    public void test08186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08186");
        int[] intArray4 = new int[] { 1, 1, 10, '#' };
        int[] intArray7 = new int[] { 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) 0, (-1));
    }

    @Test
    public void test08187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08187");
        int[] intArray2 = new int[] { (short) -1, (short) -1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 1, (int) (short) 1);
    }

    @Test
    public void test08188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08188");
        int[] intArray5 = new int[] { (short) -1, (byte) 1, (short) -1, (short) 0, 1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (short) -1, (int) (byte) 100);
    }

    @Test
    public void test08189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08189");
        int[] intArray4 = new int[] { 1, (byte) 10, (byte) 10, 0 };
        int[] intArray11 = new int[] { 1, (short) 0, (short) 0, 0, 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, 100, 1);
    }

    @Test
    public void test08190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08190");
        int[] intArray2 = new int[] { (short) 100, (short) 1 };
        int[] intArray6 = new int[] { (short) 1, 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) -1, (int) (short) 10);
    }

    @Test
    public void test08191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08191");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 100, 'a', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) 0, (int) 'a');
    }

    @Test
    public void test08192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08192");
        int[] intArray6 = new int[] { (byte) -1, 'a', (byte) 0, (short) 0, (byte) -1, (short) 10 };
        int[] intArray10 = new int[] { (byte) -1, 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (short) -1, (int) (short) 10);
    }

    @Test
    public void test08193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08193");
        int[] intArray3 = new int[] { (short) 100, '#', 1 };
        int[] intArray6 = new int[] { '#', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) -1, 10);
    }

    @Test
    public void test08194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08194");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (byte) 100, ' ', (short) 100, (byte) 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) 0, (int) (short) -1);
    }

    @Test
    public void test08195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08195");
        int[] intArray1 = new int[] { 100 };
        int[] intArray5 = new int[] { (-1), (byte) 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) 100, (int) (short) 1);
    }

    @Test
    public void test08196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08196");
        int[] intArray5 = new int[] { (short) -1, 0, (short) 10, 100, (short) 1 };
        int[] intArray12 = new int[] { (byte) 100, (short) 100, 'a', (byte) 1, (byte) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) 10, (int) ' ');
    }

    @Test
    public void test08197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08197");
        int[] intArray4 = new int[] { ' ', 100, (short) 10, 0 };
        int[] intArray7 = new int[] { (short) 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) 1, (int) 'a');
    }

    @Test
    public void test08198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08198");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray5 = new int[] { '4', 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (byte) -1, (int) (byte) 10);
    }

    @Test
    public void test08199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08199");
        int[] intArray1 = new int[] { '4' };
        int[] intArray3 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, 100, (-1));
    }

    @Test
    public void test08200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08200");
        int[] intArray6 = new int[] { 100, 'a', 10, (byte) -1, (short) -1, (short) 1 };
        int[] intArray12 = new int[] { (short) 100, (short) 0, 1, '4', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 100, 10);
    }

    @Test
    public void test08201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08201");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 100, (byte) 100, (byte) -1, '4', (short) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) 10, 1);
    }

    @Test
    public void test08202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08202");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 0, (byte) 10, 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 0, (int) (short) 1);
    }

    @Test
    public void test08203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08203");
        int[] intArray4 = new int[] { (byte) 100, 0, (byte) 10, 0 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, 0, (int) (short) 100);
    }

    @Test
    public void test08204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08204");
        int[] intArray2 = new int[] { (byte) 100, (byte) 0 };
        int[] intArray7 = new int[] { (byte) 1, (-1), (short) -1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) '#', (int) (byte) 10);
    }

    @Test
    public void test08205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08205");
        int[] intArray1 = new int[] { 1 };
        int[] intArray5 = new int[] { 0, (-1), (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) 0, (int) '4');
    }

    @Test
    public void test08206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08206");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray4 = new int[] { (short) 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) -1, 100);
    }

    @Test
    public void test08207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08207");
        int[] intArray5 = new int[] { (short) 100, (-1), (byte) 0, 0, (short) 10 };
        int[] intArray11 = new int[] { 'a', (byte) 10, (byte) -1, 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) 'a', 0);
    }

    @Test
    public void test08208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08208");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 1, (short) 100, (short) -1, ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) -1, 100);
    }

    @Test
    public void test08209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08209");
        int[] intArray3 = new int[] { (byte) -1, (short) 100, 1 };
        int[] intArray9 = new int[] { (short) 100, (short) 100, '#', (byte) 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) '4', (int) (byte) 10);
    }

    @Test
    public void test08210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08210");
        int[] intArray2 = new int[] { 0, 100 };
        int[] intArray4 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) '4', (int) 'a');
    }

    @Test
    public void test08211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08211");
        int[] intArray3 = new int[] { 'a', (short) 0, '4' };
        int[] intArray8 = new int[] { 'a', (byte) -1, (byte) 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 1, 0);
    }

    @Test
    public void test08212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08212");
        int[] intArray3 = new int[] { (short) -1, (short) 0, 1 };
        int[] intArray8 = new int[] { 'a', ' ', 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) ' ', (int) (short) 0);
    }

    @Test
    public void test08213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08213");
        int[] intArray6 = new int[] { (short) 100, (byte) 0, 1, (short) 10, (byte) 1, (short) 100 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) -1, 1);
    }

    @Test
    public void test08214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08214");
        int[] intArray6 = new int[] { (short) 1, (byte) 1, (byte) -1, 100, (byte) 10, (byte) 1 };
        int[] intArray11 = new int[] { '#', 0, (short) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (short) 1, (int) '4');
    }

    @Test
    public void test08215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08215");
        int[] intArray5 = new int[] { 1, 0, (short) 10, 100, '#' };
        int[] intArray7 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) 100, (int) '4');
    }

    @Test
    public void test08216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08216");
        int[] intArray6 = new int[] { (byte) 1, 0, (short) 1, (byte) 100, 0, 100 };
        int[] intArray12 = new int[] { (byte) 100, 'a', (byte) 0, (byte) -1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 10, 0);
    }

    @Test
    public void test08217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08217");
        int[] intArray6 = new int[] { (byte) 100, (short) 0, (short) 100, 'a', 1, (byte) 1 };
        int[] intArray12 = new int[] { '#', (short) -1, (short) 10, (byte) 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 100, 0);
    }

    @Test
    public void test08218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08218");
        int[] intArray4 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 0 };
        int[] intArray11 = new int[] { (short) 100, 'a', (short) 0, (short) 100, 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) 0, (int) (byte) 100);
    }

    @Test
    public void test08219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08219");
        int[] intArray3 = new int[] { (-1), (short) 1, (short) 0 };
        int[] intArray9 = new int[] { (short) 10, (byte) -1, 100, (-1), '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) ' ', (int) (short) -1);
    }

    @Test
    public void test08220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08220");
        int[] intArray6 = new int[] { (short) 100, (byte) 10, (short) 10, (short) -1, (byte) -1, '4' };
        int[] intArray9 = new int[] { (-1), 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (-1), (int) 'a');
    }

    @Test
    public void test08221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08221");
        int[] intArray6 = new int[] { '#', (short) 1, 100, 'a', (byte) 0, (byte) 0 };
        int[] intArray11 = new int[] { '4', 10, '4', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (-1), (int) (short) 100);
    }

    @Test
    public void test08222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08222");
        int[] intArray2 = new int[] { (short) 10, (byte) 100 };
        int[] intArray6 = new int[] { '#', '4', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) -1, 100);
    }

    @Test
    public void test08223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08223");
        int[] intArray3 = new int[] { (byte) -1, 'a', 1 };
        int[] intArray9 = new int[] { (-1), 100, (byte) 10, '4', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (byte) 100, (int) '4');
    }

    @Test
    public void test08224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08224");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray3 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) 100, (int) (byte) 100);
    }

    @Test
    public void test08225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08225");
        int[] intArray1 = new int[] { '4' };
        int[] intArray4 = new int[] { (short) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, 0, (int) (short) 1);
    }

    @Test
    public void test08226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08226");
        int[] intArray2 = new int[] { (byte) 10, (byte) 0 };
        int[] intArray5 = new int[] { 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (-1), (int) (byte) -1);
    }

    @Test
    public void test08227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08227");
        int[] intArray6 = new int[] { '#', (byte) -1, (byte) 0, 0, (byte) 100, ' ' };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) '#', (int) '#');
    }

    @Test
    public void test08228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08228");
        int[] intArray4 = new int[] { '4', (byte) 0, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 10, (short) 1, (short) 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (byte) 100, (int) (byte) 10);
    }

    @Test
    public void test08229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08229");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) 10, (-1));
    }

    @Test
    public void test08230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08230");
        int[] intArray3 = new int[] { '4', (byte) 1, (byte) 1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, 0, (int) 'a');
    }

    @Test
    public void test08231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08231");
        int[] intArray2 = new int[] { (short) 0, (byte) 100 };
        int[] intArray6 = new int[] { ' ', (short) 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) '4', (int) (byte) 10);
    }

    @Test
    public void test08232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08232");
        int[] intArray4 = new int[] { (short) -1, 1, ' ', 1 };
        int[] intArray8 = new int[] { (byte) 1, (short) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) 100, (int) (short) 10);
    }

    @Test
    public void test08233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08233");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 1, 'a', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (-1), (int) (byte) 10);
    }

    @Test
    public void test08234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08234");
        int[] intArray3 = new int[] { 10, 1, '#' };
        int[] intArray5 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, 1, (int) (short) -1);
    }

    @Test
    public void test08235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08235");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray8 = new int[] { ' ', (short) 1, 1, (byte) 10, (short) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 10, (int) '4');
    }

    @Test
    public void test08236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08236");
        int[] intArray6 = new int[] { (byte) 10, (short) 0, (short) 10, 1, (byte) -1, (-1) };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, 100, 0);
    }

    @Test
    public void test08237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08237");
        int[] intArray5 = new int[] { '4', (byte) -1, ' ', (byte) 1, (short) -1 };
        int[] intArray7 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (short) 1, (int) (byte) 0);
    }

    @Test
    public void test08238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08238");
        int[] intArray4 = new int[] { ' ', (short) 1, (short) 1, (byte) 100 };
        int[] intArray11 = new int[] { (-1), (-1), 'a', 0, (short) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) 10, 10);
    }

    @Test
    public void test08239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08239");
        int[] intArray4 = new int[] { (short) 1, (short) -1, (byte) -1, (byte) -1 };
        int[] intArray9 = new int[] { 10, (byte) 0, (short) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) 10, (int) (byte) 100);
    }

    @Test
    public void test08240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08240");
        int[] intArray4 = new int[] { ' ', (byte) 10, '#', '4' };
        int[] intArray11 = new int[] { '4', '#', (short) 10, 'a', '4', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) 'a', (int) (short) 10);
    }

    @Test
    public void test08241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08241");
        int[] intArray3 = new int[] { (byte) 100, (short) -1, 10 };
        int[] intArray10 = new int[] { '#', (byte) 0, (byte) 100, (byte) 0, 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) '4', 10);
    }

    @Test
    public void test08242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08242");
        int[] intArray4 = new int[] { (byte) 100, (short) 100, (short) 0, (short) 100 };
        int[] intArray7 = new int[] { 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) ' ', 1);
    }

    @Test
    public void test08243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08243");
        int[] intArray5 = new int[] { 'a', (short) 1, 0, (byte) 0, '#' };
        int[] intArray9 = new int[] { (short) 100, 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 0, (int) '#');
    }

    @Test
    public void test08244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08244");
        int[] intArray4 = new int[] { (short) -1, (byte) -1, (byte) 1, (-1) };
        int[] intArray11 = new int[] { (short) 0, 10, 0, (byte) 0, 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (byte) 100, (int) (short) 1);
    }

    @Test
    public void test08245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08245");
        int[] intArray2 = new int[] { 10, 1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) 0, 10);
    }

    @Test
    public void test08246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08246");
        int[] intArray4 = new int[] { (byte) 0, 100, '#', (short) 100 };
        int[] intArray9 = new int[] { '#', (short) 100, (-1), (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) 0, (int) (short) 1);
    }

    @Test
    public void test08247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08247");
        int[] intArray2 = new int[] { (short) 100, (short) -1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (byte) 1, (int) (byte) 100);
    }

    @Test
    public void test08248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08248");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray4 = new int[] { (byte) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (short) 100, 0);
    }

    @Test
    public void test08249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08249");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 10, (byte) 10, 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) 'a', (int) (byte) -1);
    }

    @Test
    public void test08250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08250");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (-1), (byte) 1, (short) -1, (byte) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) '4', (int) (byte) 10);
    }

    @Test
    public void test08251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08251");
        int[] intArray4 = new int[] { 10, ' ', (byte) 100, (byte) 100 };
        int[] intArray8 = new int[] { 1, (byte) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 100, (int) (short) 0);
    }

    @Test
    public void test08252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08252");
        int[] intArray4 = new int[] { (byte) -1, (byte) 0, (short) -1, ' ' };
        int[] intArray9 = new int[] { (-1), 'a', '#', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) '#', (int) (byte) 10);
    }

    @Test
    public void test08253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08253");
        int[] intArray2 = new int[] { (byte) 10, (short) 100 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) 100, 100);
    }

    @Test
    public void test08254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08254");
        int[] intArray2 = new int[] { (-1), (short) 1 };
        int[] intArray9 = new int[] { (-1), (short) 0, (short) 1, ' ', (byte) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (byte) 100, (int) '#');
    }

    @Test
    public void test08255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08255");
        int[] intArray6 = new int[] { (short) 100, (short) -1, (short) 10, 10, 100, (short) -1 };
        int[] intArray12 = new int[] { 100, (short) 10, 'a', (short) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 0, 0);
    }

    @Test
    public void test08256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08256");
        int[] intArray6 = new int[] { (short) 100, (short) 100, (byte) 10, 'a', '4', 1 };
        int[] intArray11 = new int[] { 0, ' ', '#', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (byte) 0, (int) (byte) -1);
    }

    @Test
    public void test08257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08257");
        int[] intArray3 = new int[] { 100, (short) 100, (byte) 1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) '#', 10);
    }

    @Test
    public void test08258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08258");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray7 = new int[] { 10, 100, 'a', (short) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) 100, (int) (short) 100);
    }

    @Test
    public void test08259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08259");
        int[] intArray1 = new int[] { '4' };
        int[] intArray4 = new int[] { (byte) 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, 100, (int) (byte) 1);
    }

    @Test
    public void test08260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08260");
        int[] intArray1 = new int[] { 1 };
        int[] intArray7 = new int[] { ' ', '4', (short) 100, (short) 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) 1, (int) (short) -1);
    }

    @Test
    public void test08261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08261");
        int[] intArray5 = new int[] { (short) 10, ' ', (byte) 10, (byte) 0, (-1) };
        int[] intArray8 = new int[] { 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test08262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08262");
        int[] intArray4 = new int[] { '#', 10, 0, 10 };
        int[] intArray9 = new int[] { '#', (byte) -1, 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (byte) -1, (int) (short) 100);
    }

    @Test
    public void test08263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08263");
        int[] intArray1 = new int[] { '4' };
        int[] intArray8 = new int[] { 1, (byte) 0, (byte) 100, 0, '4', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) 1, (int) ' ');
    }

    @Test
    public void test08264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08264");
        int[] intArray5 = new int[] { 1, (short) 100, (byte) 100, 10, (byte) 1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 100, (int) 'a');
    }

    @Test
    public void test08265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08265");
        int[] intArray2 = new int[] { (byte) 0, (byte) 0 };
        int[] intArray4 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) '#', (int) (short) 0);
    }

    @Test
    public void test08266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08266");
        int[] intArray1 = new int[] { 0 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) '#', 0);
    }

    @Test
    public void test08267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08267");
        int[] intArray4 = new int[] { 0, (short) 0, (byte) 100, 0 };
        int[] intArray10 = new int[] { (byte) 10, (byte) 1, (byte) -1, (byte) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) 0, (int) (byte) 1);
    }

    @Test
    public void test08268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08268");
        int[] intArray6 = new int[] { 'a', '#', '4', (byte) 0, 100, 100 };
        int[] intArray10 = new int[] { (short) -1, (short) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 10, 10);
    }

    @Test
    public void test08269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08269");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test08270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08270");
        int[] intArray6 = new int[] { 'a', (byte) 0, (-1), (byte) 0, (byte) 100, 1 };
        int[] intArray10 = new int[] { (short) 100, (byte) 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 100, 1);
    }

    @Test
    public void test08271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08271");
        int[] intArray2 = new int[] { (short) -1, (byte) 100 };
        int[] intArray6 = new int[] { 0, (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (-1), (int) '#');
    }

    @Test
    public void test08272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08272");
        int[] intArray5 = new int[] { (byte) 1, 1, (byte) -1, 10, (byte) -1 };
        int[] intArray8 = new int[] { (-1), '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) 0, (int) ' ');
    }

    @Test
    public void test08273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08273");
        int[] intArray5 = new int[] { '#', (byte) 10, (short) -1, (short) 10, (byte) 1 };
        int[] intArray8 = new int[] { 'a', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) 1, (int) (byte) -1);
    }

    @Test
    public void test08274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08274");
        int[] intArray3 = new int[] { (short) 1, 100, (byte) 10 };
        int[] intArray9 = new int[] { ' ', (byte) 100, ' ', (byte) 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (byte) -1, 1);
    }

    @Test
    public void test08275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08275");
        int[] intArray3 = new int[] { ' ', 10, (byte) -1 };
        int[] intArray6 = new int[] { 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, 0, (int) (short) 1);
    }

    @Test
    public void test08276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08276");
        int[] intArray5 = new int[] { '4', 'a', (short) 10, (byte) -1, 10 };
        int[] intArray9 = new int[] { (byte) 100, 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) '#', (int) (byte) 1);
    }

    @Test
    public void test08277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08277");
        int[] intArray3 = new int[] { (byte) 10, (byte) 1, (byte) 0 };
        int[] intArray8 = new int[] { 10, '#', (short) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (short) 1, (int) ' ');
    }

    @Test
    public void test08278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08278");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray3 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (byte) 0, 10);
    }

    @Test
    public void test08279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08279");
        int[] intArray3 = new int[] { (byte) 1, (byte) -1, (-1) };
        int[] intArray7 = new int[] { (short) -1, (short) 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 1, (int) '#');
    }

    @Test
    public void test08280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08280");
        int[] intArray5 = new int[] { (byte) 100, (byte) 10, 1, (short) -1, (byte) 0 };
        int[] intArray11 = new int[] { (-1), ' ', (short) 100, (-1), (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) 10, (int) '4');
    }

    @Test
    public void test08281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08281");
        int[] intArray4 = new int[] { (byte) 100, (-1), (short) 0, (byte) -1 };
        int[] intArray11 = new int[] { (byte) 10, '4', (byte) -1, (short) 10, (byte) 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (byte) -1, (int) (short) 1);
    }

    @Test
    public void test08282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08282");
        int[] intArray4 = new int[] { (short) 100, '4', (-1), (short) 0 };
        int[] intArray8 = new int[] { (short) -1, (short) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 0, (int) (short) 0);
    }

    @Test
    public void test08283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08283");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 10, (byte) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) 0, (int) (short) 10);
    }

    @Test
    public void test08284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08284");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray5 = new int[] { (byte) 0, '4', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) 1, (int) (short) 100);
    }

    @Test
    public void test08285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08285");
        int[] intArray3 = new int[] { 0, (short) -1, (short) 10 };
        int[] intArray8 = new int[] { 'a', 'a', '#', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 10, (int) '#');
    }

    @Test
    public void test08286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08286");
        int[] intArray3 = new int[] { (byte) -1, (byte) 0, (byte) -1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) 'a', 100);
    }

    @Test
    public void test08287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08287");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray3 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) '#', 10);
    }

    @Test
    public void test08288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08288");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) 0, 1, 'a', (short) 10, (short) 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, 0, (int) (byte) -1);
    }

    @Test
    public void test08289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08289");
        int[] intArray2 = new int[] { '4', (byte) -1 };
        int[] intArray7 = new int[] { (byte) -1, (byte) 1, (short) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 10, (int) (short) 0);
    }

    @Test
    public void test08290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08290");
        int[] intArray2 = new int[] { 10, '4' };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test08291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08291");
        int[] intArray5 = new int[] { (byte) 0, 0, (byte) 100, (-1), (-1) };
        int[] intArray9 = new int[] { ' ', 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (-1), 0);
    }

    @Test
    public void test08292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08292");
        int[] intArray5 = new int[] { 1, 10, (short) 1, (byte) 1, (-1) };
        int[] intArray9 = new int[] { (-1), (byte) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 100, 0);
    }

    @Test
    public void test08293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08293");
        int[] intArray6 = new int[] { (short) 0, '#', (short) -1, (byte) 1, (-1), (short) 10 };
        int[] intArray13 = new int[] { 100, (byte) 100, 10, (-1), 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 1, (int) (short) -1);
    }

    @Test
    public void test08294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08294");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (short) 1, (int) (short) -1);
    }

    @Test
    public void test08295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08295");
        int[] intArray5 = new int[] { (short) -1, (byte) 100, (short) 10, 10, (byte) -1 };
        int[] intArray8 = new int[] { ' ', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 10, (int) ' ');
    }

    @Test
    public void test08296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08296");
        int[] intArray2 = new int[] { 10, '#' };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) 100, (-1));
    }

    @Test
    public void test08297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08297");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) 1, '#', (short) 0, ' ', (short) -1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) ' ', (-1));
    }

    @Test
    public void test08298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08298");
        int[] intArray4 = new int[] { (short) 10, (byte) -1, ' ', (byte) 0 };
        int[] intArray10 = new int[] { (short) 1, (-1), 100, 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) '4', (int) '#');
    }

    @Test
    public void test08299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08299");
        int[] intArray5 = new int[] { 10, (short) -1, (byte) -1, (short) 10, (-1) };
        int[] intArray8 = new int[] { (short) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 0, 10);
    }

    @Test
    public void test08300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08300");
        int[] intArray5 = new int[] { (byte) -1, '4', ' ', ' ', (byte) 100 };
        int[] intArray12 = new int[] { 10, '#', (short) 100, (short) 10, (byte) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) 10, 0);
    }

    @Test
    public void test08301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08301");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 100, (-1));
    }

    @Test
    public void test08302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08302");
        int[] intArray4 = new int[] { '4', 10, (byte) -1, (byte) 100 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) '4', (-1));
    }

    @Test
    public void test08303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08303");
        int[] intArray5 = new int[] { (short) -1, 10, (byte) 0, (byte) -1, (-1) };
        int[] intArray11 = new int[] { 100, '#', '#', (short) 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) 'a', (int) (short) 10);
    }

    @Test
    public void test08304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08304");
        int[] intArray6 = new int[] { 100, (byte) 100, (byte) 100, (byte) -1, (short) -1, 0 };
        int[] intArray10 = new int[] { (byte) 10, 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 0, (int) (byte) -1);
    }

    @Test
    public void test08305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08305");
        int[] intArray3 = new int[] { (byte) 10, ' ', (-1) };
        int[] intArray9 = new int[] { (byte) -1, (short) -1, 10, (short) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) ' ', (int) (byte) 10);
    }

    @Test
    public void test08306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08306");
        int[] intArray5 = new int[] { (byte) 1, (short) 0, 0, (short) 0, (short) 0 };
        int[] intArray8 = new int[] { (-1), '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 1, 0);
    }

    @Test
    public void test08307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08307");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray7 = new int[] { 100, (-1), (byte) 1, 'a', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) -1, (int) (byte) 1);
    }

    @Test
    public void test08308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08308");
        int[] intArray3 = new int[] { 'a', (short) 10, 0 };
        int[] intArray8 = new int[] { 1, '4', (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (byte) 1, (int) (byte) 100);
    }

    @Test
    public void test08309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08309");
        int[] intArray4 = new int[] { (short) 0, (byte) -1, 0, '4' };
        int[] intArray6 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) 'a', 0);
    }

    @Test
    public void test08310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08310");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 100, 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) -1, 10);
    }

    @Test
    public void test08311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08311");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) -1, (byte) -1, (byte) -1, (byte) 0, 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) 1, (int) (short) 10);
    }

    @Test
    public void test08312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08312");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 100, ' ', 10, (short) 1, (short) 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, 0, (int) ' ');
    }

    @Test
    public void test08313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08313");
        int[] intArray3 = new int[] { (short) -1, 1, (short) 100 };
        int[] intArray5 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) 100, 100);
    }

    @Test
    public void test08314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08314");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray8 = new int[] { ' ', (short) -1, (-1), (short) 1, ' ', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) -1, (int) (short) 0);
    }

    @Test
    public void test08315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08315");
        int[] intArray1 = new int[] { 10 };
        int[] intArray5 = new int[] { 0, 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) '4', (int) 'a');
    }

    @Test
    public void test08316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08316");
        int[] intArray4 = new int[] { (short) 10, (byte) 0, ' ', 10 };
        int[] intArray7 = new int[] { '4', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) 1, (int) 'a');
    }

    @Test
    public void test08317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08317");
        int[] intArray2 = new int[] { (short) 1, (byte) -1 };
        int[] intArray6 = new int[] { (byte) 100, (short) 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 100, 0);
    }

    @Test
    public void test08318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08318");
        int[] intArray4 = new int[] { (-1), (short) 1, (byte) 100, 0 };
        int[] intArray8 = new int[] { 100, '#', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (-1), (int) (short) -1);
    }

    @Test
    public void test08319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08319");
        int[] intArray5 = new int[] { (byte) -1, 10, (byte) -1, 'a', 100 };
        int[] intArray12 = new int[] { 10, 'a', (short) 0, 10, (byte) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) 1, (int) '4');
    }

    @Test
    public void test08320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08320");
        int[] intArray1 = new int[] { 100 };
        int[] intArray5 = new int[] { (short) -1, (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) 1, (-1));
    }

    @Test
    public void test08321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08321");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) '4', (int) (short) 1);
    }

    @Test
    public void test08322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08322");
        int[] intArray3 = new int[] { 100, (short) 100, '4' };
        int[] intArray7 = new int[] { ' ', (short) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) 0, (int) 'a');
    }

    @Test
    public void test08323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08323");
        int[] intArray6 = new int[] { 0, '4', (-1), 0, (byte) 10, (short) -1 };
        int[] intArray8 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 1, 100);
    }

    @Test
    public void test08324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08324");
        int[] intArray2 = new int[] { (short) -1, (byte) 0 };
        int[] intArray4 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (short) -1, (int) (byte) 1);
    }

    @Test
    public void test08325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08325");
        int[] intArray1 = new int[] { 0 };
        int[] intArray5 = new int[] { (byte) 100, (byte) 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (byte) 10, (-1));
    }

    @Test
    public void test08326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08326");
        int[] intArray1 = new int[] { '#' };
        int[] intArray6 = new int[] { 'a', (short) -1, ' ', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 1, 1);
    }

    @Test
    public void test08327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08327");
        int[] intArray6 = new int[] { '4', (short) 0, (-1), (byte) 100, (byte) -1, (short) 1 };
        int[] intArray12 = new int[] { (short) 1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 1, (int) 'a');
    }

    @Test
    public void test08328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08328");
        int[] intArray5 = new int[] { (short) 1, (-1), '#', (short) 10, (byte) 100 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) '#', 0);
    }

    @Test
    public void test08329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08329");
        int[] intArray2 = new int[] { ' ', (-1) };
        int[] intArray7 = new int[] { 10, 0, '4', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 100, (int) (short) 0);
    }

    @Test
    public void test08330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08330");
        int[] intArray6 = new int[] { '4', '4', 0, ' ', (byte) 1, '4' };
        int[] intArray9 = new int[] { '4', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (short) -1, (int) 'a');
    }

    @Test
    public void test08331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08331");
        int[] intArray6 = new int[] { 100, 10, ' ', 'a', 'a', 1 };
        int[] intArray8 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 100, (int) (byte) 1);
    }

    @Test
    public void test08332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08332");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray7 = new int[] { ' ', (byte) 100, (byte) 100, (byte) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, 100, (int) (byte) 1);
    }

    @Test
    public void test08333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08333");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 0, '4', '4', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) -1, (int) (byte) 0);
    }

    @Test
    public void test08334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08334");
        int[] intArray3 = new int[] { (byte) 100, (-1), (short) 0 };
        int[] intArray8 = new int[] { 0, '#', (short) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 1, 1);
    }

    @Test
    public void test08335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08335");
        int[] intArray3 = new int[] { 1, 0, 10 };
        int[] intArray9 = new int[] { 0, (short) 0, (short) 10, 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (short) 100, 10);
    }

    @Test
    public void test08336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08336");
        int[] intArray2 = new int[] { ' ', (byte) 10 };
        int[] intArray4 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) 'a', (int) (short) 0);
    }

    @Test
    public void test08337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08337");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { '4', (short) 0, 0, (byte) 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (-1), (int) (short) 100);
    }

    @Test
    public void test08338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08338");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (-1), (int) (short) 10);
    }

    @Test
    public void test08339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08339");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (byte) -1, (short) -1, ' ', 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) '4', (int) (byte) 100);
    }

    @Test
    public void test08340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08340");
        int[] intArray6 = new int[] { (byte) 10, (short) 0, 0, 10, '4', 10 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test08341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08341");
        int[] intArray3 = new int[] { 'a', (-1), (short) -1 };
        int[] intArray10 = new int[] { (byte) 0, 0, (byte) 10, (byte) 10, ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 10, 1);
    }

    @Test
    public void test08342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08342");
        int[] intArray6 = new int[] { 10, 10, (short) 0, 'a', 10, (short) 0 };
        int[] intArray13 = new int[] { (short) 100, (byte) 0, (-1), (short) 1, (short) 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 0, (int) (byte) 1);
    }

    @Test
    public void test08343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08343");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { '#', '4', ' ', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) 10, 100);
    }

    @Test
    public void test08344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08344");
        int[] intArray3 = new int[] { '4', (short) 10, (short) 100 };
        int[] intArray7 = new int[] { 100, (short) 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) '#', (int) (short) 10);
    }

    @Test
    public void test08345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08345");
        int[] intArray2 = new int[] { 0, 1 };
        int[] intArray6 = new int[] { ' ', (short) 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) 100, (int) '4');
    }

    @Test
    public void test08346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08346");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray6 = new int[] { ' ', (short) 100, 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (short) 100, (int) (byte) 100);
    }

    @Test
    public void test08347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08347");
        int[] intArray2 = new int[] { ' ', (short) 0 };
        int[] intArray6 = new int[] { 'a', (short) -1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (short) 10, (int) (short) 1);
    }

    @Test
    public void test08348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08348");
        int[] intArray4 = new int[] { (short) 0, (short) 10, (short) 100, (-1) };
        int[] intArray7 = new int[] { (short) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (-1), 100);
    }

    @Test
    public void test08349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08349");
        int[] intArray3 = new int[] { (byte) 0, (-1), (short) 0 };
        int[] intArray6 = new int[] { 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) -1, (-1));
    }

    @Test
    public void test08350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08350");
        int[] intArray4 = new int[] { 'a', (byte) -1, (short) 0, (byte) 10 };
        int[] intArray11 = new int[] { (short) 10, (byte) 100, (byte) 0, 1, (-1), (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) '4', (int) (short) 0);
    }

    @Test
    public void test08351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08351");
        int[] intArray2 = new int[] { ' ', 'a' };
        int[] intArray9 = new int[] { (short) 100, (byte) 1, 0, (byte) 0, 'a', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) 'a', (int) (byte) -1);
    }

    @Test
    public void test08352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08352");
        int[] intArray4 = new int[] { '#', 0, 0, '#' };
        int[] intArray8 = new int[] { (byte) -1, '4', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 0, (int) (byte) 0);
    }

    @Test
    public void test08353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08353");
        int[] intArray3 = new int[] { 'a', (byte) -1, (short) -1 };
        int[] intArray8 = new int[] { ' ', '#', (short) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (-1), (-1));
    }

    @Test
    public void test08354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08354");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) '4', 1);
    }

    @Test
    public void test08355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08355");
        int[] intArray4 = new int[] { (byte) 10, 'a', 10, 10 };
        int[] intArray9 = new int[] { (byte) 100, (short) 1, (byte) 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (byte) 100, (int) (byte) 100);
    }

    @Test
    public void test08356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08356");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray7 = new int[] { (short) -1, '4', (byte) 0, '4', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, 0, (int) (short) 10);
    }

    @Test
    public void test08357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08357");
        int[] intArray5 = new int[] { 0, (byte) -1, (short) 0, (short) 10, 1 };
        int[] intArray8 = new int[] { (short) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 0, (int) (byte) 100);
    }

    @Test
    public void test08358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08358");
        int[] intArray6 = new int[] { (byte) 0, 0, (short) 0, (short) -1, 1, '4' };
        int[] intArray10 = new int[] { (short) 0, (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test08359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08359");
        int[] intArray1 = new int[] { 10 };
        int[] intArray8 = new int[] { (short) 10, (byte) 0, (byte) 10, (-1), (short) 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) 0, 10);
    }

    @Test
    public void test08360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08360");
        int[] intArray1 = new int[] { 1 };
        int[] intArray6 = new int[] { (byte) 100, '#', (short) 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (short) 10, (int) (byte) 100);
    }

    @Test
    public void test08361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08361");
        int[] intArray2 = new int[] { (byte) 1, 1 };
        int[] intArray9 = new int[] { (byte) 1, (short) 0, (short) 100, 1, (byte) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 10, (int) (byte) 1);
    }

    @Test
    public void test08362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08362");
        int[] intArray6 = new int[] { (short) 10, (byte) -1, (short) 100, (short) 1, (byte) 0, 0 };
        int[] intArray9 = new int[] { (byte) 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, 0, (-1));
    }

    @Test
    public void test08363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08363");
        int[] intArray2 = new int[] { 100, '#' };
        int[] intArray5 = new int[] { '4', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 10, (int) ' ');
    }

    @Test
    public void test08364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08364");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 10, 1, (short) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 10, (int) 'a');
    }

    @Test
    public void test08365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08365");
        int[] intArray5 = new int[] { (short) 1, (-1), 100, (byte) 100, '#' };
        int[] intArray9 = new int[] { (short) 100, 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) '#', (int) (byte) 1);
    }

    @Test
    public void test08366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08366");
        int[] intArray3 = new int[] { (short) 100, '#', (short) -1 };
        int[] intArray7 = new int[] { (byte) 100, (byte) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 0, 10);
    }

    @Test
    public void test08367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08367");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 0, 0, (short) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 100, (int) (short) 1);
    }

    @Test
    public void test08368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08368");
        int[] intArray2 = new int[] { (byte) 0, 10 };
        int[] intArray6 = new int[] { (short) 10, (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 0, (int) (short) 100);
    }

    @Test
    public void test08369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08369");
        int[] intArray5 = new int[] { (-1), (byte) -1, ' ', 0, (byte) 0 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) 0, (int) (short) 1);
    }

    @Test
    public void test08370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08370");
        int[] intArray4 = new int[] { (byte) 0, (byte) 1, 100, (short) 100 };
        int[] intArray8 = new int[] { (short) 100, (byte) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 10, 100);
    }

    @Test
    public void test08371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08371");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (short) 100, (int) (byte) 1);
    }

    @Test
    public void test08372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08372");
        int[] intArray2 = new int[] { (-1), (short) 0 };
        int[] intArray8 = new int[] { 100, (byte) 10, '4', (byte) -1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) '#', 100);
    }

    @Test
    public void test08373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08373");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray5 = new int[] { (byte) -1, 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (byte) -1, 0);
    }

    @Test
    public void test08374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08374");
        int[] intArray2 = new int[] { (byte) 100, (-1) };
        int[] intArray6 = new int[] { (byte) -1, (short) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) 0, (int) (byte) -1);
    }

    @Test
    public void test08375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08375");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray8 = new int[] { (short) 10, (short) 1, (byte) 100, (short) 1, 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) 100, (int) (short) 100);
    }

    @Test
    public void test08376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08376");
        int[] intArray3 = new int[] { (byte) 0, ' ', ' ' };
        int[] intArray6 = new int[] { (short) 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) ' ', (int) (byte) 10);
    }

    @Test
    public void test08377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08377");
        int[] intArray6 = new int[] { '4', (-1), (short) 100, 10, (short) 0, (byte) 1 };
        int[] intArray10 = new int[] { (short) 1, (byte) 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 1, (int) (byte) 1);
    }

    @Test
    public void test08378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08378");
        int[] intArray3 = new int[] { (byte) 0, '4', (byte) 1 };
        int[] intArray5 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) 0, (int) (short) 1);
    }

    @Test
    public void test08379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08379");
        int[] intArray3 = new int[] { '4', 0, (short) 0 };
        int[] intArray8 = new int[] { '#', '#', (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) '4', 10);
    }

    @Test
    public void test08380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08380");
        int[] intArray3 = new int[] { 0, (short) -1, (short) 100 };
        int[] intArray7 = new int[] { 'a', 'a', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 10, (int) (short) -1);
    }

    @Test
    public void test08381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08381");
        int[] intArray2 = new int[] { (short) -1, (byte) 1 };
        int[] intArray8 = new int[] { (short) -1, ' ', (byte) 0, '#', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (byte) 0, (int) (byte) 10);
    }

    @Test
    public void test08382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08382");
        int[] intArray6 = new int[] { (-1), (short) 10, (short) 100, (byte) 10, (short) -1, (short) 0 };
        int[] intArray8 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 0, (int) (byte) 1);
    }

    @Test
    public void test08383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08383");
        int[] intArray5 = new int[] { (byte) -1, (byte) 0, (byte) 10, (byte) 100, (-1) };
        int[] intArray11 = new int[] { 0, 100, 10, (byte) 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) 0, 1);
    }

    @Test
    public void test08384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08384");
        int[] intArray4 = new int[] { (byte) 100, ' ', (-1), (short) 1 };
        int[] intArray7 = new int[] { 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) 0, (int) (short) 0);
    }

    @Test
    public void test08385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08385");
        int[] intArray4 = new int[] { (-1), (byte) 10, 'a', 100 };
        int[] intArray9 = new int[] { (short) 10, (byte) 10, '#', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 1, (-1));
    }

    @Test
    public void test08386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08386");
        int[] intArray4 = new int[] { ' ', '4', 10, (short) -1 };
        int[] intArray7 = new int[] { (short) 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test08387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08387");
        int[] intArray2 = new int[] { (byte) -1, (byte) 0 };
        int[] intArray8 = new int[] { '4', 0, '#', (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (-1), (int) 'a');
    }

    @Test
    public void test08388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08388");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 'a', (short) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, 1, (int) (byte) 0);
    }

    @Test
    public void test08389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08389");
        int[] intArray5 = new int[] { '#', (byte) 0, 10, (short) 100, (byte) 100 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 0, (int) 'a');
    }

    @Test
    public void test08390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08390");
        int[] intArray6 = new int[] { (byte) 10, (short) -1, (byte) 100, (short) 100, 'a', (byte) 10 };
        int[] intArray12 = new int[] { '4', 1, (short) 1, ' ', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) 0, (int) (short) 100);
    }

    @Test
    public void test08391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08391");
        int[] intArray4 = new int[] { (byte) 0, 100, (byte) -1, (byte) 1 };
        int[] intArray9 = new int[] { (short) 1, (byte) 0, (short) -1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 1, (int) (byte) 0);
    }

    @Test
    public void test08392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08392");
        int[] intArray5 = new int[] { (byte) 0, (byte) -1, (short) 10, 'a', 100 };
        int[] intArray8 = new int[] { 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) ' ', (int) (short) 0);
    }

    @Test
    public void test08393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08393");
        int[] intArray1 = new int[] { '#' };
        int[] intArray5 = new int[] { (byte) -1, 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) 10, (int) (byte) 0);
    }

    @Test
    public void test08394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08394");
        int[] intArray2 = new int[] { 'a', ' ' };
        int[] intArray5 = new int[] { (byte) -1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (byte) 100, 10);
    }

    @Test
    public void test08395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08395");
        int[] intArray2 = new int[] { '#', (short) 100 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 0, (int) (byte) -1);
    }

    @Test
    public void test08396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08396");
        int[] intArray3 = new int[] { 'a', (short) 0, (short) 1 };
        int[] intArray10 = new int[] { (byte) 10, (byte) 100, '4', (short) 100, (short) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (byte) 1, 10);
    }

    @Test
    public void test08397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08397");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) 100, 100);
    }

    @Test
    public void test08398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08398");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (byte) 1, (int) (short) 100);
    }

    @Test
    public void test08399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08399");
        int[] intArray4 = new int[] { 10, (short) 0, 1, 'a' };
        int[] intArray9 = new int[] { '#', (short) -1, '4', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) 'a', 100);
    }

    @Test
    public void test08400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08400");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) 100, (byte) 10, (short) 100, (byte) -1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) 1, (int) (byte) 10);
    }

    @Test
    public void test08401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08401");
        int[] intArray4 = new int[] { (short) 10, '4', (byte) 0, (byte) 1 };
        int[] intArray8 = new int[] { ' ', (short) 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 1, (int) ' ');
    }

    @Test
    public void test08402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08402");
        int[] intArray6 = new int[] { (byte) -1, (short) 100, 1, '#', 0, 10 };
        int[] intArray10 = new int[] { (byte) 100, (short) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 0, 1);
    }

    @Test
    public void test08403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08403");
        int[] intArray3 = new int[] { 0, ' ', (short) 100 };
        int[] intArray7 = new int[] { (short) -1, (short) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) -1, 100);
    }

    @Test
    public void test08404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08404");
        int[] intArray5 = new int[] { (short) 100, (byte) 100, (byte) 1, (short) 100, '4' };
        int[] intArray12 = new int[] { (short) 1, '#', (short) 1, (byte) 1, (byte) 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) 0, (int) (byte) 100);
    }

    @Test
    public void test08405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08405");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) -1, (-1));
    }

    @Test
    public void test08406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08406");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray6 = new int[] { ' ', 'a', 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (byte) 100, 0);
    }

    @Test
    public void test08407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08407");
        int[] intArray2 = new int[] { (short) 0, (byte) 0 };
        int[] intArray6 = new int[] { (byte) 0, 'a', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) 1, 10);
    }

    @Test
    public void test08408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08408");
        int[] intArray2 = new int[] { ' ', (short) 100 };
        int[] intArray7 = new int[] { (short) 100, 'a', (-1), (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 100, 0);
    }

    @Test
    public void test08409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08409");
        int[] intArray3 = new int[] { (byte) -1, ' ', (byte) 1 };
        int[] intArray8 = new int[] { 0, (short) 0, (byte) 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (short) -1, 10);
    }

    @Test
    public void test08410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08410");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 1, 'a', (byte) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) -1, (int) (byte) 0);
    }

    @Test
    public void test08411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08411");
        int[] intArray5 = new int[] { (byte) 10, (byte) 1, 10, (byte) 100, (byte) 0 };
        int[] intArray8 = new int[] { (short) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) -1, (int) (byte) -1);
    }

    @Test
    public void test08412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08412");
        int[] intArray5 = new int[] { (byte) -1, (short) 10, 100, (short) 0, (short) 100 };
        int[] intArray12 = new int[] { (byte) -1, (byte) 0, (short) 100, (short) 100, '#', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, 0, (int) 'a');
    }

    @Test
    public void test08413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08413");
        int[] intArray4 = new int[] { (short) 1, 100, (byte) 100, 10 };
        int[] intArray6 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, 0, 0);
    }

    @Test
    public void test08414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08414");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 0, (short) 1, '4', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) 1, (int) (byte) 1);
    }

    @Test
    public void test08415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08415");
        int[] intArray5 = new int[] { (byte) -1, (-1), (short) 10, ' ', (short) -1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) '4', 100);
    }

    @Test
    public void test08416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08416");
        int[] intArray3 = new int[] { (short) 10, (short) 1, ' ' };
        int[] intArray5 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) ' ', (int) (short) 1);
    }

    @Test
    public void test08417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08417");
        int[] intArray5 = new int[] { 0, (byte) 10, 'a', (byte) 100, (byte) 1 };
        int[] intArray11 = new int[] { (byte) 10, (byte) 1, (short) 0, 'a', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 10, (int) (byte) 0);
    }

    @Test
    public void test08418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08418");
        int[] intArray3 = new int[] { (byte) 1, (byte) 0, (short) 100 };
        int[] intArray9 = new int[] { (short) -1, 1, 10, ' ', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (byte) 10, 0);
    }

    @Test
    public void test08419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08419");
        int[] intArray2 = new int[] { (byte) 10, (short) 100 };
        int[] intArray8 = new int[] { '#', (byte) 10, (byte) -1, 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 10, (int) ' ');
    }

    @Test
    public void test08420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08420");
        int[] intArray4 = new int[] { (short) -1, (-1), (short) 100, '4' };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) '4', (int) (byte) 10);
    }

    @Test
    public void test08421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08421");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray8 = new int[] { '#', ' ', 10, (short) 0, '#', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 0, (int) (byte) 100);
    }

    @Test
    public void test08422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08422");
        int[] intArray2 = new int[] { 100, 'a' };
        int[] intArray5 = new int[] { (byte) 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 1, (int) (byte) 10);
    }

    @Test
    public void test08423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08423");
        int[] intArray5 = new int[] { '4', (short) 10, 1, 10, 1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 10, 1);
    }

    @Test
    public void test08424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08424");
        int[] intArray3 = new int[] { 1, (short) 1, 1 };
        int[] intArray9 = new int[] { (byte) 1, 100, '#', (short) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (byte) -1, 0);
    }

    @Test
    public void test08425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08425");
        int[] intArray3 = new int[] { (byte) 1, '4', (byte) 1 };
        int[] intArray10 = new int[] { (byte) 100, (-1), (byte) 1, (byte) 1, (byte) 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) '4', (int) (short) 10);
    }

    @Test
    public void test08426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08426");
        int[] intArray5 = new int[] { (byte) 1, (byte) 100, 0, (-1), ' ' };
        int[] intArray11 = new int[] { (byte) 10, (byte) 1, (byte) -1, (short) 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) 10, (int) (byte) 10);
    }

    @Test
    public void test08427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08427");
        int[] intArray3 = new int[] { 10, (short) -1, (byte) 100 };
        int[] intArray6 = new int[] { '4', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) 1, 100);
    }

    @Test
    public void test08428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08428");
        int[] intArray3 = new int[] { ' ', (short) 0, (byte) 10 };
        int[] intArray5 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) 100, (int) (short) 10);
    }

    @Test
    public void test08429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08429");
        int[] intArray3 = new int[] { (byte) 10, ' ', 1 };
        int[] intArray6 = new int[] { (byte) 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) 'a', (int) (byte) -1);
    }

    @Test
    public void test08430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08430");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (-1), (int) (short) -1);
    }

    @Test
    public void test08431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08431");
        int[] intArray5 = new int[] { (byte) -1, (short) -1, (byte) 1, (byte) 0, 0 };
        int[] intArray7 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) ' ', (int) (short) 100);
    }

    @Test
    public void test08432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08432");
        int[] intArray1 = new int[] { 10 };
        int[] intArray7 = new int[] { '4', (short) 1, (byte) 0, '4', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) '#', (int) (byte) 100);
    }

    @Test
    public void test08433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08433");
        int[] intArray4 = new int[] { ' ', 'a', 10, ' ' };
        int[] intArray7 = new int[] { (short) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) '#', 10);
    }

    @Test
    public void test08434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08434");
        int[] intArray2 = new int[] { 0, '#' };
        int[] intArray4 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (byte) -1, 1);
    }

    @Test
    public void test08435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08435");
        int[] intArray5 = new int[] { ' ', 100, (byte) 100, (byte) -1, (short) 10 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (short) 1, 1);
    }

    @Test
    public void test08436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08436");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { '#', (short) -1, (short) 10, (byte) -1, (short) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) 'a', (int) (short) 0);
    }

    @Test
    public void test08437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08437");
        int[] intArray1 = new int[] { 10 };
        int[] intArray7 = new int[] { (byte) 100, (short) 1, 'a', (byte) 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test08438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08438");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) -1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (byte) -1, (int) (byte) 100);
    }

    @Test
    public void test08439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08439");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray3 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, 10, (int) (short) 1);
    }

    @Test
    public void test08440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08440");
        int[] intArray2 = new int[] { (byte) 1, ' ' };
        int[] intArray7 = new int[] { (byte) 0, (byte) 100, (short) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 0, (int) '#');
    }

    @Test
    public void test08441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08441");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { '#', (short) -1, (byte) 10, 10, (short) 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, 10, (int) (byte) 100);
    }

    @Test
    public void test08442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08442");
        int[] intArray5 = new int[] { (byte) 0, '#', (short) 0, (byte) 100, (short) 1 };
        int[] intArray7 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (short) 1, 100);
    }

    @Test
    public void test08443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08443");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { ' ', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 0, (-1));
    }

    @Test
    public void test08444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08444");
        int[] intArray5 = new int[] { 10, (short) -1, (byte) -1, (short) 100, ' ' };
        int[] intArray8 = new int[] { ' ', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) '4', (int) '4');
    }

    @Test
    public void test08445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08445");
        int[] intArray3 = new int[] { (short) -1, '#', (byte) -1 };
        int[] intArray8 = new int[] { 1, (byte) 100, (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (byte) 100, (int) (byte) 10);
    }

    @Test
    public void test08446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08446");
        int[] intArray4 = new int[] { (short) 10, (short) -1, (byte) 10, ' ' };
        int[] intArray10 = new int[] { 100, (byte) -1, ' ', (short) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) ' ', (int) (short) 1);
    }

    @Test
    public void test08447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08447");
        int[] intArray4 = new int[] { 100, (byte) 100, (short) 1, (short) -1 };
        int[] intArray10 = new int[] { (short) 0, 100, (short) 1, '4', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) 10, (int) (byte) 0);
    }

    @Test
    public void test08448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08448");
        int[] intArray4 = new int[] { '#', (short) -1, 100, (byte) -1 };
        int[] intArray9 = new int[] { '4', (byte) 1, (short) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) 100, (int) ' ');
    }

    @Test
    public void test08449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08449");
        int[] intArray6 = new int[] { (short) 0, (short) 10, (short) -1, (short) 100, ' ', (short) -1 };
        int[] intArray9 = new int[] { (short) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (short) 0, (int) '#');
    }

    @Test
    public void test08450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08450");
        int[] intArray2 = new int[] { (short) 1, 1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 1, (int) 'a');
    }

    @Test
    public void test08451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08451");
        int[] intArray2 = new int[] { (byte) 100, '4' };
        int[] intArray6 = new int[] { (byte) -1, (short) 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) 1, 1);
    }

    @Test
    public void test08452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08452");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, 1, (int) 'a');
    }

    @Test
    public void test08453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08453");
        int[] intArray6 = new int[] { 0, ' ', (short) 10, (byte) 10, (short) 100, (byte) 1 };
        int[] intArray9 = new int[] { (short) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (-1), 100);
    }

    @Test
    public void test08454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08454");
        int[] intArray6 = new int[] { (byte) -1, (short) -1, 0, 0, 10, '#' };
        int[] intArray12 = new int[] { (byte) 1, (byte) 1, (short) 100, 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) 'a', (int) (short) 100);
    }

    @Test
    public void test08455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08455");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test08456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08456");
        int[] intArray6 = new int[] { 0, 10, ' ', (short) 0, (short) -1, (-1) };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) -1, (int) (short) 10);
    }

    @Test
    public void test08457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08457");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray3 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) 1, (int) (byte) 1);
    }

    @Test
    public void test08458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08458");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray4 = new int[] { '#', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) '4', (int) '#');
    }

    @Test
    public void test08459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08459");
        int[] intArray5 = new int[] { (byte) 10, (byte) 1, (short) 10, (short) 1, 100 };
        int[] intArray10 = new int[] { (short) 1, (byte) 0, 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (short) 0, (int) (short) 100);
    }

    @Test
    public void test08460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08460");
        int[] intArray6 = new int[] { (byte) 100, 'a', 10, (byte) 1, (short) 10, 100 };
        int[] intArray10 = new int[] { (byte) 10, (byte) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) 100, (int) (byte) -1);
    }

    @Test
    public void test08461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08461");
        int[] intArray6 = new int[] { (byte) 0, '4', (short) -1, (byte) 1, (byte) -1, (-1) };
        int[] intArray11 = new int[] { ' ', 1, '4', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 0, (int) '#');
    }

    @Test
    public void test08462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08462");
        int[] intArray5 = new int[] { '#', ' ', 10, '#', (byte) 100 };
        int[] intArray9 = new int[] { 'a', 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) 'a', (int) 'a');
    }

    @Test
    public void test08463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08463");
        int[] intArray2 = new int[] { (byte) 0, (short) -1 };
        int[] intArray6 = new int[] { (short) 1, '4', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 100, 0);
    }

    @Test
    public void test08464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08464");
        int[] intArray3 = new int[] { 'a', '#', (short) 100 };
        int[] intArray7 = new int[] { (byte) 10, (byte) 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) 10, (int) '#');
    }

    @Test
    public void test08465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08465");
        int[] intArray5 = new int[] { 0, 100, ' ', '4', (byte) 0 };
        int[] intArray12 = new int[] { (short) 1, (short) -1, 0, ' ', 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) '4', (int) 'a');
    }

    @Test
    public void test08466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08466");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray8 = new int[] { (short) 100, (byte) -1, 10, 0, ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) ' ', (int) (byte) 10);
    }

    @Test
    public void test08467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08467");
        int[] intArray5 = new int[] { 0, (byte) -1, (byte) 100, (-1), (short) 100 };
        int[] intArray7 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (short) -1, (int) (byte) -1);
    }

    @Test
    public void test08468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08468");
        int[] intArray5 = new int[] { (byte) 10, (short) 10, (short) -1, (-1), ' ' };
        int[] intArray11 = new int[] { (short) 10, (byte) 100, (short) 1, (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) '#', (int) (short) 10);
    }

    @Test
    public void test08469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08469");
        int[] intArray6 = new int[] { '#', '4', (short) 1, 0, (short) -1, (byte) -1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test08470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08470");
        int[] intArray4 = new int[] { (byte) 1, 0, ' ', (short) -1 };
        int[] intArray7 = new int[] { (byte) 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 1, (int) (byte) -1);
    }

    @Test
    public void test08471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08471");
        int[] intArray5 = new int[] { (byte) -1, (byte) 10, (short) 10, (short) 10, ' ' };
        int[] intArray12 = new int[] { 1, (-1), (short) -1, 0, (byte) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) 0, 1);
    }

    @Test
    public void test08472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08472");
        int[] intArray4 = new int[] { (byte) 100, (byte) 1, 0, (byte) 0 };
        int[] intArray10 = new int[] { (-1), '#', (-1), (byte) 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (byte) -1, (int) (short) 100);
    }

    @Test
    public void test08473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08473");
        int[] intArray2 = new int[] { 100, (short) 10 };
        int[] intArray5 = new int[] { '4', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 10, 1);
    }

    @Test
    public void test08474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08474");
        int[] intArray5 = new int[] { (short) 0, (byte) 100, (byte) 0, (short) -1, (short) 0 };
        int[] intArray12 = new int[] { (-1), (short) -1, (byte) 1, (short) 1, '4', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (byte) 1, (int) (short) -1);
    }

    @Test
    public void test08475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08475");
        int[] intArray2 = new int[] { (byte) -1, (byte) -1 };
        int[] intArray7 = new int[] { (byte) 100, (short) -1, 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 0, (int) (byte) 1);
    }

    @Test
    public void test08476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08476");
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (short) 0, (byte) 1 };
        int[] intArray8 = new int[] { '4', (byte) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) '#', 0);
    }

    @Test
    public void test08477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08477");
        int[] intArray3 = new int[] { (short) -1, (short) 100, (short) 0 };
        int[] intArray5 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) 10, (int) (byte) 10);
    }

    @Test
    public void test08478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08478");
        int[] intArray4 = new int[] { (short) 100, (byte) -1, 100, '#' };
        int[] intArray10 = new int[] { (-1), 1, (short) -1, (byte) 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (byte) -1, (int) '4');
    }

    @Test
    public void test08479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08479");
        int[] intArray2 = new int[] { 100, ' ' };
        int[] intArray7 = new int[] { 10, (short) 10, 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) -1, 0);
    }

    @Test
    public void test08480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08480");
        int[] intArray3 = new int[] { 10, 100, 100 };
        int[] intArray6 = new int[] { '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) -1, (int) (byte) 0);
    }

    @Test
    public void test08481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08481");
        int[] intArray6 = new int[] { 100, (short) 1, (short) 1, ' ', '4', (short) -1 };
        int[] intArray9 = new int[] { '#', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 1, 1);
    }

    @Test
    public void test08482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08482");
        int[] intArray3 = new int[] { (byte) 100, (byte) 1, (short) 0 };
        int[] intArray9 = new int[] { '#', 10, (byte) 0, (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 100, (int) (byte) -1);
    }

    @Test
    public void test08483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08483");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 100, (short) 100, '4', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 10, (-1));
    }

    @Test
    public void test08484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08484");
        int[] intArray3 = new int[] { (short) -1, (byte) -1, (byte) 10 };
        int[] intArray5 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) 10, (int) (byte) 10);
    }

    @Test
    public void test08485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08485");
        int[] intArray3 = new int[] { (short) 100, ' ', (short) -1 };
        int[] intArray8 = new int[] { (short) 1, 0, (byte) 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) '#', (int) (short) -1);
    }

    @Test
    public void test08486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08486");
        int[] intArray5 = new int[] { (byte) 1, 10, 10, 10, 100 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) 'a', 100);
    }

    @Test
    public void test08487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08487");
        int[] intArray2 = new int[] { 10, (byte) 1 };
        int[] intArray8 = new int[] { (short) 10, ' ', 'a', (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) 100, 0);
    }

    @Test
    public void test08488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08488");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) '#', (int) (byte) 100);
    }

    @Test
    public void test08489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08489");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray5 = new int[] { (byte) 10, (-1), (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) 1, (int) (short) -1);
    }

    @Test
    public void test08490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08490");
        int[] intArray3 = new int[] { (short) 10, (short) 1, (byte) -1 };
        int[] intArray8 = new int[] { (short) 100, (short) -1, '4', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 10, 0);
    }

    @Test
    public void test08491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08491");
        int[] intArray6 = new int[] { (short) 0, 0, (byte) -1, 1, 0, (-1) };
        int[] intArray12 = new int[] { (short) 100, 100, 10, 'a', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) '4', (-1));
    }

    @Test
    public void test08492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08492");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray8 = new int[] { 0, (short) 10, '#', 'a', (short) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) -1, (int) '4');
    }

    @Test
    public void test08493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08493");
        int[] intArray5 = new int[] { (short) 0, (byte) -1, (short) 1, (short) 1, (byte) -1 };
        int[] intArray8 = new int[] { 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) 10, (int) (byte) 0);
    }

    @Test
    public void test08494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08494");
        int[] intArray2 = new int[] { 'a', (byte) 0 };
        int[] intArray7 = new int[] { (-1), '#', 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test08495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08495");
        int[] intArray6 = new int[] { 0, 'a', (byte) 1, (short) 1, (short) -1, (short) 1 };
        int[] intArray10 = new int[] { (byte) 100, 'a', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 0, (int) (byte) -1);
    }

    @Test
    public void test08496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08496");
        int[] intArray4 = new int[] { (short) 1, (-1), (byte) 0, 0 };
        int[] intArray10 = new int[] { (byte) 100, 1, (short) 1, (short) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (-1), (int) '4');
    }

    @Test
    public void test08497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08497");
        int[] intArray6 = new int[] { '4', (short) 1, (short) -1, 0, (byte) 10, 100 };
        int[] intArray13 = new int[] { ' ', (-1), 100, (byte) -1, 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (byte) -1, (int) (short) 10);
    }

    @Test
    public void test08498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08498");
        int[] intArray6 = new int[] { 10, '#', (byte) 10, (byte) 0, (short) 1, (short) 100 };
        int[] intArray10 = new int[] { (byte) 10, 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 100, (int) (short) 0);
    }

    @Test
    public void test08499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08499");
        int[] intArray4 = new int[] { (short) 1, ' ', (byte) 0, 'a' };
        int[] intArray9 = new int[] { 1, (short) -1, 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (byte) -1, 100);
    }

    @Test
    public void test08500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test08500");
        int[] intArray3 = new int[] { (byte) 0, '4', (-1) };
        int[] intArray10 = new int[] { (short) 100, 10, 10, (short) 0, (short) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 1, (int) (short) 100);
    }
}
