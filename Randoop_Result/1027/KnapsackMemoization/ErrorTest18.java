package KnapsackMemoization;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest18 {

    public static boolean debug = false;

    @Test
    public void test09001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09001");
        int[] intArray5 = new int[] { 0, '4', 100, (byte) -1, 100 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) 0, (int) (byte) 0);
    }

    @Test
    public void test09002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09002");
        int[] intArray5 = new int[] { (short) -1, (short) 100, (short) 1, (short) -1, (byte) 1 };
        int[] intArray8 = new int[] { (short) 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 0, (int) '4');
    }

    @Test
    public void test09003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09003");
        int[] intArray2 = new int[] { (byte) 100, 100 };
        int[] intArray8 = new int[] { 100, (short) 10, (byte) 1, (short) 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 10, (int) '4');
    }

    @Test
    public void test09004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09004");
        int[] intArray5 = new int[] { (-1), (byte) 0, '4', (byte) 100, 'a' };
        int[] intArray7 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, 10, 100);
    }

    @Test
    public void test09005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09005");
        int[] intArray3 = new int[] { 0, (short) 100, (-1) };
        int[] intArray10 = new int[] { (byte) 1, '4', 1, (byte) 0, (short) 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 1, 100);
    }

    @Test
    public void test09006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09006");
        int[] intArray5 = new int[] { '#', (byte) -1, ' ', (short) 100, (byte) 1 };
        int[] intArray9 = new int[] { (short) 10, (short) 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) ' ', (int) (short) -1);
    }

    @Test
    public void test09007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09007");
        int[] intArray6 = new int[] { (byte) 0, 10, 'a', (short) 1, (-1), (short) -1 };
        int[] intArray13 = new int[] { 10, (byte) -1, (short) 0, (short) 10, (short) -1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 1, (int) '4');
    }

    @Test
    public void test09008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09008");
        int[] intArray3 = new int[] { (short) 10, '#', 0 };
        int[] intArray7 = new int[] { 10, (short) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, 0, (int) ' ');
    }

    @Test
    public void test09009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09009");
        int[] intArray6 = new int[] { 0, 1, (byte) -1, (byte) 1, (-1), (short) 1 };
        int[] intArray12 = new int[] { 'a', (short) -1, 100, '4', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) -1, (int) (byte) 0);
    }

    @Test
    public void test09010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09010");
        int[] intArray3 = new int[] { (byte) 1, 'a', ' ' };
        int[] intArray5 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, 100, (int) (short) 10);
    }

    @Test
    public void test09011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09011");
        int[] intArray6 = new int[] { (short) 0, '4', (byte) 1, '#', (-1), ' ' };
        int[] intArray12 = new int[] { 10, (byte) 10, (short) 0, (byte) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 1, (int) (byte) 10);
    }

    @Test
    public void test09012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09012");
        int[] intArray4 = new int[] { (byte) 100, 100, '4', (byte) 0 };
        int[] intArray6 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (short) 100, (-1));
    }

    @Test
    public void test09013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09013");
        int[] intArray2 = new int[] { (short) 1, 'a' };
        int[] intArray9 = new int[] { (-1), 0, (short) 1, (short) 100, (byte) -1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 100, (int) (byte) 1);
    }

    @Test
    public void test09014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09014");
        int[] intArray3 = new int[] { (byte) -1, (byte) 10, (byte) 100 };
        int[] intArray9 = new int[] { 10, (short) 100, 1, (short) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) ' ', (int) (short) 10);
    }

    @Test
    public void test09015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09015");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) ' ', (int) '4');
    }

    @Test
    public void test09016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09016");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray8 = new int[] { (byte) -1, (byte) 0, (byte) -1, 10, (short) -1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) -1, (int) '#');
    }

    @Test
    public void test09017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09017");
        int[] intArray6 = new int[] { ' ', (short) 10, 100, 'a', 'a', 10 };
        int[] intArray9 = new int[] { (short) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, 100, (int) (short) -1);
    }

    @Test
    public void test09018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09018");
        int[] intArray5 = new int[] { (short) 1, (-1), (byte) 1, '4', (byte) -1 };
        int[] intArray7 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, 1, (int) (byte) 0);
    }

    @Test
    public void test09019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09019");
        int[] intArray6 = new int[] { (short) 100, (byte) 0, '#', (-1), (-1), 10 };
        int[] intArray12 = new int[] { (short) 1, (byte) 10, (short) 0, (short) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (byte) 100, (int) (short) 100);
    }

    @Test
    public void test09020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09020");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 100, 1, '4', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) -1, (int) ' ');
    }

    @Test
    public void test09021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09021");
        int[] intArray5 = new int[] { (short) 1, (short) 100, 0, 100, (-1) };
        int[] intArray9 = new int[] { (-1), (byte) 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) -1, (int) (short) 10);
    }

    @Test
    public void test09022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09022");
        int[] intArray6 = new int[] { (short) 1, '#', (short) 1, 0, (short) 0, (-1) };
        int[] intArray11 = new int[] { (short) 0, (byte) -1, 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (byte) 0, (int) (byte) 10);
    }

    @Test
    public void test09023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09023");
        int[] intArray5 = new int[] { (byte) 100, (byte) 0, (byte) 10, (byte) 100, '#' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) '#', (int) '4');
    }

    @Test
    public void test09024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09024");
        int[] intArray4 = new int[] { (short) -1, 'a', 'a', (-1) };
        int[] intArray6 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (short) 100, (int) (byte) 10);
    }

    @Test
    public void test09025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09025");
        int[] intArray4 = new int[] { 10, 'a', '#', (byte) 100 };
        int[] intArray7 = new int[] { (byte) -1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (-1), (int) (short) 1);
    }

    @Test
    public void test09026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09026");
        int[] intArray5 = new int[] { (short) -1, ' ', 0, (byte) 10, (-1) };
        int[] intArray9 = new int[] { ' ', 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test09027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09027");
        int[] intArray3 = new int[] { ' ', (byte) 100, (short) -1 };
        int[] intArray5 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) 1, 10);
    }

    @Test
    public void test09028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09028");
        int[] intArray5 = new int[] { (short) 100, (byte) 1, 1, (short) 1, (-1) };
        int[] intArray7 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, 0, (int) (byte) 100);
    }

    @Test
    public void test09029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09029");
        int[] intArray4 = new int[] { (byte) 100, (byte) -1, 'a', (short) 0 };
        int[] intArray6 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 0, (int) (short) 1);
    }

    @Test
    public void test09030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09030");
        int[] intArray6 = new int[] { 10, (short) -1, (short) 1, 'a', ' ', (short) 10 };
        int[] intArray11 = new int[] { (byte) 1, (byte) 1, 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) '#', (int) (short) 100);
    }

    @Test
    public void test09031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09031");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test09032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09032");
        int[] intArray4 = new int[] { '#', (short) 1, (short) 10, (short) -1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (byte) 10, 0);
    }

    @Test
    public void test09033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09033");
        int[] intArray4 = new int[] { 'a', '4', ' ', 0 };
        int[] intArray9 = new int[] { 10, (-1), 'a', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test09034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09034");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 100, (int) (byte) 10);
    }

    @Test
    public void test09035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09035");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray5 = new int[] { '#', (-1), (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (byte) 1, (int) (byte) -1);
    }

    @Test
    public void test09036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09036");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray8 = new int[] { (short) 0, (-1), 10, (-1), (short) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) -1, (int) (short) -1);
    }

    @Test
    public void test09037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09037");
        int[] intArray2 = new int[] { (byte) 100, (short) 0 };
        int[] intArray9 = new int[] { 1, (short) 10, (-1), 10, 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 0, (int) (short) 1);
    }

    @Test
    public void test09038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09038");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, 1, (int) (byte) -1);
    }

    @Test
    public void test09039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09039");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 100, (short) 10 };
        int[] intArray8 = new int[] { '4', (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) '#', (int) (short) -1);
    }

    @Test
    public void test09040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09040");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) 10, 10, (short) -1, 100, (byte) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) 100, (int) (byte) 0);
    }

    @Test
    public void test09041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09041");
        int[] intArray3 = new int[] { 100, (byte) 0, 0 };
        int[] intArray5 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) ' ', (int) '#');
    }

    @Test
    public void test09042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09042");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) '#', 100);
    }

    @Test
    public void test09043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09043");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) 1, ' ', (byte) 10, (byte) 1, (short) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (-1), (int) (short) 10);
    }

    @Test
    public void test09044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09044");
        int[] intArray2 = new int[] { '4', 1 };
        int[] intArray9 = new int[] { '#', (short) 1, '4', 0, (byte) -1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 1, (int) (short) -1);
    }

    @Test
    public void test09045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09045");
        int[] intArray6 = new int[] { (short) -1, (-1), (short) -1, 0, (byte) 10, (short) 1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, 10, 100);
    }

    @Test
    public void test09046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09046");
        int[] intArray2 = new int[] { (-1), (short) 1 };
        int[] intArray4 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) 'a', (int) (short) 1);
    }

    @Test
    public void test09047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09047");
        int[] intArray2 = new int[] { '#', (byte) 0 };
        int[] intArray4 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (byte) -1, (int) (byte) 0);
    }

    @Test
    public void test09048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09048");
        int[] intArray2 = new int[] { (short) -1, (byte) -1 };
        int[] intArray7 = new int[] { 10, (byte) 0, (byte) 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 1, (int) (byte) 100);
    }

    @Test
    public void test09049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09049");
        int[] intArray2 = new int[] { (short) 100, (short) -1 };
        int[] intArray8 = new int[] { 'a', (short) 0, '4', (short) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) -1, 0);
    }

    @Test
    public void test09050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09050");
        int[] intArray3 = new int[] { (-1), (byte) -1, (short) -1 };
        int[] intArray5 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) 10, (int) (byte) 0);
    }

    @Test
    public void test09051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09051");
        int[] intArray3 = new int[] { (byte) -1, (short) 10, (byte) -1 };
        int[] intArray10 = new int[] { '4', '#', (byte) 10, ' ', 'a', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 0, (int) (byte) 100);
    }

    @Test
    public void test09052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09052");
        int[] intArray6 = new int[] { (byte) 0, (short) 0, (byte) 1, (byte) -1, (byte) 10, (byte) 0 };
        int[] intArray10 = new int[] { (short) 1, (short) 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (short) 100, (int) 'a');
    }

    @Test
    public void test09053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09053");
        int[] intArray4 = new int[] { (byte) 10, '4', 0, (short) -1 };
        int[] intArray6 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) '#', 0);
    }

    @Test
    public void test09054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09054");
        int[] intArray6 = new int[] { (byte) -1, (short) 100, (short) 10, (-1), '4', (short) 1 };
        int[] intArray8 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test09055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09055");
        int[] intArray4 = new int[] { '4', (short) -1, '4', 0 };
        int[] intArray7 = new int[] { (byte) 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 0, 1);
    }

    @Test
    public void test09056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09056");
        int[] intArray6 = new int[] { '4', 1, (short) 10, 10, 'a', (byte) 10 };
        int[] intArray12 = new int[] { (short) 100, (short) -1, (short) 10, 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 10, (int) '4');
    }

    @Test
    public void test09057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09057");
        int[] intArray5 = new int[] { (byte) 1, '4', 10, '#', 'a' };
        int[] intArray9 = new int[] { (byte) 1, ' ', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 10, (int) '4');
    }

    @Test
    public void test09058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09058");
        int[] intArray4 = new int[] { (short) 1, (byte) 100, (short) 100, (byte) 100 };
        int[] intArray6 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) 'a', 0);
    }

    @Test
    public void test09059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09059");
        int[] intArray3 = new int[] { (-1), 10, (byte) -1 };
        int[] intArray9 = new int[] { (byte) 100, (short) 10, (byte) 1, 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 10, (int) (byte) 0);
    }

    @Test
    public void test09060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09060");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        int[] intArray7 = new int[] { 'a', (short) -1, (-1), 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) 'a', (int) ' ');
    }

    @Test
    public void test09061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09061");
        int[] intArray6 = new int[] { (-1), (short) 0, 100, (short) 1, (byte) 0, 0 };
        int[] intArray13 = new int[] { (short) 1, (byte) 0, (byte) -1, (short) 10, (short) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (byte) 10, (-1));
    }

    @Test
    public void test09062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09062");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray3 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) 10, (int) '4');
    }

    @Test
    public void test09063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09063");
        int[] intArray6 = new int[] { ' ', (byte) 0, (short) 10, (short) 10, 1, '4' };
        int[] intArray11 = new int[] { (byte) 0, (byte) 100, 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 0, 100);
    }

    @Test
    public void test09064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09064");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 'a', 0, '#', 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test09065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09065");
        int[] intArray6 = new int[] { (short) 1, (byte) 1, 100, (short) 10, (short) 10, (byte) 0 };
        int[] intArray9 = new int[] { 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 0, (int) (byte) 10);
    }

    @Test
    public void test09066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09066");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray6 = new int[] { 10, 100, 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 1, 0);
    }

    @Test
    public void test09067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09067");
        int[] intArray3 = new int[] { (byte) -1, 100, 1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, 1, (int) '#');
    }

    @Test
    public void test09068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09068");
        int[] intArray1 = new int[] { 1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 10, (int) (byte) 10);
    }

    @Test
    public void test09069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09069");
        int[] intArray3 = new int[] { (byte) 0, '4', (short) 10 };
        int[] intArray5 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, 100, (int) ' ');
    }

    @Test
    public void test09070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09070");
        int[] intArray5 = new int[] { 'a', '#', (-1), 0, '#' };
        int[] intArray7 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (short) 1, (int) ' ');
    }

    @Test
    public void test09071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09071");
        int[] intArray6 = new int[] { (short) 0, ' ', (short) 10, (byte) 1, (short) 0, (byte) 100 };
        int[] intArray8 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 1, (int) 'a');
    }

    @Test
    public void test09072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09072");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (short) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (byte) 10, (int) (short) 0);
    }

    @Test
    public void test09073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09073");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 10, 1);
    }

    @Test
    public void test09074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09074");
        int[] intArray4 = new int[] { (byte) 0, '4', 100, 10 };
        int[] intArray7 = new int[] { ' ', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) 100, (int) (short) 100);
    }

    @Test
    public void test09075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09075");
        int[] intArray1 = new int[] { 0 };
        int[] intArray4 = new int[] { (byte) 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (short) 10, (int) (byte) -1);
    }

    @Test
    public void test09076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09076");
        int[] intArray4 = new int[] { (short) 1, (short) 1, 0, 1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, 1, 0);
    }

    @Test
    public void test09077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09077");
        int[] intArray5 = new int[] { 'a', (byte) 1, 100, (byte) 1, ' ' };
        int[] intArray9 = new int[] { '4', (short) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (byte) 0, (int) (byte) 0);
    }

    @Test
    public void test09078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09078");
        int[] intArray5 = new int[] { (byte) 10, (short) 10, (byte) 100, (byte) 1, 10 };
        int[] intArray9 = new int[] { (short) 0, (short) 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 1, (int) (byte) 100);
    }

    @Test
    public void test09079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09079");
        int[] intArray6 = new int[] { (short) 0, '#', (-1), (byte) -1, 1, (byte) -1 };
        int[] intArray11 = new int[] { (byte) -1, (byte) 1, 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) ' ', 100);
    }

    @Test
    public void test09080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09080");
        int[] intArray6 = new int[] { (short) 100, (byte) 1, 100, (byte) 10, 0, 100 };
        int[] intArray10 = new int[] { (-1), (short) 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) 1, (int) (byte) -1);
    }

    @Test
    public void test09081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09081");
        int[] intArray4 = new int[] { (short) -1, (short) 10, (short) -1, (short) 10 };
        int[] intArray11 = new int[] { 0, (byte) -1, (byte) 1, (short) -1, (byte) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (byte) 10, (int) (short) -1);
    }

    @Test
    public void test09082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09082");
        int[] intArray4 = new int[] { (byte) 100, 'a', (short) 100, (short) -1 };
        int[] intArray7 = new int[] { '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) 1, (int) 'a');
    }

    @Test
    public void test09083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09083");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray6 = new int[] { (short) 1, ' ', (-1), 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (byte) 100, (int) (short) -1);
    }

    @Test
    public void test09084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09084");
        int[] intArray6 = new int[] { (short) 10, (byte) 10, (short) -1, 1, (byte) 10, (short) 0 };
        int[] intArray9 = new int[] { 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (short) 100, (-1));
    }

    @Test
    public void test09085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09085");
        int[] intArray2 = new int[] { (byte) 10, '#' };
        int[] intArray4 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 0, 1);
    }

    @Test
    public void test09086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09086");
        int[] intArray4 = new int[] { (short) -1, (short) -1, (byte) 10, (byte) 1 };
        int[] intArray11 = new int[] { (short) 0, (byte) 0, (short) 1, '#', ' ', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) 100, (int) (byte) -1);
    }

    @Test
    public void test09087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09087");
        int[] intArray4 = new int[] { 'a', 100, (byte) -1, (short) 100 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (byte) 1, (int) (byte) 10);
    }

    @Test
    public void test09088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09088");
        int[] intArray2 = new int[] { '#', 'a' };
        int[] intArray9 = new int[] { (short) 10, '#', (byte) 10, 10, 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test09089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09089");
        int[] intArray5 = new int[] { 100, (short) 10, (byte) 0, 10, 1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) 10, (int) (short) 1);
    }

    @Test
    public void test09090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09090");
        int[] intArray3 = new int[] { (-1), '4', 'a' };
        int[] intArray7 = new int[] { 0, (byte) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) 10, (int) (byte) -1);
    }

    @Test
    public void test09091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09091");
        int[] intArray2 = new int[] { (byte) 1, 0 };
        int[] intArray9 = new int[] { 100, (byte) 0, (-1), (byte) 1, (short) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 10, (int) 'a');
    }

    @Test
    public void test09092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09092");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray7 = new int[] { (byte) -1, (byte) 0, (byte) -1, '4', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) 0, (int) (byte) 100);
    }

    @Test
    public void test09093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09093");
        int[] intArray2 = new int[] { (short) 0, (short) 10 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 0, (int) (byte) 10);
    }

    @Test
    public void test09094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09094");
        int[] intArray6 = new int[] { (short) 1, ' ', (byte) -1, (short) 10, (byte) -1, '4' };
        int[] intArray10 = new int[] { (-1), 'a', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) '#', 0);
    }

    @Test
    public void test09095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09095");
        int[] intArray6 = new int[] { 1, (byte) 0, '4', (byte) 1, (short) 0, (short) 0 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) 0, (-1));
    }

    @Test
    public void test09096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09096");
        int[] intArray2 = new int[] { '#', (short) -1 };
        int[] intArray6 = new int[] { '4', 'a', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 100, (-1));
    }

    @Test
    public void test09097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09097");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) 0, 0, 100, (short) -1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, 0, 0);
    }

    @Test
    public void test09098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09098");
        int[] intArray3 = new int[] { 'a', (byte) 0, (byte) 10 };
        int[] intArray7 = new int[] { (byte) 0, (short) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) 0, (int) (short) 10);
    }

    @Test
    public void test09099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09099");
        int[] intArray5 = new int[] { (byte) 1, (byte) -1, (byte) -1, (short) 100, (short) 1 };
        int[] intArray7 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, 1, (int) (short) 0);
    }

    @Test
    public void test09100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09100");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray6 = new int[] { 10, (byte) 0, '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (byte) 1, (int) '4');
    }

    @Test
    public void test09101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09101");
        int[] intArray3 = new int[] { (byte) -1, (short) 100, (byte) 0 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) '#', (int) (short) 100);
    }

    @Test
    public void test09102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09102");
        int[] intArray6 = new int[] { 10, (byte) 10, 1, '4', 100, (-1) };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, 100, (int) '#');
    }

    @Test
    public void test09103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09103");
        int[] intArray4 = new int[] { 100, (byte) 100, (byte) -1, (short) 1 };
        int[] intArray7 = new int[] { (byte) 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 10, 10);
    }

    @Test
    public void test09104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09104");
        int[] intArray2 = new int[] { 0, 1 };
        int[] intArray7 = new int[] { (short) -1, (short) 0, (short) -1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 0, (int) '#');
    }

    @Test
    public void test09105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09105");
        int[] intArray2 = new int[] { ' ', (short) -1 };
        int[] intArray5 = new int[] { (byte) -1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (byte) -1, (int) '4');
    }

    @Test
    public void test09106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09106");
        int[] intArray1 = new int[] { '#' };
        int[] intArray8 = new int[] { ' ', (short) 0, (short) -1, '4', (short) -1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 100, (int) (byte) 100);
    }

    @Test
    public void test09107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09107");
        int[] intArray6 = new int[] { (-1), 1, (short) -1, (short) 100, ' ', '4' };
        int[] intArray11 = new int[] { 10, (byte) 0, (byte) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (short) 1, (int) (byte) 0);
    }

    @Test
    public void test09108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09108");
        int[] intArray3 = new int[] { 'a', 0, 'a' };
        int[] intArray10 = new int[] { (byte) 100, (short) 1, (short) 100, (byte) 10, (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (byte) 1, (int) (byte) 1);
    }

    @Test
    public void test09109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09109");
        int[] intArray3 = new int[] { '#', 100, (short) 100 };
        int[] intArray7 = new int[] { 0, (byte) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) 0, (int) (byte) 1);
    }

    @Test
    public void test09110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09110");
        int[] intArray2 = new int[] { (byte) 1, 100 };
        int[] intArray4 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 100, (int) (short) -1);
    }

    @Test
    public void test09111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09111");
        int[] intArray4 = new int[] { 0, 100, 0, (short) 100 };
        int[] intArray6 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 10, (-1));
    }

    @Test
    public void test09112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09112");
        int[] intArray6 = new int[] { (-1), 100, (byte) 0, (short) 10, '#', 1 };
        int[] intArray9 = new int[] { (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (-1), 100);
    }

    @Test
    public void test09113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09113");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { ' ', '#', (short) 100, (byte) 10, '#', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) 1, 0);
    }

    @Test
    public void test09114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09114");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 1, 10, 'a', 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (-1), (int) (short) 1);
    }

    @Test
    public void test09115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09115");
        int[] intArray2 = new int[] { ' ', 'a' };
        int[] intArray9 = new int[] { (short) 0, (-1), (byte) 100, (byte) -1, (-1), (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) 'a', (int) (byte) -1);
    }

    @Test
    public void test09116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09116");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (short) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 10, (int) (byte) 1);
    }

    @Test
    public void test09117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09117");
        int[] intArray4 = new int[] { 'a', ' ', ' ', '#' };
        int[] intArray6 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (-1), (int) (short) 10);
    }

    @Test
    public void test09118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09118");
        int[] intArray3 = new int[] { (short) 0, (-1), (byte) 1 };
        int[] intArray8 = new int[] { ' ', 0, '4', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (byte) 0, (int) (short) 1);
    }

    @Test
    public void test09119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09119");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 100, (-1), (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test09120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09120");
        int[] intArray5 = new int[] { (short) -1, ' ', '#', (short) -1, (short) 0 };
        int[] intArray11 = new int[] { (byte) 1, (byte) 1, (short) 1, (byte) 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) 1, (-1));
    }

    @Test
    public void test09121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09121");
        int[] intArray2 = new int[] { (byte) 100, 1 };
        int[] intArray9 = new int[] { 1, (byte) -1, (short) 10, 10, (-1), '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (byte) 10, 100);
    }

    @Test
    public void test09122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09122");
        int[] intArray6 = new int[] { 1, (byte) 1, 1, 0, (short) 100, 10 };
        int[] intArray13 = new int[] { (byte) 1, 'a', ' ', (byte) -1, 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (short) 1, (int) (short) 10);
    }

    @Test
    public void test09123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09123");
        int[] intArray3 = new int[] { (short) 100, (short) 10, (short) 0 };
        int[] intArray5 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) 100, 0);
    }

    @Test
    public void test09124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09124");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) '#', (int) (byte) 1);
    }

    @Test
    public void test09125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09125");
        int[] intArray3 = new int[] { (byte) 100, '4', '#' };
        int[] intArray6 = new int[] { (short) -1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, 10, (int) ' ');
    }

    @Test
    public void test09126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09126");
        int[] intArray3 = new int[] { (byte) 0, (byte) 100, 'a' };
        int[] intArray7 = new int[] { 'a', (short) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) 0, (-1));
    }

    @Test
    public void test09127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09127");
        int[] intArray3 = new int[] { (byte) 100, 'a', 0 };
        int[] intArray5 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (-1), (int) (short) 100);
    }

    @Test
    public void test09128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09128");
        int[] intArray3 = new int[] { (short) 1, (byte) 1, 10 };
        int[] intArray6 = new int[] { 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test09129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09129");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray7 = new int[] { (short) 10, (short) 0, ' ', '4', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) 100, (int) (byte) -1);
    }

    @Test
    public void test09130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09130");
        int[] intArray2 = new int[] { '4', (byte) 0 };
        int[] intArray5 = new int[] { (short) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 0, 0);
    }

    @Test
    public void test09131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09131");
        int[] intArray5 = new int[] { (short) 10, (byte) 1, 10, (short) 10, '4' };
        int[] intArray10 = new int[] { '4', ' ', 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 100, (int) 'a');
    }

    @Test
    public void test09132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09132");
        int[] intArray6 = new int[] { (byte) -1, (short) 10, '4', '#', (byte) -1, (short) 100 };
        int[] intArray11 = new int[] { 1, (byte) 0, (short) -1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 100, 1);
    }

    @Test
    public void test09133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09133");
        int[] intArray5 = new int[] { 100, 1, '4', (short) 0, (short) 100 };
        int[] intArray9 = new int[] { (short) 10, (short) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) -1, (int) ' ');
    }

    @Test
    public void test09134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09134");
        int[] intArray5 = new int[] { (byte) 0, (byte) 100, (byte) -1, (byte) 10, (short) 10 };
        int[] intArray8 = new int[] { ' ', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) 1, (int) (short) 10);
    }

    @Test
    public void test09135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09135");
        int[] intArray2 = new int[] { (short) 0, (short) 100 };
        int[] intArray9 = new int[] { 10, (byte) 10, '#', ' ', 'a', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) ' ', 0);
    }

    @Test
    public void test09136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09136");
        int[] intArray5 = new int[] { (byte) 10, (byte) 100, '4', 'a', (byte) 100 };
        int[] intArray7 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, 100, 100);
    }

    @Test
    public void test09137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09137");
        int[] intArray2 = new int[] { (byte) 100, (short) 10 };
        int[] intArray6 = new int[] { 10, 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) '#', 0);
    }

    @Test
    public void test09138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09138");
        int[] intArray4 = new int[] { 0, 0, 100, (byte) -1 };
        int[] intArray11 = new int[] { (short) 0, (byte) 0, (-1), '4', (byte) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (byte) 10, 0);
    }

    @Test
    public void test09139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09139");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray4 = new int[] { (short) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 0, 1);
    }

    @Test
    public void test09140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09140");
        int[] intArray2 = new int[] { '4', (short) -1 };
        int[] intArray4 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 0, (int) 'a');
    }

    @Test
    public void test09141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09141");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (short) 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 100, (int) '#');
    }

    @Test
    public void test09142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09142");
        int[] intArray2 = new int[] { (byte) -1, (short) 10 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 100, (int) (short) 0);
    }

    @Test
    public void test09143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09143");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, 100, (int) 'a');
    }

    @Test
    public void test09144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09144");
        int[] intArray4 = new int[] { ' ', '4', (byte) 100, (byte) 10 };
        int[] intArray11 = new int[] { (short) 0, 100, 10, 1, 'a', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, 0, 0);
    }

    @Test
    public void test09145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09145");
        int[] intArray6 = new int[] { 100, ' ', 100, (short) 1, (byte) 1, (short) 100 };
        int[] intArray8 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 1, (int) '4');
    }

    @Test
    public void test09146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09146");
        int[] intArray3 = new int[] { (byte) 1, '#', (short) 100 };
        int[] intArray6 = new int[] { '#', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test09147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09147");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray6 = new int[] { ' ', (byte) 10, '4', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 0, (int) (byte) 10);
    }

    @Test
    public void test09148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09148");
        int[] intArray2 = new int[] { ' ', (byte) -1 };
        int[] intArray9 = new int[] { ' ', (short) 0, (byte) 1, (short) 100, (short) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 100, 0);
    }

    @Test
    public void test09149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09149");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray8 = new int[] { (short) 1, 0, 'a', (short) 10, 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 100, (int) (short) 100);
    }

    @Test
    public void test09150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09150");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (byte) 1, 0);
    }

    @Test
    public void test09151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09151");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray6 = new int[] { (short) -1, '#', '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (short) 100, 100);
    }

    @Test
    public void test09152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09152");
        int[] intArray4 = new int[] { (short) 100, (short) 100, 100, '#' };
        int[] intArray7 = new int[] { ' ', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) ' ', (int) (short) 0);
    }

    @Test
    public void test09153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09153");
        int[] intArray5 = new int[] { '4', 1, (short) 1, 0, (short) 1 };
        int[] intArray11 = new int[] { (short) 10, 0, (-1), 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) 1, (int) '4');
    }

    @Test
    public void test09154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09154");
        int[] intArray2 = new int[] { 0, 10 };
        int[] intArray7 = new int[] { '4', (short) -1, 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) -1, (int) (byte) 10);
    }

    @Test
    public void test09155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09155");
        int[] intArray6 = new int[] { (byte) 100, '#', 1, (byte) 0, 1, (byte) 10 };
        int[] intArray8 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 0, 10);
    }

    @Test
    public void test09156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09156");
        int[] intArray6 = new int[] { (-1), (short) 100, (short) 1, '4', '4', 100 };
        int[] intArray13 = new int[] { (-1), (short) -1, (short) 0, (byte) 100, 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) ' ', (int) (byte) 0);
    }

    @Test
    public void test09157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09157");
        int[] intArray5 = new int[] { (short) 10, (byte) 1, (-1), (-1), 'a' };
        int[] intArray9 = new int[] { (byte) 1, 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test09158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09158");
        int[] intArray4 = new int[] { (-1), 10, 'a', 'a' };
        int[] intArray11 = new int[] { 0, (short) 100, (byte) 1, 1, (-1), (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) '#', 1);
    }

    @Test
    public void test09159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09159");
        int[] intArray4 = new int[] { 10, (byte) 1, (byte) 100, 0 };
        int[] intArray6 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 1, (int) '#');
    }

    @Test
    public void test09160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09160");
        int[] intArray4 = new int[] { 'a', ' ', 1, (short) 10 };
        int[] intArray9 = new int[] { (byte) 0, 0, (short) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (-1), (int) (short) -1);
    }

    @Test
    public void test09161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09161");
        int[] intArray4 = new int[] { '#', (short) 1, (byte) 1, (byte) 10 };
        int[] intArray8 = new int[] { 1, 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 10, (int) ' ');
    }

    @Test
    public void test09162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09162");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray6 = new int[] { (short) 1, '4', 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 1, (int) (byte) 0);
    }

    @Test
    public void test09163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09163");
        int[] intArray4 = new int[] { (byte) 1, '4', 'a', '4' };
        int[] intArray8 = new int[] { 10, 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) -1, (int) (byte) 1);
    }

    @Test
    public void test09164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09164");
        int[] intArray4 = new int[] { (byte) 1, (byte) -1, (-1), (byte) 1 };
        int[] intArray10 = new int[] { (byte) 1, (-1), (short) 0, (short) -1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (-1), (int) (short) 10);
    }

    @Test
    public void test09165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09165");
        int[] intArray4 = new int[] { 0, 10, (byte) 100, 10 };
        int[] intArray11 = new int[] { 'a', 10, (short) 100, 100, (short) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, 100, (int) ' ');
    }

    @Test
    public void test09166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09166");
        int[] intArray1 = new int[] { 10 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) -1, 1);
    }

    @Test
    public void test09167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09167");
        int[] intArray3 = new int[] { ' ', ' ', 10 };
        int[] intArray10 = new int[] { 0, 1, (byte) 1, '4', 'a', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 0, (int) (byte) 0);
    }

    @Test
    public void test09168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09168");
        int[] intArray2 = new int[] { (byte) 100, 0 };
        int[] intArray4 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, 0, (int) (byte) 10);
    }

    @Test
    public void test09169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09169");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray8 = new int[] { (byte) 100, (short) 1, 1, (short) 100, '4', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (-1), (int) (byte) 100);
    }

    @Test
    public void test09170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09170");
        int[] intArray6 = new int[] { (short) 100, 100, (byte) 10, 0, '4', ' ' };
        int[] intArray12 = new int[] { (byte) 10, (byte) -1, '4', (byte) 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 0, (int) (byte) 1);
    }

    @Test
    public void test09171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09171");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 100, (byte) 0, (short) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) 0, (int) '4');
    }

    @Test
    public void test09172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09172");
        int[] intArray6 = new int[] { 100, (short) -1, '#', ' ', 'a', (-1) };
        int[] intArray8 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (byte) -1, (int) (byte) 10);
    }

    @Test
    public void test09173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09173");
        int[] intArray5 = new int[] { (-1), (short) 10, '#', (byte) 0, 'a' };
        int[] intArray7 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, 1, (int) 'a');
    }

    @Test
    public void test09174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09174");
        int[] intArray3 = new int[] { (-1), (short) 1, (byte) 100 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) ' ', 0);
    }

    @Test
    public void test09175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09175");
        int[] intArray5 = new int[] { '4', 10, ' ', (byte) 0, (byte) 10 };
        int[] intArray10 = new int[] { (byte) 0, 0, 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 1, 10);
    }

    @Test
    public void test09176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09176");
        int[] intArray5 = new int[] { ' ', (byte) 100, 'a', '#', 100 };
        int[] intArray12 = new int[] { '4', (byte) -1, (byte) 0, (byte) 1, (-1), (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, 100, 10);
    }

    @Test
    public void test09177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09177");
        int[] intArray1 = new int[] { 10 };
        int[] intArray8 = new int[] { 10, 0, 1, '4', (-1), 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 1, 10);
    }

    @Test
    public void test09178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09178");
        int[] intArray6 = new int[] { (byte) 1, (short) 100, 'a', 1, 1, 10 };
        int[] intArray8 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 100, (int) 'a');
    }

    @Test
    public void test09179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09179");
        int[] intArray4 = new int[] { (byte) 100, (byte) 1, (short) 100, (byte) 1 };
        int[] intArray11 = new int[] { (byte) -1, (byte) 1, '#', (short) 1, 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, 10, (int) (byte) 10);
    }

    @Test
    public void test09180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09180");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 100, ' ', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) -1, (int) '#');
    }

    @Test
    public void test09181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09181");
        int[] intArray6 = new int[] { (short) 10, 1, (short) 10, (short) 10, (short) 100, '#' };
        int[] intArray8 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (byte) 10, (int) (byte) 10);
    }

    @Test
    public void test09182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09182");
        int[] intArray5 = new int[] { 0, (byte) 1, 10, (byte) -1, (short) 10 };
        int[] intArray11 = new int[] { '#', (byte) 0, (byte) 100, (byte) 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) 0, (int) (byte) 1);
    }

    @Test
    public void test09183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09183");
        int[] intArray6 = new int[] { '#', (byte) 100, (byte) 1, 'a', 100, (byte) -1 };
        int[] intArray12 = new int[] { '4', (short) -1, (short) -1, (short) 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) '4', (int) (short) -1);
    }

    @Test
    public void test09184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09184");
        int[] intArray2 = new int[] { (byte) 1, (short) -1 };
        int[] intArray4 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (short) 10, (int) '#');
    }

    @Test
    public void test09185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09185");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (byte) 100, 10);
    }

    @Test
    public void test09186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09186");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray5 = new int[] { (short) 0, (short) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, 1, (int) (byte) 1);
    }

    @Test
    public void test09187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09187");
        int[] intArray3 = new int[] { (short) 0, 0, 10 };
        int[] intArray5 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) 1, (-1));
    }

    @Test
    public void test09188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09188");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray6 = new int[] { (byte) 10, '4', (short) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) ' ', 0);
    }

    @Test
    public void test09189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09189");
        int[] intArray6 = new int[] { '4', '#', (byte) 10, (short) 100, (short) 1, 1 };
        int[] intArray10 = new int[] { ' ', 'a', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 0, (int) (byte) 1);
    }

    @Test
    public void test09190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09190");
        int[] intArray4 = new int[] { ' ', (byte) 10, (short) 100, (byte) -1 };
        int[] intArray7 = new int[] { 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) '#', (-1));
    }

    @Test
    public void test09191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09191");
        int[] intArray6 = new int[] { (-1), (short) 100, '#', (byte) 100, (-1), 0 };
        int[] intArray13 = new int[] { 0, (short) 10, 10, 100, (short) 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (short) 0, 0);
    }

    @Test
    public void test09192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09192");
        int[] intArray4 = new int[] { (short) 10, 'a', 10, (short) 100 };
        int[] intArray6 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, 10, (int) (byte) 1);
    }

    @Test
    public void test09193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09193");
        int[] intArray1 = new int[] { 100 };
        int[] intArray5 = new int[] { 10, (byte) 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) '4', 100);
    }

    @Test
    public void test09194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09194");
        int[] intArray6 = new int[] { (byte) 1, (byte) 10, 0, (short) 0, (byte) 0, '4' };
        int[] intArray8 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) -1, (int) (short) -1);
    }

    @Test
    public void test09195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09195");
        int[] intArray2 = new int[] { (short) 1, 100 };
        int[] intArray5 = new int[] { (short) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) '#', (int) (short) 1);
    }

    @Test
    public void test09196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09196");
        int[] intArray4 = new int[] { ' ', (-1), 10, (byte) 1 };
        int[] intArray11 = new int[] { (short) 1, (short) 0, (byte) 0, 10, (byte) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (byte) -1, (int) ' ');
    }

    @Test
    public void test09197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09197");
        int[] intArray3 = new int[] { 1, (short) 1, 0 };
        int[] intArray8 = new int[] { '#', ' ', 'a', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (byte) -1, (int) '#');
    }

    @Test
    public void test09198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09198");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { '4', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 0, 1);
    }

    @Test
    public void test09199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09199");
        int[] intArray2 = new int[] { (-1), (short) 1 };
        int[] intArray6 = new int[] { (byte) 10, 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (-1), (int) (byte) 100);
    }

    @Test
    public void test09200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09200");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) 0, (int) '4');
    }

    @Test
    public void test09201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09201");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) ' ', 10);
    }

    @Test
    public void test09202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09202");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 10, 100, (short) 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) 'a', (int) (short) -1);
    }

    @Test
    public void test09203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09203");
        int[] intArray3 = new int[] { '4', (-1), (-1) };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) 10, (int) (byte) 0);
    }

    @Test
    public void test09204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09204");
        int[] intArray6 = new int[] { (byte) -1, 100, 1, 10, 10, 100 };
        int[] intArray10 = new int[] { (byte) 100, 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (short) 1, (int) (byte) 0);
    }

    @Test
    public void test09205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09205");
        int[] intArray5 = new int[] { (byte) 0, 10, (short) 1, (byte) 10, (-1) };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 100, (int) (short) 1);
    }

    @Test
    public void test09206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09206");
        int[] intArray2 = new int[] { (-1), (short) 0 };
        int[] intArray6 = new int[] { 'a', 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (short) 1, 0);
    }

    @Test
    public void test09207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09207");
        int[] intArray3 = new int[] { (short) 100, ' ', '#' };
        int[] intArray10 = new int[] { (short) 10, (short) 0, (-1), 0, 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 10, (int) '#');
    }

    @Test
    public void test09208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09208");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 1, (short) 0, (byte) 0, (short) 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) -1, (int) '4');
    }

    @Test
    public void test09209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09209");
        int[] intArray6 = new int[] { (short) 0, 1, (byte) -1, ' ', (short) -1, (short) 0 };
        int[] intArray10 = new int[] { (short) 100, 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 0, 100);
    }

    @Test
    public void test09210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09210");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray5 = new int[] { 0, ' ', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) -1, (int) (byte) 0);
    }

    @Test
    public void test09211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09211");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 1, (byte) -1, (short) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) 0, (int) ' ');
    }

    @Test
    public void test09212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09212");
        int[] intArray1 = new int[] { 1 };
        int[] intArray7 = new int[] { (short) 10, (short) 10, (byte) 10, (short) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) 100, (int) (short) 1);
    }

    @Test
    public void test09213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09213");
        int[] intArray3 = new int[] { (byte) 0, (byte) 10, 'a' };
        int[] intArray10 = new int[] { (byte) 10, (byte) 0, (short) 100, (byte) 100, (-1), (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (byte) 0, 0);
    }

    @Test
    public void test09214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09214");
        int[] intArray6 = new int[] { (byte) 10, 1, (-1), (short) 1, ' ', 10 };
        int[] intArray12 = new int[] { (byte) 0, (byte) 1, (short) -1, 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) ' ', (-1));
    }

    @Test
    public void test09215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09215");
        int[] intArray4 = new int[] { (short) 0, (byte) 10, 0, 100 };
        int[] intArray6 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test09216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09216");
        int[] intArray5 = new int[] { '#', (byte) 0, (short) 1, (short) -1, (byte) -1 };
        int[] intArray12 = new int[] { '#', 0, (short) 0, (byte) 10, (byte) 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) '#', (int) (byte) 0);
    }

    @Test
    public void test09217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09217");
        int[] intArray1 = new int[] { '4' };
        int[] intArray7 = new int[] { ' ', (byte) 1, (byte) 0, (short) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) '4', (int) (short) 100);
    }

    @Test
    public void test09218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09218");
        int[] intArray2 = new int[] { (byte) 0, 10 };
        int[] intArray6 = new int[] { 0, (byte) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) 1, (int) (short) -1);
    }

    @Test
    public void test09219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09219");
        int[] intArray5 = new int[] { (byte) 0, (byte) 1, '#', (short) 100, (short) -1 };
        int[] intArray8 = new int[] { (byte) 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) -1, (int) (short) -1);
    }

    @Test
    public void test09220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09220");
        int[] intArray2 = new int[] { (byte) 100, '4' };
        int[] intArray8 = new int[] { (byte) 1, (short) 1, (byte) 10, '#', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) 'a', (-1));
    }

    @Test
    public void test09221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09221");
        int[] intArray6 = new int[] { 'a', (-1), (short) 1, ' ', (byte) 10, 100 };
        int[] intArray8 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) ' ', (int) '4');
    }

    @Test
    public void test09222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09222");
        int[] intArray3 = new int[] { (short) -1, 0, (byte) 100 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, 0, 10);
    }

    @Test
    public void test09223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09223");
        int[] intArray4 = new int[] { ' ', 100, '4', (byte) 0 };
        int[] intArray7 = new int[] { 'a', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) 0, (int) (short) -1);
    }

    @Test
    public void test09224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09224");
        int[] intArray3 = new int[] { (byte) -1, (byte) 0, (short) -1 };
        int[] intArray10 = new int[] { (byte) 0, (byte) 0, (short) -1, ' ', 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 10, (int) (byte) 1);
    }

    @Test
    public void test09225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09225");
        int[] intArray1 = new int[] { '#' };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (-1), 10);
    }

    @Test
    public void test09226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09226");
        int[] intArray5 = new int[] { 'a', '4', (byte) 10, (short) 1, 1 };
        int[] intArray8 = new int[] { (byte) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) 'a', (int) '4');
    }

    @Test
    public void test09227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09227");
        int[] intArray3 = new int[] { (-1), '#', 1 };
        int[] intArray7 = new int[] { ' ', (byte) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (-1), (-1));
    }

    @Test
    public void test09228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09228");
        int[] intArray5 = new int[] { 100, (byte) 100, ' ', 'a', 0 };
        int[] intArray8 = new int[] { (short) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 0, (int) (short) 0);
    }

    @Test
    public void test09229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09229");
        int[] intArray3 = new int[] { (byte) 10, (byte) 1, '4' };
        int[] intArray7 = new int[] { (short) 100, (byte) 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) ' ', 0);
    }

    @Test
    public void test09230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09230");
        int[] intArray6 = new int[] { (short) 10, 10, 1, (short) -1, 0, (short) -1 };
        int[] intArray11 = new int[] { (-1), 1, (short) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 0, 100);
    }

    @Test
    public void test09231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09231");
        int[] intArray2 = new int[] { (byte) 100, (short) -1 };
        int[] intArray6 = new int[] { (short) -1, 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (short) 1, (int) (short) 100);
    }

    @Test
    public void test09232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09232");
        int[] intArray5 = new int[] { 'a', (byte) 100, 100, (byte) 0, (byte) 10 };
        int[] intArray9 = new int[] { '#', 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (byte) -1, (int) (short) 10);
    }

    @Test
    public void test09233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09233");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray7 = new int[] { (byte) -1, (short) 100, 10, (short) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) ' ', 10);
    }

    @Test
    public void test09234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09234");
        int[] intArray4 = new int[] { '4', (byte) 1, (byte) -1, 0 };
        int[] intArray7 = new int[] { (byte) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) -1, 0);
    }

    @Test
    public void test09235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09235");
        int[] intArray5 = new int[] { (short) 0, 'a', (byte) -1, (byte) 10, (short) 100 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) -1, (-1));
    }

    @Test
    public void test09236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09236");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) -1, (short) -1, (byte) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 10, 0);
    }

    @Test
    public void test09237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09237");
        int[] intArray3 = new int[] { 1, (-1), '4' };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test09238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09238");
        int[] intArray2 = new int[] { (byte) 0, '#' };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) 10, (int) (byte) 10);
    }

    @Test
    public void test09239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09239");
        int[] intArray6 = new int[] { 10, 0, (short) 1, (byte) 10, (short) 10, (byte) 10 };
        int[] intArray10 = new int[] { (short) 1, '4', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 10, (int) (byte) 100);
    }

    @Test
    public void test09240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09240");
        int[] intArray1 = new int[] { '4' };
        int[] intArray7 = new int[] { (short) 100, (byte) 0, 10, 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) '4', (int) (short) 10);
    }

    @Test
    public void test09241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09241");
        int[] intArray6 = new int[] { (byte) 0, 'a', (short) 100, '#', 0, '#' };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, 1, 0);
    }

    @Test
    public void test09242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09242");
        int[] intArray5 = new int[] { (byte) 1, 'a', (byte) 0, (short) 1, (byte) 0 };
        int[] intArray11 = new int[] { 0, (byte) -1, 100, '4', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) -1, (int) (short) -1);
    }

    @Test
    public void test09243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09243");
        int[] intArray6 = new int[] { (short) 10, '#', (short) 100, (short) 100, (byte) -1, (byte) 1 };
        int[] intArray12 = new int[] { (short) -1, (byte) 1, (byte) 100, 'a', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) 0, (int) (byte) 0);
    }

    @Test
    public void test09244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09244");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (-1), (int) (byte) 10);
    }

    @Test
    public void test09245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09245");
        int[] intArray2 = new int[] { (short) 1, (short) 100 };
        int[] intArray9 = new int[] { (byte) 100, (short) -1, (short) 1, 1, (short) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (short) 100, (int) (byte) 1);
    }

    @Test
    public void test09246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09246");
        int[] intArray4 = new int[] { (short) 1, 100, 1, (byte) 0 };
        int[] intArray9 = new int[] { 1, 10, (short) 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (byte) 0, 1);
    }

    @Test
    public void test09247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09247");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray5 = new int[] { 0, 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) '4', (-1));
    }

    @Test
    public void test09248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09248");
        int[] intArray3 = new int[] { (byte) 0, (-1), 100 };
        int[] intArray6 = new int[] { (short) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, 1, (int) ' ');
    }

    @Test
    public void test09249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09249");
        int[] intArray3 = new int[] { (short) 100, 10, 10 };
        int[] intArray5 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test09250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09250");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) '#', (int) '4');
    }

    @Test
    public void test09251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09251");
        int[] intArray4 = new int[] { (short) 100, ' ', (short) 100, '4' };
        int[] intArray8 = new int[] { (short) -1, '4', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 10, (int) 'a');
    }

    @Test
    public void test09252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09252");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (byte) 10, (int) (short) 100);
    }

    @Test
    public void test09253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09253");
        int[] intArray3 = new int[] { (short) 0, 0, (short) -1 };
        int[] intArray8 = new int[] { (short) 1, (byte) -1, (short) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (short) 1, (int) '#');
    }

    @Test
    public void test09254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09254");
        int[] intArray5 = new int[] { (byte) 100, 10, (byte) 1, (short) -1, '#' };
        int[] intArray12 = new int[] { 'a', 1, (byte) 10, ' ', (short) 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, 100, (int) (short) 0);
    }

    @Test
    public void test09255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09255");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) ' ', 0);
    }

    @Test
    public void test09256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09256");
        int[] intArray3 = new int[] { 1, (short) 1, '#' };
        int[] intArray5 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) 0, (int) (byte) 100);
    }

    @Test
    public void test09257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09257");
        int[] intArray3 = new int[] { (-1), 'a', (byte) 0 };
        int[] intArray9 = new int[] { (short) 100, 10, (byte) 0, 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (byte) 100, (int) ' ');
    }

    @Test
    public void test09258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09258");
        int[] intArray6 = new int[] { (-1), 10, 1, (byte) 0, 100, (byte) 100 };
        int[] intArray12 = new int[] { (byte) 0, ' ', (short) 0, (byte) 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) 10, 0);
    }

    @Test
    public void test09259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09259");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray3 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) -1, (int) ' ');
    }

    @Test
    public void test09260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09260");
        int[] intArray4 = new int[] { '#', ' ', (-1), (short) 10 };
        int[] intArray9 = new int[] { (byte) 0, (byte) 1, (short) 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) '#', (int) (short) 1);
    }

    @Test
    public void test09261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09261");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) 10, (int) (byte) -1);
    }

    @Test
    public void test09262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09262");
        int[] intArray3 = new int[] { (short) -1, (byte) 0, ' ' };
        int[] intArray8 = new int[] { (short) -1, 0, 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 0, 100);
    }

    @Test
    public void test09263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09263");
        int[] intArray3 = new int[] { '#', (byte) 10, '4' };
        int[] intArray6 = new int[] { (byte) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) 10, 0);
    }

    @Test
    public void test09264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09264");
        int[] intArray3 = new int[] { 'a', (byte) 1, (byte) 10 };
        int[] intArray9 = new int[] { (byte) 100, '4', (short) -1, 'a', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) ' ', 0);
    }

    @Test
    public void test09265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09265");
        int[] intArray2 = new int[] { (short) 10, 10 };
        int[] intArray7 = new int[] { 100, (-1), '4', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) ' ', 10);
    }

    @Test
    public void test09266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09266");
        int[] intArray6 = new int[] { 0, (byte) 0, 'a', '#', (short) 10, ' ' };
        int[] intArray12 = new int[] { (short) 100, (short) 1, ' ', (short) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (byte) -1, 100);
    }

    @Test
    public void test09267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09267");
        int[] intArray4 = new int[] { 0, (byte) 0, (byte) 0, 0 };
        int[] intArray8 = new int[] { (short) 10, (short) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) 100, (int) '#');
    }

    @Test
    public void test09268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09268");
        int[] intArray4 = new int[] { 10, (byte) 10, 0, (-1) };
        int[] intArray7 = new int[] { (short) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 0, (int) (byte) -1);
    }

    @Test
    public void test09269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09269");
        int[] intArray6 = new int[] { (byte) 100, ' ', (byte) 10, 10, (short) -1, (byte) 100 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) 1, (int) (byte) 100);
    }

    @Test
    public void test09270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09270");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { '4', '#', (-1), (byte) 100, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) 100, (int) (byte) 100);
    }

    @Test
    public void test09271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09271");
        int[] intArray5 = new int[] { (byte) 10, (short) 1, ' ', (short) 10, 100 };
        int[] intArray10 = new int[] { (byte) 10, 0, (short) -1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 100, (-1));
    }

    @Test
    public void test09272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09272");
        int[] intArray1 = new int[] { '4' };
        int[] intArray5 = new int[] { (byte) 100, 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, 0, (int) (short) 100);
    }

    @Test
    public void test09273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09273");
        int[] intArray2 = new int[] { 0, (byte) 100 };
        int[] intArray5 = new int[] { '#', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 1, (int) (short) 100);
    }

    @Test
    public void test09274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09274");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (byte) 10, (short) 0, (byte) 1, 0, (-1), 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) 'a', (int) (short) 10);
    }

    @Test
    public void test09275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09275");
        int[] intArray6 = new int[] { 100, (byte) 1, (short) 1, (byte) -1, (byte) -1, 0 };
        int[] intArray8 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 100, 0);
    }

    @Test
    public void test09276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09276");
        int[] intArray4 = new int[] { 10, '4', (byte) -1, (short) 0 };
        int[] intArray10 = new int[] { (short) 0, '#', (byte) -1, (byte) 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) 1, (int) '4');
    }

    @Test
    public void test09277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09277");
        int[] intArray6 = new int[] { (short) 100, (short) 100, '4', (short) 0, (short) 0, (byte) 0 };
        int[] intArray10 = new int[] { (-1), 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 0, (int) ' ');
    }

    @Test
    public void test09278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09278");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (short) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 1, 0);
    }

    @Test
    public void test09279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09279");
        int[] intArray4 = new int[] { (short) 0, (-1), (short) 0, (short) -1 };
        int[] intArray7 = new int[] { (short) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) 10, 0);
    }

    @Test
    public void test09280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09280");
        int[] intArray5 = new int[] { ' ', (byte) 1, (byte) 10, (byte) 1, (short) 0 };
        int[] intArray9 = new int[] { 10, (short) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 0, (int) (byte) 10);
    }

    @Test
    public void test09281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09281");
        int[] intArray5 = new int[] { 1, (byte) 1, (byte) 1, ' ', (short) 1 };
        int[] intArray11 = new int[] { (byte) 0, (short) -1, 1, '4', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) '#', (int) (byte) -1);
    }

    @Test
    public void test09282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09282");
        int[] intArray6 = new int[] { (byte) 100, (byte) -1, '4', '4', (byte) 0, (short) 0 };
        int[] intArray9 = new int[] { 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (short) 100, (-1));
    }

    @Test
    public void test09283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09283");
        int[] intArray5 = new int[] { (byte) 10, (byte) 0, 'a', (short) 100, '#' };
        int[] intArray9 = new int[] { (-1), (-1), (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) ' ', 0);
    }

    @Test
    public void test09284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09284");
        int[] intArray4 = new int[] { (short) 10, 0, 100, (short) 1 };
        int[] intArray11 = new int[] { (short) -1, '4', (short) -1, (short) -1, '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (byte) -1, (-1));
    }

    @Test
    public void test09285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09285");
        int[] intArray5 = new int[] { (byte) 10, '#', (byte) -1, (short) -1, 'a' };
        int[] intArray8 = new int[] { (byte) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) -1, (int) ' ');
    }

    @Test
    public void test09286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09286");
        int[] intArray6 = new int[] { 10, (short) 10, (short) 0, '4', 100, 'a' };
        int[] intArray9 = new int[] { '4', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 100, 100);
    }

    @Test
    public void test09287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09287");
        int[] intArray6 = new int[] { '4', 1, (byte) 0, '#', 1, (byte) 10 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) '#', 10);
    }

    @Test
    public void test09288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09288");
        int[] intArray6 = new int[] { (short) 100, '#', (byte) 0, (byte) -1, '#', (byte) 100 };
        int[] intArray8 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 10, 100);
    }

    @Test
    public void test09289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09289");
        int[] intArray5 = new int[] { 10, 1, (byte) 0, 0, 10 };
        int[] intArray11 = new int[] { '4', 0, (-1), (-1), ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) -1, (int) '#');
    }

    @Test
    public void test09290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09290");
        int[] intArray3 = new int[] { 0, (-1), '4' };
        int[] intArray8 = new int[] { 100, 1, (short) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 1, (-1));
    }

    @Test
    public void test09291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09291");
        int[] intArray3 = new int[] { (short) -1, (short) 0, (short) 1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) '4', (int) (byte) 0);
    }

    @Test
    public void test09292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09292");
        int[] intArray6 = new int[] { (byte) 0, (short) 0, '#', ' ', 1, (byte) -1 };
        int[] intArray13 = new int[] { (-1), 0, 0, 1, 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (byte) 0, (int) '#');
    }

    @Test
    public void test09293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09293");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) 'a', (int) (short) 100);
    }

    @Test
    public void test09294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09294");
        int[] intArray5 = new int[] { (byte) 0, 'a', (byte) 1, (byte) 10, (short) 0 };
        int[] intArray11 = new int[] { '4', (byte) 1, '4', (byte) 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 0, (int) 'a');
    }

    @Test
    public void test09295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09295");
        int[] intArray4 = new int[] { (byte) 100, (byte) 1, (short) -1, 'a' };
        int[] intArray8 = new int[] { (short) 1, 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 0, (-1));
    }

    @Test
    public void test09296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09296");
        int[] intArray2 = new int[] { 1, 0 };
        int[] intArray7 = new int[] { 0, '#', (byte) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) '4', 1);
    }

    @Test
    public void test09297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09297");
        int[] intArray1 = new int[] { 1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) ' ', (int) (short) 1);
    }

    @Test
    public void test09298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09298");
        int[] intArray5 = new int[] { '4', (byte) 100, 'a', (byte) 1, (short) 0 };
        int[] intArray10 = new int[] { (byte) 0, '#', (byte) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) 'a', (int) (byte) 0);
    }

    @Test
    public void test09299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09299");
        int[] intArray2 = new int[] { 1, 10 };
        int[] intArray4 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) '4', (-1));
    }

    @Test
    public void test09300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09300");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 0, (byte) 1, (byte) 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 100, (int) ' ');
    }

    @Test
    public void test09301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09301");
        int[] intArray6 = new int[] { (byte) -1, '4', 1, (byte) 10, (byte) -1, '4' };
        int[] intArray9 = new int[] { (-1), '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 1, (int) (byte) 1);
    }

    @Test
    public void test09302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09302");
        int[] intArray2 = new int[] { 'a', '4' };
        int[] intArray7 = new int[] { 100, (short) 100, 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 10, (int) ' ');
    }

    @Test
    public void test09303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09303");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 100, 0, 'a', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test09304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09304");
        int[] intArray5 = new int[] { 1, (-1), (short) 10, 'a', 'a' };
        int[] intArray9 = new int[] { (short) 10, 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (byte) 0, 1);
    }

    @Test
    public void test09305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09305");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 'a', 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) ' ', (int) '4');
    }

    @Test
    public void test09306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09306");
        int[] intArray3 = new int[] { (short) 10, ' ', (byte) 100 };
        int[] intArray6 = new int[] { 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, 100, (int) '#');
    }

    @Test
    public void test09307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09307");
        int[] intArray3 = new int[] { '4', (byte) 1, (short) 0 };
        int[] intArray6 = new int[] { (byte) 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, 10, (int) ' ');
    }

    @Test
    public void test09308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09308");
        int[] intArray5 = new int[] { (short) 0, (byte) 10, '#', (byte) 1, (short) 10 };
        int[] intArray8 = new int[] { (short) 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) '4', (-1));
    }

    @Test
    public void test09309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09309");
        int[] intArray5 = new int[] { 'a', 10, ' ', (byte) 10, (byte) 0 };
        int[] intArray8 = new int[] { (byte) 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (-1), (int) (short) -1);
    }

    @Test
    public void test09310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09310");
        int[] intArray4 = new int[] { (byte) 0, (short) 0, 0, (byte) 1 };
        int[] intArray10 = new int[] { (byte) 0, (short) 10, 0, 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, 10, (int) (short) 10);
    }

    @Test
    public void test09311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09311");
        int[] intArray3 = new int[] { (short) 0, (short) 100, (-1) };
        int[] intArray9 = new int[] { (short) -1, (short) 1, (byte) -1, (byte) 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) '#', (int) (short) 1);
    }

    @Test
    public void test09312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09312");
        int[] intArray1 = new int[] { '#' };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (-1), (int) (short) 1);
    }

    @Test
    public void test09313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09313");
        int[] intArray6 = new int[] { '#', ' ', (byte) -1, (short) -1, (short) -1, (short) 0 };
        int[] intArray12 = new int[] { '4', (byte) -1, 0, (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (byte) 100, (int) (short) 1);
    }

    @Test
    public void test09314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09314");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) '4', (int) '#');
    }

    @Test
    public void test09315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09315");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) 0, (byte) -1, (short) 0, (byte) 10, ' ', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (-1), (int) (short) 100);
    }

    @Test
    public void test09316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09316");
        int[] intArray1 = new int[] { 0 };
        int[] intArray4 = new int[] { (byte) -1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test09317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09317");
        int[] intArray2 = new int[] { (byte) 1, (-1) };
        int[] intArray8 = new int[] { (byte) 1, 10, (byte) 100, (byte) 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) '#', (int) (short) 0);
    }

    @Test
    public void test09318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09318");
        int[] intArray4 = new int[] { '4', (short) 10, '4', 'a' };
        int[] intArray9 = new int[] { (short) 1, (byte) 0, 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) 100, (int) 'a');
    }

    @Test
    public void test09319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09319");
        int[] intArray3 = new int[] { 0, 1, (short) 0 };
        int[] intArray10 = new int[] { (short) 0, (short) 100, 1, (short) -1, (byte) 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 0, (int) 'a');
    }

    @Test
    public void test09320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09320");
        int[] intArray6 = new int[] { (byte) 100, 10, (short) 10, (byte) 0, (byte) 1, ' ' };
        int[] intArray10 = new int[] { '#', (short) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 10, (int) (short) 10);
    }

    @Test
    public void test09321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09321");
        int[] intArray5 = new int[] { (short) -1, (short) 1, '4', (byte) 0, (-1) };
        int[] intArray7 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) 'a', (int) (byte) -1);
    }

    @Test
    public void test09322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09322");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 'a', 10, (short) 100, 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, 10, (int) (byte) -1);
    }

    @Test
    public void test09323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09323");
        int[] intArray1 = new int[] { '#' };
        int[] intArray7 = new int[] { '#', 0, (short) -1, (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, 10, (int) (byte) 100);
    }

    @Test
    public void test09324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09324");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { '4', (byte) 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, 0, (int) (byte) 10);
    }

    @Test
    public void test09325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09325");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (byte) -1, (int) (byte) 10);
    }

    @Test
    public void test09326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09326");
        int[] intArray5 = new int[] { (byte) 10, (-1), (byte) 10, (byte) 0, 'a' };
        int[] intArray7 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) 'a', (int) (byte) 10);
    }

    @Test
    public void test09327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09327");
        int[] intArray3 = new int[] { 1, (short) -1, (short) 100 };
        int[] intArray5 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) 100, (int) (byte) 1);
    }

    @Test
    public void test09328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09328");
        int[] intArray3 = new int[] { (-1), (byte) 1, (short) 100 };
        int[] intArray7 = new int[] { 1, 'a', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) 100, (int) (byte) 0);
    }

    @Test
    public void test09329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09329");
        int[] intArray3 = new int[] { (-1), '#', ' ' };
        int[] intArray5 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) -1, 10);
    }

    @Test
    public void test09330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09330");
        int[] intArray2 = new int[] { '#', (short) -1 };
        int[] intArray9 = new int[] { (byte) 100, (byte) 0, (short) 10, 10, (byte) -1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (byte) -1, 10);
    }

    @Test
    public void test09331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09331");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (byte) 10, (byte) 10, (short) 0, '4', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) 'a', (int) (byte) 1);
    }

    @Test
    public void test09332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09332");
        int[] intArray4 = new int[] { (short) 0, (short) 1, (byte) -1, (short) 0 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (byte) 100, (int) (short) 0);
    }

    @Test
    public void test09333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09333");
        int[] intArray5 = new int[] { (short) 10, '4', (short) 10, (short) -1, (short) 10 };
        int[] intArray9 = new int[] { (short) 100, (byte) 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (byte) -1, (int) (short) 1);
    }

    @Test
    public void test09334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09334");
        int[] intArray4 = new int[] { 'a', (short) -1, (short) 0, '#' };
        int[] intArray7 = new int[] { (byte) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) 'a', 10);
    }

    @Test
    public void test09335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09335");
        int[] intArray5 = new int[] { '4', (-1), (short) -1, '#', 1 };
        int[] intArray10 = new int[] { 1, 1, (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 1, 10);
    }

    @Test
    public void test09336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09336");
        int[] intArray4 = new int[] { (byte) -1, (short) -1, (short) -1, 'a' };
        int[] intArray6 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 10, 0);
    }

    @Test
    public void test09337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09337");
        int[] intArray4 = new int[] { (short) 10, '4', (byte) 1, '#' };
        int[] intArray8 = new int[] { (short) 1, (short) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 0, (int) 'a');
    }

    @Test
    public void test09338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09338");
        int[] intArray6 = new int[] { 0, '#', 'a', '4', (byte) 100, (byte) 0 };
        int[] intArray10 = new int[] { 100, (byte) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (-1), (int) (short) -1);
    }

    @Test
    public void test09339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09339");
        int[] intArray2 = new int[] { (byte) 1, (byte) -1 };
        int[] intArray7 = new int[] { 0, (short) 10, ' ', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (short) 1, (int) (byte) 0);
    }

    @Test
    public void test09340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09340");
        int[] intArray2 = new int[] { 10, (byte) 100 };
        int[] intArray7 = new int[] { (short) -1, '4', (byte) -1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 0, (int) (byte) 100);
    }

    @Test
    public void test09341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09341");
        int[] intArray3 = new int[] { (short) 10, (byte) 10, 10 };
        int[] intArray5 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) -1, 10);
    }

    @Test
    public void test09342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09342");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray6 = new int[] { 100, (short) 100, 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (byte) -1, (int) (short) -1);
    }

    @Test
    public void test09343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09343");
        int[] intArray5 = new int[] { '4', (short) 100, (short) 1, (-1), (byte) 10 };
        int[] intArray11 = new int[] { 0, '#', '4', (short) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 100, 10);
    }

    @Test
    public void test09344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09344");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray5 = new int[] { (short) 10, ' ', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, 1, 10);
    }

    @Test
    public void test09345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09345");
        int[] intArray6 = new int[] { (byte) 0, (byte) -1, 1, 0, '4', '#' };
        int[] intArray12 = new int[] { (byte) 0, 100, '4', '#', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) 'a', (int) ' ');
    }

    @Test
    public void test09346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09346");
        int[] intArray3 = new int[] { (short) 1, 'a', (byte) 10 };
        int[] intArray10 = new int[] { 100, 10, ' ', (short) 100, 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (-1), 10);
    }

    @Test
    public void test09347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09347");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray7 = new int[] { (byte) 0, 1, (-1), 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) 'a', (int) ' ');
    }

    @Test
    public void test09348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09348");
        int[] intArray4 = new int[] { (short) 100, '#', (byte) 10, 'a' };
        int[] intArray9 = new int[] { (-1), 10, (byte) 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (byte) -1, (int) '#');
    }

    @Test
    public void test09349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09349");
        int[] intArray6 = new int[] { (byte) -1, (byte) 100, '4', (short) 100, (short) 1, 100 };
        int[] intArray8 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) 'a', (int) 'a');
    }

    @Test
    public void test09350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09350");
        int[] intArray3 = new int[] { (short) 100, (byte) 100, (byte) -1 };
        int[] intArray6 = new int[] { '#', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) 10, (-1));
    }

    @Test
    public void test09351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09351");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (short) -1, (-1));
    }

    @Test
    public void test09352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09352");
        int[] intArray6 = new int[] { 1, (byte) 1, (byte) 0, 0, 'a', (byte) 0 };
        int[] intArray13 = new int[] { (short) 10, 10, 10, (byte) 100, 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) '#', 1);
    }

    @Test
    public void test09353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09353");
        int[] intArray5 = new int[] { (byte) 0, (-1), (short) 100, (short) -1, (short) 10 };
        int[] intArray7 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) '4', (int) (byte) 100);
    }

    @Test
    public void test09354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09354");
        int[] intArray3 = new int[] { (byte) 100, 'a', (byte) 1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test09355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09355");
        int[] intArray4 = new int[] { 10, (short) 100, (-1), ' ' };
        int[] intArray8 = new int[] { 1, 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 0, (int) (byte) 100);
    }

    @Test
    public void test09356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09356");
        int[] intArray3 = new int[] { (-1), 1, (short) -1 };
        int[] intArray10 = new int[] { (short) 0, (short) 100, '4', (byte) 100, (short) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 0, 10);
    }

    @Test
    public void test09357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09357");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) 0, (int) (short) -1);
    }

    @Test
    public void test09358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09358");
        int[] intArray6 = new int[] { '4', (byte) 1, 10, 100, ' ', ' ' };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, 0, (-1));
    }

    @Test
    public void test09359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09359");
        int[] intArray3 = new int[] { (short) -1, (short) -1, (short) 10 };
        int[] intArray10 = new int[] { (byte) 10, (byte) 10, (short) -1, 0, '4', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (byte) -1, 10);
    }

    @Test
    public void test09360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09360");
        int[] intArray6 = new int[] { '#', 'a', 0, 1, (byte) 10, (byte) 1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) 1, (int) (byte) 10);
    }

    @Test
    public void test09361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09361");
        int[] intArray5 = new int[] { 1, 'a', (short) 10, (byte) 0, (short) 0 };
        int[] intArray10 = new int[] { 10, 100, 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 1, 10);
    }

    @Test
    public void test09362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09362");
        int[] intArray6 = new int[] { (byte) -1, 0, '4', (byte) 10, 1, (byte) 1 };
        int[] intArray12 = new int[] { (-1), (short) 1, 100, ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 100, (int) (short) -1);
    }

    @Test
    public void test09363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09363");
        int[] intArray3 = new int[] { 100, (short) -1, (short) -1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) 1, (int) (short) -1);
    }

    @Test
    public void test09364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09364");
        int[] intArray2 = new int[] { (short) 10, 0 };
        int[] intArray7 = new int[] { (short) 0, 100, '4', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) ' ', 0);
    }

    @Test
    public void test09365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09365");
        int[] intArray5 = new int[] { (byte) -1, ' ', 10, (byte) 100, (short) 100 };
        int[] intArray12 = new int[] { 0, 'a', ' ', 10, (short) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, 1, (int) (short) -1);
    }

    @Test
    public void test09366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09366");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 100, 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, 1, (int) (byte) 10);
    }

    @Test
    public void test09367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09367");
        int[] intArray3 = new int[] { 100, '#', 'a' };
        int[] intArray5 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) 'a', (int) (byte) 1);
    }

    @Test
    public void test09368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09368");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) '#', (int) (byte) 100);
    }

    @Test
    public void test09369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09369");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 1, 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, 0, (int) (byte) 10);
    }

    @Test
    public void test09370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09370");
        int[] intArray6 = new int[] { 1, (short) -1, (byte) 1, ' ', 100, 0 };
        int[] intArray13 = new int[] { (byte) 10, (byte) 1, 1, 10, (byte) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) ' ', (int) (byte) 10);
    }

    @Test
    public void test09371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09371");
        int[] intArray6 = new int[] { 1, 10, (short) 100, (short) 0, 'a', (short) -1 };
        int[] intArray13 = new int[] { (byte) -1, (byte) -1, '#', 'a', 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) '4', 10);
    }

    @Test
    public void test09372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09372");
        int[] intArray2 = new int[] { (byte) 100, (short) -1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) 10, 0);
    }

    @Test
    public void test09373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09373");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 10, 'a', '4', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) -1, (int) (byte) -1);
    }

    @Test
    public void test09374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09374");
        int[] intArray5 = new int[] { (byte) 1, (short) 100, '#', 0, (byte) -1 };
        int[] intArray12 = new int[] { (short) 100, (short) 10, ' ', (byte) -1, (short) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, 100, (int) '4');
    }

    @Test
    public void test09375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09375");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { '#', 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) '4', (int) (byte) 100);
    }

    @Test
    public void test09376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09376");
        int[] intArray6 = new int[] { 10, (byte) 0, 10, (byte) 1, (byte) 1, 1 };
        int[] intArray8 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (byte) -1, (int) (byte) 100);
    }

    @Test
    public void test09377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09377");
        int[] intArray1 = new int[] { 10 };
        int[] intArray6 = new int[] { (byte) 0, 0, (short) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (short) -1, 1);
    }

    @Test
    public void test09378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09378");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray3 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (byte) 100, (int) (byte) 100);
    }

    @Test
    public void test09379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09379");
        int[] intArray2 = new int[] { 1, (byte) 1 };
        int[] intArray7 = new int[] { (byte) -1, (-1), (-1), (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (short) 0, (int) (byte) -1);
    }

    @Test
    public void test09380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09380");
        int[] intArray2 = new int[] { (byte) 10, (short) 0 };
        int[] intArray7 = new int[] { 0, 1, (short) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (short) 100, (int) (byte) 0);
    }

    @Test
    public void test09381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09381");
        int[] intArray5 = new int[] { (short) 0, (-1), (byte) 1, (byte) 100, 10 };
        int[] intArray8 = new int[] { '#', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) -1, (int) ' ');
    }

    @Test
    public void test09382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09382");
        int[] intArray4 = new int[] { (short) 100, (byte) 0, '4', (byte) 0 };
        int[] intArray9 = new int[] { (short) 10, (short) -1, 'a', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 1, (int) (byte) 10);
    }

    @Test
    public void test09383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09383");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 1, '#', 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 0, 0);
    }

    @Test
    public void test09384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09384");
        int[] intArray6 = new int[] { 100, 'a', 0, (short) -1, (byte) 10, 0 };
        int[] intArray9 = new int[] { '#', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 1, 0);
    }

    @Test
    public void test09385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09385");
        int[] intArray4 = new int[] { '4', 'a', 1, 100 };
        int[] intArray11 = new int[] { (short) -1, 0, (byte) 0, (short) 100, (short) 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) -1, (int) '4');
    }

    @Test
    public void test09386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09386");
        int[] intArray6 = new int[] { (byte) 1, (byte) 100, (byte) 0, 100, (byte) 1, (byte) -1 };
        int[] intArray10 = new int[] { (byte) -1, (byte) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) 0, (int) (short) 1);
    }

    @Test
    public void test09387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09387");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray7 = new int[] { (-1), (byte) 100, ' ', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) ' ', 100);
    }

    @Test
    public void test09388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09388");
        int[] intArray3 = new int[] { (byte) 0, (short) 1, '#' };
        int[] intArray10 = new int[] { '4', 1, 100, (byte) 10, (short) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) -1, 0);
    }

    @Test
    public void test09389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09389");
        int[] intArray1 = new int[] { 0 };
        int[] intArray8 = new int[] { 'a', 1, (-1), (short) -1, (byte) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) '4', 0);
    }

    @Test
    public void test09390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09390");
        int[] intArray6 = new int[] { (byte) 0, 100, 10, (byte) 10, '4', '#' };
        int[] intArray9 = new int[] { 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) 'a', (int) 'a');
    }

    @Test
    public void test09391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09391");
        int[] intArray2 = new int[] { 100, 10 };
        int[] intArray7 = new int[] { (byte) 10, (byte) 1, (byte) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (short) 0, 1);
    }

    @Test
    public void test09392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09392");
        int[] intArray6 = new int[] { '#', ' ', (byte) 0, (byte) -1, 100, (short) 100 };
        int[] intArray11 = new int[] { (short) 10, (byte) 1, '4', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) 'a', 10);
    }

    @Test
    public void test09393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09393");
        int[] intArray2 = new int[] { 0, ' ' };
        int[] intArray6 = new int[] { 100, 'a', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) 10, (int) (short) -1);
    }

    @Test
    public void test09394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09394");
        int[] intArray5 = new int[] { (byte) -1, 1, 100, ' ', (short) 10 };
        int[] intArray12 = new int[] { (short) -1, 'a', 100, 1, (short) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) 10, (int) (short) 100);
    }

    @Test
    public void test09395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09395");
        int[] intArray6 = new int[] { (short) -1, (short) 100, '#', (byte) -1, 1, '#' };
        int[] intArray8 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 0, 1);
    }

    @Test
    public void test09396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09396");
        int[] intArray4 = new int[] { 100, (byte) 10, (byte) 10, 'a' };
        int[] intArray8 = new int[] { ' ', (short) -1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 0, (int) (short) 100);
    }

    @Test
    public void test09397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09397");
        int[] intArray4 = new int[] { (byte) 1, 1, (byte) 10, ' ' };
        int[] intArray8 = new int[] { (byte) 0, (-1), (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) -1, 100);
    }

    @Test
    public void test09398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09398");
        int[] intArray3 = new int[] { (short) 100, (-1), '4' };
        int[] intArray9 = new int[] { (byte) 10, 10, (short) 100, (-1), (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test09399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09399");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { '#', (short) 1, 'a', (short) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) 1, (int) '4');
    }

    @Test
    public void test09400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09400");
        int[] intArray3 = new int[] { (short) -1, (-1), 0 };
        int[] intArray6 = new int[] { ' ', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) -1, (int) 'a');
    }

    @Test
    public void test09401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09401");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (byte) 0, (int) (byte) -1);
    }

    @Test
    public void test09402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09402");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) -1 };
        int[] intArray9 = new int[] { 'a', 0, (short) 0, (byte) 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (byte) -1, (int) (byte) 0);
    }

    @Test
    public void test09403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09403");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 10, 0, (short) 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 1, (int) 'a');
    }

    @Test
    public void test09404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09404");
        int[] intArray1 = new int[] { 0 };
        int[] intArray4 = new int[] { 'a', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) '4', (-1));
    }

    @Test
    public void test09405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09405");
        int[] intArray3 = new int[] { (short) 100, (short) 100, (byte) -1 };
        int[] intArray5 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) -1, (-1));
    }

    @Test
    public void test09406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09406");
        int[] intArray2 = new int[] { 100, 1 };
        int[] intArray9 = new int[] { '#', '4', (byte) 0, '4', 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (short) 0, (int) (byte) -1);
    }

    @Test
    public void test09407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09407");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 0, (short) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (-1), (int) (short) 1);
    }

    @Test
    public void test09408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09408");
        int[] intArray5 = new int[] { (byte) -1, (short) 0, (short) 100, (byte) -1, '4' };
        int[] intArray12 = new int[] { (byte) -1, (short) 0, (short) 10, (-1), (byte) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) '4', 100);
    }

    @Test
    public void test09409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09409");
        int[] intArray6 = new int[] { (-1), (byte) -1, 'a', (short) -1, (short) 0, 1 };
        int[] intArray13 = new int[] { 1, ' ', (short) -1, (byte) -1, '4', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (byte) 100, (int) (byte) -1);
    }

    @Test
    public void test09410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09410");
        int[] intArray3 = new int[] { (short) 100, (byte) -1, 'a' };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) -1, (int) (short) 10);
    }

    @Test
    public void test09411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09411");
        int[] intArray5 = new int[] { (short) 10, (byte) 100, (short) 100, (byte) 10, (short) 0 };
        int[] intArray8 = new int[] { ' ', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) 100, (int) (byte) 100);
    }

    @Test
    public void test09412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09412");
        int[] intArray5 = new int[] { (short) -1, (byte) 10, 1, (byte) 10, (short) 100 };
        int[] intArray8 = new int[] { 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) 0, (int) '4');
    }

    @Test
    public void test09413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09413");
        int[] intArray4 = new int[] { '4', 100, (-1), (byte) 0 };
        int[] intArray9 = new int[] { (short) 0, 1, (byte) -1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 100, 10);
    }

    @Test
    public void test09414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09414");
        int[] intArray2 = new int[] { ' ', 0 };
        int[] intArray8 = new int[] { (short) 100, (byte) 1, '#', 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 1, (int) (short) 0);
    }

    @Test
    public void test09415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09415");
        int[] intArray1 = new int[] { 1 };
        int[] intArray7 = new int[] { (short) -1, (byte) 0, 'a', (short) 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) 0, (int) (short) 100);
    }

    @Test
    public void test09416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09416");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray4 = new int[] { (short) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, 0, (int) (byte) -1);
    }

    @Test
    public void test09417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09417");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray7 = new int[] { ' ', (byte) 10, '#', (byte) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) 0, (int) (byte) -1);
    }

    @Test
    public void test09418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09418");
        int[] intArray2 = new int[] { (short) 100, (short) 100 };
        int[] intArray8 = new int[] { 10, (byte) 10, (-1), (short) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) '4', (int) ' ');
    }

    @Test
    public void test09419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09419");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray4 = new int[] { (-1), 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, 1, (int) (short) 100);
    }

    @Test
    public void test09420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09420");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (byte) 100, (int) (short) -1);
    }

    @Test
    public void test09421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09421");
        int[] intArray5 = new int[] { 'a', (short) 10, ' ', (short) 10, '#' };
        int[] intArray11 = new int[] { (short) 100, 0, (short) 100, 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) ' ', 10);
    }

    @Test
    public void test09422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09422");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 0, (-1), (byte) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) 10, (int) '#');
    }

    @Test
    public void test09423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09423");
        int[] intArray2 = new int[] { 0, (byte) 1 };
        int[] intArray6 = new int[] { 10, 'a', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) ' ', 1);
    }

    @Test
    public void test09424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09424");
        int[] intArray6 = new int[] { (byte) -1, (byte) -1, (-1), (byte) 10, (short) 0, 1 };
        int[] intArray11 = new int[] { 1, (short) 10, 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test09425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09425");
        int[] intArray6 = new int[] { 100, (short) 10, '4', '#', (short) 1, '4' };
        int[] intArray13 = new int[] { (short) 100, (short) 100, 0, (short) 1, ' ', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (short) -1, (int) (byte) 10);
    }

    @Test
    public void test09426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09426");
        int[] intArray2 = new int[] { 10, (short) 100 };
        int[] intArray8 = new int[] { (short) 100, 0, (short) 1, (byte) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) 'a', 0);
    }

    @Test
    public void test09427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09427");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray5 = new int[] { (byte) 1, (byte) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, 1, (-1));
    }

    @Test
    public void test09428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09428");
        int[] intArray3 = new int[] { 100, 100, (byte) -1 };
        int[] intArray6 = new int[] { '#', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) 10, (int) ' ');
    }

    @Test
    public void test09429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09429");
        int[] intArray1 = new int[] { '#' };
        int[] intArray5 = new int[] { (short) -1, (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (byte) 100, (int) (short) -1);
    }

    @Test
    public void test09430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09430");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray3 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) '#', (-1));
    }

    @Test
    public void test09431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09431");
        int[] intArray4 = new int[] { (byte) 1, ' ', (byte) 100, (byte) -1 };
        int[] intArray7 = new int[] { 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 10, (int) (short) 10);
    }

    @Test
    public void test09432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09432");
        int[] intArray5 = new int[] { 1, '#', 1, (short) 100, '#' };
        int[] intArray11 = new int[] { 10, (short) 10, '4', 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, 10, 1);
    }

    @Test
    public void test09433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09433");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 1, '#', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) -1, (int) (short) 0);
    }

    @Test
    public void test09434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09434");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (byte) 100, (int) 'a');
    }

    @Test
    public void test09435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09435");
        int[] intArray6 = new int[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        int[] intArray8 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (-1), 0);
    }

    @Test
    public void test09436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09436");
        int[] intArray3 = new int[] { 100, 100, (-1) };
        int[] intArray9 = new int[] { (short) 0, (byte) 100, (short) 10, ' ', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test09437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09437");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) -1, (byte) 100, (short) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) ' ', 0);
    }

    @Test
    public void test09438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09438");
        int[] intArray5 = new int[] { (byte) 10, (short) 100, (byte) 10, (short) 1, 100 };
        int[] intArray10 = new int[] { (short) 1, (byte) 10, '4', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (byte) -1, (int) (byte) 1);
    }

    @Test
    public void test09439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09439");
        int[] intArray6 = new int[] { (byte) 100, '#', ' ', 0, (short) 0, (short) -1 };
        int[] intArray10 = new int[] { 100, '4', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (short) -1, (int) (short) 100);
    }

    @Test
    public void test09440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09440");
        int[] intArray4 = new int[] { '#', (byte) 1, (byte) -1, (-1) };
        int[] intArray11 = new int[] { ' ', 10, (short) 1, (byte) -1, (byte) 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) 'a', (int) (short) 10);
    }

    @Test
    public void test09441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09441");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray5 = new int[] { (byte) -1, 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) -1, (int) (short) 0);
    }

    @Test
    public void test09442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09442");
        int[] intArray6 = new int[] { '4', (short) -1, 1, (short) 10, 1, 1 };
        int[] intArray10 = new int[] { (byte) 10, '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (short) 0, (int) (short) 10);
    }

    @Test
    public void test09443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09443");
        int[] intArray6 = new int[] { (byte) 100, (short) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 100 };
        int[] intArray11 = new int[] { (byte) -1, (short) 0, '#', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (short) 0, 100);
    }

    @Test
    public void test09444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09444");
        int[] intArray3 = new int[] { (short) 1, 1, '#' };
        int[] intArray5 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) 10, (int) ' ');
    }

    @Test
    public void test09445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09445");
        int[] intArray3 = new int[] { (byte) 100, 100, (byte) 100 };
        int[] intArray6 = new int[] { (short) 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, 0, (-1));
    }

    @Test
    public void test09446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09446");
        int[] intArray6 = new int[] { (short) -1, (byte) 0, ' ', (short) -1, ' ', 'a' };
        int[] intArray11 = new int[] { (byte) -1, 1, (short) 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) '#', 1);
    }

    @Test
    public void test09447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09447");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray7 = new int[] { (short) 10, (byte) -1, '4', (-1), 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) 10, (int) (short) 1);
    }

    @Test
    public void test09448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09448");
        int[] intArray6 = new int[] { '#', (-1), (byte) 1, (byte) 10, (short) 100, (byte) 0 };
        int[] intArray8 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) -1, 1);
    }

    @Test
    public void test09449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09449");
        int[] intArray4 = new int[] { (byte) 0, (-1), ' ', (short) 0 };
        int[] intArray8 = new int[] { (short) 100, (short) 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 100, (int) (short) 1);
    }

    @Test
    public void test09450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09450");
        int[] intArray2 = new int[] { 'a', (short) 0 };
        int[] intArray8 = new int[] { 100, 100, (byte) 0, (-1), (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (-1), 0);
    }

    @Test
    public void test09451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09451");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (short) 10, (int) '4');
    }

    @Test
    public void test09452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09452");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 100, 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) -1, (int) 'a');
    }

    @Test
    public void test09453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09453");
        int[] intArray4 = new int[] { 10, (byte) 0, '#', (byte) -1 };
        int[] intArray6 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, 10, (int) (short) -1);
    }

    @Test
    public void test09454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09454");
        int[] intArray3 = new int[] { (byte) 1, (byte) 0, (byte) 0 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) 0, (int) (short) 0);
    }

    @Test
    public void test09455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09455");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray6 = new int[] { (short) 10, 10, (byte) -1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 0, 100);
    }

    @Test
    public void test09456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09456");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 100, ' ', 0, 1, (byte) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, 100, (int) (byte) -1);
    }

    @Test
    public void test09457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09457");
        int[] intArray6 = new int[] { '4', (-1), (short) 100, (-1), 10, (byte) 10 };
        int[] intArray10 = new int[] { (byte) 10, (short) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) 10, (int) (short) 100);
    }

    @Test
    public void test09458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09458");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray6 = new int[] { 100, '4', 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 1, (int) (byte) 100);
    }

    @Test
    public void test09459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09459");
        int[] intArray2 = new int[] { (byte) 100, (byte) 1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test09460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09460");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (byte) 100, (int) (short) 1);
    }

    @Test
    public void test09461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09461");
        int[] intArray2 = new int[] { (byte) 1, (short) 100 };
        int[] intArray6 = new int[] { ' ', (short) 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) 100, (int) (byte) -1);
    }

    @Test
    public void test09462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09462");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray4 = new int[] { (byte) 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) ' ', (int) (byte) -1);
    }

    @Test
    public void test09463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09463");
        int[] intArray5 = new int[] { (short) -1, (byte) 100, 10, (byte) 10, (byte) -1 };
        int[] intArray10 = new int[] { (byte) 10, (byte) 100, '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (short) 100, (int) (byte) 0);
    }

    @Test
    public void test09464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09464");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray4 = new int[] { (short) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) 'a', (int) (short) 10);
    }

    @Test
    public void test09465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09465");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray6 = new int[] { (short) 100, (short) 10, (byte) 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) 'a', (int) (short) 100);
    }

    @Test
    public void test09466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09466");
        int[] intArray4 = new int[] { 'a', '#', (short) -1, '4' };
        int[] intArray6 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) '#', 0);
    }

    @Test
    public void test09467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09467");
        int[] intArray4 = new int[] { 100, (short) -1, (byte) 100, (short) -1 };
        int[] intArray11 = new int[] { 100, (short) 1, (short) 100, (byte) 100, 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (byte) 0, (int) (short) 1);
    }

    @Test
    public void test09468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09468");
        int[] intArray3 = new int[] { 0, (-1), (short) 1 };
        int[] intArray7 = new int[] { (byte) 1, (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) 0, (int) (byte) 10);
    }

    @Test
    public void test09469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09469");
        int[] intArray2 = new int[] { 10, (short) 0 };
        int[] intArray4 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) 'a', (int) (short) -1);
    }

    @Test
    public void test09470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09470");
        int[] intArray4 = new int[] { (short) 100, 1, (byte) 10, (short) 10 };
        int[] intArray11 = new int[] { (byte) 100, '4', '4', '#', '#', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, 100, (-1));
    }

    @Test
    public void test09471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09471");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 100, 'a', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, 1, (int) (short) 10);
    }

    @Test
    public void test09472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09472");
        int[] intArray5 = new int[] { (short) -1, (byte) 0, 'a', (byte) 1, (short) 1 };
        int[] intArray8 = new int[] { 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) 'a', (-1));
    }

    @Test
    public void test09473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09473");
        int[] intArray2 = new int[] { (byte) 0, 'a' };
        int[] intArray9 = new int[] { (short) 0, 100, (short) 10, (short) -1, 'a', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 10, (int) (short) 1);
    }

    @Test
    public void test09474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09474");
        int[] intArray4 = new int[] { (short) -1, (byte) 0, 'a', 100 };
        int[] intArray6 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) 'a', (int) '4');
    }

    @Test
    public void test09475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09475");
        int[] intArray6 = new int[] { 'a', '#', '4', (byte) 0, 'a', '4' };
        int[] intArray12 = new int[] { 10, '#', 'a', (byte) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) 'a', (int) (byte) -1);
    }

    @Test
    public void test09476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09476");
        int[] intArray6 = new int[] { (byte) 1, '4', ' ', (byte) 0, (byte) 1, (byte) 10 };
        int[] intArray8 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (byte) 1, (int) ' ');
    }

    @Test
    public void test09477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09477");
        int[] intArray1 = new int[] { 1 };
        int[] intArray6 = new int[] { (short) -1, 1, (byte) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 0, (int) '4');
    }

    @Test
    public void test09478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09478");
        int[] intArray3 = new int[] { (-1), 0, 100 };
        int[] intArray10 = new int[] { (byte) 10, ' ', 0, 100, (byte) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (-1), 1);
    }

    @Test
    public void test09479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09479");
        int[] intArray2 = new int[] { (short) -1, (byte) -1 };
        int[] intArray5 = new int[] { '4', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (byte) 10, (int) (short) 1);
    }

    @Test
    public void test09480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09480");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray8 = new int[] { '#', (short) 100, (byte) 1, '4', (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) 10, (int) (short) 1);
    }

    @Test
    public void test09481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09481");
        int[] intArray3 = new int[] { (short) 0, (short) 10, (short) 100 };
        int[] intArray5 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) -1, (int) '#');
    }

    @Test
    public void test09482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09482");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray3 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (-1), (int) (byte) -1);
    }

    @Test
    public void test09483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09483");
        int[] intArray4 = new int[] { (byte) 100, (short) 100, '#', ' ' };
        int[] intArray9 = new int[] { '4', '#', 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) 10, 0);
    }

    @Test
    public void test09484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09484");
        int[] intArray4 = new int[] { '#', (-1), ' ', (byte) 10 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, 10, (int) (short) 10);
    }

    @Test
    public void test09485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09485");
        int[] intArray2 = new int[] { 1, (short) 1 };
        int[] intArray8 = new int[] { ' ', 'a', '#', '4', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) 100, 0);
    }

    @Test
    public void test09486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09486");
        int[] intArray5 = new int[] { (-1), ' ', '#', 100, 'a' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 10, (int) (short) 10);
    }

    @Test
    public void test09487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09487");
        int[] intArray4 = new int[] { (-1), (short) 100, '#', (short) 100 };
        int[] intArray8 = new int[] { (short) 10, (byte) 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 100, (int) (byte) 1);
    }

    @Test
    public void test09488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09488");
        int[] intArray5 = new int[] { (byte) 0, 'a', 1, '#', (short) 0 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 0, 1);
    }

    @Test
    public void test09489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09489");
        int[] intArray5 = new int[] { (byte) 0, (short) 0, 'a', (short) 10, (short) 1 };
        int[] intArray10 = new int[] { (short) 100, '4', (byte) 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (-1), 0);
    }

    @Test
    public void test09490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09490");
        int[] intArray1 = new int[] { 1 };
        int[] intArray8 = new int[] { 'a', (byte) 100, (-1), (short) 100, (byte) 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (-1), 1);
    }

    @Test
    public void test09491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09491");
        int[] intArray6 = new int[] { (-1), 'a', (-1), 1, (byte) -1, ' ' };
        int[] intArray11 = new int[] { 0, (short) 10, ' ', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) '4', 100);
    }

    @Test
    public void test09492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09492");
        int[] intArray3 = new int[] { (short) 100, (byte) -1, 10 };
        int[] intArray5 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) -1, (int) (short) 1);
    }

    @Test
    public void test09493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09493");
        int[] intArray3 = new int[] { 100, 'a', (byte) 1 };
        int[] intArray10 = new int[] { (short) 100, 'a', (byte) 1, (short) 0, '#', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 1, (int) (short) 0);
    }

    @Test
    public void test09494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09494");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test09495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09495");
        int[] intArray3 = new int[] { 'a', '4', (byte) -1 };
        int[] intArray6 = new int[] { (-1), (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test09496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09496");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (byte) 100, (int) (short) -1);
    }

    @Test
    public void test09497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09497");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (byte) 1, 100, (byte) -1, '#', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) 1, (int) (short) 10);
    }

    @Test
    public void test09498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09498");
        int[] intArray5 = new int[] { (byte) 100, (byte) -1, 10, (short) -1, (short) 100 };
        int[] intArray12 = new int[] { (byte) -1, 100, 100, (short) 100, (-1), (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, 0, (int) (short) 100);
    }

    @Test
    public void test09499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09499");
        int[] intArray5 = new int[] { 'a', (byte) -1, 1, (short) 100, '4' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 10, (int) 'a');
    }

    @Test
    public void test09500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest18.test09500");
        int[] intArray6 = new int[] { 10, (short) 10, '#', (byte) 0, ' ', (byte) -1 };
        int[] intArray9 = new int[] { '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) '#', 0);
    }
}

