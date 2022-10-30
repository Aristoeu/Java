package KnapsackMemoization;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest21 {

    public static boolean debug = false;

    @Test
    public void test10501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10501");
        int[] intArray2 = new int[] { 10, 'a' };
        int[] intArray7 = new int[] { (short) -1, 'a', (short) 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (short) -1, (int) (short) 1);
    }

    @Test
    public void test10502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10502");
        int[] intArray3 = new int[] { (byte) -1, (byte) 100, 0 };
        int[] intArray8 = new int[] { (short) 1, (short) 100, 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (byte) 100, 100);
    }

    @Test
    public void test10503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10503");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray4 = new int[] { ' ', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test10504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10504");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) 'a', (-1));
    }

    @Test
    public void test10505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10505");
        int[] intArray3 = new int[] { '#', (short) 100, 100 };
        int[] intArray6 = new int[] { 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) 100, (int) (byte) 1);
    }

    @Test
    public void test10506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10506");
        int[] intArray6 = new int[] { ' ', (short) 1, (byte) 1, (byte) 0, 10, (byte) 0 };
        int[] intArray12 = new int[] { (byte) 10, (short) -1, (byte) 10, 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) -1, (int) (byte) 0);
    }

    @Test
    public void test10507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10507");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 10, (short) 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (-1), (int) ' ');
    }

    @Test
    public void test10508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10508");
        int[] intArray2 = new int[] { (byte) 0, '4' };
        int[] intArray4 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (short) 10, (int) (short) 100);
    }

    @Test
    public void test10509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10509");
        int[] intArray2 = new int[] { (short) 10, 10 };
        int[] intArray6 = new int[] { (byte) 0, (short) 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) 100, (int) (short) 10);
    }

    @Test
    public void test10510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10510");
        int[] intArray4 = new int[] { (short) 10, (byte) 1, (byte) 100, 1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (-1), (int) 'a');
    }

    @Test
    public void test10511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10511");
        int[] intArray5 = new int[] { (byte) -1, (short) 1, (short) 0, (byte) 10, 100 };
        int[] intArray12 = new int[] { 0, (byte) -1, (byte) -1, (byte) 100, 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (-1), (int) (byte) 10);
    }

    @Test
    public void test10512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10512");
        int[] intArray6 = new int[] { (byte) 1, 1, 10, (byte) 100, 100, (byte) 10 };
        int[] intArray8 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (byte) 100, (-1));
    }

    @Test
    public void test10513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10513");
        int[] intArray6 = new int[] { (short) 10, '#', (short) 1, (short) 1, (short) 0, (byte) 100 };
        int[] intArray11 = new int[] { 100, '#', (byte) 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 100, 1);
    }

    @Test
    public void test10514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10514");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, '4', (short) -1, (byte) 10, 'a' };
        int[] intArray12 = new int[] { (short) 0, 0, (short) -1, 'a', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (byte) 0, 1);
    }

    @Test
    public void test10515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10515");
        int[] intArray6 = new int[] { (byte) 1, (short) 10, (byte) -1, (byte) 1, 1, (short) 1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) 100, 10);
    }

    @Test
    public void test10516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10516");
        int[] intArray3 = new int[] { (byte) 10, 10, 'a' };
        int[] intArray7 = new int[] { (short) 1, (short) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) -1, (int) (byte) 10);
    }

    @Test
    public void test10517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10517");
        int[] intArray5 = new int[] { (byte) 100, '#', ' ', (short) 100, (short) 100 };
        int[] intArray7 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test10518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10518");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray6 = new int[] { (byte) -1, (-1), (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (short) 10, 100);
    }

    @Test
    public void test10519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10519");
        int[] intArray6 = new int[] { '4', 10, '4', (byte) 10, (byte) -1, (byte) 10 };
        int[] intArray8 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) 'a', 1);
    }

    @Test
    public void test10520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10520");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { ' ', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (-1), (int) (short) -1);
    }

    @Test
    public void test10521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10521");
        int[] intArray5 = new int[] { (byte) 10, ' ', '#', (-1), '#' };
        int[] intArray9 = new int[] { '4', (short) -1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) '#', (int) (byte) -1);
    }

    @Test
    public void test10522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10522");
        int[] intArray4 = new int[] { ' ', '#', (short) 10, (byte) -1 };
        int[] intArray8 = new int[] { (byte) 0, 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) -1, (int) (byte) 10);
    }

    @Test
    public void test10523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10523");
        int[] intArray5 = new int[] { (short) 1, 10, (byte) 1, (byte) -1, (short) 10 };
        int[] intArray8 = new int[] { (short) 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) 1, (int) (short) 1);
    }

    @Test
    public void test10524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10524");
        int[] intArray4 = new int[] { (byte) 10, (-1), ' ', (byte) 100 };
        int[] intArray6 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) '#', (int) 'a');
    }

    @Test
    public void test10525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10525");
        int[] intArray4 = new int[] { 1, (byte) -1, 0, (byte) 10 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, 10, (int) (byte) 10);
    }

    @Test
    public void test10526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10526");
        int[] intArray6 = new int[] { (-1), '4', (byte) 1, (byte) 10, 1, 1 };
        int[] intArray12 = new int[] { 10, (byte) 100, (byte) 100, (short) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (-1), (int) (byte) 10);
    }

    @Test
    public void test10527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10527");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 'a', (short) -1, (short) -1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 100, (int) '4');
    }

    @Test
    public void test10528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10528");
        int[] intArray2 = new int[] { (short) 10, 10 };
        int[] intArray4 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 1, 0);
    }

    @Test
    public void test10529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10529");
        int[] intArray3 = new int[] { (short) 1, '#', (byte) 100 };
        int[] intArray6 = new int[] { 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, 10, (int) (byte) 1);
    }

    @Test
    public void test10530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10530");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray8 = new int[] { '4', 0, (short) 0, 100, (-1), (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (-1), 0);
    }

    @Test
    public void test10531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10531");
        int[] intArray1 = new int[] { '4' };
        int[] intArray4 = new int[] { '4', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, 0, (-1));
    }

    @Test
    public void test10532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10532");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { '4', (short) 100, 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 100, (int) (byte) 1);
    }

    @Test
    public void test10533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10533");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) '#', (int) (byte) -1);
    }

    @Test
    public void test10534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10534");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (byte) -1, (byte) 10, (short) 100, (short) 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) ' ', (int) (short) 100);
    }

    @Test
    public void test10535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10535");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray6 = new int[] { 100, (byte) 0, (short) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 1, (int) (byte) 0);
    }

    @Test
    public void test10536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10536");
        int[] intArray4 = new int[] { (byte) 10, ' ', (short) 1, (byte) -1 };
        int[] intArray7 = new int[] { 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) 0, (int) '4');
    }

    @Test
    public void test10537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10537");
        int[] intArray1 = new int[] { '4' };
        int[] intArray5 = new int[] { ' ', 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, 100, (int) (short) 10);
    }

    @Test
    public void test10538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10538");
        int[] intArray4 = new int[] { (-1), (byte) 0, '#', 10 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (short) 100, 100);
    }

    @Test
    public void test10539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10539");
        int[] intArray2 = new int[] { (short) 100, (byte) 1 };
        int[] intArray4 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (byte) 0, 100);
    }

    @Test
    public void test10540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10540");
        int[] intArray1 = new int[] { '#' };
        int[] intArray3 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) '4', 10);
    }

    @Test
    public void test10541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10541");
        int[] intArray6 = new int[] { 10, (short) 1, (short) 0, '#', (short) 100, 1 };
        int[] intArray12 = new int[] { (byte) 0, 0, (byte) 10, 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) 1, (-1));
    }

    @Test
    public void test10542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10542");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, 0, (int) (byte) 1);
    }

    @Test
    public void test10543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10543");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray5 = new int[] { 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 0, (int) '4');
    }

    @Test
    public void test10544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10544");
        int[] intArray2 = new int[] { (byte) 10, '#' };
        int[] intArray5 = new int[] { (byte) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) '4', (int) 'a');
    }

    @Test
    public void test10545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10545");
        int[] intArray5 = new int[] { (short) 100, 1, (byte) -1, (byte) 100, '4' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) 10, (int) ' ');
    }

    @Test
    public void test10546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10546");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) '4', (int) (byte) -1);
    }

    @Test
    public void test10547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10547");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray8 = new int[] { '#', (byte) 10, 10, '4', (byte) 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) 0, (int) (byte) -1);
    }

    @Test
    public void test10548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10548");
        int[] intArray1 = new int[] { 1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) 0, (int) (short) 1);
    }

    @Test
    public void test10549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10549");
        int[] intArray3 = new int[] { (short) 1, (byte) 1, 0 };
        int[] intArray7 = new int[] { ' ', (short) 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) '4', (int) 'a');
    }

    @Test
    public void test10550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10550");
        int[] intArray3 = new int[] { (byte) 1, 'a', (byte) 10 };
        int[] intArray9 = new int[] { 100, (short) 10, (short) 100, ' ', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (short) 1, (int) (byte) 1);
    }

    @Test
    public void test10551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10551");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 0, (int) (short) 0);
    }

    @Test
    public void test10552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10552");
        int[] intArray4 = new int[] { '#', 100, ' ', (byte) 0 };
        int[] intArray7 = new int[] { (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) 1, 10);
    }

    @Test
    public void test10553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10553");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 1, (byte) -1, (byte) 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (-1), (int) 'a');
    }

    @Test
    public void test10554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10554");
        int[] intArray4 = new int[] { (short) 10, (-1), '4', (-1) };
        int[] intArray10 = new int[] { 'a', 0, ' ', 'a', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, 0, (int) ' ');
    }

    @Test
    public void test10555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10555");
        int[] intArray5 = new int[] { (byte) -1, (short) -1, 'a', 1, (byte) 100 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) 0, (int) 'a');
    }

    @Test
    public void test10556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10556");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) '#', (int) '4');
    }

    @Test
    public void test10557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10557");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test10558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10558");
        int[] intArray4 = new int[] { 10, 10, (byte) -1, (byte) 1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) '#', (int) '#');
    }

    @Test
    public void test10559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10559");
        int[] intArray4 = new int[] { (short) 1, 1, (short) 0, (short) 10 };
        int[] intArray7 = new int[] { (short) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) 'a', (-1));
    }

    @Test
    public void test10560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10560");
        int[] intArray6 = new int[] { (short) -1, (byte) 100, (short) 10, 1, (short) 10, (byte) -1 };
        int[] intArray13 = new int[] { (short) 0, (short) -1, (-1), (short) 100, (short) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (byte) 1, (int) '4');
    }

    @Test
    public void test10561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10561");
        int[] intArray3 = new int[] { 100, (short) 10, 10 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) -1, (int) (short) -1);
    }

    @Test
    public void test10562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10562");
        int[] intArray6 = new int[] { (short) 0, (short) -1, (short) 10, (byte) 0, (byte) 10, (short) 100 };
        int[] intArray13 = new int[] { (short) 10, (short) 1, (byte) 0, '#', (short) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (short) 1, (int) (short) 10);
    }

    @Test
    public void test10563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10563");
        int[] intArray4 = new int[] { (byte) 10, (byte) 100, 10, (byte) 10 };
        int[] intArray10 = new int[] { (short) 100, (short) 0, (byte) 100, '#', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, 100, 100);
    }

    @Test
    public void test10564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10564");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 100, (short) -1, (short) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (-1), (int) 'a');
    }

    @Test
    public void test10565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10565");
        int[] intArray6 = new int[] { (short) 0, ' ', (short) -1, 1, 1, '4' };
        int[] intArray10 = new int[] { (byte) 0, (byte) 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test10566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10566");
        int[] intArray6 = new int[] { (short) 1, (byte) -1, (byte) 0, (byte) -1, 'a', (byte) 1 };
        int[] intArray10 = new int[] { (short) 1, (byte) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 0, (int) (byte) 1);
    }

    @Test
    public void test10567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10567");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray3 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (-1), (int) (short) 0);
    }

    @Test
    public void test10568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10568");
        int[] intArray2 = new int[] { (byte) -1, 1 };
        int[] intArray6 = new int[] { (byte) 10, (short) 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test10569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10569");
        int[] intArray4 = new int[] { 1, 1, (byte) 1, (byte) 10 };
        int[] intArray11 = new int[] { ' ', (short) 100, (short) 1, (byte) -1, (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) '4', (int) (byte) 1);
    }

    @Test
    public void test10570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10570");
        int[] intArray5 = new int[] { 'a', (-1), (short) 1, (byte) 1, 'a' };
        int[] intArray8 = new int[] { (byte) 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) 0, 1);
    }

    @Test
    public void test10571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10571");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray4 = new int[] { '#', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, 1, (-1));
    }

    @Test
    public void test10572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10572");
        int[] intArray6 = new int[] { 100, 100, (byte) 1, 'a', (byte) 0, 10 };
        int[] intArray13 = new int[] { 1, (byte) 0, 0, 0, (short) 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (short) -1, (int) (short) -1);
    }

    @Test
    public void test10573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10573");
        int[] intArray2 = new int[] { (short) 100, '#' };
        int[] intArray5 = new int[] { (-1), (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 0, 0);
    }

    @Test
    public void test10574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10574");
        int[] intArray5 = new int[] { (short) -1, 10, 1, ' ', (byte) 10 };
        int[] intArray7 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, 0, (int) (byte) 100);
    }

    @Test
    public void test10575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10575");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 10, (int) '#');
    }

    @Test
    public void test10576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10576");
        int[] intArray6 = new int[] { (short) 1, (short) 100, (-1), '#', (byte) 10, (byte) -1 };
        int[] intArray12 = new int[] { (short) 10, (byte) 1, 1, 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (byte) 100, (int) (short) 0);
    }

    @Test
    public void test10577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10577");
        int[] intArray3 = new int[] { (byte) 10, (short) 100, (short) 100 };
        int[] intArray10 = new int[] { '4', (short) 100, (short) 100, (byte) 100, (byte) 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) '4', (int) (short) 10);
    }

    @Test
    public void test10578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10578");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) -1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test10579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10579");
        int[] intArray4 = new int[] { (short) 10, (-1), (byte) 1, ' ' };
        int[] intArray6 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, 10, (int) '#');
    }

    @Test
    public void test10580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10580");
        int[] intArray6 = new int[] { (byte) 10, '#', (short) 0, ' ', 10, (byte) -1 };
        int[] intArray9 = new int[] { 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, 100, (int) (short) 10);
    }

    @Test
    public void test10581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10581");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (byte) 0, 0);
    }

    @Test
    public void test10582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10582");
        int[] intArray5 = new int[] { 10, (byte) -1, (byte) 1, (short) 0, (byte) 10 };
        int[] intArray8 = new int[] { 'a', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 0, (-1));
    }

    @Test
    public void test10583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10583");
        int[] intArray3 = new int[] { ' ', '#', ' ' };
        int[] intArray6 = new int[] { (short) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, 0, (int) (byte) -1);
    }

    @Test
    public void test10584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10584");
        int[] intArray6 = new int[] { 'a', (byte) -1, (short) -1, (-1), 10, 100 };
        int[] intArray10 = new int[] { (short) -1, (-1), (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 10, (int) (short) 1);
    }

    @Test
    public void test10585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10585");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray5 = new int[] { (byte) 100, (byte) 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (-1), (int) 'a');
    }

    @Test
    public void test10586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10586");
        int[] intArray4 = new int[] { (short) 1, (byte) -1, (short) 10, (byte) 10 };
        int[] intArray9 = new int[] { (byte) 1, '#', (byte) 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) '#', (int) (short) 10);
    }

    @Test
    public void test10587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10587");
        int[] intArray5 = new int[] { 100, (byte) 100, 0, (byte) 1, (byte) 1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) ' ', (-1));
    }

    @Test
    public void test10588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10588");
        int[] intArray6 = new int[] { (byte) 1, (short) 10, 0, (-1), (short) 10, 1 };
        int[] intArray13 = new int[] { (short) -1, (short) -1, (byte) 100, '#', (byte) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 1, (int) (short) 10);
    }

    @Test
    public void test10589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10589");
        int[] intArray3 = new int[] { 100, (short) 0, 1 };
        int[] intArray10 = new int[] { (short) -1, (byte) 1, ' ', (byte) -1, (short) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 0, (int) (short) 1);
    }

    @Test
    public void test10590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10590");
        int[] intArray5 = new int[] { '#', 0, '4', (short) 10, (short) 0 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (short) 10, (int) ' ');
    }

    @Test
    public void test10591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10591");
        int[] intArray2 = new int[] { (byte) 100, (-1) };
        int[] intArray6 = new int[] { (short) 100, 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (short) 0, 10);
    }

    @Test
    public void test10592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10592");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (short) 100, (int) (byte) 100);
    }

    @Test
    public void test10593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10593");
        int[] intArray6 = new int[] { (-1), (short) -1, 0, 1, 100, (short) 0 };
        int[] intArray10 = new int[] { 100, '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) 1, (int) ' ');
    }

    @Test
    public void test10594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10594");
        int[] intArray3 = new int[] { (short) 100, 100, 1 };
        int[] intArray6 = new int[] { (short) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) '#', (int) 'a');
    }

    @Test
    public void test10595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10595");
        int[] intArray1 = new int[] { 10 };
        int[] intArray4 = new int[] { (short) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 1, 1);
    }

    @Test
    public void test10596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10596");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray6 = new int[] { (byte) 1, (short) 10, '#', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) '4', (int) (short) 0);
    }

    @Test
    public void test10597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10597");
        int[] intArray4 = new int[] { (byte) 0, (byte) -1, (short) -1, '4' };
        int[] intArray11 = new int[] { 0, (short) 1, 100, (short) 0, (byte) 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, 10, 0);
    }

    @Test
    public void test10598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10598");
        int[] intArray6 = new int[] { (short) 0, (byte) 100, (byte) 0, 100, 100, '4' };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, 0, (int) '4');
    }

    @Test
    public void test10599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10599");
        int[] intArray3 = new int[] { (byte) 1, (short) -1, 1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) '4', 0);
    }

    @Test
    public void test10600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10600");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { ' ', (byte) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) 0, (int) '4');
    }

    @Test
    public void test10601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10601");
        int[] intArray3 = new int[] { (byte) 0, (byte) 10, (short) 0 };
        int[] intArray10 = new int[] { (short) 10, (short) 10, ' ', (byte) 0, 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 1, (-1));
    }

    @Test
    public void test10602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10602");
        int[] intArray2 = new int[] { (short) 0, (byte) 10 };
        int[] intArray9 = new int[] { (short) 0, (short) -1, (byte) 10, '4', (byte) 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 1, (int) (byte) -1);
    }

    @Test
    public void test10603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10603");
        int[] intArray6 = new int[] { (byte) 0, (short) 0, 100, 0, (short) 0, (short) 10 };
        int[] intArray10 = new int[] { 10, (byte) 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (short) 100, (int) (short) 0);
    }

    @Test
    public void test10604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10604");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { '#', (byte) -1, 'a', (byte) 0, 'a', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) '4', 10);
    }

    @Test
    public void test10605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10605");
        int[] intArray5 = new int[] { (short) 100, (short) 100, ' ', (short) 1, ' ' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) 0, (int) (short) 100);
    }

    @Test
    public void test10606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10606");
        int[] intArray3 = new int[] { (short) 100, (short) 0, (byte) -1 };
        int[] intArray6 = new int[] { (short) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) ' ', 0);
    }

    @Test
    public void test10607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10607");
        int[] intArray4 = new int[] { 0, (byte) 1, (short) 10, '#' };
        int[] intArray10 = new int[] { (byte) 100, (byte) -1, (short) 1, 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) ' ', (int) (short) 100);
    }

    @Test
    public void test10608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10608");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 1, 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, 0, 0);
    }

    @Test
    public void test10609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10609");
        int[] intArray3 = new int[] { (short) 1, (short) 1, (byte) 1 };
        int[] intArray6 = new int[] { '#', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, 1, (int) (byte) 10);
    }

    @Test
    public void test10610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10610");
        int[] intArray2 = new int[] { 'a', 1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 10, (int) 'a');
    }

    @Test
    public void test10611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10611");
        int[] intArray3 = new int[] { (short) 10, 10, (short) 0 };
        int[] intArray5 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) 'a', (int) (short) 0);
    }

    @Test
    public void test10612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10612");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 10, (short) 1, (byte) 0, (short) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) 1, 100);
    }

    @Test
    public void test10613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10613");
        int[] intArray6 = new int[] { (byte) 100, (byte) 0, 1, (byte) 10, '4', (short) 10 };
        int[] intArray10 = new int[] { '4', ' ', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (short) 0, (-1));
    }

    @Test
    public void test10614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10614");
        int[] intArray3 = new int[] { (short) 1, (byte) 100, (byte) 0 };
        int[] intArray5 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) ' ', (int) '#');
    }

    @Test
    public void test10615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10615");
        int[] intArray6 = new int[] { (-1), (short) 0, (byte) 100, (byte) -1, (byte) 0, 1 };
        int[] intArray9 = new int[] { 'a', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) -1, (-1));
    }

    @Test
    public void test10616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10616");
        int[] intArray3 = new int[] { '#', (short) 10, (short) 0 };
        int[] intArray10 = new int[] { '4', (short) 1, (byte) 10, (short) 100, 'a', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 0, (-1));
    }

    @Test
    public void test10617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10617");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { '4', (-1), (short) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) '#', (int) (byte) -1);
    }

    @Test
    public void test10618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10618");
        int[] intArray1 = new int[] { '#' };
        int[] intArray8 = new int[] { 1, (short) 1, ' ', (byte) 10, (short) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test10619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10619");
        int[] intArray5 = new int[] { 100, (byte) 10, (byte) 0, (-1), (short) -1 };
        int[] intArray12 = new int[] { (short) 10, '4', 0, (short) 100, ' ', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (byte) 1, (int) ' ');
    }

    @Test
    public void test10620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10620");
        int[] intArray6 = new int[] { 0, (short) -1, (byte) 100, 1, (short) 0, (-1) };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (-1), 100);
    }

    @Test
    public void test10621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10621");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, 1, (int) 'a');
    }

    @Test
    public void test10622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10622");
        int[] intArray5 = new int[] { 'a', (-1), (short) 1, 0, 0 };
        int[] intArray10 = new int[] { ' ', (byte) 1, ' ', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) '4', 1);
    }

    @Test
    public void test10623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10623");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray7 = new int[] { (byte) 0, (-1), '4', (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, 1, (-1));
    }

    @Test
    public void test10624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10624");
        int[] intArray4 = new int[] { (byte) 1, (byte) 0, '#', (short) 0 };
        int[] intArray10 = new int[] { (byte) 100, (byte) 10, (byte) 100, (byte) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) 1, (int) (short) -1);
    }

    @Test
    public void test10625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10625");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (-1), (int) (byte) 1);
    }

    @Test
    public void test10626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10626");
        int[] intArray2 = new int[] { '#', 'a' };
        int[] intArray9 = new int[] { 1, 0, (byte) 100, (byte) -1, (byte) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) 'a', (int) (short) 1);
    }

    @Test
    public void test10627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10627");
        int[] intArray4 = new int[] { ' ', (byte) 100, (byte) 1, '4' };
        int[] intArray10 = new int[] { 10, (short) -1, 100, (short) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) 1, (int) (short) 0);
    }

    @Test
    public void test10628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10628");
        int[] intArray4 = new int[] { 10, (byte) 1, (short) 100, (byte) 1 };
        int[] intArray7 = new int[] { (short) -1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) 'a', 0);
    }

    @Test
    public void test10629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10629");
        int[] intArray6 = new int[] { 100, 0, (short) 100, (short) 100, (short) -1, 'a' };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) 100, 100);
    }

    @Test
    public void test10630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10630");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray8 = new int[] { 10, (-1), 10, (short) 100, ' ', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (-1), 0);
    }

    @Test
    public void test10631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10631");
        int[] intArray4 = new int[] { 1, '#', 10, 1 };
        int[] intArray7 = new int[] { (byte) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 0, (int) (short) 10);
    }

    @Test
    public void test10632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10632");
        int[] intArray3 = new int[] { (byte) 100, (short) 100, 'a' };
        int[] intArray8 = new int[] { ' ', (byte) 1, (short) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 0, (int) (byte) -1);
    }

    @Test
    public void test10633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10633");
        int[] intArray4 = new int[] { 100, (short) 100, (byte) -1, 10 };
        int[] intArray8 = new int[] { (short) -1, (-1), (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) -1, (int) (byte) -1);
    }

    @Test
    public void test10634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10634");
        int[] intArray6 = new int[] { 10, (byte) 1, (byte) -1, (short) 1, (short) 1, (short) 0 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) 'a', (int) (byte) 1);
    }

    @Test
    public void test10635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10635");
        int[] intArray1 = new int[] { '4' };
        int[] intArray8 = new int[] { (short) 10, (byte) 0, (short) -1, (-1), '#', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 10, (int) (short) 1);
    }

    @Test
    public void test10636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10636");
        int[] intArray4 = new int[] { (short) 0, (byte) -1, (byte) 0, (byte) 100 };
        int[] intArray8 = new int[] { 0, 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) '#', (-1));
    }

    @Test
    public void test10637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10637");
        int[] intArray3 = new int[] { 100, 0, ' ' };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) ' ', (int) (short) 0);
    }

    @Test
    public void test10638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10638");
        int[] intArray4 = new int[] { (byte) 100, 'a', (byte) 10, (short) 10 };
        int[] intArray8 = new int[] { (-1), (byte) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (-1), (int) '#');
    }

    @Test
    public void test10639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10639");
        int[] intArray4 = new int[] { 1, 1, 100, (short) 1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, 0, 1);
    }

    @Test
    public void test10640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10640");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 0, (byte) -1, 10, 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) ' ', (-1));
    }

    @Test
    public void test10641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10641");
        int[] intArray3 = new int[] { (short) -1, (byte) 10, (byte) 100 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, 10, 0);
    }

    @Test
    public void test10642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10642");
        int[] intArray5 = new int[] { 100, (short) 100, 'a', 100, 100 };
        int[] intArray8 = new int[] { (byte) 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) 1, 1);
    }

    @Test
    public void test10643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10643");
        int[] intArray5 = new int[] { (short) -1, ' ', (short) 100, (short) 1, (-1) };
        int[] intArray9 = new int[] { ' ', (short) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 1, 1);
    }

    @Test
    public void test10644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10644");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) -1, 'a', (short) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test10645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10645");
        int[] intArray1 = new int[] { '4' };
        int[] intArray4 = new int[] { (byte) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (short) 100, (int) (short) 100);
    }

    @Test
    public void test10646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10646");
        int[] intArray2 = new int[] { (short) 10, (short) 10 };
        int[] intArray8 = new int[] { (byte) 1, (byte) 10, 100, (byte) 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) -1, (int) (byte) 1);
    }

    @Test
    public void test10647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10647");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (short) 1, 1);
    }

    @Test
    public void test10648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10648");
        int[] intArray2 = new int[] { ' ', (short) 10 };
        int[] intArray7 = new int[] { (short) 1, '#', (byte) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (short) 0, (-1));
    }

    @Test
    public void test10649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10649");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (byte) 100, 10);
    }

    @Test
    public void test10650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10650");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) -1, (int) (byte) 100);
    }

    @Test
    public void test10651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10651");
        int[] intArray3 = new int[] { (-1), (short) -1, 10 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (-1), (int) '#');
    }

    @Test
    public void test10652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10652");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray3 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) 10, (int) (short) 1);
    }

    @Test
    public void test10653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10653");
        int[] intArray2 = new int[] { (-1), 0 };
        int[] intArray8 = new int[] { (short) 0, (short) 1, '#', 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (-1), (int) '#');
    }

    @Test
    public void test10654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10654");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray8 = new int[] { (byte) 10, (short) 10, (byte) 100, (short) 0, 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) -1, (int) ' ');
    }

    @Test
    public void test10655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10655");
        int[] intArray3 = new int[] { 'a', (short) 10, (byte) 10 };
        int[] intArray8 = new int[] { (byte) 0, 'a', 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) '4', (int) (short) 1);
    }

    @Test
    public void test10656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10656");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, 0, (int) (byte) 1);
    }

    @Test
    public void test10657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10657");
        int[] intArray3 = new int[] { (byte) 0, (short) 100, (short) 1 };
        int[] intArray8 = new int[] { 1, ' ', (byte) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) '#', 100);
    }

    @Test
    public void test10658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10658");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray7 = new int[] { 'a', ' ', (byte) 1, 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) 10, (int) 'a');
    }

    @Test
    public void test10659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10659");
        int[] intArray6 = new int[] { 100, (byte) 10, (short) -1, ' ', (short) 100, 'a' };
        int[] intArray10 = new int[] { (short) -1, (-1), (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (short) -1, (int) (short) -1);
    }

    @Test
    public void test10660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10660");
        int[] intArray6 = new int[] { 1, (short) 0, (byte) 10, ' ', 1, 100 };
        int[] intArray9 = new int[] { ' ', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (short) 100, (int) (byte) 10);
    }

    @Test
    public void test10661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10661");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 100, 'a', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (-1), (int) (byte) 1);
    }

    @Test
    public void test10662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10662");
        int[] intArray5 = new int[] { (short) 10, ' ', ' ', (-1), 10 };
        int[] intArray11 = new int[] { (byte) -1, (short) 0, (short) 1, 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) 10, (int) '4');
    }

    @Test
    public void test10663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10663");
        int[] intArray5 = new int[] { (byte) 0, (byte) 0, (short) 1, (byte) 0, (short) 100 };
        int[] intArray9 = new int[] { 0, (byte) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (byte) 1, (int) (short) 0);
    }

    @Test
    public void test10664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10664");
        int[] intArray5 = new int[] { (byte) 0, '#', '#', (byte) 1, (byte) 10 };
        int[] intArray10 = new int[] { '#', (byte) 0, (-1), '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (short) 100, (int) (short) -1);
    }

    @Test
    public void test10665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10665");
        int[] intArray5 = new int[] { (byte) -1, (short) 1, 'a', 10, (byte) 10 };
        int[] intArray11 = new int[] { 'a', (short) 10, (short) -1, (byte) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) 0, (int) 'a');
    }

    @Test
    public void test10666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10666");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) -1, (byte) -1, 'a', (byte) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) 0, (int) (short) 100);
    }

    @Test
    public void test10667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10667");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { '4', '#', '4', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 0, (int) (short) 10);
    }

    @Test
    public void test10668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10668");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray4 = new int[] { '#', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 1, (int) (short) 0);
    }

    @Test
    public void test10669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10669");
        int[] intArray2 = new int[] { (byte) -1, 'a' };
        int[] intArray7 = new int[] { 10, (short) 1, ' ', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 0, (int) '#');
    }

    @Test
    public void test10670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10670");
        int[] intArray2 = new int[] { (short) 100, 'a' };
        int[] intArray8 = new int[] { (short) -1, 100, (short) 100, (short) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) 'a', 1);
    }

    @Test
    public void test10671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10671");
        int[] intArray5 = new int[] { (short) 100, '4', (short) -1, (byte) -1, (short) -1 };
        int[] intArray11 = new int[] { 100, 0, ' ', (byte) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) 10, 1);
    }

    @Test
    public void test10672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10672");
        int[] intArray5 = new int[] { '4', (short) 0, (byte) 1, (short) 100, 10 };
        int[] intArray11 = new int[] { 10, (byte) 0, (byte) 10, (short) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 10, (int) (byte) 0);
    }

    @Test
    public void test10673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10673");
        int[] intArray3 = new int[] { 10, 'a', (short) 0 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, 1, (int) ' ');
    }

    @Test
    public void test10674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10674");
        int[] intArray4 = new int[] { (short) -1, (byte) -1, (byte) 0, (short) 10 };
        int[] intArray7 = new int[] { (byte) -1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 0, (int) '4');
    }

    @Test
    public void test10675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10675");
        int[] intArray5 = new int[] { (short) 1, (byte) 0, 0, (short) 100, 'a' };
        int[] intArray10 = new int[] { (byte) -1, 0, (byte) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 100, (int) ' ');
    }

    @Test
    public void test10676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10676");
        int[] intArray5 = new int[] { (byte) 0, '4', (short) 1, (short) 10, 0 };
        int[] intArray8 = new int[] { (short) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 1, (int) '#');
    }

    @Test
    public void test10677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10677");
        int[] intArray5 = new int[] { (short) 0, (byte) 100, (short) 10, (short) 10, 'a' };
        int[] intArray7 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) 0, 1);
    }

    @Test
    public void test10678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10678");
        int[] intArray1 = new int[] { 10 };
        int[] intArray7 = new int[] { 1, 10, (short) 10, 'a', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) -1, (int) ' ');
    }

    @Test
    public void test10679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10679");
        int[] intArray4 = new int[] { (-1), (byte) -1, (short) 1, (byte) 0 };
        int[] intArray6 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (short) -1, 1);
    }

    @Test
    public void test10680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10680");
        int[] intArray2 = new int[] { '#', 10 };
        int[] intArray5 = new int[] { (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) ' ', (int) (byte) 10);
    }

    @Test
    public void test10681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10681");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 10, (short) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) '#', (int) '4');
    }

    @Test
    public void test10682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10682");
        int[] intArray4 = new int[] { (short) 0, (byte) -1, (short) 1, (short) 1 };
        int[] intArray7 = new int[] { (byte) 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) ' ', (int) (short) 1);
    }

    @Test
    public void test10683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10683");
        int[] intArray1 = new int[] { 1 };
        int[] intArray4 = new int[] { '4', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) '#', 100);
    }

    @Test
    public void test10684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10684");
        int[] intArray2 = new int[] { 0, (short) -1 };
        int[] intArray8 = new int[] { 10, 100, (short) 1, 'a', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (-1), (int) (byte) 1);
    }

    @Test
    public void test10685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10685");
        int[] intArray3 = new int[] { 100, (short) 100, (byte) 100 };
        int[] intArray9 = new int[] { (short) 0, '4', (byte) 1, (byte) -1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 0, (int) '#');
    }

    @Test
    public void test10686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10686");
        int[] intArray5 = new int[] { (short) 100, 'a', (byte) -1, (byte) 10, (short) -1 };
        int[] intArray8 = new int[] { (byte) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) -1, (int) (short) 10);
    }

    @Test
    public void test10687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10687");
        int[] intArray4 = new int[] { (byte) 0, (short) -1, 'a', 10 };
        int[] intArray10 = new int[] { (short) 100, (byte) 100, (-1), (-1), (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) 0, 100);
    }

    @Test
    public void test10688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10688");
        int[] intArray5 = new int[] { 'a', ' ', (-1), ' ', (short) 1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) '4', (int) 'a');
    }

    @Test
    public void test10689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10689");
        int[] intArray2 = new int[] { (short) 1, 1 };
        int[] intArray8 = new int[] { 10, (byte) -1, (short) 0, (short) 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) -1, (int) (byte) 10);
    }

    @Test
    public void test10690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10690");
        int[] intArray6 = new int[] { 100, (byte) 10, (short) -1, '4', (byte) 1, (short) -1 };
        int[] intArray8 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (byte) -1, (int) 'a');
    }

    @Test
    public void test10691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10691");
        int[] intArray5 = new int[] { (byte) -1, (short) 0, (byte) 100, '#', (byte) -1 };
        int[] intArray7 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) 'a', (int) (short) 0);
    }

    @Test
    public void test10692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10692");
        int[] intArray6 = new int[] { (short) 100, (byte) 100, 100, 'a', (byte) 0, 'a' };
        int[] intArray12 = new int[] { 100, (short) 0, (byte) 10, '#', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) 100, 0);
    }

    @Test
    public void test10693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10693");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) -1, (int) '#');
    }

    @Test
    public void test10694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10694");
        int[] intArray3 = new int[] { 1, 1, (short) 0 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (byte) -1, 0);
    }

    @Test
    public void test10695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10695");
        int[] intArray6 = new int[] { (byte) 10, (short) 1, (byte) 10, 0, (short) 10, (short) 1 };
        int[] intArray9 = new int[] { (byte) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, 0, (int) (short) 100);
    }

    @Test
    public void test10696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10696");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray4 = new int[] { (short) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (short) 100, (int) '4');
    }

    @Test
    public void test10697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10697");
        int[] intArray1 = new int[] { '4' };
        int[] intArray4 = new int[] { (byte) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) -1, (int) '4');
    }

    @Test
    public void test10698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10698");
        int[] intArray2 = new int[] { ' ', (short) -1 };
        int[] intArray5 = new int[] { (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) '4', (int) ' ');
    }

    @Test
    public void test10699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10699");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (-1), (short) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) -1, (int) (byte) 1);
    }

    @Test
    public void test10700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10700");
        int[] intArray1 = new int[] { '4' };
        int[] intArray4 = new int[] { (short) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, 1, 0);
    }

    @Test
    public void test10701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10701");
        int[] intArray2 = new int[] { (-1), ' ' };
        int[] intArray8 = new int[] { (short) 10, (short) 0, (byte) 100, 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 1, (int) (byte) -1);
    }

    @Test
    public void test10702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10702");
        int[] intArray2 = new int[] { (short) 100, (short) 100 };
        int[] intArray7 = new int[] { 0, (-1), (-1), '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 10, (-1));
    }

    @Test
    public void test10703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10703");
        int[] intArray6 = new int[] { (byte) 1, (short) 100, (byte) 100, (short) 10, (short) 0, ' ' };
        int[] intArray9 = new int[] { (short) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (short) 0, (int) (byte) 0);
    }

    @Test
    public void test10704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10704");
        int[] intArray2 = new int[] { 1, (short) 10 };
        int[] intArray6 = new int[] { 'a', (short) 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) ' ', 100);
    }

    @Test
    public void test10705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10705");
        int[] intArray3 = new int[] { '4', 0, 0 };
        int[] intArray5 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (-1), (int) (byte) 10);
    }

    @Test
    public void test10706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10706");
        int[] intArray6 = new int[] { '#', 10, (byte) 100, (short) 1, (short) 10, ' ' };
        int[] intArray9 = new int[] { (short) 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (short) 0, (int) '#');
    }

    @Test
    public void test10707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10707");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 0 };
        int[] intArray7 = new int[] { (byte) 10, (byte) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) '#', (int) (short) -1);
    }

    @Test
    public void test10708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10708");
        int[] intArray1 = new int[] { '4' };
        int[] intArray4 = new int[] { ' ', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) 'a', 10);
    }

    @Test
    public void test10709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10709");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 100, (short) 0, (byte) 0, (short) -1, 'a', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) 0, (int) 'a');
    }

    @Test
    public void test10710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10710");
        int[] intArray5 = new int[] { (byte) 100, (byte) 100, (short) 1, 0, (short) 0 };
        int[] intArray7 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) 10, (int) ' ');
    }

    @Test
    public void test10711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10711");
        int[] intArray3 = new int[] { '#', (byte) 10, (short) 10 };
        int[] intArray9 = new int[] { (short) 1, 'a', ' ', '#', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) 'a', (int) (byte) 0);
    }

    @Test
    public void test10712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10712");
        int[] intArray5 = new int[] { 1, (byte) 0, (byte) 100, (byte) 100, 100 };
        int[] intArray11 = new int[] { '#', 'a', '4', (short) 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) 0, (-1));
    }

    @Test
    public void test10713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10713");
        int[] intArray6 = new int[] { (short) 100, (-1), (short) 10, (short) 1, 0, (short) -1 };
        int[] intArray13 = new int[] { 0, (-1), (short) 0, (-1), (byte) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) ' ', (int) (short) 10);
    }

    @Test
    public void test10714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10714");
        int[] intArray5 = new int[] { '#', (byte) 0, 10, (-1), (short) 100 };
        int[] intArray12 = new int[] { (short) -1, 1, 1, 1, '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test10715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10715");
        int[] intArray6 = new int[] { (short) 1, ' ', (short) 1, 10, (short) 100, (short) 10 };
        int[] intArray9 = new int[] { 'a', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test10716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10716");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 10, (byte) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) 0, (int) (byte) -1);
    }

    @Test
    public void test10717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10717");
        int[] intArray3 = new int[] { (short) -1, 0, 100 };
        int[] intArray6 = new int[] { 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) 10, 0);
    }

    @Test
    public void test10718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10718");
        int[] intArray4 = new int[] { 100, (short) 100, 10, ' ' };
        int[] intArray10 = new int[] { '#', 100, (byte) 1, 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) -1, (int) ' ');
    }

    @Test
    public void test10719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10719");
        int[] intArray4 = new int[] { 1, (byte) -1, (byte) 1, 10 };
        int[] intArray7 = new int[] { (short) -1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 100, (-1));
    }

    @Test
    public void test10720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10720");
        int[] intArray6 = new int[] { (-1), 10, '#', (byte) 10, (byte) 10, 0 };
        int[] intArray9 = new int[] { (short) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) ' ', (int) (byte) 1);
    }

    @Test
    public void test10721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10721");
        int[] intArray2 = new int[] { '4', 1 };
        int[] intArray8 = new int[] { (byte) 10, 0, (byte) -1, 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) '4', (-1));
    }

    @Test
    public void test10722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10722");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (-1), (-1), '4', '4', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) '4', (int) (byte) 10);
    }

    @Test
    public void test10723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10723");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray6 = new int[] { (short) -1, (byte) 100, 'a', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) 'a', (int) (byte) 100);
    }

    @Test
    public void test10724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10724");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) ' ', (int) (byte) 0);
    }

    @Test
    public void test10725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10725");
        int[] intArray3 = new int[] { (short) 100, (short) 0, ' ' };
        int[] intArray10 = new int[] { '#', (-1), (short) -1, (byte) 0, '4', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 0, 0);
    }

    @Test
    public void test10726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10726");
        int[] intArray3 = new int[] { (short) 0, 1, (short) 1 };
        int[] intArray10 = new int[] { 10, '#', (short) 1, (short) -1, '4', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (byte) 0, 0);
    }

    @Test
    public void test10727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10727");
        int[] intArray5 = new int[] { (short) 10, (byte) 0, (byte) -1, (-1), '#' };
        int[] intArray9 = new int[] { (byte) -1, 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 0, 0);
    }

    @Test
    public void test10728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10728");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray5 = new int[] { (short) 10, 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) '4', (int) ' ');
    }

    @Test
    public void test10729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10729");
        int[] intArray6 = new int[] { (byte) 1, (short) 100, (short) 100, (byte) 10, (short) 1, 0 };
        int[] intArray8 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test10730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10730");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) 0, 100, (-1), (byte) 10, (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) -1, (-1));
    }

    @Test
    public void test10731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10731");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray7 = new int[] { (short) 100, (short) 100, (short) 10, 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, 0, (-1));
    }

    @Test
    public void test10732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10732");
        int[] intArray6 = new int[] { 100, 100, 10, 100, (byte) 0, '#' };
        int[] intArray13 = new int[] { (byte) 1, 'a', 0, ' ', (short) 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 0, (int) 'a');
    }

    @Test
    public void test10733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10733");
        int[] intArray6 = new int[] { (short) 10, (-1), (short) -1, (byte) 1, (byte) -1, (byte) 0 };
        int[] intArray12 = new int[] { (short) 100, (byte) -1, 0, '4', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) 100, 1);
    }

    @Test
    public void test10734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10734");
        int[] intArray2 = new int[] { 'a', 1 };
        int[] intArray7 = new int[] { (short) -1, (byte) -1, 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 1, 1);
    }

    @Test
    public void test10735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10735");
        int[] intArray3 = new int[] { 'a', '#', (-1) };
        int[] intArray7 = new int[] { (byte) -1, (byte) 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 10, (int) (byte) -1);
    }

    @Test
    public void test10736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10736");
        int[] intArray1 = new int[] { 1 };
        int[] intArray7 = new int[] { (byte) 100, (short) 10, '#', (byte) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, 1, (int) (short) 1);
    }

    @Test
    public void test10737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10737");
        int[] intArray5 = new int[] { (short) 100, ' ', (byte) 10, (short) -1, (byte) 0 };
        int[] intArray11 = new int[] { 0, '4', (-1), 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) '4', (int) 'a');
    }

    @Test
    public void test10738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10738");
        int[] intArray6 = new int[] { 10, (short) 1, (short) -1, 10, (byte) 100, 10 };
        int[] intArray10 = new int[] { 1, (byte) 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 1, (int) '#');
    }

    @Test
    public void test10739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10739");
        int[] intArray5 = new int[] { (short) -1, 100, (byte) 0, 0, (short) 0 };
        int[] intArray7 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) 100, 0);
    }

    @Test
    public void test10740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10740");
        int[] intArray4 = new int[] { (short) 10, (short) 0, (byte) 10, (byte) 100 };
        int[] intArray8 = new int[] { (short) -1, ' ', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 1, (int) (short) 1);
    }

    @Test
    public void test10741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10741");
        int[] intArray3 = new int[] { (byte) -1, 100, (byte) 100 };
        int[] intArray6 = new int[] { (byte) -1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) 100, (int) (short) 100);
    }

    @Test
    public void test10742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10742");
        int[] intArray6 = new int[] { (-1), (short) 0, 10, (short) 0, (-1), (short) -1 };
        int[] intArray11 = new int[] { 100, (byte) 0, (byte) 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (short) 0, (int) (short) 10);
    }

    @Test
    public void test10743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10743");
        int[] intArray6 = new int[] { '#', (short) 100, '4', ' ', 100, 1 };
        int[] intArray12 = new int[] { ' ', 1, (-1), (-1), (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) 100, (int) ' ');
    }

    @Test
    public void test10744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10744");
        int[] intArray5 = new int[] { ' ', (byte) 100, (short) 0, (short) 100, 100 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) 0, 0);
    }

    @Test
    public void test10745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10745");
        int[] intArray3 = new int[] { (byte) 100, (byte) 0, 0 };
        int[] intArray10 = new int[] { ' ', (-1), '4', (short) -1, '4', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 0, (int) (byte) -1);
    }

    @Test
    public void test10746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10746");
        int[] intArray2 = new int[] { (byte) 0, 'a' };
        int[] intArray8 = new int[] { (byte) 0, (byte) 0, 10, 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) 0, 100);
    }

    @Test
    public void test10747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10747");
        int[] intArray6 = new int[] { (short) 100, (byte) 10, 'a', ' ', (short) 100, (short) -1 };
        int[] intArray8 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 0, (int) (byte) 1);
    }

    @Test
    public void test10748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10748");
        int[] intArray1 = new int[] { 10 };
        int[] intArray5 = new int[] { (short) 10, 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, 100, (int) (short) 10);
    }

    @Test
    public void test10749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10749");
        int[] intArray3 = new int[] { '#', (short) 1, (byte) 10 };
        int[] intArray5 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, 1, (int) (byte) 0);
    }

    @Test
    public void test10750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10750");
        int[] intArray5 = new int[] { (byte) 1, (byte) 0, (byte) 0, (byte) 100, (short) 10 };
        int[] intArray11 = new int[] { (byte) 0, (byte) -1, ' ', (-1), 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) 100, (int) (short) 0);
    }

    @Test
    public void test10751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10751");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 1, (short) 100, (short) 100, 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) 0, (int) (byte) 100);
    }

    @Test
    public void test10752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10752");
        int[] intArray6 = new int[] { (byte) 10, '#', (short) 1, 100, (short) 100, 0 };
        int[] intArray10 = new int[] { 1, '4', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (short) 0, (int) '#');
    }

    @Test
    public void test10753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10753");
        int[] intArray3 = new int[] { 10, (short) 100, 10 };
        int[] intArray9 = new int[] { (byte) 100, (short) 10, (byte) 10, '#', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (byte) 1, (int) (byte) 100);
    }

    @Test
    public void test10754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10754");
        int[] intArray3 = new int[] { (short) 100, 'a', 100 };
        int[] intArray9 = new int[] { 1, (byte) 1, 'a', (short) 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 10, (int) (short) -1);
    }

    @Test
    public void test10755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10755");
        int[] intArray2 = new int[] { (short) 0, ' ' };
        int[] intArray9 = new int[] { (byte) 1, 10, 100, ' ', (short) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 0, 10);
    }

    @Test
    public void test10756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10756");
        int[] intArray3 = new int[] { 10, ' ', (byte) 10 };
        int[] intArray5 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) 10, 10);
    }

    @Test
    public void test10757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10757");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray8 = new int[] { 'a', (byte) 1, (-1), (-1), '4', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test10758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10758");
        int[] intArray2 = new int[] { 10, 100 };
        int[] intArray5 = new int[] { (short) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) -1, 10);
    }

    @Test
    public void test10759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10759");
        int[] intArray4 = new int[] { '#', (short) 10, ' ', (short) -1 };
        int[] intArray11 = new int[] { (byte) 1, 'a', (short) 0, (short) 10, 'a', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (-1), (int) 'a');
    }

    @Test
    public void test10760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10760");
        int[] intArray4 = new int[] { (byte) 100, (short) 10, (byte) 1, (short) 0 };
        int[] intArray9 = new int[] { 0, (byte) 10, (short) 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) 'a', (int) (byte) 10);
    }

    @Test
    public void test10761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10761");
        int[] intArray6 = new int[] { (byte) -1, (short) 1, (byte) 10, 100, (short) -1, (byte) 100 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) 1, 100);
    }

    @Test
    public void test10762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10762");
        int[] intArray5 = new int[] { (byte) -1, 'a', (-1), 0, (short) 0 };
        int[] intArray11 = new int[] { (short) 10, '4', 100, (short) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) 10, (int) (short) 10);
    }

    @Test
    public void test10763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10763");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray6 = new int[] { (-1), (short) -1, '4', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 0, (int) (byte) 10);
    }

    @Test
    public void test10764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10764");
        int[] intArray3 = new int[] { '4', (short) 10, (short) -1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, 0, (int) (short) 100);
    }

    @Test
    public void test10765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10765");
        int[] intArray2 = new int[] { (byte) 10, ' ' };
        int[] intArray6 = new int[] { 10, (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) 10, (int) (short) 100);
    }

    @Test
    public void test10766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10766");
        int[] intArray6 = new int[] { (byte) 100, (byte) -1, (short) 100, 100, ' ', 0 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) 0, 100);
    }

    @Test
    public void test10767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10767");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray8 = new int[] { (short) 0, (short) -1, (byte) 0, (byte) 1, (short) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) '4', (int) (byte) 1);
    }

    @Test
    public void test10768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10768");
        int[] intArray3 = new int[] { (short) 100, (byte) -1, ' ' };
        int[] intArray7 = new int[] { (byte) 0, 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test10769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10769");
        int[] intArray2 = new int[] { ' ', 10 };
        int[] intArray4 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 1, (int) ' ');
    }

    @Test
    public void test10770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10770");
        int[] intArray2 = new int[] { 'a', (byte) 100 };
        int[] intArray4 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 100, (int) (byte) 1);
    }

    @Test
    public void test10771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10771");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { ' ', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (short) -1, 100);
    }

    @Test
    public void test10772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10772");
        int[] intArray6 = new int[] { (short) 0, '4', (short) -1, 1, (byte) 10, (short) 100 };
        int[] intArray13 = new int[] { (byte) 0, (-1), 0, (byte) 1, 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 0, (int) (short) 100);
    }

    @Test
    public void test10773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10773");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 0, ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test10774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10774");
        int[] intArray4 = new int[] { (short) 100, (byte) 10, (short) 0, (-1) };
        int[] intArray6 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 0, (int) '#');
    }

    @Test
    public void test10775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10775");
        int[] intArray2 = new int[] { 10, 1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (-1), (int) (short) 1);
    }

    @Test
    public void test10776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10776");
        int[] intArray3 = new int[] { (-1), (byte) 100, 10 };
        int[] intArray7 = new int[] { (short) 0, (short) 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) 10, (int) (byte) 0);
    }

    @Test
    public void test10777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10777");
        int[] intArray3 = new int[] { 100, (short) 1, (byte) 100 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) 'a', 0);
    }

    @Test
    public void test10778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10778");
        int[] intArray2 = new int[] { 10, (byte) 1 };
        int[] intArray5 = new int[] { (short) 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 10, 0);
    }

    @Test
    public void test10779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10779");
        int[] intArray4 = new int[] { '4', '#', '4', (short) -1 };
        int[] intArray6 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, 0, (int) (short) 10);
    }

    @Test
    public void test10780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10780");
        int[] intArray2 = new int[] { 'a', (short) 1 };
        int[] intArray9 = new int[] { (byte) 100, 100, 1, 100, 'a', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (short) 0, (int) (byte) -1);
    }

    @Test
    public void test10781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10781");
        int[] intArray2 = new int[] { (short) 1, (short) 10 };
        int[] intArray4 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (short) 10, (int) (byte) 10);
    }

    @Test
    public void test10782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10782");
        int[] intArray1 = new int[] { 0 };
        int[] intArray3 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) 0, (int) '4');
    }

    @Test
    public void test10783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10783");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (-1), (-1));
    }

    @Test
    public void test10784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10784");
        int[] intArray5 = new int[] { (byte) 0, (short) 0, (-1), 10, (byte) 100 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) 100, (int) (short) 0);
    }

    @Test
    public void test10785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10785");
        int[] intArray2 = new int[] { 1, (byte) 100 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) 0, (int) '4');
    }

    @Test
    public void test10786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10786");
        int[] intArray3 = new int[] { 100, (short) -1, ' ' };
        int[] intArray8 = new int[] { (byte) 10, 1, 'a', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 100, (int) (byte) 100);
    }

    @Test
    public void test10787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10787");
        int[] intArray5 = new int[] { '#', 'a', (byte) 1, (-1), 'a' };
        int[] intArray8 = new int[] { 'a', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) '#', (int) (short) -1);
    }

    @Test
    public void test10788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10788");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (short) -1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (byte) 0, 1);
    }

    @Test
    public void test10789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10789");
        int[] intArray3 = new int[] { 'a', (short) 0, (-1) };
        int[] intArray7 = new int[] { (byte) -1, 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 0, (int) (byte) -1);
    }

    @Test
    public void test10790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10790");
        int[] intArray6 = new int[] { (short) 10, ' ', (short) 10, (short) 1, '#', (short) 100 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test10791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10791");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray5 = new int[] { 100, (byte) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (byte) 100, 0);
    }

    @Test
    public void test10792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10792");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 0 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test10793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10793");
        int[] intArray3 = new int[] { 10, (byte) 100, '4' };
        int[] intArray10 = new int[] { (short) -1, 'a', 0, 10, 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 10, (int) (byte) -1);
    }

    @Test
    public void test10794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10794");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 100, (short) 10, (byte) 1, 10, (short) 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, 100, (int) (short) 100);
    }

    @Test
    public void test10795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10795");
        int[] intArray5 = new int[] { (short) 1, (byte) 10, (byte) 100, (-1), (short) 1 };
        int[] intArray8 = new int[] { '#', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) 1, 1);
    }

    @Test
    public void test10796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10796");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray6 = new int[] { 1, '#', 'a', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 10, (int) (short) -1);
    }

    @Test
    public void test10797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10797");
        int[] intArray6 = new int[] { '#', (-1), (short) 100, (-1), (byte) 100, (short) -1 };
        int[] intArray11 = new int[] { (short) -1, (short) 10, ' ', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (byte) 10, (int) '#');
    }

    @Test
    public void test10798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10798");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray8 = new int[] { 1, '4', 0, (byte) 0, 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) 0, (int) (short) -1);
    }

    @Test
    public void test10799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10799");
        int[] intArray4 = new int[] { 'a', ' ', 'a', 'a' };
        int[] intArray9 = new int[] { 1, 1, 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) '4', (int) (short) 0);
    }

    @Test
    public void test10800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10800");
        int[] intArray3 = new int[] { (short) 10, 'a', (short) 100 };
        int[] intArray8 = new int[] { 0, 100, (-1), (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (byte) 100, (int) (short) 0);
    }

    @Test
    public void test10801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10801");
        int[] intArray5 = new int[] { 100, (short) 0, 1, 10, '4' };
        int[] intArray9 = new int[] { 'a', (short) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 100, 10);
    }

    @Test
    public void test10802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10802");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 0, (short) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) 10, (int) 'a');
    }

    @Test
    public void test10803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10803");
        int[] intArray4 = new int[] { (byte) -1, ' ', (short) 10, ' ' };
        int[] intArray6 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (short) 10, 0);
    }

    @Test
    public void test10804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10804");
        int[] intArray2 = new int[] { 1, 0 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 0, 0);
    }

    @Test
    public void test10805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10805");
        int[] intArray6 = new int[] { (short) 1, 0, (byte) -1, ' ', (byte) 10, 0 };
        int[] intArray9 = new int[] { (-1), (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 100, (int) ' ');
    }

    @Test
    public void test10806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10806");
        int[] intArray4 = new int[] { 0, 'a', 0, (byte) -1 };
        int[] intArray10 = new int[] { (short) 10, (byte) 0, (short) 100, (byte) -1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (byte) 1, (int) ' ');
    }

    @Test
    public void test10807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10807");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 10, (byte) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, 10, 0);
    }

    @Test
    public void test10808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10808");
        int[] intArray6 = new int[] { (byte) 1, 100, 1, 10, (byte) -1, '#' };
        int[] intArray12 = new int[] { (short) 1, (short) 1, (short) 1, (byte) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (byte) 100, (-1));
    }

    @Test
    public void test10809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10809");
        int[] intArray1 = new int[] { '#' };
        int[] intArray4 = new int[] { (short) -1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, 1, (int) (short) 1);
    }

    @Test
    public void test10810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10810");
        int[] intArray5 = new int[] { (short) 1, 100, (byte) 0, (short) 10, (byte) 0 };
        int[] intArray8 = new int[] { ' ', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) ' ', 100);
    }

    @Test
    public void test10811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10811");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (short) -1, 0);
    }

    @Test
    public void test10812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10812");
        int[] intArray3 = new int[] { 1, (byte) -1, (short) -1 };
        int[] intArray9 = new int[] { '4', (short) 1, '4', (short) 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) 'a', 0);
    }

    @Test
    public void test10813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10813");
        int[] intArray4 = new int[] { (-1), (-1), '4', 10 };
        int[] intArray7 = new int[] { (byte) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) ' ', (int) '#');
    }

    @Test
    public void test10814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10814");
        int[] intArray3 = new int[] { 'a', '4', (short) 100 };
        int[] intArray9 = new int[] { (short) -1, ' ', (-1), (byte) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test10815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10815");
        int[] intArray4 = new int[] { (byte) 0, '4', 'a', (byte) 1 };
        int[] intArray7 = new int[] { (byte) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) 100, (int) (byte) -1);
    }

    @Test
    public void test10816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10816");
        int[] intArray4 = new int[] { (short) 1, (byte) 10, ' ', (byte) -1 };
        int[] intArray10 = new int[] { (byte) 100, (short) -1, 'a', (byte) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test10817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10817");
        int[] intArray4 = new int[] { (short) 100, '4', (short) 0, (short) -1 };
        int[] intArray11 = new int[] { (byte) 10, (byte) 0, (short) 0, (short) -1, (byte) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) -1, (int) (short) 1);
    }

    @Test
    public void test10818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10818");
        int[] intArray4 = new int[] { (short) 10, (short) 10, '#', 100 };
        int[] intArray6 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 100, 0);
    }

    @Test
    public void test10819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10819");
        int[] intArray4 = new int[] { (short) 100, 'a', (byte) 1, 0 };
        int[] intArray10 = new int[] { 100, (byte) -1, 1, (short) 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (byte) 1, 0);
    }

    @Test
    public void test10820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10820");
        int[] intArray2 = new int[] { 0, (byte) 100 };
        int[] intArray6 = new int[] { '#', 'a', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) '#', (int) '4');
    }

    @Test
    public void test10821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10821");
        int[] intArray5 = new int[] { 0, (short) 100, 1, (short) 100, (short) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, 1, (short) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) 10, (int) (byte) 100);
    }

    @Test
    public void test10822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10822");
        int[] intArray3 = new int[] { (short) 1, 1, 1 };
        int[] intArray7 = new int[] { '#', (short) 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 0, (int) (short) 10);
    }

    @Test
    public void test10823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10823");
        int[] intArray4 = new int[] { (byte) 1, (short) 1, 10, (short) -1 };
        int[] intArray8 = new int[] { 1, 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) 100, (int) (byte) 10);
    }

    @Test
    public void test10824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10824");
        int[] intArray2 = new int[] { ' ', (byte) 100 };
        int[] intArray6 = new int[] { '#', 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 1, 10);
    }

    @Test
    public void test10825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10825");
        int[] intArray6 = new int[] { 1, (short) 0, 'a', 'a', (byte) 100, (short) -1 };
        int[] intArray8 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) 'a', (int) ' ');
    }

    @Test
    public void test10826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10826");
        int[] intArray5 = new int[] { (byte) 10, (-1), (byte) 1, (byte) 10, (short) 10 };
        int[] intArray11 = new int[] { (byte) 1, (short) 1, (short) 10, (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) -1, (int) (short) 100);
    }

    @Test
    public void test10827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10827");
        int[] intArray1 = new int[] { '4' };
        int[] intArray8 = new int[] { (short) 1, (short) 1, 10, (byte) 0, 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 1, (int) (byte) -1);
    }

    @Test
    public void test10828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10828");
        int[] intArray6 = new int[] { ' ', (short) 0, 0, (short) 100, '#', 1 };
        int[] intArray12 = new int[] { ' ', (short) 1, (byte) 100, (short) -1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) 1, (int) '#');
    }

    @Test
    public void test10829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10829");
        int[] intArray5 = new int[] { (byte) -1, '4', 10, 100, (short) 10 };
        int[] intArray8 = new int[] { (byte) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) -1, (-1));
    }

    @Test
    public void test10830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10830");
        int[] intArray5 = new int[] { (-1), (byte) 10, (byte) 100, (short) 10, 1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 100, (int) (short) 10);
    }

    @Test
    public void test10831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10831");
        int[] intArray5 = new int[] { (byte) 100, (byte) 100, (short) 100, 100, ' ' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 1, (int) (short) 1);
    }

    @Test
    public void test10832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10832");
        int[] intArray6 = new int[] { (byte) 10, 0, '#', (byte) 0, 10, '#' };
        int[] intArray9 = new int[] { (short) 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 10, (int) (byte) 100);
    }

    @Test
    public void test10833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10833");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 100, (int) (byte) 10);
    }

    @Test
    public void test10834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10834");
        int[] intArray2 = new int[] { (short) 100, (short) 1 };
        int[] intArray5 = new int[] { (byte) 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (-1), (int) (byte) 10);
    }

    @Test
    public void test10835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10835");
        int[] intArray3 = new int[] { '4', (byte) -1, (short) -1 };
        int[] intArray7 = new int[] { ' ', (short) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) -1, (-1));
    }

    @Test
    public void test10836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10836");
        int[] intArray4 = new int[] { (byte) 100, 10, 0, ' ' };
        int[] intArray6 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) '#', 0);
    }

    @Test
    public void test10837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10837");
        int[] intArray2 = new int[] { '#', 10 };
        int[] intArray6 = new int[] { (short) 100, (byte) 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (short) 0, (int) 'a');
    }

    @Test
    public void test10838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10838");
        int[] intArray6 = new int[] { (byte) 0, (short) -1, 100, (byte) 10, 100, '#' };
        int[] intArray13 = new int[] { (byte) 1, (short) 100, (byte) 1, 'a', 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 0, (int) (short) 10);
    }

    @Test
    public void test10839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10839");
        int[] intArray4 = new int[] { (short) 0, (byte) 10, (-1), (byte) 0 };
        int[] intArray8 = new int[] { 1, (short) 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (-1), (int) 'a');
    }

    @Test
    public void test10840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10840");
        int[] intArray6 = new int[] { '4', 10, (short) 0, (byte) 100, '4', 'a' };
        int[] intArray11 = new int[] { 100, (short) 10, 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (byte) 1, (-1));
    }

    @Test
    public void test10841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10841");
        int[] intArray2 = new int[] { '#', 100 };
        int[] intArray4 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (-1), 1);
    }

    @Test
    public void test10842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10842");
        int[] intArray2 = new int[] { (byte) 100, (byte) 0 };
        int[] intArray5 = new int[] { 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (byte) -1, (int) (byte) 1);
    }

    @Test
    public void test10843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10843");
        int[] intArray1 = new int[] { 10 };
        int[] intArray4 = new int[] { ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 0, (int) '#');
    }

    @Test
    public void test10844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10844");
        int[] intArray2 = new int[] { ' ', (short) 10 };
        int[] intArray8 = new int[] { (-1), ' ', (byte) 100, (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (byte) 10, (int) (short) 100);
    }

    @Test
    public void test10845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10845");
        int[] intArray4 = new int[] { (short) 0, (short) 0, 1, (short) -1 };
        int[] intArray6 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, 0, 10);
    }

    @Test
    public void test10846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10846");
        int[] intArray2 = new int[] { 10, (short) 10 };
        int[] intArray9 = new int[] { '4', ' ', (byte) 100, (short) 1, (byte) 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 1, (int) ' ');
    }

    @Test
    public void test10847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10847");
        int[] intArray2 = new int[] { '4', (byte) 100 };
        int[] intArray9 = new int[] { (byte) 100, (short) 100, (short) 1, '4', (-1), (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (byte) 1, (int) (short) 100);
    }

    @Test
    public void test10848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10848");
        int[] intArray2 = new int[] { 100, (short) -1 };
        int[] intArray5 = new int[] { 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) '4', (int) (byte) 10);
    }

    @Test
    public void test10849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10849");
        int[] intArray3 = new int[] { '4', (short) 0, (short) 100 };
        int[] intArray7 = new int[] { (byte) 1, (-1), (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 10, 0);
    }

    @Test
    public void test10850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10850");
        int[] intArray5 = new int[] { (short) 10, (byte) 10, (short) 1, (byte) -1, 0 };
        int[] intArray8 = new int[] { (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 0, (int) (byte) -1);
    }

    @Test
    public void test10851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10851");
        int[] intArray4 = new int[] { 1, '4', (short) 10, (byte) -1 };
        int[] intArray11 = new int[] { (short) 10, 10, 1, '4', (short) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) 100, (int) (byte) 0);
    }

    @Test
    public void test10852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10852");
        int[] intArray1 = new int[] { '4' };
        int[] intArray7 = new int[] { 10, 0, (byte) 0, (short) 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) 10, 100);
    }

    @Test
    public void test10853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10853");
        int[] intArray2 = new int[] { (byte) 1, (short) -1 };
        int[] intArray8 = new int[] { (byte) -1, '#', (short) 10, (short) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 0, (int) (byte) 0);
    }

    @Test
    public void test10854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10854");
        int[] intArray1 = new int[] { 10 };
        int[] intArray5 = new int[] { (short) 100, (byte) 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (byte) -1, (int) (short) 1);
    }

    @Test
    public void test10855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10855");
        int[] intArray1 = new int[] { '#' };
        int[] intArray8 = new int[] { 1, (short) 1, ' ', (byte) 10, (short) 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 10, 100);
    }

    @Test
    public void test10856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10856");
        int[] intArray4 = new int[] { (short) 0, 1, (byte) 10, (byte) 10 };
        int[] intArray10 = new int[] { 1, ' ', 'a', (short) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, 10, (int) (byte) 10);
    }

    @Test
    public void test10857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10857");
        int[] intArray2 = new int[] { (byte) 1, (byte) 100 };
        int[] intArray7 = new int[] { (byte) 100, ' ', ' ', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (short) 100, (int) (short) 0);
    }

    @Test
    public void test10858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10858");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) 10, (int) (short) 1);
    }

    @Test
    public void test10859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10859");
        int[] intArray5 = new int[] { (short) 100, '4', (byte) 10, '4', 1 };
        int[] intArray10 = new int[] { 1, (short) 0, '#', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (-1), 0);
    }

    @Test
    public void test10860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10860");
        int[] intArray5 = new int[] { (-1), (-1), 1, (byte) 0, (byte) 0 };
        int[] intArray12 = new int[] { (byte) 100, (short) 1, 1, 0, (byte) 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) 0, (int) (byte) 1);
    }

    @Test
    public void test10861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10861");
        int[] intArray5 = new int[] { 1, (byte) -1, 10, (byte) 0, ' ' };
        int[] intArray11 = new int[] { ' ', (short) 10, 'a', 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 0, 0);
    }

    @Test
    public void test10862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10862");
        int[] intArray4 = new int[] { (byte) 10, 'a', 'a', (byte) 10 };
        int[] intArray9 = new int[] { (short) 10, (short) 1, 'a', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) 'a', (int) (byte) 1);
    }

    @Test
    public void test10863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10863");
        int[] intArray3 = new int[] { (short) 100, (short) 0, (short) 100 };
        int[] intArray9 = new int[] { (byte) 0, (byte) 100, (short) 1, 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (-1), (int) (byte) 0);
    }

    @Test
    public void test10864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10864");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { '4', (short) 0, (byte) 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 10, (int) '#');
    }

    @Test
    public void test10865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10865");
        int[] intArray5 = new int[] { (short) 10, 'a', '#', 1, 100 };
        int[] intArray9 = new int[] { 10, 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 10, (int) '#');
    }

    @Test
    public void test10866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10866");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 0, 1, (short) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 0, 100);
    }

    @Test
    public void test10867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10867");
        int[] intArray6 = new int[] { 10, 0, (byte) -1, 100, 0, (byte) 100 };
        int[] intArray8 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) '4', (int) (short) 0);
    }

    @Test
    public void test10868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10868");
        int[] intArray2 = new int[] { (byte) -1, 100 };
        int[] intArray9 = new int[] { (short) 1, (byte) 100, 0, (byte) -1, (-1), 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (byte) 10, (int) 'a');
    }

    @Test
    public void test10869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10869");
        int[] intArray2 = new int[] { 'a', '4' };
        int[] intArray6 = new int[] { 100, 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 100, (int) ' ');
    }

    @Test
    public void test10870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10870");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) ' ', (int) (short) -1);
    }

    @Test
    public void test10871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10871");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray6 = new int[] { ' ', (short) 0, 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (-1), 100);
    }

    @Test
    public void test10872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10872");
        int[] intArray2 = new int[] { (short) -1, (short) 1 };
        int[] intArray4 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) 'a', 100);
    }

    @Test
    public void test10873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10873");
        int[] intArray4 = new int[] { 1, (short) 10, '4', 'a' };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (short) -1, 0);
    }

    @Test
    public void test10874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10874");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray7 = new int[] { (byte) 100, (byte) 1, (byte) 100, (short) -1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) -1, 0);
    }

    @Test
    public void test10875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10875");
        int[] intArray6 = new int[] { (byte) 1, (byte) 1, (short) 1, (-1), (-1), 0 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) 0, (int) (byte) 10);
    }

    @Test
    public void test10876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10876");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (byte) 1, (int) (short) 1);
    }

    @Test
    public void test10877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10877");
        int[] intArray4 = new int[] { 10, '4', 0, (short) 100 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, 100, 0);
    }

    @Test
    public void test10878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10878");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 1, (byte) -1, (byte) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (-1), (int) (short) 10);
    }

    @Test
    public void test10879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10879");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray5 = new int[] { '#', (short) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) 100, 1);
    }

    @Test
    public void test10880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10880");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray7 = new int[] { (short) -1, (short) 1, (short) 1, (short) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test10881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10881");
        int[] intArray4 = new int[] { 10, (short) 1, (short) 0, (byte) 100 };
        int[] intArray11 = new int[] { '4', (short) 10, 'a', (byte) 10, '4', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) '4', (int) (byte) -1);
    }

    @Test
    public void test10882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10882");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (-1), 100);
    }

    @Test
    public void test10883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10883");
        int[] intArray5 = new int[] { (byte) 100, 100, '#', 'a', ' ' };
        int[] intArray9 = new int[] { ' ', 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (-1), (int) '#');
    }

    @Test
    public void test10884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10884");
        int[] intArray6 = new int[] { (short) 1, (short) -1, 1, 100, (short) 0, '4' };
        int[] intArray13 = new int[] { (short) 100, 0, (-1), 100, (short) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 100, 1);
    }

    @Test
    public void test10885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10885");
        int[] intArray4 = new int[] { 'a', (short) 100, (byte) 10, 100 };
        int[] intArray7 = new int[] { ' ', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 0, (int) 'a');
    }

    @Test
    public void test10886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10886");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray5 = new int[] { 100, (byte) 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) 10, (int) (short) 10);
    }

    @Test
    public void test10887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10887");
        int[] intArray3 = new int[] { (-1), 1, (short) 100 };
        int[] intArray8 = new int[] { 1, (short) 100, (-1), (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (byte) 100, (int) (byte) 100);
    }

    @Test
    public void test10888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10888");
        int[] intArray3 = new int[] { (byte) 10, (byte) 100, (short) 1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) 10, 0);
    }

    @Test
    public void test10889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10889");
        int[] intArray5 = new int[] { (byte) -1, (short) 10, (-1), (short) 1, (byte) 10 };
        int[] intArray7 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) '#', (int) (short) 1);
    }

    @Test
    public void test10890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10890");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) '4', (int) (short) -1);
    }

    @Test
    public void test10891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10891");
        int[] intArray2 = new int[] { '4', '4' };
        int[] intArray8 = new int[] { (-1), 100, (short) 0, (byte) 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (byte) 1, (int) ' ');
    }

    @Test
    public void test10892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10892");
        int[] intArray3 = new int[] { '#', (short) 100, '#' };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, 10, 1);
    }

    @Test
    public void test10893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10893");
        int[] intArray5 = new int[] { 'a', (byte) 0, (byte) -1, (short) 0, (short) 10 };
        int[] intArray7 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) 100, (int) '4');
    }

    @Test
    public void test10894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10894");
        int[] intArray3 = new int[] { (short) 100, (byte) 10, (short) 100 };
        int[] intArray6 = new int[] { 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) 'a', (-1));
    }

    @Test
    public void test10895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10895");
        int[] intArray5 = new int[] { (-1), (byte) 100, 'a', (short) -1, '#' };
        int[] intArray10 = new int[] { '4', (byte) 10, (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) ' ', (int) (byte) 1);
    }

    @Test
    public void test10896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10896");
        int[] intArray3 = new int[] { 1, (byte) 1, (short) 100 };
        int[] intArray5 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) 'a', (int) (short) 100);
    }

    @Test
    public void test10897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10897");
        int[] intArray2 = new int[] { 0, ' ' };
        int[] intArray5 = new int[] { 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 100, 100);
    }

    @Test
    public void test10898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10898");
        int[] intArray1 = new int[] { 100 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) '#', 0);
    }

    @Test
    public void test10899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10899");
        int[] intArray6 = new int[] { (short) 1, (short) 0, (byte) 1, (byte) 10, '4', (short) 10 };
        int[] intArray13 = new int[] { (short) 10, (short) 10, (short) 100, (byte) 100, (short) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (-1), (int) (byte) 0);
    }

    @Test
    public void test10900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10900");
        int[] intArray1 = new int[] { '#' };
        int[] intArray5 = new int[] { 100, '#', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, 0, (int) (byte) 10);
    }

    @Test
    public void test10901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10901");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray3 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) '4', (int) (short) 10);
    }

    @Test
    public void test10902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10902");
        int[] intArray5 = new int[] { (byte) 0, 'a', (byte) 0, (byte) 0, (byte) 0 };
        int[] intArray10 = new int[] { (short) 1, 1, (short) 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 1, 1);
    }

    @Test
    public void test10903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10903");
        int[] intArray6 = new int[] { 'a', '4', (byte) 10, (byte) 1, (byte) 1, (short) 10 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) 100, (int) 'a');
    }

    @Test
    public void test10904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10904");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) '#', (int) (byte) 100);
    }

    @Test
    public void test10905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10905");
        int[] intArray4 = new int[] { 0, 'a', (short) 1, (short) -1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (short) 100, (-1));
    }

    @Test
    public void test10906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10906");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray6 = new int[] { '#', ' ', (short) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) ' ', (int) (byte) 10);
    }

    @Test
    public void test10907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10907");
        int[] intArray3 = new int[] { (byte) 10, 100, '4' };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) 10, (int) (short) 10);
    }

    @Test
    public void test10908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10908");
        int[] intArray6 = new int[] { (byte) 100, 1, 0, (short) -1, (byte) 100, (byte) 10 };
        int[] intArray10 = new int[] { ' ', '4', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) 100, 0);
    }

    @Test
    public void test10909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10909");
        int[] intArray3 = new int[] { (byte) 10, 1, (short) 1 };
        int[] intArray9 = new int[] { (byte) -1, 'a', (byte) 100, (short) 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 100, (int) (byte) 10);
    }

    @Test
    public void test10910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10910");
        int[] intArray3 = new int[] { 100, 'a', '4' };
        int[] intArray9 = new int[] { (short) -1, '#', 'a', (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (short) -1, 0);
    }

    @Test
    public void test10911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10911");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 100, (int) '4');
    }

    @Test
    public void test10912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10912");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 0, (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, 0, 1);
    }

    @Test
    public void test10913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10913");
        int[] intArray5 = new int[] { (short) 10, '#', (byte) 0, (short) -1, 0 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test10914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10914");
        int[] intArray3 = new int[] { (short) 10, (byte) 10, (short) 100 };
        int[] intArray9 = new int[] { (-1), (byte) 0, '4', '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (-1), (int) (short) -1);
    }

    @Test
    public void test10915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10915");
        int[] intArray2 = new int[] { (short) 0, 100 };
        int[] intArray8 = new int[] { (short) 1, (byte) 10, (short) 10, ' ', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (byte) -1, 0);
    }

    @Test
    public void test10916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10916");
        int[] intArray4 = new int[] { '#', '#', (short) 10, (short) 0 };
        int[] intArray6 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, 0, (int) (byte) 100);
    }

    @Test
    public void test10917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10917");
        int[] intArray6 = new int[] { (short) 10, (byte) 1, 100, 1, (-1), (short) -1 };
        int[] intArray11 = new int[] { (byte) 10, (short) -1, 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (byte) 10, (-1));
    }

    @Test
    public void test10918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10918");
        int[] intArray4 = new int[] { (short) 1, (byte) 1, ' ', ' ' };
        int[] intArray10 = new int[] { (-1), (short) -1, '4', 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test10919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10919");
        int[] intArray3 = new int[] { '4', ' ', (byte) 10 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (byte) 100, (int) (short) -1);
    }

    @Test
    public void test10920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10920");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) -1, (byte) 0, 1, (byte) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) 1, (int) (byte) 0);
    }

    @Test
    public void test10921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10921");
        int[] intArray2 = new int[] { (-1), '#' };
        int[] intArray8 = new int[] { '#', (byte) -1, (byte) 1, (short) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) '#', (int) (byte) 0);
    }

    @Test
    public void test10922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10922");
        int[] intArray3 = new int[] { (short) -1, 100, 0 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (-1), (int) ' ');
    }

    @Test
    public void test10923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10923");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray3 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, 0, (int) (short) 0);
    }

    @Test
    public void test10924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10924");
        int[] intArray2 = new int[] { '4', (short) 100 };
        int[] intArray4 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (byte) 0, (int) (short) -1);
    }

    @Test
    public void test10925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10925");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (-1), (int) '4');
    }

    @Test
    public void test10926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10926");
        int[] intArray4 = new int[] { (short) 0, (byte) 100, '#', (byte) -1 };
        int[] intArray7 = new int[] { 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) 0, (int) (byte) 100);
    }

    @Test
    public void test10927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10927");
        int[] intArray2 = new int[] { (short) 0, (short) 100 };
        int[] intArray5 = new int[] { (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (byte) 10, (int) (short) 0);
    }

    @Test
    public void test10928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10928");
        int[] intArray3 = new int[] { (short) -1, (byte) -1, (byte) 0 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, 100, (int) (short) 1);
    }

    @Test
    public void test10929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10929");
        int[] intArray5 = new int[] { (short) 0, 100, 0, 'a', 10 };
        int[] intArray11 = new int[] { (-1), (byte) 0, (byte) 100, 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 100, (int) '#');
    }

    @Test
    public void test10930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10930");
        int[] intArray2 = new int[] { (-1), 'a' };
        int[] intArray4 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (byte) 0, 100);
    }

    @Test
    public void test10931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10931");
        int[] intArray3 = new int[] { 100, 1, 100 };
        int[] intArray8 = new int[] { 100, 0, (-1), 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) ' ', (int) (short) -1);
    }

    @Test
    public void test10932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10932");
        int[] intArray3 = new int[] { (short) 1, (byte) 0, ' ' };
        int[] intArray9 = new int[] { (short) 1, 0, (byte) 0, 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) '#', (int) (short) -1);
    }

    @Test
    public void test10933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10933");
        int[] intArray5 = new int[] { (byte) 1, (-1), (byte) 10, (byte) 0, (byte) -1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 10, (int) (byte) 10);
    }

    @Test
    public void test10934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10934");
        int[] intArray2 = new int[] { 10, (byte) 100 };
        int[] intArray8 = new int[] { (short) 10, (byte) 10, (byte) 10, (short) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (byte) -1, (int) (byte) 100);
    }

    @Test
    public void test10935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10935");
        int[] intArray2 = new int[] { ' ', ' ' };
        int[] intArray9 = new int[] { (short) 100, (short) 100, 10, (short) -1, (short) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (byte) 0, (int) '4');
    }

    @Test
    public void test10936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10936");
        int[] intArray3 = new int[] { 1, 'a', (byte) 10 };
        int[] intArray10 = new int[] { (short) 10, 'a', (-1), 10, 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) '#', (int) (short) 10);
    }

    @Test
    public void test10937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10937");
        int[] intArray3 = new int[] { 0, (short) 1, (byte) -1 };
        int[] intArray8 = new int[] { '#', (short) 10, '#', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (short) 0, (int) (byte) 100);
    }

    @Test
    public void test10938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10938");
        int[] intArray4 = new int[] { 10, (short) -1, 0, 1 };
        int[] intArray11 = new int[] { (byte) 10, (-1), 1, (byte) 1, (byte) -1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, 100, (int) (short) 10);
    }

    @Test
    public void test10939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10939");
        int[] intArray2 = new int[] { 10, (short) 10 };
        int[] intArray6 = new int[] { 10, (byte) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 0, (int) (byte) 100);
    }

    @Test
    public void test10940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10940");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 100, (short) 100, '#', '4', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) 'a', 10);
    }

    @Test
    public void test10941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10941");
        int[] intArray6 = new int[] { (byte) 1, (byte) -1, (byte) -1, (short) -1, '#', (byte) 100 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) ' ', (int) ' ');
    }

    @Test
    public void test10942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10942");
        int[] intArray6 = new int[] { 0, 10, (short) 100, 1, (short) 0, (byte) 10 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, 10, (int) '4');
    }

    @Test
    public void test10943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10943");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 0, ' ', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, 1, 10);
    }

    @Test
    public void test10944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10944");
        int[] intArray4 = new int[] { (byte) -1, (short) -1, (short) 100, (short) 100 };
        int[] intArray8 = new int[] { (short) 10, (byte) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 100, (int) (byte) 100);
    }

    @Test
    public void test10945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10945");
        int[] intArray4 = new int[] { (short) 10, ' ', 10, '#' };
        int[] intArray7 = new int[] { (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) 100, (int) (byte) 10);
    }

    @Test
    public void test10946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10946");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test10947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10947");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (-1), (int) ' ');
    }

    @Test
    public void test10948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10948");
        int[] intArray6 = new int[] { '4', (byte) 0, (byte) 100, '#', (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) '4', 0);
    }

    @Test
    public void test10949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10949");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray6 = new int[] { (short) -1, (byte) 0, (-1), (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (byte) -1, (int) (short) 10);
    }

    @Test
    public void test10950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10950");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (-1), (short) 10, 100, 100, (byte) 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) 'a', (int) '4');
    }

    @Test
    public void test10951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10951");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray3 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, 0, (int) (byte) -1);
    }

    @Test
    public void test10952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10952");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray8 = new int[] { (byte) 10, (byte) 100, (byte) 100, (short) 0, (byte) 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 10, 0);
    }

    @Test
    public void test10953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10953");
        int[] intArray3 = new int[] { 'a', 1, (short) 1 };
        int[] intArray7 = new int[] { 100, 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) 100, 100);
    }

    @Test
    public void test10954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10954");
        int[] intArray4 = new int[] { (short) -1, 'a', 1, 100 };
        int[] intArray9 = new int[] { 1, (short) 10, 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (byte) 0, (int) ' ');
    }

    @Test
    public void test10955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10955");
        int[] intArray6 = new int[] { (short) 0, (short) -1, '4', (byte) 1, (byte) 10, 'a' };
        int[] intArray13 = new int[] { (short) -1, (short) 0, 0, '#', (byte) 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 0, 0);
    }

    @Test
    public void test10956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10956");
        int[] intArray2 = new int[] { (short) -1, (byte) -1 };
        int[] intArray5 = new int[] { (byte) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 100, (int) (short) 100);
    }

    @Test
    public void test10957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10957");
        int[] intArray5 = new int[] { (byte) -1, (short) 10, 1, (byte) 100, (-1) };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) ' ', 10);
    }

    @Test
    public void test10958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10958");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray8 = new int[] { (byte) 1, (byte) -1, 10, (short) 1, (-1), (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (-1), (int) (byte) -1);
    }

    @Test
    public void test10959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10959");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 0, (int) (byte) -1);
    }

    @Test
    public void test10960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10960");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) 100, 100, (byte) -1, 10, (byte) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) -1, (int) (short) -1);
    }

    @Test
    public void test10961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10961");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) -1, 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) -1, (int) (byte) 10);
    }

    @Test
    public void test10962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10962");
        int[] intArray4 = new int[] { 1, '4', (byte) 1, 'a' };
        int[] intArray6 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 100, (int) (byte) 100);
    }

    @Test
    public void test10963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10963");
        int[] intArray5 = new int[] { '#', ' ', (short) 0, '4', (short) 100 };
        int[] intArray11 = new int[] { 'a', 10, ' ', 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) 100, (int) '#');
    }

    @Test
    public void test10964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10964");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) 100, '#', (short) -1, 0, '4', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test10965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10965");
        int[] intArray3 = new int[] { 100, (-1), (byte) 100 };
        int[] intArray5 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, 10, (int) 'a');
    }

    @Test
    public void test10966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10966");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray8 = new int[] { (short) -1, (short) 100, (byte) 1, (short) 100, ' ', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) 100, (int) (short) -1);
    }

    @Test
    public void test10967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10967");
        int[] intArray6 = new int[] { (byte) 0, (byte) -1, 100, 1, '4', (short) 10 };
        int[] intArray8 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 10, (int) (byte) 100);
    }

    @Test
    public void test10968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10968");
        int[] intArray6 = new int[] { 'a', (byte) 0, 1, (short) 10, (-1), 0 };
        int[] intArray10 = new int[] { 'a', (byte) 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (short) 0, 0);
    }

    @Test
    public void test10969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10969");
        int[] intArray5 = new int[] { (short) -1, (-1), 100, (short) 0, '#' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 0, (int) (short) 10);
    }

    @Test
    public void test10970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10970");
        int[] intArray5 = new int[] { (short) 0, 100, 0, 1, 'a' };
        int[] intArray8 = new int[] { (byte) 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) 10, (int) 'a');
    }

    @Test
    public void test10971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10971");
        int[] intArray2 = new int[] { (short) -1, (short) 100 };
        int[] intArray7 = new int[] { (byte) 1, 0, 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 10, (-1));
    }

    @Test
    public void test10972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10972");
        int[] intArray3 = new int[] { (byte) 0, 10, 1 };
        int[] intArray9 = new int[] { (short) 0, '#', ' ', 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test10973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10973");
        int[] intArray6 = new int[] { (short) 1, 100, ' ', (short) 0, 10, (short) 1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) -1, (int) (byte) 10);
    }

    @Test
    public void test10974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10974");
        int[] intArray5 = new int[] { (short) 1, (-1), '#', (byte) 0, (-1) };
        int[] intArray11 = new int[] { 100, '#', 0, (byte) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) 'a', (int) (byte) 0);
    }

    @Test
    public void test10975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10975");
        int[] intArray4 = new int[] { (short) 0, '#', (byte) 0, (byte) 10 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (byte) 100, 100);
    }

    @Test
    public void test10976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10976");
        int[] intArray6 = new int[] { '#', 0, '#', (short) 100, (short) 1, ' ' };
        int[] intArray8 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) '4', (int) (byte) 100);
    }

    @Test
    public void test10977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10977");
        int[] intArray1 = new int[] { '#' };
        int[] intArray7 = new int[] { (short) 100, '4', (short) 100, 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) 'a', (int) ' ');
    }

    @Test
    public void test10978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10978");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray7 = new int[] { (-1), (short) 100, 100, (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test10979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10979");
        int[] intArray3 = new int[] { ' ', 1, 1 };
        int[] intArray6 = new int[] { (short) 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) 10, (int) (short) 0);
    }

    @Test
    public void test10980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10980");
        int[] intArray6 = new int[] { '#', (short) 10, (short) -1, ' ', 0, 0 };
        int[] intArray11 = new int[] { (short) -1, '#', '#', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 100, (int) (byte) 1);
    }

    @Test
    public void test10981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10981");
        int[] intArray5 = new int[] { 10, (byte) 0, (short) 100, 'a', (byte) 0 };
        int[] intArray12 = new int[] { (short) 100, (-1), 100, (short) 100, (byte) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) '#', 0);
    }

    @Test
    public void test10982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10982");
        int[] intArray6 = new int[] { (byte) -1, (byte) 10, (-1), (short) 100, 'a', (byte) 1 };
        int[] intArray8 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (byte) -1, (int) (short) 10);
    }

    @Test
    public void test10983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10983");
        int[] intArray6 = new int[] { 10, 10, 1, (short) -1, 0, ' ' };
        int[] intArray8 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) '4', (int) (byte) 100);
    }

    @Test
    public void test10984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10984");
        int[] intArray4 = new int[] { 'a', 0, (-1), ' ' };
        int[] intArray8 = new int[] { '4', (short) -1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) -1, 0);
    }

    @Test
    public void test10985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10985");
        int[] intArray3 = new int[] { ' ', (byte) 10, ' ' };
        int[] intArray9 = new int[] { (byte) 1, (-1), (-1), (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (short) 1, (int) (byte) 10);
    }

    @Test
    public void test10986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10986");
        int[] intArray6 = new int[] { (byte) 10, 10, (byte) 0, 100, '#', (short) 0 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) 10, (-1));
    }

    @Test
    public void test10987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10987");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (short) 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (byte) -1, (int) '#');
    }

    @Test
    public void test10988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10988");
        int[] intArray2 = new int[] { (byte) -1, ' ' };
        int[] intArray8 = new int[] { (byte) 1, (byte) 10, 0, (byte) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) -1, 0);
    }

    @Test
    public void test10989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10989");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (byte) 100, (int) (short) 100);
    }

    @Test
    public void test10990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10990");
        int[] intArray3 = new int[] { (short) 1, 1, (short) -1 };
        int[] intArray5 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, 0, 100);
    }

    @Test
    public void test10991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10991");
        int[] intArray4 = new int[] { 1, 'a', '#', 'a' };
        int[] intArray11 = new int[] { '#', (byte) -1, (short) 10, '4', (byte) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (byte) 1, (int) 'a');
    }

    @Test
    public void test10992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10992");
        int[] intArray3 = new int[] { (short) 1, (byte) 10, '4' };
        int[] intArray7 = new int[] { (short) 1, (short) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) 'a', (int) (byte) 10);
    }

    @Test
    public void test10993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10993");
        int[] intArray5 = new int[] { 0, '#', (short) 0, '#', (byte) 10 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 10, 0);
    }

    @Test
    public void test10994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10994");
        int[] intArray6 = new int[] { ' ', ' ', (short) 0, 1, (short) -1, 1 };
        int[] intArray8 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 10, (-1));
    }

    @Test
    public void test10995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10995");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (short) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) '#', (int) '#');
    }

    @Test
    public void test10996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10996");
        int[] intArray2 = new int[] { (byte) 0, ' ' };
        int[] intArray5 = new int[] { 'a', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 0, 0);
    }

    @Test
    public void test10997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10997");
        int[] intArray6 = new int[] { 100, 10, (byte) 0, ' ', (byte) 0, (-1) };
        int[] intArray12 = new int[] { '4', (byte) -1, '4', 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 100, (int) ' ');
    }

    @Test
    public void test10998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10998");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray8 = new int[] { '#', (byte) 0, (short) 0, (byte) -1, '#', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) 100, (int) (byte) 100);
    }

    @Test
    public void test10999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test10999");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray4 = new int[] { 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (short) 0, (int) (short) 1);
    }

    @Test
    public void test11000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest21.test11000");
        int[] intArray2 = new int[] { 0, '4' };
        int[] intArray5 = new int[] { 'a', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 0, 10);
    }
}

