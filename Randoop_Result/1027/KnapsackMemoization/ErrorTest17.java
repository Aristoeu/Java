package KnapsackMemoization;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest17 {

    public static boolean debug = false;

    @Test
    public void test08501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08501");
        int[] intArray6 = new int[] { 10, (short) 10, (byte) 10, (short) 100, (short) 100, 10 };
        int[] intArray12 = new int[] { (byte) 0, ' ', 10, 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) ' ', 100);
    }

    @Test
    public void test08502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08502");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (short) 0, (-1));
    }

    @Test
    public void test08503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08503");
        int[] intArray4 = new int[] { 100, (short) -1, 1, (byte) 10 };
        int[] intArray8 = new int[] { 100, (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) -1, (int) (short) 100);
    }

    @Test
    public void test08504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08504");
        int[] intArray4 = new int[] { '4', (-1), (byte) -1, '4' };
        int[] intArray11 = new int[] { (byte) 0, ' ', (byte) 10, (-1), (byte) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, 0, 1);
    }

    @Test
    public void test08505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08505");
        int[] intArray4 = new int[] { (short) 0, (byte) 100, (short) 10, '4' };
        int[] intArray9 = new int[] { (short) 1, (short) -1, (byte) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) 'a', 10);
    }

    @Test
    public void test08506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08506");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 100, (byte) 100, 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test08507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08507");
        int[] intArray3 = new int[] { '#', ' ', (short) 100 };
        int[] intArray6 = new int[] { (short) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) 100, (int) (byte) 1);
    }

    @Test
    public void test08508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08508");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray3 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (byte) 1, (int) (short) -1);
    }

    @Test
    public void test08509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08509");
        int[] intArray6 = new int[] { (byte) -1, 100, (byte) 10, (byte) 1, 100, (byte) 1 };
        int[] intArray13 = new int[] { (short) 10, ' ', '4', (byte) 1, '#', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) 'a', (int) (short) -1);
    }

    @Test
    public void test08510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08510");
        int[] intArray3 = new int[] { (short) 0, 100, '4' };
        int[] intArray10 = new int[] { (byte) 10, (byte) 0, (short) 100, (short) 10, (byte) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 100, (int) (short) 100);
    }

    @Test
    public void test08511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08511");
        int[] intArray4 = new int[] { ' ', 'a', 100, (byte) -1 };
        int[] intArray11 = new int[] { (byte) 10, (byte) 10, (short) 0, 'a', (short) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) '4', (-1));
    }

    @Test
    public void test08512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08512");
        int[] intArray4 = new int[] { ' ', '#', (byte) 100, 0 };
        int[] intArray9 = new int[] { (short) 10, (short) 1, (byte) 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 10, (int) (short) 1);
    }

    @Test
    public void test08513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08513");
        int[] intArray5 = new int[] { (short) -1, (short) 10, (short) -1, ' ', '#' };
        int[] intArray9 = new int[] { (byte) 1, 'a', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (byte) 100, 0);
    }

    @Test
    public void test08514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08514");
        int[] intArray5 = new int[] { 100, (short) 0, (byte) 1, 0, 10 };
        int[] intArray9 = new int[] { '#', 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 10, (int) '4');
    }

    @Test
    public void test08515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08515");
        int[] intArray3 = new int[] { 1, 0, 0 };
        int[] intArray9 = new int[] { (short) 1, '4', (byte) 100, (short) 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 0, (int) (byte) 10);
    }

    @Test
    public void test08516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08516");
        int[] intArray5 = new int[] { (short) 0, (byte) 0, (-1), (byte) 10, 10 };
        int[] intArray11 = new int[] { (short) 1, 100, 0, 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) 0, 1);
    }

    @Test
    public void test08517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08517");
        int[] intArray4 = new int[] { (short) 0, '#', 100, (byte) 10 };
        int[] intArray8 = new int[] { (byte) 0, 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 0, (int) (short) 100);
    }

    @Test
    public void test08518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08518");
        int[] intArray3 = new int[] { (short) 1, 'a', (short) -1 };
        int[] intArray9 = new int[] { (byte) 0, (byte) 10, 0, '4', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 10, (int) (short) 1);
    }

    @Test
    public void test08519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08519");
        int[] intArray5 = new int[] { (byte) 1, (short) 1, (byte) 100, (byte) 1, (byte) -1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (short) 0, (int) (short) 1);
    }

    @Test
    public void test08520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08520");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray8 = new int[] { (-1), (byte) -1, 10, (short) -1, '#', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) 100, (int) (short) 10);
    }

    @Test
    public void test08521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08521");
        int[] intArray5 = new int[] { 'a', (-1), '4', 'a', (-1) };
        int[] intArray9 = new int[] { (byte) 0, '#', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 10, (int) '4');
    }

    @Test
    public void test08522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08522");
        int[] intArray2 = new int[] { 10, (short) 0 };
        int[] intArray6 = new int[] { 1, 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (short) -1, (int) (short) 10);
    }

    @Test
    public void test08523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08523");
        int[] intArray3 = new int[] { '4', 'a', (-1) };
        int[] intArray8 = new int[] { '4', ' ', (byte) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) '4', (int) (short) 10);
    }

    @Test
    public void test08524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08524");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray5 = new int[] { '4', (short) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) 10, (-1));
    }

    @Test
    public void test08525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08525");
        int[] intArray6 = new int[] { (short) 100, (byte) 0, (byte) 10, (short) 100, 10, '4' };
        int[] intArray10 = new int[] { (short) -1, (short) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (-1), 0);
    }

    @Test
    public void test08526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08526");
        int[] intArray2 = new int[] { 10, (short) 1 };
        int[] intArray4 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 0, (int) '4');
    }

    @Test
    public void test08527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08527");
        int[] intArray3 = new int[] { '4', (byte) 100, (short) 1 };
        int[] intArray7 = new int[] { 1, (byte) 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 0, (int) (byte) 0);
    }

    @Test
    public void test08528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08528");
        int[] intArray5 = new int[] { (byte) 1, ' ', (short) 1, 0, 100 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (short) 0, (int) (short) 10);
    }

    @Test
    public void test08529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08529");
        int[] intArray2 = new int[] { 'a', '#' };
        int[] intArray4 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (-1), (int) (byte) 1);
    }

    @Test
    public void test08530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08530");
        int[] intArray6 = new int[] { '4', (byte) 10, '#', (byte) -1, 100, '4' };
        int[] intArray13 = new int[] { 0, '4', ' ', (byte) 0, (byte) -1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (byte) -1, 100);
    }

    @Test
    public void test08531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08531");
        int[] intArray3 = new int[] { (-1), (short) -1, 100 };
        int[] intArray8 = new int[] { (short) -1, 'a', (short) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 10, (int) (byte) 10);
    }

    @Test
    public void test08532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08532");
        int[] intArray6 = new int[] { (short) 1, 0, (short) 1, (short) 100, '#', (-1) };
        int[] intArray12 = new int[] { 100, 1, (byte) 1, (short) 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) '#', (int) (short) 0);
    }

    @Test
    public void test08533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08533");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 0, 1, '4', 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) -1, (int) (short) 10);
    }

    @Test
    public void test08534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08534");
        int[] intArray5 = new int[] { (short) 1, 10, (byte) 0, (short) 10, 1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) 0, (int) (byte) 10);
    }

    @Test
    public void test08535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08535");
        int[] intArray5 = new int[] { (short) 1, (byte) 1, 0, (short) -1, (byte) 1 };
        int[] intArray12 = new int[] { (byte) 100, 'a', (short) 1, (byte) 100, 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (byte) 0, 100);
    }

    @Test
    public void test08536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08536");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) 10, 1);
    }

    @Test
    public void test08537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08537");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 100, (short) 0, (short) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 10, 100);
    }

    @Test
    public void test08538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08538");
        int[] intArray6 = new int[] { (byte) 0, (-1), ' ', (byte) -1, (short) -1, (short) 0 };
        int[] intArray8 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 0, 10);
    }

    @Test
    public void test08539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08539");
        int[] intArray3 = new int[] { 'a', 0, '4' };
        int[] intArray7 = new int[] { (short) 1, (short) 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 100, (int) (byte) 0);
    }

    @Test
    public void test08540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08540");
        int[] intArray2 = new int[] { ' ', (byte) 10 };
        int[] intArray5 = new int[] { (byte) 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 1, (int) '#');
    }

    @Test
    public void test08541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08541");
        int[] intArray6 = new int[] { '4', ' ', ' ', '4', 'a', 0 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) 100, (-1));
    }

    @Test
    public void test08542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08542");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 1, '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) 0, (int) 'a');
    }

    @Test
    public void test08543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08543");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 10, (short) 1, (byte) 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) '#', (int) (short) 10);
    }

    @Test
    public void test08544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08544");
        int[] intArray6 = new int[] { (byte) 0, (byte) 0, 'a', 10, 0, '4' };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) 100, (int) 'a');
    }

    @Test
    public void test08545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08545");
        int[] intArray2 = new int[] { (byte) 0, 100 };
        int[] intArray4 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) '4', (int) (short) 0);
    }

    @Test
    public void test08546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08546");
        int[] intArray3 = new int[] { 10, 'a', (short) 0 };
        int[] intArray8 = new int[] { 10, (short) -1, 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) ' ', (int) 'a');
    }

    @Test
    public void test08547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08547");
        int[] intArray5 = new int[] { (byte) 1, ' ', (short) 0, 0, (byte) 0 };
        int[] intArray8 = new int[] { (byte) 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) 'a', (int) (byte) 0);
    }

    @Test
    public void test08548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08548");
        int[] intArray4 = new int[] { ' ', (short) 0, (short) -1, (short) 100 };
        int[] intArray6 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (-1), (int) '4');
    }

    @Test
    public void test08549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08549");
        int[] intArray2 = new int[] { (byte) 10, (byte) 10 };
        int[] intArray7 = new int[] { (short) 100, 0, (short) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 0, (int) (byte) 10);
    }

    @Test
    public void test08550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08550");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { '4', (byte) -1, 1, (byte) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) 'a', (int) (byte) 0);
    }

    @Test
    public void test08551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08551");
        int[] intArray4 = new int[] { (short) 100, (byte) -1, '4', 10 };
        int[] intArray7 = new int[] { '#', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 0, (int) (byte) 10);
    }

    @Test
    public void test08552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08552");
        int[] intArray4 = new int[] { 'a', (short) 1, ' ', ' ' };
        int[] intArray11 = new int[] { (short) 10, (byte) 0, (short) 1, (byte) -1, (-1), (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (-1), (int) (short) 1);
    }

    @Test
    public void test08553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08553");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { '4', (short) -1, 10, 10, 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) 10, (int) (short) -1);
    }

    @Test
    public void test08554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08554");
        int[] intArray4 = new int[] { (byte) -1, (-1), (short) 0, (short) 10 };
        int[] intArray9 = new int[] { ' ', (-1), 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) 'a', 100);
    }

    @Test
    public void test08555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08555");
        int[] intArray5 = new int[] { 'a', (short) 100, (byte) 10, (byte) -1, (byte) 1 };
        int[] intArray11 = new int[] { '4', (short) 10, (-1), '#', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) 10, (int) (byte) 10);
    }

    @Test
    public void test08556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08556");
        int[] intArray4 = new int[] { 'a', 100, '#', 10 };
        int[] intArray7 = new int[] { (short) 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) 100, (int) (byte) 1);
    }

    @Test
    public void test08557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08557");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 1, (short) -1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test08558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08558");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (byte) 10, (short) 10, (short) 0, (short) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) ' ', (int) '4');
    }

    @Test
    public void test08559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08559");
        int[] intArray5 = new int[] { 1, 1, (short) 10, 100, (byte) 1 };
        int[] intArray11 = new int[] { 0, (byte) 100, (short) 0, (short) 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) 100, (int) (byte) 100);
    }

    @Test
    public void test08560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08560");
        int[] intArray6 = new int[] { '#', (-1), '#', 10, (-1), ' ' };
        int[] intArray13 = new int[] { 100, (byte) 1, 0, 100, (byte) 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (-1), (int) '4');
    }

    @Test
    public void test08561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08561");
        int[] intArray4 = new int[] { (byte) 100, (byte) 100, (byte) 100, (short) 1 };
        int[] intArray6 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (short) -1, (int) (byte) 10);
    }

    @Test
    public void test08562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08562");
        int[] intArray4 = new int[] { (byte) 0, (byte) 0, (byte) -1, 0 };
        int[] intArray9 = new int[] { (byte) 100, 10, 'a', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) '#', (int) (short) 0);
    }

    @Test
    public void test08563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08563");
        int[] intArray5 = new int[] { (short) 10, '4', (byte) 1, (byte) 100, 100 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) 'a', (int) (byte) -1);
    }

    @Test
    public void test08564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08564");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) 10, 0);
    }

    @Test
    public void test08565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08565");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (byte) -1, 0, '4', '4', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, 10, (int) 'a');
    }

    @Test
    public void test08566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08566");
        int[] intArray6 = new int[] { 1, (short) -1, (-1), (short) 1, 10, (-1) };
        int[] intArray10 = new int[] { (-1), 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) 10, (int) (short) 0);
    }

    @Test
    public void test08567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08567");
        int[] intArray4 = new int[] { (short) 1, (byte) 10, 10, (short) -1 };
        int[] intArray10 = new int[] { (byte) 1, (byte) 10, ' ', (byte) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) ' ', (int) (byte) 100);
    }

    @Test
    public void test08568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08568");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 0, '#', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, 1, (int) (byte) 1);
    }

    @Test
    public void test08569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08569");
        int[] intArray4 = new int[] { (byte) 10, (short) 100, 10, 1 };
        int[] intArray11 = new int[] { (byte) 0, (byte) 100, ' ', (short) -1, '4', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) 100, (int) (byte) 10);
    }

    @Test
    public void test08570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08570");
        int[] intArray5 = new int[] { (byte) 10, ' ', (-1), (short) 1, (byte) 0 };
        int[] intArray11 = new int[] { 'a', (byte) 1, ' ', 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 10, (int) (short) -1);
    }

    @Test
    public void test08571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08571");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray8 = new int[] { ' ', (byte) 10, (byte) 1, (-1), (short) 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) '#', 1);
    }

    @Test
    public void test08572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08572");
        int[] intArray6 = new int[] { (short) 0, '4', (byte) -1, (byte) 10, (byte) 10, (byte) 100 };
        int[] intArray12 = new int[] { '4', ' ', 10, (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) '4', (int) 'a');
    }

    @Test
    public void test08573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08573");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray6 = new int[] { '#', '4', '4', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (byte) 1, (int) (byte) 10);
    }

    @Test
    public void test08574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08574");
        int[] intArray3 = new int[] { 1, (short) 10, (byte) -1 };
        int[] intArray10 = new int[] { 0, 10, (short) 10, 1, '4', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 0, (int) (byte) 0);
    }

    @Test
    public void test08575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08575");
        int[] intArray6 = new int[] { (short) 100, (byte) 0, (byte) 1, (byte) -1, (byte) 100, (-1) };
        int[] intArray10 = new int[] { (byte) 1, '4', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (short) -1, 0);
    }

    @Test
    public void test08576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08576");
        int[] intArray1 = new int[] { 1 };
        int[] intArray4 = new int[] { (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, 100, 100);
    }

    @Test
    public void test08577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08577");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) 0, (short) 0, '#', (short) -1, (short) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, 100, 10);
    }

    @Test
    public void test08578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08578");
        int[] intArray4 = new int[] { (short) -1, ' ', (byte) 100, (byte) 100 };
        int[] intArray11 = new int[] { (byte) 10, ' ', (short) 0, ' ', '#', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) -1, (int) (byte) -1);
    }

    @Test
    public void test08579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08579");
        int[] intArray6 = new int[] { ' ', 0, ' ', (byte) -1, (byte) 10, 100 };
        int[] intArray10 = new int[] { (byte) -1, (-1), (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 0, (int) '4');
    }

    @Test
    public void test08580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08580");
        int[] intArray2 = new int[] { (short) 1, 'a' };
        int[] intArray7 = new int[] { (short) -1, 1, (short) 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 100, 10);
    }

    @Test
    public void test08581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08581");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (byte) 1, (int) (short) -1);
    }

    @Test
    public void test08582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08582");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 0, (byte) 1, ' ', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 10, 10);
    }

    @Test
    public void test08583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08583");
        int[] intArray4 = new int[] { (short) 10, (byte) -1, (short) 100, (byte) 100 };
        int[] intArray8 = new int[] { (short) 0, (byte) -1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) 0, (int) (short) 100);
    }

    @Test
    public void test08584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08584");
        int[] intArray1 = new int[] { '#' };
        int[] intArray6 = new int[] { (byte) 10, 0, 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (short) 100, 0);
    }

    @Test
    public void test08585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08585");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) 0, (short) 10, (byte) 0, ' ', 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) 100, (int) (short) 10);
    }

    @Test
    public void test08586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08586");
        int[] intArray6 = new int[] { (short) 0, (short) 100, (byte) 1, (byte) 10, (byte) 0, 'a' };
        int[] intArray11 = new int[] { (byte) -1, (byte) 1, 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (byte) 10, 0);
    }

    @Test
    public void test08587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08587");
        int[] intArray2 = new int[] { 'a', 1 };
        int[] intArray5 = new int[] { (short) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) -1, 1);
    }

    @Test
    public void test08588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08588");
        int[] intArray6 = new int[] { (short) 10, '4', (short) 1, (short) 0, '4', 10 };
        int[] intArray9 = new int[] { (short) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (short) 1, (int) '4');
    }

    @Test
    public void test08589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08589");
        int[] intArray2 = new int[] { 0, (short) 0 };
        int[] intArray5 = new int[] { (-1), (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 100, (int) 'a');
    }

    @Test
    public void test08590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08590");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) -1, '4', 0, (byte) 0, (short) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) ' ', (int) '4');
    }

    @Test
    public void test08591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08591");
        int[] intArray6 = new int[] { (short) 100, (byte) 10, (byte) 1, ' ', (byte) 100, (byte) 10 };
        int[] intArray13 = new int[] { (short) -1, (short) 1, (short) 1, '#', '4', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (byte) 1, 100);
    }

    @Test
    public void test08592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08592");
        int[] intArray6 = new int[] { 0, (short) -1, (byte) 0, 1, 1, (short) 0 };
        int[] intArray11 = new int[] { (byte) 100, (-1), '4', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 100, (int) 'a');
    }

    @Test
    public void test08593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08593");
        int[] intArray2 = new int[] { (byte) 1, (byte) -1 };
        int[] intArray4 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 10, (int) ' ');
    }

    @Test
    public void test08594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08594");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 100, (-1), (-1), (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (-1), 0);
    }

    @Test
    public void test08595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08595");
        int[] intArray2 = new int[] { (-1), (byte) 100 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) 100, 1);
    }

    @Test
    public void test08596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08596");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) -1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test08597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08597");
        int[] intArray2 = new int[] { '#', 1 };
        int[] intArray9 = new int[] { (byte) 0, (-1), ' ', '4', (short) 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 10, (int) (byte) 0);
    }

    @Test
    public void test08598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08598");
        int[] intArray3 = new int[] { (byte) 1, (byte) -1, (byte) 0 };
        int[] intArray10 = new int[] { (byte) -1, 100, 100, (byte) 10, (short) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 1, (int) '#');
    }

    @Test
    public void test08599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08599");
        int[] intArray4 = new int[] { (short) 1, '#', ' ', '#' };
        int[] intArray6 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (short) -1, (int) (short) 0);
    }

    @Test
    public void test08600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08600");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 0, (byte) 10, (byte) 10, (-1), (byte) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) 0, (int) (short) 0);
    }

    @Test
    public void test08601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08601");
        int[] intArray6 = new int[] { 'a', (short) -1, '#', (short) 0, 0, 10 };
        int[] intArray13 = new int[] { (short) 1, (short) -1, (short) 100, '4', 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) 'a', (int) '4');
    }

    @Test
    public void test08602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08602");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (byte) -1, 100);
    }

    @Test
    public void test08603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08603");
        int[] intArray2 = new int[] { 100, (byte) 100 };
        int[] intArray7 = new int[] { (short) 1, 1, (short) 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) -1, 100);
    }

    @Test
    public void test08604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08604");
        int[] intArray6 = new int[] { ' ', 'a', (short) 10, (-1), '4', (short) 0 };
        int[] intArray11 = new int[] { (byte) -1, (short) 0, (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (-1), (int) (short) 100);
    }

    @Test
    public void test08605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08605");
        int[] intArray3 = new int[] { (byte) 100, '#', ' ' };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, 0, (int) (byte) 0);
    }

    @Test
    public void test08606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08606");
        int[] intArray5 = new int[] { (short) 10, (-1), 0, (short) 0, 1 };
        int[] intArray7 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (-1), 1);
    }

    @Test
    public void test08607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08607");
        int[] intArray6 = new int[] { '4', (-1), 1, 'a', (short) 1, (short) 100 };
        int[] intArray10 = new int[] { 0, ' ', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) 0, (int) (byte) 100);
    }

    @Test
    public void test08608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08608");
        int[] intArray5 = new int[] { (short) -1, (short) 100, ' ', (byte) -1, (short) 10 };
        int[] intArray10 = new int[] { (short) 100, (-1), (short) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (byte) 1, 0);
    }

    @Test
    public void test08609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08609");
        int[] intArray2 = new int[] { '#', (byte) 10 };
        int[] intArray4 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 0, 100);
    }

    @Test
    public void test08610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08610");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test08611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08611");
        int[] intArray3 = new int[] { (byte) 1, 1, (byte) 1 };
        int[] intArray10 = new int[] { (short) -1, (short) 10, (byte) -1, (byte) 100, 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (byte) 1, (int) (short) 1);
    }

    @Test
    public void test08612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08612");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray6 = new int[] { (byte) 1, '4', (short) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) '#', (int) (byte) -1);
    }

    @Test
    public void test08613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08613");
        int[] intArray6 = new int[] { (byte) 1, (short) -1, (short) 10, (short) 1, (byte) 1, (byte) 1 };
        int[] intArray11 = new int[] { 'a', (byte) 0, (short) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (short) -1, (int) (short) 10);
    }

    @Test
    public void test08614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08614");
        int[] intArray4 = new int[] { '#', ' ', '#', (short) 100 };
        int[] intArray10 = new int[] { (byte) 1, (byte) 0, (byte) 100, 'a', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) '#', (int) (short) 100);
    }

    @Test
    public void test08615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08615");
        int[] intArray2 = new int[] { (byte) 10, 10 };
        int[] intArray6 = new int[] { (short) 0, '4', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (short) -1, (int) (short) 0);
    }

    @Test
    public void test08616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08616");
        int[] intArray3 = new int[] { 'a', (short) 0, (short) 10 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) 'a', (int) (short) -1);
    }

    @Test
    public void test08617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08617");
        int[] intArray6 = new int[] { (short) 100, (short) 10, (byte) 0, 10, (short) 0, (byte) 10 };
        int[] intArray12 = new int[] { (-1), (short) -1, (short) -1, (-1), 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test08618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08618");
        int[] intArray3 = new int[] { 1, (short) 0, 10 };
        int[] intArray10 = new int[] { (byte) 1, 1, 0, (byte) 100, (short) 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 1, 0);
    }

    @Test
    public void test08619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08619");
        int[] intArray3 = new int[] { (short) -1, 'a', (short) 0 };
        int[] intArray8 = new int[] { (short) 100, (byte) -1, ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 100, (int) (byte) 1);
    }

    @Test
    public void test08620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08620");
        int[] intArray3 = new int[] { (byte) 0, 10, (byte) 100 };
        int[] intArray10 = new int[] { '4', (byte) 1, (short) -1, (short) 100, (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (byte) 0, (int) (short) 100);
    }

    @Test
    public void test08621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08621");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) -1, (int) (byte) 0);
    }

    @Test
    public void test08622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08622");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (short) 10, (int) (short) 100);
    }

    @Test
    public void test08623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08623");
        int[] intArray5 = new int[] { 1, 10, 'a', '#', (short) 10 };
        int[] intArray11 = new int[] { ' ', '4', (-1), (short) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 1, (int) (byte) 100);
    }

    @Test
    public void test08624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08624");
        int[] intArray6 = new int[] { 1, (byte) 1, (byte) -1, (short) 0, 10, (short) 100 };
        int[] intArray13 = new int[] { 10, (short) 0, (byte) 10, '4', 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (byte) -1, (int) (byte) 10);
    }

    @Test
    public void test08625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08625");
        int[] intArray4 = new int[] { (short) 10, (byte) 1, (short) 100, '#' };
        int[] intArray11 = new int[] { (byte) 10, (byte) 1, '4', '#', (byte) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (-1), (int) 'a');
    }

    @Test
    public void test08626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08626");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) '4', (int) '4');
    }

    @Test
    public void test08627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08627");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (-1), 'a', 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 0, (int) (short) 1);
    }

    @Test
    public void test08628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08628");
        int[] intArray4 = new int[] { '4', (short) 100, 100, (short) 0 };
        int[] intArray9 = new int[] { 10, (short) 1, 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (-1), (int) (short) 0);
    }

    @Test
    public void test08629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08629");
        int[] intArray3 = new int[] { 'a', (byte) 10, 'a' };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) -1, (int) 'a');
    }

    @Test
    public void test08630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08630");
        int[] intArray6 = new int[] { (short) 1, '4', (byte) 100, 100, (byte) 10, (short) 1 };
        int[] intArray11 = new int[] { 'a', 0, (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 10, (int) ' ');
    }

    @Test
    public void test08631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08631");
        int[] intArray4 = new int[] { 100, '4', 'a', 0 };
        int[] intArray10 = new int[] { (byte) 1, '#', (byte) -1, 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (byte) 100, 10);
    }

    @Test
    public void test08632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08632");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) -1, (short) -1, 1, 'a', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) 100, (int) '#');
    }

    @Test
    public void test08633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08633");
        int[] intArray6 = new int[] { (short) 10, 1, 10, (byte) 10, (short) -1, 0 };
        int[] intArray11 = new int[] { (byte) -1, (short) 100, (short) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 1, 0);
    }

    @Test
    public void test08634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08634");
        int[] intArray4 = new int[] { (byte) -1, 10, '#', 1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (short) 100, (int) ' ');
    }

    @Test
    public void test08635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08635");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) ' ', (int) ' ');
    }

    @Test
    public void test08636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08636");
        int[] intArray4 = new int[] { 0, (short) 10, 100, (byte) 0 };
        int[] intArray6 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 100, (int) (byte) 1);
    }

    @Test
    public void test08637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08637");
        int[] intArray3 = new int[] { 100, ' ', '4' };
        int[] intArray9 = new int[] { '#', '4', (byte) 10, (byte) 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (short) 10, (int) '4');
    }

    @Test
    public void test08638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08638");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 'a', 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) 100, (int) (byte) -1);
    }

    @Test
    public void test08639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08639");
        int[] intArray3 = new int[] { (byte) -1, (short) 10, (byte) 100 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) 'a', (int) (byte) 0);
    }

    @Test
    public void test08640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08640");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 'a', 1, (short) -1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 10, 1);
    }

    @Test
    public void test08641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08641");
        int[] intArray4 = new int[] { ' ', (byte) 1, ' ', 'a' };
        int[] intArray6 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (short) 100, (int) ' ');
    }

    @Test
    public void test08642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08642");
        int[] intArray3 = new int[] { (short) -1, '#', '#' };
        int[] intArray10 = new int[] { (byte) 1, (byte) 10, 100, (short) 10, ' ', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (byte) 100, (int) (byte) 100);
    }

    @Test
    public void test08643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08643");
        int[] intArray3 = new int[] { '4', ' ', 0 };
        int[] intArray6 = new int[] { (byte) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) '#', 0);
    }

    @Test
    public void test08644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08644");
        int[] intArray5 = new int[] { (-1), (byte) 100, ' ', (byte) 100, (short) 0 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 0, (int) '#');
    }

    @Test
    public void test08645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08645");
        int[] intArray3 = new int[] { (byte) 0, (byte) 100, 100 };
        int[] intArray9 = new int[] { 10, (short) 0, (byte) 1, '4', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (short) -1, (int) (short) -1);
    }

    @Test
    public void test08646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08646");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (byte) 100, (int) (byte) 100);
    }

    @Test
    public void test08647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08647");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray7 = new int[] { (byte) -1, (short) 0, (short) 10, (short) 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, 10, (int) '#');
    }

    @Test
    public void test08648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08648");
        int[] intArray6 = new int[] { (byte) 10, (byte) 100, (byte) 1, 0, (byte) 10, (-1) };
        int[] intArray8 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 1, (-1));
    }

    @Test
    public void test08649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08649");
        int[] intArray2 = new int[] { 0, (short) 10 };
        int[] intArray9 = new int[] { (byte) 10, 'a', 10, 100, (short) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 0, (int) 'a');
    }

    @Test
    public void test08650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08650");
        int[] intArray6 = new int[] { (byte) 0, (byte) 1, (byte) 0, (byte) 0, (short) 1, (short) -1 };
        int[] intArray12 = new int[] { (byte) -1, (short) 1, 100, 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) 100, (int) (short) -1);
    }

    @Test
    public void test08651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08651");
        int[] intArray1 = new int[] { 10 };
        int[] intArray7 = new int[] { ' ', (short) 10, (short) -1, (-1), (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) -1, (int) (byte) 10);
    }

    @Test
    public void test08652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08652");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) ' ', (int) (short) 10);
    }

    @Test
    public void test08653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08653");
        int[] intArray5 = new int[] { 10, (short) 0, 1, '4', (short) 100 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) '4', (int) 'a');
    }

    @Test
    public void test08654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08654");
        int[] intArray4 = new int[] { (byte) -1, ' ', (short) 1, (byte) 1 };
        int[] intArray9 = new int[] { 100, (short) 10, (short) 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) 1, (int) (short) -1);
    }

    @Test
    public void test08655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08655");
        int[] intArray6 = new int[] { '4', '#', 10, (short) -1, (byte) 1, (byte) 0 };
        int[] intArray12 = new int[] { 1, 1, (byte) 100, (short) 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 0, (int) (byte) -1);
    }

    @Test
    public void test08656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08656");
        int[] intArray5 = new int[] { (byte) 100, (short) 10, (short) -1, (short) 0, (short) -1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) 0, (int) (byte) 10);
    }

    @Test
    public void test08657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08657");
        int[] intArray5 = new int[] { (byte) 10, (-1), (short) 10, (byte) 10, (short) 100 };
        int[] intArray9 = new int[] { 10, (short) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 100, (int) (short) 0);
    }

    @Test
    public void test08658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08658");
        int[] intArray5 = new int[] { (-1), ' ', (byte) 0, ' ', (short) 100 };
        int[] intArray12 = new int[] { (short) 10, 10, (byte) 1, (byte) 1, 'a', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, 100, 10);
    }

    @Test
    public void test08659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08659");
        int[] intArray1 = new int[] { 10 };
        int[] intArray8 = new int[] { 'a', ' ', (short) 0, (byte) 10, 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) '4', 100);
    }

    @Test
    public void test08660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08660");
        int[] intArray2 = new int[] { 0, (byte) -1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (byte) 10, 100);
    }

    @Test
    public void test08661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08661");
        int[] intArray2 = new int[] { (byte) 100, 1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) 100, 100);
    }

    @Test
    public void test08662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08662");
        int[] intArray4 = new int[] { 1, (byte) 1, (short) 100, (-1) };
        int[] intArray7 = new int[] { '#', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) 1, (int) (short) 1);
    }

    @Test
    public void test08663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08663");
        int[] intArray3 = new int[] { (short) 1, (byte) -1, 0 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (byte) 0, (int) (short) 100);
    }

    @Test
    public void test08664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08664");
        int[] intArray3 = new int[] { 0, (short) 10, (-1) };
        int[] intArray9 = new int[] { 10, ' ', 10, (short) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (byte) 10, (int) (short) -1);
    }

    @Test
    public void test08665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08665");
        int[] intArray5 = new int[] { (-1), (byte) 1, '4', '#', 1 };
        int[] intArray9 = new int[] { (short) 100, 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 10, (int) (short) 0);
    }

    @Test
    public void test08666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08666");
        int[] intArray3 = new int[] { (short) 10, (short) -1, 'a' };
        int[] intArray8 = new int[] { (short) 100, '#', (byte) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (byte) 100, (int) (short) -1);
    }

    @Test
    public void test08667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08667");
        int[] intArray5 = new int[] { 0, (short) 10, 100, ' ', (byte) 100 };
        int[] intArray8 = new int[] { 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) -1, (int) (short) -1);
    }

    @Test
    public void test08668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08668");
        int[] intArray3 = new int[] { (short) 1, 0, (short) 1 };
        int[] intArray7 = new int[] { '#', (short) 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) 1, 10);
    }

    @Test
    public void test08669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08669");
        int[] intArray3 = new int[] { 0, (byte) 10, (byte) 0 };
        int[] intArray9 = new int[] { '4', (byte) -1, (byte) 0, (short) 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (byte) 0, (int) '#');
    }

    @Test
    public void test08670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08670");
        int[] intArray6 = new int[] { 100, (byte) 1, 10, (short) 1, '4', 1 };
        int[] intArray12 = new int[] { 'a', (short) 10, (byte) 0, 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 1, (int) (short) 10);
    }

    @Test
    public void test08671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08671");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (byte) -1, (int) (byte) -1);
    }

    @Test
    public void test08672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08672");
        int[] intArray5 = new int[] { (byte) 100, (byte) 0, 1, (short) -1, (byte) 100 };
        int[] intArray9 = new int[] { '#', ' ', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 100, (int) (byte) 1);
    }

    @Test
    public void test08673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08673");
        int[] intArray6 = new int[] { '#', ' ', '#', (short) 100, (short) 100, (short) -1 };
        int[] intArray11 = new int[] { ' ', (byte) 1, (byte) -1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (short) 0, (int) (short) 1);
    }

    @Test
    public void test08674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08674");
        int[] intArray6 = new int[] { (short) 0, (byte) 10, (short) 1, (byte) 10, (byte) 0, (byte) 10 };
        int[] intArray8 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 100, (int) ' ');
    }

    @Test
    public void test08675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08675");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 1, (int) (byte) -1);
    }

    @Test
    public void test08676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08676");
        int[] intArray4 = new int[] { 1, 0, (byte) 100, (byte) 100 };
        int[] intArray10 = new int[] { (short) 10, '4', '#', '4', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) '#', (int) (byte) 100);
    }

    @Test
    public void test08677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08677");
        int[] intArray5 = new int[] { '#', (short) 10, '4', (short) -1, 'a' };
        int[] intArray8 = new int[] { (byte) 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) -1, (int) (short) 1);
    }

    @Test
    public void test08678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08678");
        int[] intArray5 = new int[] { (short) -1, (byte) 10, '#', (byte) 0, 0 };
        int[] intArray8 = new int[] { 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) ' ', (int) 'a');
    }

    @Test
    public void test08679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08679");
        int[] intArray3 = new int[] { (short) 100, (byte) -1, 1 };
        int[] intArray7 = new int[] { (byte) 10, (short) -1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) 0, 100);
    }

    @Test
    public void test08680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08680");
        int[] intArray2 = new int[] { 0, 0 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) 100, (-1));
    }

    @Test
    public void test08681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08681");
        int[] intArray5 = new int[] { (short) 0, '#', 100, (short) -1, 100 };
        int[] intArray12 = new int[] { 'a', (short) -1, (short) 1, (-1), (short) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (-1), (int) (byte) 1);
    }

    @Test
    public void test08682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08682");
        int[] intArray3 = new int[] { (byte) 1, 10, (-1) };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) ' ', 1);
    }

    @Test
    public void test08683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08683");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) 0, (short) -1 };
        int[] intArray8 = new int[] { (byte) 1, 'a', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) 100, (int) (short) 0);
    }

    @Test
    public void test08684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08684");
        int[] intArray6 = new int[] { (short) -1, ' ', (byte) 1, (short) 100, (short) 100, (short) -1 };
        int[] intArray11 = new int[] { 0, '4', 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (short) -1, (int) (short) -1);
    }

    @Test
    public void test08685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08685");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { '#', (short) 1, ' ', (-1), 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, 10, 10);
    }

    @Test
    public void test08686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08686");
        int[] intArray4 = new int[] { (short) 100, (short) 10, (byte) -1, (short) 10 };
        int[] intArray10 = new int[] { (short) 0, (short) 0, (short) 100, 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) '#', 0);
    }

    @Test
    public void test08687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08687");
        int[] intArray1 = new int[] { '#' };
        int[] intArray7 = new int[] { 10, (byte) 10, (short) 100, (byte) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, 0, (int) (byte) 1);
    }

    @Test
    public void test08688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08688");
        int[] intArray6 = new int[] { 10, 10, (byte) 1, 'a', 1, '4' };
        int[] intArray8 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 10, (int) (byte) 100);
    }

    @Test
    public void test08689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08689");
        int[] intArray4 = new int[] { (short) -1, 'a', '#', (short) 0 };
        int[] intArray10 = new int[] { (short) -1, (byte) 1, (byte) 0, 'a', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) 'a', (int) (short) -1);
    }

    @Test
    public void test08690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08690");
        int[] intArray3 = new int[] { (byte) 1, (short) -1, (byte) 1 };
        int[] intArray8 = new int[] { '#', 1, (byte) -1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 0, (int) '#');
    }

    @Test
    public void test08691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08691");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 10, (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) ' ', (int) (short) 100);
    }

    @Test
    public void test08692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08692");
        int[] intArray5 = new int[] { (byte) 100, 'a', '#', (short) 0, '#' };
        int[] intArray9 = new int[] { (short) 0, (short) 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (byte) 0, (int) (short) 100);
    }

    @Test
    public void test08693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08693");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 'a', (short) 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) '#', 1);
    }

    @Test
    public void test08694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08694");
        int[] intArray5 = new int[] { (-1), 100, (-1), 'a', (short) 100 };
        int[] intArray9 = new int[] { 'a', '#', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (byte) 10, (int) ' ');
    }

    @Test
    public void test08695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08695");
        int[] intArray3 = new int[] { 10, 10, 'a' };
        int[] intArray6 = new int[] { 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) 0, (int) (byte) 10);
    }

    @Test
    public void test08696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08696");
        int[] intArray5 = new int[] { (short) 1, (byte) -1, (byte) -1, '4', (short) 1 };
        int[] intArray9 = new int[] { 1, (short) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) -1, (int) (byte) 100);
    }

    @Test
    public void test08697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08697");
        int[] intArray4 = new int[] { 100, '#', (short) 10, (byte) 100 };
        int[] intArray11 = new int[] { (short) 0, (short) 100, (short) 100, (short) 10, (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, 100, (int) (byte) 100);
    }

    @Test
    public void test08698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08698");
        int[] intArray4 = new int[] { '4', (byte) 1, ' ', (short) 1 };
        int[] intArray11 = new int[] { (byte) 0, (short) 1, (byte) 0, (short) 0, (short) 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, 1, (int) (short) 0);
    }

    @Test
    public void test08699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08699");
        int[] intArray2 = new int[] { 1, (short) -1 };
        int[] intArray4 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test08700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08700");
        int[] intArray1 = new int[] { '#' };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 100, 0);
    }

    @Test
    public void test08701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08701");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (short) -1, (int) (byte) 0);
    }

    @Test
    public void test08702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08702");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray6 = new int[] { 100, ' ', ' ', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (byte) -1, 0);
    }

    @Test
    public void test08703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08703");
        int[] intArray4 = new int[] { (short) 0, 10, (short) -1, (byte) 10 };
        int[] intArray6 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, 1, 100);
    }

    @Test
    public void test08704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08704");
        int[] intArray5 = new int[] { (byte) 100, (byte) -1, 'a', ' ', (short) 0 };
        int[] intArray11 = new int[] { (byte) 1, (byte) 1, (short) -1, (byte) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 0, (int) 'a');
    }

    @Test
    public void test08705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08705");
        int[] intArray4 = new int[] { (-1), '4', (short) -1, 1 };
        int[] intArray7 = new int[] { (short) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) -1, 1);
    }

    @Test
    public void test08706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08706");
        int[] intArray6 = new int[] { (byte) 1, '#', (byte) 10, 0, 10, 0 };
        int[] intArray13 = new int[] { (short) 10, (short) 1, (byte) 1, (byte) -1, (short) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (short) 0, (int) (byte) 0);
    }

    @Test
    public void test08707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08707");
        int[] intArray5 = new int[] { (short) 0, (short) 1, (-1), (short) 100, (byte) 1 };
        int[] intArray10 = new int[] { (short) 100, (short) 0, (short) 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (byte) 100, (int) (byte) -1);
    }

    @Test
    public void test08708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08708");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) 0, (int) (byte) -1);
    }

    @Test
    public void test08709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08709");
        int[] intArray2 = new int[] { 10, (-1) };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) -1, (int) ' ');
    }

    @Test
    public void test08710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08710");
        int[] intArray3 = new int[] { 10, (byte) 0, (-1) };
        int[] intArray10 = new int[] { (byte) 1, '4', 10, '#', (short) 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (-1), (int) (byte) -1);
    }

    @Test
    public void test08711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08711");
        int[] intArray6 = new int[] { (short) 10, (short) 0, (short) 0, (short) 10, (-1), '4' };
        int[] intArray11 = new int[] { (short) 0, (short) -1, (short) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 0, (-1));
    }

    @Test
    public void test08712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08712");
        int[] intArray2 = new int[] { (short) -1, (short) 100 };
        int[] intArray6 = new int[] { 1, (byte) 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) 1, (-1));
    }

    @Test
    public void test08713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08713");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray8 = new int[] { 'a', ' ', (short) 10, 0, 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) '#', (int) '#');
    }

    @Test
    public void test08714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08714");
        int[] intArray3 = new int[] { '4', (short) 0, ' ' };
        int[] intArray6 = new int[] { (-1), 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) 1, 0);
    }

    @Test
    public void test08715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08715");
        int[] intArray6 = new int[] { (byte) 100, (short) -1, (byte) 1, (byte) 1, '#', 0 };
        int[] intArray11 = new int[] { (byte) 0, (byte) -1, (-1), '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (short) 0, (int) (byte) 0);
    }

    @Test
    public void test08716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08716");
        int[] intArray3 = new int[] { 0, 1, 1 };
        int[] intArray6 = new int[] { 'a', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test08717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08717");
        int[] intArray2 = new int[] { '4', (byte) -1 };
        int[] intArray4 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 10, (int) (short) 10);
    }

    @Test
    public void test08718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08718");
        int[] intArray5 = new int[] { '#', (byte) 100, (byte) 100, (-1), '#' };
        int[] intArray11 = new int[] { (short) 0, '#', (byte) 100, 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) 1, (int) (short) 10);
    }

    @Test
    public void test08719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08719");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 0, (int) (byte) 100);
    }

    @Test
    public void test08720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08720");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray5 = new int[] { (byte) 10, (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) 100, (int) (short) 0);
    }

    @Test
    public void test08721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08721");
        int[] intArray6 = new int[] { 100, (short) 10, (byte) 100, (byte) -1, ' ', '#' };
        int[] intArray12 = new int[] { (byte) 0, '4', '#', '#', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 0, (int) (byte) 0);
    }

    @Test
    public void test08722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08722");
        int[] intArray5 = new int[] { ' ', (-1), (short) 100, (byte) -1, 100 };
        int[] intArray10 = new int[] { (byte) -1, ' ', ' ', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (short) 100, (int) (short) 1);
    }

    @Test
    public void test08723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08723");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, 10, 0);
    }

    @Test
    public void test08724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08724");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) ' ', (int) 'a');
    }

    @Test
    public void test08725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08725");
        int[] intArray5 = new int[] { 0, (-1), (byte) 10, ' ', (short) 10 };
        int[] intArray12 = new int[] { 'a', (byte) 10, 0, 1, (-1), (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (-1), (int) (byte) 10);
    }

    @Test
    public void test08726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08726");
        int[] intArray5 = new int[] { (-1), (byte) 1, (short) 100, (short) 10, 10 };
        int[] intArray9 = new int[] { '#', (byte) -1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 100, (int) '#');
    }

    @Test
    public void test08727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08727");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (-1), (short) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) 10, (int) (byte) 10);
    }

    @Test
    public void test08728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08728");
        int[] intArray4 = new int[] { (byte) -1, 1, 0, (short) 0 };
        int[] intArray6 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 10, (int) '4');
    }

    @Test
    public void test08729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08729");
        int[] intArray3 = new int[] { (-1), 1, (-1) };
        int[] intArray10 = new int[] { (byte) 100, 100, (short) 0, ' ', (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 0, (int) ' ');
    }

    @Test
    public void test08730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08730");
        int[] intArray6 = new int[] { 100, 10, 10, 1, 0, '4' };
        int[] intArray11 = new int[] { (short) 10, (short) 100, 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) ' ', (int) ' ');
    }

    @Test
    public void test08731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08731");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 100, (byte) 100, 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) '#', 1);
    }

    @Test
    public void test08732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08732");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 1, (byte) 1, (short) -1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 0, (int) 'a');
    }

    @Test
    public void test08733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08733");
        int[] intArray6 = new int[] { 1, (short) 100, 0, 100, ' ', (short) 100 };
        int[] intArray9 = new int[] { 'a', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) ' ', (-1));
    }

    @Test
    public void test08734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08734");
        int[] intArray3 = new int[] { (byte) 100, (short) 100, (-1) };
        int[] intArray5 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) 1, (int) (short) 100);
    }

    @Test
    public void test08735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08735");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray8 = new int[] { (byte) 10, (byte) 1, (short) 0, (byte) 0, 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) 10, 100);
    }

    @Test
    public void test08736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08736");
        int[] intArray5 = new int[] { '#', ' ', (short) 0, (byte) 1, 0 };
        int[] intArray11 = new int[] { (short) 100, '4', (byte) 10, (short) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) 10, (int) (byte) 10);
    }

    @Test
    public void test08737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08737");
        int[] intArray5 = new int[] { (byte) 100, '#', 'a', (short) -1, (byte) 100 };
        int[] intArray9 = new int[] { (short) 10, '#', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 10, (int) (byte) 0);
    }

    @Test
    public void test08738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08738");
        int[] intArray5 = new int[] { '#', (byte) 10, 1, 10, (-1) };
        int[] intArray8 = new int[] { 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) 100, (int) 'a');
    }

    @Test
    public void test08739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08739");
        int[] intArray3 = new int[] { (short) 1, (short) -1, (byte) 100 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) -1, (int) (byte) 100);
    }

    @Test
    public void test08740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08740");
        int[] intArray1 = new int[] { 10 };
        int[] intArray5 = new int[] { (byte) 1, ' ', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (byte) 10, 0);
    }

    @Test
    public void test08741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08741");
        int[] intArray2 = new int[] { ' ', (byte) 0 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) '#', (int) '4');
    }

    @Test
    public void test08742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08742");
        int[] intArray6 = new int[] { '#', (byte) 10, (-1), (byte) 1, (short) 1, '4' };
        int[] intArray12 = new int[] { (byte) 1, (short) 10, (byte) 1, 'a', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) ' ', (int) 'a');
    }

    @Test
    public void test08743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08743");
        int[] intArray5 = new int[] { 1, (byte) -1, (byte) 0, 'a', ' ' };
        int[] intArray7 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) ' ', (int) '#');
    }

    @Test
    public void test08744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08744");
        int[] intArray2 = new int[] { (byte) 0, (byte) 10 };
        int[] intArray7 = new int[] { (byte) 100, 100, (byte) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (short) -1, (int) (short) 10);
    }

    @Test
    public void test08745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08745");
        int[] intArray4 = new int[] { (short) 10, (short) 100, (short) 0, (byte) 0 };
        int[] intArray10 = new int[] { (short) 1, 100, ' ', (short) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, 1, 100);
    }

    @Test
    public void test08746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08746");
        int[] intArray2 = new int[] { (byte) 10, (byte) 0 };
        int[] intArray8 = new int[] { 10, (short) 0, 100, '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 0, (int) 'a');
    }

    @Test
    public void test08747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08747");
        int[] intArray3 = new int[] { ' ', (short) -1, (short) 0 };
        int[] intArray7 = new int[] { (short) 100, (byte) -1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) '#', (int) (byte) -1);
    }

    @Test
    public void test08748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08748");
        int[] intArray5 = new int[] { 100, (byte) 100, 0, 0, (byte) 0 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) -1, (int) (byte) -1);
    }

    @Test
    public void test08749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08749");
        int[] intArray3 = new int[] { (byte) 10, (byte) 100, (short) 10 };
        int[] intArray6 = new int[] { 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, 10, (int) (short) -1);
    }

    @Test
    public void test08750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08750");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) '4', (int) (byte) -1);
    }

    @Test
    public void test08751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08751");
        int[] intArray5 = new int[] { (short) 10, 'a', (short) 100, (short) 0, (short) 0 };
        int[] intArray8 = new int[] { (byte) 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) 1, (int) (short) -1);
    }

    @Test
    public void test08752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08752");
        int[] intArray2 = new int[] { (byte) 0, 0 };
        int[] intArray7 = new int[] { '#', (byte) -1, ' ', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) -1, 0);
    }

    @Test
    public void test08753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08753");
        int[] intArray3 = new int[] { 1, 1, (short) -1 };
        int[] intArray9 = new int[] { 10, '4', (short) 0, 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 100, (int) ' ');
    }

    @Test
    public void test08754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08754");
        int[] intArray2 = new int[] { '4', '#' };
        int[] intArray7 = new int[] { 'a', (short) 100, (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (short) 10, (int) ' ');
    }

    @Test
    public void test08755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08755");
        int[] intArray5 = new int[] { 100, (short) 0, (-1), (byte) 1, (short) 1 };
        int[] intArray12 = new int[] { (byte) 1, (short) -1, (byte) 0, (short) 10, '4', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, 0, (int) (byte) 1);
    }

    @Test
    public void test08756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08756");
        int[] intArray2 = new int[] { (byte) 0, '#' };
        int[] intArray9 = new int[] { (byte) 100, (short) 0, (short) 1, (byte) -1, '4', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (-1), 0);
    }

    @Test
    public void test08757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08757");
        int[] intArray2 = new int[] { (byte) 1, (byte) 100 };
        int[] intArray4 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (short) 10, (int) (byte) 10);
    }

    @Test
    public void test08758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08758");
        int[] intArray4 = new int[] { (short) -1, (short) 1, (byte) 100, (short) -1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, 10, 1);
    }

    @Test
    public void test08759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08759");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) 10, 10);
    }

    @Test
    public void test08760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08760");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray4 = new int[] { (short) -1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (short) 100, (int) (byte) 0);
    }

    @Test
    public void test08761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08761");
        int[] intArray5 = new int[] { 10, 0, (byte) 1, 1, (short) 0 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) 1, (int) (byte) -1);
    }

    @Test
    public void test08762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08762");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { '#', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) '#', (int) (byte) 0);
    }

    @Test
    public void test08763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08763");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray8 = new int[] { 1, (byte) 100, '#', (short) 0, '#', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 1, (int) (short) 1);
    }

    @Test
    public void test08764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08764");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray4 = new int[] { (byte) 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) '4', (int) '#');
    }

    @Test
    public void test08765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08765");
        int[] intArray2 = new int[] { '4', (-1) };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (byte) 1, (-1));
    }

    @Test
    public void test08766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08766");
        int[] intArray6 = new int[] { (short) 1, (byte) 10, 0, (-1), 1, (short) 0 };
        int[] intArray10 = new int[] { (byte) 10, (short) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) 'a', 10);
    }

    @Test
    public void test08767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08767");
        int[] intArray2 = new int[] { (short) 1, '4' };
        int[] intArray4 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (byte) -1, 0);
    }

    @Test
    public void test08768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08768");
        int[] intArray3 = new int[] { (short) 10, (-1), (byte) 0 };
        int[] intArray6 = new int[] { 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (-1), (int) (short) 1);
    }

    @Test
    public void test08769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08769");
        int[] intArray2 = new int[] { 0, (byte) 100 };
        int[] intArray9 = new int[] { (short) 0, (short) -1, ' ', (byte) 10, 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (short) 10, (int) (byte) -1);
    }

    @Test
    public void test08770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08770");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray7 = new int[] { (byte) 10, (byte) 100, '4', '4', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) 0, 1);
    }

    @Test
    public void test08771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08771");
        int[] intArray2 = new int[] { (short) 0, (short) 0 };
        int[] intArray5 = new int[] { (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) 'a', (int) (short) 1);
    }

    @Test
    public void test08772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08772");
        int[] intArray2 = new int[] { (short) -1, (-1) };
        int[] intArray8 = new int[] { 'a', (byte) 10, (byte) 1, 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) 1, (int) (byte) 1);
    }

    @Test
    public void test08773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08773");
        int[] intArray2 = new int[] { '4', 10 };
        int[] intArray4 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (short) 100, (int) (short) -1);
    }

    @Test
    public void test08774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08774");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 100, '4', (-1), (short) 1, (byte) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) 'a', (int) (short) 100);
    }

    @Test
    public void test08775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08775");
        int[] intArray4 = new int[] { (byte) 100, (short) 10, (short) -1, 10 };
        int[] intArray10 = new int[] { (byte) 1, (byte) 1, (byte) 0, 'a', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) 10, (-1));
    }

    @Test
    public void test08776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08776");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, 0, (int) (short) 10);
    }

    @Test
    public void test08777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08777");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray7 = new int[] { 'a', '4', (short) 1, 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) '#', 10);
    }

    @Test
    public void test08778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08778");
        int[] intArray1 = new int[] { 10 };
        int[] intArray6 = new int[] { (byte) 10, 1, (byte) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) 'a', (int) ' ');
    }

    @Test
    public void test08779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08779");
        int[] intArray2 = new int[] { (byte) 0, (byte) 0 };
        int[] intArray6 = new int[] { (byte) -1, (-1), 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (short) 10, (int) (byte) 0);
    }

    @Test
    public void test08780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08780");
        int[] intArray6 = new int[] { (byte) 1, (byte) 1, (short) 1, 0, (short) 0, (byte) 100 };
        int[] intArray9 = new int[] { (byte) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 0, 10);
    }

    @Test
    public void test08781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08781");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 10, (short) -1, (short) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) 1, (int) '4');
    }

    @Test
    public void test08782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08782");
        int[] intArray2 = new int[] { 0, 10 };
        int[] intArray6 = new int[] { (byte) 100, (byte) -1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 100, (int) (byte) 10);
    }

    @Test
    public void test08783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08783");
        int[] intArray4 = new int[] { 10, 'a', '#', (-1) };
        int[] intArray7 = new int[] { 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) 10, (int) '4');
    }

    @Test
    public void test08784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08784");
        int[] intArray3 = new int[] { '4', (short) -1, (short) 10 };
        int[] intArray10 = new int[] { 1, (byte) 100, '#', (short) -1, (byte) 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) '#', (-1));
    }

    @Test
    public void test08785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08785");
        int[] intArray2 = new int[] { 100, 100 };
        int[] intArray9 = new int[] { (short) 10, '4', '4', 100, '#', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) ' ', (int) (byte) 1);
    }

    @Test
    public void test08786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08786");
        int[] intArray3 = new int[] { (short) 10, '4', 100 };
        int[] intArray6 = new int[] { (byte) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) 10, 10);
    }

    @Test
    public void test08787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08787");
        int[] intArray6 = new int[] { ' ', '#', '4', (short) -1, 100, (short) 0 };
        int[] intArray10 = new int[] { 'a', (short) -1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) 1, (int) (short) -1);
    }

    @Test
    public void test08788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08788");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray7 = new int[] { (short) 10, (short) 1, (byte) 0, 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) 100, (int) (byte) 100);
    }

    @Test
    public void test08789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08789");
        int[] intArray1 = new int[] { '4' };
        int[] intArray8 = new int[] { (byte) 100, 0, (short) 0, ' ', '4', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) 10, (int) '#');
    }

    @Test
    public void test08790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08790");
        int[] intArray2 = new int[] { 'a', (byte) 100 };
        int[] intArray7 = new int[] { 1, 'a', 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) -1, (int) (byte) 100);
    }

    @Test
    public void test08791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08791");
        int[] intArray5 = new int[] { (-1), (short) 0, '#', 10, ' ' };
        int[] intArray11 = new int[] { (byte) 100, (short) -1, ' ', 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) 0, (int) (byte) 1);
    }

    @Test
    public void test08792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08792");
        int[] intArray5 = new int[] { ' ', (short) 1, (short) 1, '4', 100 };
        int[] intArray8 = new int[] { ' ', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) 'a', (int) (short) 1);
    }

    @Test
    public void test08793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08793");
        int[] intArray6 = new int[] { (byte) 10, (byte) 100, (-1), (byte) 10, 0, (byte) 0 };
        int[] intArray10 = new int[] { 10, 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 10, (int) 'a');
    }

    @Test
    public void test08794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08794");
        int[] intArray2 = new int[] { (short) 10, 'a' };
        int[] intArray5 = new int[] { (byte) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) 'a', (int) (short) 10);
    }

    @Test
    public void test08795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08795");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 10, (short) 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, 0, 1);
    }

    @Test
    public void test08796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08796");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 0, 100, (short) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) 100, (int) '4');
    }

    @Test
    public void test08797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08797");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) 0, (-1), (short) 100, (byte) 100, (short) 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) 0, (int) '#');
    }

    @Test
    public void test08798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08798");
        int[] intArray2 = new int[] { (-1), 100 };
        int[] intArray9 = new int[] { 'a', (byte) 0, (byte) 0, '4', (byte) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (byte) 1, (int) (short) 0);
    }

    @Test
    public void test08799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08799");
        int[] intArray4 = new int[] { 100, (short) 100, (short) 1, '#' };
        int[] intArray8 = new int[] { 100, 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 0, (int) (short) 1);
    }

    @Test
    public void test08800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08800");
        int[] intArray5 = new int[] { (byte) 0, (short) -1, (short) 0, '4', 'a' };
        int[] intArray10 = new int[] { (byte) -1, '4', (short) 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (-1), (int) (short) -1);
    }

    @Test
    public void test08801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08801");
        int[] intArray3 = new int[] { 'a', (byte) 1, (short) 0 };
        int[] intArray8 = new int[] { '#', (short) -1, '4', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (byte) -1, 0);
    }

    @Test
    public void test08802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08802");
        int[] intArray3 = new int[] { 100, '4', (byte) -1 };
        int[] intArray6 = new int[] { (byte) -1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (-1), (int) (short) 1);
    }

    @Test
    public void test08803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08803");
        int[] intArray6 = new int[] { '4', '#', (short) 10, 10, (short) -1, (short) 1 };
        int[] intArray13 = new int[] { (-1), 10, (byte) 0, 100, 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (byte) 0, 0);
    }

    @Test
    public void test08804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08804");
        int[] intArray4 = new int[] { 10, (short) 10, (short) 0, (byte) 1 };
        int[] intArray7 = new int[] { (byte) 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 100, 0);
    }

    @Test
    public void test08805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08805");
        int[] intArray1 = new int[] { '#' };
        int[] intArray6 = new int[] { (-1), '4', (short) 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 100, (int) '#');
    }

    @Test
    public void test08806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08806");
        int[] intArray5 = new int[] { (short) -1, 'a', 'a', (byte) 0, (byte) 1 };
        int[] intArray8 = new int[] { (byte) 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) 'a', (int) (short) 0);
    }

    @Test
    public void test08807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08807");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { '4', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (-1), (int) (byte) -1);
    }

    @Test
    public void test08808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08808");
        int[] intArray1 = new int[] { 100 };
        int[] intArray4 = new int[] { '#', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, 10, 0);
    }

    @Test
    public void test08809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08809");
        int[] intArray2 = new int[] { (byte) 1, (byte) 100 };
        int[] intArray5 = new int[] { (short) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 1, (int) '#');
    }

    @Test
    public void test08810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08810");
        int[] intArray4 = new int[] { '#', 100, 0, (short) 0 };
        int[] intArray9 = new int[] { 10, (short) 0, 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (byte) 100, 0);
    }

    @Test
    public void test08811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08811");
        int[] intArray6 = new int[] { (byte) 1, ' ', 'a', 100, '#', 100 };
        int[] intArray11 = new int[] { (short) 0, (byte) 0, (short) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 0, (int) (short) 100);
    }

    @Test
    public void test08812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08812");
        int[] intArray6 = new int[] { (short) -1, '#', 'a', (short) -1, (short) 100, ' ' };
        int[] intArray10 = new int[] { 'a', (-1), (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) ' ', (int) ' ');
    }

    @Test
    public void test08813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08813");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) 10, (byte) 0, ' ', (short) 1, 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) 1, (int) (short) 1);
    }

    @Test
    public void test08814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08814");
        int[] intArray2 = new int[] { (short) -1, 10 };
        int[] intArray8 = new int[] { ' ', '#', '4', 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (byte) 10, (int) '#');
    }

    @Test
    public void test08815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08815");
        int[] intArray3 = new int[] { (-1), (byte) 100, (byte) 1 };
        int[] intArray8 = new int[] { '4', (byte) 1, 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) '4', (int) (byte) 10);
    }

    @Test
    public void test08816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08816");
        int[] intArray1 = new int[] { 0 };
        int[] intArray5 = new int[] { (short) -1, 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, 100, 10);
    }

    @Test
    public void test08817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08817");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { '#', (short) 10, 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) ' ', (int) (byte) 10);
    }

    @Test
    public void test08818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08818");
        int[] intArray4 = new int[] { (short) -1, 'a', (short) 100, 100 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (short) 1, 0);
    }

    @Test
    public void test08819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08819");
        int[] intArray2 = new int[] { (byte) 100, (-1) };
        int[] intArray9 = new int[] { '#', (byte) 100, (byte) 1, (short) -1, (-1), 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (byte) 100, 0);
    }

    @Test
    public void test08820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08820");
        int[] intArray4 = new int[] { (byte) 1, (short) 0, (short) 10, (short) 100 };
        int[] intArray11 = new int[] { '#', '#', '#', 'a', (byte) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, 100, (int) (byte) -1);
    }

    @Test
    public void test08821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08821");
        int[] intArray5 = new int[] { (byte) 100, (short) 10, '4', '4', ' ' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) '#', (int) ' ');
    }

    @Test
    public void test08822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08822");
        int[] intArray6 = new int[] { (byte) 100, 1, (short) 1, ' ', (short) 10, '#' };
        int[] intArray11 = new int[] { ' ', (byte) 10, (short) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) 'a', (int) (byte) 100);
    }

    @Test
    public void test08823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08823");
        int[] intArray4 = new int[] { (-1), 0, (byte) 10, '4' };
        int[] intArray11 = new int[] { (short) -1, (-1), (short) 1, 10, '4', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) 0, (int) (short) 100);
    }

    @Test
    public void test08824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08824");
        int[] intArray1 = new int[] { 10 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) -1, (int) '#');
    }

    @Test
    public void test08825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08825");
        int[] intArray2 = new int[] { 0, (byte) 1 };
        int[] intArray4 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) '#', (int) '4');
    }

    @Test
    public void test08826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08826");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray8 = new int[] { (byte) 100, (byte) 10, 1, (byte) 1, (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) 0, (int) 'a');
    }

    @Test
    public void test08827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08827");
        int[] intArray4 = new int[] { (byte) -1, (byte) 0, (byte) 1, (short) 100 };
        int[] intArray6 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) -1, (int) '#');
    }

    @Test
    public void test08828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08828");
        int[] intArray6 = new int[] { (byte) 10, (short) 0, 0, (byte) 100, 10, 10 };
        int[] intArray8 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 10, 10);
    }

    @Test
    public void test08829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08829");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) 100, (int) 'a');
    }

    @Test
    public void test08830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08830");
        int[] intArray6 = new int[] { (byte) -1, (short) 0, (short) 1, (-1), 1, 100 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test08831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08831");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (-1), ' ', (short) -1, (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) 10, 10);
    }

    @Test
    public void test08832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08832");
        int[] intArray6 = new int[] { '4', 'a', (byte) 100, (short) 100, 1, (byte) 10 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) 0, (int) (byte) 0);
    }

    @Test
    public void test08833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08833");
        int[] intArray6 = new int[] { 0, 1, (short) 1, (short) 0, ' ', 0 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) 1, 1);
    }

    @Test
    public void test08834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08834");
        int[] intArray2 = new int[] { '#', (byte) 100 };
        int[] intArray9 = new int[] { (byte) 1, (byte) 10, 0, (byte) 0, (short) 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) ' ', (int) '4');
    }

    @Test
    public void test08835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08835");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray4 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (short) 100, (int) (short) 0);
    }

    @Test
    public void test08836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08836");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray5 = new int[] { (byte) 0, (short) 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) 'a', (int) (byte) 1);
    }

    @Test
    public void test08837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08837");
        int[] intArray3 = new int[] { (byte) 100, 10, 1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (byte) -1, (int) (short) 1);
    }

    @Test
    public void test08838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08838");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray6 = new int[] { (short) 0, 0, (byte) 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 0, (int) (byte) -1);
    }

    @Test
    public void test08839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08839");
        int[] intArray5 = new int[] { 100, 100, '4', (byte) 100, (short) 1 };
        int[] intArray10 = new int[] { (short) -1, '4', '#', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 10, (int) 'a');
    }

    @Test
    public void test08840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08840");
        int[] intArray2 = new int[] { (byte) 10, (-1) };
        int[] intArray8 = new int[] { '#', (short) 1, 100, 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) 0, 0);
    }

    @Test
    public void test08841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08841");
        int[] intArray5 = new int[] { (byte) 10, 1, (short) 100, '#', (short) 10 };
        int[] intArray8 = new int[] { (byte) -1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (-1), (int) (short) 0);
    }

    @Test
    public void test08842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08842");
        int[] intArray4 = new int[] { (byte) 100, (byte) -1, '4', (short) -1 };
        int[] intArray8 = new int[] { (byte) 100, '4', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) '4', 0);
    }

    @Test
    public void test08843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08843");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (short) 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (byte) -1, (int) (short) 10);
    }

    @Test
    public void test08844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08844");
        int[] intArray4 = new int[] { (short) 100, (byte) -1, 'a', (byte) -1 };
        int[] intArray9 = new int[] { '4', (-1), '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (-1), (int) (byte) -1);
    }

    @Test
    public void test08845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08845");
        int[] intArray4 = new int[] { (short) 100, 1, (byte) 10, (byte) -1 };
        int[] intArray6 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (short) 1, 0);
    }

    @Test
    public void test08846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08846");
        int[] intArray1 = new int[] { '4' };
        int[] intArray6 = new int[] { '4', (byte) 10, (short) -1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test08847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08847");
        int[] intArray2 = new int[] { 'a', 100 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (-1), (int) (byte) -1);
    }

    @Test
    public void test08848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08848");
        int[] intArray6 = new int[] { (short) 100, 100, (short) 100, (short) 0, (byte) 1, (short) -1 };
        int[] intArray12 = new int[] { '4', 100, 10, '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (byte) -1, (int) '4');
    }

    @Test
    public void test08849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08849");
        int[] intArray5 = new int[] { (short) 0, (short) 10, (byte) -1, '4', (byte) 10 };
        int[] intArray8 = new int[] { (byte) 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 0, (int) (byte) -1);
    }

    @Test
    public void test08850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08850");
        int[] intArray4 = new int[] { 100, 1, (byte) 1, (short) 1 };
        int[] intArray9 = new int[] { 'a', (short) 1, (short) 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) 100, (int) (byte) 0);
    }

    @Test
    public void test08851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08851");
        int[] intArray3 = new int[] { (short) 10, (byte) 0, ' ' };
        int[] intArray8 = new int[] { 10, 10, (byte) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (byte) 1, (int) (short) 10);
    }

    @Test
    public void test08852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08852");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray3 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) 'a', (-1));
    }

    @Test
    public void test08853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08853");
        int[] intArray2 = new int[] { (short) 100, (byte) 10 };
        int[] intArray4 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (-1), (int) (short) 0);
    }

    @Test
    public void test08854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08854");
        int[] intArray3 = new int[] { 100, 100, (byte) 1 };
        int[] intArray8 = new int[] { '4', (short) 10, ' ', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) '#', (-1));
    }

    @Test
    public void test08855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08855");
        int[] intArray5 = new int[] { (byte) 100, (byte) 0, 0, (byte) -1, ' ' };
        int[] intArray10 = new int[] { (short) 0, (short) 10, (short) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (byte) 10, 0);
    }

    @Test
    public void test08856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08856");
        int[] intArray2 = new int[] { (byte) 0, ' ' };
        int[] intArray5 = new int[] { (short) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (byte) 0, (int) (short) 100);
    }

    @Test
    public void test08857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08857");
        int[] intArray2 = new int[] { (byte) 10, (short) 100 };
        int[] intArray7 = new int[] { (byte) 0, 100, (byte) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 10, (int) (byte) 1);
    }

    @Test
    public void test08858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08858");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) '4', (int) '4');
    }

    @Test
    public void test08859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08859");
        int[] intArray2 = new int[] { (-1), '4' };
        int[] intArray5 = new int[] { (short) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) -1, (int) (short) 10);
    }

    @Test
    public void test08860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08860");
        int[] intArray3 = new int[] { (-1), '#', (short) 100 };
        int[] intArray7 = new int[] { '#', (short) -1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 0, 100);
    }

    @Test
    public void test08861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08861");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray6 = new int[] { 100, 10, (byte) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (short) -1, (int) (byte) 1);
    }

    @Test
    public void test08862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08862");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 1, (int) (byte) 100);
    }

    @Test
    public void test08863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08863");
        int[] intArray4 = new int[] { (short) 100, (short) 0, (short) 0, (byte) -1 };
        int[] intArray11 = new int[] { (-1), (byte) 1, (byte) 10, (short) 1, (short) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) 100, (int) '4');
    }

    @Test
    public void test08864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08864");
        int[] intArray5 = new int[] { 1, 10, (short) 0, (byte) -1, '#' };
        int[] intArray9 = new int[] { (byte) 100, (short) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) 'a', (-1));
    }

    @Test
    public void test08865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08865");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 1, (int) (short) 100);
    }

    @Test
    public void test08866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08866");
        int[] intArray6 = new int[] { (byte) -1, (byte) -1, 100, (short) 10, ' ', (byte) -1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) 'a', (-1));
    }

    @Test
    public void test08867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08867");
        int[] intArray5 = new int[] { ' ', (-1), (byte) 100, '#', (byte) 1 };
        int[] intArray12 = new int[] { (byte) 0, ' ', 100, '#', (short) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, 0, 10);
    }

    @Test
    public void test08868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08868");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (-1), '4', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, 100, (int) '4');
    }

    @Test
    public void test08869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08869");
        int[] intArray3 = new int[] { (byte) -1, 100, (short) -1 };
        int[] intArray7 = new int[] { (short) -1, 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) 1, (int) (byte) 10);
    }

    @Test
    public void test08870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08870");
        int[] intArray2 = new int[] { (byte) 0, (short) -1 };
        int[] intArray7 = new int[] { (byte) 100, (byte) -1, (short) 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 0, (int) (short) 1);
    }

    @Test
    public void test08871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08871");
        int[] intArray6 = new int[] { 10, (byte) 0, (byte) 0, (byte) 1, (short) -1, (short) 1 };
        int[] intArray8 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 0, (int) (short) -1);
    }

    @Test
    public void test08872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08872");
        int[] intArray4 = new int[] { (byte) -1, '4', 100, 1 };
        int[] intArray6 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, 0, 0);
    }

    @Test
    public void test08873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08873");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 10, (byte) 10, (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) 1, (int) (short) 10);
    }

    @Test
    public void test08874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08874");
        int[] intArray4 = new int[] { 1, '4', (byte) -1, (-1) };
        int[] intArray11 = new int[] { 'a', (byte) 100, 100, 1, '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) 100, (int) (short) 10);
    }

    @Test
    public void test08875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08875");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) -1, (int) (short) 100);
    }

    @Test
    public void test08876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08876");
        int[] intArray3 = new int[] { 'a', ' ', (short) 100 };
        int[] intArray6 = new int[] { (byte) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) 'a', (int) 'a');
    }

    @Test
    public void test08877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08877");
        int[] intArray2 = new int[] { (byte) 0, (short) 1 };
        int[] intArray5 = new int[] { ' ', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 0, (int) (short) 100);
    }

    @Test
    public void test08878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08878");
        int[] intArray4 = new int[] { 0, 0, (short) 100, (byte) 100 };
        int[] intArray10 = new int[] { (byte) -1, (byte) 10, (short) 100, (byte) 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) '#', (int) 'a');
    }

    @Test
    public void test08879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08879");
        int[] intArray2 = new int[] { (byte) 1, (short) 100 };
        int[] intArray8 = new int[] { (short) 1, (short) 1, (-1), ' ', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 100, (int) (short) -1);
    }

    @Test
    public void test08880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08880");
        int[] intArray3 = new int[] { '4', ' ', (byte) 100 };
        int[] intArray5 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) 0, (int) (byte) 1);
    }

    @Test
    public void test08881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08881");
        int[] intArray4 = new int[] { (byte) 100, (-1), (byte) 1, (byte) 0 };
        int[] intArray7 = new int[] { (byte) 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (-1), 0);
    }

    @Test
    public void test08882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08882");
        int[] intArray5 = new int[] { (short) 1, ' ', '4', (byte) 1, 1 };
        int[] intArray9 = new int[] { (byte) 100, (-1), (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (byte) 0, 1);
    }

    @Test
    public void test08883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08883");
        int[] intArray5 = new int[] { (short) 10, (byte) 10, (-1), (byte) 100, (short) 0 };
        int[] intArray11 = new int[] { 'a', (byte) 100, ' ', (short) 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) ' ', (int) (byte) -1);
    }

    @Test
    public void test08884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08884");
        int[] intArray5 = new int[] { (short) 1, '#', (-1), (short) 1, 0 };
        int[] intArray9 = new int[] { 1, (-1), (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) '#', (int) 'a');
    }

    @Test
    public void test08885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08885");
        int[] intArray5 = new int[] { 100, (-1), (-1), ' ', (byte) 100 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (short) -1, 0);
    }

    @Test
    public void test08886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08886");
        int[] intArray5 = new int[] { 1, ' ', 0, (byte) -1, ' ' };
        int[] intArray8 = new int[] { (byte) 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) -1, (int) (byte) 1);
    }

    @Test
    public void test08887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08887");
        int[] intArray3 = new int[] { 100, (short) 1, (byte) 10 };
        int[] intArray10 = new int[] { (byte) 1, 10, 0, (byte) 0, ' ', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 0, (int) (short) 1);
    }

    @Test
    public void test08888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08888");
        int[] intArray5 = new int[] { 'a', '4', (short) 100, 10, (byte) 10 };
        int[] intArray12 = new int[] { ' ', ' ', (byte) -1, '4', (short) 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (byte) 0, (int) (byte) 100);
    }

    @Test
    public void test08889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08889");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray8 = new int[] { (-1), 0, (short) 10, (short) -1, '#', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) 0, (int) (byte) 0);
    }

    @Test
    public void test08890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08890");
        int[] intArray2 = new int[] { (short) 0, 100 };
        int[] intArray7 = new int[] { 'a', 10, '4', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (-1), (int) (short) 0);
    }

    @Test
    public void test08891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08891");
        int[] intArray2 = new int[] { (-1), 1 };
        int[] intArray5 = new int[] { 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (byte) 0, (int) (short) 1);
    }

    @Test
    public void test08892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08892");
        int[] intArray2 = new int[] { (byte) 0, 0 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 10, 0);
    }

    @Test
    public void test08893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08893");
        int[] intArray3 = new int[] { 'a', (byte) 1, (short) 10 };
        int[] intArray7 = new int[] { (short) 1, 'a', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 10, (int) (byte) 0);
    }

    @Test
    public void test08894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08894");
        int[] intArray3 = new int[] { ' ', (short) 10, 10 };
        int[] intArray7 = new int[] { 1, 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) ' ', (int) (byte) 0);
    }

    @Test
    public void test08895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08895");
        int[] intArray3 = new int[] { (short) 1, 1, (byte) 1 };
        int[] intArray5 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) 100, (int) (short) 1);
    }

    @Test
    public void test08896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08896");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray8 = new int[] { (short) 100, (byte) -1, 10, (byte) 0, ' ', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) 10, 0);
    }

    @Test
    public void test08897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08897");
        int[] intArray6 = new int[] { '#', (short) 1, 1, '4', 1, (short) 10 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) ' ', 1);
    }

    @Test
    public void test08898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08898");
        int[] intArray6 = new int[] { (short) 1, 10, (short) 1, 100, 1, (-1) };
        int[] intArray12 = new int[] { (-1), (short) -1, (short) 100, '4', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 1, 10);
    }

    @Test
    public void test08899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08899");
        int[] intArray6 = new int[] { '4', '4', (short) 10, (byte) 1, (byte) 100, (short) 0 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) 10, (int) (short) 100);
    }

    @Test
    public void test08900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08900");
        int[] intArray4 = new int[] { 1, (byte) 0, ' ', (short) 0 };
        int[] intArray9 = new int[] { (byte) 1, (short) 100, (byte) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) 10, (int) (short) 10);
    }

    @Test
    public void test08901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08901");
        int[] intArray2 = new int[] { 100, '#' };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 100, (int) '#');
    }

    @Test
    public void test08902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08902");
        int[] intArray4 = new int[] { (byte) 0, 10, (byte) 100, (byte) -1 };
        int[] intArray10 = new int[] { 0, 'a', 1, (short) 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (byte) 1, (int) (short) 100);
    }

    @Test
    public void test08903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08903");
        int[] intArray4 = new int[] { 'a', (byte) 10, (byte) 0, 0 };
        int[] intArray6 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 10, (int) (short) 0);
    }

    @Test
    public void test08904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08904");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray4 = new int[] { (short) -1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, 0, (-1));
    }

    @Test
    public void test08905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08905");
        int[] intArray4 = new int[] { '#', (short) -1, (byte) 1, 100 };
        int[] intArray7 = new int[] { (short) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) 100, (int) (short) 100);
    }

    @Test
    public void test08906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08906");
        int[] intArray4 = new int[] { ' ', 100, 0, (byte) 100 };
        int[] intArray7 = new int[] { (short) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) -1, (int) (short) 10);
    }

    @Test
    public void test08907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08907");
        int[] intArray5 = new int[] { (short) 0, 1, 1, '#', '4' };
        int[] intArray9 = new int[] { (short) -1, (short) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 0, (int) '4');
    }

    @Test
    public void test08908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08908");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray4 = new int[] { (byte) 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) ' ', (int) ' ');
    }

    @Test
    public void test08909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08909");
        int[] intArray2 = new int[] { 'a', (byte) 10 };
        int[] intArray6 = new int[] { 10, '4', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test08910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08910");
        int[] intArray4 = new int[] { ' ', (short) 10, 'a', (-1) };
        int[] intArray7 = new int[] { (byte) 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) '#', (int) (short) -1);
    }

    @Test
    public void test08911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08911");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray8 = new int[] { (short) 10, (short) 10, (short) 10, (short) 100, ' ', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) 'a', (int) (short) 0);
    }

    @Test
    public void test08912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08912");
        int[] intArray4 = new int[] { '4', (short) 100, 0, (byte) 100 };
        int[] intArray9 = new int[] { (-1), (short) 0, 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) 100, (int) (byte) 1);
    }

    @Test
    public void test08913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08913");
        int[] intArray6 = new int[] { (byte) 10, (short) 10, (byte) 100, 100, (byte) 10, 100 };
        int[] intArray12 = new int[] { (short) 100, 10, (byte) 10, (byte) 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) 100, (int) (short) 0);
    }

    @Test
    public void test08914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08914");
        int[] intArray5 = new int[] { 0, (short) -1, (byte) 10, 10, 10 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) 0, (int) '4');
    }

    @Test
    public void test08915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08915");
        int[] intArray4 = new int[] { (byte) 1, 10, 10, 100 };
        int[] intArray6 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, 0, 100);
    }

    @Test
    public void test08916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08916");
        int[] intArray2 = new int[] { (byte) 1, (short) 1 };
        int[] intArray4 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (short) 100, 0);
    }

    @Test
    public void test08917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08917");
        int[] intArray5 = new int[] { (short) -1, '4', (byte) 0, 10, (short) 0 };
        int[] intArray12 = new int[] { (short) 0, (byte) -1, (short) 10, (byte) 10, 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) '4', (-1));
    }

    @Test
    public void test08918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08918");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray4 = new int[] { (short) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 10, (int) (byte) 100);
    }

    @Test
    public void test08919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08919");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray8 = new int[] { (short) 100, (short) -1, (short) 1, (-1), (byte) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) '#', 1);
    }

    @Test
    public void test08920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08920");
        int[] intArray4 = new int[] { (byte) 0, 10, (byte) 0, (byte) 10 };
        int[] intArray10 = new int[] { ' ', (byte) 10, (byte) 0, (short) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, 0, (int) (byte) 100);
    }

    @Test
    public void test08921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08921");
        int[] intArray3 = new int[] { 'a', '#', (byte) 0 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) '4', (int) '4');
    }

    @Test
    public void test08922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08922");
        int[] intArray4 = new int[] { (short) 1, (byte) -1, (short) -1, '#' };
        int[] intArray11 = new int[] { (byte) 1, 100, 'a', (short) 10, '4', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) 100, (int) (byte) 1);
    }

    @Test
    public void test08923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08923");
        int[] intArray3 = new int[] { (byte) 100, (byte) 0, 1 };
        int[] intArray7 = new int[] { (byte) 0, '#', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) 'a', (-1));
    }

    @Test
    public void test08924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08924");
        int[] intArray3 = new int[] { (-1), (-1), (short) 1 };
        int[] intArray9 = new int[] { 1, (byte) 100, (byte) 1, (short) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (short) 100, 1);
    }

    @Test
    public void test08925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08925");
        int[] intArray6 = new int[] { (byte) 0, (byte) -1, ' ', (-1), 10, (-1) };
        int[] intArray8 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) -1, (int) '#');
    }

    @Test
    public void test08926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08926");
        int[] intArray5 = new int[] { '#', 10, (byte) 1, 0, (-1) };
        int[] intArray8 = new int[] { 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) -1, 10);
    }

    @Test
    public void test08927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08927");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray4 = new int[] { '#', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test08928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08928");
        int[] intArray1 = new int[] { 0 };
        int[] intArray8 = new int[] { (short) 1, '4', '4', (short) 0, 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test08929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08929");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 100, 'a', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (-1), (int) (short) -1);
    }

    @Test
    public void test08930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08930");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray8 = new int[] { ' ', ' ', (byte) 100, (short) 100, (short) 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) 'a', (int) (short) 0);
    }

    @Test
    public void test08931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08931");
        int[] intArray6 = new int[] { (byte) -1, (byte) 100, (short) 100, (short) 10, 100, '#' };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) ' ', 100);
    }

    @Test
    public void test08932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08932");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) -1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) '4', (int) '4');
    }

    @Test
    public void test08933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08933");
        int[] intArray3 = new int[] { (byte) 100, (byte) 0, 1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) 100, (int) (short) -1);
    }

    @Test
    public void test08934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08934");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 100, '#', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) -1, (int) '#');
    }

    @Test
    public void test08935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08935");
        int[] intArray3 = new int[] { 0, (short) 0, 0 };
        int[] intArray7 = new int[] { 10, (short) -1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test08936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08936");
        int[] intArray4 = new int[] { (byte) 10, (byte) 100, (-1), (short) 100 };
        int[] intArray11 = new int[] { 1, '#', ' ', 100, (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) 10, (-1));
    }

    @Test
    public void test08937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08937");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) -1, (-1));
    }

    @Test
    public void test08938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08938");
        int[] intArray6 = new int[] { 0, 1, '4', (short) 1, '#', (short) 100 };
        int[] intArray11 = new int[] { 0, 100, (-1), (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 0, (int) (byte) 100);
    }

    @Test
    public void test08939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08939");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray8 = new int[] { (short) -1, '4', (byte) -1, 0, '#', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) 100, (int) ' ');
    }

    @Test
    public void test08940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08940");
        int[] intArray4 = new int[] { (byte) -1, (byte) 0, (byte) -1, (short) 10 };
        int[] intArray8 = new int[] { ' ', (byte) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) 0, (int) (short) -1);
    }

    @Test
    public void test08941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08941");
        int[] intArray4 = new int[] { 'a', (short) 0, 100, (short) 0 };
        int[] intArray6 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) '4', (int) (byte) 0);
    }

    @Test
    public void test08942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08942");
        int[] intArray4 = new int[] { (short) 100, (-1), (byte) 1, (-1) };
        int[] intArray11 = new int[] { (short) 10, (byte) 1, (byte) 100, '#', (short) 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (byte) 1, 10);
    }

    @Test
    public void test08943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08943");
        int[] intArray4 = new int[] { (byte) -1, 10, 100, '#' };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (byte) 100, (int) (byte) 100);
    }

    @Test
    public void test08944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08944");
        int[] intArray6 = new int[] { (byte) 1, '#', ' ', (byte) 0, (byte) -1, 10 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) -1, (int) (short) 100);
    }

    @Test
    public void test08945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08945");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test08946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08946");
        int[] intArray3 = new int[] { 'a', 0, 100 };
        int[] intArray9 = new int[] { 'a', (short) 1, (byte) -1, 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) 'a', (int) ' ');
    }

    @Test
    public void test08947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08947");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 0, ' ', (short) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 100, (int) '#');
    }

    @Test
    public void test08948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08948");
        int[] intArray5 = new int[] { (byte) 0, (byte) 100, (byte) 0, (byte) -1, 10 };
        int[] intArray11 = new int[] { (short) 100, (short) 10, 'a', (short) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) '#', (int) 'a');
    }

    @Test
    public void test08949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08949");
        int[] intArray6 = new int[] { '#', ' ', 1, (short) 100, (short) 0, 100 };
        int[] intArray11 = new int[] { 100, 'a', (short) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (short) -1, (int) (byte) 0);
    }

    @Test
    public void test08950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08950");
        int[] intArray6 = new int[] { '4', (byte) -1, (byte) -1, (short) -1, 1, (-1) };
        int[] intArray13 = new int[] { '4', '#', (byte) 10, (short) 10, (short) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (short) 100, 0);
    }

    @Test
    public void test08951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08951");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (byte) 100, (int) (short) -1);
    }

    @Test
    public void test08952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08952");
        int[] intArray2 = new int[] { (byte) 1, (byte) 1 };
        int[] intArray8 = new int[] { (byte) 100, 'a', (byte) -1, 'a', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) '#', (int) '4');
    }

    @Test
    public void test08953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08953");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) 1, (byte) 1, 0, (byte) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) -1, (int) (byte) 10);
    }

    @Test
    public void test08954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08954");
        int[] intArray3 = new int[] { (byte) -1, 'a', 10 };
        int[] intArray10 = new int[] { (-1), 1, 1, '4', (short) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (-1), (int) 'a');
    }

    @Test
    public void test08955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08955");
        int[] intArray4 = new int[] { (short) 0, (short) -1, (short) -1, '4' };
        int[] intArray9 = new int[] { (short) 100, 10, (byte) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) '#', 10);
    }

    @Test
    public void test08956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08956");
        int[] intArray6 = new int[] { (byte) 10, 1, (short) 0, (short) 0, 10, (short) 1 };
        int[] intArray12 = new int[] { 1, 'a', (byte) 1, (short) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (byte) 1, (int) '#');
    }

    @Test
    public void test08957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08957");
        int[] intArray4 = new int[] { (byte) 10, (byte) -1, (short) 0, ' ' };
        int[] intArray6 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test08958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08958");
        int[] intArray2 = new int[] { (short) 1, 1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 10, (-1));
    }

    @Test
    public void test08959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08959");
        int[] intArray6 = new int[] { (short) 100, (-1), (byte) 1, 0, (-1), (byte) 100 };
        int[] intArray8 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test08960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08960");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray3 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, 0, 1);
    }

    @Test
    public void test08961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08961");
        int[] intArray6 = new int[] { 0, (byte) 0, (byte) -1, (short) 100, '#', ' ' };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, 1, (int) (short) 1);
    }

    @Test
    public void test08962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08962");
        int[] intArray6 = new int[] { 100, (short) 0, (short) 10, '4', ' ', '#' };
        int[] intArray11 = new int[] { 0, '#', '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (byte) 10, (int) '4');
    }

    @Test
    public void test08963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08963");
        int[] intArray5 = new int[] { (short) 1, 10, 1, ' ', ' ' };
        int[] intArray7 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test08964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08964");
        int[] intArray4 = new int[] { '4', 0, (short) 100, 100 };
        int[] intArray9 = new int[] { (byte) 1, (short) 1, 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 0, (int) (short) 10);
    }

    @Test
    public void test08965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08965");
        int[] intArray4 = new int[] { (short) -1, 0, '#', (byte) 0 };
        int[] intArray7 = new int[] { 'a', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) 100, (int) (short) 100);
    }

    @Test
    public void test08966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08966");
        int[] intArray3 = new int[] { (byte) 100, (short) 10, (short) 1 };
        int[] intArray6 = new int[] { 'a', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) 'a', (int) '#');
    }

    @Test
    public void test08967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08967");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray4 = new int[] { (byte) 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 10, 0);
    }

    @Test
    public void test08968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08968");
        int[] intArray5 = new int[] { '#', (-1), (byte) 0, 0, '#' };
        int[] intArray12 = new int[] { '#', (byte) 10, 1, (short) -1, (short) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) '#', (int) (byte) 10);
    }

    @Test
    public void test08969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08969");
        int[] intArray2 = new int[] { (short) 0, 100 };
        int[] intArray7 = new int[] { ' ', (short) 1, '#', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 100, (int) ' ');
    }

    @Test
    public void test08970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08970");
        int[] intArray4 = new int[] { '4', '#', (short) 100, (short) 100 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, 0, 10);
    }

    @Test
    public void test08971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08971");
        int[] intArray4 = new int[] { 100, ' ', 100, 100 };
        int[] intArray8 = new int[] { (short) 1, 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 10, 0);
    }

    @Test
    public void test08972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08972");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray3 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (byte) 100, (int) (short) 100);
    }

    @Test
    public void test08973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08973");
        int[] intArray2 = new int[] { (short) 100, (byte) -1 };
        int[] intArray5 = new int[] { (short) 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 0, 0);
    }

    @Test
    public void test08974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08974");
        int[] intArray3 = new int[] { '#', 100, (byte) 0 };
        int[] intArray9 = new int[] { 1, 0, (byte) 1, (short) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (short) 0, (int) 'a');
    }

    @Test
    public void test08975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08975");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (short) -1, 10);
    }

    @Test
    public void test08976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08976");
        int[] intArray5 = new int[] { (byte) -1, (short) 10, 10, (byte) 10, (short) 10 };
        int[] intArray7 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (short) 100, (int) (byte) -1);
    }

    @Test
    public void test08977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08977");
        int[] intArray2 = new int[] { (short) 0, 100 };
        int[] intArray5 = new int[] { (byte) 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 0, 10);
    }

    @Test
    public void test08978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08978");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) '4', (int) 'a');
    }

    @Test
    public void test08979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08979");
        int[] intArray4 = new int[] { 1, (short) 0, '4', (short) 1 };
        int[] intArray8 = new int[] { (short) 0, ' ', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 1, (int) (byte) 1);
    }

    @Test
    public void test08980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08980");
        int[] intArray3 = new int[] { (short) 100, (byte) 100, (byte) 0 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) 100, 0);
    }

    @Test
    public void test08981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08981");
        int[] intArray1 = new int[] { 0 };
        int[] intArray8 = new int[] { 'a', ' ', 'a', '4', 'a', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) 100, (int) (byte) 1);
    }

    @Test
    public void test08982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08982");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 1, (byte) 0, (byte) 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 1, (int) (byte) 0);
    }

    @Test
    public void test08983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08983");
        int[] intArray2 = new int[] { (byte) -1, 10 };
        int[] intArray7 = new int[] { 1, (short) 1, (byte) -1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) '4', (int) (short) 1);
    }

    @Test
    public void test08984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08984");
        int[] intArray4 = new int[] { (byte) 10, (byte) 100, 10, '4' };
        int[] intArray11 = new int[] { 100, 0, '4', (byte) 0, (byte) 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (byte) -1, 1);
    }

    @Test
    public void test08985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08985");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) -1, 100);
    }

    @Test
    public void test08986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08986");
        int[] intArray5 = new int[] { (short) -1, 10, (byte) -1, (short) 100, (short) -1 };
        int[] intArray7 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) 1, (int) (short) 1);
    }

    @Test
    public void test08987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08987");
        int[] intArray6 = new int[] { (short) 1, (byte) 100, (-1), (short) 100, (short) 100, '#' };
        int[] intArray9 = new int[] { (short) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) 'a', (-1));
    }

    @Test
    public void test08988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08988");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, 10, 10);
    }

    @Test
    public void test08989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08989");
        int[] intArray6 = new int[] { (short) 100, '#', (short) -1, (byte) 1, 10, (byte) 10 };
        int[] intArray9 = new int[] { (short) 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 1, 100);
    }

    @Test
    public void test08990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08990");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray4 = new int[] { (byte) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (short) 10, (int) (short) 1);
    }

    @Test
    public void test08991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08991");
        int[] intArray5 = new int[] { 1, (byte) 0, (byte) 100, ' ', (short) 0 };
        int[] intArray8 = new int[] { 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) 10, 0);
    }

    @Test
    public void test08992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08992");
        int[] intArray4 = new int[] { 0, (byte) 100, (byte) 100, (short) 0 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (byte) 100, (int) (short) -1);
    }

    @Test
    public void test08993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08993");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray3 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (byte) 1, (int) (byte) 10);
    }

    @Test
    public void test08994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08994");
        int[] intArray5 = new int[] { (short) 10, (short) 0, (byte) 0, 100, (short) 0 };
        int[] intArray8 = new int[] { '4', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) 0, (int) (byte) 0);
    }

    @Test
    public void test08995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08995");
        int[] intArray5 = new int[] { (byte) 0, (byte) 10, (byte) -1, (short) 10, (short) 100 };
        int[] intArray8 = new int[] { (byte) 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) '4', (int) '4');
    }

    @Test
    public void test08996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08996");
        int[] intArray5 = new int[] { (short) 100, (byte) 1, (byte) -1, (short) 1, (short) 0 };
        int[] intArray9 = new int[] { 100, (byte) -1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 0, (int) (byte) 100);
    }

    @Test
    public void test08997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08997");
        int[] intArray6 = new int[] { 'a', 10, (short) -1, 1, ' ', (byte) 0 };
        int[] intArray11 = new int[] { 10, (byte) 0, 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test08998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08998");
        int[] intArray3 = new int[] { '4', (short) 100, (short) 10 };
        int[] intArray6 = new int[] { (short) 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) 100, (int) (short) -1);
    }

    @Test
    public void test08999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test08999");
        int[] intArray4 = new int[] { (short) 0, (byte) 100, (byte) 0, (short) 100 };
        int[] intArray6 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, 10, (int) '#');
    }

    @Test
    public void test09000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest17.test09000");
        int[] intArray4 = new int[] { (-1), ' ', '4', 'a' };
        int[] intArray8 = new int[] { 100, 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) 10, (int) (short) 10);
    }
}

