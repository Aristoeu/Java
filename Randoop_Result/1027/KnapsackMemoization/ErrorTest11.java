package KnapsackMemoization;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest11 {

    public static boolean debug = false;

    @Test
    public void test05501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05501");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray8 = new int[] { (short) 10, (short) 10, (byte) 0, (byte) 10, (byte) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) 10, 100);
    }

    @Test
    public void test05502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05502");
        int[] intArray4 = new int[] { (short) 10, (short) 1, 1, 1 };
        int[] intArray9 = new int[] { (-1), (short) -1, (short) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 0, (int) (short) 10);
    }

    @Test
    public void test05503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05503");
        int[] intArray6 = new int[] { 'a', (short) 1, (byte) 100, (short) -1, (short) -1, 'a' };
        int[] intArray11 = new int[] { (short) -1, (short) -1, (-1), '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (byte) 0, 1);
    }

    @Test
    public void test05504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05504");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (-1), '#', 'a', '#', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) 100, (int) (byte) -1);
    }

    @Test
    public void test05505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05505");
        int[] intArray5 = new int[] { (short) 1, (byte) 0, (short) -1, 0, 10 };
        int[] intArray11 = new int[] { (-1), (short) 0, 100, (short) 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) 10, (int) '#');
    }

    @Test
    public void test05506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05506");
        int[] intArray6 = new int[] { (byte) 0, '4', (short) 100, (short) 0, (short) 100, (short) 10 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, 0, (int) '4');
    }

    @Test
    public void test05507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05507");
        int[] intArray5 = new int[] { (byte) -1, (byte) 1, (byte) 10, (byte) 100, ' ' };
        int[] intArray11 = new int[] { (short) -1, (short) 1, (short) -1, 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) 10, (int) (short) 0);
    }

    @Test
    public void test05508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05508");
        int[] intArray6 = new int[] { 0, 1, 10, 100, '4', (short) 10 };
        int[] intArray8 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (byte) -1, (int) (short) 10);
    }

    @Test
    public void test05509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05509");
        int[] intArray2 = new int[] { ' ', '4' };
        int[] intArray4 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 0, (int) 'a');
    }

    @Test
    public void test05510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05510");
        int[] intArray5 = new int[] { (byte) 0, (byte) 1, 1, 0, '4' };
        int[] intArray11 = new int[] { 0, (short) 1, 0, '4', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) 100, (int) (byte) 10);
    }

    @Test
    public void test05511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05511");
        int[] intArray6 = new int[] { (-1), '#', '4', (short) 100, (-1), '#' };
        int[] intArray9 = new int[] { (byte) 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 100, (int) (short) 1);
    }

    @Test
    public void test05512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05512");
        int[] intArray2 = new int[] { (byte) 1, (short) 0 };
        int[] intArray4 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 0, (int) (short) 1);
    }

    @Test
    public void test05513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05513");
        int[] intArray3 = new int[] { (short) 100, (short) 1, (byte) 1 };
        int[] intArray9 = new int[] { 1, (byte) 10, '#', (short) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) 'a', (int) (byte) 100);
    }

    @Test
    public void test05514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05514");
        int[] intArray3 = new int[] { 10, (byte) -1, (short) 1 };
        int[] intArray5 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, 10, (int) (short) 10);
    }

    @Test
    public void test05515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05515");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 0, (int) (byte) 0);
    }

    @Test
    public void test05516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05516");
        int[] intArray3 = new int[] { (byte) -1, 100, (short) 0 };
        int[] intArray10 = new int[] { (short) -1, (byte) 1, (byte) 0, (byte) 100, (byte) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) -1, (int) (short) -1);
    }

    @Test
    public void test05517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05517");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) 0, 0, ' ', (short) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) 10, (int) ' ');
    }

    @Test
    public void test05518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05518");
        int[] intArray4 = new int[] { ' ', 1, (short) 0, (byte) 10 };
        int[] intArray8 = new int[] { (byte) 0, (byte) 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 0, (int) '4');
    }

    @Test
    public void test05519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05519");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { '4', 100, (short) 1, (short) 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, 100, (int) (byte) 100);
    }

    @Test
    public void test05520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05520");
        int[] intArray1 = new int[] { '#' };
        int[] intArray3 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) 10, (int) (short) 10);
    }

    @Test
    public void test05521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05521");
        int[] intArray3 = new int[] { (byte) 100, (short) 0, (byte) 10 };
        int[] intArray10 = new int[] { (-1), 0, (-1), '4', (short) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 100, (int) ' ');
    }

    @Test
    public void test05522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05522");
        int[] intArray6 = new int[] { '#', 0, (byte) 10, (byte) 10, (byte) -1, (short) 0 };
        int[] intArray8 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 1, 0);
    }

    @Test
    public void test05523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05523");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, 10, (-1));
    }

    @Test
    public void test05524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05524");
        int[] intArray6 = new int[] { '4', 1, ' ', (byte) -1, '4', (byte) 100 };
        int[] intArray13 = new int[] { 10, ' ', (short) 0, (short) -1, '4', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (short) -1, (int) '4');
    }

    @Test
    public void test05525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05525");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 0, 100, (short) -1, (-1), (short) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, 100, (int) ' ');
    }

    @Test
    public void test05526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05526");
        int[] intArray2 = new int[] { '#', (short) 0 };
        int[] intArray5 = new int[] { (byte) 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test05527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05527");
        int[] intArray3 = new int[] { '4', (short) 0, (byte) -1 };
        int[] intArray5 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) 1, (int) (short) 10);
    }

    @Test
    public void test05528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05528");
        int[] intArray4 = new int[] { 'a', 10, (-1), ' ' };
        int[] intArray9 = new int[] { '4', (short) 0, (short) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) 0, (int) (short) 10);
    }

    @Test
    public void test05529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05529");
        int[] intArray2 = new int[] { (byte) -1, '#' };
        int[] intArray9 = new int[] { (-1), (byte) -1, '#', (byte) 0, (short) -1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) ' ', (-1));
    }

    @Test
    public void test05530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05530");
        int[] intArray5 = new int[] { (byte) 0, '#', (byte) 10, 10, (byte) -1 };
        int[] intArray9 = new int[] { (byte) 100, 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) 'a', (int) (byte) 0);
    }

    @Test
    public void test05531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05531");
        int[] intArray5 = new int[] { (byte) 10, 10, 1, 100, 'a' };
        int[] intArray7 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) 1, (int) (short) 100);
    }

    @Test
    public void test05532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05532");
        int[] intArray6 = new int[] { 10, 'a', 'a', ' ', (short) 100, (short) 10 };
        int[] intArray9 = new int[] { '4', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (-1), (int) (short) -1);
    }

    @Test
    public void test05533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05533");
        int[] intArray5 = new int[] { (byte) 1, 0, (byte) 0, 1, (-1) };
        int[] intArray8 = new int[] { ' ', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 0, 1);
    }

    @Test
    public void test05534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05534");
        int[] intArray6 = new int[] { (byte) 10, '4', (short) 1, (byte) -1, ' ', (-1) };
        int[] intArray13 = new int[] { (byte) 10, (byte) 100, 'a', '4', ' ', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (short) 10, (int) (byte) 100);
    }

    @Test
    public void test05535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05535");
        int[] intArray4 = new int[] { (-1), (short) 1, (-1), 10 };
        int[] intArray9 = new int[] { (short) 10, (byte) -1, (byte) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) 1, (int) ' ');
    }

    @Test
    public void test05536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05536");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 0, (int) (short) -1);
    }

    @Test
    public void test05537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05537");
        int[] intArray2 = new int[] { 'a', '#' };
        int[] intArray4 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (byte) 1, (int) (byte) 100);
    }

    @Test
    public void test05538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05538");
        int[] intArray2 = new int[] { (short) 100, (byte) -1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test05539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05539");
        int[] intArray5 = new int[] { (byte) -1, (-1), (short) -1, (byte) 0, (-1) };
        int[] intArray11 = new int[] { (short) 100, ' ', (byte) 0, (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) 100, (int) (short) 10);
    }

    @Test
    public void test05540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05540");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 1, (int) (short) 100);
    }

    @Test
    public void test05541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05541");
        int[] intArray1 = new int[] { 100 };
        int[] intArray5 = new int[] { 100, (byte) 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) 1, (int) ' ');
    }

    @Test
    public void test05542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05542");
        int[] intArray4 = new int[] { '4', 0, (short) 10, (short) -1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, 100, (int) (byte) 10);
    }

    @Test
    public void test05543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05543");
        int[] intArray6 = new int[] { '#', (short) 100, (byte) 100, (byte) 1, (short) 1, (byte) -1 };
        int[] intArray12 = new int[] { (byte) 100, (byte) 1, (byte) 1, (short) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test05544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05544");
        int[] intArray2 = new int[] { '#', (byte) 0 };
        int[] intArray7 = new int[] { (short) 0, (short) 10, (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (short) 10, (int) 'a');
    }

    @Test
    public void test05545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05545");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (byte) 0, (int) (byte) 10);
    }

    @Test
    public void test05546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05546");
        int[] intArray2 = new int[] { (byte) 100, (byte) 1 };
        int[] intArray9 = new int[] { 1, (byte) 100, (short) 100, (short) -1, (short) 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (short) 0, (int) ' ');
    }

    @Test
    public void test05547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05547");
        int[] intArray1 = new int[] { '4' };
        int[] intArray4 = new int[] { (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 10, (int) (short) 100);
    }

    @Test
    public void test05548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05548");
        int[] intArray2 = new int[] { (short) 1, '#' };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) '4', 1);
    }

    @Test
    public void test05549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05549");
        int[] intArray5 = new int[] { '#', (byte) 100, '4', (byte) 0, (byte) -1 };
        int[] intArray12 = new int[] { (short) 1, (byte) 1, 100, '#', (byte) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) 10, (-1));
    }

    @Test
    public void test05550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05550");
        int[] intArray4 = new int[] { (short) 100, (short) -1, 10, (byte) 1 };
        int[] intArray8 = new int[] { (short) 1, (short) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) 10, 1);
    }

    @Test
    public void test05551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05551");
        int[] intArray2 = new int[] { (short) -1, (short) -1 };
        int[] intArray6 = new int[] { (short) -1, (short) 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (short) -1, (int) (short) 100);
    }

    @Test
    public void test05552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05552");
        int[] intArray5 = new int[] { (byte) -1, (byte) 1, (short) 100, 'a', 100 };
        int[] intArray11 = new int[] { (byte) 0, (short) 1, 10, (-1), (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) -1, 0);
    }

    @Test
    public void test05553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05553");
        int[] intArray5 = new int[] { 10, 10, (short) 1, (short) 0, (short) 0 };
        int[] intArray12 = new int[] { 0, (-1), 10, (short) 10, (byte) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (-1), (int) ' ');
    }

    @Test
    public void test05554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05554");
        int[] intArray4 = new int[] { (short) 10, (short) 100, (byte) -1, (short) -1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (short) 100, 0);
    }

    @Test
    public void test05555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05555");
        int[] intArray2 = new int[] { (byte) 10, 'a' };
        int[] intArray5 = new int[] { (-1), (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 1, 0);
    }

    @Test
    public void test05556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05556");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (short) -1, (int) '4');
    }

    @Test
    public void test05557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05557");
        int[] intArray3 = new int[] { ' ', (byte) 0, '4' };
        int[] intArray5 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) 10, (int) 'a');
    }

    @Test
    public void test05558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05558");
        int[] intArray4 = new int[] { (short) 10, 10, (short) 0, (short) 100 };
        int[] intArray11 = new int[] { (byte) -1, (byte) 100, (byte) 0, '#', 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test05559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05559");
        int[] intArray3 = new int[] { 10, (short) -1, 1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) 'a', (int) (short) -1);
    }

    @Test
    public void test05560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05560");
        int[] intArray4 = new int[] { 1, 'a', 'a', 1 };
        int[] intArray11 = new int[] { '4', (byte) -1, (short) 10, 100, '4', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) '4', 0);
    }

    @Test
    public void test05561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05561");
        int[] intArray2 = new int[] { (-1), '#' };
        int[] intArray7 = new int[] { 100, 0, (-1), (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 0, (int) (short) 0);
    }

    @Test
    public void test05562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05562");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray3 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, 0, (int) '4');
    }

    @Test
    public void test05563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05563");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray3 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) ' ', (int) 'a');
    }

    @Test
    public void test05564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05564");
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, '4', (byte) 100, (byte) -1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) ' ', (int) (short) 1);
    }

    @Test
    public void test05565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05565");
        int[] intArray6 = new int[] { (-1), (short) -1, (byte) 10, 100, 10, (-1) };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, 1, 10);
    }

    @Test
    public void test05566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05566");
        int[] intArray2 = new int[] { '#', (byte) 10 };
        int[] intArray8 = new int[] { (byte) -1, '4', '4', 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) 1, (int) (byte) 1);
    }

    @Test
    public void test05567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05567");
        int[] intArray3 = new int[] { (-1), (byte) 100, (byte) 10 };
        int[] intArray7 = new int[] { (-1), (byte) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (-1), 1);
    }

    @Test
    public void test05568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05568");
        int[] intArray2 = new int[] { (short) 0, ' ' };
        int[] intArray9 = new int[] { (-1), (-1), '#', '4', (byte) -1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) ' ', (int) (byte) 0);
    }

    @Test
    public void test05569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05569");
        int[] intArray5 = new int[] { (byte) 1, 10, (byte) 0, 100, 10 };
        int[] intArray9 = new int[] { 100, ' ', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) ' ', (int) (short) -1);
    }

    @Test
    public void test05570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05570");
        int[] intArray3 = new int[] { (byte) 0, '#', (-1) };
        int[] intArray7 = new int[] { (short) 10, 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 1, (int) (byte) -1);
    }

    @Test
    public void test05571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05571");
        int[] intArray6 = new int[] { (byte) -1, (byte) -1, (byte) 0, 0, (short) 100, (byte) 0 };
        int[] intArray9 = new int[] { (byte) 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 1, (int) (short) 0);
    }

    @Test
    public void test05572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05572");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 0, (-1), 1, (byte) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, 1, 1);
    }

    @Test
    public void test05573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05573");
        int[] intArray5 = new int[] { (-1), (short) 100, '#', (byte) 0, (short) 100 };
        int[] intArray12 = new int[] { (short) 10, (short) 10, (short) 1, (byte) 0, 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, 1, (int) (byte) 100);
    }

    @Test
    public void test05574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05574");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) -1, 10, (byte) 10, 'a', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) 1, (int) (short) 1);
    }

    @Test
    public void test05575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05575");
        int[] intArray3 = new int[] { '4', (byte) 10, ' ' };
        int[] intArray8 = new int[] { 1, ' ', (short) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 100, (int) (short) 10);
    }

    @Test
    public void test05576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05576");
        int[] intArray5 = new int[] { (short) 1, '4', 10, (short) 10, 10 };
        int[] intArray10 = new int[] { (byte) 100, 'a', 'a', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 1, (int) (short) 0);
    }

    @Test
    public void test05577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05577");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, 1, (int) (byte) 100);
    }

    @Test
    public void test05578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05578");
        int[] intArray4 = new int[] { (short) 1, (byte) 1, 1, 0 };
        int[] intArray6 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) ' ', 1);
    }

    @Test
    public void test05579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05579");
        int[] intArray3 = new int[] { 10, 1, (short) 0 };
        int[] intArray6 = new int[] { 'a', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) 1, 10);
    }

    @Test
    public void test05580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05580");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray7 = new int[] { ' ', (short) 0, 0, (-1), (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (-1), 1);
    }

    @Test
    public void test05581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05581");
        int[] intArray5 = new int[] { ' ', (byte) 0, 0, 100, (short) -1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) ' ', (int) (short) 0);
    }

    @Test
    public void test05582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05582");
        int[] intArray3 = new int[] { (short) 0, (short) 1, 'a' };
        int[] intArray6 = new int[] { (-1), (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, 0, (int) (byte) 100);
    }

    @Test
    public void test05583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05583");
        int[] intArray1 = new int[] { 1 };
        int[] intArray3 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) 10, (int) '4');
    }

    @Test
    public void test05584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05584");
        int[] intArray1 = new int[] { '4' };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) 100, (int) '4');
    }

    @Test
    public void test05585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05585");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray6 = new int[] { (short) 100, 1, (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) ' ', (int) (byte) 100);
    }

    @Test
    public void test05586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05586");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 'a', 10, 1, (byte) 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) 0, (int) (short) 10);
    }

    @Test
    public void test05587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05587");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray8 = new int[] { (-1), (byte) 100, (short) 1, 0, 'a', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 0, (int) (byte) 100);
    }

    @Test
    public void test05588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05588");
        int[] intArray5 = new int[] { '4', (short) 10, (byte) 0, 100, 100 };
        int[] intArray7 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) '#', (int) 'a');
    }

    @Test
    public void test05589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05589");
        int[] intArray6 = new int[] { (byte) 1, 10, (short) 10, (short) 10, 10, 10 };
        int[] intArray12 = new int[] { (byte) 1, (-1), 1, (byte) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 1, 10);
    }

    @Test
    public void test05590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05590");
        int[] intArray5 = new int[] { (byte) 100, (short) 100, (short) 1, (-1), (byte) -1 };
        int[] intArray8 = new int[] { (byte) 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 0, (int) (byte) 1);
    }

    @Test
    public void test05591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05591");
        int[] intArray4 = new int[] { (short) -1, '4', (short) 0, 0 };
        int[] intArray6 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) -1, (int) (byte) 10);
    }

    @Test
    public void test05592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05592");
        int[] intArray2 = new int[] { 'a', (byte) 10 };
        int[] intArray8 = new int[] { (byte) 0, (short) -1, ' ', 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 0, (int) (short) 1);
    }

    @Test
    public void test05593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05593");
        int[] intArray2 = new int[] { (byte) 1, (short) 10 };
        int[] intArray8 = new int[] { (byte) 1, (byte) -1, (byte) 10, 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) -1, (int) (byte) 100);
    }

    @Test
    public void test05594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05594");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray3 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) 1, 0);
    }

    @Test
    public void test05595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05595");
        int[] intArray6 = new int[] { (byte) 1, '4', (byte) 1, (byte) 1, (byte) 0, (short) 100 };
        int[] intArray10 = new int[] { '#', (short) 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 0, (int) (byte) 100);
    }

    @Test
    public void test05596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05596");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (short) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (short) 10, 100);
    }

    @Test
    public void test05597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05597");
        int[] intArray5 = new int[] { (byte) -1, (short) 0, (short) 10, (byte) 10, (short) 10 };
        int[] intArray11 = new int[] { (byte) -1, '#', (short) 1, (short) 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) -1, 0);
    }

    @Test
    public void test05598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05598");
        int[] intArray1 = new int[] { '#' };
        int[] intArray8 = new int[] { (byte) 0, (byte) -1, 'a', (short) 0, (byte) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) 0, 0);
    }

    @Test
    public void test05599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05599");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (short) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 10, 100);
    }

    @Test
    public void test05600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05600");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray7 = new int[] { (short) 100, (-1), (byte) -1, (byte) 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) -1, (int) (byte) -1);
    }

    @Test
    public void test05601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05601");
        int[] intArray4 = new int[] { (short) 100, (byte) -1, (short) 100, (byte) 10 };
        int[] intArray8 = new int[] { (byte) 0, (short) 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 0, (int) (byte) 100);
    }

    @Test
    public void test05602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05602");
        int[] intArray5 = new int[] { (byte) 1, (byte) 0, (-1), '4', (byte) 0 };
        int[] intArray10 = new int[] { 0, 100, (-1), (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 10, (int) (short) 10);
    }

    @Test
    public void test05603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05603");
        int[] intArray5 = new int[] { 'a', 1, 1, (short) 0, 0 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (short) 1, 10);
    }

    @Test
    public void test05604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05604");
        int[] intArray4 = new int[] { (short) 100, ' ', (short) 10, 10 };
        int[] intArray10 = new int[] { (short) -1, (short) 100, (byte) 10, (byte) 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, 10, (int) (short) 1);
    }

    @Test
    public void test05605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05605");
        int[] intArray5 = new int[] { '4', (byte) 0, 0, 1, (short) -1 };
        int[] intArray9 = new int[] { 100, (byte) 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 0, (int) (short) -1);
    }

    @Test
    public void test05606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05606");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (short) 0, (int) (short) 1);
    }

    @Test
    public void test05607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05607");
        int[] intArray4 = new int[] { '#', (byte) 100, (byte) 10, 0 };
        int[] intArray10 = new int[] { (byte) 1, ' ', (short) 1, (short) 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, 100, (int) '#');
    }

    @Test
    public void test05608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05608");
        int[] intArray2 = new int[] { 0, 1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (-1), (int) '#');
    }

    @Test
    public void test05609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05609");
        int[] intArray4 = new int[] { (byte) 0, (byte) 0, 0, (byte) 10 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (short) 100, (-1));
    }

    @Test
    public void test05610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05610");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray6 = new int[] { (short) 0, (byte) 1, (byte) 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) 'a', (int) (byte) 100);
    }

    @Test
    public void test05611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05611");
        int[] intArray4 = new int[] { 10, (short) -1, (short) -1, (byte) 100 };
        int[] intArray9 = new int[] { '4', 1, '4', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (byte) 10, (int) (short) 0);
    }

    @Test
    public void test05612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05612");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { ' ', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) 'a', (int) (byte) 10);
    }

    @Test
    public void test05613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05613");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray7 = new int[] { (short) 0, (byte) 100, '#', (byte) 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) 100, 0);
    }

    @Test
    public void test05614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05614");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray4 = new int[] { '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (short) 1, (int) (byte) 0);
    }

    @Test
    public void test05615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05615");
        int[] intArray4 = new int[] { (byte) 10, (short) 10, 10, (byte) 100 };
        int[] intArray6 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) -1, (int) '#');
    }

    @Test
    public void test05616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05616");
        int[] intArray1 = new int[] { '4' };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (-1), (int) (byte) 10);
    }

    @Test
    public void test05617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05617");
        int[] intArray2 = new int[] { ' ', (short) 1 };
        int[] intArray8 = new int[] { (byte) 1, (byte) 1, (short) 100, 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) '4', (int) 'a');
    }

    @Test
    public void test05618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05618");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 100, (int) 'a');
    }

    @Test
    public void test05619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05619");
        int[] intArray1 = new int[] { 100 };
        int[] intArray5 = new int[] { (byte) 100, 'a', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) 0, (int) (short) 0);
    }

    @Test
    public void test05620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05620");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray3 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) 1, (int) (short) 0);
    }

    @Test
    public void test05621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05621");
        int[] intArray2 = new int[] { '#', 0 };
        int[] intArray6 = new int[] { (short) 100, (short) 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (-1), (int) (short) 10);
    }

    @Test
    public void test05622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05622");
        int[] intArray5 = new int[] { (byte) 1, 1, '4', '4', (-1) };
        int[] intArray12 = new int[] { 'a', 1, (byte) -1, (short) 1, 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test05623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05623");
        int[] intArray3 = new int[] { (short) 0, 100, (byte) 1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (byte) 10, 0);
    }

    @Test
    public void test05624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05624");
        int[] intArray3 = new int[] { (byte) 0, 10, 'a' };
        int[] intArray5 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test05625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05625");
        int[] intArray3 = new int[] { ' ', (byte) 0, 100 };
        int[] intArray5 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (-1), 1);
    }

    @Test
    public void test05626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05626");
        int[] intArray6 = new int[] { 100, (byte) 0, 0, (short) 10, (short) 100, (-1) };
        int[] intArray11 = new int[] { 1, 100, 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (byte) -1, (int) ' ');
    }

    @Test
    public void test05627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05627");
        int[] intArray4 = new int[] { (short) 1, (byte) -1, 'a', (short) 1 };
        int[] intArray6 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (short) 100, (int) (byte) 1);
    }

    @Test
    public void test05628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05628");
        int[] intArray4 = new int[] { 10, (byte) -1, 'a', (short) 100 };
        int[] intArray8 = new int[] { (short) 0, (short) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) 1, 10);
    }

    @Test
    public void test05629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05629");
        int[] intArray2 = new int[] { 'a', (short) 10 };
        int[] intArray5 = new int[] { 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test05630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05630");
        int[] intArray3 = new int[] { (-1), '4', (short) 10 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) 'a', (int) (byte) 100);
    }

    @Test
    public void test05631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05631");
        int[] intArray4 = new int[] { (byte) 10, '#', (short) 10, (short) 10 };
        int[] intArray6 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 0, (int) (byte) 0);
    }

    @Test
    public void test05632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05632");
        int[] intArray3 = new int[] { (byte) 0, (byte) 1, 1 };
        int[] intArray10 = new int[] { 100, (byte) 0, 10, (short) -1, 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test05633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05633");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray6 = new int[] { (short) 10, '#', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) 100, (int) '4');
    }

    @Test
    public void test05634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05634");
        int[] intArray6 = new int[] { (short) 10, 0, (short) -1, (-1), '4', ' ' };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) 10, 0);
    }

    @Test
    public void test05635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05635");
        int[] intArray1 = new int[] { 0 };
        int[] intArray7 = new int[] { (byte) 10, (-1), (short) -1, (short) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, 1, (int) (byte) 100);
    }

    @Test
    public void test05636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05636");
        int[] intArray3 = new int[] { '#', ' ', (short) 10 };
        int[] intArray10 = new int[] { 1, (short) 0, (short) -1, (short) 10, (short) 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) '#', (int) (byte) 0);
    }

    @Test
    public void test05637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05637");
        int[] intArray5 = new int[] { (byte) 10, 1, '4', '4', 'a' };
        int[] intArray12 = new int[] { '#', 100, '#', (short) 100, 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, 10, (int) (short) 1);
    }

    @Test
    public void test05638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05638");
        int[] intArray5 = new int[] { (byte) 10, (short) 0, (byte) 100, '#', (byte) 1 };
        int[] intArray7 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) -1, (int) (short) 1);
    }

    @Test
    public void test05639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05639");
        int[] intArray2 = new int[] { (short) 100, 'a' };
        int[] intArray4 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) '#', (int) (short) -1);
    }

    @Test
    public void test05640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05640");
        int[] intArray4 = new int[] { '4', (short) 0, (short) -1, ' ' };
        int[] intArray9 = new int[] { (short) 10, (short) 10, 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) '#', 0);
    }

    @Test
    public void test05641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05641");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray3 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (byte) 0, (int) (short) -1);
    }

    @Test
    public void test05642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05642");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) -1, (int) '4');
    }

    @Test
    public void test05643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05643");
        int[] intArray6 = new int[] { (short) 100, ' ', (short) 100, (byte) 0, '#', (byte) 100 };
        int[] intArray10 = new int[] { (short) 10, 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 100, (-1));
    }

    @Test
    public void test05644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05644");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 100, (byte) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) 10, (int) (short) 1);
    }

    @Test
    public void test05645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05645");
        int[] intArray1 = new int[] { 10 };
        int[] intArray8 = new int[] { (short) 0, 100, (byte) 10, ' ', (byte) 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) ' ', 10);
    }

    @Test
    public void test05646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05646");
        int[] intArray2 = new int[] { (byte) 100, 0 };
        int[] intArray7 = new int[] { (-1), '4', '4', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (short) 10, 10);
    }

    @Test
    public void test05647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05647");
        int[] intArray5 = new int[] { 'a', 0, (short) -1, (short) 1, (short) 10 };
        int[] intArray9 = new int[] { (short) 100, '4', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) '4', (int) '#');
    }

    @Test
    public void test05648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05648");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, 100, (int) (byte) 10);
    }

    @Test
    public void test05649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05649");
        int[] intArray5 = new int[] { (byte) -1, (byte) 10, '4', (short) 10, (byte) 0 };
        int[] intArray9 = new int[] { 10, '4', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) ' ', (int) (short) -1);
    }

    @Test
    public void test05650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05650");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { '4', (short) 100, (byte) -1, (byte) 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) ' ', 100);
    }

    @Test
    public void test05651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05651");
        int[] intArray3 = new int[] { (short) 0, (byte) -1, (byte) 0 };
        int[] intArray10 = new int[] { 100, (byte) 1, 1, (-1), ' ', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) 'a', (int) (short) 0);
    }

    @Test
    public void test05652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05652");
        int[] intArray6 = new int[] { (short) 0, (byte) 1, (short) 10, (-1), (short) -1, (short) 100 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) 10, (int) (short) 10);
    }

    @Test
    public void test05653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05653");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray4 = new int[] { 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 10, 1);
    }

    @Test
    public void test05654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05654");
        int[] intArray2 = new int[] { (short) 10, '#' };
        int[] intArray5 = new int[] { (-1), (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (byte) -1, (int) 'a');
    }

    @Test
    public void test05655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05655");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray6 = new int[] { (short) 10, 10, (byte) 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 0, (int) '4');
    }

    @Test
    public void test05656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05656");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, 0, (-1));
    }

    @Test
    public void test05657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05657");
        int[] intArray3 = new int[] { (byte) 1, (short) 10, (byte) -1 };
        int[] intArray8 = new int[] { (short) 0, (byte) 100, (byte) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (byte) -1, (int) (byte) 100);
    }

    @Test
    public void test05658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05658");
        int[] intArray2 = new int[] { (byte) 10, (byte) -1 };
        int[] intArray4 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (byte) -1, (int) (byte) 1);
    }

    @Test
    public void test05659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05659");
        int[] intArray5 = new int[] { (byte) 100, (byte) -1, ' ', 0, (short) 1 };
        int[] intArray10 = new int[] { (short) 10, (short) 0, (short) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) '#', (int) (byte) 0);
    }

    @Test
    public void test05660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05660");
        int[] intArray2 = new int[] { 1, 100 };
        int[] intArray5 = new int[] { (short) -1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (byte) 10, (int) (short) 100);
    }

    @Test
    public void test05661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05661");
        int[] intArray3 = new int[] { (byte) -1, (byte) -1, (short) 1 };
        int[] intArray7 = new int[] { (byte) -1, (short) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) 10, (int) (short) -1);
    }

    @Test
    public void test05662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05662");
        int[] intArray2 = new int[] { '4', 10 };
        int[] intArray4 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 0, 0);
    }

    @Test
    public void test05663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05663");
        int[] intArray3 = new int[] { ' ', (short) 0, (short) 1 };
        int[] intArray6 = new int[] { 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) '#', (int) (byte) 1);
    }

    @Test
    public void test05664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05664");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray8 = new int[] { 1, 100, ' ', '#', 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) 1, (int) ' ');
    }

    @Test
    public void test05665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05665");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) 0, 0);
    }

    @Test
    public void test05666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05666");
        int[] intArray6 = new int[] { 0, (short) 100, (short) 1, ' ', '#', (byte) 100 };
        int[] intArray9 = new int[] { 'a', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, 0, (int) (short) -1);
    }

    @Test
    public void test05667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05667");
        int[] intArray4 = new int[] { 0, (byte) 10, (byte) 10, (short) 1 };
        int[] intArray8 = new int[] { (byte) 0, 'a', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (-1), (int) (byte) 100);
    }

    @Test
    public void test05668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05668");
        int[] intArray6 = new int[] { '4', (byte) 1, 0, (byte) 1, (byte) 0, (short) -1 };
        int[] intArray13 = new int[] { (-1), (byte) -1, (short) 0, (byte) 1, (short) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (byte) -1, (int) '#');
    }

    @Test
    public void test05669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05669");
        int[] intArray3 = new int[] { (byte) -1, (short) 10, (byte) 0 };
        int[] intArray8 = new int[] { (byte) 10, 1, '4', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (short) 1, (int) (byte) 10);
    }

    @Test
    public void test05670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05670");
        int[] intArray6 = new int[] { '4', (byte) 1, (byte) 100, '4', (-1), 1 };
        int[] intArray9 = new int[] { 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (short) 1, (int) (byte) 1);
    }

    @Test
    public void test05671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05671");
        int[] intArray2 = new int[] { (short) 100, '#' };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 1, (int) (short) -1);
    }

    @Test
    public void test05672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05672");
        int[] intArray5 = new int[] { (-1), 'a', 'a', (byte) -1, (byte) -1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) 0, (-1));
    }

    @Test
    public void test05673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05673");
        int[] intArray1 = new int[] { 1 };
        int[] intArray6 = new int[] { (byte) 10, 100, (byte) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (-1), (int) (short) -1);
    }

    @Test
    public void test05674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05674");
        int[] intArray4 = new int[] { (short) 10, (short) 100, '4', (short) 1 };
        int[] intArray8 = new int[] { '4', (-1), (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) 1, (int) '#');
    }

    @Test
    public void test05675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05675");
        int[] intArray4 = new int[] { (short) 10, 0, (byte) 10, 'a' };
        int[] intArray7 = new int[] { ' ', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) 0, (-1));
    }

    @Test
    public void test05676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05676");
        int[] intArray2 = new int[] { (byte) 1, 1 };
        int[] intArray7 = new int[] { 'a', (byte) -1, 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (short) 1, (int) '4');
    }

    @Test
    public void test05677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05677");
        int[] intArray2 = new int[] { (byte) 1, ' ' };
        int[] intArray5 = new int[] { (byte) -1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) ' ', (int) (short) 1);
    }

    @Test
    public void test05678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05678");
        int[] intArray4 = new int[] { '4', 'a', (byte) -1, (byte) 0 };
        int[] intArray6 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 0, 1);
    }

    @Test
    public void test05679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05679");
        int[] intArray3 = new int[] { 1, '4', (byte) 1 };
        int[] intArray8 = new int[] { (short) -1, '#', (short) 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test05680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05680");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 10, (-1), '#', (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) 10, (int) (short) 1);
    }

    @Test
    public void test05681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05681");
        int[] intArray6 = new int[] { 100, 1, (byte) 0, (byte) 1, 'a', (short) 1 };
        int[] intArray10 = new int[] { '4', (byte) 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 0, 0);
    }

    @Test
    public void test05682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05682");
        int[] intArray2 = new int[] { (byte) 0, (byte) 10 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (byte) -1, 0);
    }

    @Test
    public void test05683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05683");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray4 = new int[] { (short) 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) 'a', (-1));
    }

    @Test
    public void test05684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05684");
        int[] intArray5 = new int[] { (byte) 1, (short) 10, '#', (short) 10, 0 };
        int[] intArray10 = new int[] { (short) -1, (byte) 1, (-1), (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (short) 0, 0);
    }

    @Test
    public void test05685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05685");
        int[] intArray6 = new int[] { (-1), (byte) -1, (short) 0, (byte) -1, ' ', (byte) 1 };
        int[] intArray9 = new int[] { (short) 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 1, 1);
    }

    @Test
    public void test05686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05686");
        int[] intArray3 = new int[] { 100, 1, (short) -1 };
        int[] intArray7 = new int[] { 10, (short) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) -1, 1);
    }

    @Test
    public void test05687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05687");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray4 = new int[] { (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test05688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05688");
        int[] intArray6 = new int[] { 0, ' ', 'a', (byte) 0, (short) 1, 0 };
        int[] intArray9 = new int[] { 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) '#', 0);
    }

    @Test
    public void test05689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05689");
        int[] intArray6 = new int[] { ' ', '#', (short) 1, 100, (short) 10, '4' };
        int[] intArray10 = new int[] { (short) 100, 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) 'a', 100);
    }

    @Test
    public void test05690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05690");
        int[] intArray2 = new int[] { 'a', (-1) };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) ' ', (int) '4');
    }

    @Test
    public void test05691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05691");
        int[] intArray5 = new int[] { (short) -1, (byte) 100, (short) 10, (short) -1, (short) 10 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 0, (int) (byte) 1);
    }

    @Test
    public void test05692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05692");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray5 = new int[] { (byte) 0, (short) 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (-1), 0);
    }

    @Test
    public void test05693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05693");
        int[] intArray4 = new int[] { (byte) 0, (short) 10, ' ', (short) 100 };
        int[] intArray7 = new int[] { (byte) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) '#', (int) '#');
    }

    @Test
    public void test05694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05694");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 1, (short) 0, '#', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 10, (int) (short) -1);
    }

    @Test
    public void test05695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05695");
        int[] intArray2 = new int[] { 100, 10 };
        int[] intArray9 = new int[] { (short) 1, 'a', (byte) 100, 0, 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (-1), (int) ' ');
    }

    @Test
    public void test05696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05696");
        int[] intArray3 = new int[] { (byte) -1, (byte) 1, 100 };
        int[] intArray7 = new int[] { ' ', (byte) 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) -1, (int) (byte) 1);
    }

    @Test
    public void test05697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05697");
        int[] intArray6 = new int[] { 'a', (short) 100, (short) 10, (byte) -1, '4', (byte) 0 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, 100, 0);
    }

    @Test
    public void test05698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05698");
        int[] intArray5 = new int[] { (short) -1, 10, 0, (byte) 1, (short) -1 };
        int[] intArray9 = new int[] { '#', (short) 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) -1, (int) (short) 0);
    }

    @Test
    public void test05699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05699");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray8 = new int[] { '#', 100, '4', (short) 0, ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 0, 1);
    }

    @Test
    public void test05700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05700");
        int[] intArray3 = new int[] { (byte) 100, (short) 0, ' ' };
        int[] intArray8 = new int[] { 'a', (short) 10, 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 10, (int) (byte) 10);
    }

    @Test
    public void test05701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05701");
        int[] intArray2 = new int[] { (short) 1, (short) 1 };
        int[] intArray8 = new int[] { '4', 100, (byte) 100, (-1), (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) 'a', 0);
    }

    @Test
    public void test05702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05702");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray5 = new int[] { (short) 0, (short) 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) '4', (int) (short) 10);
    }

    @Test
    public void test05703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05703");
        int[] intArray5 = new int[] { (byte) 1, 100, 'a', (short) 0, (byte) 1 };
        int[] intArray9 = new int[] { 10, (-1), 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 10, (int) (short) 10);
    }

    @Test
    public void test05704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05704");
        int[] intArray5 = new int[] { (byte) -1, 10, (byte) 100, (short) -1, (byte) 1 };
        int[] intArray7 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (short) 100, 10);
    }

    @Test
    public void test05705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05705");
        int[] intArray2 = new int[] { 10, (short) 100 };
        int[] intArray6 = new int[] { (byte) 1, ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) '#', 0);
    }

    @Test
    public void test05706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05706");
        int[] intArray4 = new int[] { (byte) 0, (short) 0, '4', ' ' };
        int[] intArray10 = new int[] { (byte) 10, (short) 10, 'a', (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) '#', (int) (byte) 100);
    }

    @Test
    public void test05707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05707");
        int[] intArray5 = new int[] { 1, (byte) 10, '4', 'a', (short) 100 };
        int[] intArray8 = new int[] { (short) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) 1, 100);
    }

    @Test
    public void test05708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05708");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 1, (short) -1, (byte) 100, (byte) 0, (-1), (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) 10, 0);
    }

    @Test
    public void test05709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05709");
        int[] intArray3 = new int[] { '4', 1, '#' };
        int[] intArray8 = new int[] { (short) 10, '#', '#', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (byte) 100, 10);
    }

    @Test
    public void test05710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05710");
        int[] intArray4 = new int[] { ' ', 10, 1, (byte) 10 };
        int[] intArray8 = new int[] { (short) 0, 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) '4', 1);
    }

    @Test
    public void test05711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05711");
        int[] intArray5 = new int[] { (short) 0, 100, '#', (short) 0, (byte) -1 };
        int[] intArray7 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, 10, (int) (byte) -1);
    }

    @Test
    public void test05712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05712");
        int[] intArray1 = new int[] { 10 };
        int[] intArray8 = new int[] { 100, (short) 10, (short) -1, (short) 0, (short) 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) 10, (int) (byte) 100);
    }

    @Test
    public void test05713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05713");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray7 = new int[] { (-1), '4', '#', (short) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) -1, (int) (short) 10);
    }

    @Test
    public void test05714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05714");
        int[] intArray3 = new int[] { 0, '4', 0 };
        int[] intArray5 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (-1), (int) '#');
    }

    @Test
    public void test05715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05715");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) ' ', 1);
    }

    @Test
    public void test05716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05716");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { '4', (byte) -1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) '4', (int) 'a');
    }

    @Test
    public void test05717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05717");
        int[] intArray6 = new int[] { (byte) -1, 'a', (byte) 0, 10, 100, (-1) };
        int[] intArray9 = new int[] { (short) 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (short) 10, (int) 'a');
    }

    @Test
    public void test05718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05718");
        int[] intArray4 = new int[] { (byte) 0, (byte) 100, 100, (byte) -1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (-1), 1);
    }

    @Test
    public void test05719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05719");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        int[] intArray6 = new int[] { '#', (short) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) ' ', (int) (byte) 100);
    }

    @Test
    public void test05720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05720");
        int[] intArray6 = new int[] { 0, (byte) -1, (short) 10, (short) 0, 10, (byte) -1 };
        int[] intArray10 = new int[] { (short) 10, 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) 1, (int) ' ');
    }

    @Test
    public void test05721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05721");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 10, (byte) 100, (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 100, (int) '4');
    }

    @Test
    public void test05722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05722");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) 100, ' ', '#', (short) 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, 10, 0);
    }

    @Test
    public void test05723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05723");
        int[] intArray4 = new int[] { (byte) 1, '#', (byte) 100, (byte) -1 };
        int[] intArray10 = new int[] { 'a', 100, (-1), (short) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (byte) 1, (int) (short) 0);
    }

    @Test
    public void test05724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05724");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 0, 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, 1, (int) (byte) 100);
    }

    @Test
    public void test05725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05725");
        int[] intArray3 = new int[] { (byte) -1, 0, 0 };
        int[] intArray6 = new int[] { (short) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test05726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05726");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray6 = new int[] { 1, (short) 100, '#', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) '#', (int) (byte) 100);
    }

    @Test
    public void test05727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05727");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (byte) 10, (byte) 10, (byte) 1, (byte) 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) 'a', (int) (short) 100);
    }

    @Test
    public void test05728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05728");
        int[] intArray3 = new int[] { 10, ' ', 10 };
        int[] intArray5 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) 10, (int) ' ');
    }

    @Test
    public void test05729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05729");
        int[] intArray4 = new int[] { '4', 1, 'a', (byte) 1 };
        int[] intArray7 = new int[] { 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) 'a', (int) (byte) 1);
    }

    @Test
    public void test05730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05730");
        int[] intArray5 = new int[] { 1, 100, (short) 100, (byte) 10, (short) 1 };
        int[] intArray7 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (short) 10, (int) (byte) 1);
    }

    @Test
    public void test05731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05731");
        int[] intArray5 = new int[] { 10, '#', '#', (byte) 10, 0 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) 10, (int) (byte) 0);
    }

    @Test
    public void test05732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05732");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 10, (short) 0, (-1), ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) ' ', (int) (byte) -1);
    }

    @Test
    public void test05733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05733");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (short) 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) '#', (int) (byte) 0);
    }

    @Test
    public void test05734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05734");
        int[] intArray2 = new int[] { (-1), (short) 100 };
        int[] intArray6 = new int[] { (byte) 1, 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) 'a', (int) ' ');
    }

    @Test
    public void test05735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05735");
        int[] intArray4 = new int[] { ' ', (short) 10, (byte) 0, 'a' };
        int[] intArray6 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, 0, (int) (short) 10);
    }

    @Test
    public void test05736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05736");
        int[] intArray3 = new int[] { 10, (-1), (byte) 0 };
        int[] intArray7 = new int[] { 100, 'a', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 0, (int) (short) 10);
    }

    @Test
    public void test05737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05737");
        int[] intArray6 = new int[] { '#', (byte) 1, (short) 1, '4', (short) -1, (short) 10 };
        int[] intArray10 = new int[] { ' ', (byte) 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) 10, 0);
    }

    @Test
    public void test05738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05738");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray7 = new int[] { (short) -1, (short) 10, (byte) 10, (-1), 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, 10, (-1));
    }

    @Test
    public void test05739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05739");
        int[] intArray2 = new int[] { (byte) 100, 0 };
        int[] intArray4 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (short) 10, (int) 'a');
    }

    @Test
    public void test05740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05740");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray8 = new int[] { (short) 10, '#', '4', 1, (short) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) 10, (int) (short) 100);
    }

    @Test
    public void test05741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05741");
        int[] intArray1 = new int[] { 10 };
        int[] intArray3 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) -1, (int) (byte) 100);
    }

    @Test
    public void test05742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05742");
        int[] intArray4 = new int[] { '#', (byte) 0, (short) 0, (-1) };
        int[] intArray9 = new int[] { (byte) 100, 'a', 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) 1, 100);
    }

    @Test
    public void test05743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05743");
        int[] intArray3 = new int[] { (byte) -1, (short) -1, (short) 0 };
        int[] intArray8 = new int[] { 10, '4', '#', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (short) -1, 0);
    }

    @Test
    public void test05744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05744");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) 'a', 100);
    }

    @Test
    public void test05745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05745");
        int[] intArray6 = new int[] { (short) 0, (byte) 100, (short) 10, (byte) 10, '#', (byte) 10 };
        int[] intArray12 = new int[] { (byte) 1, 1, (short) -1, (short) 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) 1, (int) (byte) 0);
    }

    @Test
    public void test05746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05746");
        int[] intArray4 = new int[] { 1, (short) 0, (short) 10, 0 };
        int[] intArray6 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) 'a', (int) (byte) 100);
    }

    @Test
    public void test05747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05747");
        int[] intArray1 = new int[] { 0 };
        int[] intArray6 = new int[] { (short) 10, (short) 100, (short) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 100, (int) (short) 1);
    }

    @Test
    public void test05748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05748");
        int[] intArray3 = new int[] { (short) 0, 100, (short) 1 };
        int[] intArray6 = new int[] { (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) 'a', (int) (short) 1);
    }

    @Test
    public void test05749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05749");
        int[] intArray4 = new int[] { (byte) 1, (byte) 0, '#', (-1) };
        int[] intArray8 = new int[] { (short) 10, (short) 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 0, 10);
    }

    @Test
    public void test05750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05750");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) 0, (short) 10, 100, 'a', (short) 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) 100, 1);
    }

    @Test
    public void test05751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05751");
        int[] intArray2 = new int[] { 10, ' ' };
        int[] intArray4 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 100, (int) (byte) 1);
    }

    @Test
    public void test05752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05752");
        int[] intArray5 = new int[] { '4', (short) 1, (short) -1, 'a', (byte) -1 };
        int[] intArray10 = new int[] { (short) 1, '4', 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (byte) 1, (int) '#');
    }

    @Test
    public void test05753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05753");
        int[] intArray6 = new int[] { (short) 1, '4', 0, (byte) 100, (byte) 1, 'a' };
        int[] intArray12 = new int[] { (byte) -1, (short) 100, (short) 0, (short) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) 'a', 1);
    }

    @Test
    public void test05754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05754");
        int[] intArray4 = new int[] { '4', '#', '4', 100 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (short) 1, (int) (short) 100);
    }

    @Test
    public void test05755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05755");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) 100, (int) (byte) 100);
    }

    @Test
    public void test05756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05756");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 100, (int) (short) -1);
    }

    @Test
    public void test05757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05757");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (byte) 0, (int) 'a');
    }

    @Test
    public void test05758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05758");
        int[] intArray6 = new int[] { '4', (byte) 10, (byte) 0, 'a', (byte) 10, (byte) -1 };
        int[] intArray13 = new int[] { (-1), ' ', 'a', (short) 10, (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (-1), (int) (byte) 10);
    }

    @Test
    public void test05759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05759");
        int[] intArray4 = new int[] { (short) 1, '4', (-1), (short) 100 };
        int[] intArray8 = new int[] { '#', 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) -1, (int) (byte) 1);
    }

    @Test
    public void test05760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05760");
        int[] intArray3 = new int[] { (short) -1, 'a', (-1) };
        int[] intArray6 = new int[] { (byte) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) 0, (int) (byte) 0);
    }

    @Test
    public void test05761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05761");
        int[] intArray3 = new int[] { (byte) 0, ' ', (byte) 10 };
        int[] intArray7 = new int[] { 0, (byte) 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) '4', (int) (byte) 10);
    }

    @Test
    public void test05762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05762");
        int[] intArray3 = new int[] { (byte) 0, (byte) 100, '#' };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) ' ', (int) ' ');
    }

    @Test
    public void test05763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05763");
        int[] intArray6 = new int[] { 'a', 0, 'a', '#', (byte) 100, 'a' };
        int[] intArray10 = new int[] { (byte) 1, (byte) 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) '4', (-1));
    }

    @Test
    public void test05764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05764");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) -1, (int) (short) 1);
    }

    @Test
    public void test05765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05765");
        int[] intArray3 = new int[] { 0, 100, (short) -1 };
        int[] intArray8 = new int[] { 100, (byte) 0, (byte) 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (short) 0, (int) (short) 0);
    }

    @Test
    public void test05766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05766");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, 100, (int) (byte) 1);
    }

    @Test
    public void test05767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05767");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, 10, (int) (short) 100);
    }

    @Test
    public void test05768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05768");
        int[] intArray5 = new int[] { (byte) 1, 10, (short) -1, (byte) 10, (byte) -1 };
        int[] intArray11 = new int[] { ' ', (byte) 1, (byte) 1, (short) 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (-1), (int) (short) 0);
    }

    @Test
    public void test05769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05769");
        int[] intArray4 = new int[] { 10, (short) 10, (short) 0, (short) 0 };
        int[] intArray11 = new int[] { (short) 1, (short) 1, (byte) 10, (short) 1, (byte) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) 'a', 0);
    }

    @Test
    public void test05770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05770");
        int[] intArray3 = new int[] { (short) -1, 1, (byte) 10 };
        int[] intArray9 = new int[] { (short) 10, (short) -1, (-1), (short) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (byte) 10, (int) '#');
    }

    @Test
    public void test05771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05771");
        int[] intArray3 = new int[] { (byte) 1, 100, 10 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (byte) 10, (int) (byte) 0);
    }

    @Test
    public void test05772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05772");
        int[] intArray6 = new int[] { (short) -1, 1, (-1), (short) 10, ' ', (short) 100 };
        int[] intArray8 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 1, 100);
    }

    @Test
    public void test05773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05773");
        int[] intArray2 = new int[] { (byte) 100, '#' };
        int[] intArray7 = new int[] { '#', 10, (byte) 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) '#', (int) (short) 100);
    }

    @Test
    public void test05774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05774");
        int[] intArray6 = new int[] { (short) 0, 'a', (-1), (byte) 100, (byte) 0, ' ' };
        int[] intArray10 = new int[] { (short) 10, 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) 10, 1);
    }

    @Test
    public void test05775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05775");
        int[] intArray3 = new int[] { 1, (short) 1, (short) 10 };
        int[] intArray8 = new int[] { 0, (byte) 10, 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) '4', 10);
    }

    @Test
    public void test05776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05776");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) 0, ' ', ' ', ' ', (short) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) 'a', (int) (short) 0);
    }

    @Test
    public void test05777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05777");
        int[] intArray2 = new int[] { 100, 100 };
        int[] intArray6 = new int[] { (byte) 1, (short) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) '4', 10);
    }

    @Test
    public void test05778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05778");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { '#', (-1), (byte) 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 0, (int) (short) -1);
    }

    @Test
    public void test05779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05779");
        int[] intArray3 = new int[] { (byte) -1, (byte) 10, (short) -1 };
        int[] intArray9 = new int[] { '#', ' ', (short) 0, (short) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) 'a', (int) '#');
    }

    @Test
    public void test05780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05780");
        int[] intArray2 = new int[] { '4', 100 };
        int[] intArray5 = new int[] { 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) 'a', (int) ' ');
    }

    @Test
    public void test05781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05781");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray6 = new int[] { '#', (short) 10, (short) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) '4', (int) ' ');
    }

    @Test
    public void test05782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05782");
        int[] intArray5 = new int[] { (byte) -1, (-1), 100, ' ', (byte) 10 };
        int[] intArray10 = new int[] { 0, (-1), 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (byte) 100, (int) (short) -1);
    }

    @Test
    public void test05783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05783");
        int[] intArray1 = new int[] { 1 };
        int[] intArray6 = new int[] { ' ', (short) 0, '#', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (short) 0, (int) ' ');
    }

    @Test
    public void test05784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05784");
        int[] intArray2 = new int[] { 0, (byte) 1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) 1, 0);
    }

    @Test
    public void test05785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05785");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 0, (-1), '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, 1, 0);
    }

    @Test
    public void test05786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05786");
        int[] intArray6 = new int[] { (short) 0, (short) 10, (byte) 0, (-1), (short) 1, (byte) 0 };
        int[] intArray8 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 1, (int) '4');
    }

    @Test
    public void test05787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05787");
        int[] intArray6 = new int[] { (byte) 1, (byte) 0, (-1), (byte) 10, 'a', 'a' };
        int[] intArray12 = new int[] { (short) 10, (short) 100, 'a', (byte) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) 10, (int) 'a');
    }

    @Test
    public void test05788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05788");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray3 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) 100, (int) (byte) 1);
    }

    @Test
    public void test05789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05789");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test05790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05790");
        int[] intArray2 = new int[] { 100, (short) 10 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 0, (int) '#');
    }

    @Test
    public void test05791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05791");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (byte) -1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) -1, (int) ' ');
    }

    @Test
    public void test05792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05792");
        int[] intArray4 = new int[] { '#', 100, (byte) -1, (short) 100 };
        int[] intArray9 = new int[] { (-1), (short) 0, ' ', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (-1), 100);
    }

    @Test
    public void test05793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05793");
        int[] intArray6 = new int[] { (byte) 1, (short) 10, (byte) 10, 0, 10, (short) 10 };
        int[] intArray9 = new int[] { (short) 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, 1, (int) (byte) 100);
    }

    @Test
    public void test05794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05794");
        int[] intArray4 = new int[] { (short) 100, (byte) 10, (byte) 1, (byte) 1 };
        int[] intArray8 = new int[] { '#', (short) 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 100, (int) '4');
    }

    @Test
    public void test05795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05795");
        int[] intArray6 = new int[] { ' ', 10, (byte) 10, (byte) 0, (-1), (byte) -1 };
        int[] intArray9 = new int[] { 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, 0, 0);
    }

    @Test
    public void test05796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05796");
        int[] intArray5 = new int[] { ' ', (byte) 10, ' ', (byte) -1, (short) 0 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) ' ', 100);
    }

    @Test
    public void test05797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05797");
        int[] intArray4 = new int[] { (short) 0, ' ', 0, (byte) 0 };
        int[] intArray9 = new int[] { (byte) 10, (short) 10, '#', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (byte) 0, (int) (byte) 0);
    }

    @Test
    public void test05798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05798");
        int[] intArray3 = new int[] { ' ', (short) 0, 'a' };
        int[] intArray5 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) 1, (int) ' ');
    }

    @Test
    public void test05799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05799");
        int[] intArray6 = new int[] { (byte) 1, (byte) 10, (byte) 10, (short) -1, (short) 0, (short) -1 };
        int[] intArray13 = new int[] { '4', (short) 10, 1, 10, (-1), (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (short) 1, 0);
    }

    @Test
    public void test05800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05800");
        int[] intArray4 = new int[] { (byte) 1, 'a', 10, (byte) 10 };
        int[] intArray8 = new int[] { (short) -1, 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 0, (int) '#');
    }

    @Test
    public void test05801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05801");
        int[] intArray4 = new int[] { (byte) 1, (-1), (short) -1, (byte) 10 };
        int[] intArray6 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (short) -1, (int) (short) 10);
    }

    @Test
    public void test05802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05802");
        int[] intArray6 = new int[] { (short) 100, (-1), (short) -1, (byte) 0, 'a', (short) 100 };
        int[] intArray11 = new int[] { (short) 10, (short) 0, 'a', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (byte) 10, (int) (byte) 10);
    }

    @Test
    public void test05803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05803");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { '#', (short) -1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) 10, (int) (short) 10);
    }

    @Test
    public void test05804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05804");
        int[] intArray4 = new int[] { (byte) 10, 'a', (short) -1, 'a' };
        int[] intArray8 = new int[] { (byte) 100, ' ', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test05805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05805");
        int[] intArray3 = new int[] { '#', (byte) 100, '#' };
        int[] intArray5 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, 0, (-1));
    }

    @Test
    public void test05806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05806");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (-1), (-1), ' ', (byte) -1, (byte) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) 100, (int) (short) 0);
    }

    @Test
    public void test05807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05807");
        int[] intArray6 = new int[] { (byte) 100, ' ', (-1), (byte) 10, (short) 10, 10 };
        int[] intArray8 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) '#', (int) (byte) 0);
    }

    @Test
    public void test05808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05808");
        int[] intArray4 = new int[] { (short) 0, (byte) 1, (byte) 0, '4' };
        int[] intArray6 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 100, 1);
    }

    @Test
    public void test05809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05809");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, 0, (int) '#');
    }

    @Test
    public void test05810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05810");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray7 = new int[] { 1, (short) -1, (short) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) '4', (int) (short) 1);
    }

    @Test
    public void test05811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05811");
        int[] intArray4 = new int[] { (byte) 100, (short) 100, (byte) 100, 1 };
        int[] intArray7 = new int[] { '4', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) ' ', (int) (byte) -1);
    }

    @Test
    public void test05812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05812");
        int[] intArray5 = new int[] { (short) 0, (short) -1, (byte) 10, ' ', (short) 1 };
        int[] intArray11 = new int[] { (byte) 10, (byte) 1, ' ', (short) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test05813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05813");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray8 = new int[] { 10, (byte) 100, (byte) 0, (byte) 1, '4', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) 1, 0);
    }

    @Test
    public void test05814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05814");
        int[] intArray3 = new int[] { (short) 10, ' ', 1 };
        int[] intArray5 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test05815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05815");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray4 = new int[] { (short) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 100, (int) (short) 100);
    }

    @Test
    public void test05816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05816");
        int[] intArray2 = new int[] { (byte) 10, 100 };
        int[] intArray6 = new int[] { (byte) 0, (short) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) ' ', (int) (byte) 100);
    }

    @Test
    public void test05817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05817");
        int[] intArray4 = new int[] { (short) -1, '4', (byte) 0, (short) 100 };
        int[] intArray6 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (short) 1, 10);
    }

    @Test
    public void test05818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05818");
        int[] intArray4 = new int[] { (byte) 100, (byte) -1, 'a', (short) -1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (short) 1, (int) 'a');
    }

    @Test
    public void test05819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05819");
        int[] intArray2 = new int[] { '4', ' ' };
        int[] intArray8 = new int[] { (short) -1, (short) 100, (short) 0, (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (byte) 1, (int) (short) -1);
    }

    @Test
    public void test05820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05820");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 1, (short) 100, (byte) 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 0, 10);
    }

    @Test
    public void test05821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05821");
        int[] intArray3 = new int[] { (byte) 10, 10, 'a' };
        int[] intArray8 = new int[] { (byte) -1, (byte) 1, (byte) 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 1, 0);
    }

    @Test
    public void test05822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05822");
        int[] intArray5 = new int[] { ' ', 'a', '4', (byte) 1, (byte) 100 };
        int[] intArray7 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (-1), (int) (byte) 100);
    }

    @Test
    public void test05823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05823");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 'a', 0, ' ', (byte) 0, '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, 10, (-1));
    }

    @Test
    public void test05824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05824");
        int[] intArray5 = new int[] { 0, 10, (byte) 10, (byte) 100, (short) 10 };
        int[] intArray8 = new int[] { 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 0, 0);
    }

    @Test
    public void test05825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05825");
        int[] intArray1 = new int[] { 10 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) '4', 100);
    }

    @Test
    public void test05826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05826");
        int[] intArray4 = new int[] { (short) 1, '4', 1, (short) 10 };
        int[] intArray10 = new int[] { (-1), (-1), 1, 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) ' ', (-1));
    }

    @Test
    public void test05827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05827");
        int[] intArray3 = new int[] { (short) -1, '4', 0 };
        int[] intArray8 = new int[] { (short) 100, (byte) 10, '4', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) 'a', 10);
    }

    @Test
    public void test05828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05828");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) 0 };
        int[] intArray7 = new int[] { (byte) -1, (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) 0, (int) (byte) 100);
    }

    @Test
    public void test05829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05829");
        int[] intArray4 = new int[] { (short) 10, (byte) 100, (-1), '4' };
        int[] intArray9 = new int[] { (byte) 0, (byte) 0, (short) 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 0, 1);
    }

    @Test
    public void test05830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05830");
        int[] intArray1 = new int[] { 100 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 1, (int) (byte) 0);
    }

    @Test
    public void test05831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05831");
        int[] intArray5 = new int[] { (byte) 0, 0, '#', (short) 1, (byte) -1 };
        int[] intArray8 = new int[] { (short) -1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 0, (int) '4');
    }

    @Test
    public void test05832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05832");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, 0, (int) (short) 100);
    }

    @Test
    public void test05833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05833");
        int[] intArray4 = new int[] { (short) 100, 1, 100, 100 };
        int[] intArray6 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (short) 1, (int) '4');
    }

    @Test
    public void test05834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05834");
        int[] intArray5 = new int[] { ' ', (byte) -1, (byte) -1, '4', 10 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) '4', (-1));
    }

    @Test
    public void test05835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05835");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 0, 0, ' ', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) -1, (int) (short) 10);
    }

    @Test
    public void test05836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05836");
        int[] intArray6 = new int[] { (short) 100, (short) -1, (short) 10, 0, (byte) 1, 1 };
        int[] intArray11 = new int[] { 'a', (byte) 10, (byte) 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) ' ', (int) (short) 1);
    }

    @Test
    public void test05837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05837");
        int[] intArray3 = new int[] { (short) 1, '#', (-1) };
        int[] intArray8 = new int[] { 1, (short) 0, (short) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) 'a', 0);
    }

    @Test
    public void test05838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05838");
        int[] intArray2 = new int[] { (byte) 1, 1 };
        int[] intArray6 = new int[] { (byte) 10, ' ', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) '4', (int) (byte) 100);
    }

    @Test
    public void test05839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05839");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray7 = new int[] { (byte) 10, (-1), (short) -1, (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) 0, 1);
    }

    @Test
    public void test05840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05840");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray5 = new int[] { 1, '#', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) 1, 1);
    }

    @Test
    public void test05841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05841");
        int[] intArray6 = new int[] { (byte) 10, (byte) 100, 0, (byte) -1, 'a', '4' };
        int[] intArray11 = new int[] { ' ', (short) -1, (byte) 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 100, (int) (short) 10);
    }

    @Test
    public void test05842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05842");
        int[] intArray6 = new int[] { (byte) 1, (short) 0, '#', (byte) -1, '#', (byte) 10 };
        int[] intArray8 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (byte) 100, (-1));
    }

    @Test
    public void test05843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05843");
        int[] intArray2 = new int[] { 'a', (byte) 100 };
        int[] intArray8 = new int[] { (byte) 0, (byte) 1, 1, (byte) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) ' ', (int) (byte) 10);
    }

    @Test
    public void test05844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05844");
        int[] intArray6 = new int[] { 1, 1, (byte) 1, (byte) -1, (short) 10, 0 };
        int[] intArray8 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) '#', (int) (byte) 10);
    }

    @Test
    public void test05845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05845");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test05846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05846");
        int[] intArray1 = new int[] { 10 };
        int[] intArray8 = new int[] { 'a', '#', (short) 10, (short) 0, 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) 100, (-1));
    }

    @Test
    public void test05847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05847");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (byte) 100, (-1));
    }

    @Test
    public void test05848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05848");
        int[] intArray2 = new int[] { (byte) -1, (-1) };
        int[] intArray9 = new int[] { (byte) -1, (byte) 1, 'a', 100, 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (byte) 1, 100);
    }

    @Test
    public void test05849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05849");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray7 = new int[] { (short) -1, '4', (-1), '4', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) 0, 100);
    }

    @Test
    public void test05850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05850");
        int[] intArray3 = new int[] { 1, ' ', (short) 1 };
        int[] intArray6 = new int[] { (short) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, 0, (int) (byte) 10);
    }

    @Test
    public void test05851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05851");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 10, '4', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, 1, (int) (short) 10);
    }

    @Test
    public void test05852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05852");
        int[] intArray6 = new int[] { '4', '4', (short) 100, (byte) 1, 'a', (byte) 10 };
        int[] intArray12 = new int[] { 10, 0, 'a', 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 10, (int) (short) -1);
    }

    @Test
    public void test05853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05853");
        int[] intArray3 = new int[] { (byte) -1, (byte) 0, (byte) 0 };
        int[] intArray5 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) 'a', (int) (byte) 100);
    }

    @Test
    public void test05854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05854");
        int[] intArray5 = new int[] { (short) 100, ' ', (short) 100, ' ', (short) 1 };
        int[] intArray9 = new int[] { (short) 10, (short) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 1, (int) '#');
    }

    @Test
    public void test05855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05855");
        int[] intArray6 = new int[] { (short) -1, (short) -1, (byte) 0, (short) -1, (-1), (short) -1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) -1, (int) (byte) 100);
    }

    @Test
    public void test05856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05856");
        int[] intArray4 = new int[] { (-1), (short) -1, (byte) 10, '#' };
        int[] intArray6 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) 'a', (int) (short) 100);
    }

    @Test
    public void test05857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05857");
        int[] intArray4 = new int[] { (byte) -1, 0, (byte) 100, (byte) -1 };
        int[] intArray11 = new int[] { (-1), (byte) 10, (byte) 10, (short) 10, '#', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, 10, (int) 'a');
    }

    @Test
    public void test05858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05858");
        int[] intArray6 = new int[] { (byte) 100, (byte) 10, ' ', (-1), 10, (short) 1 };
        int[] intArray13 = new int[] { (-1), (short) -1, '4', 10, '#', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (short) 0, (int) (short) 100);
    }

    @Test
    public void test05859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05859");
        int[] intArray5 = new int[] { (short) 1, (short) 1, 'a', (short) 10, (short) 0 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (short) 1, (int) (short) -1);
    }

    @Test
    public void test05860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05860");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) 0, (short) -1, (byte) 100, (byte) -1, (short) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) '#', (int) (short) -1);
    }

    @Test
    public void test05861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05861");
        int[] intArray2 = new int[] { (byte) 100, (byte) 0 };
        int[] intArray8 = new int[] { (byte) 100, '4', (short) 10, (short) -1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (byte) 10, 1);
    }

    @Test
    public void test05862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05862");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray7 = new int[] { 1, (short) 100, (byte) 0, 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, 100, 0);
    }

    @Test
    public void test05863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05863");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray4 = new int[] { (short) 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (short) 1, 0);
    }

    @Test
    public void test05864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05864");
        int[] intArray3 = new int[] { (byte) -1, (byte) -1, (-1) };
        int[] intArray6 = new int[] { '#', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) 0, (int) (byte) 100);
    }

    @Test
    public void test05865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05865");
        int[] intArray5 = new int[] { 0, 100, (byte) 1, (short) -1, '4' };
        int[] intArray10 = new int[] { '4', '4', (short) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 0, (int) '#');
    }

    @Test
    public void test05866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05866");
        int[] intArray4 = new int[] { (byte) 100, 100, (byte) 0, (short) -1 };
        int[] intArray10 = new int[] { 'a', (byte) 1, 'a', (short) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (byte) 1, 100);
    }

    @Test
    public void test05867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05867");
        int[] intArray3 = new int[] { ' ', (byte) -1, (byte) 0 };
        int[] intArray9 = new int[] { (short) -1, (byte) 100, 100, 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (short) 1, 10);
    }

    @Test
    public void test05868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05868");
        int[] intArray5 = new int[] { (short) 1, 10, (short) -1, (byte) -1, (byte) 0 };
        int[] intArray11 = new int[] { 1, 10, 1, (byte) 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) 'a', (int) (byte) 10);
    }

    @Test
    public void test05869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05869");
        int[] intArray2 = new int[] { '#', (byte) -1 };
        int[] intArray8 = new int[] { '#', (byte) 0, '4', 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) 0, (-1));
    }

    @Test
    public void test05870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05870");
        int[] intArray6 = new int[] { (byte) 100, 100, 'a', '#', 100, 0 };
        int[] intArray8 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (-1), (int) (short) 0);
    }

    @Test
    public void test05871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05871");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, 100, (int) (short) -1);
    }

    @Test
    public void test05872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05872");
        int[] intArray6 = new int[] { (byte) 100, 0, (byte) 1, (byte) 100, (short) 0, (byte) 10 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) 100, (int) (byte) 0);
    }

    @Test
    public void test05873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05873");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 1, (int) '4');
    }

    @Test
    public void test05874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05874");
        int[] intArray4 = new int[] { (byte) -1, (short) 0, (byte) 10, (byte) 0 };
        int[] intArray8 = new int[] { 'a', (short) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 100, (int) '4');
    }

    @Test
    public void test05875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05875");
        int[] intArray4 = new int[] { 10, '4', (byte) 100, (short) -1 };
        int[] intArray10 = new int[] { (byte) 10, ' ', '#', (short) 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) 0, (int) (short) 1);
    }

    @Test
    public void test05876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05876");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, 10, (int) '4');
    }

    @Test
    public void test05877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05877");
        int[] intArray6 = new int[] { (byte) 1, (short) 100, '4', (short) 10, (short) 1, '#' };
        int[] intArray9 = new int[] { 'a', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 100, 0);
    }

    @Test
    public void test05878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05878");
        int[] intArray3 = new int[] { 1, (-1), (short) 10 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) ' ', (int) (byte) 100);
    }

    @Test
    public void test05879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05879");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (byte) -1, (-1));
    }

    @Test
    public void test05880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05880");
        int[] intArray2 = new int[] { (short) 100, 'a' };
        int[] intArray9 = new int[] { 100, (byte) 1, (byte) 0, 1, (byte) 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 0, (int) 'a');
    }

    @Test
    public void test05881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05881");
        int[] intArray3 = new int[] { ' ', 100, '#' };
        int[] intArray5 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) 1, 0);
    }

    @Test
    public void test05882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05882");
        int[] intArray4 = new int[] { (-1), '4', 'a', (-1) };
        int[] intArray9 = new int[] { (short) 1, (byte) 100, (byte) 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) 100, (int) '#');
    }

    @Test
    public void test05883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05883");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 10, (short) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) '4', (int) (short) 100);
    }

    @Test
    public void test05884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05884");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) 0, (short) 10, (byte) -1, (byte) 0, (byte) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) 0, 1);
    }

    @Test
    public void test05885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05885");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) '#', (int) (short) 100);
    }

    @Test
    public void test05886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05886");
        int[] intArray3 = new int[] { (byte) 100, (byte) 0, 100 };
        int[] intArray10 = new int[] { 'a', (short) 10, (byte) 1, '#', (short) -1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 10, (int) ' ');
    }

    @Test
    public void test05887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05887");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray4 = new int[] { (byte) 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (short) 100, (-1));
    }

    @Test
    public void test05888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05888");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (byte) 0, 10);
    }

    @Test
    public void test05889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05889");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray7 = new int[] { (byte) 10, (short) 100, (byte) 0, (byte) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) 100, (int) (short) 1);
    }

    @Test
    public void test05890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05890");
        int[] intArray6 = new int[] { (byte) -1, (-1), 10, 10, (short) 0, (byte) -1 };
        int[] intArray11 = new int[] { '#', (-1), (byte) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) 'a', (int) (short) 100);
    }

    @Test
    public void test05891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05891");
        int[] intArray4 = new int[] { (short) -1, (byte) 10, 100, (byte) -1 };
        int[] intArray10 = new int[] { '#', 1, (byte) 10, (byte) 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) 10, (int) (byte) 10);
    }

    @Test
    public void test05892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05892");
        int[] intArray4 = new int[] { (short) 0, 0, 1, '4' };
        int[] intArray7 = new int[] { (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 10, (int) (short) 10);
    }

    @Test
    public void test05893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05893");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) -1, (byte) 100, (short) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 0, (int) (short) 100);
    }

    @Test
    public void test05894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05894");
        int[] intArray1 = new int[] { '#' };
        int[] intArray4 = new int[] { 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, 10, (int) (short) -1);
    }

    @Test
    public void test05895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05895");
        int[] intArray2 = new int[] { (byte) 1, (-1) };
        int[] intArray5 = new int[] { (-1), (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (-1), (int) (short) 0);
    }

    @Test
    public void test05896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05896");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) -1, '#', (short) -1, 100, (short) 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) 10, 10);
    }

    @Test
    public void test05897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05897");
        int[] intArray4 = new int[] { (short) 10, 0, (byte) 10, (short) -1 };
        int[] intArray7 = new int[] { '#', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) -1, (-1));
    }

    @Test
    public void test05898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05898");
        int[] intArray6 = new int[] { 0, ' ', ' ', 0, 0, (byte) 0 };
        int[] intArray11 = new int[] { 0, (short) -1, (byte) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (byte) 0, 0);
    }

    @Test
    public void test05899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05899");
        int[] intArray1 = new int[] { '4' };
        int[] intArray4 = new int[] { (byte) 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (short) 100, (-1));
    }

    @Test
    public void test05900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05900");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray4 = new int[] { (byte) 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, 100, 1);
    }

    @Test
    public void test05901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05901");
        int[] intArray6 = new int[] { (-1), 10, 0, 10, 100, (byte) 100 };
        int[] intArray11 = new int[] { (byte) 1, (-1), (short) 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (short) 0, (int) (short) -1);
    }

    @Test
    public void test05902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05902");
        int[] intArray6 = new int[] { 100, ' ', (short) -1, (-1), 0, (byte) -1 };
        int[] intArray13 = new int[] { ' ', (byte) 0, (-1), (byte) 100, (short) 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (byte) -1, (int) (byte) 1);
    }

    @Test
    public void test05903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05903");
        int[] intArray5 = new int[] { 1, (byte) 100, (short) 1, (byte) -1, (short) 10 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 1, (int) '#');
    }

    @Test
    public void test05904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05904");
        int[] intArray6 = new int[] { (short) 100, (byte) -1, ' ', (byte) 1, (short) 100, '4' };
        int[] intArray9 = new int[] { (short) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, 10, (int) (short) 0);
    }

    @Test
    public void test05905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05905");
        int[] intArray6 = new int[] { (short) 0, (short) 0, 100, 100, (short) -1, '4' };
        int[] intArray12 = new int[] { '4', (short) 100, 0, (short) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (byte) 100, (int) ' ');
    }

    @Test
    public void test05906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05906");
        int[] intArray6 = new int[] { 0, ' ', (-1), (short) 10, ' ', (byte) -1 };
        int[] intArray8 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (byte) 10, 1);
    }

    @Test
    public void test05907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05907");
        int[] intArray4 = new int[] { (short) 100, ' ', (-1), 1 };
        int[] intArray6 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) '4', (int) (byte) 10);
    }

    @Test
    public void test05908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05908");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray3 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) -1, (int) (short) 10);
    }

    @Test
    public void test05909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05909");
        int[] intArray5 = new int[] { (short) -1, '4', (short) -1, (short) 10, (byte) 1 };
        int[] intArray12 = new int[] { (short) 10, (short) 1, (byte) -1, '4', (-1), (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test05910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05910");
        int[] intArray6 = new int[] { 0, '#', (short) -1, 0, 100, 'a' };
        int[] intArray9 = new int[] { (short) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, 100, (int) (short) 10);
    }

    @Test
    public void test05911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05911");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray7 = new int[] { (-1), (byte) 100, '#', 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, 100, (int) (short) 100);
    }

    @Test
    public void test05912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05912");
        int[] intArray6 = new int[] { 1, '4', 'a', 'a', 'a', '4' };
        int[] intArray10 = new int[] { 0, '#', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test05913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05913");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) '#', 10);
    }

    @Test
    public void test05914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05914");
        int[] intArray5 = new int[] { 10, 10, 0, (byte) 100, 'a' };
        int[] intArray9 = new int[] { (byte) 1, '#', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 10, (int) (byte) 10);
    }

    @Test
    public void test05915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05915");
        int[] intArray5 = new int[] { '4', (byte) -1, 10, (short) 0, 100 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) 100, (int) '#');
    }

    @Test
    public void test05916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05916");
        int[] intArray6 = new int[] { (short) 10, (byte) 1, (short) 0, ' ', (byte) -1, (byte) 0 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, 0, (int) (short) 0);
    }

    @Test
    public void test05917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05917");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray7 = new int[] { (short) 100, (short) -1, (short) 0, (short) -1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) '#', (int) (short) 1);
    }

    @Test
    public void test05918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05918");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int[] intArray7 = new int[] { (short) 0, 10, 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (short) 0, (-1));
    }

    @Test
    public void test05919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05919");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray5 = new int[] { (-1), 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) 1, 0);
    }

    @Test
    public void test05920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05920");
        int[] intArray2 = new int[] { (byte) -1, 1 };
        int[] intArray9 = new int[] { ' ', 'a', (-1), ' ', '4', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) 'a', 0);
    }

    @Test
    public void test05921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05921");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) 1, (int) '4');
    }

    @Test
    public void test05922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05922");
        int[] intArray1 = new int[] { '#' };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) 0, 1);
    }

    @Test
    public void test05923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05923");
        int[] intArray6 = new int[] { (short) 0, 0, 0, '4', '#', (byte) 10 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, 10, (int) (byte) 10);
    }

    @Test
    public void test05924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05924");
        int[] intArray3 = new int[] { 100, (short) 0, (short) 10 };
        int[] intArray9 = new int[] { 0, 1, (short) 0, (byte) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (byte) 0, 0);
    }

    @Test
    public void test05925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05925");
        int[] intArray3 = new int[] { (byte) 0, 1, '#' };
        int[] intArray9 = new int[] { 10, (byte) 1, (byte) 1, '#', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 10, 0);
    }

    @Test
    public void test05926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05926");
        int[] intArray3 = new int[] { (byte) 100, 'a', '4' };
        int[] intArray10 = new int[] { (byte) 0, 10, (short) 0, (byte) 100, '#', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (byte) 1, 0);
    }

    @Test
    public void test05927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05927");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 1, (byte) 100, (short) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) '#', (int) (byte) 100);
    }

    @Test
    public void test05928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05928");
        int[] intArray5 = new int[] { (byte) 0, 1, '#', (short) 100, (short) -1 };
        int[] intArray8 = new int[] { (short) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) 1, 1);
    }

    @Test
    public void test05929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05929");
        int[] intArray2 = new int[] { (-1), (byte) 100 };
        int[] intArray4 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 100, (int) 'a');
    }

    @Test
    public void test05930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05930");
        int[] intArray1 = new int[] { '#' };
        int[] intArray4 = new int[] { ' ', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 1, 10);
    }

    @Test
    public void test05931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05931");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray3 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) ' ', 1);
    }

    @Test
    public void test05932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05932");
        int[] intArray6 = new int[] { (short) 1, (short) 1, 10, (byte) 1, '#', 'a' };
        int[] intArray9 = new int[] { (byte) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, 1, 0);
    }

    @Test
    public void test05933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05933");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 10, (short) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) 0, (int) ' ');
    }

    @Test
    public void test05934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05934");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray3 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, 1, (int) '4');
    }

    @Test
    public void test05935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05935");
        int[] intArray6 = new int[] { ' ', (short) 100, (byte) 10, (byte) 0, (byte) -1, 10 };
        int[] intArray13 = new int[] { (short) 100, (byte) 100, (short) 1, (byte) 10, (short) 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (-1), (int) (byte) 1);
    }

    @Test
    public void test05936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05936");
        int[] intArray5 = new int[] { (byte) 100, (byte) 10, '#', (byte) -1, (byte) -1 };
        int[] intArray8 = new int[] { 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) 10, (int) (byte) 10);
    }

    @Test
    public void test05937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05937");
        int[] intArray5 = new int[] { 100, 0, 100, (short) 0, 100 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 10, (int) '#');
    }

    @Test
    public void test05938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05938");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray7 = new int[] { (short) 10, '#', 10, (short) 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, 10, (int) '4');
    }

    @Test
    public void test05939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05939");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (byte) -1, (short) -1, (short) -1, (byte) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, 0, (int) (short) 100);
    }

    @Test
    public void test05940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05940");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray5 = new int[] { '#', (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (byte) 1, (int) (short) 100);
    }

    @Test
    public void test05941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05941");
        int[] intArray5 = new int[] { (short) 1, 1, (-1), (byte) 1, 10 };
        int[] intArray7 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (short) 1, (int) (short) 0);
    }

    @Test
    public void test05942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05942");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray4 = new int[] { 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (short) -1, (int) (short) 100);
    }

    @Test
    public void test05943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05943");
        int[] intArray3 = new int[] { (byte) 100, (short) -1, ' ' };
        int[] intArray5 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (-1), (int) (short) 1);
    }

    @Test
    public void test05944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05944");
        int[] intArray3 = new int[] { 'a', 'a', (byte) 1 };
        int[] intArray8 = new int[] { 0, (byte) -1, ' ', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 0, (int) (short) 100);
    }

    @Test
    public void test05945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05945");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 100, (-1), (short) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 100, (int) (byte) 100);
    }

    @Test
    public void test05946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05946");
        int[] intArray5 = new int[] { 100, 100, (short) 1, ' ', (byte) 100 };
        int[] intArray12 = new int[] { 'a', (short) 1, 'a', (byte) 10, '#', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (byte) 0, (int) '4');
    }

    @Test
    public void test05947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05947");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 100, (byte) 100, (short) 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 0, (int) '4');
    }

    @Test
    public void test05948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05948");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray3 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, 0, (int) (byte) 0);
    }

    @Test
    public void test05949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05949");
        int[] intArray5 = new int[] { 0, 10, (byte) 100, '4', 1 };
        int[] intArray11 = new int[] { (-1), (byte) 0, 'a', (byte) 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (-1), (int) (byte) 100);
    }

    @Test
    public void test05950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05950");
        int[] intArray6 = new int[] { 100, '#', (-1), (-1), (byte) 0, (byte) 1 };
        int[] intArray10 = new int[] { 0, 'a', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) '#', 1);
    }

    @Test
    public void test05951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05951");
        int[] intArray4 = new int[] { '#', (byte) -1, 100, 10 };
        int[] intArray9 = new int[] { (byte) 100, (byte) -1, (byte) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) 0, (int) '#');
    }

    @Test
    public void test05952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05952");
        int[] intArray6 = new int[] { (short) -1, (byte) 0, (byte) -1, ' ', (short) 10, (short) 0 };
        int[] intArray10 = new int[] { (short) 0, (byte) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (short) -1, (int) ' ');
    }

    @Test
    public void test05953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05953");
        int[] intArray3 = new int[] { (short) -1, (short) 1, '#' };
        int[] intArray8 = new int[] { (byte) 100, ' ', (byte) 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 100, (int) (short) -1);
    }

    @Test
    public void test05954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05954");
        int[] intArray5 = new int[] { 0, (-1), (byte) 100, (byte) 10, (byte) 0 };
        int[] intArray10 = new int[] { (byte) -1, 'a', (short) -1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (short) 0, (int) 'a');
    }

    @Test
    public void test05955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05955");
        int[] intArray5 = new int[] { (short) -1, '4', (byte) 0, (byte) 10, (short) 1 };
        int[] intArray11 = new int[] { 100, 10, '4', (byte) 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) 0, (int) (short) 1);
    }

    @Test
    public void test05956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05956");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) 0, 10, (byte) 10, (short) 100, (byte) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (-1), (int) (short) 0);
    }

    @Test
    public void test05957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05957");
        int[] intArray5 = new int[] { (short) 0, 0, (byte) 1, 'a', (short) 100 };
        int[] intArray9 = new int[] { (-1), (short) 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) 'a', (int) '4');
    }

    @Test
    public void test05958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05958");
        int[] intArray5 = new int[] { (byte) -1, (byte) 10, (short) 10, (short) 10, 'a' };
        int[] intArray11 = new int[] { (short) -1, ' ', '#', 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 10, (int) '4');
    }

    @Test
    public void test05959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05959");
        int[] intArray6 = new int[] { (short) 0, '#', (byte) 0, 'a', (byte) -1, (short) 1 };
        int[] intArray9 = new int[] { 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 1, (int) (byte) 10);
    }

    @Test
    public void test05960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05960");
        int[] intArray4 = new int[] { (short) 1, (short) 0, (-1), 'a' };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (byte) 0, (int) (byte) -1);
    }

    @Test
    public void test05961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05961");
        int[] intArray2 = new int[] { (byte) 10, 10 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test05962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05962");
        int[] intArray2 = new int[] { (short) 10, (byte) -1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) ' ', (int) 'a');
    }

    @Test
    public void test05963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05963");
        int[] intArray5 = new int[] { '4', (byte) 100, (byte) 100, (byte) 100, 'a' };
        int[] intArray8 = new int[] { (short) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 0, (int) (byte) -1);
    }

    @Test
    public void test05964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05964");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray8 = new int[] { (short) 10, (-1), ' ', (short) 100, (short) 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 1, (int) (short) -1);
    }

    @Test
    public void test05965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05965");
        int[] intArray3 = new int[] { 0, ' ', (byte) 0 };
        int[] intArray10 = new int[] { 'a', 1, 'a', (-1), (short) 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) 'a', (int) (short) 10);
    }

    @Test
    public void test05966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05966");
        int[] intArray3 = new int[] { (byte) 100, (short) -1, '4' };
        int[] intArray9 = new int[] { ' ', ' ', 10, (short) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test05967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05967");
        int[] intArray2 = new int[] { 1, 0 };
        int[] intArray7 = new int[] { (short) 1, (short) 1, 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (short) 10, (int) (byte) 100);
    }

    @Test
    public void test05968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05968");
        int[] intArray5 = new int[] { (-1), (short) 0, 'a', ' ', (byte) 10 };
        int[] intArray11 = new int[] { '4', 1, (short) 1, (short) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (-1), (int) '#');
    }

    @Test
    public void test05969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05969");
        int[] intArray2 = new int[] { (byte) 1, (byte) 10 };
        int[] intArray7 = new int[] { (short) 10, 0, (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 100, (int) (byte) 100);
    }

    @Test
    public void test05970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05970");
        int[] intArray5 = new int[] { '#', '4', 10, 0, (short) -1 };
        int[] intArray10 = new int[] { 10, ' ', ' ', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (byte) 10, 1);
    }

    @Test
    public void test05971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05971");
        int[] intArray6 = new int[] { 10, 100, (-1), (short) 100, (byte) 10, (short) 1 };
        int[] intArray12 = new int[] { (short) 1, '#', (byte) 100, (short) 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (byte) -1, (int) '#');
    }

    @Test
    public void test05972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05972");
        int[] intArray5 = new int[] { 0, (short) -1, (-1), 0, 100 };
        int[] intArray9 = new int[] { 'a', (short) 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 1, (int) (short) 10);
    }

    @Test
    public void test05973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05973");
        int[] intArray4 = new int[] { 100, 100, 100, (byte) -1 };
        int[] intArray8 = new int[] { (-1), (byte) 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 100, (int) '4');
    }

    @Test
    public void test05974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05974");
        int[] intArray5 = new int[] { (short) 100, (short) -1, 0, (byte) 0, 1 };
        int[] intArray10 = new int[] { 1, ' ', (byte) 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) '#', 100);
    }

    @Test
    public void test05975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05975");
        int[] intArray3 = new int[] { '#', '#', 1 };
        int[] intArray6 = new int[] { 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) 10, 0);
    }

    @Test
    public void test05976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05976");
        int[] intArray4 = new int[] { 100, (byte) -1, ' ', 10 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (short) 100, 1);
    }

    @Test
    public void test05977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05977");
        int[] intArray2 = new int[] { (short) 0, (byte) 0 };
        int[] intArray6 = new int[] { (byte) 10, (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 0, (int) (short) 100);
    }

    @Test
    public void test05978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05978");
        int[] intArray5 = new int[] { (byte) -1, '#', ' ', (byte) 10, 100 };
        int[] intArray10 = new int[] { (short) 0, '#', 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (short) 10, 100);
    }

    @Test
    public void test05979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05979");
        int[] intArray5 = new int[] { (byte) 100, (-1), ' ', (short) 10, (short) 1 };
        int[] intArray9 = new int[] { (short) 1, 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) 'a', (int) '#');
    }

    @Test
    public void test05980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05980");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray5 = new int[] { (byte) 1, 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) -1, (int) 'a');
    }

    @Test
    public void test05981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05981");
        int[] intArray6 = new int[] { (byte) 1, 100, (short) 100, 10, 0, (byte) 0 };
        int[] intArray8 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (-1), (int) (short) 1);
    }

    @Test
    public void test05982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05982");
        int[] intArray4 = new int[] { (byte) 100, 1, (byte) -1, (short) 100 };
        int[] intArray8 = new int[] { (byte) 1, (byte) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) ' ', (int) (byte) 100);
    }

    @Test
    public void test05983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05983");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { '4', '4', 'a', (short) 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, 0, 10);
    }

    @Test
    public void test05984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05984");
        int[] intArray2 = new int[] { 1, ' ' };
        int[] intArray6 = new int[] { (short) 0, (byte) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) '4', 1);
    }

    @Test
    public void test05985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05985");
        int[] intArray5 = new int[] { (byte) 0, (short) 100, 100, 10, (byte) 10 };
        int[] intArray8 = new int[] { (short) -1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 10, (int) (short) -1);
    }

    @Test
    public void test05986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05986");
        int[] intArray4 = new int[] { (short) 100, '#', 100, (byte) -1 };
        int[] intArray6 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, 0, (int) '#');
    }

    @Test
    public void test05987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05987");
        int[] intArray5 = new int[] { 0, ' ', 100, 'a', (byte) 1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (-1), (int) (short) 100);
    }

    @Test
    public void test05988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05988");
        int[] intArray5 = new int[] { (short) 10, ' ', (byte) 10, (short) -1, (short) 100 };
        int[] intArray8 = new int[] { '#', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 0, (int) (short) 100);
    }

    @Test
    public void test05989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05989");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 100, 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) 10, (int) (short) 10);
    }

    @Test
    public void test05990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05990");
        int[] intArray3 = new int[] { 'a', 'a', (-1) };
        int[] intArray7 = new int[] { '4', 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) 1, (int) (short) 100);
    }

    @Test
    public void test05991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05991");
        int[] intArray2 = new int[] { 0, (short) 10 };
        int[] intArray7 = new int[] { (byte) 100, 1, '#', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (short) 1, 10);
    }

    @Test
    public void test05992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05992");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 1, (int) '#');
    }

    @Test
    public void test05993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05993");
        int[] intArray2 = new int[] { 'a', ' ' };
        int[] intArray9 = new int[] { (short) -1, '#', (byte) 0, 10, (short) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) ' ', 0);
    }

    @Test
    public void test05994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05994");
        int[] intArray3 = new int[] { '4', (short) 100, '4' };
        int[] intArray5 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) 1, (int) 'a');
    }

    @Test
    public void test05995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05995");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 'a', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) 'a', (int) '#');
    }

    @Test
    public void test05996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05996");
        int[] intArray6 = new int[] { (short) 0, (short) -1, '#', 0, 100, (-1) };
        int[] intArray12 = new int[] { (byte) 0, 'a', (byte) 1, 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) 'a', (int) (byte) -1);
    }

    @Test
    public void test05997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05997");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 1, (-1), (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, 100, 0);
    }

    @Test
    public void test05998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05998");
        int[] intArray4 = new int[] { 1, 1, (short) 1, (byte) -1 };
        int[] intArray7 = new int[] { (byte) 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 0, (-1));
    }

    @Test
    public void test05999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test05999");
        int[] intArray5 = new int[] { '4', (short) 100, 'a', (short) 100, (short) 100 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 10, (int) 'a');
    }

    @Test
    public void test06000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test06000");
        int[] intArray6 = new int[] { 0, 'a', (short) 1, 100, (short) 100, '4' };
        int[] intArray8 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 100, (-1));
    }
}

