package Fibonacci;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibBotUp((int) (short) -1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibBotUp((-1163903934));
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibBotUp((-798870975));
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibBotUp((int) (byte) -1);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibBotUp((-1));
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibBotUp((-1408458269));
    }
}

