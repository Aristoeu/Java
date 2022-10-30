package KnapsackMemoization;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00001");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, 0, (int) 'a');
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00002");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray6 = new int[] { (byte) 100, '4', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (short) 1, 0);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00003");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 0, 100, (byte) -1, (short) 1, (short) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) 1, (int) '#');
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00004");
        int[] intArray6 = new int[] { 'a', (short) 10, '4', 100, 10, (short) 0 };
        int[] intArray13 = new int[] { (short) 10, (short) 0, '4', (byte) 0, '4', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00005");
        int[] intArray2 = new int[] { (short) -1, '#' };
        int[] intArray7 = new int[] { 100, ' ', 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 100, 0);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00006");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 'a', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (short) 0, (int) (byte) -1);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00007");
        int[] intArray2 = new int[] { ' ', 100 };
        int[] intArray9 = new int[] { (short) 0, (byte) 1, (byte) 100, (byte) 100, 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (byte) 1, (int) (byte) 100);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00008");
        int[] intArray3 = new int[] { (short) -1, 0, (byte) 0 };
        int[] intArray9 = new int[] { (byte) 100, (byte) 100, '4', '4', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) 'a', 100);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00009");
        int[] intArray3 = new int[] { (byte) -1, 'a', (short) 0 };
        int[] intArray6 = new int[] { '4', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, 10, (int) (byte) -1);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00010");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) ' ', (int) (byte) -1);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00011");
        int[] intArray2 = new int[] { (byte) 100, '#' };
        int[] intArray6 = new int[] { (short) -1, 'a', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00012");
        int[] intArray4 = new int[] { (byte) 10, 10, 0, 0 };
        int[] intArray7 = new int[] { (-1), 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) -1, (int) 'a');
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00013");
        int[] intArray5 = new int[] { '#', (short) 10, (short) 1, '#', (byte) 10 };
        int[] intArray10 = new int[] { 100, (byte) 10, '4', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 100, (int) (short) 100);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00014");
        int[] intArray5 = new int[] { 1, ' ', (short) 100, (short) 1, (short) 0 };
        int[] intArray11 = new int[] { (short) 10, (short) 1, '4', (byte) 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 10, (int) (short) 100);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00015");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (short) 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 10, (int) (byte) 1);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00016");
        int[] intArray3 = new int[] { 0, ' ', (-1) };
        int[] intArray6 = new int[] { 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) -1, (int) (byte) 0);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00017");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray8 = new int[] { (byte) -1, 1, (short) -1, 100, (short) 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) 100, (int) (short) 10);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00018");
        int[] intArray6 = new int[] { (-1), (byte) 0, (byte) 100, (byte) -1, (short) 10, 'a' };
        int[] intArray8 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 100, (int) ' ');
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00019");
        int[] intArray3 = new int[] { ' ', (byte) 0, (short) 100 };
        int[] intArray8 = new int[] { 0, (byte) -1, 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 0, (int) (byte) 10);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00020");
        int[] intArray6 = new int[] { (-1), '#', (short) 100, 10, 100, (short) -1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) 10, (int) (byte) 1);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00021");
        int[] intArray4 = new int[] { 0, (byte) 10, (byte) 1, (byte) 1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) '4', (int) (short) 0);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00022");
        int[] intArray2 = new int[] { (byte) 100, 100 };
        int[] intArray9 = new int[] { (short) 100, (byte) -1, (short) 10, 1, 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (byte) 1, 1);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00023");
        int[] intArray6 = new int[] { (byte) 1, 'a', (byte) 100, (byte) 0, '4', 10 };
        int[] intArray9 = new int[] { (byte) 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (short) 0, (int) (short) 100);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00024");
        int[] intArray6 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        int[] intArray12 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 100, (int) (short) 1);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00025");
        int[] intArray5 = new int[] { 10, '4', 10, (short) 1, 100 };
        int[] intArray10 = new int[] { (short) 1, (byte) 10, (byte) -1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00026");
        int[] intArray3 = new int[] { 'a', (byte) -1, (byte) 1 };
        int[] intArray10 = new int[] { (byte) 0, (byte) 10, (byte) -1, ' ', 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 0, (int) 'a');
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00027");
        int[] intArray5 = new int[] { (byte) 1, ' ', (byte) 100, 0, 10 };
        int[] intArray10 = new int[] { (byte) 1, 10, (byte) 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 1, (int) (byte) -1);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00028");
        int[] intArray2 = new int[] { (short) 0, ' ' };
        int[] intArray5 = new int[] { 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) 'a', (int) (byte) 0);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00029");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray6 = new int[] { (byte) -1, (short) -1, 'a', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00030");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 10, (short) 100, 1, (short) 1, (byte) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) 100, (int) (byte) -1);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00031");
        int[] intArray2 = new int[] { 10, ' ' };
        int[] intArray6 = new int[] { 0, (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 100, (int) '#');
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00032");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray5 = new int[] { ' ', '4', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) '4', (int) (short) 100);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00033");
        int[] intArray3 = new int[] { 'a', (short) -1, (byte) 10 };
        int[] intArray5 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) 100, 100);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00034");
        int[] intArray5 = new int[] { '#', (byte) 10, (short) 1, 100, (short) -1 };
        int[] intArray7 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, 0, (int) (byte) 1);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00035");
        int[] intArray5 = new int[] { '4', (byte) 10, (short) 100, (byte) 10, ' ' };
        int[] intArray7 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) '4', (int) (short) 100);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00036");
        int[] intArray3 = new int[] { (byte) 10, (short) -1, '4' };
        int[] intArray9 = new int[] { (short) 1, (short) 1, (short) -1, 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 0, (int) (byte) 100);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00037");
        int[] intArray2 = new int[] { (byte) 0, 0 };
        int[] intArray8 = new int[] { (short) 0, '#', (short) 1, '4', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) 10, (int) (byte) -1);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00038");
        int[] intArray3 = new int[] { (byte) 0, (short) 100, (-1) };
        int[] intArray10 = new int[] { ' ', (byte) 10, 100, (byte) 0, 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (-1), 0);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00039");
        int[] intArray6 = new int[] { (-1), (byte) 0, '4', ' ', (byte) -1, (byte) 1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) 0, 0);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00040");
        int[] intArray4 = new int[] { 1, (byte) 100, 0, 10 };
        int[] intArray11 = new int[] { (short) 100, (-1), 100, (-1), (byte) 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, 100, (int) ' ');
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00041");
        int[] intArray2 = new int[] { (short) -1, (-1) };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) -1, (-1));
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00042");
        int[] intArray3 = new int[] { (byte) 0, (short) 1, '#' };
        int[] intArray6 = new int[] { (short) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) -1, (int) '#');
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00043");
        int[] intArray4 = new int[] { (byte) 0, (byte) -1, 'a', (byte) 1 };
        int[] intArray7 = new int[] { 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) '#', (int) (byte) -1);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00044");
        int[] intArray3 = new int[] { ' ', (byte) 0, 100 };
        int[] intArray6 = new int[] { (byte) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) 1, (int) 'a');
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00045");
        int[] intArray5 = new int[] { 10, 0, (short) 100, (short) 1, 0 };
        int[] intArray11 = new int[] { (short) 1, (-1), '#', 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) '#', (int) '#');
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00046");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray4 = new int[] { (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) '4', (int) (byte) -1);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00047");
        int[] intArray5 = new int[] { ' ', (short) 0, (byte) -1, (byte) 100, (short) 1 };
        int[] intArray7 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) '4', 0);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00048");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { ' ', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (short) 10, (int) (short) 10);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00049");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 0, (short) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) 'a', (int) ' ');
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00050");
        int[] intArray3 = new int[] { 'a', 'a', (short) 1 };
        int[] intArray10 = new int[] { (short) 10, 1, '4', (short) 1, 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) ' ', (int) ' ');
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00051");
        int[] intArray2 = new int[] { (byte) 0, 1 };
        int[] intArray4 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) ' ', 0);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00052");
        int[] intArray3 = new int[] { (short) 0, (short) 10, '#' };
        int[] intArray10 = new int[] { (-1), '#', 10, (byte) 0, 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (byte) -1, (int) 'a');
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00053");
        int[] intArray6 = new int[] { (short) 10, (-1), (byte) -1, 10, (byte) 10, ' ' };
        int[] intArray8 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 0, 0);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00054");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray6 = new int[] { 0, 100, (byte) 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (byte) -1, (int) 'a');
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00055");
        int[] intArray6 = new int[] { (byte) 100, (byte) -1, (byte) 10, (short) -1, (-1), (byte) 0 };
        int[] intArray8 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 10, (int) (byte) 10);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00056");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) 10, (short) 100, (-1), 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) 10, (int) '4');
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00057");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, 100, (int) (byte) 0);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00058");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray8 = new int[] { 0, (short) 0, '#', (-1), 'a', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 10, 1);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00059");
        int[] intArray6 = new int[] { (short) 100, (byte) 100, 'a', (short) -1, 0, (byte) 1 };
        int[] intArray13 = new int[] { 100, (short) 1, 0, (byte) 10, 'a', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (short) 100, 0);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00060");
        int[] intArray3 = new int[] { 0, 0, (short) 0 };
        int[] intArray10 = new int[] { (short) 1, (short) 0, (byte) 0, (short) 0, (short) 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) '#', (int) '4');
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00061");
        int[] intArray5 = new int[] { (byte) 0, (byte) 10, 1, (short) -1, '4' };
        int[] intArray7 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, 100, (int) (short) 10);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00062");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (byte) 0, (byte) 1, 0, 'a', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) 10, 0);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00063");
        int[] intArray5 = new int[] { (short) 100, (byte) -1, 0, (short) 100, 10 };
        int[] intArray11 = new int[] { (byte) 1, 100, 0, 'a', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) 1, (int) (byte) 1);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00064");
        int[] intArray4 = new int[] { (short) 100, (byte) 1, '4', (byte) 100 };
        int[] intArray10 = new int[] { (short) 10, '4', (short) 100, (byte) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) 0, (int) (short) 1);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00065");
        int[] intArray4 = new int[] { (-1), 100, '#', (byte) 100 };
        int[] intArray6 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) -1, (int) (byte) 0);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00066");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 100, 'a', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) 10, (int) ' ');
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00067");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, 100, (int) (short) 100);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00068");
        int[] intArray4 = new int[] { (byte) 0, ' ', 10, (byte) 100 };
        int[] intArray10 = new int[] { (byte) 0, '4', (byte) 1, 'a', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (byte) 0, 0);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00069");
        int[] intArray3 = new int[] { ' ', (short) -1, (byte) 1 };
        int[] intArray10 = new int[] { 100, ' ', (byte) 0, (byte) -1, (short) 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 0, (int) (short) 10);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00070");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray8 = new int[] { 0, '4', (byte) 0, (short) 0, ' ', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) 0, (int) (short) 0);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00071");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 100, (short) 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, 0, (int) (short) -1);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00072");
        int[] intArray6 = new int[] { (short) 100, (byte) 1, (-1), 10, (byte) 100, (byte) -1 };
        int[] intArray9 = new int[] { (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, 10, (int) (short) 1);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00073");
        int[] intArray6 = new int[] { (short) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 10, (byte) 1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) 1, 10);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00074");
        int[] intArray6 = new int[] { (short) -1, (byte) 1, '4', (byte) 10, ' ', '4' };
        int[] intArray13 = new int[] { 100, (byte) 0, (byte) 10, (short) 100, 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (-1), 0);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00075");
        int[] intArray1 = new int[] { 10 };
        int[] intArray4 = new int[] { (-1), 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 10, (int) '4');
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00076");
        int[] intArray3 = new int[] { (short) 100, 100, (short) 0 };
        int[] intArray9 = new int[] { 100, (-1), '#', (byte) 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (byte) -1, (int) (byte) 10);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00077");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray6 = new int[] { ' ', 'a', 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 1, 10);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00078");
        int[] intArray5 = new int[] { (short) 0, (byte) 10, (byte) 100, (byte) 100, 1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (short) -1, (int) (byte) 0);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00079");
        int[] intArray6 = new int[] { ' ', (short) 0, '4', (byte) 0, (byte) 0, (short) 10 };
        int[] intArray8 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (-1), 1);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00080");
        int[] intArray3 = new int[] { '4', (-1), 0 };
        int[] intArray9 = new int[] { (byte) -1, (-1), (short) 100, (byte) -1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 1, (-1));
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00081");
        int[] intArray5 = new int[] { (short) 1, (byte) 10, (byte) -1, (short) 1, (-1) };
        int[] intArray11 = new int[] { (short) 1, (-1), ' ', (short) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00082");
        int[] intArray3 = new int[] { (byte) 100, '4', (short) 0 };
        int[] intArray9 = new int[] { (short) -1, 'a', (short) 1, (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (short) -1, (int) (short) 100);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00083");
        int[] intArray2 = new int[] { ' ', (short) 10 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (-1), (int) (short) 1);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00084");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 100, (byte) 1, (byte) -1, 1, 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) 1, (int) (byte) -1);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00085");
        int[] intArray3 = new int[] { (short) -1, (-1), '#' };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) ' ', (-1));
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00086");
        int[] intArray5 = new int[] { (-1), 100, (short) 0, (byte) 100, 'a' };
        int[] intArray11 = new int[] { ' ', (short) 100, (byte) 10, 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) '4', (int) (short) 1);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00087");
        int[] intArray5 = new int[] { (byte) 0, (short) 0, (byte) 0, (byte) 10, (short) 10 };
        int[] intArray8 = new int[] { (byte) 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) ' ', (int) (byte) 10);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00088");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 10, 10, (short) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) ' ', (int) (short) -1);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00089");
        int[] intArray3 = new int[] { 0, (byte) 10, 100 };
        int[] intArray9 = new int[] { '#', (byte) 1, 1, '#', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) 'a', (int) (byte) 0);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00090");
        int[] intArray6 = new int[] { (byte) -1, (short) 0, 0, ' ', 1, 0 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, 0, (int) (short) -1);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00091");
        int[] intArray3 = new int[] { (short) 10, '4', 0 };
        int[] intArray10 = new int[] { (short) 1, (short) 1, 10, (short) 10, (short) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) 'a', (int) (byte) 10);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00092");
        int[] intArray3 = new int[] { 0, (byte) 100, (short) 0 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, 10, (int) (short) 10);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00093");
        int[] intArray6 = new int[] { (byte) -1, ' ', (byte) 0, (short) 0, 'a', 'a' };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (-1), (-1));
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00094");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (byte) -1, 'a', (-1), (short) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, 100, (int) '4');
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00095");
        int[] intArray5 = new int[] { '4', (byte) 10, (short) 0, 1, 0 };
        int[] intArray10 = new int[] { (-1), '#', ' ', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) ' ', 0);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00096");
        int[] intArray3 = new int[] { ' ', '4', 100 };
        int[] intArray5 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) '4', (int) (byte) -1);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00097");
        int[] intArray2 = new int[] { 100, (byte) 100 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) ' ', (int) '#');
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00098");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray4 = new int[] { (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) ' ', (int) (byte) 0);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00099");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { '4', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (short) 10, (int) (short) 10);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00100");
        int[] intArray6 = new int[] { (byte) -1, 10, (short) 0, 100, (short) -1, '#' };
        int[] intArray8 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (byte) 100, 0);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00101");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray8 = new int[] { 1, (short) 0, 100, 100, (short) 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 10, (int) (byte) -1);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00102");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray4 = new int[] { (byte) -1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 0, 0);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00103");
        int[] intArray3 = new int[] { 100, (byte) 10, 'a' };
        int[] intArray10 = new int[] { (byte) 0, (short) -1, 0, (short) 1, '4', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 100, (int) '#');
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00104");
        int[] intArray4 = new int[] { (byte) 0, (short) 0, 1, 10 };
        int[] intArray8 = new int[] { 1, 'a', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 0, (int) (short) -1);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00105");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) -1, (-1), (byte) 0, (-1), 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, 10, (int) '4');
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00106");
        int[] intArray2 = new int[] { (short) -1, 'a' };
        int[] intArray4 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (short) 10, 10);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00107");
        int[] intArray4 = new int[] { (short) 1, (short) 1, 0, (short) 1 };
        int[] intArray7 = new int[] { (byte) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) ' ', (int) (short) 1);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00108");
        int[] intArray4 = new int[] { 0, ' ', 1, (short) 10 };
        int[] intArray6 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (-1), (int) (short) 1);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00109");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray3 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (byte) 10, 100);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00110");
        int[] intArray4 = new int[] { (short) 0, 100, 0, ' ' };
        int[] intArray6 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (short) 100, 0);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00111");
        int[] intArray3 = new int[] { (short) 1, (short) 100, '#' };
        int[] intArray9 = new int[] { (short) 1, (byte) -1, '#', (short) -1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) ' ', (int) (byte) 1);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00112");
        int[] intArray5 = new int[] { 0, 1, (-1), (-1), (byte) 1 };
        int[] intArray8 = new int[] { 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) -1, (int) 'a');
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00113");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray6 = new int[] { (byte) 100, (short) 1, (byte) 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (short) 100, (-1));
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00114");
        int[] intArray6 = new int[] { 'a', '4', (byte) 10, (-1), (byte) -1, (byte) 100 };
        int[] intArray13 = new int[] { (byte) 0, 10, (byte) 0, (byte) 1, (short) -1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 100, (int) (short) -1);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00115");
        int[] intArray6 = new int[] { (short) 1, 10, (byte) 0, ' ', 1, '4' };
        int[] intArray8 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) -1, (-1));
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00116");
        int[] intArray3 = new int[] { (short) 100, 'a', ' ' };
        int[] intArray9 = new int[] { '4', (byte) 10, (short) 1, (short) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (byte) 10, (int) (short) 0);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00117");
        int[] intArray5 = new int[] { 1, 10, ' ', (short) 0, (byte) -1 };
        int[] intArray12 = new int[] { (short) 10, '#', (byte) 10, (short) 0, ' ', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (byte) 100, (int) (byte) 100);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00118");
        int[] intArray3 = new int[] { (byte) 0, 0, (short) 100 };
        int[] intArray10 = new int[] { ' ', (short) 0, (byte) -1, (byte) 0, (-1), 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 100, (int) 'a');
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00119");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { '#', 100, '#', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) ' ', (int) 'a');
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00120");
        int[] intArray1 = new int[] { 0 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) 1, (int) (short) 10);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00121");
        int[] intArray3 = new int[] { (byte) 10, 100, 10 };
        int[] intArray10 = new int[] { (short) -1, (byte) 100, '#', (short) 1, 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) 'a', (int) (short) 1);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00122");
        int[] intArray3 = new int[] { '#', (byte) 1, '#' };
        int[] intArray10 = new int[] { 0, 100, ' ', (short) -1, (byte) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) ' ', (int) (byte) 10);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00123");
        int[] intArray2 = new int[] { (byte) 100, 0 };
        int[] intArray6 = new int[] { (byte) 100, ' ', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 0, (int) (byte) 0);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00124");
        int[] intArray4 = new int[] { 1, (short) 10, 0, (byte) 1 };
        int[] intArray10 = new int[] { (short) 100, (short) 100, 1, (short) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) 0, (-1));
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00125");
        int[] intArray6 = new int[] { (short) 0, '4', (short) -1, 10, 'a', (byte) 1 };
        int[] intArray9 = new int[] { (short) 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 100, 1);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00126");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray8 = new int[] { 'a', ' ', (short) 10, (byte) 100, '#', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) 10, (int) (short) 10);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00127");
        int[] intArray4 = new int[] { (short) 10, 0, (short) 10, (short) 10 };
        int[] intArray7 = new int[] { '#', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) -1, (-1));
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00128");
        int[] intArray2 = new int[] { ' ', 0 };
        int[] intArray4 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (byte) 0, (int) (short) -1);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00129");
        int[] intArray5 = new int[] { 100, (byte) 1, 100, 1, 0 };
        int[] intArray12 = new int[] { ' ', (byte) 0, (short) 100, ' ', (-1), (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) 'a', 0);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00130");
        int[] intArray6 = new int[] { (short) 100, ' ', 1, '4', 10, 100 };
        int[] intArray8 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 0, 0);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00131");
        int[] intArray6 = new int[] { (byte) 10, (short) 10, (byte) -1, 0, '4', (short) 1 };
        int[] intArray10 = new int[] { (byte) 0, (short) 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 1, 1);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00132");
        int[] intArray1 = new int[] { '#' };
        int[] intArray8 = new int[] { 'a', (-1), (byte) 1, ' ', (short) 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 0, (int) (byte) 1);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00133");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 1, (byte) 100, '#', (byte) 100, (byte) 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) 100, 1);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00134");
        int[] intArray5 = new int[] { 0, (byte) 10, (short) 0, 100, (short) -1 };
        int[] intArray11 = new int[] { (byte) -1, '#', (short) 10, (byte) 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) 0, (int) (byte) 0);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00135");
        int[] intArray1 = new int[] { '4' };
        int[] intArray8 = new int[] { 1, (byte) 10, (byte) 0, 10, ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 0, (int) (short) 0);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00136");
        int[] intArray6 = new int[] { (short) 10, '4', ' ', '#', 100, '#' };
        int[] intArray8 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 1, (int) ' ');
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00137");
        int[] intArray6 = new int[] { 0, 10, (byte) 1, 10, (byte) 100, 0 };
        int[] intArray8 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (-1), 100);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00138");
        int[] intArray4 = new int[] { (byte) 1, (byte) 0, 0, 1 };
        int[] intArray9 = new int[] { 10, (short) 0, 'a', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (byte) -1, (int) 'a');
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00139");
        int[] intArray5 = new int[] { (short) -1, '4', (short) -1, ' ', (byte) 1 };
        int[] intArray12 = new int[] { ' ', (byte) 1, 100, 0, (short) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00140");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (byte) 1, (int) (byte) 100);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00141");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray4 = new int[] { (-1), '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) 'a', (int) (short) 100);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00142");
        int[] intArray4 = new int[] { ' ', (short) -1, '4', (short) 100 };
        int[] intArray10 = new int[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) '#', 10);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00143");
        int[] intArray4 = new int[] { (byte) 0, (byte) 10, (byte) -1, 100 };
        int[] intArray8 = new int[] { 1, 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 0, (int) (byte) 100);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00144");
        int[] intArray2 = new int[] { (byte) 1, 10 };
        int[] intArray5 = new int[] { (byte) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 1, (int) '#');
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00145");
        int[] intArray6 = new int[] { (byte) 100, 1, 1, 10, (byte) 0, 1 };
        int[] intArray13 = new int[] { (short) 10, (byte) -1, 1, (-1), (byte) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (byte) 1, 0);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00146");
        int[] intArray6 = new int[] { '4', (byte) 10, '4', (short) 10, 100, (byte) 10 };
        int[] intArray11 = new int[] { (short) 0, (short) 1, (short) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (byte) -1, (int) 'a');
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00147");
        int[] intArray6 = new int[] { (byte) 1, (byte) 0, (short) -1, (byte) 100, '4', 1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00148");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) -1, 'a', 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) 1, (int) (short) 1);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00149");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 100, (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) 10, (int) '4');
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00150");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 0, '#' };
        int[] intArray9 = new int[] { 'a', 10, (byte) 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (byte) 1, (int) (short) 1);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00151");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray5 = new int[] { (-1), 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (byte) 10, 10);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00152");
        int[] intArray2 = new int[] { (short) 0, (short) 0 };
        int[] intArray8 = new int[] { (short) 10, 1, (byte) 10, (byte) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (byte) 0, (int) (byte) -1);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00153");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 0, (byte) -1, 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (-1), (-1));
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00154");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (-1), (short) 1, (byte) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 0, (int) 'a');
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00155");
        int[] intArray2 = new int[] { (byte) 0, 'a' };
        int[] intArray6 = new int[] { 100, ' ', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) 10, 10);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00156");
        int[] intArray4 = new int[] { '#', 10, 1, (byte) 10 };
        int[] intArray8 = new int[] { (byte) 1, 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 1, (int) ' ');
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00157");
        int[] intArray6 = new int[] { 10, (byte) -1, (byte) -1, 10, '4', 10 };
        int[] intArray10 = new int[] { (short) 10, (short) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 0, (int) (byte) -1);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00158");
        int[] intArray5 = new int[] { (short) 100, (short) 1, 'a', (short) 0, 10 };
        int[] intArray12 = new int[] { 100, 100, 100, '#', '#', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (-1), (int) ' ');
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00159");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray7 = new int[] { (byte) 1, '4', 'a', (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) 10, (int) '#');
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00160");
        int[] intArray5 = new int[] { 0, (byte) -1, (short) 0, (byte) -1, (short) -1 };
        int[] intArray9 = new int[] { (byte) 10, 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 10, (int) (byte) 10);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00161");
        int[] intArray1 = new int[] { 1 };
        int[] intArray4 = new int[] { (short) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 100, 0);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00162");
        int[] intArray5 = new int[] { 100, (short) 10, 1, '#', (byte) 0 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 100, 1);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00163");
        int[] intArray1 = new int[] { 0 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 10, (int) ' ');
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00164");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray8 = new int[] { 100, ' ', (-1), (short) 100, 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) 10, (int) (short) 0);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00165");
        int[] intArray2 = new int[] { (byte) -1, (byte) 0 };
        int[] intArray5 = new int[] { (short) 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 0, 0);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00166");
        int[] intArray5 = new int[] { (short) 10, (byte) -1, 'a', '#', (byte) -1 };
        int[] intArray12 = new int[] { ' ', (short) 1, (short) -1, (short) -1, (short) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) '#', (int) (byte) 1);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00167");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 100, 'a', (short) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (-1), (int) (byte) 0);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00168");
        int[] intArray4 = new int[] { 0, (byte) 1, 'a', '4' };
        int[] intArray6 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, 10, 0);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00169");
        int[] intArray6 = new int[] { (short) 0, (short) 100, '#', '#', (short) 10, 0 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00170");
        int[] intArray3 = new int[] { (short) -1, 0, (short) 100 };
        int[] intArray9 = new int[] { (short) -1, (byte) 0, 1, (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (short) 0, (int) '#');
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00171");
        int[] intArray2 = new int[] { (short) 1, (byte) 10 };
        int[] intArray8 = new int[] { 100, 'a', 1, (short) -1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) -1, 100);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00172");
        int[] intArray4 = new int[] { (-1), (-1), (byte) 1, (byte) -1 };
        int[] intArray11 = new int[] { ' ', 100, 100, (byte) 0, '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00173");
        int[] intArray2 = new int[] { (byte) 100, (byte) -1 };
        int[] intArray5 = new int[] { 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 0, (int) 'a');
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00174");
        int[] intArray5 = new int[] { ' ', 1, 10, 10, (byte) 0 };
        int[] intArray12 = new int[] { 100, (short) 10, ' ', (byte) 0, (short) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (byte) 10, (int) (short) 100);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00175");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) 100, (-1), (short) 0, (byte) -1, (short) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) 1, (int) (short) -1);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00176");
        int[] intArray5 = new int[] { (short) 1, (short) -1, ' ', (byte) -1, (byte) 10 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) 100, 1);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00177");
        int[] intArray4 = new int[] { '4', (byte) -1, 10, (short) 1 };
        int[] intArray10 = new int[] { (byte) 1, 10, 10, (byte) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) -1, (int) '#');
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00178");
        int[] intArray5 = new int[] { 10, (short) -1, '4', 'a', '4' };
        int[] intArray10 = new int[] { (short) 10, (byte) 100, 'a', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (byte) 10, (int) '4');
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00179");
        int[] intArray4 = new int[] { 'a', '4', 0, (short) 0 };
        int[] intArray9 = new int[] { (byte) 100, 0, (short) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 100, (int) '#');
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00180");
        int[] intArray2 = new int[] { (short) 1, (short) 100 };
        int[] intArray5 = new int[] { (byte) 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) ' ', (int) (byte) 10);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00181");
        int[] intArray1 = new int[] { '4' };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 100, (int) (short) 10);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00182");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray5 = new int[] { (byte) 100, (short) 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, 0, (int) (short) 0);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00183");
        int[] intArray3 = new int[] { ' ', (byte) 10, ' ' };
        int[] intArray9 = new int[] { 0, ' ', 0, (byte) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 10, (int) (short) -1);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00184");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray3 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, 1, 1);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00185");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray6 = new int[] { '4', 10, ' ', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 10, (int) (byte) -1);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00186");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 1, 0, (byte) 10, (byte) -1, '#', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, 10, 0);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00187");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 'a', (-1), (byte) 0, (byte) 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, 10, (int) 'a');
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00188");
        int[] intArray3 = new int[] { 0, '4', 'a' };
        int[] intArray10 = new int[] { 1, (-1), '4', 0, (byte) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 10, (int) '4');
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00189");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray3 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) 100, (int) (short) 1);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00190");
        int[] intArray5 = new int[] { 0, 1, (short) 10, 100, (short) 100 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (-1), 1);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00191");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray8 = new int[] { (short) 1, '#', (byte) 10, 100, 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) -1, (int) ' ');
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00192");
        int[] intArray6 = new int[] { 1, (short) 0, ' ', 100, 10, (short) -1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) -1, (int) '#');
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00193");
        int[] intArray3 = new int[] { (short) 100, 0, 'a' };
        int[] intArray7 = new int[] { (byte) -1, 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) 100, (int) (short) -1);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00194");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray7 = new int[] { (byte) -1, '#', (-1), (short) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) 1, (int) '4');
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00195");
        int[] intArray3 = new int[] { (short) 1, (short) -1, 100 };
        int[] intArray7 = new int[] { (short) 10, (byte) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) 1, (int) (byte) 1);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00196");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray6 = new int[] { (byte) -1, '#', (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (short) 10, (int) '4');
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00197");
        int[] intArray5 = new int[] { (short) 10, 10, (byte) 1, (byte) 100, (byte) 1 };
        int[] intArray9 = new int[] { '4', 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 100, (int) (short) -1);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00198");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 'a', (short) 100, '4', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 100, (-1));
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00199");
        int[] intArray4 = new int[] { (short) 1, (short) 10, '#', (byte) 1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (byte) 100, 10);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00200");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray5 = new int[] { (-1), (byte) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) -1, (int) (short) 100);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00201");
        int[] intArray3 = new int[] { '#', '#', 1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) '4', (int) (short) 10);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00202");
        int[] intArray5 = new int[] { '#', 10, (short) -1, '#', (short) 0 };
        int[] intArray7 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) 10, 100);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00203");
        int[] intArray1 = new int[] { '4' };
        int[] intArray5 = new int[] { 10, 'a', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00204");
        int[] intArray4 = new int[] { (short) 1, ' ', (short) 0, (short) 0 };
        int[] intArray6 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 0, (int) (short) -1);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00205");
        int[] intArray6 = new int[] { (byte) 100, (-1), (-1), (short) 1, (byte) 0, 10 };
        int[] intArray10 = new int[] { 1, (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 1, (int) (short) 100);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00206");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) -1, (short) 100, (-1), '4', ' ', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00207");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) '4', 0);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00208");
        int[] intArray3 = new int[] { ' ', ' ', (short) 0 };
        int[] intArray10 = new int[] { (-1), (short) 100, (byte) -1, (byte) -1, '#', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 10, (-1));
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00209");
        int[] intArray6 = new int[] { (byte) 100, (short) 0, 10, (short) 1, '4', 'a' };
        int[] intArray9 = new int[] { (short) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00210");
        int[] intArray2 = new int[] { (short) 1, 10 };
        int[] intArray6 = new int[] { 100, (short) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) -1, 10);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00211");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (-1), (short) 1, 100, (byte) -1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) 100, (int) (byte) 10);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00212");
        int[] intArray6 = new int[] { (short) 1, (byte) 10, (byte) 10, (short) 1, (short) -1, (short) 10 };
        int[] intArray12 = new int[] { (byte) -1, (short) 0, 100, (byte) 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 0, 1);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00213");
        int[] intArray3 = new int[] { ' ', (short) -1, (short) -1 };
        int[] intArray7 = new int[] { ' ', (byte) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) '#', (int) (short) 100);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00214");
        int[] intArray3 = new int[] { (short) 10, (short) 100, (short) 10 };
        int[] intArray7 = new int[] { (-1), 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) 0, (-1));
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00215");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (short) 1, 10);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00216");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) -1, 1, 'a', 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) -1, (int) '#');
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00217");
        int[] intArray5 = new int[] { (short) 10, ' ', 10, 0, (-1) };
        int[] intArray8 = new int[] { (byte) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 100, (int) '#');
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00218");
        int[] intArray2 = new int[] { (byte) -1, '4' };
        int[] intArray6 = new int[] { (short) 100, '4', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 10, 0);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00219");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, 0, (int) '4');
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00220");
        int[] intArray5 = new int[] { 0, (short) 10, (byte) 100, (short) -1, (short) 100 };
        int[] intArray7 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (short) 100, 0);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00221");
        int[] intArray5 = new int[] { (short) -1, (byte) 0, (short) 10, ' ', (byte) -1 };
        int[] intArray11 = new int[] { (byte) 10, (byte) 10, 0, (-1), '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) 0, (int) 'a');
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00222");
        int[] intArray5 = new int[] { '4', (byte) 10, 'a', 0, 100 };
        int[] intArray10 = new int[] { (byte) 100, (short) 1, (short) 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 1, (int) (byte) 1);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00223");
        int[] intArray3 = new int[] { ' ', (short) 0, 100 };
        int[] intArray6 = new int[] { ' ', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, 0, (int) (byte) 1);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00224");
        int[] intArray2 = new int[] { (byte) 0, (byte) 0 };
        int[] intArray9 = new int[] { (short) 0, (byte) 100, (short) -1, (short) 10, (short) 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (short) 10, (int) ' ');
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00225");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (byte) 100, (int) (short) 100);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00226");
        int[] intArray6 = new int[] { 1, (byte) 10, (byte) -1, (short) -1, (byte) 0, (byte) 0 };
        int[] intArray13 = new int[] { 10, ' ', (byte) -1, ' ', '#', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) ' ', (int) (short) 0);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00227");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) -1, (short) 0, (short) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 0, (int) (byte) 0);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00228");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray3 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) '4', (int) (short) 10);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00229");
        int[] intArray4 = new int[] { (byte) 0, '#', (byte) -1, (short) 100 };
        int[] intArray7 = new int[] { '4', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) 100, 0);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00230");
        int[] intArray5 = new int[] { (byte) -1, ' ', 100, (short) -1, (-1) };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 0, 0);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00231");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) 1, 10, ' ', 0, 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) 1, 0);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00232");
        int[] intArray5 = new int[] { 10, (short) 1, (byte) 1, (-1), (byte) 1 };
        int[] intArray9 = new int[] { 0, '#', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (byte) 10, 100);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00233");
        int[] intArray2 = new int[] { (byte) 10, (byte) 10 };
        int[] intArray7 = new int[] { '#', (short) 10, (short) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 0, (int) 'a');
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00234");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (byte) 0, (int) (short) 100);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00235");
        int[] intArray6 = new int[] { '4', 0, (short) 1, (short) 10, 0, (short) -1 };
        int[] intArray13 = new int[] { ' ', (short) -1, (byte) 100, '4', 'a', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 10, 0);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00236");
        int[] intArray1 = new int[] { 100 };
        int[] intArray6 = new int[] { (byte) 100, 1, (short) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) 'a', (int) '#');
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00237");
        int[] intArray4 = new int[] { '#', (byte) 0, (short) 0, 'a' };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (short) 10, (int) 'a');
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00238");
        int[] intArray6 = new int[] { 'a', (byte) 1, (byte) 10, '#', (byte) 0, ' ' };
        int[] intArray8 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) '#', (int) (short) 1);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00239");
        int[] intArray2 = new int[] { '4', 'a' };
        int[] intArray8 = new int[] { 10, (short) 100, '#', ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 1, (int) (short) 10);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00240");
        int[] intArray5 = new int[] { 0, (byte) 0, '4', (short) 0, '4' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) '4', (int) (short) 1);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00241");
        int[] intArray4 = new int[] { 10, 0, ' ', (byte) -1 };
        int[] intArray7 = new int[] { (byte) 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) 10, 1);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00242");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 1, (int) ' ');
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00243");
        int[] intArray2 = new int[] { (byte) 10, 10 };
        int[] intArray6 = new int[] { (short) 1, (-1), (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) '#', (int) (short) 100);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00244");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray7 = new int[] { (byte) -1, 1, (byte) 0, (short) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) ' ', (int) (short) 0);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00245");
        int[] intArray2 = new int[] { (short) 10, (byte) 100 };
        int[] intArray6 = new int[] { (byte) 0, (byte) 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) 'a', 0);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00246");
        int[] intArray4 = new int[] { 'a', 10, 100, (short) 10 };
        int[] intArray6 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (-1), (int) ' ');
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00247");
        int[] intArray4 = new int[] { (short) 100, (byte) 1, 10, (byte) 1 };
        int[] intArray10 = new int[] { (byte) 0, (byte) 10, ' ', (short) 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, 100, 10);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00248");
        int[] intArray5 = new int[] { ' ', (short) 10, (byte) 100, 'a', (byte) -1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 100, (int) (byte) -1);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00249");
        int[] intArray4 = new int[] { 10, 10, (-1), (short) 0 };
        int[] intArray7 = new int[] { (short) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) '#', (int) '#');
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00250");
        int[] intArray4 = new int[] { 10, 10, 0, '#' };
        int[] intArray11 = new int[] { 0, 10, (short) 10, (short) 1, (short) -1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, 0, (int) (short) -1);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00251");
        int[] intArray5 = new int[] { '4', (-1), '#', 1, '4' };
        int[] intArray12 = new int[] { '4', (byte) 10, '#', ' ', (short) 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, 0, 0);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00252");
        int[] intArray2 = new int[] { '4', 0 };
        int[] intArray6 = new int[] { 0, '4', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) 1, (int) (short) 10);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00253");
        int[] intArray6 = new int[] { (byte) 1, '4', 1, (short) 100, (byte) 10, 10 };
        int[] intArray12 = new int[] { '#', (short) 0, (short) -1, (short) 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00254");
        int[] intArray6 = new int[] { '4', '#', (byte) 100, '#', 0, 10 };
        int[] intArray10 = new int[] { (byte) 1, (-1), 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) '#', 10);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00255");
        int[] intArray2 = new int[] { (byte) -1, '4' };
        int[] intArray8 = new int[] { (short) 1, '#', (short) 0, 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) '#', (int) (byte) 10);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00256");
        int[] intArray5 = new int[] { (byte) -1, '#', (short) 100, (short) 10, (short) 10 };
        int[] intArray7 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) 'a', (int) ' ');
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00257");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (short) 100, 1);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00258");
        int[] intArray6 = new int[] { (short) 100, '4', (-1), 100, (byte) 1, (short) 100 };
        int[] intArray13 = new int[] { (byte) 10, (byte) 10, (short) -1, 'a', (short) 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (byte) 10, 100);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00259");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, 100, 100);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00260");
        int[] intArray3 = new int[] { (byte) 10, (byte) 1, (short) 1 };
        int[] intArray10 = new int[] { (short) 10, 100, (short) 10, 0, (short) 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 0, (int) '#');
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00261");
        int[] intArray2 = new int[] { '4', 100 };
        int[] intArray4 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (short) 0, 10);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00262");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, 0, (int) '4');
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00263");
        int[] intArray4 = new int[] { 1, '4', (byte) 100, (short) -1 };
        int[] intArray9 = new int[] { 100, 'a', 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) ' ', (int) (short) 0);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00264");
        int[] intArray2 = new int[] { '4', 100 };
        int[] intArray7 = new int[] { ' ', (-1), (short) 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 10, (int) (byte) 10);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00265");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray3 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) 'a', 10);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00266");
        int[] intArray2 = new int[] { 'a', (short) 100 };
        int[] intArray4 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 10, (int) (short) 1);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00267");
        int[] intArray2 = new int[] { '#', ' ' };
        int[] intArray7 = new int[] { (byte) 1, (short) 100, (-1), (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00268");
        int[] intArray2 = new int[] { (byte) 10, (short) 10 };
        int[] intArray7 = new int[] { (byte) 100, (byte) 0, (short) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 1, (int) (short) -1);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00269");
        int[] intArray6 = new int[] { (short) 1, 10, (byte) -1, '#', 0, (short) 100 };
        int[] intArray9 = new int[] { (byte) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 100, (int) (byte) 1);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00270");
        int[] intArray2 = new int[] { (short) 10, (short) -1 };
        int[] intArray9 = new int[] { 0, (byte) 100, ' ', (short) 0, (short) 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) 'a', (int) (short) 1);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00271");
        int[] intArray4 = new int[] { 'a', '#', (short) 10, (short) 100 };
        int[] intArray10 = new int[] { 0, 10, ' ', (short) -1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (-1), (int) (byte) -1);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00272");
        int[] intArray6 = new int[] { (short) 100, 'a', 100, ' ', (short) 10, (short) 10 };
        int[] intArray11 = new int[] { 100, (short) 1, (-1), (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (short) 10, 10);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00273");
        int[] intArray6 = new int[] { 100, ' ', (-1), ' ', '#', 10 };
        int[] intArray11 = new int[] { (short) 10, 100, (byte) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) '4', (int) (short) 100);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00274");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray4 = new int[] { '4', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (short) 0, 0);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00275");
        int[] intArray4 = new int[] { (byte) 1, (short) 0, (byte) 10, (byte) 1 };
        int[] intArray8 = new int[] { (byte) -1, (short) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) -1, (int) (short) 10);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00276");
        int[] intArray4 = new int[] { 10, (short) 0, 100, 100 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) '4', 10);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00277");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 0, (int) (short) -1);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00278");
        int[] intArray2 = new int[] { 1, 10 };
        int[] intArray6 = new int[] { '#', 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 0, (int) (byte) 100);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00279");
        int[] intArray6 = new int[] { 10, 0, 'a', (byte) -1, (byte) -1, '#' };
        int[] intArray12 = new int[] { (short) 1, 100, (byte) 100, '4', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) 1, 100);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00280");
        int[] intArray4 = new int[] { (byte) -1, ' ', (byte) 10, (short) 10 };
        int[] intArray10 = new int[] { (short) 10, ' ', 0, (short) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, 1, (int) '4');
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00281");
        int[] intArray4 = new int[] { '4', (short) 10, 0, (byte) 100 };
        int[] intArray9 = new int[] { 1, (byte) 1, (byte) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 0, (int) (short) 10);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00282");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) 100, 10);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00283");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 'a', (byte) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) 1, (int) ' ');
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00284");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, '4', (byte) 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) -1, 0);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00285");
        int[] intArray5 = new int[] { (byte) 1, (short) 0, ' ', (byte) 100, (short) 10 };
        int[] intArray12 = new int[] { 'a', (byte) 1, '#', (short) 10, (short) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (byte) -1, (int) (short) 10);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00286");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray5 = new int[] { 10, '#', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00287");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray7 = new int[] { 'a', 1, (byte) 0, (short) 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) 1, (int) (byte) 1);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00288");
        int[] intArray3 = new int[] { (short) -1, 10, (byte) 10 };
        int[] intArray6 = new int[] { '#', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) -1, (int) 'a');
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00289");
        int[] intArray6 = new int[] { (short) 1, (-1), (byte) 10, (byte) 100, 0, '#' };
        int[] intArray8 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 0, (int) (short) 10);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00290");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) '4', 100);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00291");
        int[] intArray3 = new int[] { (short) 1, (short) 100, 0 };
        int[] intArray7 = new int[] { (byte) 0, (short) 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) '#', (int) (short) 0);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00292");
        int[] intArray5 = new int[] { (byte) 0, 10, (-1), (short) 10, (-1) };
        int[] intArray8 = new int[] { (short) 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 10, (-1));
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00293");
        int[] intArray4 = new int[] { (byte) 1, (short) 100, 10, (short) -1 };
        int[] intArray9 = new int[] { (short) 1, 0, (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 0, 0);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00294");
        int[] intArray6 = new int[] { 0, (short) 100, (byte) 10, (byte) -1, ' ', (-1) };
        int[] intArray11 = new int[] { 0, (short) 1, (short) 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) 'a', (-1));
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00295");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 100, (short) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) 0, (int) (byte) 1);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00296");
        int[] intArray2 = new int[] { 'a', 10 };
        int[] intArray7 = new int[] { 0, '4', 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) 'a', (int) '4');
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00297");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (-1), 100, 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 1, 100);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00298");
        int[] intArray4 = new int[] { (byte) 0, (byte) 0, (-1), 0 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, 0, 0);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00299");
        int[] intArray5 = new int[] { 10, ' ', (byte) -1, 100, (byte) 1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 100, (int) '#');
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00300");
        int[] intArray6 = new int[] { (short) 10, (byte) 100, (byte) 0, (short) 0, (short) 10, '4' };
        int[] intArray13 = new int[] { (byte) -1, (short) 10, (byte) 100, '4', (short) 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 1, (int) (short) 0);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00301");
        int[] intArray6 = new int[] { (byte) 1, (byte) 0, 0, (byte) -1, (short) 0, (-1) };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) 1, (int) (short) 0);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00302");
        int[] intArray4 = new int[] { (short) 0, (short) 1, 100, (byte) 0 };
        int[] intArray8 = new int[] { (byte) 1, (short) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 100, (int) '#');
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00303");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray7 = new int[] { (-1), 100, (short) 100, (short) 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) 10, 0);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00304");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 100, 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) 0, (int) (byte) -1);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00305");
        int[] intArray3 = new int[] { 100, '4', '#' };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, 100, 0);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00306");
        int[] intArray2 = new int[] { (short) -1, (byte) 1 };
        int[] intArray5 = new int[] { ' ', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 0, (int) (byte) -1);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00307");
        int[] intArray4 = new int[] { (byte) 1, (short) 1, (short) -1, 1 };
        int[] intArray10 = new int[] { (byte) 100, (short) -1, (short) 1, (short) 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (byte) 100, (int) (byte) -1);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00308");
        int[] intArray3 = new int[] { (short) 100, 10, (short) 100 };
        int[] intArray5 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) 10, (int) (short) 1);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00309");
        int[] intArray6 = new int[] { (byte) 0, (byte) 0, (short) 10, (short) 0, '4', 10 };
        int[] intArray9 = new int[] { 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 100, (int) '#');
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00310");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 0, (int) (byte) 10);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00311");
        int[] intArray5 = new int[] { 100, (byte) -1, (byte) 10, (byte) -1, '4' };
        int[] intArray7 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (short) 100, (int) ' ');
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00312");
        int[] intArray4 = new int[] { (byte) 1, 0, 1, (short) -1 };
        int[] intArray6 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, 100, (int) (byte) 0);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00313");
        int[] intArray3 = new int[] { (byte) 0, '4', 'a' };
        int[] intArray6 = new int[] { 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) 0, 10);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00314");
        int[] intArray2 = new int[] { '#', 0 };
        int[] intArray4 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 0, 100);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00315");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 0, 0);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00316");
        int[] intArray5 = new int[] { (byte) 10, (byte) -1, (byte) 100, (short) 100, (short) -1 };
        int[] intArray8 = new int[] { (short) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) 100, (int) (byte) 1);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00317");
        int[] intArray3 = new int[] { ' ', '#', (byte) 10 };
        int[] intArray5 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) 10, (int) (short) -1);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00318");
        int[] intArray3 = new int[] { (byte) 1, (short) 100, (short) 1 };
        int[] intArray10 = new int[] { 'a', 'a', (byte) -1, (byte) 10, (short) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 1, (int) (byte) 0);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00319");
        int[] intArray6 = new int[] { '4', (byte) 10, (byte) 10, (-1), 10, (-1) };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) 1, 0);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00320");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray6 = new int[] { (byte) -1, ' ', ' ', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) 'a', 10);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00321");
        int[] intArray6 = new int[] { (short) 1, (byte) 10, (byte) 100, (short) 10, '4', (byte) 100 };
        int[] intArray11 = new int[] { (short) -1, (short) 100, 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) '#', 1);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00322");
        int[] intArray4 = new int[] { (byte) 10, (short) -1, 'a', (short) 100 };
        int[] intArray9 = new int[] { (byte) 10, (byte) -1, (short) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 0, (int) (byte) -1);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00323");
        int[] intArray2 = new int[] { (short) 0, (short) 0 };
        int[] intArray6 = new int[] { '4', 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (short) -1, 10);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00324");
        int[] intArray4 = new int[] { (byte) 0, 'a', 'a', 'a' };
        int[] intArray10 = new int[] { 'a', 0, 100, 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (byte) 0, (int) (short) 100);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00325");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray5 = new int[] { (-1), (short) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) '4', (int) (short) 10);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00326");
        int[] intArray5 = new int[] { (byte) 1, '4', (byte) 10, (short) 1, 100 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 0, (int) (short) 1);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00327");
        int[] intArray3 = new int[] { (short) 10, '4', (byte) 10 };
        int[] intArray10 = new int[] { (short) 0, (short) 10, '#', 1, 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 1, 10);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00328");
        int[] intArray3 = new int[] { (short) 1, (short) 10, 10 };
        int[] intArray8 = new int[] { (byte) 100, (short) 10, (byte) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) 'a', (int) ' ');
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00329");
        int[] intArray4 = new int[] { (-1), 'a', (byte) 1, (short) -1 };
        int[] intArray6 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) '#', 0);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00330");
        int[] intArray5 = new int[] { (short) 0, 1, 1, 10, 'a' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) '#', (int) '4');
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00331");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (-1), (byte) 1, '#', 'a', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) 'a', 100);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00332");
        int[] intArray2 = new int[] { 1, 10 };
        int[] intArray7 = new int[] { (byte) 0, (short) 0, (-1), (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (short) 1, (int) (short) 10);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00333");
        int[] intArray5 = new int[] { (short) -1, 100, '#', 1, 0 };
        int[] intArray7 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (short) 0, (int) (byte) 100);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00334");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) 100, (short) 1, (short) -1, 0, (byte) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) '4', 0);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00335");
        int[] intArray6 = new int[] { (byte) 1, (short) -1, (byte) -1, (-1), (short) -1, '4' };
        int[] intArray8 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) '#', (int) (byte) 0);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00336");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray6 = new int[] { (-1), (short) 0, 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (byte) 1, (int) '#');
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00337");
        int[] intArray5 = new int[] { '4', 10, '#', (short) -1, (short) 0 };
        int[] intArray8 = new int[] { '#', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) 0, (int) '4');
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00338");
        int[] intArray4 = new int[] { '4', (short) 1, (-1), 100 };
        int[] intArray9 = new int[] { (short) 100, (byte) 100, 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) 'a', (int) (short) 100);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00339");
        int[] intArray5 = new int[] { 100, 'a', (short) 1, (byte) -1, ' ' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) 1, 0);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00340");
        int[] intArray1 = new int[] { 100 };
        int[] intArray6 = new int[] { (byte) 1, 10, (short) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 0, (int) ' ');
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00341");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (-1), (byte) -1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, 10, (int) 'a');
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00342");
        int[] intArray4 = new int[] { (short) 10, 0, (byte) 100, (byte) 100 };
        int[] intArray10 = new int[] { (short) 100, (short) 0, (byte) 0, '#', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) '#', 0);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00343");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray7 = new int[] { (short) 1, 10, 'a', 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00344");
        int[] intArray6 = new int[] { (-1), (byte) 100, 10, '#', (byte) 100, (byte) 0 };
        int[] intArray12 = new int[] { (-1), (byte) -1, (byte) 100, (byte) 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 0, (int) (short) 100);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00345");
        int[] intArray4 = new int[] { (short) 100, '#', (byte) 10, 1 };
        int[] intArray7 = new int[] { (short) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) -1, (int) (byte) 0);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00346");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { '4', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) ' ', (int) (byte) 0);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00347");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { '4', (byte) 100, '#', (byte) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) -1, (int) 'a');
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00348");
        int[] intArray5 = new int[] { (short) 10, 100, (byte) 10, (byte) 0, ' ' };
        int[] intArray12 = new int[] { (byte) 100, 'a', (byte) -1, (byte) 10, 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) 'a', (int) 'a');
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00349");
        int[] intArray5 = new int[] { (-1), (short) -1, 100, 100, (short) 10 };
        int[] intArray11 = new int[] { 0, (byte) 10, (short) 0, 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) 0, (-1));
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00350");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (byte) -1, (byte) 10, (short) 0, (byte) 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) 'a', (int) (byte) -1);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00351");
        int[] intArray6 = new int[] { (byte) 0, (short) 10, '#', (byte) 0, (-1), 0 };
        int[] intArray11 = new int[] { 0, (byte) -1, '#', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 0, 0);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00352");
        int[] intArray5 = new int[] { 0, (byte) 100, 100, 1, 10 };
        int[] intArray9 = new int[] { (short) 0, (-1), (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) 'a', (int) (byte) 1);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00353");
        int[] intArray6 = new int[] { (short) 0, (byte) 100, (short) 100, 100, (short) -1, (short) 0 };
        int[] intArray10 = new int[] { 0, (short) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) 10, (-1));
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00354");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) -1, 1, 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) 100, 1);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00355");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray8 = new int[] { 100, '4', (short) -1, (short) 10, 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00356");
        int[] intArray3 = new int[] { '#', (short) -1, (short) 100 };
        int[] intArray7 = new int[] { 'a', (-1), (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 0, (-1));
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00357");
        int[] intArray2 = new int[] { '#', 0 };
        int[] intArray5 = new int[] { (short) 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) -1, (int) (byte) 0);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00358");
        int[] intArray5 = new int[] { '#', '#', (-1), '4', 100 };
        int[] intArray11 = new int[] { 10, (byte) 1, ' ', (short) 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) 0, (int) '#');
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00359");
        int[] intArray3 = new int[] { ' ', (short) 100, (short) 0 };
        int[] intArray8 = new int[] { (short) 0, '#', 'a', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 100, (int) (byte) 1);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00360");
        int[] intArray5 = new int[] { 10, (byte) 0, (byte) 100, ' ', (byte) 1 };
        int[] intArray12 = new int[] { (short) 10, (short) 10, (byte) 100, (byte) 0, 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (byte) 10, (int) ' ');
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00361");
        int[] intArray3 = new int[] { (byte) -1, (byte) -1, (short) -1 };
        int[] intArray9 = new int[] { (byte) -1, 0, 0, '#', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (short) 0, 0);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00362");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { '#', 1, (byte) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00363");
        int[] intArray5 = new int[] { (short) 10, 10, '#', 0, 10 };
        int[] intArray8 = new int[] { (byte) 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00364");
        int[] intArray4 = new int[] { (short) 0, (short) 10, (byte) -1, (byte) -1 };
        int[] intArray11 = new int[] { (byte) -1, (-1), 'a', (byte) -1, (byte) 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) '#', 0);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00365");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 'a', 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, 100, (-1));
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00366");
        int[] intArray5 = new int[] { 1, 100, (short) 0, (short) 10, (byte) -1 };
        int[] intArray11 = new int[] { (byte) -1, (short) 0, '#', (short) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 10, (int) (byte) 100);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00367");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) ' ', 0);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00368");
        int[] intArray5 = new int[] { (-1), (short) 0, (short) 0, (byte) 100, (byte) 1 };
        int[] intArray11 = new int[] { 'a', (byte) 1, 100, ' ', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 0, (int) (byte) 100);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00369");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (short) 100, 0);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00370");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray6 = new int[] { (-1), 1, ' ', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (-1), 100);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00371");
        int[] intArray5 = new int[] { (byte) 100, 10, (byte) -1, '#', 10 };
        int[] intArray11 = new int[] { (byte) 0, '#', 'a', (byte) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) '#', (int) '#');
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00372");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 10, (byte) 0, 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) '#', 100);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00373");
        int[] intArray6 = new int[] { '4', (byte) -1, 0, (byte) 10, (short) 0, (byte) 1 };
        int[] intArray8 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) ' ', (int) ' ');
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00374");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) -1, '4', '4', 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, 0, (int) 'a');
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00375");
        int[] intArray3 = new int[] { '#', 10, (byte) -1 };
        int[] intArray6 = new int[] { (byte) 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) 0, (int) (byte) 1);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00376");
        int[] intArray6 = new int[] { (byte) -1, ' ', (short) 10, (byte) 100, (short) 10, (short) -1 };
        int[] intArray8 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 100, (int) '#');
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00377");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) 100, (-1), (-1), (short) 10, (short) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) -1, 100);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00378");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (-1), (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) 100, (int) (short) 10);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00379");
        int[] intArray2 = new int[] { (byte) -1, (-1) };
        int[] intArray8 = new int[] { 0, (-1), (byte) 0, 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) '4', (int) (short) 0);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00380");
        int[] intArray3 = new int[] { (byte) 10, '4', (byte) 10 };
        int[] intArray9 = new int[] { (byte) 10, (short) -1, (short) 0, ' ', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 100, 10);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00381");
        int[] intArray3 = new int[] { (-1), 10, 10 };
        int[] intArray8 = new int[] { (short) 1, (short) 10, (byte) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00382");
        int[] intArray6 = new int[] { (short) -1, (short) 100, 'a', 'a', (byte) 0, ' ' };
        int[] intArray10 = new int[] { 'a', ' ', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) 1, 100);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00383");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, 100, 0);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00384");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray5 = new int[] { '4', '4', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) 1, (int) (byte) 0);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00385");
        int[] intArray1 = new int[] { 1 };
        int[] intArray8 = new int[] { (short) 1, (byte) 1, 10, '4', (short) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) 100, 0);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00386");
        int[] intArray2 = new int[] { (byte) 0, (byte) -1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (byte) -1, 0);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00387");
        int[] intArray3 = new int[] { (byte) -1, (-1), '#' };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) '4', (int) 'a');
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00388");
        int[] intArray3 = new int[] { (byte) 0, (short) 100, (byte) 100 };
        int[] intArray7 = new int[] { (short) 100, ' ', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) 10, 10);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00389");
        int[] intArray6 = new int[] { 'a', (-1), ' ', ' ', (byte) -1, 10 };
        int[] intArray11 = new int[] { (byte) 100, 'a', 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (short) 100, (int) (short) 1);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00390");
        int[] intArray6 = new int[] { (short) 0, '#', '4', (byte) 10, 0, (byte) 100 };
        int[] intArray11 = new int[] { 100, (short) -1, 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) '#', (int) (short) 1);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00391");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 1, (short) -1, 100, (byte) 0, (byte) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) ' ', (int) '#');
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00392");
        int[] intArray2 = new int[] { (byte) 0, (short) 1 };
        int[] intArray4 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 10, (int) '#');
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00393");
        int[] intArray5 = new int[] { (short) 1, 100, (short) -1, (short) 100, (short) 100 };
        int[] intArray11 = new int[] { (byte) -1, (short) 100, (byte) 10, 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 100, (int) (byte) 1);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00394");
        int[] intArray2 = new int[] { (byte) 1, (byte) 100 };
        int[] intArray4 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (byte) 1, (int) ' ');
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00395");
        int[] intArray2 = new int[] { (byte) -1, (byte) 1 };
        int[] intArray8 = new int[] { 0, (byte) 0, '4', (short) 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 0, (int) '4');
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00396");
        int[] intArray2 = new int[] { 10, ' ' };
        int[] intArray5 = new int[] { (-1), (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 1, (-1));
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00397");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray3 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (byte) 100, (int) 'a');
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00398");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) '4', (int) (byte) 100);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00399");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (byte) -1, (int) ' ');
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00400");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (-1), (byte) 1, (short) 10, (-1), (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) 100, (int) '#');
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00401");
        int[] intArray4 = new int[] { (byte) 10, (-1), (byte) -1, 0 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (short) -1, (int) (short) 1);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00402");
        int[] intArray6 = new int[] { '#', (-1), (-1), (byte) 1, (byte) -1, (short) 0 };
        int[] intArray11 = new int[] { 0, (byte) -1, 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (-1), (int) (short) 1);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00403");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00404");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray7 = new int[] { 10, (byte) 0, (short) 0, '#', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) 10, (int) 'a');
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00405");
        int[] intArray4 = new int[] { (short) -1, (short) -1, 0, '4' };
        int[] intArray6 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) '4', (int) (byte) 0);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00406");
        int[] intArray2 = new int[] { 0, (short) 0 };
        int[] intArray8 = new int[] { (short) 1, '4', '#', 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) '4', 10);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00407");
        int[] intArray5 = new int[] { 'a', '4', (short) -1, 0, '4' };
        int[] intArray7 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, 0, (int) (short) 10);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00408");
        int[] intArray2 = new int[] { (-1), '#' };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 0, (int) (byte) 1);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00409");
        int[] intArray5 = new int[] { (-1), (byte) 10, (short) 1, (short) 100, 100 };
        int[] intArray7 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) ' ', (int) (short) -1);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00410");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray8 = new int[] { (byte) 100, (short) 10, '4', (short) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) 1, 10);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00411");
        int[] intArray4 = new int[] { (byte) 1, (byte) 10, (byte) -1, '4' };
        int[] intArray6 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) -1, (int) (short) -1);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00412");
        int[] intArray2 = new int[] { (byte) 100, (short) 100 };
        int[] intArray4 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 100, (-1));
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00413");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray7 = new int[] { 100, (short) 100, 10, (short) 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) 100, (int) (short) 100);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00414");
        int[] intArray5 = new int[] { '#', (byte) 1, (byte) 0, '#', 10 };
        int[] intArray10 = new int[] { '4', 1, (short) 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (byte) -1, (int) (byte) 0);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00415");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) 1, (int) '4');
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00416");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) -1, 1, (short) 100, (short) -1, 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) ' ', (int) (byte) -1);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00417");
        int[] intArray1 = new int[] { 100 };
        int[] intArray6 = new int[] { 1, (short) 100, (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) ' ', (-1));
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00418");
        int[] intArray3 = new int[] { (byte) -1, (short) 10, (short) 0 };
        int[] intArray6 = new int[] { 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) -1, (int) (byte) 1);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00419");
        int[] intArray5 = new int[] { '#', '4', 'a', (short) -1, 'a' };
        int[] intArray8 = new int[] { (short) 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) 10, (int) (byte) 0);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00420");
        int[] intArray3 = new int[] { 100, (short) 100, (short) 1 };
        int[] intArray7 = new int[] { (byte) 1, (short) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) 'a', (int) (short) 100);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00421");
        int[] intArray5 = new int[] { ' ', '#', 1, (byte) 0, 1 };
        int[] intArray12 = new int[] { (short) 1, (short) 0, ' ', (byte) 0, (byte) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) ' ', 10);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00422");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray7 = new int[] { 100, (short) 100, (short) 1, (-1), '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) 10, (int) (byte) 0);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00423");
        int[] intArray2 = new int[] { (short) -1, (byte) 100 };
        int[] intArray7 = new int[] { (short) 0, '4', (byte) 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) -1, 100);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00424");
        int[] intArray2 = new int[] { (-1), (byte) 10 };
        int[] intArray6 = new int[] { (byte) 1, (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (-1), 0);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00425");
        int[] intArray2 = new int[] { 1, (byte) 0 };
        int[] intArray5 = new int[] { (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) '4', 0);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00426");
        int[] intArray5 = new int[] { (short) 0, (short) 1, ' ', (byte) 100, 'a' };
        int[] intArray7 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, 1, (int) (byte) 1);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00427");
        int[] intArray3 = new int[] { 'a', (byte) 1, (byte) 1 };
        int[] intArray9 = new int[] { (byte) 10, (byte) 10, (byte) 0, 'a', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (short) 10, 1);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00428");
        int[] intArray2 = new int[] { (byte) 10, (short) -1 };
        int[] intArray8 = new int[] { (-1), (short) 100, ' ', '#', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) 10, (int) (short) 10);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00429");
        int[] intArray4 = new int[] { 0, ' ', '#', (short) 1 };
        int[] intArray8 = new int[] { (short) 10, '4', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) 100, 0);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00430");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray6 = new int[] { (short) -1, ' ', 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 100, (-1));
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00431");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 'a', (byte) 1, ' ', ' ', 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) 1, (-1));
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00432");
        int[] intArray5 = new int[] { (byte) 1, '4', (short) 10, 0, (-1) };
        int[] intArray11 = new int[] { 10, (byte) 0, '4', (byte) 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) 1, (int) (byte) 1);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00433");
        int[] intArray2 = new int[] { (byte) 0, (byte) 1 };
        int[] intArray8 = new int[] { 100, (short) 100, 'a', (short) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) ' ', (int) (short) 1);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00434");
        int[] intArray6 = new int[] { 'a', '4', '#', 100, 10, (byte) -1 };
        int[] intArray10 = new int[] { 0, ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (short) 10, 10);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00435");
        int[] intArray5 = new int[] { 100, (short) 100, '#', ' ', (short) 1 };
        int[] intArray10 = new int[] { 0, (short) 0, '4', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (byte) 10, (int) (short) 1);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00436");
        int[] intArray5 = new int[] { (byte) 100, 0, '#', (byte) 0, (short) -1 };
        int[] intArray7 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, 0, (int) '4');
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00437");
        int[] intArray6 = new int[] { 'a', 'a', (short) 0, 1, (short) 1, (byte) -1 };
        int[] intArray9 = new int[] { (byte) 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 100, (-1));
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00438");
        int[] intArray5 = new int[] { (byte) 0, (short) 0, 'a', (byte) -1, 1 };
        int[] intArray11 = new int[] { 1, ' ', (-1), (short) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 100, 10);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00439");
        int[] intArray4 = new int[] { 10, (byte) 100, '#', (-1) };
        int[] intArray11 = new int[] { (-1), (byte) 100, (byte) 10, (-1), (byte) 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) 'a', 100);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00440");
        int[] intArray5 = new int[] { (short) -1, (short) 0, (byte) 100, 0, 'a' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 10, 0);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00441");
        int[] intArray5 = new int[] { ' ', (byte) 100, '#', 0, 1 };
        int[] intArray11 = new int[] { 'a', (short) 10, (byte) -1, 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 1, 0);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00442");
        int[] intArray2 = new int[] { 100, '#' };
        int[] intArray9 = new int[] { (short) 0, ' ', 0, (byte) -1, 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 100, (int) (short) -1);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00443");
        int[] intArray5 = new int[] { (short) 10, (short) -1, 'a', (short) 1, (byte) 10 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 0, (-1));
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00444");
        int[] intArray4 = new int[] { (short) 0, 0, 0, (short) 0 };
        int[] intArray7 = new int[] { (short) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) 10, (int) (short) 0);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00445");
        int[] intArray4 = new int[] { 1, (short) 100, 100, (short) 10 };
        int[] intArray11 = new int[] { 100, (-1), (short) 0, (byte) 1, (short) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) 10, (int) (short) 10);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00446");
        int[] intArray6 = new int[] { (short) -1, (short) 0, (byte) 1, 1, (short) -1, (-1) };
        int[] intArray11 = new int[] { 0, 1, (short) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) 'a', (int) (byte) -1);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00447");
        int[] intArray5 = new int[] { (byte) 1, (byte) 1, (byte) -1, '#', 100 };
        int[] intArray9 = new int[] { 0, (byte) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) 'a', (int) (short) -1);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00448");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 1, (byte) -1, (byte) -1, (byte) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) -1, (int) (byte) 0);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00449");
        int[] intArray1 = new int[] { 100 };
        int[] intArray6 = new int[] { 100, (short) 100, (short) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (byte) 10, (int) ' ');
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00450");
        int[] intArray3 = new int[] { (short) 0, (byte) 1, (-1) };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (byte) 10, (int) ' ');
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00451");
        int[] intArray3 = new int[] { (short) -1, (short) 1, (short) -1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, 10, (int) (short) -1);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00452");
        int[] intArray6 = new int[] { (short) 1, (byte) -1, '#', (short) 10, 100, (short) -1 };
        int[] intArray9 = new int[] { (byte) 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, 1, (int) (byte) 1);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00453");
        int[] intArray6 = new int[] { (-1), 1, (short) 10, (short) 100, 0, (short) -1 };
        int[] intArray11 = new int[] { 10, 'a', 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 0, (int) (short) -1);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00454");
        int[] intArray4 = new int[] { (byte) 1, 100, 0, (short) 1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, 1, (int) '4');
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00455");
        int[] intArray6 = new int[] { (byte) 1, (byte) 0, (short) 10, ' ', 'a', (short) 100 };
        int[] intArray10 = new int[] { (byte) 1, (short) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 10, (int) (short) 10);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00456");
        int[] intArray2 = new int[] { (short) 100, (byte) -1 };
        int[] intArray9 = new int[] { '#', (byte) 10, (short) 1, (short) -1, (short) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) ' ', (int) (short) 100);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00457");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) 'a', 100);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00458");
        int[] intArray2 = new int[] { 0, (byte) 1 };
        int[] intArray6 = new int[] { (short) 100, (byte) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (short) 100, 10);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00459");
        int[] intArray2 = new int[] { (byte) -1, (short) 1 };
        int[] intArray8 = new int[] { ' ', 'a', (byte) 0, (short) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00460");
        int[] intArray6 = new int[] { (-1), (byte) 100, 10, (short) 100, '#', 'a' };
        int[] intArray13 = new int[] { 10, (short) 10, 'a', (byte) 10, 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (-1), (int) (byte) 10);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00461");
        int[] intArray2 = new int[] { (byte) 0, 1 };
        int[] intArray4 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 10, (int) (byte) 1);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00462");
        int[] intArray5 = new int[] { (byte) 10, (-1), (short) 100, 'a', (byte) -1 };
        int[] intArray9 = new int[] { (short) -1, (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 10, (int) (byte) 100);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00463");
        int[] intArray2 = new int[] { (byte) 1, (short) 100 };
        int[] intArray8 = new int[] { 0, 0, (short) -1, 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) '4', (int) (byte) 0);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00464");
        int[] intArray2 = new int[] { 1, (short) 1 };
        int[] intArray5 = new int[] { (byte) 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 10, 0);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00465");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) -1, (byte) 10, '4', 0, (byte) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) 10, 1);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00466");
        int[] intArray2 = new int[] { (byte) 100, (byte) 0 };
        int[] intArray7 = new int[] { (short) 10, (byte) 0, (short) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (-1), (int) (short) -1);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00467");
        int[] intArray1 = new int[] { 10 };
        int[] intArray4 = new int[] { 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) 'a', (int) (short) 10);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00468");
        int[] intArray6 = new int[] { (byte) 10, (-1), ' ', '4', 100, (byte) -1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) '4', (int) (byte) 1);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00469");
        int[] intArray4 = new int[] { 1, (byte) 10, '4', (-1) };
        int[] intArray8 = new int[] { (short) -1, (byte) 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 100, 100);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00470");
        int[] intArray2 = new int[] { (short) -1, 0 };
        int[] intArray4 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 10, (int) (byte) 0);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00471");
        int[] intArray5 = new int[] { (-1), 100, (short) -1, (byte) 100, 'a' };
        int[] intArray11 = new int[] { 100, (byte) -1, 0, 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 1, (int) (short) -1);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00472");
        int[] intArray6 = new int[] { (short) 0, (byte) 1, '4', (short) -1, (byte) 100, 10 };
        int[] intArray12 = new int[] { 10, '4', 'a', (short) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) 10, (int) (short) 1);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00473");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) 0, (short) 100, (byte) 100, (byte) 10, '#', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, 10, (-1));
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00474");
        int[] intArray6 = new int[] { '#', (-1), (-1), (-1), (byte) -1, 1 };
        int[] intArray8 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) '#', 0);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00475");
        int[] intArray3 = new int[] { 1, (short) 1, '#' };
        int[] intArray8 = new int[] { 'a', (byte) -1, 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (byte) -1, (int) ' ');
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00476");
        int[] intArray2 = new int[] { 100, (byte) 10 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (byte) 0, (int) 'a');
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00477");
        int[] intArray4 = new int[] { (short) 0, 'a', (short) 1, ' ' };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) '#', (int) ' ');
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00478");
        int[] intArray6 = new int[] { 1, 100, 100, (byte) -1, (-1), (byte) 1 };
        int[] intArray8 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 100, (int) (byte) 100);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00479");
        int[] intArray4 = new int[] { (byte) -1, (byte) 0, 0, (byte) 0 };
        int[] intArray10 = new int[] { 10, (short) 0, 10, '4', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) -1, 0);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00480");
        int[] intArray3 = new int[] { (byte) 0, 100, (byte) -1 };
        int[] intArray8 = new int[] { (-1), 0, (short) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 10, (int) '4');
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00481");
        int[] intArray4 = new int[] { 1, (-1), 100, 0 };
        int[] intArray6 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, 0, 0);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00482");
        int[] intArray1 = new int[] { 1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 1, (int) '#');
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00483");
        int[] intArray2 = new int[] { (-1), '4' };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) 10, (int) (short) 100);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00484");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 0, 'a', (byte) 1, (byte) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) 100, (int) (short) 10);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00485");
        int[] intArray5 = new int[] { (short) 1, '#', (short) 1, (byte) 10, 10 };
        int[] intArray9 = new int[] { (short) -1, 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 100, (int) '#');
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00486");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) '#', 0);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00487");
        int[] intArray2 = new int[] { (byte) 1, (short) 0 };
        int[] intArray4 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (byte) 10, (-1));
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00488");
        int[] intArray4 = new int[] { (short) 0, 1, 'a', '#' };
        int[] intArray6 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (-1), (int) (byte) 0);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00489");
        int[] intArray3 = new int[] { (short) 10, (byte) 0, (short) -1 };
        int[] intArray9 = new int[] { (byte) 0, 1, (short) 10, '#', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) ' ', 100);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00490");
        int[] intArray4 = new int[] { (short) -1, (byte) 1, 10, (byte) 0 };
        int[] intArray10 = new int[] { '4', (short) 10, (short) 100, (byte) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) 'a', 1);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00491");
        int[] intArray4 = new int[] { (short) -1, (byte) -1, 0, 10 };
        int[] intArray10 = new int[] { (byte) 10, (byte) 1, (short) 0, (byte) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) -1, (int) (byte) 0);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00492");
        int[] intArray4 = new int[] { (short) 1, 1, ' ', '#' };
        int[] intArray7 = new int[] { (byte) 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) 10, (int) ' ');
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00493");
        int[] intArray2 = new int[] { (short) 1, (short) 100 };
        int[] intArray9 = new int[] { (-1), (short) 0, (short) -1, 'a', ' ', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (short) -1, (-1));
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00494");
        int[] intArray2 = new int[] { (byte) 0, (byte) 1 };
        int[] intArray6 = new int[] { '4', (byte) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 0, (int) (byte) 100);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00495");
        int[] intArray3 = new int[] { (short) 1, 1, (short) 100 };
        int[] intArray7 = new int[] { ' ', (short) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) 100, (int) (byte) 1);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00496");
        int[] intArray2 = new int[] { 0, (short) 10 };
        int[] intArray8 = new int[] { (byte) 100, 100, (byte) 1, (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) 0, (int) ' ');
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00497");
        int[] intArray3 = new int[] { (byte) 1, (byte) -1, 0 };
        int[] intArray7 = new int[] { '#', (byte) 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) 1, (int) (short) 1);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00498");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { '4', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (byte) -1, 10);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00499");
        int[] intArray5 = new int[] { 0, 10, (byte) 1, 100, 1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test00500");
        int[] intArray6 = new int[] { 10, 100, (-1), (byte) 100, (byte) 10, (short) -1 };
        int[] intArray13 = new int[] { (short) -1, 0, (short) 10, 10, '#', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) ' ', (int) (short) 1);
    }
}

