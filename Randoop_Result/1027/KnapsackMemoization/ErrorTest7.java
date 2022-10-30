package KnapsackMemoization;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest7 {

    public static boolean debug = false;

    @Test
    public void test03501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03501");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, ' ', (byte) 10, (byte) 0 };
        int[] intArray9 = new int[] { (-1), (-1), (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 10, (-1));
    }

    @Test
    public void test03502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03502");
        int[] intArray4 = new int[] { (short) 0, (-1), (byte) 10, (byte) 1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) ' ', (int) 'a');
    }

    @Test
    public void test03503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03503");
        int[] intArray4 = new int[] { (byte) 100, (byte) 1, (short) 100, (byte) 1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) '#', 100);
    }

    @Test
    public void test03504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03504");
        int[] intArray2 = new int[] { '4', (short) -1 };
        int[] intArray9 = new int[] { 'a', (-1), ' ', '4', (short) -1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) 'a', (-1));
    }

    @Test
    public void test03505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03505");
        int[] intArray6 = new int[] { (byte) -1, 100, (byte) -1, (short) 100, 100, (short) 10 };
        int[] intArray9 = new int[] { '#', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, 0, 0);
    }

    @Test
    public void test03506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03506");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray7 = new int[] { (short) 100, (-1), 0, '#', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) 0, (int) 'a');
    }

    @Test
    public void test03507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03507");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, (byte) -1, (byte) 0, (byte) -1, 100 };
        int[] intArray8 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test03508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03508");
        int[] intArray4 = new int[] { (byte) 1, (byte) 0, (short) 100, '4' };
        int[] intArray9 = new int[] { (byte) 100, (byte) -1, 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (byte) 0, (int) (short) -1);
    }

    @Test
    public void test03509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03509");
        int[] intArray2 = new int[] { 1, 1 };
        int[] intArray6 = new int[] { (byte) 100, (short) 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test03510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03510");
        int[] intArray4 = new int[] { '4', 0, '#', (short) 0 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (-1), 0);
    }

    @Test
    public void test03511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03511");
        int[] intArray4 = new int[] { (byte) 0, (byte) 10, ' ', '#' };
        int[] intArray7 = new int[] { 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) 0, 0);
    }

    @Test
    public void test03512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03512");
        int[] intArray3 = new int[] { 10, '#', (byte) 1 };
        int[] intArray10 = new int[] { (byte) 100, (short) 1, (short) 10, '#', (byte) 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 10, 100);
    }

    @Test
    public void test03513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03513");
        int[] intArray5 = new int[] { 0, (short) 10, (byte) 0, 'a', '#' };
        int[] intArray12 = new int[] { (short) 1, 100, '4', (short) 1, (short) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (-1), 1);
    }

    @Test
    public void test03514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03514");
        int[] intArray2 = new int[] { (short) 100, ' ' };
        int[] intArray5 = new int[] { 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (byte) 10, 10);
    }

    @Test
    public void test03515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03515");
        int[] intArray4 = new int[] { (byte) 1, (short) -1, (short) 0, '#' };
        int[] intArray9 = new int[] { (short) 0, 10, (short) 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) -1, 10);
    }

    @Test
    public void test03516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03516");
        int[] intArray2 = new int[] { 10, (short) 1 };
        int[] intArray5 = new int[] { (short) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) 'a', 100);
    }

    @Test
    public void test03517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03517");
        int[] intArray3 = new int[] { ' ', (byte) 1, (byte) 1 };
        int[] intArray7 = new int[] { (byte) -1, 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 100, (int) '#');
    }

    @Test
    public void test03518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03518");
        int[] intArray4 = new int[] { (short) 10, '#', (short) 1, (short) 10 };
        int[] intArray6 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, 0, 100);
    }

    @Test
    public void test03519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03519");
        int[] intArray1 = new int[] { 100 };
        int[] intArray4 = new int[] { (short) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, 0, 1);
    }

    @Test
    public void test03520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03520");
        int[] intArray2 = new int[] { (-1), (short) -1 };
        int[] intArray7 = new int[] { (short) 100, (byte) 10, 'a', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 10, (int) '#');
    }

    @Test
    public void test03521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03521");
        int[] intArray2 = new int[] { 0, 1 };
        int[] intArray9 = new int[] { (byte) -1, (short) 10, (byte) -1, 100, (short) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (short) 10, 0);
    }

    @Test
    public void test03522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03522");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray5 = new int[] { (byte) 10, 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, 0, (int) (byte) 1);
    }

    @Test
    public void test03523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03523");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 10, '4', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, 100, (int) (short) 1);
    }

    @Test
    public void test03524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03524");
        int[] intArray2 = new int[] { (short) 0, '4' };
        int[] intArray6 = new int[] { (short) -1, (short) 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) '#', (-1));
    }

    @Test
    public void test03525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03525");
        int[] intArray2 = new int[] { 'a', 'a' };
        int[] intArray8 = new int[] { (byte) 100, 100, (byte) 100, (short) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 10, (int) '4');
    }

    @Test
    public void test03526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03526");
        int[] intArray1 = new int[] { 100 };
        int[] intArray6 = new int[] { 1, (short) 10, (byte) 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) '4', 100);
    }

    @Test
    public void test03527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03527");
        int[] intArray5 = new int[] { '#', (byte) 1, (short) 100, ' ', 'a' };
        int[] intArray12 = new int[] { (byte) 100, (short) 100, (short) 0, (short) -1, 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) ' ', (int) '4');
    }

    @Test
    public void test03528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03528");
        int[] intArray6 = new int[] { (byte) 0, (short) 0, 'a', (byte) 0, (short) 10, (byte) -1 };
        int[] intArray8 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 0, (int) '#');
    }

    @Test
    public void test03529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03529");
        int[] intArray3 = new int[] { (short) 1, ' ', (short) 100 };
        int[] intArray6 = new int[] { '#', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) 1, (int) (byte) 10);
    }

    @Test
    public void test03530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03530");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 100, 10, ' ', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 100, (int) (byte) 1);
    }

    @Test
    public void test03531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03531");
        int[] intArray6 = new int[] { 100, '#', (short) 0, (byte) 0, (short) 100, ' ' };
        int[] intArray11 = new int[] { ' ', (-1), (byte) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (short) -1, 10);
    }

    @Test
    public void test03532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03532");
        int[] intArray5 = new int[] { 'a', 100, (byte) 10, (short) 1, (byte) 100 };
        int[] intArray10 = new int[] { (byte) 1, (short) 10, (short) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) ' ', (int) '4');
    }

    @Test
    public void test03533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03533");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 100, (-1), (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (-1), (int) (short) 0);
    }

    @Test
    public void test03534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03534");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (byte) 10, 0);
    }

    @Test
    public void test03535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03535");
        int[] intArray3 = new int[] { '#', (-1), (byte) 100 };
        int[] intArray5 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) -1, (int) (byte) 100);
    }

    @Test
    public void test03536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03536");
        int[] intArray2 = new int[] { 100, 10 };
        int[] intArray6 = new int[] { (-1), (short) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) ' ', (int) (byte) 1);
    }

    @Test
    public void test03537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03537");
        int[] intArray3 = new int[] { '#', (byte) 100, (byte) 10 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) -1, 100);
    }

    @Test
    public void test03538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03538");
        int[] intArray6 = new int[] { (short) 100, (byte) 100, 0, (byte) 0, 100, 10 };
        int[] intArray9 = new int[] { 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (short) 100, (int) '4');
    }

    @Test
    public void test03539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03539");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray7 = new int[] { 100, '#', ' ', (byte) 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) 'a', (int) '4');
    }

    @Test
    public void test03540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03540");
        int[] intArray6 = new int[] { (byte) -1, 0, (short) 1, (byte) 10, (short) 0, (short) 0 };
        int[] intArray13 = new int[] { (short) 10, (-1), (-1), (short) 100, (-1), (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (byte) 1, (int) ' ');
    }

    @Test
    public void test03541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03541");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { '4', 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) 10, 100);
    }

    @Test
    public void test03542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03542");
        int[] intArray3 = new int[] { 10, (short) 0, (byte) 1 };
        int[] intArray8 = new int[] { (short) 10, (short) 1, (byte) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) '#', 0);
    }

    @Test
    public void test03543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03543");
        int[] intArray2 = new int[] { (short) 10, (short) -1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (byte) 100, (int) (byte) -1);
    }

    @Test
    public void test03544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03544");
        int[] intArray5 = new int[] { 100, '4', '#', 10, (short) 100 };
        int[] intArray10 = new int[] { (byte) 0, (byte) 1, (short) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (byte) 1, (-1));
    }

    @Test
    public void test03545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03545");
        int[] intArray4 = new int[] { 'a', 'a', (byte) 100, (short) 1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (byte) 1, 100);
    }

    @Test
    public void test03546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03546");
        int[] intArray3 = new int[] { (byte) 100, 10, 100 };
        int[] intArray8 = new int[] { (byte) 0, 'a', (short) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 1, (int) (short) 0);
    }

    @Test
    public void test03547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03547");
        int[] intArray6 = new int[] { (byte) 10, 10, (-1), (short) 10, (short) 1, '#' };
        int[] intArray9 = new int[] { (byte) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 1, 0);
    }

    @Test
    public void test03548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03548");
        int[] intArray2 = new int[] { (short) -1, '#' };
        int[] intArray8 = new int[] { ' ', (short) -1, (byte) 1, (byte) 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) 100, (int) (short) 0);
    }

    @Test
    public void test03549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03549");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) 0, (int) (byte) 1);
    }

    @Test
    public void test03550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03550");
        int[] intArray2 = new int[] { (byte) 0, ' ' };
        int[] intArray7 = new int[] { '4', 0, (short) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) 'a', 10);
    }

    @Test
    public void test03551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03551");
        int[] intArray4 = new int[] { (short) -1, 'a', 0, (byte) -1 };
        int[] intArray11 = new int[] { (byte) 1, (short) 10, (byte) 10, '#', (byte) 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) 1, 10);
    }

    @Test
    public void test03552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03552");
        int[] intArray6 = new int[] { '#', (short) 0, 10, (short) 0, 10, 0 };
        int[] intArray10 = new int[] { (short) 10, 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) 'a', (int) (short) 10);
    }

    @Test
    public void test03553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03553");
        int[] intArray5 = new int[] { ' ', (short) 100, (short) 0, 100, (byte) 10 };
        int[] intArray10 = new int[] { (byte) 100, (short) 10, (-1), '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (short) 100, 100);
    }

    @Test
    public void test03554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03554");
        int[] intArray4 = new int[] { (byte) 10, 'a', (-1), (byte) 10 };
        int[] intArray10 = new int[] { (short) 100, (byte) -1, '4', 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) -1, 0);
    }

    @Test
    public void test03555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03555");
        int[] intArray6 = new int[] { ' ', 1, ' ', (byte) 0, '4', '4' };
        int[] intArray11 = new int[] { '4', (-1), '4', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (short) 0, (int) (byte) 0);
    }

    @Test
    public void test03556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03556");
        int[] intArray2 = new int[] { 0, 10 };
        int[] intArray9 = new int[] { (short) -1, (byte) 1, ' ', '4', 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) '4', (int) (short) 100);
    }

    @Test
    public void test03557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03557");
        int[] intArray4 = new int[] { 'a', 100, (short) -1, (short) 100 };
        int[] intArray6 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test03558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03558");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray3 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, 0, (int) 'a');
    }

    @Test
    public void test03559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03559");
        int[] intArray1 = new int[] { '4' };
        int[] intArray5 = new int[] { 0, 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) 0, (int) (short) 0);
    }

    @Test
    public void test03560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03560");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { '#', '4', 0, 100, (short) 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, 10, (int) (byte) 100);
    }

    @Test
    public void test03561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03561");
        int[] intArray2 = new int[] { (byte) 10, (short) -1 };
        int[] intArray5 = new int[] { '4', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (-1), (int) (short) 0);
    }

    @Test
    public void test03562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03562");
        int[] intArray5 = new int[] { (short) 0, 1, '4', ' ', 'a' };
        int[] intArray8 = new int[] { ' ', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 100, (int) (short) 100);
    }

    @Test
    public void test03563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03563");
        int[] intArray5 = new int[] { 10, 100, 10, 10, (short) 10 };
        int[] intArray7 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) 100, (int) ' ');
    }

    @Test
    public void test03564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03564");
        int[] intArray6 = new int[] { (short) -1, (byte) 0, (short) 10, (byte) 1, 10, (byte) 100 };
        int[] intArray12 = new int[] { (byte) 1, (short) 1, 0, (byte) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) ' ', (int) (short) 0);
    }

    @Test
    public void test03565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03565");
        int[] intArray1 = new int[] { 0 };
        int[] intArray7 = new int[] { 1, 1, (byte) 1, (short) 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (-1), (int) (short) 1);
    }

    @Test
    public void test03566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03566");
        int[] intArray2 = new int[] { 100, 'a' };
        int[] intArray8 = new int[] { (short) 0, 1, (short) 1, 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) '#', (int) (byte) 10);
    }

    @Test
    public void test03567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03567");
        int[] intArray6 = new int[] { 'a', (short) 0, (byte) 100, (byte) 100, (byte) 1, '#' };
        int[] intArray11 = new int[] { (short) 1, '4', (short) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) '#', (int) (byte) 100);
    }

    @Test
    public void test03568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03568");
        int[] intArray2 = new int[] { (byte) 10, 100 };
        int[] intArray9 = new int[] { (byte) 100, (short) -1, 'a', (byte) 100, 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (short) 100, (int) ' ');
    }

    @Test
    public void test03569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03569");
        int[] intArray2 = new int[] { 1, (short) -1 };
        int[] intArray5 = new int[] { (byte) 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 10, (int) 'a');
    }

    @Test
    public void test03570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03570");
        int[] intArray4 = new int[] { (short) 10, (short) -1, '#', (short) 0 };
        int[] intArray10 = new int[] { (byte) 100, 0, (short) 10, ' ', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (byte) 10, (int) ' ');
    }

    @Test
    public void test03571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03571");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (-1), 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 0, (int) (byte) 0);
    }

    @Test
    public void test03572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03572");
        int[] intArray4 = new int[] { (short) 0, 100, '#', (byte) 0 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (short) 0, 1);
    }

    @Test
    public void test03573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03573");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (short) 1, (int) '4');
    }

    @Test
    public void test03574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03574");
        int[] intArray2 = new int[] { 10, (short) -1 };
        int[] intArray6 = new int[] { (byte) 100, 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 0, (int) (short) 10);
    }

    @Test
    public void test03575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03575");
        int[] intArray5 = new int[] { 10, ' ', (short) 0, 0, (short) -1 };
        int[] intArray10 = new int[] { 'a', (byte) 1, (byte) 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 10, (int) '4');
    }

    @Test
    public void test03576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03576");
        int[] intArray4 = new int[] { (byte) 100, 0, (byte) 0, (short) -1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (-1), (int) ' ');
    }

    @Test
    public void test03577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03577");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray8 = new int[] { (byte) 10, '#', (byte) 10, '4', (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) '#', (int) (byte) 0);
    }

    @Test
    public void test03578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03578");
        int[] intArray2 = new int[] { (byte) -1, 1 };
        int[] intArray4 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (byte) 1, (int) (short) -1);
    }

    @Test
    public void test03579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03579");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (-1), (byte) -1, (short) 0, (short) 1, (short) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test03580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03580");
        int[] intArray2 = new int[] { (byte) 100, 100 };
        int[] intArray6 = new int[] { (byte) 100, (byte) 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (short) 0, (-1));
    }

    @Test
    public void test03581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03581");
        int[] intArray2 = new int[] { (short) 100, ' ' };
        int[] intArray9 = new int[] { 1, (short) -1, 100, 1, (short) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) 'a', (int) (short) -1);
    }

    @Test
    public void test03582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03582");
        int[] intArray2 = new int[] { 10, ' ' };
        int[] intArray5 = new int[] { '#', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 10, 10);
    }

    @Test
    public void test03583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03583");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (-1), (short) -1, (short) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (-1), (int) (short) 100);
    }

    @Test
    public void test03584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03584");
        int[] intArray5 = new int[] { (short) 0, (short) -1, (-1), (short) 100, 10 };
        int[] intArray9 = new int[] { ' ', (byte) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) ' ', (int) (byte) 10);
    }

    @Test
    public void test03585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03585");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 10, 0, (short) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) -1, 0);
    }

    @Test
    public void test03586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03586");
        int[] intArray6 = new int[] { 'a', (short) 1, (byte) -1, '4', '#', (-1) };
        int[] intArray10 = new int[] { 'a', (short) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) 0, (int) (byte) 10);
    }

    @Test
    public void test03587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03587");
        int[] intArray4 = new int[] { 1, (byte) 10, 10, (short) 10 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (short) 1, 0);
    }

    @Test
    public void test03588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03588");
        int[] intArray5 = new int[] { (byte) 10, (short) 10, (short) 1, (byte) 0, (byte) -1 };
        int[] intArray9 = new int[] { (byte) -1, 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (-1), (int) (byte) 100);
    }

    @Test
    public void test03589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03589");
        int[] intArray3 = new int[] { '4', (short) 1, 100 };
        int[] intArray10 = new int[] { 100, (-1), 1, (short) -1, (short) 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 100, (int) (byte) -1);
    }

    @Test
    public void test03590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03590");
        int[] intArray3 = new int[] { 0, (short) 10, (short) 0 };
        int[] intArray7 = new int[] { (short) 0, (byte) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) 1, (int) ' ');
    }

    @Test
    public void test03591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03591");
        int[] intArray5 = new int[] { 0, '4', 'a', 'a', (byte) 1 };
        int[] intArray9 = new int[] { ' ', (byte) 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 0, (int) 'a');
    }

    @Test
    public void test03592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03592");
        int[] intArray6 = new int[] { (short) -1, (byte) 0, 0, (byte) 100, (byte) 1, (-1) };
        int[] intArray8 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 100, (int) 'a');
    }

    @Test
    public void test03593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03593");
        int[] intArray2 = new int[] { 'a', '4' };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test03594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03594");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) 'a', 10);
    }

    @Test
    public void test03595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03595");
        int[] intArray4 = new int[] { ' ', 0, (short) 10, (short) 100 };
        int[] intArray6 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 1, (int) (byte) 100);
    }

    @Test
    public void test03596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03596");
        int[] intArray3 = new int[] { ' ', (short) -1, (short) 1 };
        int[] intArray7 = new int[] { 'a', (byte) 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) 'a', (int) (byte) 100);
    }

    @Test
    public void test03597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03597");
        int[] intArray6 = new int[] { 100, 0, 'a', (byte) 100, '#', 100 };
        int[] intArray12 = new int[] { (short) 10, (short) 1, (byte) 1, (byte) -1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (-1), (int) '4');
    }

    @Test
    public void test03598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03598");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray3 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (byte) 1, 0);
    }

    @Test
    public void test03599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03599");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { ' ', (short) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (-1), (int) (short) 0);
    }

    @Test
    public void test03600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03600");
        int[] intArray4 = new int[] { (byte) 0, (byte) 1, (byte) 100, 100 };
        int[] intArray9 = new int[] { 100, (short) 100, (byte) 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test03601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03601");
        int[] intArray3 = new int[] { 10, ' ', 1 };
        int[] intArray10 = new int[] { (short) 0, 'a', (byte) -1, '4', (short) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (-1), (int) (byte) 10);
    }

    @Test
    public void test03602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03602");
        int[] intArray6 = new int[] { (short) 10, ' ', (byte) 0, 10, 10, '#' };
        int[] intArray13 = new int[] { 100, (short) 10, (byte) 1, (short) 0, 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 100, (int) (short) 100);
    }

    @Test
    public void test03603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03603");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 100, 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) 0, (int) (short) 10);
    }

    @Test
    public void test03604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03604");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { '4', (byte) 10, (byte) 0, 'a', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) 100, (int) (byte) -1);
    }

    @Test
    public void test03605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03605");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 'a', (byte) 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) 'a', (int) (short) 100);
    }

    @Test
    public void test03606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03606");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray3 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (byte) 1, (int) (short) 0);
    }

    @Test
    public void test03607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03607");
        int[] intArray2 = new int[] { (short) 0, 'a' };
        int[] intArray5 = new int[] { (short) 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (-1), (int) '#');
    }

    @Test
    public void test03608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03608");
        int[] intArray2 = new int[] { (byte) -1, (short) -1 };
        int[] intArray5 = new int[] { 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (-1), (int) (short) 1);
    }

    @Test
    public void test03609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03609");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray7 = new int[] { (short) 1, (short) 1, 100, (-1), 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) 100, (int) (short) -1);
    }

    @Test
    public void test03610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03610");
        int[] intArray2 = new int[] { (byte) 10, 'a' };
        int[] intArray4 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (byte) 100, 0);
    }

    @Test
    public void test03611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03611");
        int[] intArray6 = new int[] { (byte) 10, (byte) 10, (short) 100, ' ', 'a', (short) 1 };
        int[] intArray13 = new int[] { (short) 1, 'a', (short) 100, 0, 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 0, (int) (short) 0);
    }

    @Test
    public void test03612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03612");
        int[] intArray4 = new int[] { (byte) 0, 1, (byte) 10, (byte) -1 };
        int[] intArray10 = new int[] { (short) 100, ' ', (short) 0, (short) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) ' ', 1);
    }

    @Test
    public void test03613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03613");
        int[] intArray5 = new int[] { 1, (short) 10, (byte) 1, (-1), '#' };
        int[] intArray12 = new int[] { 0, 1, (short) 10, 'a', (byte) -1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) 'a', (int) (byte) -1);
    }

    @Test
    public void test03614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03614");
        int[] intArray1 = new int[] { 1 };
        int[] intArray5 = new int[] { 1, (short) 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (byte) 1, 100);
    }

    @Test
    public void test03615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03615");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray4 = new int[] { '4', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (short) 100, (int) (short) 10);
    }

    @Test
    public void test03616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03616");
        int[] intArray1 = new int[] { '#' };
        int[] intArray7 = new int[] { 'a', (byte) 100, 1, (short) 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) 0, (int) '4');
    }

    @Test
    public void test03617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03617");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (short) 0, (int) (byte) 100);
    }

    @Test
    public void test03618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03618");
        int[] intArray3 = new int[] { (short) 100, (byte) -1, (byte) 0 };
        int[] intArray9 = new int[] { (short) -1, (byte) 1, (byte) 10, 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (byte) 0, (-1));
    }

    @Test
    public void test03619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03619");
        int[] intArray5 = new int[] { 1, (byte) 100, (short) 10, (-1), 1 };
        int[] intArray11 = new int[] { (short) 10, (-1), '#', 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 0, (int) '#');
    }

    @Test
    public void test03620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03620");
        int[] intArray3 = new int[] { (-1), '#', 1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (-1), (int) (short) -1);
    }

    @Test
    public void test03621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03621");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (byte) 0, 0);
    }

    @Test
    public void test03622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03622");
        int[] intArray6 = new int[] { (byte) 100, (short) 0, ' ', (short) -1, '4', (short) 0 };
        int[] intArray8 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (byte) -1, 10);
    }

    @Test
    public void test03623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03623");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray5 = new int[] { (short) 10, 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) 1, (int) '4');
    }

    @Test
    public void test03624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03624");
        int[] intArray2 = new int[] { 0, 100 };
        int[] intArray6 = new int[] { 'a', 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) 'a', 100);
    }

    @Test
    public void test03625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03625");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray8 = new int[] { (byte) 0, '#', (byte) -1, (byte) -1, (short) 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) '4', 1);
    }

    @Test
    public void test03626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03626");
        int[] intArray1 = new int[] { 1 };
        int[] intArray6 = new int[] { (short) 100, '4', 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 0, 100);
    }

    @Test
    public void test03627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03627");
        int[] intArray3 = new int[] { (short) 0, 1, (byte) 10 };
        int[] intArray9 = new int[] { (short) -1, (short) 10, 0, (short) 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (byte) 100, (int) (byte) -1);
    }

    @Test
    public void test03628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03628");
        int[] intArray2 = new int[] { '#', '4' };
        int[] intArray4 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) '#', (-1));
    }

    @Test
    public void test03629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03629");
        int[] intArray6 = new int[] { (byte) 10, (short) 1, (byte) 10, (byte) 0, (short) 0, (short) -1 };
        int[] intArray13 = new int[] { 100, (short) 1, 10, (short) 10, 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 0, (int) (short) 10);
    }

    @Test
    public void test03630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03630");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray5 = new int[] { (byte) 0, ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) '4', (int) (short) -1);
    }

    @Test
    public void test03631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03631");
        int[] intArray4 = new int[] { (byte) 1, (byte) 1, (short) 0, (byte) 0 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, 0, (int) (short) 1);
    }

    @Test
    public void test03632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03632");
        int[] intArray5 = new int[] { (short) -1, (byte) 1, (short) -1, (byte) 10, (short) 1 };
        int[] intArray11 = new int[] { (short) 0, (short) 0, (short) 10, 'a', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 1, 0);
    }

    @Test
    public void test03633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03633");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 0, (int) ' ');
    }

    @Test
    public void test03634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03634");
        int[] intArray5 = new int[] { 10, (short) -1, (byte) 10, (short) 10, (short) 10 };
        int[] intArray7 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (short) 100, (int) (byte) 100);
    }

    @Test
    public void test03635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03635");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 100, (int) (byte) 0);
    }

    @Test
    public void test03636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03636");
        int[] intArray4 = new int[] { (short) -1, (byte) 1, 10, '#' };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (byte) 0, 10);
    }

    @Test
    public void test03637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03637");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 0, (-1), (short) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 0, (int) (short) 100);
    }

    @Test
    public void test03638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03638");
        int[] intArray4 = new int[] { (short) -1, (short) 100, 1, (byte) 1 };
        int[] intArray11 = new int[] { (byte) 0, '4', (short) 1, (short) 1, (short) 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) ' ', (int) (byte) 100);
    }

    @Test
    public void test03639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03639");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray7 = new int[] { 100, (byte) 1, 1, (short) 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) 10, 10);
    }

    @Test
    public void test03640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03640");
        int[] intArray4 = new int[] { (short) 0, (short) 1, (short) 1, (byte) 100 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, 10, (int) (byte) 0);
    }

    @Test
    public void test03641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03641");
        int[] intArray1 = new int[] { 1 };
        int[] intArray5 = new int[] { (short) 10, 'a', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) 'a', (int) (short) 100);
    }

    @Test
    public void test03642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03642");
        int[] intArray2 = new int[] { '4', (byte) 1 };
        int[] intArray5 = new int[] { (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 100, (int) (byte) -1);
    }

    @Test
    public void test03643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03643");
        int[] intArray5 = new int[] { (byte) 1, (short) 10, (byte) 10, ' ', 100 };
        int[] intArray9 = new int[] { (byte) -1, (short) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 1, (int) '#');
    }

    @Test
    public void test03644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03644");
        int[] intArray3 = new int[] { 0, ' ', (byte) 1 };
        int[] intArray5 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) 0, 100);
    }

    @Test
    public void test03645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03645");
        int[] intArray4 = new int[] { 'a', (byte) 1, (short) 100, ' ' };
        int[] intArray7 = new int[] { (byte) 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) 100, 10);
    }

    @Test
    public void test03646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03646");
        int[] intArray2 = new int[] { 1, 0 };
        int[] intArray9 = new int[] { 100, (byte) 0, (byte) 100, (byte) 100, (short) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 10, (int) (short) 1);
    }

    @Test
    public void test03647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03647");
        int[] intArray3 = new int[] { '#', (short) -1, (byte) 1 };
        int[] intArray9 = new int[] { (short) -1, (short) 10, (short) -1, '#', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 10, (int) 'a');
    }

    @Test
    public void test03648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03648");
        int[] intArray4 = new int[] { '4', (short) 10, (byte) 0, 10 };
        int[] intArray10 = new int[] { (short) -1, 1, (-1), 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (byte) 1, (int) ' ');
    }

    @Test
    public void test03649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03649");
        int[] intArray3 = new int[] { 10, (short) 100, '4' };
        int[] intArray7 = new int[] { (byte) 100, '4', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) 0, (int) (byte) 10);
    }

    @Test
    public void test03650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03650");
        int[] intArray6 = new int[] { (-1), (short) -1, (short) 100, (byte) 10, (short) 10, (short) 0 };
        int[] intArray12 = new int[] { 1, (byte) 0, (byte) 1, 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test03651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03651");
        int[] intArray6 = new int[] { (byte) -1, 1, '#', (-1), 100, (short) -1 };
        int[] intArray10 = new int[] { 0, ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 100, (int) (short) 10);
    }

    @Test
    public void test03652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03652");
        int[] intArray2 = new int[] { (short) 1, 'a' };
        int[] intArray6 = new int[] { 100, (byte) 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) 0, 10);
    }

    @Test
    public void test03653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03653");
        int[] intArray6 = new int[] { (short) -1, (byte) 0, (byte) 10, '4', (-1), '#' };
        int[] intArray9 = new int[] { (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test03654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03654");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { ' ', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (-1), (int) (byte) -1);
    }

    @Test
    public void test03655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03655");
        int[] intArray5 = new int[] { ' ', (byte) 1, (byte) 1, '#', (byte) -1 };
        int[] intArray9 = new int[] { (short) 0, '4', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 100, (int) (short) 1);
    }

    @Test
    public void test03656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03656");
        int[] intArray6 = new int[] { (short) 0, (short) 1, '4', (byte) 0, (byte) 10, 10 };
        int[] intArray8 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (byte) 1, (int) (short) 100);
    }

    @Test
    public void test03657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03657");
        int[] intArray3 = new int[] { 0, (byte) 10, (byte) -1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) 100, 10);
    }

    @Test
    public void test03658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03658");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 10, (byte) 1, '4', 'a', (short) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) 1, (int) (short) -1);
    }

    @Test
    public void test03659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03659");
        int[] intArray6 = new int[] { (byte) 0, 'a', (byte) -1, (-1), (byte) 10, (short) 1 };
        int[] intArray9 = new int[] { 'a', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (short) -1, (int) '4');
    }

    @Test
    public void test03660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03660");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray6 = new int[] { (byte) 10, '4', (byte) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (byte) 100, (int) (short) 100);
    }

    @Test
    public void test03661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03661");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { '4', '4', '#', (short) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) 0, (-1));
    }

    @Test
    public void test03662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03662");
        int[] intArray2 = new int[] { (byte) 100, '#' };
        int[] intArray6 = new int[] { 10, '#', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 100, 10);
    }

    @Test
    public void test03663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03663");
        int[] intArray3 = new int[] { ' ', (short) 0, '#' };
        int[] intArray9 = new int[] { (short) -1, '4', (short) -1, (short) 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (byte) 0, 0);
    }

    @Test
    public void test03664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03664");
        int[] intArray2 = new int[] { (byte) 1, (short) 1 };
        int[] intArray9 = new int[] { ' ', '4', (short) 0, (byte) -1, 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (short) 100, (-1));
    }

    @Test
    public void test03665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03665");
        int[] intArray6 = new int[] { (byte) 0, '#', (byte) -1, (-1), '#', (byte) 10 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) 1, (int) 'a');
    }

    @Test
    public void test03666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03666");
        int[] intArray2 = new int[] { (byte) -1, (byte) 1 };
        int[] intArray4 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (-1), (int) '4');
    }

    @Test
    public void test03667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03667");
        int[] intArray3 = new int[] { (-1), (byte) 100, 0 };
        int[] intArray8 = new int[] { '#', (byte) 0, 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) '4', (int) (byte) 0);
    }

    @Test
    public void test03668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03668");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) 10, (int) (short) 100);
    }

    @Test
    public void test03669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03669");
        int[] intArray2 = new int[] { 1, (byte) 1 };
        int[] intArray7 = new int[] { 10, (byte) -1, 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 0, (int) '#');
    }

    @Test
    public void test03670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03670");
        int[] intArray6 = new int[] { '4', (byte) 100, (short) 1, (byte) 10, (byte) 100, (byte) 100 };
        int[] intArray12 = new int[] { 'a', 0, 1, 'a', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (byte) 10, (int) 'a');
    }

    @Test
    public void test03671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03671");
        int[] intArray5 = new int[] { (short) 100, (short) 100, 0, (short) 1, (short) -1 };
        int[] intArray12 = new int[] { (short) 100, (byte) 0, (byte) 100, (short) 100, (short) 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) 'a', (int) 'a');
    }

    @Test
    public void test03672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03672");
        int[] intArray4 = new int[] { 100, (short) 100, (short) 10, (byte) 10 };
        int[] intArray6 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 10, (int) (byte) 0);
    }

    @Test
    public void test03673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03673");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray4 = new int[] { (-1), ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, 1, (int) (short) 0);
    }

    @Test
    public void test03674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03674");
        int[] intArray2 = new int[] { (short) 0, (short) 0 };
        int[] intArray9 = new int[] { (byte) 100, 10, (byte) -1, 100, '4', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (byte) 0, (int) '#');
    }

    @Test
    public void test03675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03675");
        int[] intArray2 = new int[] { (byte) 0, '4' };
        int[] intArray7 = new int[] { 'a', (byte) -1, ' ', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (short) -1, (-1));
    }

    @Test
    public void test03676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03676");
        int[] intArray3 = new int[] { 1, 100, ' ' };
        int[] intArray10 = new int[] { (short) 0, '#', 10, '4', (byte) 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) ' ', (int) '4');
    }

    @Test
    public void test03677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03677");
        int[] intArray6 = new int[] { (short) 10, (byte) 0, (byte) 10, (byte) 100, (short) 0, (-1) };
        int[] intArray8 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (byte) 100, 1);
    }

    @Test
    public void test03678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03678");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray5 = new int[] { (byte) 10, (-1), '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) ' ', (int) (short) 1);
    }

    @Test
    public void test03679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03679");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { '4', ' ', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) 0, (int) '4');
    }

    @Test
    public void test03680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03680");
        int[] intArray1 = new int[] { 1 };
        int[] intArray7 = new int[] { (short) 100, 10, '#', '#', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) 0, (int) (byte) 100);
    }

    @Test
    public void test03681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03681");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 'a', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (byte) 0, 1);
    }

    @Test
    public void test03682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03682");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (short) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (short) 100, (int) (short) 10);
    }

    @Test
    public void test03683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03683");
        int[] intArray5 = new int[] { 0, 100, (-1), 100, (short) -1 };
        int[] intArray11 = new int[] { (byte) 0, (byte) 10, (short) -1, (byte) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) -1, (int) (short) -1);
    }

    @Test
    public void test03684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03684");
        int[] intArray5 = new int[] { 1, '4', '4', '#', (byte) 10 };
        int[] intArray11 = new int[] { (byte) -1, (-1), (byte) 1, (byte) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 1, 1);
    }

    @Test
    public void test03685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03685");
        int[] intArray5 = new int[] { (short) 1, (byte) 10, 100, 1, 1 };
        int[] intArray7 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, 10, (int) (byte) 1);
    }

    @Test
    public void test03686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03686");
        int[] intArray4 = new int[] { '#', (short) 1, (short) -1, (short) 0 };
        int[] intArray10 = new int[] { 'a', (short) 100, (short) 1, (byte) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, 10, (int) (short) 10);
    }

    @Test
    public void test03687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03687");
        int[] intArray6 = new int[] { (byte) 0, (short) 0, 0, '#', '#', (short) 0 };
        int[] intArray11 = new int[] { 10, 'a', (byte) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 1, (int) (short) 10);
    }

    @Test
    public void test03688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03688");
        int[] intArray2 = new int[] { ' ', (byte) 1 };
        int[] intArray4 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (short) -1, (int) '4');
    }

    @Test
    public void test03689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03689");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 0, (int) (byte) 0);
    }

    @Test
    public void test03690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03690");
        int[] intArray4 = new int[] { (-1), (short) 1, 100, (-1) };
        int[] intArray8 = new int[] { '#', (byte) 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 0, 0);
    }

    @Test
    public void test03691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03691");
        int[] intArray2 = new int[] { 'a', (byte) 10 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) '#', (int) (short) 0);
    }

    @Test
    public void test03692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03692");
        int[] intArray5 = new int[] { 0, ' ', 1, (short) 10, (byte) 0 };
        int[] intArray11 = new int[] { (byte) -1, '4', '4', 'a', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) -1, (int) (byte) -1);
    }

    @Test
    public void test03693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03693");
        int[] intArray4 = new int[] { (short) 0, (short) -1, (byte) 0, (short) 1 };
        int[] intArray10 = new int[] { 10, (byte) 0, (short) -1, (-1), (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) '#', (int) '#');
    }

    @Test
    public void test03694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03694");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (byte) -1, (int) (short) -1);
    }

    @Test
    public void test03695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03695");
        int[] intArray6 = new int[] { '4', (short) 10, (short) -1, (short) 1, 1, 10 };
        int[] intArray12 = new int[] { '#', (short) 10, (short) 1, 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 10, (int) (byte) -1);
    }

    @Test
    public void test03696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03696");
        int[] intArray5 = new int[] { (short) -1, (byte) -1, 0, (-1), (short) 100 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (-1), 1);
    }

    @Test
    public void test03697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03697");
        int[] intArray4 = new int[] { 1, (short) 100, (byte) 1, (byte) 1 };
        int[] intArray9 = new int[] { (byte) 0, 100, 'a', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (-1), 10);
    }

    @Test
    public void test03698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03698");
        int[] intArray3 = new int[] { 100, 'a', 1 };
        int[] intArray7 = new int[] { (short) 1, '#', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) 1, 10);
    }

    @Test
    public void test03699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03699");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 0, (byte) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, 10, (int) (short) 0);
    }

    @Test
    public void test03700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03700");
        int[] intArray2 = new int[] { (byte) 0, (byte) 100 };
        int[] intArray9 = new int[] { 100, 100, '#', (short) 10, (short) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) 'a', (int) (short) 100);
    }

    @Test
    public void test03701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03701");
        int[] intArray6 = new int[] { (short) 1, (byte) 0, (byte) 100, (short) 10, (short) 1, (byte) 100 };
        int[] intArray10 = new int[] { 1, 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (short) 10, (int) (short) 1);
    }

    @Test
    public void test03702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03702");
        int[] intArray3 = new int[] { '4', (short) 10, (byte) 0 };
        int[] intArray9 = new int[] { (short) 10, (short) 0, 100, (-1), (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 0, (int) (byte) 0);
    }

    @Test
    public void test03703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03703");
        int[] intArray3 = new int[] { (byte) 1, (-1), 10 };
        int[] intArray6 = new int[] { ' ', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) 1, 100);
    }

    @Test
    public void test03704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03704");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) 0, (byte) 10, '4', (byte) -1, '#', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (-1), (int) '#');
    }

    @Test
    public void test03705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03705");
        int[] intArray4 = new int[] { (short) -1, (-1), (short) -1, 1 };
        int[] intArray6 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (short) 10, (int) (byte) 1);
    }

    @Test
    public void test03706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03706");
        int[] intArray5 = new int[] { (short) 1, (short) 0, (short) 10, (byte) 100, (byte) 0 };
        int[] intArray10 = new int[] { '4', (short) 1, (short) 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (byte) 100, (int) 'a');
    }

    @Test
    public void test03707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03707");
        int[] intArray5 = new int[] { (short) -1, (-1), (byte) 10, '4', (-1) };
        int[] intArray9 = new int[] { ' ', (short) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 0, (int) (short) 0);
    }

    @Test
    public void test03708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03708");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray8 = new int[] { 'a', (short) 10, (byte) -1, '4', (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) -1, (int) (short) 1);
    }

    @Test
    public void test03709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03709");
        int[] intArray5 = new int[] { 0, (short) 1, 10, (byte) 10, 100 };
        int[] intArray11 = new int[] { 1, (byte) 10, 0, (byte) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) 100, (int) (byte) 10);
    }

    @Test
    public void test03710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03710");
        int[] intArray5 = new int[] { (-1), ' ', (byte) 100, (short) 0, (byte) 100 };
        int[] intArray11 = new int[] { (-1), (byte) -1, (short) -1, (short) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) 10, 0);
    }

    @Test
    public void test03711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03711");
        int[] intArray4 = new int[] { (short) -1, 10, 1, 1 };
        int[] intArray10 = new int[] { '4', (byte) -1, (byte) 1, (byte) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) -1, (int) (byte) 100);
    }

    @Test
    public void test03712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03712");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray6 = new int[] { (byte) 1, '#', 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) ' ', 0);
    }

    @Test
    public void test03713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03713");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray6 = new int[] { 0, 100, 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) 'a', (int) (byte) 1);
    }

    @Test
    public void test03714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03714");
        int[] intArray3 = new int[] { 'a', '#', (-1) };
        int[] intArray6 = new int[] { '4', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, 0, (int) '#');
    }

    @Test
    public void test03715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03715");
        int[] intArray6 = new int[] { 0, (byte) 0, (byte) 0, (short) 10, '4', 0 };
        int[] intArray8 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 10, (int) (byte) 0);
    }

    @Test
    public void test03716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03716");
        int[] intArray6 = new int[] { (byte) 1, (short) 100, (short) 100, 100, 100, (byte) -1 };
        int[] intArray11 = new int[] { 1, (byte) 1, '#', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) ' ', 10);
    }

    @Test
    public void test03717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03717");
        int[] intArray2 = new int[] { (short) 1, (byte) 100 };
        int[] intArray4 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) '#', (int) '4');
    }

    @Test
    public void test03718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03718");
        int[] intArray6 = new int[] { ' ', 0, 100, (short) 100, 0, '4' };
        int[] intArray11 = new int[] { ' ', (short) 0, (-1), (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (byte) 10, (int) (byte) 10);
    }

    @Test
    public void test03719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03719");
        int[] intArray2 = new int[] { (short) 10, '#' };
        int[] intArray7 = new int[] { 1, '#', 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (short) 100, (int) ' ');
    }

    @Test
    public void test03720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03720");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray8 = new int[] { 10, (byte) 1, (byte) 100, (-1), (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 1, (int) (byte) 0);
    }

    @Test
    public void test03721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03721");
        int[] intArray3 = new int[] { 1, (byte) -1, (byte) -1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) ' ', (int) (byte) 1);
    }

    @Test
    public void test03722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03722");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { ' ', (byte) 1, (short) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 0, (int) ' ');
    }

    @Test
    public void test03723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03723");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (-1), 100);
    }

    @Test
    public void test03724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03724");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) -1, ' ', 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 10, (int) '#');
    }

    @Test
    public void test03725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03725");
        int[] intArray5 = new int[] { 10, (short) 100, (byte) 100, (byte) 1, ' ' };
        int[] intArray9 = new int[] { (short) 10, (byte) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 0, (int) (byte) 100);
    }

    @Test
    public void test03726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03726");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray5 = new int[] { (byte) 1, (short) 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) 'a', (int) '#');
    }

    @Test
    public void test03727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03727");
        int[] intArray3 = new int[] { (short) 1, (short) -1, ' ' };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, 100, (int) ' ');
    }

    @Test
    public void test03728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03728");
        int[] intArray3 = new int[] { ' ', 10, (short) 100 };
        int[] intArray7 = new int[] { (byte) 0, 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test03729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03729");
        int[] intArray1 = new int[] { '#' };
        int[] intArray4 = new int[] { 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (short) 10, (int) (byte) -1);
    }

    @Test
    public void test03730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03730");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) 0, ' ', '4', (byte) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) ' ', 0);
    }

    @Test
    public void test03731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03731");
        int[] intArray3 = new int[] { ' ', (short) 1, 10 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) '#', (int) (byte) 1);
    }

    @Test
    public void test03732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03732");
        int[] intArray6 = new int[] { 10, ' ', '#', 1, ' ', (short) 1 };
        int[] intArray10 = new int[] { (short) -1, (short) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 0, 1);
    }

    @Test
    public void test03733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03733");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray5 = new int[] { (short) 1, (short) 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) '4', (int) ' ');
    }

    @Test
    public void test03734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03734");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) -1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) ' ', (int) (short) 100);
    }

    @Test
    public void test03735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03735");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 0, (short) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) 'a', (int) 'a');
    }

    @Test
    public void test03736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03736");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) '4', 0);
    }

    @Test
    public void test03737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03737");
        int[] intArray2 = new int[] { (short) 0, (short) 100 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 10, (int) 'a');
    }

    @Test
    public void test03738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03738");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) -1, (int) (byte) 10);
    }

    @Test
    public void test03739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03739");
        int[] intArray5 = new int[] { (-1), (-1), (short) -1, 0, (byte) 100 };
        int[] intArray7 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, 100, (int) (short) -1);
    }

    @Test
    public void test03740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03740");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) 0, (short) -1, (byte) 100, (byte) -1, 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) 1, (int) (byte) 10);
    }

    @Test
    public void test03741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03741");
        int[] intArray3 = new int[] { (byte) 10, (byte) -1, (byte) 10 };
        int[] intArray7 = new int[] { (short) 100, (short) 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) 10, (int) (byte) -1);
    }

    @Test
    public void test03742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03742");
        int[] intArray2 = new int[] { (byte) 1, 1 };
        int[] intArray9 = new int[] { 10, (byte) 0, 100, (byte) 100, 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (short) 0, (int) (byte) 100);
    }

    @Test
    public void test03743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03743");
        int[] intArray2 = new int[] { (byte) 10, ' ' };
        int[] intArray9 = new int[] { 0, (short) 10, 100, 1, (short) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 0, (int) (short) 100);
    }

    @Test
    public void test03744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03744");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) 'a', (int) (short) 10);
    }

    @Test
    public void test03745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03745");
        int[] intArray4 = new int[] { (short) 100, 0, 1, (byte) -1 };
        int[] intArray6 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 1, 100);
    }

    @Test
    public void test03746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03746");
        int[] intArray2 = new int[] { (byte) 10, 10 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test03747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03747");
        int[] intArray5 = new int[] { (byte) 10, (byte) 10, (-1), (short) 10, (short) 1 };
        int[] intArray7 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (short) 0, 0);
    }

    @Test
    public void test03748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03748");
        int[] intArray4 = new int[] { (-1), 1, (byte) 100, (byte) -1 };
        int[] intArray11 = new int[] { 'a', 1, 10, 'a', (byte) 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, 10, (int) (byte) -1);
    }

    @Test
    public void test03749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03749");
        int[] intArray6 = new int[] { (short) 1, (byte) -1, '#', 10, (-1), 'a' };
        int[] intArray8 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 10, (-1));
    }

    @Test
    public void test03750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03750");
        int[] intArray2 = new int[] { (short) 1, (short) 1 };
        int[] intArray8 = new int[] { (-1), (short) -1, (byte) 10, (short) 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (byte) 10, (int) (short) 1);
    }

    @Test
    public void test03751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03751");
        int[] intArray5 = new int[] { (byte) 100, (short) 10, (byte) 0, (byte) 10, (short) 100 };
        int[] intArray8 = new int[] { 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) 10, (int) (byte) 100);
    }

    @Test
    public void test03752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03752");
        int[] intArray1 = new int[] { '#' };
        int[] intArray7 = new int[] { (byte) -1, '4', (short) 0, (short) 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, 100, (int) (byte) 10);
    }

    @Test
    public void test03753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03753");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) 10, 'a', '#', 0, (byte) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) 10, 10);
    }

    @Test
    public void test03754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03754");
        int[] intArray3 = new int[] { ' ', (byte) -1, (byte) 1 };
        int[] intArray6 = new int[] { (byte) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) ' ', (int) '4');
    }

    @Test
    public void test03755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03755");
        int[] intArray2 = new int[] { 0, 1 };
        int[] intArray5 = new int[] { '4', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (byte) 10, (int) '#');
    }

    @Test
    public void test03756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03756");
        int[] intArray4 = new int[] { 100, (short) 10, (-1), (byte) -1 };
        int[] intArray6 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 10, (int) (short) 0);
    }

    @Test
    public void test03757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03757");
        int[] intArray3 = new int[] { (byte) 1, (short) 0, (short) 1 };
        int[] intArray10 = new int[] { (short) 0, 100, 10, (byte) 1, (-1), (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (byte) 0, (int) (byte) 0);
    }

    @Test
    public void test03758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03758");
        int[] intArray4 = new int[] { (short) 100, (byte) 10, (short) 100, 0 };
        int[] intArray9 = new int[] { '#', 1, '4', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) -1, (int) (byte) 1);
    }

    @Test
    public void test03759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03759");
        int[] intArray4 = new int[] { (short) 0, '4', 100, 'a' };
        int[] intArray7 = new int[] { (short) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) 1, (int) (short) -1);
    }

    @Test
    public void test03760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03760");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray6 = new int[] { (byte) 10, (short) 1, (short) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (byte) 0, 0);
    }

    @Test
    public void test03761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03761");
        int[] intArray2 = new int[] { 0, ' ' };
        int[] intArray9 = new int[] { (short) -1, 100, (short) 10, ' ', (byte) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (byte) -1, 0);
    }

    @Test
    public void test03762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03762");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) 0, 10, (byte) 1, 1, (byte) 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) 1, (int) (byte) 10);
    }

    @Test
    public void test03763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03763");
        int[] intArray4 = new int[] { '#', (byte) 10, 1, 100 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, 0, (int) (byte) 1);
    }

    @Test
    public void test03764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03764");
        int[] intArray6 = new int[] { (short) 100, '4', (byte) -1, '4', (byte) 1, (byte) -1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) -1, 10);
    }

    @Test
    public void test03765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03765");
        int[] intArray2 = new int[] { (short) 100, 0 };
        int[] intArray4 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (-1), 0);
    }

    @Test
    public void test03766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03766");
        int[] intArray3 = new int[] { 'a', (byte) -1, (byte) 10 };
        int[] intArray8 = new int[] { (byte) 10, '4', 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (short) 100, 10);
    }

    @Test
    public void test03767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03767");
        int[] intArray2 = new int[] { (byte) 100, (byte) 100 };
        int[] intArray9 = new int[] { 0, '4', 1, '#', (short) 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 0, (int) (short) -1);
    }

    @Test
    public void test03768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03768");
        int[] intArray4 = new int[] { 0, (short) 10, (-1), (byte) 1 };
        int[] intArray7 = new int[] { (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) 'a', (int) (short) -1);
    }

    @Test
    public void test03769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03769");
        int[] intArray5 = new int[] { '4', (byte) 1, (byte) 100, (byte) 0, 100 };
        int[] intArray9 = new int[] { 100, (short) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 10, (int) (short) 0);
    }

    @Test
    public void test03770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03770");
        int[] intArray3 = new int[] { (short) 0, ' ', 'a' };
        int[] intArray8 = new int[] { (byte) 1, (-1), 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) '#', (int) (short) -1);
    }

    @Test
    public void test03771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03771");
        int[] intArray6 = new int[] { (short) 100, 1, 0, 100, (short) -1, (short) -1 };
        int[] intArray12 = new int[] { (short) 1, 'a', (byte) -1, 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) -1, (int) (short) 1);
    }

    @Test
    public void test03772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03772");
        int[] intArray2 = new int[] { (short) 0, (short) -1 };
        int[] intArray7 = new int[] { 0, (-1), (-1), '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 0, (int) '#');
    }

    @Test
    public void test03773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03773");
        int[] intArray6 = new int[] { (short) 1, (short) -1, (byte) -1, (byte) 1, (short) 100, (byte) 100 };
        int[] intArray13 = new int[] { (short) 0, (byte) 1, (short) 0, '4', (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (byte) 1, (int) ' ');
    }

    @Test
    public void test03774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03774");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 1, 1);
    }

    @Test
    public void test03775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03775");
        int[] intArray1 = new int[] { 0 };
        int[] intArray4 = new int[] { 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) '#', (int) (short) 100);
    }

    @Test
    public void test03776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03776");
        int[] intArray4 = new int[] { 10, (byte) 10, ' ', (short) -1 };
        int[] intArray10 = new int[] { ' ', ' ', (short) 100, (short) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) 'a', (int) '#');
    }

    @Test
    public void test03777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03777");
        int[] intArray5 = new int[] { (short) 1, 10, ' ', ' ', (short) 100 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (short) 0, 0);
    }

    @Test
    public void test03778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03778");
        int[] intArray1 = new int[] { '#' };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 100, (int) (short) -1);
    }

    @Test
    public void test03779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03779");
        int[] intArray5 = new int[] { (-1), (byte) 100, 100, (short) 1, ' ' };
        int[] intArray10 = new int[] { (-1), 100, (-1), (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 100, 10);
    }

    @Test
    public void test03780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03780");
        int[] intArray4 = new int[] { 1, (short) 1, 10, (byte) 1 };
        int[] intArray8 = new int[] { '4', (short) 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 0, (int) '4');
    }

    @Test
    public void test03781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03781");
        int[] intArray3 = new int[] { (short) 10, (byte) -1, 1 };
        int[] intArray5 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) '4', (int) 'a');
    }

    @Test
    public void test03782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03782");
        int[] intArray3 = new int[] { (short) -1, '4', (short) 10 };
        int[] intArray8 = new int[] { (short) 0, (short) 1, '#', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 0, (int) (short) 100);
    }

    @Test
    public void test03783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03783");
        int[] intArray2 = new int[] { (short) 0, (short) 0 };
        int[] intArray7 = new int[] { 100, '#', (byte) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) '#', 100);
    }

    @Test
    public void test03784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03784");
        int[] intArray1 = new int[] { 10 };
        int[] intArray7 = new int[] { 100, (short) 100, (short) 0, (-1), 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (-1), 0);
    }

    @Test
    public void test03785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03785");
        int[] intArray2 = new int[] { '4', (byte) 1 };
        int[] intArray4 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (short) 0, 100);
    }

    @Test
    public void test03786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03786");
        int[] intArray5 = new int[] { (short) 0, (short) -1, (byte) 1, (byte) 1, (short) -1 };
        int[] intArray8 = new int[] { ' ', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) 10, (-1));
    }

    @Test
    public void test03787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03787");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 0, (-1));
    }

    @Test
    public void test03788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03788");
        int[] intArray4 = new int[] { ' ', (byte) 10, (byte) 100, (short) 10 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) '#', 100);
    }

    @Test
    public void test03789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03789");
        int[] intArray2 = new int[] { 0, (byte) 10 };
        int[] intArray7 = new int[] { 1, (byte) 100, (short) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) -1, (int) '#');
    }

    @Test
    public void test03790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03790");
        int[] intArray5 = new int[] { (short) 100, (short) 100, (short) 10, (short) 0, 1 };
        int[] intArray9 = new int[] { 10, (byte) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 100, 0);
    }

    @Test
    public void test03791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03791");
        int[] intArray4 = new int[] { (byte) 100, (byte) 1, (short) 100, '#' };
        int[] intArray11 = new int[] { 'a', ' ', (byte) 1, ' ', (byte) 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) 10, (int) (byte) 10);
    }

    @Test
    public void test03792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03792");
        int[] intArray6 = new int[] { 100, '#', (-1), (short) 10, 100, (short) 10 };
        int[] intArray13 = new int[] { (short) 1, (short) 1, '4', (short) 0, (-1), (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (-1), (int) (byte) 10);
    }

    @Test
    public void test03793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03793");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray5 = new int[] { 100, 'a', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, 0, (int) (byte) 1);
    }

    @Test
    public void test03794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03794");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (byte) 100, 0);
    }

    @Test
    public void test03795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03795");
        int[] intArray5 = new int[] { '#', (short) 10, 1, (byte) -1, (byte) -1 };
        int[] intArray7 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) 'a', 0);
    }

    @Test
    public void test03796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03796");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 0, 0, 'a', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 0, (int) '4');
    }

    @Test
    public void test03797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03797");
        int[] intArray2 = new int[] { 10, (short) 0 };
        int[] intArray4 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (byte) 1, (int) '4');
    }

    @Test
    public void test03798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03798");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) -1, (short) 1, (byte) 1, (byte) 10, 'a', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, 0, (int) '4');
    }

    @Test
    public void test03799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03799");
        int[] intArray6 = new int[] { (short) 0, ' ', (short) 10, '#', (short) 10, 'a' };
        int[] intArray9 = new int[] { 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 0, (int) (byte) 10);
    }

    @Test
    public void test03800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03800");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) 100, (short) 0, (byte) 0, (byte) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) 100, 100);
    }

    @Test
    public void test03801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03801");
        int[] intArray2 = new int[] { (short) 100, (byte) 1 };
        int[] intArray4 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (byte) -1, (int) 'a');
    }

    @Test
    public void test03802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03802");
        int[] intArray2 = new int[] { (short) 10, 0 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test03803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03803");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { '4', (-1), (byte) 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) '4', 0);
    }

    @Test
    public void test03804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03804");
        int[] intArray4 = new int[] { (byte) 100, (byte) 10, (byte) 0, (byte) 1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (-1), (int) (byte) 0);
    }

    @Test
    public void test03805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03805");
        int[] intArray4 = new int[] { ' ', (byte) 100, (short) 0, (byte) -1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (short) 10, 100);
    }

    @Test
    public void test03806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03806");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 10, '#', '#', (short) 100, 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) 100, 10);
    }

    @Test
    public void test03807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03807");
        int[] intArray3 = new int[] { ' ', (byte) -1, 0 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) -1, (int) '4');
    }

    @Test
    public void test03808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03808");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { '#', '4', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) 10, (int) (short) 10);
    }

    @Test
    public void test03809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03809");
        int[] intArray5 = new int[] { 100, ' ', 0, (short) 10, '#' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) 0, (int) (byte) 1);
    }

    @Test
    public void test03810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03810");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 1, (short) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) '#', (int) '#');
    }

    @Test
    public void test03811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03811");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (byte) 0, (int) '4');
    }

    @Test
    public void test03812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03812");
        int[] intArray5 = new int[] { '#', (byte) 10, (short) 1, (byte) 10, 10 };
        int[] intArray10 = new int[] { (byte) -1, (short) 0, 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (byte) 0, (int) '#');
    }

    @Test
    public void test03813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03813");
        int[] intArray6 = new int[] { (short) -1, '4', (short) 10, (short) -1, (byte) 0, (byte) 1 };
        int[] intArray9 = new int[] { '#', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) '#', (int) (short) 100);
    }

    @Test
    public void test03814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03814");
        int[] intArray5 = new int[] { 10, (byte) 1, (byte) 100, (short) 0, (byte) 1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) -1, 100);
    }

    @Test
    public void test03815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03815");
        int[] intArray5 = new int[] { 'a', 10, (byte) 0, (short) 10, (byte) 0 };
        int[] intArray12 = new int[] { 100, (byte) -1, 100, (byte) 1, '4', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) '4', 0);
    }

    @Test
    public void test03816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03816");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 0, (short) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test03817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03817");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray3 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) ' ', 100);
    }

    @Test
    public void test03818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03818");
        int[] intArray2 = new int[] { 0, (byte) 100 };
        int[] intArray9 = new int[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (-1), (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 0, (int) (short) 1);
    }

    @Test
    public void test03819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03819");
        int[] intArray4 = new int[] { ' ', '4', 1, (short) 100 };
        int[] intArray6 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) '4', (int) (short) 100);
    }

    @Test
    public void test03820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03820");
        int[] intArray2 = new int[] { (short) 1, (short) 0 };
        int[] intArray4 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 100, (int) ' ');
    }

    @Test
    public void test03821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03821");
        int[] intArray6 = new int[] { '#', (byte) 1, (short) -1, (short) -1, '4', (byte) 10 };
        int[] intArray8 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) '#', 10);
    }

    @Test
    public void test03822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03822");
        int[] intArray5 = new int[] { (short) 1, (byte) 10, (short) 1, (-1), (short) 0 };
        int[] intArray7 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) -1, 100);
    }

    @Test
    public void test03823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03823");
        int[] intArray6 = new int[] { (short) -1, (short) 100, (byte) -1, 0, (-1), 10 };
        int[] intArray12 = new int[] { (short) 1, 1, (short) 10, '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) ' ', (int) '4');
    }

    @Test
    public void test03824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03824");
        int[] intArray4 = new int[] { ' ', (byte) -1, (byte) 100, '#' };
        int[] intArray6 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) '4', (int) ' ');
    }

    @Test
    public void test03825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03825");
        int[] intArray4 = new int[] { (short) -1, (byte) 100, 100, ' ' };
        int[] intArray8 = new int[] { (byte) 100, (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) 1, (int) '#');
    }

    @Test
    public void test03826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03826");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray7 = new int[] { 0, '4', (short) -1, 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, 1, (int) (short) 0);
    }

    @Test
    public void test03827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03827");
        int[] intArray6 = new int[] { (byte) 0, (short) 10, (short) -1, (byte) 10, 1, (short) 100 };
        int[] intArray12 = new int[] { 100, 1, (byte) 1, (short) 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 100, (int) (short) 0);
    }

    @Test
    public void test03828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03828");
        int[] intArray2 = new int[] { (-1), (byte) 0 };
        int[] intArray6 = new int[] { (short) -1, (short) 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) 1, (int) ' ');
    }

    @Test
    public void test03829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03829");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (short) 0, 0);
    }

    @Test
    public void test03830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03830");
        int[] intArray2 = new int[] { (short) 0, 100 };
        int[] intArray5 = new int[] { (short) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 1, 100);
    }

    @Test
    public void test03831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03831");
        int[] intArray5 = new int[] { (byte) 100, (-1), '#', (byte) 1, (short) 10 };
        int[] intArray12 = new int[] { ' ', '#', (-1), (short) 10, (byte) 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) '#', (int) (short) 10);
    }

    @Test
    public void test03832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03832");
        int[] intArray6 = new int[] { '4', ' ', (byte) 0, 10, ' ', 10 };
        int[] intArray10 = new int[] { (byte) 0, 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) 10, 10);
    }

    @Test
    public void test03833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03833");
        int[] intArray6 = new int[] { (byte) -1, (byte) 100, (short) -1, (short) 0, (short) 100, (byte) -1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, 100, 1);
    }

    @Test
    public void test03834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03834");
        int[] intArray6 = new int[] { '4', 10, 0, '4', 1, 'a' };
        int[] intArray10 = new int[] { 1, (-1), ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 0, (int) (byte) 10);
    }

    @Test
    public void test03835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03835");
        int[] intArray3 = new int[] { (byte) 0, 1, 10 };
        int[] intArray10 = new int[] { '4', 1, (short) 1, 10, (-1), (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) 'a', 10);
    }

    @Test
    public void test03836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03836");
        int[] intArray3 = new int[] { 0, (short) 1, (byte) -1 };
        int[] intArray7 = new int[] { '#', (short) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test03837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03837");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) -1, (int) '4');
    }

    @Test
    public void test03838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03838");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray7 = new int[] { (byte) 0, (short) 10, (byte) 1, (byte) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) 1, (int) (byte) 10);
    }

    @Test
    public void test03839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03839");
        int[] intArray1 = new int[] { 10 };
        int[] intArray6 = new int[] { 10, (byte) 100, '#', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (short) 10, 0);
    }

    @Test
    public void test03840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03840");
        int[] intArray1 = new int[] { 0 };
        int[] intArray4 = new int[] { 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 10, (int) (byte) 10);
    }

    @Test
    public void test03841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03841");
        int[] intArray3 = new int[] { 100, (short) 1, (byte) 0 };
        int[] intArray8 = new int[] { (short) 100, 0, (byte) 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) 'a', (int) (byte) 1);
    }

    @Test
    public void test03842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03842");
        int[] intArray5 = new int[] { (short) -1, '4', (byte) -1, (short) -1, (byte) 1 };
        int[] intArray12 = new int[] { (byte) 10, ' ', (short) 10, 'a', 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, 1, (int) 'a');
    }

    @Test
    public void test03843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03843");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, 100, (int) (byte) 100);
    }

    @Test
    public void test03844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03844");
        int[] intArray6 = new int[] { 1, 0, 1, (-1), (short) 0, (byte) 0 };
        int[] intArray13 = new int[] { (byte) 0, (short) 1, (byte) 10, 10, (short) 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 1, (int) (byte) 1);
    }

    @Test
    public void test03845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03845");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray8 = new int[] { (short) 100, ' ', (byte) 100, (short) 1, 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test03846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03846");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray6 = new int[] { (-1), (short) 10, (byte) 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 10, (int) (short) 1);
    }

    @Test
    public void test03847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03847");
        int[] intArray6 = new int[] { (byte) 10, ' ', '#', 1, 10, (byte) 100 };
        int[] intArray10 = new int[] { (byte) 0, 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 0, 10);
    }

    @Test
    public void test03848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03848");
        int[] intArray2 = new int[] { (-1), 10 };
        int[] intArray6 = new int[] { 'a', (byte) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test03849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03849");
        int[] intArray2 = new int[] { 100, (short) 10 };
        int[] intArray6 = new int[] { 'a', (short) 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) -1, (int) '4');
    }

    @Test
    public void test03850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03850");
        int[] intArray4 = new int[] { (-1), ' ', (short) 0, 'a' };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, 1, 100);
    }

    @Test
    public void test03851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03851");
        int[] intArray6 = new int[] { ' ', (byte) 100, (short) -1, 10, (short) -1, (byte) 0 };
        int[] intArray13 = new int[] { '4', (short) 100, 'a', 0, 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 0, (int) (short) 0);
    }

    @Test
    public void test03852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03852");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 0, (short) 100, 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 0, (int) (short) 10);
    }

    @Test
    public void test03853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03853");
        int[] intArray2 = new int[] { 'a', (byte) 0 };
        int[] intArray4 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (byte) 10, 100);
    }

    @Test
    public void test03854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03854");
        int[] intArray4 = new int[] { (byte) 0, ' ', (short) -1, 1 };
        int[] intArray10 = new int[] { (short) 10, ' ', 0, 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (byte) -1, (int) (byte) 100);
    }

    @Test
    public void test03855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03855");
        int[] intArray3 = new int[] { (short) 100, (short) -1, (byte) 100 };
        int[] intArray10 = new int[] { '#', (byte) -1, (short) 1, (byte) 0, (-1), (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 100, 100);
    }

    @Test
    public void test03856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03856");
        int[] intArray6 = new int[] { ' ', 0, (byte) 0, 100, (byte) 100, '4' };
        int[] intArray13 = new int[] { '4', (byte) 0, (short) 10, 1, (byte) 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (short) -1, (int) ' ');
    }

    @Test
    public void test03857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03857");
        int[] intArray4 = new int[] { 'a', (byte) 10, ' ', (short) -1 };
        int[] intArray9 = new int[] { (byte) 1, (short) 1, (byte) 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (byte) 0, 1);
    }

    @Test
    public void test03858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03858");
        int[] intArray1 = new int[] { 10 };
        int[] intArray6 = new int[] { '#', (short) 1, (-1), (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (byte) 10, (int) (byte) 10);
    }

    @Test
    public void test03859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03859");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) '#', (int) (short) 100);
    }

    @Test
    public void test03860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03860");
        int[] intArray2 = new int[] { (byte) 100, (-1) };
        int[] intArray5 = new int[] { (byte) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 100, (int) (short) 100);
    }

    @Test
    public void test03861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03861");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 0, 10);
    }

    @Test
    public void test03862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03862");
        int[] intArray2 = new int[] { (byte) 100, '4' };
        int[] intArray4 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (byte) 100, (int) (byte) -1);
    }

    @Test
    public void test03863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03863");
        int[] intArray2 = new int[] { (short) 10, '#' };
        int[] intArray6 = new int[] { 0, (short) 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test03864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03864");
        int[] intArray3 = new int[] { (short) 0, 'a', (byte) 1 };
        int[] intArray7 = new int[] { ' ', (byte) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) 10, (int) (byte) 100);
    }

    @Test
    public void test03865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03865");
        int[] intArray4 = new int[] { 1, (byte) 10, (short) 1, 100 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (short) 10, (int) '#');
    }

    @Test
    public void test03866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03866");
        int[] intArray1 = new int[] { '#' };
        int[] intArray7 = new int[] { 100, 1, (short) -1, 'a', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, 0, (int) (short) 10);
    }

    @Test
    public void test03867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03867");
        int[] intArray6 = new int[] { (short) 0, (short) 0, (byte) 0, (byte) 1, 10, (-1) };
        int[] intArray9 = new int[] { (-1), (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test03868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03868");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 100, '#', ' ', (short) 100, 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, 10, 0);
    }

    @Test
    public void test03869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03869");
        int[] intArray3 = new int[] { (short) -1, (short) 10, 0 };
        int[] intArray9 = new int[] { (byte) 100, (short) 10, (byte) 0, (byte) 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 10, (int) (short) 0);
    }

    @Test
    public void test03870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03870");
        int[] intArray2 = new int[] { '4', 100 };
        int[] intArray4 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (short) 100, (int) (short) 1);
    }

    @Test
    public void test03871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03871");
        int[] intArray3 = new int[] { (byte) 10, (short) 10, (byte) -1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) 100, (-1));
    }

    @Test
    public void test03872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03872");
        int[] intArray4 = new int[] { (-1), 0, 1, (-1) };
        int[] intArray9 = new int[] { (-1), (short) 0, (short) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test03873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03873");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) 'a', 0);
    }

    @Test
    public void test03874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03874");
        int[] intArray3 = new int[] { 10, 100, '#' };
        int[] intArray6 = new int[] { (short) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) 10, 10);
    }

    @Test
    public void test03875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03875");
        int[] intArray5 = new int[] { 0, 0, (byte) 0, (byte) 10, (short) 10 };
        int[] intArray11 = new int[] { (byte) 0, (short) 1, (short) -1, (byte) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) '#', (int) (short) -1);
    }

    @Test
    public void test03876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03876");
        int[] intArray2 = new int[] { (byte) 1, (short) 100 };
        int[] intArray8 = new int[] { (byte) 100, 100, (byte) -1, 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (byte) 0, 0);
    }

    @Test
    public void test03877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03877");
        int[] intArray1 = new int[] { 1 };
        int[] intArray5 = new int[] { (short) 100, (byte) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, 100, 100);
    }

    @Test
    public void test03878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03878");
        int[] intArray6 = new int[] { 0, (byte) 1, (short) 1, (byte) 100, (short) 0, 10 };
        int[] intArray11 = new int[] { (short) 10, (byte) 100, (byte) 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) '4', (int) (short) 10);
    }

    @Test
    public void test03879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03879");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 0, (short) 1, (short) 100, 1, (byte) 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) 'a', (int) '#');
    }

    @Test
    public void test03880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03880");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { '#', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (byte) -1, (int) (short) 10);
    }

    @Test
    public void test03881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03881");
        int[] intArray2 = new int[] { '#', 0 };
        int[] intArray6 = new int[] { (short) 1, '4', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) 10, 0);
    }

    @Test
    public void test03882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03882");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray6 = new int[] { '4', 10, (byte) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) ' ', 100);
    }

    @Test
    public void test03883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03883");
        int[] intArray3 = new int[] { (byte) -1, (short) 10, 10 };
        int[] intArray9 = new int[] { (short) 10, (byte) 10, (short) 100, '4', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 0, 100);
    }

    @Test
    public void test03884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03884");
        int[] intArray5 = new int[] { 1, 10, (byte) 1, (short) 100, (short) -1 };
        int[] intArray8 = new int[] { (short) 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) 0, (int) (byte) 100);
    }

    @Test
    public void test03885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03885");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray4 = new int[] { (-1), (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (short) 10, (int) (byte) 100);
    }

    @Test
    public void test03886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03886");
        int[] intArray4 = new int[] { 10, (short) 1, (short) 10, (short) 1 };
        int[] intArray11 = new int[] { 10, (short) 0, (short) -1, 1, (-1), 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (byte) 1, (int) (byte) -1);
    }

    @Test
    public void test03887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03887");
        int[] intArray6 = new int[] { (byte) -1, (short) 1, '4', (byte) 10, '#', '#' };
        int[] intArray9 = new int[] { (short) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) -1, (int) '4');
    }

    @Test
    public void test03888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03888");
        int[] intArray6 = new int[] { (byte) 100, (byte) -1, (short) -1, (-1), 1, ' ' };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) 1, 1);
    }

    @Test
    public void test03889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03889");
        int[] intArray5 = new int[] { (short) 100, (short) -1, (byte) 1, (byte) 0, (short) 1 };
        int[] intArray8 = new int[] { ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 0, 0);
    }

    @Test
    public void test03890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03890");
        int[] intArray5 = new int[] { (byte) 10, 100, (byte) -1, 100, (short) -1 };
        int[] intArray8 = new int[] { (byte) 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) 1, (int) (byte) 0);
    }

    @Test
    public void test03891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03891");
        int[] intArray5 = new int[] { (byte) -1, (-1), 1, '#', '4' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) '4', (int) '#');
    }

    @Test
    public void test03892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03892");
        int[] intArray4 = new int[] { 'a', (short) 1, (short) 0, (short) 0 };
        int[] intArray10 = new int[] { (byte) 10, 1, (byte) 100, '4', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) -1, (int) (byte) 10);
    }

    @Test
    public void test03893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03893");
        int[] intArray6 = new int[] { '#', 0, (short) 10, (short) 100, (short) 100, (byte) 100 };
        int[] intArray13 = new int[] { (byte) 10, (short) 100, (short) 10, 10, (short) 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 10, (int) (short) 100);
    }

    @Test
    public void test03894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03894");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray4 = new int[] { (short) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, 10, 10);
    }

    @Test
    public void test03895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03895");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (byte) 1, 0);
    }

    @Test
    public void test03896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03896");
        int[] intArray4 = new int[] { 0, (short) 0, '#', (byte) 1 };
        int[] intArray6 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) ' ', (int) (byte) 1);
    }

    @Test
    public void test03897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03897");
        int[] intArray2 = new int[] { (byte) 100, (-1) };
        int[] intArray7 = new int[] { (short) 0, (short) 1, (short) 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 0, (int) (short) 1);
    }

    @Test
    public void test03898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03898");
        int[] intArray5 = new int[] { (byte) 0, (byte) 10, '4', (byte) 10, ' ' };
        int[] intArray12 = new int[] { 100, (short) -1, ' ', '#', '4', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, 10, (int) (short) 1);
    }

    @Test
    public void test03899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03899");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { '4', (short) 10, (byte) 10, (byte) 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) 1, (int) (byte) 100);
    }

    @Test
    public void test03900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03900");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray8 = new int[] { (short) -1, (byte) 0, (byte) 10, (byte) -1, (byte) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 100, (int) (byte) 10);
    }

    @Test
    public void test03901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03901");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) '#', (-1));
    }

    @Test
    public void test03902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03902");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 1, (-1), 'a', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 10, (int) '4');
    }

    @Test
    public void test03903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03903");
        int[] intArray4 = new int[] { 100, (short) 1, (byte) 0, (short) 100 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, 0, (int) 'a');
    }

    @Test
    public void test03904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03904");
        int[] intArray3 = new int[] { 0, (short) 10, (short) 1 };
        int[] intArray6 = new int[] { 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) -1, 0);
    }

    @Test
    public void test03905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03905");
        int[] intArray5 = new int[] { 0, (short) 0, 100, (byte) 10, (short) 1 };
        int[] intArray9 = new int[] { (byte) 100, ' ', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 0, 0);
    }

    @Test
    public void test03906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03906");
        int[] intArray2 = new int[] { 0, (byte) -1 };
        int[] intArray7 = new int[] { (short) 100, (byte) 0, (byte) 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 0, (int) (byte) 10);
    }

    @Test
    public void test03907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03907");
        int[] intArray6 = new int[] { (short) 0, (byte) 0, '#', 0, (-1), 1 };
        int[] intArray12 = new int[] { 100, (byte) 1, '#', (byte) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (byte) -1, 0);
    }

    @Test
    public void test03908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03908");
        int[] intArray2 = new int[] { 1, 1 };
        int[] intArray6 = new int[] { (byte) 10, 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 0, (-1));
    }

    @Test
    public void test03909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03909");
        int[] intArray1 = new int[] { '#' };
        int[] intArray8 = new int[] { (-1), 100, 10, 1, (short) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) -1, (int) (short) 100);
    }

    @Test
    public void test03910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03910");
        int[] intArray2 = new int[] { (short) -1, (short) -1 };
        int[] intArray7 = new int[] { (short) 100, (short) 10, 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) -1, (int) '4');
    }

    @Test
    public void test03911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03911");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) 100, ' ', (short) 1, 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test03912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03912");
        int[] intArray5 = new int[] { (byte) 1, ' ', (byte) 0, (short) -1, 1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 0, 1);
    }

    @Test
    public void test03913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03913");
        int[] intArray5 = new int[] { (-1), (short) 0, (byte) 10, (byte) -1, (byte) 0 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 0, (int) (byte) 0);
    }

    @Test
    public void test03914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03914");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, (byte) 100, 0, 0 };
        int[] intArray11 = new int[] { ' ', (short) 0, (-1), 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 1, (int) (byte) 0);
    }

    @Test
    public void test03915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03915");
        int[] intArray1 = new int[] { '#' };
        int[] intArray4 = new int[] { ' ', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) -1, 0);
    }

    @Test
    public void test03916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03916");
        int[] intArray3 = new int[] { (short) 1, 0, (short) 0 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) -1, (int) (byte) 0);
    }

    @Test
    public void test03917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03917");
        int[] intArray3 = new int[] { '#', (byte) 1, (byte) 1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) 1, (-1));
    }

    @Test
    public void test03918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03918");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray4 = new int[] { 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 0, (int) (byte) 1);
    }

    @Test
    public void test03919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03919");
        int[] intArray4 = new int[] { 1, 'a', (byte) -1, (short) 1 };
        int[] intArray7 = new int[] { (short) 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) '4', (int) (byte) 1);
    }

    @Test
    public void test03920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03920");
        int[] intArray4 = new int[] { (short) -1, (byte) 100, (byte) 1, (-1) };
        int[] intArray11 = new int[] { 'a', (byte) 100, ' ', '4', '#', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) 100, (int) ' ');
    }

    @Test
    public void test03921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03921");
        int[] intArray5 = new int[] { (byte) -1, (short) -1, 100, (short) 100, (byte) 10 };
        int[] intArray11 = new int[] { (short) 0, (byte) -1, (short) 1, 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 10, (int) '4');
    }

    @Test
    public void test03922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03922");
        int[] intArray3 = new int[] { '#', (byte) 1, (short) 1 };
        int[] intArray9 = new int[] { (short) 0, 'a', (byte) 0, (short) 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test03923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03923");
        int[] intArray6 = new int[] { 'a', 10, '#', (short) 10, (short) 1, (short) 10 };
        int[] intArray13 = new int[] { (short) 100, '#', '4', (-1), (byte) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (-1), 10);
    }

    @Test
    public void test03924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03924");
        int[] intArray2 = new int[] { (byte) 100, (short) 1 };
        int[] intArray4 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test03925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03925");
        int[] intArray3 = new int[] { '4', (byte) -1, 'a' };
        int[] intArray10 = new int[] { ' ', 10, 10, (short) 10, (byte) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 1, (int) (byte) 1);
    }

    @Test
    public void test03926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03926");
        int[] intArray2 = new int[] { 0, '#' };
        int[] intArray6 = new int[] { (byte) 0, (short) 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (short) 10, (int) 'a');
    }

    @Test
    public void test03927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03927");
        int[] intArray2 = new int[] { 1, '4' };
        int[] intArray5 = new int[] { (byte) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (-1), (-1));
    }

    @Test
    public void test03928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03928");
        int[] intArray4 = new int[] { (-1), (byte) -1, (short) 10, (byte) 1 };
        int[] intArray7 = new int[] { 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) 10, 100);
    }

    @Test
    public void test03929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03929");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) '#', 10);
    }

    @Test
    public void test03930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03930");
        int[] intArray2 = new int[] { (short) -1, 10 };
        int[] intArray7 = new int[] { 10, (byte) 10, 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (short) 0, (int) (byte) 1);
    }

    @Test
    public void test03931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03931");
        int[] intArray6 = new int[] { 'a', '#', 10, (short) 100, (short) -1, (byte) -1 };
        int[] intArray11 = new int[] { 1, 100, (short) 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 0, (int) (short) 1);
    }

    @Test
    public void test03932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03932");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray4 = new int[] { (-1), (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) -1, (int) (byte) -1);
    }

    @Test
    public void test03933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03933");
        int[] intArray5 = new int[] { '4', 100, (byte) 100, 100, 0 };
        int[] intArray12 = new int[] { 10, (byte) 0, (byte) 1, '#', (short) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, 10, (int) (byte) 1);
    }

    @Test
    public void test03934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03934");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, 1, (int) (short) 1);
    }

    @Test
    public void test03935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03935");
        int[] intArray4 = new int[] { (byte) 1, (byte) -1, (short) 1, (byte) -1 };
        int[] intArray7 = new int[] { (short) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) 100, 10);
    }

    @Test
    public void test03936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03936");
        int[] intArray4 = new int[] { '4', 'a', (short) 1, (byte) -1 };
        int[] intArray8 = new int[] { (byte) -1, ' ', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test03937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03937");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray8 = new int[] { (short) 1, 0, (byte) 1, 10, (short) 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 10, (int) (byte) 0);
    }

    @Test
    public void test03938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03938");
        int[] intArray3 = new int[] { 100, (short) 1, (short) 1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) 10, (int) (byte) 10);
    }

    @Test
    public void test03939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03939");
        int[] intArray6 = new int[] { 0, (byte) 1, (-1), (byte) -1, (short) -1, (byte) 100 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) 1, (-1));
    }

    @Test
    public void test03940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03940");
        int[] intArray6 = new int[] { 'a', '4', ' ', 1, (short) 10, 100 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) 'a', 0);
    }

    @Test
    public void test03941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03941");
        int[] intArray5 = new int[] { (byte) 10, (byte) 100, (byte) -1, 1, 0 };
        int[] intArray9 = new int[] { (short) 10, 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 0, 1);
    }

    @Test
    public void test03942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03942");
        int[] intArray6 = new int[] { (short) -1, 1, 0, (short) 0, (short) 1, (byte) 100 };
        int[] intArray9 = new int[] { (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (short) 10, (int) (short) 1);
    }

    @Test
    public void test03943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03943");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray8 = new int[] { 10, 100, (byte) 1, (short) 100, (short) 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) '#', (int) (short) -1);
    }

    @Test
    public void test03944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03944");
        int[] intArray6 = new int[] { ' ', (byte) 100, (short) 10, 100, '#', (byte) 100 };
        int[] intArray8 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 100, (int) (byte) 100);
    }

    @Test
    public void test03945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03945");
        int[] intArray6 = new int[] { (byte) 100, (short) 100, (short) 0, 0, (short) 10, (byte) 10 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) 10, (int) ' ');
    }

    @Test
    public void test03946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03946");
        int[] intArray5 = new int[] { (byte) 10, ' ', (short) 0, '#', (byte) 100 };
        int[] intArray11 = new int[] { ' ', (byte) 10, 'a', '4', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) 10, (int) (byte) 10);
    }

    @Test
    public void test03947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03947");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray4 = new int[] { 'a', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 1, 0);
    }

    @Test
    public void test03948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03948");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, 100, (int) '4');
    }

    @Test
    public void test03949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03949");
        int[] intArray6 = new int[] { (short) 0, '#', 'a', (short) 1, (byte) 1, (short) 0 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, 1, (int) (short) 1);
    }

    @Test
    public void test03950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03950");
        int[] intArray2 = new int[] { (short) 100, '#' };
        int[] intArray9 = new int[] { (byte) 10, (short) 0, (short) 100, (short) 100, (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (-1), 10);
    }

    @Test
    public void test03951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03951");
        int[] intArray5 = new int[] { 0, (byte) 100, (byte) -1, (byte) 1, '#' };
        int[] intArray9 = new int[] { (short) 0, 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) ' ', 0);
    }

    @Test
    public void test03952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03952");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray6 = new int[] { 10, 100, (byte) 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 0, 10);
    }

    @Test
    public void test03953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03953");
        int[] intArray5 = new int[] { '#', (short) 100, (byte) 0, (-1), 'a' };
        int[] intArray7 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) '#', (-1));
    }

    @Test
    public void test03954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03954");
        int[] intArray3 = new int[] { (byte) 10, (short) 0, (byte) 100 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, 0, 100);
    }

    @Test
    public void test03955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03955");
        int[] intArray3 = new int[] { (short) 0, (-1), 1 };
        int[] intArray6 = new int[] { ' ', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) -1, (int) '4');
    }

    @Test
    public void test03956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03956");
        int[] intArray5 = new int[] { (byte) -1, 'a', (byte) 1, (byte) 1, (byte) 0 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (-1), (int) (byte) 10);
    }

    @Test
    public void test03957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03957");
        int[] intArray5 = new int[] { (byte) 100, 1, ' ', (short) 10, (short) 10 };
        int[] intArray11 = new int[] { (byte) -1, 'a', (byte) 10, (byte) 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 1, (int) (byte) 100);
    }

    @Test
    public void test03958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03958");
        int[] intArray4 = new int[] { ' ', ' ', 'a', 'a' };
        int[] intArray8 = new int[] { 1, (short) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 10, (int) (byte) 100);
    }

    @Test
    public void test03959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03959");
        int[] intArray4 = new int[] { 'a', 'a', (short) 1, 100 };
        int[] intArray8 = new int[] { (short) -1, (byte) 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test03960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03960");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (-1), (int) (byte) 1);
    }

    @Test
    public void test03961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03961");
        int[] intArray6 = new int[] { 1, 'a', 10, (byte) 0, (byte) 1, 0 };
        int[] intArray10 = new int[] { '4', (short) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (short) -1, (int) (byte) 100);
    }

    @Test
    public void test03962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03962");
        int[] intArray3 = new int[] { (-1), (-1), 100 };
        int[] intArray8 = new int[] { (short) 100, (byte) 100, (byte) 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) '#', (int) 'a');
    }

    @Test
    public void test03963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03963");
        int[] intArray2 = new int[] { (byte) 1, ' ' };
        int[] intArray5 = new int[] { '4', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 0, (int) 'a');
    }

    @Test
    public void test03964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03964");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (byte) -1, 10, 'a', (byte) 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) 10, 100);
    }

    @Test
    public void test03965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03965");
        int[] intArray5 = new int[] { 0, (byte) 100, 100, (short) 1, (short) 100 };
        int[] intArray11 = new int[] { (short) 0, '4', ' ', (byte) 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 0, 10);
    }

    @Test
    public void test03966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03966");
        int[] intArray3 = new int[] { 100, 100, (short) 0 };
        int[] intArray6 = new int[] { '#', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, 0, (int) (byte) 10);
    }

    @Test
    public void test03967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03967");
        int[] intArray3 = new int[] { (byte) 10, 1, ' ' };
        int[] intArray9 = new int[] { (short) -1, (byte) 100, (byte) -1, (short) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 0, (int) (byte) 1);
    }

    @Test
    public void test03968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03968");
        int[] intArray5 = new int[] { 0, 'a', '4', (byte) 100, '4' };
        int[] intArray12 = new int[] { 1, (byte) 10, (byte) -1, (byte) -1, ' ', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) 'a', (int) (short) 100);
    }

    @Test
    public void test03969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03969");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (short) 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) ' ', (int) (byte) 1);
    }

    @Test
    public void test03970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03970");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) -1, (byte) -1, 1, '4', 'a', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (-1), 0);
    }

    @Test
    public void test03971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03971");
        int[] intArray2 = new int[] { '#', 1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (-1), (int) '#');
    }

    @Test
    public void test03972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03972");
        int[] intArray5 = new int[] { (byte) -1, 1, (byte) 1, '#', '4' };
        int[] intArray9 = new int[] { (byte) 1, (-1), 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (byte) -1, (int) (short) 1);
    }

    @Test
    public void test03973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03973");
        int[] intArray3 = new int[] { (-1), (byte) -1, 0 };
        int[] intArray8 = new int[] { (short) 10, 10, (short) 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) 'a', (int) (byte) 1);
    }

    @Test
    public void test03974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03974");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 10, 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) -1, (int) (byte) 0);
    }

    @Test
    public void test03975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03975");
        int[] intArray2 = new int[] { (byte) 100, (byte) 0 };
        int[] intArray8 = new int[] { (byte) 10, (byte) 10, '4', (short) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test03976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03976");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (short) -1, (int) (byte) 10);
    }

    @Test
    public void test03977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03977");
        int[] intArray6 = new int[] { (short) 1, (byte) -1, (byte) -1, '#', (byte) 1, '#' };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) 1, 0);
    }

    @Test
    public void test03978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03978");
        int[] intArray3 = new int[] { 1, (short) 100, 'a' };
        int[] intArray5 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) 1, (int) (short) 10);
    }

    @Test
    public void test03979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03979");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (-1), (byte) -1, (short) 0, (byte) -1, 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) ' ', 0);
    }

    @Test
    public void test03980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03980");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray7 = new int[] { 1, (-1), 0, (byte) 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) 'a', (int) (short) -1);
    }

    @Test
    public void test03981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03981");
        int[] intArray4 = new int[] { '4', 0, ' ', 'a' };
        int[] intArray7 = new int[] { 'a', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) 0, (int) '#');
    }

    @Test
    public void test03982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03982");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 1, 0);
    }

    @Test
    public void test03983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03983");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int[] intArray5 = new int[] { (byte) -1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (byte) 100, 10);
    }

    @Test
    public void test03984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03984");
        int[] intArray1 = new int[] { 10 };
        int[] intArray5 = new int[] { (-1), 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (-1), (int) (short) 100);
    }

    @Test
    public void test03985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03985");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray6 = new int[] { (short) 1, 10, 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (short) -1, (int) ' ');
    }

    @Test
    public void test03986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03986");
        int[] intArray5 = new int[] { '#', 0, (short) 1, (byte) -1, (short) 0 };
        int[] intArray7 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) -1, (int) (byte) -1);
    }

    @Test
    public void test03987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03987");
        int[] intArray6 = new int[] { (short) 1, (byte) -1, (byte) 0, (short) 0, 'a', 'a' };
        int[] intArray9 = new int[] { (byte) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (-1), (int) (byte) -1);
    }

    @Test
    public void test03988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03988");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 0, (-1) };
        int[] intArray11 = new int[] { 100, (short) -1, (byte) 0, '4', (byte) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) 'a', (int) (byte) 100);
    }

    @Test
    public void test03989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03989");
        int[] intArray4 = new int[] { '4', '4', (short) 100, (byte) 0 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) ' ', (int) (short) 0);
    }

    @Test
    public void test03990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03990");
        int[] intArray3 = new int[] { (byte) 10, (byte) 100, '#' };
        int[] intArray5 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) -1, (-1));
    }

    @Test
    public void test03991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03991");
        int[] intArray6 = new int[] { '4', (byte) 10, ' ', (byte) -1, (short) 10, (short) 100 };
        int[] intArray10 = new int[] { '4', (byte) 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) '#', (int) (short) 100);
    }

    @Test
    public void test03992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03992");
        int[] intArray3 = new int[] { 1, '#', (byte) 1 };
        int[] intArray6 = new int[] { (byte) -1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) 10, (int) (byte) 0);
    }

    @Test
    public void test03993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03993");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray4 = new int[] { 'a', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) -1, (int) ' ');
    }

    @Test
    public void test03994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03994");
        int[] intArray5 = new int[] { (short) 10, '#', (byte) 0, '#', 10 };
        int[] intArray10 = new int[] { (short) 10, 'a', ' ', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 100, (int) (byte) 1);
    }

    @Test
    public void test03995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03995");
        int[] intArray4 = new int[] { (short) 1, 0, (short) 0, (byte) 0 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (byte) 0, (int) (byte) -1);
    }

    @Test
    public void test03996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03996");
        int[] intArray4 = new int[] { (short) 0, 10, 10, (byte) 10 };
        int[] intArray6 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (short) 0, (int) '4');
    }

    @Test
    public void test03997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03997");
        int[] intArray5 = new int[] { '4', 1, (byte) 10, (byte) 0, ' ' };
        int[] intArray10 = new int[] { (-1), (-1), '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (byte) -1, (int) (byte) 10);
    }

    @Test
    public void test03998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03998");
        int[] intArray3 = new int[] { (byte) 0, '4', (short) -1 };
        int[] intArray5 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) -1, (int) (byte) 1);
    }

    @Test
    public void test03999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test03999");
        int[] intArray5 = new int[] { (byte) 1, '4', (byte) 100, 10, (byte) 1 };
        int[] intArray12 = new int[] { ' ', (short) 1, 'a', (byte) 10, (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) '4', 0);
    }

    @Test
    public void test04000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test04000");
        int[] intArray5 = new int[] { (short) 10, (byte) 1, (short) 1, (short) 100, 'a' };
        int[] intArray12 = new int[] { 10, 100, (short) -1, 0, (short) 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) 'a', (-1));
    }
}

