package KnapsackMemoization;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest23 {

    public static boolean debug = false;

    @Test
    public void test11501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11501");
        int[] intArray3 = new int[] { (byte) 1, (short) -1, '4' };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test11502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11502");
        int[] intArray5 = new int[] { (short) 1, 100, 'a', (short) -1, (byte) 100 };
        int[] intArray11 = new int[] { (short) 0, (byte) 1, (short) 10, '#', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) 0, 0);
    }

    @Test
    public void test11503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11503");
        int[] intArray5 = new int[] { 'a', (short) 1, '#', (-1), 0 };
        int[] intArray12 = new int[] { (short) 1, (byte) 100, (byte) -1, (byte) 1, (short) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, 10, (int) 'a');
    }

    @Test
    public void test11504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11504");
        int[] intArray5 = new int[] { 0, (byte) 0, 1, '4', (byte) -1 };
        int[] intArray8 = new int[] { 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) 1, 1);
    }

    @Test
    public void test11505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11505");
        int[] intArray5 = new int[] { 1, 0, (-1), '#', ' ' };
        int[] intArray10 = new int[] { (short) 100, '4', '4', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) '#', (-1));
    }

    @Test
    public void test11506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11506");
        int[] intArray6 = new int[] { (short) 1, '4', (-1), (byte) 100, (short) 100, (byte) 10 };
        int[] intArray10 = new int[] { 'a', '#', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 10, (int) (short) 10);
    }

    @Test
    public void test11507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11507");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 0, (short) 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test11508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11508");
        int[] intArray3 = new int[] { 100, (byte) 100, (short) 100 };
        int[] intArray6 = new int[] { 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, 10, (int) (short) 10);
    }

    @Test
    public void test11509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11509");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, (short) 100 };
        int[] intArray6 = new int[] { 'a', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, 100, (int) (short) 10);
    }

    @Test
    public void test11510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11510");
        int[] intArray2 = new int[] { ' ', (-1) };
        int[] intArray4 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) 'a', 0);
    }

    @Test
    public void test11511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11511");
        int[] intArray4 = new int[] { (byte) 0, ' ', (byte) 10, (short) 10 };
        int[] intArray9 = new int[] { 'a', 10, (short) 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test11512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11512");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray4 = new int[] { (byte) -1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 0, (int) '#');
    }

    @Test
    public void test11513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11513");
        int[] intArray2 = new int[] { 'a', (short) -1 };
        int[] intArray5 = new int[] { ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test11514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11514");
        int[] intArray2 = new int[] { (short) 100, (short) 0 };
        int[] intArray8 = new int[] { (byte) -1, (byte) -1, 'a', '4', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (byte) -1, (int) (byte) 100);
    }

    @Test
    public void test11515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11515");
        int[] intArray6 = new int[] { '#', 100, 100, 1, 0, 100 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) ' ', 0);
    }

    @Test
    public void test11516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11516");
        int[] intArray4 = new int[] { (short) 1, (byte) -1, 'a', 'a' };
        int[] intArray8 = new int[] { 10, (byte) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) -1, 0);
    }

    @Test
    public void test11517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11517");
        int[] intArray5 = new int[] { (-1), 0, (byte) 10, (byte) 1, (byte) 1 };
        int[] intArray11 = new int[] { 1, (byte) 10, (short) -1, (byte) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) 100, (-1));
    }

    @Test
    public void test11518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11518");
        int[] intArray3 = new int[] { (short) 10, 'a', (short) 1 };
        int[] intArray6 = new int[] { 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (-1), (int) '4');
    }

    @Test
    public void test11519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11519");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 10, (byte) 0, (byte) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) ' ', (int) (short) 100);
    }

    @Test
    public void test11520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11520");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray4 = new int[] { (short) 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, 1, 1);
    }

    @Test
    public void test11521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11521");
        int[] intArray1 = new int[] { '4' };
        int[] intArray4 = new int[] { ' ', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) -1, (int) ' ');
    }

    @Test
    public void test11522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11522");
        int[] intArray1 = new int[] { 100 };
        int[] intArray8 = new int[] { 0, (short) 1, 'a', '4', (short) 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test11523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11523");
        int[] intArray4 = new int[] { 10, '4', '#', 0 };
        int[] intArray8 = new int[] { 100, ' ', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 100, (int) (byte) 1);
    }

    @Test
    public void test11524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11524");
        int[] intArray3 = new int[] { '4', 100, 1 };
        int[] intArray5 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, 100, (int) (short) 100);
    }

    @Test
    public void test11525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11525");
        int[] intArray6 = new int[] { (short) -1, ' ', (byte) 0, (short) 0, '#', (short) 100 };
        int[] intArray11 = new int[] { 100, (short) 100, 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (byte) -1, 1);
    }

    @Test
    public void test11526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11526");
        int[] intArray2 = new int[] { (byte) 10, '4' };
        int[] intArray7 = new int[] { ' ', (byte) 1, (short) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (short) -1, (int) (byte) -1);
    }

    @Test
    public void test11527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11527");
        int[] intArray1 = new int[] { 10 };
        int[] intArray5 = new int[] { (byte) 100, (short) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) 'a', 0);
    }

    @Test
    public void test11528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11528");
        int[] intArray2 = new int[] { (short) 1, (byte) 1 };
        int[] intArray7 = new int[] { (-1), (byte) 1, (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 1, (int) 'a');
    }

    @Test
    public void test11529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11529");
        int[] intArray3 = new int[] { 10, 0, '#' };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, 0, (int) 'a');
    }

    @Test
    public void test11530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11530");
        int[] intArray6 = new int[] { (-1), '4', ' ', 1, (short) 1, (byte) -1 };
        int[] intArray11 = new int[] { 0, (-1), (short) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (short) 0, 0);
    }

    @Test
    public void test11531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11531");
        int[] intArray3 = new int[] { (short) 10, (byte) -1, 'a' };
        int[] intArray8 = new int[] { 0, (byte) 100, 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 0, 10);
    }

    @Test
    public void test11532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11532");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { '#', (short) 1, (-1), '4', (short) 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) 1, (int) '4');
    }

    @Test
    public void test11533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11533");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 100, ' ', (byte) 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (-1), 0);
    }

    @Test
    public void test11534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11534");
        int[] intArray6 = new int[] { ' ', '4', (short) 0, (short) 100, '#', 100 };
        int[] intArray12 = new int[] { '4', (short) 100, (-1), 'a', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test11535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11535");
        int[] intArray6 = new int[] { (short) -1, '#', (byte) 1, (byte) 1, '#', (short) 100 };
        int[] intArray9 = new int[] { 'a', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (-1), 10);
    }

    @Test
    public void test11536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11536");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray5 = new int[] { (byte) -1, 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) 10, (int) (byte) 100);
    }

    @Test
    public void test11537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11537");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 1, (int) (short) 1);
    }

    @Test
    public void test11538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11538");
        int[] intArray6 = new int[] { 0, (byte) 10, (short) 10, 0, (byte) 1, ' ' };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) 'a', (int) (short) 100);
    }

    @Test
    public void test11539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11539");
        int[] intArray6 = new int[] { 100, ' ', (short) 0, (short) 1, (-1), (short) 100 };
        int[] intArray10 = new int[] { 'a', (byte) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) 0, (int) (byte) 0);
    }

    @Test
    public void test11540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11540");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 1, 0);
    }

    @Test
    public void test11541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11541");
        int[] intArray4 = new int[] { (short) 10, 10, 10, (-1) };
        int[] intArray9 = new int[] { (short) 100, 100, 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) 100, (int) (byte) 1);
    }

    @Test
    public void test11542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11542");
        int[] intArray3 = new int[] { 0, '4', (short) 0 };
        int[] intArray6 = new int[] { 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) 0, (-1));
    }

    @Test
    public void test11543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11543");
        int[] intArray4 = new int[] { (byte) 10, 100, (short) 0, '4' };
        int[] intArray8 = new int[] { '4', '4', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test11544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11544");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray3 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) '4', 1);
    }

    @Test
    public void test11545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11545");
        int[] intArray2 = new int[] { ' ', (byte) 10 };
        int[] intArray4 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) '#', 0);
    }

    @Test
    public void test11546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11546");
        int[] intArray2 = new int[] { ' ', (byte) 1 };
        int[] intArray8 = new int[] { (byte) 10, 10, (short) 1, 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) 1, (int) (short) -1);
    }

    @Test
    public void test11547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11547");
        int[] intArray4 = new int[] { ' ', (short) -1, (short) 100, (byte) -1 };
        int[] intArray8 = new int[] { (-1), 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 10, (int) (short) 10);
    }

    @Test
    public void test11548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11548");
        int[] intArray4 = new int[] { (short) 1, (byte) -1, (-1), (byte) 10 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (byte) 0, (int) '4');
    }

    @Test
    public void test11549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11549");
        int[] intArray2 = new int[] { (byte) -1, (byte) -1 };
        int[] intArray4 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (short) 100, (int) (short) 1);
    }

    @Test
    public void test11550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11550");
        int[] intArray4 = new int[] { (byte) -1, (short) 1, 0, (short) -1 };
        int[] intArray8 = new int[] { (byte) 10, 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) -1, 100);
    }

    @Test
    public void test11551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11551");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray6 = new int[] { 10, (short) 10, '4', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (byte) 10, (int) '#');
    }

    @Test
    public void test11552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11552");
        int[] intArray3 = new int[] { (byte) 100, 0, (short) 10 };
        int[] intArray9 = new int[] { 'a', (short) 1, 10, (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (short) -1, (int) '#');
    }

    @Test
    public void test11553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11553");
        int[] intArray5 = new int[] { (byte) 0, (byte) 0, 10, (-1), (short) -1 };
        int[] intArray10 = new int[] { 0, 100, (short) 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 10, (int) (short) -1);
    }

    @Test
    public void test11554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11554");
        int[] intArray3 = new int[] { (byte) -1, (short) 10, (short) 1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) ' ', (int) (byte) -1);
    }

    @Test
    public void test11555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11555");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) -1, 1, 1, (short) -1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) 100, 0);
    }

    @Test
    public void test11556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11556");
        int[] intArray6 = new int[] { (byte) -1, 'a', (byte) 1, (short) -1, (short) 100, (short) 100 };
        int[] intArray8 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 0, (int) (byte) 100);
    }

    @Test
    public void test11557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11557");
        int[] intArray4 = new int[] { (byte) 0, 10, (short) 1, (short) 10 };
        int[] intArray8 = new int[] { '#', (short) 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) '4', (int) (byte) 0);
    }

    @Test
    public void test11558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11558");
        int[] intArray6 = new int[] { (byte) 10, (short) 100, (short) 0, (byte) 0, 10, 0 };
        int[] intArray12 = new int[] { '#', (short) 100, 'a', (-1), '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 1, (int) (byte) 10);
    }

    @Test
    public void test11559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11559");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (short) -1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 100, (int) (byte) 0);
    }

    @Test
    public void test11560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11560");
        int[] intArray2 = new int[] { '#', (byte) 100 };
        int[] intArray8 = new int[] { (short) 1, 100, 0, (short) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 1, 10);
    }

    @Test
    public void test11561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11561");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray8 = new int[] { (byte) 100, (short) 0, 'a', (short) 1, (byte) 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) 'a', (int) (short) 10);
    }

    @Test
    public void test11562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11562");
        int[] intArray5 = new int[] { (byte) -1, (byte) -1, 0, (byte) 1, 1 };
        int[] intArray11 = new int[] { (byte) 100, (byte) 100, 0, ' ', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) 1, (int) '4');
    }

    @Test
    public void test11563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11563");
        int[] intArray6 = new int[] { (byte) 100, (-1), 1, 100, 0, (-1) };
        int[] intArray9 = new int[] { (byte) 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, 0, (int) ' ');
    }

    @Test
    public void test11564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11564");
        int[] intArray4 = new int[] { 1, 10, 0, (short) 0 };
        int[] intArray9 = new int[] { 0, (-1), '4', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) 100, 10);
    }

    @Test
    public void test11565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11565");
        int[] intArray5 = new int[] { 'a', (short) 10, (-1), 0, 1 };
        int[] intArray12 = new int[] { (short) -1, 10, (byte) 10, '4', (short) 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, 0, (-1));
    }

    @Test
    public void test11566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11566");
        int[] intArray3 = new int[] { (short) 10, (short) 100, '#' };
        int[] intArray9 = new int[] { (-1), '4', (short) -1, 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (short) 10, 1);
    }

    @Test
    public void test11567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11567");
        int[] intArray5 = new int[] { (short) 10, (short) 100, 100, (short) 10, '#' };
        int[] intArray7 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (-1), (int) (byte) 10);
    }

    @Test
    public void test11568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11568");
        int[] intArray3 = new int[] { (short) 1, 10, 0 };
        int[] intArray10 = new int[] { (byte) 0, 1, '#', ' ', 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 10, (int) (short) 10);
    }

    @Test
    public void test11569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11569");
        int[] intArray3 = new int[] { (short) 100, (byte) 1, (short) -1 };
        int[] intArray5 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, 10, (-1));
    }

    @Test
    public void test11570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11570");
        int[] intArray2 = new int[] { 100, ' ' };
        int[] intArray4 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) '#', (int) (byte) 100);
    }

    @Test
    public void test11571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11571");
        int[] intArray6 = new int[] { (short) 10, '4', 'a', 10, (byte) 10, (byte) -1 };
        int[] intArray8 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 100, (int) (byte) -1);
    }

    @Test
    public void test11572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11572");
        int[] intArray4 = new int[] { (short) 0, 'a', (short) 100, (byte) 10 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, 1, (int) (short) 1);
    }

    @Test
    public void test11573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11573");
        int[] intArray6 = new int[] { 1, '4', (short) 10, 100, (short) 0, (short) 10 };
        int[] intArray12 = new int[] { 0, 1, 10, (short) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) '#', (int) 'a');
    }

    @Test
    public void test11574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11574");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray5 = new int[] { 1, 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (-1), (int) (byte) 0);
    }

    @Test
    public void test11575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11575");
        int[] intArray2 = new int[] { (byte) 1, 0 };
        int[] intArray6 = new int[] { ' ', (short) 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 0, 1);
    }

    @Test
    public void test11576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11576");
        int[] intArray5 = new int[] { (-1), (byte) 1, (byte) 1, 'a', 0 };
        int[] intArray12 = new int[] { (byte) 0, (byte) 10, (byte) 100, (byte) 0, ' ', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) 100, (-1));
    }

    @Test
    public void test11577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11577");
        int[] intArray4 = new int[] { 1, (short) 1, '4', 'a' };
        int[] intArray9 = new int[] { 'a', 1, (byte) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) ' ', (int) (byte) -1);
    }

    @Test
    public void test11578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11578");
        int[] intArray4 = new int[] { (byte) 10, (short) 1, (byte) 100, (short) 1 };
        int[] intArray8 = new int[] { ' ', (short) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) 'a', (int) '4');
    }

    @Test
    public void test11579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11579");
        int[] intArray3 = new int[] { 100, 0, ' ' };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) '#', (int) (byte) -1);
    }

    @Test
    public void test11580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11580");
        int[] intArray6 = new int[] { '#', ' ', (short) 0, (short) -1, (-1), (byte) 100 };
        int[] intArray11 = new int[] { (short) -1, '4', 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) '4', (int) (byte) 0);
    }

    @Test
    public void test11581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11581");
        int[] intArray2 = new int[] { (short) 0, (byte) 100 };
        int[] intArray5 = new int[] { (byte) 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) -1, (-1));
    }

    @Test
    public void test11582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11582");
        int[] intArray1 = new int[] { 100 };
        int[] intArray6 = new int[] { (short) 1, (-1), '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 100, 1);
    }

    @Test
    public void test11583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11583");
        int[] intArray6 = new int[] { (short) 0, 1, 'a', ' ', 10, 1 };
        int[] intArray12 = new int[] { 10, 'a', (short) -1, '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) 'a', 1);
    }

    @Test
    public void test11584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11584");
        int[] intArray3 = new int[] { 100, ' ', '#' };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) 0, (int) (short) 0);
    }

    @Test
    public void test11585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11585");
        int[] intArray6 = new int[] { 100, (byte) 0, 10, (short) 100, 0, (short) 1 };
        int[] intArray11 = new int[] { (short) 100, (-1), (byte) 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) 'a', (int) (byte) -1);
    }

    @Test
    public void test11586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11586");
        int[] intArray1 = new int[] { 0 };
        int[] intArray7 = new int[] { 0, (short) 0, (byte) 1, (byte) 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, 0, (int) (byte) -1);
    }

    @Test
    public void test11587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11587");
        int[] intArray5 = new int[] { 10, (short) 100, (short) 10, '4', (short) 0 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 1, 10);
    }

    @Test
    public void test11588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11588");
        int[] intArray4 = new int[] { 'a', '#', (short) -1, (-1) };
        int[] intArray6 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) ' ', (int) (byte) 1);
    }

    @Test
    public void test11589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11589");
        int[] intArray1 = new int[] { 100 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) 0, (int) (short) 1);
    }

    @Test
    public void test11590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11590");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (short) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (short) 0, (int) '#');
    }

    @Test
    public void test11591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11591");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 10, (-1));
    }

    @Test
    public void test11592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11592");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 0, 100, (byte) 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 1, (int) 'a');
    }

    @Test
    public void test11593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11593");
        int[] intArray5 = new int[] { ' ', (byte) 0, (short) 10, (-1), (short) 0 };
        int[] intArray7 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) '#', (-1));
    }

    @Test
    public void test11594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11594");
        int[] intArray1 = new int[] { '4' };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) 0, 0);
    }

    @Test
    public void test11595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11595");
        int[] intArray3 = new int[] { (-1), (byte) 1, (byte) 100 };
        int[] intArray5 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) 1, (int) (short) 100);
    }

    @Test
    public void test11596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11596");
        int[] intArray5 = new int[] { '#', (short) 1, (short) 1, '4', (short) -1 };
        int[] intArray8 = new int[] { (byte) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) 0, (int) '#');
    }

    @Test
    public void test11597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11597");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 100, (byte) 0, (byte) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 100, (int) '#');
    }

    @Test
    public void test11598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11598");
        int[] intArray5 = new int[] { ' ', 10, (short) 1, (byte) 1, (short) 1 };
        int[] intArray8 = new int[] { (byte) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 0, (-1));
    }

    @Test
    public void test11599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11599");
        int[] intArray5 = new int[] { ' ', '4', (short) 10, 100, '#' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 0, (int) 'a');
    }

    @Test
    public void test11600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11600");
        int[] intArray4 = new int[] { (byte) -1, 'a', 1, 10 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, 0, (int) (short) 100);
    }

    @Test
    public void test11601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11601");
        int[] intArray6 = new int[] { 'a', (short) 10, (short) -1, 0, ' ', '#' };
        int[] intArray10 = new int[] { 0, (short) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (short) 100, 10);
    }

    @Test
    public void test11602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11602");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray4 = new int[] { (byte) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 100, 0);
    }

    @Test
    public void test11603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11603");
        int[] intArray3 = new int[] { (short) -1, 0, (byte) 1 };
        int[] intArray5 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) 0, (int) (byte) 1);
    }

    @Test
    public void test11604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11604");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray8 = new int[] { (short) 100, 10, (short) 1, '#', '#', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 1, (int) '4');
    }

    @Test
    public void test11605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11605");
        int[] intArray6 = new int[] { (byte) 100, (short) 0, (short) 100, 10, (byte) -1, (short) 100 };
        int[] intArray8 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 0, (int) (byte) -1);
    }

    @Test
    public void test11606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11606");
        int[] intArray4 = new int[] { 100, (byte) 10, '4', (short) 1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (byte) 0, (int) (byte) -1);
    }

    @Test
    public void test11607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11607");
        int[] intArray6 = new int[] { ' ', (short) 10, (byte) 0, 'a', (short) 10, (short) 1 };
        int[] intArray11 = new int[] { (byte) 1, (byte) 1, 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (-1), (int) (byte) -1);
    }

    @Test
    public void test11608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11608");
        int[] intArray2 = new int[] { (byte) 1, 'a' };
        int[] intArray6 = new int[] { (byte) 10, 'a', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) 100, (int) '#');
    }

    @Test
    public void test11609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11609");
        int[] intArray6 = new int[] { (-1), (byte) 100, '#', '4', 'a', (short) 100 };
        int[] intArray11 = new int[] { (short) 1, (short) 100, (byte) 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (byte) 10, (int) ' ');
    }

    @Test
    public void test11610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11610");
        int[] intArray2 = new int[] { (byte) 0, 1 };
        int[] intArray5 = new int[] { 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) '4', (int) (short) -1);
    }

    @Test
    public void test11611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11611");
        int[] intArray4 = new int[] { (byte) -1, (-1), '#', (short) 100 };
        int[] intArray6 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (short) 100, 0);
    }

    @Test
    public void test11612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11612");
        int[] intArray4 = new int[] { 'a', (byte) 10, 10, 10 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (short) -1, (int) (byte) 1);
    }

    @Test
    public void test11613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11613");
        int[] intArray4 = new int[] { ' ', (byte) 0, ' ', (byte) 0 };
        int[] intArray7 = new int[] { '4', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) 'a', (int) (byte) 1);
    }

    @Test
    public void test11614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11614");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 'a', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 0, (int) (short) 10);
    }

    @Test
    public void test11615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11615");
        int[] intArray5 = new int[] { '4', ' ', (byte) 100, (short) 10, '#' };
        int[] intArray11 = new int[] { ' ', ' ', (short) 0, (short) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) '#', (int) (byte) 1);
    }

    @Test
    public void test11616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11616");
        int[] intArray4 = new int[] { (byte) -1, 10, (short) 10, (byte) -1 };
        int[] intArray11 = new int[] { 10, '4', (byte) 100, 10, (byte) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) ' ', (int) (short) 10);
    }

    @Test
    public void test11617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11617");
        int[] intArray3 = new int[] { ' ', 10, (byte) -1 };
        int[] intArray7 = new int[] { (-1), (short) 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 0, (int) 'a');
    }

    @Test
    public void test11618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11618");
        int[] intArray4 = new int[] { (byte) 0, (short) 100, ' ', 100 };
        int[] intArray6 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) 'a', (int) (byte) 0);
    }

    @Test
    public void test11619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11619");
        int[] intArray1 = new int[] { 10 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) 0, (int) 'a');
    }

    @Test
    public void test11620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11620");
        int[] intArray6 = new int[] { 10, '4', (byte) 100, 0, (byte) -1, 10 };
        int[] intArray12 = new int[] { (byte) 0, (short) 0, '#', 'a', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 0, (int) (short) 10);
    }

    @Test
    public void test11621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11621");
        int[] intArray3 = new int[] { (byte) -1, 100, (byte) 10 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) ' ', (int) (byte) 1);
    }

    @Test
    public void test11622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11622");
        int[] intArray2 = new int[] { 0, (byte) 100 };
        int[] intArray7 = new int[] { ' ', (short) 1, (byte) 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 1, 0);
    }

    @Test
    public void test11623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11623");
        int[] intArray6 = new int[] { (short) 100, (byte) 1, '#', (short) 1, 1, (-1) };
        int[] intArray10 = new int[] { (short) 100, (byte) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (short) 10, 0);
    }

    @Test
    public void test11624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11624");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray6 = new int[] { (-1), (byte) -1, (short) -1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (short) 100, (int) (short) 100);
    }

    @Test
    public void test11625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11625");
        int[] intArray5 = new int[] { (-1), (byte) 100, 1, ' ', (short) 100 };
        int[] intArray9 = new int[] { (byte) 1, (short) 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) ' ', (int) (short) 0);
    }

    @Test
    public void test11626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11626");
        int[] intArray5 = new int[] { (short) 10, 0, 1, (byte) 100, (short) 1 };
        int[] intArray10 = new int[] { 1, (short) 10, 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) ' ', 10);
    }

    @Test
    public void test11627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11627");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 100, (byte) 0, (byte) 1, 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) 10, 0);
    }

    @Test
    public void test11628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11628");
        int[] intArray3 = new int[] { (byte) 1, (byte) 1, 100 };
        int[] intArray5 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test11629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11629");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (byte) 0, 1);
    }

    @Test
    public void test11630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11630");
        int[] intArray4 = new int[] { (short) 10, ' ', 1, 'a' };
        int[] intArray7 = new int[] { (byte) -1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) 0, (int) (byte) 100);
    }

    @Test
    public void test11631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11631");
        int[] intArray3 = new int[] { (byte) 0, (short) 10, (byte) 1 };
        int[] intArray10 = new int[] { (byte) 10, (short) 1, (-1), ' ', (short) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 1, (int) (short) 0);
    }

    @Test
    public void test11632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11632");
        int[] intArray3 = new int[] { '4', '#', '#' };
        int[] intArray8 = new int[] { 100, (byte) 0, (short) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test11633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11633");
        int[] intArray4 = new int[] { (short) -1, '#', '#', 10 };
        int[] intArray11 = new int[] { 0, 10, ' ', (short) 100, 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) 100, (int) '#');
    }

    @Test
    public void test11634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11634");
        int[] intArray6 = new int[] { '#', 1, (short) 10, (byte) 1, (byte) 10, 'a' };
        int[] intArray8 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) -1, 100);
    }

    @Test
    public void test11635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11635");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) '4', (int) (short) 10);
    }

    @Test
    public void test11636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11636");
        int[] intArray5 = new int[] { ' ', 10, ' ', (byte) 10, 0 };
        int[] intArray12 = new int[] { (short) 100, (-1), 100, (byte) 100, 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) 'a', 10);
    }

    @Test
    public void test11637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11637");
        int[] intArray4 = new int[] { (short) 100, (short) 10, '4', (short) 10 };
        int[] intArray9 = new int[] { (byte) -1, 100, (short) 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (byte) 10, (int) (short) 1);
    }

    @Test
    public void test11638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11638");
        int[] intArray2 = new int[] { 'a', (short) -1 };
        int[] intArray6 = new int[] { 0, (short) 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) 10, (int) '4');
    }

    @Test
    public void test11639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11639");
        int[] intArray5 = new int[] { '4', (byte) 100, (short) -1, (byte) 10, 10 };
        int[] intArray11 = new int[] { (byte) 0, '4', (short) 100, (short) -1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test11640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11640");
        int[] intArray5 = new int[] { 10, (short) 10, (byte) 10, ' ', (byte) -1 };
        int[] intArray11 = new int[] { 'a', 'a', (short) -1, (short) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (-1), (int) 'a');
    }

    @Test
    public void test11641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11641");
        int[] intArray3 = new int[] { (byte) 0, 100, ' ' };
        int[] intArray9 = new int[] { 100, (short) 100, '4', (short) -1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) ' ', (int) (short) 100);
    }

    @Test
    public void test11642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11642");
        int[] intArray6 = new int[] { (byte) 100, (byte) 10, (short) 100, '#', (short) 0, (-1) };
        int[] intArray12 = new int[] { (byte) 1, (short) 100, (short) 10, (short) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 0, (int) (short) -1);
    }

    @Test
    public void test11643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11643");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (short) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 10, (int) '#');
    }

    @Test
    public void test11644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11644");
        int[] intArray1 = new int[] { '#' };
        int[] intArray6 = new int[] { 0, 1, (short) 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (-1), (int) ' ');
    }

    @Test
    public void test11645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11645");
        int[] intArray5 = new int[] { (short) 0, 10, 'a', (-1), 1 };
        int[] intArray10 = new int[] { (short) 100, (byte) 1, (byte) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (byte) -1, 1);
    }

    @Test
    public void test11646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11646");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray4 = new int[] { (short) 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (short) 1, 100);
    }

    @Test
    public void test11647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11647");
        int[] intArray4 = new int[] { (short) 10, 100, 100, 'a' };
        int[] intArray7 = new int[] { 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) '#', (int) '4');
    }

    @Test
    public void test11648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11648");
        int[] intArray4 = new int[] { (short) 100, 10, '4', (byte) 100 };
        int[] intArray8 = new int[] { (byte) -1, 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 100, (int) (byte) 100);
    }

    @Test
    public void test11649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11649");
        int[] intArray4 = new int[] { (short) -1, 'a', (short) 10, 'a' };
        int[] intArray9 = new int[] { (short) 100, (byte) 1, (short) 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 0, (int) (short) 1);
    }

    @Test
    public void test11650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11650");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray3 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (byte) 0, (int) (byte) -1);
    }

    @Test
    public void test11651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11651");
        int[] intArray4 = new int[] { (-1), 'a', (short) -1, (short) -1 };
        int[] intArray9 = new int[] { (byte) 0, 100, (short) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) 100, (int) 'a');
    }

    @Test
    public void test11652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11652");
        int[] intArray3 = new int[] { (byte) 0, (short) 1, (short) 10 };
        int[] intArray7 = new int[] { ' ', ' ', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 1, (int) '#');
    }

    @Test
    public void test11653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11653");
        int[] intArray6 = new int[] { (byte) 0, 100, (byte) 100, ' ', (-1), (byte) 1 };
        int[] intArray13 = new int[] { (byte) 100, '4', (short) 10, 10, (byte) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (short) 0, (int) (short) -1);
    }

    @Test
    public void test11654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11654");
        int[] intArray3 = new int[] { (byte) 100, (short) -1, (byte) 0 };
        int[] intArray6 = new int[] { 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) -1, (int) (short) -1);
    }

    @Test
    public void test11655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11655");
        int[] intArray5 = new int[] { (byte) 0, (short) 0, (byte) -1, 'a', (byte) 10 };
        int[] intArray9 = new int[] { (short) 1, (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) -1, (int) (short) 10);
    }

    @Test
    public void test11656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11656");
        int[] intArray6 = new int[] { '4', 10, (short) -1, (-1), (short) 100, (short) 10 };
        int[] intArray10 = new int[] { (short) 100, (short) 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 0, 1);
    }

    @Test
    public void test11657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11657");
        int[] intArray2 = new int[] { '4', 'a' };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) ' ', (-1));
    }

    @Test
    public void test11658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11658");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (-1), 0);
    }

    @Test
    public void test11659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11659");
        int[] intArray2 = new int[] { (short) 10, (short) 1 };
        int[] intArray6 = new int[] { 10, 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (short) -1, (-1));
    }

    @Test
    public void test11660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11660");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (-1), 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (byte) 100, (int) (byte) 100);
    }

    @Test
    public void test11661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11661");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray8 = new int[] { '4', (short) -1, (short) 0, 100, (byte) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) '#', (int) (short) 1);
    }

    @Test
    public void test11662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11662");
        int[] intArray5 = new int[] { 100, (byte) 1, 10, 'a', (short) 100 };
        int[] intArray12 = new int[] { 100, (byte) 10, (short) 100, 'a', (short) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (byte) -1, (int) ' ');
    }

    @Test
    public void test11663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11663");
        int[] intArray3 = new int[] { 'a', (short) 100, (-1) };
        int[] intArray8 = new int[] { (short) 1, (short) 0, (-1), (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (short) 0, 10);
    }

    @Test
    public void test11664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11664");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) 100, 10);
    }

    @Test
    public void test11665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11665");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (byte) 100, (int) (short) 1);
    }

    @Test
    public void test11666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11666");
        int[] intArray6 = new int[] { '#', (-1), (short) 100, 0, (short) 1, (byte) 0 };
        int[] intArray12 = new int[] { (byte) 0, '4', (byte) 1, (short) 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test11667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11667");
        int[] intArray3 = new int[] { 10, (byte) 10, 0 };
        int[] intArray10 = new int[] { 10, (short) 0, (byte) 0, '#', (short) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 100, 10);
    }

    @Test
    public void test11668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11668");
        int[] intArray5 = new int[] { 0, (byte) 1, (short) -1, 100, (short) 10 };
        int[] intArray7 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (short) 1, (int) (short) 100);
    }

    @Test
    public void test11669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11669");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray4 = new int[] { 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 100, (-1));
    }

    @Test
    public void test11670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11670");
        int[] intArray5 = new int[] { (short) 1, (short) -1, ' ', '4', (byte) 0 };
        int[] intArray7 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (short) -1, (int) (byte) -1);
    }

    @Test
    public void test11671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11671");
        int[] intArray5 = new int[] { (short) 0, (short) -1, (short) 100, (byte) 0, (short) -1 };
        int[] intArray7 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, 0, (int) 'a');
    }

    @Test
    public void test11672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11672");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray4 = new int[] { (short) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, 10, (int) (short) 10);
    }

    @Test
    public void test11673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11673");
        int[] intArray2 = new int[] { 100, 10 };
        int[] intArray9 = new int[] { ' ', (short) 10, (byte) 10, (short) 0, 'a', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (short) 0, (int) (short) 0);
    }

    @Test
    public void test11674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11674");
        int[] intArray4 = new int[] { (short) 100, (byte) 10, 1, '#' };
        int[] intArray8 = new int[] { (short) 100, 'a', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 1, 0);
    }

    @Test
    public void test11675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11675");
        int[] intArray5 = new int[] { (byte) 1, 'a', 0, (byte) 100, '4' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) 0, (int) (byte) 10);
    }

    @Test
    public void test11676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11676");
        int[] intArray6 = new int[] { (byte) -1, 0, (short) -1, (byte) 100, '#', (byte) 10 };
        int[] intArray10 = new int[] { (short) 0, (-1), '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) ' ', (int) '#');
    }

    @Test
    public void test11677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11677");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray7 = new int[] { (byte) 0, (byte) -1, 1, (short) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) 100, 0);
    }

    @Test
    public void test11678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11678");
        int[] intArray4 = new int[] { 'a', (short) -1, (byte) -1, (byte) -1 };
        int[] intArray10 = new int[] { (short) 0, (byte) 1, 0, 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, 100, (int) '#');
    }

    @Test
    public void test11679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11679");
        int[] intArray5 = new int[] { '#', 'a', (byte) 1, (short) -1, (short) 0 };
        int[] intArray12 = new int[] { '4', (short) 100, (short) 1, (byte) -1, 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) -1, (int) ' ');
    }

    @Test
    public void test11680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11680");
        int[] intArray4 = new int[] { (byte) 1, (byte) 1, '#', 1 };
        int[] intArray6 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, 0, (int) (short) 0);
    }

    @Test
    public void test11681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11681");
        int[] intArray2 = new int[] { (short) -1, (byte) 0 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (byte) 100, (int) (short) 10);
    }

    @Test
    public void test11682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11682");
        int[] intArray6 = new int[] { 0, 10, (short) -1, (byte) 10, ' ', (byte) -1 };
        int[] intArray12 = new int[] { ' ', (short) 0, (short) 100, 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) 100, (int) (byte) 1);
    }

    @Test
    public void test11683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11683");
        int[] intArray2 = new int[] { (short) 100, (short) 1 };
        int[] intArray5 = new int[] { 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 1, (int) (byte) 10);
    }

    @Test
    public void test11684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11684");
        int[] intArray5 = new int[] { 'a', 'a', 'a', (-1), 10 };
        int[] intArray12 = new int[] { (short) 100, (byte) 10, ' ', (-1), (short) -1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (byte) 1, (int) (short) 100);
    }

    @Test
    public void test11685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11685");
        int[] intArray5 = new int[] { '#', (short) 1, (short) 0, (short) -1, (short) 10 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (short) 100, (int) (byte) 100);
    }

    @Test
    public void test11686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11686");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) 0, (short) 10, (short) 0, 100, '#', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) 1, (-1));
    }

    @Test
    public void test11687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11687");
        int[] intArray4 = new int[] { 100, (byte) 10, 100, 'a' };
        int[] intArray8 = new int[] { (byte) 10, '#', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 0, (int) (byte) 10);
    }

    @Test
    public void test11688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11688");
        int[] intArray4 = new int[] { 0, (byte) 10, (short) 0, '#' };
        int[] intArray6 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (short) 100, (int) (byte) 100);
    }

    @Test
    public void test11689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11689");
        int[] intArray5 = new int[] { 1, (short) 1, 'a', 1, (byte) 1 };
        int[] intArray12 = new int[] { ' ', (short) 1, (byte) 100, ' ', (short) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) 1, (int) (short) 0);
    }

    @Test
    public void test11690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11690");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray6 = new int[] { 'a', (byte) -1, (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 10, 1);
    }

    @Test
    public void test11691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11691");
        int[] intArray3 = new int[] { (short) 10, (short) 100, '4' };
        int[] intArray5 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, 10, (int) '4');
    }

    @Test
    public void test11692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11692");
        int[] intArray2 = new int[] { (short) 1, 0 };
        int[] intArray4 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) '#', 0);
    }

    @Test
    public void test11693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11693");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) -1, (short) -1, 100, ' ', (-1), (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) 10, (int) (byte) 0);
    }

    @Test
    public void test11694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11694");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 1, (short) 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) ' ', (int) (byte) 100);
    }

    @Test
    public void test11695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11695");
        int[] intArray5 = new int[] { 10, (short) 100, (byte) 10, (short) -1, 'a' };
        int[] intArray12 = new int[] { (short) 0, (-1), '#', ' ', (byte) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) 1, (int) (short) 10);
    }

    @Test
    public void test11696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11696");
        int[] intArray5 = new int[] { ' ', (byte) 0, '#', (byte) 1, (byte) -1 };
        int[] intArray8 = new int[] { (short) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) -1, (int) (short) 100);
    }

    @Test
    public void test11697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11697");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) -1, (byte) -1, ' ', (short) 100, 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) -1, (int) (byte) 10);
    }

    @Test
    public void test11698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11698");
        int[] intArray6 = new int[] { 10, (short) 1, (short) 100, (short) 0, (byte) 10, '4' };
        int[] intArray11 = new int[] { ' ', (byte) 10, (short) 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) '4', (int) (byte) 100);
    }

    @Test
    public void test11699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11699");
        int[] intArray3 = new int[] { (short) 0, (byte) -1, '4' };
        int[] intArray6 = new int[] { 'a', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) 1, (int) (byte) 1);
    }

    @Test
    public void test11700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11700");
        int[] intArray1 = new int[] { 0 };
        int[] intArray8 = new int[] { 100, '4', (byte) 10, (byte) 0, ' ', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 10, (int) (short) 10);
    }

    @Test
    public void test11701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11701");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (byte) 1, (int) (byte) 1);
    }

    @Test
    public void test11702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11702");
        int[] intArray6 = new int[] { (byte) 0, (short) 0, 'a', 10, 10, (short) 0 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) -1, 1);
    }

    @Test
    public void test11703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11703");
        int[] intArray5 = new int[] { 0, (-1), (byte) 100, (byte) 1, ' ' };
        int[] intArray12 = new int[] { '#', 'a', 100, ' ', (byte) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) 100, (int) (short) 0);
    }

    @Test
    public void test11704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11704");
        int[] intArray6 = new int[] { (byte) 100, (short) 10, (-1), (short) 0, ' ', (short) 100 };
        int[] intArray13 = new int[] { (short) 0, (byte) 10, (short) 0, (short) -1, (short) 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 10, (int) (short) 1);
    }

    @Test
    public void test11705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11705");
        int[] intArray1 = new int[] { 10 };
        int[] intArray3 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test11706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11706");
        int[] intArray3 = new int[] { 100, (short) 1, 'a' };
        int[] intArray6 = new int[] { (short) 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) 'a', (int) (short) 0);
    }

    @Test
    public void test11707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11707");
        int[] intArray6 = new int[] { (short) 10, '4', (short) 1, (short) 0, (short) 1, '4' };
        int[] intArray9 = new int[] { (short) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 1, 10);
    }

    @Test
    public void test11708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11708");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray5 = new int[] { (short) 10, ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (byte) -1, (int) (short) 10);
    }

    @Test
    public void test11709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11709");
        int[] intArray5 = new int[] { (short) 0, '4', (-1), '#', (byte) 1 };
        int[] intArray8 = new int[] { 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 0, 10);
    }

    @Test
    public void test11710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11710");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray6 = new int[] { (byte) 0, (byte) 1, (short) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 0, 1);
    }

    @Test
    public void test11711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11711");
        int[] intArray2 = new int[] { 0, 'a' };
        int[] intArray9 = new int[] { ' ', '4', (-1), 100, 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) ' ', (int) ' ');
    }

    @Test
    public void test11712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11712");
        int[] intArray4 = new int[] { ' ', 'a', 1, (byte) 10 };
        int[] intArray10 = new int[] { 100, '#', 'a', 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (byte) 100, (int) ' ');
    }

    @Test
    public void test11713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11713");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 10, 0, (short) -1, (short) 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, 100, (-1));
    }

    @Test
    public void test11714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11714");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray6 = new int[] { (byte) 1, 1, (short) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (-1), (int) (byte) 0);
    }

    @Test
    public void test11715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11715");
        int[] intArray6 = new int[] { (-1), 1, 100, (byte) 1, 100, (byte) 0 };
        int[] intArray12 = new int[] { 'a', (byte) -1, 0, (byte) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) -1, (int) (short) 0);
    }

    @Test
    public void test11716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11716");
        int[] intArray6 = new int[] { (byte) 0, ' ', 0, (byte) 0, 'a', ' ' };
        int[] intArray12 = new int[] { 1, (short) 10, '4', (byte) 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (byte) -1, 0);
    }

    @Test
    public void test11717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11717");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) 'a', 10);
    }

    @Test
    public void test11718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11718");
        int[] intArray1 = new int[] { '#' };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 0, 1);
    }

    @Test
    public void test11719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11719");
        int[] intArray3 = new int[] { 10, 100, (short) 100 };
        int[] intArray7 = new int[] { 0, 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 0, (int) (byte) 1);
    }

    @Test
    public void test11720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11720");
        int[] intArray6 = new int[] { (byte) 100, 'a', (short) 100, (byte) 10, 100, (short) -1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) 100, (int) (byte) 1);
    }

    @Test
    public void test11721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11721");
        int[] intArray3 = new int[] { (short) 0, '4', (byte) 0 };
        int[] intArray10 = new int[] { (byte) 1, (short) 100, 10, '#', '4', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test11722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11722");
        int[] intArray4 = new int[] { '4', (byte) 10, '4', (byte) -1 };
        int[] intArray8 = new int[] { '#', 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) -1, (int) ' ');
    }

    @Test
    public void test11723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11723");
        int[] intArray6 = new int[] { '#', '4', (short) 100, '#', 'a', (-1) };
        int[] intArray8 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) '4', (int) (byte) 0);
    }

    @Test
    public void test11724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11724");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 1, 10);
    }

    @Test
    public void test11725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11725");
        int[] intArray6 = new int[] { (short) 100, '4', 10, 100, (byte) 1, '#' };
        int[] intArray8 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) '#', (-1));
    }

    @Test
    public void test11726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11726");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { '4', 1, (short) 1, '#', 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) 100, (int) (short) 0);
    }

    @Test
    public void test11727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11727");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray4 = new int[] { 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) '#', 0);
    }

    @Test
    public void test11728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11728");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray8 = new int[] { (short) -1, (short) 0, 'a', (byte) -1, 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) 0, (int) 'a');
    }

    @Test
    public void test11729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11729");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 0, '4', (byte) 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 0, (int) (short) 100);
    }

    @Test
    public void test11730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11730");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 0, (int) (short) 100);
    }

    @Test
    public void test11731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11731");
        int[] intArray5 = new int[] { 1, 10, (byte) 0, 1, (short) 10 };
        int[] intArray7 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (-1), (int) (byte) 1);
    }

    @Test
    public void test11732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11732");
        int[] intArray4 = new int[] { 100, 'a', ' ', '#' };
        int[] intArray7 = new int[] { (byte) 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) 1, (int) 'a');
    }

    @Test
    public void test11733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11733");
        int[] intArray4 = new int[] { (short) 10, 100, '#', (short) 1 };
        int[] intArray6 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) 'a', (int) (byte) 1);
    }

    @Test
    public void test11734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11734");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 1, ' ', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (-1), (int) (byte) -1);
    }

    @Test
    public void test11735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11735");
        int[] intArray3 = new int[] { 10, 10, (byte) 10 };
        int[] intArray5 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) 0, (int) (short) 100);
    }

    @Test
    public void test11736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11736");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (-1), (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) '4', (int) (short) 10);
    }

    @Test
    public void test11737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11737");
        int[] intArray5 = new int[] { 1, (short) 1, 1, (byte) 10, '4' };
        int[] intArray8 = new int[] { (-1), (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) 10, (int) (short) 10);
    }

    @Test
    public void test11738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11738");
        int[] intArray1 = new int[] { 1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) 100, (int) (byte) 0);
    }

    @Test
    public void test11739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11739");
        int[] intArray3 = new int[] { (byte) 10, ' ', '#' };
        int[] intArray8 = new int[] { (short) 100, '#', (byte) 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (byte) -1, 100);
    }

    @Test
    public void test11740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11740");
        int[] intArray6 = new int[] { (short) 0, 'a', 1, (byte) 1, (byte) 100, ' ' };
        int[] intArray8 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 100, (int) (byte) 1);
    }

    @Test
    public void test11741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11741");
        int[] intArray4 = new int[] { (short) -1, (short) 10, (short) 100, (-1) };
        int[] intArray6 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, 1, (int) (short) 10);
    }

    @Test
    public void test11742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11742");
        int[] intArray6 = new int[] { (short) 1, (byte) 1, 'a', 'a', '4', 1 };
        int[] intArray10 = new int[] { (byte) 1, '#', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 0, 0);
    }

    @Test
    public void test11743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11743");
        int[] intArray6 = new int[] { (byte) 1, (byte) -1, '#', 10, (short) -1, (-1) };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) 10, 100);
    }

    @Test
    public void test11744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11744");
        int[] intArray5 = new int[] { (-1), (short) 0, (short) 10, 'a', (-1) };
        int[] intArray7 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (short) 0, (int) (short) 0);
    }

    @Test
    public void test11745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11745");
        int[] intArray2 = new int[] { 100, (short) 100 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 10, (int) (short) 1);
    }

    @Test
    public void test11746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11746");
        int[] intArray2 = new int[] { (byte) 10, (byte) 0 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) 0, (int) (byte) 100);
    }

    @Test
    public void test11747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11747");
        int[] intArray4 = new int[] { (short) 1, ' ', (short) 100, (short) 1 };
        int[] intArray10 = new int[] { '#', 100, 'a', ' ', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, 10, (-1));
    }

    @Test
    public void test11748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11748");
        int[] intArray3 = new int[] { 'a', (short) -1, 100 };
        int[] intArray7 = new int[] { ' ', (short) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) -1, (int) ' ');
    }

    @Test
    public void test11749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11749");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test11750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11750");
        int[] intArray5 = new int[] { '4', 'a', 10, (short) 0, (byte) 10 };
        int[] intArray7 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, 0, (int) (short) 0);
    }

    @Test
    public void test11751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11751");
        int[] intArray3 = new int[] { '4', 10, (byte) 100 };
        int[] intArray9 = new int[] { (short) 100, ' ', (byte) 0, (byte) 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 10, (int) (byte) 100);
    }

    @Test
    public void test11752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11752");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 'a' };
        int[] intArray8 = new int[] { 10, 0, (short) 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (byte) 0, (int) (short) -1);
    }

    @Test
    public void test11753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11753");
        int[] intArray4 = new int[] { 100, 'a', (short) -1, 'a' };
        int[] intArray8 = new int[] { 'a', 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) -1, 0);
    }

    @Test
    public void test11754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11754");
        int[] intArray4 = new int[] { 'a', (short) -1, (byte) 10, 10 };
        int[] intArray8 = new int[] { 100, 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) 100, (int) ' ');
    }

    @Test
    public void test11755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11755");
        int[] intArray6 = new int[] { 0, 10, '4', (short) 1, (-1), (-1) };
        int[] intArray13 = new int[] { 10, 10, '4', (byte) 0, 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (byte) 1, (int) (short) 10);
    }

    @Test
    public void test11756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11756");
        int[] intArray4 = new int[] { (-1), '#', (short) 100, 1 };
        int[] intArray9 = new int[] { (byte) 1, (short) 10, 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) '#', 100);
    }

    @Test
    public void test11757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11757");
        int[] intArray6 = new int[] { '#', (byte) 0, ' ', 0, (byte) 10, 1 };
        int[] intArray10 = new int[] { (short) 1, (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 0, (int) (byte) 1);
    }

    @Test
    public void test11758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11758");
        int[] intArray4 = new int[] { (short) 0, 1, (byte) 100, 1 };
        int[] intArray9 = new int[] { ' ', (-1), 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 0, (int) (short) 10);
    }

    @Test
    public void test11759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11759");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (short) -1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (short) 10, (int) (byte) 1);
    }

    @Test
    public void test11760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11760");
        int[] intArray6 = new int[] { (byte) -1, (short) 100, (byte) 10, 1, (byte) 10, '#' };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) 1, 1);
    }

    @Test
    public void test11761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11761");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 1, (short) 10, 'a', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) '#', 0);
    }

    @Test
    public void test11762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11762");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (-1), (-1), (byte) 0, ' ', '4', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) -1, (int) (byte) 100);
    }

    @Test
    public void test11763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11763");
        int[] intArray4 = new int[] { (byte) 0, (short) 0, (short) 10, '4' };
        int[] intArray9 = new int[] { (byte) 10, (byte) 100, 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) '#', (int) '4');
    }

    @Test
    public void test11764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11764");
        int[] intArray2 = new int[] { '4', 0 };
        int[] intArray9 = new int[] { (short) 1, 0, (-1), (byte) -1, ' ', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 0, (int) (byte) -1);
    }

    @Test
    public void test11765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11765");
        int[] intArray4 = new int[] { (byte) 1, 'a', (short) 1, 'a' };
        int[] intArray10 = new int[] { (short) 10, (byte) 1, (short) 10, ' ', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test11766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11766");
        int[] intArray2 = new int[] { (byte) 0, 100 };
        int[] intArray8 = new int[] { '#', (short) 10, (short) 0, (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (byte) 0, (int) ' ');
    }

    @Test
    public void test11767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11767");
        int[] intArray3 = new int[] { (byte) 1, '4', 0 };
        int[] intArray5 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (-1), (int) (short) -1);
    }

    @Test
    public void test11768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11768");
        int[] intArray6 = new int[] { 'a', ' ', (byte) 1, 100, '#', (short) -1 };
        int[] intArray12 = new int[] { 1, 10, (short) 0, (byte) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 0, (int) '#');
    }

    @Test
    public void test11769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11769");
        int[] intArray2 = new int[] { 0, (short) 1 };
        int[] intArray9 = new int[] { 'a', (-1), '4', '#', (short) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 1, (int) (short) 0);
    }

    @Test
    public void test11770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11770");
        int[] intArray5 = new int[] { '#', 100, 0, '4', (short) 100 };
        int[] intArray10 = new int[] { 0, (-1), (byte) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 0, 0);
    }

    @Test
    public void test11771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11771");
        int[] intArray2 = new int[] { (byte) -1, (short) 100 };
        int[] intArray7 = new int[] { 100, (short) 0, 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 100, (int) (short) 10);
    }

    @Test
    public void test11772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11772");
        int[] intArray4 = new int[] { (byte) 100, (-1), '#', ' ' };
        int[] intArray6 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) '4', (int) (byte) 100);
    }

    @Test
    public void test11773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11773");
        int[] intArray3 = new int[] { 100, (byte) 0, ' ' };
        int[] intArray5 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test11774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11774");
        int[] intArray4 = new int[] { (byte) -1, (byte) 10, (byte) 100, (byte) 0 };
        int[] intArray6 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 100, (int) '4');
    }

    @Test
    public void test11775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11775");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray4 = new int[] { (short) 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) '#', (int) (short) 10);
    }

    @Test
    public void test11776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11776");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (byte) 10, (byte) -1, (short) 10, 'a', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, 1, (-1));
    }

    @Test
    public void test11777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11777");
        int[] intArray2 = new int[] { (short) -1, 0 };
        int[] intArray6 = new int[] { (short) 0, (short) 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) 0, (int) ' ');
    }

    @Test
    public void test11778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11778");
        int[] intArray6 = new int[] { 100, (short) 100, (byte) 100, 0, (byte) 10, (short) 100 };
        int[] intArray8 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 0, (int) (short) -1);
    }

    @Test
    public void test11779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11779");
        int[] intArray4 = new int[] { (byte) 0, (short) 1, (short) 1, (short) 0 };
        int[] intArray11 = new int[] { (byte) 0, (short) 0, (byte) 1, (byte) -1, (byte) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (byte) 100, 10);
    }

    @Test
    public void test11780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11780");
        int[] intArray2 = new int[] { 0, (byte) 1 };
        int[] intArray7 = new int[] { '#', (byte) 100, 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) 'a', (int) (short) 10);
    }

    @Test
    public void test11781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11781");
        int[] intArray2 = new int[] { ' ', (byte) 1 };
        int[] intArray7 = new int[] { (short) 1, 'a', (byte) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 0, (int) '4');
    }

    @Test
    public void test11782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11782");
        int[] intArray4 = new int[] { (short) 100, (byte) 1, 'a', 100 };
        int[] intArray7 = new int[] { 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 0, (int) (byte) 0);
    }

    @Test
    public void test11783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11783");
        int[] intArray3 = new int[] { (byte) 100, ' ', '#' };
        int[] intArray9 = new int[] { (-1), (short) 100, 'a', (-1), (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) '4', (int) (short) -1);
    }

    @Test
    public void test11784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11784");
        int[] intArray6 = new int[] { (byte) -1, (short) 100, (short) 100, '4', '#', (-1) };
        int[] intArray9 = new int[] { (short) 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) ' ', 1);
    }

    @Test
    public void test11785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11785");
        int[] intArray2 = new int[] { 0, (byte) 100 };
        int[] intArray6 = new int[] { (byte) 10, (byte) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) '4', (int) (short) 10);
    }

    @Test
    public void test11786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11786");
        int[] intArray5 = new int[] { 100, (short) -1, (short) 100, (short) 10, (short) 10 };
        int[] intArray11 = new int[] { (byte) 10, (byte) 1, (short) 0, 'a', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 0, (int) (short) 100);
    }

    @Test
    public void test11787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11787");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { ' ', 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, 0, 1);
    }

    @Test
    public void test11788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11788");
        int[] intArray6 = new int[] { (byte) 10, 100, 100, 1, '4', 10 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, 10, (int) 'a');
    }

    @Test
    public void test11789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11789");
        int[] intArray4 = new int[] { 10, (short) 10, (byte) 10, (short) 1 };
        int[] intArray11 = new int[] { (short) -1, ' ', 0, (byte) 100, 'a', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) 100, 0);
    }

    @Test
    public void test11790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11790");
        int[] intArray4 = new int[] { '4', 100, 0, (-1) };
        int[] intArray6 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (-1), (int) (byte) 0);
    }

    @Test
    public void test11791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11791");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 10, ' ', (byte) 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 1, 0);
    }

    @Test
    public void test11792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11792");
        int[] intArray3 = new int[] { 1, 0, '4' };
        int[] intArray7 = new int[] { (byte) 1, 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 100, (int) (short) 100);
    }

    @Test
    public void test11793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11793");
        int[] intArray6 = new int[] { ' ', (short) 100, 10, ' ', (byte) 0, '#' };
        int[] intArray13 = new int[] { (byte) 10, (byte) 1, (short) 100, ' ', (short) 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (short) 100, (int) ' ');
    }

    @Test
    public void test11794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11794");
        int[] intArray2 = new int[] { (short) 1, (short) 0 };
        int[] intArray4 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (short) 10, 10);
    }

    @Test
    public void test11795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11795");
        int[] intArray3 = new int[] { (short) 1, (short) 10, 1 };
        int[] intArray9 = new int[] { (short) 1, (-1), (short) -1, (byte) 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 0, (int) (byte) 100);
    }

    @Test
    public void test11796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11796");
        int[] intArray5 = new int[] { '#', (short) 100, 'a', (short) 10, (short) -1 };
        int[] intArray7 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) 0, 10);
    }

    @Test
    public void test11797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11797");
        int[] intArray3 = new int[] { (-1), (short) 1, (byte) 10 };
        int[] intArray10 = new int[] { (short) 100, (short) -1, '4', 100, 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 1, (int) '4');
    }

    @Test
    public void test11798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11798");
        int[] intArray2 = new int[] { 'a', (-1) };
        int[] intArray9 = new int[] { (byte) 1, (short) 0, (byte) 100, 0, 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (byte) 0, (int) (short) -1);
    }

    @Test
    public void test11799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11799");
        int[] intArray3 = new int[] { 100, ' ', ' ' };
        int[] intArray10 = new int[] { 0, (short) 100, (byte) 100, (short) 1, (short) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test11800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11800");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 1, (int) '4');
    }

    @Test
    public void test11801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11801");
        int[] intArray6 = new int[] { '4', (short) 0, 'a', (byte) -1, '#', (byte) 10 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) -1, 0);
    }

    @Test
    public void test11802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11802");
        int[] intArray3 = new int[] { (short) 100, 10, (-1) };
        int[] intArray9 = new int[] { 0, (byte) 100, (short) 100, (short) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (short) 100, 1);
    }

    @Test
    public void test11803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11803");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 0, (-1), 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) 10, 10);
    }

    @Test
    public void test11804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11804");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray8 = new int[] { (short) -1, (short) 0, (byte) -1, (short) 1, 'a', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) '#', 100);
    }

    @Test
    public void test11805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11805");
        int[] intArray5 = new int[] { '#', (short) 10, (byte) 100, 100, (byte) -1 };
        int[] intArray12 = new int[] { ' ', (short) 1, 10, 'a', '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, 10, (int) (short) 1);
    }

    @Test
    public void test11806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11806");
        int[] intArray4 = new int[] { 'a', 0, (byte) -1, (short) 0 };
        int[] intArray8 = new int[] { '#', (byte) 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) 1, (int) (byte) 1);
    }

    @Test
    public void test11807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11807");
        int[] intArray5 = new int[] { (byte) 10, 100, 100, (short) 100, 100 };
        int[] intArray9 = new int[] { (short) -1, (-1), '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (byte) 0, (int) (byte) 100);
    }

    @Test
    public void test11808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11808");
        int[] intArray4 = new int[] { (byte) 0, (short) 100, (short) -1, (short) 0 };
        int[] intArray6 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 100, (int) (byte) 100);
    }

    @Test
    public void test11809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11809");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray8 = new int[] { (short) 1, '4', (byte) 1, (-1), 'a', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) 0, (int) 'a');
    }

    @Test
    public void test11810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11810");
        int[] intArray4 = new int[] { 0, (byte) 100, ' ', (byte) -1 };
        int[] intArray6 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (short) 100, (int) ' ');
    }

    @Test
    public void test11811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11811");
        int[] intArray4 = new int[] { ' ', 10, (byte) -1, (short) -1 };
        int[] intArray9 = new int[] { (short) 1, (byte) 10, (byte) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 0, (int) ' ');
    }

    @Test
    public void test11812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11812");
        int[] intArray5 = new int[] { 1, 10, 100, '4', '#' };
        int[] intArray12 = new int[] { '#', '#', (byte) 1, 1, 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) ' ', (int) (short) 0);
    }

    @Test
    public void test11813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11813");
        int[] intArray2 = new int[] { (short) -1, (byte) 100 };
        int[] intArray7 = new int[] { (short) 0, 1, (short) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 0, (int) ' ');
    }

    @Test
    public void test11814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11814");
        int[] intArray5 = new int[] { '4', (byte) 100, (short) 0, (short) 100, '4' };
        int[] intArray10 = new int[] { 0, (short) 100, (byte) -1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 0, (int) (byte) 10);
    }

    @Test
    public void test11815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11815");
        int[] intArray3 = new int[] { 'a', ' ', (byte) -1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) 'a', (int) (short) 1);
    }

    @Test
    public void test11816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11816");
        int[] intArray2 = new int[] { (byte) 10, ' ' };
        int[] intArray6 = new int[] { 'a', (byte) 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 0, (int) (short) 10);
    }

    @Test
    public void test11817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11817");
        int[] intArray5 = new int[] { (short) 0, '4', (short) 100, 1, (-1) };
        int[] intArray9 = new int[] { 10, ' ', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) ' ', (int) (byte) -1);
    }

    @Test
    public void test11818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11818");
        int[] intArray3 = new int[] { (short) -1, (byte) 0, (byte) 10 };
        int[] intArray6 = new int[] { '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) -1, 100);
    }

    @Test
    public void test11819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11819");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 1, (short) -1, (byte) 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) -1, (int) (byte) -1);
    }

    @Test
    public void test11820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11820");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) '#', 1);
    }

    @Test
    public void test11821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11821");
        int[] intArray4 = new int[] { (short) 0, 100, 0, 10 };
        int[] intArray9 = new int[] { (short) 0, (short) 100, (byte) 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 1, 0);
    }

    @Test
    public void test11822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11822");
        int[] intArray2 = new int[] { (short) 100, 1 };
        int[] intArray8 = new int[] { (short) 1, 1, (short) 10, '#', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) 'a', 0);
    }

    @Test
    public void test11823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11823");
        int[] intArray5 = new int[] { ' ', (byte) 10, (byte) -1, 10, 1 };
        int[] intArray8 = new int[] { 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) -1, (int) (short) 100);
    }

    @Test
    public void test11824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11824");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 10, (int) 'a');
    }

    @Test
    public void test11825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11825");
        int[] intArray1 = new int[] { 10 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) 100, (int) (short) 100);
    }

    @Test
    public void test11826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11826");
        int[] intArray5 = new int[] { (short) 0, (byte) -1, (-1), 0, 10 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) 'a', (-1));
    }

    @Test
    public void test11827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11827");
        int[] intArray6 = new int[] { (short) 1, (-1), (short) 100, 'a', 1, (short) 0 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) 'a', (int) '#');
    }

    @Test
    public void test11828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11828");
        int[] intArray6 = new int[] { 0, '#', 100, 10, ' ', '#' };
        int[] intArray11 = new int[] { (short) 100, (short) 100, (-1), '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 0, (int) ' ');
    }

    @Test
    public void test11829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11829");
        int[] intArray5 = new int[] { (short) 10, 1, (short) -1, (short) 10, (byte) -1 };
        int[] intArray12 = new int[] { (short) 100, (short) 10, (short) 100, (byte) 10, (short) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) 1, (-1));
    }

    @Test
    public void test11830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11830");
        int[] intArray4 = new int[] { (short) 0, (short) 0, 0, 100 };
        int[] intArray7 = new int[] { 'a', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 0, (int) (byte) -1);
    }

    @Test
    public void test11831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11831");
        int[] intArray2 = new int[] { (byte) 0, ' ' };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test11832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11832");
        int[] intArray2 = new int[] { ' ', (byte) -1 };
        int[] intArray7 = new int[] { (short) 1, (-1), (byte) 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) ' ', 0);
    }

    @Test
    public void test11833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11833");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray8 = new int[] { (short) 1, (short) 100, 0, (byte) 0, (short) -1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 0, (int) (short) 10);
    }

    @Test
    public void test11834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11834");
        int[] intArray2 = new int[] { '4', (byte) -1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (-1), (int) '4');
    }

    @Test
    public void test11835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11835");
        int[] intArray5 = new int[] { (short) 100, (short) 1, (byte) -1, (short) 10, (byte) 1 };
        int[] intArray11 = new int[] { 100, 'a', '4', 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 0, (int) (short) 10);
    }

    @Test
    public void test11836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11836");
        int[] intArray5 = new int[] { (short) 0, (short) 100, (byte) 100, (-1), (short) 10 };
        int[] intArray9 = new int[] { 'a', 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 1, (int) '#');
    }

    @Test
    public void test11837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11837");
        int[] intArray4 = new int[] { (short) 1, (short) 0, (byte) 100, (byte) 1 };
        int[] intArray6 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 100, (int) '4');
    }

    @Test
    public void test11838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11838");
        int[] intArray2 = new int[] { 100, 'a' };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) 'a', 100);
    }

    @Test
    public void test11839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11839");
        int[] intArray5 = new int[] { 0, (short) 0, '#', (short) 100, (-1) };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (-1), (-1));
    }

    @Test
    public void test11840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11840");
        int[] intArray1 = new int[] { 0 };
        int[] intArray6 = new int[] { (short) -1, (short) 10, (short) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (short) 1, (int) 'a');
    }

    @Test
    public void test11841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11841");
        int[] intArray2 = new int[] { (short) 1, (byte) 0 };
        int[] intArray7 = new int[] { 'a', (byte) 0, (-1), (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 0, 0);
    }

    @Test
    public void test11842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11842");
        int[] intArray4 = new int[] { (byte) 0, ' ', (short) 1, (byte) 1 };
        int[] intArray6 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test11843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11843");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (-1), (byte) 10, (byte) 0, ' ', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) '4', (int) (short) 1);
    }

    @Test
    public void test11844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11844");
        int[] intArray1 = new int[] { 0 };
        int[] intArray6 = new int[] { (byte) -1, (short) -1, (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (short) 0, 1);
    }

    @Test
    public void test11845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11845");
        int[] intArray2 = new int[] { (short) 1, (-1) };
        int[] intArray6 = new int[] { (short) 10, (-1), '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (-1), 100);
    }

    @Test
    public void test11846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11846");
        int[] intArray3 = new int[] { 0, (short) 10, (byte) 10 };
        int[] intArray8 = new int[] { (-1), (short) 1, (byte) 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) '#', (int) (byte) 0);
    }

    @Test
    public void test11847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11847");
        int[] intArray6 = new int[] { ' ', ' ', (short) 10, (byte) -1, ' ', (byte) -1 };
        int[] intArray11 = new int[] { (short) -1, (byte) -1, (short) 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (short) 0, 1);
    }

    @Test
    public void test11848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11848");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { '#', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (short) 10, 10);
    }

    @Test
    public void test11849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11849");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray7 = new int[] { (short) 0, (byte) 10, 100, '#', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) 10, 0);
    }

    @Test
    public void test11850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11850");
        int[] intArray2 = new int[] { (byte) 10, 10 };
        int[] intArray9 = new int[] { (byte) 10, 10, 100, (byte) 100, (byte) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 10, (int) (byte) -1);
    }

    @Test
    public void test11851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11851");
        int[] intArray5 = new int[] { (byte) 10, (byte) 10, ' ', (short) 100, ' ' };
        int[] intArray11 = new int[] { (-1), (short) -1, (short) 10, ' ', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) 10, (int) 'a');
    }

    @Test
    public void test11852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11852");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray6 = new int[] { (short) 0, (short) 10, (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (byte) 0, 0);
    }

    @Test
    public void test11853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11853");
        int[] intArray3 = new int[] { (short) 100, (short) 100, (short) 1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, 100, 1);
    }

    @Test
    public void test11854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11854");
        int[] intArray6 = new int[] { (byte) 0, (short) 10, '#', 'a', (short) 100, (short) 100 };
        int[] intArray11 = new int[] { 0, 100, (short) 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 10, (int) '#');
    }

    @Test
    public void test11855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11855");
        int[] intArray4 = new int[] { 'a', 10, 1, (short) 1 };
        int[] intArray7 = new int[] { (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 10, (int) (short) 0);
    }

    @Test
    public void test11856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11856");
        int[] intArray5 = new int[] { (byte) 100, 1, 'a', 'a', (-1) };
        int[] intArray9 = new int[] { (short) 1, (-1), (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 10, (int) (byte) 100);
    }

    @Test
    public void test11857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11857");
        int[] intArray5 = new int[] { (short) 0, 1, 'a', (byte) 100, (byte) 0 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (short) 0, (int) (short) 100);
    }

    @Test
    public void test11858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11858");
        int[] intArray5 = new int[] { 10, (short) 0, (short) 10, (byte) -1, (short) 10 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (short) -1, 10);
    }

    @Test
    public void test11859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11859");
        int[] intArray2 = new int[] { '4', (-1) };
        int[] intArray6 = new int[] { (short) -1, (short) 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) '#', 1);
    }

    @Test
    public void test11860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11860");
        int[] intArray3 = new int[] { (-1), (byte) 0, (short) 10 };
        int[] intArray8 = new int[] { ' ', 10, (short) 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 10, (int) ' ');
    }

    @Test
    public void test11861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11861");
        int[] intArray2 = new int[] { (byte) -1, (byte) 1 };
        int[] intArray9 = new int[] { (byte) -1, ' ', (byte) 10, ' ', 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 0, (int) (short) 100);
    }

    @Test
    public void test11862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11862");
        int[] intArray5 = new int[] { ' ', '#', (short) -1, (short) 100, (-1) };
        int[] intArray7 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (short) 1, (int) (short) -1);
    }

    @Test
    public void test11863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11863");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) 10, (-1), 'a', (short) 1, (byte) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) '#', (int) ' ');
    }

    @Test
    public void test11864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11864");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray8 = new int[] { (short) 0, (short) -1, ' ', '#', (-1), '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 0, (int) (short) -1);
    }

    @Test
    public void test11865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11865");
        int[] intArray3 = new int[] { (byte) 10, (short) -1, (byte) 0 };
        int[] intArray7 = new int[] { 1, ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 1, (int) (byte) 10);
    }

    @Test
    public void test11866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11866");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray4 = new int[] { (short) 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) '4', (int) (short) 1);
    }

    @Test
    public void test11867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11867");
        int[] intArray3 = new int[] { (short) 10, (short) 0, (-1) };
        int[] intArray10 = new int[] { (short) -1, 'a', (byte) 100, '4', (short) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 1, (int) 'a');
    }

    @Test
    public void test11868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11868");
        int[] intArray3 = new int[] { 100, (byte) 10, 1 };
        int[] intArray7 = new int[] { (byte) 0, (short) 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) ' ', (int) (short) 100);
    }

    @Test
    public void test11869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11869");
        int[] intArray6 = new int[] { (byte) -1, (short) -1, '#', (byte) 10, 1, (short) 0 };
        int[] intArray12 = new int[] { ' ', (short) 100, 10, (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (byte) 1, (int) (byte) 100);
    }

    @Test
    public void test11870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11870");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) 1, (short) -1, (-1), (short) 100, 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) 100, 0);
    }

    @Test
    public void test11871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11871");
        int[] intArray4 = new int[] { '4', '#', '4', (byte) 1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (-1), (int) (byte) -1);
    }

    @Test
    public void test11872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11872");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) -1, 1, '4', (byte) 10, (byte) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) ' ', 0);
    }

    @Test
    public void test11873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11873");
        int[] intArray4 = new int[] { (short) -1, ' ', '4', (byte) 10 };
        int[] intArray11 = new int[] { '#', (byte) 0, (short) 100, (byte) -1, (short) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) 'a', (int) (byte) -1);
    }

    @Test
    public void test11874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11874");
        int[] intArray4 = new int[] { '4', (byte) 0, (short) 1, (-1) };
        int[] intArray6 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, 1, (int) '4');
    }

    @Test
    public void test11875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11875");
        int[] intArray4 = new int[] { 10, '4', (byte) 1, (short) 0 };
        int[] intArray11 = new int[] { (byte) 0, (byte) 100, '4', (short) 0, '#', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, 0, (int) 'a');
    }

    @Test
    public void test11876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11876");
        int[] intArray6 = new int[] { '#', (short) 1, (byte) 0, ' ', (short) 100, (byte) 0 };
        int[] intArray9 = new int[] { 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (short) 0, (int) (byte) 100);
    }

    @Test
    public void test11877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11877");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) -1, (byte) 0, 10, (-1), (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) 0, (int) '#');
    }

    @Test
    public void test11878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11878");
        int[] intArray3 = new int[] { (short) 10, (byte) 0, (short) 1 };
        int[] intArray6 = new int[] { 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) '4', 100);
    }

    @Test
    public void test11879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11879");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 1, (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test11880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11880");
        int[] intArray2 = new int[] { (short) 100, 1 };
        int[] intArray6 = new int[] { (short) 10, 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) 1, 0);
    }

    @Test
    public void test11881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11881");
        int[] intArray3 = new int[] { (short) 1, (byte) 100, 10 };
        int[] intArray5 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) '4', 100);
    }

    @Test
    public void test11882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11882");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) -1, '#', (short) 1, '#', 'a', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) 1, (-1));
    }

    @Test
    public void test11883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11883");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) '4', (int) (short) 0);
    }

    @Test
    public void test11884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11884");
        int[] intArray3 = new int[] { (byte) 0, 10, 0 };
        int[] intArray8 = new int[] { (-1), (short) 100, (byte) 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (byte) 100, 100);
    }

    @Test
    public void test11885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11885");
        int[] intArray6 = new int[] { (byte) 0, (short) 1, ' ', 10, 0, (short) 1 };
        int[] intArray11 = new int[] { (byte) 100, (byte) 10, 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (short) 100, (int) (short) 1);
    }

    @Test
    public void test11886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11886");
        int[] intArray6 = new int[] { '4', (short) -1, 10, 10, (byte) 100, 'a' };
        int[] intArray12 = new int[] { (byte) 10, (short) 100, (byte) -1, (short) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) -1, (int) (short) 100);
    }

    @Test
    public void test11887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11887");
        int[] intArray3 = new int[] { (byte) 1, (short) 0, (short) -1 };
        int[] intArray9 = new int[] { (byte) 0, (short) 100, (short) 1, '#', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 0, (int) (short) 1);
    }

    @Test
    public void test11888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11888");
        int[] intArray6 = new int[] { '4', 1, (short) 100, (byte) 10, (byte) 100, 10 };
        int[] intArray8 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 10, (int) (short) 1);
    }

    @Test
    public void test11889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11889");
        int[] intArray2 = new int[] { 1, (short) 100 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) 1, (int) (byte) 1);
    }

    @Test
    public void test11890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11890");
        int[] intArray1 = new int[] { '4' };
        int[] intArray3 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) -1, (int) (short) 1);
    }

    @Test
    public void test11891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11891");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        int[] intArray7 = new int[] { '4', (short) -1, (short) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) 'a', (int) (short) 0);
    }

    @Test
    public void test11892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11892");
        int[] intArray4 = new int[] { 'a', (short) 100, (byte) 0, '#' };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) '4', (int) (byte) 1);
    }

    @Test
    public void test11893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11893");
        int[] intArray6 = new int[] { (byte) 100, (-1), 1, (byte) -1, '#', (byte) 10 };
        int[] intArray11 = new int[] { (short) 1, ' ', (short) -1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) 'a', (int) ' ');
    }

    @Test
    public void test11894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11894");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, (short) -1, 10, 100, '#' };
        int[] intArray13 = new int[] { (-1), (short) 10, (short) -1, (short) -1, (short) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (short) 1, (int) (short) -1);
    }

    @Test
    public void test11895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11895");
        int[] intArray3 = new int[] { (byte) 10, (byte) 1, 1 };
        int[] intArray8 = new int[] { 1, '4', 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (short) 0, (int) (short) -1);
    }

    @Test
    public void test11896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11896");
        int[] intArray3 = new int[] { (short) 1, 10, (short) -1 };
        int[] intArray5 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, 100, (int) ' ');
    }

    @Test
    public void test11897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11897");
        int[] intArray3 = new int[] { (-1), (short) -1, (byte) 1 };
        int[] intArray8 = new int[] { (byte) 0, (byte) -1, ' ', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (short) 100, (int) (short) -1);
    }

    @Test
    public void test11898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11898");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray8 = new int[] { (byte) 100, (byte) 100, '#', 100, (byte) 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test11899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11899");
        int[] intArray2 = new int[] { (-1), 100 };
        int[] intArray6 = new int[] { (short) -1, (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 0, 100);
    }

    @Test
    public void test11900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11900");
        int[] intArray5 = new int[] { ' ', 0, (byte) 100, ' ', (short) 0 };
        int[] intArray10 = new int[] { (short) 100, (short) 1, (byte) 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) 'a', 0);
    }

    @Test
    public void test11901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11901");
        int[] intArray4 = new int[] { (short) 10, (byte) 0, 'a', 100 };
        int[] intArray8 = new int[] { (short) -1, 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) '4', (int) (short) 10);
    }

    @Test
    public void test11902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11902");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) 0, (-1), ' ', 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, 0, (int) '#');
    }

    @Test
    public void test11903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11903");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray3 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (byte) 10, 100);
    }

    @Test
    public void test11904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11904");
        int[] intArray6 = new int[] { (byte) -1, (byte) -1, (short) -1, 100, 10, (short) 10 };
        int[] intArray12 = new int[] { (byte) 1, (byte) -1, 100, ' ', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 0, (int) (short) 10);
    }

    @Test
    public void test11905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11905");
        int[] intArray6 = new int[] { (short) 100, (short) 100, 100, (-1), 10, 100 };
        int[] intArray10 = new int[] { '4', (short) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 0, (int) (byte) 100);
    }

    @Test
    public void test11906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11906");
        int[] intArray5 = new int[] { 'a', (byte) 100, 0, 0, '4' };
        int[] intArray12 = new int[] { (byte) -1, (short) 0, 0, (short) 1, (short) 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, 0, (int) (short) 100);
    }

    @Test
    public void test11907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11907");
        int[] intArray4 = new int[] { (byte) 0, (short) 100, (short) 0, (byte) 100 };
        int[] intArray11 = new int[] { (short) 1, (byte) 10, (short) 0, (byte) -1, 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, 0, (int) (byte) 100);
    }

    @Test
    public void test11908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11908");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 0, (byte) 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test11909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11909");
        int[] intArray2 = new int[] { ' ', (byte) -1 };
        int[] intArray8 = new int[] { (short) 0, (short) 0, (-1), (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (byte) -1, (int) (byte) 0);
    }

    @Test
    public void test11910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11910");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray4 = new int[] { (short) 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) -1, (int) 'a');
    }

    @Test
    public void test11911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11911");
        int[] intArray5 = new int[] { '4', (short) 0, (-1), 0, 'a' };
        int[] intArray9 = new int[] { (byte) 100, 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) '#', (int) (short) 0);
    }

    @Test
    public void test11912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11912");
        int[] intArray2 = new int[] { 1, 'a' };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (byte) -1, (int) '#');
    }

    @Test
    public void test11913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11913");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) 10, 100, 1, (short) 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) '#', (int) (short) 100);
    }

    @Test
    public void test11914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11914");
        int[] intArray2 = new int[] { 100, (short) -1 };
        int[] intArray5 = new int[] { (short) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 10, 1);
    }

    @Test
    public void test11915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11915");
        int[] intArray2 = new int[] { 'a', 0 };
        int[] intArray4 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (byte) 100, (int) ' ');
    }

    @Test
    public void test11916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11916");
        int[] intArray5 = new int[] { ' ', '#', (byte) 0, (byte) 0, 0 };
        int[] intArray11 = new int[] { ' ', 1, (byte) 1, '4', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) 0, 0);
    }

    @Test
    public void test11917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11917");
        int[] intArray4 = new int[] { ' ', (short) 10, '#', (short) 10 };
        int[] intArray10 = new int[] { '#', (-1), (byte) 100, 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, 0, (int) 'a');
    }

    @Test
    public void test11918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11918");
        int[] intArray6 = new int[] { (byte) -1, 'a', 100, 1, (byte) -1, 10 };
        int[] intArray11 = new int[] { 'a', (short) 100, (short) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (byte) 0, (-1));
    }

    @Test
    public void test11919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11919");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) 1, (int) '4');
    }

    @Test
    public void test11920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11920");
        int[] intArray2 = new int[] { (-1), '4' };
        int[] intArray5 = new int[] { '#', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 10, (int) (short) -1);
    }

    @Test
    public void test11921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11921");
        int[] intArray3 = new int[] { (byte) -1, (short) 0, (short) -1 };
        int[] intArray8 = new int[] { (byte) 100, 0, (short) 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (-1), 0);
    }

    @Test
    public void test11922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11922");
        int[] intArray6 = new int[] { ' ', (short) 100, 100, 10, ' ', (-1) };
        int[] intArray13 = new int[] { (short) 1, 100, '4', '4', (short) 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 10, (int) (short) 100);
    }

    @Test
    public void test11923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11923");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 0, 0);
    }

    @Test
    public void test11924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11924");
        int[] intArray4 = new int[] { 10, (byte) 100, (byte) 0, 0 };
        int[] intArray7 = new int[] { 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) 10, (int) (short) 10);
    }

    @Test
    public void test11925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11925");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray6 = new int[] { 1, (short) 1, (-1), (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (short) 1, 10);
    }

    @Test
    public void test11926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11926");
        int[] intArray3 = new int[] { 'a', 'a', (-1) };
        int[] intArray6 = new int[] { 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) '4', 1);
    }

    @Test
    public void test11927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11927");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray5 = new int[] { (byte) -1, 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, 0, 10);
    }

    @Test
    public void test11928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11928");
        int[] intArray3 = new int[] { 0, (byte) 10, (byte) -1 };
        int[] intArray7 = new int[] { (byte) 100, (byte) 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 10, (int) ' ');
    }

    @Test
    public void test11929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11929");
        int[] intArray3 = new int[] { 'a', 10, (byte) -1 };
        int[] intArray6 = new int[] { 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, 0, 0);
    }

    @Test
    public void test11930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11930");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray3 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) 100, (int) (short) 10);
    }

    @Test
    public void test11931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11931");
        int[] intArray2 = new int[] { (short) 100, (short) 100 };
        int[] intArray4 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (byte) -1, (int) '#');
    }

    @Test
    public void test11932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11932");
        int[] intArray5 = new int[] { (byte) 10, (short) -1, (byte) -1, (short) 1, '4' };
        int[] intArray7 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (short) 10, (int) (byte) 1);
    }

    @Test
    public void test11933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11933");
        int[] intArray6 = new int[] { (short) 10, ' ', ' ', '#', (byte) 1, '4' };
        int[] intArray10 = new int[] { 0, 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) '#', (int) (byte) 100);
    }

    @Test
    public void test11934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11934");
        int[] intArray4 = new int[] { (byte) 1, '#', ' ', (short) 0 };
        int[] intArray11 = new int[] { 'a', 0, (byte) 100, 1, 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) '#', (int) '#');
    }

    @Test
    public void test11935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11935");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray3 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, 0, (int) (short) 1);
    }

    @Test
    public void test11936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11936");
        int[] intArray3 = new int[] { (short) -1, ' ', (short) -1 };
        int[] intArray6 = new int[] { (byte) -1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) 10, (int) (short) 1);
    }

    @Test
    public void test11937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11937");
        int[] intArray4 = new int[] { (byte) 100, 0, (byte) -1, (byte) 0 };
        int[] intArray9 = new int[] { (short) -1, 100, 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 0, (int) (short) 0);
    }

    @Test
    public void test11938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11938");
        int[] intArray5 = new int[] { 100, (short) 0, '#', (byte) 1, '#' };
        int[] intArray7 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test11939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11939");
        int[] intArray2 = new int[] { '#', (short) 0 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) ' ', (int) '4');
    }

    @Test
    public void test11940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11940");
        int[] intArray1 = new int[] { 10 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test11941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11941");
        int[] intArray4 = new int[] { (short) 0, '4', (byte) 100, (short) 100 };
        int[] intArray11 = new int[] { (-1), (byte) 10, 'a', '#', (byte) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, 1, 1);
    }

    @Test
    public void test11942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11942");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { '#', ' ', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) 10, (int) 'a');
    }

    @Test
    public void test11943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11943");
        int[] intArray6 = new int[] { (byte) -1, 0, ' ', 1, 1, (short) 0 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, 1, (int) ' ');
    }

    @Test
    public void test11944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11944");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 'a', ' ', ' ', (byte) 100, (byte) 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (-1), (int) (byte) 0);
    }

    @Test
    public void test11945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11945");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (-1), (int) (byte) -1);
    }

    @Test
    public void test11946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11946");
        int[] intArray3 = new int[] { ' ', (short) 10, (short) 1 };
        int[] intArray6 = new int[] { ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, 0, 100);
    }

    @Test
    public void test11947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11947");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) 'a', 100);
    }

    @Test
    public void test11948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11948");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray5 = new int[] { (byte) -1, (byte) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) '#', (int) ' ');
    }

    @Test
    public void test11949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11949");
        int[] intArray4 = new int[] { 1, (byte) 100, (byte) 1, 100 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, 0, 100);
    }

    @Test
    public void test11950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11950");
        int[] intArray2 = new int[] { 1, (short) 0 };
        int[] intArray9 = new int[] { (byte) 100, 1, (-1), (-1), (byte) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (byte) 10, 1);
    }

    @Test
    public void test11951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11951");
        int[] intArray2 = new int[] { (short) 10, (short) 10 };
        int[] intArray5 = new int[] { (short) 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (byte) 100, (int) (byte) -1);
    }

    @Test
    public void test11952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11952");
        int[] intArray6 = new int[] { 1, (byte) 1, 1, 100, (byte) 100, (short) -1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) '4', (int) (short) 100);
    }

    @Test
    public void test11953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11953");
        int[] intArray3 = new int[] { (byte) 10, 10, 'a' };
        int[] intArray7 = new int[] { (byte) -1, (-1), (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 1, 100);
    }

    @Test
    public void test11954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11954");
        int[] intArray2 = new int[] { (short) 100, (byte) 10 };
        int[] intArray4 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) '4', (int) (byte) 10);
    }

    @Test
    public void test11955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11955");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray8 = new int[] { (short) -1, '#', (short) 1, 1, (short) 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) -1, 0);
    }

    @Test
    public void test11956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11956");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (-1), (int) (short) 10);
    }

    @Test
    public void test11957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11957");
        int[] intArray2 = new int[] { 1, (byte) 0 };
        int[] intArray6 = new int[] { (short) -1, 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) -1, 10);
    }

    @Test
    public void test11958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11958");
        int[] intArray1 = new int[] { 10 };
        int[] intArray8 = new int[] { (byte) 100, (short) 10, (short) -1, (short) 1, (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) 'a', (int) (short) 100);
    }

    @Test
    public void test11959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11959");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 0, '4', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test11960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11960");
        int[] intArray6 = new int[] { '4', 1, (byte) -1, 100, (byte) 10, (-1) };
        int[] intArray13 = new int[] { (byte) -1, ' ', 10, 10, (byte) 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test11961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11961");
        int[] intArray3 = new int[] { 'a', '#', (short) 0 };
        int[] intArray10 = new int[] { (byte) -1, 10, (short) 100, (short) 100, '4', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (byte) 1, 0);
    }

    @Test
    public void test11962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11962");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray5 = new int[] { (byte) 100, 'a', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) '4', (int) (short) 0);
    }

    @Test
    public void test11963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11963");
        int[] intArray2 = new int[] { ' ', (byte) -1 };
        int[] intArray7 = new int[] { ' ', (byte) 0, '#', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 1, (int) (short) -1);
    }

    @Test
    public void test11964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11964");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 100, 0, '4', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) '#', (int) '4');
    }

    @Test
    public void test11965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11965");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray4 = new int[] { (short) 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (-1), (-1));
    }

    @Test
    public void test11966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11966");
        int[] intArray3 = new int[] { (-1), (byte) 100, 'a' };
        int[] intArray5 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) 10, (int) 'a');
    }

    @Test
    public void test11967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11967");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (short) 100, (int) '4');
    }

    @Test
    public void test11968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11968");
        int[] intArray6 = new int[] { (byte) 0, (byte) 100, 0, 100, (-1), (short) 10 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) -1, (int) (short) 10);
    }

    @Test
    public void test11969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11969");
        int[] intArray4 = new int[] { ' ', 1, (byte) 0, 'a' };
        int[] intArray6 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (short) 1, (int) (short) 100);
    }

    @Test
    public void test11970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11970");
        int[] intArray5 = new int[] { (short) 1, ' ', (byte) 1, 1, 'a' };
        int[] intArray12 = new int[] { (short) -1, 10, 0, (byte) 10, (short) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) '#', (int) (byte) 10);
    }

    @Test
    public void test11971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11971");
        int[] intArray1 = new int[] { 10 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 10, (int) ' ');
    }

    @Test
    public void test11972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11972");
        int[] intArray3 = new int[] { (short) 10, (short) -1, (short) -1 };
        int[] intArray5 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test11973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11973");
        int[] intArray5 = new int[] { 100, (short) 1, '4', (byte) -1, (short) 0 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) 10, (int) (short) 0);
    }

    @Test
    public void test11974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11974");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 0, (short) 10, (byte) 1, (short) 100, (byte) 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) 100, (int) (byte) 10);
    }

    @Test
    public void test11975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11975");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) -1, '#', (byte) 100, 100, (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, 1, (int) (short) 10);
    }

    @Test
    public void test11976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11976");
        int[] intArray4 = new int[] { 100, (short) 10, (short) 1, '4' };
        int[] intArray10 = new int[] { 1, ' ', 100, (byte) 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (byte) -1, (int) (byte) 100);
    }

    @Test
    public void test11977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11977");
        int[] intArray5 = new int[] { (short) 1, (short) 0, 1, (short) 1, (byte) 100 };
        int[] intArray9 = new int[] { (short) 10, (byte) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (-1), (int) (byte) 10);
    }

    @Test
    public void test11978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11978");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 10, 1, '4', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) -1, (int) (byte) 100);
    }

    @Test
    public void test11979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11979");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray7 = new int[] { (byte) 0, (-1), (short) -1, ' ', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) 0, (int) (short) 100);
    }

    @Test
    public void test11980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11980");
        int[] intArray2 = new int[] { (byte) 1, (byte) 1 };
        int[] intArray4 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (short) 0, (int) (short) 10);
    }

    @Test
    public void test11981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11981");
        int[] intArray4 = new int[] { (-1), (byte) -1, (byte) 0, (byte) 10 };
        int[] intArray10 = new int[] { (byte) 1, (byte) -1, (byte) -1, 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (byte) 0, 10);
    }

    @Test
    public void test11982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11982");
        int[] intArray6 = new int[] { 10, (short) 1, (byte) 100, 'a', 100, 0 };
        int[] intArray12 = new int[] { (byte) 1, (byte) 10, (short) 100, '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 0, (int) (byte) 100);
    }

    @Test
    public void test11983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11983");
        int[] intArray4 = new int[] { (short) -1, 'a', 0, (short) 10 };
        int[] intArray8 = new int[] { 0, (-1), 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 1, (int) (short) 0);
    }

    @Test
    public void test11984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11984");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { '#', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) 'a', (int) '#');
    }

    @Test
    public void test11985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11985");
        int[] intArray3 = new int[] { (byte) 0, (short) 1, (byte) 0 };
        int[] intArray8 = new int[] { (short) 0, (byte) -1, (short) 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) '4', (int) (byte) 1);
    }

    @Test
    public void test11986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11986");
        int[] intArray6 = new int[] { 10, 10, 10, (-1), (byte) 10, (byte) 1 };
        int[] intArray9 = new int[] { (short) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test11987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11987");
        int[] intArray3 = new int[] { 100, (byte) 1, '4' };
        int[] intArray10 = new int[] { 'a', (byte) 10, (short) 10, (byte) -1, (short) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 1, (int) (short) 100);
    }

    @Test
    public void test11988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11988");
        int[] intArray4 = new int[] { 10, (-1), 100, (short) 0 };
        int[] intArray8 = new int[] { (short) 1, (byte) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 1, (int) (short) 100);
    }

    @Test
    public void test11989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11989");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 100, (int) '#');
    }

    @Test
    public void test11990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11990");
        int[] intArray4 = new int[] { (byte) 1, (byte) 100, ' ', (short) 0 };
        int[] intArray8 = new int[] { 0, (short) 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) 0, (int) (short) 0);
    }

    @Test
    public void test11991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11991");
        int[] intArray5 = new int[] { '#', 'a', (short) 10, (short) 0, '#' };
        int[] intArray7 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (short) 10, (int) 'a');
    }

    @Test
    public void test11992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11992");
        int[] intArray3 = new int[] { ' ', 10, (byte) 10 };
        int[] intArray10 = new int[] { 'a', (short) 10, 1, (short) 1, (short) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 0, (int) 'a');
    }

    @Test
    public void test11993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11993");
        int[] intArray4 = new int[] { 1, (byte) 1, (short) 1, (byte) 10 };
        int[] intArray11 = new int[] { (short) 1, 0, (-1), (short) 10, (byte) -1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (byte) 1, 10);
    }

    @Test
    public void test11994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11994");
        int[] intArray1 = new int[] { 0 };
        int[] intArray8 = new int[] { (short) 0, '#', (short) 0, (byte) -1, (short) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) 10, (-1));
    }

    @Test
    public void test11995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11995");
        int[] intArray4 = new int[] { 10, 'a', (short) 10, (short) 1 };
        int[] intArray7 = new int[] { 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) '#', (int) (byte) 10);
    }

    @Test
    public void test11996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11996");
        int[] intArray5 = new int[] { '#', 1, (byte) 100, (short) 1, (short) 10 };
        int[] intArray7 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (-1), 10);
    }

    @Test
    public void test11997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11997");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 0, 100, (byte) 1, (short) 1, '4', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, 1, 100);
    }

    @Test
    public void test11998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11998");
        int[] intArray4 = new int[] { (-1), 1, (-1), ' ' };
        int[] intArray10 = new int[] { 10, (byte) -1, ' ', '#', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (byte) -1, (int) (byte) 10);
    }

    @Test
    public void test11999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test11999");
        int[] intArray4 = new int[] { 10, (byte) -1, '#', (short) 0 };
        int[] intArray8 = new int[] { 1, 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) 100, (int) (byte) 10);
    }

    @Test
    public void test12000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest23.test12000");
        int[] intArray3 = new int[] { (short) -1, 0, ' ' };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, 0, (int) (short) -1);
    }
}

