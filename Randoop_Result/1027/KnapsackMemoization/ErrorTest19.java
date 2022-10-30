package KnapsackMemoization;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest19 {

    public static boolean debug = false;

    @Test
    public void test09501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09501");
        int[] intArray5 = new int[] { (byte) -1, 100, (short) -1, 1, (byte) 10 };
        int[] intArray8 = new int[] { (byte) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) -1, 10);
    }

    @Test
    public void test09502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09502");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 0, (int) (byte) 0);
    }

    @Test
    public void test09503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09503");
        int[] intArray2 = new int[] { (short) 10, 100 };
        int[] intArray8 = new int[] { '4', 1, (short) 10, (short) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (byte) 0, (int) (byte) 100);
    }

    @Test
    public void test09504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09504");
        int[] intArray3 = new int[] { (-1), (byte) -1, ' ' };
        int[] intArray8 = new int[] { '#', (-1), 'a', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 10, 1);
    }

    @Test
    public void test09505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09505");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray8 = new int[] { (short) 1, 1, (-1), (short) 10, (byte) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) 0, 0);
    }

    @Test
    public void test09506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09506");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) -1, 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, 10, (int) (short) 10);
    }

    @Test
    public void test09507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09507");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) -1, (short) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (-1), (int) (byte) 10);
    }

    @Test
    public void test09508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09508");
        int[] intArray3 = new int[] { (-1), (short) 0, (short) 0 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (-1), (int) '4');
    }

    @Test
    public void test09509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09509");
        int[] intArray5 = new int[] { 100, (short) 0, (short) 0, (short) 1, '4' };
        int[] intArray8 = new int[] { (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) 100, (int) (short) 0);
    }

    @Test
    public void test09510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09510");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) 0, 100, (short) 1, 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) 0, (int) ' ');
    }

    @Test
    public void test09511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09511");
        int[] intArray4 = new int[] { (byte) -1, (short) 100, (short) 1, (short) 10 };
        int[] intArray8 = new int[] { 0, ' ', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) 0, (int) (byte) 100);
    }

    @Test
    public void test09512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09512");
        int[] intArray5 = new int[] { (short) -1, (byte) 10, 100, '4', 'a' };
        int[] intArray9 = new int[] { 1, 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 10, (int) ' ');
    }

    @Test
    public void test09513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09513");
        int[] intArray4 = new int[] { ' ', '4', (byte) 10, 100 };
        int[] intArray8 = new int[] { (byte) 10, (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 10, (int) 'a');
    }

    @Test
    public void test09514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09514");
        int[] intArray2 = new int[] { (short) 0, (byte) 1 };
        int[] intArray8 = new int[] { 1, (short) 10, '4', ' ', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (byte) 100, (int) 'a');
    }

    @Test
    public void test09515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09515");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (byte) 1, (int) (byte) -1);
    }

    @Test
    public void test09516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09516");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray5 = new int[] { (short) 10, (-1), (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) 100, 10);
    }

    @Test
    public void test09517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09517");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (short) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) ' ', 0);
    }

    @Test
    public void test09518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09518");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray7 = new int[] { (byte) 0, (short) 10, (byte) 10, (short) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) -1, 10);
    }

    @Test
    public void test09519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09519");
        int[] intArray6 = new int[] { (short) -1, (-1), '#', 10, (byte) -1, (short) 10 };
        int[] intArray10 = new int[] { 100, (byte) 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) 0, (int) '#');
    }

    @Test
    public void test09520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09520");
        int[] intArray5 = new int[] { (short) 10, 1, '#', (byte) 10, '4' };
        int[] intArray10 = new int[] { (byte) 10, 1, '#', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 1, (int) '#');
    }

    @Test
    public void test09521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09521");
        int[] intArray6 = new int[] { (byte) 1, (short) 1, (short) 1, 1, (short) -1, 10 };
        int[] intArray12 = new int[] { (short) 0, (byte) 10, (short) 10, (byte) -1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) '4', 0);
    }

    @Test
    public void test09522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09522");
        int[] intArray2 = new int[] { 1, (short) 0 };
        int[] intArray9 = new int[] { 10, (byte) 10, 100, 1, (byte) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (byte) 0, (int) (byte) 100);
    }

    @Test
    public void test09523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09523");
        int[] intArray4 = new int[] { (byte) 1, 10, (short) -1, (byte) 1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) '4', (int) (short) 10);
    }

    @Test
    public void test09524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09524");
        int[] intArray5 = new int[] { (byte) 0, (short) -1, 1, (byte) 10, (byte) 100 };
        int[] intArray7 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (-1), (int) (byte) 0);
    }

    @Test
    public void test09525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09525");
        int[] intArray6 = new int[] { ' ', (short) -1, 1, 0, ' ', 10 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (-1), (int) (short) 0);
    }

    @Test
    public void test09526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09526");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (short) -1, (int) (short) 100);
    }

    @Test
    public void test09527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09527");
        int[] intArray2 = new int[] { '4', (short) 100 };
        int[] intArray6 = new int[] { (byte) 1, '4', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (-1), (int) (short) 1);
    }

    @Test
    public void test09528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09528");
        int[] intArray4 = new int[] { '#', '4', (short) 1, (-1) };
        int[] intArray10 = new int[] { 100, (short) -1, (-1), (short) 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) 100, (int) (short) 10);
    }

    @Test
    public void test09529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09529");
        int[] intArray5 = new int[] { (short) 100, ' ', ' ', 0, '4' };
        int[] intArray9 = new int[] { (byte) 100, 'a', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (byte) 0, 10);
    }

    @Test
    public void test09530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09530");
        int[] intArray3 = new int[] { 100, (short) -1, (-1) };
        int[] intArray10 = new int[] { (byte) 10, 100, (short) -1, (short) 1, '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 0, (int) 'a');
    }

    @Test
    public void test09531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09531");
        int[] intArray3 = new int[] { 10, (byte) 0, (short) -1 };
        int[] intArray5 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) ' ', (int) (byte) 100);
    }

    @Test
    public void test09532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09532");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 'a', (short) 10, (short) 10, (short) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) 'a', 10);
    }

    @Test
    public void test09533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09533");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 100, (int) (short) 0);
    }

    @Test
    public void test09534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09534");
        int[] intArray3 = new int[] { (byte) 1, (short) 0, 100 };
        int[] intArray7 = new int[] { 10, (short) 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) 1, (int) '#');
    }

    @Test
    public void test09535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09535");
        int[] intArray5 = new int[] { ' ', (short) -1, 'a', ' ', 0 };
        int[] intArray12 = new int[] { 10, (short) 10, (byte) 0, 10, 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (-1), (int) (short) 1);
    }

    @Test
    public void test09536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09536");
        int[] intArray4 = new int[] { (short) 100, (short) -1, (short) -1, (short) 100 };
        int[] intArray6 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (short) 100, 100);
    }

    @Test
    public void test09537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09537");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray7 = new int[] { (byte) 0, (byte) 0, (byte) 1, (short) 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) 10, (int) '#');
    }

    @Test
    public void test09538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09538");
        int[] intArray4 = new int[] { 0, (short) 1, (byte) 0, '4' };
        int[] intArray7 = new int[] { (short) 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 100, (int) '4');
    }

    @Test
    public void test09539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09539");
        int[] intArray6 = new int[] { (short) 0, (short) 0, (short) 0, '#', 1, (byte) -1 };
        int[] intArray11 = new int[] { (short) 1, (short) 100, 'a', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (short) 10, (int) (byte) -1);
    }

    @Test
    public void test09540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09540");
        int[] intArray5 = new int[] { (short) 100, (byte) 10, 0, (short) 0, (byte) -1 };
        int[] intArray9 = new int[] { 1, (short) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (-1), (int) (short) 1);
    }

    @Test
    public void test09541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09541");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray4 = new int[] { 'a', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 0, (int) (byte) -1);
    }

    @Test
    public void test09542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09542");
        int[] intArray2 = new int[] { (byte) 0, (short) 10 };
        int[] intArray5 = new int[] { 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 100, (int) (byte) -1);
    }

    @Test
    public void test09543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09543");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 0, 0, (short) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) 1, (int) (short) 1);
    }

    @Test
    public void test09544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09544");
        int[] intArray6 = new int[] { '4', (-1), 10, (byte) 1, 10, 0 };
        int[] intArray9 = new int[] { '4', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, 100, (int) ' ');
    }

    @Test
    public void test09545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09545");
        int[] intArray6 = new int[] { 10, '#', 1, (-1), '4', 100 };
        int[] intArray11 = new int[] { '4', (byte) 10, (short) 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 1, (int) (short) 10);
    }

    @Test
    public void test09546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09546");
        int[] intArray4 = new int[] { (byte) 0, 1, (byte) 0, (byte) -1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, 0, (int) (byte) 0);
    }

    @Test
    public void test09547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09547");
        int[] intArray3 = new int[] { (short) 100, 1, 10 };
        int[] intArray10 = new int[] { 1, (byte) 1, ' ', (short) 100, (byte) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 10, 1);
    }

    @Test
    public void test09548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09548");
        int[] intArray5 = new int[] { (byte) 1, (-1), (short) 10, (byte) 10, (byte) 1 };
        int[] intArray12 = new int[] { '#', 1, '4', 10, (short) 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (byte) 10, (int) '#');
    }

    @Test
    public void test09549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09549");
        int[] intArray4 = new int[] { (byte) -1, '#', ' ', (short) 0 };
        int[] intArray6 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) '4', (int) (byte) -1);
    }

    @Test
    public void test09550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09550");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray6 = new int[] { (short) -1, (short) 1, 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) ' ', (int) (short) 0);
    }

    @Test
    public void test09551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09551");
        int[] intArray3 = new int[] { (byte) -1, 0, (byte) 0 };
        int[] intArray7 = new int[] { (short) 10, 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 0, (int) (byte) 100);
    }

    @Test
    public void test09552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09552");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) -1, (int) '#');
    }

    @Test
    public void test09553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09553");
        int[] intArray3 = new int[] { (byte) 10, (byte) 1, ' ' };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) 10, (int) 'a');
    }

    @Test
    public void test09554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09554");
        int[] intArray1 = new int[] { 0 };
        int[] intArray4 = new int[] { 'a', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) ' ', (int) (byte) 1);
    }

    @Test
    public void test09555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09555");
        int[] intArray6 = new int[] { (byte) 100, (short) -1, (byte) 1, (short) 10, '4', (-1) };
        int[] intArray13 = new int[] { 100, (byte) -1, (byte) 1, (byte) 10, 'a', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 10, 10);
    }

    @Test
    public void test09556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09556");
        int[] intArray3 = new int[] { '#', '#', (byte) 10 };
        int[] intArray6 = new int[] { 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) 1, (int) (short) 100);
    }

    @Test
    public void test09557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09557");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray3 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) '4', 100);
    }

    @Test
    public void test09558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09558");
        int[] intArray6 = new int[] { 0, (byte) 0, (short) 1, 0, 100, (-1) };
        int[] intArray10 = new int[] { 1, (short) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (-1), (int) (byte) 1);
    }

    @Test
    public void test09559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09559");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) 100, (-1));
    }

    @Test
    public void test09560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09560");
        int[] intArray2 = new int[] { (short) -1, (short) 1 };
        int[] intArray5 = new int[] { (byte) -1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (byte) 0, (int) (short) -1);
    }

    @Test
    public void test09561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09561");
        int[] intArray2 = new int[] { 1, (byte) 0 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) 'a', (int) (short) -1);
    }

    @Test
    public void test09562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09562");
        int[] intArray4 = new int[] { (short) 100, (byte) 0, (short) 10, (byte) 1 };
        int[] intArray10 = new int[] { 10, (short) -1, (short) 100, (byte) -1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) ' ', 0);
    }

    @Test
    public void test09563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09563");
        int[] intArray5 = new int[] { (short) 10, (short) 10, (short) 100, (short) 1, (-1) };
        int[] intArray7 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (short) 100, 1);
    }

    @Test
    public void test09564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09564");
        int[] intArray3 = new int[] { (byte) -1, (short) -1, 'a' };
        int[] intArray8 = new int[] { (short) 100, (byte) 10, (byte) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test09565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09565");
        int[] intArray4 = new int[] { 100, 'a', (short) 100, '#' };
        int[] intArray11 = new int[] { (byte) 0, '#', (short) 10, ' ', 'a', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, 1, (int) (byte) 1);
    }

    @Test
    public void test09566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09566");
        int[] intArray2 = new int[] { 'a', (-1) };
        int[] intArray9 = new int[] { (short) -1, 100, (short) 1, '#', (short) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (byte) 100, 0);
    }

    @Test
    public void test09567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09567");
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 0, (short) 0, (-1) };
        int[] intArray9 = new int[] { (byte) 0, '#', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (byte) 1, 0);
    }

    @Test
    public void test09568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09568");
        int[] intArray2 = new int[] { (byte) 0, (short) 0 };
        int[] intArray6 = new int[] { (short) 1, 'a', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) 'a', 1);
    }

    @Test
    public void test09569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09569");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (byte) 10, (int) '4');
    }

    @Test
    public void test09570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09570");
        int[] intArray6 = new int[] { (-1), (byte) 1, '#', (byte) 0, 0, 1 };
        int[] intArray8 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) ' ', 10);
    }

    @Test
    public void test09571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09571");
        int[] intArray6 = new int[] { (byte) 0, (byte) 0, 'a', (byte) 1, (short) -1, (-1) };
        int[] intArray8 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 0, 0);
    }

    @Test
    public void test09572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09572");
        int[] intArray2 = new int[] { (-1), (-1) };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (byte) 10, (int) '4');
    }

    @Test
    public void test09573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09573");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 100, 1, (short) 1, (-1), (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) 1, 0);
    }

    @Test
    public void test09574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09574");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray6 = new int[] { (short) -1, '#', (byte) 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (byte) 0, 10);
    }

    @Test
    public void test09575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09575");
        int[] intArray6 = new int[] { (byte) 100, (short) 100, 1, 10, 10, (byte) -1 };
        int[] intArray13 = new int[] { (short) 0, 10, (byte) 1, 0, (short) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 0, (int) (short) 1);
    }

    @Test
    public void test09576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09576");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray4 = new int[] { (byte) -1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 0, (int) (byte) 1);
    }

    @Test
    public void test09577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09577");
        int[] intArray4 = new int[] { (short) 0, (-1), (byte) -1, '#' };
        int[] intArray9 = new int[] { 0, (byte) 100, (byte) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 1, 0);
    }

    @Test
    public void test09578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09578");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 1, (byte) 1, ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 10, 1);
    }

    @Test
    public void test09579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09579");
        int[] intArray6 = new int[] { (short) 100, (byte) 0, (short) -1, (short) 100, 10, (short) -1 };
        int[] intArray10 = new int[] { (byte) 100, (short) 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) '#', (int) 'a');
    }

    @Test
    public void test09580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09580");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray5 = new int[] { (short) 10, (-1), (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, 0, 10);
    }

    @Test
    public void test09581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09581");
        int[] intArray3 = new int[] { (short) 1, (-1), (short) 1 };
        int[] intArray7 = new int[] { (short) 1, 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) ' ', (-1));
    }

    @Test
    public void test09582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09582");
        int[] intArray2 = new int[] { 'a', (short) 100 };
        int[] intArray5 = new int[] { (-1), '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 10, 10);
    }

    @Test
    public void test09583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09583");
        int[] intArray6 = new int[] { (byte) 1, (byte) 0, (short) 1, (byte) 0, (byte) 0, (byte) 0 };
        int[] intArray11 = new int[] { '#', 'a', ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (short) -1, (int) (byte) 0);
    }

    @Test
    public void test09584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09584");
        int[] intArray5 = new int[] { (short) 10, (short) 100, (short) 0, (byte) -1, (byte) -1 };
        int[] intArray10 = new int[] { (byte) 100, (-1), (byte) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 10, (int) (byte) 10);
    }

    @Test
    public void test09585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09585");
        int[] intArray6 = new int[] { (byte) -1, 100, 0, (short) 10, ' ', 10 };
        int[] intArray12 = new int[] { (byte) 10, ' ', (-1), 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (byte) 1, (int) (byte) 1);
    }

    @Test
    public void test09586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09586");
        int[] intArray6 = new int[] { (short) -1, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (short) 10 };
        int[] intArray10 = new int[] { (short) 0, (-1), (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (-1), (int) (short) -1);
    }

    @Test
    public void test09587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09587");
        int[] intArray6 = new int[] { 'a', ' ', (short) 1, 100, (byte) -1, (byte) 100 };
        int[] intArray13 = new int[] { 100, (short) 1, '4', (byte) 0, (short) 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (-1), (int) '4');
    }

    @Test
    public void test09588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09588");
        int[] intArray3 = new int[] { 1, 10, 'a' };
        int[] intArray10 = new int[] { 1, (byte) -1, 1, ' ', 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 100, 0);
    }

    @Test
    public void test09589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09589");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) -1, 100, (short) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 1, (int) (short) 1);
    }

    @Test
    public void test09590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09590");
        int[] intArray6 = new int[] { '#', (byte) -1, '4', '4', '4', '4' };
        int[] intArray9 = new int[] { (short) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (short) 100, (int) (byte) -1);
    }

    @Test
    public void test09591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09591");
        int[] intArray4 = new int[] { (byte) 0, '#', (byte) -1, (byte) 1 };
        int[] intArray6 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (short) 100, (int) (byte) 0);
    }

    @Test
    public void test09592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09592");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray8 = new int[] { (short) 10, '#', 'a', (short) 0, 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test09593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09593");
        int[] intArray2 = new int[] { (short) 100, (short) 100 };
        int[] intArray5 = new int[] { 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 100, (int) (short) 0);
    }

    @Test
    public void test09594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09594");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 1, (byte) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) ' ', 1);
    }

    @Test
    public void test09595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09595");
        int[] intArray3 = new int[] { (short) 100, 'a', (byte) 1 };
        int[] intArray7 = new int[] { (byte) 10, 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) -1, (int) 'a');
    }

    @Test
    public void test09596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09596");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) -1, (short) 100, (byte) -1, '4', ' ', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) '#', 1);
    }

    @Test
    public void test09597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09597");
        int[] intArray5 = new int[] { (short) 1, 0, (byte) 100, '#', '#' };
        int[] intArray12 = new int[] { 0, 100, (byte) 10, (short) 1, 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (byte) 0, (int) (byte) 1);
    }

    @Test
    public void test09598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09598");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (byte) 0, (int) (byte) 10);
    }

    @Test
    public void test09599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09599");
        int[] intArray3 = new int[] { ' ', '#', 10 };
        int[] intArray7 = new int[] { (byte) 1, 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (-1), 0);
    }

    @Test
    public void test09600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09600");
        int[] intArray5 = new int[] { (-1), '4', (byte) 0, (short) 100, (-1) };
        int[] intArray7 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test09601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09601");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 0, (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) ' ', (int) (short) 1);
    }

    @Test
    public void test09602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09602");
        int[] intArray4 = new int[] { (short) 100, 10, (short) -1, (-1) };
        int[] intArray8 = new int[] { '4', (short) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) 'a', (int) (byte) -1);
    }

    @Test
    public void test09603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09603");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 100, 100, (byte) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) -1, (int) (short) 1);
    }

    @Test
    public void test09604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09604");
        int[] intArray6 = new int[] { (byte) 100, '#', (short) -1, 100, (byte) 1, 1 };
        int[] intArray8 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) ' ', 100);
    }

    @Test
    public void test09605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09605");
        int[] intArray1 = new int[] { 100 };
        int[] intArray8 = new int[] { 0, (short) 10, 0, (short) 1, (byte) -1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) 0, 100);
    }

    @Test
    public void test09606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09606");
        int[] intArray6 = new int[] { (byte) -1, '4', (byte) -1, (-1), ' ', (short) 0 };
        int[] intArray8 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 10, (int) (byte) 1);
    }

    @Test
    public void test09607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09607");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 0, (short) 10, (byte) 0, 10, 'a', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) 1, (int) 'a');
    }

    @Test
    public void test09608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09608");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) -1, (byte) 10, (short) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test09609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09609");
        int[] intArray1 = new int[] { 0 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) -1, (int) (short) -1);
    }

    @Test
    public void test09610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09610");
        int[] intArray4 = new int[] { (byte) 10, (short) 0, 'a', (short) 1 };
        int[] intArray8 = new int[] { 'a', (short) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 10, 0);
    }

    @Test
    public void test09611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09611");
        int[] intArray4 = new int[] { 'a', '4', (byte) -1, (byte) 100 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (byte) 1, 1);
    }

    @Test
    public void test09612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09612");
        int[] intArray6 = new int[] { (short) 10, (-1), 100, (short) 100, 1, (byte) 10 };
        int[] intArray12 = new int[] { (byte) 100, (short) 100, 'a', '#', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 100, 10);
    }

    @Test
    public void test09613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09613");
        int[] intArray3 = new int[] { (byte) 0, 1, '4' };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, 0, (int) (short) 1);
    }

    @Test
    public void test09614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09614");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 0, 100, (byte) 1, (short) 0, (byte) 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) 'a', (int) ' ');
    }

    @Test
    public void test09615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09615");
        int[] intArray6 = new int[] { 0, 'a', 'a', 10, (byte) 10, (short) 1 };
        int[] intArray11 = new int[] { 'a', ' ', (byte) 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (short) -1, 0);
    }

    @Test
    public void test09616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09616");
        int[] intArray3 = new int[] { 0, ' ', '4' };
        int[] intArray7 = new int[] { (byte) 10, 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) 1, (int) (byte) 100);
    }

    @Test
    public void test09617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09617");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, 100, (int) (byte) 0);
    }

    @Test
    public void test09618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09618");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray5 = new int[] { (short) 10, (short) 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (byte) 1, (int) (short) -1);
    }

    @Test
    public void test09619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09619");
        int[] intArray3 = new int[] { 100, 0, 0 };
        int[] intArray9 = new int[] { (byte) 100, '4', (byte) 1, (byte) 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 100, (int) (byte) 1);
    }

    @Test
    public void test09620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09620");
        int[] intArray4 = new int[] { ' ', (short) -1, (byte) 10, '#' };
        int[] intArray9 = new int[] { 1, (short) 100, (byte) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 10, 10);
    }

    @Test
    public void test09621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09621");
        int[] intArray2 = new int[] { ' ', (short) 100 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 0, 1);
    }

    @Test
    public void test09622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09622");
        int[] intArray4 = new int[] { (-1), 10, (-1), '#' };
        int[] intArray10 = new int[] { (short) 1, (byte) 0, 10, (short) 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, 1, (int) '#');
    }

    @Test
    public void test09623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09623");
        int[] intArray2 = new int[] { 10, (-1) };
        int[] intArray7 = new int[] { (short) 1, (-1), '#', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (short) 1, 0);
    }

    @Test
    public void test09624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09624");
        int[] intArray5 = new int[] { (-1), (byte) 10, (short) 10, (short) 10, (byte) 100 };
        int[] intArray10 = new int[] { 100, (byte) 10, 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 10, (int) (byte) 0);
    }

    @Test
    public void test09625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09625");
        int[] intArray6 = new int[] { '4', ' ', (short) -1, (short) 100, 10, '#' };
        int[] intArray11 = new int[] { '#', 100, (byte) 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 10, 10);
    }

    @Test
    public void test09626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09626");
        int[] intArray3 = new int[] { (short) 10, (byte) 1, 10 };
        int[] intArray5 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) '4', (int) (short) -1);
    }

    @Test
    public void test09627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09627");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, 10, 100);
    }

    @Test
    public void test09628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09628");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray5 = new int[] { 10, 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test09629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09629");
        int[] intArray2 = new int[] { (short) -1, '4' };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 1, 100);
    }

    @Test
    public void test09630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09630");
        int[] intArray3 = new int[] { (short) -1, 1, (short) 1 };
        int[] intArray6 = new int[] { 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) '#', 100);
    }

    @Test
    public void test09631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09631");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) 10, 'a', 1, (-1), '4', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) 10, (int) (short) 100);
    }

    @Test
    public void test09632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09632");
        int[] intArray5 = new int[] { (byte) -1, 1, (byte) 100, '4', (short) 10 };
        int[] intArray12 = new int[] { 0, (byte) 100, (byte) -1, 'a', ' ', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, 0, (int) 'a');
    }

    @Test
    public void test09633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09633");
        int[] intArray6 = new int[] { (short) -1, (byte) 0, (short) 0, (byte) -1, '#', 'a' };
        int[] intArray13 = new int[] { (short) -1, (byte) 0, (short) -1, 10, 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) ' ', (int) (short) 100);
    }

    @Test
    public void test09634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09634");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) '#', (int) '#');
    }

    @Test
    public void test09635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09635");
        int[] intArray5 = new int[] { (short) 1, (short) -1, (byte) 0, (short) 0, 100 };
        int[] intArray8 = new int[] { (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) 0, (int) (byte) 1);
    }

    @Test
    public void test09636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09636");
        int[] intArray3 = new int[] { 10, (short) 100, (byte) 100 };
        int[] intArray10 = new int[] { (byte) 1, (byte) 100, (short) 1, (byte) 10, (byte) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 1, 10);
    }

    @Test
    public void test09637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09637");
        int[] intArray2 = new int[] { (short) 1, (short) 10 };
        int[] intArray7 = new int[] { (byte) 1, (byte) 1, (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) -1, (int) (byte) 100);
    }

    @Test
    public void test09638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09638");
        int[] intArray4 = new int[] { (short) 0, '4', (short) 0, 0 };
        int[] intArray8 = new int[] { ' ', 'a', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) 1, (int) '4');
    }

    @Test
    public void test09639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09639");
        int[] intArray4 = new int[] { (short) 1, '4', (byte) 100, (short) 10 };
        int[] intArray6 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 0, (int) (byte) 100);
    }

    @Test
    public void test09640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09640");
        int[] intArray5 = new int[] { (byte) -1, (byte) 0, (byte) 10, 1, ' ' };
        int[] intArray8 = new int[] { (short) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 100, 10);
    }

    @Test
    public void test09641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09641");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) -1, (short) 100, (short) -1, '4', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) 1, (int) ' ');
    }

    @Test
    public void test09642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09642");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (-1), (byte) 10, (-1), 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) 10, (int) '#');
    }

    @Test
    public void test09643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09643");
        int[] intArray2 = new int[] { (byte) -1, (short) 100 };
        int[] intArray4 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (-1), (int) '4');
    }

    @Test
    public void test09644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09644");
        int[] intArray6 = new int[] { ' ', (-1), '4', '#', ' ', '4' };
        int[] intArray8 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (byte) 0, (int) (short) -1);
    }

    @Test
    public void test09645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09645");
        int[] intArray5 = new int[] { (short) 10, (short) 1, '#', '#', 'a' };
        int[] intArray7 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (short) -1, (int) (byte) 0);
    }

    @Test
    public void test09646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09646");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { '#', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) '4', (int) (short) 10);
    }

    @Test
    public void test09647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09647");
        int[] intArray1 = new int[] { 100 };
        int[] intArray6 = new int[] { 0, (byte) 100, (byte) 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) '4', (int) (byte) 100);
    }

    @Test
    public void test09648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09648");
        int[] intArray1 = new int[] { '4' };
        int[] intArray4 = new int[] { (short) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 0, (int) (byte) 100);
    }

    @Test
    public void test09649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09649");
        int[] intArray5 = new int[] { (short) 100, (byte) -1, ' ', ' ', (byte) 100 };
        int[] intArray8 = new int[] { ' ', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) -1, 10);
    }

    @Test
    public void test09650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09650");
        int[] intArray6 = new int[] { 10, (short) 0, 10, (byte) 1, 100, 'a' };
        int[] intArray8 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) 'a', (int) (byte) 1);
    }

    @Test
    public void test09651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09651");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray5 = new int[] { (byte) 1, ' ', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (byte) -1, 100);
    }

    @Test
    public void test09652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09652");
        int[] intArray5 = new int[] { 0, 100, ' ', (short) 0, (byte) 10 };
        int[] intArray11 = new int[] { 100, 10, '4', ' ', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) 0, (-1));
    }

    @Test
    public void test09653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09653");
        int[] intArray5 = new int[] { (short) 0, (short) 100, (short) 1, (-1), 'a' };
        int[] intArray8 = new int[] { 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (-1), (int) (short) -1);
    }

    @Test
    public void test09654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09654");
        int[] intArray4 = new int[] { (byte) 1, (short) -1, (byte) 1, (byte) 10 };
        int[] intArray7 = new int[] { '4', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) 1, 0);
    }

    @Test
    public void test09655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09655");
        int[] intArray4 = new int[] { (short) 1, 1, (byte) 100, (-1) };
        int[] intArray7 = new int[] { 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) -1, 0);
    }

    @Test
    public void test09656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09656");
        int[] intArray3 = new int[] { ' ', (short) 100, ' ' };
        int[] intArray7 = new int[] { (byte) -1, (short) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) '#', (-1));
    }

    @Test
    public void test09657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09657");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 0, (int) (short) 1);
    }

    @Test
    public void test09658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09658");
        int[] intArray4 = new int[] { 100, (short) 0, (short) 100, (short) 1 };
        int[] intArray10 = new int[] { (byte) 1, '#', (short) 100, 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test09659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09659");
        int[] intArray6 = new int[] { (byte) 10, 100, (byte) 0, (short) -1, (short) 1, 0 };
        int[] intArray8 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) 'a', 0);
    }

    @Test
    public void test09660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09660");
        int[] intArray4 = new int[] { (byte) -1, (byte) -1, (short) -1, 100 };
        int[] intArray10 = new int[] { 10, 100, (short) 1, (-1), (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (byte) -1, (int) (byte) -1);
    }

    @Test
    public void test09661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09661");
        int[] intArray3 = new int[] { (byte) 10, 10, (short) -1 };
        int[] intArray8 = new int[] { ' ', (byte) 0, (short) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (-1), (int) (byte) 0);
    }

    @Test
    public void test09662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09662");
        int[] intArray5 = new int[] { (short) 10, (short) 0, (short) 0, (short) 10, (short) 0 };
        int[] intArray9 = new int[] { (short) -1, (short) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 100, (int) (byte) 100);
    }

    @Test
    public void test09663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09663");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray8 = new int[] { (byte) 100, (short) 100, (byte) -1, (byte) 10, (short) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 0, (int) (short) 10);
    }

    @Test
    public void test09664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09664");
        int[] intArray3 = new int[] { 10, 0, (byte) 100 };
        int[] intArray9 = new int[] { (short) 100, (short) 0, (short) 1, '4', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 0, (int) (byte) -1);
    }

    @Test
    public void test09665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09665");
        int[] intArray6 = new int[] { (short) 10, (short) 0, 100, (short) 1, (short) 10, '#' };
        int[] intArray8 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 10, (int) (byte) 10);
    }

    @Test
    public void test09666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09666");
        int[] intArray5 = new int[] { (short) -1, (byte) 100, '#', 100, (byte) 10 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 100, (int) '4');
    }

    @Test
    public void test09667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09667");
        int[] intArray4 = new int[] { 100, (byte) -1, (byte) 10, (-1) };
        int[] intArray7 = new int[] { (-1), (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) '#', (int) (byte) 1);
    }

    @Test
    public void test09668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09668");
        int[] intArray2 = new int[] { (short) -1, '4' };
        int[] intArray8 = new int[] { '4', (byte) 100, (byte) 0, (byte) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (byte) 1, (int) 'a');
    }

    @Test
    public void test09669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09669");
        int[] intArray4 = new int[] { (short) -1, (short) 10, 1, ' ' };
        int[] intArray11 = new int[] { '4', (short) 100, (byte) -1, (short) 1, (byte) 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) '#', (int) '4');
    }

    @Test
    public void test09670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09670");
        int[] intArray4 = new int[] { (byte) 10, 'a', 0, (byte) 1 };
        int[] intArray11 = new int[] { (short) 100, (-1), (short) 1, (byte) 100, (byte) 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) 0, (int) 'a');
    }

    @Test
    public void test09671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09671");
        int[] intArray5 = new int[] { '4', (byte) 0, (short) -1, ' ', 100 };
        int[] intArray9 = new int[] { (short) 0, 'a', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (-1), (int) 'a');
    }

    @Test
    public void test09672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09672");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { '#', 1, (short) 1, 100, (byte) -1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, 100, (int) 'a');
    }

    @Test
    public void test09673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09673");
        int[] intArray4 = new int[] { 1, (short) 1, (short) 100, (byte) 100 };
        int[] intArray9 = new int[] { (byte) 1, (short) 10, (byte) 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (byte) 1, (int) (byte) 1);
    }

    @Test
    public void test09674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09674");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray6 = new int[] { (short) -1, 100, (short) 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (short) -1, 0);
    }

    @Test
    public void test09675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09675");
        int[] intArray4 = new int[] { (short) 1, ' ', (short) -1, (-1) };
        int[] intArray7 = new int[] { 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 100, (int) (byte) 100);
    }

    @Test
    public void test09676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09676");
        int[] intArray5 = new int[] { (short) 0, (short) 0, (byte) 0, (byte) 10, (short) 1 };
        int[] intArray10 = new int[] { 'a', (short) 100, 'a', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (byte) -1, (-1));
    }

    @Test
    public void test09677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09677");
        int[] intArray3 = new int[] { '4', 1, 0 };
        int[] intArray5 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) 10, (int) (short) 1);
    }

    @Test
    public void test09678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09678");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray3 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, 0, (int) (byte) 100);
    }

    @Test
    public void test09679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09679");
        int[] intArray4 = new int[] { 1, 0, (byte) 0, (byte) 10 };
        int[] intArray11 = new int[] { 10, 'a', 0, '#', (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (byte) 1, (int) (byte) 100);
    }

    @Test
    public void test09680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09680");
        int[] intArray6 = new int[] { 'a', (byte) 1, 100, (short) 1, (short) 100, 0 };
        int[] intArray8 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) -1, 10);
    }

    @Test
    public void test09681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09681");
        int[] intArray2 = new int[] { (short) 100, (byte) -1 };
        int[] intArray5 = new int[] { (short) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (byte) 1, (int) (byte) -1);
    }

    @Test
    public void test09682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09682");
        int[] intArray2 = new int[] { 0, (byte) 1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test09683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09683");
        int[] intArray2 = new int[] { (short) 100, (short) -1 };
        int[] intArray7 = new int[] { (byte) 1, (byte) 100, (-1), '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) 'a', (int) 'a');
    }

    @Test
    public void test09684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09684");
        int[] intArray4 = new int[] { 'a', (byte) 1, 100, 1 };
        int[] intArray7 = new int[] { (byte) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) 10, 10);
    }

    @Test
    public void test09685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09685");
        int[] intArray2 = new int[] { 1, (short) 1 };
        int[] intArray5 = new int[] { (-1), (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test09686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09686");
        int[] intArray6 = new int[] { (-1), (short) 1, 'a', (short) 0, 10, (short) 100 };
        int[] intArray12 = new int[] { 1, (byte) 10, 'a', 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 0, (-1));
    }

    @Test
    public void test09687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09687");
        int[] intArray2 = new int[] { 10, 100 };
        int[] intArray9 = new int[] { 100, 1, (short) 100, (byte) 0, '4', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) ' ', 1);
    }

    @Test
    public void test09688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09688");
        int[] intArray1 = new int[] { '#' };
        int[] intArray5 = new int[] { ' ', (short) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) 'a', (int) (short) 100);
    }

    @Test
    public void test09689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09689");
        int[] intArray3 = new int[] { 100, 0, (byte) 0 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (byte) 10, 0);
    }

    @Test
    public void test09690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09690");
        int[] intArray1 = new int[] { 10 };
        int[] intArray5 = new int[] { '4', (short) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (byte) 0, 0);
    }

    @Test
    public void test09691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09691");
        int[] intArray6 = new int[] { (byte) 0, (byte) 1, (byte) 1, 100, (short) 1, (byte) 1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) 'a', 10);
    }

    @Test
    public void test09692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09692");
        int[] intArray4 = new int[] { 'a', (short) -1, (byte) 0, ' ' };
        int[] intArray6 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 0, 0);
    }

    @Test
    public void test09693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09693");
        int[] intArray6 = new int[] { (short) 1, (-1), '#', (-1), (short) 10, (byte) 0 };
        int[] intArray10 = new int[] { 1, 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 0, (int) (byte) 1);
    }

    @Test
    public void test09694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09694");
        int[] intArray2 = new int[] { (short) 10, (short) -1 };
        int[] intArray7 = new int[] { '4', (byte) 100, (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (short) 10, (int) ' ');
    }

    @Test
    public void test09695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09695");
        int[] intArray5 = new int[] { (short) 10, 1, (short) 0, 1, 0 };
        int[] intArray11 = new int[] { 100, '4', (short) 10, 'a', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 100, (int) (byte) 0);
    }

    @Test
    public void test09696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09696");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 10, (byte) 10, 'a', 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) 0, (int) ' ');
    }

    @Test
    public void test09697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09697");
        int[] intArray2 = new int[] { (byte) 100, (short) 100 };
        int[] intArray6 = new int[] { (short) 1, '#', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (short) 0, (-1));
    }

    @Test
    public void test09698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09698");
        int[] intArray6 = new int[] { (byte) -1, 1, (byte) -1, 0, (byte) -1, (short) -1 };
        int[] intArray12 = new int[] { (short) 0, (short) -1, (short) 1, 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) 100, 1);
    }

    @Test
    public void test09699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09699");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 0, ' ', (short) 1, (short) 100, ' ', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) 10, 0);
    }

    @Test
    public void test09700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09700");
        int[] intArray4 = new int[] { (short) -1, '4', 10, 10 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (short) 0, (int) (short) 1);
    }

    @Test
    public void test09701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09701");
        int[] intArray3 = new int[] { (-1), (byte) 100, (byte) -1 };
        int[] intArray8 = new int[] { 0, (byte) -1, ' ', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (byte) 100, 1);
    }

    @Test
    public void test09702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09702");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (byte) 0, (int) (byte) 100);
    }

    @Test
    public void test09703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09703");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { ' ', (byte) 0, (byte) 100, ' ', (byte) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) ' ', 0);
    }

    @Test
    public void test09704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09704");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray8 = new int[] { (short) 0, (short) 10, ' ', 100, (short) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) '#', (int) 'a');
    }

    @Test
    public void test09705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09705");
        int[] intArray6 = new int[] { '4', 'a', (byte) -1, '4', ' ', (short) 10 };
        int[] intArray12 = new int[] { (short) -1, (short) 10, (byte) 0, (byte) 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 100, (int) '4');
    }

    @Test
    public void test09706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09706");
        int[] intArray2 = new int[] { 1, '4' };
        int[] intArray5 = new int[] { (short) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 100, (int) (short) -1);
    }

    @Test
    public void test09707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09707");
        int[] intArray2 = new int[] { 100, '4' };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (byte) 100, (-1));
    }

    @Test
    public void test09708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09708");
        int[] intArray4 = new int[] { (byte) 100, (byte) -1, 0, 100 };
        int[] intArray6 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test09709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09709");
        int[] intArray3 = new int[] { (byte) -1, (byte) 0, (short) 1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (byte) 100, (int) (short) 1);
    }

    @Test
    public void test09710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09710");
        int[] intArray5 = new int[] { (byte) -1, (-1), (-1), '4', (-1) };
        int[] intArray7 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (-1), (-1));
    }

    @Test
    public void test09711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09711");
        int[] intArray6 = new int[] { 100, (byte) 10, 1, 100, 100, (byte) -1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) -1, (int) 'a');
    }

    @Test
    public void test09712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09712");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray5 = new int[] { 100, '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (byte) 1, (int) ' ');
    }

    @Test
    public void test09713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09713");
        int[] intArray4 = new int[] { (short) 10, '4', ' ', 0 };
        int[] intArray6 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (short) 10, 100);
    }

    @Test
    public void test09714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09714");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 1, (byte) 100, (short) -1, (short) 10, 'a', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) 0, (int) (short) 100);
    }

    @Test
    public void test09715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09715");
        int[] intArray3 = new int[] { (byte) -1, 1, (byte) 1 };
        int[] intArray7 = new int[] { (byte) -1, (short) 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 1, (int) (short) 100);
    }

    @Test
    public void test09716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09716");
        int[] intArray6 = new int[] { (short) 1, (short) 10, 1, 10, (short) 10, (short) -1 };
        int[] intArray8 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) -1, (int) (short) 1);
    }

    @Test
    public void test09717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09717");
        int[] intArray3 = new int[] { '#', (byte) 100, 10 };
        int[] intArray7 = new int[] { 0, (byte) 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) 100, (int) (byte) -1);
    }

    @Test
    public void test09718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09718");
        int[] intArray1 = new int[] { 0 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) 10, 100);
    }

    @Test
    public void test09719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09719");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray3 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) '4', (int) (byte) 100);
    }

    @Test
    public void test09720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09720");
        int[] intArray2 = new int[] { ' ', (short) 10 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test09721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09721");
        int[] intArray3 = new int[] { 0, (byte) 0, 10 };
        int[] intArray7 = new int[] { (byte) 100, 'a', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) '#', (int) (byte) 100);
    }

    @Test
    public void test09722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09722");
        int[] intArray4 = new int[] { 'a', (short) 1, (byte) 0, 100 };
        int[] intArray6 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 100, (int) '4');
    }

    @Test
    public void test09723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09723");
        int[] intArray6 = new int[] { (short) 1, '#', ' ', '4', '4', (short) 100 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) 100, (int) 'a');
    }

    @Test
    public void test09724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09724");
        int[] intArray2 = new int[] { (short) -1, (short) 100 };
        int[] intArray4 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (byte) -1, (int) ' ');
    }

    @Test
    public void test09725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09725");
        int[] intArray2 = new int[] { 10, '#' };
        int[] intArray7 = new int[] { (short) -1, (short) -1, (short) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (-1), 1);
    }

    @Test
    public void test09726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09726");
        int[] intArray4 = new int[] { (byte) -1, (byte) -1, 100, ' ' };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, 0, (int) (short) 10);
    }

    @Test
    public void test09727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09727");
        int[] intArray5 = new int[] { (short) 100, (byte) 0, 'a', (short) 1, 100 };
        int[] intArray8 = new int[] { ' ', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 0, (int) (byte) 1);
    }

    @Test
    public void test09728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09728");
        int[] intArray6 = new int[] { '4', (short) 100, 0, (byte) 0, 'a', 100 };
        int[] intArray12 = new int[] { (byte) 1, (short) 100, 10, 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) 100, 0);
    }

    @Test
    public void test09729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09729");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 10, '#', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) 10, (int) '#');
    }

    @Test
    public void test09730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09730");
        int[] intArray2 = new int[] { (byte) 10, '#' };
        int[] intArray8 = new int[] { (short) 1, (-1), (short) 0, (byte) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) 10, (int) (byte) 100);
    }

    @Test
    public void test09731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09731");
        int[] intArray5 = new int[] { (-1), 100, (short) 0, '4', (-1) };
        int[] intArray11 = new int[] { (byte) 1, 'a', (byte) 100, '4', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) 10, (int) (byte) 100);
    }

    @Test
    public void test09732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09732");
        int[] intArray6 = new int[] { (byte) -1, 0, 1, (short) 1, (-1), (short) 1 };
        int[] intArray8 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) '#', (int) ' ');
    }

    @Test
    public void test09733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09733");
        int[] intArray6 = new int[] { (byte) 100, (short) 1, 10, (byte) 1, 100, (short) 1 };
        int[] intArray11 = new int[] { 0, (short) 100, (short) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) '4', (int) (short) 0);
    }

    @Test
    public void test09734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09734");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (-1), (int) (short) 10);
    }

    @Test
    public void test09735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09735");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray8 = new int[] { 10, (-1), (short) 1, ' ', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) 0, (int) (byte) 0);
    }

    @Test
    public void test09736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09736");
        int[] intArray3 = new int[] { 100, (short) 10, (short) 1 };
        int[] intArray6 = new int[] { (byte) 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, 10, 0);
    }

    @Test
    public void test09737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09737");
        int[] intArray5 = new int[] { (short) 100, ' ', (byte) -1, (short) 0, '4' };
        int[] intArray9 = new int[] { 'a', ' ', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) '4', (int) (short) 1);
    }

    @Test
    public void test09738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09738");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (byte) 1, 100);
    }

    @Test
    public void test09739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09739");
        int[] intArray3 = new int[] { (byte) 10, (byte) -1, '#' };
        int[] intArray7 = new int[] { (byte) 100, (short) 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) 0, (-1));
    }

    @Test
    public void test09740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09740");
        int[] intArray6 = new int[] { (short) 0, 'a', 1, (short) 1, (byte) 10, ' ' };
        int[] intArray10 = new int[] { (short) 0, (byte) 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) '4', (int) ' ');
    }

    @Test
    public void test09741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09741");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray4 = new int[] { (short) 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) -1, (int) '#');
    }

    @Test
    public void test09742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09742");
        int[] intArray4 = new int[] { 10, (byte) 10, 0, 100 };
        int[] intArray6 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, 100, 100);
    }

    @Test
    public void test09743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09743");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray4 = new int[] { (byte) 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (short) -1, (int) (byte) 100);
    }

    @Test
    public void test09744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09744");
        int[] intArray1 = new int[] { 0 };
        int[] intArray8 = new int[] { 0, (short) 100, (byte) 100, (byte) 10, (short) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) -1, (int) (byte) 1);
    }

    @Test
    public void test09745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09745");
        int[] intArray5 = new int[] { (byte) 1, (byte) 100, 10, ' ', (short) 100 };
        int[] intArray9 = new int[] { (short) 1, (short) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test09746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09746");
        int[] intArray4 = new int[] { (short) 0, '#', (byte) 1, 'a' };
        int[] intArray9 = new int[] { 10, (byte) 1, (short) 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 0, (int) (byte) 10);
    }

    @Test
    public void test09747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09747");
        int[] intArray2 = new int[] { 10, (byte) -1 };
        int[] intArray7 = new int[] { 1, 'a', 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 0, 0);
    }

    @Test
    public void test09748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09748");
        int[] intArray3 = new int[] { (byte) 100, '#', 1 };
        int[] intArray10 = new int[] { ' ', (short) 10, 0, (short) 0, 'a', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 1, 0);
    }

    @Test
    public void test09749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09749");
        int[] intArray2 = new int[] { 0, (byte) -1 };
        int[] intArray9 = new int[] { ' ', (byte) -1, 0, (short) 0, (short) 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (-1), (int) (short) 1);
    }

    @Test
    public void test09750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09750");
        int[] intArray6 = new int[] { '#', (byte) -1, 'a', (short) 0, 0, (short) -1 };
        int[] intArray8 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (byte) 1, (int) (byte) 10);
    }

    @Test
    public void test09751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09751");
        int[] intArray4 = new int[] { (byte) 100, (short) 1, '#', 'a' };
        int[] intArray11 = new int[] { (-1), (short) 0, (short) 0, (byte) -1, (byte) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, 1, 0);
    }

    @Test
    public void test09752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09752");
        int[] intArray3 = new int[] { (-1), (short) 1, (byte) 1 };
        int[] intArray8 = new int[] { '#', 10, (short) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) '4', 0);
    }

    @Test
    public void test09753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09753");
        int[] intArray4 = new int[] { '4', '#', 'a', 10 };
        int[] intArray6 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test09754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09754");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (short) 1, (int) (byte) 1);
    }

    @Test
    public void test09755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09755");
        int[] intArray4 = new int[] { 100, (byte) 0, 10, '4' };
        int[] intArray9 = new int[] { (-1), (byte) 0, (byte) 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) ' ', (int) (short) 10);
    }

    @Test
    public void test09756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09756");
        int[] intArray6 = new int[] { (short) 1, (byte) -1, '4', (byte) -1, 'a', 'a' };
        int[] intArray11 = new int[] { (short) 100, (byte) 1, ' ', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (byte) 1, 0);
    }

    @Test
    public void test09757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09757");
        int[] intArray4 = new int[] { (short) -1, '4', (short) 100, (byte) 10 };
        int[] intArray9 = new int[] { ' ', 100, (short) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) 0, 0);
    }

    @Test
    public void test09758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09758");
        int[] intArray4 = new int[] { 'a', 100, (short) 100, 10 };
        int[] intArray8 = new int[] { (short) 10, 'a', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) 'a', (int) 'a');
    }

    @Test
    public void test09759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09759");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray6 = new int[] { 1, 0, '#', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (short) 0, (int) (short) 10);
    }

    @Test
    public void test09760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09760");
        int[] intArray5 = new int[] { (short) -1, (byte) 10, (short) 0, '#', (byte) 0 };
        int[] intArray7 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, 100, (int) (short) -1);
    }

    @Test
    public void test09761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09761");
        int[] intArray5 = new int[] { 10, 0, 0, (byte) 0, 10 };
        int[] intArray12 = new int[] { (short) 100, 1, (short) 1, (short) 1, 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, 0, (int) '#');
    }

    @Test
    public void test09762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09762");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 1, 'a', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) -1, (int) (byte) 100);
    }

    @Test
    public void test09763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09763");
        int[] intArray2 = new int[] { 0, (-1) };
        int[] intArray6 = new int[] { '4', (byte) 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) 'a', (int) (byte) 1);
    }

    @Test
    public void test09764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09764");
        int[] intArray2 = new int[] { ' ', (short) 1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) 1, 1);
    }

    @Test
    public void test09765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09765");
        int[] intArray1 = new int[] { 100 };
        int[] intArray8 = new int[] { (short) -1, 'a', (byte) 1, (byte) 10, (short) 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 100, (int) (short) 100);
    }

    @Test
    public void test09766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09766");
        int[] intArray4 = new int[] { 'a', (short) 1, '4', (-1) };
        int[] intArray11 = new int[] { 0, 1, (byte) 0, (short) 0, 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) 'a', (int) (byte) 0);
    }

    @Test
    public void test09767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09767");
        int[] intArray4 = new int[] { (byte) 100, (byte) 0, (short) -1, (-1) };
        int[] intArray8 = new int[] { (short) 1, (short) 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 1, (int) (byte) 10);
    }

    @Test
    public void test09768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09768");
        int[] intArray1 = new int[] { 1 };
        int[] intArray3 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, 100, (int) '#');
    }

    @Test
    public void test09769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09769");
        int[] intArray3 = new int[] { (short) 1, (short) 10, 'a' };
        int[] intArray6 = new int[] { (byte) 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) 0, (int) (byte) -1);
    }

    @Test
    public void test09770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09770");
        int[] intArray2 = new int[] { (short) 10, (short) 1 };
        int[] intArray6 = new int[] { (byte) -1, (byte) 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) ' ', (int) (byte) 10);
    }

    @Test
    public void test09771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09771");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (byte) 10, (byte) 10, (short) 100, (byte) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) ' ', 0);
    }

    @Test
    public void test09772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09772");
        int[] intArray5 = new int[] { 100, (byte) 100, (byte) 100, 10, (-1) };
        int[] intArray9 = new int[] { (byte) 1, (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) 'a', (int) (short) 0);
    }

    @Test
    public void test09773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09773");
        int[] intArray4 = new int[] { (byte) 10, (short) 10, '#', (short) 1 };
        int[] intArray7 = new int[] { '4', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) ' ', (int) 'a');
    }

    @Test
    public void test09774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09774");
        int[] intArray4 = new int[] { (byte) 1, '4', (short) 100, (short) 0 };
        int[] intArray7 = new int[] { (short) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) ' ', (int) ' ');
    }

    @Test
    public void test09775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09775");
        int[] intArray4 = new int[] { (short) 1, 10, (short) 0, (byte) 0 };
        int[] intArray10 = new int[] { 0, 100, (short) -1, '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) '#', (int) '#');
    }

    @Test
    public void test09776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09776");
        int[] intArray5 = new int[] { 10, '4', '#', (byte) 1, '#' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (short) 100, (int) (byte) 10);
    }

    @Test
    public void test09777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09777");
        int[] intArray5 = new int[] { '4', 0, (short) 100, (short) -1, (byte) -1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (short) 0, (int) (short) -1);
    }

    @Test
    public void test09778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09778");
        int[] intArray6 = new int[] { (byte) 100, (short) -1, 100, (short) 100, '4', (byte) 10 };
        int[] intArray11 = new int[] { '4', '4', (short) 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (short) 0, (int) (byte) 1);
    }

    @Test
    public void test09779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09779");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { ' ', (byte) 10, (byte) 100, 'a', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) ' ', (int) (short) 100);
    }

    @Test
    public void test09780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09780");
        int[] intArray6 = new int[] { 'a', 10, (byte) 10, (byte) 1, 10, 1 };
        int[] intArray10 = new int[] { (-1), (-1), (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) '#', (int) (byte) 1);
    }

    @Test
    public void test09781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09781");
        int[] intArray4 = new int[] { (short) 0, (-1), (short) 1, (byte) 0 };
        int[] intArray10 = new int[] { 1, 'a', (short) 1, (byte) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (-1), 0);
    }

    @Test
    public void test09782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09782");
        int[] intArray6 = new int[] { 'a', (short) 10, (short) 1, (byte) -1, (byte) 100, (short) 0 };
        int[] intArray13 = new int[] { 10, (short) 10, (-1), (short) 1, '#', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) '4', 0);
    }

    @Test
    public void test09783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09783");
        int[] intArray4 = new int[] { (byte) 10, (byte) 100, 0, (short) -1 };
        int[] intArray8 = new int[] { (short) 0, (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) -1, 1);
    }

    @Test
    public void test09784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09784");
        int[] intArray2 = new int[] { ' ', (byte) 1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) ' ', (int) ' ');
    }

    @Test
    public void test09785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09785");
        int[] intArray2 = new int[] { '4', 100 };
        int[] intArray7 = new int[] { (-1), (byte) 10, (-1), (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (-1), (-1));
    }

    @Test
    public void test09786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09786");
        int[] intArray4 = new int[] { 1, (byte) 0, 10, (short) 10 };
        int[] intArray10 = new int[] { (byte) 100, 10, (byte) 0, (byte) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, 1, (-1));
    }

    @Test
    public void test09787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09787");
        int[] intArray4 = new int[] { (byte) 1, (-1), 100, (byte) 100 };
        int[] intArray10 = new int[] { ' ', 0, 'a', (byte) -1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (byte) 1, (int) (short) 100);
    }

    @Test
    public void test09788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09788");
        int[] intArray2 = new int[] { (-1), ' ' };
        int[] intArray5 = new int[] { (byte) 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (-1), (int) (byte) 10);
    }

    @Test
    public void test09789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09789");
        int[] intArray2 = new int[] { 10, (short) 0 };
        int[] intArray7 = new int[] { (short) -1, (short) 1, 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 1, 0);
    }

    @Test
    public void test09790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09790");
        int[] intArray4 = new int[] { 100, ' ', (byte) 100, (byte) -1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (-1), (int) (short) 0);
    }

    @Test
    public void test09791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09791");
        int[] intArray1 = new int[] { 1 };
        int[] intArray5 = new int[] { (-1), ' ', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (byte) 10, (int) '#');
    }

    @Test
    public void test09792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09792");
        int[] intArray2 = new int[] { 1, (byte) 1 };
        int[] intArray6 = new int[] { (-1), 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 100, 0);
    }

    @Test
    public void test09793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09793");
        int[] intArray1 = new int[] { 0 };
        int[] intArray8 = new int[] { (-1), 100, 'a', (short) 1, (short) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 0, 0);
    }

    @Test
    public void test09794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09794");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 10, (short) 0, (short) 100, 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) ' ', (int) (byte) 10);
    }

    @Test
    public void test09795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09795");
        int[] intArray2 = new int[] { 10, (short) 10 };
        int[] intArray8 = new int[] { (byte) 1, '#', '#', (byte) 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) ' ', (int) '#');
    }

    @Test
    public void test09796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09796");
        int[] intArray3 = new int[] { 1, (short) -1, (short) 0 };
        int[] intArray8 = new int[] { (byte) -1, (byte) 0, (short) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 1, (int) ' ');
    }

    @Test
    public void test09797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09797");
        int[] intArray5 = new int[] { ' ', (short) 1, 10, (-1), 'a' };
        int[] intArray12 = new int[] { 'a', (byte) 10, '4', '4', (byte) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (byte) -1, (int) (byte) 10);
    }

    @Test
    public void test09798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09798");
        int[] intArray3 = new int[] { (byte) 0, 'a', (short) 10 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (byte) 100, 0);
    }

    @Test
    public void test09799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09799");
        int[] intArray1 = new int[] { 0 };
        int[] intArray7 = new int[] { (byte) 10, (short) 10, 0, (byte) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) 1, 0);
    }

    @Test
    public void test09800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09800");
        int[] intArray3 = new int[] { '4', (short) 100, (byte) 10 };
        int[] intArray8 = new int[] { (short) 100, (short) 100, (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test09801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09801");
        int[] intArray2 = new int[] { 'a', (short) 0 };
        int[] intArray4 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test09802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09802");
        int[] intArray1 = new int[] { 100 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 1, (int) (byte) 10);
    }

    @Test
    public void test09803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09803");
        int[] intArray5 = new int[] { (byte) 1, 'a', 100, (short) -1, '#' };
        int[] intArray11 = new int[] { (byte) 0, (byte) -1, (byte) -1, '4', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) 1, (int) '#');
    }

    @Test
    public void test09804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09804");
        int[] intArray2 = new int[] { (short) 0, (short) -1 };
        int[] intArray7 = new int[] { (-1), '#', 'a', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (short) 10, (int) (short) 10);
    }

    @Test
    public void test09805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09805");
        int[] intArray2 = new int[] { 1, '#' };
        int[] intArray6 = new int[] { (byte) 1, (short) 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 100, (int) (byte) -1);
    }

    @Test
    public void test09806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09806");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 100, 10, 'a', (byte) 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) 100, 100);
    }

    @Test
    public void test09807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09807");
        int[] intArray5 = new int[] { (short) 0, 10, '4', (byte) -1, (byte) 0 };
        int[] intArray10 = new int[] { (byte) 1, (short) 0, (short) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (byte) 10, (int) (short) -1);
    }

    @Test
    public void test09808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09808");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray4 = new int[] { (short) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 1, (int) (byte) 100);
    }

    @Test
    public void test09809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09809");
        int[] intArray2 = new int[] { 10, (byte) 0 };
        int[] intArray8 = new int[] { 1, 100, 100, ' ', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) '4', (int) (short) 100);
    }

    @Test
    public void test09810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09810");
        int[] intArray2 = new int[] { (short) 1, 10 };
        int[] intArray7 = new int[] { (short) 1, 100, '#', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 0, 0);
    }

    @Test
    public void test09811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09811");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { '4', (byte) -1, (byte) 100, (short) 0, (short) 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) -1, 1);
    }

    @Test
    public void test09812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09812");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray8 = new int[] { (byte) 10, (short) -1, 0, 100, 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) 0, (int) (short) 1);
    }

    @Test
    public void test09813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09813");
        int[] intArray6 = new int[] { '#', '4', (short) -1, 'a', (byte) 0, 'a' };
        int[] intArray8 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (byte) 100, (int) (short) 1);
    }

    @Test
    public void test09814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09814");
        int[] intArray2 = new int[] { (short) 10, 1 };
        int[] intArray8 = new int[] { (byte) 1, 100, (byte) 1, (short) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 1, (int) (short) 100);
    }

    @Test
    public void test09815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09815");
        int[] intArray4 = new int[] { 1, (short) 10, (byte) 100, 0 };
        int[] intArray6 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (-1), 100);
    }

    @Test
    public void test09816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09816");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { '#', ' ', 0, (short) 1, (short) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) 100, (-1));
    }

    @Test
    public void test09817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09817");
        int[] intArray4 = new int[] { ' ', 100, (short) 100, 100 };
        int[] intArray10 = new int[] { (byte) 100, (byte) -1, (byte) -1, 'a', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) 'a', (int) (short) 0);
    }

    @Test
    public void test09818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09818");
        int[] intArray6 = new int[] { (short) 1, 0, (short) 1, 0, (short) 0, (short) 100 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, 0, (int) (byte) 1);
    }

    @Test
    public void test09819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09819");
        int[] intArray3 = new int[] { '#', 1, (short) 0 };
        int[] intArray10 = new int[] { (short) 10, 100, (byte) 0, (byte) 1, 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) ' ', (int) (short) 1);
    }

    @Test
    public void test09820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09820");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray6 = new int[] { (-1), (short) 1, (short) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (byte) 10, (int) (short) -1);
    }

    @Test
    public void test09821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09821");
        int[] intArray6 = new int[] { (byte) 0, 100, (short) 100, (short) -1, (byte) 100, (byte) 0 };
        int[] intArray12 = new int[] { (byte) 100, (byte) 10, 'a', 'a', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) '#', (int) (byte) 100);
    }

    @Test
    public void test09822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09822");
        int[] intArray1 = new int[] { '#' };
        int[] intArray7 = new int[] { '#', (-1), 'a', 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) ' ', (int) (byte) -1);
    }

    @Test
    public void test09823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09823");
        int[] intArray1 = new int[] { '#' };
        int[] intArray4 = new int[] { 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) '#', (int) (byte) 0);
    }

    @Test
    public void test09824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09824");
        int[] intArray6 = new int[] { (byte) -1, (short) 1, (byte) 1, (short) 0, (-1), (short) 1 };
        int[] intArray11 = new int[] { 10, 0, '4', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 0, (int) (byte) -1);
    }

    @Test
    public void test09825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09825");
        int[] intArray2 = new int[] { (short) 0, 10 };
        int[] intArray6 = new int[] { (byte) -1, '#', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) ' ', 100);
    }

    @Test
    public void test09826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09826");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) 100, (-1), (byte) 10, '#', (short) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) -1, (int) (byte) 10);
    }

    @Test
    public void test09827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09827");
        int[] intArray5 = new int[] { (short) 0, ' ', 'a', 1, (byte) 1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) 1, 0);
    }

    @Test
    public void test09828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09828");
        int[] intArray4 = new int[] { (byte) 1, '4', (short) 100, (short) 0 };
        int[] intArray9 = new int[] { 'a', (-1), (byte) 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 0, (int) '#');
    }

    @Test
    public void test09829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09829");
        int[] intArray6 = new int[] { 1, (short) 0, '4', '4', 10, (short) 10 };
        int[] intArray11 = new int[] { (byte) 100, 1, (short) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 1, (int) ' ');
    }

    @Test
    public void test09830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09830");
        int[] intArray4 = new int[] { (short) -1, (short) 10, 0, (short) 0 };
        int[] intArray6 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) -1, 0);
    }

    @Test
    public void test09831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09831");
        int[] intArray4 = new int[] { (byte) -1, 0, (byte) -1, (byte) 10 };
        int[] intArray9 = new int[] { (-1), (byte) -1, (short) 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (-1), (int) 'a');
    }

    @Test
    public void test09832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09832");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 1, (byte) 10, 'a', (byte) 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) 100, (int) (short) 100);
    }

    @Test
    public void test09833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09833");
        int[] intArray5 = new int[] { (-1), (byte) 1, (short) 0, (byte) 1, (byte) 100 };
        int[] intArray8 = new int[] { (short) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 0, (int) (byte) -1);
    }

    @Test
    public void test09834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09834");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 100, (byte) 10, (byte) 0, (byte) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) -1, 0);
    }

    @Test
    public void test09835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09835");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray5 = new int[] { 10, 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (-1), (int) (short) 100);
    }

    @Test
    public void test09836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09836");
        int[] intArray1 = new int[] { 1 };
        int[] intArray5 = new int[] { '4', (byte) 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) '4', (int) (byte) 1);
    }

    @Test
    public void test09837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09837");
        int[] intArray6 = new int[] { (byte) 10, (short) 0, (short) -1, (short) 0, 10, (short) 10 };
        int[] intArray11 = new int[] { (short) 100, (byte) 0, '4', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (short) -1, (int) (short) 100);
    }

    @Test
    public void test09838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09838");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray4 = new int[] { (byte) 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) ' ', (int) (short) 0);
    }

    @Test
    public void test09839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09839");
        int[] intArray2 = new int[] { (byte) 1, 1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 100, (int) (short) 10);
    }

    @Test
    public void test09840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09840");
        int[] intArray4 = new int[] { (byte) 10, (short) 100, 0, '#' };
        int[] intArray11 = new int[] { (short) 10, 10, (short) 100, 'a', '#', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, 0, 1);
    }

    @Test
    public void test09841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09841");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 10, (byte) 10, '#', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) 0, (int) '#');
    }

    @Test
    public void test09842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09842");
        int[] intArray3 = new int[] { 10, (byte) 100, '4' };
        int[] intArray5 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) -1, (int) (byte) 100);
    }

    @Test
    public void test09843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09843");
        int[] intArray2 = new int[] { (short) 1, (-1) };
        int[] intArray7 = new int[] { (short) 10, (byte) 1, 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) -1, (int) (short) 100);
    }

    @Test
    public void test09844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09844");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (byte) -1, '#', 'a', ' ', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) '#', (int) 'a');
    }

    @Test
    public void test09845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09845");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 10, (-1));
    }

    @Test
    public void test09846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09846");
        int[] intArray6 = new int[] { (short) 1, ' ', ' ', 10, (byte) 100, (-1) };
        int[] intArray11 = new int[] { (byte) 1, (short) 0, '4', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (byte) 100, 100);
    }

    @Test
    public void test09847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09847");
        int[] intArray3 = new int[] { (byte) -1, (byte) -1, (-1) };
        int[] intArray7 = new int[] { (byte) 10, 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) -1, (int) 'a');
    }

    @Test
    public void test09848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09848");
        int[] intArray5 = new int[] { 100, (byte) 0, 10, (byte) -1, 10 };
        int[] intArray8 = new int[] { (short) 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) -1, (int) '#');
    }

    @Test
    public void test09849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09849");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) 100, (byte) 10, (short) 1, 10, 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, 0, (int) (short) 10);
    }

    @Test
    public void test09850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09850");
        int[] intArray6 = new int[] { (byte) 10, (short) 0, (short) -1, (-1), (byte) -1, (short) 1 };
        int[] intArray12 = new int[] { '#', (byte) 100, (byte) 1, 'a', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (byte) 100, (int) (byte) 10);
    }

    @Test
    public void test09851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09851");
        int[] intArray2 = new int[] { (short) 100, ' ' };
        int[] intArray5 = new int[] { (-1), (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test09852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09852");
        int[] intArray6 = new int[] { 0, (short) -1, 10, 0, (-1), 10 };
        int[] intArray12 = new int[] { (byte) 100, (byte) 10, (short) 0, (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test09853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09853");
        int[] intArray5 = new int[] { 0, (byte) 10, '#', (byte) 0, (byte) 100 };
        int[] intArray11 = new int[] { (short) 10, (byte) 10, (-1), '#', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 1, 0);
    }

    @Test
    public void test09854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09854");
        int[] intArray1 = new int[] { 0 };
        int[] intArray6 = new int[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) 'a', (int) (byte) 100);
    }

    @Test
    public void test09855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09855");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray5 = new int[] { (byte) -1, (byte) 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) '#', 0);
    }

    @Test
    public void test09856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09856");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { '#', (byte) -1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) ' ', (int) (short) -1);
    }

    @Test
    public void test09857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09857");
        int[] intArray1 = new int[] { 0 };
        int[] intArray7 = new int[] { 0, (-1), 100, 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, 1, (int) '#');
    }

    @Test
    public void test09858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09858");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray4 = new int[] { (short) 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (short) 100, 0);
    }

    @Test
    public void test09859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09859");
        int[] intArray6 = new int[] { (byte) -1, '#', (byte) 10, (-1), 1, 1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (-1), 0);
    }

    @Test
    public void test09860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09860");
        int[] intArray5 = new int[] { ' ', (byte) 10, (short) 0, 1, 0 };
        int[] intArray8 = new int[] { '4', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) '4', (int) '4');
    }

    @Test
    public void test09861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09861");
        int[] intArray4 = new int[] { 10, 'a', 1, (short) -1 };
        int[] intArray11 = new int[] { (short) 100, (byte) 1, 0, (-1), 'a', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) 1, 1);
    }

    @Test
    public void test09862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09862");
        int[] intArray2 = new int[] { (short) 100, '4' };
        int[] intArray4 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 1, 100);
    }

    @Test
    public void test09863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09863");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) 1, 100);
    }

    @Test
    public void test09864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09864");
        int[] intArray5 = new int[] { (byte) 1, (short) 100, 10, (byte) 0, (byte) 1 };
        int[] intArray9 = new int[] { '#', (byte) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) 'a', (-1));
    }

    @Test
    public void test09865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09865");
        int[] intArray6 = new int[] { (short) 0, (byte) 100, (short) -1, ' ', 10, '#' };
        int[] intArray13 = new int[] { (-1), (byte) 100, (short) 100, '4', 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) ' ', (int) (byte) 1);
    }

    @Test
    public void test09866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09866");
        int[] intArray6 = new int[] { (byte) 10, ' ', (short) 100, '#', (byte) 0, (short) 100 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) '4', (int) (short) 0);
    }

    @Test
    public void test09867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09867");
        int[] intArray5 = new int[] { (short) 100, (short) 10, (short) -1, (short) 1, ' ' };
        int[] intArray9 = new int[] { (byte) 100, 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 100, (int) (short) 10);
    }

    @Test
    public void test09868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09868");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray7 = new int[] { (byte) 100, 1, (byte) 100, (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) 0, 0);
    }

    @Test
    public void test09869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09869");
        int[] intArray5 = new int[] { (-1), (short) 10, (byte) -1, (byte) 0, (short) 10 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (short) 0, (int) (short) -1);
    }

    @Test
    public void test09870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09870");
        int[] intArray4 = new int[] { (byte) 0, (short) 1, ' ', (byte) 100 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, 1, (-1));
    }

    @Test
    public void test09871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09871");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (byte) 100, (int) (short) 1);
    }

    @Test
    public void test09872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09872");
        int[] intArray5 = new int[] { (byte) 10, (byte) 1, 100, '4', 'a' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) -1, (int) (byte) 10);
    }

    @Test
    public void test09873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09873");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray8 = new int[] { 'a', (short) 100, (-1), (short) 1, 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) 1, (-1));
    }

    @Test
    public void test09874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09874");
        int[] intArray2 = new int[] { (byte) 0, '4' };
        int[] intArray4 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 0, (-1));
    }

    @Test
    public void test09875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09875");
        int[] intArray2 = new int[] { (short) 0, (short) 0 };
        int[] intArray5 = new int[] { 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 0, (int) (byte) -1);
    }

    @Test
    public void test09876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09876");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray8 = new int[] { (byte) 1, (byte) 1, 10, (short) 100, (byte) 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test09877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09877");
        int[] intArray5 = new int[] { (byte) 100, 10, (byte) 10, '4', (byte) 0 };
        int[] intArray11 = new int[] { (short) -1, (short) 100, '#', (byte) 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 10, 1);
    }

    @Test
    public void test09878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09878");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray7 = new int[] { (-1), (short) 1, 10, (short) -1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) -1, 0);
    }

    @Test
    public void test09879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09879");
        int[] intArray4 = new int[] { (short) 10, (-1), 1, (short) -1 };
        int[] intArray11 = new int[] { (byte) 100, 0, '#', 'a', 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) ' ', (int) (short) 100);
    }

    @Test
    public void test09880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09880");
        int[] intArray1 = new int[] { 1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 100, (int) (short) -1);
    }

    @Test
    public void test09881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09881");
        int[] intArray4 = new int[] { '#', (short) 0, (byte) 100, (byte) 10 };
        int[] intArray7 = new int[] { 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 0, (int) (short) 10);
    }

    @Test
    public void test09882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09882");
        int[] intArray2 = new int[] { (byte) 100, (byte) 10 };
        int[] intArray8 = new int[] { 0, 1, (byte) 10, (short) 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 0, (int) (short) 1);
    }

    @Test
    public void test09883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09883");
        int[] intArray5 = new int[] { (short) 10, 10, '#', 'a', (short) 100 };
        int[] intArray8 = new int[] { 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 10, (int) (short) 10);
    }

    @Test
    public void test09884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09884");
        int[] intArray5 = new int[] { (short) 100, 10, (short) 10, 1, (byte) 0 };
        int[] intArray7 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, 100, 0);
    }

    @Test
    public void test09885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09885");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 1, 'a', 100, (short) -1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) 1, (int) (short) 1);
    }

    @Test
    public void test09886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09886");
        int[] intArray3 = new int[] { (byte) 1, (-1), (short) 1 };
        int[] intArray10 = new int[] { (-1), (-1), (byte) -1, (byte) 1, (byte) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 0, (int) '#');
    }

    @Test
    public void test09887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09887");
        int[] intArray2 = new int[] { (byte) 0, 'a' };
        int[] intArray8 = new int[] { (short) -1, (-1), (short) 1, (byte) 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 0, (int) (byte) 100);
    }

    @Test
    public void test09888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09888");
        int[] intArray4 = new int[] { (byte) -1, (byte) 100, (byte) -1, (short) 1 };
        int[] intArray7 = new int[] { (byte) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (-1), (int) (byte) 10);
    }

    @Test
    public void test09889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09889");
        int[] intArray3 = new int[] { (short) 10, (short) 0, (byte) 100 };
        int[] intArray8 = new int[] { (short) -1, (-1), (byte) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (short) -1, 100);
    }

    @Test
    public void test09890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09890");
        int[] intArray1 = new int[] { 0 };
        int[] intArray4 = new int[] { (byte) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) '4', 100);
    }

    @Test
    public void test09891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09891");
        int[] intArray5 = new int[] { 100, (byte) 1, (byte) -1, (-1), 100 };
        int[] intArray10 = new int[] { (short) 10, (short) -1, (short) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) 'a', (int) (byte) 1);
    }

    @Test
    public void test09892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09892");
        int[] intArray1 = new int[] { 0 };
        int[] intArray7 = new int[] { 10, ' ', (byte) -1, 'a', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) 'a', (int) (byte) 100);
    }

    @Test
    public void test09893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09893");
        int[] intArray6 = new int[] { ' ', 'a', '#', 'a', (short) 10, ' ' };
        int[] intArray9 = new int[] { 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (short) -1, (-1));
    }

    @Test
    public void test09894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09894");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray6 = new int[] { (-1), ' ', (byte) 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 0, (int) (byte) 10);
    }

    @Test
    public void test09895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09895");
        int[] intArray2 = new int[] { (-1), (short) 0 };
        int[] intArray7 = new int[] { 0, 1, 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 0, 1);
    }

    @Test
    public void test09896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09896");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) '#', (-1));
    }

    @Test
    public void test09897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09897");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray5 = new int[] { 'a', '#', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (byte) 10, (int) '#');
    }

    @Test
    public void test09898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09898");
        int[] intArray5 = new int[] { (byte) 100, 1, (short) 10, ' ', (-1) };
        int[] intArray10 = new int[] { '#', '4', 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 1, (int) (short) 10);
    }

    @Test
    public void test09899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09899");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray6 = new int[] { 10, 0, (short) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (byte) 0, (int) (byte) -1);
    }

    @Test
    public void test09900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09900");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 10, (short) -1, (byte) -1, 'a', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) 0, 0);
    }

    @Test
    public void test09901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09901");
        int[] intArray2 = new int[] { 'a', '4' };
        int[] intArray6 = new int[] { (byte) 100, (byte) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) 100, (int) (byte) 100);
    }

    @Test
    public void test09902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09902");
        int[] intArray6 = new int[] { (short) 10, 'a', (short) 100, (byte) 100, 0, 0 };
        int[] intArray10 = new int[] { 100, (byte) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 100, (int) 'a');
    }

    @Test
    public void test09903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09903");
        int[] intArray3 = new int[] { (byte) 0, 100, (byte) -1 };
        int[] intArray5 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) 1, 0);
    }

    @Test
    public void test09904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09904");
        int[] intArray1 = new int[] { 100 };
        int[] intArray5 = new int[] { 10, 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) 1, (int) 'a');
    }

    @Test
    public void test09905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09905");
        int[] intArray2 = new int[] { (short) 1, (short) 10 };
        int[] intArray7 = new int[] { (byte) 100, (byte) 0, 'a', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 10, (int) (short) 100);
    }

    @Test
    public void test09906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09906");
        int[] intArray5 = new int[] { (short) 0, (short) -1, (byte) 10, (byte) 10, '#' };
        int[] intArray9 = new int[] { ' ', 'a', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) -1, (int) (short) -1);
    }

    @Test
    public void test09907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09907");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 100, 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) 'a', (int) (byte) 0);
    }

    @Test
    public void test09908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09908");
        int[] intArray2 = new int[] { (short) -1, (byte) 10 };
        int[] intArray5 = new int[] { 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (byte) -1, 10);
    }

    @Test
    public void test09909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09909");
        int[] intArray3 = new int[] { (-1), (short) 10, 1 };
        int[] intArray6 = new int[] { (short) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) ' ', 1);
    }

    @Test
    public void test09910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09910");
        int[] intArray6 = new int[] { (short) 10, (-1), (short) 10, (short) -1, 'a', (short) -1 };
        int[] intArray13 = new int[] { '4', (short) 10, (short) 1, (short) 0, '#', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) '4', (int) '4');
    }

    @Test
    public void test09911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09911");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, 0, 0);
    }

    @Test
    public void test09912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09912");
        int[] intArray4 = new int[] { 0, (short) 10, 'a', (short) 0 };
        int[] intArray10 = new int[] { (byte) 0, (byte) 10, (short) 1, (byte) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, 100, (int) (byte) -1);
    }

    @Test
    public void test09913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09913");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray8 = new int[] { ' ', '4', 'a', (byte) 10, (byte) 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) -1, 0);
    }

    @Test
    public void test09914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09914");
        int[] intArray4 = new int[] { '4', 100, (byte) 0, '#' };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (short) 100, (int) (short) 100);
    }

    @Test
    public void test09915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09915");
        int[] intArray5 = new int[] { (byte) 100, 'a', (short) 100, (byte) 10, 1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 0, (int) (short) 0);
    }

    @Test
    public void test09916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09916");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        int[] intArray7 = new int[] { '#', 'a', (byte) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) -1, (int) (short) 100);
    }

    @Test
    public void test09917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09917");
        int[] intArray6 = new int[] { (byte) 100, (byte) 0, '#', (byte) 10, 10, (short) 100 };
        int[] intArray10 = new int[] { 0, 'a', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 10, (int) '4');
    }

    @Test
    public void test09918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09918");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (short) 0, (int) '#');
    }

    @Test
    public void test09919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09919");
        int[] intArray3 = new int[] { (short) -1, 10, (short) -1 };
        int[] intArray7 = new int[] { 100, (byte) -1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) 0, (int) 'a');
    }

    @Test
    public void test09920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09920");
        int[] intArray2 = new int[] { 1, (-1) };
        int[] intArray9 = new int[] { (byte) -1, (byte) 0, (short) 100, (short) 100, (short) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (short) 0, (int) (byte) 100);
    }

    @Test
    public void test09921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09921");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) 10, (byte) 100, (short) 10, (short) 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test09922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09922");
        int[] intArray5 = new int[] { (byte) -1, 'a', '4', (short) 0, 0 };
        int[] intArray8 = new int[] { (byte) 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) 10, (int) '4');
    }

    @Test
    public void test09923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09923");
        int[] intArray2 = new int[] { (byte) -1, (byte) 100 };
        int[] intArray5 = new int[] { '4', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 100, (int) (byte) 0);
    }

    @Test
    public void test09924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09924");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 1, 100, 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) 100, 0);
    }

    @Test
    public void test09925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09925");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray5 = new int[] { ' ', (byte) 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (-1), (int) (byte) 100);
    }

    @Test
    public void test09926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09926");
        int[] intArray4 = new int[] { 'a', (byte) 0, (byte) 100, 'a' };
        int[] intArray11 = new int[] { (byte) 10, (short) 100, (short) 0, 0, ' ', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) -1, (int) 'a');
    }

    @Test
    public void test09927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09927");
        int[] intArray6 = new int[] { (short) 1, (short) 10, 1, (byte) 0, '#', (byte) 10 };
        int[] intArray9 = new int[] { (byte) 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) '4', 100);
    }

    @Test
    public void test09928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09928");
        int[] intArray4 = new int[] { (short) -1, (short) -1, (-1), (short) 10 };
        int[] intArray9 = new int[] { (byte) 100, (byte) 10, (byte) 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) 10, (int) 'a');
    }

    @Test
    public void test09929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09929");
        int[] intArray3 = new int[] { (short) 0, (short) 100, (short) 0 };
        int[] intArray5 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) '4', 0);
    }

    @Test
    public void test09930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09930");
        int[] intArray6 = new int[] { (byte) 10, (-1), 1, ' ', (short) 0, (byte) 10 };
        int[] intArray10 = new int[] { 10, 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (short) -1, (int) (short) 1);
    }

    @Test
    public void test09931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09931");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { '#', 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, 0, (int) ' ');
    }

    @Test
    public void test09932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09932");
        int[] intArray3 = new int[] { (byte) 10, 100, 'a' };
        int[] intArray6 = new int[] { (byte) 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) 100, (int) (short) -1);
    }

    @Test
    public void test09933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09933");
        int[] intArray6 = new int[] { (short) 0, (byte) 100, '4', (byte) -1, (short) 1, 100 };
        int[] intArray12 = new int[] { 100, 10, 1, (short) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) '4', 100);
    }

    @Test
    public void test09934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09934");
        int[] intArray4 = new int[] { (-1), (byte) 100, '#', (short) -1 };
        int[] intArray6 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (short) -1, (-1));
    }

    @Test
    public void test09935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09935");
        int[] intArray2 = new int[] { (short) 1, 'a' };
        int[] intArray5 = new int[] { (byte) -1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 100, 0);
    }

    @Test
    public void test09936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09936");
        int[] intArray2 = new int[] { (short) -1, 0 };
        int[] intArray7 = new int[] { (short) 0, 100, (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test09937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09937");
        int[] intArray3 = new int[] { 100, (short) -1, 'a' };
        int[] intArray10 = new int[] { 'a', (short) -1, 0, (byte) -1, 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (byte) 1, (int) (short) 1);
    }

    @Test
    public void test09938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09938");
        int[] intArray5 = new int[] { (byte) -1, 10, '4', 0, (short) 10 };
        int[] intArray10 = new int[] { (short) 1, (short) 0, (short) 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 0, (int) '#');
    }

    @Test
    public void test09939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09939");
        int[] intArray3 = new int[] { (-1), (byte) 1, (byte) 1 };
        int[] intArray9 = new int[] { (short) -1, (short) 100, (byte) 10, ' ', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) '#', 0);
    }

    @Test
    public void test09940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09940");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray3 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (-1), (int) (byte) -1);
    }

    @Test
    public void test09941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09941");
        int[] intArray6 = new int[] { (-1), (byte) 100, (short) 0, 0, (short) 100, (short) 0 };
        int[] intArray10 = new int[] { 'a', (-1), ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 1, (int) (short) 10);
    }

    @Test
    public void test09942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09942");
        int[] intArray5 = new int[] { (short) 100, (short) -1, 1, (byte) 0, (short) 0 };
        int[] intArray10 = new int[] { (byte) 0, '4', (byte) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (byte) 100, (int) (short) 0);
    }

    @Test
    public void test09943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09943");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 10, (-1), (byte) 1, (byte) 100, (short) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) 0, 10);
    }

    @Test
    public void test09944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09944");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, (byte) 100, 0, (byte) 1, ' ' };
        int[] intArray10 = new int[] { (byte) 10, (byte) 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 0, 100);
    }

    @Test
    public void test09945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09945");
        int[] intArray5 = new int[] { 100, 0, (-1), (short) 100, '4' };
        int[] intArray9 = new int[] { 10, (short) 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (byte) -1, 1);
    }

    @Test
    public void test09946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09946");
        int[] intArray4 = new int[] { (-1), (short) 0, (short) 0, '#' };
        int[] intArray8 = new int[] { 'a', 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) 10, (int) (short) 100);
    }

    @Test
    public void test09947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09947");
        int[] intArray5 = new int[] { (short) -1, 100, (byte) 1, (short) 10, 'a' };
        int[] intArray9 = new int[] { '4', (byte) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) -1, (int) '4');
    }

    @Test
    public void test09948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09948");
        int[] intArray2 = new int[] { (short) 0, (byte) 100 };
        int[] intArray4 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) ' ', (int) '4');
    }

    @Test
    public void test09949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09949");
        int[] intArray3 = new int[] { (short) 0, 100, 'a' };
        int[] intArray5 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) 1, 10);
    }

    @Test
    public void test09950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09950");
        int[] intArray6 = new int[] { 0, (byte) -1, (short) 0, (short) -1, 'a', ' ' };
        int[] intArray13 = new int[] { 1, 100, '4', (short) -1, 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) 'a', 1);
    }

    @Test
    public void test09951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09951");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 100, (short) 10, (-1), '4', (short) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, 1, (int) '#');
    }

    @Test
    public void test09952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09952");
        int[] intArray5 = new int[] { 1, '4', (short) 10, 1, (short) 0 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) 0, 0);
    }

    @Test
    public void test09953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09953");
        int[] intArray6 = new int[] { '4', 100, (short) -1, 10, (short) 100, (short) -1 };
        int[] intArray13 = new int[] { '#', ' ', '4', (short) -1, 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (byte) -1, (int) 'a');
    }

    @Test
    public void test09954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09954");
        int[] intArray1 = new int[] { 0 };
        int[] intArray8 = new int[] { 10, (short) -1, (-1), 10, ' ', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test09955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09955");
        int[] intArray2 = new int[] { 0, (short) 10 };
        int[] intArray5 = new int[] { (byte) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 100, (int) (short) 10);
    }

    @Test
    public void test09956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09956");
        int[] intArray3 = new int[] { ' ', (short) 100, 100 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) 0, 100);
    }

    @Test
    public void test09957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09957");
        int[] intArray5 = new int[] { 'a', (short) 0, (byte) 100, 10, (-1) };
        int[] intArray10 = new int[] { (short) 10, ' ', '#', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 0, (int) (short) 100);
    }

    @Test
    public void test09958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09958");
        int[] intArray4 = new int[] { 'a', 100, ' ', (-1) };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test09959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09959");
        int[] intArray4 = new int[] { (byte) 100, (short) 100, (byte) -1, 100 };
        int[] intArray9 = new int[] { (byte) 0, '#', 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (byte) 10, 10);
    }

    @Test
    public void test09960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09960");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray7 = new int[] { 0, (byte) 10, 100, (byte) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, 100, 1);
    }

    @Test
    public void test09961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09961");
        int[] intArray2 = new int[] { (byte) 0, (byte) -1 };
        int[] intArray7 = new int[] { (byte) 10, (byte) 1, (byte) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 100, (int) (short) 10);
    }

    @Test
    public void test09962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09962");
        int[] intArray3 = new int[] { 100, '4', 'a' };
        int[] intArray7 = new int[] { '4', (short) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) 10, (int) (short) 0);
    }

    @Test
    public void test09963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09963");
        int[] intArray6 = new int[] { 10, (short) 1, (short) 1, (short) 100, 0, 100 };
        int[] intArray9 = new int[] { (byte) 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) ' ', (int) (short) 100);
    }

    @Test
    public void test09964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09964");
        int[] intArray4 = new int[] { '#', (byte) 1, 0, '4' };
        int[] intArray10 = new int[] { 1, ' ', '#', 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) 0, (int) (short) 1);
    }

    @Test
    public void test09965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09965");
        int[] intArray5 = new int[] { (short) 1, (-1), (short) -1, (byte) 100, (byte) 100 };
        int[] intArray11 = new int[] { (byte) 100, ' ', (short) 0, (byte) 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) 0, (int) (byte) 1);
    }

    @Test
    public void test09966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09966");
        int[] intArray2 = new int[] { (-1), 100 };
        int[] intArray4 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) 'a', 1);
    }

    @Test
    public void test09967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09967");
        int[] intArray4 = new int[] { (byte) 1, (byte) 100, (short) -1, 10 };
        int[] intArray10 = new int[] { (byte) 1, 10, '4', 'a', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (byte) -1, 0);
    }

    @Test
    public void test09968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09968");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray3 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (byte) 10, 100);
    }

    @Test
    public void test09969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09969");
        int[] intArray1 = new int[] { 10 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) 100, (int) '#');
    }

    @Test
    public void test09970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09970");
        int[] intArray2 = new int[] { (short) 1, (byte) 0 };
        int[] intArray7 = new int[] { ' ', (byte) -1, '#', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 1, (int) '#');
    }

    @Test
    public void test09971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09971");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (short) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 1, (int) (short) -1);
    }

    @Test
    public void test09972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09972");
        int[] intArray2 = new int[] { 100, (byte) 100 };
        int[] intArray7 = new int[] { (byte) 10, (short) -1, 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) '#', (int) (byte) 1);
    }

    @Test
    public void test09973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09973");
        int[] intArray3 = new int[] { 100, 100, (byte) 0 };
        int[] intArray10 = new int[] { (byte) 1, (-1), 100, (short) 0, 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (byte) 100, 10);
    }

    @Test
    public void test09974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09974");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray4 = new int[] { '#', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, 0, (int) (short) 100);
    }

    @Test
    public void test09975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09975");
        int[] intArray1 = new int[] { '4' };
        int[] intArray5 = new int[] { (-1), 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) 100, (int) (short) 0);
    }

    @Test
    public void test09976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09976");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) 0, (int) (short) -1);
    }

    @Test
    public void test09977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09977");
        int[] intArray5 = new int[] { (short) 0, (short) 0, '4', (byte) 100, (short) 10 };
        int[] intArray8 = new int[] { (short) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 10, 100);
    }

    @Test
    public void test09978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09978");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray8 = new int[] { (byte) 10, (byte) 0, ' ', (short) -1, (byte) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) 100, (int) '4');
    }

    @Test
    public void test09979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09979");
        int[] intArray4 = new int[] { 0, ' ', (short) 10, (byte) -1 };
        int[] intArray11 = new int[] { (-1), (-1), (byte) 0, '4', (short) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, 0, (int) (byte) 10);
    }

    @Test
    public void test09980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09980");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray7 = new int[] { (byte) 100, 'a', '#', 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) '4', 100);
    }

    @Test
    public void test09981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09981");
        int[] intArray1 = new int[] { 1 };
        int[] intArray3 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test09982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09982");
        int[] intArray4 = new int[] { 0, ' ', 1, (byte) 0 };
        int[] intArray10 = new int[] { (byte) -1, 100, '#', (byte) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, 0, (int) (short) 0);
    }

    @Test
    public void test09983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09983");
        int[] intArray1 = new int[] { '#' };
        int[] intArray6 = new int[] { '4', 'a', 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 100, (int) ' ');
    }

    @Test
    public void test09984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09984");
        int[] intArray2 = new int[] { ' ', '4' };
        int[] intArray7 = new int[] { (byte) 1, (-1), (short) 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 10, (int) (byte) 0);
    }

    @Test
    public void test09985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09985");
        int[] intArray2 = new int[] { (short) 0, ' ' };
        int[] intArray8 = new int[] { (byte) 1, (byte) 0, (byte) 10, '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (byte) 100, (int) (short) 0);
    }

    @Test
    public void test09986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09986");
        int[] intArray2 = new int[] { (byte) 0, 10 };
        int[] intArray5 = new int[] { (byte) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test09987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09987");
        int[] intArray3 = new int[] { '#', 0, 1 };
        int[] intArray7 = new int[] { (byte) 0, (-1), (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) -1, 100);
    }

    @Test
    public void test09988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09988");
        int[] intArray2 = new int[] { (byte) 100, (short) 0 };
        int[] intArray9 = new int[] { (short) 0, 100, (-1), 100, (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (short) 10, (int) 'a');
    }

    @Test
    public void test09989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09989");
        int[] intArray5 = new int[] { 10, 10, 1, (byte) -1, 1 };
        int[] intArray9 = new int[] { 10, '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 1, 100);
    }

    @Test
    public void test09990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09990");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray5 = new int[] { (byte) 100, 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) 'a', (int) 'a');
    }

    @Test
    public void test09991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09991");
        int[] intArray2 = new int[] { (byte) 0, (short) 10 };
        int[] intArray4 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 0, 10);
    }

    @Test
    public void test09992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09992");
        int[] intArray4 = new int[] { '4', (-1), '4', (byte) 10 };
        int[] intArray11 = new int[] { '#', (short) 0, '4', (-1), '4', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test09993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09993");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray7 = new int[] { '#', (short) 10, 'a', (byte) 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) ' ', 0);
    }

    @Test
    public void test09994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09994");
        int[] intArray3 = new int[] { 'a', 10, 10 };
        int[] intArray7 = new int[] { ' ', (short) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) 100, (-1));
    }

    @Test
    public void test09995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09995");
        int[] intArray2 = new int[] { (short) 100, 'a' };
        int[] intArray5 = new int[] { (short) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (-1), (int) (short) 10);
    }

    @Test
    public void test09996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09996");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 1, '#', 100, (byte) 1, 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) '#', (int) (byte) 0);
    }

    @Test
    public void test09997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09997");
        int[] intArray5 = new int[] { 1, 'a', (byte) 10, 10, (short) 0 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 0, 100);
    }

    @Test
    public void test09998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09998");
        int[] intArray3 = new int[] { 0, (byte) 100, (-1) };
        int[] intArray10 = new int[] { (byte) -1, (byte) 1, 100, (byte) 1, (short) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 0, (int) (byte) 0);
    }

    @Test
    public void test09999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test09999");
        int[] intArray5 = new int[] { 1, 100, (byte) 1, (short) -1, 1 };
        int[] intArray8 = new int[] { 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) 1, (int) (short) 10);
    }

    @Test
    public void test10000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest19.test10000");
        int[] intArray1 = new int[] { 1 };
        int[] intArray5 = new int[] { (short) 10, (short) 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) 0, 100);
    }
}

