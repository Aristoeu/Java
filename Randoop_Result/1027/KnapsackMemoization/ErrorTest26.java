package KnapsackMemoization;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest26 {

    public static boolean debug = false;

    @Test
    public void test13001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13001");
        int[] intArray4 = new int[] { 'a', (short) 0, (short) -1, (byte) 1 };
        int[] intArray11 = new int[] { 1, (byte) 1, 'a', 1, (byte) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (byte) 100, (int) 'a');
    }

    @Test
    public void test13002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13002");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 1, (short) 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, 0, 0);
    }

    @Test
    public void test13003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13003");
        int[] intArray2 = new int[] { (byte) 1, (byte) 10 };
        int[] intArray9 = new int[] { (short) -1, 'a', (short) -1, 'a', 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 0, (int) '4');
    }

    @Test
    public void test13004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13004");
        int[] intArray2 = new int[] { (byte) 1, (-1) };
        int[] intArray7 = new int[] { '#', 'a', (short) 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) -1, (int) (byte) 0);
    }

    @Test
    public void test13005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13005");
        int[] intArray5 = new int[] { (byte) -1, 0, '4', (byte) 10, (byte) 0 };
        int[] intArray8 = new int[] { (byte) 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 100, (int) (byte) 10);
    }

    @Test
    public void test13006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13006");
        int[] intArray2 = new int[] { (byte) 1, (byte) 0 };
        int[] intArray9 = new int[] { (byte) 0, (short) -1, (short) 10, (byte) 0, 'a', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 0, 0);
    }

    @Test
    public void test13007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13007");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray4 = new int[] { (short) 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, 0, (int) 'a');
    }

    @Test
    public void test13008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13008");
        int[] intArray3 = new int[] { (short) 0, (byte) 10, (-1) };
        int[] intArray6 = new int[] { (short) 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) 1, (-1));
    }

    @Test
    public void test13009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13009");
        int[] intArray6 = new int[] { (-1), (short) 1, ' ', (short) -1, 1, (-1) };
        int[] intArray9 = new int[] { (byte) 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test13010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13010");
        int[] intArray6 = new int[] { (-1), 100, (short) 10, 10, (short) -1, (short) 10 };
        int[] intArray11 = new int[] { (-1), '4', 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 0, (int) (byte) 100);
    }

    @Test
    public void test13011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13011");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 100, 100, 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 1, (int) (byte) 10);
    }

    @Test
    public void test13012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13012");
        int[] intArray6 = new int[] { '#', 'a', 100, (byte) 0, 10, (short) 10 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test13013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13013");
        int[] intArray3 = new int[] { 100, 1, (short) 1 };
        int[] intArray9 = new int[] { (byte) -1, ' ', (short) 1, (short) 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (short) 1, 100);
    }

    @Test
    public void test13014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13014");
        int[] intArray5 = new int[] { '4', 'a', 1, '4', 0 };
        int[] intArray7 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, 1, 10);
    }

    @Test
    public void test13015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13015");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 1, (short) 10, (short) 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) '#', 10);
    }

    @Test
    public void test13016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13016");
        int[] intArray5 = new int[] { (byte) 10, (short) -1, 100, 100, ' ' };
        int[] intArray9 = new int[] { (byte) 1, (byte) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (byte) -1, (int) '4');
    }

    @Test
    public void test13017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13017");
        int[] intArray4 = new int[] { 10, (-1), (short) 10, (short) 10 };
        int[] intArray10 = new int[] { (byte) -1, 0, (byte) 0, 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) 0, 0);
    }

    @Test
    public void test13018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13018");
        int[] intArray6 = new int[] { '4', 'a', '4', (short) -1, 0, (short) 1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (-1), 0);
    }

    @Test
    public void test13019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13019");
        int[] intArray2 = new int[] { '#', (byte) 10 };
        int[] intArray6 = new int[] { (byte) 10, (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) 'a', (int) (short) 100);
    }

    @Test
    public void test13020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13020");
        int[] intArray6 = new int[] { 10, (short) 100, (byte) 10, (byte) 1, (-1), (short) 100 };
        int[] intArray12 = new int[] { (byte) 1, '4', (byte) 0, ' ', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) ' ', (int) 'a');
    }

    @Test
    public void test13021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13021");
        int[] intArray1 = new int[] { 0 };
        int[] intArray8 = new int[] { 1, (byte) 100, (short) 1, '#', (byte) 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) '#', (int) (short) 1);
    }

    @Test
    public void test13022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13022");
        int[] intArray6 = new int[] { 1, '#', (byte) 1, (byte) -1, (short) 100, 0 };
        int[] intArray8 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (byte) 0, (int) (short) 1);
    }

    @Test
    public void test13023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13023");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) -1, (short) 100, 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 0, (int) '#');
    }

    @Test
    public void test13024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13024");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, 1, (-1));
    }

    @Test
    public void test13025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13025");
        int[] intArray5 = new int[] { ' ', (byte) 1, (byte) 1, (byte) -1, (short) 1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (-1), (int) (byte) 10);
    }

    @Test
    public void test13026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13026");
        int[] intArray4 = new int[] { (byte) 1, (byte) 1, ' ', 10 };
        int[] intArray7 = new int[] { (short) 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) 10, (-1));
    }

    @Test
    public void test13027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13027");
        int[] intArray2 = new int[] { 10, 100 };
        int[] intArray4 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) ' ', (int) (byte) 1);
    }

    @Test
    public void test13028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13028");
        int[] intArray6 = new int[] { (short) 10, (short) 100, '#', '4', (short) 10, (byte) 100 };
        int[] intArray8 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) '#', 0);
    }

    @Test
    public void test13029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13029");
        int[] intArray3 = new int[] { 0, (short) 10, (byte) -1 };
        int[] intArray9 = new int[] { (-1), 0, (-1), '4', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 10, (int) (byte) 100);
    }

    @Test
    public void test13030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13030");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (byte) 1, (int) '#');
    }

    @Test
    public void test13031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13031");
        int[] intArray6 = new int[] { (short) -1, 'a', '4', (byte) -1, (short) -1, (-1) };
        int[] intArray8 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) ' ', (int) (byte) -1);
    }

    @Test
    public void test13032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13032");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray3 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, 0, 100);
    }

    @Test
    public void test13033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13033");
        int[] intArray3 = new int[] { (byte) 0, (byte) 10, (byte) 0 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (byte) 0, (int) 'a');
    }

    @Test
    public void test13034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13034");
        int[] intArray3 = new int[] { ' ', (byte) 0, (short) 0 };
        int[] intArray9 = new int[] { (-1), (short) 100, '#', '#', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) ' ', 100);
    }

    @Test
    public void test13035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13035");
        int[] intArray6 = new int[] { (byte) 10, (byte) 100, (short) -1, 10, 10, (byte) -1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) 10, 100);
    }

    @Test
    public void test13036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13036");
        int[] intArray4 = new int[] { (short) 100, 1, (-1), 10 };
        int[] intArray6 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (-1), (int) ' ');
    }

    @Test
    public void test13037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13037");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (byte) -1, (int) (short) 1);
    }

    @Test
    public void test13038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13038");
        int[] intArray2 = new int[] { (short) 100, 'a' };
        int[] intArray8 = new int[] { (short) 10, (byte) 10, 10, 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (-1), (int) (short) 10);
    }

    @Test
    public void test13039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13039");
        int[] intArray3 = new int[] { (short) 10, '#', (short) 100 };
        int[] intArray5 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) 100, (int) (short) 1);
    }

    @Test
    public void test13040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13040");
        int[] intArray4 = new int[] { (byte) 1, 'a', 10, ' ' };
        int[] intArray9 = new int[] { (-1), 1, (short) 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) 'a', 0);
    }

    @Test
    public void test13041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13041");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 0, (-1));
    }

    @Test
    public void test13042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13042");
        int[] intArray4 = new int[] { (byte) 0, 100, 1, (short) 0 };
        int[] intArray11 = new int[] { (byte) 100, (-1), (byte) 100, (-1), (byte) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) 'a', (int) '4');
    }

    @Test
    public void test13043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13043");
        int[] intArray6 = new int[] { (short) -1, (short) 1, (byte) -1, (byte) 1, 100, (-1) };
        int[] intArray13 = new int[] { ' ', (short) 10, ' ', '4', (short) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (-1), (int) 'a');
    }

    @Test
    public void test13044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13044");
        int[] intArray6 = new int[] { (short) 10, (byte) -1, (byte) -1, 10, 0, 100 };
        int[] intArray8 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) -1, 100);
    }

    @Test
    public void test13045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13045");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) '4', (-1));
    }

    @Test
    public void test13046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13046");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray6 = new int[] { 0, 'a', (short) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (byte) 10, 0);
    }

    @Test
    public void test13047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13047");
        int[] intArray2 = new int[] { (short) 10, ' ' };
        int[] intArray9 = new int[] { (short) 0, 'a', (byte) -1, (short) 100, (byte) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (short) 100, 10);
    }

    @Test
    public void test13048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13048");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (byte) 1, (int) (short) 0);
    }

    @Test
    public void test13049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13049");
        int[] intArray4 = new int[] { (byte) -1, (short) 100, (short) 1, (byte) 100 };
        int[] intArray6 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, 10, (int) '4');
    }

    @Test
    public void test13050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13050");
        int[] intArray6 = new int[] { (short) 0, (byte) 0, (short) 100, '#', '#', '4' };
        int[] intArray9 = new int[] { (short) 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (short) 1, (int) (short) 10);
    }

    @Test
    public void test13051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13051");
        int[] intArray6 = new int[] { (short) 10, 1, 'a', '4', (byte) 1, (byte) 0 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, 100, (int) (short) 10);
    }

    @Test
    public void test13052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13052");
        int[] intArray3 = new int[] { '4', ' ', '4' };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, 100, (int) (byte) 10);
    }

    @Test
    public void test13053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13053");
        int[] intArray5 = new int[] { 0, (byte) 0, 1, (byte) 10, '#' };
        int[] intArray9 = new int[] { 100, 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test13054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13054");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 0, (byte) 100, 'a', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 10, (int) ' ');
    }

    @Test
    public void test13055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13055");
        int[] intArray5 = new int[] { (byte) -1, (-1), 10, '#', (short) 0 };
        int[] intArray7 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (-1), (int) (short) 10);
    }

    @Test
    public void test13056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13056");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (byte) 100, 0);
    }

    @Test
    public void test13057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13057");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) 'a', 0);
    }

    @Test
    public void test13058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13058");
        int[] intArray6 = new int[] { 'a', (short) -1, (short) 100, (byte) -1, (short) -1, (short) -1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) 100, 0);
    }

    @Test
    public void test13059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13059");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, 0, 100);
    }

    @Test
    public void test13060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13060");
        int[] intArray5 = new int[] { 10, (byte) 10, (short) 1, '4', (short) 100 };
        int[] intArray9 = new int[] { ' ', 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (byte) -1, (int) (byte) -1);
    }

    @Test
    public void test13061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13061");
        int[] intArray4 = new int[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, 100, (int) (short) 10);
    }

    @Test
    public void test13062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13062");
        int[] intArray6 = new int[] { '#', (short) -1, (short) 0, (byte) 100, (short) 10, 0 };
        int[] intArray9 = new int[] { (short) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) ' ', (int) (short) 1);
    }

    @Test
    public void test13063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13063");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray8 = new int[] { (short) -1, (byte) 10, (byte) 10, (short) 1, (byte) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) -1, (int) (byte) 10);
    }

    @Test
    public void test13064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13064");
        int[] intArray2 = new int[] { 0, 1 };
        int[] intArray8 = new int[] { (short) 100, 10, 1, '4', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (-1), (int) (byte) 1);
    }

    @Test
    public void test13065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13065");
        int[] intArray4 = new int[] { (short) 0, (short) -1, (byte) -1, (byte) 0 };
        int[] intArray7 = new int[] { 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) 100, 1);
    }

    @Test
    public void test13066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13066");
        int[] intArray2 = new int[] { (byte) 1, (byte) 1 };
        int[] intArray6 = new int[] { (short) 1, 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) 'a', (int) (byte) -1);
    }

    @Test
    public void test13067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13067");
        int[] intArray5 = new int[] { 10, (byte) -1, (byte) 1, 100, (short) 100 };
        int[] intArray9 = new int[] { 1, 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (byte) 0, (int) (byte) 1);
    }

    @Test
    public void test13068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13068");
        int[] intArray5 = new int[] { 100, (-1), (byte) 100, (short) 10, ' ' };
        int[] intArray12 = new int[] { ' ', (short) 10, (-1), (short) 100, (-1), (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) 'a', (int) (short) 10);
    }

    @Test
    public void test13069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13069");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, 'a', (byte) 10 };
        int[] intArray9 = new int[] { '4', (byte) 1, (short) 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) 'a', (int) (short) -1);
    }

    @Test
    public void test13070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13070");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 1, (short) 10, 100, (byte) 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) 0, (int) '#');
    }

    @Test
    public void test13071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13071");
        int[] intArray4 = new int[] { (short) 0, 0, ' ', 100 };
        int[] intArray7 = new int[] { '#', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 100, (int) (short) -1);
    }

    @Test
    public void test13072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13072");
        int[] intArray5 = new int[] { (byte) 0, (short) 0, 0, (byte) 1, (-1) };
        int[] intArray8 = new int[] { (short) 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test13073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13073");
        int[] intArray2 = new int[] { (short) 1, (short) -1 };
        int[] intArray8 = new int[] { (byte) 10, (short) -1, (byte) 1, (byte) 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test13074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13074");
        int[] intArray2 = new int[] { 10, (short) 1 };
        int[] intArray4 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (-1), (int) (short) -1);
    }

    @Test
    public void test13075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13075");
        int[] intArray4 = new int[] { (byte) 100, ' ', (short) -1, 0 };
        int[] intArray7 = new int[] { (short) 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 1, (int) ' ');
    }

    @Test
    public void test13076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13076");
        int[] intArray2 = new int[] { (byte) 100, (byte) 0 };
        int[] intArray4 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (byte) 1, 1);
    }

    @Test
    public void test13077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13077");
        int[] intArray2 = new int[] { '4', (byte) 0 };
        int[] intArray6 = new int[] { (short) -1, (short) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) 'a', (int) (short) 0);
    }

    @Test
    public void test13078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13078");
        int[] intArray3 = new int[] { 100, '4', ' ' };
        int[] intArray7 = new int[] { (short) 100, 'a', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) 0, 0);
    }

    @Test
    public void test13079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13079");
        int[] intArray6 = new int[] { (short) 1, (short) 10, (-1), '#', (short) -1, 0 };
        int[] intArray11 = new int[] { 0, 1, (byte) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (short) 1, (int) (short) 100);
    }

    @Test
    public void test13080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13080");
        int[] intArray3 = new int[] { 0, '4', (short) 10 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) 10, (int) (short) 1);
    }

    @Test
    public void test13081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13081");
        int[] intArray4 = new int[] { (byte) -1, 100, (short) -1, (byte) 0 };
        int[] intArray6 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) -1, 100);
    }

    @Test
    public void test13082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13082");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) 0, 10, 100, ' ', (-1), (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, 1, 100);
    }

    @Test
    public void test13083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13083");
        int[] intArray1 = new int[] { 0 };
        int[] intArray7 = new int[] { 100, 'a', (-1), (byte) -1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, 10, (int) (byte) 0);
    }

    @Test
    public void test13084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13084");
        int[] intArray3 = new int[] { (short) 1, (byte) -1, (byte) 100 };
        int[] intArray8 = new int[] { ' ', '4', (byte) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test13085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13085");
        int[] intArray4 = new int[] { (byte) 100, (byte) 0, (byte) 0, (short) 0 };
        int[] intArray10 = new int[] { 'a', 100, 'a', (short) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, 10, (int) 'a');
    }

    @Test
    public void test13086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13086");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (-1), (int) ' ');
    }

    @Test
    public void test13087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13087");
        int[] intArray2 = new int[] { (-1), (-1) };
        int[] intArray6 = new int[] { 100, 'a', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (short) 10, 0);
    }

    @Test
    public void test13088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13088");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test13089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13089");
        int[] intArray5 = new int[] { (byte) 100, (short) 100, (byte) 10, 10, (short) 10 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (short) -1, 10);
    }

    @Test
    public void test13090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13090");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray3 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, 1, (int) (short) 0);
    }

    @Test
    public void test13091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13091");
        int[] intArray2 = new int[] { (-1), 'a' };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) 10, 0);
    }

    @Test
    public void test13092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13092");
        int[] intArray5 = new int[] { ' ', (short) 10, (byte) 100, (byte) -1, (short) 1 };
        int[] intArray10 = new int[] { (byte) 1, (byte) 100, (short) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 1, (int) (byte) 10);
    }

    @Test
    public void test13093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13093");
        int[] intArray5 = new int[] { (short) 100, 0, (short) 0, 100, '#' };
        int[] intArray11 = new int[] { (short) 0, (byte) 100, (byte) 100, 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) 1, (int) (byte) 100);
    }

    @Test
    public void test13094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13094");
        int[] intArray3 = new int[] { (byte) 1, (byte) -1, (byte) 10 };
        int[] intArray8 = new int[] { (short) 10, 'a', (byte) 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (byte) 0, (int) (short) -1);
    }

    @Test
    public void test13095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13095");
        int[] intArray1 = new int[] { 10 };
        int[] intArray4 = new int[] { '4', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test13096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13096");
        int[] intArray5 = new int[] { (byte) 1, (short) 1, (short) 10, '#', 0 };
        int[] intArray9 = new int[] { ' ', (byte) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 0, (int) (short) 100);
    }

    @Test
    public void test13097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13097");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 100, (-1), (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) 0, (int) (short) 100);
    }

    @Test
    public void test13098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13098");
        int[] intArray2 = new int[] { (byte) 1, 10 };
        int[] intArray8 = new int[] { (short) 100, (short) 0, (short) 0, ' ', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) -1, (int) (short) 100);
    }

    @Test
    public void test13099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13099");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) 0, 10);
    }

    @Test
    public void test13100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13100");
        int[] intArray4 = new int[] { '#', (byte) 10, (byte) -1, 10 };
        int[] intArray9 = new int[] { (short) 10, 10, (-1), '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 1, (int) ' ');
    }

    @Test
    public void test13101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13101");
        int[] intArray5 = new int[] { 100, 0, (byte) 1, 'a', (byte) 100 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test13102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13102");
        int[] intArray4 = new int[] { (short) 10, 10, ' ', '#' };
        int[] intArray7 = new int[] { '4', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 0, (int) (short) 10);
    }

    @Test
    public void test13103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13103");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (short) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 0, (int) (short) 100);
    }

    @Test
    public void test13104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13104");
        int[] intArray6 = new int[] { 'a', (byte) 100, (short) 100, 1, 1, 1 };
        int[] intArray10 = new int[] { 0, (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (short) 1, (int) '#');
    }

    @Test
    public void test13105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13105");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray8 = new int[] { (short) 10, '#', (short) 0, '#', (byte) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (-1), 0);
    }

    @Test
    public void test13106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13106");
        int[] intArray2 = new int[] { (short) 1, 10 };
        int[] intArray7 = new int[] { (short) 10, (short) 0, (byte) 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 0, 100);
    }

    @Test
    public void test13107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13107");
        int[] intArray6 = new int[] { '4', (byte) -1, '4', (byte) 1, (-1), (short) 10 };
        int[] intArray12 = new int[] { (byte) 0, 100, 'a', '4', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) 0, (int) (short) 100);
    }

    @Test
    public void test13108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13108");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (-1), (int) (short) 0);
    }

    @Test
    public void test13109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13109");
        int[] intArray5 = new int[] { (short) 100, (byte) 10, '4', '4', 0 };
        int[] intArray11 = new int[] { (byte) -1, (byte) 10, (byte) 10, (short) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) 10, (int) (short) 10);
    }

    @Test
    public void test13110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13110");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 10, (short) 1, ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 100, 10);
    }

    @Test
    public void test13111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13111");
        int[] intArray2 = new int[] { (-1), (short) 10 };
        int[] intArray5 = new int[] { 'a', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) ' ', (int) (byte) 10);
    }

    @Test
    public void test13112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13112");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { ' ', (short) 0, 10, (short) 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) -1, 0);
    }

    @Test
    public void test13113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13113");
        int[] intArray4 = new int[] { 1, (byte) -1, '#', 'a' };
        int[] intArray6 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, 0, (int) (byte) 100);
    }

    @Test
    public void test13114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13114");
        int[] intArray5 = new int[] { (byte) 100, (short) 10, (byte) 1, (short) 10, (byte) 100 };
        int[] intArray10 = new int[] { (byte) 100, (byte) 10, (-1), (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) ' ', (int) ' ');
    }

    @Test
    public void test13115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13115");
        int[] intArray1 = new int[] { '#' };
        int[] intArray3 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) '#', (int) (short) 10);
    }

    @Test
    public void test13116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13116");
        int[] intArray4 = new int[] { 100, 10, ' ', 100 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) ' ', (int) (byte) 0);
    }

    @Test
    public void test13117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13117");
        int[] intArray3 = new int[] { (short) 1, (short) 100, 10 };
        int[] intArray7 = new int[] { '#', 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) 100, (-1));
    }

    @Test
    public void test13118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13118");
        int[] intArray3 = new int[] { (-1), 10, '#' };
        int[] intArray6 = new int[] { '4', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test13119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13119");
        int[] intArray4 = new int[] { (-1), (byte) 100, (short) 0, (byte) 0 };
        int[] intArray11 = new int[] { (short) -1, (byte) 100, (short) 1, (byte) 100, 'a', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) ' ', (int) (byte) 0);
    }

    @Test
    public void test13120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13120");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (short) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) '#', 0);
    }

    @Test
    public void test13121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13121");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray6 = new int[] { '#', (short) 1, ' ', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (short) 1, (int) (short) 0);
    }

    @Test
    public void test13122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13122");
        int[] intArray3 = new int[] { (-1), 100, '#' };
        int[] intArray5 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) 'a', (int) 'a');
    }

    @Test
    public void test13123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13123");
        int[] intArray6 = new int[] { '#', 10, (short) 1, 'a', 100, 1 };
        int[] intArray11 = new int[] { 'a', (short) 100, 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (byte) 1, (int) (byte) -1);
    }

    @Test
    public void test13124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13124");
        int[] intArray2 = new int[] { (short) 100, 0 };
        int[] intArray7 = new int[] { ' ', (short) 0, (-1), (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 1, 10);
    }

    @Test
    public void test13125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13125");
        int[] intArray3 = new int[] { (short) 10, (short) 0, 'a' };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, 0, (int) (byte) 1);
    }

    @Test
    public void test13126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13126");
        int[] intArray6 = new int[] { (byte) 100, (byte) 0, 0, (short) 0, '4', '#' };
        int[] intArray11 = new int[] { (byte) 100, (short) 10, (short) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) '4', (int) (short) 0);
    }

    @Test
    public void test13127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13127");
        int[] intArray6 = new int[] { (short) -1, (short) -1, 100, '#', 'a', (byte) 1 };
        int[] intArray11 = new int[] { (short) 1, (short) 10, 'a', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) 'a', 0);
    }

    @Test
    public void test13128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13128");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray5 = new int[] { '#', (short) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) -1, (int) (byte) 0);
    }

    @Test
    public void test13129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13129");
        int[] intArray3 = new int[] { (short) 0, (short) 10, 100 };
        int[] intArray7 = new int[] { 1, 'a', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 0, (int) (short) 0);
    }

    @Test
    public void test13130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13130");
        int[] intArray4 = new int[] { (short) -1, (byte) 100, (short) 100, 100 };
        int[] intArray10 = new int[] { (byte) 0, (short) 10, 1, 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (byte) 100, (-1));
    }

    @Test
    public void test13131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13131");
        int[] intArray5 = new int[] { (byte) -1, (short) 0, 1, (byte) 10, 10 };
        int[] intArray12 = new int[] { 100, 100, (byte) 100, (byte) 100, (byte) -1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) 10, 1);
    }

    @Test
    public void test13132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13132");
        int[] intArray3 = new int[] { 'a', (byte) 100, (short) 0 };
        int[] intArray5 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) 10, (int) (byte) 10);
    }

    @Test
    public void test13133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13133");
        int[] intArray3 = new int[] { '#', '4', 'a' };
        int[] intArray8 = new int[] { (short) 0, (short) 10, (byte) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) 'a', (int) (byte) 100);
    }

    @Test
    public void test13134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13134");
        int[] intArray5 = new int[] { (byte) -1, (short) 100, (-1), '4', 'a' };
        int[] intArray9 = new int[] { (short) 10, (short) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (byte) 100, (-1));
    }

    @Test
    public void test13135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13135");
        int[] intArray2 = new int[] { (short) 1, 1 };
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (-1), 0);
    }

    @Test
    public void test13136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13136");
        int[] intArray2 = new int[] { (short) 100, '#' };
        int[] intArray8 = new int[] { 1, (short) 10, '4', (-1), (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) 100, 100);
    }

    @Test
    public void test13137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13137");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) 100, ' ', 100, (byte) 0, (short) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, 1, (int) ' ');
    }

    @Test
    public void test13138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13138");
        int[] intArray3 = new int[] { '#', '4', ' ' };
        int[] intArray5 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) -1, (int) (short) 1);
    }

    @Test
    public void test13139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13139");
        int[] intArray5 = new int[] { (byte) 10, (short) -1, 'a', '#', (byte) 100 };
        int[] intArray8 = new int[] { 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) 1, (int) (byte) 10);
    }

    @Test
    public void test13140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13140");
        int[] intArray2 = new int[] { ' ', (byte) 1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 10, (int) (byte) 10);
    }

    @Test
    public void test13141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13141");
        int[] intArray2 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray9 = new int[] { '#', (byte) 0, (byte) 100, (short) 0, (short) -1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (short) 0, 1);
    }

    @Test
    public void test13142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13142");
        int[] intArray5 = new int[] { (short) -1, 1, (byte) 0, (short) 1, (byte) 10 };
        int[] intArray11 = new int[] { (byte) 0, 0, (byte) 10, (byte) -1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) 10, (int) ' ');
    }

    @Test
    public void test13143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13143");
        int[] intArray6 = new int[] { (short) 0, 10, (byte) 10, 1, 1, (short) 0 };
        int[] intArray12 = new int[] { '4', (byte) 100, (byte) 0, (-1), (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) 10, (int) ' ');
    }

    @Test
    public void test13144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13144");
        int[] intArray1 = new int[] { 100 };
        int[] intArray4 = new int[] { 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 1, (int) (short) 1);
    }

    @Test
    public void test13145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13145");
        int[] intArray6 = new int[] { (-1), ' ', (byte) 1, 'a', ' ', 100 };
        int[] intArray13 = new int[] { ' ', '4', (short) 100, (byte) 1, (short) 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test13146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13146");
        int[] intArray2 = new int[] { '#', (short) 1 };
        int[] intArray7 = new int[] { 1, (byte) 0, (byte) 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 0, (int) (byte) -1);
    }

    @Test
    public void test13147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13147");
        int[] intArray2 = new int[] { '#', '#' };
        int[] intArray7 = new int[] { 1, '#', (short) 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) -1, (int) 'a');
    }

    @Test
    public void test13148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13148");
        int[] intArray6 = new int[] { (short) 0, (byte) 1, ' ', (short) -1, 'a', (byte) 10 };
        int[] intArray9 = new int[] { ' ', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 10, (int) (byte) 10);
    }

    @Test
    public void test13149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13149");
        int[] intArray2 = new int[] { (byte) 100, ' ' };
        int[] intArray4 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) 'a', (int) (byte) -1);
    }

    @Test
    public void test13150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13150");
        int[] intArray2 = new int[] { '4', (byte) 10 };
        int[] intArray7 = new int[] { (byte) 100, 10, (short) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test13151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13151");
        int[] intArray3 = new int[] { '4', (byte) -1, 0 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) 10, (int) (byte) 0);
    }

    @Test
    public void test13152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13152");
        int[] intArray5 = new int[] { (-1), (short) 100, 100, '#', (short) 100 };
        int[] intArray8 = new int[] { 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) -1, (int) (byte) 0);
    }

    @Test
    public void test13153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13153");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 0, 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) 10, (int) 'a');
    }

    @Test
    public void test13154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13154");
        int[] intArray3 = new int[] { (byte) 100, 100, (byte) 100 };
        int[] intArray9 = new int[] { ' ', ' ', (byte) -1, 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (byte) 10, (int) ' ');
    }

    @Test
    public void test13155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13155");
        int[] intArray6 = new int[] { (byte) 0, (short) 10, (short) -1, (byte) 0, '4', (short) -1 };
        int[] intArray13 = new int[] { '#', (short) 10, (short) 1, (short) 100, '#', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 100, (int) (byte) 10);
    }

    @Test
    public void test13156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13156");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (byte) -1, (short) 1, (short) 1, 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, 100, (int) (byte) -1);
    }

    @Test
    public void test13157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13157");
        int[] intArray1 = new int[] { 10 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) 100, (int) (short) 10);
    }

    @Test
    public void test13158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13158");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (-1), (int) '4');
    }

    @Test
    public void test13159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13159");
        int[] intArray4 = new int[] { (byte) -1, (short) 0, 10, '4' };
        int[] intArray9 = new int[] { (short) -1, (byte) 10, (short) -1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 10, (int) 'a');
    }

    @Test
    public void test13160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13160");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray8 = new int[] { (byte) 0, 'a', (byte) -1, (byte) 10, (short) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) 10, 1);
    }

    @Test
    public void test13161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13161");
        int[] intArray5 = new int[] { (short) 0, 1, (byte) -1, 100, (byte) 0 };
        int[] intArray9 = new int[] { (byte) 1, (byte) 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 0, (-1));
    }

    @Test
    public void test13162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13162");
        int[] intArray6 = new int[] { (short) 100, (short) 10, (byte) 0, (byte) 100, (short) 0, '4' };
        int[] intArray9 = new int[] { (short) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (-1), (int) (short) 10);
    }

    @Test
    public void test13163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13163");
        int[] intArray2 = new int[] { (byte) -1, (byte) 0 };
        int[] intArray7 = new int[] { (byte) -1, (short) 100, (byte) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 1, 1);
    }

    @Test
    public void test13164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13164");
        int[] intArray2 = new int[] { ' ', 0 };
        int[] intArray7 = new int[] { (byte) -1, (short) -1, 'a', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) -1, (int) (byte) 1);
    }

    @Test
    public void test13165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13165");
        int[] intArray3 = new int[] { (short) 100, (short) 1, 1 };
        int[] intArray6 = new int[] { (short) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, 0, (int) (byte) 0);
    }

    @Test
    public void test13166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13166");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) 1, (byte) 100, 1, (byte) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) 1, (int) (short) -1);
    }

    @Test
    public void test13167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13167");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) -1, '#', ' ', (byte) 0, (byte) 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) 'a', (int) (short) 10);
    }

    @Test
    public void test13168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13168");
        int[] intArray2 = new int[] { (short) 0, (short) 0 };
        int[] intArray8 = new int[] { (short) 10, (short) 1, 10, (short) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) ' ', (int) (byte) -1);
    }

    @Test
    public void test13169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13169");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 'a', (-1), (short) -1, 10, 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) 1, 1);
    }

    @Test
    public void test13170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13170");
        int[] intArray4 = new int[] { (byte) -1, (short) 0, (short) 10, (short) 100 };
        int[] intArray7 = new int[] { (-1), (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 100, 1);
    }

    @Test
    public void test13171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13171");
        int[] intArray4 = new int[] { (short) 10, (byte) 1, 'a', (byte) 0 };
        int[] intArray11 = new int[] { 1, (short) 100, '4', (byte) -1, (byte) -1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, 10, 0);
    }

    @Test
    public void test13172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13172");
        int[] intArray6 = new int[] { (byte) 100, (short) -1, (byte) -1, '4', 10, (short) 100 };
        int[] intArray10 = new int[] { (short) 1, '4', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (-1), (int) (short) 100);
    }

    @Test
    public void test13173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13173");
        int[] intArray4 = new int[] { (short) 0, 'a', (short) 100, (byte) 1 };
        int[] intArray9 = new int[] { 'a', (byte) 100, 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) '4', (int) (byte) 100);
    }

    @Test
    public void test13174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13174");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray3 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) '4', (int) (byte) 1);
    }

    @Test
    public void test13175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13175");
        int[] intArray6 = new int[] { (byte) 0, (short) 0, '#', (byte) -1, ' ', 0 };
        int[] intArray9 = new int[] { (short) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, 100, 0);
    }

    @Test
    public void test13176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13176");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) -1, 0);
    }

    @Test
    public void test13177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13177");
        int[] intArray4 = new int[] { (byte) 100, (byte) -1, 0, 10 };
        int[] intArray11 = new int[] { (-1), (short) 10, (short) 0, (byte) 1, (byte) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) 10, (int) (byte) 1);
    }

    @Test
    public void test13178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13178");
        int[] intArray4 = new int[] { (short) -1, 0, 10, (short) 0 };
        int[] intArray10 = new int[] { ' ', '4', (short) 1, (byte) 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) ' ', (-1));
    }

    @Test
    public void test13179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13179");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (byte) 1, (-1), (byte) 100, (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, 10, (int) ' ');
    }

    @Test
    public void test13180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13180");
        int[] intArray6 = new int[] { (short) 1, '4', (short) 1, 100, (byte) 10, (byte) 10 };
        int[] intArray12 = new int[] { ' ', '4', 100, (short) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) -1, (int) (short) 1);
    }

    @Test
    public void test13181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13181");
        int[] intArray5 = new int[] { (byte) 100, 'a', (byte) 100, 10, (short) 1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 100, (int) (byte) 0);
    }

    @Test
    public void test13182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13182");
        int[] intArray3 = new int[] { (byte) 0, (byte) -1, (-1) };
        int[] intArray10 = new int[] { (byte) 0, 1, (-1), (short) -1, (short) 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 0, (int) (byte) 0);
    }

    @Test
    public void test13183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest26.test13183");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) 1, '#', (byte) 1, 0, (-1), (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) 0, 0);
    }
}

