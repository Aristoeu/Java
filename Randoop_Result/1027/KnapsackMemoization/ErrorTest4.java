package KnapsackMemoization;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest4 {

    public static boolean debug = false;

    @Test
    public void test02001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02001");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray5 = new int[] { 'a', (byte) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (byte) 0, (int) (byte) 100);
    }

    @Test
    public void test02002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02002");
        int[] intArray5 = new int[] { 'a', 100, '#', (byte) 1, (short) 0 };
        int[] intArray9 = new int[] { '#', '#', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) 'a', (int) '#');
    }

    @Test
    public void test02003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02003");
        int[] intArray4 = new int[] { (short) 1, (byte) 10, '#', (byte) 1 };
        int[] intArray10 = new int[] { 0, '4', (short) 10, ' ', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, 0, (int) 'a');
    }

    @Test
    public void test02004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02004");
        int[] intArray6 = new int[] { (short) -1, ' ', (short) 100, 'a', '4', '4' };
        int[] intArray13 = new int[] { (short) 10, (-1), (short) 10, (-1), 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) ' ', (int) (short) -1);
    }

    @Test
    public void test02005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02005");
        int[] intArray3 = new int[] { ' ', (byte) -1, (short) 100 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) '#', (int) (short) 1);
    }

    @Test
    public void test02006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02006");
        int[] intArray5 = new int[] { '#', ' ', '4', (short) 100, (short) 0 };
        int[] intArray10 = new int[] { (byte) 100, (byte) -1, (short) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (short) 0, (-1));
    }

    @Test
    public void test02007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02007");
        int[] intArray5 = new int[] { (byte) -1, 0, 0, (short) 100, (short) 1 };
        int[] intArray8 = new int[] { ' ', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (-1), (int) (short) 10);
    }

    @Test
    public void test02008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02008");
        int[] intArray2 = new int[] { (short) 100, 1 };
        int[] intArray6 = new int[] { 1, (short) 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (short) 100, (int) ' ');
    }

    @Test
    public void test02009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02009");
        int[] intArray3 = new int[] { 'a', 10, 1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, 100, (int) (short) 100);
    }

    @Test
    public void test02010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02010");
        int[] intArray3 = new int[] { 0, 0, '#' };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (-1), (int) (short) 100);
    }

    @Test
    public void test02011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02011");
        int[] intArray3 = new int[] { 1, (byte) 100, (byte) 100 };
        int[] intArray9 = new int[] { 10, (short) 100, (byte) 10, (short) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 0, (int) (short) -1);
    }

    @Test
    public void test02012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02012");
        int[] intArray6 = new int[] { (-1), 1, ' ', (byte) 0, 1, '#' };
        int[] intArray9 = new int[] { (short) 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) ' ', (int) '#');
    }

    @Test
    public void test02013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02013");
        int[] intArray6 = new int[] { (short) 1, (-1), (short) 0, (byte) 0, 'a', (byte) 100 };
        int[] intArray9 = new int[] { (short) -1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, 10, (int) (byte) 1);
    }

    @Test
    public void test02014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02014");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test02015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02015");
        int[] intArray3 = new int[] { (byte) 10, (short) -1, (short) 10 };
        int[] intArray9 = new int[] { (short) 100, ' ', (short) 100, (byte) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 0, (int) (byte) -1);
    }

    @Test
    public void test02016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02016");
        int[] intArray3 = new int[] { (short) 0, (short) 100, ' ' };
        int[] intArray9 = new int[] { '4', 100, (-1), (short) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (byte) 0, (int) (short) -1);
    }

    @Test
    public void test02017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02017");
        int[] intArray5 = new int[] { 1, (byte) 10, (short) 0, '#', (byte) 10 };
        int[] intArray7 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test02018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02018");
        int[] intArray3 = new int[] { '#', (short) 1, 1 };
        int[] intArray10 = new int[] { 10, (byte) 1, 100, 10, (byte) 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 100, (int) (byte) 1);
    }

    @Test
    public void test02019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02019");
        int[] intArray6 = new int[] { '#', 'a', (byte) 1, 100, (byte) 1, (byte) 1 };
        int[] intArray8 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) 'a', (int) (byte) 100);
    }

    @Test
    public void test02020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02020");
        int[] intArray5 = new int[] { (byte) -1, '#', (short) 0, 10, (short) -1 };
        int[] intArray8 = new int[] { 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 1, 0);
    }

    @Test
    public void test02021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02021");
        int[] intArray4 = new int[] { 0, '4', (byte) 100, '#' };
        int[] intArray10 = new int[] { 10, (-1), '4', (short) 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) 'a', (int) (byte) 0);
    }

    @Test
    public void test02022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02022");
        int[] intArray6 = new int[] { (short) 1, (short) 100, (byte) 10, (short) 0, (byte) 0, '4' };
        int[] intArray13 = new int[] { (short) 100, ' ', '#', '#', (short) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (short) 100, 100);
    }

    @Test
    public void test02023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02023");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray6 = new int[] { 1, 1, (byte) 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test02024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02024");
        int[] intArray4 = new int[] { (short) 0, (byte) 1, (byte) 100, 100 };
        int[] intArray7 = new int[] { (short) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) 1, (int) ' ');
    }

    @Test
    public void test02025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02025");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (short) 0, (int) (byte) 100);
    }

    @Test
    public void test02026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02026");
        int[] intArray4 = new int[] { (byte) 10, (byte) 10, ' ', (short) 0 };
        int[] intArray6 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) '4', (int) 'a');
    }

    @Test
    public void test02027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02027");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray5 = new int[] { (byte) 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test02028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02028");
        int[] intArray5 = new int[] { (byte) -1, '4', '4', (short) 10, 100 };
        int[] intArray7 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) 1, (-1));
    }

    @Test
    public void test02029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02029");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) '#', (int) (short) 10);
    }

    @Test
    public void test02030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02030");
        int[] intArray6 = new int[] { (-1), 1, ' ', (byte) 10, (byte) -1, (short) -1 };
        int[] intArray12 = new int[] { (byte) -1, (byte) 1, (byte) 0, (short) -1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (byte) 0, (int) (short) 1);
    }

    @Test
    public void test02031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02031");
        int[] intArray3 = new int[] { (byte) 10, (byte) 0, (byte) -1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (byte) -1, (int) (short) 1);
    }

    @Test
    public void test02032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02032");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray6 = new int[] { (short) 1, (byte) 1, (byte) 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (byte) 100, (int) (byte) 10);
    }

    @Test
    public void test02033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02033");
        int[] intArray1 = new int[] { 10 };
        int[] intArray7 = new int[] { 0, 10, (byte) -1, ' ', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, 100, 100);
    }

    @Test
    public void test02034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02034");
        int[] intArray6 = new int[] { (short) 10, (short) 0, (short) 10, (byte) 100, ' ', (short) 100 };
        int[] intArray9 = new int[] { (short) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) 'a', (int) (byte) 0);
    }

    @Test
    public void test02035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02035");
        int[] intArray6 = new int[] { (byte) -1, '4', 1, (byte) 1, '4', 100 };
        int[] intArray9 = new int[] { 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 10, (int) '4');
    }

    @Test
    public void test02036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02036");
        int[] intArray3 = new int[] { (short) 0, (byte) 0, (short) 0 };
        int[] intArray5 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) '4', 100);
    }

    @Test
    public void test02037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02037");
        int[] intArray1 = new int[] { '4' };
        int[] intArray6 = new int[] { (byte) 1, (short) 100, 'a', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (short) 100, (int) (short) 1);
    }

    @Test
    public void test02038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02038");
        int[] intArray6 = new int[] { ' ', 'a', 'a', 1, (short) 100, 0 };
        int[] intArray8 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) 'a', (int) (byte) 10);
    }

    @Test
    public void test02039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02039");
        int[] intArray6 = new int[] { (short) 0, (short) 100, (byte) -1, (byte) 1, (short) 0, 100 };
        int[] intArray9 = new int[] { ' ', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 100, (int) (short) 10);
    }

    @Test
    public void test02040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02040");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, 10, (int) (byte) 0);
    }

    @Test
    public void test02041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02041");
        int[] intArray4 = new int[] { 1, 'a', (short) 10, 0 };
        int[] intArray10 = new int[] { (byte) 1, (short) 1, ' ', (short) 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (byte) 1, (int) (short) 10);
    }

    @Test
    public void test02042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02042");
        int[] intArray6 = new int[] { '4', (short) 0, (short) -1, 100, (short) 1, (byte) -1 };
        int[] intArray12 = new int[] { (byte) 100, (byte) 10, (byte) 1, 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 0, (int) (byte) -1);
    }

    @Test
    public void test02043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02043");
        int[] intArray6 = new int[] { (short) 1, (short) 100, 1, (byte) 10, (short) 1, (-1) };
        int[] intArray12 = new int[] { (byte) 1, 'a', (byte) -1, (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) '#', 10);
    }

    @Test
    public void test02044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02044");
        int[] intArray5 = new int[] { 1, 'a', (short) 1, (byte) 0, (byte) 100 };
        int[] intArray8 = new int[] { (byte) 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) '4', (int) '#');
    }

    @Test
    public void test02045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02045");
        int[] intArray5 = new int[] { 0, (short) -1, (-1), (byte) 10, 'a' };
        int[] intArray12 = new int[] { (short) 100, '#', '#', (byte) 0, (-1), 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (byte) -1, (int) (short) 1);
    }

    @Test
    public void test02046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02046");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray4 = new int[] { 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, 10, (int) (byte) 10);
    }

    @Test
    public void test02047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02047");
        int[] intArray3 = new int[] { (short) 10, (short) 0, 1 };
        int[] intArray7 = new int[] { (short) 1, (short) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 0, (int) (short) 0);
    }

    @Test
    public void test02048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02048");
        int[] intArray6 = new int[] { (-1), (short) 0, '#', (short) -1, 'a', (byte) 0 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) '#', 0);
    }

    @Test
    public void test02049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02049");
        int[] intArray3 = new int[] { (byte) 10, (byte) 10, (-1) };
        int[] intArray8 = new int[] { (byte) 10, (short) 0, (byte) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (byte) 100, 0);
    }

    @Test
    public void test02050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02050");
        int[] intArray3 = new int[] { 0, '#', '4' };
        int[] intArray8 = new int[] { (short) 0, 100, (byte) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 100, (int) (short) -1);
    }

    @Test
    public void test02051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02051");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray3 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) -1, (int) (short) 1);
    }

    @Test
    public void test02052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02052");
        int[] intArray5 = new int[] { 'a', (byte) -1, (byte) 1, 0, 1 };
        int[] intArray9 = new int[] { (byte) 1, (byte) -1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 10, 0);
    }

    @Test
    public void test02053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02053");
        int[] intArray4 = new int[] { 100, 10, (byte) 0, (byte) 1 };
        int[] intArray9 = new int[] { (byte) 0, 10, (byte) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (byte) 10, (int) '4');
    }

    @Test
    public void test02054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02054");
        int[] intArray6 = new int[] { (-1), '#', (byte) 10, ' ', (byte) -1, '4' };
        int[] intArray9 = new int[] { (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, 0, (int) (byte) 10);
    }

    @Test
    public void test02055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02055");
        int[] intArray2 = new int[] { (short) 1, (byte) 1 };
        int[] intArray5 = new int[] { (byte) 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) '4', (int) (byte) 10);
    }

    @Test
    public void test02056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02056");
        int[] intArray4 = new int[] { (short) -1, (byte) 10, 0, 10 };
        int[] intArray8 = new int[] { (short) 100, 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 100, 10);
    }

    @Test
    public void test02057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02057");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray7 = new int[] { 10, (short) 0, (byte) 10, (short) 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) ' ', (int) ' ');
    }

    @Test
    public void test02058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02058");
        int[] intArray4 = new int[] { (-1), (byte) 0, (byte) 0, (short) -1 };
        int[] intArray7 = new int[] { 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) -1, (int) (short) 100);
    }

    @Test
    public void test02059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02059");
        int[] intArray5 = new int[] { (byte) 10, (byte) 1, 100, '#', 'a' };
        int[] intArray9 = new int[] { (-1), (short) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (byte) 0, (int) (byte) 100);
    }

    @Test
    public void test02060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02060");
        int[] intArray5 = new int[] { (byte) -1, (short) 1, (byte) -1, (short) 10, (short) 10 };
        int[] intArray11 = new int[] { 10, (short) 10, 'a', ' ', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) 0, (int) (short) 10);
    }

    @Test
    public void test02061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02061");
        int[] intArray2 = new int[] { 100, (byte) 1 };
        int[] intArray5 = new int[] { (byte) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (byte) 0, (int) '#');
    }

    @Test
    public void test02062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02062");
        int[] intArray3 = new int[] { (short) 0, '4', 0 };
        int[] intArray6 = new int[] { (byte) 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) 100, (int) 'a');
    }

    @Test
    public void test02063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02063");
        int[] intArray4 = new int[] { (byte) 100, '#', ' ', '4' };
        int[] intArray10 = new int[] { (byte) 10, (short) -1, 10, (byte) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (byte) 1, (int) (short) 100);
    }

    @Test
    public void test02064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02064");
        int[] intArray4 = new int[] { 100, (byte) 10, ' ', 'a' };
        int[] intArray11 = new int[] { '4', '4', (short) 0, (-1), 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (byte) 100, (int) (byte) 1);
    }

    @Test
    public void test02065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02065");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 1, (byte) 0, (short) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) -1, (int) (short) 100);
    }

    @Test
    public void test02066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02066");
        int[] intArray5 = new int[] { (byte) 100, 0, (short) -1, (byte) 10, (short) -1 };
        int[] intArray9 = new int[] { 1, ' ', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) '4', (int) '4');
    }

    @Test
    public void test02067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02067");
        int[] intArray3 = new int[] { ' ', (short) 1, (byte) 10 };
        int[] intArray9 = new int[] { 10, (short) 0, (byte) 10, (short) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (byte) 100, (int) (short) -1);
    }

    @Test
    public void test02068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02068");
        int[] intArray2 = new int[] { (short) 0, 0 };
        int[] intArray8 = new int[] { (byte) -1, (short) 1, 'a', (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) '4', (int) (short) 10);
    }

    @Test
    public void test02069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02069");
        int[] intArray6 = new int[] { (short) -1, (byte) 0, ' ', (short) 100, (short) 100, ' ' };
        int[] intArray8 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 100, 100);
    }

    @Test
    public void test02070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02070");
        int[] intArray6 = new int[] { (byte) 0, (byte) 10, (byte) 100, (short) 100, (short) 100, (byte) 1 };
        int[] intArray9 = new int[] { (short) 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) '#', (int) ' ');
    }

    @Test
    public void test02071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02071");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray7 = new int[] { (short) 1, (short) -1, '4', (byte) 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) -1, (int) (byte) 0);
    }

    @Test
    public void test02072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02072");
        int[] intArray6 = new int[] { (byte) -1, (short) 100, 1, '4', 100, (byte) 10 };
        int[] intArray9 = new int[] { (short) 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, 100, (int) (short) 1);
    }

    @Test
    public void test02073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02073");
        int[] intArray4 = new int[] { '#', (byte) 0, 0, (short) -1 };
        int[] intArray8 = new int[] { (short) 1, '#', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 0, (int) (byte) 0);
    }

    @Test
    public void test02074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02074");
        int[] intArray5 = new int[] { (byte) 10, (byte) 1, 100, (short) 0, 0 };
        int[] intArray9 = new int[] { 0, (short) 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (byte) 100, (int) (byte) 1);
    }

    @Test
    public void test02075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02075");
        int[] intArray6 = new int[] { (byte) 100, 10, 1, 0, 'a', 'a' };
        int[] intArray13 = new int[] { ' ', 'a', 100, 'a', (short) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (byte) 0, (int) 'a');
    }

    @Test
    public void test02076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02076");
        int[] intArray4 = new int[] { (short) 10, (short) -1, 10, (byte) 10 };
        int[] intArray9 = new int[] { 10, (-1), '4', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (byte) -1, (int) (byte) -1);
    }

    @Test
    public void test02077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02077");
        int[] intArray5 = new int[] { 'a', (byte) 10, 'a', (short) 100, 10 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 0, 1);
    }

    @Test
    public void test02078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02078");
        int[] intArray4 = new int[] { (byte) 0, 10, (byte) 100, 0 };
        int[] intArray10 = new int[] { (byte) 100, (byte) -1, 1, (short) 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, 10, 10);
    }

    @Test
    public void test02079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02079");
        int[] intArray2 = new int[] { (byte) -1, 0 };
        int[] intArray8 = new int[] { (short) 10, (short) 0, (short) 0, (-1), 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) '#', (int) (short) 0);
    }

    @Test
    public void test02080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02080");
        int[] intArray5 = new int[] { (short) 10, (short) 1, 10, ' ', '4' };
        int[] intArray9 = new int[] { (byte) 1, (byte) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (byte) 10, (int) '4');
    }

    @Test
    public void test02081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02081");
        int[] intArray3 = new int[] { '4', 0, (byte) 100 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, 0, (int) '4');
    }

    @Test
    public void test02082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02082");
        int[] intArray4 = new int[] { (short) 0, ' ', 1, (byte) -1 };
        int[] intArray9 = new int[] { (byte) 10, (short) 100, (-1), 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (byte) 100, (int) (short) 100);
    }

    @Test
    public void test02083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02083");
        int[] intArray4 = new int[] { 'a', (short) 100, (short) 100, (-1) };
        int[] intArray10 = new int[] { (short) 0, 0, 0, 'a', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, 10, (int) (short) 1);
    }

    @Test
    public void test02084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02084");
        int[] intArray3 = new int[] { 10, 10, '#' };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) -1, (int) (byte) 100);
    }

    @Test
    public void test02085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02085");
        int[] intArray3 = new int[] { (byte) 0, (byte) 1, 0 };
        int[] intArray7 = new int[] { 'a', (byte) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) 0, (int) (byte) 100);
    }

    @Test
    public void test02086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02086");
        int[] intArray6 = new int[] { (short) 0, (byte) 100, '4', (short) 0, 10, 'a' };
        int[] intArray9 = new int[] { '4', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) '4', (int) (byte) 0);
    }

    @Test
    public void test02087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02087");
        int[] intArray2 = new int[] { (byte) 1, (byte) 1 };
        int[] intArray8 = new int[] { '4', 'a', 100, (short) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) 0, 0);
    }

    @Test
    public void test02088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02088");
        int[] intArray5 = new int[] { (short) 100, (short) 1, (short) 100, (short) 100, (short) 100 };
        int[] intArray9 = new int[] { (short) 10, (-1), ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (-1), 100);
    }

    @Test
    public void test02089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02089");
        int[] intArray6 = new int[] { 100, (byte) -1, (short) -1, (byte) 0, 'a', (short) -1 };
        int[] intArray11 = new int[] { 10, 100, (short) 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (short) 0, (int) (byte) 0);
    }

    @Test
    public void test02090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02090");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, 0, (int) ' ');
    }

    @Test
    public void test02091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02091");
        int[] intArray6 = new int[] { (short) 10, 100, (byte) -1, (byte) 0, 100, 'a' };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) 10, (int) (byte) 100);
    }

    @Test
    public void test02092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02092");
        int[] intArray3 = new int[] { (byte) -1, (byte) -1, (byte) -1 };
        int[] intArray8 = new int[] { (byte) 100, (byte) 10, 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (-1), 1);
    }

    @Test
    public void test02093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02093");
        int[] intArray3 = new int[] { 1, (byte) 100, (short) -1 };
        int[] intArray10 = new int[] { ' ', 0, 10, (byte) -1, (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (byte) -1, 0);
    }

    @Test
    public void test02094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02094");
        int[] intArray6 = new int[] { (short) 100, 1, 10, (short) -1, (-1), '4' };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) '#', (int) '#');
    }

    @Test
    public void test02095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02095");
        int[] intArray3 = new int[] { (byte) 100, ' ', ' ' };
        int[] intArray5 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, 10, (int) (byte) 10);
    }

    @Test
    public void test02096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02096");
        int[] intArray4 = new int[] { 0, (short) 1, (short) -1, (byte) 0 };
        int[] intArray6 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (short) 100, (int) (byte) 100);
    }

    @Test
    public void test02097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02097");
        int[] intArray6 = new int[] { (-1), (short) 10, 1, (short) -1, (byte) 0, (short) 0 };
        int[] intArray8 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (-1), 0);
    }

    @Test
    public void test02098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02098");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray5 = new int[] { 10, (-1), (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (byte) -1, (int) (byte) 1);
    }

    @Test
    public void test02099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02099");
        int[] intArray4 = new int[] { (short) 1, '#', '4', 10 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) '#', 10);
    }

    @Test
    public void test02100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02100");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 10, (int) ' ');
    }

    @Test
    public void test02101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02101");
        int[] intArray4 = new int[] { 100, (byte) -1, (short) 100, (short) 10 };
        int[] intArray7 = new int[] { (short) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) 'a', (int) ' ');
    }

    @Test
    public void test02102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02102");
        int[] intArray5 = new int[] { (short) 10, 1, '4', (byte) 1, (short) -1 };
        int[] intArray10 = new int[] { ' ', (byte) 1, 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (short) -1, (int) 'a');
    }

    @Test
    public void test02103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02103");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (byte) 1, 1);
    }

    @Test
    public void test02104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02104");
        int[] intArray6 = new int[] { (short) 1, 1, (short) 1, (byte) 100, '#', 100 };
        int[] intArray8 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 1, (int) (short) 100);
    }

    @Test
    public void test02105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02105");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) ' ', (int) '4');
    }

    @Test
    public void test02106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02106");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) 0, 'a', (short) 1, 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, 0, (int) (byte) 0);
    }

    @Test
    public void test02107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02107");
        int[] intArray3 = new int[] { 10, 100, 'a' };
        int[] intArray8 = new int[] { (byte) 10, (short) -1, (byte) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 1, (int) '#');
    }

    @Test
    public void test02108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02108");
        int[] intArray4 = new int[] { (byte) -1, 100, (byte) 10, (byte) 10 };
        int[] intArray8 = new int[] { (byte) 1, (-1), '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) '#', (int) (short) 100);
    }

    @Test
    public void test02109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02109");
        int[] intArray5 = new int[] { (-1), (short) 100, (short) -1, (short) -1, (byte) 100 };
        int[] intArray12 = new int[] { 0, (-1), (byte) 0, (-1), '#', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (byte) 0, (int) (short) 100);
    }

    @Test
    public void test02110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02110");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray3 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) '4', (int) (short) -1);
    }

    @Test
    public void test02111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02111");
        int[] intArray6 = new int[] { (byte) -1, (short) 10, (short) 10, (-1), 'a', (short) -1 };
        int[] intArray12 = new int[] { (byte) -1, (byte) 100, '#', (byte) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (byte) 1, 0);
    }

    @Test
    public void test02112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02112");
        int[] intArray5 = new int[] { (byte) 1, (short) 0, (short) 1, (short) 0, '#' };
        int[] intArray10 = new int[] { 100, '#', (short) 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 0, (int) (short) 10);
    }

    @Test
    public void test02113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02113");
        int[] intArray6 = new int[] { '#', (short) 100, (short) 10, (short) 10, (byte) 1, 'a' };
        int[] intArray12 = new int[] { (byte) 1, 'a', 0, ' ', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) -1, (int) (short) 100);
    }

    @Test
    public void test02114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02114");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray4 = new int[] { (short) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) '4', (int) (byte) 100);
    }

    @Test
    public void test02115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02115");
        int[] intArray2 = new int[] { '4', 1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (byte) -1, 1);
    }

    @Test
    public void test02116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02116");
        int[] intArray3 = new int[] { (short) 1, (byte) -1, 10 };
        int[] intArray6 = new int[] { ' ', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) 1, (int) (byte) 0);
    }

    @Test
    public void test02117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02117");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 100, (short) 0, (byte) 0, (short) 100, (short) 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) ' ', (int) '4');
    }

    @Test
    public void test02118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02118");
        int[] intArray2 = new int[] { (byte) 1, (byte) 10 };
        int[] intArray7 = new int[] { 100, (short) 1, '#', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) ' ', (int) (byte) 1);
    }

    @Test
    public void test02119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02119");
        int[] intArray6 = new int[] { '#', (byte) 1, (byte) -1, '4', (short) 1, (short) 0 };
        int[] intArray13 = new int[] { 0, (byte) 10, 1, (byte) 100, 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (short) 10, (-1));
    }

    @Test
    public void test02120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02120");
        int[] intArray6 = new int[] { ' ', '#', '#', (short) 0, 100, (short) 1 };
        int[] intArray9 = new int[] { (short) -1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (short) -1, (int) (byte) 1);
    }

    @Test
    public void test02121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02121");
        int[] intArray2 = new int[] { 100, (byte) 10 };
        int[] intArray8 = new int[] { 1, (-1), (short) 0, 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) '#', (int) 'a');
    }

    @Test
    public void test02122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02122");
        int[] intArray5 = new int[] { (byte) 1, (short) -1, (short) 0, (short) 1, 10 };
        int[] intArray8 = new int[] { 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) -1, 1);
    }

    @Test
    public void test02123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02123");
        int[] intArray5 = new int[] { 100, ' ', (byte) 10, (byte) 100, 10 };
        int[] intArray11 = new int[] { (byte) 10, (byte) 10, (short) 100, 'a', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) 100, 10);
    }

    @Test
    public void test02124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02124");
        int[] intArray2 = new int[] { (short) 0, '#' };
        int[] intArray4 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (byte) 100, (int) (byte) 1);
    }

    @Test
    public void test02125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02125");
        int[] intArray4 = new int[] { (byte) 1, (short) 100, (short) 1, (byte) 10 };
        int[] intArray10 = new int[] { (short) 100, (byte) 1, 1, (short) 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, 100, (int) ' ');
    }

    @Test
    public void test02126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02126");
        int[] intArray6 = new int[] { (-1), (short) 100, (-1), (-1), (byte) 1, ' ' };
        int[] intArray8 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 0, 0);
    }

    @Test
    public void test02127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02127");
        int[] intArray5 = new int[] { (byte) -1, (-1), '#', 0, 10 };
        int[] intArray7 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (short) 10, (int) (byte) 0);
    }

    @Test
    public void test02128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02128");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray5 = new int[] { (byte) 0, (short) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) 'a', (int) (byte) 100);
    }

    @Test
    public void test02129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02129");
        int[] intArray4 = new int[] { (byte) 0, 'a', (short) 100, '#' };
        int[] intArray9 = new int[] { 0, (short) 10, (short) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) ' ', (int) (byte) 10);
    }

    @Test
    public void test02130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02130");
        int[] intArray4 = new int[] { 10, 1, (byte) 10, '4' };
        int[] intArray9 = new int[] { (-1), 1, (short) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 1, (int) (byte) -1);
    }

    @Test
    public void test02131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02131");
        int[] intArray5 = new int[] { 100, (byte) -1, (short) 100, (short) 10, (byte) 1 };
        int[] intArray10 = new int[] { 'a', '4', 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 10, (int) (short) -1);
    }

    @Test
    public void test02132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02132");
        int[] intArray3 = new int[] { (byte) 1, (byte) 1, 'a' };
        int[] intArray10 = new int[] { (byte) 10, (byte) 1, '4', (byte) 100, (-1), (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) 'a', (int) (short) 0);
    }

    @Test
    public void test02133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02133");
        int[] intArray6 = new int[] { 0, 100, (short) 100, '#', 0, (short) 100 };
        int[] intArray8 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) ' ', 10);
    }

    @Test
    public void test02134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02134");
        int[] intArray6 = new int[] { 10, (short) 10, 0, (short) 0, '4', (byte) 0 };
        int[] intArray13 = new int[] { (byte) 100, (byte) 100, (byte) 0, 0, (short) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (byte) 100, (int) (short) 0);
    }

    @Test
    public void test02135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02135");
        int[] intArray5 = new int[] { 0, ' ', (byte) 100, (short) 100, (short) 1 };
        int[] intArray9 = new int[] { (short) 100, (short) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) 'a', (int) (short) 100);
    }

    @Test
    public void test02136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02136");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) 1, 1);
    }

    @Test
    public void test02137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02137");
        int[] intArray2 = new int[] { (-1), 100 };
        int[] intArray5 = new int[] { (byte) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test02138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02138");
        int[] intArray6 = new int[] { (-1), (-1), (byte) 1, (short) -1, (-1), (byte) 10 };
        int[] intArray9 = new int[] { (short) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 0, (int) (short) 100);
    }

    @Test
    public void test02139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02139");
        int[] intArray4 = new int[] { (short) -1, 0, (short) 100, 0 };
        int[] intArray9 = new int[] { (byte) 1, (short) 100, (byte) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) 'a', (int) (byte) 0);
    }

    @Test
    public void test02140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02140");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test02141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02141");
        int[] intArray5 = new int[] { (short) 100, 0, '#', (short) 0, (short) 100 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (short) 10, (int) (short) 1);
    }

    @Test
    public void test02142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02142");
        int[] intArray5 = new int[] { (byte) 100, (short) 0, '#', (byte) 1, 1 };
        int[] intArray9 = new int[] { '#', (byte) 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 10, (int) (short) 100);
    }

    @Test
    public void test02143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02143");
        int[] intArray5 = new int[] { 100, 100, (byte) 10, 0, (short) -1 };
        int[] intArray11 = new int[] { (byte) 10, (byte) 100, '#', (short) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) 100, (int) (short) 1);
    }

    @Test
    public void test02144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02144");
        int[] intArray1 = new int[] { 1 };
        int[] intArray6 = new int[] { (byte) 1, (byte) 0, 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (byte) 10, (int) (byte) 10);
    }

    @Test
    public void test02145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02145");
        int[] intArray5 = new int[] { 0, 0, (byte) 1, 1, (short) -1 };
        int[] intArray7 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) 1, (int) (byte) 10);
    }

    @Test
    public void test02146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02146");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) ' ', (int) (short) 0);
    }

    @Test
    public void test02147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02147");
        int[] intArray5 = new int[] { (byte) 10, (short) 0, (byte) 100, '#', '#' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) 100, (int) (short) -1);
    }

    @Test
    public void test02148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02148");
        int[] intArray4 = new int[] { (byte) 10, 'a', 'a', (-1) };
        int[] intArray10 = new int[] { 'a', (-1), (-1), '4', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (byte) 0, (int) (byte) -1);
    }

    @Test
    public void test02149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02149");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray8 = new int[] { (byte) -1, 0, 10, '#', 'a', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (-1), (int) (short) -1);
    }

    @Test
    public void test02150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02150");
        int[] intArray1 = new int[] { 0 };
        int[] intArray3 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (byte) 10, 10);
    }

    @Test
    public void test02151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02151");
        int[] intArray4 = new int[] { (short) 10, ' ', 'a', 'a' };
        int[] intArray8 = new int[] { 1, (byte) 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 0, (int) (byte) 10);
    }

    @Test
    public void test02152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02152");
        int[] intArray5 = new int[] { (byte) 100, 'a', 1, '#', (byte) 100 };
        int[] intArray9 = new int[] { 0, (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 1, 1);
    }

    @Test
    public void test02153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02153");
        int[] intArray4 = new int[] { (byte) 10, (short) 100, 0, 1 };
        int[] intArray6 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 10, (-1));
    }

    @Test
    public void test02154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02154");
        int[] intArray3 = new int[] { 100, (byte) -1, (byte) -1 };
        int[] intArray7 = new int[] { (byte) 10, 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (-1), (int) '4');
    }

    @Test
    public void test02155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02155");
        int[] intArray2 = new int[] { (byte) 10, (byte) 0 };
        int[] intArray5 = new int[] { (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) 'a', (int) (short) -1);
    }

    @Test
    public void test02156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02156");
        int[] intArray2 = new int[] { 100, (byte) 100 };
        int[] intArray9 = new int[] { ' ', (short) 1, (byte) -1, (short) -1, ' ', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 10, 0);
    }

    @Test
    public void test02157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02157");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) -1, 10, (byte) 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test02158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02158");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) -1, (short) 1, 1, (byte) 100, (byte) 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (-1), (int) (short) 0);
    }

    @Test
    public void test02159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02159");
        int[] intArray6 = new int[] { 10, '#', (short) 100, (byte) 10, 100, '4' };
        int[] intArray9 = new int[] { (byte) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 1, (int) (byte) 100);
    }

    @Test
    public void test02160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02160");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 1, 10, 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) -1, 100);
    }

    @Test
    public void test02161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02161");
        int[] intArray3 = new int[] { '#', '#', (short) 10 };
        int[] intArray8 = new int[] { (byte) 100, 'a', (short) 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 1, (int) (short) -1);
    }

    @Test
    public void test02162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02162");
        int[] intArray6 = new int[] { ' ', (short) -1, (byte) 0, (short) 100, 100, (short) 1 };
        int[] intArray9 = new int[] { (byte) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (short) -1, (int) '4');
    }

    @Test
    public void test02163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02163");
        int[] intArray2 = new int[] { (short) 0, (short) 0 };
        int[] intArray9 = new int[] { (byte) 0, (byte) 0, ' ', (byte) 10, 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 100, (int) (byte) 0);
    }

    @Test
    public void test02164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02164");
        int[] intArray4 = new int[] { (byte) 10, (byte) 1, (short) -1, '4' };
        int[] intArray9 = new int[] { 'a', (short) 10, 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) 1, (int) '4');
    }

    @Test
    public void test02165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02165");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) 1, (int) ' ');
    }

    @Test
    public void test02166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02166");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 0, '#', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) ' ', (int) ' ');
    }

    @Test
    public void test02167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02167");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray8 = new int[] { 0, 10, (byte) -1, (short) -1, (short) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 1, (int) (byte) -1);
    }

    @Test
    public void test02168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02168");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray6 = new int[] { (byte) 0, (-1), 'a', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (short) -1, (int) (short) 10);
    }

    @Test
    public void test02169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02169");
        int[] intArray4 = new int[] { (short) 100, (short) 1, '4', (byte) 100 };
        int[] intArray11 = new int[] { (-1), (short) 0, (short) 10, (short) 10, 'a', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (byte) 100, (int) (short) 0);
    }

    @Test
    public void test02170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02170");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (short) -1, (int) (short) -1);
    }

    @Test
    public void test02171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02171");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { ' ', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) ' ', (int) (byte) -1);
    }

    @Test
    public void test02172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02172");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) 100, (byte) 0, (short) 0, 'a', (short) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) '4', 0);
    }

    @Test
    public void test02173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02173");
        int[] intArray5 = new int[] { (short) -1, 10, (short) -1, (byte) 100, (short) 0 };
        int[] intArray8 = new int[] { (byte) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) -1, 10);
    }

    @Test
    public void test02174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02174");
        int[] intArray2 = new int[] { (byte) -1, (short) 10 };
        int[] intArray7 = new int[] { (-1), (short) 10, (short) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 1, (int) (byte) 10);
    }

    @Test
    public void test02175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02175");
        int[] intArray2 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray5 = new int[] { 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 10, (int) (short) 10);
    }

    @Test
    public void test02176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02176");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) 100, (int) (short) 0);
    }

    @Test
    public void test02177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02177");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { ' ', 'a', (-1), (short) 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) -1, 1);
    }

    @Test
    public void test02178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02178");
        int[] intArray6 = new int[] { 0, 'a', (byte) 100, 10, ' ', 10 };
        int[] intArray9 = new int[] { 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, 10, 0);
    }

    @Test
    public void test02179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02179");
        int[] intArray3 = new int[] { (short) 100, (-1), (-1) };
        int[] intArray9 = new int[] { '#', (short) -1, (byte) 100, (byte) -1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (byte) 0, (int) '#');
    }

    @Test
    public void test02180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02180");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) 100, (int) '#');
    }

    @Test
    public void test02181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02181");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) -1, 0);
    }

    @Test
    public void test02182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02182");
        int[] intArray2 = new int[] { (short) -1, (byte) 10 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) 'a', (-1));
    }

    @Test
    public void test02183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02183");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 10, (byte) 10, (-1), (short) 1, (byte) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, 10, (int) (short) 0);
    }

    @Test
    public void test02184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02184");
        int[] intArray4 = new int[] { (short) 100, 1, 1, 10 };
        int[] intArray11 = new int[] { (-1), (byte) 0, 100, (short) -1, (short) 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) '4', (int) ' ');
    }

    @Test
    public void test02185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02185");
        int[] intArray4 = new int[] { (short) 1, ' ', (-1), '#' };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (byte) 1, (int) 'a');
    }

    @Test
    public void test02186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02186");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray3 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) 0, 10);
    }

    @Test
    public void test02187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02187");
        int[] intArray1 = new int[] { 0 };
        int[] intArray4 = new int[] { (byte) 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, 0, (int) (short) -1);
    }

    @Test
    public void test02188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02188");
        int[] intArray3 = new int[] { (short) 1, '4', (byte) 10 };
        int[] intArray7 = new int[] { 10, '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) 0, (int) (byte) 1);
    }

    @Test
    public void test02189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02189");
        int[] intArray2 = new int[] { (short) 100, (byte) 0 };
        int[] intArray7 = new int[] { '#', (byte) 100, 'a', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (short) 100, 0);
    }

    @Test
    public void test02190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02190");
        int[] intArray5 = new int[] { '4', 'a', (short) 10, 0, 'a' };
        int[] intArray8 = new int[] { 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) -1, 0);
    }

    @Test
    public void test02191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02191");
        int[] intArray6 = new int[] { (-1), '#', (short) -1, 0, 1, '#' };
        int[] intArray8 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 1, 10);
    }

    @Test
    public void test02192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02192");
        int[] intArray3 = new int[] { ' ', 0, '4' };
        int[] intArray6 = new int[] { (byte) 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (-1), (int) (byte) -1);
    }

    @Test
    public void test02193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02193");
        int[] intArray6 = new int[] { (byte) 0, (byte) 0, (short) 100, (short) 100, 'a', (short) 100 };
        int[] intArray10 = new int[] { (short) 1, 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 0, (int) '#');
    }

    @Test
    public void test02194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02194");
        int[] intArray6 = new int[] { (byte) 10, 1, 1, '4', 1, 0 };
        int[] intArray12 = new int[] { (short) 1, '#', (byte) 1, 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (byte) 0, (int) (short) 1);
    }

    @Test
    public void test02195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02195");
        int[] intArray6 = new int[] { (byte) -1, (byte) 100, (byte) 1, ' ', (-1), ' ' };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) 1, 0);
    }

    @Test
    public void test02196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02196");
        int[] intArray6 = new int[] { 10, (short) 100, 1, (byte) 0, (byte) 100, 1 };
        int[] intArray12 = new int[] { (short) 100, (-1), (byte) -1, 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) ' ', (-1));
    }

    @Test
    public void test02197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02197");
        int[] intArray4 = new int[] { 0, (short) -1, (short) 10, (short) -1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, 0, (int) (short) 10);
    }

    @Test
    public void test02198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02198");
        int[] intArray2 = new int[] { ' ', 1 };
        int[] intArray6 = new int[] { '4', (short) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (short) 0, (int) (short) 100);
    }

    @Test
    public void test02199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02199");
        int[] intArray6 = new int[] { (short) -1, (short) 0, 1, (byte) 0, '#', 'a' };
        int[] intArray11 = new int[] { (byte) 10, 100, ' ', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) ' ', (int) (short) 0);
    }

    @Test
    public void test02200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02200");
        int[] intArray6 = new int[] { 1, 'a', 0, (short) -1, '4', 100 };
        int[] intArray11 = new int[] { (short) 1, (byte) 1, 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 100, (int) (short) -1);
    }

    @Test
    public void test02201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02201");
        int[] intArray4 = new int[] { '#', (short) 100, (byte) 0, (short) -1 };
        int[] intArray8 = new int[] { (byte) 0, (-1), 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 0, 10);
    }

    @Test
    public void test02202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02202");
        int[] intArray5 = new int[] { (-1), (-1), '4', ' ', 0 };
        int[] intArray11 = new int[] { (byte) 100, (short) 1, (short) -1, '4', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) -1, (int) (short) -1);
    }

    @Test
    public void test02203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02203");
        int[] intArray4 = new int[] { (short) 10, (short) 1, 10, (short) 100 };
        int[] intArray6 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 100, (int) (short) 10);
    }

    @Test
    public void test02204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02204");
        int[] intArray5 = new int[] { 1, (short) 10, (byte) 100, (short) 1, (short) 100 };
        int[] intArray11 = new int[] { '#', 10, 100, 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) '#', 0);
    }

    @Test
    public void test02205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02205");
        int[] intArray5 = new int[] { 1, (byte) 10, 0, (short) 1, (short) -1 };
        int[] intArray7 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) 100, (int) (short) 1);
    }

    @Test
    public void test02206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02206");
        int[] intArray2 = new int[] { 0, 1 };
        int[] intArray4 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (-1), 1);
    }

    @Test
    public void test02207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02207");
        int[] intArray3 = new int[] { (byte) 0, (byte) 1, (byte) 1 };
        int[] intArray6 = new int[] { (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) 0, (int) (short) 1);
    }

    @Test
    public void test02208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02208");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 10, 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) 100, 10);
    }

    @Test
    public void test02209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02209");
        int[] intArray3 = new int[] { 100, (-1), (byte) 1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (byte) 10, (int) '#');
    }

    @Test
    public void test02210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02210");
        int[] intArray4 = new int[] { '4', 'a', 1, 0 };
        int[] intArray7 = new int[] { ' ', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) -1, (int) '4');
    }

    @Test
    public void test02211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02211");
        int[] intArray1 = new int[] { '#' };
        int[] intArray3 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (-1), (int) (short) -1);
    }

    @Test
    public void test02212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02212");
        int[] intArray2 = new int[] { (short) 10, (short) 10 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 1, 10);
    }

    @Test
    public void test02213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02213");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 1, (short) 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) '4', (int) (short) 1);
    }

    @Test
    public void test02214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02214");
        int[] intArray5 = new int[] { 'a', '4', (byte) 10, 100, ' ' };
        int[] intArray9 = new int[] { 10, 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (byte) 1, 100);
    }

    @Test
    public void test02215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02215");
        int[] intArray3 = new int[] { (byte) 10, 10, (byte) 0 };
        int[] intArray8 = new int[] { (byte) 10, 0, 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (byte) 100, 1);
    }

    @Test
    public void test02216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02216");
        int[] intArray1 = new int[] { 100 };
        int[] intArray4 = new int[] { (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, 0, (int) (byte) -1);
    }

    @Test
    public void test02217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02217");
        int[] intArray4 = new int[] { 1, (short) -1, (short) 0, '#' };
        int[] intArray11 = new int[] { '4', '4', 1, '#', (byte) -1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, 1, (int) (short) 0);
    }

    @Test
    public void test02218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02218");
        int[] intArray5 = new int[] { (byte) 0, 100, (short) 10, 100, 'a' };
        int[] intArray11 = new int[] { (byte) 10, (byte) 100, (byte) 0, (-1), (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) -1, (int) (short) -1);
    }

    @Test
    public void test02219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02219");
        int[] intArray3 = new int[] { ' ', (-1), (byte) -1 };
        int[] intArray10 = new int[] { (byte) -1, (short) 1, '4', (byte) 10, ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) ' ', (int) (short) -1);
    }

    @Test
    public void test02220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02220");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray3 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (-1), (int) (short) 1);
    }

    @Test
    public void test02221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02221");
        int[] intArray6 = new int[] { 1, 0, 1, ' ', (short) -1, (short) -1 };
        int[] intArray12 = new int[] { 100, '4', (byte) 1, ' ', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) '#', (int) (short) 10);
    }

    @Test
    public void test02222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02222");
        int[] intArray3 = new int[] { 10, 10, (short) 0 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, 0, (int) (byte) -1);
    }

    @Test
    public void test02223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02223");
        int[] intArray1 = new int[] { 1 };
        int[] intArray6 = new int[] { '4', (short) 0, 'a', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test02224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02224");
        int[] intArray4 = new int[] { 'a', '#', 100, (short) 10 };
        int[] intArray8 = new int[] { (-1), (short) -1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 10, (int) (short) 1);
    }

    @Test
    public void test02225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02225");
        int[] intArray4 = new int[] { (byte) 1, (byte) 100, (short) 0, (byte) 10 };
        int[] intArray9 = new int[] { (short) 10, (short) 1, 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 100, (int) (short) -1);
    }

    @Test
    public void test02226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02226");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { ' ', (short) 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (-1), 100);
    }

    @Test
    public void test02227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02227");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray7 = new int[] { 'a', (byte) 10, '#', 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) '4', (int) 'a');
    }

    @Test
    public void test02228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02228");
        int[] intArray2 = new int[] { 100, '4' };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) '4', (int) (short) 1);
    }

    @Test
    public void test02229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02229");
        int[] intArray2 = new int[] { (short) 100, ' ' };
        int[] intArray8 = new int[] { 100, (short) -1, (byte) 1, (-1), (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (-1), 100);
    }

    @Test
    public void test02230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02230");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 'a', (short) 100, (byte) 1, (-1), 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) ' ', (int) (short) -1);
    }

    @Test
    public void test02231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02231");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 0, (-1), 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) 10, (int) (short) 1);
    }

    @Test
    public void test02232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02232");
        int[] intArray3 = new int[] { (byte) 100, 1, (-1) };
        int[] intArray6 = new int[] { (short) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) 0, (int) ' ');
    }

    @Test
    public void test02233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02233");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 100, 'a', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) 10, (int) '4');
    }

    @Test
    public void test02234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02234");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray5 = new int[] { (-1), 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, 100, 0);
    }

    @Test
    public void test02235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02235");
        int[] intArray6 = new int[] { (byte) 10, (byte) 100, (byte) -1, (-1), (byte) 1, 0 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, 10, (int) '#');
    }

    @Test
    public void test02236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02236");
        int[] intArray6 = new int[] { (short) 10, (byte) 1, '#', 10, (byte) 100, ' ' };
        int[] intArray8 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (byte) 1, (int) (byte) 100);
    }

    @Test
    public void test02237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02237");
        int[] intArray4 = new int[] { 1, (short) 10, (byte) -1, (-1) };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, 0, 0);
    }

    @Test
    public void test02238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02238");
        int[] intArray5 = new int[] { (byte) 1, (short) 100, '#', ' ', 'a' };
        int[] intArray9 = new int[] { (byte) -1, 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) 'a', (int) ' ');
    }

    @Test
    public void test02239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02239");
        int[] intArray4 = new int[] { '#', (-1), (short) -1, '4' };
        int[] intArray8 = new int[] { '4', (byte) 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 100, 10);
    }

    @Test
    public void test02240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02240");
        int[] intArray2 = new int[] { (short) 10, (short) 0 };
        int[] intArray4 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 0, 100);
    }

    @Test
    public void test02241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02241");
        int[] intArray3 = new int[] { (byte) 10, (byte) 1, 'a' };
        int[] intArray6 = new int[] { 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) 0, (int) '#');
    }

    @Test
    public void test02242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02242");
        int[] intArray4 = new int[] { (short) 1, (byte) 0, '#', 'a' };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) '#', (int) (byte) 100);
    }

    @Test
    public void test02243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02243");
        int[] intArray4 = new int[] { (short) 0, (short) 10, 'a', (short) 100 };
        int[] intArray6 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 100, 1);
    }

    @Test
    public void test02244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02244");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) -1, (-1), (-1), (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) '4', (int) (short) 100);
    }

    @Test
    public void test02245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02245");
        int[] intArray2 = new int[] { '4', (byte) 0 };
        int[] intArray7 = new int[] { '#', (byte) -1, ' ', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) 'a', 0);
    }

    @Test
    public void test02246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02246");
        int[] intArray4 = new int[] { 100, ' ', '#', '#' };
        int[] intArray8 = new int[] { (short) 10, (short) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 0, (int) ' ');
    }

    @Test
    public void test02247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02247");
        int[] intArray3 = new int[] { 10, 'a', (short) -1 };
        int[] intArray9 = new int[] { (short) -1, (-1), (short) -1, 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 0, (int) (byte) 10);
    }

    @Test
    public void test02248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02248");
        int[] intArray6 = new int[] { (byte) 0, (-1), 10, (byte) 0, (byte) 0, (byte) 0 };
        int[] intArray8 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 0, 0);
    }

    @Test
    public void test02249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02249");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray7 = new int[] { (short) 10, (short) 0, ' ', '4', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) ' ', 1);
    }

    @Test
    public void test02250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02250");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 1, (short) 100, 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) ' ', (int) (short) 10);
    }

    @Test
    public void test02251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02251");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) ' ', (int) (short) 0);
    }

    @Test
    public void test02252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02252");
        int[] intArray2 = new int[] { ' ', 1 };
        int[] intArray6 = new int[] { '4', (byte) 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 0, (int) (short) 10);
    }

    @Test
    public void test02253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02253");
        int[] intArray3 = new int[] { (byte) -1, '#', ' ' };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) 100, 0);
    }

    @Test
    public void test02254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02254");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 0, (short) 1, (byte) 100, (short) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) 0, (int) '4');
    }

    @Test
    public void test02255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02255");
        int[] intArray2 = new int[] { (byte) 0, (byte) 0 };
        int[] intArray4 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (byte) 100, (int) (byte) -1);
    }

    @Test
    public void test02256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02256");
        int[] intArray2 = new int[] { (byte) 100, '#' };
        int[] intArray9 = new int[] { (short) 1, (short) 10, (short) 10, (byte) 0, (short) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (-1), 100);
    }

    @Test
    public void test02257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02257");
        int[] intArray2 = new int[] { '#', (byte) 100 };
        int[] intArray5 = new int[] { (short) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 10, 100);
    }

    @Test
    public void test02258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02258");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 0, 0);
    }

    @Test
    public void test02259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02259");
        int[] intArray4 = new int[] { (short) 1, '#', '#', (byte) 100 };
        int[] intArray11 = new int[] { '#', (byte) -1, (short) -1, (byte) 1, '4', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, 100, (int) (short) -1);
    }

    @Test
    public void test02260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02260");
        int[] intArray4 = new int[] { 1, (byte) -1, (byte) -1, ' ' };
        int[] intArray9 = new int[] { 'a', (short) 10, 'a', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (byte) 1, (-1));
    }

    @Test
    public void test02261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02261");
        int[] intArray3 = new int[] { (short) 10, (short) 100, 1 };
        int[] intArray7 = new int[] { (short) 10, '4', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) ' ', (int) (short) -1);
    }

    @Test
    public void test02262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02262");
        int[] intArray1 = new int[] { 10 };
        int[] intArray6 = new int[] { 'a', (byte) 100, (short) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test02263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02263");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray5 = new int[] { (byte) 1, (-1), 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) -1, 1);
    }

    @Test
    public void test02264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02264");
        int[] intArray2 = new int[] { '#', '4' };
        int[] intArray6 = new int[] { ' ', (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) 'a', (int) (short) -1);
    }

    @Test
    public void test02265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02265");
        int[] intArray6 = new int[] { 1, (short) 100, 0, (short) 0, (short) 100, 0 };
        int[] intArray8 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 0, (int) (short) 0);
    }

    @Test
    public void test02266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02266");
        int[] intArray6 = new int[] { '#', (short) 100, (-1), 100, '#', (short) 100 };
        int[] intArray8 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 100, (int) (byte) 1);
    }

    @Test
    public void test02267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02267");
        int[] intArray3 = new int[] { '4', (short) 10, ' ' };
        int[] intArray5 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) 10, (int) '#');
    }

    @Test
    public void test02268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02268");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) -1, (int) (byte) 100);
    }

    @Test
    public void test02269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02269");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (byte) 1, (byte) 0, (byte) 100, 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) 100, 10);
    }

    @Test
    public void test02270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02270");
        int[] intArray3 = new int[] { (short) 0, 1, ' ' };
        int[] intArray8 = new int[] { (byte) 100, 0, (short) 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (short) -1, 1);
    }

    @Test
    public void test02271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02271");
        int[] intArray6 = new int[] { 'a', 1, 1, (short) 100, (byte) -1, '#' };
        int[] intArray13 = new int[] { '#', (short) 0, (-1), 'a', 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (-1), (int) (short) 100);
    }

    @Test
    public void test02272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02272");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray3 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, 100, (int) (byte) 0);
    }

    @Test
    public void test02273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02273");
        int[] intArray4 = new int[] { (byte) 0, '#', (short) 1, '#' };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) '4', (int) (byte) 1);
    }

    @Test
    public void test02274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02274");
        int[] intArray5 = new int[] { (byte) 100, 10, 100, (short) 10, (byte) 0 };
        int[] intArray9 = new int[] { (short) 10, 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) ' ', (-1));
    }

    @Test
    public void test02275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02275");
        int[] intArray4 = new int[] { (byte) 10, 0, (byte) -1, '4' };
        int[] intArray8 = new int[] { '#', (short) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 100, (int) (byte) 0);
    }

    @Test
    public void test02276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02276");
        int[] intArray3 = new int[] { (short) 0, (byte) 10, (byte) -1 };
        int[] intArray5 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) 1, (int) 'a');
    }

    @Test
    public void test02277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02277");
        int[] intArray5 = new int[] { (short) -1, 10, (short) 1, 0, ' ' };
        int[] intArray9 = new int[] { (byte) -1, 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 0, (int) (byte) -1);
    }

    @Test
    public void test02278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02278");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray7 = new int[] { (short) 10, (short) 1, '4', 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (-1), (int) (byte) 1);
    }

    @Test
    public void test02279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02279");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (byte) 0, (int) (byte) 100);
    }

    @Test
    public void test02280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02280");
        int[] intArray6 = new int[] { 0, (byte) 100, ' ', (byte) 0, (short) 100, (byte) -1 };
        int[] intArray9 = new int[] { (short) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (short) 0, 10);
    }

    @Test
    public void test02281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02281");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { '#', (short) 0, (byte) 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 0, (int) '#');
    }

    @Test
    public void test02282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02282");
        int[] intArray1 = new int[] { 10 };
        int[] intArray6 = new int[] { (byte) 100, 10, 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (byte) 1, 10);
    }

    @Test
    public void test02283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02283");
        int[] intArray3 = new int[] { (short) 10, 'a', 100 };
        int[] intArray6 = new int[] { (short) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) 10, (-1));
    }

    @Test
    public void test02284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02284");
        int[] intArray6 = new int[] { (short) 1, '4', '#', 10, 'a', (byte) 100 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) -1, (int) (byte) 10);
    }

    @Test
    public void test02285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02285");
        int[] intArray3 = new int[] { 10, ' ', (byte) 1 };
        int[] intArray8 = new int[] { (short) 0, (-1), '#', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (short) 100, (int) (byte) 1);
    }

    @Test
    public void test02286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02286");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (byte) -1, (short) 1, 1, 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test02287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02287");
        int[] intArray3 = new int[] { (byte) 100, (short) 100, 10 };
        int[] intArray9 = new int[] { (byte) 10, (-1), (short) -1, (short) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (-1), (int) (byte) 100);
    }

    @Test
    public void test02288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02288");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray3 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) 'a', (int) '4');
    }

    @Test
    public void test02289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02289");
        int[] intArray4 = new int[] { (short) 10, (short) 1, 'a', '4' };
        int[] intArray8 = new int[] { 1, 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) -1, 100);
    }

    @Test
    public void test02290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02290");
        int[] intArray3 = new int[] { '4', 1, (short) 0 };
        int[] intArray7 = new int[] { '#', 'a', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) 10, (int) (byte) -1);
    }

    @Test
    public void test02291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02291");
        int[] intArray2 = new int[] { (byte) 0, 10 };
        int[] intArray4 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) '#', (int) ' ');
    }

    @Test
    public void test02292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02292");
        int[] intArray2 = new int[] { 'a', (short) 10 };
        int[] intArray6 = new int[] { ' ', '#', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) -1, 1);
    }

    @Test
    public void test02293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02293");
        int[] intArray4 = new int[] { 1, 1, (-1), '4' };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, 1, (-1));
    }

    @Test
    public void test02294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02294");
        int[] intArray3 = new int[] { (short) 0, (short) 1, (short) 10 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) ' ', (int) (short) 0);
    }

    @Test
    public void test02295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02295");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (byte) 0, 1, 1, '#', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) 1, (int) (byte) 1);
    }

    @Test
    public void test02296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02296");
        int[] intArray3 = new int[] { (short) 10, (byte) 0, (byte) 1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) 1, (int) 'a');
    }

    @Test
    public void test02297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02297");
        int[] intArray3 = new int[] { (short) 10, (short) -1, (byte) 1 };
        int[] intArray7 = new int[] { (short) 100, ' ', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 10, 1);
    }

    @Test
    public void test02298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02298");
        int[] intArray5 = new int[] { '#', '4', (byte) 100, (byte) 1, (byte) 0 };
        int[] intArray7 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, 0, (-1));
    }

    @Test
    public void test02299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02299");
        int[] intArray6 = new int[] { 'a', 1, 'a', 0, 10, 0 };
        int[] intArray11 = new int[] { ' ', '#', 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (byte) 0, (int) 'a');
    }

    @Test
    public void test02300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02300");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, 0, (int) (short) 0);
    }

    @Test
    public void test02301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02301");
        int[] intArray4 = new int[] { (short) -1, '#', (byte) 0, (byte) 0 };
        int[] intArray11 = new int[] { 10, 'a', 100, 0, 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) -1, (int) (byte) 1);
    }

    @Test
    public void test02302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02302");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (short) 1, 1);
    }

    @Test
    public void test02303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02303");
        int[] intArray4 = new int[] { 1, (short) 100, (short) 1, (short) 10 };
        int[] intArray10 = new int[] { (byte) -1, (short) 100, 0, (short) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, 10, (int) (byte) 1);
    }

    @Test
    public void test02304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02304");
        int[] intArray1 = new int[] { 10 };
        int[] intArray5 = new int[] { 0, 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (byte) 10, (-1));
    }

    @Test
    public void test02305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02305");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray8 = new int[] { (short) -1, (short) -1, (short) 0, (short) -1, ' ', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) 0, (int) (byte) -1);
    }

    @Test
    public void test02306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02306");
        int[] intArray4 = new int[] { (byte) 0, 'a', (byte) -1, 0 };
        int[] intArray7 = new int[] { (short) 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) '4', (int) '4');
    }

    @Test
    public void test02307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02307");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        int[] intArray8 = new int[] { (byte) -1, (short) 1, 10, 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test02308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02308");
        int[] intArray4 = new int[] { '4', 1, (short) 0, '4' };
        int[] intArray8 = new int[] { (byte) 1, (short) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) '#', 0);
    }

    @Test
    public void test02309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02309");
        int[] intArray2 = new int[] { (short) 100, (byte) -1 };
        int[] intArray7 = new int[] { (short) -1, 0, (short) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 10, (int) (short) 100);
    }

    @Test
    public void test02310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02310");
        int[] intArray5 = new int[] { 0, 0, (short) 1, '4', (short) 1 };
        int[] intArray10 = new int[] { (short) 100, (byte) 0, (short) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 0, (int) (byte) 0);
    }

    @Test
    public void test02311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02311");
        int[] intArray3 = new int[] { 'a', (short) -1, (byte) 1 };
        int[] intArray8 = new int[] { 'a', (byte) 1, 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (byte) 1, (int) ' ');
    }

    @Test
    public void test02312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02312");
        int[] intArray2 = new int[] { 'a', (short) 100 };
        int[] intArray8 = new int[] { '#', (byte) -1, (short) -1, (byte) -1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 100, 100);
    }

    @Test
    public void test02313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02313");
        int[] intArray3 = new int[] { (short) 1, (short) 100, (short) 0 };
        int[] intArray5 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) -1, (int) ' ');
    }

    @Test
    public void test02314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02314");
        int[] intArray3 = new int[] { 1, 'a', (byte) 0 };
        int[] intArray7 = new int[] { (byte) -1, '#', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) 'a', (int) (short) 1);
    }

    @Test
    public void test02315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02315");
        int[] intArray6 = new int[] { 'a', 0, (short) 10, '#', '4', (byte) 10 };
        int[] intArray13 = new int[] { (byte) 100, (short) 0, (short) 1, (-1), (short) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (short) 10, (int) 'a');
    }

    @Test
    public void test02316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02316");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 10, 10, (byte) 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) ' ', (int) (byte) 10);
    }

    @Test
    public void test02317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02317");
        int[] intArray3 = new int[] { (-1), 'a', 100 };
        int[] intArray8 = new int[] { (short) 10, (short) 100, (-1), 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (byte) 100, 10);
    }

    @Test
    public void test02318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02318");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) -1, (short) 100, 10, 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) -1, (int) '4');
    }

    @Test
    public void test02319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02319");
        int[] intArray6 = new int[] { 1, (short) 10, 100, 100, 1, 0 };
        int[] intArray9 = new int[] { (-1), '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, 0, 10);
    }

    @Test
    public void test02320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02320");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray7 = new int[] { (short) 0, (byte) 10, (short) -1, (byte) 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) 100, (int) '#');
    }

    @Test
    public void test02321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02321");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) 100, '#', (short) 100, (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) 'a', (int) ' ');
    }

    @Test
    public void test02322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02322");
        int[] intArray6 = new int[] { 1, (-1), (byte) 100, (short) -1, '4', '4' };
        int[] intArray12 = new int[] { 10, 'a', (byte) 100, (short) 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) 0, 100);
    }

    @Test
    public void test02323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02323");
        int[] intArray6 = new int[] { 0, 100, (short) 10, (short) -1, (byte) -1, (short) 1 };
        int[] intArray9 = new int[] { 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (short) 100, 100);
    }

    @Test
    public void test02324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02324");
        int[] intArray5 = new int[] { (short) 100, 1, (short) -1, (byte) 1, (byte) 10 };
        int[] intArray9 = new int[] { 10, (short) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (-1), (int) ' ');
    }

    @Test
    public void test02325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02325");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 0, '#', 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) 1, (int) 'a');
    }

    @Test
    public void test02326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02326");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (byte) 0, (byte) 10, 10, 'a', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) 10, (int) (byte) 1);
    }

    @Test
    public void test02327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02327");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray6 = new int[] { (-1), 10, 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 0, 0);
    }

    @Test
    public void test02328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02328");
        int[] intArray2 = new int[] { 'a', (short) 1 };
        int[] intArray8 = new int[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) 100, (int) (byte) 10);
    }

    @Test
    public void test02329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02329");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray7 = new int[] { (byte) -1, (byte) 10, 10, 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test02330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02330");
        int[] intArray4 = new int[] { (short) 10, (byte) 1, (short) 0, '#' };
        int[] intArray8 = new int[] { (short) 0, '#', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) 100, (int) (byte) -1);
    }

    @Test
    public void test02331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02331");
        int[] intArray6 = new int[] { (byte) -1, 0, (short) 1, (byte) 10, 100, '4' };
        int[] intArray8 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 0, (int) 'a');
    }

    @Test
    public void test02332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02332");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) '#', (-1));
    }

    @Test
    public void test02333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02333");
        int[] intArray3 = new int[] { (short) -1, 10, (short) 10 };
        int[] intArray8 = new int[] { (byte) 0, 10, 'a', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (-1), (int) (byte) 10);
    }

    @Test
    public void test02334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02334");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray8 = new int[] { '4', '4', (byte) 100, (short) 1, 'a', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) -1, (int) (short) 10);
    }

    @Test
    public void test02335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02335");
        int[] intArray6 = new int[] { (-1), (short) 100, '#', 0, 'a', (-1) };
        int[] intArray13 = new int[] { 100, (byte) 0, 'a', (short) 10, (byte) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) '#', 10);
    }

    @Test
    public void test02336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02336");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray7 = new int[] { '#', (byte) -1, (short) 10, (short) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) 100, (int) (short) 0);
    }

    @Test
    public void test02337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02337");
        int[] intArray6 = new int[] { (short) -1, (-1), (byte) 10, 10, 'a', '4' };
        int[] intArray11 = new int[] { '#', (short) 0, (short) 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (short) 10, (int) (byte) 100);
    }

    @Test
    public void test02338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02338");
        int[] intArray3 = new int[] { (short) -1, 10, (byte) 0 };
        int[] intArray6 = new int[] { 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) 0, 0);
    }

    @Test
    public void test02339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02339");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray8 = new int[] { '#', (short) -1, (short) -1, (short) 0, 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) ' ', (int) '4');
    }

    @Test
    public void test02340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02340");
        int[] intArray6 = new int[] { (short) 0, ' ', (short) -1, (byte) 0, (byte) 100, (short) -1 };
        int[] intArray11 = new int[] { 0, (short) 10, 'a', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (byte) 1, (int) (byte) 1);
    }

    @Test
    public void test02341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02341");
        int[] intArray4 = new int[] { 'a', 0, (byte) -1, (short) 1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, 100, (int) '#');
    }

    @Test
    public void test02342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02342");
        int[] intArray2 = new int[] { '4', (short) 0 };
        int[] intArray4 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) 'a', (int) (byte) 100);
    }

    @Test
    public void test02343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02343");
        int[] intArray3 = new int[] { (byte) 1, 100, (byte) 100 };
        int[] intArray6 = new int[] { (short) 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, 0, (int) (byte) 0);
    }

    @Test
    public void test02344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02344");
        int[] intArray5 = new int[] { (byte) -1, (-1), 'a', (byte) -1, '4' };
        int[] intArray7 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, 0, (int) (byte) 1);
    }

    @Test
    public void test02345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02345");
        int[] intArray2 = new int[] { (-1), 0 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) ' ', (int) '4');
    }

    @Test
    public void test02346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02346");
        int[] intArray3 = new int[] { (byte) 100, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { (byte) -1, (byte) 10, '#', (-1), (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 1, (int) (byte) 0);
    }

    @Test
    public void test02347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02347");
        int[] intArray3 = new int[] { '#', (short) 0, (short) 100 };
        int[] intArray7 = new int[] { (-1), (short) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 100, (int) (short) 1);
    }

    @Test
    public void test02348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02348");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (-1), (short) -1, 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 100, (int) (byte) 100);
    }

    @Test
    public void test02349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02349");
        int[] intArray2 = new int[] { (byte) 10, '#' };
        int[] intArray4 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (byte) 10, (int) (short) 0);
    }

    @Test
    public void test02350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02350");
        int[] intArray5 = new int[] { (byte) 100, (short) 10, '#', 100, (byte) -1 };
        int[] intArray9 = new int[] { (byte) 100, (short) 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) 'a', (int) (byte) 1);
    }

    @Test
    public void test02351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02351");
        int[] intArray5 = new int[] { (short) 0, (byte) 10, (short) -1, 10, (-1) };
        int[] intArray9 = new int[] { (short) 10, '4', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 0, (int) (byte) 1);
    }

    @Test
    public void test02352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02352");
        int[] intArray6 = new int[] { (-1), (byte) 100, 'a', (-1), 100, '4' };
        int[] intArray13 = new int[] { 'a', (short) 1, 10, 10, (-1), 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) ' ', (int) (short) 0);
    }

    @Test
    public void test02353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02353");
        int[] intArray5 = new int[] { (byte) 0, (byte) 1, (byte) 100, 0, '#' };
        int[] intArray10 = new int[] { (short) -1, (short) 100, 'a', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 100, (-1));
    }

    @Test
    public void test02354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02354");
        int[] intArray5 = new int[] { (byte) 10, (byte) -1, (byte) 100, (short) 1, 1 };
        int[] intArray8 = new int[] { (byte) -1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) 0, 10);
    }

    @Test
    public void test02355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02355");
        int[] intArray1 = new int[] { 100 };
        int[] intArray5 = new int[] { 'a', (byte) 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) '#', 1);
    }

    @Test
    public void test02356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02356");
        int[] intArray3 = new int[] { 1, 1, (byte) 10 };
        int[] intArray7 = new int[] { (short) -1, (short) 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) 0, (int) (short) 10);
    }

    @Test
    public void test02357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02357");
        int[] intArray6 = new int[] { (byte) -1, '4', (byte) 1, (short) -1, (-1), (-1) };
        int[] intArray9 = new int[] { 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, 10, (int) (short) 0);
    }

    @Test
    public void test02358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02358");
        int[] intArray4 = new int[] { ' ', (byte) 0, (short) 10, 0 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (byte) 0, (-1));
    }

    @Test
    public void test02359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02359");
        int[] intArray5 = new int[] { 0, 10, (byte) 1, (short) 10, 0 };
        int[] intArray12 = new int[] { (short) 100, (byte) 10, (short) 1, '4', (byte) 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (byte) 0, 100);
    }

    @Test
    public void test02360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02360");
        int[] intArray4 = new int[] { 100, (short) -1, 100, (byte) 100 };
        int[] intArray7 = new int[] { (byte) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) 'a', 0);
    }

    @Test
    public void test02361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02361");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) 100, 100, (byte) 100, 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, 0, (int) (short) 10);
    }

    @Test
    public void test02362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02362");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 100, 10);
    }

    @Test
    public void test02363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02363");
        int[] intArray5 = new int[] { (-1), ' ', 0, '4', (byte) 0 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (short) 100, (int) (byte) 0);
    }

    @Test
    public void test02364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02364");
        int[] intArray4 = new int[] { '4', 1, (byte) 0, 100 };
        int[] intArray7 = new int[] { (byte) -1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) -1, 0);
    }

    @Test
    public void test02365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02365");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray8 = new int[] { (short) 10, (short) 10, (short) 0, (-1), (short) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 0, (int) (byte) 1);
    }

    @Test
    public void test02366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02366");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, 1, (int) (short) 100);
    }

    @Test
    public void test02367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02367");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray6 = new int[] { '4', ' ', 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (byte) 1, (int) (byte) 1);
    }

    @Test
    public void test02368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02368");
        int[] intArray5 = new int[] { (-1), (-1), '4', (short) 10, (short) -1 };
        int[] intArray8 = new int[] { (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 0, (int) '4');
    }

    @Test
    public void test02369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02369");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray3 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) '#', (int) (byte) 1);
    }

    @Test
    public void test02370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02370");
        int[] intArray6 = new int[] { '4', (-1), (byte) 1, ' ', (byte) 0, (short) 100 };
        int[] intArray10 = new int[] { (short) 10, (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (-1), (int) (byte) 10);
    }

    @Test
    public void test02371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02371");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 10, (int) ' ');
    }

    @Test
    public void test02372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02372");
        int[] intArray2 = new int[] { (short) 1, (short) -1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (byte) 0, (int) (byte) 10);
    }

    @Test
    public void test02373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02373");
        int[] intArray6 = new int[] { '#', (short) 0, (short) 100, 1, 100, '4' };
        int[] intArray8 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) ' ', (int) ' ');
    }

    @Test
    public void test02374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02374");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray6 = new int[] { (short) -1, (-1), 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 0, (int) ' ');
    }

    @Test
    public void test02375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02375");
        int[] intArray2 = new int[] { '4', (-1) };
        int[] intArray4 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 1, (int) (byte) 10);
    }

    @Test
    public void test02376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02376");
        int[] intArray4 = new int[] { 100, (short) 10, (byte) 0, (short) 10 };
        int[] intArray10 = new int[] { 10, '4', (-1), 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (byte) 100, (int) (short) 1);
    }

    @Test
    public void test02377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02377");
        int[] intArray2 = new int[] { (byte) 10, (short) 0 };
        int[] intArray9 = new int[] { (short) 10, (short) -1, 100, 1, 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (byte) 1, (int) '#');
    }

    @Test
    public void test02378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02378");
        int[] intArray3 = new int[] { (short) -1, '4', (byte) 0 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (byte) 10, (int) (byte) 100);
    }

    @Test
    public void test02379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02379");
        int[] intArray6 = new int[] { (byte) 0, (short) 10, (byte) -1, (-1), (byte) 1, (byte) 10 };
        int[] intArray13 = new int[] { (short) -1, (byte) -1, (short) 0, (byte) 0, 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (byte) 10, 1);
    }

    @Test
    public void test02380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02380");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 10, (short) 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test02381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02381");
        int[] intArray2 = new int[] { (short) 1, (short) 10 };
        int[] intArray5 = new int[] { (-1), '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) ' ', (int) (byte) -1);
    }

    @Test
    public void test02382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02382");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 1, 100, '4', (short) -1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) 1, (int) 'a');
    }

    @Test
    public void test02383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02383");
        int[] intArray4 = new int[] { (short) 0, 10, (short) 10, (byte) 10 };
        int[] intArray11 = new int[] { '#', (byte) 100, (byte) -1, 'a', (short) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) 'a', (int) (byte) 1);
    }

    @Test
    public void test02384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02384");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (short) 100, (int) ' ');
    }

    @Test
    public void test02385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02385");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray8 = new int[] { (-1), (byte) -1, 1, (byte) 10, (short) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) 100, (int) 'a');
    }

    @Test
    public void test02386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02386");
        int[] intArray5 = new int[] { (short) 1, (byte) 0, (byte) 10, 10, (short) 10 };
        int[] intArray11 = new int[] { 100, (byte) 10, 'a', (byte) 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) '4', (int) (short) 10);
    }

    @Test
    public void test02387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02387");
        int[] intArray1 = new int[] { 0 };
        int[] intArray3 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) '4', 0);
    }

    @Test
    public void test02388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02388");
        int[] intArray6 = new int[] { (short) 0, (byte) -1, (byte) 10, (short) 1, 10, '4' };
        int[] intArray11 = new int[] { (short) 0, 100, (-1), 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (byte) 10, (int) '#');
    }

    @Test
    public void test02389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02389");
        int[] intArray4 = new int[] { (byte) 100, 0, ' ', (byte) 1 };
        int[] intArray6 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 1, 0);
    }

    @Test
    public void test02390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02390");
        int[] intArray2 = new int[] { (short) 0, ' ' };
        int[] intArray6 = new int[] { (short) 1, (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) 100, 0);
    }

    @Test
    public void test02391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02391");
        int[] intArray2 = new int[] { (-1), '4' };
        int[] intArray9 = new int[] { '4', (byte) 10, (byte) 1, (byte) 1, '4', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 10, (int) (short) 100);
    }

    @Test
    public void test02392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02392");
        int[] intArray3 = new int[] { (byte) 1, (short) -1, 0 };
        int[] intArray6 = new int[] { (-1), 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) 10, (int) (short) 10);
    }

    @Test
    public void test02393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02393");
        int[] intArray6 = new int[] { (byte) 10, 'a', 0, (short) 0, (short) 1, (short) 100 };
        int[] intArray12 = new int[] { (short) 10, 1, (short) 0, 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) 10, 0);
    }

    @Test
    public void test02394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02394");
        int[] intArray4 = new int[] { 10, ' ', '4', (short) 100 };
        int[] intArray8 = new int[] { (byte) 0, '#', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 0, 100);
    }

    @Test
    public void test02395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02395");
        int[] intArray2 = new int[] { (short) 0, (short) 1 };
        int[] intArray8 = new int[] { 100, (byte) 0, 1, 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) 10, (int) (short) 10);
    }

    @Test
    public void test02396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02396");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { '#', 100, (byte) -1, (short) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) -1, (int) '4');
    }

    @Test
    public void test02397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02397");
        int[] intArray5 = new int[] { ' ', (short) 100, '#', (byte) 10, (byte) 10 };
        int[] intArray11 = new int[] { (byte) 1, '#', (byte) 1, (byte) 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (-1), 100);
    }

    @Test
    public void test02398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02398");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) 'a', (int) '#');
    }

    @Test
    public void test02399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02399");
        int[] intArray6 = new int[] { 'a', (-1), 1, 1, 1, ' ' };
        int[] intArray9 = new int[] { (byte) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, 0, (-1));
    }

    @Test
    public void test02400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02400");
        int[] intArray4 = new int[] { (byte) 10, (short) 0, 'a', (byte) 0 };
        int[] intArray11 = new int[] { (byte) -1, '#', (byte) 10, (byte) 0, (short) -1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) 'a', (int) (short) 10);
    }

    @Test
    public void test02401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02401");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) '4', 100);
    }

    @Test
    public void test02402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02402");
        int[] intArray1 = new int[] { '4' };
        int[] intArray3 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (byte) 100, 10);
    }

    @Test
    public void test02403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02403");
        int[] intArray4 = new int[] { '#', (short) 1, (byte) 100, 100 };
        int[] intArray7 = new int[] { (byte) 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) 100, 100);
    }

    @Test
    public void test02404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02404");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 'a', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) '4', (int) (short) -1);
    }

    @Test
    public void test02405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02405");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) '4', 0);
    }

    @Test
    public void test02406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02406");
        int[] intArray4 = new int[] { (byte) 100, 10, 1, (short) 100 };
        int[] intArray7 = new int[] { ' ', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) 0, 1);
    }

    @Test
    public void test02407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02407");
        int[] intArray6 = new int[] { (short) 1, (byte) -1, (short) 10, (byte) 100, (short) -1, (short) 0 };
        int[] intArray13 = new int[] { '4', (short) 0, 'a', 'a', '4', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (byte) 1, (int) (short) 100);
    }

    @Test
    public void test02408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02408");
        int[] intArray1 = new int[] { '#' };
        int[] intArray5 = new int[] { ' ', (-1), ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (-1), (int) (short) 0);
    }

    @Test
    public void test02409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02409");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) 'a', (int) (short) 1);
    }

    @Test
    public void test02410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02410");
        int[] intArray6 = new int[] { ' ', (short) 10, 1, (byte) 1, (byte) 1, 0 };
        int[] intArray11 = new int[] { ' ', '#', 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) 'a', 100);
    }

    @Test
    public void test02411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02411");
        int[] intArray1 = new int[] { 1 };
        int[] intArray6 = new int[] { 1, (short) 10, (short) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test02412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02412");
        int[] intArray6 = new int[] { (byte) 1, (byte) 10, 1, 10, 100, (short) 0 };
        int[] intArray8 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) '#', (int) (byte) 0);
    }

    @Test
    public void test02413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02413");
        int[] intArray4 = new int[] { 0, (short) 10, '4', (short) 1 };
        int[] intArray10 = new int[] { (short) 0, (short) 10, (byte) 100, (byte) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) '#', 10);
    }

    @Test
    public void test02414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02414");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, 100, (int) ' ');
    }

    @Test
    public void test02415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02415");
        int[] intArray1 = new int[] { 100 };
        int[] intArray4 = new int[] { ' ', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test02416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02416");
        int[] intArray3 = new int[] { (short) 100, (byte) -1, (byte) -1 };
        int[] intArray5 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test02417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02417");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) -1, (int) 'a');
    }

    @Test
    public void test02418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02418");
        int[] intArray5 = new int[] { (short) 10, (byte) 10, (short) 1, ' ', (short) 100 };
        int[] intArray7 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) 0, (int) (byte) -1);
    }

    @Test
    public void test02419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02419");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray7 = new int[] { 1, 10, '#', (short) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) ' ', (int) (byte) 1);
    }

    @Test
    public void test02420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02420");
        int[] intArray1 = new int[] { 0 };
        int[] intArray6 = new int[] { (byte) 100, (short) -1, 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 1, (int) (byte) -1);
    }

    @Test
    public void test02421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02421");
        int[] intArray4 = new int[] { (short) -1, '#', '4', 'a' };
        int[] intArray10 = new int[] { (byte) 10, (byte) 0, (short) -1, (byte) -1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (-1), (int) '#');
    }

    @Test
    public void test02422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02422");
        int[] intArray4 = new int[] { (-1), (short) -1, (byte) 1, (-1) };
        int[] intArray10 = new int[] { (short) 1, (byte) 0, 0, (-1), (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, 1, (int) (short) -1);
    }

    @Test
    public void test02423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02423");
        int[] intArray2 = new int[] { (short) 10, (byte) 0 };
        int[] intArray4 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) ' ', (int) (short) -1);
    }

    @Test
    public void test02424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02424");
        int[] intArray2 = new int[] { (short) 1, (byte) -1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (byte) 100, (int) (byte) -1);
    }

    @Test
    public void test02425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02425");
        int[] intArray5 = new int[] { (byte) 0, (byte) 100, '4', (short) 100, (short) -1 };
        int[] intArray7 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) 'a', (int) (byte) 10);
    }

    @Test
    public void test02426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02426");
        int[] intArray4 = new int[] { (short) 10, ' ', 0, (byte) 10 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) '4', 10);
    }

    @Test
    public void test02427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02427");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray6 = new int[] { 'a', (byte) 1, (byte) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (short) -1, 10);
    }

    @Test
    public void test02428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02428");
        int[] intArray3 = new int[] { '#', (short) 0, (short) 10 };
        int[] intArray6 = new int[] { ' ', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) 1, (int) (short) 10);
    }

    @Test
    public void test02429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02429");
        int[] intArray4 = new int[] { (short) 100, (byte) 100, 0, 100 };
        int[] intArray8 = new int[] { 1, (short) 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) -1, (int) 'a');
    }

    @Test
    public void test02430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02430");
        int[] intArray4 = new int[] { 10, (byte) 10, (short) 100, 100 };
        int[] intArray9 = new int[] { '4', 1, (byte) -1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) 'a', (int) '4');
    }

    @Test
    public void test02431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02431");
        int[] intArray2 = new int[] { 0, ' ' };
        int[] intArray8 = new int[] { 0, 1, ' ', (short) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) '#', 0);
    }

    @Test
    public void test02432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02432");
        int[] intArray5 = new int[] { (short) -1, (short) -1, 1, (byte) -1, (short) 10 };
        int[] intArray10 = new int[] { (short) 10, 100, (short) 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) '#', (int) (short) 1);
    }

    @Test
    public void test02433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02433");
        int[] intArray1 = new int[] { 0 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 10, (int) (byte) 0);
    }

    @Test
    public void test02434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02434");
        int[] intArray2 = new int[] { '4', 100 };
        int[] intArray6 = new int[] { '#', 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (short) -1, (int) (byte) 0);
    }

    @Test
    public void test02435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02435");
        int[] intArray3 = new int[] { (short) 100, (byte) 1, (byte) -1 };
        int[] intArray5 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (-1), (int) (short) 0);
    }

    @Test
    public void test02436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02436");
        int[] intArray5 = new int[] { (byte) 100, (byte) 1, (byte) 10, ' ', (byte) 10 };
        int[] intArray10 = new int[] { (byte) 0, (byte) 10, (byte) 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) 'a', (int) ' ');
    }

    @Test
    public void test02437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02437");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray7 = new int[] { '#', (short) 100, (short) 1, (short) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) 1, (int) (byte) 1);
    }

    @Test
    public void test02438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02438");
        int[] intArray2 = new int[] { (byte) 1, (-1) };
        int[] intArray7 = new int[] { (short) 100, (-1), '#', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) ' ', 0);
    }

    @Test
    public void test02439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02439");
        int[] intArray6 = new int[] { (short) -1, 100, (short) 0, ' ', 'a', (byte) 10 };
        int[] intArray12 = new int[] { (byte) -1, '4', (byte) 100, '#', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) '4', (int) '4');
    }

    @Test
    public void test02440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02440");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 100, (int) '#');
    }

    @Test
    public void test02441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02441");
        int[] intArray3 = new int[] { (short) 0, 0, '4' };
        int[] intArray10 = new int[] { 100, (short) -1, (byte) 100, (short) 100, (short) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) 'a', (-1));
    }

    @Test
    public void test02442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02442");
        int[] intArray4 = new int[] { 10, (short) 100, (short) 100, (byte) 0 };
        int[] intArray9 = new int[] { '4', (byte) -1, 'a', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) '#', 10);
    }

    @Test
    public void test02443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02443");
        int[] intArray6 = new int[] { 'a', '#', '4', (byte) 1, (byte) 0, (short) 0 };
        int[] intArray12 = new int[] { 10, 10, (-1), (byte) 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) 10, (int) '4');
    }

    @Test
    public void test02444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02444");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) -1, (-1), 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) ' ', (int) (short) 1);
    }

    @Test
    public void test02445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02445");
        int[] intArray6 = new int[] { (short) 1, 100, (byte) 100, (byte) -1, '#', (short) 10 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) 10, (int) '4');
    }

    @Test
    public void test02446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02446");
        int[] intArray6 = new int[] { (short) 1, '#', (short) 10, (byte) 1, (-1), (short) 100 };
        int[] intArray9 = new int[] { 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (short) 1, (int) (short) -1);
    }

    @Test
    public void test02447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02447");
        int[] intArray5 = new int[] { (short) 100, 'a', (-1), 10, '#' };
        int[] intArray12 = new int[] { ' ', (byte) 1, 10, (short) 100, 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (byte) 0, 1);
    }

    @Test
    public void test02448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02448");
        int[] intArray2 = new int[] { 0, 'a' };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 0, (int) '4');
    }

    @Test
    public void test02449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02449");
        int[] intArray3 = new int[] { 100, (short) -1, 1 };
        int[] intArray9 = new int[] { '#', (short) 0, (short) 1, (short) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (-1), (int) ' ');
    }

    @Test
    public void test02450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02450");
        int[] intArray5 = new int[] { 10, (byte) 1, (short) 100, (byte) -1, (short) 0 };
        int[] intArray12 = new int[] { '#', '#', (short) -1, ' ', '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) ' ', (int) (byte) 0);
    }

    @Test
    public void test02451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02451");
        int[] intArray6 = new int[] { (byte) 10, 10, (byte) 1, 'a', '#', (short) 0 };
        int[] intArray13 = new int[] { ' ', '#', '4', (short) 0, (byte) 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (byte) 100, (int) (byte) -1);
    }

    @Test
    public void test02452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02452");
        int[] intArray4 = new int[] { (byte) 1, 100, (-1), '#' };
        int[] intArray6 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (short) 100, 1);
    }

    @Test
    public void test02453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02453");
        int[] intArray4 = new int[] { (byte) 10, 'a', 10, 100 };
        int[] intArray11 = new int[] { 0, (short) -1, 100, ' ', 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, 0, (int) (short) 10);
    }

    @Test
    public void test02454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02454");
        int[] intArray1 = new int[] { 100 };
        int[] intArray8 = new int[] { 0, (short) -1, 0, 1, ' ', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 0, (int) (short) 1);
    }

    @Test
    public void test02455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02455");
        int[] intArray4 = new int[] { 'a', (short) 0, (byte) 0, 100 };
        int[] intArray6 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 0, 0);
    }

    @Test
    public void test02456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02456");
        int[] intArray6 = new int[] { (short) -1, (-1), 100, ' ', (short) -1, (short) 100 };
        int[] intArray13 = new int[] { '#', (byte) 100, (short) 100, 1, 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (byte) 10, (int) ' ');
    }

    @Test
    public void test02457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02457");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray4 = new int[] { (-1), (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 0, (int) ' ');
    }

    @Test
    public void test02458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02458");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray5 = new int[] { '4', '#', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (byte) 100, (int) (short) -1);
    }

    @Test
    public void test02459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02459");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (-1), (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (byte) 100, (int) (short) 0);
    }

    @Test
    public void test02460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02460");
        int[] intArray2 = new int[] { (byte) 10, (short) -1 };
        int[] intArray7 = new int[] { 10, '#', (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (short) 10, (int) (short) 100);
    }

    @Test
    public void test02461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02461");
        int[] intArray5 = new int[] { (byte) 1, 100, (short) 100, (byte) 0, '4' };
        int[] intArray12 = new int[] { (byte) -1, (short) 10, '4', (byte) 0, 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) ' ', (int) (short) 100);
    }

    @Test
    public void test02462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02462");
        int[] intArray6 = new int[] { (byte) 10, '4', (short) 100, (short) -1, 10, '4' };
        int[] intArray10 = new int[] { ' ', (short) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (-1), 10);
    }

    @Test
    public void test02463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02463");
        int[] intArray5 = new int[] { 100, ' ', (short) -1, 'a', (short) 100 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (short) 1, (int) 'a');
    }

    @Test
    public void test02464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02464");
        int[] intArray2 = new int[] { 10, (byte) 10 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 100, (int) (short) 1);
    }

    @Test
    public void test02465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02465");
        int[] intArray5 = new int[] { 10, (short) 100, ' ', (byte) -1, ' ' };
        int[] intArray11 = new int[] { (short) 10, (short) 10, 1, 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 10, 0);
    }

    @Test
    public void test02466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02466");
        int[] intArray3 = new int[] { (byte) -1, 'a', (short) 10 };
        int[] intArray9 = new int[] { (short) 0, (byte) 1, 1, (byte) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 10, (int) '#');
    }

    @Test
    public void test02467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02467");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 0, 1);
    }

    @Test
    public void test02468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02468");
        int[] intArray5 = new int[] { (short) -1, (short) 0, (byte) 10, (short) -1, (byte) 1 };
        int[] intArray10 = new int[] { (short) 100, 100, 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 0, 10);
    }

    @Test
    public void test02469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02469");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 100, (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, 100, (int) (byte) 0);
    }

    @Test
    public void test02470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02470");
        int[] intArray3 = new int[] { 100, (short) 100, 'a' };
        int[] intArray9 = new int[] { 'a', (-1), 'a', ' ', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) '#', (int) (byte) 0);
    }

    @Test
    public void test02471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02471");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray6 = new int[] { (byte) 0, (byte) -1, (short) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 1, (int) (byte) 10);
    }

    @Test
    public void test02472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02472");
        int[] intArray4 = new int[] { (-1), (short) 0, (short) 0, 0 };
        int[] intArray10 = new int[] { '#', (byte) -1, (short) 10, (short) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, 0, (int) (short) 0);
    }

    @Test
    public void test02473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02473");
        int[] intArray3 = new int[] { (-1), '4', '4' };
        int[] intArray5 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, 1, (int) '#');
    }

    @Test
    public void test02474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02474");
        int[] intArray2 = new int[] { 0, (short) 10 };
        int[] intArray8 = new int[] { (short) 0, 10, (short) -1, (byte) 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (byte) 1, (int) 'a');
    }

    @Test
    public void test02475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02475");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (byte) -1, (int) (short) 10);
    }

    @Test
    public void test02476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02476");
        int[] intArray3 = new int[] { (byte) 0, 100, (short) 100 };
        int[] intArray6 = new int[] { (short) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) 10, 10);
    }

    @Test
    public void test02477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02477");
        int[] intArray5 = new int[] { '#', (short) 100, (short) 0, 100, (byte) 1 };
        int[] intArray7 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) '#', (-1));
    }

    @Test
    public void test02478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02478");
        int[] intArray3 = new int[] { (short) 10, (short) -1, (byte) 1 };
        int[] intArray9 = new int[] { (short) -1, (short) 0, (short) 100, 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (short) 100, (int) (short) -1);
    }

    @Test
    public void test02479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02479");
        int[] intArray3 = new int[] { (-1), 100, (short) -1 };
        int[] intArray9 = new int[] { (short) 0, (byte) 0, (-1), (short) 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (short) 1, 10);
    }

    @Test
    public void test02480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02480");
        int[] intArray5 = new int[] { 0, 100, (byte) 0, '4', (-1) };
        int[] intArray7 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) 100, 100);
    }

    @Test
    public void test02481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02481");
        int[] intArray6 = new int[] { (byte) 10, (byte) 0, 1, (byte) 10, (byte) 10, (short) 0 };
        int[] intArray8 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 0, 1);
    }

    @Test
    public void test02482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02482");
        int[] intArray4 = new int[] { 0, '#', ' ', '4' };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, 1, (int) (short) 10);
    }

    @Test
    public void test02483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02483");
        int[] intArray6 = new int[] { (short) 0, (byte) 100, '4', ' ', (byte) 10, (short) -1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) 10, 0);
    }

    @Test
    public void test02484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02484");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray5 = new int[] { 1, ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (byte) 100, (int) (byte) 10);
    }

    @Test
    public void test02485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02485");
        int[] intArray3 = new int[] { (short) 1, (short) 100, (-1) };
        int[] intArray5 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test02486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02486");
        int[] intArray4 = new int[] { '#', (byte) 100, '#', 'a' };
        int[] intArray9 = new int[] { (short) 100, '4', 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (byte) -1, (int) (short) 10);
    }

    @Test
    public void test02487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02487");
        int[] intArray4 = new int[] { (short) 1, 1, (short) 0, '4' };
        int[] intArray6 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (short) 100, 10);
    }

    @Test
    public void test02488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02488");
        int[] intArray2 = new int[] { 0, (short) 0 };
        int[] intArray5 = new int[] { (short) 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) 'a', 0);
    }

    @Test
    public void test02489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02489");
        int[] intArray6 = new int[] { (short) 1, 1, (byte) 100, 10, (short) 10, 'a' };
        int[] intArray9 = new int[] { 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (short) 1, 0);
    }

    @Test
    public void test02490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02490");
        int[] intArray2 = new int[] { 1, (-1) };
        int[] intArray4 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (short) 100, 0);
    }

    @Test
    public void test02491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02491");
        int[] intArray2 = new int[] { 'a', (byte) -1 };
        int[] intArray7 = new int[] { ' ', (short) 10, (-1), ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (short) -1, (int) (byte) 10);
    }

    @Test
    public void test02492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02492");
        int[] intArray3 = new int[] { (short) 10, 100, 100 };
        int[] intArray9 = new int[] { '4', (byte) 1, (short) -1, (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (-1), (int) (short) -1);
    }

    @Test
    public void test02493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02493");
        int[] intArray2 = new int[] { (byte) 0, 'a' };
        int[] intArray4 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (short) 10, (int) 'a');
    }

    @Test
    public void test02494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02494");
        int[] intArray5 = new int[] { 0, 0, (byte) 1, (short) -1, (short) 0 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 0, (int) (byte) 0);
    }

    @Test
    public void test02495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02495");
        int[] intArray3 = new int[] { (short) 10, '4', (short) 1 };
        int[] intArray7 = new int[] { '4', 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) -1, (int) (byte) -1);
    }

    @Test
    public void test02496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02496");
        int[] intArray1 = new int[] { 0 };
        int[] intArray4 = new int[] { '4', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) -1, (-1));
    }

    @Test
    public void test02497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02497");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 'a', (short) 100, (short) 0, (byte) 100, 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, 0, 1);
    }

    @Test
    public void test02498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02498");
        int[] intArray6 = new int[] { '#', (short) 0, (byte) 0, (short) 10, 100, (short) 10 };
        int[] intArray13 = new int[] { '#', 100, (short) 100, (-1), (short) 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) '4', (-1));
    }

    @Test
    public void test02499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02499");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray8 = new int[] { '#', 100, 0, (short) 100, (byte) 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) 'a', (int) (byte) 0);
    }

    @Test
    public void test02500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test02500");
        int[] intArray5 = new int[] { ' ', '#', (short) -1, 10, (short) 10 };
        int[] intArray12 = new int[] { (byte) 10, (byte) 1, (-1), 'a', 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) -1, (int) (byte) 100);
    }
}

