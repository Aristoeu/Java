package KnapsackMemoization;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest10 {

    public static boolean debug = false;

    @Test
    public void test05001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05001");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 10, (-1));
    }

    @Test
    public void test05002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05002");
        int[] intArray4 = new int[] { 1, (short) -1, '#', (short) -1 };
        int[] intArray11 = new int[] { (short) -1, (short) -1, (byte) 10, 'a', (short) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) '4', (int) (short) -1);
    }

    @Test
    public void test05003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05003");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 0, (short) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) 0, 10);
    }

    @Test
    public void test05004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05004");
        int[] intArray6 = new int[] { 10, 100, 0, 0, 10, 100 };
        int[] intArray11 = new int[] { 10, '#', 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) '4', (int) (byte) 0);
    }

    @Test
    public void test05005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05005");
        int[] intArray3 = new int[] { (byte) 0, (short) 10, '#' };
        int[] intArray8 = new int[] { '4', (short) 1, (short) -1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (short) 10, (int) 'a');
    }

    @Test
    public void test05006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05006");
        int[] intArray5 = new int[] { (short) 0, '#', (short) -1, 1, 10 };
        int[] intArray12 = new int[] { 'a', (short) 10, (short) 1, (short) -1, '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (-1), (int) (byte) -1);
    }

    @Test
    public void test05007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05007");
        int[] intArray4 = new int[] { (short) 100, (short) 100, '4', (byte) -1 };
        int[] intArray10 = new int[] { (byte) 0, 100, 100, 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, 1, (int) (short) 100);
    }

    @Test
    public void test05008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05008");
        int[] intArray5 = new int[] { (byte) 100, (short) 10, ' ', (short) 10, (short) 1 };
        int[] intArray12 = new int[] { 100, (byte) 100, (byte) 0, '#', 'a', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, 1, 100);
    }

    @Test
    public void test05009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05009");
        int[] intArray4 = new int[] { (short) 0, (byte) 100, ' ', ' ' };
        int[] intArray9 = new int[] { (-1), (-1), (short) 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (byte) 0, (int) (byte) 10);
    }

    @Test
    public void test05010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05010");
        int[] intArray6 = new int[] { (byte) 10, (byte) -1, '4', 100, (short) 0, (byte) 0 };
        int[] intArray10 = new int[] { (byte) 1, (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) 'a', (int) (byte) 1);
    }

    @Test
    public void test05011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05011");
        int[] intArray3 = new int[] { (short) 0, 100, (byte) 10 };
        int[] intArray8 = new int[] { (short) 1, 10, (short) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (short) 1, (int) '#');
    }

    @Test
    public void test05012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05012");
        int[] intArray4 = new int[] { (-1), (short) -1, 1, (byte) 100 };
        int[] intArray9 = new int[] { '#', (short) 10, 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (byte) 10, (int) (byte) 0);
    }

    @Test
    public void test05013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05013");
        int[] intArray3 = new int[] { (short) -1, 'a', (short) 1 };
        int[] intArray10 = new int[] { '4', '#', (byte) 10, 100, 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 100, (int) (byte) 1);
    }

    @Test
    public void test05014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05014");
        int[] intArray5 = new int[] { '#', (-1), 'a', ' ', ' ' };
        int[] intArray9 = new int[] { (byte) 0, (byte) 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) 'a', (int) (short) 100);
    }

    @Test
    public void test05015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05015");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) 0, (short) -1, 10, (byte) -1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) '#', (int) '4');
    }

    @Test
    public void test05016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05016");
        int[] intArray4 = new int[] { 100, 100, (short) 100, (byte) 1 };
        int[] intArray8 = new int[] { 0, (short) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 100, (int) '4');
    }

    @Test
    public void test05017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05017");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray3 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) 'a', (int) (short) 10);
    }

    @Test
    public void test05018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05018");
        int[] intArray4 = new int[] { (byte) 10, 1, 1, (byte) 1 };
        int[] intArray11 = new int[] { (short) -1, (short) 1, (byte) 10, ' ', ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) 1, (int) (short) 0);
    }

    @Test
    public void test05019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05019");
        int[] intArray4 = new int[] { '#', ' ', 100, (short) 10 };
        int[] intArray11 = new int[] { ' ', (short) 1, 0, (byte) 1, 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (byte) 100, (int) (byte) -1);
    }

    @Test
    public void test05020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05020");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray5 = new int[] { 10, (byte) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) 0, 1);
    }

    @Test
    public void test05021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05021");
        int[] intArray3 = new int[] { (short) -1, 1, (short) 0 };
        int[] intArray9 = new int[] { 100, (-1), (byte) 10, (byte) 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 1, (-1));
    }

    @Test
    public void test05022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05022");
        int[] intArray6 = new int[] { '#', (byte) 10, '4', (byte) 0, 10, '4' };
        int[] intArray8 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 100, (int) (short) 100);
    }

    @Test
    public void test05023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05023");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { '#', (short) 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) -1, (int) ' ');
    }

    @Test
    public void test05024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05024");
        int[] intArray3 = new int[] { (-1), 'a', '#' };
        int[] intArray6 = new int[] { (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) 10, 10);
    }

    @Test
    public void test05025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05025");
        int[] intArray6 = new int[] { (short) 10, (short) 10, 0, (byte) -1, (byte) 1, (short) 1 };
        int[] intArray13 = new int[] { '4', (byte) -1, '4', (byte) 1, (short) 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 0, (int) (byte) 1);
    }

    @Test
    public void test05026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05026");
        int[] intArray1 = new int[] { '4' };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) -1, (int) (byte) -1);
    }

    @Test
    public void test05027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05027");
        int[] intArray3 = new int[] { 0, (byte) -1, (-1) };
        int[] intArray5 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, 100, (int) (short) 1);
    }

    @Test
    public void test05028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05028");
        int[] intArray4 = new int[] { 100, 100, (byte) -1, (byte) -1 };
        int[] intArray9 = new int[] { '4', 1, 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) 10, 0);
    }

    @Test
    public void test05029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05029");
        int[] intArray1 = new int[] { 10 };
        int[] intArray7 = new int[] { '4', '4', (short) 1, ' ', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) '#', (int) (short) 100);
    }

    @Test
    public void test05030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05030");
        int[] intArray2 = new int[] { 100, (byte) 10 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 1, (int) ' ');
    }

    @Test
    public void test05031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05031");
        int[] intArray6 = new int[] { ' ', (short) 0, ' ', '4', '#', '4' };
        int[] intArray12 = new int[] { (byte) 1, (byte) 100, '4', (short) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 1, (int) (short) 1);
    }

    @Test
    public void test05032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05032");
        int[] intArray6 = new int[] { '4', (short) 100, 10, 10, (byte) -1, '#' };
        int[] intArray13 = new int[] { (short) 1, (byte) 1, ' ', (byte) -1, '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 0, (int) (byte) 1);
    }

    @Test
    public void test05033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05033");
        int[] intArray2 = new int[] { (byte) 100, (short) 100 };
        int[] intArray8 = new int[] { 100, (-1), 10, 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 0, (int) (byte) 10);
    }

    @Test
    public void test05034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05034");
        int[] intArray1 = new int[] { '4' };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) '#', (int) (short) 10);
    }

    @Test
    public void test05035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05035");
        int[] intArray5 = new int[] { (byte) 100, 10, '4', 'a', 100 };
        int[] intArray10 = new int[] { (byte) -1, 10, (short) 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) ' ', 10);
    }

    @Test
    public void test05036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05036");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray5 = new int[] { (short) 100, (byte) 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) '#', (int) (byte) 1);
    }

    @Test
    public void test05037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05037");
        int[] intArray6 = new int[] { (byte) 10, 0, (short) 10, (byte) 100, 0, (byte) 0 };
        int[] intArray12 = new int[] { 'a', (short) 100, (byte) 10, 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) ' ', (int) (byte) 100);
    }

    @Test
    public void test05038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05038");
        int[] intArray4 = new int[] { (short) 0, (byte) 0, (byte) 100, (byte) 0 };
        int[] intArray11 = new int[] { 0, '#', (short) -1, (short) 100, (short) 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) 'a', (int) (short) 100);
    }

    @Test
    public void test05039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05039");
        int[] intArray3 = new int[] { (short) 100, '4', '#' };
        int[] intArray9 = new int[] { ' ', (byte) 1, '#', (short) 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (-1), (int) (short) 1);
    }

    @Test
    public void test05040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05040");
        int[] intArray5 = new int[] { (byte) 1, 'a', '4', 1, 10 };
        int[] intArray7 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, 0, 1);
    }

    @Test
    public void test05041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05041");
        int[] intArray5 = new int[] { (byte) 1, (short) 100, (byte) -1, (short) 100, 1 };
        int[] intArray12 = new int[] { (short) 100, 10, (short) 10, 100, (byte) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test05042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05042");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { '4', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 10, (int) (short) 0);
    }

    @Test
    public void test05043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05043");
        int[] intArray2 = new int[] { ' ', ' ' };
        int[] intArray4 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (byte) 10, (int) (byte) 100);
    }

    @Test
    public void test05044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05044");
        int[] intArray2 = new int[] { 0, '#' };
        int[] intArray9 = new int[] { (byte) 10, '4', (byte) 100, (byte) 100, (byte) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (byte) -1, (int) (short) 100);
    }

    @Test
    public void test05045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05045");
        int[] intArray4 = new int[] { ' ', (byte) 0, '#', ' ' };
        int[] intArray9 = new int[] { 'a', (short) 1, 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) 'a', 10);
    }

    @Test
    public void test05046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05046");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) 'a', (int) '4');
    }

    @Test
    public void test05047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05047");
        int[] intArray2 = new int[] { (short) 10, (byte) 100 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) 10, (int) ' ');
    }

    @Test
    public void test05048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05048");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray5 = new int[] { (short) 0, (short) 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) 'a', (int) (byte) 10);
    }

    @Test
    public void test05049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05049");
        int[] intArray4 = new int[] { 1, (short) 1, (-1), 10 };
        int[] intArray9 = new int[] { (short) 1, (byte) 100, (short) 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 0, (int) (byte) 1);
    }

    @Test
    public void test05050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05050");
        int[] intArray2 = new int[] { (short) 0, 0 };
        int[] intArray7 = new int[] { (short) 0, 1, 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 1, (int) (byte) -1);
    }

    @Test
    public void test05051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05051");
        int[] intArray3 = new int[] { (byte) 100, (byte) 1, (short) 1 };
        int[] intArray8 = new int[] { (byte) -1, 100, (short) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (byte) 0, 100);
    }

    @Test
    public void test05052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05052");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray8 = new int[] { 100, '4', (short) 1, 1, (byte) 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 100, (int) (byte) 0);
    }

    @Test
    public void test05053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05053");
        int[] intArray2 = new int[] { 1, 0 };
        int[] intArray6 = new int[] { 100, (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 100, (int) '4');
    }

    @Test
    public void test05054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05054");
        int[] intArray6 = new int[] { '4', '4', (byte) -1, (byte) 1, 'a', (short) 1 };
        int[] intArray10 = new int[] { ' ', (byte) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (short) 0, 0);
    }

    @Test
    public void test05055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05055");
        int[] intArray2 = new int[] { 1, ' ' };
        int[] intArray8 = new int[] { (short) 10, (byte) 1, (byte) 10, ' ', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (byte) 1, (int) '#');
    }

    @Test
    public void test05056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05056");
        int[] intArray6 = new int[] { (short) 10, (-1), (short) -1, 10, (short) 0, (-1) };
        int[] intArray10 = new int[] { '4', 'a', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 100, 10);
    }

    @Test
    public void test05057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05057");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) 10, (int) (byte) -1);
    }

    @Test
    public void test05058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05058");
        int[] intArray4 = new int[] { 10, 10, 1, (byte) 100 };
        int[] intArray10 = new int[] { 10, 10, (byte) 100, 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (byte) 100, (int) (short) 100);
    }

    @Test
    public void test05059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05059");
        int[] intArray6 = new int[] { ' ', 100, (short) 1, (byte) 1, (byte) 100, (short) 10 };
        int[] intArray12 = new int[] { (-1), (short) 100, 'a', '4', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (byte) -1, (int) 'a');
    }

    @Test
    public void test05060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05060");
        int[] intArray3 = new int[] { (short) 1, (short) -1, 10 };
        int[] intArray8 = new int[] { (-1), 10, (byte) 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (byte) 1, (int) (byte) 10);
    }

    @Test
    public void test05061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05061");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray6 = new int[] { 100, ' ', ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 100, (int) (short) 0);
    }

    @Test
    public void test05062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05062");
        int[] intArray3 = new int[] { (byte) 0, (byte) 10, (byte) 10 };
        int[] intArray9 = new int[] { (-1), 10, (byte) 0, 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 100, 1);
    }

    @Test
    public void test05063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05063");
        int[] intArray5 = new int[] { 1, 100, 100, (short) 100, (short) 100 };
        int[] intArray11 = new int[] { (short) 0, 0, (byte) 1, (short) 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) 'a', (-1));
    }

    @Test
    public void test05064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05064");
        int[] intArray6 = new int[] { (byte) 1, 1, ' ', (short) 10, (byte) 0, (short) 0 };
        int[] intArray10 = new int[] { (byte) 1, (short) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) 10, (int) (short) 100);
    }

    @Test
    public void test05065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05065");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray4 = new int[] { (short) 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (short) -1, (int) (short) 10);
    }

    @Test
    public void test05066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05066");
        int[] intArray2 = new int[] { (short) 0, (byte) 100 };
        int[] intArray6 = new int[] { 0, 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) '4', (int) (byte) 0);
    }

    @Test
    public void test05067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05067");
        int[] intArray6 = new int[] { '4', (byte) 10, (byte) -1, (byte) 10, (short) -1, (byte) 0 };
        int[] intArray8 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (byte) 10, 10);
    }

    @Test
    public void test05068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05068");
        int[] intArray6 = new int[] { (short) 10, 1, (short) 1, (-1), (byte) 10, '4' };
        int[] intArray10 = new int[] { '#', 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 1, (int) ' ');
    }

    @Test
    public void test05069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05069");
        int[] intArray6 = new int[] { (-1), (-1), (short) 100, 1, 'a', 100 };
        int[] intArray10 = new int[] { 'a', (byte) -1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) '4', (int) (byte) 0);
    }

    @Test
    public void test05070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05070");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, 'a', (byte) 10, (byte) 10 };
        int[] intArray11 = new int[] { 0, '4', (byte) 10, (-1), (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) '#', (int) (short) 10);
    }

    @Test
    public void test05071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05071");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 1 };
        int[] intArray10 = new int[] { (-1), (byte) 1, (short) 0, (-1), (short) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 1, (int) '#');
    }

    @Test
    public void test05072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05072");
        int[] intArray2 = new int[] { 'a', '#' };
        int[] intArray4 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (short) 100, (int) '4');
    }

    @Test
    public void test05073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05073");
        int[] intArray4 = new int[] { (byte) 10, (short) 10, (short) 10, '#' };
        int[] intArray7 = new int[] { (short) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) '#', (int) (short) 1);
    }

    @Test
    public void test05074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05074");
        int[] intArray5 = new int[] { (short) 0, '#', '#', '#', 0 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (short) 10, (int) (short) 1);
    }

    @Test
    public void test05075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05075");
        int[] intArray4 = new int[] { 'a', '#', 1, (byte) 0 };
        int[] intArray11 = new int[] { (byte) 0, 'a', (short) -1, '4', ' ', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) -1, 1);
    }

    @Test
    public void test05076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05076");
        int[] intArray1 = new int[] { 0 };
        int[] intArray6 = new int[] { (byte) -1, (short) 1, '#', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 0, (int) ' ');
    }

    @Test
    public void test05077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05077");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 1, (byte) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test05078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05078");
        int[] intArray6 = new int[] { (short) -1, 10, (short) 0, (short) 10, (byte) 100, (byte) -1 };
        int[] intArray10 = new int[] { (short) 0, 'a', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) 0, 1);
    }

    @Test
    public void test05079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05079");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray3 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test05080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05080");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) -1, 1, (short) -1, (short) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, 10, (int) (byte) 100);
    }

    @Test
    public void test05081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05081");
        int[] intArray6 = new int[] { (byte) 10, 10, '#', '#', (short) 0, '#' };
        int[] intArray9 = new int[] { (byte) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) -1, (int) 'a');
    }

    @Test
    public void test05082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05082");
        int[] intArray4 = new int[] { (byte) 100, '#', (short) 1, 0 };
        int[] intArray9 = new int[] { 'a', 10, 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 1, 100);
    }

    @Test
    public void test05083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05083");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { '4', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (short) 100, (int) (byte) -1);
    }

    @Test
    public void test05084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05084");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 0, (short) 10, (short) 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) 'a', (int) (byte) 10);
    }

    @Test
    public void test05085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05085");
        int[] intArray5 = new int[] { (byte) -1, (-1), (byte) -1, (byte) 100, 100 };
        int[] intArray12 = new int[] { (byte) 10, 1, '4', 'a', (short) 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (byte) 10, (int) 'a');
    }

    @Test
    public void test05086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05086");
        int[] intArray3 = new int[] { 100, (byte) 100, '#' };
        int[] intArray9 = new int[] { (byte) 1, ' ', 100, 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test05087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05087");
        int[] intArray4 = new int[] { (byte) 0, (byte) 1, (short) 0, (byte) 100 };
        int[] intArray10 = new int[] { (short) 100, 100, (short) 0, ' ', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (byte) 0, (int) (byte) -1);
    }

    @Test
    public void test05088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05088");
        int[] intArray6 = new int[] { (short) 1, (-1), (short) 10, 1, (short) 1, (short) 1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test05089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05089");
        int[] intArray4 = new int[] { ' ', (byte) 0, 100, '#' };
        int[] intArray6 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, 100, (int) (byte) 1);
    }

    @Test
    public void test05090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05090");
        int[] intArray5 = new int[] { (byte) 100, (byte) 10, 'a', (-1), 1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (short) 1, (int) (byte) 0);
    }

    @Test
    public void test05091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05091");
        int[] intArray2 = new int[] { ' ', 1 };
        int[] intArray5 = new int[] { (byte) -1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test05092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05092");
        int[] intArray3 = new int[] { 100, '#', (short) 1 };
        int[] intArray5 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) 0, (int) (byte) 100);
    }

    @Test
    public void test05093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05093");
        int[] intArray5 = new int[] { (short) 1, 100, 10, (short) 10, (byte) 1 };
        int[] intArray8 = new int[] { 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) -1, 100);
    }

    @Test
    public void test05094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05094");
        int[] intArray2 = new int[] { (byte) 0, ' ' };
        int[] intArray9 = new int[] { 100, (short) -1, (short) 1, (short) -1, '#', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (short) 0, (-1));
    }

    @Test
    public void test05095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05095");
        int[] intArray1 = new int[] { '4' };
        int[] intArray5 = new int[] { (byte) 100, (byte) 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, 100, 1);
    }

    @Test
    public void test05096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05096");
        int[] intArray1 = new int[] { 1 };
        int[] intArray5 = new int[] { (-1), (byte) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (byte) 1, 1);
    }

    @Test
    public void test05097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05097");
        int[] intArray3 = new int[] { 1, 100, (short) 1 };
        int[] intArray5 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test05098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05098");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 0, '4', (short) -1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 1, (int) (byte) 1);
    }

    @Test
    public void test05099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05099");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 10, (short) 1 };
        int[] intArray8 = new int[] { (-1), (byte) 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) 0, 10);
    }

    @Test
    public void test05100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05100");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (-1), (int) (short) 10);
    }

    @Test
    public void test05101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05101");
        int[] intArray4 = new int[] { (short) 10, (short) -1, 0, '#' };
        int[] intArray7 = new int[] { 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) ' ', (int) (short) 1);
    }

    @Test
    public void test05102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05102");
        int[] intArray4 = new int[] { 'a', '#', (byte) 1, (short) 1 };
        int[] intArray11 = new int[] { 1, (short) 1, 100, 100, (byte) 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, 10, 100);
    }

    @Test
    public void test05103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05103");
        int[] intArray5 = new int[] { 10, (short) -1, (byte) 100, 0, (byte) 100 };
        int[] intArray9 = new int[] { (byte) 10, (byte) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) '4', (int) (byte) 0);
    }

    @Test
    public void test05104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05104");
        int[] intArray2 = new int[] { '#', (byte) -1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) 10, 1);
    }

    @Test
    public void test05105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05105");
        int[] intArray2 = new int[] { ' ', (short) 100 };
        int[] intArray9 = new int[] { ' ', 0, (byte) -1, (byte) 0, 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) 'a', (int) (byte) 0);
    }

    @Test
    public void test05106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05106");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray7 = new int[] { 'a', 10, 100, 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) 10, 10);
    }

    @Test
    public void test05107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05107");
        int[] intArray3 = new int[] { (byte) 10, (byte) 1, 0 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (byte) 1, (int) (byte) 10);
    }

    @Test
    public void test05108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05108");
        int[] intArray3 = new int[] { '4', (byte) 100, 'a' };
        int[] intArray10 = new int[] { (short) 1, (byte) 100, (byte) 100, (short) 0, (byte) 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 1, 10);
    }

    @Test
    public void test05109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05109");
        int[] intArray1 = new int[] { 0 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) 1, (int) (byte) 1);
    }

    @Test
    public void test05110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05110");
        int[] intArray4 = new int[] { 100, 1, (short) 100, 1 };
        int[] intArray9 = new int[] { (byte) 1, (byte) 0, (short) 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) -1, (int) '#');
    }

    @Test
    public void test05111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05111");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (-1), (byte) -1, '#', (short) 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) 1, (int) ' ');
    }

    @Test
    public void test05112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05112");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 1, (byte) 0, (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) 0, 0);
    }

    @Test
    public void test05113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05113");
        int[] intArray3 = new int[] { 10, (byte) 100, (-1) };
        int[] intArray7 = new int[] { (short) -1, ' ', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 0, (int) '#');
    }

    @Test
    public void test05114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05114");
        int[] intArray5 = new int[] { (byte) 10, (short) 0, (byte) 10, (byte) 100, (-1) };
        int[] intArray12 = new int[] { 0, (byte) 0, 0, 0, '#', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) 'a', (int) (short) 1);
    }

    @Test
    public void test05115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05115");
        int[] intArray3 = new int[] { (short) 1, 100, 100 };
        int[] intArray8 = new int[] { 10, 0, (short) 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 100, (int) (byte) 0);
    }

    @Test
    public void test05116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05116");
        int[] intArray4 = new int[] { 100, (short) 1, '4', '#' };
        int[] intArray7 = new int[] { 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) ' ', (-1));
    }

    @Test
    public void test05117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05117");
        int[] intArray2 = new int[] { (short) 100, (byte) -1 };
        int[] intArray9 = new int[] { (short) 100, 100, 100, 10, (short) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (short) 0, (int) (short) 100);
    }

    @Test
    public void test05118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05118");
        int[] intArray6 = new int[] { 100, (byte) 0, (byte) 100, '#', (byte) 100, '4' };
        int[] intArray12 = new int[] { 'a', 1, (byte) 10, '#', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 10, (int) (short) -1);
    }

    @Test
    public void test05119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05119");
        int[] intArray2 = new int[] { (-1), (-1) };
        int[] intArray8 = new int[] { 0, (short) -1, (byte) 10, 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) 100, 0);
    }

    @Test
    public void test05120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05120");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray8 = new int[] { (short) 10, 10, (byte) 1, (byte) 10, (short) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) '4', (int) (byte) 1);
    }

    @Test
    public void test05121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05121");
        int[] intArray2 = new int[] { '#', (byte) 10 };
        int[] intArray5 = new int[] { 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 1, (int) '#');
    }

    @Test
    public void test05122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05122");
        int[] intArray2 = new int[] { ' ', '#' };
        int[] intArray8 = new int[] { (byte) 100, '#', (byte) 0, 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) 'a', (int) (byte) 1);
    }

    @Test
    public void test05123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05123");
        int[] intArray4 = new int[] { (byte) 100, 'a', (short) 100, 100 };
        int[] intArray9 = new int[] { (byte) 100, (byte) 100, (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (byte) 10, (int) '#');
    }

    @Test
    public void test05124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05124");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray7 = new int[] { (byte) 1, (short) 0, (byte) 1, '#', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) ' ', (int) (byte) 10);
    }

    @Test
    public void test05125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05125");
        int[] intArray4 = new int[] { (short) -1, 10, (short) 10, 10 };
        int[] intArray10 = new int[] { '#', (short) 100, (byte) 10, (byte) 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) 0, (int) '4');
    }

    @Test
    public void test05126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05126");
        int[] intArray3 = new int[] { 100, (byte) 100, 10 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) '#', 100);
    }

    @Test
    public void test05127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05127");
        int[] intArray5 = new int[] { (byte) 0, 1, 0, '#', (byte) 10 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) ' ', (int) (short) 1);
    }

    @Test
    public void test05128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05128");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, 0, (int) '#');
    }

    @Test
    public void test05129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05129");
        int[] intArray2 = new int[] { (byte) -1, (short) 0 };
        int[] intArray8 = new int[] { '#', 10, '#', (byte) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test05130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05130");
        int[] intArray3 = new int[] { (byte) 1, '4', (byte) 0 };
        int[] intArray10 = new int[] { (-1), (short) 1, (short) 1, (-1), (byte) 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 0, (int) 'a');
    }

    @Test
    public void test05131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05131");
        int[] intArray6 = new int[] { (short) 1, ' ', 0, 10, (short) 100, '4' };
        int[] intArray11 = new int[] { (byte) 1, (short) 1, (short) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 0, (int) 'a');
    }

    @Test
    public void test05132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05132");
        int[] intArray4 = new int[] { 0, ' ', (byte) -1, '4' };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (short) -1, (-1));
    }

    @Test
    public void test05133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05133");
        int[] intArray2 = new int[] { 100, 1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) '4', 100);
    }

    @Test
    public void test05134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05134");
        int[] intArray6 = new int[] { (byte) 1, (short) 1, (short) -1, (short) -1, '#', (short) 100 };
        int[] intArray11 = new int[] { (byte) 10, (short) 0, (byte) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 0, (int) (byte) -1);
    }

    @Test
    public void test05135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05135");
        int[] intArray1 = new int[] { '4' };
        int[] intArray6 = new int[] { 0, 10, (byte) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 10, (int) (short) 0);
    }

    @Test
    public void test05136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05136");
        int[] intArray6 = new int[] { 'a', (short) 0, 100, 'a', 100, (short) 1 };
        int[] intArray12 = new int[] { (short) 100, 'a', (short) 0, 'a', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (-1), (int) (byte) 100);
    }

    @Test
    public void test05137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05137");
        int[] intArray4 = new int[] { 10, (byte) -1, (short) 10, (short) 100 };
        int[] intArray8 = new int[] { 1, (short) 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) ' ', (int) (short) 0);
    }

    @Test
    public void test05138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05138");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 0, (short) 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) ' ', 0);
    }

    @Test
    public void test05139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05139");
        int[] intArray5 = new int[] { (-1), (short) 100, (byte) 0, (byte) 0, (byte) 10 };
        int[] intArray11 = new int[] { '#', 100, (short) 10, (short) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) 10, 1);
    }

    @Test
    public void test05140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05140");
        int[] intArray5 = new int[] { 0, (byte) 0, 10, (byte) 100, 10 };
        int[] intArray11 = new int[] { (byte) 100, ' ', (short) 0, '#', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) '#', (int) (byte) 10);
    }

    @Test
    public void test05141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05141");
        int[] intArray2 = new int[] { (byte) 10, (byte) 1 };
        int[] intArray4 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 10, (int) (short) -1);
    }

    @Test
    public void test05142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05142");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (short) 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) ' ', (int) ' ');
    }

    @Test
    public void test05143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05143");
        int[] intArray5 = new int[] { 10, (byte) 0, (byte) 1, (short) 1, 100 };
        int[] intArray8 = new int[] { (byte) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 0, (int) '4');
    }

    @Test
    public void test05144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05144");
        int[] intArray2 = new int[] { 0, (byte) 100 };
        int[] intArray9 = new int[] { 10, (short) 10, (byte) 10, (byte) 10, '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 10, (int) (byte) 10);
    }

    @Test
    public void test05145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05145");
        int[] intArray6 = new int[] { (short) -1, 1, (byte) 100, 0, 1, (short) 1 };
        int[] intArray13 = new int[] { (short) -1, (short) 0, (short) 10, 10, (short) 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 10, 0);
    }

    @Test
    public void test05146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05146");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (-1), (short) 0, ' ', 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) -1, (-1));
    }

    @Test
    public void test05147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05147");
        int[] intArray4 = new int[] { 1, 0, (short) 0, (-1) };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) '#', (int) (byte) 1);
    }

    @Test
    public void test05148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05148");
        int[] intArray3 = new int[] { (byte) 0, '#', (byte) 10 };
        int[] intArray7 = new int[] { 'a', (byte) 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 100, 0);
    }

    @Test
    public void test05149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05149");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 1, ' ', (short) 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 0, 0);
    }

    @Test
    public void test05150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05150");
        int[] intArray1 = new int[] { 0 };
        int[] intArray8 = new int[] { (short) 0, '#', (short) 100, '4', 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) 0, 10);
    }

    @Test
    public void test05151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05151");
        int[] intArray5 = new int[] { (short) 0, (short) 1, '#', (short) -1, (short) -1 };
        int[] intArray7 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) '4', (int) (short) -1);
    }

    @Test
    public void test05152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05152");
        int[] intArray5 = new int[] { '#', '4', (byte) -1, (byte) 100, 10 };
        int[] intArray12 = new int[] { (byte) -1, (short) 0, (short) 10, (short) 10, 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (byte) 0, (int) (byte) -1);
    }

    @Test
    public void test05153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05153");
        int[] intArray5 = new int[] { (short) 1, (short) 0, (short) -1, (short) 100, 100 };
        int[] intArray11 = new int[] { 10, (short) -1, (short) 1, (short) 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) 0, (int) (byte) -1);
    }

    @Test
    public void test05154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05154");
        int[] intArray6 = new int[] { (byte) 0, (short) 100, (byte) 10, (byte) 1, 1, (short) -1 };
        int[] intArray13 = new int[] { '#', (byte) 0, (short) 1, (short) 10, 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test05155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05155");
        int[] intArray3 = new int[] { (short) -1, '4', (byte) -1 };
        int[] intArray10 = new int[] { (byte) -1, (byte) -1, (byte) 1, (short) 10, (byte) 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) '4', (int) (short) 0);
    }

    @Test
    public void test05156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05156");
        int[] intArray2 = new int[] { '4', '#' };
        int[] intArray5 = new int[] { '4', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (byte) 100, (int) (byte) 10);
    }

    @Test
    public void test05157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05157");
        int[] intArray5 = new int[] { '4', (byte) 10, ' ', (byte) 1, ' ' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) '4', (int) (byte) -1);
    }

    @Test
    public void test05158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05158");
        int[] intArray2 = new int[] { '4', (byte) 0 };
        int[] intArray6 = new int[] { (short) -1, (byte) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) '4', (int) (byte) 0);
    }

    @Test
    public void test05159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05159");
        int[] intArray1 = new int[] { '4' };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 0, (int) (byte) 1);
    }

    @Test
    public void test05160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05160");
        int[] intArray3 = new int[] { 0, 100, 0 };
        int[] intArray10 = new int[] { (byte) -1, 1, (short) 0, ' ', (byte) 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) -1, (int) (short) 0);
    }

    @Test
    public void test05161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05161");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (byte) 100, (int) (byte) 100);
    }

    @Test
    public void test05162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05162");
        int[] intArray5 = new int[] { (byte) 100, 0, '4', (short) 0, 'a' };
        int[] intArray11 = new int[] { (byte) 10, 10, 'a', (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 1, (int) (byte) 10);
    }

    @Test
    public void test05163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05163");
        int[] intArray3 = new int[] { '4', 0, (byte) 100 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) '4', (int) (byte) 1);
    }

    @Test
    public void test05164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05164");
        int[] intArray3 = new int[] { (byte) 1, 1, (byte) 1 };
        int[] intArray9 = new int[] { 0, (-1), 'a', 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) '4', (int) (short) 1);
    }

    @Test
    public void test05165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05165");
        int[] intArray6 = new int[] { ' ', 1, 10, 0, (short) -1, (short) -1 };
        int[] intArray8 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) 'a', (int) (short) 100);
    }

    @Test
    public void test05166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05166");
        int[] intArray2 = new int[] { 100, '4' };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) 1, 0);
    }

    @Test
    public void test05167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05167");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray6 = new int[] { (byte) 10, 0, '#', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) '#', (int) (byte) -1);
    }

    @Test
    public void test05168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05168");
        int[] intArray5 = new int[] { (short) 1, (short) 10, (byte) -1, '#', '4' };
        int[] intArray9 = new int[] { (short) 0, (short) 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) 'a', 1);
    }

    @Test
    public void test05169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05169");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) -1, '4', (byte) 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 10, (int) (short) 0);
    }

    @Test
    public void test05170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05170");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray8 = new int[] { '#', 'a', 100, '#', (byte) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) 10, (int) '4');
    }

    @Test
    public void test05171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05171");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        int[] intArray7 = new int[] { (byte) -1, (byte) 0, '4', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 10, (int) (short) 10);
    }

    @Test
    public void test05172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05172");
        int[] intArray5 = new int[] { ' ', (byte) 1, (short) 1, (short) -1, '4' };
        int[] intArray8 = new int[] { (byte) -1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) '#', (int) (short) 0);
    }

    @Test
    public void test05173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05173");
        int[] intArray4 = new int[] { (short) -1, (-1), (short) 0, 10 };
        int[] intArray10 = new int[] { ' ', ' ', (byte) 0, 'a', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) '#', (int) (short) 100);
    }

    @Test
    public void test05174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05174");
        int[] intArray1 = new int[] { '4' };
        int[] intArray7 = new int[] { (short) -1, 0, 100, 'a', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) -1, (int) (short) 0);
    }

    @Test
    public void test05175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05175");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (byte) 0, (byte) -1, 1, '#', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) '4', 0);
    }

    @Test
    public void test05176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05176");
        int[] intArray2 = new int[] { (-1), 1 };
        int[] intArray6 = new int[] { 10, (short) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) 0, (int) (short) -1);
    }

    @Test
    public void test05177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05177");
        int[] intArray5 = new int[] { (short) 100, 'a', (byte) 1, 'a', (byte) -1 };
        int[] intArray9 = new int[] { (short) 0, 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test05178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05178");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (-1), 'a', (byte) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) 1, 0);
    }

    @Test
    public void test05179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05179");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 'a', (short) 0, (byte) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) '4', (int) (byte) 1);
    }

    @Test
    public void test05180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05180");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (short) -1, (int) '4');
    }

    @Test
    public void test05181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05181");
        int[] intArray2 = new int[] { 1, (-1) };
        int[] intArray7 = new int[] { '4', (short) 1, 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (short) 0, (int) 'a');
    }

    @Test
    public void test05182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05182");
        int[] intArray4 = new int[] { (-1), (byte) 1, (short) 100, (byte) 10 };
        int[] intArray6 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (short) -1, (-1));
    }

    @Test
    public void test05183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05183");
        int[] intArray4 = new int[] { (short) 0, (short) -1, 100, (byte) -1 };
        int[] intArray8 = new int[] { (-1), '4', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 1, (-1));
    }

    @Test
    public void test05184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05184");
        int[] intArray5 = new int[] { (short) 0, (byte) 0, (-1), (short) 0, (byte) 0 };
        int[] intArray12 = new int[] { (short) 1, ' ', (byte) -1, (byte) 100, (short) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (byte) 100, 0);
    }

    @Test
    public void test05185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05185");
        int[] intArray4 = new int[] { (byte) 100, (short) 0, (byte) -1, (short) -1 };
        int[] intArray11 = new int[] { '#', (short) 10, 0, (byte) 1, 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (-1), (int) (short) 10);
    }

    @Test
    public void test05186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05186");
        int[] intArray6 = new int[] { (short) 0, (short) 1, (short) 10, (short) -1, (short) 10, (short) 10 };
        int[] intArray12 = new int[] { '4', (short) -1, 10, ' ', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) 'a', (int) (byte) 1);
    }

    @Test
    public void test05187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05187");
        int[] intArray4 = new int[] { 1, (short) 10, (short) 100, (byte) -1 };
        int[] intArray9 = new int[] { (byte) 1, (short) 0, (short) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) 'a', (int) (byte) -1);
    }

    @Test
    public void test05188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05188");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (byte) 10, (int) (short) 1);
    }

    @Test
    public void test05189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05189");
        int[] intArray3 = new int[] { (short) 1, (byte) 10, (byte) 10 };
        int[] intArray8 = new int[] { 0, '#', 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 1, (int) 'a');
    }

    @Test
    public void test05190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05190");
        int[] intArray5 = new int[] { '4', 1, (byte) 10, 0, (short) -1 };
        int[] intArray8 = new int[] { '4', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) '#', (int) '4');
    }

    @Test
    public void test05191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05191");
        int[] intArray6 = new int[] { (byte) -1, (short) 10, (byte) 1, 0, (byte) 1, 1 };
        int[] intArray10 = new int[] { (-1), (byte) 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (short) 0, (int) (short) -1);
    }

    @Test
    public void test05192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05192");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray4 = new int[] { (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, 10, (int) '#');
    }

    @Test
    public void test05193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05193");
        int[] intArray3 = new int[] { 1, 100, (byte) 10 };
        int[] intArray9 = new int[] { 10, (byte) 10, (short) 10, (byte) 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 10, 100);
    }

    @Test
    public void test05194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05194");
        int[] intArray1 = new int[] { 10 };
        int[] intArray7 = new int[] { 1, ' ', (byte) 0, 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) 10, (int) 'a');
    }

    @Test
    public void test05195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05195");
        int[] intArray3 = new int[] { (byte) 100, (short) 10, (byte) -1 };
        int[] intArray8 = new int[] { (short) -1, '4', 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (short) 1, 100);
    }

    @Test
    public void test05196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05196");
        int[] intArray2 = new int[] { '4', (short) -1 };
        int[] intArray5 = new int[] { ' ', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test05197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05197");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) -1, (int) '#');
    }

    @Test
    public void test05198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05198");
        int[] intArray6 = new int[] { (byte) -1, (byte) 0, (byte) 0, (short) -1, 100, '4' };
        int[] intArray10 = new int[] { '#', 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) '#', (int) (short) -1);
    }

    @Test
    public void test05199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05199");
        int[] intArray3 = new int[] { 100, ' ', '4' };
        int[] intArray8 = new int[] { (short) 0, (byte) 1, (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (short) 10, (int) (short) 10);
    }

    @Test
    public void test05200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05200");
        int[] intArray3 = new int[] { (short) 10, 1, ' ' };
        int[] intArray6 = new int[] { (byte) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) 100, (int) (byte) 100);
    }

    @Test
    public void test05201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05201");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray5 = new int[] { 10, (short) 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) ' ', 0);
    }

    @Test
    public void test05202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05202");
        int[] intArray5 = new int[] { ' ', (-1), 10, ' ', 1 };
        int[] intArray9 = new int[] { (byte) 1, (short) 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (byte) 0, (int) (byte) 100);
    }

    @Test
    public void test05203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05203");
        int[] intArray2 = new int[] { (short) 0, '4' };
        int[] intArray9 = new int[] { 100, (byte) 0, ' ', 0, (byte) -1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 100, 10);
    }

    @Test
    public void test05204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05204");
        int[] intArray2 = new int[] { (byte) 1, (short) 0 };
        int[] intArray8 = new int[] { '4', (byte) 0, 0, (short) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) -1, (int) (short) 100);
    }

    @Test
    public void test05205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05205");
        int[] intArray3 = new int[] { 0, (byte) 0, (short) 1 };
        int[] intArray9 = new int[] { 10, 10, (byte) 100, '#', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) '#', (int) (short) -1);
    }

    @Test
    public void test05206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05206");
        int[] intArray6 = new int[] { (-1), (byte) 10, (short) 1, (byte) 10, '4', (byte) 10 };
        int[] intArray11 = new int[] { (short) 100, (byte) 0, '#', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) '#', (int) 'a');
    }

    @Test
    public void test05207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05207");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray4 = new int[] { '#', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (short) -1, (-1));
    }

    @Test
    public void test05208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05208");
        int[] intArray2 = new int[] { (short) 0, (short) 100 };
        int[] intArray5 = new int[] { (short) 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 0, 10);
    }

    @Test
    public void test05209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05209");
        int[] intArray5 = new int[] { 1, (short) 1, 'a', 0, (-1) };
        int[] intArray9 = new int[] { (short) -1, (short) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (byte) 0, (int) (short) 100);
    }

    @Test
    public void test05210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05210");
        int[] intArray4 = new int[] { '4', (byte) -1, 10, 10 };
        int[] intArray8 = new int[] { ' ', (byte) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) 100, (int) 'a');
    }

    @Test
    public void test05211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05211");
        int[] intArray1 = new int[] { 0 };
        int[] intArray6 = new int[] { (-1), 100, ' ', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (byte) -1, 0);
    }

    @Test
    public void test05212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05212");
        int[] intArray6 = new int[] { (-1), (byte) -1, (short) 0, (byte) 10, '#', (short) 100 };
        int[] intArray11 = new int[] { (byte) 1, 10, '4', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 1, 0);
    }

    @Test
    public void test05213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05213");
        int[] intArray1 = new int[] { 10 };
        int[] intArray4 = new int[] { (-1), (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (short) 0, (int) '4');
    }

    @Test
    public void test05214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05214");
        int[] intArray4 = new int[] { 'a', (short) 0, (byte) 0, 10 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, 100, (int) (byte) 0);
    }

    @Test
    public void test05215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05215");
        int[] intArray1 = new int[] { 0 };
        int[] intArray4 = new int[] { (byte) 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, 1, (int) (byte) 1);
    }

    @Test
    public void test05216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05216");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 100, 10, (byte) -1, '4', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, 0, (int) (short) 100);
    }

    @Test
    public void test05217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05217");
        int[] intArray3 = new int[] { '#', (byte) 100, (byte) -1 };
        int[] intArray10 = new int[] { 'a', (-1), 100, (byte) 0, (byte) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 100, (int) (short) -1);
    }

    @Test
    public void test05218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05218");
        int[] intArray4 = new int[] { 'a', (byte) 0, (short) 1, 0 };
        int[] intArray10 = new int[] { (short) 1, (byte) 0, (short) -1, (short) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) 100, (int) ' ');
    }

    @Test
    public void test05219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05219");
        int[] intArray2 = new int[] { (short) 0, 10 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (byte) -1, (int) (byte) 10);
    }

    @Test
    public void test05220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05220");
        int[] intArray6 = new int[] { 0, (short) 100, (byte) -1, (short) 0, 100, (short) 1 };
        int[] intArray9 = new int[] { '#', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) '#', (int) '#');
    }

    @Test
    public void test05221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05221");
        int[] intArray3 = new int[] { 10, (short) 10, '4' };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (byte) 10, (int) (byte) 10);
    }

    @Test
    public void test05222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05222");
        int[] intArray2 = new int[] { '4', 10 };
        int[] intArray7 = new int[] { (short) 10, 0, 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (short) 0, (int) (short) 0);
    }

    @Test
    public void test05223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05223");
        int[] intArray2 = new int[] { '4', 0 };
        int[] intArray8 = new int[] { 1, (byte) 1, (short) 1, (short) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) 100, 1);
    }

    @Test
    public void test05224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05224");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 0, (int) (byte) -1);
    }

    @Test
    public void test05225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05225");
        int[] intArray2 = new int[] { 1, (short) 0 };
        int[] intArray6 = new int[] { (short) 100, (byte) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (short) 100, (int) (byte) -1);
    }

    @Test
    public void test05226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05226");
        int[] intArray2 = new int[] { (byte) 0, (byte) -1 };
        int[] intArray9 = new int[] { (short) 0, (short) -1, 'a', (byte) 0, (byte) 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) '#', (int) (short) 1);
    }

    @Test
    public void test05227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05227");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 'a', (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) 0, (int) 'a');
    }

    @Test
    public void test05228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05228");
        int[] intArray5 = new int[] { '#', 0, 1, 'a', (byte) 100 };
        int[] intArray12 = new int[] { 'a', 0, '#', (short) -1, (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test05229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05229");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 100, (byte) 10, (byte) 1, (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) 100, (int) (byte) -1);
    }

    @Test
    public void test05230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05230");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray3 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, 10, (int) '#');
    }

    @Test
    public void test05231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05231");
        int[] intArray2 = new int[] { (byte) 1, ' ' };
        int[] intArray8 = new int[] { (short) -1, '4', (short) 0, 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 0, 1);
    }

    @Test
    public void test05232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05232");
        int[] intArray3 = new int[] { (byte) 10, (byte) 100, (short) 100 };
        int[] intArray6 = new int[] { (byte) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) 100, 0);
    }

    @Test
    public void test05233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05233");
        int[] intArray6 = new int[] { 1, '#', (short) 100, (byte) -1, (short) 100, (byte) 0 };
        int[] intArray11 = new int[] { (byte) 1, (short) 0, (byte) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) '4', (int) 'a');
    }

    @Test
    public void test05234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05234");
        int[] intArray3 = new int[] { 'a', 10, 1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) '#', (int) '#');
    }

    @Test
    public void test05235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05235");
        int[] intArray1 = new int[] { '#' };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 0, 1);
    }

    @Test
    public void test05236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05236");
        int[] intArray4 = new int[] { (short) 10, (short) 10, 'a', (short) -1 };
        int[] intArray11 = new int[] { (short) 1, (byte) 1, (short) 0, (short) 10, (-1), (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) 100, (int) '4');
    }

    @Test
    public void test05237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05237");
        int[] intArray3 = new int[] { 0, (short) 0, 10 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, 0, (int) '4');
    }

    @Test
    public void test05238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05238");
        int[] intArray5 = new int[] { (byte) 100, 1, (byte) 10, '4', (byte) -1 };
        int[] intArray11 = new int[] { (short) 100, (byte) 10, (short) 10, (short) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) 10, 1);
    }

    @Test
    public void test05239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05239");
        int[] intArray2 = new int[] { (byte) 0, 10 };
        int[] intArray7 = new int[] { (short) 100, (-1), (short) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 0, (int) ' ');
    }

    @Test
    public void test05240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05240");
        int[] intArray4 = new int[] { 1, '4', (short) 10, (byte) -1 };
        int[] intArray8 = new int[] { 'a', '4', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 10, (int) '#');
    }

    @Test
    public void test05241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05241");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { '#', (byte) 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, 1, (int) (byte) 0);
    }

    @Test
    public void test05242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05242");
        int[] intArray6 = new int[] { (byte) 10, (short) 10, (byte) 0, 100, (short) -1, (short) 1 };
        int[] intArray10 = new int[] { '#', ' ', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (short) 100, 10);
    }

    @Test
    public void test05243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05243");
        int[] intArray2 = new int[] { 100, (short) 10 };
        int[] intArray5 = new int[] { 'a', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) '4', (int) '#');
    }

    @Test
    public void test05244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05244");
        int[] intArray4 = new int[] { (byte) 1, ' ', (byte) 1, (-1) };
        int[] intArray10 = new int[] { 0, (byte) 1, '4', (byte) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) 0, 100);
    }

    @Test
    public void test05245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05245");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray6 = new int[] { (byte) 0, (short) 10, (byte) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (byte) 0, (int) (short) -1);
    }

    @Test
    public void test05246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05246");
        int[] intArray5 = new int[] { (byte) 100, (byte) 0, (-1), (short) 1, '4' };
        int[] intArray10 = new int[] { '4', 0, ' ', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (short) 10, 10);
    }

    @Test
    public void test05247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05247");
        int[] intArray2 = new int[] { (byte) 0, 'a' };
        int[] intArray5 = new int[] { ' ', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 10, (int) (byte) 0);
    }

    @Test
    public void test05248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05248");
        int[] intArray2 = new int[] { (byte) 1, (short) 10 };
        int[] intArray6 = new int[] { 0, (byte) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) '4', (int) '#');
    }

    @Test
    public void test05249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05249");
        int[] intArray4 = new int[] { '#', (short) 100, (short) 10, (byte) 0 };
        int[] intArray8 = new int[] { 'a', 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 0, (int) (byte) 1);
    }

    @Test
    public void test05250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05250");
        int[] intArray6 = new int[] { (byte) 0, 100, (short) 100, ' ', 100, '#' };
        int[] intArray10 = new int[] { (byte) -1, ' ', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 0, 1);
    }

    @Test
    public void test05251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05251");
        int[] intArray1 = new int[] { 10 };
        int[] intArray3 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) 10, (int) (short) 1);
    }

    @Test
    public void test05252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05252");
        int[] intArray3 = new int[] { (short) 100, '#', 0 };
        int[] intArray8 = new int[] { (byte) 0, '#', (byte) 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (short) 1, (int) (byte) 10);
    }

    @Test
    public void test05253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05253");
        int[] intArray2 = new int[] { (-1), 10 };
        int[] intArray4 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 10, (int) 'a');
    }

    @Test
    public void test05254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05254");
        int[] intArray6 = new int[] { (short) 100, (short) 10, (short) 100, 10, 'a', (short) 100 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, 10, (int) (byte) 10);
    }

    @Test
    public void test05255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05255");
        int[] intArray2 = new int[] { '#', 'a' };
        int[] intArray7 = new int[] { (byte) 100, 'a', (byte) 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 1, (int) ' ');
    }

    @Test
    public void test05256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05256");
        int[] intArray4 = new int[] { 0, (byte) 1, (byte) -1, (byte) 100 };
        int[] intArray11 = new int[] { (byte) 0, (-1), (byte) 100, (byte) 10, ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) 1, 10);
    }

    @Test
    public void test05257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05257");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 0, (short) 0, (short) 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 1, (int) (short) 0);
    }

    @Test
    public void test05258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05258");
        int[] intArray1 = new int[] { 10 };
        int[] intArray8 = new int[] { (byte) -1, '#', 100, 'a', (short) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 100, (int) (byte) -1);
    }

    @Test
    public void test05259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05259");
        int[] intArray2 = new int[] { '4', ' ' };
        int[] intArray5 = new int[] { (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 0, (-1));
    }

    @Test
    public void test05260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05260");
        int[] intArray3 = new int[] { (byte) 10, 1, (short) 0 };
        int[] intArray6 = new int[] { (short) -1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, 10, (int) '#');
    }

    @Test
    public void test05261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05261");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) 1, 0);
    }

    @Test
    public void test05262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05262");
        int[] intArray6 = new int[] { (short) 10, '4', (short) -1, (byte) 1, '#', 'a' };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) 1, 10);
    }

    @Test
    public void test05263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05263");
        int[] intArray6 = new int[] { '#', (byte) 10, ' ', (short) 1, (short) 10, 100 };
        int[] intArray9 = new int[] { (short) 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) '4', 1);
    }

    @Test
    public void test05264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05264");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray8 = new int[] { (short) 10, (byte) 0, (byte) 100, ' ', ' ', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) 0, (int) '4');
    }

    @Test
    public void test05265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05265");
        int[] intArray3 = new int[] { 10, (byte) 10, 0 };
        int[] intArray5 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) 1, (int) '#');
    }

    @Test
    public void test05266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05266");
        int[] intArray6 = new int[] { (byte) 0, ' ', (short) 1, (byte) 100, (byte) 1, 100 };
        int[] intArray9 = new int[] { 'a', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (-1), 100);
    }

    @Test
    public void test05267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05267");
        int[] intArray6 = new int[] { 10, (short) -1, (short) 0, (byte) 100, (short) 100, (byte) -1 };
        int[] intArray12 = new int[] { (byte) 100, 0, (-1), (byte) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (byte) 1, 1);
    }

    @Test
    public void test05268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05268");
        int[] intArray4 = new int[] { 1, (byte) -1, (short) 100, 0 };
        int[] intArray7 = new int[] { (byte) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 0, 0);
    }

    @Test
    public void test05269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05269");
        int[] intArray3 = new int[] { '#', 0, (short) 0 };
        int[] intArray6 = new int[] { (short) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) ' ', (int) (byte) 100);
    }

    @Test
    public void test05270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05270");
        int[] intArray2 = new int[] { (short) 1, 0 };
        int[] intArray5 = new int[] { 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 1, 10);
    }

    @Test
    public void test05271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05271");
        int[] intArray1 = new int[] { '#' };
        int[] intArray4 = new int[] { '#', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 100, (int) (short) -1);
    }

    @Test
    public void test05272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05272");
        int[] intArray4 = new int[] { (short) 1, (short) 10, '4', 10 };
        int[] intArray8 = new int[] { (short) -1, 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 10, (int) '4');
    }

    @Test
    public void test05273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05273");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray7 = new int[] { 1, (short) 10, (short) 1, 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) 10, 10);
    }

    @Test
    public void test05274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05274");
        int[] intArray6 = new int[] { (byte) 1, (short) 100, (byte) 10, (-1), (short) 1, ' ' };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (-1), (int) (byte) 1);
    }

    @Test
    public void test05275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05275");
        int[] intArray4 = new int[] { (short) 0, (byte) 1, 100, (short) 10 };
        int[] intArray7 = new int[] { 'a', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) '4', (int) (byte) 0);
    }

    @Test
    public void test05276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05276");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, 10, (int) (byte) 10);
    }

    @Test
    public void test05277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05277");
        int[] intArray4 = new int[] { '4', '4', '4', (short) -1 };
        int[] intArray8 = new int[] { (short) -1, (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) -1, (int) '4');
    }

    @Test
    public void test05278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05278");
        int[] intArray3 = new int[] { (short) -1, (byte) 1, 0 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) '#', (int) (short) -1);
    }

    @Test
    public void test05279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05279");
        int[] intArray3 = new int[] { ' ', ' ', ' ' };
        int[] intArray8 = new int[] { (byte) 100, 1, (byte) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) '#', (-1));
    }

    @Test
    public void test05280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05280");
        int[] intArray3 = new int[] { (byte) 0, 0, (short) 0 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, 0, 100);
    }

    @Test
    public void test05281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05281");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) 100, (byte) 10, 'a', 0, (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) 100, (int) '4');
    }

    @Test
    public void test05282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05282");
        int[] intArray5 = new int[] { (-1), (short) -1, (short) 10, 0, ' ' };
        int[] intArray11 = new int[] { (byte) 0, 10, (byte) 100, ' ', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) 1, (int) (short) 100);
    }

    @Test
    public void test05283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05283");
        int[] intArray2 = new int[] { 0, 100 };
        int[] intArray5 = new int[] { (short) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) '4', (int) ' ');
    }

    @Test
    public void test05284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05284");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray7 = new int[] { (byte) 10, (byte) -1, (byte) 0, 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) -1, (int) (byte) 10);
    }

    @Test
    public void test05285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05285");
        int[] intArray5 = new int[] { (short) -1, 10, (byte) 10, (byte) 0, (short) -1 };
        int[] intArray8 = new int[] { '#', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) -1, (int) (short) 1);
    }

    @Test
    public void test05286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05286");
        int[] intArray5 = new int[] { '#', 10, (short) 100, '4', (byte) 100 };
        int[] intArray10 = new int[] { ' ', (byte) 100, 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 1, (int) (short) 1);
    }

    @Test
    public void test05287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05287");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray7 = new int[] { 100, 0, (short) 1, (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) -1, (int) (short) -1);
    }

    @Test
    public void test05288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05288");
        int[] intArray6 = new int[] { (-1), (short) 0, (short) 100, (byte) 1, ' ', (byte) -1 };
        int[] intArray9 = new int[] { (short) 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (short) 10, (int) '#');
    }

    @Test
    public void test05289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05289");
        int[] intArray4 = new int[] { (-1), (short) 10, ' ', 'a' };
        int[] intArray9 = new int[] { (byte) 1, (short) -1, (byte) 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) ' ', (-1));
    }

    @Test
    public void test05290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05290");
        int[] intArray5 = new int[] { 1, (short) 0, (short) 10, (short) 0, 1 };
        int[] intArray8 = new int[] { 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 0, (int) (byte) 10);
    }

    @Test
    public void test05291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05291");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (byte) 1, (int) (byte) -1);
    }

    @Test
    public void test05292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05292");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray3 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test05293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05293");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 0, (short) 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test05294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05294");
        int[] intArray5 = new int[] { (-1), (short) 1, (byte) 0, (short) 1, 10 };
        int[] intArray10 = new int[] { 0, (short) 1, ' ', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 10, (int) '4');
    }

    @Test
    public void test05295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05295");
        int[] intArray2 = new int[] { '#', (byte) 10 };
        int[] intArray6 = new int[] { (byte) 0, (-1), (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) 'a', 0);
    }

    @Test
    public void test05296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05296");
        int[] intArray3 = new int[] { (byte) 10, (short) 1, 100 };
        int[] intArray7 = new int[] { (byte) 0, (byte) 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) 10, (int) 'a');
    }

    @Test
    public void test05297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05297");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray6 = new int[] { 100, (-1), ' ', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 0, (int) (byte) 0);
    }

    @Test
    public void test05298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05298");
        int[] intArray5 = new int[] { 1, (-1), (byte) 100, (byte) -1, ' ' };
        int[] intArray10 = new int[] { (short) 1, '4', (short) -1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (byte) 100, (int) (short) -1);
    }

    @Test
    public void test05299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05299");
        int[] intArray3 = new int[] { (short) 100, (byte) 10, 1 };
        int[] intArray9 = new int[] { 0, (short) -1, 100, (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (-1), (int) (short) 0);
    }

    @Test
    public void test05300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05300");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 'a', (byte) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, 0, 0);
    }

    @Test
    public void test05301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05301");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray8 = new int[] { (short) 1, 0, '4', (short) 1, ' ', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 0, (int) (short) 10);
    }

    @Test
    public void test05302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05302");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) 0, 0);
    }

    @Test
    public void test05303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05303");
        int[] intArray4 = new int[] { (-1), (short) 100, (byte) 0, (byte) 1 };
        int[] intArray7 = new int[] { (-1), (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) -1, (int) (short) 1);
    }

    @Test
    public void test05304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05304");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { '#', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (-1), (int) (byte) 1);
    }

    @Test
    public void test05305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05305");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray7 = new int[] { 1, (short) 1, (byte) 0, (short) 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) 100, 0);
    }

    @Test
    public void test05306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05306");
        int[] intArray6 = new int[] { 1, (byte) -1, '#', '4', 10, ' ' };
        int[] intArray10 = new int[] { (-1), (-1), (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (short) -1, (int) 'a');
    }

    @Test
    public void test05307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05307");
        int[] intArray3 = new int[] { (short) 100, (byte) 10, 1 };
        int[] intArray8 = new int[] { (short) 10, (short) 1, 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (byte) 100, 0);
    }

    @Test
    public void test05308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05308");
        int[] intArray2 = new int[] { ' ', 10 };
        int[] intArray6 = new int[] { 100, '#', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 100, (int) (byte) -1);
    }

    @Test
    public void test05309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05309");
        int[] intArray4 = new int[] { (short) 0, '4', '#', (short) 100 };
        int[] intArray9 = new int[] { 1, 100, 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) '#', (int) 'a');
    }

    @Test
    public void test05310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05310");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray8 = new int[] { (short) 0, (short) -1, 100, '4', '#', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 0, (int) (short) 0);
    }

    @Test
    public void test05311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05311");
        int[] intArray2 = new int[] { 10, (short) 10 };
        int[] intArray4 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (byte) 100, (int) '4');
    }

    @Test
    public void test05312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05312");
        int[] intArray1 = new int[] { '4' };
        int[] intArray8 = new int[] { (byte) 1, (byte) 100, ' ', (short) 100, (byte) 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 0, (int) (byte) 1);
    }

    @Test
    public void test05313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05313");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 0, (short) 10, (byte) 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) 0, (int) (byte) 10);
    }

    @Test
    public void test05314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05314");
        int[] intArray2 = new int[] { (short) 0, (short) 10 };
        int[] intArray8 = new int[] { 'a', (byte) 1, 1, (short) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) 0, (int) (byte) 100);
    }

    @Test
    public void test05315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05315");
        int[] intArray5 = new int[] { 1, 1, (byte) 0, '4', (byte) 10 };
        int[] intArray8 = new int[] { (-1), ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 1, 0);
    }

    @Test
    public void test05316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05316");
        int[] intArray4 = new int[] { '4', (byte) 0, '4', 0 };
        int[] intArray7 = new int[] { 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) 10, 10);
    }

    @Test
    public void test05317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05317");
        int[] intArray5 = new int[] { '4', (byte) 0, (-1), (byte) -1, (short) -1 };
        int[] intArray12 = new int[] { ' ', (byte) 10, 1, (-1), 'a', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) 100, (int) '4');
    }

    @Test
    public void test05318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05318");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray7 = new int[] { (short) 1, (byte) 100, (byte) 0, (-1), 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) -1, (int) (byte) 100);
    }

    @Test
    public void test05319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05319");
        int[] intArray5 = new int[] { 'a', (byte) 100, (short) 10, (-1), (byte) -1 };
        int[] intArray8 = new int[] { (short) 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) 'a', (int) (short) 0);
    }

    @Test
    public void test05320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05320");
        int[] intArray2 = new int[] { (short) 1, (-1) };
        int[] intArray4 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (byte) 0, (int) (byte) 1);
    }

    @Test
    public void test05321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05321");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray6 = new int[] { (short) 1, (short) -1, '#', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 100, (int) '#');
    }

    @Test
    public void test05322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05322");
        int[] intArray6 = new int[] { (byte) 100, (byte) 100, (byte) -1, 1, '4', (byte) 10 };
        int[] intArray10 = new int[] { '#', (-1), (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (short) -1, 1);
    }

    @Test
    public void test05323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05323");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 100, (int) (byte) 100);
    }

    @Test
    public void test05324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05324");
        int[] intArray3 = new int[] { (-1), (byte) -1, (-1) };
        int[] intArray8 = new int[] { (byte) 10, '4', (byte) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (short) -1, (int) '#');
    }

    @Test
    public void test05325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05325");
        int[] intArray5 = new int[] { ' ', 0, (short) 10, 1, 100 };
        int[] intArray7 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) -1, (int) (short) -1);
    }

    @Test
    public void test05326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05326");
        int[] intArray3 = new int[] { (byte) -1, 10, (byte) 1 };
        int[] intArray9 = new int[] { 1, 1, (short) 0, 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) '#', (int) (short) -1);
    }

    @Test
    public void test05327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05327");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 0, 0, 100, '#', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) -1, (int) (short) 1);
    }

    @Test
    public void test05328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05328");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) 10, (byte) -1, (byte) 1, (short) 0, (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) 1, (int) (short) 100);
    }

    @Test
    public void test05329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05329");
        int[] intArray5 = new int[] { '#', 10, (byte) 1, 100, '4' };
        int[] intArray7 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (short) 100, (int) (short) 1);
    }

    @Test
    public void test05330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05330");
        int[] intArray2 = new int[] { (short) 100, 1 };
        int[] intArray9 = new int[] { (short) 1, (byte) -1, 1, (byte) 0, 'a', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (byte) 0, (int) '#');
    }

    @Test
    public void test05331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05331");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) 0, (-1), (byte) 10, '#', (short) 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, 0, (int) (byte) 1);
    }

    @Test
    public void test05332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05332");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray7 = new int[] { 100, ' ', (-1), (byte) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) -1, 1);
    }

    @Test
    public void test05333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05333");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 10, (short) 1, 'a', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 100, (int) (short) 0);
    }

    @Test
    public void test05334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05334");
        int[] intArray2 = new int[] { (short) 0, '#' };
        int[] intArray5 = new int[] { (short) 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (byte) 10, 1);
    }

    @Test
    public void test05335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05335");
        int[] intArray6 = new int[] { (short) 100, (short) 100, (byte) 0, 'a', 0, (byte) 100 };
        int[] intArray8 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 1, 0);
    }

    @Test
    public void test05336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05336");
        int[] intArray3 = new int[] { 10, 'a', (short) 100 };
        int[] intArray9 = new int[] { 10, 100, 'a', (byte) -1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (short) 0, (int) (byte) -1);
    }

    @Test
    public void test05337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05337");
        int[] intArray2 = new int[] { 1, (byte) 100 };
        int[] intArray4 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 1, (int) 'a');
    }

    @Test
    public void test05338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05338");
        int[] intArray6 = new int[] { (short) 1, 10, (short) 10, (byte) 1, (byte) 1, '4' };
        int[] intArray13 = new int[] { (short) 1, (byte) 10, (-1), (short) 1, (byte) 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) 'a', (int) (short) -1);
    }

    @Test
    public void test05339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05339");
        int[] intArray6 = new int[] { '4', (byte) 10, (byte) 1, (short) 1, 1, (short) 1 };
        int[] intArray8 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) 'a', (int) '4');
    }

    @Test
    public void test05340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05340");
        int[] intArray2 = new int[] { (short) 100, '#' };
        int[] intArray7 = new int[] { (byte) 10, (short) 0, '4', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 0, 1);
    }

    @Test
    public void test05341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05341");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, 1 };
        int[] intArray6 = new int[] { (byte) -1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) -1, (-1));
    }

    @Test
    public void test05342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05342");
        int[] intArray5 = new int[] { (byte) 10, (short) 0, (short) -1, (short) 0, (byte) 10 };
        int[] intArray8 = new int[] { (short) 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) 100, (int) (short) 10);
    }

    @Test
    public void test05343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05343");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (byte) 0, 1);
    }

    @Test
    public void test05344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05344");
        int[] intArray5 = new int[] { (short) 0, (short) 100, 1, ' ', (byte) -1 };
        int[] intArray9 = new int[] { (-1), (short) 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 0, (int) '4');
    }

    @Test
    public void test05345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05345");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray5 = new int[] { ' ', (byte) 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, 0, (int) (byte) 100);
    }

    @Test
    public void test05346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05346");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { '4', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 0, (int) (short) 0);
    }

    @Test
    public void test05347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05347");
        int[] intArray6 = new int[] { (byte) -1, '4', (byte) 1, 'a', 100, (byte) 10 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) -1, (int) ' ');
    }

    @Test
    public void test05348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05348");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (-1), '4', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) 100, 10);
    }

    @Test
    public void test05349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05349");
        int[] intArray6 = new int[] { (short) 1, (short) 100, (byte) -1, (short) -1, (short) -1, (short) 100 };
        int[] intArray8 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (byte) 0, (int) '4');
    }

    @Test
    public void test05350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05350");
        int[] intArray3 = new int[] { (short) 10, '4', 1 };
        int[] intArray10 = new int[] { (byte) 0, (short) 1, 0, (short) 10, (-1), (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 10, 0);
    }

    @Test
    public void test05351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05351");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) -1, (-1), 0, (byte) 1, 'a', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) 0, (int) (short) 10);
    }

    @Test
    public void test05352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05352");
        int[] intArray1 = new int[] { 1 };
        int[] intArray5 = new int[] { ' ', 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) '4', (int) (short) 0);
    }

    @Test
    public void test05353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05353");
        int[] intArray5 = new int[] { (byte) 10, (byte) 0, '4', (byte) 10, (byte) 1 };
        int[] intArray11 = new int[] { (byte) -1, (short) 10, ' ', 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 0, (int) (short) 100);
    }

    @Test
    public void test05354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05354");
        int[] intArray4 = new int[] { '#', 0, '4', (short) 1 };
        int[] intArray7 = new int[] { (short) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) -1, (int) 'a');
    }

    @Test
    public void test05355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05355");
        int[] intArray5 = new int[] { 0, '#', '#', (short) -1, 1 };
        int[] intArray9 = new int[] { (short) -1, (short) 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 0, (int) (short) 100);
    }

    @Test
    public void test05356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05356");
        int[] intArray4 = new int[] { (short) 1, 100, (byte) 0, (byte) 100 };
        int[] intArray9 = new int[] { (byte) 0, ' ', (byte) 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) 1, 0);
    }

    @Test
    public void test05357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05357");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray5 = new int[] { 100, 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test05358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05358");
        int[] intArray5 = new int[] { '4', 10, (short) 0, 100, (-1) };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 10, (int) (short) 100);
    }

    @Test
    public void test05359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05359");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (short) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (byte) 10, (int) (byte) 0);
    }

    @Test
    public void test05360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05360");
        int[] intArray3 = new int[] { (-1), (byte) -1, 0 };
        int[] intArray9 = new int[] { (byte) 0, 100, ' ', (short) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 1, (int) (short) -1);
    }

    @Test
    public void test05361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05361");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray5 = new int[] { (byte) 1, (byte) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, 1, (int) '4');
    }

    @Test
    public void test05362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05362");
        int[] intArray2 = new int[] { 10, (short) 0 };
        int[] intArray9 = new int[] { (byte) -1, 0, (byte) 1, '#', 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (short) 1, 100);
    }

    @Test
    public void test05363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05363");
        int[] intArray6 = new int[] { (byte) 1, 100, (byte) -1, (byte) 100, 100, (short) 0 };
        int[] intArray9 = new int[] { (-1), 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (short) 1, (int) (byte) 1);
    }

    @Test
    public void test05364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05364");
        int[] intArray1 = new int[] { '#' };
        int[] intArray3 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) ' ', (int) (short) 1);
    }

    @Test
    public void test05365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05365");
        int[] intArray5 = new int[] { 0, (byte) 10, (-1), 10, '4' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (short) -1, (int) (short) 100);
    }

    @Test
    public void test05366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05366");
        int[] intArray6 = new int[] { '#', '#', (byte) 1, (byte) 10, (short) 1, '#' };
        int[] intArray8 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 0, 1);
    }

    @Test
    public void test05367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05367");
        int[] intArray3 = new int[] { (short) 0, (byte) 1, '#' };
        int[] intArray8 = new int[] { (byte) -1, ' ', (short) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (short) 100, (int) 'a');
    }

    @Test
    public void test05368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05368");
        int[] intArray2 = new int[] { (short) 100, (short) 10 };
        int[] intArray9 = new int[] { ' ', (byte) 0, 10, (byte) 1, (short) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (byte) 1, (int) 'a');
    }

    @Test
    public void test05369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05369");
        int[] intArray2 = new int[] { (byte) 1, (byte) 1 };
        int[] intArray5 = new int[] { 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (byte) 0, (int) (short) -1);
    }

    @Test
    public void test05370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05370");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 'a', (-1), (short) -1, '4', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) '4', (int) (byte) -1);
    }

    @Test
    public void test05371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05371");
        int[] intArray3 = new int[] { (byte) 0, (byte) 0, (short) -1 };
        int[] intArray10 = new int[] { 1, (-1), 0, (byte) -1, 'a', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (byte) 0, (int) (short) 1);
    }

    @Test
    public void test05372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05372");
        int[] intArray2 = new int[] { (byte) 1, (byte) 1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 0, (int) (short) 0);
    }

    @Test
    public void test05373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05373");
        int[] intArray5 = new int[] { 0, ' ', (-1), 1, (short) 100 };
        int[] intArray8 = new int[] { (byte) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) 'a', (int) (short) 10);
    }

    @Test
    public void test05374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05374");
        int[] intArray2 = new int[] { '4', (byte) 100 };
        int[] intArray9 = new int[] { '#', (-1), ' ', 0, (short) 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) '#', (int) (byte) 10);
    }

    @Test
    public void test05375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05375");
        int[] intArray5 = new int[] { (byte) 10, 'a', (byte) 10, (byte) -1, '4' };
        int[] intArray12 = new int[] { (byte) 0, (byte) 10, (short) 1, (-1), (short) 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, 0, (int) (short) 10);
    }

    @Test
    public void test05376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05376");
        int[] intArray5 = new int[] { (byte) 10, (short) 10, (byte) 1, (short) 100, '#' };
        int[] intArray9 = new int[] { (byte) -1, (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 0, (int) (byte) 10);
    }

    @Test
    public void test05377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05377");
        int[] intArray5 = new int[] { (short) -1, 10, (short) 10, 10, (byte) 0 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) ' ', 0);
    }

    @Test
    public void test05378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05378");
        int[] intArray5 = new int[] { (short) -1, '#', 10, '4', (byte) 1 };
        int[] intArray7 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) 0, (int) (byte) -1);
    }

    @Test
    public void test05379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05379");
        int[] intArray1 = new int[] { '#' };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) '#', (int) (short) 0);
    }

    @Test
    public void test05380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05380");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (byte) -1, (int) (byte) -1);
    }

    @Test
    public void test05381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05381");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test05382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05382");
        int[] intArray4 = new int[] { '#', 0, 10, (byte) 1 };
        int[] intArray11 = new int[] { '#', 0, (short) 0, (short) 1, 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) '#', (int) (short) 0);
    }

    @Test
    public void test05383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05383");
        int[] intArray2 = new int[] { (byte) -1, (short) 100 };
        int[] intArray9 = new int[] { ' ', (short) 1, 10, (short) 0, (byte) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (byte) 10, (int) (short) 1);
    }

    @Test
    public void test05384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05384");
        int[] intArray4 = new int[] { 0, 0, (byte) 10, (short) 100 };
        int[] intArray8 = new int[] { (byte) 0, ' ', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 1, (int) (byte) -1);
    }

    @Test
    public void test05385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05385");
        int[] intArray1 = new int[] { 0 };
        int[] intArray5 = new int[] { 10, (short) 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) ' ', (int) (short) 100);
    }

    @Test
    public void test05386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05386");
        int[] intArray5 = new int[] { (short) 100, '4', 10, 1, (byte) 10 };
        int[] intArray7 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) '#', 100);
    }

    @Test
    public void test05387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05387");
        int[] intArray5 = new int[] { (byte) -1, 100, (short) -1, (-1), 0 };
        int[] intArray7 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, 0, (int) ' ');
    }

    @Test
    public void test05388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05388");
        int[] intArray2 = new int[] { 10, '#' };
        int[] intArray6 = new int[] { (short) 10, (short) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 0, (int) (short) 0);
    }

    @Test
    public void test05389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05389");
        int[] intArray5 = new int[] { (short) 10, 0, 100, '#', (short) 1 };
        int[] intArray9 = new int[] { '4', (byte) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 10, (int) (byte) -1);
    }

    @Test
    public void test05390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05390");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray5 = new int[] { (byte) 1, ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (byte) 1, (int) (short) 100);
    }

    @Test
    public void test05391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05391");
        int[] intArray4 = new int[] { (byte) 100, 10, 0, (short) 1 };
        int[] intArray8 = new int[] { (short) 10, 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test05392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05392");
        int[] intArray2 = new int[] { '#', (-1) };
        int[] intArray8 = new int[] { (byte) 1, (short) 1, '4', ' ', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 0, 0);
    }

    @Test
    public void test05393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05393");
        int[] intArray1 = new int[] { '4' };
        int[] intArray3 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, 0, (int) (byte) -1);
    }

    @Test
    public void test05394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05394");
        int[] intArray5 = new int[] { 1, (short) 100, (byte) 100, (short) 100, (short) 1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) 0, (int) (short) -1);
    }

    @Test
    public void test05395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05395");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 10, (-1));
    }

    @Test
    public void test05396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05396");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) '4', (int) (byte) 100);
    }

    @Test
    public void test05397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05397");
        int[] intArray6 = new int[] { (byte) 10, (byte) 0, (byte) 10, '#', '4', (short) -1 };
        int[] intArray12 = new int[] { 'a', (-1), ' ', 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (byte) -1, (int) (byte) 1);
    }

    @Test
    public void test05398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05398");
        int[] intArray2 = new int[] { 10, (-1) };
        int[] intArray6 = new int[] { (short) 0, (-1), 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (short) 100, 1);
    }

    @Test
    public void test05399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05399");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray4 = new int[] { (short) 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) -1, 0);
    }

    @Test
    public void test05400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05400");
        int[] intArray5 = new int[] { (byte) 1, (byte) 100, (byte) -1, (short) -1, (byte) -1 };
        int[] intArray10 = new int[] { (byte) 10, (byte) -1, (short) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 100, (int) (byte) 0);
    }

    @Test
    public void test05401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05401");
        int[] intArray3 = new int[] { (byte) 0, 100, (byte) 100 };
        int[] intArray6 = new int[] { (short) 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test05402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05402");
        int[] intArray3 = new int[] { (short) 10, (byte) 100, '#' };
        int[] intArray9 = new int[] { (byte) 10, (short) -1, '4', (byte) -1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (byte) 1, (int) ' ');
    }

    @Test
    public void test05403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05403");
        int[] intArray5 = new int[] { (byte) 0, 'a', (short) 0, (short) 10, '#' };
        int[] intArray7 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) '#', (int) (byte) -1);
    }

    @Test
    public void test05404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05404");
        int[] intArray5 = new int[] { (byte) -1, '4', ' ', (short) 1, (byte) 0 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) '#', 10);
    }

    @Test
    public void test05405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05405");
        int[] intArray1 = new int[] { '#' };
        int[] intArray8 = new int[] { 1, (short) 100, (short) 1, (byte) 100, (short) -1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) 100, (int) (byte) 1);
    }

    @Test
    public void test05406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05406");
        int[] intArray4 = new int[] { (byte) 0, 'a', 100, (-1) };
        int[] intArray7 = new int[] { 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) 0, (int) (byte) 1);
    }

    @Test
    public void test05407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05407");
        int[] intArray2 = new int[] { 'a', (short) 10 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) 100, 100);
    }

    @Test
    public void test05408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05408");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { '4', (short) 0, 'a', (byte) 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) 10, (int) (short) -1);
    }

    @Test
    public void test05409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05409");
        int[] intArray5 = new int[] { 100, 100, 100, (-1), '4' };
        int[] intArray11 = new int[] { 10, 10, (byte) 100, ' ', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) '4', 1);
    }

    @Test
    public void test05410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05410");
        int[] intArray3 = new int[] { (byte) -1, 10, (byte) 100 };
        int[] intArray5 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, 0, (int) (byte) -1);
    }

    @Test
    public void test05411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05411");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray6 = new int[] { '4', (short) 1, 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (short) 0, 10);
    }

    @Test
    public void test05412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05412");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (byte) 10, (int) (byte) 10);
    }

    @Test
    public void test05413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05413");
        int[] intArray6 = new int[] { '4', (short) 10, '4', 10, (byte) 100, (short) 10 };
        int[] intArray9 = new int[] { '#', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 0, 0);
    }

    @Test
    public void test05414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05414");
        int[] intArray6 = new int[] { 'a', (short) 1, (byte) 100, 'a', (byte) 1, (byte) 10 };
        int[] intArray8 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) -1, (int) (short) 1);
    }

    @Test
    public void test05415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05415");
        int[] intArray2 = new int[] { 10, (byte) 10 };
        int[] intArray9 = new int[] { ' ', '#', (-1), (short) -1, 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (short) 0, 0);
    }

    @Test
    public void test05416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05416");
        int[] intArray5 = new int[] { '4', (short) -1, '4', 'a', (byte) -1 };
        int[] intArray8 = new int[] { (byte) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) 10, 0);
    }

    @Test
    public void test05417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05417");
        int[] intArray4 = new int[] { (short) 1, 10, (short) 0, (short) 0 };
        int[] intArray7 = new int[] { 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 1, (int) (short) 10);
    }

    @Test
    public void test05418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05418");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) -1, 1, ' ', (byte) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) -1, 1);
    }

    @Test
    public void test05419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05419");
        int[] intArray2 = new int[] { '#', '4' };
        int[] intArray8 = new int[] { '#', (byte) 0, '4', '4', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) 10, (int) 'a');
    }

    @Test
    public void test05420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05420");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (-1), 'a', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) 10, (int) ' ');
    }

    @Test
    public void test05421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05421");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) '#', (int) (byte) -1);
    }

    @Test
    public void test05422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05422");
        int[] intArray6 = new int[] { (short) 0, ' ', ' ', (byte) -1, (short) 100, 1 };
        int[] intArray10 = new int[] { (-1), 'a', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 0, (int) 'a');
    }

    @Test
    public void test05423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05423");
        int[] intArray3 = new int[] { (byte) 1, 10, (byte) 10 };
        int[] intArray10 = new int[] { (byte) 10, (byte) -1, 0, 10, 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (byte) 100, 10);
    }

    @Test
    public void test05424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05424");
        int[] intArray6 = new int[] { (short) 10, (short) -1, (short) 10, (short) 1, (byte) 100, (short) 0 };
        int[] intArray8 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 0, (int) (byte) 0);
    }

    @Test
    public void test05425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05425");
        int[] intArray3 = new int[] { (byte) 100, (byte) 1, (byte) 10 };
        int[] intArray8 = new int[] { 'a', (short) 1, 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (short) -1, (int) '4');
    }

    @Test
    public void test05426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05426");
        int[] intArray6 = new int[] { (short) 10, (short) 0, 'a', 1, 10, (byte) 1 };
        int[] intArray12 = new int[] { (short) 10, (byte) 0, (short) 0, '4', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) '#', (-1));
    }

    @Test
    public void test05427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05427");
        int[] intArray2 = new int[] { (-1), (-1) };
        int[] intArray4 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 100, (int) (short) -1);
    }

    @Test
    public void test05428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05428");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 1, (int) (short) 0);
    }

    @Test
    public void test05429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05429");
        int[] intArray2 = new int[] { (byte) -1, (byte) 100 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (-1), 10);
    }

    @Test
    public void test05430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05430");
        int[] intArray3 = new int[] { (short) 10, ' ', '4' };
        int[] intArray10 = new int[] { (short) 0, (short) 1, 1, (short) 0, (byte) 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 100, (int) ' ');
    }

    @Test
    public void test05431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05431");
        int[] intArray6 = new int[] { (short) -1, (short) 1, 10, ' ', '4', 100 };
        int[] intArray9 = new int[] { (byte) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 100, (int) (short) 100);
    }

    @Test
    public void test05432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05432");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray6 = new int[] { (byte) 1, (short) -1, 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test05433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05433");
        int[] intArray6 = new int[] { (byte) 100, 'a', '#', (short) -1, (byte) -1, 'a' };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) 100, (-1));
    }

    @Test
    public void test05434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05434");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) '4', 100);
    }

    @Test
    public void test05435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05435");
        int[] intArray2 = new int[] { (byte) 1, (byte) 10 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) '#', (int) (byte) 0);
    }

    @Test
    public void test05436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05436");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) 'a', (-1));
    }

    @Test
    public void test05437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05437");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) ' ', (int) (byte) 10);
    }

    @Test
    public void test05438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05438");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray8 = new int[] { (byte) 100, (short) 10, ' ', (byte) 0, (-1), (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) -1, (int) (short) 1);
    }

    @Test
    public void test05439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05439");
        int[] intArray3 = new int[] { (short) 0, 1, (short) 100 };
        int[] intArray5 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) 1, 1);
    }

    @Test
    public void test05440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05440");
        int[] intArray3 = new int[] { '#', (short) 10, (byte) 0 };
        int[] intArray5 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) '4', 0);
    }

    @Test
    public void test05441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05441");
        int[] intArray2 = new int[] { (byte) 100, (byte) 10 };
        int[] intArray5 = new int[] { (short) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test05442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05442");
        int[] intArray6 = new int[] { 10, (byte) 100, (short) 100, '4', '4', (short) 0 };
        int[] intArray9 = new int[] { 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (short) 100, (int) '#');
    }

    @Test
    public void test05443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05443");
        int[] intArray5 = new int[] { (short) 100, 'a', 10, 0, ' ' };
        int[] intArray7 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) 1, 100);
    }

    @Test
    public void test05444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05444");
        int[] intArray4 = new int[] { (byte) 100, (byte) 1, '#', (byte) 1 };
        int[] intArray6 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) ' ', (int) (byte) 1);
    }

    @Test
    public void test05445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05445");
        int[] intArray3 = new int[] { (short) 10, 1, 'a' };
        int[] intArray6 = new int[] { (byte) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test05446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05446");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray5 = new int[] { (byte) -1, (short) -1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (-1), (int) (byte) 0);
    }

    @Test
    public void test05447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05447");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) '#', (int) (byte) 10);
    }

    @Test
    public void test05448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05448");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray7 = new int[] { 0, (-1), 0, (byte) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) 100, 100);
    }

    @Test
    public void test05449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05449");
        int[] intArray3 = new int[] { (short) 0, '#', 10 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, 100, (int) (short) 100);
    }

    @Test
    public void test05450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05450");
        int[] intArray2 = new int[] { 0, (short) 10 };
        int[] intArray5 = new int[] { (byte) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 0, (int) (short) 1);
    }

    @Test
    public void test05451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05451");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray5 = new int[] { (short) 100, (byte) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, 1, 0);
    }

    @Test
    public void test05452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05452");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray3 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test05453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05453");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray4 = new int[] { (short) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 10, (int) (short) -1);
    }

    @Test
    public void test05454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05454");
        int[] intArray4 = new int[] { (byte) -1, 'a', (short) 10, (short) -1 };
        int[] intArray8 = new int[] { (short) 10, (short) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 0, (int) ' ');
    }

    @Test
    public void test05455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05455");
        int[] intArray4 = new int[] { 1, 100, 0, (-1) };
        int[] intArray9 = new int[] { 10, (-1), (byte) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) 10, (int) '#');
    }

    @Test
    public void test05456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05456");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray8 = new int[] { (short) 100, (-1), '#', 10, '#', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) 1, 10);
    }

    @Test
    public void test05457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05457");
        int[] intArray3 = new int[] { '#', ' ', 1 };
        int[] intArray10 = new int[] { 1, 0, (short) 0, (short) 0, (byte) 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) '#', (int) (byte) 0);
    }

    @Test
    public void test05458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05458");
        int[] intArray3 = new int[] { (byte) 10, (byte) 100, (byte) 100 };
        int[] intArray5 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (-1), 1);
    }

    @Test
    public void test05459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05459");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 100, 100);
    }

    @Test
    public void test05460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05460");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 0, 1, (byte) 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) -1, (int) (short) -1);
    }

    @Test
    public void test05461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05461");
        int[] intArray5 = new int[] { 100, (byte) 10, (short) 100, '4', 1 };
        int[] intArray10 = new int[] { (-1), 'a', (byte) 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (byte) 1, 10);
    }

    @Test
    public void test05462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05462");
        int[] intArray6 = new int[] { 1, '4', '4', 10, 0, 10 };
        int[] intArray11 = new int[] { 'a', (byte) 1, (short) -1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) ' ', (int) (short) 0);
    }

    @Test
    public void test05463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05463");
        int[] intArray3 = new int[] { (byte) 0, '#', (byte) 10 };
        int[] intArray8 = new int[] { (short) 1, (byte) 100, ' ', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (short) -1, 0);
    }

    @Test
    public void test05464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05464");
        int[] intArray2 = new int[] { (byte) 1, (short) 100 };
        int[] intArray9 = new int[] { (short) 10, 10, 'a', (byte) 0, (short) 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 100, (int) ' ');
    }

    @Test
    public void test05465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05465");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (-1), 10, (byte) 0, (-1), (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) 100, 100);
    }

    @Test
    public void test05466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05466");
        int[] intArray4 = new int[] { 1, (short) 1, (short) 0, (byte) -1 };
        int[] intArray11 = new int[] { 0, (byte) 100, '#', (byte) 100, (short) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, 100, (int) (short) 10);
    }

    @Test
    public void test05467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05467");
        int[] intArray2 = new int[] { (byte) -1, (short) 100 };
        int[] intArray4 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 1, (int) (byte) 100);
    }

    @Test
    public void test05468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05468");
        int[] intArray4 = new int[] { (short) 1, (short) 10, (byte) 1, '4' };
        int[] intArray8 = new int[] { ' ', (byte) 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 100, (int) '4');
    }

    @Test
    public void test05469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05469");
        int[] intArray6 = new int[] { (byte) 100, 'a', 'a', (byte) 10, (byte) 0, 100 };
        int[] intArray10 = new int[] { '4', (short) 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) -1, (-1));
    }

    @Test
    public void test05470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05470");
        int[] intArray5 = new int[] { (short) 100, (short) 1, (byte) 0, (short) -1, (byte) 1 };
        int[] intArray11 = new int[] { (-1), (byte) 100, (byte) -1, (byte) -1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) ' ', (int) (byte) -1);
    }

    @Test
    public void test05471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05471");
        int[] intArray3 = new int[] { (byte) 1, 1, 1 };
        int[] intArray7 = new int[] { '#', (byte) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) 100, (int) (byte) 100);
    }

    @Test
    public void test05472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05472");
        int[] intArray3 = new int[] { (short) -1, '4', 'a' };
        int[] intArray8 = new int[] { (short) -1, 1, (byte) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (byte) 100, 0);
    }

    @Test
    public void test05473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05473");
        int[] intArray2 = new int[] { (byte) 1, (short) 100 };
        int[] intArray4 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) '#', (int) (short) 10);
    }

    @Test
    public void test05474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05474");
        int[] intArray3 = new int[] { (short) 10, (byte) 10, (byte) 0 };
        int[] intArray7 = new int[] { 'a', 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) 100, (int) ' ');
    }

    @Test
    public void test05475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05475");
        int[] intArray3 = new int[] { (short) -1, (byte) 10, '#' };
        int[] intArray6 = new int[] { ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, 0, (int) (byte) 1);
    }

    @Test
    public void test05476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05476");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, 1, (int) (short) 100);
    }

    @Test
    public void test05477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05477");
        int[] intArray4 = new int[] { 100, (short) 100, 'a', 1 };
        int[] intArray9 = new int[] { '#', ' ', 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (byte) 100, (int) (short) 100);
    }

    @Test
    public void test05478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05478");
        int[] intArray2 = new int[] { (byte) 10, (short) 1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 0, (-1));
    }

    @Test
    public void test05479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05479");
        int[] intArray2 = new int[] { (short) 0, 0 };
        int[] intArray4 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (short) 0, (int) (byte) 1);
    }

    @Test
    public void test05480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05480");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (short) 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) '4', 0);
    }

    @Test
    public void test05481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05481");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray7 = new int[] { 0, (short) 0, 'a', (byte) 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, 0, 100);
    }

    @Test
    public void test05482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05482");
        int[] intArray2 = new int[] { (short) 100, 1 };
        int[] intArray6 = new int[] { (-1), (byte) -1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 10, (int) (short) -1);
    }

    @Test
    public void test05483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05483");
        int[] intArray5 = new int[] { (byte) 0, '#', (byte) 0, 1, (short) 0 };
        int[] intArray7 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) 1, (int) (short) 0);
    }

    @Test
    public void test05484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05484");
        int[] intArray4 = new int[] { (short) 1, 1, (short) 10, (byte) 1 };
        int[] intArray8 = new int[] { ' ', (byte) -1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) '4', 1);
    }

    @Test
    public void test05485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05485");
        int[] intArray2 = new int[] { 10, 'a' };
        int[] intArray4 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 1, (int) (byte) 1);
    }

    @Test
    public void test05486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05486");
        int[] intArray4 = new int[] { 10, (short) 1, (-1), (short) 1 };
        int[] intArray7 = new int[] { '#', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) '#', (int) (short) 1);
    }

    @Test
    public void test05487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05487");
        int[] intArray4 = new int[] { 'a', 0, 0, 10 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, 0, (int) (byte) 1);
    }

    @Test
    public void test05488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05488");
        int[] intArray5 = new int[] { (short) 100, (-1), (short) 10, (byte) -1, (short) 0 };
        int[] intArray9 = new int[] { (byte) 10, (byte) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (byte) 0, (int) (byte) 1);
    }

    @Test
    public void test05489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05489");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) 0, ' ', (byte) 0, (short) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) -1, (-1));
    }

    @Test
    public void test05490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05490");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { ' ', (short) 0, ' ', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) 0, (int) (byte) -1);
    }

    @Test
    public void test05491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05491");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray7 = new int[] { (short) 0, (byte) 1, (byte) 1, '4', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, 1, (int) (short) 100);
    }

    @Test
    public void test05492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05492");
        int[] intArray5 = new int[] { (byte) 0, (short) 10, (short) 0, (short) -1, ' ' };
        int[] intArray10 = new int[] { 1, 'a', 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 0, (int) 'a');
    }

    @Test
    public void test05493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05493");
        int[] intArray2 = new int[] { 100, '#' };
        int[] intArray6 = new int[] { (short) 10, ' ', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) -1, 0);
    }

    @Test
    public void test05494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05494");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { ' ', 10, '#', (byte) 0, (short) 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test05495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05495");
        int[] intArray5 = new int[] { (byte) -1, 'a', 100, 'a', 10 };
        int[] intArray10 = new int[] { (byte) 1, (-1), (byte) 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (short) -1, (int) (short) -1);
    }

    @Test
    public void test05496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05496");
        int[] intArray2 = new int[] { (byte) 0, (byte) 100 };
        int[] intArray5 = new int[] { (byte) 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (byte) 1, (int) '#');
    }

    @Test
    public void test05497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05497");
        int[] intArray2 = new int[] { (short) 100, ' ' };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) ' ', (int) (short) 10);
    }

    @Test
    public void test05498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05498");
        int[] intArray2 = new int[] { (byte) 10, (byte) -1 };
        int[] intArray9 = new int[] { (short) 10, (short) 1, ' ', (byte) 1, 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (short) 10, (int) (short) 10);
    }

    @Test
    public void test05499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05499");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray6 = new int[] { (short) 100, (byte) 100, 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test05500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test05500");
        int[] intArray5 = new int[] { ' ', (byte) 10, (byte) 10, 0, (short) -1 };
        int[] intArray12 = new int[] { '4', (-1), (short) 0, ' ', (short) 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) 0, 100);
    }
}
