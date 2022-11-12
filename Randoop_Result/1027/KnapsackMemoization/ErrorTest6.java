package KnapsackMemoization;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest6 {

    public static boolean debug = false;

    @Test
    public void test03001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03001");
        int[] intArray5 = new int[] { (short) -1, (short) 0, (byte) 1, (byte) 1, 10 };
        int[] intArray11 = new int[] { (byte) 1, 1, 100, (byte) 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) '4', 0);
    }

    @Test
    public void test03002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03002");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) 100, 100, (byte) 100, (byte) 10, '#', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) -1, (-1));
    }

    @Test
    public void test03003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03003");
        int[] intArray2 = new int[] { '#', 0 };
        int[] intArray8 = new int[] { 0, (short) 100, '4', (byte) 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 100, (int) (short) 0);
    }

    @Test
    public void test03004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03004");
        int[] intArray5 = new int[] { 'a', (short) 0, '4', 1, 0 };
        int[] intArray9 = new int[] { (byte) 0, 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) '#', 0);
    }

    @Test
    public void test03005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03005");
        int[] intArray3 = new int[] { (short) 10, 'a', (byte) 10 };
        int[] intArray10 = new int[] { (short) 1, 1, (byte) 10, (short) 1, ' ', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 0, (int) (byte) 10);
    }

    @Test
    public void test03006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03006");
        int[] intArray6 = new int[] { (-1), ' ', (short) -1, (byte) 1, (byte) 100, '#' };
        int[] intArray12 = new int[] { '#', (byte) 0, (byte) 100, 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (byte) 100, 100);
    }

    @Test
    public void test03007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03007");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (-1), (short) 10, ' ', (short) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, 0, (int) (byte) -1);
    }

    @Test
    public void test03008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03008");
        int[] intArray6 = new int[] { (byte) 0, (byte) 10, 100, 'a', (byte) 100, (byte) 100 };
        int[] intArray11 = new int[] { 10, 1, ' ', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test03009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03009");
        int[] intArray2 = new int[] { 'a', (short) 100 };
        int[] intArray4 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (-1), (-1));
    }

    @Test
    public void test03010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03010");
        int[] intArray3 = new int[] { 'a', (byte) 1, 'a' };
        int[] intArray9 = new int[] { 0, (byte) -1, (-1), (byte) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (short) 0, (int) ' ');
    }

    @Test
    public void test03011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03011");
        int[] intArray4 = new int[] { (short) 1, (short) 100, (byte) 100, 10 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (byte) -1, (int) (short) 1);
    }

    @Test
    public void test03012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03012");
        int[] intArray4 = new int[] { (short) 10, (short) 100, (byte) 10, (byte) 100 };
        int[] intArray7 = new int[] { (byte) 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) 100, (int) '4');
    }

    @Test
    public void test03013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03013");
        int[] intArray6 = new int[] { 1, 'a', (short) 100, 100, (short) -1, 10 };
        int[] intArray13 = new int[] { (byte) 10, (byte) 0, '#', (short) -1, (short) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 100, (int) 'a');
    }

    @Test
    public void test03014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03014");
        int[] intArray1 = new int[] { 100 };
        int[] intArray6 = new int[] { (short) 10, (short) 0, '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 0, 0);
    }

    @Test
    public void test03015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03015");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) 'a', (int) (short) 100);
    }

    @Test
    public void test03016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03016");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (byte) 0, (short) 100, (byte) 1, (byte) -1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) 100, (int) (byte) -1);
    }

    @Test
    public void test03017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03017");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 1, (byte) 1, 10, 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) 10, (-1));
    }

    @Test
    public void test03018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03018");
        int[] intArray6 = new int[] { '4', (-1), (byte) 0, ' ', (short) -1, (short) -1 };
        int[] intArray12 = new int[] { (short) 100, (byte) 0, (short) -1, (short) -1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 100, (int) (short) 0);
    }

    @Test
    public void test03019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03019");
        int[] intArray6 = new int[] { (short) 10, 100, (short) 1, (byte) -1, (short) 1, (byte) 1 };
        int[] intArray12 = new int[] { (byte) 10, '#', (byte) 10, '#', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (byte) 1, 0);
    }

    @Test
    public void test03020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03020");
        int[] intArray3 = new int[] { (byte) -1, (byte) 1, (short) -1 };
        int[] intArray7 = new int[] { '#', 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test03021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03021");
        int[] intArray2 = new int[] { '4', (byte) 10 };
        int[] intArray6 = new int[] { (short) 10, '#', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) 1, 1);
    }

    @Test
    public void test03022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03022");
        int[] intArray5 = new int[] { 100, (byte) 100, (byte) 1, ' ', (byte) 1 };
        int[] intArray10 = new int[] { (short) 1, ' ', (short) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (short) -1, (int) '#');
    }

    @Test
    public void test03023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03023");
        int[] intArray5 = new int[] { (byte) 10, '4', (short) 100, 100, ' ' };
        int[] intArray7 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) 10, (-1));
    }

    @Test
    public void test03024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03024");
        int[] intArray5 = new int[] { 100, (byte) -1, (short) 100, (-1), (short) 1 };
        int[] intArray10 = new int[] { (-1), 'a', 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (byte) 1, (int) (byte) 10);
    }

    @Test
    public void test03025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03025");
        int[] intArray4 = new int[] { (short) 10, (short) -1, (short) 100, '#' };
        int[] intArray9 = new int[] { 10, 10, ' ', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (byte) 1, (int) (short) 100);
    }

    @Test
    public void test03026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03026");
        int[] intArray6 = new int[] { (short) 10, (byte) 10, 0, 'a', 100, (short) 1 };
        int[] intArray9 = new int[] { 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 0, (int) (short) 100);
    }

    @Test
    public void test03027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03027");
        int[] intArray5 = new int[] { (short) -1, (short) -1, (byte) 1, (short) 100, (short) 10 };
        int[] intArray11 = new int[] { '4', (byte) 100, (short) 100, (byte) 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) -1, 0);
    }

    @Test
    public void test03028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03028");
        int[] intArray5 = new int[] { '4', (short) 1, (byte) 1, 'a', (byte) 100 };
        int[] intArray8 = new int[] { 'a', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) '4', 10);
    }

    @Test
    public void test03029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03029");
        int[] intArray4 = new int[] { (short) -1, (byte) 0, (short) -1, 0 };
        int[] intArray10 = new int[] { (byte) 0, (short) 100, (-1), 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, 0, (int) ' ');
    }

    @Test
    public void test03030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03030");
        int[] intArray4 = new int[] { (short) -1, (short) 10, 0, (short) 100 };
        int[] intArray8 = new int[] { (byte) 1, (short) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 1, (int) (short) 10);
    }

    @Test
    public void test03031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03031");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray8 = new int[] { 0, (byte) -1, (byte) 1, 1, 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) 1, (int) (short) 0);
    }

    @Test
    public void test03032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03032");
        int[] intArray6 = new int[] { '#', (short) 1, 10, (byte) 1, 0, ' ' };
        int[] intArray11 = new int[] { 1, (short) -1, (short) 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 1, (int) '#');
    }

    @Test
    public void test03033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03033");
        int[] intArray2 = new int[] { (short) -1, ' ' };
        int[] intArray6 = new int[] { (short) 0, ' ', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) '4', (int) (short) 100);
    }

    @Test
    public void test03034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03034");
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 10, 10, (byte) 10, 1 };
        int[] intArray13 = new int[] { '#', 10, '4', (byte) 1, (short) -1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (short) -1, (int) (byte) 0);
    }

    @Test
    public void test03035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03035");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 100, (short) -1, (short) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 1, (int) '#');
    }

    @Test
    public void test03036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03036");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (byte) 0, (int) (byte) 100);
    }

    @Test
    public void test03037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03037");
        int[] intArray5 = new int[] { (byte) 0, (byte) 10, 1, (short) 0, (short) 0 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 1, (int) (byte) 100);
    }

    @Test
    public void test03038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03038");
        int[] intArray3 = new int[] { (byte) 0, (-1), (-1) };
        int[] intArray9 = new int[] { 100, (byte) 1, 'a', 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 1, 10);
    }

    @Test
    public void test03039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03039");
        int[] intArray2 = new int[] { 0, (short) -1 };
        int[] intArray6 = new int[] { (short) 100, 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) '#', (int) (short) 100);
    }

    @Test
    public void test03040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03040");
        int[] intArray4 = new int[] { (short) 1, (short) 0, (short) 100, (byte) 1 };
        int[] intArray11 = new int[] { (short) 100, 'a', (short) 100, (short) 1, (byte) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (byte) 10, (-1));
    }

    @Test
    public void test03041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03041");
        int[] intArray5 = new int[] { 10, (byte) 100, 0, (short) 10, (byte) 10 };
        int[] intArray10 = new int[] { ' ', (short) 1, (short) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) 'a', (int) ' ');
    }

    @Test
    public void test03042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03042");
        int[] intArray1 = new int[] { '4' };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) 0, (int) (short) 10);
    }

    @Test
    public void test03043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03043");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (-1), (byte) 1, '4', (short) 100, (-1), (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) 1, (int) (byte) -1);
    }

    @Test
    public void test03044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03044");
        int[] intArray3 = new int[] { '4', (byte) 10, (short) 1 };
        int[] intArray8 = new int[] { (short) 100, 10, ' ', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test03045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03045");
        int[] intArray3 = new int[] { (short) 0, 100, (byte) 100 };
        int[] intArray10 = new int[] { (-1), (short) -1, (short) 10, '#', (byte) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) ' ', (-1));
    }

    @Test
    public void test03046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03046");
        int[] intArray2 = new int[] { (byte) -1, 10 };
        int[] intArray6 = new int[] { '#', (byte) 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 100, 100);
    }

    @Test
    public void test03047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03047");
        int[] intArray4 = new int[] { '#', (short) 0, (short) 100, (short) 0 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (byte) 0, (int) (short) -1);
    }

    @Test
    public void test03048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03048");
        int[] intArray5 = new int[] { 'a', (short) 1, '#', (short) 1, '4' };
        int[] intArray9 = new int[] { (byte) -1, (byte) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 100, (int) (short) -1);
    }

    @Test
    public void test03049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03049");
        int[] intArray4 = new int[] { 1, (byte) 100, '4', 1 };
        int[] intArray6 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (short) 0, 1);
    }

    @Test
    public void test03050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03050");
        int[] intArray5 = new int[] { (short) -1, (byte) 100, (byte) -1, (byte) -1, '#' };
        int[] intArray11 = new int[] { (byte) 100, '4', 100, (short) 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) '#', 100);
    }

    @Test
    public void test03051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03051");
        int[] intArray2 = new int[] { (byte) 1, 10 };
        int[] intArray8 = new int[] { (short) -1, (byte) -1, 100, 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 100, (int) (short) -1);
    }

    @Test
    public void test03052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03052");
        int[] intArray1 = new int[] { 0 };
        int[] intArray4 = new int[] { ' ', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (short) 0, (int) (byte) 0);
    }

    @Test
    public void test03053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03053");
        int[] intArray3 = new int[] { (short) 1, (short) 100, 'a' };
        int[] intArray9 = new int[] { (byte) 1, 100, (byte) -1, 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (byte) -1, (int) (byte) -1);
    }

    @Test
    public void test03054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03054");
        int[] intArray6 = new int[] { 'a', (short) 100, (short) 0, ' ', 1, (short) 10 };
        int[] intArray12 = new int[] { (byte) 100, (short) 10, '#', '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) ' ', 1);
    }

    @Test
    public void test03055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03055");
        int[] intArray6 = new int[] { (byte) 10, 1, 10, (short) -1, (byte) -1, (-1) };
        int[] intArray10 = new int[] { 10, (byte) -1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 10, (int) '4');
    }

    @Test
    public void test03056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03056");
        int[] intArray2 = new int[] { (short) 100, (short) 10 };
        int[] intArray6 = new int[] { 100, '#', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 10, (int) (short) 100);
    }

    @Test
    public void test03057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03057");
        int[] intArray1 = new int[] { 10 };
        int[] intArray4 = new int[] { '#', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 1, 1);
    }

    @Test
    public void test03058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03058");
        int[] intArray5 = new int[] { (short) 0, (byte) 1, (byte) -1, 'a', 1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) 10, 10);
    }

    @Test
    public void test03059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03059");
        int[] intArray5 = new int[] { '4', (byte) 100, 0, '4', 1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 0, (-1));
    }

    @Test
    public void test03060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03060");
        int[] intArray5 = new int[] { (short) 1, '#', 1, (short) 100, '#' };
        int[] intArray8 = new int[] { 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) 10, 10);
    }

    @Test
    public void test03061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03061");
        int[] intArray2 = new int[] { 100, 1 };
        int[] intArray7 = new int[] { (short) -1, (short) 1, (byte) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 100, (int) ' ');
    }

    @Test
    public void test03062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03062");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        int[] intArray5 = new int[] { (-1), (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 100, 100);
    }

    @Test
    public void test03063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03063");
        int[] intArray4 = new int[] { ' ', (byte) -1, 'a', (short) 10 };
        int[] intArray9 = new int[] { 0, (byte) 1, '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (byte) 1, (int) (byte) 10);
    }

    @Test
    public void test03064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03064");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 0, (int) (byte) 10);
    }

    @Test
    public void test03065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03065");
        int[] intArray5 = new int[] { 0, 0, 100, (byte) 100, (short) 0 };
        int[] intArray10 = new int[] { (short) 1, 100, 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (short) 100, (int) (short) 100);
    }

    @Test
    public void test03066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03066");
        int[] intArray2 = new int[] { (short) 1, 0 };
        int[] intArray4 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 0, (int) '#');
    }

    @Test
    public void test03067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03067");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) 100, (int) (short) -1);
    }

    @Test
    public void test03068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03068");
        int[] intArray4 = new int[] { ' ', 0, 'a', 10 };
        int[] intArray10 = new int[] { (short) 10, '4', '#', (byte) 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) ' ', (int) (byte) 100);
    }

    @Test
    public void test03069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03069");
        int[] intArray5 = new int[] { (short) -1, (byte) 0, 0, (short) 1, '#' };
        int[] intArray8 = new int[] { (byte) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (-1), (-1));
    }

    @Test
    public void test03070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03070");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { ' ', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 100, (int) (short) 0);
    }

    @Test
    public void test03071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03071");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, 0, 10, (byte) 1, (short) 100 };
        int[] intArray11 = new int[] { (-1), (short) 0, (short) -1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (byte) 100, (int) (byte) 10);
    }

    @Test
    public void test03072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03072");
        int[] intArray6 = new int[] { (byte) -1, (byte) -1, (byte) 0, 10, 0, '#' };
        int[] intArray9 = new int[] { 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (short) 1, (int) (byte) 0);
    }

    @Test
    public void test03073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03073");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) 'a', (-1));
    }

    @Test
    public void test03074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03074");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 1, (byte) 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) 100, (int) (short) 1);
    }

    @Test
    public void test03075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03075");
        int[] intArray1 = new int[] { 0 };
        int[] intArray7 = new int[] { (short) 10, (short) 10, (-1), 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) ' ', (int) (byte) -1);
    }

    @Test
    public void test03076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03076");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) 0, (-1), (byte) 10, (byte) 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) 0, (int) (byte) -1);
    }

    @Test
    public void test03077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03077");
        int[] intArray5 = new int[] { (short) 1, (-1), (short) 10, (short) 1, (byte) 0 };
        int[] intArray11 = new int[] { 10, (short) -1, (byte) 100, '#', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) 100, (int) (byte) 0);
    }

    @Test
    public void test03078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03078");
        int[] intArray3 = new int[] { 100, (byte) 100, (byte) 100 };
        int[] intArray7 = new int[] { (byte) 10, (short) -1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 100, 100);
    }

    @Test
    public void test03079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03079");
        int[] intArray3 = new int[] { 100, (byte) 100, '4' };
        int[] intArray10 = new int[] { 1, ' ', (-1), 'a', (byte) 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test03080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03080");
        int[] intArray3 = new int[] { (short) 10, (byte) 0, (short) -1 };
        int[] intArray9 = new int[] { (short) 100, (byte) 0, (short) 1, 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (short) 100, (int) (byte) 1);
    }

    @Test
    public void test03081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03081");
        int[] intArray6 = new int[] { (short) 0, (short) -1, (short) 1, 10, (-1), (byte) 0 };
        int[] intArray10 = new int[] { '4', (byte) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) 0, 100);
    }

    @Test
    public void test03082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03082");
        int[] intArray5 = new int[] { '4', (byte) -1, ' ', 100, (-1) };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (short) 10, (int) (short) 100);
    }

    @Test
    public void test03083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03083");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { '#', 100, 0, 0, (byte) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, 100, (int) (byte) -1);
    }

    @Test
    public void test03084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03084");
        int[] intArray4 = new int[] { 100, '4', (byte) 0, (byte) 1 };
        int[] intArray6 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, 0, (-1));
    }

    @Test
    public void test03085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03085");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (byte) 1, (int) (byte) 1);
    }

    @Test
    public void test03086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03086");
        int[] intArray3 = new int[] { (short) 1, ' ', ' ' };
        int[] intArray8 = new int[] { (short) 100, (byte) 10, '#', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (byte) -1, (int) (short) 100);
    }

    @Test
    public void test03087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03087");
        int[] intArray5 = new int[] { '4', (short) 10, (short) 100, (short) -1, (short) 1 };
        int[] intArray10 = new int[] { '4', (short) 0, (short) 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 0, 0);
    }

    @Test
    public void test03088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03088");
        int[] intArray6 = new int[] { (short) 10, 0, (short) 100, (short) 100, (byte) 0, (short) 100 };
        int[] intArray13 = new int[] { 'a', (byte) 100, '#', 100, 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (-1), 100);
    }

    @Test
    public void test03089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03089");
        int[] intArray5 = new int[] { (short) 0, 'a', '#', ' ', '#' };
        int[] intArray11 = new int[] { (short) 100, (byte) -1, 10, (short) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) 1, (int) 'a');
    }

    @Test
    public void test03090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03090");
        int[] intArray6 = new int[] { (byte) 0, (-1), 0, '4', (byte) -1, (byte) -1 };
        int[] intArray10 = new int[] { (byte) 10, '#', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) ' ', (int) 'a');
    }

    @Test
    public void test03091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03091");
        int[] intArray5 = new int[] { ' ', (byte) 0, '#', (short) 10, '#' };
        int[] intArray7 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) 'a', (int) '4');
    }

    @Test
    public void test03092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03092");
        int[] intArray3 = new int[] { (-1), (byte) 10, (byte) 10 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test03093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03093");
        int[] intArray4 = new int[] { (byte) 100, (short) 1, (byte) -1, (byte) 10 };
        int[] intArray9 = new int[] { '#', (byte) 100, (short) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test03094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03094");
        int[] intArray3 = new int[] { (short) 1, '#', (byte) 10 };
        int[] intArray9 = new int[] { 10, '4', (short) 100, (byte) -1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (short) 10, (int) (byte) 100);
    }

    @Test
    public void test03095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03095");
        int[] intArray3 = new int[] { (short) 0, (-1), (byte) 1 };
        int[] intArray7 = new int[] { (short) 100, (byte) 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) '4', (int) (short) 1);
    }

    @Test
    public void test03096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03096");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray3 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) ' ', (int) (short) 10);
    }

    @Test
    public void test03097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03097");
        int[] intArray2 = new int[] { (short) 100, (byte) -1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) -1, 0);
    }

    @Test
    public void test03098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03098");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (short) 10, (int) 'a');
    }

    @Test
    public void test03099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03099");
        int[] intArray3 = new int[] { (short) 10, 1, (short) 0 };
        int[] intArray6 = new int[] { (byte) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (-1), 0);
    }

    @Test
    public void test03100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03100");
        int[] intArray4 = new int[] { 0, (short) 1, (short) 1, 100 };
        int[] intArray7 = new int[] { 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) 'a', (int) (short) 10);
    }

    @Test
    public void test03101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03101");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray4 = new int[] { (byte) 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 10, 10);
    }

    @Test
    public void test03102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03102");
        int[] intArray2 = new int[] { 10, (short) 100 };
        int[] intArray5 = new int[] { 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) -1, (int) (short) 10);
    }

    @Test
    public void test03103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03103");
        int[] intArray6 = new int[] { (byte) 0, (short) 10, (byte) -1, 'a', 0, ' ' };
        int[] intArray11 = new int[] { (short) 0, (short) -1, (short) -1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (short) 10, (int) (byte) -1);
    }

    @Test
    public void test03104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03104");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 'a', (short) 0, (short) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) 100, 100);
    }

    @Test
    public void test03105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03105");
        int[] intArray3 = new int[] { (byte) 0, ' ', '4' };
        int[] intArray9 = new int[] { '#', (byte) -1, '#', '4', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 0, (int) (byte) 1);
    }

    @Test
    public void test03106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03106");
        int[] intArray2 = new int[] { 1, (short) 0 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 1, 100);
    }

    @Test
    public void test03107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03107");
        int[] intArray2 = new int[] { (short) -1, (short) 0 };
        int[] intArray8 = new int[] { 10, (byte) -1, 1, '#', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) -1, (int) (byte) 10);
    }

    @Test
    public void test03108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03108");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray7 = new int[] { 10, (byte) 0, (byte) 0, 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) 0, (int) (byte) 0);
    }

    @Test
    public void test03109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03109");
        int[] intArray6 = new int[] { (short) 100, '4', (short) 10, 'a', (byte) 100, (short) 1 };
        int[] intArray12 = new int[] { (byte) 100, (byte) 100, (short) 1, 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (byte) 100, 100);
    }

    @Test
    public void test03110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03110");
        int[] intArray6 = new int[] { '4', (byte) 1, (byte) 0, ' ', 'a', (short) 10 };
        int[] intArray13 = new int[] { 'a', '#', (short) 100, (byte) 1, (short) 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 10, 1);
    }

    @Test
    public void test03111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03111");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray7 = new int[] { (byte) 1, '4', 1, (byte) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) 1, (int) (short) -1);
    }

    @Test
    public void test03112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03112");
        int[] intArray3 = new int[] { (short) -1, '#', (short) -1 };
        int[] intArray8 = new int[] { (short) 100, (byte) -1, (short) 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 1, (int) (short) 10);
    }

    @Test
    public void test03113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03113");
        int[] intArray5 = new int[] { '#', ' ', (byte) 10, 0, (short) 100 };
        int[] intArray11 = new int[] { 100, '4', (byte) 1, (byte) -1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) 10, 0);
    }

    @Test
    public void test03114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03114");
        int[] intArray3 = new int[] { ' ', (-1), '4' };
        int[] intArray7 = new int[] { (byte) -1, 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) 10, 0);
    }

    @Test
    public void test03115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03115");
        int[] intArray4 = new int[] { (short) 0, (short) 1, (short) -1, 'a' };
        int[] intArray6 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, 100, 0);
    }

    @Test
    public void test03116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03116");
        int[] intArray3 = new int[] { (short) 100, (short) -1, (byte) 100 };
        int[] intArray6 = new int[] { (short) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) '4', (int) '4');
    }

    @Test
    public void test03117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03117");
        int[] intArray6 = new int[] { ' ', 100, (short) 10, (short) 1, (byte) 0, (byte) 100 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) 100, (int) (short) 100);
    }

    @Test
    public void test03118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03118");
        int[] intArray6 = new int[] { 10, (short) 1, (short) 0, 0, (byte) 0, (short) 1 };
        int[] intArray11 = new int[] { (byte) 10, (short) 0, (byte) -1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (-1), (-1));
    }

    @Test
    public void test03119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03119");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray3 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, 0, (int) '#');
    }

    @Test
    public void test03120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03120");
        int[] intArray2 = new int[] { 10, (byte) 1 };
        int[] intArray7 = new int[] { (short) -1, (byte) 100, 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) 'a', 0);
    }

    @Test
    public void test03121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03121");
        int[] intArray1 = new int[] { '4' };
        int[] intArray6 = new int[] { (byte) 100, (short) 0, (short) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test03122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03122");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray3 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (byte) 0, (int) '#');
    }

    @Test
    public void test03123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03123");
        int[] intArray4 = new int[] { (short) 0, ' ', ' ', (short) 100 };
        int[] intArray11 = new int[] { 0, 'a', 1, (short) 1, 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) -1, (int) '4');
    }

    @Test
    public void test03124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03124");
        int[] intArray6 = new int[] { (-1), (byte) 10, (byte) 100, (byte) 1, 0, (byte) -1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, 10, (int) '4');
    }

    @Test
    public void test03125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03125");
        int[] intArray4 = new int[] { (byte) 0, (byte) -1, (short) 100, '#' };
        int[] intArray7 = new int[] { (byte) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (-1), (int) (short) 0);
    }

    @Test
    public void test03126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03126");
        int[] intArray6 = new int[] { ' ', '#', 1, (short) 0, 1, (byte) 1 };
        int[] intArray10 = new int[] { (byte) -1, 'a', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) 1, (int) '#');
    }

    @Test
    public void test03127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03127");
        int[] intArray4 = new int[] { 0, (byte) 1, '#', (short) 0 };
        int[] intArray8 = new int[] { (short) -1, '#', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 10, 1);
    }

    @Test
    public void test03128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03128");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 10, 'a', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) 1, (int) (short) -1);
    }

    @Test
    public void test03129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03129");
        int[] intArray5 = new int[] { 100, (-1), ' ', (short) 10, '4' };
        int[] intArray9 = new int[] { 0, 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 1, (int) (short) 1);
    }

    @Test
    public void test03130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03130");
        int[] intArray6 = new int[] { 10, (byte) 10, (byte) -1, '#', (short) 1, 0 };
        int[] intArray9 = new int[] { (-1), 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) '#', (int) (byte) 1);
    }

    @Test
    public void test03131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03131");
        int[] intArray4 = new int[] { (byte) -1, (byte) 100, 100, (short) 10 };
        int[] intArray11 = new int[] { (byte) 0, 'a', 10, (byte) -1, (byte) 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) ' ', (int) (short) -1);
    }

    @Test
    public void test03132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03132");
        int[] intArray5 = new int[] { (byte) -1, '4', '#', 10, '#' };
        int[] intArray8 = new int[] { (short) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) 1, (int) (byte) 100);
    }

    @Test
    public void test03133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03133");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) -1, (short) 0, '4', (short) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (-1), (int) (byte) 10);
    }

    @Test
    public void test03134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03134");
        int[] intArray5 = new int[] { (short) 1, (short) 1, 10, (byte) 100, (byte) 0 };
        int[] intArray8 = new int[] { (short) 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 1, (int) (short) 100);
    }

    @Test
    public void test03135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03135");
        int[] intArray5 = new int[] { 0, (byte) -1, (short) 10, (short) 1, 10 };
        int[] intArray11 = new int[] { ' ', (byte) 1, (byte) 0, 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 1, (int) ' ');
    }

    @Test
    public void test03136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03136");
        int[] intArray4 = new int[] { 1, ' ', (byte) 100, 'a' };
        int[] intArray7 = new int[] { 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) 10, 0);
    }

    @Test
    public void test03137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03137");
        int[] intArray5 = new int[] { (short) -1, 100, 0, (short) 100, (byte) 0 };
        int[] intArray7 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, 10, (int) (short) 1);
    }

    @Test
    public void test03138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03138");
        int[] intArray4 = new int[] { (byte) 100, (short) 10, '#', ' ' };
        int[] intArray9 = new int[] { (byte) 10, (byte) 1, 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) 1, (-1));
    }

    @Test
    public void test03139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03139");
        int[] intArray3 = new int[] { 0, (-1), 100 };
        int[] intArray10 = new int[] { '4', '4', (-1), (short) 1, (-1), '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 100, (int) (byte) 1);
    }

    @Test
    public void test03140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03140");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, 100, (int) '#');
    }

    @Test
    public void test03141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03141");
        int[] intArray4 = new int[] { (byte) 10, (byte) -1, (-1), '4' };
        int[] intArray9 = new int[] { (byte) 100, ' ', (-1), (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 0, (int) (byte) 10);
    }

    @Test
    public void test03142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03142");
        int[] intArray6 = new int[] { '#', (short) -1, ' ', 100, (byte) 100, (byte) -1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) 10, (int) (short) 1);
    }

    @Test
    public void test03143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03143");
        int[] intArray3 = new int[] { (byte) 0, '4', 1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (byte) 100, (int) (byte) -1);
    }

    @Test
    public void test03144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03144");
        int[] intArray4 = new int[] { ' ', ' ', (byte) 100, (short) 1 };
        int[] intArray6 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, 10, (-1));
    }

    @Test
    public void test03145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03145");
        int[] intArray2 = new int[] { ' ', (short) 10 };
        int[] intArray5 = new int[] { (short) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 0, (int) 'a');
    }

    @Test
    public void test03146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03146");
        int[] intArray3 = new int[] { (byte) 100, (short) -1, (byte) -1 };
        int[] intArray9 = new int[] { (byte) -1, 100, (byte) -1, 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (byte) 0, 10);
    }

    @Test
    public void test03147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03147");
        int[] intArray6 = new int[] { 1, (short) 100, 10, (short) 100, ' ', (short) -1 };
        int[] intArray8 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) 'a', (int) '#');
    }

    @Test
    public void test03148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03148");
        int[] intArray5 = new int[] { 1, 100, (short) 100, (byte) 1, 100 };
        int[] intArray11 = new int[] { 100, (-1), (byte) -1, 'a', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) -1, (int) '4');
    }

    @Test
    public void test03149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03149");
        int[] intArray2 = new int[] { 0, (short) 1 };
        int[] intArray7 = new int[] { (byte) 100, (short) 100, '4', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 1, (int) (short) -1);
    }

    @Test
    public void test03150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03150");
        int[] intArray5 = new int[] { ' ', (short) 10, (-1), ' ', '#' };
        int[] intArray7 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) 100, (int) (short) 10);
    }

    @Test
    public void test03151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03151");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 'a', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (byte) -1, (int) '#');
    }

    @Test
    public void test03152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03152");
        int[] intArray5 = new int[] { (short) 1, ' ', (short) 1, (short) 10, (short) -1 };
        int[] intArray8 = new int[] { (short) 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) 1, 0);
    }

    @Test
    public void test03153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03153");
        int[] intArray2 = new int[] { (-1), 100 };
        int[] intArray8 = new int[] { (short) 100, (byte) 0, (short) 0, 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 0, (int) '#');
    }

    @Test
    public void test03154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03154");
        int[] intArray3 = new int[] { ' ', 'a', (byte) 10 };
        int[] intArray7 = new int[] { (short) 0, (byte) 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 0, 0);
    }

    @Test
    public void test03155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03155");
        int[] intArray5 = new int[] { (short) 1, (short) 100, (short) 0, (byte) 1, (short) 0 };
        int[] intArray7 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) 100, 0);
    }

    @Test
    public void test03156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03156");
        int[] intArray3 = new int[] { (short) 1, (short) 1, '#' };
        int[] intArray9 = new int[] { 'a', 0, (short) -1, (short) -1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 100, (int) '4');
    }

    @Test
    public void test03157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03157");
        int[] intArray6 = new int[] { (byte) 1, (byte) 100, ' ', (byte) 100, (byte) 1, (byte) 1 };
        int[] intArray11 = new int[] { 0, (short) 10, 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 100, 10);
    }

    @Test
    public void test03158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03158");
        int[] intArray5 = new int[] { (short) 1, (-1), ' ', 'a', '#' };
        int[] intArray7 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) 'a', 100);
    }

    @Test
    public void test03159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03159");
        int[] intArray3 = new int[] { '#', (byte) 1, (short) 10 };
        int[] intArray5 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) 1, (int) '4');
    }

    @Test
    public void test03160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03160");
        int[] intArray2 = new int[] { 0, (short) 10 };
        int[] intArray4 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) '4', 0);
    }

    @Test
    public void test03161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03161");
        int[] intArray3 = new int[] { (short) 100, (byte) 100, 10 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test03162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03162");
        int[] intArray6 = new int[] { (short) 10, (byte) 1, 100, 10, (byte) -1, 1 };
        int[] intArray10 = new int[] { (short) 0, (byte) 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) 100, (int) (short) 0);
    }

    @Test
    public void test03163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03163");
        int[] intArray3 = new int[] { (byte) 10, 10, (byte) 10 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (byte) 1, 0);
    }

    @Test
    public void test03164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03164");
        int[] intArray6 = new int[] { ' ', (byte) 100, 0, 10, (byte) -1, 10 };
        int[] intArray8 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 0, (int) (byte) 1);
    }

    @Test
    public void test03165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03165");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) '#', (int) (byte) 1);
    }

    @Test
    public void test03166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03166");
        int[] intArray2 = new int[] { (short) 0, 1 };
        int[] intArray6 = new int[] { (short) -1, (short) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 0, 1);
    }

    @Test
    public void test03167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03167");
        int[] intArray5 = new int[] { (byte) 1, (short) -1, 0, (-1), 100 };
        int[] intArray9 = new int[] { (short) -1, '#', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 10, (int) (byte) 0);
    }

    @Test
    public void test03168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03168");
        int[] intArray4 = new int[] { (byte) 100, 100, (short) 0, (short) -1 };
        int[] intArray10 = new int[] { (short) 100, (short) -1, 10, '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) 100, (int) '4');
    }

    @Test
    public void test03169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03169");
        int[] intArray2 = new int[] { 1, 100 };
        int[] intArray6 = new int[] { (short) 1, (short) 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (short) 1, 10);
    }

    @Test
    public void test03170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03170");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) ' ', (int) 'a');
    }

    @Test
    public void test03171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03171");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 0, 0, (byte) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 0, (int) (short) -1);
    }

    @Test
    public void test03172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03172");
        int[] intArray5 = new int[] { (byte) -1, (-1), '4', 0, (short) 0 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 1, (int) '4');
    }

    @Test
    public void test03173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03173");
        int[] intArray2 = new int[] { (byte) 100, (byte) 100 };
        int[] intArray4 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 10, 0);
    }

    @Test
    public void test03174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03174");
        int[] intArray2 = new int[] { (byte) 1, (short) -1 };
        int[] intArray5 = new int[] { (short) 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 1, (int) ' ');
    }

    @Test
    public void test03175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03175");
        int[] intArray2 = new int[] { (byte) -1, (short) 100 };
        int[] intArray4 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (byte) 1, (int) (short) 10);
    }

    @Test
    public void test03176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03176");
        int[] intArray6 = new int[] { 0, (short) 10, 1, (short) 1, 10, (short) 10 };
        int[] intArray9 = new int[] { 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 1, 1);
    }

    @Test
    public void test03177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03177");
        int[] intArray1 = new int[] { 1 };
        int[] intArray4 = new int[] { (short) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (short) 100, (int) (byte) 10);
    }

    @Test
    public void test03178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03178");
        int[] intArray5 = new int[] { (byte) 0, 'a', (short) 10, 'a', 1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 0, (int) (short) 0);
    }

    @Test
    public void test03179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03179");
        int[] intArray2 = new int[] { (short) 1, 10 };
        int[] intArray5 = new int[] { (-1), (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (byte) 1, (int) (byte) 1);
    }

    @Test
    public void test03180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03180");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (-1), 100, '4', '4', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) 1, (int) (short) 0);
    }

    @Test
    public void test03181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03181");
        int[] intArray6 = new int[] { (byte) 100, 1, (short) 10, 0, (-1), '4' };
        int[] intArray11 = new int[] { (byte) 10, 0, (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 10, (int) '4');
    }

    @Test
    public void test03182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03182");
        int[] intArray2 = new int[] { (byte) 1, ' ' };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 1, 0);
    }

    @Test
    public void test03183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03183");
        int[] intArray3 = new int[] { (short) 10, (byte) 100, (short) 100 };
        int[] intArray10 = new int[] { 'a', 10, (short) 100, 'a', '#', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 100, (int) (short) 100);
    }

    @Test
    public void test03184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03184");
        int[] intArray3 = new int[] { (short) -1, (byte) 100, (short) 100 };
        int[] intArray8 = new int[] { (short) 1, 100, (byte) 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) '4', (int) (byte) 10);
    }

    @Test
    public void test03185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03185");
        int[] intArray4 = new int[] { (byte) 0, 1, 0, 100 };
        int[] intArray8 = new int[] { (byte) 100, 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 1, (-1));
    }

    @Test
    public void test03186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03186");
        int[] intArray4 = new int[] { (byte) -1, (byte) 1, (short) 1, ' ' };
        int[] intArray10 = new int[] { (short) 1, 'a', 100, '4', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, 0, 10);
    }

    @Test
    public void test03187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03187");
        int[] intArray4 = new int[] { (byte) 1, (short) 100, '#', (byte) 1 };
        int[] intArray7 = new int[] { (short) 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) 100, 10);
    }

    @Test
    public void test03188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03188");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 1, (short) 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, 1, 10);
    }

    @Test
    public void test03189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03189");
        int[] intArray4 = new int[] { (short) 100, (short) -1, 10, 1 };
        int[] intArray6 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) '4', (int) '#');
    }

    @Test
    public void test03190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03190");
        int[] intArray3 = new int[] { '4', (byte) 0, 10 };
        int[] intArray10 = new int[] { (short) 0, (byte) 1, (short) 10, 0, 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 1, (int) '#');
    }

    @Test
    public void test03191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03191");
        int[] intArray4 = new int[] { 10, '4', (short) 10, '#' };
        int[] intArray7 = new int[] { 'a', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) 0, (int) (byte) 100);
    }

    @Test
    public void test03192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03192");
        int[] intArray5 = new int[] { ' ', 100, (short) -1, 'a', 1 };
        int[] intArray12 = new int[] { (byte) 10, 0, (short) 10, (short) -1, (byte) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (byte) 1, 10);
    }

    @Test
    public void test03193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03193");
        int[] intArray6 = new int[] { (byte) 1, 1, (short) 10, (short) 0, '4', (-1) };
        int[] intArray9 = new int[] { 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, 10, 100);
    }

    @Test
    public void test03194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03194");
        int[] intArray5 = new int[] { (byte) 100, ' ', (-1), ' ', 'a' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) '#', (int) (short) 100);
    }

    @Test
    public void test03195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03195");
        int[] intArray2 = new int[] { '#', 'a' };
        int[] intArray4 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (-1), (int) (byte) 100);
    }

    @Test
    public void test03196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03196");
        int[] intArray5 = new int[] { 0, 0, (-1), (byte) -1, 10 };
        int[] intArray11 = new int[] { ' ', (-1), 10, (-1), 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) 0, (int) (short) 10);
    }

    @Test
    public void test03197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03197");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 1, (int) (short) 0);
    }

    @Test
    public void test03198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03198");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray8 = new int[] { (-1), (byte) 1, '#', (byte) 10, (-1), (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) 10, (int) ' ');
    }

    @Test
    public void test03199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03199");
        int[] intArray1 = new int[] { '4' };
        int[] intArray6 = new int[] { '#', (short) 1, 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (short) 1, 0);
    }

    @Test
    public void test03200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03200");
        int[] intArray3 = new int[] { (short) 10, 0, (short) 100 };
        int[] intArray6 = new int[] { (byte) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) -1, (-1));
    }

    @Test
    public void test03201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03201");
        int[] intArray5 = new int[] { 10, (byte) 1, 10, (byte) 0, (byte) 0 };
        int[] intArray9 = new int[] { (short) 1, (short) 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) 'a', (int) (short) -1);
    }

    @Test
    public void test03202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03202");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray8 = new int[] { (short) 0, (-1), 'a', (byte) 10, (short) 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) -1, 100);
    }

    @Test
    public void test03203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03203");
        int[] intArray4 = new int[] { '4', (short) 10, '#', (short) 10 };
        int[] intArray7 = new int[] { (byte) 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) 1, (int) (short) -1);
    }

    @Test
    public void test03204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03204");
        int[] intArray3 = new int[] { 0, (-1), (short) 100 };
        int[] intArray5 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) ' ', (int) (byte) 1);
    }

    @Test
    public void test03205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03205");
        int[] intArray6 = new int[] { 1, (byte) 100, (byte) 10, '4', 0, (byte) -1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) 100, 1);
    }

    @Test
    public void test03206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03206");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray5 = new int[] { (byte) 100, (short) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) 1, (int) (short) 100);
    }

    @Test
    public void test03207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03207");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray7 = new int[] { (byte) 10, (byte) 1, '4', (byte) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, 1, (int) (short) 0);
    }

    @Test
    public void test03208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03208");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (byte) 0, 0);
    }

    @Test
    public void test03209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03209");
        int[] intArray2 = new int[] { '4', (short) 100 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) ' ', (int) (byte) 10);
    }

    @Test
    public void test03210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03210");
        int[] intArray5 = new int[] { (short) 100, '4', 100, 0, '4' };
        int[] intArray8 = new int[] { (byte) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) '4', (int) 'a');
    }

    @Test
    public void test03211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03211");
        int[] intArray3 = new int[] { 0, (byte) 0, 'a' };
        int[] intArray7 = new int[] { 100, 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) -1, 10);
    }

    @Test
    public void test03212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03212");
        int[] intArray5 = new int[] { (short) 1, 1, (byte) -1, '#', (short) -1 };
        int[] intArray9 = new int[] { (byte) 100, (short) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (byte) 100, 10);
    }

    @Test
    public void test03213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03213");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray8 = new int[] { 10, (short) 10, (byte) 10, 0, '#', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 100, (int) ' ');
    }

    @Test
    public void test03214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03214");
        int[] intArray2 = new int[] { '4', (-1) };
        int[] intArray6 = new int[] { (short) 10, (byte) 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 10, (int) (short) 10);
    }

    @Test
    public void test03215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03215");
        int[] intArray5 = new int[] { (short) 0, (-1), (-1), (byte) 1, (byte) 10 };
        int[] intArray7 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (short) -1, (int) (byte) 0);
    }

    @Test
    public void test03216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03216");
        int[] intArray2 = new int[] { (short) 0, (byte) -1 };
        int[] intArray7 = new int[] { (byte) 100, (short) -1, (byte) -1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (short) 10, (int) ' ');
    }

    @Test
    public void test03217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03217");
        int[] intArray1 = new int[] { '#' };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 0, 100);
    }

    @Test
    public void test03218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03218");
        int[] intArray2 = new int[] { (short) 0, (byte) -1 };
        int[] intArray7 = new int[] { 0, (byte) -1, (short) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 0, (int) (byte) 0);
    }

    @Test
    public void test03219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03219");
        int[] intArray5 = new int[] { (byte) 1, 'a', '#', (-1), 'a' };
        int[] intArray11 = new int[] { (byte) 100, (byte) 100, (short) 0, (byte) -1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) 0, 0);
    }

    @Test
    public void test03220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03220");
        int[] intArray3 = new int[] { ' ', (byte) 10, (byte) 0 };
        int[] intArray9 = new int[] { (short) 10, (short) 100, 'a', (short) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (short) 10, 1);
    }

    @Test
    public void test03221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03221");
        int[] intArray6 = new int[] { (short) 1, '#', (short) 10, (short) 1, (byte) 100, (byte) 10 };
        int[] intArray8 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 100, (-1));
    }

    @Test
    public void test03222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03222");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray7 = new int[] { 1, (byte) 0, '#', (short) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) 100, (int) '#');
    }

    @Test
    public void test03223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03223");
        int[] intArray5 = new int[] { 'a', (byte) 10, 'a', (short) 10, (short) 10 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) 'a', (-1));
    }

    @Test
    public void test03224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03224");
        int[] intArray3 = new int[] { 10, 0, (short) 10 };
        int[] intArray10 = new int[] { (short) 10, (short) -1, ' ', 100, 'a', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 0, (-1));
    }

    @Test
    public void test03225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03225");
        int[] intArray3 = new int[] { (short) 10, (byte) 100, (byte) 1 };
        int[] intArray10 = new int[] { (byte) 1, 10, (short) 1, '#', (byte) 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test03226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03226");
        int[] intArray6 = new int[] { (short) 1, (short) 100, '#', 0, '4', 1 };
        int[] intArray12 = new int[] { (byte) 100, 10, (byte) -1, '#', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (-1), 0);
    }

    @Test
    public void test03227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03227");
        int[] intArray6 = new int[] { 'a', (byte) 1, '#', 1, (short) 1, (byte) 0 };
        int[] intArray13 = new int[] { (byte) 1, '4', (byte) 1, (short) 10, 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 0, (int) (short) 100);
    }

    @Test
    public void test03228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03228");
        int[] intArray6 = new int[] { '#', (byte) 1, (byte) -1, (short) 10, '#', (short) 0 };
        int[] intArray12 = new int[] { (byte) 100, (short) 0, (short) 1, (short) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) '#', (int) (short) 1);
    }

    @Test
    public void test03229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03229");
        int[] intArray4 = new int[] { 0, ' ', '#', (short) 100 };
        int[] intArray10 = new int[] { 'a', ' ', (short) 100, (-1), '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (byte) 100, 0);
    }

    @Test
    public void test03230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03230");
        int[] intArray3 = new int[] { 10, 100, 10 };
        int[] intArray10 = new int[] { (short) 0, (-1), (byte) 100, (byte) 100, (short) 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 1, (int) (byte) 10);
    }

    @Test
    public void test03231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03231");
        int[] intArray3 = new int[] { (byte) 100, (short) 10, '4' };
        int[] intArray8 = new int[] { 10, (short) -1, 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test03232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03232");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray7 = new int[] { 10, '#', 'a', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 10, (int) (short) 1);
    }

    @Test
    public void test03233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03233");
        int[] intArray5 = new int[] { (short) 1, ' ', (short) 100, 'a', 0 };
        int[] intArray12 = new int[] { (short) 10, (byte) 100, (-1), 10, (short) -1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (byte) 0, 10);
    }

    @Test
    public void test03234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03234");
        int[] intArray2 = new int[] { (byte) 100, ' ' };
        int[] intArray7 = new int[] { ' ', 'a', (short) 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) '4', 10);
    }

    @Test
    public void test03235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03235");
        int[] intArray3 = new int[] { 'a', (short) 100, (byte) 0 };
        int[] intArray6 = new int[] { (short) 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (-1), (-1));
    }

    @Test
    public void test03236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03236");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (byte) 0, 100);
    }

    @Test
    public void test03237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03237");
        int[] intArray4 = new int[] { (short) 100, (byte) 1, (-1), (short) 0 };
        int[] intArray7 = new int[] { (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) '4', 1);
    }

    @Test
    public void test03238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03238");
        int[] intArray4 = new int[] { ' ', 0, (byte) 10, '4' };
        int[] intArray11 = new int[] { (byte) 0, '#', (byte) 1, (byte) 10, (short) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) '#', (int) (short) 0);
    }

    @Test
    public void test03239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03239");
        int[] intArray3 = new int[] { (-1), (byte) 0, (byte) 0 };
        int[] intArray8 = new int[] { (short) 1, 10, (byte) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) 'a', (int) '4');
    }

    @Test
    public void test03240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03240");
        int[] intArray6 = new int[] { (byte) 10, 10, (byte) 10, (short) 0, (short) 10, (byte) 1 };
        int[] intArray9 = new int[] { (short) -1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test03241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03241");
        int[] intArray6 = new int[] { (byte) -1, (-1), 1, '4', '4', (short) 100 };
        int[] intArray9 = new int[] { (byte) -1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) '4', (int) (short) 100);
    }

    @Test
    public void test03242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03242");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 1, (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) 0, (-1));
    }

    @Test
    public void test03243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03243");
        int[] intArray3 = new int[] { (short) 100, 10, (short) 100 };
        int[] intArray10 = new int[] { '#', 0, (byte) -1, '4', (short) 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 0, (int) ' ');
    }

    @Test
    public void test03244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03244");
        int[] intArray5 = new int[] { '#', '4', (byte) 0, 10, (-1) };
        int[] intArray7 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) '4', 10);
    }

    @Test
    public void test03245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03245");
        int[] intArray5 = new int[] { (byte) -1, (byte) 0, (short) 100, '4', (byte) 1 };
        int[] intArray10 = new int[] { (byte) 100, (short) 0, '#', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (short) 1, (-1));
    }

    @Test
    public void test03246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03246");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 'a', 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, 10, (int) (byte) 10);
    }

    @Test
    public void test03247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03247");
        int[] intArray5 = new int[] { (short) 10, 100, 'a', 0, (byte) -1 };
        int[] intArray10 = new int[] { (short) 1, '#', (byte) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 0, 0);
    }

    @Test
    public void test03248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03248");
        int[] intArray6 = new int[] { (short) 100, (byte) 100, (byte) 100, 100, (-1), (short) 10 };
        int[] intArray11 = new int[] { '#', 1, (-1), (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (short) -1, (int) (short) 10);
    }

    @Test
    public void test03249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03249");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { '4', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) '#', 10);
    }

    @Test
    public void test03250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03250");
        int[] intArray2 = new int[] { 'a', (byte) 0 };
        int[] intArray5 = new int[] { (byte) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) -1, (int) (byte) 1);
    }

    @Test
    public void test03251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03251");
        int[] intArray6 = new int[] { 'a', (short) -1, (byte) -1, 1, 100, (short) 10 };
        int[] intArray12 = new int[] { (byte) 1, 'a', (short) 100, ' ', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) ' ', 10);
    }

    @Test
    public void test03252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03252");
        int[] intArray3 = new int[] { '#', (byte) 100, (byte) 100 };
        int[] intArray5 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (-1), (int) (byte) 10);
    }

    @Test
    public void test03253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03253");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (short) 1, (int) 'a');
    }

    @Test
    public void test03254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03254");
        int[] intArray3 = new int[] { '4', (short) 100, 100 };
        int[] intArray10 = new int[] { (-1), (byte) 10, (short) 100, 1, (byte) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (byte) 0, (int) ' ');
    }

    @Test
    public void test03255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03255");
        int[] intArray4 = new int[] { (short) 100, (short) 10, (short) 100, (short) 100 };
        int[] intArray10 = new int[] { (byte) 100, (short) 100, (-1), (byte) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, 1, (int) (short) 100);
    }

    @Test
    public void test03256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03256");
        int[] intArray1 = new int[] { 0 };
        int[] intArray4 = new int[] { ' ', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, 10, 0);
    }

    @Test
    public void test03257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03257");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray4 = new int[] { (byte) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) '4', 10);
    }

    @Test
    public void test03258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03258");
        int[] intArray2 = new int[] { 10, 0 };
        int[] intArray9 = new int[] { (byte) 10, (byte) 100, 'a', (byte) -1, 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 0, (-1));
    }

    @Test
    public void test03259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03259");
        int[] intArray2 = new int[] { 10, 10 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) -1, 10);
    }

    @Test
    public void test03260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03260");
        int[] intArray2 = new int[] { (byte) 1, '4' };
        int[] intArray4 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 0, 10);
    }

    @Test
    public void test03261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03261");
        int[] intArray5 = new int[] { (byte) 0, 'a', 10, (short) 100, (short) 10 };
        int[] intArray11 = new int[] { (byte) -1, 'a', (byte) 10, 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) '4', (int) (byte) 100);
    }

    @Test
    public void test03262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03262");
        int[] intArray5 = new int[] { (short) 10, '#', 10, 100, (byte) -1 };
        int[] intArray10 = new int[] { 100, (short) 10, ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (byte) 100, (int) (short) 1);
    }

    @Test
    public void test03263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03263");
        int[] intArray6 = new int[] { '4', (byte) 0, (short) 10, (byte) 0, (byte) 1, (byte) -1 };
        int[] intArray10 = new int[] { (short) 0, (-1), (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) 0, (int) (byte) 1);
    }

    @Test
    public void test03264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03264");
        int[] intArray5 = new int[] { (short) 100, '#', 100, (short) 1, (-1) };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) '4', (int) (byte) 100);
    }

    @Test
    public void test03265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03265");
        int[] intArray5 = new int[] { '4', (short) 0, (short) 100, (short) 100, 0 };
        int[] intArray11 = new int[] { 100, 100, ' ', (short) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (-1), 100);
    }

    @Test
    public void test03266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03266");
        int[] intArray3 = new int[] { 'a', (byte) 10, (short) 1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, 1, 0);
    }

    @Test
    public void test03267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03267");
        int[] intArray2 = new int[] { ' ', (short) 0 };
        int[] intArray9 = new int[] { 10, '4', 'a', '#', 'a', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) '4', (int) (short) 1);
    }

    @Test
    public void test03268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03268");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray8 = new int[] { ' ', (byte) 100, (short) 1, 'a', '4', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test03269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03269");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) -1, (byte) -1, 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) -1, 1);
    }

    @Test
    public void test03270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03270");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (byte) 10, (int) 'a');
    }

    @Test
    public void test03271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03271");
        int[] intArray4 = new int[] { (byte) -1, (short) 1, (short) 1, (byte) 1 };
        int[] intArray10 = new int[] { (byte) -1, (byte) 10, 10, 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (byte) 10, (int) (short) 0);
    }

    @Test
    public void test03272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03272");
        int[] intArray6 = new int[] { (short) 10, (byte) 100, (byte) 1, ' ', (short) 100, 0 };
        int[] intArray8 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) ' ', (int) (short) 100);
    }

    @Test
    public void test03273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03273");
        int[] intArray5 = new int[] { 0, '#', (byte) -1, 100, (byte) 1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test03274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03274");
        int[] intArray5 = new int[] { (byte) 10, 10, 0, 100, 1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) '#', 1);
    }

    @Test
    public void test03275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03275");
        int[] intArray3 = new int[] { (byte) 1, 0, (short) 100 };
        int[] intArray5 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, 100, (int) (short) 0);
    }

    @Test
    public void test03276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03276");
        int[] intArray5 = new int[] { (-1), (byte) 100, (short) -1, (byte) -1, (short) 1 };
        int[] intArray10 = new int[] { (byte) 0, (short) 10, (byte) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (short) 100, (int) ' ');
    }

    @Test
    public void test03277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03277");
        int[] intArray5 = new int[] { (short) 1, (byte) 100, (short) -1, (-1), (short) 100 };
        int[] intArray11 = new int[] { '#', (short) 0, (byte) 1, 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 0, (int) '4');
    }

    @Test
    public void test03278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03278");
        int[] intArray3 = new int[] { (-1), (byte) -1, '4' };
        int[] intArray10 = new int[] { (short) -1, (short) 1, ' ', (short) 100, (byte) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 1, (int) '4');
    }

    @Test
    public void test03279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03279");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) 100, (byte) 1, 'a', 'a', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test03280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03280");
        int[] intArray6 = new int[] { 'a', '4', 10, '#', 1, '#' };
        int[] intArray8 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 100, 0);
    }

    @Test
    public void test03281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03281");
        int[] intArray2 = new int[] { '#', 0 };
        int[] intArray7 = new int[] { (short) 1, (short) -1, (short) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 1, (int) (short) -1);
    }

    @Test
    public void test03282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03282");
        int[] intArray3 = new int[] { 'a', (-1), (byte) 100 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) 0, (int) (byte) 100);
    }

    @Test
    public void test03283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03283");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray7 = new int[] { 'a', 10, (byte) 0, (byte) 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, 0, (int) (byte) 100);
    }

    @Test
    public void test03284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03284");
        int[] intArray4 = new int[] { (byte) 1, '#', '#', 1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, 100, 0);
    }

    @Test
    public void test03285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03285");
        int[] intArray5 = new int[] { (short) 10, (byte) 0, 10, 1, 0 };
        int[] intArray10 = new int[] { (byte) -1, (short) -1, 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (short) 10, (int) (short) 1);
    }

    @Test
    public void test03286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03286");
        int[] intArray6 = new int[] { (byte) -1, (byte) 0, 1, (byte) 0, (short) 1, 10 };
        int[] intArray9 = new int[] { '4', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) '#', (int) (short) 10);
    }

    @Test
    public void test03287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03287");
        int[] intArray4 = new int[] { (short) -1, (-1), 'a', (byte) -1 };
        int[] intArray6 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) ' ', 10);
    }

    @Test
    public void test03288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03288");
        int[] intArray3 = new int[] { 0, 10, 100 };
        int[] intArray7 = new int[] { (-1), ' ', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) '#', 0);
    }

    @Test
    public void test03289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03289");
        int[] intArray4 = new int[] { 100, 10, (short) 1, (byte) 0 };
        int[] intArray8 = new int[] { (byte) 0, (-1), (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) '4', 0);
    }

    @Test
    public void test03290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03290");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray4 = new int[] { 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (short) 0, (int) (short) 100);
    }

    @Test
    public void test03291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03291");
        int[] intArray6 = new int[] { (short) 100, 'a', 0, (-1), ' ', (byte) -1 };
        int[] intArray9 = new int[] { (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) ' ', (int) (short) 0);
    }

    @Test
    public void test03292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03292");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) -1, (int) (short) -1);
    }

    @Test
    public void test03293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03293");
        int[] intArray5 = new int[] { 10, (byte) 0, (byte) 1, 100, 10 };
        int[] intArray10 = new int[] { (byte) -1, (short) 1, 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) 'a', (int) (short) 1);
    }

    @Test
    public void test03294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03294");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) 1, (int) (byte) 0);
    }

    @Test
    public void test03295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03295");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { '4', (-1), 0, 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) '#', (int) (byte) 1);
    }

    @Test
    public void test03296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03296");
        int[] intArray3 = new int[] { (short) -1, (byte) 10, 100 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, 10, 100);
    }

    @Test
    public void test03297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03297");
        int[] intArray3 = new int[] { (short) 0, ' ', (short) 100 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) '4', (int) (byte) 1);
    }

    @Test
    public void test03298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03298");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        int[] intArray8 = new int[] { (byte) -1, (byte) 10, 10, (-1), 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 0, (int) ' ');
    }

    @Test
    public void test03299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03299");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray4 = new int[] { (short) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) '#', (int) (byte) 0);
    }

    @Test
    public void test03300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03300");
        int[] intArray5 = new int[] { (short) 10, (byte) -1, (-1), 10, (byte) 10 };
        int[] intArray11 = new int[] { 0, (short) 10, (short) 1, (short) 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) 'a', 0);
    }

    @Test
    public void test03301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03301");
        int[] intArray5 = new int[] { (byte) 100, 1, (-1), 10, ' ' };
        int[] intArray7 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, 10, (int) 'a');
    }

    @Test
    public void test03302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03302");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { '#', '4', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) 100, 1);
    }

    @Test
    public void test03303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03303");
        int[] intArray6 = new int[] { '#', (byte) 10, (byte) 0, (byte) 0, 1, 10 };
        int[] intArray11 = new int[] { (-1), '4', '#', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) ' ', 0);
    }

    @Test
    public void test03304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03304");
        int[] intArray2 = new int[] { 0, (byte) 10 };
        int[] intArray6 = new int[] { (byte) -1, (-1), 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) ' ', (int) 'a');
    }

    @Test
    public void test03305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03305");
        int[] intArray2 = new int[] { (byte) 100, (byte) 0 };
        int[] intArray4 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 0, (int) (short) 100);
    }

    @Test
    public void test03306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03306");
        int[] intArray5 = new int[] { 1, 1, (-1), (byte) 100, (byte) -1 };
        int[] intArray12 = new int[] { 0, (short) 100, (short) 10, '#', (short) 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, 10, (int) (byte) 0);
    }

    @Test
    public void test03307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03307");
        int[] intArray5 = new int[] { (byte) 100, (short) 100, ' ', 10, 'a' };
        int[] intArray9 = new int[] { (short) 10, '#', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 10, 100);
    }

    @Test
    public void test03308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03308");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray3 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (byte) 0, (int) (byte) 0);
    }

    @Test
    public void test03309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03309");
        int[] intArray2 = new int[] { (short) 100, 100 };
        int[] intArray6 = new int[] { (byte) 0, 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 0, (int) (short) -1);
    }

    @Test
    public void test03310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03310");
        int[] intArray6 = new int[] { 10, 1, 100, 'a', 10, (byte) 100 };
        int[] intArray13 = new int[] { (byte) -1, '#', (short) -1, '#', 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 10, (int) (byte) 10);
    }

    @Test
    public void test03311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03311");
        int[] intArray6 = new int[] { (byte) 100, (byte) -1, 100, (-1), ' ', (short) 10 };
        int[] intArray8 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) '4', (-1));
    }

    @Test
    public void test03312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03312");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray4 = new int[] { (short) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) -1, (int) '4');
    }

    @Test
    public void test03313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03313");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray3 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) 1, (int) (byte) 1);
    }

    @Test
    public void test03314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03314");
        int[] intArray3 = new int[] { 10, (byte) 1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) 10, (short) 10, (byte) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (byte) 0, (int) '#');
    }

    @Test
    public void test03315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03315");
        int[] intArray4 = new int[] { (short) -1, ' ', ' ', (-1) };
        int[] intArray9 = new int[] { (byte) -1, '#', (short) 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 1, (int) (short) 100);
    }

    @Test
    public void test03316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03316");
        int[] intArray4 = new int[] { (byte) -1, 0, (byte) 1, (byte) 100 };
        int[] intArray10 = new int[] { (-1), (short) 10, (byte) -1, 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) 100, (int) (byte) 10);
    }

    @Test
    public void test03317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03317");
        int[] intArray5 = new int[] { (short) 100, 0, (-1), ' ', (-1) };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (-1), (-1));
    }

    @Test
    public void test03318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03318");
        int[] intArray4 = new int[] { (byte) -1, (short) 1, (byte) 0, (short) -1 };
        int[] intArray11 = new int[] { 0, 0, (byte) 1, (-1), (byte) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, 1, 0);
    }

    @Test
    public void test03319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03319");
        int[] intArray2 = new int[] { '4', (byte) -1 };
        int[] intArray8 = new int[] { (short) 0, '4', 'a', (byte) 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) 0, (int) (byte) 1);
    }

    @Test
    public void test03320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03320");
        int[] intArray1 = new int[] { 100 };
        int[] intArray4 = new int[] { 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, 10, (int) (short) 10);
    }

    @Test
    public void test03321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03321");
        int[] intArray6 = new int[] { 100, '4', (byte) -1, (short) -1, 10, (byte) 100 };
        int[] intArray12 = new int[] { (byte) -1, '#', (short) -1, (short) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) 0, (int) (short) -1);
    }

    @Test
    public void test03322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03322");
        int[] intArray6 = new int[] { (byte) -1, (short) 1, (byte) 1, (short) 0, 1, 10 };
        int[] intArray8 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) ' ', (int) (short) 100);
    }

    @Test
    public void test03323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03323");
        int[] intArray2 = new int[] { (short) 100, 1 };
        int[] intArray9 = new int[] { (byte) 1, (short) 100, (byte) 10, (short) 10, '4', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 0, (int) (byte) 100);
    }

    @Test
    public void test03324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03324");
        int[] intArray1 = new int[] { '4' };
        int[] intArray4 = new int[] { '4', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (short) 1, (int) (short) 0);
    }

    @Test
    public void test03325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03325");
        int[] intArray3 = new int[] { (-1), (byte) 0, '4' };
        int[] intArray8 = new int[] { 100, (short) 100, '#', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 10, (int) 'a');
    }

    @Test
    public void test03326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03326");
        int[] intArray3 = new int[] { (byte) 0, (byte) -1, 100 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (byte) 0, (int) (short) 100);
    }

    @Test
    public void test03327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03327");
        int[] intArray5 = new int[] { (-1), (short) 100, (short) 100, 1, (short) 0 };
        int[] intArray8 = new int[] { 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) ' ', (int) (short) 0);
    }

    @Test
    public void test03328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03328");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray5 = new int[] { (byte) 1, '#', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (byte) -1, (-1));
    }

    @Test
    public void test03329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03329");
        int[] intArray3 = new int[] { (byte) 100, 100, 100 };
        int[] intArray5 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) 10, 0);
    }

    @Test
    public void test03330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03330");
        int[] intArray4 = new int[] { (short) 10, (byte) 0, (byte) 100, (byte) 10 };
        int[] intArray11 = new int[] { ' ', 1, ' ', (-1), (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (byte) -1, 100);
    }

    @Test
    public void test03331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03331");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 100, (int) ' ');
    }

    @Test
    public void test03332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03332");
        int[] intArray2 = new int[] { (short) 100, (byte) 10 };
        int[] intArray4 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (short) 1, 1);
    }

    @Test
    public void test03333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03333");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 10, '4', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, 1, (int) (byte) 0);
    }

    @Test
    public void test03334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03334");
        int[] intArray2 = new int[] { (short) 10, (byte) -1 };
        int[] intArray8 = new int[] { 10, 0, (byte) -1, 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (byte) 10, 100);
    }

    @Test
    public void test03335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03335");
        int[] intArray2 = new int[] { 10, (-1) };
        int[] intArray6 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) '#', (int) (byte) 10);
    }

    @Test
    public void test03336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03336");
        int[] intArray4 = new int[] { 10, (short) -1, 0, (short) -1 };
        int[] intArray6 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (short) 0, 0);
    }

    @Test
    public void test03337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03337");
        int[] intArray6 = new int[] { 1, 1, (byte) 100, '4', ' ', (short) 10 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) 1, (int) (byte) 10);
    }

    @Test
    public void test03338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03338");
        int[] intArray4 = new int[] { 1, (short) 0, 1, 10 };
        int[] intArray6 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) ' ', (int) '4');
    }

    @Test
    public void test03339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03339");
        int[] intArray2 = new int[] { (short) 10, (byte) 10 };
        int[] intArray5 = new int[] { ' ', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 1, (-1));
    }

    @Test
    public void test03340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03340");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 100, (short) -1, (byte) 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) 100, (int) (short) 10);
    }

    @Test
    public void test03341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03341");
        int[] intArray3 = new int[] { (short) 100, (byte) 0, (short) 0 };
        int[] intArray10 = new int[] { (-1), (short) 1, 0, 100, (short) 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (byte) 1, 100);
    }

    @Test
    public void test03342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03342");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray7 = new int[] { (short) 1, (short) 10, (short) 10, (-1), (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, 10, (int) 'a');
    }

    @Test
    public void test03343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03343");
        int[] intArray2 = new int[] { (byte) 10, 100 };
        int[] intArray8 = new int[] { (short) 0, 100, (byte) 10, (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) 1, (int) (byte) 0);
    }

    @Test
    public void test03344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03344");
        int[] intArray5 = new int[] { (byte) -1, (short) 100, 0, (byte) 1, '4' };
        int[] intArray12 = new int[] { '4', (byte) 0, 0, (byte) 10, '#', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) '#', (int) (byte) 1);
    }

    @Test
    public void test03345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03345");
        int[] intArray5 = new int[] { ' ', (short) 100, (byte) 1, (-1), (-1) };
        int[] intArray11 = new int[] { (short) 1, 100, 0, (byte) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) 1, 0);
    }

    @Test
    public void test03346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03346");
        int[] intArray3 = new int[] { 100, (byte) 0, (short) 1 };
        int[] intArray6 = new int[] { (byte) 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) 10, (int) (byte) 100);
    }

    @Test
    public void test03347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03347");
        int[] intArray6 = new int[] { '4', 'a', 100, ' ', 'a', (byte) 100 };
        int[] intArray10 = new int[] { 0, ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) 1, 100);
    }

    @Test
    public void test03348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03348");
        int[] intArray3 = new int[] { 10, (-1), 'a' };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) 10, 0);
    }

    @Test
    public void test03349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03349");
        int[] intArray6 = new int[] { (short) 1, (short) 1, 10, 0, 10, (short) 100 };
        int[] intArray12 = new int[] { (byte) 0, ' ', (short) -1, 'a', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) '#', (int) (byte) 0);
    }

    @Test
    public void test03350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03350");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray3 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) 100, 0);
    }

    @Test
    public void test03351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03351");
        int[] intArray3 = new int[] { (byte) -1, (byte) 100, (short) 100 };
        int[] intArray9 = new int[] { ' ', '4', ' ', 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (byte) -1, (int) '4');
    }

    @Test
    public void test03352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03352");
        int[] intArray4 = new int[] { 'a', 'a', (short) 10, '4' };
        int[] intArray6 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 100, (int) (short) 0);
    }

    @Test
    public void test03353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03353");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 1, 10);
    }

    @Test
    public void test03354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03354");
        int[] intArray4 = new int[] { (short) 100, (byte) 10, (byte) 10, 'a' };
        int[] intArray8 = new int[] { 0, '#', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) 1, (int) '#');
    }

    @Test
    public void test03355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03355");
        int[] intArray6 = new int[] { '4', (byte) 1, '4', 1, (short) 10, ' ' };
        int[] intArray10 = new int[] { (short) 100, (short) 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (short) 10, (int) (byte) 10);
    }

    @Test
    public void test03356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03356");
        int[] intArray5 = new int[] { (byte) -1, (short) -1, (-1), ' ', (byte) 10 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 0, 0);
    }

    @Test
    public void test03357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03357");
        int[] intArray5 = new int[] { (byte) 10, (short) 1, 10, 1, (short) 0 };
        int[] intArray8 = new int[] { (-1), (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) 100, (int) (short) 0);
    }

    @Test
    public void test03358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03358");
        int[] intArray1 = new int[] { 0 };
        int[] intArray3 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (byte) 100, 0);
    }

    @Test
    public void test03359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03359");
        int[] intArray3 = new int[] { (byte) 1, (short) -1, 100 };
        int[] intArray7 = new int[] { (short) 0, (byte) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) 10, 0);
    }

    @Test
    public void test03360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03360");
        int[] intArray4 = new int[] { (byte) 10, (-1), (byte) 1, '4' };
        int[] intArray11 = new int[] { 1, 1, (byte) -1, 100, (short) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, 1, 0);
    }

    @Test
    public void test03361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03361");
        int[] intArray3 = new int[] { (short) 0, (short) 1, 'a' };
        int[] intArray8 = new int[] { (short) 1, (short) 0, (byte) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 0, (int) (byte) 10);
    }

    @Test
    public void test03362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03362");
        int[] intArray4 = new int[] { '4', '4', 0, (byte) 1 };
        int[] intArray7 = new int[] { (short) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 10, (int) '4');
    }

    @Test
    public void test03363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03363");
        int[] intArray2 = new int[] { (byte) 100, (short) 1 };
        int[] intArray7 = new int[] { 1, 0, (short) -1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 1, 0);
    }

    @Test
    public void test03364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03364");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 100, (byte) 100, 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) 100, 1);
    }

    @Test
    public void test03365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03365");
        int[] intArray5 = new int[] { (-1), ' ', (short) 0, (byte) -1, ' ' };
        int[] intArray8 = new int[] { '#', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (-1), 10);
    }

    @Test
    public void test03366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03366");
        int[] intArray5 = new int[] { (short) -1, 100, 1, 0, ' ' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) ' ', (int) (byte) 100);
    }

    @Test
    public void test03367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03367");
        int[] intArray2 = new int[] { '#', (byte) 0 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) 100, (int) (byte) -1);
    }

    @Test
    public void test03368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03368");
        int[] intArray4 = new int[] { (short) -1, (short) 100, 0, (short) 10 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (short) -1, (int) (short) 1);
    }

    @Test
    public void test03369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03369");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray4 = new int[] { (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, 1, (int) (short) 100);
    }

    @Test
    public void test03370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03370");
        int[] intArray1 = new int[] { 10 };
        int[] intArray4 = new int[] { (short) -1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 1, (int) (short) -1);
    }

    @Test
    public void test03371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03371");
        int[] intArray2 = new int[] { (-1), (byte) 10 };
        int[] intArray7 = new int[] { (byte) 10, (byte) 10, (byte) 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 10, (int) (byte) 10);
    }

    @Test
    public void test03372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03372");
        int[] intArray5 = new int[] { '4', 10, (byte) 1, 'a', (short) -1 };
        int[] intArray7 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) 10, 1);
    }

    @Test
    public void test03373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03373");
        int[] intArray3 = new int[] { (short) 100, (short) 0, (byte) 10 };
        int[] intArray5 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) 'a', (int) ' ');
    }

    @Test
    public void test03374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03374");
        int[] intArray3 = new int[] { (byte) -1, (byte) 100, (-1) };
        int[] intArray9 = new int[] { (short) 1, (byte) 100, '#', (byte) 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 100, (int) '#');
    }

    @Test
    public void test03375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03375");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { '#', '4', (short) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 0, (int) (short) 100);
    }

    @Test
    public void test03376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03376");
        int[] intArray6 = new int[] { (short) 100, '#', (-1), 1, (byte) 0, (short) -1 };
        int[] intArray12 = new int[] { '#', (short) 0, 'a', '4', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) 1, (int) (short) 0);
    }

    @Test
    public void test03377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03377");
        int[] intArray5 = new int[] { (byte) -1, (short) -1, 0, (short) 100, (short) 0 };
        int[] intArray10 = new int[] { 'a', '4', (-1), 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (short) 10, (int) (byte) 0);
    }

    @Test
    public void test03378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03378");
        int[] intArray1 = new int[] { '4' };
        int[] intArray6 = new int[] { (byte) -1, (short) 10, 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (short) -1, (int) '#');
    }

    @Test
    public void test03379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03379");
        int[] intArray2 = new int[] { (byte) 100, 'a' };
        int[] intArray5 = new int[] { (byte) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 1, 0);
    }

    @Test
    public void test03380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03380");
        int[] intArray3 = new int[] { (short) 10, 10, (short) -1 };
        int[] intArray9 = new int[] { 'a', (short) -1, 'a', 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) '#', (int) (short) 10);
    }

    @Test
    public void test03381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03381");
        int[] intArray4 = new int[] { '4', 1, (short) 100, (byte) 100 };
        int[] intArray6 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, 0, (int) 'a');
    }

    @Test
    public void test03382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03382");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray3 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, 0, (int) (short) 1);
    }

    @Test
    public void test03383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03383");
        int[] intArray5 = new int[] { (byte) 100, (byte) -1, (short) 0, 0, (short) 1 };
        int[] intArray7 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, 0, (int) 'a');
    }

    @Test
    public void test03384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03384");
        int[] intArray2 = new int[] { (byte) 100, (byte) 10 };
        int[] intArray4 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) 'a', (int) (short) -1);
    }

    @Test
    public void test03385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03385");
        int[] intArray2 = new int[] { (short) 10, 10 };
        int[] intArray4 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (byte) 1, (int) (short) 10);
    }

    @Test
    public void test03386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03386");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (short) 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 100, (int) (short) -1);
    }

    @Test
    public void test03387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03387");
        int[] intArray4 = new int[] { 1, '#', (short) 100, (byte) 1 };
        int[] intArray11 = new int[] { (byte) 100, 100, 10, (-1), '#', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) '4', (int) 'a');
    }

    @Test
    public void test03388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03388");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 0, (int) '4');
    }

    @Test
    public void test03389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03389");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray5 = new int[] { (byte) 100, 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (byte) 100, (int) 'a');
    }

    @Test
    public void test03390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03390");
        int[] intArray2 = new int[] { (short) 1, (short) 1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (byte) 0, (int) (byte) 1);
    }

    @Test
    public void test03391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03391");
        int[] intArray3 = new int[] { (-1), 100, (short) 100 };
        int[] intArray5 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) 1, 0);
    }

    @Test
    public void test03392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03392");
        int[] intArray6 = new int[] { (short) 0, (short) -1, (byte) -1, 10, 10, (short) 0 };
        int[] intArray8 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 1, (int) '#');
    }

    @Test
    public void test03393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03393");
        int[] intArray4 = new int[] { (short) 100, 100, '4', (short) 1 };
        int[] intArray9 = new int[] { 100, 10, '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 100, (int) (short) 10);
    }

    @Test
    public void test03394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03394");
        int[] intArray2 = new int[] { 100, (byte) 0 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) 'a', (int) '#');
    }

    @Test
    public void test03395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03395");
        int[] intArray3 = new int[] { 100, (byte) 0, (byte) 100 };
        int[] intArray7 = new int[] { 10, (short) 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) 1, (int) (short) 10);
    }

    @Test
    public void test03396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03396");
        int[] intArray3 = new int[] { (byte) -1, (byte) 0, (short) 1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test03397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03397");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray6 = new int[] { (byte) 100, 'a', (byte) 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 100, 100);
    }

    @Test
    public void test03398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03398");
        int[] intArray4 = new int[] { 0, (byte) 1, (byte) -1, 1 };
        int[] intArray6 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 1, (int) 'a');
    }

    @Test
    public void test03399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03399");
        int[] intArray5 = new int[] { (short) 100, 10, 100, 'a', ' ' };
        int[] intArray9 = new int[] { (short) 1, (-1), (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 100, (int) (byte) -1);
    }

    @Test
    public void test03400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03400");
        int[] intArray4 = new int[] { (short) 10, (byte) 10, 100, (short) 100 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (byte) -1, (int) (short) 100);
    }

    @Test
    public void test03401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03401");
        int[] intArray3 = new int[] { (byte) 0, '4', (byte) 10 };
        int[] intArray5 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) 1, (int) ' ');
    }

    @Test
    public void test03402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03402");
        int[] intArray6 = new int[] { (short) 1, (short) 100, ' ', (-1), (short) 10, (-1) };
        int[] intArray8 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 100, (int) (short) 1);
    }

    @Test
    public void test03403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03403");
        int[] intArray6 = new int[] { '#', (byte) 100, '4', 'a', (short) 100, (byte) 100 };
        int[] intArray12 = new int[] { (-1), (short) 0, 10, (-1), (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) ' ', (int) (short) 10);
    }

    @Test
    public void test03404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03404");
        int[] intArray4 = new int[] { (byte) -1, '4', '4', 0 };
        int[] intArray7 = new int[] { 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 10, (int) (byte) 100);
    }

    @Test
    public void test03405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03405");
        int[] intArray2 = new int[] { (byte) 100, (byte) 1 };
        int[] intArray6 = new int[] { (byte) 0, (short) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (short) 0, 0);
    }

    @Test
    public void test03406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03406");
        int[] intArray3 = new int[] { (short) 1, 1, 10 };
        int[] intArray9 = new int[] { (byte) 0, (short) 1, (short) 1, 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (byte) 100, 0);
    }

    @Test
    public void test03407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03407");
        int[] intArray2 = new int[] { (-1), (short) 10 };
        int[] intArray5 = new int[] { 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 0, (int) (byte) 100);
    }

    @Test
    public void test03408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03408");
        int[] intArray4 = new int[] { ' ', (byte) 100, (byte) 100, '#' };
        int[] intArray11 = new int[] { (byte) -1, (byte) 100, '4', (short) -1, (short) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) 100, (int) (byte) -1);
    }

    @Test
    public void test03409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03409");
        int[] intArray3 = new int[] { (byte) 10, '4', (byte) 10 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (-1), (int) (short) 1);
    }

    @Test
    public void test03410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03410");
        int[] intArray4 = new int[] { (short) 10, (short) 0, (short) -1, 1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (short) 0, 0);
    }

    @Test
    public void test03411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03411");
        int[] intArray2 = new int[] { (-1), (byte) 10 };
        int[] intArray9 = new int[] { 'a', 100, '4', (byte) 1, (byte) 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (short) 1, (int) ' ');
    }

    @Test
    public void test03412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03412");
        int[] intArray4 = new int[] { (-1), ' ', (byte) 10, (byte) 1 };
        int[] intArray8 = new int[] { '#', 'a', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 10, (int) (byte) 100);
    }

    @Test
    public void test03413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03413");
        int[] intArray4 = new int[] { ' ', 'a', 10, 100 };
        int[] intArray9 = new int[] { 0, ' ', (short) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 100, (int) (short) 1);
    }

    @Test
    public void test03414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03414");
        int[] intArray6 = new int[] { (short) 10, '4', 0, (short) 0, (byte) 0, (short) -1 };
        int[] intArray8 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) '#', (int) (short) 1);
    }

    @Test
    public void test03415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03415");
        int[] intArray3 = new int[] { (short) 0, (short) -1, 10 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, 100, (int) (byte) 0);
    }

    @Test
    public void test03416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03416");
        int[] intArray4 = new int[] { ' ', (byte) 10, 10, (byte) 10 };
        int[] intArray7 = new int[] { (byte) 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) 'a', (int) '4');
    }

    @Test
    public void test03417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03417");
        int[] intArray3 = new int[] { (short) 0, ' ', '#' };
        int[] intArray6 = new int[] { (short) -1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) 10, (-1));
    }

    @Test
    public void test03418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03418");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (short) 1, (int) ' ');
    }

    @Test
    public void test03419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03419");
        int[] intArray5 = new int[] { (-1), 0, (short) 0, (short) 10, (byte) -1 };
        int[] intArray8 = new int[] { (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 10, (int) ' ');
    }

    @Test
    public void test03420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03420");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (byte) -1, 1);
    }

    @Test
    public void test03421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03421");
        int[] intArray4 = new int[] { '#', (byte) 0, (byte) 100, (byte) 0 };
        int[] intArray9 = new int[] { (short) 100, '#', (-1), 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) -1, (int) (short) -1);
    }

    @Test
    public void test03422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03422");
        int[] intArray6 = new int[] { (byte) 100, ' ', (byte) 10, (short) 100, '4', 'a' };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, 10, (int) (short) 0);
    }

    @Test
    public void test03423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03423");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray8 = new int[] { 'a', (short) 0, (short) 10, 100, 'a', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) 10, 0);
    }

    @Test
    public void test03424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03424");
        int[] intArray6 = new int[] { (byte) -1, (short) -1, (byte) -1, 0, (-1), (short) 10 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, 1, (int) (short) 0);
    }

    @Test
    public void test03425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03425");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { ' ', 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (-1), (int) ' ');
    }

    @Test
    public void test03426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03426");
        int[] intArray4 = new int[] { (short) 10, 'a', (short) 100, ' ' };
        int[] intArray7 = new int[] { 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) 1, (-1));
    }

    @Test
    public void test03427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03427");
        int[] intArray5 = new int[] { (byte) 1, 1, (byte) 10, (byte) 10, (byte) 1 };
        int[] intArray9 = new int[] { 10, (byte) 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (byte) 10, (int) (byte) 10);
    }

    @Test
    public void test03428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03428");
        int[] intArray4 = new int[] { (short) 100, '#', (byte) 100, (short) 100 };
        int[] intArray10 = new int[] { (short) 0, (short) 0, 1, 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) 100, (int) (byte) 10);
    }

    @Test
    public void test03429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03429");
        int[] intArray5 = new int[] { '#', ' ', ' ', 100, (-1) };
        int[] intArray11 = new int[] { 0, (short) 10, (byte) 1, ' ', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) '#', (int) '4');
    }

    @Test
    public void test03430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03430");
        int[] intArray6 = new int[] { 0, (byte) -1, (byte) 100, (short) 1, (byte) -1, 1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) 10, 1);
    }

    @Test
    public void test03431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03431");
        int[] intArray5 = new int[] { (short) -1, (byte) 100, (byte) 0, (-1), (-1) };
        int[] intArray9 = new int[] { (byte) 100, '#', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 0, (int) (short) 0);
    }

    @Test
    public void test03432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03432");
        int[] intArray5 = new int[] { (byte) 10, (short) -1, (byte) 0, (short) 1, '4' };
        int[] intArray10 = new int[] { (byte) 0, (short) 10, 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 100, 0);
    }

    @Test
    public void test03433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03433");
        int[] intArray5 = new int[] { (short) 100, '4', 10, 'a', '4' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (short) 0, (int) (short) -1);
    }

    @Test
    public void test03434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03434");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (byte) 0, (int) ' ');
    }

    @Test
    public void test03435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03435");
        int[] intArray2 = new int[] { (short) 10, (-1) };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 10, (int) '#');
    }

    @Test
    public void test03436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03436");
        int[] intArray3 = new int[] { (short) 1, (byte) 0, (byte) 100 };
        int[] intArray8 = new int[] { (byte) 10, (byte) -1, 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (short) 1, (int) (short) 0);
    }

    @Test
    public void test03437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03437");
        int[] intArray4 = new int[] { (short) 0, (byte) -1, (short) 0, (short) -1 };
        int[] intArray7 = new int[] { (short) 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) '4', (int) (byte) 10);
    }

    @Test
    public void test03438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03438");
        int[] intArray2 = new int[] { (byte) 10, (short) -1 };
        int[] intArray5 = new int[] { 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (byte) -1, (int) (byte) 1);
    }

    @Test
    public void test03439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03439");
        int[] intArray5 = new int[] { (short) -1, (byte) 10, 'a', 1, (short) 10 };
        int[] intArray9 = new int[] { (byte) 0, 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 1, (-1));
    }

    @Test
    public void test03440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03440");
        int[] intArray4 = new int[] { 0, (byte) 0, '#', ' ' };
        int[] intArray9 = new int[] { (short) 0, 100, '#', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (-1), (int) (byte) 100);
    }

    @Test
    public void test03441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03441");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 1, (byte) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, 10, (int) (byte) -1);
    }

    @Test
    public void test03442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03442");
        int[] intArray3 = new int[] { '#', (short) 1, 100 };
        int[] intArray10 = new int[] { (byte) 1, (byte) -1, '4', 100, (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (byte) 10, (int) (byte) 100);
    }

    @Test
    public void test03443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03443");
        int[] intArray4 = new int[] { (short) 10, (byte) 10, '4', 10 };
        int[] intArray7 = new int[] { (-1), 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 10, (int) (short) 0);
    }

    @Test
    public void test03444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03444");
        int[] intArray4 = new int[] { 'a', 1, 10, 'a' };
        int[] intArray7 = new int[] { (byte) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) 1, (int) (byte) 0);
    }

    @Test
    public void test03445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03445");
        int[] intArray5 = new int[] { 1, 1, (byte) 10, (byte) 100, 10 };
        int[] intArray12 = new int[] { (byte) 1, (short) -1, 1, (byte) 1, 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, 0, (-1));
    }

    @Test
    public void test03446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03446");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray6 = new int[] { (short) 10, (-1), (byte) -1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 10, (int) (byte) 10);
    }

    @Test
    public void test03447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03447");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 100, 'a', 10, 'a', (short) 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, 0, (int) 'a');
    }

    @Test
    public void test03448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03448");
        int[] intArray4 = new int[] { '#', (short) 0, 100, 100 };
        int[] intArray10 = new int[] { 1, (byte) 10, (short) 1, ' ', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) 0, 1);
    }

    @Test
    public void test03449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03449");
        int[] intArray2 = new int[] { ' ', (byte) 0 };
        int[] intArray8 = new int[] { '#', 10, (byte) 100, (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (byte) 1, (int) ' ');
    }

    @Test
    public void test03450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03450");
        int[] intArray4 = new int[] { (byte) 1, 100, (byte) 100, (byte) 100 };
        int[] intArray8 = new int[] { (byte) 10, '4', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) 100, (int) (byte) 100);
    }

    @Test
    public void test03451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03451");
        int[] intArray5 = new int[] { (byte) 100, (short) -1, ' ', (short) -1, (short) -1 };
        int[] intArray12 = new int[] { 'a', 1, (short) 100, (byte) 0, 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) 0, (int) (byte) 0);
    }

    @Test
    public void test03452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03452");
        int[] intArray2 = new int[] { 'a', (byte) 1 };
        int[] intArray8 = new int[] { (short) 10, (short) 0, (-1), 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (-1), (int) '4');
    }

    @Test
    public void test03453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03453");
        int[] intArray1 = new int[] { '4' };
        int[] intArray8 = new int[] { (short) -1, 10, 0, 100, 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (-1), (int) '#');
    }

    @Test
    public void test03454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03454");
        int[] intArray4 = new int[] { (short) -1, ' ', ' ', (short) 10 };
        int[] intArray11 = new int[] { (short) 10, (byte) 100, '4', 1, ' ', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) '4', (int) (short) 10);
    }

    @Test
    public void test03455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03455");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray8 = new int[] { (byte) 0, ' ', 'a', (short) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (byte) 100, 1);
    }

    @Test
    public void test03456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03456");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 10, (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) 100, (int) (short) 1);
    }

    @Test
    public void test03457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03457");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 0, (byte) 10, (-1), (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 0, 0);
    }

    @Test
    public void test03458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03458");
        int[] intArray5 = new int[] { 'a', (byte) 10, 100, (short) 0, (short) 1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) 'a', 1);
    }

    @Test
    public void test03459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03459");
        int[] intArray6 = new int[] { (byte) 10, 100, (byte) 100, (byte) 10, '4', (byte) 1 };
        int[] intArray11 = new int[] { (-1), '#', (short) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) '#', (int) 'a');
    }

    @Test
    public void test03460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03460");
        int[] intArray6 = new int[] { 1, (byte) -1, (byte) 0, 100, 'a', (byte) -1 };
        int[] intArray8 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 100, 0);
    }

    @Test
    public void test03461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03461");
        int[] intArray5 = new int[] { (byte) -1, (short) 10, (short) 1, (byte) -1, (byte) 0 };
        int[] intArray7 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (short) 100, (int) (short) 10);
    }

    @Test
    public void test03462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03462");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 10, (int) '4');
    }

    @Test
    public void test03463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03463");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray5 = new int[] { (byte) 100, (byte) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) -1, (int) (short) 100);
    }

    @Test
    public void test03464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03464");
        int[] intArray3 = new int[] { (byte) 1, (short) 1, (byte) -1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, 0, 1);
    }

    @Test
    public void test03465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03465");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray8 = new int[] { 0, 10, 100, 100, ' ', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) -1, (int) (short) -1);
    }

    @Test
    public void test03466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03466");
        int[] intArray3 = new int[] { 0, 10, 1 };
        int[] intArray6 = new int[] { 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) 0, 100);
    }

    @Test
    public void test03467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03467");
        int[] intArray5 = new int[] { (byte) -1, (short) 100, 'a', (short) 100, (short) 10 };
        int[] intArray11 = new int[] { (short) 100, 'a', ' ', 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) 10, (int) (byte) 10);
    }

    @Test
    public void test03468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03468");
        int[] intArray6 = new int[] { ' ', (-1), 'a', 'a', (byte) 0, '4' };
        int[] intArray8 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (-1), (int) ' ');
    }

    @Test
    public void test03469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03469");
        int[] intArray4 = new int[] { '4', ' ', 100, ' ' };
        int[] intArray8 = new int[] { (byte) 100, (byte) 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 0, (int) (byte) 0);
    }

    @Test
    public void test03470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03470");
        int[] intArray6 = new int[] { 10, (byte) 0, (short) 100, (short) 10, (byte) 0, (short) 100 };
        int[] intArray13 = new int[] { 'a', 100, ' ', (short) 10, 'a', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 1, 0);
    }

    @Test
    public void test03471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03471");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray4 = new int[] { (byte) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 100, 1);
    }

    @Test
    public void test03472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03472");
        int[] intArray5 = new int[] { (byte) 10, (byte) 0, 0, (short) -1, (byte) -1 };
        int[] intArray8 = new int[] { 'a', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) -1, (int) (short) -1);
    }

    @Test
    public void test03473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03473");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray4 = new int[] { ' ', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (short) 1, 0);
    }

    @Test
    public void test03474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03474");
        int[] intArray5 = new int[] { 0, '#', (short) 100, (byte) 100, (short) 1 };
        int[] intArray10 = new int[] { (-1), (short) 1, (short) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (short) 100, 1);
    }

    @Test
    public void test03475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03475");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray8 = new int[] { (byte) 10, (short) 0, 100, 0, (byte) 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 0, (int) (short) 10);
    }

    @Test
    public void test03476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03476");
        int[] intArray4 = new int[] { 1, (short) 1, (byte) -1, (byte) -1 };
        int[] intArray7 = new int[] { 'a', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) -1, 1);
    }

    @Test
    public void test03477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03477");
        int[] intArray5 = new int[] { 'a', (short) 1, (short) 1, 0, (short) 10 };
        int[] intArray12 = new int[] { 100, '#', ' ', (short) 10, (byte) 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) '4', (int) (short) 1);
    }

    @Test
    public void test03478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03478");
        int[] intArray2 = new int[] { (short) 100, '4' };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 0, (int) '4');
    }

    @Test
    public void test03479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03479");
        int[] intArray3 = new int[] { 0, 1, (byte) 10 };
        int[] intArray9 = new int[] { (byte) -1, (byte) 100, (short) -1, '4', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (short) 100, (int) '#');
    }

    @Test
    public void test03480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03480");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 100, (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (-1), (int) 'a');
    }

    @Test
    public void test03481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03481");
        int[] intArray3 = new int[] { 10, (short) 10, 1 };
        int[] intArray10 = new int[] { 'a', 1, (short) 1, 100, (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 100, (int) (byte) 1);
    }

    @Test
    public void test03482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03482");
        int[] intArray5 = new int[] { (short) 100, '#', (byte) -1, '4', (byte) 10 };
        int[] intArray8 = new int[] { (short) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) 10, (int) (byte) 0);
    }

    @Test
    public void test03483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03483");
        int[] intArray3 = new int[] { (short) -1, '#', (short) 10 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test03484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03484");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 1, 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) 1, 1);
    }

    @Test
    public void test03485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03485");
        int[] intArray6 = new int[] { 0, (byte) 100, 1, (short) 0, (byte) 0, (-1) };
        int[] intArray12 = new int[] { (short) 0, 10, (byte) 100, ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (byte) 1, 0);
    }

    @Test
    public void test03486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03486");
        int[] intArray6 = new int[] { (byte) -1, (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 0 };
        int[] intArray11 = new int[] { 'a', '#', 'a', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) 'a', 0);
    }

    @Test
    public void test03487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03487");
        int[] intArray2 = new int[] { ' ', (short) 100 };
        int[] intArray8 = new int[] { 'a', (byte) -1, 10, (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) 100, (int) (short) -1);
    }

    @Test
    public void test03488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03488");
        int[] intArray4 = new int[] { 10, (byte) 0, 100, 'a' };
        int[] intArray10 = new int[] { (short) 10, 10, (short) 100, (short) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) 0, (int) (short) 100);
    }

    @Test
    public void test03489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03489");
        int[] intArray2 = new int[] { (short) -1, 0 };
        int[] intArray6 = new int[] { 0, (short) 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 0, (int) (short) 1);
    }

    @Test
    public void test03490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03490");
        int[] intArray5 = new int[] { (byte) 100, (byte) -1, 1, 100, (byte) 100 };
        int[] intArray11 = new int[] { (byte) 0, (byte) 10, 100, 'a', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) 0, (int) (short) 100);
    }

    @Test
    public void test03491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03491");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (byte) 10, 100);
    }

    @Test
    public void test03492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03492");
        int[] intArray3 = new int[] { (short) 100, (byte) 0, (short) -1 };
        int[] intArray8 = new int[] { (short) 100, (short) 10, (short) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (short) 1, (int) ' ');
    }

    @Test
    public void test03493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03493");
        int[] intArray4 = new int[] { (byte) 10, '#', (short) 1, 'a' };
        int[] intArray9 = new int[] { (byte) 10, 0, 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (byte) -1, (int) ' ');
    }

    @Test
    public void test03494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03494");
        int[] intArray5 = new int[] { 0, (-1), 'a', (byte) 0, 10 };
        int[] intArray9 = new int[] { (short) -1, (short) 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 100, 1);
    }

    @Test
    public void test03495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03495");
        int[] intArray5 = new int[] { (short) 100, (short) 1, (short) 1, (byte) 1, 'a' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) '#', (int) 'a');
    }

    @Test
    public void test03496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03496");
        int[] intArray5 = new int[] { (byte) 1, (short) -1, (-1), 10, 100 };
        int[] intArray9 = new int[] { (byte) 1, (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 0, (int) (byte) -1);
    }

    @Test
    public void test03497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03497");
        int[] intArray4 = new int[] { (byte) 1, 1, (short) 0, (short) 0 };
        int[] intArray11 = new int[] { 'a', (byte) 10, (short) -1, 1, (byte) 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) 100, (int) (short) 0);
    }

    @Test
    public void test03498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03498");
        int[] intArray6 = new int[] { 100, (byte) 0, 10, '4', 10, '#' };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, 0, 10);
    }

    @Test
    public void test03499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03499");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray8 = new int[] { ' ', 10, (short) -1, (-1), 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) 100, (int) (short) 0);
    }

    @Test
    public void test03500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test03500");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (byte) 1, (int) (byte) 10);
    }
}
