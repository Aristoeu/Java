package KnapsackMemoization;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest25 {

    public static boolean debug = false;

    @Test
    public void test12501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12501");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray6 = new int[] { (short) 100, (-1), '#', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (short) -1, 10);
    }

    @Test
    public void test12502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12502");
        int[] intArray6 = new int[] { (byte) 100, (byte) 10, ' ', (short) 100, '#', 10 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) '#', 10);
    }

    @Test
    public void test12503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12503");
        int[] intArray4 = new int[] { 10, (byte) 0, (byte) 0, 1 };
        int[] intArray8 = new int[] { (short) -1, (short) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 0, (int) (byte) 1);
    }

    @Test
    public void test12504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12504");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 1, 10, 10, (byte) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) '4', (int) '4');
    }

    @Test
    public void test12505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12505");
        int[] intArray3 = new int[] { 0, (byte) 100, '#' };
        int[] intArray8 = new int[] { (byte) 1, (byte) 0, 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) 'a', (int) (byte) 1);
    }

    @Test
    public void test12506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12506");
        int[] intArray4 = new int[] { ' ', (short) 1, 100, 0 };
        int[] intArray10 = new int[] { (byte) 10, (short) 10, (-1), (byte) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (byte) 10, (int) (short) 1);
    }

    @Test
    public void test12507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12507");
        int[] intArray6 = new int[] { 10, 10, (short) 10, (byte) -1, ' ', ' ' };
        int[] intArray12 = new int[] { (short) 100, ' ', (short) 1, (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (byte) 10, (int) (short) 100);
    }

    @Test
    public void test12508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12508");
        int[] intArray4 = new int[] { (-1), (byte) 1, 10, (byte) 10 };
        int[] intArray8 = new int[] { 0, 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) '4', (int) (byte) 1);
    }

    @Test
    public void test12509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12509");
        int[] intArray2 = new int[] { (short) -1, 'a' };
        int[] intArray4 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) '#', 0);
    }

    @Test
    public void test12510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12510");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 0, (-1));
    }

    @Test
    public void test12511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12511");
        int[] intArray5 = new int[] { (byte) 1, (short) 10, (byte) 100, (short) -1, 10 };
        int[] intArray10 = new int[] { (short) 1, (short) 10, (short) 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 0, 0);
    }

    @Test
    public void test12512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12512");
        int[] intArray4 = new int[] { 'a', 10, (-1), '4' };
        int[] intArray8 = new int[] { (byte) 1, (short) 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) '4', 0);
    }

    @Test
    public void test12513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12513");
        int[] intArray4 = new int[] { (byte) -1, 1, (-1), (byte) 100 };
        int[] intArray7 = new int[] { ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (-1), (int) (short) 10);
    }

    @Test
    public void test12514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12514");
        int[] intArray1 = new int[] { '#' };
        int[] intArray6 = new int[] { (byte) -1, (short) 10, '4', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (short) 0, (int) (short) 100);
    }

    @Test
    public void test12515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12515");
        int[] intArray5 = new int[] { ' ', ' ', '4', ' ', '4' };
        int[] intArray11 = new int[] { (byte) 10, (short) 0, (short) 1, 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) 10, 0);
    }

    @Test
    public void test12516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12516");
        int[] intArray3 = new int[] { '#', '4', (short) -1 };
        int[] intArray10 = new int[] { 100, '4', (short) 0, (-1), (short) 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 100, (int) '#');
    }

    @Test
    public void test12517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12517");
        int[] intArray2 = new int[] { (byte) 1, (byte) 0 };
        int[] intArray5 = new int[] { 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 10, (int) (short) 0);
    }

    @Test
    public void test12518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12518");
        int[] intArray4 = new int[] { (short) 1, (byte) -1, (short) -1, '4' };
        int[] intArray9 = new int[] { (byte) 100, 1, 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) 'a', (int) (short) 0);
    }

    @Test
    public void test12519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12519");
        int[] intArray3 = new int[] { (short) 0, ' ', (byte) -1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) '4', 100);
    }

    @Test
    public void test12520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12520");
        int[] intArray5 = new int[] { '#', 1, '#', (byte) 1, (byte) 1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) 100, 10);
    }

    @Test
    public void test12521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12521");
        int[] intArray5 = new int[] { 1, (short) 10, 10, 'a', (byte) 1 };
        int[] intArray7 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) 'a', (int) (byte) 0);
    }

    @Test
    public void test12522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12522");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test12523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12523");
        int[] intArray4 = new int[] { ' ', (short) -1, (short) -1, 0 };
        int[] intArray6 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (short) -1, (int) (short) 0);
    }

    @Test
    public void test12524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12524");
        int[] intArray5 = new int[] { 0, 0, 100, (short) 1, (short) -1 };
        int[] intArray11 = new int[] { (short) -1, (-1), (short) 1, 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) 1, 10);
    }

    @Test
    public void test12525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12525");
        int[] intArray5 = new int[] { (short) -1, 0, '#', (byte) 1, 100 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (-1), (int) (short) 10);
    }

    @Test
    public void test12526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12526");
        int[] intArray6 = new int[] { '4', '#', (short) 10, 1, 10, 1 };
        int[] intArray9 = new int[] { '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (short) 0, (int) (short) 0);
    }

    @Test
    public void test12527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12527");
        int[] intArray4 = new int[] { 10, '4', (short) 0, 100 };
        int[] intArray8 = new int[] { (short) 1, '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) '#', (int) 'a');
    }

    @Test
    public void test12528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12528");
        int[] intArray5 = new int[] { '#', (byte) 1, (short) 10, ' ', 10 };
        int[] intArray10 = new int[] { 10, 10, (byte) 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (short) -1, (int) (byte) 0);
    }

    @Test
    public void test12529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12529");
        int[] intArray3 = new int[] { '#', ' ', 0 };
        int[] intArray8 = new int[] { 1, ' ', (byte) 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (short) 1, (int) (short) 100);
    }

    @Test
    public void test12530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12530");
        int[] intArray5 = new int[] { ' ', 10, 100, (byte) 0, 0 };
        int[] intArray8 = new int[] { (short) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 0, (int) '#');
    }

    @Test
    public void test12531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12531");
        int[] intArray4 = new int[] { (byte) 10, 10, 10, (byte) 0 };
        int[] intArray10 = new int[] { ' ', (byte) 10, 100, (-1), (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) ' ', (int) (short) 100);
    }

    @Test
    public void test12532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12532");
        int[] intArray6 = new int[] { (byte) 100, (byte) 0, 0, 0, 0, (-1) };
        int[] intArray12 = new int[] { '4', ' ', (byte) -1, 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 100, 0);
    }

    @Test
    public void test12533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12533");
        int[] intArray4 = new int[] { 'a', (-1), 0, 0 };
        int[] intArray11 = new int[] { (short) -1, (short) 1, (byte) 0, (byte) 10, '4', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, 1, 0);
    }

    @Test
    public void test12534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12534");
        int[] intArray4 = new int[] { (short) 10, (short) -1, 10, ' ' };
        int[] intArray7 = new int[] { 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 1, (-1));
    }

    @Test
    public void test12535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12535");
        int[] intArray4 = new int[] { ' ', 100, (byte) 0, '4' };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) '#', (int) (byte) -1);
    }

    @Test
    public void test12536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12536");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray7 = new int[] { '4', (short) 10, 100, (short) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, 0, 100);
    }

    @Test
    public void test12537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12537");
        int[] intArray3 = new int[] { (short) -1, (short) -1, ' ' };
        int[] intArray5 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) -1, (int) (short) 100);
    }

    @Test
    public void test12538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12538");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray6 = new int[] { (short) -1, (byte) 100, (short) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) '4', (int) (short) -1);
    }

    @Test
    public void test12539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12539");
        int[] intArray3 = new int[] { (short) 1, (short) 0, 1 };
        int[] intArray5 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) -1, (int) (short) 100);
    }

    @Test
    public void test12540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12540");
        int[] intArray6 = new int[] { '4', 1, '#', (byte) 0, 1, (short) 100 };
        int[] intArray9 = new int[] { (short) 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) ' ', 10);
    }

    @Test
    public void test12541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12541");
        int[] intArray5 = new int[] { 10, (short) 10, 0, '#', ' ' };
        int[] intArray11 = new int[] { '#', (short) 0, (byte) -1, (byte) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) '4', (int) (byte) 10);
    }

    @Test
    public void test12542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12542");
        int[] intArray5 = new int[] { (byte) -1, '4', (byte) -1, (byte) 10, (byte) 100 };
        int[] intArray9 = new int[] { (short) 1, 'a', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (byte) 100, (int) '#');
    }

    @Test
    public void test12543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12543");
        int[] intArray1 = new int[] { 100 };
        int[] intArray7 = new int[] { (short) -1, (byte) 0, 'a', (byte) 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) 1, (int) (short) 10);
    }

    @Test
    public void test12544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12544");
        int[] intArray2 = new int[] { (short) 1, 10 };
        int[] intArray5 = new int[] { (-1), (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 1, (int) (short) 10);
    }

    @Test
    public void test12545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12545");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray4 = new int[] { (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) 'a', (int) 'a');
    }

    @Test
    public void test12546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12546");
        int[] intArray3 = new int[] { (byte) -1, (byte) 10, 10 };
        int[] intArray9 = new int[] { (short) -1, 0, 100, 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 100, (int) (byte) -1);
    }

    @Test
    public void test12547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12547");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray4 = new int[] { ' ', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, 10, (int) (short) 10);
    }

    @Test
    public void test12548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12548");
        int[] intArray2 = new int[] { 10, '4' };
        int[] intArray8 = new int[] { ' ', ' ', 10, (short) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test12549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12549");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) 10, 'a', (short) 10, (-1), (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test12550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12550");
        int[] intArray4 = new int[] { 1, (short) -1, (short) 100, (short) 100 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (short) 10, (int) (byte) 10);
    }

    @Test
    public void test12551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12551");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 1, 0);
    }

    @Test
    public void test12552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12552");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (byte) 1, (short) -1, (short) -1, (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) 10, (int) (byte) 1);
    }

    @Test
    public void test12553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12553");
        int[] intArray2 = new int[] { '4', (byte) 1 };
        int[] intArray6 = new int[] { (byte) 10, 'a', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test12554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12554");
        int[] intArray2 = new int[] { 1, 'a' };
        int[] intArray5 = new int[] { 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test12555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12555");
        int[] intArray3 = new int[] { (byte) 10, (-1), (short) 100 };
        int[] intArray6 = new int[] { 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, 0, (int) (byte) -1);
    }

    @Test
    public void test12556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12556");
        int[] intArray5 = new int[] { (byte) 10, (byte) 100, '#', (byte) 1, (short) -1 };
        int[] intArray7 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) 0, 100);
    }

    @Test
    public void test12557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12557");
        int[] intArray6 = new int[] { (short) -1, 0, '#', (byte) -1, 1, (short) 1 };
        int[] intArray9 = new int[] { ' ', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, 1, 0);
    }

    @Test
    public void test12558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12558");
        int[] intArray3 = new int[] { (byte) 100, 1, (byte) 1 };
        int[] intArray9 = new int[] { (byte) -1, (short) 0, '#', (short) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test12559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12559");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, 1, 1);
    }

    @Test
    public void test12560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12560");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) ' ', (int) '4');
    }

    @Test
    public void test12561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12561");
        int[] intArray6 = new int[] { (short) 10, (short) 100, (short) 10, (short) 0, (byte) -1, ' ' };
        int[] intArray9 = new int[] { (byte) 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (short) 0, 1);
    }

    @Test
    public void test12562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12562");
        int[] intArray2 = new int[] { (short) 0, (byte) -1 };
        int[] intArray8 = new int[] { (short) 1, (byte) 10, (byte) 1, (short) 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (byte) 100, (int) '#');
    }

    @Test
    public void test12563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12563");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 10, (byte) 10, 1, (byte) -1, (-1), (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) '4', (int) ' ');
    }

    @Test
    public void test12564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12564");
        int[] intArray5 = new int[] { (-1), (byte) 10, (byte) -1, '4', (byte) 10 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) 100, (int) (byte) -1);
    }

    @Test
    public void test12565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12565");
        int[] intArray6 = new int[] { '#', (short) 100, 10, 10, (short) 10, 100 };
        int[] intArray10 = new int[] { 100, (byte) 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 0, (int) (byte) 10);
    }

    @Test
    public void test12566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12566");
        int[] intArray5 = new int[] { 10, (byte) 100, '#', (-1), 100 };
        int[] intArray7 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, 10, (int) (short) 100);
    }

    @Test
    public void test12567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12567");
        int[] intArray4 = new int[] { ' ', (short) -1, (short) 100, '#' };
        int[] intArray10 = new int[] { 1, (byte) 100, ' ', (short) 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (byte) 1, 0);
    }

    @Test
    public void test12568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12568");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, 10, 0);
    }

    @Test
    public void test12569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12569");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { ' ', 100, 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 0, (int) ' ');
    }

    @Test
    public void test12570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12570");
        int[] intArray4 = new int[] { 0, (byte) 10, (byte) 100, 1 };
        int[] intArray8 = new int[] { (short) 10, (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) 100, (int) (short) 100);
    }

    @Test
    public void test12571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12571");
        int[] intArray5 = new int[] { 10, (byte) 1, 10, 10, (short) 1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (short) 0, (int) '#');
    }

    @Test
    public void test12572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12572");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray6 = new int[] { (byte) 10, (byte) 10, (short) 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (-1), (int) (byte) 0);
    }

    @Test
    public void test12573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12573");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray4 = new int[] { (short) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) '#', 10);
    }

    @Test
    public void test12574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12574");
        int[] intArray6 = new int[] { (short) 100, (byte) -1, ' ', 100, (short) -1, 10 };
        int[] intArray12 = new int[] { (-1), (byte) 10, (byte) 1, (byte) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (-1), 100);
    }

    @Test
    public void test12575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12575");
        int[] intArray6 = new int[] { (byte) 100, (byte) 100, 10, '#', ' ', (byte) -1 };
        int[] intArray11 = new int[] { ' ', (byte) 10, 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (short) 10, (-1));
    }

    @Test
    public void test12576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12576");
        int[] intArray4 = new int[] { ' ', 10, ' ', (byte) -1 };
        int[] intArray7 = new int[] { (-1), (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) 0, (int) (byte) -1);
    }

    @Test
    public void test12577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12577");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, 100, (int) (short) 1);
    }

    @Test
    public void test12578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12578");
        int[] intArray3 = new int[] { 10, (byte) 0, 'a' };
        int[] intArray5 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) 1, (int) '#');
    }

    @Test
    public void test12579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12579");
        int[] intArray2 = new int[] { (byte) 100, 100 };
        int[] intArray6 = new int[] { '#', (byte) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (short) 10, 1);
    }

    @Test
    public void test12580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12580");
        int[] intArray2 = new int[] { (short) 10, ' ' };
        int[] intArray6 = new int[] { 0, 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) '4', (int) (short) 0);
    }

    @Test
    public void test12581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12581");
        int[] intArray4 = new int[] { '4', (byte) 10, (short) 100, ' ' };
        int[] intArray10 = new int[] { '4', ' ', (byte) 0, (byte) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, 10, (int) (short) -1);
    }

    @Test
    public void test12582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12582");
        int[] intArray4 = new int[] { 100, 100, '#', 10 };
        int[] intArray7 = new int[] { '#', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) 10, 100);
    }

    @Test
    public void test12583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12583");
        int[] intArray5 = new int[] { (byte) 100, (short) -1, 1, (byte) 0, (short) 10 };
        int[] intArray10 = new int[] { (short) 0, (short) 0, ' ', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) '4', (int) (byte) 0);
    }

    @Test
    public void test12584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12584");
        int[] intArray3 = new int[] { (short) 1, (byte) 10, (short) 0 };
        int[] intArray8 = new int[] { 1, 100, (short) 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) '4', 1);
    }

    @Test
    public void test12585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12585");
        int[] intArray4 = new int[] { '4', 1, (-1), (short) -1 };
        int[] intArray6 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, 10, (int) (byte) 0);
    }

    @Test
    public void test12586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12586");
        int[] intArray3 = new int[] { '#', 0, 100 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (byte) 0, 0);
    }

    @Test
    public void test12587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12587");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, (-1), (byte) 100, (byte) 100, (short) 1 };
        int[] intArray8 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) 'a', (-1));
    }

    @Test
    public void test12588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12588");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test12589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12589");
        int[] intArray2 = new int[] { (byte) -1, (-1) };
        int[] intArray5 = new int[] { ' ', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (byte) 100, 1);
    }

    @Test
    public void test12590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12590");
        int[] intArray5 = new int[] { '#', ' ', (short) 100, 0, '4' };
        int[] intArray12 = new int[] { 1, 0, (-1), 100, (byte) 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, 100, 0);
    }

    @Test
    public void test12591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12591");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) 10, (-1), '#', (short) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) -1, (int) (short) 1);
    }

    @Test
    public void test12592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12592");
        int[] intArray6 = new int[] { 'a', 0, (byte) -1, 'a', (byte) 0, 10 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, 0, 0);
    }

    @Test
    public void test12593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12593");
        int[] intArray6 = new int[] { (byte) 0, (byte) -1, (short) -1, (short) 1, 1, (short) 1 };
        int[] intArray10 = new int[] { (short) 10, (short) 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) 0, (int) (byte) -1);
    }

    @Test
    public void test12594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12594");
        int[] intArray5 = new int[] { 0, (short) 100, (-1), (short) 10, 1 };
        int[] intArray12 = new int[] { (byte) -1, 100, (byte) 100, (short) 1, (byte) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (byte) -1, (int) (byte) 1);
    }

    @Test
    public void test12595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12595");
        int[] intArray5 = new int[] { (short) 100, (byte) -1, 0, (short) 10, (byte) -1 };
        int[] intArray8 = new int[] { (short) 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 100, 10);
    }

    @Test
    public void test12596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12596");
        int[] intArray6 = new int[] { 10, (short) 1, (byte) -1, '#', (short) -1, (short) -1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) 1, (int) ' ');
    }

    @Test
    public void test12597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12597");
        int[] intArray2 = new int[] { (byte) 10, '4' };
        int[] intArray6 = new int[] { (byte) 100, (short) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 100, (int) (byte) 100);
    }

    @Test
    public void test12598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12598");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray3 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, 1, (int) (short) 100);
    }

    @Test
    public void test12599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12599");
        int[] intArray4 = new int[] { 1, 100, (short) 100, (byte) -1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (byte) 1, (int) '4');
    }

    @Test
    public void test12600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12600");
        int[] intArray4 = new int[] { (byte) 0, (byte) 1, (byte) -1, 100 };
        int[] intArray7 = new int[] { (short) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) '4', 100);
    }

    @Test
    public void test12601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12601");
        int[] intArray4 = new int[] { (short) 10, 100, 10, ' ' };
        int[] intArray6 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (short) -1, (int) (short) 0);
    }

    @Test
    public void test12602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12602");
        int[] intArray5 = new int[] { (byte) 0, 'a', (byte) -1, '4', (byte) -1 };
        int[] intArray7 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, 0, 1);
    }

    @Test
    public void test12603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12603");
        int[] intArray2 = new int[] { 1, (short) 1 };
        int[] intArray4 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) '4', 1);
    }

    @Test
    public void test12604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12604");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int[] intArray8 = new int[] { (byte) 100, '4', (short) 0, (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) -1, 10);
    }

    @Test
    public void test12605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12605");
        int[] intArray6 = new int[] { '#', 10, 100, (byte) 1, (byte) -1, (byte) 10 };
        int[] intArray13 = new int[] { (byte) 1, (-1), 0, (short) 0, (short) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (byte) 10, 0);
    }

    @Test
    public void test12606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12606");
        int[] intArray6 = new int[] { (byte) 0, (short) 1, (byte) -1, (short) 0, (byte) 10, (short) 10 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) -1, 1);
    }

    @Test
    public void test12607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12607");
        int[] intArray3 = new int[] { (byte) 100, '4', 'a' };
        int[] intArray5 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) -1, (int) (short) -1);
    }

    @Test
    public void test12608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12608");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (byte) 1, 10);
    }

    @Test
    public void test12609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12609");
        int[] intArray2 = new int[] { (byte) -1, (-1) };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) ' ', (-1));
    }

    @Test
    public void test12610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12610");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (-1), (short) 0, 10, 100, (-1), (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) 10, (int) (byte) 1);
    }

    @Test
    public void test12611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12611");
        int[] intArray5 = new int[] { (short) -1, (short) 0, (short) 0, (short) 1, (byte) 100 };
        int[] intArray9 = new int[] { (byte) 1, (byte) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 100, (int) '4');
    }

    @Test
    public void test12612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12612");
        int[] intArray3 = new int[] { ' ', (short) 10, ' ' };
        int[] intArray5 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, 1, (int) (short) -1);
    }

    @Test
    public void test12613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12613");
        int[] intArray5 = new int[] { 100, (-1), (byte) -1, (byte) -1, (short) 0 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test12614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12614");
        int[] intArray5 = new int[] { (short) -1, 0, 10, 10, (byte) 0 };
        int[] intArray10 = new int[] { (short) 0, (short) 100, (-1), (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (short) 100, (int) (byte) -1);
    }

    @Test
    public void test12615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12615");
        int[] intArray2 = new int[] { (byte) 1, (byte) -1 };
        int[] intArray8 = new int[] { ' ', (byte) 10, 'a', (short) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) 'a', 1);
    }

    @Test
    public void test12616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12616");
        int[] intArray3 = new int[] { (short) 100, (short) 1, (byte) -1 };
        int[] intArray5 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, 0, 1);
    }

    @Test
    public void test12617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12617");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { '#', (short) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, 0, (int) 'a');
    }

    @Test
    public void test12618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12618");
        int[] intArray5 = new int[] { (byte) 10, '4', 0, (short) -1, '#' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) '4', (int) (short) 10);
    }

    @Test
    public void test12619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12619");
        int[] intArray3 = new int[] { (byte) 10, (byte) 0, '#' };
        int[] intArray7 = new int[] { (short) 1, (short) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) -1, (-1));
    }

    @Test
    public void test12620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12620");
        int[] intArray5 = new int[] { (short) 1, (short) 1, 1, '4', (-1) };
        int[] intArray8 = new int[] { 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (-1), (-1));
    }

    @Test
    public void test12621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12621");
        int[] intArray5 = new int[] { '4', (-1), 1, 10, 0 };
        int[] intArray7 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (short) 100, (int) 'a');
    }

    @Test
    public void test12622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12622");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 10, 1, (byte) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 10, 100);
    }

    @Test
    public void test12623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12623");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 'a', (short) -1, (short) -1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 1, (int) (short) 10);
    }

    @Test
    public void test12624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12624");
        int[] intArray6 = new int[] { 'a', (byte) 10, (-1), (byte) -1, ' ', (byte) 1 };
        int[] intArray8 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) ' ', 1);
    }

    @Test
    public void test12625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12625");
        int[] intArray5 = new int[] { '#', 1, (short) -1, (byte) 100, 1 };
        int[] intArray9 = new int[] { '#', (byte) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) ' ', (int) (byte) -1);
    }

    @Test
    public void test12626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12626");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test12627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12627");
        int[] intArray4 = new int[] { (short) -1, (byte) 10, 100, (short) 100 };
        int[] intArray9 = new int[] { 0, (short) 100, 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) 1, 1);
    }

    @Test
    public void test12628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12628");
        int[] intArray4 = new int[] { (short) 0, '4', '#', 0 };
        int[] intArray10 = new int[] { 100, (short) 1, 1, (byte) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) 'a', (int) (byte) 0);
    }

    @Test
    public void test12629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12629");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 0, 10, (byte) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test12630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12630");
        int[] intArray4 = new int[] { (byte) 10, 100, 0, '4' };
        int[] intArray6 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, 100, (int) (short) 100);
    }

    @Test
    public void test12631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12631");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray4 = new int[] { 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (short) 1, (int) '4');
    }

    @Test
    public void test12632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12632");
        int[] intArray2 = new int[] { (byte) 0, ' ' };
        int[] intArray7 = new int[] { (short) 10, (short) 1, ' ', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 0, 100);
    }

    @Test
    public void test12633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12633");
        int[] intArray3 = new int[] { (short) 1, '#', (short) 0 };
        int[] intArray9 = new int[] { (byte) -1, 'a', (short) 1, 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test12634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12634");
        int[] intArray4 = new int[] { (short) 1, (byte) 0, (byte) 1, 0 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) '#', (-1));
    }

    @Test
    public void test12635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12635");
        int[] intArray1 = new int[] { 0 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 1, 0);
    }

    @Test
    public void test12636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12636");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray8 = new int[] { 1, (short) 1, '#', 1, 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) 100, (int) (short) 0);
    }

    @Test
    public void test12637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12637");
        int[] intArray2 = new int[] { (byte) 1, (byte) -1 };
        int[] intArray5 = new int[] { (short) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 1, (int) (short) 0);
    }

    @Test
    public void test12638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12638");
        int[] intArray2 = new int[] { (short) 0, (byte) -1 };
        int[] intArray6 = new int[] { (byte) 0, (short) 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) 100, (int) (byte) 100);
    }

    @Test
    public void test12639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12639");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 100, (byte) 0, (byte) 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) ' ', (int) '#');
    }

    @Test
    public void test12640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12640");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { ' ', 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) -1, 10);
    }

    @Test
    public void test12641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12641");
        int[] intArray6 = new int[] { 1, (byte) -1, 1, 1, (-1), (byte) -1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, 100, (int) (byte) 0);
    }

    @Test
    public void test12642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12642");
        int[] intArray6 = new int[] { '#', (short) 100, (short) 0, 1, (byte) 10, (byte) 10 };
        int[] intArray11 = new int[] { 0, (byte) 0, (short) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 1, (-1));
    }

    @Test
    public void test12643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12643");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 1, (short) 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) 10, (int) ' ');
    }

    @Test
    public void test12644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12644");
        int[] intArray5 = new int[] { (-1), '#', (byte) -1, 100, (byte) 10 };
        int[] intArray10 = new int[] { (byte) 100, (short) 1, (short) 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (short) 100, (int) (short) 100);
    }

    @Test
    public void test12645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12645");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray3 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, 1, (-1));
    }

    @Test
    public void test12646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12646");
        int[] intArray3 = new int[] { (short) 1, 1, (byte) 0 };
        int[] intArray5 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) ' ', (int) (short) 0);
    }

    @Test
    public void test12647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12647");
        int[] intArray2 = new int[] { (byte) 100, ' ' };
        int[] intArray8 = new int[] { (short) 0, 100, (-1), (short) 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (byte) 1, 0);
    }

    @Test
    public void test12648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12648");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 0, (int) (short) 100);
    }

    @Test
    public void test12649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12649");
        int[] intArray2 = new int[] { (short) -1, (byte) 100 };
        int[] intArray4 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 0, (int) (short) 0);
    }

    @Test
    public void test12650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12650");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray3 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, 0, (int) (byte) 100);
    }

    @Test
    public void test12651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12651");
        int[] intArray5 = new int[] { 10, 10, (byte) 100, (byte) 0, 10 };
        int[] intArray8 = new int[] { 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) '4', 0);
    }

    @Test
    public void test12652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12652");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 10, 10, (-1), 100, (short) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (-1), 0);
    }

    @Test
    public void test12653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12653");
        int[] intArray3 = new int[] { (-1), '4', (short) 100 };
        int[] intArray5 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) 100, (int) (short) 1);
    }

    @Test
    public void test12654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12654");
        int[] intArray4 = new int[] { ' ', (byte) 1, (short) 1, (byte) 0 };
        int[] intArray11 = new int[] { (byte) 0, 10, (byte) -1, (short) 100, (short) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) ' ', (int) '#');
    }

    @Test
    public void test12655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12655");
        int[] intArray2 = new int[] { '4', ' ' };
        int[] intArray4 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (byte) 1, (int) (short) 10);
    }

    @Test
    public void test12656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12656");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 0, 1);
    }

    @Test
    public void test12657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12657");
        int[] intArray2 = new int[] { (-1), (byte) 100 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (byte) 0, (int) '#');
    }

    @Test
    public void test12658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12658");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray5 = new int[] { ' ', (short) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) 0, (int) (short) -1);
    }

    @Test
    public void test12659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12659");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (short) 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (short) -1, (int) 'a');
    }

    @Test
    public void test12660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12660");
        int[] intArray3 = new int[] { '4', (short) 10, (short) 1 };
        int[] intArray8 = new int[] { 100, (-1), (-1), 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) 'a', (int) (short) 0);
    }

    @Test
    public void test12661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12661");
        int[] intArray4 = new int[] { (byte) 0, 1, (short) 1, 100 };
        int[] intArray7 = new int[] { ' ', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) -1, (int) (byte) -1);
    }

    @Test
    public void test12662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12662");
        int[] intArray5 = new int[] { (byte) 100, 100, (short) -1, 'a', (short) 0 };
        int[] intArray8 = new int[] { (byte) 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) '#', 0);
    }

    @Test
    public void test12663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12663");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { '4', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) ' ', (int) '4');
    }

    @Test
    public void test12664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12664");
        int[] intArray4 = new int[] { ' ', (byte) -1, (short) 10, (byte) 100 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (short) 1, (-1));
    }

    @Test
    public void test12665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12665");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 'a', 'a', 0, (short) -1, 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) 0, (int) ' ');
    }

    @Test
    public void test12666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12666");
        int[] intArray6 = new int[] { 'a', (byte) 0, 'a', (-1), 0, (byte) 100 };
        int[] intArray11 = new int[] { 100, 100, '4', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 100, (int) '4');
    }

    @Test
    public void test12667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12667");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray5 = new int[] { (byte) -1, ' ', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) ' ', (int) (byte) 10);
    }

    @Test
    public void test12668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12668");
        int[] intArray2 = new int[] { 'a', (byte) -1 };
        int[] intArray5 = new int[] { 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (byte) 1, 100);
    }

    @Test
    public void test12669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12669");
        int[] intArray5 = new int[] { 1, ' ', (short) -1, 10, (short) -1 };
        int[] intArray12 = new int[] { (short) 0, '#', (-1), 1, (short) 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) -1, (int) (byte) -1);
    }

    @Test
    public void test12670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12670");
        int[] intArray1 = new int[] { '#' };
        int[] intArray8 = new int[] { 0, (byte) 0, 100, (byte) 10, '#', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) 1, (int) '#');
    }

    @Test
    public void test12671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12671");
        int[] intArray3 = new int[] { '4', (-1), (byte) 10 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (byte) -1, (int) (short) -1);
    }

    @Test
    public void test12672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12672");
        int[] intArray1 = new int[] { 1 };
        int[] intArray7 = new int[] { (byte) 10, (short) 0, (byte) 10, 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) '#', 0);
    }

    @Test
    public void test12673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12673");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 100, (byte) 100, (short) 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 0, (int) (short) 0);
    }

    @Test
    public void test12674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12674");
        int[] intArray4 = new int[] { 1, '4', (byte) 0, (byte) 1 };
        int[] intArray8 = new int[] { (byte) 0, (-1), (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) ' ', 100);
    }

    @Test
    public void test12675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12675");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 10, (int) ' ');
    }

    @Test
    public void test12676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12676");
        int[] intArray5 = new int[] { 1, (short) 1, ' ', (byte) 100, (byte) -1 };
        int[] intArray9 = new int[] { (byte) 10, (byte) 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 0, (int) (short) -1);
    }

    @Test
    public void test12677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12677");
        int[] intArray2 = new int[] { 0, (short) -1 };
        int[] intArray7 = new int[] { 0, (byte) 10, (byte) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 10, (int) (short) 1);
    }

    @Test
    public void test12678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12678");
        int[] intArray5 = new int[] { ' ', ' ', 10, (byte) 10, (short) 100 };
        int[] intArray12 = new int[] { (short) -1, (byte) -1, 'a', (short) 0, (byte) -1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) 0, (int) (short) -1);
    }

    @Test
    public void test12679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12679");
        int[] intArray4 = new int[] { (byte) 10, (short) 10, (byte) 1, '#' };
        int[] intArray11 = new int[] { '4', ' ', 100, (short) 0, 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (byte) 10, 0);
    }

    @Test
    public void test12680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12680");
        int[] intArray5 = new int[] { (short) 1, '4', (short) 100, (byte) 1, (short) 0 };
        int[] intArray7 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) '#', (int) (short) 0);
    }

    @Test
    public void test12681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12681");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray5 = new int[] { 10, (short) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (byte) -1, 100);
    }

    @Test
    public void test12682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12682");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray3 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, 10, (int) (byte) 10);
    }

    @Test
    public void test12683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12683");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray5 = new int[] { (short) 10, (byte) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) 0, (int) ' ');
    }

    @Test
    public void test12684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12684");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray3 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) 0, (int) (short) -1);
    }

    @Test
    public void test12685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12685");
        int[] intArray4 = new int[] { (byte) 10, (short) 0, (short) -1, (short) 1 };
        int[] intArray9 = new int[] { (short) 100, (byte) -1, (byte) 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 100, (int) (short) 10);
    }

    @Test
    public void test12686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12686");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray8 = new int[] { (byte) 1, (byte) 1, 1, '#', 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) 100, (int) (short) 10);
    }

    @Test
    public void test12687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12687");
        int[] intArray2 = new int[] { (short) 1, (short) 100 };
        int[] intArray7 = new int[] { 10, (short) 10, (byte) 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (short) 0, 10);
    }

    @Test
    public void test12688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12688");
        int[] intArray2 = new int[] { 100, (byte) 10 };
        int[] intArray6 = new int[] { 0, '4', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) 10, (-1));
    }

    @Test
    public void test12689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12689");
        int[] intArray5 = new int[] { (short) 0, '4', 100, (byte) 10, '#' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) 1, (int) ' ');
    }

    @Test
    public void test12690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12690");
        int[] intArray1 = new int[] { '#' };
        int[] intArray7 = new int[] { 0, 1, 'a', (byte) 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) ' ', (int) (short) -1);
    }

    @Test
    public void test12691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12691");
        int[] intArray6 = new int[] { '#', (short) 100, (short) 0, (short) 10, '4', 1 };
        int[] intArray9 = new int[] { (-1), (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (-1), (int) (short) 0);
    }

    @Test
    public void test12692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12692");
        int[] intArray3 = new int[] { 1, 'a', '#' };
        int[] intArray9 = new int[] { (byte) -1, 1, (short) 100, (short) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) ' ', (int) (short) -1);
    }

    @Test
    public void test12693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12693");
        int[] intArray3 = new int[] { (short) 100, (byte) 0, 0 };
        int[] intArray7 = new int[] { (short) 100, (byte) 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) 10, (int) (byte) 100);
    }

    @Test
    public void test12694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12694");
        int[] intArray2 = new int[] { 10, 100 };
        int[] intArray8 = new int[] { (byte) 100, 100, (byte) 0, (-1), (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) '4', (int) '#');
    }

    @Test
    public void test12695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12695");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 'a', '4', ' ', (short) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, 1, (int) (byte) 0);
    }

    @Test
    public void test12696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12696");
        int[] intArray6 = new int[] { 10, '4', (byte) 100, '#', (short) 1, 10 };
        int[] intArray10 = new int[] { (-1), (byte) 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) 100, 1);
    }

    @Test
    public void test12697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12697");
        int[] intArray5 = new int[] { 100, (short) 100, 'a', (byte) 100, '4' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 100, (-1));
    }

    @Test
    public void test12698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12698");
        int[] intArray3 = new int[] { '#', (-1), (byte) 10 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) '4', (int) (byte) -1);
    }

    @Test
    public void test12699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12699");
        int[] intArray6 = new int[] { (short) 0, '4', (byte) 100, (byte) 10, 100, (byte) -1 };
        int[] intArray11 = new int[] { (short) 100, 10, 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 100, (int) (short) 100);
    }

    @Test
    public void test12700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12700");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (byte) 10, (byte) 10, '#', (byte) 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) 100, 0);
    }

    @Test
    public void test12701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12701");
        int[] intArray4 = new int[] { 0, (byte) 0, (-1), 'a' };
        int[] intArray8 = new int[] { (short) -1, (-1), (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) 'a', (int) (byte) -1);
    }

    @Test
    public void test12702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12702");
        int[] intArray5 = new int[] { (short) 1, ' ', 'a', '#', (byte) 10 };
        int[] intArray10 = new int[] { (byte) 0, (-1), 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (short) 0, (int) '4');
    }

    @Test
    public void test12703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12703");
        int[] intArray6 = new int[] { 10, 10, '4', '4', '4', '4' };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) 1, (-1));
    }

    @Test
    public void test12704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12704");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray7 = new int[] { 0, (-1), '#', 'a', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) 100, (int) (short) -1);
    }

    @Test
    public void test12705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12705");
        int[] intArray6 = new int[] { '4', (short) 1, (byte) 0, (byte) -1, 0, '4' };
        int[] intArray9 = new int[] { 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) '#', (int) (short) 100);
    }

    @Test
    public void test12706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12706");
        int[] intArray5 = new int[] { (short) -1, (byte) 10, 10, 0, 10 };
        int[] intArray10 = new int[] { (short) -1, '#', 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (short) 10, (int) (byte) 100);
    }

    @Test
    public void test12707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12707");
        int[] intArray3 = new int[] { (-1), 10, (short) 1 };
        int[] intArray5 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, 100, (int) (short) 100);
    }

    @Test
    public void test12708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12708");
        int[] intArray3 = new int[] { (short) 100, '4', (byte) -1 };
        int[] intArray7 = new int[] { (-1), (short) 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) ' ', 100);
    }

    @Test
    public void test12709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12709");
        int[] intArray2 = new int[] { (short) -1, (short) 100 };
        int[] intArray6 = new int[] { '#', (short) 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (short) 10, (-1));
    }

    @Test
    public void test12710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12710");
        int[] intArray2 = new int[] { 100, (short) 1 };
        int[] intArray8 = new int[] { (byte) 100, 10, (byte) -1, (byte) 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (byte) 10, (int) (byte) 10);
    }

    @Test
    public void test12711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12711");
        int[] intArray5 = new int[] { 100, (short) -1, (short) 1, 100, 1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) 'a', (int) (byte) -1);
    }

    @Test
    public void test12712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12712");
        int[] intArray1 = new int[] { 10 };
        int[] intArray5 = new int[] { (short) 0, (short) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (byte) 1, (int) '4');
    }

    @Test
    public void test12713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12713");
        int[] intArray6 = new int[] { (short) 10, (byte) -1, (short) -1, (byte) 10, 100, '4' };
        int[] intArray8 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 0, 0);
    }

    @Test
    public void test12714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12714");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray5 = new int[] { '#', (-1), 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, 10, (int) ' ');
    }

    @Test
    public void test12715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12715");
        int[] intArray5 = new int[] { (short) -1, 10, 100, (short) 1, (byte) 10 };
        int[] intArray9 = new int[] { (byte) -1, 'a', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (byte) 100, (int) ' ');
    }

    @Test
    public void test12716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12716");
        int[] intArray5 = new int[] { (short) 1, '#', (short) 100, (short) 0, (short) 0 };
        int[] intArray7 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test12717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12717");
        int[] intArray5 = new int[] { (-1), ' ', 1, (short) -1, (-1) };
        int[] intArray11 = new int[] { (byte) -1, (short) -1, 1, '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) 'a', (int) (byte) 1);
    }

    @Test
    public void test12718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12718");
        int[] intArray2 = new int[] { (short) 100, (-1) };
        int[] intArray7 = new int[] { (short) 1, 'a', '4', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 0, (int) (short) 10);
    }

    @Test
    public void test12719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12719");
        int[] intArray2 = new int[] { (byte) 10, (-1) };
        int[] intArray9 = new int[] { 'a', '4', (byte) 1, ' ', (byte) 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) 'a', (int) 'a');
    }

    @Test
    public void test12720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12720");
        int[] intArray4 = new int[] { ' ', 1, (short) 10, 10 };
        int[] intArray6 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, 0, (int) ' ');
    }

    @Test
    public void test12721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12721");
        int[] intArray4 = new int[] { 100, (byte) 100, (short) 100, ' ' };
        int[] intArray6 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, 1, (int) (short) 0);
    }

    @Test
    public void test12722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12722");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, 10, (int) '4');
    }

    @Test
    public void test12723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12723");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (short) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (byte) 10, (int) (byte) 100);
    }

    @Test
    public void test12724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12724");
        int[] intArray3 = new int[] { ' ', (short) 1, '#' };
        int[] intArray8 = new int[] { (short) -1, (byte) 1, ' ', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (byte) 100, (int) (short) 1);
    }

    @Test
    public void test12725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12725");
        int[] intArray2 = new int[] { '4', '4' };
        int[] intArray5 = new int[] { (short) 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) 'a', (int) (byte) 100);
    }

    @Test
    public void test12726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12726");
        int[] intArray5 = new int[] { ' ', (-1), (byte) -1, (short) -1, 1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) ' ', 0);
    }

    @Test
    public void test12727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12727");
        int[] intArray6 = new int[] { ' ', (byte) 0, 0, 1, (byte) -1, (-1) };
        int[] intArray12 = new int[] { (-1), 0, '4', ' ', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) -1, (int) (byte) 1);
    }

    @Test
    public void test12728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12728");
        int[] intArray6 = new int[] { '4', (short) 1, (byte) 1, 0, (byte) 10, (byte) 100 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) 'a', (-1));
    }

    @Test
    public void test12729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12729");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray7 = new int[] { ' ', (-1), 100, (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) '4', (int) (byte) 0);
    }

    @Test
    public void test12730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12730");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (byte) 10, (int) (short) -1);
    }

    @Test
    public void test12731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12731");
        int[] intArray4 = new int[] { (short) 1, (short) 0, (short) 100, (byte) 100 };
        int[] intArray6 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 10, 10);
    }

    @Test
    public void test12732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12732");
        int[] intArray2 = new int[] { '#', (byte) 10 };
        int[] intArray8 = new int[] { 1, (-1), (byte) 1, (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 10, 10);
    }

    @Test
    public void test12733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12733");
        int[] intArray4 = new int[] { 0, (byte) 1, 'a', (byte) 1 };
        int[] intArray8 = new int[] { (short) 100, (-1), '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) 10, (int) (byte) 10);
    }

    @Test
    public void test12734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12734");
        int[] intArray4 = new int[] { (short) 100, (byte) 0, (short) -1, ' ' };
        int[] intArray8 = new int[] { (byte) 100, (short) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) '#', 0);
    }

    @Test
    public void test12735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12735");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray7 = new int[] { (byte) 1, 10, '4', '4', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (-1), (int) (short) -1);
    }

    @Test
    public void test12736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12736");
        int[] intArray2 = new int[] { (short) -1, '4' };
        int[] intArray4 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (byte) 10, 10);
    }

    @Test
    public void test12737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12737");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (byte) -1, (short) 0, (-1), (byte) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) '4', 0);
    }

    @Test
    public void test12738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12738");
        int[] intArray4 = new int[] { (short) 100, (byte) 100, 1, 100 };
        int[] intArray8 = new int[] { (short) 1, (byte) 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) 'a', (int) (byte) 1);
    }

    @Test
    public void test12739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12739");
        int[] intArray5 = new int[] { 1, (short) -1, (byte) -1, (short) 10, ' ' };
        int[] intArray9 = new int[] { (short) -1, (short) 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) '#', (int) (short) 100);
    }

    @Test
    public void test12740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12740");
        int[] intArray4 = new int[] { '4', (byte) -1, '#', 100 };
        int[] intArray8 = new int[] { (-1), 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) ' ', (int) '#');
    }

    @Test
    public void test12741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12741");
        int[] intArray3 = new int[] { 'a', (byte) 10, 'a' };
        int[] intArray6 = new int[] { '4', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test12742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12742");
        int[] intArray6 = new int[] { 100, (byte) 10, (short) 100, ' ', 0, 1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) ' ', (int) ' ');
    }

    @Test
    public void test12743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12743");
        int[] intArray2 = new int[] { 0, (byte) 100 };
        int[] intArray4 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (-1), (int) (short) 100);
    }

    @Test
    public void test12744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12744");
        int[] intArray1 = new int[] { 10 };
        int[] intArray8 = new int[] { (byte) 1, (short) 10, 0, (short) 10, 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) ' ', (int) (short) 10);
    }

    @Test
    public void test12745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12745");
        int[] intArray3 = new int[] { (-1), '#', 0 };
        int[] intArray9 = new int[] { '4', ' ', 100, 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (byte) 1, (int) (short) -1);
    }

    @Test
    public void test12746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12746");
        int[] intArray1 = new int[] { 1 };
        int[] intArray3 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) ' ', (int) (short) 10);
    }

    @Test
    public void test12747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12747");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) 0, (byte) 100, (-1), ' ', 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) -1, (int) (short) 1);
    }

    @Test
    public void test12748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12748");
        int[] intArray2 = new int[] { 1, '#' };
        int[] intArray9 = new int[] { (short) -1, '4', (-1), (short) 10, (byte) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) 'a', 0);
    }

    @Test
    public void test12749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12749");
        int[] intArray4 = new int[] { (byte) 1, (short) 0, (byte) -1, ' ' };
        int[] intArray8 = new int[] { '4', (short) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) 'a', (int) '#');
    }

    @Test
    public void test12750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12750");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray3 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (byte) -1, (int) (byte) -1);
    }

    @Test
    public void test12751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12751");
        int[] intArray5 = new int[] { 100, '4', (byte) -1, (short) 1, 1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 10, 1);
    }

    @Test
    public void test12752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12752");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { '4', 10, (short) 0, 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) -1, 0);
    }

    @Test
    public void test12753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12753");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray3 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (-1), 0);
    }

    @Test
    public void test12754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12754");
        int[] intArray3 = new int[] { 0, 0, (byte) 100 };
        int[] intArray5 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) ' ', (int) (short) 1);
    }

    @Test
    public void test12755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12755");
        int[] intArray3 = new int[] { 1, (byte) 0, 0 };
        int[] intArray7 = new int[] { (short) 1, 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 0, (int) 'a');
    }

    @Test
    public void test12756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12756");
        int[] intArray3 = new int[] { '4', (byte) 0, 0 };
        int[] intArray10 = new int[] { '#', (short) 0, (short) 0, '#', (short) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) 'a', (int) '4');
    }

    @Test
    public void test12757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12757");
        int[] intArray6 = new int[] { '4', (short) 10, (short) -1, ' ', 1, 100 };
        int[] intArray12 = new int[] { 1, 'a', 10, (byte) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) -1, (int) '4');
    }

    @Test
    public void test12758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12758");
        int[] intArray6 = new int[] { (-1), (short) -1, (short) -1, (byte) 1, ' ', (byte) 1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) 1, (int) (byte) 1);
    }

    @Test
    public void test12759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12759");
        int[] intArray6 = new int[] { 1, (short) 10, 0, (short) 0, '#', (-1) };
        int[] intArray9 = new int[] { (byte) 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 0, (-1));
    }

    @Test
    public void test12760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12760");
        int[] intArray5 = new int[] { '#', 'a', (byte) 100, (byte) -1, (byte) 0 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 0, (int) (short) 100);
    }

    @Test
    public void test12761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12761");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) ' ', (int) (short) 1);
    }

    @Test
    public void test12762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12762");
        int[] intArray2 = new int[] { (byte) -1, 'a' };
        int[] intArray4 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 100, (int) '4');
    }

    @Test
    public void test12763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12763");
        int[] intArray4 = new int[] { (byte) -1, 'a', (short) 1, ' ' };
        int[] intArray7 = new int[] { (short) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 100, (int) (short) 1);
    }

    @Test
    public void test12764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12764");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { '#', 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) 0, (int) (byte) -1);
    }

    @Test
    public void test12765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12765");
        int[] intArray4 = new int[] { '4', 1, (short) 0, 'a' };
        int[] intArray7 = new int[] { (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) ' ', (int) '4');
    }

    @Test
    public void test12766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12766");
        int[] intArray4 = new int[] { 0, 0, (short) 0, (byte) 10 };
        int[] intArray8 = new int[] { (byte) -1, (short) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 0, 0);
    }

    @Test
    public void test12767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12767");
        int[] intArray6 = new int[] { 1, 100, (-1), (byte) 10, '#', 0 };
        int[] intArray13 = new int[] { 10, 10, '4', (short) 1, 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) ' ', 0);
    }

    @Test
    public void test12768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12768");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (short) 0, (int) '#');
    }

    @Test
    public void test12769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12769");
        int[] intArray2 = new int[] { 1, '4' };
        int[] intArray9 = new int[] { 1, (short) 1, 0, (short) 100, (byte) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) '#', 10);
    }

    @Test
    public void test12770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12770");
        int[] intArray6 = new int[] { '4', '4', '4', (byte) -1, 'a', 10 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, 1, 1);
    }

    @Test
    public void test12771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12771");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray7 = new int[] { (short) -1, (byte) 10, (short) 1, (short) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) 1, (int) (short) 0);
    }

    @Test
    public void test12772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12772");
        int[] intArray4 = new int[] { (byte) 1, (short) -1, (short) -1, ' ' };
        int[] intArray8 = new int[] { ' ', (short) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 100, (int) (byte) 100);
    }

    @Test
    public void test12773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12773");
        int[] intArray2 = new int[] { (byte) -1, (short) 100 };
        int[] intArray5 = new int[] { (byte) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 10, 1);
    }

    @Test
    public void test12774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12774");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { ' ', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 1, (int) (short) 1);
    }

    @Test
    public void test12775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12775");
        int[] intArray3 = new int[] { 0, 'a', 'a' };
        int[] intArray10 = new int[] { '4', '4', (byte) 0, (short) 0, (short) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 1, (int) '4');
    }

    @Test
    public void test12776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12776");
        int[] intArray2 = new int[] { 1, 1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) 0, 1);
    }

    @Test
    public void test12777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12777");
        int[] intArray6 = new int[] { (byte) 100, (short) 100, (byte) 0, (byte) -1, 'a', 1 };
        int[] intArray8 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test12778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12778");
        int[] intArray3 = new int[] { 1, '4', 0 };
        int[] intArray8 = new int[] { (byte) 10, ' ', (byte) 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 10, 0);
    }

    @Test
    public void test12779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12779");
        int[] intArray2 = new int[] { '#', 0 };
        int[] intArray4 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 0, (int) ' ');
    }

    @Test
    public void test12780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12780");
        int[] intArray6 = new int[] { 1, (byte) -1, (-1), (short) 1, (short) -1, (short) 100 };
        int[] intArray11 = new int[] { ' ', ' ', 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (short) 100, (int) (byte) 1);
    }

    @Test
    public void test12781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12781");
        int[] intArray5 = new int[] { (short) 100, (short) 10, 10, (byte) 100, '#' };
        int[] intArray12 = new int[] { 'a', (short) 100, 100, 1, 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (byte) 100, 100);
    }

    @Test
    public void test12782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12782");
        int[] intArray1 = new int[] { 0 };
        int[] intArray5 = new int[] { (short) -1, '4', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) ' ', (int) (short) -1);
    }

    @Test
    public void test12783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12783");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, (short) 0 };
        int[] intArray7 = new int[] { (byte) 100, (byte) -1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) '4', (int) (byte) 1);
    }

    @Test
    public void test12784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12784");
        int[] intArray4 = new int[] { (short) 0, '#', (short) 1, 'a' };
        int[] intArray6 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) 'a', (int) (short) -1);
    }

    @Test
    public void test12785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12785");
        int[] intArray2 = new int[] { (short) 100, (short) -1 };
        int[] intArray7 = new int[] { (byte) 1, 1, 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 0, 100);
    }

    @Test
    public void test12786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12786");
        int[] intArray6 = new int[] { 100, (byte) 100, (short) 0, 1, 1, (byte) 100 };
        int[] intArray12 = new int[] { (byte) -1, (byte) -1, (short) 0, 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) 100, (int) ' ');
    }

    @Test
    public void test12787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12787");
        int[] intArray5 = new int[] { '#', '#', (byte) 10, 'a', 1 };
        int[] intArray8 = new int[] { (byte) 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 1, (-1));
    }

    @Test
    public void test12788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12788");
        int[] intArray6 = new int[] { (byte) 1, (byte) 1, (byte) -1, ' ', 0, '#' };
        int[] intArray8 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (byte) 100, (int) '4');
    }

    @Test
    public void test12789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12789");
        int[] intArray4 = new int[] { 10, (short) 10, (short) 0, (short) 10 };
        int[] intArray9 = new int[] { 1, (byte) 1, (short) -1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) 1, (int) (short) 100);
    }

    @Test
    public void test12790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12790");
        int[] intArray6 = new int[] { (byte) 10, 100, (byte) -1, 1, (byte) 10, '#' };
        int[] intArray11 = new int[] { (short) 100, '#', (short) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) 'a', 100);
    }

    @Test
    public void test12791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12791");
        int[] intArray2 = new int[] { (short) 0, (short) -1 };
        int[] intArray4 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 100, (-1));
    }

    @Test
    public void test12792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12792");
        int[] intArray3 = new int[] { (byte) -1, ' ', (short) -1 };
        int[] intArray6 = new int[] { (-1), '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) -1, (int) '#');
    }

    @Test
    public void test12793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12793");
        int[] intArray5 = new int[] { (short) 0, (short) -1, 10, 1, ' ' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 10, (int) (byte) 0);
    }

    @Test
    public void test12794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12794");
        int[] intArray5 = new int[] { (byte) 0, (byte) 0, (short) 1, '4', (short) 0 };
        int[] intArray9 = new int[] { (short) 10, ' ', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) '#', (int) (short) -1);
    }

    @Test
    public void test12795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12795");
        int[] intArray5 = new int[] { (byte) 10, (short) 100, 1, (byte) -1, (-1) };
        int[] intArray10 = new int[] { 0, 100, '4', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (short) 0, (int) (byte) 100);
    }

    @Test
    public void test12796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12796");
        int[] intArray4 = new int[] { (short) 1, 0, (byte) -1, (byte) 0 };
        int[] intArray8 = new int[] { (short) 0, (short) -1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) 0, 1);
    }

    @Test
    public void test12797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12797");
        int[] intArray3 = new int[] { '4', '4', (short) 100 };
        int[] intArray10 = new int[] { '#', (short) 1, (short) 0, 0, 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (byte) 10, (int) '#');
    }

    @Test
    public void test12798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12798");
        int[] intArray6 = new int[] { (byte) 1, (byte) 1, (byte) 0, 1, (byte) 100, (byte) 1 };
        int[] intArray10 = new int[] { '4', 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) '4', (int) (short) -1);
    }

    @Test
    public void test12799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12799");
        int[] intArray6 = new int[] { '#', (byte) 10, (byte) -1, '#', '#', (byte) -1 };
        int[] intArray8 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 0, (int) 'a');
    }

    @Test
    public void test12800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12800");
        int[] intArray1 = new int[] { 10 };
        int[] intArray7 = new int[] { (short) 10, (byte) 100, '#', (short) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) ' ', (int) (short) 10);
    }

    @Test
    public void test12801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12801");
        int[] intArray2 = new int[] { 'a', (short) 10 };
        int[] intArray8 = new int[] { '4', (short) 1, (byte) 0, (byte) 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 0, 0);
    }

    @Test
    public void test12802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12802");
        int[] intArray6 = new int[] { (byte) 1, (short) 100, '4', 'a', 1, '#' };
        int[] intArray10 = new int[] { (byte) -1, (byte) 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) 'a', 10);
    }

    @Test
    public void test12803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12803");
        int[] intArray2 = new int[] { (byte) 1, (byte) 10 };
        int[] intArray8 = new int[] { 100, (-1), 'a', (short) -1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (byte) 100, (int) (short) 100);
    }

    @Test
    public void test12804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12804");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 1, '#', (short) 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (-1), (-1));
    }

    @Test
    public void test12805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12805");
        int[] intArray2 = new int[] { (byte) 0, (short) 10 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 100, (int) (short) 10);
    }

    @Test
    public void test12806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12806");
        int[] intArray4 = new int[] { (short) 0, (byte) -1, ' ', (byte) 0 };
        int[] intArray7 = new int[] { (short) 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) ' ', 0);
    }

    @Test
    public void test12807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12807");
        int[] intArray6 = new int[] { 10, '#', 100, ' ', (byte) 10, (byte) 1 };
        int[] intArray10 = new int[] { 0, ' ', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (-1), 0);
    }

    @Test
    public void test12808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12808");
        int[] intArray2 = new int[] { 10, 100 };
        int[] intArray4 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 0, 10);
    }

    @Test
    public void test12809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12809");
        int[] intArray6 = new int[] { 10, ' ', '#', (short) -1, (short) 0, '4' };
        int[] intArray12 = new int[] { 1, (short) 1, (short) 1, (byte) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 100, 10);
    }

    @Test
    public void test12810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12810");
        int[] intArray2 = new int[] { (-1), 0 };
        int[] intArray8 = new int[] { (byte) 0, (short) 10, '#', (short) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) 10, (int) (byte) 1);
    }

    @Test
    public void test12811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12811");
        int[] intArray3 = new int[] { 1, (byte) 1, (byte) -1 };
        int[] intArray8 = new int[] { (byte) 100, 10, '#', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (short) 100, (int) '4');
    }

    @Test
    public void test12812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12812");
        int[] intArray4 = new int[] { 0, 10, ' ', 'a' };
        int[] intArray10 = new int[] { (short) 10, (byte) 1, 0, (short) 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) -1, (int) (byte) 0);
    }

    @Test
    public void test12813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12813");
        int[] intArray3 = new int[] { (byte) 100, 'a', 1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (byte) 1, (int) ' ');
    }

    @Test
    public void test12814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12814");
        int[] intArray6 = new int[] { 'a', 'a', '4', (-1), (byte) 100, 1 };
        int[] intArray10 = new int[] { (byte) 10, (byte) -1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) 1, (int) 'a');
    }

    @Test
    public void test12815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12815");
        int[] intArray2 = new int[] { 10, (short) 10 };
        int[] intArray4 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 0, (int) ' ');
    }

    @Test
    public void test12816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12816");
        int[] intArray4 = new int[] { 0, (short) -1, 0, 0 };
        int[] intArray6 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 100, (-1));
    }

    @Test
    public void test12817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12817");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray7 = new int[] { '4', (short) 10, (byte) -1, (byte) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) ' ', (int) (short) 10);
    }

    @Test
    public void test12818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12818");
        int[] intArray3 = new int[] { 10, 0, 'a' };
        int[] intArray9 = new int[] { (short) -1, 1, (short) 1, 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (byte) 1, (int) (short) 10);
    }

    @Test
    public void test12819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12819");
        int[] intArray1 = new int[] { 0 };
        int[] intArray4 = new int[] { (byte) 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, 100, (int) (byte) 0);
    }

    @Test
    public void test12820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12820");
        int[] intArray5 = new int[] { (byte) 1, 10, 10, '4', 0 };
        int[] intArray9 = new int[] { (byte) 100, (byte) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) ' ', 0);
    }

    @Test
    public void test12821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12821");
        int[] intArray6 = new int[] { (byte) 100, (short) 100, (byte) 0, (byte) 0, 10, (short) 10 };
        int[] intArray12 = new int[] { (byte) 10, (byte) -1, '#', '#', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) 0, (int) '#');
    }

    @Test
    public void test12822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12822");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, 1, (int) (byte) 0);
    }

    @Test
    public void test12823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12823");
        int[] intArray4 = new int[] { 1, 'a', 'a', (short) 1 };
        int[] intArray9 = new int[] { (-1), (byte) -1, '#', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 10, (int) '#');
    }

    @Test
    public void test12824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12824");
        int[] intArray5 = new int[] { (byte) 100, 'a', (byte) 10, (byte) 100, (byte) 100 };
        int[] intArray8 = new int[] { (short) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (-1), (int) (byte) 10);
    }

    @Test
    public void test12825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12825");
        int[] intArray6 = new int[] { (-1), (byte) 10, (byte) -1, 'a', 'a', (short) 10 };
        int[] intArray13 = new int[] { (byte) -1, 'a', (byte) 0, (byte) 10, (short) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (short) 10, (int) (byte) 10);
    }

    @Test
    public void test12826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12826");
        int[] intArray2 = new int[] { (-1), (byte) 10 };
        int[] intArray5 = new int[] { (short) 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 100, 10);
    }

    @Test
    public void test12827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12827");
        int[] intArray6 = new int[] { (short) 100, (short) 1, (byte) 0, (byte) -1, (-1), (short) 1 };
        int[] intArray10 = new int[] { (short) 10, (short) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) '4', (int) (short) -1);
    }

    @Test
    public void test12828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12828");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { '4', (byte) 0, (short) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 10, (int) (byte) 100);
    }

    @Test
    public void test12829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12829");
        int[] intArray4 = new int[] { (short) 1, (short) 10, (short) 0, (byte) 1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (short) -1, (int) (short) 100);
    }

    @Test
    public void test12830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12830");
        int[] intArray4 = new int[] { (byte) 1, 'a', 10, ' ' };
        int[] intArray6 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test12831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12831");
        int[] intArray5 = new int[] { (short) 10, (byte) 100, 100, (short) 100, (byte) 0 };
        int[] intArray11 = new int[] { '4', (short) 100, (byte) 100, 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) -1, (-1));
    }

    @Test
    public void test12832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12832");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, (short) 0, (byte) 100, '4', (byte) -1 };
        int[] intArray8 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (-1), (int) (byte) 100);
    }

    @Test
    public void test12833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12833");
        int[] intArray5 = new int[] { (short) 10, 1, '#', (byte) 10, (short) 1 };
        int[] intArray8 = new int[] { (byte) 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 100, (-1));
    }

    @Test
    public void test12834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12834");
        int[] intArray4 = new int[] { 10, (byte) -1, (byte) 10, 10 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test12835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12835");
        int[] intArray2 = new int[] { '4', 100 };
        int[] intArray6 = new int[] { 100, (short) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 1, (int) (short) 100);
    }

    @Test
    public void test12836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12836");
        int[] intArray5 = new int[] { (byte) 100, 1, (short) 100, 1, (short) -1 };
        int[] intArray8 = new int[] { (byte) 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) 1, 0);
    }

    @Test
    public void test12837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12837");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { ' ', (byte) 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) 0, (int) '#');
    }

    @Test
    public void test12838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12838");
        int[] intArray3 = new int[] { (byte) 100, (short) 10, (byte) -1 };
        int[] intArray8 = new int[] { (short) 1, (short) 10, (byte) 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (byte) -1, (int) (short) 100);
    }

    @Test
    public void test12839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12839");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 10, (short) 10, 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 10, (int) (short) 1);
    }

    @Test
    public void test12840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12840");
        int[] intArray2 = new int[] { (byte) -1, 100 };
        int[] intArray9 = new int[] { '#', 1, (byte) 10, (short) 1, (-1), 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 0, (int) (short) 100);
    }

    @Test
    public void test12841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12841");
        int[] intArray3 = new int[] { (byte) 1, '#', (byte) 1 };
        int[] intArray10 = new int[] { (short) -1, (short) 1, 100, (short) 0, (byte) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 10, (int) (byte) 1);
    }

    @Test
    public void test12842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12842");
        int[] intArray6 = new int[] { (byte) 10, 10, 1, (byte) 1, 0, (byte) -1 };
        int[] intArray8 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test12843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12843");
        int[] intArray3 = new int[] { (byte) -1, (byte) 100, (byte) 0 };
        int[] intArray10 = new int[] { (byte) 1, 10, '#', '#', (short) 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 0, (int) (byte) 100);
    }

    @Test
    public void test12844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12844");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray5 = new int[] { (-1), (short) 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) 100, (int) (byte) 10);
    }

    @Test
    public void test12845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12845");
        int[] intArray4 = new int[] { (byte) 100, (byte) 0, (short) 1, (short) 10 };
        int[] intArray11 = new int[] { 1, (byte) 10, (short) -1, 'a', (byte) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) 'a', (-1));
    }

    @Test
    public void test12846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12846");
        int[] intArray3 = new int[] { 1, (byte) 0, 0 };
        int[] intArray6 = new int[] { (byte) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) 1, (int) (short) 100);
    }

    @Test
    public void test12847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12847");
        int[] intArray2 = new int[] { ' ', (byte) 0 };
        int[] intArray5 = new int[] { 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 0, (int) ' ');
    }

    @Test
    public void test12848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12848");
        int[] intArray2 = new int[] { (short) 10, (short) 10 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) 10, (int) 'a');
    }

    @Test
    public void test12849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12849");
        int[] intArray2 = new int[] { 'a', (short) 1 };
        int[] intArray8 = new int[] { (-1), 1, (byte) 1, (byte) 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (byte) 0, (-1));
    }

    @Test
    public void test12850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12850");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray7 = new int[] { (short) 0, (-1), (short) 100, '#', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) '#', (int) (short) 0);
    }

    @Test
    public void test12851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12851");
        int[] intArray4 = new int[] { ' ', 10, 10, (short) 100 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) ' ', (int) (short) -1);
    }

    @Test
    public void test12852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12852");
        int[] intArray4 = new int[] { 1, (byte) 10, (short) 100, (short) -1 };
        int[] intArray10 = new int[] { (byte) 10, '4', (short) 100, (short) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, 0, (int) (byte) 0);
    }

    @Test
    public void test12853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12853");
        int[] intArray6 = new int[] { (short) -1, (byte) 100, (short) -1, 100, (byte) -1, (short) 10 };
        int[] intArray11 = new int[] { (-1), (byte) 0, 'a', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (byte) 10, (int) ' ');
    }

    @Test
    public void test12854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12854");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (-1), (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) 'a', 0);
    }

    @Test
    public void test12855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12855");
        int[] intArray2 = new int[] { 1, (short) 10 };
        int[] intArray9 = new int[] { (short) 100, 1, 10, 'a', (short) 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (-1), (int) (short) 0);
    }

    @Test
    public void test12856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12856");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray8 = new int[] { (short) 10, (short) 1, '4', (short) 100, 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) -1, (int) (byte) 0);
    }

    @Test
    public void test12857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12857");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) '4', 0);
    }

    @Test
    public void test12858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12858");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 100, 100);
    }

    @Test
    public void test12859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12859");
        int[] intArray5 = new int[] { (byte) 1, '4', (byte) 10, ' ', ' ' };
        int[] intArray12 = new int[] { (-1), (-1), (byte) -1, (byte) 10, 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (byte) 100, (int) (short) 10);
    }

    @Test
    public void test12860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12860");
        int[] intArray4 = new int[] { (byte) -1, 10, (short) 10, (-1) };
        int[] intArray6 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) 'a', (int) (byte) 100);
    }

    @Test
    public void test12861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12861");
        int[] intArray2 = new int[] { 0, (byte) 1 };
        int[] intArray6 = new int[] { 0, 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) 'a', 0);
    }

    @Test
    public void test12862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12862");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (byte) 10, 10, (-1), (-1), '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) '#', 0);
    }

    @Test
    public void test12863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12863");
        int[] intArray2 = new int[] { 0, (-1) };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (byte) 1, (int) '#');
    }

    @Test
    public void test12864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12864");
        int[] intArray6 = new int[] { (byte) 1, (byte) -1, (short) 1, '4', (short) 0, (byte) 0 };
        int[] intArray13 = new int[] { (short) -1, 10, (short) 0, '#', 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (short) 0, (int) (byte) 1);
    }

    @Test
    public void test12865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12865");
        int[] intArray2 = new int[] { ' ', 'a' };
        int[] intArray6 = new int[] { '#', (byte) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (short) 100, 10);
    }

    @Test
    public void test12866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12866");
        int[] intArray6 = new int[] { (short) 100, (byte) -1, (short) 1, 100, (byte) -1, (short) 10 };
        int[] intArray11 = new int[] { 'a', 'a', (short) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (short) 1, (int) 'a');
    }

    @Test
    public void test12867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12867");
        int[] intArray5 = new int[] { ' ', (byte) 1, 1, (byte) 1, (short) 100 };
        int[] intArray10 = new int[] { 0, 10, (short) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test12868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12868");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray5 = new int[] { (byte) 100, 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) 'a', 0);
    }

    @Test
    public void test12869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12869");
        int[] intArray3 = new int[] { ' ', (short) 100, 10 };
        int[] intArray6 = new int[] { (byte) -1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) ' ', 100);
    }

    @Test
    public void test12870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12870");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) -1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (-1), (int) (byte) 1);
    }

    @Test
    public void test12871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12871");
        int[] intArray6 = new int[] { 10, (byte) -1, (short) 1, (byte) 10, '4', (-1) };
        int[] intArray10 = new int[] { (short) 1, (byte) 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 0, 10);
    }

    @Test
    public void test12872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12872");
        int[] intArray2 = new int[] { (byte) -1, (-1) };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) -1, (int) (short) 10);
    }

    @Test
    public void test12873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12873");
        int[] intArray4 = new int[] { (short) 10, (short) 100, (short) 1, 1 };
        int[] intArray9 = new int[] { (short) -1, 0, (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) 10, (int) (byte) -1);
    }

    @Test
    public void test12874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12874");
        int[] intArray6 = new int[] { (short) -1, (short) 0, (-1), 'a', '4', 100 };
        int[] intArray11 = new int[] { (short) -1, (short) -1, 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (byte) -1, (int) 'a');
    }

    @Test
    public void test12875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12875");
        int[] intArray3 = new int[] { '#', 1, (-1) };
        int[] intArray6 = new int[] { (byte) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) 100, (int) (byte) 0);
    }

    @Test
    public void test12876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12876");
        int[] intArray5 = new int[] { (short) -1, (short) 10, (short) -1, '#', (short) -1 };
        int[] intArray9 = new int[] { 100, 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (byte) 100, (int) '4');
    }

    @Test
    public void test12877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12877");
        int[] intArray2 = new int[] { (byte) 10, 100 };
        int[] intArray8 = new int[] { 0, (byte) -1, (byte) 1, (short) -1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) 'a', 10);
    }

    @Test
    public void test12878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12878");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray4 = new int[] { 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (short) 10, (int) '#');
    }

    @Test
    public void test12879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12879");
        int[] intArray3 = new int[] { (short) 10, (short) 100, (byte) 10 };
        int[] intArray7 = new int[] { (-1), (-1), 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 1, (int) ' ');
    }

    @Test
    public void test12880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12880");
        int[] intArray5 = new int[] { (-1), (byte) 1, (byte) 0, (short) 100, (short) 0 };
        int[] intArray11 = new int[] { (byte) 10, 1, (byte) 10, 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 100, (int) '#');
    }

    @Test
    public void test12881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12881");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, 0, 10, (byte) 1, 0 };
        int[] intArray11 = new int[] { 'a', (short) 1, (short) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 10, (int) '#');
    }

    @Test
    public void test12882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12882");
        int[] intArray4 = new int[] { (short) 1, (-1), (short) 10, 10 };
        int[] intArray10 = new int[] { 'a', (short) 1, (byte) -1, (short) 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) 1, (int) (byte) 0);
    }

    @Test
    public void test12883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12883");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray4 = new int[] { '4', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 100, 1);
    }

    @Test
    public void test12884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12884");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 10, (byte) 0, 10, (short) 0, (byte) 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, 0, (int) (byte) 10);
    }

    @Test
    public void test12885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12885");
        int[] intArray1 = new int[] { '4' };
        int[] intArray4 = new int[] { (byte) 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) 'a', (int) (byte) -1);
    }

    @Test
    public void test12886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12886");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray3 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) -1, 1);
    }

    @Test
    public void test12887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12887");
        int[] intArray3 = new int[] { (byte) -1, 10, (short) -1 };
        int[] intArray7 = new int[] { 0, (short) 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) ' ', 100);
    }

    @Test
    public void test12888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12888");
        int[] intArray1 = new int[] { '4' };
        int[] intArray4 = new int[] { (short) 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, 0, (int) (byte) 1);
    }

    @Test
    public void test12889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12889");
        int[] intArray3 = new int[] { (short) 0, '4', (short) 1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) '4', (int) (short) -1);
    }

    @Test
    public void test12890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12890");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) 0, (int) (byte) 1);
    }

    @Test
    public void test12891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12891");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 1, (byte) 1, (short) -1, '4', (short) -1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) 10, (int) (byte) 100);
    }

    @Test
    public void test12892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12892");
        int[] intArray3 = new int[] { ' ', (-1), 100 };
        int[] intArray9 = new int[] { 100, '4', 'a', (short) 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (short) 10, (int) (byte) 0);
    }

    @Test
    public void test12893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12893");
        int[] intArray3 = new int[] { (short) -1, (short) -1, ' ' };
        int[] intArray5 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, 100, (int) ' ');
    }

    @Test
    public void test12894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12894");
        int[] intArray4 = new int[] { (-1), (short) -1, (short) 10, (short) -1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (byte) 0, 1);
    }

    @Test
    public void test12895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12895");
        int[] intArray2 = new int[] { 0, 10 };
        int[] intArray9 = new int[] { 1, (byte) 1, (byte) 0, (short) 10, 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 1, (int) '#');
    }

    @Test
    public void test12896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12896");
        int[] intArray4 = new int[] { (byte) -1, (short) -1, 0, (short) 100 };
        int[] intArray7 = new int[] { 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) 0, (int) (byte) 100);
    }

    @Test
    public void test12897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12897");
        int[] intArray2 = new int[] { (short) 1, (short) 0 };
        int[] intArray9 = new int[] { (byte) 0, ' ', (-1), (short) 0, (short) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (short) 1, (int) (byte) 0);
    }

    @Test
    public void test12898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12898");
        int[] intArray2 = new int[] { (short) 10, (byte) 10 };
        int[] intArray9 = new int[] { '4', 1, (byte) 1, (short) -1, 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (short) 10, (int) (short) 10);
    }

    @Test
    public void test12899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12899");
        int[] intArray5 = new int[] { ' ', 1, ' ', (short) 10, 0 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 0, (int) (short) 100);
    }

    @Test
    public void test12900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12900");
        int[] intArray3 = new int[] { 100, (short) 1, ' ' };
        int[] intArray8 = new int[] { ' ', 1, 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (byte) 100, (-1));
    }

    @Test
    public void test12901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12901");
        int[] intArray3 = new int[] { 'a', (short) 1, 10 };
        int[] intArray5 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) 1, (int) '4');
    }

    @Test
    public void test12902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12902");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 0, (int) (byte) -1);
    }

    @Test
    public void test12903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12903");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { '#', 'a', 'a', (short) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) '4', (int) '4');
    }

    @Test
    public void test12904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12904");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray4 = new int[] { '#', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, 0, (int) '4');
    }

    @Test
    public void test12905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12905");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray6 = new int[] { 'a', '4', '#', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (byte) 1, 0);
    }

    @Test
    public void test12906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12906");
        int[] intArray2 = new int[] { (short) 10, 'a' };
        int[] intArray7 = new int[] { (short) 1, (byte) 1, (short) 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 10, 1);
    }

    @Test
    public void test12907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12907");
        int[] intArray5 = new int[] { 1, (short) 0, ' ', ' ', (byte) 100 };
        int[] intArray9 = new int[] { (short) 1, 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 10, (int) (byte) 10);
    }

    @Test
    public void test12908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12908");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) -1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 10, 100);
    }

    @Test
    public void test12909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12909");
        int[] intArray2 = new int[] { 'a', (-1) };
        int[] intArray9 = new int[] { 1, (-1), '4', (byte) 100, '#', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (byte) 0, (-1));
    }

    @Test
    public void test12910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12910");
        int[] intArray5 = new int[] { 1, 1, (short) 1, 0, (short) -1 };
        int[] intArray7 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (short) 1, (int) '#');
    }

    @Test
    public void test12911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12911");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, 10, (-1));
    }

    @Test
    public void test12912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12912");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) 0, (int) (byte) 0);
    }

    @Test
    public void test12913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12913");
        int[] intArray5 = new int[] { (byte) 0, 'a', 'a', (byte) -1, (byte) 100 };
        int[] intArray10 = new int[] { '#', (byte) 10, (byte) -1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) 'a', (int) (short) 0);
    }

    @Test
    public void test12914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12914");
        int[] intArray5 = new int[] { (byte) 10, 'a', 'a', '4', (byte) 1 };
        int[] intArray11 = new int[] { (byte) -1, 0, (byte) 0, (short) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 100, (int) '4');
    }

    @Test
    public void test12915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12915");
        int[] intArray4 = new int[] { 10, 1, (short) 10, ' ' };
        int[] intArray7 = new int[] { 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) -1, (int) 'a');
    }

    @Test
    public void test12916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12916");
        int[] intArray5 = new int[] { 1, (byte) 1, (byte) 0, (byte) 100, (byte) 10 };
        int[] intArray9 = new int[] { 10, 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 100, (int) (short) 100);
    }

    @Test
    public void test12917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12917");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray5 = new int[] { (short) 0, 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, 10, (int) (short) 100);
    }

    @Test
    public void test12918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12918");
        int[] intArray4 = new int[] { (byte) -1, (short) 100, (-1), 1 };
        int[] intArray8 = new int[] { (byte) -1, (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 100, 100);
    }

    @Test
    public void test12919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12919");
        int[] intArray3 = new int[] { 10, '4', 100 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, 10, (int) (short) 0);
    }

    @Test
    public void test12920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12920");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) 10, '#', (short) 0, '4', (byte) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) -1, 0);
    }

    @Test
    public void test12921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12921");
        int[] intArray6 = new int[] { (byte) 10, '#', ' ', (byte) 1, 1, (short) 0 };
        int[] intArray10 = new int[] { (short) 100, (byte) 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) 10, (int) 'a');
    }

    @Test
    public void test12922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12922");
        int[] intArray4 = new int[] { 'a', 1, (byte) 1, 0 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, 0, (int) (short) 10);
    }

    @Test
    public void test12923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12923");
        int[] intArray6 = new int[] { 0, (short) 0, (short) -1, (byte) 10, 0, (-1) };
        int[] intArray13 = new int[] { (byte) -1, (short) 100, (short) 1, (short) 10, '4', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (short) 10, (int) (byte) 100);
    }

    @Test
    public void test12924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12924");
        int[] intArray4 = new int[] { 1, '4', (byte) 1, 'a' };
        int[] intArray6 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (short) 10, (int) '4');
    }

    @Test
    public void test12925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12925");
        int[] intArray6 = new int[] { 'a', (short) 1, 'a', (short) 1, (short) 10, (short) 1 };
        int[] intArray13 = new int[] { (short) 100, 100, (short) 100, '4', 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (byte) -1, (-1));
    }

    @Test
    public void test12926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12926");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { '4', (byte) 0, (short) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 0, 0);
    }

    @Test
    public void test12927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12927");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) -1, (short) -1, 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) 0, 0);
    }

    @Test
    public void test12928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12928");
        int[] intArray2 = new int[] { (-1), 1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) '#', (int) '#');
    }

    @Test
    public void test12929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12929");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { '4', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (byte) 1, (int) (byte) 1);
    }

    @Test
    public void test12930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12930");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray4 = new int[] { (short) 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 10, (int) '#');
    }

    @Test
    public void test12931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12931");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray4 = new int[] { (short) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, 1, (int) (byte) -1);
    }

    @Test
    public void test12932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12932");
        int[] intArray5 = new int[] { (byte) 100, 100, ' ', (short) 10, 0 };
        int[] intArray7 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) 10, 10);
    }

    @Test
    public void test12933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12933");
        int[] intArray5 = new int[] { (short) 1, (-1), 100, (short) -1, (short) 10 };
        int[] intArray10 = new int[] { (byte) -1, ' ', '4', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test12934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12934");
        int[] intArray3 = new int[] { (byte) 10, ' ', 10 };
        int[] intArray6 = new int[] { ' ', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) 100, (int) (short) -1);
    }

    @Test
    public void test12935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12935");
        int[] intArray2 = new int[] { 100, 'a' };
        int[] intArray6 = new int[] { (byte) 1, (byte) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (short) 1, (int) (byte) 0);
    }

    @Test
    public void test12936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12936");
        int[] intArray3 = new int[] { (byte) 0, (byte) 10, (-1) };
        int[] intArray6 = new int[] { (short) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) 10, (int) '#');
    }

    @Test
    public void test12937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12937");
        int[] intArray6 = new int[] { (byte) 10, (short) 0, (byte) -1, (-1), (short) 0, (byte) 1 };
        int[] intArray10 = new int[] { '4', (byte) 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) 100, (int) (short) -1);
    }

    @Test
    public void test12938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12938");
        int[] intArray2 = new int[] { (short) 100, 'a' };
        int[] intArray9 = new int[] { (byte) 0, (short) 0, (byte) 10, (byte) 0, 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (short) 0, (int) '#');
    }

    @Test
    public void test12939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12939");
        int[] intArray3 = new int[] { (short) -1, (byte) 1, '4' };
        int[] intArray10 = new int[] { (byte) 100, (byte) -1, (byte) 0, '#', (byte) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 100, (-1));
    }

    @Test
    public void test12940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12940");
        int[] intArray3 = new int[] { '4', (byte) 1, 10 };
        int[] intArray8 = new int[] { (-1), (short) 0, (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (byte) 10, (int) (short) -1);
    }

    @Test
    public void test12941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12941");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray7 = new int[] { 100, 0, (-1), '#', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) 'a', (int) (short) 0);
    }

    @Test
    public void test12942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12942");
        int[] intArray4 = new int[] { 100, (byte) 0, 1, 'a' };
        int[] intArray7 = new int[] { (short) 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 1, (-1));
    }

    @Test
    public void test12943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12943");
        int[] intArray2 = new int[] { 0, (byte) -1 };
        int[] intArray4 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (-1), 1);
    }

    @Test
    public void test12944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12944");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (byte) -1, (int) (short) 100);
    }

    @Test
    public void test12945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12945");
        int[] intArray6 = new int[] { (byte) 0, (short) 1, (byte) 0, (byte) 0, (short) -1, (byte) 100 };
        int[] intArray9 = new int[] { (short) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (short) 0, 1);
    }

    @Test
    public void test12946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12946");
        int[] intArray6 = new int[] { (byte) 10, ' ', (short) 10, (byte) -1, (byte) 100, 100 };
        int[] intArray9 = new int[] { (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) '#', (int) (short) -1);
    }

    @Test
    public void test12947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12947");
        int[] intArray2 = new int[] { (short) 1, (short) -1 };
        int[] intArray4 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (byte) -1, (int) (short) -1);
    }

    @Test
    public void test12948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12948");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (byte) 0, 10, (byte) 100, (short) 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, 100, 1);
    }

    @Test
    public void test12949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12949");
        int[] intArray3 = new int[] { '#', (byte) -1, '#' };
        int[] intArray5 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) 1, (int) (short) -1);
    }

    @Test
    public void test12950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12950");
        int[] intArray6 = new int[] { '#', (short) 0, 1, (byte) 10, (short) 10, (short) 0 };
        int[] intArray9 = new int[] { '4', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) '4', (int) ' ');
    }

    @Test
    public void test12951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12951");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { '#', ' ', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (-1), 0);
    }

    @Test
    public void test12952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12952");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 0, (int) '#');
    }

    @Test
    public void test12953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12953");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { '#', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (byte) -1, 100);
    }

    @Test
    public void test12954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12954");
        int[] intArray6 = new int[] { 'a', ' ', (short) 1, '#', (byte) 0, (byte) 100 };
        int[] intArray11 = new int[] { 'a', (byte) 1, 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 0, 1);
    }

    @Test
    public void test12955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12955");
        int[] intArray5 = new int[] { (short) 10, 100, 100, (byte) 0, 10 };
        int[] intArray12 = new int[] { 100, 'a', (-1), (short) 1, (byte) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) 'a', (int) (short) -1);
    }

    @Test
    public void test12956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12956");
        int[] intArray5 = new int[] { (short) 10, 0, (byte) -1, (byte) 10, '#' };
        int[] intArray9 = new int[] { (short) 1, 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (byte) -1, (int) (short) 10);
    }

    @Test
    public void test12957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12957");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        int[] intArray4 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 0, (int) (byte) 1);
    }

    @Test
    public void test12958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12958");
        int[] intArray5 = new int[] { (short) 100, 100, (byte) 100, (byte) 10, (short) 100 };
        int[] intArray10 = new int[] { (byte) 100, (-1), (short) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (byte) 1, (-1));
    }

    @Test
    public void test12959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12959");
        int[] intArray2 = new int[] { (short) 0, (byte) 100 };
        int[] intArray9 = new int[] { (short) 1, 0, 'a', (short) 1, 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) '4', (int) (byte) -1);
    }

    @Test
    public void test12960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12960");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 10, (short) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) 100, (int) (byte) 10);
    }

    @Test
    public void test12961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12961");
        int[] intArray3 = new int[] { (byte) 10, 0, (byte) 10 };
        int[] intArray8 = new int[] { (byte) -1, (byte) 1, (byte) 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (short) 1, (int) (short) 10);
    }

    @Test
    public void test12962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12962");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 0, (byte) 10, '4', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 10, (int) (byte) -1);
    }

    @Test
    public void test12963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12963");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 10, (byte) 1, (short) -1, 10, (byte) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, 100, (int) (byte) -1);
    }

    @Test
    public void test12964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12964");
        int[] intArray4 = new int[] { (byte) 10, (byte) 100, (short) 100, 10 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (-1), 100);
    }

    @Test
    public void test12965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12965");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray5 = new int[] { (byte) 100, (short) 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) '#', (-1));
    }

    @Test
    public void test12966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12966");
        int[] intArray5 = new int[] { ' ', (short) -1, (short) 100, (byte) 0, (byte) 1 };
        int[] intArray9 = new int[] { 'a', (short) 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (byte) 100, 0);
    }

    @Test
    public void test12967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12967");
        int[] intArray6 = new int[] { (short) 100, 100, 100, 100, (byte) 1, 0 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) 100, (int) (byte) 10);
    }

    @Test
    public void test12968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12968");
        int[] intArray6 = new int[] { 1, (byte) 0, (short) 0, 'a', (short) 0, (short) 1 };
        int[] intArray10 = new int[] { (short) 10, (-1), '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) '#', (int) (byte) 1);
    }

    @Test
    public void test12969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12969");
        int[] intArray5 = new int[] { (short) 1, ' ', 10, ' ', (-1) };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) 0, (int) (short) 1);
    }

    @Test
    public void test12970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12970");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 100, (int) (byte) 1);
    }

    @Test
    public void test12971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12971");
        int[] intArray3 = new int[] { (short) 10, 0, '4' };
        int[] intArray7 = new int[] { (short) 0, (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 1, 0);
    }

    @Test
    public void test12972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12972");
        int[] intArray4 = new int[] { (byte) 1, (short) 10, 0, (short) 1 };
        int[] intArray6 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 10, 0);
    }

    @Test
    public void test12973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12973");
        int[] intArray3 = new int[] { (byte) -1, (short) 100, (short) 10 };
        int[] intArray10 = new int[] { (byte) 10, 1, (byte) -1, (byte) 10, (short) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) '#', (int) '#');
    }

    @Test
    public void test12974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12974");
        int[] intArray4 = new int[] { 1, (short) 1, (byte) -1, '#' };
        int[] intArray8 = new int[] { (short) 10, ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 100, (int) (short) 1);
    }

    @Test
    public void test12975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12975");
        int[] intArray3 = new int[] { 100, '#', 100 };
        int[] intArray7 = new int[] { 10, 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 0, (int) 'a');
    }

    @Test
    public void test12976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12976");
        int[] intArray2 = new int[] { 10, (byte) 10 };
        int[] intArray6 = new int[] { (byte) -1, '4', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) '4', (-1));
    }

    @Test
    public void test12977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12977");
        int[] intArray4 = new int[] { 'a', 100, (short) 10, (byte) -1 };
        int[] intArray9 = new int[] { '#', 'a', (short) 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 0, (int) (short) -1);
    }

    @Test
    public void test12978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12978");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray6 = new int[] { ' ', (short) 1, (short) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) '#', (int) (byte) -1);
    }

    @Test
    public void test12979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12979");
        int[] intArray2 = new int[] { 100, 100 };
        int[] intArray8 = new int[] { '#', 1, 10, (byte) 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 10, (int) (short) 10);
    }

    @Test
    public void test12980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12980");
        int[] intArray5 = new int[] { (byte) -1, 0, (byte) 0, ' ', (short) 0 };
        int[] intArray11 = new int[] { 1, (short) 100, (byte) 10, (short) 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 100, (int) (short) 1);
    }

    @Test
    public void test12981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12981");
        int[] intArray6 = new int[] { (byte) 10, ' ', (short) 100, 'a', (short) 0, 1 };
        int[] intArray9 = new int[] { (byte) 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, 100, (int) (byte) 1);
    }

    @Test
    public void test12982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12982");
        int[] intArray6 = new int[] { (short) 0, (short) -1, (short) 100, '#', 1, 'a' };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) 1, (int) ' ');
    }

    @Test
    public void test12983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12983");
        int[] intArray5 = new int[] { 'a', (short) 100, (byte) 1, (short) 1, (byte) 0 };
        int[] intArray10 = new int[] { (short) 0, 10, (short) -1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (byte) 1, (int) (byte) 1);
    }

    @Test
    public void test12984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12984");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (short) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (short) 100, (int) (byte) 1);
    }

    @Test
    public void test12985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12985");
        int[] intArray4 = new int[] { 10, (short) 0, 0, (short) 100 };
        int[] intArray6 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) ' ', 0);
    }

    @Test
    public void test12986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12986");
        int[] intArray4 = new int[] { 100, (byte) 10, (byte) 1, (byte) 0 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) '4', (int) (byte) 0);
    }

    @Test
    public void test12987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12987");
        int[] intArray5 = new int[] { (byte) 10, (-1), (short) 100, (-1), 0 };
        int[] intArray10 = new int[] { (short) 10, '#', (short) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test12988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12988");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray8 = new int[] { 10, (byte) 100, ' ', (short) 100, (short) 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 100, 100);
    }

    @Test
    public void test12989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12989");
        int[] intArray4 = new int[] { 'a', '#', (short) 100, 1 };
        int[] intArray9 = new int[] { (short) 1, 'a', (-1), 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (-1), (int) (short) 0);
    }

    @Test
    public void test12990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12990");
        int[] intArray3 = new int[] { (byte) 0, '#', '#' };
        int[] intArray8 = new int[] { (byte) 0, (short) 100, (byte) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (short) 0, (int) (byte) 0);
    }

    @Test
    public void test12991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12991");
        int[] intArray6 = new int[] { (byte) -1, (short) 100, 'a', (byte) 0, 100, (short) 100 };
        int[] intArray13 = new int[] { '4', (short) -1, (byte) -1, (byte) 100, 'a', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (short) 1, (int) (short) 10);
    }

    @Test
    public void test12992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12992");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) 'a', (int) (short) 1);
    }

    @Test
    public void test12993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12993");
        int[] intArray5 = new int[] { 100, 1, 0, (short) 10, 10 };
        int[] intArray8 = new int[] { 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) 'a', (int) (short) 100);
    }

    @Test
    public void test12994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12994");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) 0, 100, (short) 10, 1, (short) 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) 1, (int) (byte) 0);
    }

    @Test
    public void test12995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12995");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (short) 1, 0);
    }

    @Test
    public void test12996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12996");
        int[] intArray2 = new int[] { (short) 1, (byte) 10 };
        int[] intArray4 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 0, 10);
    }

    @Test
    public void test12997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12997");
        int[] intArray4 = new int[] { 10, (-1), (-1), (short) 1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, 0, (int) (short) 10);
    }

    @Test
    public void test12998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12998");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 1, ' ', '#', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) 100, (int) '4');
    }

    @Test
    public void test12999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test12999");
        int[] intArray3 = new int[] { (byte) 1, (short) 0, 0 };
        int[] intArray8 = new int[] { 1, (byte) -1, 'a', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 0, (int) '4');
    }

    @Test
    public void test13000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest25.test13000");
        int[] intArray4 = new int[] { (short) 0, 10, 10, 10 };
        int[] intArray10 = new int[] { (byte) 0, (byte) 100, (short) 0, (byte) 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (byte) 0, (int) (byte) 100);
    }
}

