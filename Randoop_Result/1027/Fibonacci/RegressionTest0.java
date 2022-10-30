package Fibonacci;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibBotUp(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-980107325) + "'", int1 == (-980107325));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibOptimized(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-980107325) + "'", int1 == (-980107325));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibMemo((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.thealgorithms.dynamicprogramming.Fibonacci fibonacci0 = new com.thealgorithms.dynamicprogramming.Fibonacci();
        java.lang.Class<?> wildcardClass1 = fibonacci0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibMemo((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibBotUp((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibOptimized((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibMemo((-980107325));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-980107325) + "'", int1 == (-980107325));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibMemo(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibOptimized((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibOptimized((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9227465 + "'", int1 == 9227465);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibBotUp(9227465);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1050337453 + "'", int1 == 1050337453);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibOptimized(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 55 + "'", int1 == 55);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibBotUp(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 55 + "'", int1 == 55);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibBotUp((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2178309 + "'", int1 == 2178309);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibMemo((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibOptimized(2178309);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1163903934) + "'", int1 == (-1163903934));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibBotUp((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1408458269) + "'", int1 == (-1408458269));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibBotUp((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-798870975) + "'", int1 == (-798870975));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibMemo((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibMemo((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibOptimized((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2178309 + "'", int1 == 2178309);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibMemo(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-980107325) + "'", int1 == (-980107325));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibMemo((-798870975));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-798870975) + "'", int1 == (-798870975));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibOptimized((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibOptimized((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibBotUp(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibMemo((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 55 + "'", int1 == 55);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibMemo(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 55 + "'", int1 == 55);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibMemo(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibOptimized(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibMemo((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9227465 + "'", int1 == 9227465);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibOptimized(9227465);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1050337453 + "'", int1 == 1050337453);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibBotUp((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibOptimized((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-798870975) + "'", int1 == (-798870975));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibOptimized(55);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2144908973 + "'", int1 == 2144908973);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibMemo((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 55 + "'", int1 == 55);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibBotUp((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 55 + "'", int1 == 55);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibOptimized(2144908973);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1570223573 + "'", int1 == 1570223573);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibBotUp((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibMemo((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibOptimized(1570223573);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1370785189 + "'", int1 == 1370785189);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibOptimized((-1408458269));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibBotUp((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 55 + "'", int1 == 55);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibOptimized((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibMemo((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2178309 + "'", int1 == 2178309);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibOptimized((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 55 + "'", int1 == 55);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibMemo((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibBotUp((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibMemo((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-798870975) + "'", int1 == (-798870975));
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibBotUp((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-980107325) + "'", int1 == (-980107325));
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibBotUp(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibOptimized(1050337453);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1151253847) + "'", int1 == (-1151253847));
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        int int1 = com.thealgorithms.dynamicprogramming.Fibonacci.fibBotUp(55);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2144908973 + "'", int1 == 2144908973);
    }
}

