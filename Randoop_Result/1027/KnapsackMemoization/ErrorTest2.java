package KnapsackMemoization;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest2 {

    public static boolean debug = false;

    @Test
    public void test01001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01001");
        int[] intArray6 = new int[] { (byte) 100, (byte) 10, 0, (byte) 10, (-1), 1 };
        int[] intArray12 = new int[] { (byte) 100, (byte) -1, (short) 10, (short) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 100, (int) 'a');
    }

    @Test
    public void test01002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01002");
        int[] intArray1 = new int[] { 1 };
        int[] intArray7 = new int[] { (byte) 1, (short) 1, (short) -1, 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) 0, (int) 'a');
    }

    @Test
    public void test01003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01003");
        int[] intArray5 = new int[] { '4', '4', (byte) 1, (byte) 10, 0 };
        int[] intArray10 = new int[] { 100, (byte) -1, (short) 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test01004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01004");
        int[] intArray2 = new int[] { 10, 10 };
        int[] intArray4 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (short) 1, (int) (short) 100);
    }

    @Test
    public void test01005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01005");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray3 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (byte) 100, (int) (short) 0);
    }

    @Test
    public void test01006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01006");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 10, (int) ' ');
    }

    @Test
    public void test01007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01007");
        int[] intArray5 = new int[] { 'a', (short) 100, 1, 1, (byte) -1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) 'a', (-1));
    }

    @Test
    public void test01008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01008");
        int[] intArray4 = new int[] { '4', ' ', (byte) 1, (short) 0 };
        int[] intArray10 = new int[] { 0, 1, (short) 100, (-1), '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) '4', (int) (short) -1);
    }

    @Test
    public void test01009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01009");
        int[] intArray4 = new int[] { (short) 1, 'a', (short) -1, (byte) -1 };
        int[] intArray11 = new int[] { 1, (byte) 100, (byte) 0, 10, '4', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) 0, (int) 'a');
    }

    @Test
    public void test01010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01010");
        int[] intArray2 = new int[] { 0, '4' };
        int[] intArray6 = new int[] { ' ', (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 10, (int) (byte) 10);
    }

    @Test
    public void test01011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01011");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 'a', (short) 10, 1, (byte) -1, (byte) 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) 0, (int) (byte) 100);
    }

    @Test
    public void test01012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01012");
        int[] intArray4 = new int[] { (short) -1, (short) -1, (byte) -1, (short) 10 };
        int[] intArray7 = new int[] { '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 0, (int) (short) 100);
    }

    @Test
    public void test01013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01013");
        int[] intArray3 = new int[] { 'a', 'a', (-1) };
        int[] intArray7 = new int[] { 10, (short) 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) 'a', (int) (short) 0);
    }

    @Test
    public void test01014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01014");
        int[] intArray2 = new int[] { 'a', 'a' };
        int[] intArray8 = new int[] { (short) -1, '#', (-1), (byte) 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 0, (int) 'a');
    }

    @Test
    public void test01015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01015");
        int[] intArray3 = new int[] { (byte) 100, ' ', (short) 10 };
        int[] intArray6 = new int[] { (short) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) 0, (int) (short) 100);
    }

    @Test
    public void test01016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01016");
        int[] intArray6 = new int[] { 10, (-1), (byte) 1, (short) 1, 'a', (byte) 1 };
        int[] intArray11 = new int[] { ' ', 100, (byte) 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (short) 10, (int) (byte) 100);
    }

    @Test
    public void test01017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01017");
        int[] intArray5 = new int[] { 0, (short) 10, 100, (short) 0, 'a' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) '4', (-1));
    }

    @Test
    public void test01018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01018");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (short) 100, (int) 'a');
    }

    @Test
    public void test01019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01019");
        int[] intArray2 = new int[] { 10, 10 };
        int[] intArray7 = new int[] { (short) 0, (-1), 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) 0, 1);
    }

    @Test
    public void test01020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01020");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 100, (short) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) 'a', (int) (byte) 1);
    }

    @Test
    public void test01021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01021");
        int[] intArray4 = new int[] { '#', (short) 10, (short) 1, (short) 100 };
        int[] intArray10 = new int[] { (short) 10, (short) 100, 'a', (byte) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (byte) 0, 1);
    }

    @Test
    public void test01022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01022");
        int[] intArray4 = new int[] { (short) 100, 10, '#', '#' };
        int[] intArray10 = new int[] { (short) 10, '4', '4', 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) 10, 0);
    }

    @Test
    public void test01023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01023");
        int[] intArray6 = new int[] { 100, (byte) 100, 10, ' ', (byte) 0, (-1) };
        int[] intArray12 = new int[] { '4', (short) -1, (short) 10, '4', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (byte) -1, 100);
    }

    @Test
    public void test01024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01024");
        int[] intArray4 = new int[] { ' ', ' ', 0, (byte) -1 };
        int[] intArray11 = new int[] { ' ', (-1), 10, (short) 0, (byte) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) 'a', (int) ' ');
    }

    @Test
    public void test01025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01025");
        int[] intArray6 = new int[] { (byte) 0, (byte) 1, (byte) 100, '#', (byte) 10, (byte) 10 };
        int[] intArray13 = new int[] { 'a', 10, 'a', (short) 0, 'a', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (byte) 100, (int) (byte) -1);
    }

    @Test
    public void test01026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01026");
        int[] intArray5 = new int[] { (byte) 0, ' ', 'a', 100, (byte) -1 };
        int[] intArray10 = new int[] { (byte) 1, 0, ' ', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (byte) 1, 0);
    }

    @Test
    public void test01027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01027");
        int[] intArray4 = new int[] { (byte) 1, 10, (short) 100, 1 };
        int[] intArray7 = new int[] { '#', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) 0, (int) ' ');
    }

    @Test
    public void test01028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01028");
        int[] intArray4 = new int[] { (byte) 10, (byte) -1, (short) -1, 100 };
        int[] intArray11 = new int[] { (byte) 100, (byte) 1, (short) 1, (byte) 1, (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) 0, 0);
    }

    @Test
    public void test01029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01029");
        int[] intArray3 = new int[] { 100, '#', (short) 0 };
        int[] intArray10 = new int[] { (short) -1, (byte) 0, (byte) 100, (short) 10, (short) 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 100, (int) (byte) 100);
    }

    @Test
    public void test01030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01030");
        int[] intArray1 = new int[] { 10 };
        int[] intArray4 = new int[] { (short) -1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) 'a', (int) (short) 0);
    }

    @Test
    public void test01031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01031");
        int[] intArray4 = new int[] { ' ', (-1), (byte) -1, 'a' };
        int[] intArray10 = new int[] { ' ', (short) 0, '#', 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (-1), (int) 'a');
    }

    @Test
    public void test01032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01032");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray8 = new int[] { (short) 100, ' ', 10, '4', '4', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 0, (int) '4');
    }

    @Test
    public void test01033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01033");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) 1, (int) (byte) 1);
    }

    @Test
    public void test01034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01034");
        int[] intArray5 = new int[] { (short) 10, ' ', (byte) 10, 'a', (byte) 10 };
        int[] intArray12 = new int[] { (short) 100, (byte) 10, ' ', (byte) 1, (byte) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test01035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01035");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (byte) 10, (short) 1, 10, (short) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test01036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01036");
        int[] intArray1 = new int[] { '#' };
        int[] intArray6 = new int[] { 1, (short) 1, 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (short) 100, (int) (short) -1);
    }

    @Test
    public void test01037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01037");
        int[] intArray2 = new int[] { (byte) 10, '4' };
        int[] intArray4 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (byte) 1, (int) '#');
    }

    @Test
    public void test01038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01038");
        int[] intArray2 = new int[] { (short) 100, (byte) 0 };
        int[] intArray4 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (byte) 10, (int) (byte) 0);
    }

    @Test
    public void test01039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01039");
        int[] intArray3 = new int[] { (byte) 100, 1, (byte) 10 };
        int[] intArray6 = new int[] { '4', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) '#', (int) (short) 0);
    }

    @Test
    public void test01040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01040");
        int[] intArray3 = new int[] { (short) 1, 1, '4' };
        int[] intArray7 = new int[] { (short) 0, (short) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) 0, (int) (byte) 10);
    }

    @Test
    public void test01041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01041");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray4 = new int[] { 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) ' ', (int) '4');
    }

    @Test
    public void test01042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01042");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) '4', 10);
    }

    @Test
    public void test01043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01043");
        int[] intArray3 = new int[] { 100, (short) 0, '4' };
        int[] intArray10 = new int[] { 'a', '#', 1, ' ', (short) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 0, (-1));
    }

    @Test
    public void test01044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01044");
        int[] intArray5 = new int[] { '4', (short) 1, '#', (short) 0, 10 };
        int[] intArray7 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) 'a', (int) '#');
    }

    @Test
    public void test01045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01045");
        int[] intArray5 = new int[] { (byte) -1, 0, '#', (byte) 100, (short) 10 };
        int[] intArray11 = new int[] { (short) 10, (short) 100, ' ', (short) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test01046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01046");
        int[] intArray5 = new int[] { 1, 'a', 0, 0, (short) 0 };
        int[] intArray8 = new int[] { (byte) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) 0, (int) (short) 1);
    }

    @Test
    public void test01047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01047");
        int[] intArray5 = new int[] { (byte) 1, (byte) 1, (short) 1, (short) -1, (byte) 1 };
        int[] intArray7 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, 100, 1);
    }

    @Test
    public void test01048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01048");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 10, (byte) -1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) '4', 10);
    }

    @Test
    public void test01049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01049");
        int[] intArray4 = new int[] { (-1), (-1), (short) 10, (short) 10 };
        int[] intArray7 = new int[] { (short) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 0, (int) (short) 100);
    }

    @Test
    public void test01050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01050");
        int[] intArray5 = new int[] { (-1), 100, 1, (short) 10, '4' };
        int[] intArray12 = new int[] { 10, (short) 100, 10, (byte) 10, (short) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) 0, (int) ' ');
    }

    @Test
    public void test01051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01051");
        int[] intArray4 = new int[] { (short) 100, (byte) -1, (byte) 10, 100 };
        int[] intArray7 = new int[] { (byte) 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) 1, 10);
    }

    @Test
    public void test01052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01052");
        int[] intArray4 = new int[] { (short) 10, '#', (short) 1, (short) 1 };
        int[] intArray8 = new int[] { '#', (short) 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) '#', (int) (short) 100);
    }

    @Test
    public void test01053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01053");
        int[] intArray6 = new int[] { (short) 0, (byte) -1, (short) 100, (short) 100, 10, '4' };
        int[] intArray8 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) '4', (int) '4');
    }

    @Test
    public void test01054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01054");
        int[] intArray2 = new int[] { 100, 'a' };
        int[] intArray7 = new int[] { 10, (short) 1, 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 100, (int) (short) -1);
    }

    @Test
    public void test01055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01055");
        int[] intArray6 = new int[] { (byte) 10, (short) 1, (byte) 1, (-1), 1, (-1) };
        int[] intArray8 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) '#', 0);
    }

    @Test
    public void test01056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01056");
        int[] intArray4 = new int[] { (byte) 1, (short) 10, (byte) 1, 100 };
        int[] intArray8 = new int[] { ' ', (short) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 10, (int) (short) 0);
    }

    @Test
    public void test01057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01057");
        int[] intArray3 = new int[] { (byte) 1, 0, 'a' };
        int[] intArray10 = new int[] { (byte) -1, (short) 1, (-1), 'a', (short) 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (-1), 0);
    }

    @Test
    public void test01058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01058");
        int[] intArray2 = new int[] { (-1), 1 };
        int[] intArray5 = new int[] { (byte) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 0, (int) '#');
    }

    @Test
    public void test01059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01059");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) 'a', 0);
    }

    @Test
    public void test01060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01060");
        int[] intArray2 = new int[] { 'a', 10 };
        int[] intArray9 = new int[] { '4', (short) 1, 10, 1, (short) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (short) 100, 100);
    }

    @Test
    public void test01061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01061");
        int[] intArray4 = new int[] { (byte) -1, (short) 1, (short) 0, (short) 10 };
        int[] intArray8 = new int[] { (byte) 1, (byte) 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 100, (int) '#');
    }

    @Test
    public void test01062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01062");
        int[] intArray2 = new int[] { 0, (-1) };
        int[] intArray5 = new int[] { (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) '4', (int) '4');
    }

    @Test
    public void test01063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01063");
        int[] intArray4 = new int[] { (short) 100, (short) -1, 0, '#' };
        int[] intArray8 = new int[] { ' ', 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 0, (int) (short) 100);
    }

    @Test
    public void test01064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01064");
        int[] intArray2 = new int[] { (short) 1, (-1) };
        int[] intArray8 = new int[] { 0, (byte) 1, '4', (short) -1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) 100, (int) (byte) 10);
    }

    @Test
    public void test01065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01065");
        int[] intArray5 = new int[] { (short) 100, (short) 100, 10, 100, (short) 10 };
        int[] intArray12 = new int[] { (short) 1, 10, 0, (byte) 100, (short) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (byte) 100, (int) (byte) 10);
    }

    @Test
    public void test01066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01066");
        int[] intArray4 = new int[] { (short) 10, 1, (short) 10, 'a' };
        int[] intArray9 = new int[] { (byte) 10, '4', '4', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) '#', (int) '4');
    }

    @Test
    public void test01067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01067");
        int[] intArray6 = new int[] { '4', ' ', (byte) 1, (-1), ' ', (short) 0 };
        int[] intArray13 = new int[] { ' ', (short) 10, 10, 100, (short) 0, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 100, (-1));
    }

    @Test
    public void test01068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01068");
        int[] intArray4 = new int[] { (short) 0, (byte) 1, (byte) 100, (short) 1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (short) 0, 10);
    }

    @Test
    public void test01069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01069");
        int[] intArray6 = new int[] { (short) -1, (byte) 100, (byte) 10, (-1), (short) 10, '4' };
        int[] intArray10 = new int[] { 0, (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (-1), (int) 'a');
    }

    @Test
    public void test01070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01070");
        int[] intArray5 = new int[] { (short) -1, (short) 10, ' ', ' ', (byte) 10 };
        int[] intArray7 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) '4', (int) 'a');
    }

    @Test
    public void test01071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01071");
        int[] intArray5 = new int[] { (-1), 0, (short) -1, 1, (short) 100 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) 100, (int) (byte) 1);
    }

    @Test
    public void test01072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01072");
        int[] intArray4 = new int[] { (short) 1, (short) -1, (short) 100, (byte) 10 };
        int[] intArray7 = new int[] { 'a', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 0, (int) ' ');
    }

    @Test
    public void test01073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01073");
        int[] intArray2 = new int[] { 100, 100 };
        int[] intArray8 = new int[] { 1, '#', (short) 100, 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) 100, 0);
    }

    @Test
    public void test01074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01074");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) 1, (int) (byte) 10);
    }

    @Test
    public void test01075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01075");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 0, '4', (-1), '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test01076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01076");
        int[] intArray4 = new int[] { (byte) 10, (byte) -1, (short) 100, (short) 1 };
        int[] intArray10 = new int[] { (-1), 100, '4', (short) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, 1, (int) (byte) 0);
    }

    @Test
    public void test01077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01077");
        int[] intArray2 = new int[] { 'a', ' ' };
        int[] intArray7 = new int[] { (short) 1, (byte) 10, 'a', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 0, (-1));
    }

    @Test
    public void test01078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01078");
        int[] intArray4 = new int[] { 10, (byte) 10, '4', ' ' };
        int[] intArray11 = new int[] { ' ', (byte) 0, (byte) 1, (-1), (short) -1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, 0, (int) (byte) 0);
    }

    @Test
    public void test01079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01079");
        int[] intArray3 = new int[] { '#', 0, (short) 1 };
        int[] intArray9 = new int[] { 1, (byte) 10, (short) 0, 'a', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 100, (int) '#');
    }

    @Test
    public void test01080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01080");
        int[] intArray2 = new int[] { (short) 100, (byte) 1 };
        int[] intArray8 = new int[] { (short) 0, (short) -1, (short) 100, 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 0, (int) 'a');
    }

    @Test
    public void test01081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01081");
        int[] intArray2 = new int[] { (short) 1, 1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test01082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01082");
        int[] intArray6 = new int[] { (-1), (byte) 0, 100, (short) 10, (byte) 10, (short) -1 };
        int[] intArray10 = new int[] { (short) 10, (short) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 10, (int) '4');
    }

    @Test
    public void test01083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01083");
        int[] intArray6 = new int[] { (short) 1, ' ', 'a', (byte) 100, 1, (byte) 10 };
        int[] intArray13 = new int[] { (byte) 10, (short) -1, '#', 0, (short) 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (short) 10, (int) 'a');
    }

    @Test
    public void test01084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01084");
        int[] intArray6 = new int[] { (-1), (short) -1, (short) 0, 'a', (byte) 1, (short) -1 };
        int[] intArray11 = new int[] { (byte) -1, (short) -1, 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 1, 0);
    }

    @Test
    public void test01085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01085");
        int[] intArray2 = new int[] { (byte) 0, (-1) };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) '#', (int) (short) 100);
    }

    @Test
    public void test01086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01086");
        int[] intArray6 = new int[] { (-1), (short) 10, (short) 100, 100, 10, (-1) };
        int[] intArray8 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 0, (int) (short) 10);
    }

    @Test
    public void test01087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01087");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 10, (short) 0, (short) 10, (short) 100, 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, 1, (int) (short) -1);
    }

    @Test
    public void test01088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01088");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { '4', 'a', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) ' ', (int) '#');
    }

    @Test
    public void test01089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01089");
        int[] intArray2 = new int[] { (short) -1, (byte) 1 };
        int[] intArray9 = new int[] { (byte) 1, 10, '#', (byte) 10, (short) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (int) (short) 10, 0);
    }

    @Test
    public void test01090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01090");
        int[] intArray2 = new int[] { (short) 0, (byte) 10 };
        int[] intArray4 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) '#', (int) (byte) 10);
    }

    @Test
    public void test01091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01091");
        int[] intArray6 = new int[] { 0, 100, (byte) 100, 100, (byte) 0, (byte) 100 };
        int[] intArray13 = new int[] { 0, (short) 10, (short) 1, (byte) 10, 'a', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (short) 10, (int) ' ');
    }

    @Test
    public void test01092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01092");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray8 = new int[] { (short) 1, (short) 1, (byte) 100, (byte) 10, (short) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 10, 1);
    }

    @Test
    public void test01093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01093");
        int[] intArray6 = new int[] { 100, 1, 100, (short) 100, ' ', (-1) };
        int[] intArray11 = new int[] { (short) 10, '#', (-1), 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (byte) 1, (int) (short) 1);
    }

    @Test
    public void test01094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01094");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray5 = new int[] { (byte) 1, (short) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (byte) 0, (-1));
    }

    @Test
    public void test01095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01095");
        int[] intArray2 = new int[] { (byte) 0, (byte) 10 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) '4', (int) (byte) 1);
    }

    @Test
    public void test01096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01096");
        int[] intArray3 = new int[] { (byte) 0, (short) 10, 10 };
        int[] intArray10 = new int[] { (byte) -1, (byte) 0, 10, ' ', (byte) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 1, (int) (byte) 1);
    }

    @Test
    public void test01097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01097");
        int[] intArray4 = new int[] { (byte) 100, 100, (short) 100, (byte) -1 };
        int[] intArray9 = new int[] { (byte) 1, 1, (byte) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test01098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01098");
        int[] intArray4 = new int[] { (short) 10, 1, '#', 'a' };
        int[] intArray8 = new int[] { (byte) 0, 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 1, (int) (byte) 1);
    }

    @Test
    public void test01099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01099");
        int[] intArray1 = new int[] { '#' };
        int[] intArray8 = new int[] { 0, (short) 0, ' ', (short) 1, (byte) 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 10, (int) 'a');
    }

    @Test
    public void test01100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01100");
        int[] intArray4 = new int[] { (short) -1, (byte) 10, (short) -1, '4' };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (-1), (int) '#');
    }

    @Test
    public void test01101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01101");
        int[] intArray6 = new int[] { (byte) -1, (byte) 0, 100, (short) 10, (byte) -1, (byte) 1 };
        int[] intArray9 = new int[] { (short) 1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) '#', 0);
    }

    @Test
    public void test01102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01102");
        int[] intArray4 = new int[] { (short) -1, (short) 1, (byte) 1, '4' };
        int[] intArray10 = new int[] { (byte) 100, ' ', ' ', ' ', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) '4', 10);
    }

    @Test
    public void test01103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01103");
        int[] intArray2 = new int[] { (short) 1, (byte) 1 };
        int[] intArray6 = new int[] { (byte) 1, (-1), (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 0, (int) (short) -1);
    }

    @Test
    public void test01104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01104");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) 100, 'a', (byte) -1, 10, (short) -1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) 100, (int) (short) -1);
    }

    @Test
    public void test01105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01105");
        int[] intArray5 = new int[] { (byte) -1, (short) 0, 1, 10, 'a' };
        int[] intArray7 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, 0, (int) ' ');
    }

    @Test
    public void test01106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01106");
        int[] intArray3 = new int[] { '#', 10, (-1) };
        int[] intArray9 = new int[] { (byte) 1, (short) 0, 10, (byte) 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (byte) 0, (int) (short) 100);
    }

    @Test
    public void test01107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01107");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 0, 'a', 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test01108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01108");
        int[] intArray3 = new int[] { 1, '#', (short) -1 };
        int[] intArray10 = new int[] { 10, (short) 1, ' ', (byte) 1, (short) 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 1, (int) (short) 0);
    }

    @Test
    public void test01109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01109");
        int[] intArray5 = new int[] { (byte) 1, 1, (byte) 1, 1, 10 };
        int[] intArray9 = new int[] { (short) -1, (short) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 0, (int) (short) 0);
    }

    @Test
    public void test01110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01110");
        int[] intArray5 = new int[] { (-1), (byte) 10, (byte) -1, 10, 10 };
        int[] intArray10 = new int[] { (byte) 10, (byte) 10, (-1), (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 0, (int) (short) -1);
    }

    @Test
    public void test01111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01111");
        int[] intArray2 = new int[] { 100, '4' };
        int[] intArray5 = new int[] { 'a', (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) '#', 10);
    }

    @Test
    public void test01112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01112");
        int[] intArray3 = new int[] { '#', (byte) -1, 1 };
        int[] intArray6 = new int[] { (byte) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) '4', 0);
    }

    @Test
    public void test01113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01113");
        int[] intArray6 = new int[] { '4', (short) 1, 'a', ' ', ' ', 100 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, 100, (int) (short) -1);
    }

    @Test
    public void test01114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01114");
        int[] intArray5 = new int[] { '4', (short) -1, ' ', 0, (short) -1 };
        int[] intArray8 = new int[] { (short) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 100, (int) (byte) 0);
    }

    @Test
    public void test01115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01115");
        int[] intArray6 = new int[] { '4', 1, (-1), (byte) 10, (short) 100, ' ' };
        int[] intArray8 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test01116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01116");
        int[] intArray2 = new int[] { (short) -1, (short) 10 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 0, (int) '#');
    }

    @Test
    public void test01117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01117");
        int[] intArray2 = new int[] { 10, '#' };
        int[] intArray6 = new int[] { (short) 0, (byte) 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (short) 100, (int) (short) -1);
    }

    @Test
    public void test01118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01118");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) 100, (short) 10, (byte) 100, (byte) 10, (short) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (short) 100, (int) (short) 0);
    }

    @Test
    public void test01119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01119");
        int[] intArray6 = new int[] { (short) -1, (short) 1, 'a', 'a', (short) -1, ' ' };
        int[] intArray11 = new int[] { 100, (short) 0, (byte) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (short) -1, (int) (byte) 100);
    }

    @Test
    public void test01120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01120");
        int[] intArray3 = new int[] { '#', 'a', (byte) 1 };
        int[] intArray9 = new int[] { 'a', (byte) 1, (short) 100, 'a', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (short) 100, (int) '#');
    }

    @Test
    public void test01121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01121");
        int[] intArray4 = new int[] { 1, ' ', '#', ' ' };
        int[] intArray9 = new int[] { (short) 1, (-1), (short) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 10, (int) (byte) -1);
    }

    @Test
    public void test01122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01122");
        int[] intArray4 = new int[] { ' ', (-1), 1, (byte) 1 };
        int[] intArray8 = new int[] { (short) 100, 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 100, (int) (short) 10);
    }

    @Test
    public void test01123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01123");
        int[] intArray3 = new int[] { 'a', 1, (byte) -1 };
        int[] intArray6 = new int[] { (byte) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) 1, 0);
    }

    @Test
    public void test01124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01124");
        int[] intArray6 = new int[] { 10, 100, (short) -1, '#', (short) -1, 10 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, 0, (int) (byte) 10);
    }

    @Test
    public void test01125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01125");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray3 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) -1, (int) '4');
    }

    @Test
    public void test01126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01126");
        int[] intArray6 = new int[] { '#', 1, 1, (short) 0, (byte) -1, 100 };
        int[] intArray13 = new int[] { (short) 0, (byte) 1, 1, (byte) 100, (short) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 100, (int) (byte) 10);
    }

    @Test
    public void test01127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01127");
        int[] intArray4 = new int[] { (byte) 1, 'a', (short) 100, ' ' };
        int[] intArray11 = new int[] { (short) 10, (short) 100, 1, 1, (byte) 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) 10, (int) (byte) 10);
    }

    @Test
    public void test01128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01128");
        int[] intArray4 = new int[] { ' ', ' ', (short) 1, ' ' };
        int[] intArray11 = new int[] { 10, 'a', (short) 100, 100, 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (byte) 100, (int) (short) -1);
    }

    @Test
    public void test01129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01129");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray6 = new int[] { (-1), 10, (byte) 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (byte) -1, (int) ' ');
    }

    @Test
    public void test01130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01130");
        int[] intArray2 = new int[] { (short) 10, (-1) };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) -1, (int) (byte) 10);
    }

    @Test
    public void test01131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01131");
        int[] intArray2 = new int[] { 1, (short) -1 };
        int[] intArray5 = new int[] { 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (byte) 1, 0);
    }

    @Test
    public void test01132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01132");
        int[] intArray3 = new int[] { (byte) -1, ' ', ' ' };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (-1), (int) (short) 100);
    }

    @Test
    public void test01133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01133");
        int[] intArray5 = new int[] { (byte) 0, (byte) 1, 'a', (byte) 1, (byte) 0 };
        int[] intArray10 = new int[] { (byte) 1, (-1), (byte) 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (short) 100, (int) (byte) 0);
    }

    @Test
    public void test01134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01134");
        int[] intArray2 = new int[] { (byte) 10, 100 };
        int[] intArray7 = new int[] { (short) -1, (short) 100, 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 1, 1);
    }

    @Test
    public void test01135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01135");
        int[] intArray3 = new int[] { (short) 100, (short) 1, (-1) };
        int[] intArray5 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) ' ', 0);
    }

    @Test
    public void test01136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01136");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (-1), (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 100, (int) (short) 1);
    }

    @Test
    public void test01137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01137");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray4 = new int[] { (short) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) '#', (int) (byte) 0);
    }

    @Test
    public void test01138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01138");
        int[] intArray3 = new int[] { (short) 1, (byte) 0, 0 };
        int[] intArray7 = new int[] { 100, 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) 1, (int) ' ');
    }

    @Test
    public void test01139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01139");
        int[] intArray2 = new int[] { (short) 0, (-1) };
        int[] intArray4 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) 'a', (int) ' ');
    }

    @Test
    public void test01140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01140");
        int[] intArray4 = new int[] { (short) 10, (byte) 1, (byte) 1, (short) 0 };
        int[] intArray11 = new int[] { (byte) -1, (byte) 1, '4', 1, (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) 10, (int) '4');
    }

    @Test
    public void test01141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01141");
        int[] intArray3 = new int[] { 100, (short) 1, 0 };
        int[] intArray7 = new int[] { (byte) -1, 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) 0, (int) (byte) 1);
    }

    @Test
    public void test01142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01142");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { '4', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (short) 0, 100);
    }

    @Test
    public void test01143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01143");
        int[] intArray4 = new int[] { 1, (byte) 10, (short) 10, (byte) -1 };
        int[] intArray11 = new int[] { 100, '#', (-1), (byte) 0, 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, 0, 100);
    }

    @Test
    public void test01144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01144");
        int[] intArray6 = new int[] { (short) 100, (short) 100, 1, (short) 0, (short) 0, (byte) -1 };
        int[] intArray13 = new int[] { (short) 100, (short) 0, (short) 0, ' ', (short) 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (short) 10, 0);
    }

    @Test
    public void test01145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01145");
        int[] intArray2 = new int[] { 'a', (byte) 100 };
        int[] intArray6 = new int[] { (byte) 100, 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) 100, (int) ' ');
    }

    @Test
    public void test01146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01146");
        int[] intArray2 = new int[] { 100, 'a' };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 10, (int) (byte) 10);
    }

    @Test
    public void test01147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01147");
        int[] intArray6 = new int[] { (short) 1, 100, (byte) 1, (short) 1, (short) 1, (short) 100 };
        int[] intArray9 = new int[] { 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 0, 1);
    }

    @Test
    public void test01148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01148");
        int[] intArray3 = new int[] { ' ', (short) 10, '#' };
        int[] intArray8 = new int[] { (byte) -1, 'a', 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (byte) 100, (int) (short) 1);
    }

    @Test
    public void test01149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01149");
        int[] intArray2 = new int[] { 'a', (short) 0 };
        int[] intArray4 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) '#', (int) (byte) 100);
    }

    @Test
    public void test01150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01150");
        int[] intArray4 = new int[] { (-1), (-1), (short) 100, (byte) 0 };
        int[] intArray8 = new int[] { 'a', (short) 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 0, (int) '4');
    }

    @Test
    public void test01151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01151");
        int[] intArray6 = new int[] { 'a', (byte) 10, (byte) 0, (short) 0, (short) -1, '#' };
        int[] intArray11 = new int[] { (-1), (byte) 10, (short) 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (short) 0, (int) (short) -1);
    }

    @Test
    public void test01152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01152");
        int[] intArray6 = new int[] { (short) 100, '4', (short) 100, (byte) 0, (short) -1, (short) 10 };
        int[] intArray10 = new int[] { 100, (short) 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (short) 100, 0);
    }

    @Test
    public void test01153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01153");
        int[] intArray6 = new int[] { (short) -1, 10, (short) 10, (byte) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { (short) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, 10, (int) (byte) 0);
    }

    @Test
    public void test01154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01154");
        int[] intArray3 = new int[] { 'a', (short) 10, (-1) };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, 0, (int) (short) -1);
    }

    @Test
    public void test01155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01155");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (short) -1, (byte) 1, (short) 10, 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (short) 100, (int) (byte) -1);
    }

    @Test
    public void test01156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01156");
        int[] intArray6 = new int[] { 1, (byte) 100, 0, (short) 1, '4', (short) 0 };
        int[] intArray11 = new int[] { (byte) 1, 0, (short) 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (short) 100, 0);
    }

    @Test
    public void test01157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01157");
        int[] intArray5 = new int[] { (byte) 1, (byte) 0, (short) 100, 10, (byte) 0 };
        int[] intArray8 = new int[] { (short) 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) 100, (int) (byte) 1);
    }

    @Test
    public void test01158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01158");
        int[] intArray3 = new int[] { ' ', (short) -1, (-1) };
        int[] intArray8 = new int[] { (byte) 10, (-1), 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (byte) 100, (int) (short) 100);
    }

    @Test
    public void test01159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01159");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray5 = new int[] { (byte) -1, 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) -1, (int) (short) 0);
    }

    @Test
    public void test01160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01160");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 0, (short) -1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) '#', (int) (short) 10);
    }

    @Test
    public void test01161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01161");
        int[] intArray2 = new int[] { (short) 1, (byte) -1 };
        int[] intArray5 = new int[] { (byte) 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (short) 0, (int) (byte) -1);
    }

    @Test
    public void test01162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01162");
        int[] intArray4 = new int[] { (short) -1, (short) 100, (byte) 1, 0 };
        int[] intArray7 = new int[] { (byte) 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 1, (int) '4');
    }

    @Test
    public void test01163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01163");
        int[] intArray3 = new int[] { '4', (short) 10, 'a' };
        int[] intArray5 = new int[] { 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test01164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01164");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 100, 1, (byte) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) 100, (int) (byte) 1);
    }

    @Test
    public void test01165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01165");
        int[] intArray2 = new int[] { (short) 100, (short) 10 };
        int[] intArray4 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (short) 100, (int) (short) 0);
    }

    @Test
    public void test01166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01166");
        int[] intArray5 = new int[] { '4', (short) 1, (short) -1, (byte) -1, '4' };
        int[] intArray11 = new int[] { 1, (byte) 100, 100, '4', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (byte) 100, 100);
    }

    @Test
    public void test01167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01167");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 10, (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) 0, (-1));
    }

    @Test
    public void test01168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01168");
        int[] intArray4 = new int[] { (byte) -1, (byte) -1, '4', 10 };
        int[] intArray6 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) '4', (-1));
    }

    @Test
    public void test01169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01169");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray5 = new int[] { (byte) 0, (short) 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (short) 10, (int) ' ');
    }

    @Test
    public void test01170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01170");
        int[] intArray6 = new int[] { (short) 1, '#', (byte) 10, (short) 100, (byte) 1, (short) 1 };
        int[] intArray11 = new int[] { '#', 0, '4', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) ' ', (int) (byte) 0);
    }

    @Test
    public void test01171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01171");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 1, 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, 100, (int) (short) 1);
    }

    @Test
    public void test01172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01172");
        int[] intArray4 = new int[] { (short) 0, 10, (byte) 100, (short) 0 };
        int[] intArray7 = new int[] { (byte) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) '4', (int) (byte) 10);
    }

    @Test
    public void test01173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01173");
        int[] intArray2 = new int[] { (byte) 10, (byte) 10 };
        int[] intArray8 = new int[] { (byte) 0, (short) -1, '4', (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 10, 0);
    }

    @Test
    public void test01174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01174");
        int[] intArray4 = new int[] { (byte) 100, 1, (byte) -1, (byte) 100 };
        int[] intArray6 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (-1), 0);
    }

    @Test
    public void test01175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01175");
        int[] intArray2 = new int[] { '#', (-1) };
        int[] intArray7 = new int[] { (byte) 100, 100, '#', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) -1, (int) '#');
    }

    @Test
    public void test01176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01176");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 10, (byte) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) 1, 10);
    }

    @Test
    public void test01177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01177");
        int[] intArray2 = new int[] { (byte) 100, (-1) };
        int[] intArray8 = new int[] { (-1), (short) 10, '#', (byte) 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) 'a', (int) '#');
    }

    @Test
    public void test01178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01178");
        int[] intArray1 = new int[] { (byte) 1 };
        int[] intArray4 = new int[] { (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 10, (int) (byte) 10);
    }

    @Test
    public void test01179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01179");
        int[] intArray3 = new int[] { (short) 1, (byte) 1, (byte) 10 };
        int[] intArray10 = new int[] { (short) -1, 10, (byte) 1, (byte) 1, (byte) 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, 0, (int) (short) 1);
    }

    @Test
    public void test01180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01180");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) '#', 100);
    }

    @Test
    public void test01181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01181");
        int[] intArray2 = new int[] { (short) 1, (byte) 0 };
        int[] intArray5 = new int[] { (short) 0, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) 'a', (-1));
    }

    @Test
    public void test01182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01182");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, 1, (int) (byte) 0);
    }

    @Test
    public void test01183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01183");
        int[] intArray4 = new int[] { (short) 0, 100, 0, (byte) 10 };
        int[] intArray6 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test01184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01184");
        int[] intArray6 = new int[] { (byte) 1, (byte) 100, 10, '4', (-1), '#' };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, 10, (int) (short) 100);
    }

    @Test
    public void test01185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01185");
        int[] intArray3 = new int[] { (short) 100, ' ', 10 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) 'a', 100);
    }

    @Test
    public void test01186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01186");
        int[] intArray6 = new int[] { (short) 0, '#', (short) -1, (byte) 10, 10, '4' };
        int[] intArray10 = new int[] { 0, (short) 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) -1, (int) (byte) -1);
    }

    @Test
    public void test01187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01187");
        int[] intArray4 = new int[] { '#', ' ', (byte) 0, (short) 0 };
        int[] intArray8 = new int[] { 10, (byte) -1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) 0, (int) (short) -1);
    }

    @Test
    public void test01188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01188");
        int[] intArray4 = new int[] { (byte) 10, (short) 10, '#', (short) 0 };
        int[] intArray10 = new int[] { (-1), 'a', 1, (byte) -1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (byte) 100, (int) (byte) 10);
    }

    @Test
    public void test01189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01189");
        int[] intArray3 = new int[] { ' ', 1, (short) 0 };
        int[] intArray8 = new int[] { 1, (byte) -1, (short) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 0, (int) '4');
    }

    @Test
    public void test01190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01190");
        int[] intArray6 = new int[] { 10, (byte) 10, '4', (byte) 0, (short) -1, (-1) };
        int[] intArray10 = new int[] { 1, (byte) 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) ' ', 100);
    }

    @Test
    public void test01191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01191");
        int[] intArray4 = new int[] { 1, 1, 100, 'a' };
        int[] intArray10 = new int[] { (byte) 0, (short) 100, (short) -1, ' ', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, 0, (int) (short) -1);
    }

    @Test
    public void test01192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01192");
        int[] intArray6 = new int[] { (byte) 1, (-1), (short) 100, 'a', (byte) 100, (byte) -1 };
        int[] intArray13 = new int[] { '#', (short) 10, 1, 1, (short) 100, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (byte) 100, (int) (short) 1);
    }

    @Test
    public void test01193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01193");
        int[] intArray3 = new int[] { (byte) -1, (short) -1, '4' };
        int[] intArray5 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, 1, (int) (byte) 0);
    }

    @Test
    public void test01194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01194");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (-1), (short) 100, (byte) 1, 10, (short) 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) 'a', (int) (byte) -1);
    }

    @Test
    public void test01195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01195");
        int[] intArray3 = new int[] { (byte) 1, (byte) 10, '4' };
        int[] intArray10 = new int[] { (byte) 0, (short) 1, (short) 10, '#', (short) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) 'a', 100);
    }

    @Test
    public void test01196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01196");
        int[] intArray4 = new int[] { ' ', (byte) 1, ' ', 100 };
        int[] intArray7 = new int[] { (byte) 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 0, (int) (byte) 100);
    }

    @Test
    public void test01197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01197");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (short) 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 10, (int) ' ');
    }

    @Test
    public void test01198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01198");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, 0, (int) (short) 10);
    }

    @Test
    public void test01199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01199");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray7 = new int[] { ' ', 10, '#', 'a', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) 10, 0);
    }

    @Test
    public void test01200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01200");
        int[] intArray2 = new int[] { (byte) 100, (byte) -1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, 100, (int) (short) 0);
    }

    @Test
    public void test01201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01201");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray7 = new int[] { (short) 1, (byte) -1, (byte) 100, (short) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) -1, (int) (short) 100);
    }

    @Test
    public void test01202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01202");
        int[] intArray4 = new int[] { (byte) 0, (byte) 10, 'a', ' ' };
        int[] intArray7 = new int[] { (short) 100, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 0, 1);
    }

    @Test
    public void test01203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01203");
        int[] intArray6 = new int[] { (byte) 100, 100, '#', (short) 10, 10, (byte) -1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) 100, (int) 'a');
    }

    @Test
    public void test01204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01204");
        int[] intArray4 = new int[] { 100, ' ', 10, (short) 100 };
        int[] intArray10 = new int[] { (byte) 10, 'a', (short) 10, (short) 100, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) 100, (int) '#');
    }

    @Test
    public void test01205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01205");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray5 = new int[] { ' ', 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, 0, (int) (short) -1);
    }

    @Test
    public void test01206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01206");
        int[] intArray2 = new int[] { (byte) -1, 'a' };
        int[] intArray6 = new int[] { ' ', 'a', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 0, (int) (short) 100);
    }

    @Test
    public void test01207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01207");
        int[] intArray3 = new int[] { 100, (byte) 0, (short) 1 };
        int[] intArray6 = new int[] { (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, 0, (int) (byte) 100);
    }

    @Test
    public void test01208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01208");
        int[] intArray1 = new int[] { 10 };
        int[] intArray7 = new int[] { (short) 100, (byte) 10, 'a', 'a', (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) 100, (int) (short) 10);
    }

    @Test
    public void test01209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01209");
        int[] intArray3 = new int[] { (short) 0, (byte) 10, (short) 10 };
        int[] intArray5 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, 100, 100);
    }

    @Test
    public void test01210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01210");
        int[] intArray6 = new int[] { (short) 0, '#', (-1), (short) -1, (byte) 100, (byte) 1 };
        int[] intArray12 = new int[] { (short) 10, 1, '4', '#', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (byte) 100, (-1));
    }

    @Test
    public void test01211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01211");
        int[] intArray6 = new int[] { (byte) 100, (short) 100, (-1), '#', '#', (short) 0 };
        int[] intArray8 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, (int) (short) 1, 0);
    }

    @Test
    public void test01212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01212");
        int[] intArray4 = new int[] { '4', 'a', 'a', (short) 0 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test01213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01213");
        int[] intArray5 = new int[] { 10, 10, 'a', (byte) 1, ' ' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 0, (int) '#');
    }

    @Test
    public void test01214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01214");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (byte) 100, 'a', (short) 0, 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, 100, 1);
    }

    @Test
    public void test01215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01215");
        int[] intArray4 = new int[] { (-1), (byte) 100, (short) -1, 1 };
        int[] intArray6 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (-1), (int) '4');
    }

    @Test
    public void test01216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01216");
        int[] intArray5 = new int[] { (byte) 1, (short) 0, (short) 10, (short) 1, 1 };
        int[] intArray11 = new int[] { (short) 10, (short) 0, (byte) 100, '4', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) 10, 0);
    }

    @Test
    public void test01217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01217");
        int[] intArray3 = new int[] { (short) 100, ' ', 'a' };
        int[] intArray8 = new int[] { 1, 'a', '#', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 0, 0);
    }

    @Test
    public void test01218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01218");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray6 = new int[] { 10, 100, (short) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) 'a', (int) 'a');
    }

    @Test
    public void test01219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01219");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray4 = new int[] { (short) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) 'a', 0);
    }

    @Test
    public void test01220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01220");
        int[] intArray6 = new int[] { (short) -1, (byte) 10, ' ', (byte) 10, (short) -1, (-1) };
        int[] intArray9 = new int[] { '#', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, 1, (int) '#');
    }

    @Test
    public void test01221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01221");
        int[] intArray3 = new int[] { (byte) 100, ' ', (byte) 1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (byte) 0, (int) (byte) 0);
    }

    @Test
    public void test01222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01222");
        int[] intArray1 = new int[] { '4' };
        int[] intArray5 = new int[] { 'a', '4', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, 0, (-1));
    }

    @Test
    public void test01223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01223");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray5 = new int[] { 'a', ' ', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (byte) 10, (int) (short) 0);
    }

    @Test
    public void test01224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01224");
        int[] intArray6 = new int[] { (short) 10, (short) 10, (short) -1, (byte) 0, (byte) 0, 10 };
        int[] intArray8 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 10, 1);
    }

    @Test
    public void test01225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01225");
        int[] intArray5 = new int[] { (byte) 100, 'a', (short) 1, (short) 0, (byte) 0 };
        int[] intArray10 = new int[] { (short) -1, (-1), (byte) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) ' ', (int) (short) 0);
    }

    @Test
    public void test01226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01226");
        int[] intArray2 = new int[] { 'a', '4' };
        int[] intArray6 = new int[] { 1, (short) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 1, (int) (short) 100);
    }

    @Test
    public void test01227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01227");
        int[] intArray1 = new int[] { 0 };
        int[] intArray3 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) ' ', (int) (short) -1);
    }

    @Test
    public void test01228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01228");
        int[] intArray4 = new int[] { '#', (-1), 100, (byte) -1 };
        int[] intArray11 = new int[] { (short) -1, (byte) 100, (byte) -1, (short) -1, (short) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) '4', (int) (byte) 1);
    }

    @Test
    public void test01229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01229");
        int[] intArray3 = new int[] { (short) 100, 'a', '#' };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) 10, 1);
    }

    @Test
    public void test01230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01230");
        int[] intArray6 = new int[] { (byte) 0, 0, (byte) -1, (byte) -1, (byte) -1, (-1) };
        int[] intArray8 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 0, (int) (short) 100);
    }

    @Test
    public void test01231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01231");
        int[] intArray6 = new int[] { (-1), 0, 100, 10, 1, '#' };
        int[] intArray11 = new int[] { (byte) 100, (byte) 1, (byte) 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (byte) 0, (int) (byte) 10);
    }

    @Test
    public void test01232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01232");
        int[] intArray2 = new int[] { (short) 10, (byte) 0 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test01233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01233");
        int[] intArray5 = new int[] { 'a', '4', (short) 1, (byte) 100, ' ' };
        int[] intArray8 = new int[] { '#', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) 10, (int) (byte) 100);
    }

    @Test
    public void test01234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01234");
        int[] intArray5 = new int[] { (byte) 10, 0, 'a', 0, (short) 1 };
        int[] intArray12 = new int[] { '4', ' ', ' ', (-1), 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (byte) 0, (int) (byte) -1);
    }

    @Test
    public void test01235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01235");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { 1, (byte) 100, (short) 100, '#', (short) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) 10, (int) (byte) 0);
    }

    @Test
    public void test01236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01236");
        int[] intArray3 = new int[] { (short) 10, (byte) 0, '4' };
        int[] intArray5 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, 10, (int) (byte) 1);
    }

    @Test
    public void test01237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01237");
        int[] intArray1 = new int[] { '#' };
        int[] intArray8 = new int[] { 10, 'a', (short) 1, (short) -1, (short) 100, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) 1, (int) (short) 100);
    }

    @Test
    public void test01238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01238");
        int[] intArray4 = new int[] { (byte) -1, 1, 0, (short) 0 };
        int[] intArray9 = new int[] { (byte) 10, 0, 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) 'a', 10);
    }

    @Test
    public void test01239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01239");
        int[] intArray2 = new int[] { '#', '4' };
        int[] intArray4 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) 'a', (int) (short) 1);
    }

    @Test
    public void test01240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01240");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (short) 100, 1, ' ', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (short) -1, (int) (short) 0);
    }

    @Test
    public void test01241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01241");
        int[] intArray3 = new int[] { '#', ' ', (short) -1 };
        int[] intArray10 = new int[] { 'a', (short) 0, '#', 'a', (short) 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 100, 1);
    }

    @Test
    public void test01242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01242");
        int[] intArray2 = new int[] { 1, (byte) 10 };
        int[] intArray8 = new int[] { '4', (short) 10, 10, (-1), (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (short) 10, 1);
    }

    @Test
    public void test01243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01243");
        int[] intArray2 = new int[] { 0, (short) 1 };
        int[] intArray6 = new int[] { (short) 0, (short) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test01244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01244");
        int[] intArray3 = new int[] { (byte) 1, (-1), (byte) 1 };
        int[] intArray6 = new int[] { (byte) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (byte) 10, (int) (byte) 0);
    }

    @Test
    public void test01245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01245");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 1, (short) 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, 10, 0);
    }

    @Test
    public void test01246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01246");
        int[] intArray5 = new int[] { '4', '#', (byte) 100, (short) -1, 1 };
        int[] intArray9 = new int[] { (short) -1, (short) -1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 1, (int) (byte) 1);
    }

    @Test
    public void test01247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01247");
        int[] intArray4 = new int[] { (short) 0, (byte) 0, 100, 10 };
        int[] intArray6 = new int[] { (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (short) 10, (int) (byte) 1);
    }

    @Test
    public void test01248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01248");
        int[] intArray6 = new int[] { 100, ' ', (byte) -1, 0, 1, (-1) };
        int[] intArray8 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 0, (int) (byte) 100);
    }

    @Test
    public void test01249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01249");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { ' ', (short) 0, 'a', (byte) 10, 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, 100, 0);
    }

    @Test
    public void test01250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01250");
        int[] intArray4 = new int[] { (byte) -1, '4', ' ', (short) 1 };
        int[] intArray10 = new int[] { 10, (short) 100, (byte) 10, (short) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) ' ', 100);
    }

    @Test
    public void test01251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01251");
        int[] intArray5 = new int[] { (-1), (short) -1, (short) 1, (byte) 10, (byte) -1 };
        int[] intArray9 = new int[] { (byte) 10, (short) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (short) 0, 0);
    }

    @Test
    public void test01252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01252");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 10, '#', (short) -1, 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) 100, (-1));
    }

    @Test
    public void test01253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01253");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 10, (int) (byte) 0);
    }

    @Test
    public void test01254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01254");
        int[] intArray4 = new int[] { (short) 1, 'a', (byte) 100, '#' };
        int[] intArray8 = new int[] { (short) 100, (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test01255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01255");
        int[] intArray4 = new int[] { (short) 0, (short) 100, (short) 0, (-1) };
        int[] intArray10 = new int[] { (byte) 1, (byte) 100, ' ', '#', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) (short) 10, (int) (short) 100);
    }

    @Test
    public void test01256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01256");
        int[] intArray3 = new int[] { (byte) 0, (-1), (-1) };
        int[] intArray10 = new int[] { (byte) 100, 100, 0, (byte) 10, 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 0, 1);
    }

    @Test
    public void test01257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01257");
        int[] intArray5 = new int[] { (short) 1, (byte) 0, (short) 0, (byte) -1, (byte) 100 };
        int[] intArray10 = new int[] { 1, 1, 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, (int) (short) 10, 100);
    }

    @Test
    public void test01258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01258");
        int[] intArray4 = new int[] { (short) -1, 'a', (short) 0, '#' };
        int[] intArray7 = new int[] { (short) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 100, 0);
    }

    @Test
    public void test01259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01259");
        int[] intArray4 = new int[] { ' ', ' ', '4', ' ' };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, 0, (int) (byte) 0);
    }

    @Test
    public void test01260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01260");
        int[] intArray4 = new int[] { (byte) -1, 'a', (short) 100, (short) -1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (short) 10, 100);
    }

    @Test
    public void test01261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01261");
        int[] intArray3 = new int[] { (short) 1, (byte) -1, (byte) 0 };
        int[] intArray10 = new int[] { 10, (-1), 100, (byte) 0, (byte) 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 0, (int) '#');
    }

    @Test
    public void test01262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01262");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray8 = new int[] { (byte) 10, (short) 100, (short) 100, 1, (-1), 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (byte) -1, (int) (short) 1);
    }

    @Test
    public void test01263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01263");
        int[] intArray6 = new int[] { (byte) 100, 10, (byte) 10, 0, 0, (byte) 10 };
        int[] intArray11 = new int[] { (short) 1, (short) -1, '4', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test01264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01264");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 0, (byte) 0, (short) 0, '#', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, 1, 0);
    }

    @Test
    public void test01265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01265");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 0, 0);
    }

    @Test
    public void test01266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01266");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 0, '#', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) 10, (int) (byte) 100);
    }

    @Test
    public void test01267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01267");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray8 = new int[] { (byte) 100, (short) 10, 0, '4', (short) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 10, (int) (short) 100);
    }

    @Test
    public void test01268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01268");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, 1, (int) (byte) 10);
    }

    @Test
    public void test01269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01269");
        int[] intArray6 = new int[] { 'a', (byte) 1, 100, (short) -1, 10, 1 };
        int[] intArray12 = new int[] { (byte) -1, (short) 0, 100, (-1), (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 0, (int) (short) 10);
    }

    @Test
    public void test01270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01270");
        int[] intArray6 = new int[] { 'a', 'a', 100, (-1), ' ', (short) -1 };
        int[] intArray12 = new int[] { (byte) -1, (short) 100, 0, (byte) 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) ' ', 1);
    }

    @Test
    public void test01271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01271");
        int[] intArray3 = new int[] { (-1), 0, 0 };
        int[] intArray5 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, 100, (int) (short) 1);
    }

    @Test
    public void test01272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01272");
        int[] intArray6 = new int[] { 100, 'a', 100, (byte) 10, (short) 0, 'a' };
        int[] intArray13 = new int[] { (short) 100, 100, (-1), 0, (byte) -1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) 'a', (int) (short) 0);
    }

    @Test
    public void test01273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01273");
        int[] intArray2 = new int[] { 10, (short) 100 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (byte) 100, (-1));
    }

    @Test
    public void test01274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01274");
        int[] intArray4 = new int[] { 100, (short) 100, (short) 0, (short) 10 };
        int[] intArray7 = new int[] { (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) 100, (int) (short) 100);
    }

    @Test
    public void test01275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01275");
        int[] intArray5 = new int[] { 0, 0, (short) -1, (short) 100, (short) 0 };
        int[] intArray11 = new int[] { (short) 100, ' ', 100, (byte) 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) 'a', (-1));
    }

    @Test
    public void test01276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01276");
        int[] intArray6 = new int[] { 100, 10, (byte) 100, (short) 0, (byte) 1, (byte) 1 };
        int[] intArray9 = new int[] { 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, 1, 10);
    }

    @Test
    public void test01277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01277");
        int[] intArray1 = new int[] { 100 };
        int[] intArray3 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) 10, 10);
    }

    @Test
    public void test01278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01278");
        int[] intArray5 = new int[] { (short) 10, 1, ' ', (byte) 10, ' ' };
        int[] intArray8 = new int[] { 'a', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) 0, 0);
    }

    @Test
    public void test01279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01279");
        int[] intArray3 = new int[] { (short) 0, (-1), 0 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) '4', 100);
    }

    @Test
    public void test01280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01280");
        int[] intArray5 = new int[] { 0, (-1), (byte) 10, ' ', (byte) -1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, 10, (int) (byte) 1);
    }

    @Test
    public void test01281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01281");
        int[] intArray4 = new int[] { (byte) 100, '#', (byte) -1, 1 };
        int[] intArray9 = new int[] { (byte) 100, (-1), 'a', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 0, 1);
    }

    @Test
    public void test01282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01282");
        int[] intArray6 = new int[] { '4', '4', (short) -1, (byte) 100, (byte) -1, (short) 100 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) 1, (int) '#');
    }

    @Test
    public void test01283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01283");
        int[] intArray5 = new int[] { (short) 10, (short) -1, (byte) -1, (byte) 0, (short) 1 };
        int[] intArray9 = new int[] { '4', (byte) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) '4', (int) (byte) 100);
    }

    @Test
    public void test01284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01284");
        int[] intArray3 = new int[] { (short) 10, '#', 1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) '4', (int) (short) 0);
    }

    @Test
    public void test01285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01285");
        int[] intArray6 = new int[] { 0, 0, (short) 10, (byte) 10, (byte) 100, (short) 0 };
        int[] intArray10 = new int[] { (byte) 0, (short) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) -1, (int) (byte) 0);
    }

    @Test
    public void test01286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01286");
        int[] intArray3 = new int[] { ' ', (byte) -1, (short) 10 };
        int[] intArray6 = new int[] { (byte) -1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (-1), 100);
    }

    @Test
    public void test01287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01287");
        int[] intArray4 = new int[] { (byte) 10, (-1), 100, (byte) -1 };
        int[] intArray11 = new int[] { (byte) 10, (short) 0, 0, (short) 0, (short) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) ' ', 0);
    }

    @Test
    public void test01288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01288");
        int[] intArray2 = new int[] { (short) 10, (short) -1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) '4', (-1));
    }

    @Test
    public void test01289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01289");
        int[] intArray6 = new int[] { (short) 0, 100, (short) 100, (-1), (byte) 100, 10 };
        int[] intArray13 = new int[] { (byte) 100, 1, (short) 0, (byte) -1, (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (-1), 10);
    }

    @Test
    public void test01290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01290");
        int[] intArray6 = new int[] { (byte) 100, '4', (byte) 1, 1, 'a', '#' };
        int[] intArray10 = new int[] { 100, 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) 'a', (int) 'a');
    }

    @Test
    public void test01291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01291");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { (short) -1, (byte) 1, (byte) -1, 100, (byte) 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, (int) (byte) 0, (int) '#');
    }

    @Test
    public void test01292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01292");
        int[] intArray6 = new int[] { (-1), (short) 10, 10, (byte) 1, (byte) -1, (byte) 100 };
        int[] intArray13 = new int[] { (short) 0, '4', (byte) 1, 100, 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) '4', (int) (short) 0);
    }

    @Test
    public void test01293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01293");
        int[] intArray3 = new int[] { '#', (short) 100, (short) 10 };
        int[] intArray9 = new int[] { 0, (byte) 100, (byte) 0, (byte) 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test01294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01294");
        int[] intArray6 = new int[] { '#', (byte) -1, (short) 0, (byte) -1, (byte) -1, (short) 100 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (-1), (int) ' ');
    }

    @Test
    public void test01295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01295");
        int[] intArray4 = new int[] { (byte) -1, 1, (short) 1, (byte) 100 };
        int[] intArray11 = new int[] { 1, '#', (short) 100, '#', (byte) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, 0, (int) 'a');
    }

    @Test
    public void test01296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01296");
        int[] intArray5 = new int[] { 0, (-1), (-1), 100, 0 };
        int[] intArray9 = new int[] { 100, (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) '#', (int) (short) -1);
    }

    @Test
    public void test01297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01297");
        int[] intArray3 = new int[] { (short) 10, 1, (byte) 1 };
        int[] intArray6 = new int[] { 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray6, (int) (short) 10, (int) '#');
    }

    @Test
    public void test01298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01298");
        int[] intArray2 = new int[] { 'a', (byte) -1 };
        int[] intArray6 = new int[] { (byte) -1, 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (short) 1, (int) (short) 0);
    }

    @Test
    public void test01299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01299");
        int[] intArray4 = new int[] { 'a', (byte) -1, (byte) 100, 0 };
        int[] intArray11 = new int[] { (short) 1, '#', (short) -1, 0, 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (byte) 100, (int) 'a');
    }

    @Test
    public void test01300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01300");
        int[] intArray4 = new int[] { 100, 10, (short) 10, (short) 100 };
        int[] intArray8 = new int[] { (byte) 10, 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, 0, 1);
    }

    @Test
    public void test01301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01301");
        int[] intArray4 = new int[] { (byte) 1, 100, 100, 1 };
        int[] intArray10 = new int[] { 'a', (short) 10, (-1), 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray10, (int) ' ', (int) (byte) 100);
    }

    @Test
    public void test01302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01302");
        int[] intArray6 = new int[] { (byte) 0, (short) 0, (byte) 0, (short) -1, (byte) 10, (short) 1 };
        int[] intArray10 = new int[] { (byte) 100, (byte) 10, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) -1, 100);
    }

    @Test
    public void test01303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01303");
        int[] intArray1 = new int[] { 10 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 0, (int) (byte) 0);
    }

    @Test
    public void test01304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01304");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) -1, 1);
    }

    @Test
    public void test01305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01305");
        int[] intArray6 = new int[] { (byte) 100, 1, 100, '#', 'a', 10 };
        int[] intArray12 = new int[] { (short) 100, ' ', (byte) 0, '4', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) 'a', 0);
    }

    @Test
    public void test01306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01306");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (short) 1, (int) (short) 10);
    }

    @Test
    public void test01307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01307");
        int[] intArray6 = new int[] { '4', (byte) 0, (short) 10, (short) 100, (short) 10, (short) 1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) 'a', (int) (byte) 10);
    }

    @Test
    public void test01308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01308");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray4 = new int[] { (byte) 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, 1, (int) (short) 10);
    }

    @Test
    public void test01309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01309");
        int[] intArray6 = new int[] { (short) -1, (byte) -1, (short) 100, (byte) -1, (byte) 1, '#' };
        int[] intArray11 = new int[] { 100, '4', 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) '4', 100);
    }

    @Test
    public void test01310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01310");
        int[] intArray3 = new int[] { (byte) 1, ' ', 100 };
        int[] intArray7 = new int[] { (short) -1, 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test01311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01311");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test01312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01312");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (short) -1, (int) (byte) 1);
    }

    @Test
    public void test01313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01313");
        int[] intArray5 = new int[] { 1, 10, (short) 0, (short) 0, (short) -1 };
        int[] intArray11 = new int[] { 1, (short) 100, 100, 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) 0, (int) ' ');
    }

    @Test
    public void test01314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01314");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) 'a', (int) (short) 100);
    }

    @Test
    public void test01315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01315");
        int[] intArray1 = new int[] { 1 };
        int[] intArray7 = new int[] { (byte) 0, (short) -1, (short) 0, ' ', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, 0, 100);
    }

    @Test
    public void test01316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01316");
        int[] intArray6 = new int[] { (short) -1, (byte) 100, (short) -1, (byte) 0, (short) 0, '4' };
        int[] intArray8 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 0, (int) '#');
    }

    @Test
    public void test01317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01317");
        int[] intArray2 = new int[] { 0, (byte) 10 };
        int[] intArray9 = new int[] { (short) 0, '#', (byte) -1, '#', (short) 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, (-1), (int) (short) 1);
    }

    @Test
    public void test01318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01318");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray4 = new int[] { (-1), (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) 10, (int) (short) 0);
    }

    @Test
    public void test01319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01319");
        int[] intArray5 = new int[] { (byte) 0, (byte) 10, (byte) 0, (-1), (-1) };
        int[] intArray10 = new int[] { ' ', (byte) 0, (byte) 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 10, (int) (short) -1);
    }

    @Test
    public void test01320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01320");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray3 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, 0, 100);
    }

    @Test
    public void test01321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01321");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray6 = new int[] { '4', (-1), (byte) 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 0, 100);
    }

    @Test
    public void test01322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01322");
        int[] intArray3 = new int[] { 0, '#', (byte) 1 };
        int[] intArray5 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, 0, (int) ' ');
    }

    @Test
    public void test01323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01323");
        int[] intArray1 = new int[] { 1 };
        int[] intArray6 = new int[] { (short) 10, (byte) -1, (byte) -1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (byte) 1, (int) 'a');
    }

    @Test
    public void test01324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01324");
        int[] intArray2 = new int[] { (short) -1, '#' };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (byte) 1, 100);
    }

    @Test
    public void test01325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01325");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray7 = new int[] { (short) -1, (byte) 10, (byte) 100, 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) 1, 0);
    }

    @Test
    public void test01326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01326");
        int[] intArray5 = new int[] { 10, ' ', (byte) 1, (byte) 10, (-1) };
        int[] intArray10 = new int[] { (byte) 0, (byte) -1, (short) 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray10, 1, (int) (byte) 10);
    }

    @Test
    public void test01327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01327");
        int[] intArray4 = new int[] { '#', (byte) 1, (short) 10, 'a' };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, 0, (int) (byte) 0);
    }

    @Test
    public void test01328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01328");
        int[] intArray2 = new int[] { (short) -1, 10 };
        int[] intArray8 = new int[] { (byte) -1, 100, (byte) 100, 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (byte) -1, (int) '4');
    }

    @Test
    public void test01329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01329");
        int[] intArray2 = new int[] { 10, (byte) 1 };
        int[] intArray4 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray4, (int) (byte) 1, (int) (short) 1);
    }

    @Test
    public void test01330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01330");
        int[] intArray5 = new int[] { (-1), (short) 0, (short) -1, (byte) 10, (byte) 10 };
        int[] intArray8 = new int[] { (byte) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, 100, (-1));
    }

    @Test
    public void test01331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01331");
        int[] intArray6 = new int[] { 10, (byte) 10, ' ', (byte) 1, (short) 0, (short) 1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) -1, (int) (byte) 1);
    }

    @Test
    public void test01332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01332");
        int[] intArray4 = new int[] { 1, (short) -1, (byte) 100, '#' };
        int[] intArray7 = new int[] { 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) 'a', 100);
    }

    @Test
    public void test01333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01333");
        int[] intArray2 = new int[] { (byte) -1, (byte) 1 };
        int[] intArray8 = new int[] { 10, (short) 10, (byte) 10, '4', 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 10, 0);
    }

    @Test
    public void test01334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01334");
        int[] intArray3 = new int[] { ' ', (byte) 100, (byte) 100 };
        int[] intArray5 = new int[] { (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, 10, (int) 'a');
    }

    @Test
    public void test01335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01335");
        int[] intArray2 = new int[] { '4', (short) 0 };
        int[] intArray8 = new int[] { (short) 10, 1, (byte) 0, (byte) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) (byte) 0, (int) (byte) 10);
    }

    @Test
    public void test01336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01336");
        int[] intArray6 = new int[] { (byte) 1, 100, 10, (short) 0, (short) 0, (-1) };
        int[] intArray13 = new int[] { (byte) -1, ' ', (byte) -1, (byte) 100, 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 1, (int) (short) 1);
    }

    @Test
    public void test01337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01337");
        int[] intArray6 = new int[] { (byte) 1, 10, (-1), (byte) 10, (short) 1, (byte) -1 };
        int[] intArray10 = new int[] { '4', (short) 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (byte) 10, (int) (byte) 10);
    }

    @Test
    public void test01338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01338");
        int[] intArray6 = new int[] { (byte) 0, 10, (short) 10, (short) 0, 10, (byte) 1 };
        int[] intArray11 = new int[] { ' ', ' ', 1, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) (short) 100, (int) (short) -1);
    }

    @Test
    public void test01339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01339");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray6 = new int[] { 1, (-1), 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) '#', (int) 'a');
    }

    @Test
    public void test01340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01340");
        int[] intArray4 = new int[] { (short) 10, (byte) 0, (byte) -1, (short) 10 };
        int[] intArray6 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) 'a', 100);
    }

    @Test
    public void test01341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01341");
        int[] intArray4 = new int[] { (short) 10, ' ', (short) 100, (byte) 1 };
        int[] intArray11 = new int[] { 1, (byte) 1, (short) -1, (short) -1, (byte) 1, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (short) 100, (int) (short) 100);
    }

    @Test
    public void test01342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01342");
        int[] intArray4 = new int[] { (short) 10, (short) 100, 100, (short) -1 };
        int[] intArray8 = new int[] { (byte) 10, (byte) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) 1, (int) (byte) 1);
    }

    @Test
    public void test01343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01343");
        int[] intArray0 = new int[] {};
        int[] intArray7 = new int[] { '4', 10, '4', (byte) 10, (short) 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray7, 1, (int) (short) 10);
    }

    @Test
    public void test01344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01344");
        int[] intArray5 = new int[] { (byte) 100, (short) 0, 0, (-1), '#' };
        int[] intArray9 = new int[] { (short) -1, 'a', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) 'a', (int) (byte) -1);
    }

    @Test
    public void test01345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01345");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray8 = new int[] { (short) 10, 100, (short) -1, (short) 1, (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 1, 100);
    }

    @Test
    public void test01346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01346");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { '#', (byte) 1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) 100, 0);
    }

    @Test
    public void test01347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01347");
        int[] intArray6 = new int[] { 'a', '#', (byte) 1, (short) 100, (byte) -1, 0 };
        int[] intArray10 = new int[] { (short) -1, (short) 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, 0, (int) (byte) 1);
    }

    @Test
    public void test01348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01348");
        int[] intArray5 = new int[] { '4', (short) 1, (byte) 1, '#', (-1) };
        int[] intArray9 = new int[] { 0, 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (byte) 0, (int) (short) 100);
    }

    @Test
    public void test01349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01349");
        int[] intArray3 = new int[] { (byte) 0, '4', (short) 10 };
        int[] intArray10 = new int[] { '#', 0, ' ', (byte) 10, (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray10, (int) (short) 10, (int) 'a');
    }

    @Test
    public void test01350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01350");
        int[] intArray1 = new int[] { 0 };
        int[] intArray3 = new int[] { (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (byte) 1, (-1));
    }

    @Test
    public void test01351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01351");
        int[] intArray4 = new int[] { 1, '#', 10, (byte) 10 };
        int[] intArray6 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (short) 1, (int) (short) 100);
    }

    @Test
    public void test01352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01352");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray8 = new int[] { 'a', (byte) 1, (short) 10, (short) 100, '#', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) '4', (int) (short) 10);
    }

    @Test
    public void test01353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01353");
        int[] intArray4 = new int[] { 1, '#', ' ', (byte) -1 };
        int[] intArray8 = new int[] { (byte) -1, (short) 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) '4', (int) (short) 100);
    }

    @Test
    public void test01354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01354");
        int[] intArray4 = new int[] { 100, 1, (short) 100, (short) 10 };
        int[] intArray8 = new int[] { (short) -1, (short) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test01355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01355");
        int[] intArray2 = new int[] { '#', (short) -1 };
        int[] intArray8 = new int[] { '#', (short) 100, (short) -1, (short) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) ' ', (int) (short) 1);
    }

    @Test
    public void test01356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01356");
        int[] intArray1 = new int[] { 1 };
        int[] intArray8 = new int[] { (byte) 0, '4', ' ', (byte) 1, (short) 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 10, (int) 'a');
    }

    @Test
    public void test01357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01357");
        int[] intArray4 = new int[] { (byte) 0, (short) 100, 'a', ' ' };
        int[] intArray7 = new int[] { (short) 1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (byte) 100, (int) (byte) 1);
    }

    @Test
    public void test01358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01358");
        int[] intArray6 = new int[] { (byte) 0, 100, '4', (byte) 1, 0, '4' };
        int[] intArray9 = new int[] { (byte) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test01359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01359");
        int[] intArray6 = new int[] { 1, (short) -1, (short) 0, ' ', 'a', 0 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (short) 100, (int) 'a');
    }

    @Test
    public void test01360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01360");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) 100, 'a', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, 1, (int) '4');
    }

    @Test
    public void test01361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01361");
        int[] intArray2 = new int[] { 10, 'a' };
        int[] intArray7 = new int[] { (byte) 100, (short) 1, (byte) 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (byte) -1, 1);
    }

    @Test
    public void test01362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01362");
        int[] intArray2 = new int[] { (byte) 0, (short) -1 };
        int[] intArray6 = new int[] { 10, (short) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 0, (int) (byte) 1);
    }

    @Test
    public void test01363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01363");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (byte) 1, 100 };
        int[] intArray6 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, 0, (int) (short) 0);
    }

    @Test
    public void test01364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01364");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (byte) 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (short) 100, (int) ' ');
    }

    @Test
    public void test01365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01365");
        int[] intArray6 = new int[] { '4', ' ', '#', 10, '#', 10 };
        int[] intArray8 = new int[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray8, 0, (int) (byte) 10);
    }

    @Test
    public void test01366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01366");
        int[] intArray4 = new int[] { (short) 0, (short) -1, 0, (byte) 10 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, 0, (int) (byte) 10);
    }

    @Test
    public void test01367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01367");
        int[] intArray2 = new int[] { (short) 10, (byte) 100 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (byte) 1, 0);
    }

    @Test
    public void test01368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01368");
        int[] intArray5 = new int[] { (byte) 100, (byte) -1, (short) -1, (byte) 10, (short) 10 };
        int[] intArray8 = new int[] { (short) 0, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) -1, 100);
    }

    @Test
    public void test01369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01369");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) ' ', (int) (short) 10);
    }

    @Test
    public void test01370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01370");
        int[] intArray6 = new int[] { 100, (byte) 100, (byte) 1, 100, 'a', 100 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, 1, 0);
    }

    @Test
    public void test01371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01371");
        int[] intArray1 = new int[] { (-1) };
        int[] intArray5 = new int[] { (short) 0, (byte) 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test01372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01372");
        int[] intArray6 = new int[] { '4', (short) 1, 0, 'a', 100, (byte) 0 };
        int[] intArray11 = new int[] { (byte) 100, '#', '#', 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (-1), (int) 'a');
    }

    @Test
    public void test01373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01373");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (short) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, (int) (byte) 100, (int) (short) 10);
    }

    @Test
    public void test01374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01374");
        int[] intArray4 = new int[] { (short) 0, 100, (short) 100, (byte) -1 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, 0, (int) (byte) 10);
    }

    @Test
    public void test01375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01375");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray1, (int) (byte) 100, 1);
    }

    @Test
    public void test01376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01376");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray6 = new int[] { (byte) 100, 100, (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (short) 10, (int) (byte) -1);
    }

    @Test
    public void test01377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01377");
        int[] intArray6 = new int[] { 1, 'a', 0, (short) 100, (byte) -1, ' ' };
        int[] intArray12 = new int[] { (short) 100, (short) 1, 0, (short) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (short) 0, (int) (byte) 0);
    }

    @Test
    public void test01378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01378");
        int[] intArray2 = new int[] { (short) -1, (byte) 100 };
        int[] intArray7 = new int[] { (byte) 10, (byte) 100, '4', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (short) 10, (int) (byte) -1);
    }

    @Test
    public void test01379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01379");
        int[] intArray2 = new int[] { (short) 10, ' ' };
        int[] intArray6 = new int[] { (-1), (byte) 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 0, (int) (byte) -1);
    }

    @Test
    public void test01380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01380");
        int[] intArray1 = new int[] { 0 };
        int[] intArray3 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, 100, 0);
    }

    @Test
    public void test01381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01381");
        int[] intArray5 = new int[] { 10, '#', (short) 0, (byte) 0, (byte) 0 };
        int[] intArray7 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (short) 10, (-1));
    }

    @Test
    public void test01382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01382");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { 10, (byte) 0, (byte) -1, 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (-1), (int) (byte) 10);
    }

    @Test
    public void test01383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01383");
        int[] intArray5 = new int[] { ' ', (byte) 0, '4', 100, 10 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) ' ', (int) (short) 10);
    }

    @Test
    public void test01384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01384");
        int[] intArray5 = new int[] { (byte) 0, (short) 100, (-1), (byte) -1, (byte) -1 };
        int[] intArray8 = new int[] { (short) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (short) 1, 10);
    }

    @Test
    public void test01385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01385");
        int[] intArray3 = new int[] { (short) 100, '4', 'a' };
        int[] intArray7 = new int[] { 'a', (short) 0, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (byte) 100, 0);
    }

    @Test
    public void test01386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01386");
        int[] intArray5 = new int[] { ' ', (short) -1, (short) 100, '#', (short) 1 };
        int[] intArray11 = new int[] { ' ', (short) 100, (-1), 'a', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray11, (int) (short) 1, (int) (byte) 0);
    }

    @Test
    public void test01387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01387");
        int[] intArray6 = new int[] { (-1), (byte) 0, 1, (byte) 1, (short) -1, (short) 1 };
        int[] intArray11 = new int[] { (short) 100, (byte) 1, '#', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) '#', 10);
    }

    @Test
    public void test01388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01388");
        int[] intArray3 = new int[] { 1, (byte) 100, 1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) '#', (int) '#');
    }

    @Test
    public void test01389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01389");
        int[] intArray2 = new int[] { (byte) 10, 10 };
        int[] intArray9 = new int[] { (short) -1, (byte) 100, 'a', (short) 0, (short) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray9, 0, (int) '4');
    }

    @Test
    public void test01390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01390");
        int[] intArray2 = new int[] { (byte) 10, (short) 1 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (int) (short) -1, (int) (byte) 10);
    }

    @Test
    public void test01391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01391");
        int[] intArray6 = new int[] { '4', (short) 1, '#', '#', (-1), (short) 1 };
        int[] intArray12 = new int[] { 1, (short) 1, 1, (-1), (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) '#', (int) (byte) 100);
    }

    @Test
    public void test01392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01392");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray7 = new int[] { 'a', (short) 10, '#', ' ', 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, 100, (int) (short) 1);
    }

    @Test
    public void test01393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01393");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray3, 1, (int) '4');
    }

    @Test
    public void test01394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01394");
        int[] intArray6 = new int[] { 'a', (-1), 10, 10, 100, (short) 1 };
        int[] intArray11 = new int[] { (short) -1, 1, (short) 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, 1, (int) '#');
    }

    @Test
    public void test01395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01395");
        int[] intArray1 = new int[] { (byte) 0 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, (int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test01396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01396");
        int[] intArray4 = new int[] { '4', 0, 100, (byte) 100 };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (byte) 10, 0);
    }

    @Test
    public void test01397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01397");
        int[] intArray1 = new int[] { (byte) 100 };
        int[] intArray6 = new int[] { (short) 1, (short) -1, ' ', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, 0, (int) (byte) 1);
    }

    @Test
    public void test01398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01398");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 0, (short) 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) 1, (int) ' ');
    }

    @Test
    public void test01399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01399");
        int[] intArray6 = new int[] { (byte) -1, (short) 1, '#', (-1), '4', (byte) 0 };
        int[] intArray13 = new int[] { 'a', 100, 10, '#', (short) 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) ' ', (int) '#');
    }

    @Test
    public void test01400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01400");
        int[] intArray2 = new int[] { 1, 0 };
        int[] intArray6 = new int[] { (byte) 10, (byte) 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, 1, (int) (short) 1);
    }

    @Test
    public void test01401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01401");
        int[] intArray1 = new int[] { 0 };
        int[] intArray4 = new int[] { 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (-1), (int) (short) 1);
    }

    @Test
    public void test01402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01402");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 'a', 'a', (short) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 0, (int) '4');
    }

    @Test
    public void test01403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01403");
        int[] intArray2 = new int[] { '4', (short) -1 };
        int[] intArray5 = new int[] { (-1), (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 0, (int) (byte) 10);
    }

    @Test
    public void test01404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01404");
        int[] intArray5 = new int[] { 100, 1, (short) 100, (byte) 0, (short) -1 };
        int[] intArray7 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (short) 100, (int) (byte) 10);
    }

    @Test
    public void test01405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01405");
        int[] intArray2 = new int[] { '#', (short) 100 };
        int[] intArray3 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray3, (-1), (int) (short) 100);
    }

    @Test
    public void test01406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01406");
        int[] intArray1 = new int[] { '#' };
        int[] intArray4 = new int[] { 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) (byte) -1, 0);
    }

    @Test
    public void test01407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01407");
        int[] intArray1 = new int[] { '4' };
        int[] intArray3 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) '4', (int) (byte) 0);
    }

    @Test
    public void test01408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01408");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray6 = new int[] { (byte) 1, (short) 100, 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) '#', (int) (byte) 1);
    }

    @Test
    public void test01409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01409");
        int[] intArray5 = new int[] { (short) 10, (short) 100, (byte) 100, (byte) 10, (short) 1 };
        int[] intArray9 = new int[] { ' ', (short) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) 'a', 0);
    }

    @Test
    public void test01410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01410");
        int[] intArray2 = new int[] { (-1), (short) 10 };
        int[] intArray7 = new int[] { 1, (byte) 10, (short) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 0, (int) (byte) 0);
    }

    @Test
    public void test01411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01411");
        int[] intArray6 = new int[] { 1, '4', (short) 100, 10, (short) 100, (short) 10 };
        int[] intArray9 = new int[] { 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 0, 0);
    }

    @Test
    public void test01412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01412");
        int[] intArray4 = new int[] { '4', (byte) -1, 100, ' ' };
        int[] intArray5 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray5, (int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test01413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01413");
        int[] intArray4 = new int[] { (-1), ' ', (short) 0, 10 };
        int[] intArray9 = new int[] { '4', (byte) 100, (short) 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, (int) (short) 0, 10);
    }

    @Test
    public void test01414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01414");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (-1), (short) 0, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (short) 1, 100);
    }

    @Test
    public void test01415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01415");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray2, 1, (-1));
    }

    @Test
    public void test01416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01416");
        int[] intArray3 = new int[] { ' ', 'a', 100 };
        int[] intArray5 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (byte) -1, 100);
    }

    @Test
    public void test01417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01417");
        int[] intArray3 = new int[] { (short) 0, 'a', (byte) 0 };
        int[] intArray8 = new int[] { '#', (byte) 10, (byte) -1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, (int) (short) -1, (int) (byte) 10);
    }

    @Test
    public void test01418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01418");
        int[] intArray2 = new int[] { (byte) 1, (byte) 0 };
        int[] intArray7 = new int[] { '#', (byte) -1, (byte) 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 100, 1);
    }

    @Test
    public void test01419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01419");
        int[] intArray5 = new int[] { 100, ' ', 1, (short) 0, (byte) 10 };
        int[] intArray8 = new int[] { (short) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) (byte) -1, (int) (short) 1);
    }

    @Test
    public void test01420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01420");
        int[] intArray2 = new int[] { (-1), '4' };
        int[] intArray6 = new int[] { 10, (byte) 0, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) 10, 1);
    }

    @Test
    public void test01421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01421");
        int[] intArray4 = new int[] { (byte) 10, 1, (byte) -1, (short) 10 };
        int[] intArray7 = new int[] { '#', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, (int) (short) -1, (int) (short) 100);
    }

    @Test
    public void test01422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01422");
        int[] intArray5 = new int[] { 'a', ' ', (byte) 0, 'a', (byte) -1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) 10, (int) (short) 1);
    }

    @Test
    public void test01423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01423");
        int[] intArray5 = new int[] { '4', (short) 1, (byte) -1, ' ', 1 };
        int[] intArray7 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (short) 10, (int) (short) 1);
    }

    @Test
    public void test01424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01424");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray7 = new int[] { (short) 100, (short) 0, (short) -1, 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) -1, (int) 'a');
    }

    @Test
    public void test01425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01425");
        int[] intArray5 = new int[] { (short) 1, 0, (short) -1, 100, (short) 10 };
        int[] intArray7 = new int[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray7, (int) (byte) 1, (int) '#');
    }

    @Test
    public void test01426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01426");
        int[] intArray6 = new int[] { 0, (short) 10, '4', (-1), (byte) 10, (short) 1 };
        int[] intArray12 = new int[] { (byte) 0, (short) 100, 0, (short) 100, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, (int) (byte) 0, (int) '4');
    }

    @Test
    public void test01427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01427");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { '#', ' ', '4', '4', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) 1, (int) (short) 10);
    }

    @Test
    public void test01428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01428");
        int[] intArray4 = new int[] { (short) 100, 1, ' ', (-1) };
        int[] intArray11 = new int[] { 10, (byte) -1, 0, (short) 100, (short) 0, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) '#', (int) (short) 100);
    }

    @Test
    public void test01429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01429");
        int[] intArray5 = new int[] { 'a', 10, (short) 0, (short) 100, 1 };
        int[] intArray9 = new int[] { (short) 10, (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 0, (int) ' ');
    }

    @Test
    public void test01430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01430");
        int[] intArray1 = new int[] { 1 };
        int[] intArray5 = new int[] { 'a', (byte) 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, 100, 0);
    }

    @Test
    public void test01431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01431");
        int[] intArray2 = new int[] { ' ', '#' };
        int[] intArray7 = new int[] { (-1), (byte) 10, (short) 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, 1, (int) '#');
    }

    @Test
    public void test01432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01432");
        int[] intArray6 = new int[] { 10, (byte) -1, (short) 100, 10, (byte) 100, (short) -1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, 0, 100);
    }

    @Test
    public void test01433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01433");
        int[] intArray3 = new int[] { (short) -1, '4', (byte) 10 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) ' ', (int) (short) 1);
    }

    @Test
    public void test01434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01434");
        int[] intArray5 = new int[] { '#', ' ', (short) 100, (-1), (short) 1 };
        int[] intArray12 = new int[] { (short) 10, (short) -1, 100, (short) -1, 10, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (short) -1, (int) 'a');
    }

    @Test
    public void test01435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01435");
        int[] intArray6 = new int[] { (-1), 1, '#', (short) 100, (byte) 100, '#' };
        int[] intArray13 = new int[] { 100, (byte) 100, (byte) 1, (byte) -1, '#', '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (byte) -1, (int) (short) -1);
    }

    @Test
    public void test01436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01436");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray7 = new int[] { '#', '#', '#', (short) -1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (short) 10, (int) ' ');
    }

    @Test
    public void test01437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01437");
        int[] intArray1 = new int[] { '4' };
        int[] intArray3 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) ' ', 10);
    }

    @Test
    public void test01438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01438");
        int[] intArray3 = new int[] { '#', (short) 1, (short) 100 };
        int[] intArray5 = new int[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, (int) (short) 1, 10);
    }

    @Test
    public void test01439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01439");
        int[] intArray3 = new int[] { (short) 10, (short) 100, (byte) 100 };
        int[] intArray8 = new int[] { (byte) 100, 10, (short) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray8, 1, (int) (short) 0);
    }

    @Test
    public void test01440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01440");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { '4', (short) 10, ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 0, (int) (byte) 0);
    }

    @Test
    public void test01441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01441");
        int[] intArray6 = new int[] { 100, '4', (byte) 10, ' ', 'a', 1 };
        int[] intArray9 = new int[] { (short) -1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray9, (int) (byte) 0, (int) (byte) 10);
    }

    @Test
    public void test01442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01442");
        int[] intArray6 = new int[] { (byte) 0, (short) 0, (short) 10, (short) -1, 0, (byte) 10 };
        int[] intArray10 = new int[] { '#', (byte) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (short) 0, (int) (short) 10);
    }

    @Test
    public void test01443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01443");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray8 = new int[] { 0, (short) 0, '#', (short) 10, (short) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) (short) 1, (int) (short) 100);
    }

    @Test
    public void test01444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01444");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 10, 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) 0, (int) (byte) 100);
    }

    @Test
    public void test01445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01445");
        int[] intArray5 = new int[] { (short) -1, 1, (short) 100, (byte) 0, (short) 10 };
        int[] intArray9 = new int[] { '#', (short) -1, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, 1, (int) 'a');
    }

    @Test
    public void test01446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01446");
        int[] intArray3 = new int[] { ' ', (short) 100, 100 };
        int[] intArray7 = new int[] { (short) 1, '4', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray7, (int) (short) 100, 0);
    }

    @Test
    public void test01447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01447");
        int[] intArray4 = new int[] { 10, (-1), (byte) 0, 'a' };
        int[] intArray7 = new int[] { (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray7, 1, (int) (short) 10);
    }

    @Test
    public void test01448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01448");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { 0, 0, (-1), (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, 0, 1);
    }

    @Test
    public void test01449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01449");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { ' ', '4', (short) -1, (byte) 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (int) (byte) 0, 100);
    }

    @Test
    public void test01450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01450");
        int[] intArray1 = new int[] { 0 };
        int[] intArray3 = new int[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray3, (int) (short) 10, 1);
    }

    @Test
    public void test01451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01451");
        int[] intArray1 = new int[] { 100 };
        int[] intArray5 = new int[] { (short) 0, 100, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray5, (-1), (int) (short) 10);
    }

    @Test
    public void test01452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01452");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 10, '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) '4', (int) (short) 0);
    }

    @Test
    public void test01453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01453");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray6 = new int[] { (-1), (short) 10, (byte) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) ' ', 100);
    }

    @Test
    public void test01454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01454");
        int[] intArray6 = new int[] { (byte) 0, 0, (-1), (byte) 1, 'a', (byte) 1 };
        int[] intArray12 = new int[] { (short) 1, '4', 'a', 'a', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray12, 100, 0);
    }

    @Test
    public void test01455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01455");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray6 = new int[] { (byte) 100, (-1), (byte) 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (int) (byte) 100, (int) '#');
    }

    @Test
    public void test01456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01456");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, (byte) -1, 1, (short) 100, 10 };
        int[] intArray10 = new int[] { (short) 0, '4', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray10, (int) (short) 10, 100);
    }

    @Test
    public void test01457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01457");
        int[] intArray1 = new int[] { 100 };
        int[] intArray6 = new int[] { (byte) 1, '#', 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray6, (-1), (int) '4');
    }

    @Test
    public void test01458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01458");
        int[] intArray3 = new int[] { (short) 100, (byte) -1, 1 };
        int[] intArray5 = new int[] { 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, 0, (int) (byte) 10);
    }

    @Test
    public void test01459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01459");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (short) 10, (short) -1, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) 100, 100);
    }

    @Test
    public void test01460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01460");
        int[] intArray1 = new int[] { (short) 1 };
        int[] intArray8 = new int[] { 100, (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, (int) '4', (int) (short) 10);
    }

    @Test
    public void test01461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01461");
        int[] intArray3 = new int[] { (short) 1, '4', '#' };
        int[] intArray9 = new int[] { (-1), (byte) 0, (byte) 100, 0, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 1, (int) (short) 100);
    }

    @Test
    public void test01462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01462");
        int[] intArray6 = new int[] { 0, (byte) 10, (short) -1, (byte) 100, (short) 1, (short) 0 };
        int[] intArray13 = new int[] { (short) 100, (short) 100, 100, (byte) 0, 'a', '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (short) 10, (int) (byte) 10);
    }

    @Test
    public void test01463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01463");
        int[] intArray4 = new int[] { 'a', (short) -1, 1, 100 };
        int[] intArray11 = new int[] { (short) 10, 100, (byte) 100, (byte) -1, '#', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray11, (int) (byte) 10, (-1));
    }

    @Test
    public void test01464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01464");
        int[] intArray5 = new int[] { (byte) -1, (short) 0, (short) -1, (short) 100, 100 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) '4', (int) (short) 10);
    }

    @Test
    public void test01465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01465");
        int[] intArray6 = new int[] { (short) 100, ' ', (byte) 0, (short) 10, 0, (short) 0 };
        int[] intArray13 = new int[] { '4', (byte) 100, (short) 100, (byte) -1, (byte) 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, 0, (int) (byte) 100);
    }

    @Test
    public void test01466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01466");
        int[] intArray2 = new int[] { (short) 10, (short) -1 };
        int[] intArray7 = new int[] { ' ', (short) 10, 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray7, (int) (short) 10, 10);
    }

    @Test
    public void test01467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01467");
        int[] intArray2 = new int[] { '#', (short) -1 };
        int[] intArray8 = new int[] { (short) 10, '4', (byte) 100, ' ', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, (int) '4', 1);
    }

    @Test
    public void test01468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01468");
        int[] intArray5 = new int[] { (short) 100, 100, (short) 0, (byte) 1, (byte) -1 };
        int[] intArray8 = new int[] { 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray8, (int) '#', (int) (short) 10);
    }

    @Test
    public void test01469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01469");
        int[] intArray4 = new int[] { 100, (byte) 1, 1, 100 };
        int[] intArray6 = new int[] { '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, 0, (int) (byte) 0);
    }

    @Test
    public void test01470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01470");
        int[] intArray5 = new int[] { 10, 1, 10, 'a', (short) 100 };
        int[] intArray9 = new int[] { (byte) 1, 1, '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) '4', (int) (short) 1);
    }

    @Test
    public void test01471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01471");
        int[] intArray4 = new int[] { (short) -1, (byte) 1, 10, (byte) 10 };
        int[] intArray6 = new int[] { '4' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray6, (int) (short) 100, (int) (byte) 0);
    }

    @Test
    public void test01472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01472");
        int[] intArray5 = new int[] { (byte) 1, (short) 1, ' ', 'a', (byte) 100 };
        int[] intArray9 = new int[] { (byte) 0, (-1), (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) (byte) 100, 100);
    }

    @Test
    public void test01473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01473");
        int[] intArray4 = new int[] { '#', 1, (short) 1, (short) 100 };
        int[] intArray8 = new int[] { 0, (byte) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray8, (int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test01474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01474");
        int[] intArray6 = new int[] { (byte) -1, '4', '#', (byte) 1, ' ', (short) 1 };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) ' ', (int) 'a');
    }

    @Test
    public void test01475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01475");
        int[] intArray2 = new int[] { (byte) 10, (short) 100 };
        int[] intArray5 = new int[] { '#', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, (int) (byte) -1, (int) (byte) 0);
    }

    @Test
    public void test01476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01476");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) 100, (int) '4');
    }

    @Test
    public void test01477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01477");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { 10, '#', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray4, (int) (byte) 1, 0);
    }

    @Test
    public void test01478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01478");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray2, (int) (short) 1, (int) ' ');
    }

    @Test
    public void test01479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01479");
        int[] intArray6 = new int[] { 'a', (-1), '#', (byte) 100, (byte) -1, '#' };
        int[] intArray7 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray7, (int) (byte) 10, (int) 'a');
    }

    @Test
    public void test01480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01480");
        int[] intArray5 = new int[] { (short) 10, (byte) -1, (short) -1, (short) 10, (byte) 10 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray6, (int) (byte) -1, (int) (byte) 0);
    }

    @Test
    public void test01481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01481");
        int[] intArray2 = new int[] { (short) 100, 'a' };
        int[] intArray8 = new int[] { (short) 0, (byte) 0, (short) 10, (byte) 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray8, 0, (int) (byte) 10);
    }

    @Test
    public void test01482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01482");
        int[] intArray3 = new int[] { (short) 10, (short) -1, (byte) 1 };
        int[] intArray5 = new int[] { 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray5, 10, (int) (byte) 10);
    }

    @Test
    public void test01483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01483");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 1, '4', (byte) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test01484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01484");
        int[] intArray3 = new int[] { 100, (-1), (byte) -1 };
        int[] intArray9 = new int[] { 100, (byte) 10, (byte) 100, (byte) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 10, (int) ' ');
    }

    @Test
    public void test01485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01485");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray8 = new int[] { 0, 100, (byte) 100, (byte) 10, (byte) 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray8, 0, (-1));
    }

    @Test
    public void test01486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01486");
        int[] intArray5 = new int[] { 'a', '#', 0, '4', 'a' };
        int[] intArray12 = new int[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1, (short) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray12, (int) (byte) 0, 10);
    }

    @Test
    public void test01487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01487");
        int[] intArray0 = new int[] {};
        int[] intArray5 = new int[] { (byte) 1, (byte) 10, (short) 1, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray5, (int) '#', 100);
    }

    @Test
    public void test01488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01488");
        int[] intArray2 = new int[] { '#', 'a' };
        int[] intArray6 = new int[] { (byte) 1, (short) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) -1, (int) (byte) 100);
    }

    @Test
    public void test01489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01489");
        int[] intArray3 = new int[] { ' ', '#', (byte) 100 };
        int[] intArray9 = new int[] { (byte) 10, (-1), 100, (short) -1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, (int) 'a', (int) (byte) -1);
    }

    @Test
    public void test01490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01490");
        int[] intArray2 = new int[] { (byte) -1, (byte) 10 };
        int[] intArray6 = new int[] { (short) -1, ' ', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray6, (int) (byte) 1, (int) (short) 1);
    }

    @Test
    public void test01491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01491");
        int[] intArray6 = new int[] { 10, 1, ' ', (-1), (-1), (byte) 10 };
        int[] intArray13 = new int[] { (short) -1, ' ', (short) 100, (short) -1, (byte) 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray13, (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test01492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01492");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        int[] intArray5 = new int[] { ' ', 'a' };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray2, intArray5, 100, (int) (short) 100);
    }

    @Test
    public void test01493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01493");
        int[] intArray4 = new int[] { (short) 1, (byte) -1, (short) 1, (byte) 1 };
        int[] intArray9 = new int[] { (short) 1, ' ', (short) 1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray4, intArray9, 0, 100);
    }

    @Test
    public void test01494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01494");
        int[] intArray3 = new int[] { 'a', (byte) 1, '4' };
        int[] intArray9 = new int[] { '#', (byte) 100, (byte) 0, ' ', (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray9, 0, 100);
    }

    @Test
    public void test01495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01495");
        int[] intArray6 = new int[] { (short) 10, 1, (-1), (short) 10, '4', 'a' };
        int[] intArray11 = new int[] { (-1), 0, (byte) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray6, intArray11, (int) '#', 0);
    }

    @Test
    public void test01496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01496");
        int[] intArray1 = new int[] { 10 };
        int[] intArray4 = new int[] { 'a', (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray4, (int) '#', 0);
    }

    @Test
    public void test01497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01497");
        int[] intArray3 = new int[] { '#', 'a', (byte) -1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray3, intArray4, (int) (short) 1, (int) (byte) 1);
    }

    @Test
    public void test01498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01498");
        int[] intArray5 = new int[] { '4', 1, (byte) 100, 10, (byte) 100 };
        int[] intArray9 = new int[] { (byte) -1, (short) 10, 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray5, intArray9, (int) '#', 0);
    }

    @Test
    public void test01499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01499");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (byte) 0, (byte) 10, 100, 'a', 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray0, intArray6, (-1), (int) (byte) 0);
    }

    @Test
    public void test01500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test01500");
        int[] intArray1 = new int[] { ' ' };
        int[] intArray7 = new int[] { 10, (byte) 1, (byte) 100, (short) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = com.thealgorithms.dynamicprogramming.KnapsackMemoization.knapsack(intArray1, intArray7, (int) (byte) 100, 0);
    }
}

