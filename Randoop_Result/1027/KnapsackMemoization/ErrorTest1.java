package KnapsackMemoization;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test00501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00501");
        int[] intArray2 = new int[] { (short) -1, 100 };
        int[] intArray5 = new int[] { (short) 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) -1, 0);
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00502");
        int[] intArray3 = new int[] { (short) 10, '4', '4' };
        int[] intArray7 = new int[] { (byte) 0, 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 0, 10);
    }

    @Test
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00503");
        int[] intArray1 = new int[] { 0 };
        int[] intArray8 = new int[] { 1, (byte) 1, 10, ' ', (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) ' ', 0);
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00504");
        int[] intArray6 = new int[] { (byte) 1, 1, (short) -1, (short) 10, 1, (short) 10 };
        int[] intArray13 = new int[] { (short) 10, ' ', (short) 1, (short) -1, (short) 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 10, (-1));
    }

    @Test
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00505");
        int[] intArray3 = new int[] { (short) -1, 0, (byte) 1 };
        int[] intArray9 = new int[] { 10, 1, 1, (short) 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 10, (int) '4');
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00506");
        int[] intArray4 = new int[] { (byte) -1, 1, (short) -1, 'a' };
        int[] intArray9 = new int[] { ' ', 'a', (short) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (byte) 0, 0);
    }

    @Test
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00507");
        int[] intArray5 = new int[] { 10, (short) -1, (short) -1, (short) 0, (short) 100 };
        int[] intArray10 = new int[] { (short) 100, (short) -1, (byte) 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (-1), (int) 'a');
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00508");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 1, (int) '#');
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00509");
        int[] intArray2 = new int[] { 1, 0 };
        int[] intArray6 = new int[] { 100, (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) -1, (int) (byte) 10);
    }

    @Test
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00510");
        int[] intArray6 = new int[] { '#', ' ', (byte) 1, (byte) 0, (byte) 10, (short) 1 };
        int[] intArray13 = new int[] { 0, 'a', (-1), (byte) 0, 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (byte) 10, (int) (byte) 10);
    }

    @Test
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00511");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (-1), (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (byte) -1, (-1));
    }

    @Test
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00512");
        int[] intArray5 = new int[] { (short) 100, (byte) 10, '#', (byte) -1, 'a' };
        int[] intArray11 = new int[] { ' ', 100, (byte) 0, '#', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) 10, 0);
    }

    @Test
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00513");
        int[] intArray2 = new int[] { 1, (byte) 10 };
        int[] intArray7 = new int[] { (byte) 1, (short) 10, (short) 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 0, (int) (short) 0);
    }

    @Test
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00514");
        int[] intArray2 = new int[] { (short) 1, 10 };
        int[] intArray7 = new int[] { (byte) 100, '4', (byte) 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 100, (int) (byte) 100);
    }

    @Test
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00515");
        int[] intArray5 = new int[] { (byte) 100, (byte) 0, (byte) 1, (short) -1, (-1) };
        int[] intArray11 = new int[] { (byte) 10, (short) 1, (byte) 1, 'a', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00516");
        int[] intArray2 = new int[] { (byte) 1, (short) 10 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) ' ', (int) (short) -1);
    }

    @Test
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00517");
        int[] intArray4 = new int[] { (-1), (byte) 1, (byte) 10, 100 };
        int[] intArray10 = new int[] { (byte) 100, (short) 0, (byte) 10, (short) 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) 0, 0);
    }

    @Test
    public void test00518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00518");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 10, '4', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, 100, (int) (short) 1);
    }

    @Test
    public void test00519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00519");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray5 = new int[] { (short) 0, '#', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) 1, (int) (byte) 10);
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00520");
        int[] intArray2 = new int[] { (short) 100, 0 };
        int[] intArray8 = new int[] { (short) 100, ' ', (byte) 0, 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 10, (int) (byte) 0);
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00521");
        int[] intArray4 = new int[] { (byte) 100, (byte) 0, (short) 1, (byte) -1 };
        int[] intArray10 = new int[] { (byte) 10, '#', (byte) -1, 'a', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) 'a', 1);
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00522");
        int[] intArray6 = new int[] { (short) 100, ' ', (short) 1, 10, (short) 100, (byte) -1 };
        int[] intArray10 = new int[] { ' ', (short) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (short) 0, (int) '4');
    }

    @Test
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00523");
        int[] intArray5 = new int[] { '4', 1, (short) 10, (short) 0, (byte) -1 };
        int[] intArray10 = new int[] { (short) 10, (byte) -1, 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 1, (-1));
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00524");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 1, (short) 10, '4', 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) 0, (int) (short) 100);
    }

    @Test
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00525");
        int[] intArray6 = new int[] { '4', (byte) 10, 100, (short) 10, ' ', '#' };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) '#', (int) '4');
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00526");
        int[] intArray3 = new int[] { 'a', '#', (byte) -1 };
        int[] intArray8 = new int[] { 'a', (short) 10, '#', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (short) 10, (int) (short) 10);
    }

    @Test
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00527");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray6 = new int[] { (short) 100, (byte) 100, (byte) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (byte) 1, (int) (short) 10);
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00528");
        int[] intArray2 = new int[] { 'a', 1 };
        int[] intArray9 = new int[] { ' ', (short) 1, (short) 100, (short) 100, (-1), 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00529");
        int[] intArray1 = new int[] { 1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) 100, (int) ' ');
    }

    @Test
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00530");
        int[] intArray4 = new int[] { (short) 1, 'a', (byte) -1, '#' };
        int[] intArray10 = new int[] { (byte) 10, 10, 1, (short) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) 100, (int) '#');
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00531");
        int[] intArray4 = new int[] { ' ', (byte) 1, 'a', 0 };
        int[] intArray6 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00532");
        int[] intArray5 = new int[] { (short) 0, 0, (short) 100, 100, (-1) };
        int[] intArray10 = new int[] { 'a', (short) 0, 'a', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (byte) 0, 0);
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00533");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray7 = new int[] { 0, (short) 0, 0, (short) 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) 100, (-1));
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00534");
        int[] intArray3 = new int[] { 1, 0, (short) -1 };
        int[] intArray7 = new int[] { '4', 'a', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 100, (-1));
    }

    @Test
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00535");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) '#', (int) ' ');
    }

    @Test
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00536");
        int[] intArray3 = new int[] { ' ', (byte) 0, ' ' };
        int[] intArray10 = new int[] { '#', 10, (short) 100, 100, (short) 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 0, 10);
    }

    @Test
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00537");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { ' ', (byte) 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, 0, (int) (short) 10);
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00538");
        int[] intArray4 = new int[] { (byte) 0, (byte) 1, (short) 0, 10 };
        int[] intArray9 = new int[] { (byte) 10, 0, (byte) 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) 0, (int) (short) 0);
    }

    @Test
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00539");
        int[] intArray4 = new int[] { 'a', 10, 0, (byte) 100 };
        int[] intArray7 = new int[] { (byte) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) 10, (int) (byte) 1);
    }

    @Test
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00540");
        int[] intArray5 = new int[] { (-1), (short) 100, 'a', (short) 0, (byte) 10 };
        int[] intArray11 = new int[] { (short) 10, 100, 0, '4', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) 'a', (int) '#');
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00541");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (byte) 10, (int) (short) -1);
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00542");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray7 = new int[] { (byte) 0, 10, (byte) -1, (byte) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) 100, 0);
    }

    @Test
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00543");
        int[] intArray6 = new int[] { 'a', 1, (short) 1, (short) 1, 'a', 100 };
        int[] intArray9 = new int[] { ' ', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, 1, (int) (byte) 0);
    }

    @Test
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00544");
        int[] intArray6 = new int[] { (short) 100, (short) 100, 10, (byte) 0, (byte) 0, (byte) 0 };
        int[] intArray10 = new int[] { 100, (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 10, (int) (short) 1);
    }

    @Test
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00545");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray6 = new int[] { (short) -1, (byte) 100, 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 100, (-1));
    }

    @Test
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00546");
        int[] intArray5 = new int[] { (byte) 100, (short) -1, 10, (short) 0, (short) 100 };
        int[] intArray10 = new int[] { 100, (-1), (short) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (short) 0, (-1));
    }

    @Test
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00547");
        int[] intArray3 = new int[] { '4', (short) 100, (short) 0 };
        int[] intArray5 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) 100, (int) (short) 10);
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00548");
        int[] intArray1 = new int[] { '#' };
        int[] intArray4 = new int[] { (short) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) -1, (int) (byte) 0);
    }

    @Test
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00549");
        int[] intArray6 = new int[] { 100, '4', (short) -1, 1, (byte) 10, (short) 100 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, 10, (int) (short) 100);
    }

    @Test
    public void test00550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00550");
        int[] intArray1 = new int[] { 0 };
        int[] intArray5 = new int[] { ' ', (short) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (byte) -1, 1);
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00551");
        int[] intArray6 = new int[] { ' ', (short) 100, (short) 100, (short) 1, (byte) 10, (byte) 1 };
        int[] intArray13 = new int[] { (short) 0, (short) 0, (byte) 1, (-1), (short) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) 'a', (int) ' ');
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00552");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { '#', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (byte) 1, (int) (byte) 100);
    }

    @Test
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00553");
        int[] intArray3 = new int[] { (byte) 1, (short) 100, (byte) 100 };
        int[] intArray5 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) ' ', (int) (short) 1);
    }

    @Test
    public void test00554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00554");
        int[] intArray3 = new int[] { (short) 1, ' ', (byte) 10 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (-1), (int) (byte) 100);
    }

    @Test
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00555");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 1, (byte) 1, (short) -1, (byte) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, 10, (int) (byte) -1);
    }

    @Test
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00556");
        int[] intArray5 = new int[] { (-1), (short) -1, '4', 100, '4' };
        int[] intArray10 = new int[] { (byte) 1, 100, 'a', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 0, (int) '4');
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00557");
        int[] intArray5 = new int[] { (short) 1, (byte) 10, (short) -1, (byte) 100, (byte) -1 };
        int[] intArray10 = new int[] { (short) 0, 'a', 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (short) 0, 100);
    }

    @Test
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00558");
        int[] intArray2 = new int[] { '4', '#' };
        int[] intArray4 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (byte) -1, 0);
    }

    @Test
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00559");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 'a', (short) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, 0, 0);
    }

    @Test
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00560");
        int[] intArray4 = new int[] { (short) 10, (byte) 0, (byte) 1, 0 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (short) 10, 10);
    }

    @Test
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00561");
        int[] intArray2 = new int[] { (short) 0, (byte) 100 };
        int[] intArray6 = new int[] { '4', 'a', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) '4', (-1));
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00562");
        int[] intArray2 = new int[] { (byte) 100, (short) 0 };
        int[] intArray9 = new int[] { '#', '#', (short) 0, (byte) -1, '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (short) 100, 100);
    }

    @Test
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00563");
        int[] intArray4 = new int[] { (short) 100, 'a', (short) 10, (short) 1 };
        int[] intArray9 = new int[] { (byte) 1, '#', (byte) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) 0, (int) ' ');
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00564");
        int[] intArray4 = new int[] { 10, (byte) 10, (short) 10, '#' };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (short) 1, (int) 'a');
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00565");
        int[] intArray4 = new int[] { ' ', 1, (short) 0, 0 };
        int[] intArray8 = new int[] { (byte) 0, 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) 1, 0);
    }

    @Test
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00566");
        int[] intArray5 = new int[] { (byte) 0, (byte) 0, (byte) 100, 100, '4' };
        int[] intArray12 = new int[] { (short) 1, ' ', (short) 1, (short) 1, 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) 1, (int) 'a');
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00567");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (byte) 10, (int) (byte) 0);
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00568");
        int[] intArray6 = new int[] { (short) -1, (short) 10, (byte) 1, (short) 100, (short) 100, (-1) };
        int[] intArray10 = new int[] { (byte) -1, 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) 1, (int) (short) -1);
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00569");
        int[] intArray6 = new int[] { (byte) -1, ' ', 10, (short) 100, 100, '4' };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) ' ', (int) ' ');
    }

    @Test
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00570");
        int[] intArray4 = new int[] { (byte) 0, (byte) 100, (byte) 100, ' ' };
        int[] intArray6 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 10, (int) 'a');
    }

    @Test
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00571");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 10, (-1), 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00572");
        int[] intArray3 = new int[] { '#', (byte) 1, (byte) 10 };
        int[] intArray5 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) 100, (int) (byte) -1);
    }

    @Test
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00573");
        int[] intArray5 = new int[] { (short) 10, (short) 100, '#', 0, (byte) 100 };
        int[] intArray8 = new int[] { (byte) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) ' ', (int) (byte) 100);
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00574");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, 1, (-1));
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00575");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (short) -1, (int) (short) 1);
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00576");
        int[] intArray4 = new int[] { (short) 10, 0, (short) 100, ' ' };
        int[] intArray8 = new int[] { ' ', '4', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) '#', (int) 'a');
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00577");
        int[] intArray4 = new int[] { (byte) 10, (byte) 10, 0, (short) 100 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (byte) 1, (byte) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (byte) 10, (-1));
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00578");
        int[] intArray1 = new int[] { 1 };
        int[] intArray4 = new int[] { (byte) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 100, 0);
    }

    @Test
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00579");
        int[] intArray4 = new int[] { '4', '#', (byte) -1, '#' };
        int[] intArray7 = new int[] { 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) 1, 10);
    }

    @Test
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00580");
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, (byte) 1, (byte) -1, (short) 100 };
        int[] intArray10 = new int[] { (byte) 100, 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) -1, (int) (short) -1);
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00581");
        int[] intArray2 = new int[] { (byte) 100, (short) 1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 0, 10);
    }

    @Test
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00582");
        int[] intArray5 = new int[] { (byte) -1, '#', (byte) 100, '#', (byte) 0 };
        int[] intArray10 = new int[] { (byte) 0, (short) 100, (byte) 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 10, (int) (short) 10);
    }

    @Test
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00583");
        int[] intArray3 = new int[] { (short) 0, 10, (short) 10 };
        int[] intArray5 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, 1, 100);
    }

    @Test
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00584");
        int[] intArray6 = new int[] { (byte) -1, '#', 'a', (byte) -1, 10, (short) 1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) '#', (int) (byte) 0);
    }

    @Test
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00585");
        int[] intArray6 = new int[] { '4', (short) 10, (byte) 1, ' ', (short) 1, (-1) };
        int[] intArray10 = new int[] { (byte) 10, '#', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) '4', (int) (short) 1);
    }

    @Test
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00586");
        int[] intArray3 = new int[] { 'a', (short) 0, ' ' };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) 1, 1);
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00587");
        int[] intArray4 = new int[] { (byte) 0, 0, (short) -1, 0 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, 0, 1);
    }

    @Test
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00588");
        int[] intArray5 = new int[] { 10, (short) -1, (byte) 0, (short) -1, ' ' };
        int[] intArray10 = new int[] { 0, 100, 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 10, (int) (short) 10);
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00589");
        int[] intArray5 = new int[] { (byte) -1, 100, (-1), (short) 100, (byte) 1 };
        int[] intArray8 = new int[] { (short) 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 0, (int) '#');
    }

    @Test
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00590");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (-1), 0);
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00591");
        int[] intArray4 = new int[] { (byte) 100, (short) 10, (short) 100, 10 };
        int[] intArray7 = new int[] { (short) 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) 0, (int) ' ');
    }

    @Test
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00592");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray4 = new int[] { '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) 'a', (int) (byte) 1);
    }

    @Test
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00593");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray8 = new int[] { '#', (short) 1, 1, (byte) 100, (byte) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) '#', (int) '#');
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00594");
        int[] intArray5 = new int[] { (byte) 1, (byte) -1, (byte) 10, 1, 100 };
        int[] intArray12 = new int[] { '4', (byte) 10, (short) 10, 0, (short) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (byte) 10, (int) (byte) 0);
    }

    @Test
    public void test00595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00595");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (short) -1, (int) '#');
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00596");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (short) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (short) 10, (int) (byte) 0);
    }

    @Test
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00597");
        int[] intArray2 = new int[] { (byte) -1, (short) -1 };
        int[] intArray8 = new int[] { 10, (byte) 0, (byte) -1, '#', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 1, 100);
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00598");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray4 = new int[] { (short) 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, 0, (int) (short) -1);
    }

    @Test
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00599");
        int[] intArray6 = new int[] { (short) 0, (short) -1, (-1), (byte) 10, (short) 100, (short) 1 };
        int[] intArray12 = new int[] { 0, (short) 10, (byte) 10, (short) 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (byte) 100, (int) (short) 1);
    }

    @Test
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00600");
        int[] intArray5 = new int[] { (byte) 1, '#', (byte) 0, 100, 1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) '4', (int) (byte) 100);
    }

    @Test
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00601");
        int[] intArray5 = new int[] { (short) 100, (byte) 10, (byte) 10, (short) -1, (short) -1 };
        int[] intArray8 = new int[] { (short) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) '4', 1);
    }

    @Test
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00602");
        int[] intArray4 = new int[] { (byte) -1, (byte) 100, (byte) 100, (byte) 10 };
        int[] intArray10 = new int[] { 100, (-1), 1, '4', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) 'a', 0);
    }

    @Test
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00603");
        int[] intArray2 = new int[] { 100, ' ' };
        int[] intArray6 = new int[] { (byte) 100, '#', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 0, (int) (byte) -1);
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00604");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 10, 1);
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00605");
        int[] intArray5 = new int[] { (short) 0, (byte) 0, ' ', '#', (byte) 100 };
        int[] intArray11 = new int[] { 0, 100, '4', (short) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) 10, (int) (byte) 1);
    }

    @Test
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00606");
        int[] intArray5 = new int[] { (short) 1, '4', (byte) 10, 1, (short) -1 };
        int[] intArray11 = new int[] { 0, (short) -1, (short) 1, (short) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) -1, (int) (short) 1);
    }

    @Test
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00607");
        int[] intArray5 = new int[] { (-1), (byte) 1, (short) 10, (byte) -1, (byte) 10 };
        int[] intArray7 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) 1, 0);
    }

    @Test
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00608");
        int[] intArray4 = new int[] { (byte) -1, (short) 1, (byte) 1, '4' };
        int[] intArray7 = new int[] { 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) 10, (-1));
    }

    @Test
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00609");
        int[] intArray4 = new int[] { 0, (byte) -1, (-1), (-1) };
        int[] intArray11 = new int[] { '#', ' ', 'a', '#', (byte) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, 100, (int) (short) 1);
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00610");
        int[] intArray2 = new int[] { '#', (byte) -1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 100, (int) ' ');
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00611");
        int[] intArray2 = new int[] { (short) 10, (short) -1 };
        int[] intArray7 = new int[] { (byte) 0, '#', (short) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 100, (int) (short) 1);
    }

    @Test
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00612");
        int[] intArray3 = new int[] { (short) 0, (short) 0, (byte) 1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, 0, (int) (byte) 1);
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00613");
        int[] intArray4 = new int[] { (byte) -1, ' ', (short) 0, 1 };
        int[] intArray11 = new int[] { (short) 1, (byte) 0, (short) 1, 1, (short) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) 1, (int) ' ');
    }

    @Test
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00614");
        int[] intArray2 = new int[] { (byte) 100, (short) 10 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) 0, (int) (byte) 0);
    }

    @Test
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00615");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray6 = new int[] { (byte) -1, 'a', 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (short) -1, (int) (short) 100);
    }

    @Test
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00616");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray5 = new int[] { (byte) 100, (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) '4', (int) (short) 0);
    }

    @Test
    public void test00617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00617");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 100, (short) 10, 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 0, (int) (short) -1);
    }

    @Test
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00618");
        int[] intArray3 = new int[] { '#', 0, (short) 0 };
        int[] intArray8 = new int[] { 10, (short) -1, (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 0, (int) (byte) 1);
    }

    @Test
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00619");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray8 = new int[] { '#', 1, ' ', 0, (byte) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) '4', (int) (short) 100);
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00620");
        int[] intArray3 = new int[] { 10, (byte) 1, (byte) -1 };
        int[] intArray5 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (-1), (int) (byte) 0);
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00621");
        int[] intArray5 = new int[] { (byte) 100, (short) 1, (byte) 10, '#', (byte) 100 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 0, (int) '4');
    }

    @Test
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00622");
        int[] intArray3 = new int[] { (short) 1, 0, (short) 10 };
        int[] intArray5 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, 100, (int) (short) 1);
    }

    @Test
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00623");
        int[] intArray2 = new int[] { '4', (short) 0 };
        int[] intArray4 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) '4', 0);
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00624");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { '4', 0, ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 0, (int) (short) -1);
    }

    @Test
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00625");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (-1), ' ', (-1), '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) ' ', (int) (byte) 10);
    }

    @Test
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00626");
        int[] intArray4 = new int[] { 'a', (byte) 10, (byte) 1, '#' };
        int[] intArray11 = new int[] { (short) -1, (byte) 100, 100, (short) -1, 'a', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) ' ', (int) (byte) 10);
    }

    @Test
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00627");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) -1, (byte) 0, (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) 10, 1);
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00628");
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 1, (short) 10, 0, '4' };
        int[] intArray9 = new int[] { (short) 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) -1, (int) ' ');
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00629");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray3 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) 0, 100);
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00630");
        int[] intArray4 = new int[] { 1, (short) -1, ' ', (short) -1 };
        int[] intArray9 = new int[] { (-1), (short) 100, (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (byte) 0, (int) '#');
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00631");
        int[] intArray6 = new int[] { 1, (byte) 10, '#', 100, 1, 10 };
        int[] intArray12 = new int[] { 0, '4', 'a', (short) 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) '#', 0);
    }

    @Test
    public void test00632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00632");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, 100, (int) 'a');
    }

    @Test
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00633");
        int[] intArray3 = new int[] { (byte) -1, (byte) 10, '#' };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, 0, (int) (short) 1);
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00634");
        int[] intArray2 = new int[] { 1, (byte) 1 };
        int[] intArray9 = new int[] { 100, 1, (byte) 100, (byte) 0, (byte) -1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 10, (int) (short) -1);
    }

    @Test
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00635");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) '#', (int) 'a');
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00636");
        int[] intArray5 = new int[] { (byte) 1, (short) 1, (short) -1, '#', (byte) -1 };
        int[] intArray10 = new int[] { (byte) 10, (byte) 0, (byte) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (byte) 100, (int) (short) 100);
    }

    @Test
    public void test00637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00637");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (byte) 0, (int) (byte) 1);
    }

    @Test
    public void test00638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00638");
        int[] intArray6 = new int[] { 100, (short) 100, (short) -1, (short) -1, (short) -1, (-1) };
        int[] intArray12 = new int[] { 0, (byte) 10, 10, (byte) 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) -1, 10);
    }

    @Test
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00639");
        int[] intArray5 = new int[] { (short) -1, (-1), (short) 0, (byte) 10, 100 };
        int[] intArray8 = new int[] { '4', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 100, (int) (byte) 100);
    }

    @Test
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00640");
        int[] intArray2 = new int[] { (short) -1, '4' };
        int[] intArray5 = new int[] { 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 10, (int) '4');
    }

    @Test
    public void test00641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00641");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray7 = new int[] { '4', (-1), 0, (byte) 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) 10, 0);
    }

    @Test
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00642");
        int[] intArray6 = new int[] { 100, 10, (byte) 1, 0, 10, 'a' };
        int[] intArray8 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 1, (int) (short) -1);
    }

    @Test
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00643");
        int[] intArray5 = new int[] { ' ', '#', (short) -1, (-1), (short) 10 };
        int[] intArray11 = new int[] { 100, (-1), 0, (short) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) 100, (int) (short) 100);
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00644");
        int[] intArray6 = new int[] { (byte) 1, (byte) -1, 100, (byte) 1, 0, 0 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) 10, (int) '4');
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00645");
        int[] intArray2 = new int[] { 'a', (-1) };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 100, (int) '#');
    }

    @Test
    public void test00646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00646");
        int[] intArray4 = new int[] { ' ', 0, (short) 100, ' ' };
        int[] intArray10 = new int[] { (byte) 100, (short) 1, (-1), (short) 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, 0, (int) (byte) 100);
    }

    @Test
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00647");
        int[] intArray6 = new int[] { 10, 10, '4', (byte) -1, 10, '#' };
        int[] intArray11 = new int[] { (byte) 10, (byte) 100, 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 10, 10);
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00648");
        int[] intArray4 = new int[] { '4', (byte) -1, 10, (short) 0 };
        int[] intArray9 = new int[] { ' ', 'a', (byte) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 100, 0);
    }

    @Test
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00649");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray5 = new int[] { (byte) 100, (short) -1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, 1, 10);
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00650");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray8 = new int[] { (byte) 0, '4', (short) -1, 0, 'a', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) '4', (int) (short) -1);
    }

    @Test
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00651");
        int[] intArray3 = new int[] { (short) 1, 10, (short) -1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) ' ', (int) ' ');
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00652");
        int[] intArray4 = new int[] { 100, ' ', 1, (short) 100 };
        int[] intArray8 = new int[] { 10, (short) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (-1), (int) (byte) 0);
    }

    @Test
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00653");
        int[] intArray3 = new int[] { ' ', (short) 0, (short) 100 };
        int[] intArray7 = new int[] { (short) 1, 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) '#', (int) (byte) 100);
    }

    @Test
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00654");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00655");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[] intArray5 = new int[] { (byte) 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (byte) 1, (int) ' ');
    }

    @Test
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00656");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 100, ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, 0, (int) (byte) 10);
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00657");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 10, (int) (byte) 0);
    }

    @Test
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00658");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray3 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, 0, (int) 'a');
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00659");
        int[] intArray5 = new int[] { 0, (byte) 0, (byte) 1, (short) -1, (-1) };
        int[] intArray12 = new int[] { (short) 0, '4', (byte) 1, (byte) 1, 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) -1, (-1));
    }

    @Test
    public void test00660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00660");
        int[] intArray1 = new int[] { '4' };
        int[] intArray3 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (-1), 100);
    }

    @Test
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00661");
        int[] intArray4 = new int[] { (byte) -1, (short) 1, (byte) -1, (short) -1 };
        int[] intArray7 = new int[] { ' ', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) 10, (int) (short) 1);
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00662");
        int[] intArray5 = new int[] { (byte) 0, 100, '4', '4', 100 };
        int[] intArray12 = new int[] { (short) 0, (-1), (byte) 0, '4', 'a', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) -1, (int) (short) 100);
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00663");
        int[] intArray1 = new int[] { 1 };
        int[] intArray5 = new int[] { ' ', 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, 10, (int) '4');
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00664");
        int[] intArray6 = new int[] { 10, 1, (short) 1, (short) 1, 'a', (byte) 1 };
        int[] intArray10 = new int[] { 0, '#', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) '4', (int) (byte) 10);
    }

    @Test
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00665");
        int[] intArray6 = new int[] { ' ', (byte) 10, (short) 100, (short) 100, (short) 1, (-1) };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) -1, (int) 'a');
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00666");
        int[] intArray3 = new int[] { (-1), (byte) 0, 1 };
        int[] intArray8 = new int[] { (short) 0, (short) 100, 'a', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) 'a', (int) 'a');
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00667");
        int[] intArray6 = new int[] { ' ', (short) -1, (byte) 100, 100, '4', (short) 10 };
        int[] intArray13 = new int[] { 100, (byte) 0, (byte) 0, (byte) 100, (byte) 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) '#', (int) 'a');
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00668");
        int[] intArray6 = new int[] { (byte) 1, '#', '#', (byte) 10, (byte) 1, (byte) 0 };
        int[] intArray8 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 10, 0);
    }

    @Test
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00669");
        int[] intArray2 = new int[] { (short) 0, '#' };
        int[] intArray5 = new int[] { (byte) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (byte) 100, (int) (byte) -1);
    }

    @Test
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00670");
        int[] intArray5 = new int[] { (byte) -1, (short) 1, (short) -1, (short) 100, (byte) 10 };
        int[] intArray7 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) 0, (int) ' ');
    }

    @Test
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00671");
        int[] intArray3 = new int[] { (byte) 0, 'a', 10 };
        int[] intArray6 = new int[] { 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) -1, (int) ' ');
    }

    @Test
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00672");
        int[] intArray2 = new int[] { (short) 0, 100 };
        int[] intArray5 = new int[] { 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 1, (int) (short) 100);
    }

    @Test
    public void test00673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00673");
        int[] intArray3 = new int[] { (-1), (short) -1, (short) 100 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, 0, (int) ' ');
    }

    @Test
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00674");
        int[] intArray6 = new int[] { '4', 10, 10, (short) 10, (short) 1, (byte) 100 };
        int[] intArray8 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) -1, 1);
    }

    @Test
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00675");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray7 = new int[] { (short) 100, (short) 10, (byte) 100, 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, 100, (int) (short) -1);
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00676");
        int[] intArray6 = new int[] { (byte) 1, '4', '#', (byte) 100, (byte) 0, (byte) 0 };
        int[] intArray13 = new int[] { 1, (byte) 0, ' ', 1, (short) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (short) 10, 1);
    }

    @Test
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00677");
        int[] intArray4 = new int[] { (byte) 100, (short) 1, '#', (byte) 100 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (-1), (int) (short) 1);
    }

    @Test
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00678");
        int[] intArray3 = new int[] { (-1), (short) 0, (short) 0 };
        int[] intArray9 = new int[] { (byte) 1, (byte) -1, 1, (byte) 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (short) -1, (int) (short) 100);
    }

    @Test
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00679");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (byte) 100, (int) (short) 0);
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00680");
        int[] intArray1 = new int[] { 0 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 1, (int) '4');
    }

    @Test
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00681");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray3 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) 0, (int) (short) 100);
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00682");
        int[] intArray4 = new int[] { 1, (byte) 0, (byte) -1, (short) 100 };
        int[] intArray10 = new int[] { (byte) 0, (short) 100, (short) 0, 'a', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, 1, 0);
    }

    @Test
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00683");
        int[] intArray4 = new int[] { (byte) 1, (short) 10, (short) 0, (short) 10 };
        int[] intArray6 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 1, (int) (short) 0);
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00684");
        int[] intArray5 = new int[] { '4', (byte) -1, (short) -1, 100, ' ' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) '4', (int) 'a');
    }

    @Test
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00685");
        int[] intArray1 = new int[] { 10 };
        int[] intArray8 = new int[] { (short) 10, (short) 10, (-1), (short) 0, 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) 0, (int) '4');
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00686");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { '4', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (short) 10, (int) 'a');
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00687");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray8 = new int[] { (byte) -1, (byte) 10, (short) -1, (byte) 10, (byte) -1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) 1, 1);
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00688");
        int[] intArray1 = new int[] { 1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) '4', (int) (byte) 100);
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00689");
        int[] intArray4 = new int[] { 0, (short) 10, (short) -1, (short) 10 };
        int[] intArray7 = new int[] { (short) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (-1), (int) (short) -1);
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00690");
        int[] intArray5 = new int[] { (short) 10, 0, (short) 1, (byte) 10, (short) 100 };
        int[] intArray11 = new int[] { 'a', (byte) 100, 100, (byte) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 0, 100);
    }

    @Test
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00691");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray4 = new int[] { 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00692");
        int[] intArray3 = new int[] { (short) 10, (byte) 0, 10 };
        int[] intArray7 = new int[] { '4', (short) 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) 'a', (int) (byte) 0);
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00693");
        int[] intArray4 = new int[] { '#', (byte) 0, (byte) 1, (short) -1 };
        int[] intArray9 = new int[] { 0, 100, '4', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (byte) -1, (int) '#');
    }

    @Test
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00694");
        int[] intArray3 = new int[] { (byte) 1, (byte) 1, 10 };
        int[] intArray8 = new int[] { (byte) 1, 1, 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 1, 100);
    }

    @Test
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00695");
        int[] intArray4 = new int[] { (short) 100, (byte) 100, (byte) -1, (short) 0 };
        int[] intArray11 = new int[] { 0, (short) 10, (byte) 100, '4', 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) '4', (int) (short) 1);
    }

    @Test
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00696");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray4 = new int[] { (short) 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, 0, (int) '#');
    }

    @Test
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00697");
        int[] intArray2 = new int[] { 100, (byte) -1 };
        int[] intArray5 = new int[] { '#', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (byte) 10, (int) ' ');
    }

    @Test
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00698");
        int[] intArray5 = new int[] { (short) 10, (-1), 1, (short) 100, (short) -1 };
        int[] intArray10 = new int[] { 'a', ' ', (-1), ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) 'a', (int) '4');
    }

    @Test
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00699");
        int[] intArray6 = new int[] { 100, (short) 100, '4', ' ', '#', (byte) -1 };
        int[] intArray10 = new int[] { (byte) 10, (byte) -1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 1, (int) (short) 100);
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00700");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 'a', (short) 10, 'a', (short) 10, '4', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) 100, 0);
    }

    @Test
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00701");
        int[] intArray6 = new int[] { 100, (short) 100, (short) 1, 'a', 10, ' ' };
        int[] intArray10 = new int[] { (short) 1, (short) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) ' ', 1);
    }

    @Test
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00702");
        int[] intArray4 = new int[] { 1, '#', (-1), 100 };
        int[] intArray10 = new int[] { 1, '#', (byte) 1, (byte) 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) 100, (int) (short) -1);
    }

    @Test
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00703");
        int[] intArray1 = new int[] { '#' };
        int[] intArray5 = new int[] { 10, (-1), (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, 0, 10);
    }

    @Test
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00704");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00705");
        int[] intArray2 = new int[] { ' ', (short) 1 };
        int[] intArray8 = new int[] { (short) 10, 1, (byte) -1, (byte) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (byte) -1, (int) 'a');
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00706");
        int[] intArray5 = new int[] { ' ', '#', (short) -1, (short) -1, '4' };
        int[] intArray11 = new int[] { 100, '#', (byte) -1, (byte) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) 0, 0);
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00707");
        int[] intArray2 = new int[] { (short) 1, (byte) 1 };
        int[] intArray4 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (short) -1, 1);
    }

    @Test
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00708");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (byte) 10, (int) (short) 100);
    }

    @Test
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00709");
        int[] intArray4 = new int[] { (short) 100, (byte) 1, (byte) 10, ' ' };
        int[] intArray9 = new int[] { '4', (short) 1, 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 1, (int) '#');
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00710");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { '4', '#', '4', (short) 1, (byte) -1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) '#', (int) '#');
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00711");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) 'a', (int) (short) 10);
    }

    @Test
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00712");
        int[] intArray2 = new int[] { '4', 10 };
        int[] intArray4 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (short) 100, (int) (short) 10);
    }

    @Test
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00713");
        int[] intArray5 = new int[] { '#', 'a', ' ', (byte) 10, (short) -1 };
        int[] intArray10 = new int[] { 1, (short) 10, (short) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 0, (int) (short) -1);
    }

    @Test
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00714");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray8 = new int[] { (byte) 100, (byte) 10, (byte) -1, (short) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (byte) 10, (int) '#');
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00715");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) -1, 'a', (short) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) '4', (int) (byte) 0);
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00716");
        int[] intArray3 = new int[] { 'a', ' ', 100 };
        int[] intArray8 = new int[] { 0, (byte) 100, '4', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (-1), (int) (byte) 100);
    }

    @Test
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00717");
        int[] intArray6 = new int[] { 'a', '4', '4', (byte) -1, (byte) 100, (short) 1 };
        int[] intArray10 = new int[] { (byte) 10, 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (short) 100, (int) (byte) 10);
    }

    @Test
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00718");
        int[] intArray2 = new int[] { 10, (-1) };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) 10, 10);
    }

    @Test
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00719");
        int[] intArray4 = new int[] { ' ', 10, '4', (byte) 0 };
        int[] intArray7 = new int[] { (short) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) 0, (int) (short) 10);
    }

    @Test
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00720");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) 10, '#', (short) 1, (short) -1, 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) 100, 0);
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00721");
        int[] intArray4 = new int[] { (short) 1, 'a', (short) 10, 0 };
        int[] intArray7 = new int[] { 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) 1, (int) (byte) 1);
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00722");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) 10, (int) 'a');
    }

    @Test
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00723");
        int[] intArray5 = new int[] { (short) 1, (byte) 10, 0, (short) 1, (-1) };
        int[] intArray9 = new int[] { (short) -1, (-1), (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 0, 100);
    }

    @Test
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00724");
        int[] intArray5 = new int[] { (short) 0, (byte) -1, (-1), (short) 100, (byte) 100 };
        int[] intArray10 = new int[] { 100, '4', (byte) 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (short) 1, (int) (short) 0);
    }

    @Test
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00725");
        int[] intArray3 = new int[] { (short) 100, (byte) 0, (-1) };
        int[] intArray5 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) 1, (int) (short) 1);
    }

    @Test
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00726");
        int[] intArray2 = new int[] { (short) 100, '4' };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (-1), (int) (short) -1);
    }

    @Test
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00727");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray7 = new int[] { '4', 100, (short) 0, 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) 100, 0);
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00728");
        int[] intArray3 = new int[] { (byte) 1, (byte) 10, (byte) 1 };
        int[] intArray10 = new int[] { (short) 0, 100, '4', ' ', 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 10, (int) (byte) -1);
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00729");
        int[] intArray6 = new int[] { (short) -1, (short) 10, 'a', (short) 1, (short) 10, (short) 10 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (-1), (int) (short) -1);
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00730");
        int[] intArray4 = new int[] { (byte) 10, '4', (-1), (short) -1 };
        int[] intArray7 = new int[] { (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) 100, (int) (short) 10);
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00731");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 0, 10, (short) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) 100, (int) (short) 1);
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00732");
        int[] intArray2 = new int[] { (short) 10, (short) -1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (-1), (int) '#');
    }

    @Test
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00733");
        int[] intArray5 = new int[] { 10, (short) 10, (byte) -1, (byte) 1, 100 };
        int[] intArray11 = new int[] { '4', (byte) 10, (short) 10, (short) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 0, (int) (short) 0);
    }

    @Test
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00734");
        int[] intArray5 = new int[] { (short) 1, ' ', 1, (short) 1, (short) -1 };
        int[] intArray8 = new int[] { 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 0, 1);
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00735");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray3 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) 10, (int) (short) 1);
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00736");
        int[] intArray5 = new int[] { '4', (short) 100, (short) 1, (short) -1, 1 };
        int[] intArray12 = new int[] { '#', 'a', (short) 1, '#', (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) ' ', (int) (byte) 100);
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00737");
        int[] intArray2 = new int[] { (short) 0, (short) -1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) 10, (int) (byte) 10);
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00738");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (byte) -1, (byte) 0, (byte) -1, ' ', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) -1, 0);
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00739");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 1, (short) -1, (byte) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 1, (int) ' ');
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00740");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray8 = new int[] { ' ', (byte) 0, (short) 1, ' ', ' ', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (-1), (int) (short) 10);
    }

    @Test
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00741");
        int[] intArray5 = new int[] { (byte) 100, (short) -1, (short) 10, 10, (short) 0 };
        int[] intArray11 = new int[] { (byte) 1, (byte) -1, 100, (byte) 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) '4', 100);
    }

    @Test
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00742");
        int[] intArray6 = new int[] { 100, ' ', (short) 100, (byte) 1, (short) -1, (short) 1 };
        int[] intArray12 = new int[] { (byte) -1, (byte) -1, (byte) 1, (short) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00743");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray7 = new int[] { (short) 0, (byte) 10, 0, (-1), (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) -1, (int) (short) 10);
    }

    @Test
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00744");
        int[] intArray6 = new int[] { ' ', (short) 1, (-1), (short) 0, (byte) -1, (byte) -1 };
        int[] intArray8 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 0, 100);
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00745");
        int[] intArray4 = new int[] { (byte) -1, (byte) 1, (short) 1, 100 };
        int[] intArray9 = new int[] { (short) 1, (short) 10, (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) 0, (int) (byte) 100);
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00746");
        int[] intArray6 = new int[] { '#', 1, (short) 10, (byte) 10, (byte) 10, (byte) 0 };
        int[] intArray9 = new int[] { (byte) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (-1), 1);
    }

    @Test
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00747");
        int[] intArray6 = new int[] { (byte) 10, (byte) 1, (short) 10, (byte) -1, 1, 100 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) 10, 0);
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00748");
        int[] intArray6 = new int[] { 1, 100, '4', 0, 'a', (short) 0 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) '#', (int) (byte) 0);
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00749");
        int[] intArray6 = new int[] { (-1), '4', 0, (short) 1, (byte) 100, (short) 1 };
        int[] intArray10 = new int[] { (short) -1, (byte) 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (short) -1, 0);
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00750");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray8 = new int[] { 1, 100, 'a', (short) 10, (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) 1, (int) (byte) 10);
    }

    @Test
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00751");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray8 = new int[] { (byte) 10, (byte) 10, (byte) -1, '#', (short) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) 100, (int) (byte) -1);
    }

    @Test
    public void test00752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00752");
        int[] intArray5 = new int[] { (short) 10, (short) 0, 100, (short) -1, (byte) -1 };
        int[] intArray7 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, 0, (-1));
    }

    @Test
    public void test00753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00753");
        int[] intArray5 = new int[] { '4', (short) -1, 100, (short) 10, 100 };
        int[] intArray8 = new int[] { '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 1, (int) (short) 1);
    }

    @Test
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00754");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray4 = new int[] { (byte) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, 0, (int) (short) 10);
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00755");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 'a', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 0, (int) (short) 10);
    }

    @Test
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00756");
        int[] intArray3 = new int[] { 'a', (short) 100, (short) 100 };
        int[] intArray5 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) 100, (int) 'a');
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00757");
        int[] intArray1 = new int[] { 100 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) ' ', 10);
    }

    @Test
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00758");
        int[] intArray4 = new int[] { 'a', (byte) -1, 100, (byte) 1 };
        int[] intArray10 = new int[] { (byte) 100, (short) 10, 10, (short) 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) 100, (int) (short) 100);
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00759");
        int[] intArray3 = new int[] { (byte) 100, (short) -1, '4' };
        int[] intArray10 = new int[] { (short) 0, 0, (short) -1, (byte) -1, (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 0, 1);
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00760");
        int[] intArray4 = new int[] { (byte) 100, (short) 1, 'a', 0 };
        int[] intArray10 = new int[] { '4', 0, 10, 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, 10, (int) (byte) 100);
    }

    @Test
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00761");
        int[] intArray2 = new int[] { 0, (byte) -1 };
        int[] intArray4 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) '#', (-1));
    }

    @Test
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00762");
        int[] intArray6 = new int[] { (short) 10, 1, 1, (byte) 100, 10, (byte) -1 };
        int[] intArray9 = new int[] { (short) 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) ' ', (int) (byte) 1);
    }

    @Test
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00763");
        int[] intArray3 = new int[] { 10, (short) 100, 0 };
        int[] intArray8 = new int[] { (byte) 10, (short) -1, (byte) 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) 'a', (int) (byte) -1);
    }

    @Test
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00764");
        int[] intArray2 = new int[] { (short) 100, (short) 1 };
        int[] intArray9 = new int[] { 0, '#', (byte) 10, (short) -1, '#', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (short) 10, (int) (byte) 100);
    }

    @Test
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00765");
        int[] intArray3 = new int[] { (byte) 10, (short) 0, (byte) -1 };
        int[] intArray5 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) -1, (int) (short) 0);
    }

    @Test
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00766");
        int[] intArray2 = new int[] { (byte) 10, (-1) };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 10, (int) (short) 0);
    }

    @Test
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00767");
        int[] intArray5 = new int[] { 10, '4', (byte) 100, (byte) 100, (byte) 1 };
        int[] intArray8 = new int[] { (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) 10, 10);
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00768");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray5 = new int[] { '#', (short) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, 1, (int) '#');
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00769");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) 0, 0, '4', (byte) 10, (byte) -1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, 1, 1);
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00770");
        int[] intArray2 = new int[] { (short) 1, (short) 1 };
        int[] intArray7 = new int[] { 100, 'a', (short) 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 100, (int) (byte) -1);
    }

    @Test
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00771");
        int[] intArray5 = new int[] { (-1), (byte) 1, (short) 1, '4', (byte) -1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 10, (int) (short) 10);
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00772");
        int[] intArray4 = new int[] { (short) 10, (byte) -1, (-1), 0 };
        int[] intArray7 = new int[] { (short) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 0, (int) (short) 1);
    }

    @Test
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00773");
        int[] intArray4 = new int[] { (-1), 'a', 0, '#' };
        int[] intArray8 = new int[] { (byte) 1, (-1), (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (-1), (int) ' ');
    }

    @Test
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00774");
        int[] intArray6 = new int[] { (short) 10, 'a', (-1), (byte) 1, (byte) -1, (byte) 100 };
        int[] intArray12 = new int[] { ' ', 10, (byte) 0, (short) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (byte) 10, (int) '4');
    }

    @Test
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00775");
        int[] intArray5 = new int[] { (byte) 10, (byte) -1, 100, (byte) -1, '4' };
        int[] intArray12 = new int[] { '4', (-1), '4', 1, (short) 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, 10, (int) (short) -1);
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00776");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray3 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) '4', (int) ' ');
    }

    @Test
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00777");
        int[] intArray4 = new int[] { (short) 1, ' ', (short) 1, (byte) 0 };
        int[] intArray9 = new int[] { (short) 100, (short) -1, (byte) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (byte) 10, (-1));
    }

    @Test
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00778");
        int[] intArray2 = new int[] { 0, '#' };
        int[] intArray8 = new int[] { (byte) 100, 100, (short) 0, (short) 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 100, (int) ' ');
    }

    @Test
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00779");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray4 = new int[] { 'a', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (-1), (int) '#');
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00780");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 'a', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (byte) 1, (int) (byte) 10);
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00781");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (short) 1, (int) (short) 0);
    }

    @Test
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00782");
        int[] intArray2 = new int[] { 0, 100 };
        int[] intArray5 = new int[] { (short) 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 10, (int) (byte) 10);
    }

    @Test
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00783");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray7 = new int[] { (short) 1, 'a', (short) 0, (byte) 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (-1), (int) (short) 1);
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00784");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) 0, 'a', 0, 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, 10, (int) 'a');
    }

    @Test
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00785");
        int[] intArray2 = new int[] { 0, (short) 100 };
        int[] intArray7 = new int[] { '4', 1, (byte) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) '4', (int) '#');
    }

    @Test
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00786");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 100, 1);
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00787");
        int[] intArray3 = new int[] { '4', (short) 1, (byte) -1 };
        int[] intArray10 = new int[] { (byte) 0, 0, 1, (byte) -1, (byte) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 0, (int) (byte) 1);
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00788");
        int[] intArray6 = new int[] { 10, ' ', 10, (-1), 1, (short) 0 };
        int[] intArray12 = new int[] { 100, (byte) 1, (short) 10, 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 1, 1);
    }

    @Test
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00789");
        int[] intArray4 = new int[] { 10, 10, (byte) -1, '4' };
        int[] intArray10 = new int[] { (byte) 1, 10, (byte) 10, '#', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) 100, 1);
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00790");
        int[] intArray4 = new int[] { 100, 1, (short) 10, (short) -1 };
        int[] intArray8 = new int[] { 'a', (-1), (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) 1, 1);
    }

    @Test
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00791");
        int[] intArray5 = new int[] { '#', '4', ' ', '4', (byte) -1 };
        int[] intArray12 = new int[] { (short) 10, (short) -1, (short) -1, (byte) 1, 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) 10, (int) ' ');
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00792");
        int[] intArray4 = new int[] { 100, (short) 100, ' ', (byte) 0 };
        int[] intArray6 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) '#', (int) (short) -1);
    }

    @Test
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00793");
        int[] intArray6 = new int[] { 0, ' ', (short) 1, (byte) 0, 1, 'a' };
        int[] intArray9 = new int[] { (short) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 0, (int) (short) 1);
    }

    @Test
    public void test00794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00794");
        int[] intArray2 = new int[] { (-1), (byte) 0 };
        int[] intArray5 = new int[] { (byte) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (-1), (int) ' ');
    }

    @Test
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00795");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 1, 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) 100, 100);
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00796");
        int[] intArray6 = new int[] { (byte) 0, (byte) 100, (short) 10, 10, (byte) 100, (short) 10 };
        int[] intArray11 = new int[] { (short) 100, (byte) 10, 'a', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 0, 1);
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00797");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { '4', ' ', (byte) 10, (short) 10, (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) 1, 100);
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00798");
        int[] intArray2 = new int[] { (byte) 0, (byte) -1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) 0, (int) (byte) -1);
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00799");
        int[] intArray1 = new int[] { 1 };
        int[] intArray4 = new int[] { (byte) 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00800");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray5 = new int[] { '4', 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, 0, (int) (byte) 1);
    }

    @Test
    public void test00801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00801");
        int[] intArray2 = new int[] { (short) 1, (byte) -1 };
        int[] intArray5 = new int[] { 'a', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (-1), (int) (byte) 0);
    }

    @Test
    public void test00802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00802");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 100, (short) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) 100, (int) '#');
    }

    @Test
    public void test00803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00803");
        int[] intArray6 = new int[] { '4', (byte) -1, (byte) 10, (short) 0, (short) 0, '4' };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (-1), (int) (byte) -1);
    }

    @Test
    public void test00804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00804");
        int[] intArray4 = new int[] { (short) -1, (short) -1, '4', (short) 10 };
        int[] intArray6 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 100, (int) (short) 10);
    }

    @Test
    public void test00805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00805");
        int[] intArray5 = new int[] { (short) 1, 0, 1, (byte) 100, 10 };
        int[] intArray8 = new int[] { 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) 100, 10);
    }

    @Test
    public void test00806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00806");
        int[] intArray3 = new int[] { (short) 0, (byte) -1, 'a' };
        int[] intArray8 = new int[] { ' ', 'a', (byte) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (byte) 1, 0);
    }

    @Test
    public void test00807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00807");
        int[] intArray1 = new int[] { 10 };
        int[] intArray6 = new int[] { 10, (byte) 100, (byte) 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (byte) 10, (int) (short) 0);
    }

    @Test
    public void test00808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00808");
        int[] intArray6 = new int[] { 100, 1, '#', (byte) 0, (byte) 0, (-1) };
        int[] intArray9 = new int[] { '#', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 1, (int) '#');
    }

    @Test
    public void test00809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00809");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray8 = new int[] { (byte) 10, (short) 1, 100, 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) 'a', (int) (byte) 100);
    }

    @Test
    public void test00810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00810");
        int[] intArray3 = new int[] { (short) 100, 'a', 'a' };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, 0, (int) (short) 1);
    }

    @Test
    public void test00811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00811");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) '4', (int) (short) 1);
    }

    @Test
    public void test00812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00812");
        int[] intArray2 = new int[] { '4', 10 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) 1, (int) '#');
    }

    @Test
    public void test00813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00813");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) ' ', (int) (short) 0);
    }

    @Test
    public void test00814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00814");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 0, '4', (short) 0, 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) 'a', (int) (short) -1);
    }

    @Test
    public void test00815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00815");
        int[] intArray3 = new int[] { 1, (byte) -1, (byte) 1 };
        int[] intArray5 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, 1, 100);
    }

    @Test
    public void test00816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00816");
        int[] intArray5 = new int[] { 0, 'a', '4', (short) 100, (-1) };
        int[] intArray9 = new int[] { 'a', (-1), (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (-1), (int) (byte) -1);
    }

    @Test
    public void test00817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00817");
        int[] intArray4 = new int[] { 10, (short) 1, (short) 1, '4' };
        int[] intArray8 = new int[] { (short) 10, 'a', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) 'a', (int) ' ');
    }

    @Test
    public void test00818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00818");
        int[] intArray5 = new int[] { 1, (short) -1, 1, 0, 1 };
        int[] intArray9 = new int[] { (byte) 10, '#', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 100, (int) '#');
    }

    @Test
    public void test00819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00819");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray7 = new int[] { ' ', (-1), '#', 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) -1, (int) (byte) 100);
    }

    @Test
    public void test00820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00820");
        int[] intArray4 = new int[] { 'a', (-1), (-1), ' ' };
        int[] intArray10 = new int[] { ' ', '#', (byte) 10, (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) 0, (int) (short) 100);
    }

    @Test
    public void test00821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00821");
        int[] intArray6 = new int[] { (short) -1, (byte) 100, '4', (byte) 1, (-1), (short) 100 };
        int[] intArray12 = new int[] { (byte) 10, 'a', (short) 1, '#', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (byte) 1, (int) (byte) 1);
    }

    @Test
    public void test00822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00822");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) '4', (int) (byte) 0);
    }

    @Test
    public void test00823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00823");
        int[] intArray2 = new int[] { (byte) -1, (short) -1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) '4', (int) (byte) 100);
    }

    @Test
    public void test00824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00824");
        int[] intArray4 = new int[] { '4', (short) 100, (-1), '4' };
        int[] intArray7 = new int[] { (-1), (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test00825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00825");
        int[] intArray6 = new int[] { 'a', 10, 1, '4', 'a', (short) -1 };
        int[] intArray11 = new int[] { 1, 1, (short) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 0, (int) (short) 100);
    }

    @Test
    public void test00826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00826");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) 'a', (-1));
    }

    @Test
    public void test00827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00827");
        int[] intArray5 = new int[] { (short) 1, (short) 100, (byte) 100, 1, '#' };
        int[] intArray10 = new int[] { 0, 100, '#', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (short) -1, (int) '#');
    }

    @Test
    public void test00828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00828");
        int[] intArray2 = new int[] { (byte) 10, (-1) };
        int[] intArray7 = new int[] { (-1), (short) 1, (short) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) 'a', (int) (byte) 100);
    }

    @Test
    public void test00829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00829");
        int[] intArray6 = new int[] { (short) 10, (byte) 10, (short) 0, (short) 10, (-1), (-1) };
        int[] intArray13 = new int[] { 0, 'a', ' ', '4', (short) -1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 0, (int) (short) 0);
    }

    @Test
    public void test00830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00830");
        int[] intArray1 = new int[] { 10 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 0, (int) (byte) 1);
    }

    @Test
    public void test00831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00831");
        int[] intArray2 = new int[] { (short) 10, ' ' };
        int[] intArray4 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (short) -1, (int) (byte) 100);
    }

    @Test
    public void test00832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00832");
        int[] intArray6 = new int[] { (short) 0, 0, (short) -1, (-1), (short) -1, (-1) };
        int[] intArray12 = new int[] { (short) 100, 10, (-1), (short) 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 0, 0);
    }

    @Test
    public void test00833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00833");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 0, (byte) 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) 0, 10);
    }

    @Test
    public void test00834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00834");
        int[] intArray4 = new int[] { (short) 1, (short) 100, (short) 100, (byte) 10 };
        int[] intArray7 = new int[] { (byte) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) 100, (int) (short) 100);
    }

    @Test
    public void test00835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00835");
        int[] intArray2 = new int[] { '#', (short) -1 };
        int[] intArray5 = new int[] { (short) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 100, (int) (byte) 10);
    }

    @Test
    public void test00836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00836");
        int[] intArray3 = new int[] { 'a', (byte) 100, 0 };
        int[] intArray9 = new int[] { (short) -1, (short) -1, (short) 1, (short) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 1, (int) (byte) -1);
    }

    @Test
    public void test00837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00837");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, (byte) -1 };
        int[] intArray6 = new int[] { (short) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, 0, 100);
    }

    @Test
    public void test00838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00838");
        int[] intArray6 = new int[] { (short) 100, '#', 'a', ' ', (byte) 1, (short) 10 };
        int[] intArray12 = new int[] { ' ', (byte) 10, (short) 100, (byte) 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) 100, (int) '4');
    }

    @Test
    public void test00839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00839");
        int[] intArray4 = new int[] { (short) 0, 10, (byte) -1, ' ' };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, 0, 10);
    }

    @Test
    public void test00840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00840");
        int[] intArray3 = new int[] { 10, (short) 10, 'a' };
        int[] intArray8 = new int[] { 10, (short) -1, (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 1, (int) (byte) 1);
    }

    @Test
    public void test00841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00841");
        int[] intArray2 = new int[] { (byte) 0, 'a' };
        int[] intArray7 = new int[] { (short) 0, (short) 1, '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 10, (int) (byte) 0);
    }

    @Test
    public void test00842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00842");
        int[] intArray6 = new int[] { (short) 0, (byte) 10, 100, (short) 100, (-1), (short) 1 };
        int[] intArray13 = new int[] { '#', 'a', (byte) -1, 100, 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 1, (int) (short) 10);
    }

    @Test
    public void test00843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00843");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray7 = new int[] { (short) 100, (byte) 10, 'a', (byte) 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, 100, (int) (byte) 10);
    }

    @Test
    public void test00844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00844");
        int[] intArray3 = new int[] { 100, (byte) 1, (byte) 10 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) 100, (int) (short) 100);
    }

    @Test
    public void test00845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00845");
        int[] intArray4 = new int[] { (short) 10, (short) 0, '#', (byte) 1 };
        int[] intArray9 = new int[] { (short) 0, (short) -1, (short) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (byte) 0, (-1));
    }

    @Test
    public void test00846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00846");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (short) 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (short) 1, 0);
    }

    @Test
    public void test00847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00847");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, 1, (int) (byte) 0);
    }

    @Test
    public void test00848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00848");
        int[] intArray6 = new int[] { 100, (byte) 0, (byte) 100, (short) 100, (byte) -1, (byte) 100 };
        int[] intArray12 = new int[] { ' ', '4', (short) 10, (byte) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) '#', (int) (byte) 100);
    }

    @Test
    public void test00849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00849");
        int[] intArray2 = new int[] { (short) -1, 0 };
        int[] intArray8 = new int[] { '4', (short) -1, (byte) 100, '4', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 0, (int) (short) 1);
    }

    @Test
    public void test00850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00850");
        int[] intArray4 = new int[] { (byte) -1, (short) 100, (-1), (-1) };
        int[] intArray10 = new int[] { (-1), (byte) 1, (byte) 1, (short) 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) 'a', 10);
    }

    @Test
    public void test00851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00851");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray8 = new int[] { (byte) -1, (short) 100, (short) 1, (short) 10, 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) -1, (int) (short) 10);
    }

    @Test
    public void test00852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00852");
        int[] intArray2 = new int[] { 'a', (byte) 1 };
        int[] intArray8 = new int[] { 10, (short) 100, 10, ' ', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 0, (int) '4');
    }

    @Test
    public void test00853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00853");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 1, '#', '4', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 10, 100);
    }

    @Test
    public void test00854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00854");
        int[] intArray2 = new int[] { (-1), 100 };
        int[] intArray5 = new int[] { ' ', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 0, (int) (short) 100);
    }

    @Test
    public void test00855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00855");
        int[] intArray4 = new int[] { (short) 10, (byte) 10, (short) 10, '4' };
        int[] intArray8 = new int[] { (short) 1, '#', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) -1, 100);
    }

    @Test
    public void test00856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00856");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 10, 'a', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test00857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00857");
        int[] intArray2 = new int[] { (short) 0, '4' };
        int[] intArray4 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 0, 100);
    }

    @Test
    public void test00858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00858");
        int[] intArray5 = new int[] { 0, '4', ' ', (short) 0, 1 };
        int[] intArray7 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) -1, (int) (byte) -1);
    }

    @Test
    public void test00859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00859");
        int[] intArray4 = new int[] { 'a', (byte) 100, 0, (short) 100 };
        int[] intArray10 = new int[] { ' ', 10, (short) 100, (-1), (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) '#', 0);
    }

    @Test
    public void test00860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00860");
        int[] intArray2 = new int[] { 1, 100 };
        int[] intArray5 = new int[] { (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 1, (int) (byte) 100);
    }

    @Test
    public void test00861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00861");
        int[] intArray2 = new int[] { (short) 100, (-1) };
        int[] intArray7 = new int[] { (short) 1, 0, '4', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) -1, (int) 'a');
    }

    @Test
    public void test00862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00862");
        int[] intArray3 = new int[] { '#', 'a', 10 };
        int[] intArray8 = new int[] { (byte) -1, 1, 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 1, (int) ' ');
    }

    @Test
    public void test00863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00863");
        int[] intArray2 = new int[] { '4', 100 };
        int[] intArray9 = new int[] { '4', 10, (byte) -1, (short) 10, (-1), (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test00864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00864");
        int[] intArray5 = new int[] { (byte) 100, ' ', (byte) -1, (short) 100, 0 };
        int[] intArray9 = new int[] { (short) 0, (byte) 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 0, (int) (short) 100);
    }

    @Test
    public void test00865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00865");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, 'a', ' ' };
        int[] intArray10 = new int[] { 0, 1, (byte) 0, 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (-1), 1);
    }

    @Test
    public void test00866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00866");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray7 = new int[] { (short) -1, (byte) -1, 'a', '#', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (-1), (int) '#');
    }

    @Test
    public void test00867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00867");
        int[] intArray4 = new int[] { 10, (short) 0, '#', (byte) 0 };
        int[] intArray10 = new int[] { 1, 'a', (-1), '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (byte) -1, 0);
    }

    @Test
    public void test00868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00868");
        int[] intArray6 = new int[] { 10, (short) 1, 10, ' ', '#', '4' };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) '#', (-1));
    }

    @Test
    public void test00869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00869");
        int[] intArray5 = new int[] { (short) 100, ' ', (byte) 0, 0, 100 };
        int[] intArray7 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (-1), (int) '#');
    }

    @Test
    public void test00870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00870");
        int[] intArray3 = new int[] { '#', (short) 10, ' ' };
        int[] intArray5 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) 10, 0);
    }

    @Test
    public void test00871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00871");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray4 = new int[] { (byte) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, 1, (int) (short) 10);
    }

    @Test
    public void test00872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00872");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 100, ' ', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) 10, (int) (short) 1);
    }

    @Test
    public void test00873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00873");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 10, (short) 1, 10, (short) -1, (short) 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) '4', (int) (byte) 10);
    }

    @Test
    public void test00874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00874");
        int[] intArray3 = new int[] { (byte) 10, (short) 10, '#' };
        int[] intArray9 = new int[] { (-1), (byte) 10, 100, '#', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) '4', (int) '#');
    }

    @Test
    public void test00875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00875");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray5 = new int[] { 0, (byte) 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, 0, (int) (byte) 10);
    }

    @Test
    public void test00876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00876");
        int[] intArray1 = new int[] { 1 };
        int[] intArray4 = new int[] { ' ', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 0, (int) '#');
    }

    @Test
    public void test00877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00877");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) -1, ' ', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) 100, 10);
    }

    @Test
    public void test00878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00878");
        int[] intArray5 = new int[] { 0, (short) 100, (short) 10, (short) 1, (byte) 10 };
        int[] intArray12 = new int[] { 1, 'a', (-1), (byte) 100, (short) 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, 100, (int) (short) 10);
    }

    @Test
    public void test00879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00879");
        int[] intArray3 = new int[] { (short) -1, 100, (short) 10 };
        int[] intArray5 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, 0, (int) (byte) 1);
    }

    @Test
    public void test00880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00880");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, (short) 100, (short) 100, (-1) };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test00881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00881");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray5 = new int[] { (short) 1, (byte) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (-1), (int) (short) 1);
    }

    @Test
    public void test00882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00882");
        int[] intArray5 = new int[] { '4', (short) 100, 'a', 100, (short) 10 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) 0, (int) (short) -1);
    }

    @Test
    public void test00883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00883");
        int[] intArray5 = new int[] { '#', (byte) 1, 100, (byte) 10, (byte) -1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 100, 0);
    }

    @Test
    public void test00884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00884");
        int[] intArray3 = new int[] { (short) 10, 1, (short) -1 };
        int[] intArray8 = new int[] { ' ', (byte) -1, (byte) 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 0, (int) '#');
    }

    @Test
    public void test00885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00885");
        int[] intArray2 = new int[] { 0, '4' };
        int[] intArray4 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 0, 0);
    }

    @Test
    public void test00886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00886");
        int[] intArray4 = new int[] { '4', (byte) 100, (byte) 100, (short) -1 };
        int[] intArray6 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (-1), (int) ' ');
    }

    @Test
    public void test00887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00887");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 0, 10, 'a', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 100, 0);
    }

    @Test
    public void test00888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00888");
        int[] intArray2 = new int[] { 0, (short) 0 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) -1, (int) (short) -1);
    }

    @Test
    public void test00889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00889");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int[] intArray8 = new int[] { (-1), 10, (short) 100, '#', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 0, 10);
    }

    @Test
    public void test00890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00890");
        int[] intArray2 = new int[] { 1, (byte) 100 };
        int[] intArray5 = new int[] { (short) 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 0, (int) (byte) 100);
    }

    @Test
    public void test00891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00891");
        int[] intArray2 = new int[] { (byte) -1, (byte) -1 };
        int[] intArray5 = new int[] { '#', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 1, (int) ' ');
    }

    @Test
    public void test00892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00892");
        int[] intArray3 = new int[] { 10, 'a', (byte) -1 };
        int[] intArray9 = new int[] { 100, 1, (short) 0, (byte) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (byte) 100, 1);
    }

    @Test
    public void test00893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00893");
        int[] intArray2 = new int[] { (short) 0, (byte) -1 };
        int[] intArray5 = new int[] { '#', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 1, (int) '#');
    }

    @Test
    public void test00894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00894");
        int[] intArray3 = new int[] { 100, 100, (short) 1 };
        int[] intArray5 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test00895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00895");
        int[] intArray4 = new int[] { (byte) 10, (byte) 0, (short) 10, 1 };
        int[] intArray11 = new int[] { (short) 1, 1, ' ', ' ', 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (-1), (int) 'a');
    }

    @Test
    public void test00896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00896");
        int[] intArray2 = new int[] { (byte) 1, (byte) 100 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (-1), (int) (byte) 1);
    }

    @Test
    public void test00897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00897");
        int[] intArray5 = new int[] { ' ', (short) 0, 100, 1, 'a' };
        int[] intArray9 = new int[] { (byte) 10, (byte) 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 1, 0);
    }

    @Test
    public void test00898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00898");
        int[] intArray6 = new int[] { 10, 100, '#', (short) 10, (byte) -1, (short) 0 };
        int[] intArray13 = new int[] { (byte) 10, (byte) -1, (byte) 0, '#', (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 1, 10);
    }

    @Test
    public void test00899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00899");
        int[] intArray3 = new int[] { (byte) 0, (byte) 1, (short) 10 };
        int[] intArray7 = new int[] { (short) 0, (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) 0, (int) ' ');
    }

    @Test
    public void test00900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00900");
        int[] intArray3 = new int[] { (short) 1, (short) 10, (byte) 0 };
        int[] intArray8 = new int[] { '4', (short) 100, (short) -1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (byte) 100, (int) (byte) 1);
    }

    @Test
    public void test00901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00901");
        int[] intArray5 = new int[] { 'a', (byte) 1, (byte) 100, 0, '4' };
        int[] intArray11 = new int[] { (byte) 100, (byte) -1, (byte) -1, (-1), (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) 10, (int) (short) 100);
    }

    @Test
    public void test00902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00902");
        int[] intArray5 = new int[] { ' ', (byte) 100, (short) 1, 10, (short) -1 };
        int[] intArray7 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (-1), (int) ' ');
    }

    @Test
    public void test00903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00903");
        int[] intArray2 = new int[] { (-1), (short) 0 };
        int[] intArray5 = new int[] { (byte) 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 100, (int) (short) 0);
    }

    @Test
    public void test00904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00904");
        int[] intArray2 = new int[] { 100, 100 };
        int[] intArray8 = new int[] { (byte) 0, (short) 100, (-1), (byte) -1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 0, (int) (byte) 100);
    }

    @Test
    public void test00905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00905");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) 'a', 0);
    }

    @Test
    public void test00906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00906");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 0, (byte) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) 10, (int) (short) -1);
    }

    @Test
    public void test00907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00907");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) ' ', (int) (short) -1);
    }

    @Test
    public void test00908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00908");
        int[] intArray5 = new int[] { '#', 'a', ' ', (short) 1, (byte) 10 };
        int[] intArray8 = new int[] { (byte) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 0, (int) (short) 10);
    }

    @Test
    public void test00909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00909");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray4 = new int[] { (byte) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) '4', (int) '4');
    }

    @Test
    public void test00910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00910");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 0, (int) '#');
    }

    @Test
    public void test00911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00911");
        int[] intArray5 = new int[] { (-1), 10, (short) 1, (byte) 100, '4' };
        int[] intArray8 = new int[] { (short) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 10, (int) (byte) 100);
    }

    @Test
    public void test00912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00912");
        int[] intArray5 = new int[] { (byte) -1, (short) 1, '#', (byte) 1, 'a' };
        int[] intArray12 = new int[] { '#', (-1), (short) 10, (byte) 100, (byte) 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, 0, (-1));
    }

    @Test
    public void test00913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00913");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray8 = new int[] { (byte) 10, (short) 100, 10, 10, 'a', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) 100, 0);
    }

    @Test
    public void test00914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00914");
        int[] intArray4 = new int[] { (byte) 0, (byte) -1, (short) 0, (short) 100 };
        int[] intArray6 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (short) 100, (int) ' ');
    }

    @Test
    public void test00915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00915");
        int[] intArray3 = new int[] { (short) 0, '4', 1 };
        int[] intArray10 = new int[] { '4', ' ', '#', '4', 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 10, (int) ' ');
    }

    @Test
    public void test00916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00916");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray6 = new int[] { 0, (short) -1, (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 100, 0);
    }

    @Test
    public void test00917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00917");
        int[] intArray4 = new int[] { (short) 100, 10, '4', (byte) 0 };
        int[] intArray11 = new int[] { (byte) 10, (byte) 0, (byte) 0, '4', 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) 100, (int) (short) 1);
    }

    @Test
    public void test00918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00918");
        int[] intArray4 = new int[] { (byte) 10, (short) -1, (short) 0, '#' };
        int[] intArray11 = new int[] { (byte) 10, 'a', (short) 0, (short) 100, 'a', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) 'a', (int) '#');
    }

    @Test
    public void test00919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00919");
        int[] intArray3 = new int[] { 0, (short) 100, (byte) 10 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, 0, (int) 'a');
    }

    @Test
    public void test00920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00920");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (byte) 10, (int) (byte) 100);
    }

    @Test
    public void test00921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00921");
        int[] intArray4 = new int[] { (short) 0, 10, (short) 0, (byte) 0 };
        int[] intArray7 = new int[] { (byte) 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 0, (int) (byte) 10);
    }

    @Test
    public void test00922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00922");
        int[] intArray4 = new int[] { (byte) 10, 100, 'a', (byte) 10 };
        int[] intArray7 = new int[] { (-1), (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 1, (int) (short) 1);
    }

    @Test
    public void test00923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00923");
        int[] intArray5 = new int[] { 0, (byte) 100, (short) -1, '#', '4' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (short) 1, 10);
    }

    @Test
    public void test00924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00924");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { '#', (short) 1, (byte) 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) ' ', (int) (short) 100);
    }

    @Test
    public void test00925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00925");
        int[] intArray3 = new int[] { (byte) 10, 100, (byte) 10 };
        int[] intArray5 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) -1, 10);
    }

    @Test
    public void test00926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00926");
        int[] intArray4 = new int[] { 'a', (short) 0, (short) 10, (byte) 1 };
        int[] intArray8 = new int[] { 0, (byte) 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 0, 10);
    }

    @Test
    public void test00927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00927");
        int[] intArray4 = new int[] { (byte) 0, (short) 10, (byte) 100, (byte) 0 };
        int[] intArray7 = new int[] { (short) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 0, (int) (short) -1);
    }

    @Test
    public void test00928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00928");
        int[] intArray3 = new int[] { (byte) 1, 1, ' ' };
        int[] intArray9 = new int[] { (short) 0, 'a', '4', (short) 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) ' ', (int) (byte) 100);
    }

    @Test
    public void test00929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00929");
        int[] intArray5 = new int[] { 'a', '#', (byte) -1, (byte) 1, (byte) 1 };
        int[] intArray12 = new int[] { 'a', (short) 100, (short) 1, (short) 0, 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) 1, 1);
    }

    @Test
    public void test00930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00930");
        int[] intArray5 = new int[] { '#', 1, ' ', (short) 1, (byte) 10 };
        int[] intArray12 = new int[] { 10, (byte) -1, '#', '#', (short) 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, 0, (int) (short) 100);
    }

    @Test
    public void test00931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00931");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) ' ', (int) (byte) 10);
    }

    @Test
    public void test00932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00932");
        int[] intArray2 = new int[] { 100, (byte) 1 };
        int[] intArray4 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (-1), (int) (short) 10);
    }

    @Test
    public void test00933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00933");
        int[] intArray1 = new int[] { 10 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 1, (int) (byte) -1);
    }

    @Test
    public void test00934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00934");
        int[] intArray6 = new int[] { (short) 10, (byte) 0, '#', (byte) 10, (byte) 100, (byte) 10 };
        int[] intArray8 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 10, (int) (short) -1);
    }

    @Test
    public void test00935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00935");
        int[] intArray6 = new int[] { 0, 'a', '4', 10, (byte) -1, (short) 1 };
        int[] intArray13 = new int[] { 1, (byte) 10, 10, (byte) 0, 'a', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) 'a', (int) (byte) -1);
    }

    @Test
    public void test00936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00936");
        int[] intArray5 = new int[] { (byte) 0, '4', 'a', (short) 10, (byte) 0 };
        int[] intArray10 = new int[] { (short) -1, (byte) -1, 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (short) 0, (int) '4');
    }

    @Test
    public void test00937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00937");
        int[] intArray5 = new int[] { '#', (short) 1, (byte) 10, (short) 10, '4' };
        int[] intArray7 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) 1, 10);
    }

    @Test
    public void test00938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00938");
        int[] intArray5 = new int[] { '#', 100, (byte) -1, (short) 100, ' ' };
        int[] intArray8 = new int[] { (-1), (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (-1), (int) (byte) 0);
    }

    @Test
    public void test00939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00939");
        int[] intArray5 = new int[] { (short) 100, '4', (byte) 10, 1, (short) 100 };
        int[] intArray12 = new int[] { 'a', (short) 100, (byte) 1, (byte) 10, 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, 10, (int) ' ');
    }

    @Test
    public void test00940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00940");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) 1, 0, '#', (byte) 1, (short) -1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, 100, (int) '4');
    }

    @Test
    public void test00941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00941");
        int[] intArray5 = new int[] { (byte) -1, (short) -1, (byte) 10, (-1), 'a' };
        int[] intArray8 = new int[] { (byte) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) 10, 0);
    }

    @Test
    public void test00942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00942");
        int[] intArray1 = new int[] { 0 };
        int[] intArray3 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) -1, (int) ' ');
    }

    @Test
    public void test00943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00943");
        int[] intArray2 = new int[] { (byte) 1, (byte) -1 };
        int[] intArray7 = new int[] { (byte) 0, '#', (short) 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 0, (int) (byte) 100);
    }

    @Test
    public void test00944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00944");
        int[] intArray3 = new int[] { '4', (-1), (byte) 1 };
        int[] intArray10 = new int[] { (byte) 100, (byte) 10, (short) 10, '4', 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (byte) 0, (int) (short) 100);
    }

    @Test
    public void test00945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00945");
        int[] intArray5 = new int[] { (short) -1, (byte) 100, (short) 10, '4', (short) 1 };
        int[] intArray12 = new int[] { (short) 0, (short) 100, '4', 100, 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) 100, (int) '4');
    }

    @Test
    public void test00946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00946");
        int[] intArray3 = new int[] { 'a', ' ', 'a' };
        int[] intArray5 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, 0, (int) (byte) 100);
    }

    @Test
    public void test00947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00947");
        int[] intArray2 = new int[] { (-1), (byte) 0 };
        int[] intArray5 = new int[] { 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 0, (int) (short) 10);
    }

    @Test
    public void test00948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00948");
        int[] intArray1 = new int[] { '4' };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 0, 0);
    }

    @Test
    public void test00949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00949");
        int[] intArray6 = new int[] { (byte) 10, (byte) 100, 1, (byte) -1, (byte) 0, (-1) };
        int[] intArray8 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (byte) 1, 10);
    }

    @Test
    public void test00950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00950");
        int[] intArray3 = new int[] { 10, (short) 100, (short) 0 };
        int[] intArray5 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) '4', (int) '4');
    }

    @Test
    public void test00951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00951");
        int[] intArray6 = new int[] { 0, (byte) 10, (byte) 100, (byte) -1, (short) 10, (byte) 0 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) ' ', 1);
    }

    @Test
    public void test00952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00952");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (short) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) ' ', (int) (byte) -1);
    }

    @Test
    public void test00953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00953");
        int[] intArray3 = new int[] { (short) 1, (byte) -1, (byte) 1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) 'a', (int) (short) 100);
    }

    @Test
    public void test00954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00954");
        int[] intArray6 = new int[] { (short) 10, '4', 10, '#', (byte) -1, (byte) 0 };
        int[] intArray9 = new int[] { (byte) 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (short) 1, (int) (byte) 10);
    }

    @Test
    public void test00955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00955");
        int[] intArray2 = new int[] { ' ', (byte) 1 };
        int[] intArray6 = new int[] { (short) 1, (short) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) '4', (int) '4');
    }

    @Test
    public void test00956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00956");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 10, (short) -1, ' ' };
        int[] intArray7 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) ' ', (int) (short) -1);
    }

    @Test
    public void test00957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00957");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { '4', '4', (short) 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 100, 1);
    }

    @Test
    public void test00958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00958");
        int[] intArray2 = new int[] { (byte) -1, (short) 100 };
        int[] intArray9 = new int[] { 'a', ' ', '#', 1, (byte) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (byte) 1, (int) '#');
    }

    @Test
    public void test00959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00959");
        int[] intArray5 = new int[] { (byte) -1, '#', (-1), (short) -1, (byte) 10 };
        int[] intArray7 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, 10, 0);
    }

    @Test
    public void test00960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00960");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) 0, (-1));
    }

    @Test
    public void test00961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00961");
        int[] intArray5 = new int[] { (byte) 100, (byte) 100, ' ', 0, (byte) -1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) 'a', (int) (byte) 10);
    }

    @Test
    public void test00962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00962");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) 0, (byte) 10, (byte) -1, (byte) 0, (byte) 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) 100, (int) (byte) 1);
    }

    @Test
    public void test00963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00963");
        int[] intArray5 = new int[] { (short) 100, 0, (byte) -1, 0, '#' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 0, (int) 'a');
    }

    @Test
    public void test00964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00964");
        int[] intArray4 = new int[] { (byte) 100, 100, (byte) 0, (short) 0 };
        int[] intArray6 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, 100, (int) (short) 100);
    }

    @Test
    public void test00965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00965");
        int[] intArray5 = new int[] { (byte) 0, (byte) 10, 1, '#', (short) 10 };
        int[] intArray9 = new int[] { (short) 100, 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) -1, (int) '#');
    }

    @Test
    public void test00966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00966");
        int[] intArray4 = new int[] { '4', 0, (short) 100, (-1) };
        int[] intArray6 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) -1, (int) (byte) 10);
    }

    @Test
    public void test00967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00967");
        int[] intArray5 = new int[] { (byte) 100, 100, 100, (byte) 0, 0 };
        int[] intArray8 = new int[] { ' ', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) 1, 10);
    }

    @Test
    public void test00968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00968");
        int[] intArray5 = new int[] { (short) 10, 'a', (byte) 0, (byte) -1, (-1) };
        int[] intArray9 = new int[] { (short) -1, (short) 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 0, (-1));
    }

    @Test
    public void test00969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00969");
        int[] intArray5 = new int[] { (short) 1, (byte) 10, '4', '4', (byte) 0 };
        int[] intArray7 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) 0, (int) (byte) 10);
    }

    @Test
    public void test00970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00970");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray7 = new int[] { (short) 100, (byte) 100, (byte) 100, (byte) 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, 0, (int) ' ');
    }

    @Test
    public void test00971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00971");
        int[] intArray1 = new int[] { '4' };
        int[] intArray7 = new int[] { 'a', 1, (byte) 10, 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) '4', (int) (byte) -1);
    }

    @Test
    public void test00972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00972");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) 10, (int) ' ');
    }

    @Test
    public void test00973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00973");
        int[] intArray3 = new int[] { ' ', (short) -1, (byte) -1 };
        int[] intArray8 = new int[] { (byte) 10, 100, '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 0, 10);
    }

    @Test
    public void test00974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00974");
        int[] intArray4 = new int[] { 10, (short) 10, (byte) 10, (byte) 100 };
        int[] intArray8 = new int[] { (short) 10, (-1), (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (-1), (int) (byte) 0);
    }

    @Test
    public void test00975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00975");
        int[] intArray3 = new int[] { (byte) -1, (byte) 1, ' ' };
        int[] intArray8 = new int[] { (byte) 0, (byte) 10, (short) 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test00976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00976");
        int[] intArray5 = new int[] { 'a', 10, 100, (short) -1, (byte) 100 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) 'a', (int) (short) 100);
    }

    @Test
    public void test00977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00977");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, 1, (int) (short) -1);
    }

    @Test
    public void test00978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00978");
        int[] intArray6 = new int[] { (short) 1, (short) 1, (short) 0, '4', (byte) -1, (byte) 10 };
        int[] intArray10 = new int[] { 'a', (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (short) 0, (int) (short) 100);
    }

    @Test
    public void test00979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00979");
        int[] intArray5 = new int[] { 'a', 100, 100, (-1), 0 };
        int[] intArray10 = new int[] { ' ', 100, (byte) 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (byte) 10, 0);
    }

    @Test
    public void test00980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00980");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray3 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, 0, (int) (byte) 10);
    }

    @Test
    public void test00981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00981");
        int[] intArray5 = new int[] { (byte) 100, (short) 10, 1, (short) 10, 0 };
        int[] intArray11 = new int[] { (byte) 100, 1, (byte) 10, 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (-1), (int) '#');
    }

    @Test
    public void test00982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00982");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (short) 10, 1);
    }

    @Test
    public void test00983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00983");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray4 = new int[] { 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) '#', 0);
    }

    @Test
    public void test00984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00984");
        int[] intArray5 = new int[] { '#', '4', 'a', (short) 10, (byte) 0 };
        int[] intArray8 = new int[] { (short) 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) '#', 1);
    }

    @Test
    public void test00985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00985");
        int[] intArray4 = new int[] { (short) -1, '#', (byte) 1, (byte) -1 };
        int[] intArray8 = new int[] { (short) -1, (byte) 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 1, (int) (byte) -1);
    }

    @Test
    public void test00986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00986");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (-1), (int) (short) 1);
    }

    @Test
    public void test00987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00987");
        int[] intArray5 = new int[] { ' ', '4', ' ', ' ', (short) -1 };
        int[] intArray11 = new int[] { 100, (short) 10, (byte) -1, '4', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 1, 0);
    }

    @Test
    public void test00988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00988");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 'a', ' ', (-1), (byte) 0, ' ', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) 10, 100);
    }

    @Test
    public void test00989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00989");
        int[] intArray6 = new int[] { 100, (short) 100, (byte) 100, (byte) 0, (short) 100, ' ' };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) 10, (int) ' ');
    }

    @Test
    public void test00990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00990");
        int[] intArray3 = new int[] { (short) 0, (short) 10, (byte) 10 };
        int[] intArray8 = new int[] { (short) 10, (short) 100, '#', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (byte) 10, 0);
    }

    @Test
    public void test00991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00991");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray6 = new int[] { (byte) 10, (short) 0, (short) 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (byte) 0, (int) '4');
    }

    @Test
    public void test00992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00992");
        int[] intArray4 = new int[] { ' ', (short) 100, (byte) 0, 'a' };
        int[] intArray6 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) 'a', 10);
    }

    @Test
    public void test00993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00993");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (short) 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (short) -1, (int) ' ');
    }

    @Test
    public void test00994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00994");
        int[] intArray5 = new int[] { 10, (short) -1, (byte) 100, (byte) 0, (short) 100 };
        int[] intArray7 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) 0, (int) (byte) 100);
    }

    @Test
    public void test00995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00995");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, 0, (int) (short) 100);
    }

    @Test
    public void test00996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00996");
        int[] intArray5 = new int[] { (short) -1, (short) 100, (short) -1, 10, (byte) 0 };
        int[] intArray8 = new int[] { (short) -1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) 0, 100);
    }

    @Test
    public void test00997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00997");
        int[] intArray4 = new int[] { 0, '#', 1, '4' };
        int[] intArray9 = new int[] { ' ', (short) -1, 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (byte) 0, (int) (short) -1);
    }

    @Test
    public void test00998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00998");
        int[] intArray4 = new int[] { (byte) 100, 100, 10, (short) 0 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (short) -1, (int) '#');
    }

    @Test
    public void test00999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test00999");
        int[] intArray4 = new int[] { 10, ' ', (short) 0, (short) 100 };
        int[] intArray11 = new int[] { 10, '#', (short) 1, 1, (byte) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) 'a', (int) ' ');
    }

    @Test
    public void test01000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test01000");
        int[] intArray2 = new int[] { '4', '#' };
        int[] intArray9 = new int[] { (short) 0, (short) 100, '4', '4', '4', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (short) -1, 0);
    }
}

