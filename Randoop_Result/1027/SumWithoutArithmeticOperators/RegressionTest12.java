package SumWithoutArithmeticOperators;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

    public static boolean debug = false;

    @Test
    public void test6001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6001");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(210, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(317, 110);
        int int24 = sumWithoutArithmeticOperators0.getSum(352, 283);
        int int27 = sumWithoutArithmeticOperators0.getSum(324, 36);
        int int30 = sumWithoutArithmeticOperators0.getSum(9568, 2226);
        int int33 = sumWithoutArithmeticOperators0.getSum(0, 5302);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 246 + "'", int18 == 246);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 427 + "'", int21 == 427);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 635 + "'", int24 == 635);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 360 + "'", int27 == 360);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 11794 + "'", int30 == 11794);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5302 + "'", int33 == 5302);
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) '#', (int) (short) 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) 'a', 156);
        int int21 = sumWithoutArithmeticOperators0.getSum(238, 84);
        int int24 = sumWithoutArithmeticOperators0.getSum(638, 36);
        int int27 = sumWithoutArithmeticOperators0.getSum(798, 1738);
        int int30 = sumWithoutArithmeticOperators0.getSum(2581, 5561);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 253 + "'", int18 == 253);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 322 + "'", int21 == 322);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 674 + "'", int24 == 674);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2536 + "'", int27 == 2536);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8142 + "'", int30 == 8142);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(18, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 108);
        int int21 = sumWithoutArithmeticOperators0.getSum(825, 1491);
        int int24 = sumWithoutArithmeticOperators0.getSum(2230, (int) (short) 1);
        int int27 = sumWithoutArithmeticOperators0.getSum(1047, 344);
        int int30 = sumWithoutArithmeticOperators0.getSum(9519, 109);
        int int33 = sumWithoutArithmeticOperators0.getSum(54671, 25205);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 109 + "'", int18 == 109);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2316 + "'", int21 == 2316);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2231 + "'", int24 == 2231);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1391 + "'", int27 == 1391);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9628 + "'", int30 == 9628);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 79876 + "'", int33 == 79876);
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(101, 21);
        int int18 = sumWithoutArithmeticOperators0.getSum(89, 180);
        int int21 = sumWithoutArithmeticOperators0.getSum(199, (int) '4');
        int int24 = sumWithoutArithmeticOperators0.getSum((int) '#', 1133);
        int int27 = sumWithoutArithmeticOperators0.getSum(2219, 1236);
        int int30 = sumWithoutArithmeticOperators0.getSum(3319, (int) (short) 100);
        int int33 = sumWithoutArithmeticOperators0.getSum(0, 7477);
        int int36 = sumWithoutArithmeticOperators0.getSum(0, 4537);
        int int39 = sumWithoutArithmeticOperators0.getSum(4667, 9602);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 269 + "'", int18 == 269);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 251 + "'", int21 == 251);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1168 + "'", int24 == 1168);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3455 + "'", int27 == 3455);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3419 + "'", int30 == 3419);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 7477 + "'", int33 == 7477);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4537 + "'", int36 == 4537);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 14269 + "'", int39 == 14269);
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(9, 217);
        int int18 = sumWithoutArithmeticOperators0.getSum(4048, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 226 + "'", int15 == 226);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4048 + "'", int18 == 4048);
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(17, 200);
        int int6 = sumWithoutArithmeticOperators0.getSum(853, 427);
        int int9 = sumWithoutArithmeticOperators0.getSum(1171, 254);
        int int12 = sumWithoutArithmeticOperators0.getSum(2777, 690);
        int int15 = sumWithoutArithmeticOperators0.getSum(42449, 91);
        int int18 = sumWithoutArithmeticOperators0.getSum(5021, 8179);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 217 + "'", int3 == 217);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1280 + "'", int6 == 1280);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1425 + "'", int9 == 1425);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3467 + "'", int12 == 3467);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 42540 + "'", int15 == 42540);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13200 + "'", int18 == 13200);
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(692, 2611);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3303 + "'", int15 == 3303);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(9, 217);
        int int18 = sumWithoutArithmeticOperators0.getSum(934, 766);
        int int21 = sumWithoutArithmeticOperators0.getSum(216, 215);
        int int24 = sumWithoutArithmeticOperators0.getSum(620, 565);
        int int27 = sumWithoutArithmeticOperators0.getSum(1432, 3744);
        int int30 = sumWithoutArithmeticOperators0.getSum(2123, 1777);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 226 + "'", int15 == 226);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1700 + "'", int18 == 1700);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 431 + "'", int21 == 431);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1185 + "'", int24 == 1185);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5176 + "'", int27 == 5176);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3900 + "'", int30 == 3900);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(18, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) '#', 286);
        int int21 = sumWithoutArithmeticOperators0.getSum(3742, 6284);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 321 + "'", int18 == 321);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10026 + "'", int21 == 10026);
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 18);
        int int9 = sumWithoutArithmeticOperators0.getSum(36, 160);
        int int12 = sumWithoutArithmeticOperators0.getSum(686, 2696);
        int int15 = sumWithoutArithmeticOperators0.getSum(2810, 5491);
        int int18 = sumWithoutArithmeticOperators0.getSum(835, 16007);
        int int21 = sumWithoutArithmeticOperators0.getSum(2683, 2596);
        int int24 = sumWithoutArithmeticOperators0.getSum(9415, 1859);
        int int27 = sumWithoutArithmeticOperators0.getSum(4833, 2537);
        int int30 = sumWithoutArithmeticOperators0.getSum(10355, 14173);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 196 + "'", int9 == 196);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3382 + "'", int12 == 3382);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8301 + "'", int15 == 8301);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16842 + "'", int18 == 16842);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5279 + "'", int21 == 5279);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11274 + "'", int24 == 11274);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7370 + "'", int27 == 7370);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 24528 + "'", int30 == 24528);
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(321, 56);
        int int9 = sumWithoutArithmeticOperators0.getSum(277, 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(625, 55);
        int int15 = sumWithoutArithmeticOperators0.getSum(165, 199);
        int int18 = sumWithoutArithmeticOperators0.getSum(215, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(416, 6812);
        int int24 = sumWithoutArithmeticOperators0.getSum(6914, 7161);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 377 + "'", int6 == 377);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 377 + "'", int9 == 377);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 680 + "'", int12 == 680);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 364 + "'", int15 == 364);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 215 + "'", int18 == 215);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7228 + "'", int21 == 7228);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14075 + "'", int24 == 14075);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(255, 4075);
        int int18 = sumWithoutArithmeticOperators0.getSum(521, 1073);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 872);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4330 + "'", int15 == 4330);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1594 + "'", int18 == 1594);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 872 + "'", int21 == 872);
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 36);
        int int18 = sumWithoutArithmeticOperators0.getSum(13170, 6245);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 19415 + "'", int18 == 19415);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(11, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(286, 9);
        int int24 = sumWithoutArithmeticOperators0.getSum((int) ' ', 44);
        int int27 = sumWithoutArithmeticOperators0.getSum(1026, 2265);
        int int30 = sumWithoutArithmeticOperators0.getSum(9569, 44118);
        int int33 = sumWithoutArithmeticOperators0.getSum(4366, 38069);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 76 + "'", int24 == 76);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3291 + "'", int27 == 3291);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 53687 + "'", int30 == 53687);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 42435 + "'", int33 == 42435);
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(955, 89);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 55);
        int int21 = sumWithoutArithmeticOperators0.getSum(479, 786);
        int int24 = sumWithoutArithmeticOperators0.getSum(2310, 1963);
        int int27 = sumWithoutArithmeticOperators0.getSum(66540, 0);
        int int30 = sumWithoutArithmeticOperators0.getSum(9258, 569);
        int int33 = sumWithoutArithmeticOperators0.getSum(22263, 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1044 + "'", int15 == 1044);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 56 + "'", int18 == 56);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1265 + "'", int21 == 1265);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4273 + "'", int24 == 4273);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 66540 + "'", int27 == 66540);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9827 + "'", int30 == 9827);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 22362 + "'", int33 == 22362);
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(18, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) '#', 286);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 469);
        int int24 = sumWithoutArithmeticOperators0.getSum(1427, 11724);
        int int27 = sumWithoutArithmeticOperators0.getSum(6663, 245);
        int int30 = sumWithoutArithmeticOperators0.getSum(1244, 4768);
        int int33 = sumWithoutArithmeticOperators0.getSum(14000, 11582);
        int int36 = sumWithoutArithmeticOperators0.getSum(12103, 515);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 321 + "'", int18 == 321);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 469 + "'", int21 == 469);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13151 + "'", int24 == 13151);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6908 + "'", int27 == 6908);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6012 + "'", int30 == 6012);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 25582 + "'", int33 == 25582);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 12618 + "'", int36 == 12618);
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6017");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum((-1), 290);
        int int21 = sumWithoutArithmeticOperators0.getSum(3564, 5352);
        int int24 = sumWithoutArithmeticOperators0.getSum(3897, 2075);
        int int27 = sumWithoutArithmeticOperators0.getSum(20125, 25009);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 289 + "'", int18 == 289);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8916 + "'", int21 == 8916);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5972 + "'", int24 == 5972);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 45134 + "'", int27 == 45134);
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6018");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(122, 67);
        int int18 = sumWithoutArithmeticOperators0.getSum(473, 360);
        int int21 = sumWithoutArithmeticOperators0.getSum(2512, 615);
        int int24 = sumWithoutArithmeticOperators0.getSum(2817, 1105);
        int int27 = sumWithoutArithmeticOperators0.getSum(3177, 9704);
        int int30 = sumWithoutArithmeticOperators0.getSum(931, 576);
        int int33 = sumWithoutArithmeticOperators0.getSum(19899, 10303);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 189 + "'", int15 == 189);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 833 + "'", int18 == 833);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3127 + "'", int21 == 3127);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3922 + "'", int24 == 3922);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 12881 + "'", int27 == 12881);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1507 + "'", int30 == 1507);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 30202 + "'", int33 == 30202);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6019");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 98);
        int int9 = sumWithoutArithmeticOperators0.getSum(3744, 507);
        int int12 = sumWithoutArithmeticOperators0.getSum(1280, 1180);
        int int15 = sumWithoutArithmeticOperators0.getSum(2653, 380);
        int int18 = sumWithoutArithmeticOperators0.getSum(1661, 2210);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 108 + "'", int6 == 108);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4251 + "'", int9 == 4251);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2460 + "'", int12 == 2460);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3033 + "'", int15 == 3033);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3871 + "'", int18 == 3871);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 165);
        int int12 = sumWithoutArithmeticOperators0.getSum(152, 108);
        int int15 = sumWithoutArithmeticOperators0.getSum(345, 9);
        int int18 = sumWithoutArithmeticOperators0.getSum(1180, 473);
        int int21 = sumWithoutArithmeticOperators0.getSum(1588, 2919);
        int int24 = sumWithoutArithmeticOperators0.getSum(6199, 3889);
        int int27 = sumWithoutArithmeticOperators0.getSum(5684, 7014);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 294 + "'", int9 == 294);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 260 + "'", int12 == 260);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 354 + "'", int15 == 354);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1653 + "'", int18 == 1653);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4507 + "'", int21 == 4507);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10088 + "'", int24 == 10088);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 12698 + "'", int27 == 12698);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6021");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(217, 238);
        int int21 = sumWithoutArithmeticOperators0.getSum(156, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(593, 1374);
        int int27 = sumWithoutArithmeticOperators0.getSum(1920, 4177);
        int int30 = sumWithoutArithmeticOperators0.getSum(8325, 699);
        int int33 = sumWithoutArithmeticOperators0.getSum(597, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 455 + "'", int18 == 455);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 156 + "'", int21 == 156);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1967 + "'", int24 == 1967);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6097 + "'", int27 == 6097);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9024 + "'", int30 == 9024);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 597 + "'", int33 == 597);
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6022");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) '#', (int) (short) 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(52, (int) (short) 1);
        int int21 = sumWithoutArithmeticOperators0.getSum(35, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(1312, 1686);
        int int27 = sumWithoutArithmeticOperators0.getSum(2518, 14534);
        int int30 = sumWithoutArithmeticOperators0.getSum(35424, 184);
        int int33 = sumWithoutArithmeticOperators0.getSum(3665, 27596);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53 + "'", int18 == 53);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2998 + "'", int24 == 2998);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 17052 + "'", int27 == 17052);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35608 + "'", int30 == 35608);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 31261 + "'", int33 == 31261);
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6023");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(277, 17);
        int int15 = sumWithoutArithmeticOperators0.getSum(812, 735);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 1455);
        int int21 = sumWithoutArithmeticOperators0.getSum(2681, 7571);
        int int24 = sumWithoutArithmeticOperators0.getSum(66701, 14103);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 294 + "'", int12 == 294);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1547 + "'", int15 == 1547);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1455 + "'", int18 == 1455);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10252 + "'", int21 == 10252);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 80804 + "'", int24 == 80804);
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6024");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(162, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(100, 32);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 84);
        int int24 = sumWithoutArithmeticOperators0.getSum(150, 161);
        int int27 = sumWithoutArithmeticOperators0.getSum(8887, 3427);
        int int30 = sumWithoutArithmeticOperators0.getSum(38745, 888);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 132 + "'", int18 == 132);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 84 + "'", int21 == 84);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 311 + "'", int24 == 311);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 12314 + "'", int27 == 12314);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 39633 + "'", int30 == 39633);
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6025");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(911, 432);
        int int12 = sumWithoutArithmeticOperators0.getSum(955, 382);
        int int15 = sumWithoutArithmeticOperators0.getSum(1723, 7852);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, (int) '4');
        int int21 = sumWithoutArithmeticOperators0.getSum(10825, 10257);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1343 + "'", int9 == 1343);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1337 + "'", int12 == 1337);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9575 + "'", int15 == 9575);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 21082 + "'", int21 == 21082);
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6026");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(680, 1108);
        int int12 = sumWithoutArithmeticOperators0.getSum(472, 330);
        int int15 = sumWithoutArithmeticOperators0.getSum(1114, 1329);
        int int18 = sumWithoutArithmeticOperators0.getSum(13268, 60698);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1788 + "'", int9 == 1788);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 802 + "'", int12 == 802);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2443 + "'", int15 == 2443);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 73966 + "'", int18 == 73966);
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6027");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(238, 152);
        int int15 = sumWithoutArithmeticOperators0.getSum(5087, 257);
        int int18 = sumWithoutArithmeticOperators0.getSum(1776, 6915);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 390 + "'", int12 == 390);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5344 + "'", int15 == 5344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8691 + "'", int18 == 8691);
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6028");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(107, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(289, 555);
        int int18 = sumWithoutArithmeticOperators0.getSum(1926, 4985);
        int int21 = sumWithoutArithmeticOperators0.getSum(7180, 4415);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 844 + "'", int15 == 844);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6911 + "'", int18 == 6911);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11595 + "'", int21 == 11595);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6029");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(321, 56);
        int int9 = sumWithoutArithmeticOperators0.getSum(277, 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(625, 55);
        int int15 = sumWithoutArithmeticOperators0.getSum(543, 767);
        int int18 = sumWithoutArithmeticOperators0.getSum(13361, 4231);
        int int21 = sumWithoutArithmeticOperators0.getSum(4817, 3158);
        int int24 = sumWithoutArithmeticOperators0.getSum(32618, 17282);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 377 + "'", int6 == 377);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 377 + "'", int9 == 377);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 680 + "'", int12 == 680);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1310 + "'", int15 == 1310);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17592 + "'", int18 == 17592);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7975 + "'", int21 == 7975);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 49900 + "'", int24 == 49900);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6030");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(163, 52);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 200);
        int int18 = sumWithoutArithmeticOperators0.getSum(325, 617);
        int int21 = sumWithoutArithmeticOperators0.getSum(1511, 1128);
        int int24 = sumWithoutArithmeticOperators0.getSum(1096, 3467);
        int int27 = sumWithoutArithmeticOperators0.getSum(117, 3084);
        int int30 = sumWithoutArithmeticOperators0.getSum(16794, 21723);
        int int33 = sumWithoutArithmeticOperators0.getSum(2353, 2062);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 215 + "'", int12 == 215);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 942 + "'", int18 == 942);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2639 + "'", int21 == 2639);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4563 + "'", int24 == 4563);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3201 + "'", int27 == 3201);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 38517 + "'", int30 == 38517);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4415 + "'", int33 == 4415);
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6031");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(321, 56);
        int int9 = sumWithoutArithmeticOperators0.getSum(189, 766);
        int int12 = sumWithoutArithmeticOperators0.getSum(290, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(407, 847);
        int int18 = sumWithoutArithmeticOperators0.getSum(360, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(14415, 1380);
        int int24 = sumWithoutArithmeticOperators0.getSum(24135, 17098);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 377 + "'", int6 == 377);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 955 + "'", int9 == 955);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 311 + "'", int12 == 311);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1254 + "'", int15 == 1254);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15795 + "'", int21 == 15795);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 41233 + "'", int24 == 41233);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6032");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(321, 56);
        int int9 = sumWithoutArithmeticOperators0.getSum(277, 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(1, 1601);
        int int15 = sumWithoutArithmeticOperators0.getSum(3618, 3386);
        int int18 = sumWithoutArithmeticOperators0.getSum(2330, 20869);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 377 + "'", int6 == 377);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 377 + "'", int9 == 377);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1602 + "'", int12 == 1602);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7004 + "'", int15 == 7004);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 23199 + "'", int18 == 23199);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6033");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(51, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(238, (int) '4');
        int int18 = sumWithoutArithmeticOperators0.getSum(455, (int) (short) 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(370, 15637);
        int int24 = sumWithoutArithmeticOperators0.getSum(463, 2265);
        int int27 = sumWithoutArithmeticOperators0.getSum(817, 3501);
        int int30 = sumWithoutArithmeticOperators0.getSum(2810, 11960);
        int int33 = sumWithoutArithmeticOperators0.getSum(3259, 4193);
        int int36 = sumWithoutArithmeticOperators0.getSum(4468, 1953);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 290 + "'", int15 == 290);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 455 + "'", int18 == 455);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16007 + "'", int21 == 16007);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2728 + "'", int24 == 2728);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4318 + "'", int27 == 4318);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 14770 + "'", int30 == 14770);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 7452 + "'", int33 == 7452);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 6421 + "'", int36 == 6421);
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6034");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 200);
        int int9 = sumWithoutArithmeticOperators0.getSum(156, 36);
        int int12 = sumWithoutArithmeticOperators0.getSum(1987, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(2518, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(14990, 16746);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 210 + "'", int6 == 210);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 192 + "'", int9 == 192);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1987 + "'", int12 == 1987);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2518 + "'", int15 == 2518);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31736 + "'", int18 == 31736);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6035");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(911, 432);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 34);
        int int15 = sumWithoutArithmeticOperators0.getSum(7558, 1097);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1343 + "'", int9 == 1343);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8655 + "'", int15 == 8655);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6036");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(11, (int) (short) 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(1856, 1670);
        int int21 = sumWithoutArithmeticOperators0.getSum(2438, 1527);
        int int24 = sumWithoutArithmeticOperators0.getSum(382, 17451);
        int int27 = sumWithoutArithmeticOperators0.getSum(5148, 592);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3526 + "'", int18 == 3526);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3965 + "'", int21 == 3965);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 17833 + "'", int24 == 17833);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5740 + "'", int27 == 5740);
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6037");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(1313, 242);
        int int18 = sumWithoutArithmeticOperators0.getSum(9897, 0);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1555 + "'", int15 == 1555);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9897 + "'", int18 == 9897);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6038");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(277, 17);
        int int15 = sumWithoutArithmeticOperators0.getSum(812, 735);
        int int18 = sumWithoutArithmeticOperators0.getSum(5402, 6258);
        int int21 = sumWithoutArithmeticOperators0.getSum(7796, 1187);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 294 + "'", int12 == 294);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1547 + "'", int15 == 1547);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11660 + "'", int18 == 11660);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8983 + "'", int21 == 8983);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6039");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 165);
        int int12 = sumWithoutArithmeticOperators0.getSum(152, 108);
        int int15 = sumWithoutArithmeticOperators0.getSum(499, 569);
        int int18 = sumWithoutArithmeticOperators0.getSum(1473, 2476);
        int int21 = sumWithoutArithmeticOperators0.getSum(427, 26235);
        int int24 = sumWithoutArithmeticOperators0.getSum(11599, 3253);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 294 + "'", int9 == 294);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 260 + "'", int12 == 260);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1068 + "'", int15 == 1068);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3949 + "'", int18 == 3949);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 26662 + "'", int21 == 26662);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14852 + "'", int24 == 14852);
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6040");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 18);
        int int18 = sumWithoutArithmeticOperators0.getSum(1380, (int) (short) 100);
        int int21 = sumWithoutArithmeticOperators0.getSum(9704, 189);
        int int24 = sumWithoutArithmeticOperators0.getSum(659, 9815);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1480 + "'", int18 == 1480);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9893 + "'", int21 == 9893);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10474 + "'", int24 == 10474);
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6041");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(859, 321);
        int int18 = sumWithoutArithmeticOperators0.getSum(209, 213);
        int int21 = sumWithoutArithmeticOperators0.getSum(8216, 8824);
        int int24 = sumWithoutArithmeticOperators0.getSum(9792, 19257);
        int int27 = sumWithoutArithmeticOperators0.getSum(3737, 581);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1180 + "'", int15 == 1180);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 422 + "'", int18 == 422);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 17040 + "'", int21 == 17040);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 29049 + "'", int24 == 29049);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4318 + "'", int27 == 4318);
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6042");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(40, 269);
        int int6 = sumWithoutArithmeticOperators0.getSum(152, 465);
        int int9 = sumWithoutArithmeticOperators0.getSum(562, 803);
        int int12 = sumWithoutArithmeticOperators0.getSum(3526, 8853);
        int int15 = sumWithoutArithmeticOperators0.getSum(1744, 1293);
        int int18 = sumWithoutArithmeticOperators0.getSum(4977, 4736);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 309 + "'", int3 == 309);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 617 + "'", int6 == 617);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1365 + "'", int9 == 1365);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12379 + "'", int12 == 12379);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3037 + "'", int15 == 3037);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9713 + "'", int18 == 9713);
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6043");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(19, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(1245, 1680);
        int int21 = sumWithoutArithmeticOperators0.getSum(996, 2368);
        int int24 = sumWithoutArithmeticOperators0.getSum(3510, 7400);
        int int27 = sumWithoutArithmeticOperators0.getSum(3929, 15301);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 129 + "'", int15 == 129);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2925 + "'", int18 == 2925);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3364 + "'", int21 == 3364);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10910 + "'", int24 == 10910);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 19230 + "'", int27 == 19230);
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6044");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(317, 791);
        int int15 = sumWithoutArithmeticOperators0.getSum(2948, 2037);
        int int18 = sumWithoutArithmeticOperators0.getSum(63376, 18247);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1108 + "'", int12 == 1108);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4985 + "'", int15 == 4985);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 81623 + "'", int18 == 81623);
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6045");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(11, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(286, 9);
        int int24 = sumWithoutArithmeticOperators0.getSum(110, 266);
        int int27 = sumWithoutArithmeticOperators0.getSum(1, 40);
        int int30 = sumWithoutArithmeticOperators0.getSum(56, 250);
        int int33 = sumWithoutArithmeticOperators0.getSum(321, 461);
        int int36 = sumWithoutArithmeticOperators0.getSum(3936, 1407);
        int int39 = sumWithoutArithmeticOperators0.getSum(4910, 5115);
        int int42 = sumWithoutArithmeticOperators0.getSum(20713, 306);
        java.lang.Class<?> wildcardClass43 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 376 + "'", int24 == 376);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 41 + "'", int27 == 41);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 306 + "'", int30 == 306);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 782 + "'", int33 == 782);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5343 + "'", int36 == 5343);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10025 + "'", int39 == 10025);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 21019 + "'", int42 == 21019);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6046");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 165);
        int int12 = sumWithoutArithmeticOperators0.getSum(152, 108);
        int int15 = sumWithoutArithmeticOperators0.getSum(788, 360);
        int int18 = sumWithoutArithmeticOperators0.getSum(44, 2347);
        int int21 = sumWithoutArithmeticOperators0.getSum(345, 2919);
        int int24 = sumWithoutArithmeticOperators0.getSum(6732, 4270);
        int int27 = sumWithoutArithmeticOperators0.getSum(5396, 11841);
        int int30 = sumWithoutArithmeticOperators0.getSum(4711, 20290);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 294 + "'", int9 == 294);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 260 + "'", int12 == 260);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1148 + "'", int15 == 1148);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2391 + "'", int18 == 2391);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3264 + "'", int21 == 3264);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11002 + "'", int24 == 11002);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 17237 + "'", int27 == 17237);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 25001 + "'", int30 == 25001);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6047");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(1242, 12740);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 13982 + "'", int6 == 13982);
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6048");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(101, 21);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(243, 1133);
        int int24 = sumWithoutArithmeticOperators0.getSum(377, 734);
        int int27 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 1748);
        int int30 = sumWithoutArithmeticOperators0.getSum(2262, 0);
        int int33 = sumWithoutArithmeticOperators0.getSum(4773, 635);
        int int36 = sumWithoutArithmeticOperators0.getSum(0, 2953);
        java.lang.Class<?> wildcardClass37 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 162 + "'", int18 == 162);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1376 + "'", int21 == 1376);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1111 + "'", int24 == 1111);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1748 + "'", int27 == 1748);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2262 + "'", int30 == 2262);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5408 + "'", int33 == 5408);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2953 + "'", int36 == 2953);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6049");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(40, 269);
        int int6 = sumWithoutArithmeticOperators0.getSum(202, 523);
        int int9 = sumWithoutArithmeticOperators0.getSum(362, 1680);
        int int12 = sumWithoutArithmeticOperators0.getSum(9017, 5215);
        int int15 = sumWithoutArithmeticOperators0.getSum(13588, 2079);
        int int18 = sumWithoutArithmeticOperators0.getSum(3786, 1329);
        int int21 = sumWithoutArithmeticOperators0.getSum(14529, 2290);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 309 + "'", int3 == 309);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 725 + "'", int6 == 725);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2042 + "'", int9 == 2042);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 14232 + "'", int12 == 14232);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15667 + "'", int15 == 15667);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5115 + "'", int18 == 5115);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16819 + "'", int21 == 16819);
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6050");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 36);
        int int18 = sumWithoutArithmeticOperators0.getSum(727, 228);
        int int21 = sumWithoutArithmeticOperators0.getSum(5675, 1698);
        int int24 = sumWithoutArithmeticOperators0.getSum(1292, 4464);
        int int27 = sumWithoutArithmeticOperators0.getSum(281, 11274);
        int int30 = sumWithoutArithmeticOperators0.getSum(3850, 14204);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 955 + "'", int18 == 955);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7373 + "'", int21 == 7373);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5756 + "'", int24 == 5756);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 11555 + "'", int27 == 11555);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 18054 + "'", int30 == 18054);
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6051");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 98);
        int int9 = sumWithoutArithmeticOperators0.getSum(1281, 246);
        int int12 = sumWithoutArithmeticOperators0.getSum(3497, 6362);
        int int15 = sumWithoutArithmeticOperators0.getSum(16978, 51228);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 108 + "'", int6 == 108);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1527 + "'", int9 == 1527);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9859 + "'", int12 == 9859);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 68206 + "'", int15 == 68206);
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6052");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(9, 217);
        int int18 = sumWithoutArithmeticOperators0.getSum(132, 499);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 179);
        int int24 = sumWithoutArithmeticOperators0.getSum(42449, 3345);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 226 + "'", int15 == 226);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 631 + "'", int18 == 631);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 179 + "'", int21 == 179);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 45794 + "'", int24 == 45794);
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6053");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(51, 422);
        int int18 = sumWithoutArithmeticOperators0.getSum(567, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(1980, 2383);
        int int24 = sumWithoutArithmeticOperators0.getSum(26616, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 473 + "'", int15 == 473);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 567 + "'", int18 == 567);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4363 + "'", int21 == 4363);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 26616 + "'", int24 == 26616);
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6054");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 18);
        int int9 = sumWithoutArithmeticOperators0.getSum(36, 160);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 108);
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 201);
        int int18 = sumWithoutArithmeticOperators0.getSum(11580, 6410);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 196 + "'", int9 == 196);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 245 + "'", int15 == 245);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17990 + "'", int18 == 17990);
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6055");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(51, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(375, 352);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 165);
        int int21 = sumWithoutArithmeticOperators0.getSum(109, 52);
        int int24 = sumWithoutArithmeticOperators0.getSum(3707, 4847);
        int int27 = sumWithoutArithmeticOperators0.getSum(6812, 0);
        int int30 = sumWithoutArithmeticOperators0.getSum(567, 3707);
        int int33 = sumWithoutArithmeticOperators0.getSum(865, 697);
        int int36 = sumWithoutArithmeticOperators0.getSum(20891, 7343);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 727 + "'", int15 == 727);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 165 + "'", int18 == 165);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 161 + "'", int21 == 161);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8554 + "'", int24 == 8554);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6812 + "'", int27 == 6812);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4274 + "'", int30 == 4274);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1562 + "'", int33 == 1562);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 28234 + "'", int36 == 28234);
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6056");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 101);
        int int18 = sumWithoutArithmeticOperators0.getSum(416, 911);
        int int21 = sumWithoutArithmeticOperators0.getSum(1623, 1187);
        int int24 = sumWithoutArithmeticOperators0.getSum(1643, 3934);
        int int27 = sumWithoutArithmeticOperators0.getSum(11416, 13839);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 154 + "'", int15 == 154);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1327 + "'", int18 == 1327);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2810 + "'", int21 == 2810);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5577 + "'", int24 == 5577);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 25255 + "'", int27 == 25255);
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6057");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(110, 53);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 7);
        int int24 = sumWithoutArithmeticOperators0.getSum(1187, (int) (byte) -1);
        int int27 = sumWithoutArithmeticOperators0.getSum(1972, 724);
        int int30 = sumWithoutArithmeticOperators0.getSum(1327, (int) '#');
        int int33 = sumWithoutArithmeticOperators0.getSum(192, 1527);
        int int36 = sumWithoutArithmeticOperators0.getSum(6762, 254);
        int int39 = sumWithoutArithmeticOperators0.getSum(6513, 1112);
        int int42 = sumWithoutArithmeticOperators0.getSum(4057, 50614);
        int int45 = sumWithoutArithmeticOperators0.getSum(1829, 10191);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1186 + "'", int24 == 1186);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2696 + "'", int27 == 2696);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1362 + "'", int30 == 1362);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1719 + "'", int33 == 1719);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 7016 + "'", int36 == 7016);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 7625 + "'", int39 == 7625);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 54671 + "'", int42 == 54671);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 12020 + "'", int45 == 12020);
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6058");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum((-1), 290);
        int int21 = sumWithoutArithmeticOperators0.getSum(715, (int) (byte) 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(4079, 5624);
        int int27 = sumWithoutArithmeticOperators0.getSum(978, (int) (short) 0);
        int int30 = sumWithoutArithmeticOperators0.getSum(54, 240);
        int int33 = sumWithoutArithmeticOperators0.getSum(5755, 1252);
        int int36 = sumWithoutArithmeticOperators0.getSum(4771, 1428);
        int int39 = sumWithoutArithmeticOperators0.getSum(19415, 10234);
        int int42 = sumWithoutArithmeticOperators0.getSum(15137, 19479);
        int int45 = sumWithoutArithmeticOperators0.getSum(1705, 4156);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 289 + "'", int18 == 289);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 715 + "'", int21 == 715);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9703 + "'", int24 == 9703);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 978 + "'", int27 == 978);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 294 + "'", int30 == 294);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 7007 + "'", int33 == 7007);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 6199 + "'", int36 == 6199);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 29649 + "'", int39 == 29649);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 34616 + "'", int42 == 34616);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 5861 + "'", int45 == 5861);
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6059");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(257, 250);
        int int12 = sumWithoutArithmeticOperators0.getSum(221, 360);
        int int15 = sumWithoutArithmeticOperators0.getSum(885, (int) '#');
        int int18 = sumWithoutArithmeticOperators0.getSum(1236, 3597);
        int int21 = sumWithoutArithmeticOperators0.getSum(8528, 2100);
        int int24 = sumWithoutArithmeticOperators0.getSum(9195, 25146);
        int int27 = sumWithoutArithmeticOperators0.getSum(1204, 3283);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 507 + "'", int9 == 507);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 581 + "'", int12 == 581);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 920 + "'", int15 == 920);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4833 + "'", int18 == 4833);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10628 + "'", int21 == 10628);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 34341 + "'", int24 == 34341);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4487 + "'", int27 == 4487);
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6060");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(200, (int) (byte) 0);
        int int9 = sumWithoutArithmeticOperators0.getSum(281, 460);
        int int12 = sumWithoutArithmeticOperators0.getSum(6199, 5861);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 741 + "'", int9 == 741);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12060 + "'", int12 == 12060);
    }

    @Test
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6061");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(345, 269);
        int int9 = sumWithoutArithmeticOperators0.getSum(2456, 3564);
        int int12 = sumWithoutArithmeticOperators0.getSum(2589, 2882);
        int int15 = sumWithoutArithmeticOperators0.getSum(469, 294);
        int int18 = sumWithoutArithmeticOperators0.getSum(6492, 3864);
        int int21 = sumWithoutArithmeticOperators0.getSum(9097, 4383);
        int int24 = sumWithoutArithmeticOperators0.getSum(11829, 9575);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 614 + "'", int6 == 614);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6020 + "'", int9 == 6020);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5471 + "'", int12 == 5471);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 763 + "'", int15 == 763);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10356 + "'", int18 == 10356);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13480 + "'", int21 == 13480);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 21404 + "'", int24 == 21404);
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6062");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(955, 89);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 55);
        int int21 = sumWithoutArithmeticOperators0.getSum(3266, 1411);
        int int24 = sumWithoutArithmeticOperators0.getSum(3936, 2231);
        int int27 = sumWithoutArithmeticOperators0.getSum(16342, 184);
        int int30 = sumWithoutArithmeticOperators0.getSum(1962, 7074);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1044 + "'", int15 == 1044);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 56 + "'", int18 == 56);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4677 + "'", int21 == 4677);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6167 + "'", int24 == 6167);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16526 + "'", int27 == 16526);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9036 + "'", int30 == 9036);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6063");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(635, 151);
        int int18 = sumWithoutArithmeticOperators0.getSum(1336, 2117);
        int int21 = sumWithoutArithmeticOperators0.getSum(5978, 4113);
        int int24 = sumWithoutArithmeticOperators0.getSum(25536, 17997);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 786 + "'", int15 == 786);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3453 + "'", int18 == 3453);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10091 + "'", int21 == 10091);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 43533 + "'", int24 == 43533);
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6064");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 486);
        int int12 = sumWithoutArithmeticOperators0.getSum(725, 911);
        int int15 = sumWithoutArithmeticOperators0.getSum(348, 2626);
        int int18 = sumWithoutArithmeticOperators0.getSum(10320, 6157);
        int int21 = sumWithoutArithmeticOperators0.getSum(14803, 1291);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 486 + "'", int9 == 486);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1636 + "'", int12 == 1636);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2974 + "'", int15 == 2974);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16477 + "'", int18 == 16477);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16094 + "'", int21 == 16094);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6065");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 98);
        int int15 = sumWithoutArithmeticOperators0.getSum(631, 343);
        int int18 = sumWithoutArithmeticOperators0.getSum(1587, 6867);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 974 + "'", int15 == 974);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8454 + "'", int18 == 8454);
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6066");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(19, 21);
        int int9 = sumWithoutArithmeticOperators0.getSum(53, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(286, 125);
        int int15 = sumWithoutArithmeticOperators0.getSum(3050, 382);
        int int18 = sumWithoutArithmeticOperators0.getSum(3452, 1254);
        int int21 = sumWithoutArithmeticOperators0.getSum(23169, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 411 + "'", int12 == 411);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3432 + "'", int15 == 3432);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4706 + "'", int18 == 4706);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 23169 + "'", int21 == 23169);
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6067");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(51, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(238, (int) '4');
        int int18 = sumWithoutArithmeticOperators0.getSum(1044, 84);
        int int21 = sumWithoutArithmeticOperators0.getSum(859, 9);
        int int24 = sumWithoutArithmeticOperators0.getSum(7455, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 290 + "'", int15 == 290);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1128 + "'", int18 == 1128);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 868 + "'", int21 == 868);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7455 + "'", int24 == 7455);
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6068");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(162, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(623, 483);
        int int21 = sumWithoutArithmeticOperators0.getSum(4392, 1040);
        int int24 = sumWithoutArithmeticOperators0.getSum(3537, 214);
        int int27 = sumWithoutArithmeticOperators0.getSum(242, 7473);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1106 + "'", int18 == 1106);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5432 + "'", int21 == 5432);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3751 + "'", int24 == 3751);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7715 + "'", int27 == 7715);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6069");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(18, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) ' ', (int) (byte) 10);
        int int21 = sumWithoutArithmeticOperators0.getSum(711, 2520);
        int int24 = sumWithoutArithmeticOperators0.getSum(2036, 1988);
        int int27 = sumWithoutArithmeticOperators0.getSum(1733, 12403);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 42 + "'", int18 == 42);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3231 + "'", int21 == 3231);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4024 + "'", int24 == 4024);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 14136 + "'", int27 == 14136);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6070");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum((-1), 290);
        int int21 = sumWithoutArithmeticOperators0.getSum(715, (int) (byte) 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(4079, 5624);
        int int27 = sumWithoutArithmeticOperators0.getSum(978, (int) (short) 0);
        int int30 = sumWithoutArithmeticOperators0.getSum(54, 240);
        int int33 = sumWithoutArithmeticOperators0.getSum(5755, 1252);
        int int36 = sumWithoutArithmeticOperators0.getSum(4771, 1428);
        int int39 = sumWithoutArithmeticOperators0.getSum(4677, 4847);
        int int42 = sumWithoutArithmeticOperators0.getSum(17177, 9361);
        int int45 = sumWithoutArithmeticOperators0.getSum(17531, 6795);
        int int48 = sumWithoutArithmeticOperators0.getSum(2619, 1946);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 289 + "'", int18 == 289);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 715 + "'", int21 == 715);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9703 + "'", int24 == 9703);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 978 + "'", int27 == 978);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 294 + "'", int30 == 294);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 7007 + "'", int33 == 7007);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 6199 + "'", int36 == 6199);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9524 + "'", int39 == 9524);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 26538 + "'", int42 == 26538);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 24326 + "'", int45 == 24326);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 4565 + "'", int48 == 4565);
    }

    @Test
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6071");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(266, 295);
        int int15 = sumWithoutArithmeticOperators0.getSum(1067, (int) 'a');
        int int18 = sumWithoutArithmeticOperators0.getSum(1003, 1019);
        int int21 = sumWithoutArithmeticOperators0.getSum(3915, 10651);
        int int24 = sumWithoutArithmeticOperators0.getSum(32618, 17252);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 561 + "'", int12 == 561);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1164 + "'", int15 == 1164);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2022 + "'", int18 == 2022);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14566 + "'", int21 == 14566);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 49870 + "'", int24 == 49870);
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6072");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(18, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 108);
        int int21 = sumWithoutArithmeticOperators0.getSum(825, 1491);
        int int24 = sumWithoutArithmeticOperators0.getSum(7873, 4539);
        int int27 = sumWithoutArithmeticOperators0.getSum(5583, 1202);
        int int30 = sumWithoutArithmeticOperators0.getSum(16995, 8853);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 109 + "'", int18 == 109);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2316 + "'", int21 == 2316);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12412 + "'", int24 == 12412);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6785 + "'", int27 == 6785);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 25848 + "'", int30 == 25848);
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6073");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(465, 324);
        int int18 = sumWithoutArithmeticOperators0.getSum(209, 811);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 2539);
        int int24 = sumWithoutArithmeticOperators0.getSum(9016, 2537);
        int int27 = sumWithoutArithmeticOperators0.getSum(4768, 2539);
        int int30 = sumWithoutArithmeticOperators0.getSum(18273, 41929);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 789 + "'", int15 == 789);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1020 + "'", int18 == 1020);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2539 + "'", int21 == 2539);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11553 + "'", int24 == 11553);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7307 + "'", int27 == 7307);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 60202 + "'", int30 == 60202);
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6074");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(104, 266);
        int int15 = sumWithoutArithmeticOperators0.getSum(7193, 22292);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 370 + "'", int12 == 370);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29485 + "'", int15 == 29485);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6075");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(162, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(156, 491);
        int int21 = sumWithoutArithmeticOperators0.getSum(1291, 352);
        int int24 = sumWithoutArithmeticOperators0.getSum(2251, 1373);
        int int27 = sumWithoutArithmeticOperators0.getSum(0, 3536);
        int int30 = sumWithoutArithmeticOperators0.getSum(7776, 13287);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 647 + "'", int18 == 647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1643 + "'", int21 == 1643);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3624 + "'", int24 == 3624);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3536 + "'", int27 == 3536);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 21063 + "'", int30 == 21063);
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6076");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(110, 53);
        int int21 = sumWithoutArithmeticOperators0.getSum(162, 321);
        int int24 = sumWithoutArithmeticOperators0.getSum(407, 228);
        int int27 = sumWithoutArithmeticOperators0.getSum(301, 407);
        int int30 = sumWithoutArithmeticOperators0.getSum(213, 498);
        int int33 = sumWithoutArithmeticOperators0.getSum(8817, 11582);
        int int36 = sumWithoutArithmeticOperators0.getSum(11158, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 483 + "'", int21 == 483);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 635 + "'", int24 == 635);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 708 + "'", int27 == 708);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 711 + "'", int30 == 711);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 20399 + "'", int33 == 20399);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 11158 + "'", int36 == 11158);
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6077");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(526, 727);
        int int18 = sumWithoutArithmeticOperators0.getSum(1186, 2128);
        int int21 = sumWithoutArithmeticOperators0.getSum(886, 10383);
        int int24 = sumWithoutArithmeticOperators0.getSum(9203, 31723);
        int int27 = sumWithoutArithmeticOperators0.getSum(21181, 5115);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1253 + "'", int15 == 1253);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3314 + "'", int18 == 3314);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11269 + "'", int21 == 11269);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 40926 + "'", int24 == 40926);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 26296 + "'", int27 == 26296);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6078");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(20205, 1039);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 21244 + "'", int15 == 21244);
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6079");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(11, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(286, 9);
        int int24 = sumWithoutArithmeticOperators0.getSum(110, 266);
        int int27 = sumWithoutArithmeticOperators0.getSum(144, 0);
        int int30 = sumWithoutArithmeticOperators0.getSum(919, 840);
        int int33 = sumWithoutArithmeticOperators0.getSum(0, 6409);
        int int36 = sumWithoutArithmeticOperators0.getSum(11495, 15637);
        java.lang.Class<?> wildcardClass37 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 376 + "'", int24 == 376);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 144 + "'", int27 == 144);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1759 + "'", int30 == 1759);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6409 + "'", int33 == 6409);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 27132 + "'", int36 == 27132);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6080");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(110, 376);
        int int12 = sumWithoutArithmeticOperators0.getSum(1172, 3707);
        int int15 = sumWithoutArithmeticOperators0.getSum(1688, 3319);
        int int18 = sumWithoutArithmeticOperators0.getSum(217, 592);
        int int21 = sumWithoutArithmeticOperators0.getSum(4975, 101);
        int int24 = sumWithoutArithmeticOperators0.getSum(4150, 7480);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 486 + "'", int9 == 486);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4879 + "'", int12 == 4879);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5007 + "'", int15 == 5007);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 809 + "'", int18 == 809);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5076 + "'", int21 == 5076);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11630 + "'", int24 == 11630);
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6081");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(110, 53);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 7);
        int int24 = sumWithoutArithmeticOperators0.getSum(1187, (int) (byte) -1);
        int int27 = sumWithoutArithmeticOperators0.getSum(1972, 724);
        int int30 = sumWithoutArithmeticOperators0.getSum(1327, (int) '#');
        int int33 = sumWithoutArithmeticOperators0.getSum(192, 1527);
        int int36 = sumWithoutArithmeticOperators0.getSum(6762, 254);
        int int39 = sumWithoutArithmeticOperators0.getSum(27492, 7625);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1186 + "'", int24 == 1186);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2696 + "'", int27 == 2696);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1362 + "'", int30 == 1362);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1719 + "'", int33 == 1719);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 7016 + "'", int36 == 7016);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35117 + "'", int39 == 35117);
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6082");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(18, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, (int) (short) 100);
        int int21 = sumWithoutArithmeticOperators0.getSum(416, 44);
        int int24 = sumWithoutArithmeticOperators0.getSum(325, 165);
        int int27 = sumWithoutArithmeticOperators0.getSum(6326, 486);
        int int30 = sumWithoutArithmeticOperators0.getSum(109, 4434);
        int int33 = sumWithoutArithmeticOperators0.getSum(0, 13546);
        int int36 = sumWithoutArithmeticOperators0.getSum(22787, 9575);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 460 + "'", int21 == 460);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 490 + "'", int24 == 490);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6812 + "'", int27 == 6812);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4543 + "'", int30 == 4543);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 13546 + "'", int33 == 13546);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32362 + "'", int36 == 32362);
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6083");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum((-1), 290);
        int int21 = sumWithoutArithmeticOperators0.getSum(170, (int) (byte) 10);
        int int24 = sumWithoutArithmeticOperators0.getSum(8343, 672);
        int int27 = sumWithoutArithmeticOperators0.getSum(7197, 0);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 289 + "'", int18 == 289);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 180 + "'", int21 == 180);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9015 + "'", int24 == 9015);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7197 + "'", int27 == 7197);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6084");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(18, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, (int) (short) 100);
        int int21 = sumWithoutArithmeticOperators0.getSum(416, 44);
        int int24 = sumWithoutArithmeticOperators0.getSum(325, 165);
        int int27 = sumWithoutArithmeticOperators0.getSum(127, 2518);
        int int30 = sumWithoutArithmeticOperators0.getSum(1351, 1916);
        int int33 = sumWithoutArithmeticOperators0.getSum(12964, 629);
        int int36 = sumWithoutArithmeticOperators0.getSum(8026, 4742);
        int int39 = sumWithoutArithmeticOperators0.getSum(0, 37499);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 460 + "'", int21 == 460);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 490 + "'", int24 == 490);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2645 + "'", int27 == 2645);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3267 + "'", int30 == 3267);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 13593 + "'", int33 == 13593);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 12768 + "'", int36 == 12768);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 37499 + "'", int39 == 37499);
    }

    @Test
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6085");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(11, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(286, 9);
        int int24 = sumWithoutArithmeticOperators0.getSum(110, 266);
        int int27 = sumWithoutArithmeticOperators0.getSum(445, 18);
        int int30 = sumWithoutArithmeticOperators0.getSum(833, 1934);
        int int33 = sumWithoutArithmeticOperators0.getSum(5450, 4470);
        int int36 = sumWithoutArithmeticOperators0.getSum(1094, 3617);
        int int39 = sumWithoutArithmeticOperators0.getSum(570, 1761);
        int int42 = sumWithoutArithmeticOperators0.getSum(1920, 11086);
        int int45 = sumWithoutArithmeticOperators0.getSum(16834, 7658);
        int int48 = sumWithoutArithmeticOperators0.getSum(8552, 2777);
        java.lang.Class<?> wildcardClass49 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 376 + "'", int24 == 376);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 463 + "'", int27 == 463);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2767 + "'", int30 == 2767);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9920 + "'", int33 == 9920);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4711 + "'", int36 == 4711);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2331 + "'", int39 == 2331);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 13006 + "'", int42 == 13006);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 24492 + "'", int45 == 24492);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 11329 + "'", int48 == 11329);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6086");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(7997, 89);
        int int15 = sumWithoutArithmeticOperators0.getSum(1849, 9722);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8086 + "'", int12 == 8086);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11571 + "'", int15 == 11571);
    }

    @Test
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6087");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 101);
        int int18 = sumWithoutArithmeticOperators0.getSum(128, 1119);
        int int21 = sumWithoutArithmeticOperators0.getSum(216, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum((-1), 20344);
        int int27 = sumWithoutArithmeticOperators0.getSum(4613, 7740);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 154 + "'", int15 == 154);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1247 + "'", int18 == 1247);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 216 + "'", int21 == 216);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20343 + "'", int24 == 20343);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 12353 + "'", int27 == 12353);
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6088");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(18, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 108);
        int int21 = sumWithoutArithmeticOperators0.getSum(17, 266);
        int int24 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 376);
        int int27 = sumWithoutArithmeticOperators0.getSum(919, 1003);
        int int30 = sumWithoutArithmeticOperators0.getSum(5651, 0);
        int int33 = sumWithoutArithmeticOperators0.getSum(15562, 11809);
        int int36 = sumWithoutArithmeticOperators0.getSum(1820, 24620);
        int int39 = sumWithoutArithmeticOperators0.getSum(13843, 12947);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 109 + "'", int18 == 109);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 283 + "'", int21 == 283);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 377 + "'", int24 == 377);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1922 + "'", int27 == 1922);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5651 + "'", int30 == 5651);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 27371 + "'", int33 == 27371);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 26440 + "'", int36 == 26440);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 26790 + "'", int39 == 26790);
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6089");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(100, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 345);
        int int21 = sumWithoutArithmeticOperators0.getSum(1680, 840);
        int int24 = sumWithoutArithmeticOperators0.getSum(3192, 1068);
        int int27 = sumWithoutArithmeticOperators0.getSum(0, 738);
        int int30 = sumWithoutArithmeticOperators0.getSum(11795, 6167);
        int int33 = sumWithoutArithmeticOperators0.getSum(4048, 1170);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 345 + "'", int18 == 345);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2520 + "'", int21 == 2520);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4260 + "'", int24 == 4260);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 738 + "'", int27 == 738);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 17962 + "'", int30 == 17962);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5218 + "'", int33 == 5218);
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6090");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum(1245, 708);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 3409);
        int int18 = sumWithoutArithmeticOperators0.getSum(1259, 5439);
        int int21 = sumWithoutArithmeticOperators0.getSum(38745, 9454);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1953 + "'", int12 == 1953);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3409 + "'", int15 == 3409);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6698 + "'", int18 == 6698);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 48199 + "'", int21 == 48199);
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6091");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 199);
        int int12 = sumWithoutArithmeticOperators0.getSum(156, 460);
        int int15 = sumWithoutArithmeticOperators0.getSum(1449, 983);
        int int18 = sumWithoutArithmeticOperators0.getSum(12935, 26859);
        int int21 = sumWithoutArithmeticOperators0.getSum(2463, 6836);
        int int24 = sumWithoutArithmeticOperators0.getSum(11958, 3130);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 199 + "'", int9 == 199);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 616 + "'", int12 == 616);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2432 + "'", int15 == 2432);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 39794 + "'", int18 == 39794);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9299 + "'", int21 == 9299);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15088 + "'", int24 == 15088);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6092");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(211, 245);
        int int15 = sumWithoutArithmeticOperators0.getSum(697, 290);
        int int18 = sumWithoutArithmeticOperators0.getSum(1759, 1909);
        int int21 = sumWithoutArithmeticOperators0.getSum(46000, 14386);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 456 + "'", int12 == 456);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 987 + "'", int15 == 987);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3668 + "'", int18 == 3668);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60386 + "'", int21 == 60386);
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6093");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(11, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(286, 9);
        int int24 = sumWithoutArithmeticOperators0.getSum((int) ' ', 44);
        int int27 = sumWithoutArithmeticOperators0.getSum(162, 51);
        int int30 = sumWithoutArithmeticOperators0.getSum(0, 123);
        int int33 = sumWithoutArithmeticOperators0.getSum(975, 1842);
        int int36 = sumWithoutArithmeticOperators0.getSum(7466, 1719);
        int int39 = sumWithoutArithmeticOperators0.getSum(8331, 8588);
        java.lang.Class<?> wildcardClass40 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 76 + "'", int24 == 76);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 213 + "'", int27 == 213);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 123 + "'", int30 == 123);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2817 + "'", int33 == 2817);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 9185 + "'", int36 == 9185);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 16919 + "'", int39 == 16919);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6094");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(125, 245);
        int int9 = sumWithoutArithmeticOperators0.getSum(4433, 2339);
        int int12 = sumWithoutArithmeticOperators0.getSum(9835, 14282);
        int int15 = sumWithoutArithmeticOperators0.getSum(248, 22858);
        int int18 = sumWithoutArithmeticOperators0.getSum(16565, 11339);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 370 + "'", int6 == 370);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6772 + "'", int9 == 6772);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 24117 + "'", int12 == 24117);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 23106 + "'", int15 == 23106);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 27904 + "'", int18 == 27904);
    }

    @Test
    public void test6095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6095");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum((-1), 290);
        int int21 = sumWithoutArithmeticOperators0.getSum(715, (int) (byte) 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(4079, 5624);
        int int27 = sumWithoutArithmeticOperators0.getSum(978, (int) (short) 0);
        int int30 = sumWithoutArithmeticOperators0.getSum(8838, 20708);
        int int33 = sumWithoutArithmeticOperators0.getSum(2986, 6044);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 289 + "'", int18 == 289);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 715 + "'", int21 == 715);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9703 + "'", int24 == 9703);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 978 + "'", int27 == 978);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 29546 + "'", int30 == 29546);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9030 + "'", int33 == 9030);
    }

    @Test
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6096");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(11, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(286, 9);
        int int24 = sumWithoutArithmeticOperators0.getSum(110, 266);
        int int27 = sumWithoutArithmeticOperators0.getSum(144, 0);
        int int30 = sumWithoutArithmeticOperators0.getSum(919, 840);
        int int33 = sumWithoutArithmeticOperators0.getSum(0, 6409);
        int int36 = sumWithoutArithmeticOperators0.getSum(290, 16228);
        int int39 = sumWithoutArithmeticOperators0.getSum(4719, 12379);
        int int42 = sumWithoutArithmeticOperators0.getSum(10970, 12081);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 376 + "'", int24 == 376);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 144 + "'", int27 == 144);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1759 + "'", int30 == 1759);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6409 + "'", int33 == 6409);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 16518 + "'", int36 == 16518);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 17098 + "'", int39 == 17098);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 23051 + "'", int42 == 23051);
    }

    @Test
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6097");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(911, 432);
        int int12 = sumWithoutArithmeticOperators0.getSum(955, 382);
        int int15 = sumWithoutArithmeticOperators0.getSum(1723, 7852);
        int int18 = sumWithoutArithmeticOperators0.getSum(3025, 5154);
        int int21 = sumWithoutArithmeticOperators0.getSum(2279, 4858);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1343 + "'", int9 == 1343);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1337 + "'", int12 == 1337);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9575 + "'", int15 == 9575);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8179 + "'", int18 == 8179);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7137 + "'", int21 == 7137);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6098");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 98);
        int int9 = sumWithoutArithmeticOperators0.getSum(3744, 507);
        int int12 = sumWithoutArithmeticOperators0.getSum(1280, 1180);
        int int15 = sumWithoutArithmeticOperators0.getSum(2653, 380);
        int int18 = sumWithoutArithmeticOperators0.getSum(2456, 9650);
        int int21 = sumWithoutArithmeticOperators0.getSum(22836, 2231);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 108 + "'", int6 == 108);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4251 + "'", int9 == 4251);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2460 + "'", int12 == 2460);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3033 + "'", int15 == 3033);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 12106 + "'", int18 == 12106);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 25067 + "'", int21 == 25067);
    }

    @Test
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6099");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(100, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(2165, 1724);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 445);
        int int24 = sumWithoutArithmeticOperators0.getSum(6409, 8552);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3889 + "'", int18 == 3889);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 445 + "'", int21 == 445);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14961 + "'", int24 == 14961);
    }

    @Test
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6100");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(195, 317);
        int int18 = sumWithoutArithmeticOperators0.getSum(76, 499);
        int int21 = sumWithoutArithmeticOperators0.getSum(844, 555);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 9086);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 575 + "'", int18 == 575);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1399 + "'", int21 == 1399);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9086 + "'", int24 == 9086);
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6101");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(955, 89);
        int int18 = sumWithoutArithmeticOperators0.getSum(278, 725);
        int int21 = sumWithoutArithmeticOperators0.getSum(4619, 2207);
        int int24 = sumWithoutArithmeticOperators0.getSum(9748, 2882);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1044 + "'", int15 == 1044);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1003 + "'", int18 == 1003);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6826 + "'", int21 == 6826);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12630 + "'", int24 == 12630);
    }

    @Test
    public void test6102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6102");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(10, 352);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 21723);
        int int18 = sumWithoutArithmeticOperators0.getSum(8371, 1114);
        int int21 = sumWithoutArithmeticOperators0.getSum(6989, 5464);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 362 + "'", int12 == 362);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 21723 + "'", int15 == 21723);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9485 + "'", int18 == 9485);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12453 + "'", int21 == 12453);
    }

    @Test
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6103");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(9, 217);
        int int18 = sumWithoutArithmeticOperators0.getSum(934, 766);
        int int21 = sumWithoutArithmeticOperators0.getSum(216, 215);
        int int24 = sumWithoutArithmeticOperators0.getSum(1072, 705);
        int int27 = sumWithoutArithmeticOperators0.getSum(52, 9962);
        int int30 = sumWithoutArithmeticOperators0.getSum(1589, 735);
        int int33 = sumWithoutArithmeticOperators0.getSum(14232, 2254);
        int int36 = sumWithoutArithmeticOperators0.getSum(7292, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 226 + "'", int15 == 226);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1700 + "'", int18 == 1700);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 431 + "'", int21 == 431);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1777 + "'", int24 == 1777);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10014 + "'", int27 == 10014);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2324 + "'", int30 == 2324);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 16486 + "'", int33 == 16486);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 7292 + "'", int36 == 7292);
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6104");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(260, 195);
        int int15 = sumWithoutArithmeticOperators0.getSum(316, 1491);
        int int18 = sumWithoutArithmeticOperators0.getSum(393, 17);
        int int21 = sumWithoutArithmeticOperators0.getSum(32114, 9569);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 455 + "'", int12 == 455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1807 + "'", int15 == 1807);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 410 + "'", int18 == 410);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 41683 + "'", int21 == 41683);
    }

    @Test
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6105");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(209, 154);
        int int18 = sumWithoutArithmeticOperators0.getSum(19, 283);
        int int21 = sumWithoutArithmeticOperators0.getSum(596, 1527);
        int int24 = sumWithoutArithmeticOperators0.getSum(10510, 8235);
        int int27 = sumWithoutArithmeticOperators0.getSum(29415, 18084);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 363 + "'", int15 == 363);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 302 + "'", int18 == 302);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2123 + "'", int21 == 2123);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 18745 + "'", int24 == 18745);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 47499 + "'", int27 == 47499);
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6106");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(101, 21);
        int int18 = sumWithoutArithmeticOperators0.getSum(89, 180);
        int int21 = sumWithoutArithmeticOperators0.getSum(7846, 1013);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 269 + "'", int18 == 269);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8859 + "'", int21 == 8859);
    }

    @Test
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6107");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(110, 376);
        int int12 = sumWithoutArithmeticOperators0.getSum(1172, 3707);
        int int15 = sumWithoutArithmeticOperators0.getSum(1291, 5369);
        int int18 = sumWithoutArithmeticOperators0.getSum(11, 2060);
        int int21 = sumWithoutArithmeticOperators0.getSum(391, 12403);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 16318);
        int int27 = sumWithoutArithmeticOperators0.getSum(2597, 20205);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 486 + "'", int9 == 486);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4879 + "'", int12 == 4879);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6660 + "'", int15 == 6660);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2071 + "'", int18 == 2071);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12794 + "'", int21 == 12794);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16318 + "'", int24 == 16318);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 22802 + "'", int27 == 22802);
    }

    @Test
    public void test6108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6108");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 19);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(1121, 708);
        int int12 = sumWithoutArithmeticOperators0.getSum(1688, 1337);
        int int15 = sumWithoutArithmeticOperators0.getSum(2251, 879);
        int int18 = sumWithoutArithmeticOperators0.getSum(847, 1281);
        int int21 = sumWithoutArithmeticOperators0.getSum(6681, 147);
        int int24 = sumWithoutArithmeticOperators0.getSum(9810, 1482);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1829 + "'", int9 == 1829);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3025 + "'", int12 == 3025);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3130 + "'", int15 == 3130);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2128 + "'", int18 == 2128);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6828 + "'", int21 == 6828);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11292 + "'", int24 == 11292);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6109");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(343, 1574);
        int int9 = sumWithoutArithmeticOperators0.getSum(10187, 5325);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1917 + "'", int6 == 1917);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15512 + "'", int9 == 15512);
    }

    @Test
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6110");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(195, 317);
        int int18 = sumWithoutArithmeticOperators0.getSum(76, 499);
        int int21 = sumWithoutArithmeticOperators0.getSum(844, 555);
        int int24 = sumWithoutArithmeticOperators0.getSum(1473, 275);
        int int27 = sumWithoutArithmeticOperators0.getSum(248, 1762);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 575 + "'", int18 == 575);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1399 + "'", int21 == 1399);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1748 + "'", int24 == 1748);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2010 + "'", int27 == 2010);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6111");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(955, 89);
        int int18 = sumWithoutArithmeticOperators0.getSum(278, 725);
        int int21 = sumWithoutArithmeticOperators0.getSum(212, 708);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 6402);
        int int27 = sumWithoutArithmeticOperators0.getSum(14971, 10231);
        int int30 = sumWithoutArithmeticOperators0.getSum(3309, 24319);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1044 + "'", int15 == 1044);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1003 + "'", int18 == 1003);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 920 + "'", int21 == 920);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6402 + "'", int24 == 6402);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 25202 + "'", int27 == 25202);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 27628 + "'", int30 == 27628);
    }

    @Test
    public void test6112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6112");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum((-1), 290);
        int int21 = sumWithoutArithmeticOperators0.getSum(3564, 5352);
        int int24 = sumWithoutArithmeticOperators0.getSum(2837, 6663);
        int int27 = sumWithoutArithmeticOperators0.getSum(1796, 14442);
        int int30 = sumWithoutArithmeticOperators0.getSum(11892, 2642);
        int int33 = sumWithoutArithmeticOperators0.getSum(7382, 1967);
        int int36 = sumWithoutArithmeticOperators0.getSum(10525, 33115);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 289 + "'", int18 == 289);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8916 + "'", int21 == 8916);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9500 + "'", int24 == 9500);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16238 + "'", int27 == 16238);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 14534 + "'", int30 == 14534);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9349 + "'", int33 == 9349);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 43640 + "'", int36 == 43640);
    }

    @Test
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6113");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(19, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(51, 109);
        int int21 = sumWithoutArithmeticOperators0.getSum(256, 727);
        int int24 = sumWithoutArithmeticOperators0.getSum(14534, 5681);
        int int27 = sumWithoutArithmeticOperators0.getSum(28360, 1606);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 129 + "'", int15 == 129);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 160 + "'", int18 == 160);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 983 + "'", int21 == 983);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20215 + "'", int24 == 20215);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 29966 + "'", int27 == 29966);
    }

    @Test
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6114");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 101);
        int int18 = sumWithoutArithmeticOperators0.getSum(209, 107);
        int int21 = sumWithoutArithmeticOperators0.getSum(1112, 2645);
        int int24 = sumWithoutArithmeticOperators0.getSum(360, 2986);
        int int27 = sumWithoutArithmeticOperators0.getSum(0, 472);
        int int30 = sumWithoutArithmeticOperators0.getSum(1312, 11107);
        int int33 = sumWithoutArithmeticOperators0.getSum(1661, 6815);
        int int36 = sumWithoutArithmeticOperators0.getSum(1888, 3632);
        int int39 = sumWithoutArithmeticOperators0.getSum(2435, 17464);
        java.lang.Class<?> wildcardClass40 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 154 + "'", int15 == 154);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 316 + "'", int18 == 316);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3757 + "'", int21 == 3757);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3346 + "'", int24 == 3346);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 472 + "'", int27 == 472);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 12419 + "'", int30 == 12419);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8476 + "'", int33 == 8476);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5520 + "'", int36 == 5520);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 19899 + "'", int39 == 19899);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6115");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(217, 238);
        int int21 = sumWithoutArithmeticOperators0.getSum(238, 295);
        int int24 = sumWithoutArithmeticOperators0.getSum(5084, 5864);
        int int27 = sumWithoutArithmeticOperators0.getSum(11485, 29596);
        int int30 = sumWithoutArithmeticOperators0.getSum(0, 217);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 455 + "'", int18 == 455);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 533 + "'", int21 == 533);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10948 + "'", int24 == 10948);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 41081 + "'", int27 == 41081);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 217 + "'", int30 == 217);
    }

    @Test
    public void test6116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6116");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(52, 89);
        int int9 = sumWithoutArithmeticOperators0.getSum(249, 343);
        int int12 = sumWithoutArithmeticOperators0.getSum(817, 789);
        int int15 = sumWithoutArithmeticOperators0.getSum(69790, 1169);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 141 + "'", int6 == 141);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 592 + "'", int9 == 592);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1606 + "'", int12 == 1606);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 70959 + "'", int15 == 70959);
    }

    @Test
    public void test6117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6117");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum((-1), 290);
        int int21 = sumWithoutArithmeticOperators0.getSum(715, (int) (byte) 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(4079, 5624);
        int int27 = sumWithoutArithmeticOperators0.getSum(978, (int) (short) 0);
        int int30 = sumWithoutArithmeticOperators0.getSum(54, 240);
        int int33 = sumWithoutArithmeticOperators0.getSum(51, 1281);
        int int36 = sumWithoutArithmeticOperators0.getSum(5460, 0);
        int int39 = sumWithoutArithmeticOperators0.getSum(61798, 8603);
        int int42 = sumWithoutArithmeticOperators0.getSum(2669, 13071);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 289 + "'", int18 == 289);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 715 + "'", int21 == 715);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9703 + "'", int24 == 9703);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 978 + "'", int27 == 978);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 294 + "'", int30 == 294);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1332 + "'", int33 == 1332);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5460 + "'", int36 == 5460);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 70401 + "'", int39 == 70401);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 15740 + "'", int42 == 15740);
    }

    @Test
    public void test6118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6118");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(18973, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18973 + "'", int6 == 18973);
    }

    @Test
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6119");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 165);
        int int12 = sumWithoutArithmeticOperators0.getSum(152, 108);
        int int15 = sumWithoutArithmeticOperators0.getSum(117, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(1428, 4263);
        int int21 = sumWithoutArithmeticOperators0.getSum(8829, 1432);
        int int24 = sumWithoutArithmeticOperators0.getSum(715, 314);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 294 + "'", int9 == 294);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 260 + "'", int12 == 260);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 117 + "'", int15 == 117);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5691 + "'", int18 == 5691);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10261 + "'", int21 == 10261);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1029 + "'", int24 == 1029);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6120");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(4671, 498);
        int int12 = sumWithoutArithmeticOperators0.getSum(379, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(6074, 1710);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 4079);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5169 + "'", int9 == 5169);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 379 + "'", int12 == 379);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7784 + "'", int15 == 7784);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4079 + "'", int18 == 4079);
    }

    @Test
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6121");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(110, 53);
        int int21 = sumWithoutArithmeticOperators0.getSum(567, 132);
        int int24 = sumWithoutArithmeticOperators0.getSum(498, 576);
        int int27 = sumWithoutArithmeticOperators0.getSum(186, 0);
        int int30 = sumWithoutArithmeticOperators0.getSum(12723, 524);
        int int33 = sumWithoutArithmeticOperators0.getSum(227, 711);
        int int36 = sumWithoutArithmeticOperators0.getSum(7721, 10451);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 699 + "'", int21 == 699);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1074 + "'", int24 == 1074);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 186 + "'", int27 == 186);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 13247 + "'", int30 == 13247);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 938 + "'", int33 == 938);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 18172 + "'", int36 == 18172);
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6122");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(911, 432);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 34);
        int int15 = sumWithoutArithmeticOperators0.getSum(1241, 1352);
        int int18 = sumWithoutArithmeticOperators0.getSum(3451, 211);
        int int21 = sumWithoutArithmeticOperators0.getSum(16342, 11646);
        int int24 = sumWithoutArithmeticOperators0.getSum(10556, 1511);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1343 + "'", int9 == 1343);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2593 + "'", int15 == 2593);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3662 + "'", int18 == 3662);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27988 + "'", int21 == 27988);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12067 + "'", int24 == 12067);
    }

    @Test
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6123");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(125, 245);
        int int9 = sumWithoutArithmeticOperators0.getSum(4433, 2339);
        int int12 = sumWithoutArithmeticOperators0.getSum(9835, 14282);
        int int15 = sumWithoutArithmeticOperators0.getSum(248, 22858);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 370 + "'", int6 == 370);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6772 + "'", int9 == 6772);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 24117 + "'", int12 == 24117);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 23106 + "'", int15 == 23106);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6124");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(100, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(722, 789);
        int int21 = sumWithoutArithmeticOperators0.getSum(2219, 293);
        int int24 = sumWithoutArithmeticOperators0.getSum(4775, 3463);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1511 + "'", int18 == 1511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2512 + "'", int21 == 2512);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8238 + "'", int24 == 8238);
    }

    @Test
    public void test6125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6125");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(211, 245);
        int int15 = sumWithoutArithmeticOperators0.getSum(3880, 377);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 456 + "'", int12 == 456);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4257 + "'", int15 == 4257);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6126");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(1514, 1724);
        int int9 = sumWithoutArithmeticOperators0.getSum(4311, 12537);
        java.lang.Class<?> wildcardClass10 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3238 + "'", int6 == 3238);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16848 + "'", int9 == 16848);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6127");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(574, 1268);
        int int21 = sumWithoutArithmeticOperators0.getSum(11121, 2750);
        int int24 = sumWithoutArithmeticOperators0.getSum(2965, 3452);
        int int27 = sumWithoutArithmeticOperators0.getSum(0, 16438);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 161 + "'", int15 == 161);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1842 + "'", int18 == 1842);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13871 + "'", int21 == 13871);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6417 + "'", int24 == 6417);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16438 + "'", int27 == 16438);
    }

    @Test
    public void test6128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6128");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(210, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(317, 110);
        int int24 = sumWithoutArithmeticOperators0.getSum(1698, 116);
        int int27 = sumWithoutArithmeticOperators0.getSum(4037, 4263);
        int int30 = sumWithoutArithmeticOperators0.getSum(10940, 37078);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 246 + "'", int18 == 246);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 427 + "'", int21 == 427);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1814 + "'", int24 == 1814);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8300 + "'", int27 == 8300);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 48018 + "'", int30 == 48018);
    }

    @Test
    public void test6129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6129");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(11, (int) (short) 0);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int21 = sumWithoutArithmeticOperators0.getSum(727, 460);
        int int24 = sumWithoutArithmeticOperators0.getSum(746, 705);
        int int27 = sumWithoutArithmeticOperators0.getSum(1631, 5892);
        int int30 = sumWithoutArithmeticOperators0.getSum(28787, 9997);
        int int33 = sumWithoutArithmeticOperators0.getSum(49652, 26088);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1187 + "'", int21 == 1187);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1451 + "'", int24 == 1451);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7523 + "'", int27 == 7523);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 38784 + "'", int30 == 38784);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 75740 + "'", int33 == 75740);
    }

    @Test
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6130");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) -1);
        int int21 = sumWithoutArithmeticOperators0.getSum(7, (int) (short) 100);
        int int24 = sumWithoutArithmeticOperators0.getSum(2039, 2628);
        int int27 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int30 = sumWithoutArithmeticOperators0.getSum(189, 12655);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 107 + "'", int21 == 107);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4667 + "'", int24 == 4667);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 12844 + "'", int30 == 12844);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6131");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 101);
        int int18 = sumWithoutArithmeticOperators0.getSum(209, 107);
        int int21 = sumWithoutArithmeticOperators0.getSum(1245, 727);
        int int24 = sumWithoutArithmeticOperators0.getSum(6914, 23794);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 154 + "'", int15 == 154);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 316 + "'", int18 == 316);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1972 + "'", int21 == 1972);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 30708 + "'", int24 == 30708);
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6132");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(321, 56);
        int int9 = sumWithoutArithmeticOperators0.getSum(117, 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(1788, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(132, 936);
        int int18 = sumWithoutArithmeticOperators0.getSum(1197, 14303);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 377 + "'", int6 == 377);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 217 + "'", int9 == 217);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1788 + "'", int12 == 1788);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1068 + "'", int15 == 1068);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15500 + "'", int18 == 15500);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6133");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(34, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum(5312, 51);
        int int12 = sumWithoutArithmeticOperators0.getSum(5056, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5363 + "'", int9 == 5363);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5056 + "'", int12 == 5056);
    }

    @Test
    public void test6134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6134");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(11, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(286, 9);
        int int24 = sumWithoutArithmeticOperators0.getSum(2290, 1281);
        int int27 = sumWithoutArithmeticOperators0.getSum(2460, 431);
        int int30 = sumWithoutArithmeticOperators0.getSum(9797, 242);
        int int33 = sumWithoutArithmeticOperators0.getSum(14797, 10945);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3571 + "'", int24 == 3571);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2891 + "'", int27 == 2891);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10039 + "'", int30 == 10039);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 25742 + "'", int33 == 25742);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test6135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6135");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(321, 56);
        int int9 = sumWithoutArithmeticOperators0.getSum(189, 766);
        int int12 = sumWithoutArithmeticOperators0.getSum(290, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(407, 847);
        int int18 = sumWithoutArithmeticOperators0.getSum(8809, 3855);
        int int21 = sumWithoutArithmeticOperators0.getSum(14011, 6083);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 377 + "'", int6 == 377);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 955 + "'", int9 == 955);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 311 + "'", int12 == 311);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1254 + "'", int15 == 1254);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 12664 + "'", int18 == 12664);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20094 + "'", int21 == 20094);
    }

    @Test
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6136");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(211, 245);
        int int15 = sumWithoutArithmeticOperators0.getSum(3880, 377);
        int int18 = sumWithoutArithmeticOperators0.getSum(896, 10046);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 456 + "'", int12 == 456);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4257 + "'", int15 == 4257);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10942 + "'", int18 == 10942);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6137");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(9, 217);
        int int18 = sumWithoutArithmeticOperators0.getSum(132, 499);
        int int21 = sumWithoutArithmeticOperators0.getSum(4879, 2316);
        int int24 = sumWithoutArithmeticOperators0.getSum(628, 569);
        int int27 = sumWithoutArithmeticOperators0.getSum(3555, 8855);
        int int30 = sumWithoutArithmeticOperators0.getSum(15575, 4859);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 226 + "'", int15 == 226);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 631 + "'", int18 == 631);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7195 + "'", int21 == 7195);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1197 + "'", int24 == 1197);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 12410 + "'", int27 == 12410);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 20434 + "'", int30 == 20434);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test6138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6138");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(196, (int) ' ');
        int int15 = sumWithoutArithmeticOperators0.getSum(266, 853);
        int int18 = sumWithoutArithmeticOperators0.getSum(46, 101);
        int int21 = sumWithoutArithmeticOperators0.getSum(52, 696);
        int int24 = sumWithoutArithmeticOperators0.getSum(3445, 1764);
        int int27 = sumWithoutArithmeticOperators0.getSum(11492, 1953);
        int int30 = sumWithoutArithmeticOperators0.getSum(5293, 2617);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 228 + "'", int12 == 228);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1119 + "'", int15 == 1119);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 147 + "'", int18 == 147);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 748 + "'", int21 == 748);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5209 + "'", int24 == 5209);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 13445 + "'", int27 == 13445);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7910 + "'", int30 == 7910);
    }

    @Test
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6139");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(11168, 1601);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 12769 + "'", int6 == 12769);
    }

    @Test
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6140");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(255, 4075);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 2407);
        int int21 = sumWithoutArithmeticOperators0.getSum(14735, 0);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4330 + "'", int15 == 4330);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2407 + "'", int18 == 2407);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14735 + "'", int21 == 14735);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6141");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(19, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(51, 109);
        int int21 = sumWithoutArithmeticOperators0.getSum(11, 40);
        int int24 = sumWithoutArithmeticOperators0.getSum(587, 195);
        int int27 = sumWithoutArithmeticOperators0.getSum(1733, 2416);
        int int30 = sumWithoutArithmeticOperators0.getSum(1661, 1253);
        int int33 = sumWithoutArithmeticOperators0.getSum(1568, 949);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 129 + "'", int15 == 129);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 160 + "'", int18 == 160);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 51 + "'", int21 == 51);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 782 + "'", int24 == 782);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4149 + "'", int27 == 4149);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2914 + "'", int30 == 2914);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2517 + "'", int33 == 2517);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6142");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(289, 269);
        int int15 = sumWithoutArithmeticOperators0.getSum(504, 3550);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 18185);
        int int21 = sumWithoutArithmeticOperators0.getSum(20125, 28787);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 558 + "'", int12 == 558);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4054 + "'", int15 == 4054);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18185 + "'", int18 == 18185);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 48912 + "'", int21 == 48912);
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6143");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(110, 53);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 7);
        int int24 = sumWithoutArithmeticOperators0.getSum(269, 455);
        int int27 = sumWithoutArithmeticOperators0.getSum(245, 186);
        int int30 = sumWithoutArithmeticOperators0.getSum(473, 97);
        int int33 = sumWithoutArithmeticOperators0.getSum(5952, 11339);
        int int36 = sumWithoutArithmeticOperators0.getSum(363, 15511);
        int int39 = sumWithoutArithmeticOperators0.getSum(3473, 2751);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 724 + "'", int24 == 724);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 431 + "'", int27 == 431);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 570 + "'", int30 == 570);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 17291 + "'", int33 == 17291);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 15874 + "'", int36 == 15874);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 6224 + "'", int39 == 6224);
    }

    @Test
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6144");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(526, 727);
        int int18 = sumWithoutArithmeticOperators0.getSum(592, 734);
        int int21 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, 15948);
        int int24 = sumWithoutArithmeticOperators0.getSum(3192, 50785);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1253 + "'", int15 == 1253);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1326 + "'", int18 == 1326);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15948 + "'", int21 == 15948);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 53977 + "'", int24 == 53977);
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6145");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(289, 269);
        int int15 = sumWithoutArithmeticOperators0.getSum(1254, 974);
        int int18 = sumWithoutArithmeticOperators0.getSum(238, 28736);
        int int21 = sumWithoutArithmeticOperators0.getSum(763, 19707);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 558 + "'", int12 == 558);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2228 + "'", int15 == 2228);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 28974 + "'", int18 == 28974);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20470 + "'", int21 == 20470);
    }

    @Test
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6146");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 36);
        int int18 = sumWithoutArithmeticOperators0.getSum(647, 325);
        int int21 = sumWithoutArithmeticOperators0.getSum(1072, 1761);
        int int24 = sumWithoutArithmeticOperators0.getSum(504, 1056);
        int int27 = sumWithoutArithmeticOperators0.getSum(498, 1519);
        int int30 = sumWithoutArithmeticOperators0.getSum(0, 2563);
        int int33 = sumWithoutArithmeticOperators0.getSum(0, 2120);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 972 + "'", int18 == 972);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2833 + "'", int21 == 2833);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1560 + "'", int24 == 1560);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2017 + "'", int27 == 2017);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2563 + "'", int30 == 2563);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2120 + "'", int33 == 2120);
    }

    @Test
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6147");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(11, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(286, 9);
        int int24 = sumWithoutArithmeticOperators0.getSum(110, 266);
        int int27 = sumWithoutArithmeticOperators0.getSum(1, 40);
        int int30 = sumWithoutArithmeticOperators0.getSum(1252, 3595);
        int int33 = sumWithoutArithmeticOperators0.getSum(886, 1376);
        int int36 = sumWithoutArithmeticOperators0.getSum(4114, 1001);
        int int39 = sumWithoutArithmeticOperators0.getSum(822, 2855);
        int int42 = sumWithoutArithmeticOperators0.getSum(18889, 1606);
        int int45 = sumWithoutArithmeticOperators0.getSum(22168, 1001);
        java.lang.Class<?> wildcardClass46 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 376 + "'", int24 == 376);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 41 + "'", int27 == 41);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4847 + "'", int30 == 4847);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2262 + "'", int33 == 2262);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5115 + "'", int36 == 5115);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3677 + "'", int39 == 3677);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 20495 + "'", int42 == 20495);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 23169 + "'", int45 == 23169);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6148");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(651, 938);
        int int18 = sumWithoutArithmeticOperators0.getSum(265, 671);
        int int21 = sumWithoutArithmeticOperators0.getSum(3406, 1748);
        int int24 = sumWithoutArithmeticOperators0.getSum(45106, 3102);
        int int27 = sumWithoutArithmeticOperators0.getSum(16377, 8994);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1589 + "'", int15 == 1589);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 936 + "'", int18 == 936);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5154 + "'", int21 == 5154);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 48208 + "'", int24 == 48208);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 25371 + "'", int27 == 25371);
    }

    @Test
    public void test6149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6149");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(266, 295);
        int int15 = sumWithoutArithmeticOperators0.getSum(1067, (int) 'a');
        int int18 = sumWithoutArithmeticOperators0.getSum(3188, 1762);
        int int21 = sumWithoutArithmeticOperators0.getSum(1869, 3770);
        int int24 = sumWithoutArithmeticOperators0.getSum(1364, 19707);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 561 + "'", int12 == 561);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1164 + "'", int15 == 1164);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4950 + "'", int18 == 4950);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5639 + "'", int21 == 5639);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 21071 + "'", int24 == 21071);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6150");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(11, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(286, 9);
        int int24 = sumWithoutArithmeticOperators0.getSum(110, 266);
        int int27 = sumWithoutArithmeticOperators0.getSum(445, 18);
        int int30 = sumWithoutArithmeticOperators0.getSum(833, 1934);
        int int33 = sumWithoutArithmeticOperators0.getSum(5450, 4470);
        int int36 = sumWithoutArithmeticOperators0.getSum(1094, 3617);
        java.lang.Class<?> wildcardClass37 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 376 + "'", int24 == 376);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 463 + "'", int27 == 463);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2767 + "'", int30 == 2767);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9920 + "'", int33 == 9920);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4711 + "'", int36 == 4711);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test6151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6151");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(52, 104);
        int int18 = sumWithoutArithmeticOperators0.getSum(590, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(132, 108);
        int int24 = sumWithoutArithmeticOperators0.getSum(1278, 101);
        int int27 = sumWithoutArithmeticOperators0.getSum(1412, 4075);
        int int30 = sumWithoutArithmeticOperators0.getSum(2621, 18092);
        int int33 = sumWithoutArithmeticOperators0.getSum(1148, 18414);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 156 + "'", int15 == 156);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 590 + "'", int18 == 590);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 240 + "'", int21 == 240);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1379 + "'", int24 == 1379);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5487 + "'", int27 == 5487);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 20713 + "'", int30 == 20713);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 19562 + "'", int33 == 19562);
    }

    @Test
    public void test6152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6152");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(196, (int) ' ');
        int int15 = sumWithoutArithmeticOperators0.getSum(2544, 1762);
        int int18 = sumWithoutArithmeticOperators0.getSum(1367, 11930);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 228 + "'", int12 == 228);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4306 + "'", int15 == 4306);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13297 + "'", int18 == 13297);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6153");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(352, 375);
        int int18 = sumWithoutArithmeticOperators0.getSum(122, 1327);
        int int21 = sumWithoutArithmeticOperators0.getSum(1171, 1019);
        int int24 = sumWithoutArithmeticOperators0.getSum(2464, 728);
        int int27 = sumWithoutArithmeticOperators0.getSum(748, 196);
        int int30 = sumWithoutArithmeticOperators0.getSum(6301, 2855);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 727 + "'", int15 == 727);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1449 + "'", int18 == 1449);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2190 + "'", int21 == 2190);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3192 + "'", int24 == 3192);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 944 + "'", int27 == 944);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9156 + "'", int30 == 9156);
    }

    @Test
    public void test6154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6154");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(11, (int) (short) 0);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int21 = sumWithoutArithmeticOperators0.getSum(727, 460);
        int int24 = sumWithoutArithmeticOperators0.getSum(1556, 2767);
        int int27 = sumWithoutArithmeticOperators0.getSum(16526, 5311);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1187 + "'", int21 == 1187);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4323 + "'", int24 == 4323);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 21837 + "'", int27 == 21837);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6155");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(101, 21);
        int int18 = sumWithoutArithmeticOperators0.getSum(89, 180);
        int int21 = sumWithoutArithmeticOperators0.getSum(199, (int) '4');
        int int24 = sumWithoutArithmeticOperators0.getSum(122, 0);
        int int27 = sumWithoutArithmeticOperators0.getSum(3445, 975);
        int int30 = sumWithoutArithmeticOperators0.getSum(1, 271);
        int int33 = sumWithoutArithmeticOperators0.getSum(3649, 1087);
        int int36 = sumWithoutArithmeticOperators0.getSum(1411, 868);
        int int39 = sumWithoutArithmeticOperators0.getSum(2716, 31189);
        int int42 = sumWithoutArithmeticOperators0.getSum(590, 29415);
        int int45 = sumWithoutArithmeticOperators0.getSum(19178, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 269 + "'", int18 == 269);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 251 + "'", int21 == 251);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 122 + "'", int24 == 122);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4420 + "'", int27 == 4420);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 272 + "'", int30 == 272);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4736 + "'", int33 == 4736);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2279 + "'", int36 == 2279);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 33905 + "'", int39 == 33905);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 30005 + "'", int42 == 30005);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 19178 + "'", int45 == 19178);
    }

    @Test
    public void test6156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6156");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(110, 53);
        int int21 = sumWithoutArithmeticOperators0.getSum(4685, 11110);
        int int24 = sumWithoutArithmeticOperators0.getSum(2028, 16199);
        int int27 = sumWithoutArithmeticOperators0.getSum(3283, 19500);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15795 + "'", int21 == 15795);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 18227 + "'", int24 == 18227);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 22783 + "'", int27 == 22783);
    }

    @Test
    public void test6157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6157");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 19);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(859, 454);
        int int12 = sumWithoutArithmeticOperators0.getSum(1253, 461);
        int int15 = sumWithoutArithmeticOperators0.getSum(288, 309);
        int int18 = sumWithoutArithmeticOperators0.getSum(582, 271);
        int int21 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 51);
        int int24 = sumWithoutArithmeticOperators0.getSum(309, 0);
        int int27 = sumWithoutArithmeticOperators0.getSum(452, 2415);
        int int30 = sumWithoutArithmeticOperators0.getSum(0, 803);
        int int33 = sumWithoutArithmeticOperators0.getSum(3303, 863);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1313 + "'", int9 == 1313);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1714 + "'", int12 == 1714);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 597 + "'", int15 == 597);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853 + "'", int18 == 853);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 51 + "'", int21 == 51);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 309 + "'", int24 == 309);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2867 + "'", int27 == 2867);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 803 + "'", int30 == 803);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4166 + "'", int33 == 4166);
    }

    @Test
    public void test6158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6158");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(465, 324);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(269, 301);
        int int24 = sumWithoutArithmeticOperators0.getSum(4109, 6125);
        int int27 = sumWithoutArithmeticOperators0.getSum(13104, 47452);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 789 + "'", int15 == 789);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 570 + "'", int21 == 570);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10234 + "'", int24 == 10234);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 60556 + "'", int27 == 60556);
    }

    @Test
    public void test6159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6159");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 98);
        int int9 = sumWithoutArithmeticOperators0.getSum(1281, 246);
        int int12 = sumWithoutArithmeticOperators0.getSum(54404, 28513);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 108 + "'", int6 == 108);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1527 + "'", int9 == 1527);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 82917 + "'", int12 == 82917);
    }

    @Test
    public void test6160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6160");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(195, 317);
        int int18 = sumWithoutArithmeticOperators0.getSum(76, 499);
        int int21 = sumWithoutArithmeticOperators0.getSum(844, 555);
        int int24 = sumWithoutArithmeticOperators0.getSum(5471, 1670);
        int int27 = sumWithoutArithmeticOperators0.getSum(141, 40926);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 575 + "'", int18 == 575);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1399 + "'", int21 == 1399);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7141 + "'", int24 == 7141);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 41067 + "'", int27 == 41067);
    }

    @Test
    public void test6161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6161");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum((-1), 290);
        int int21 = sumWithoutArithmeticOperators0.getSum(3564, 5352);
        int int24 = sumWithoutArithmeticOperators0.getSum(2837, 6663);
        int int27 = sumWithoutArithmeticOperators0.getSum(1796, 14442);
        int int30 = sumWithoutArithmeticOperators0.getSum(3328, 1087);
        int int33 = sumWithoutArithmeticOperators0.getSum(4535, 8163);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 289 + "'", int18 == 289);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8916 + "'", int21 == 8916);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9500 + "'", int24 == 9500);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16238 + "'", int27 == 16238);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4415 + "'", int30 == 4415);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 12698 + "'", int33 == 12698);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test6162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6162");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(18, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 108);
        int int21 = sumWithoutArithmeticOperators0.getSum(17, 266);
        int int24 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 376);
        int int27 = sumWithoutArithmeticOperators0.getSum(919, 1003);
        int int30 = sumWithoutArithmeticOperators0.getSum(1963, 3364);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 109 + "'", int18 == 109);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 283 + "'", int21 == 283);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 377 + "'", int24 == 377);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1922 + "'", int27 == 1922);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5327 + "'", int30 == 5327);
    }

    @Test
    public void test6163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6163");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(1407, 189);
        int int21 = sumWithoutArithmeticOperators0.getSum(1207, 142);
        int int24 = sumWithoutArithmeticOperators0.getSum(11589, 4543);
        int int27 = sumWithoutArithmeticOperators0.getSum(4415, 108);
        int int30 = sumWithoutArithmeticOperators0.getSum(22382, 5940);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 161 + "'", int15 == 161);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1596 + "'", int18 == 1596);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1349 + "'", int21 == 1349);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16132 + "'", int24 == 16132);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4523 + "'", int27 == 4523);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 28322 + "'", int30 == 28322);
    }

    @Test
    public void test6164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6164");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 18);
        int int18 = sumWithoutArithmeticOperators0.getSum(196, 1236);
        int int21 = sumWithoutArithmeticOperators0.getSum(1579, 1068);
        int int24 = sumWithoutArithmeticOperators0.getSum(1724, 20792);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1432 + "'", int18 == 1432);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2647 + "'", int21 == 2647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 22516 + "'", int24 == 22516);
    }

    @Test
    public void test6165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6165");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(11, (int) (short) 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(2589, 216);
        int int21 = sumWithoutArithmeticOperators0.getSum(570, 9265);
        int int24 = sumWithoutArithmeticOperators0.getSum(6742, 11832);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2805 + "'", int18 == 2805);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9835 + "'", int21 == 9835);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 18574 + "'", int24 == 18574);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6166");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(100, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(168, 810);
        int int21 = sumWithoutArithmeticOperators0.getSum(652, 56);
        int int24 = sumWithoutArithmeticOperators0.getSum(542, 931);
        int int27 = sumWithoutArithmeticOperators0.getSum(617, 760);
        int int30 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 2472);
        int int33 = sumWithoutArithmeticOperators0.getSum(45168, 58390);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 978 + "'", int18 == 978);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 708 + "'", int21 == 708);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1473 + "'", int24 == 1473);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1377 + "'", int27 == 1377);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2471 + "'", int30 == 2471);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 103558 + "'", int33 == 103558);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test6167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6167");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(11, (int) (short) 0);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int21 = sumWithoutArithmeticOperators0.getSum(727, 460);
        int int24 = sumWithoutArithmeticOperators0.getSum(746, 705);
        int int27 = sumWithoutArithmeticOperators0.getSum(1631, 5892);
        int int30 = sumWithoutArithmeticOperators0.getSum(1899, 10660);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1187 + "'", int21 == 1187);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1451 + "'", int24 == 1451);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7523 + "'", int27 == 7523);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 12559 + "'", int30 == 12559);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test6168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6168");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 101);
        int int18 = sumWithoutArithmeticOperators0.getSum(128, 1119);
        int int21 = sumWithoutArithmeticOperators0.getSum(14990, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(4440, 647);
        int int27 = sumWithoutArithmeticOperators0.getSum(3577, 26019);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 154 + "'", int15 == 154);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1247 + "'", int18 == 1247);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14990 + "'", int21 == 14990);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5087 + "'", int24 == 5087);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 29596 + "'", int27 == 29596);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6169");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 499);
        int int18 = sumWithoutArithmeticOperators0.getSum(1743, 12474);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 499 + "'", int15 == 499);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 14217 + "'", int18 == 14217);
    }

    @Test
    public void test6170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6170");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(110, 53);
        int int21 = sumWithoutArithmeticOperators0.getSum(162, 321);
        int int24 = sumWithoutArithmeticOperators0.getSum(407, 228);
        int int27 = sumWithoutArithmeticOperators0.getSum(54, 552);
        int int30 = sumWithoutArithmeticOperators0.getSum(936, 2325);
        int int33 = sumWithoutArithmeticOperators0.getSum(724, 1192);
        int int36 = sumWithoutArithmeticOperators0.getSum(201, 0);
        int int39 = sumWithoutArithmeticOperators0.getSum(932, 53);
        int int42 = sumWithoutArithmeticOperators0.getSum(11280, 12964);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 483 + "'", int21 == 483);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 635 + "'", int24 == 635);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 606 + "'", int27 == 606);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3261 + "'", int30 == 3261);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1916 + "'", int33 == 1916);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 201 + "'", int36 == 201);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 985 + "'", int39 == 985);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 24244 + "'", int42 == 24244);
    }

    @Test
    public void test6171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6171");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) '#', (int) (short) 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(186, 100);
        int int21 = sumWithoutArithmeticOperators0.getSum(469, 202);
        int int24 = sumWithoutArithmeticOperators0.getSum(66, 1121);
        int int27 = sumWithoutArithmeticOperators0.getSum(12404, 31620);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 286 + "'", int18 == 286);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 671 + "'", int21 == 671);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1187 + "'", int24 == 1187);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 44024 + "'", int27 == 44024);
    }

    @Test
    public void test6172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6172");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(255, 4075);
        int int18 = sumWithoutArithmeticOperators0.getSum(5379, 6905);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4330 + "'", int15 == 4330);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 12284 + "'", int18 == 12284);
    }

    @Test
    public void test6173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6173");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(859, 321);
        int int18 = sumWithoutArithmeticOperators0.getSum(209, 213);
        int int21 = sumWithoutArithmeticOperators0.getSum(98, 533);
        int int24 = sumWithoutArithmeticOperators0.getSum(8010, 7272);
        int int27 = sumWithoutArithmeticOperators0.getSum(6492, 2647);
        int int30 = sumWithoutArithmeticOperators0.getSum(4046, 0);
        int int33 = sumWithoutArithmeticOperators0.getSum(17960, 9222);
        int int36 = sumWithoutArithmeticOperators0.getSum(0, 859);
        int int39 = sumWithoutArithmeticOperators0.getSum(14633, 8731);
        java.lang.Class<?> wildcardClass40 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1180 + "'", int15 == 1180);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 422 + "'", int18 == 422);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 631 + "'", int21 == 631);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15282 + "'", int24 == 15282);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9139 + "'", int27 == 9139);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4046 + "'", int30 == 4046);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 27182 + "'", int33 == 27182);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 859 + "'", int36 == 859);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 23364 + "'", int39 == 23364);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test6174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6174");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(210, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(180, 98);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 725);
        int int27 = sumWithoutArithmeticOperators0.getSum(251, 4420);
        int int30 = sumWithoutArithmeticOperators0.getSum(227, 1272);
        int int33 = sumWithoutArithmeticOperators0.getSum(10212, 7070);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 246 + "'", int18 == 246);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 278 + "'", int21 == 278);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 725 + "'", int24 == 725);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4671 + "'", int27 == 4671);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1499 + "'", int30 == 1499);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 17282 + "'", int33 == 17282);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test6175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6175");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(10, 352);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 21723);
        int int18 = sumWithoutArithmeticOperators0.getSum(11577, 2758);
        int int21 = sumWithoutArithmeticOperators0.getSum(18109, 26991);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 362 + "'", int12 == 362);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 21723 + "'", int15 == 21723);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 14335 + "'", int18 == 14335);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 45100 + "'", int21 == 45100);
    }

    @Test
    public void test6176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6176");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(51, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(354, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(570, 3084);
        int int21 = sumWithoutArithmeticOperators0.getSum(9118, 8966);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 454 + "'", int15 == 454);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3654 + "'", int18 == 3654);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18084 + "'", int21 == 18084);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6177");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(11, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(286, 9);
        int int24 = sumWithoutArithmeticOperators0.getSum(156, (int) (byte) 10);
        int int27 = sumWithoutArithmeticOperators0.getSum(2682, 1045);
        int int30 = sumWithoutArithmeticOperators0.getSum(12568, 36098);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 166 + "'", int24 == 166);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3727 + "'", int27 == 3727);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 48666 + "'", int30 == 48666);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test6178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6178");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(574, 1268);
        int int21 = sumWithoutArithmeticOperators0.getSum(11121, 2750);
        int int24 = sumWithoutArithmeticOperators0.getSum(542, 13934);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 161 + "'", int15 == 161);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1842 + "'", int18 == 1842);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13871 + "'", int21 == 13871);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14476 + "'", int24 == 14476);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6179");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(11, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(286, 9);
        int int24 = sumWithoutArithmeticOperators0.getSum(110, 266);
        int int27 = sumWithoutArithmeticOperators0.getSum(1, 40);
        int int30 = sumWithoutArithmeticOperators0.getSum(1252, 3595);
        int int33 = sumWithoutArithmeticOperators0.getSum(2229, 1111);
        int int36 = sumWithoutArithmeticOperators0.getSum(859, 1719);
        int int39 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 763);
        int int42 = sumWithoutArithmeticOperators0.getSum(1062, 9097);
        int int45 = sumWithoutArithmeticOperators0.getSum(10262, 14540);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 376 + "'", int24 == 376);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 41 + "'", int27 == 41);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4847 + "'", int30 == 4847);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3340 + "'", int33 == 3340);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2578 + "'", int36 == 2578);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 863 + "'", int39 == 863);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10159 + "'", int42 == 10159);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 24802 + "'", int45 == 24802);
    }

    @Test
    public void test6180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6180");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(107, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, 1106);
        int int18 = sumWithoutArithmeticOperators0.getSum(615, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(7164, 1275);
        int int24 = sumWithoutArithmeticOperators0.getSum(6271, 13354);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1206 + "'", int15 == 1206);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 615 + "'", int18 == 615);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8439 + "'", int21 == 8439);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19625 + "'", int24 == 19625);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6181");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(238, 152);
        int int15 = sumWithoutArithmeticOperators0.getSum(254, 98);
        int int18 = sumWithoutArithmeticOperators0.getSum(3932, 0);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 390 + "'", int12 == 390);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 352 + "'", int15 == 352);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3932 + "'", int18 == 3932);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6182");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(955, 89);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 55);
        int int21 = sumWithoutArithmeticOperators0.getSum(3266, 1411);
        int int24 = sumWithoutArithmeticOperators0.getSum(3936, 2231);
        int int27 = sumWithoutArithmeticOperators0.getSum(9450, 427);
        int int30 = sumWithoutArithmeticOperators0.getSum(11872, 7772);
        int int33 = sumWithoutArithmeticOperators0.getSum(0, 3341);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1044 + "'", int15 == 1044);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 56 + "'", int18 == 56);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4677 + "'", int21 == 4677);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6167 + "'", int24 == 6167);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9877 + "'", int27 == 9877);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 19644 + "'", int30 == 19644);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3341 + "'", int33 == 3341);
    }

    @Test
    public void test6183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6183");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(51, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(375, 352);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 165);
        int int21 = sumWithoutArithmeticOperators0.getSum(109, 52);
        int int24 = sumWithoutArithmeticOperators0.getSum(3707, 4847);
        int int27 = sumWithoutArithmeticOperators0.getSum(27930, 526);
        int int30 = sumWithoutArithmeticOperators0.getSum(381, 17884);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 727 + "'", int15 == 727);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 165 + "'", int18 == 165);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 161 + "'", int21 == 161);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8554 + "'", int24 == 8554);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 28456 + "'", int27 == 28456);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 18265 + "'", int30 == 18265);
    }

    @Test
    public void test6184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6184");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(217, 238);
        int int21 = sumWithoutArithmeticOperators0.getSum(238, 295);
        int int24 = sumWithoutArithmeticOperators0.getSum(14352, 5418);
        int int27 = sumWithoutArithmeticOperators0.getSum(22956, 3264);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 455 + "'", int18 == 455);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 533 + "'", int21 == 533);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19770 + "'", int24 == 19770);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 26220 + "'", int27 == 26220);
    }

    @Test
    public void test6185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6185");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(162, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(156, 491);
        int int21 = sumWithoutArithmeticOperators0.getSum(1291, 352);
        int int24 = sumWithoutArithmeticOperators0.getSum(2251, 1373);
        int int27 = sumWithoutArithmeticOperators0.getSum(5883, 1432);
        int int30 = sumWithoutArithmeticOperators0.getSum(31917, 23914);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 647 + "'", int18 == 647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1643 + "'", int21 == 1643);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3624 + "'", int24 == 3624);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7315 + "'", int27 == 7315);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 55831 + "'", int30 == 55831);
    }

    @Test
    public void test6186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6186");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 89);
        int int12 = sumWithoutArithmeticOperators0.getSum(25657, 1172);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 90 + "'", int9 == 90);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26829 + "'", int12 == 26829);
    }

    @Test
    public void test6187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6187");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(110, 53);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 7);
        int int24 = sumWithoutArithmeticOperators0.getSum(727, 926);
        int int27 = sumWithoutArithmeticOperators0.getSum(255, 3322);
        int int30 = sumWithoutArithmeticOperators0.getSum(853, 10105);
        int int33 = sumWithoutArithmeticOperators0.getSum(6114, 2018);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1653 + "'", int24 == 1653);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3577 + "'", int27 == 3577);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10958 + "'", int30 == 10958);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8132 + "'", int33 == 8132);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test6188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6188");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(162, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(623, 483);
        int int21 = sumWithoutArithmeticOperators0.getSum(4392, 1040);
        int int24 = sumWithoutArithmeticOperators0.getSum(3537, 214);
        int int27 = sumWithoutArithmeticOperators0.getSum(3936, 2187);
        int int30 = sumWithoutArithmeticOperators0.getSum(12522, 11580);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1106 + "'", int18 == 1106);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5432 + "'", int21 == 5432);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3751 + "'", int24 == 3751);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6123 + "'", int27 == 6123);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 24102 + "'", int30 == 24102);
    }

    @Test
    public void test6189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6189");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(266, 295);
        int int15 = sumWithoutArithmeticOperators0.getSum(722, 5173);
        int int18 = sumWithoutArithmeticOperators0.getSum(4476, 22750);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 36450);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 561 + "'", int12 == 561);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5895 + "'", int15 == 5895);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 27226 + "'", int18 == 27226);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 36450 + "'", int21 == 36450);
    }

    @Test
    public void test6190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6190");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(708, 40);
        int int15 = sumWithoutArithmeticOperators0.getSum(710, 512);
        int int18 = sumWithoutArithmeticOperators0.getSum(235, 696);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 748 + "'", int12 == 748);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1222 + "'", int15 == 1222);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 931 + "'", int18 == 931);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6191");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(911, 432);
        int int12 = sumWithoutArithmeticOperators0.getSum(526, 184);
        int int15 = sumWithoutArithmeticOperators0.getSum(316, 236);
        int int18 = sumWithoutArithmeticOperators0.getSum(2128, (int) (byte) 100);
        int int21 = sumWithoutArithmeticOperators0.getSum(2165, 4858);
        int int24 = sumWithoutArithmeticOperators0.getSum(1887, 128);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1343 + "'", int9 == 1343);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 710 + "'", int12 == 710);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 552 + "'", int15 == 552);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2228 + "'", int18 == 2228);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7023 + "'", int21 == 7023);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2015 + "'", int24 == 2015);
    }

    @Test
    public void test6192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6192");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(100, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(168, 810);
        int int21 = sumWithoutArithmeticOperators0.getSum(652, 56);
        int int24 = sumWithoutArithmeticOperators0.getSum(542, 931);
        int int27 = sumWithoutArithmeticOperators0.getSum(11510, 4114);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 978 + "'", int18 == 978);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 708 + "'", int21 == 708);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1473 + "'", int24 == 1473);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15624 + "'", int27 == 15624);
    }

    @Test
    public void test6193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6193");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(51, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 144);
        int int18 = sumWithoutArithmeticOperators0.getSum(1313, 4270);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 629);
        int int24 = sumWithoutArithmeticOperators0.getSum(5988, 14335);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 188 + "'", int15 == 188);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5583 + "'", int18 == 5583);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 629 + "'", int21 == 629);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20323 + "'", int24 == 20323);
    }

    @Test
    public void test6194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6194");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 10);
        int int15 = sumWithoutArithmeticOperators0.getSum(5007, 1398);
        int int18 = sumWithoutArithmeticOperators0.getSum(8026, 11110);
        int int21 = sumWithoutArithmeticOperators0.getSum(3457, 686);
        int int24 = sumWithoutArithmeticOperators0.getSum(27159, 17592);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6405 + "'", int15 == 6405);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 19136 + "'", int18 == 19136);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4143 + "'", int21 == 4143);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 44751 + "'", int24 == 44751);
    }

    @Test
    public void test6195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6195");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) '#', (int) (short) 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) 'a', 156);
        int int21 = sumWithoutArithmeticOperators0.getSum(238, 84);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 2894);
        int int27 = sumWithoutArithmeticOperators0.getSum(1685, 859);
        int int30 = sumWithoutArithmeticOperators0.getSum(12048, 23843);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 253 + "'", int18 == 253);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 322 + "'", int21 == 322);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2894 + "'", int24 == 2894);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2544 + "'", int27 == 2544);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35891 + "'", int30 == 35891);
    }

    @Test
    public void test6196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6196");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(955, 89);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 55);
        int int21 = sumWithoutArithmeticOperators0.getSum(3266, 1411);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 4537);
        int int27 = sumWithoutArithmeticOperators0.getSum(2100, 1849);
        int int30 = sumWithoutArithmeticOperators0.getSum(38389, 28182);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1044 + "'", int15 == 1044);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 56 + "'", int18 == 56);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4677 + "'", int21 == 4677);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4537 + "'", int24 == 4537);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3949 + "'", int27 == 3949);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 66571 + "'", int30 == 66571);
    }

    @Test
    public void test6197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6197");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(217, 238);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 978);
        int int24 = sumWithoutArithmeticOperators0.getSum(3551, 9704);
        int int27 = sumWithoutArithmeticOperators0.getSum(3618, 1001);
        int int30 = sumWithoutArithmeticOperators0.getSum(4082, 9564);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 455 + "'", int18 == 455);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 978 + "'", int21 == 978);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13255 + "'", int24 == 13255);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4619 + "'", int27 == 4619);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 13646 + "'", int30 == 13646);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test6198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6198");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 19);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(1121, 708);
        int int12 = sumWithoutArithmeticOperators0.getSum(3445, 1680);
        int int15 = sumWithoutArithmeticOperators0.getSum(116, 1503);
        int int18 = sumWithoutArithmeticOperators0.getSum(257, 2389);
        int int21 = sumWithoutArithmeticOperators0.getSum(5387, 12497);
        int int24 = sumWithoutArithmeticOperators0.getSum(6143, 6293);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1829 + "'", int9 == 1829);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5125 + "'", int12 == 5125);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1619 + "'", int15 == 1619);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2646 + "'", int18 == 2646);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 17884 + "'", int21 == 17884);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12436 + "'", int24 == 12436);
    }

    @Test
    public void test6199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6199");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(955, 89);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 55);
        int int21 = sumWithoutArithmeticOperators0.getSum(3266, 1411);
        int int24 = sumWithoutArithmeticOperators0.getSum(3936, 2231);
        int int27 = sumWithoutArithmeticOperators0.getSum(16342, 184);
        int int30 = sumWithoutArithmeticOperators0.getSum(469, 0);
        int int33 = sumWithoutArithmeticOperators0.getSum(1972, 4415);
        int int36 = sumWithoutArithmeticOperators0.getSum(4986, 9497);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1044 + "'", int15 == 1044);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 56 + "'", int18 == 56);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4677 + "'", int21 == 4677);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6167 + "'", int24 == 6167);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16526 + "'", int27 == 16526);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 469 + "'", int30 == 469);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6387 + "'", int33 == 6387);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 14483 + "'", int36 == 14483);
    }

    @Test
    public void test6200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6200");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(11, (int) (short) 0);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int21 = sumWithoutArithmeticOperators0.getSum(665, 783);
        int int24 = sumWithoutArithmeticOperators0.getSum(28974, 783);
        int int27 = sumWithoutArithmeticOperators0.getSum(19643, 151);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1448 + "'", int21 == 1448);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 29757 + "'", int24 == 29757);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 19794 + "'", int27 == 19794);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6201");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(110, 53);
        int int21 = sumWithoutArithmeticOperators0.getSum(2597, 6372);
        int int24 = sumWithoutArithmeticOperators0.getSum(2772, 1491);
        int int27 = sumWithoutArithmeticOperators0.getSum(3592, 8007);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8969 + "'", int21 == 8969);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4263 + "'", int24 == 4263);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 11599 + "'", int27 == 11599);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6202");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(201, 1252);
        int int21 = sumWithoutArithmeticOperators0.getSum(1934, 683);
        int int24 = sumWithoutArithmeticOperators0.getSum(22628, 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1453 + "'", int18 == 1453);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2617 + "'", int21 == 2617);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 22729 + "'", int24 == 22729);
    }

    @Test
    public void test6203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6203");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(11, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(631, 255);
        int int18 = sumWithoutArithmeticOperators0.getSum(2123, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(45328, 672);
        int int24 = sumWithoutArithmeticOperators0.getSum(1763, 9097);
        int int27 = sumWithoutArithmeticOperators0.getSum(4659, 8976);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 886 + "'", int15 == 886);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2123 + "'", int18 == 2123);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 46000 + "'", int21 == 46000);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10860 + "'", int24 == 10860);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 13635 + "'", int27 == 13635);
    }

    @Test
    public void test6204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6204");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(294, (int) (short) -1);
        int int21 = sumWithoutArithmeticOperators0.getSum(614, 734);
        int int24 = sumWithoutArithmeticOperators0.getSum(35477, 21442);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 293 + "'", int18 == 293);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1348 + "'", int21 == 1348);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 56919 + "'", int24 == 56919);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6205");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 18);
        int int9 = sumWithoutArithmeticOperators0.getSum(2339, 5977);
        int int12 = sumWithoutArithmeticOperators0.getSum(2635, 3842);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 8467);
        int int18 = sumWithoutArithmeticOperators0.getSum(6811, 11227);
        int int21 = sumWithoutArithmeticOperators0.getSum(7981, 20160);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8316 + "'", int9 == 8316);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6477 + "'", int12 == 6477);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8467 + "'", int15 == 8467);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18038 + "'", int18 == 18038);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 28141 + "'", int21 == 28141);
    }

    @Test
    public void test6206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6206");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(9, 217);
        int int18 = sumWithoutArithmeticOperators0.getSum(934, 766);
        int int21 = sumWithoutArithmeticOperators0.getSum(216, 215);
        int int24 = sumWithoutArithmeticOperators0.getSum(1072, 705);
        int int27 = sumWithoutArithmeticOperators0.getSum(15413, 33679);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 226 + "'", int15 == 226);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1700 + "'", int18 == 1700);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 431 + "'", int21 == 431);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1777 + "'", int24 == 1777);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 49092 + "'", int27 == 49092);
    }

    @Test
    public void test6207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6207");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(859, 321);
        int int18 = sumWithoutArithmeticOperators0.getSum(209, 213);
        int int21 = sumWithoutArithmeticOperators0.getSum(8216, 8824);
        int int24 = sumWithoutArithmeticOperators0.getSum(9792, 19257);
        int int27 = sumWithoutArithmeticOperators0.getSum(9003, 34871);
        int int30 = sumWithoutArithmeticOperators0.getSum(25146, 41394);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1180 + "'", int15 == 1180);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 422 + "'", int18 == 422);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 17040 + "'", int21 == 17040);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 29049 + "'", int24 == 29049);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 43874 + "'", int27 == 43874);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 66540 + "'", int30 == 66540);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test6208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6208");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(17, 200);
        int int6 = sumWithoutArithmeticOperators0.getSum(377, 210);
        int int9 = sumWithoutArithmeticOperators0.getSum(2928, 3259);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 1859);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 217 + "'", int3 == 217);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 587 + "'", int6 == 587);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6187 + "'", int9 == 6187);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1859 + "'", int12 == 1859);
    }

    @Test
    public void test6209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6209");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) ' ', 35);
        int int6 = sumWithoutArithmeticOperators0.getSum(98, 180);
        int int9 = sumWithoutArithmeticOperators0.getSum(753, 8855);
        int int12 = sumWithoutArithmeticOperators0.getSum(8731, 192);
        int int15 = sumWithoutArithmeticOperators0.getSum(6791, 15784);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 67 + "'", int3 == 67);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 278 + "'", int6 == 278);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9608 + "'", int9 == 9608);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8923 + "'", int12 == 8923);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 22575 + "'", int15 == 22575);
    }

    @Test
    public void test6210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6210");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(163, 36);
        int int12 = sumWithoutArithmeticOperators0.getSum(479, 3392);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 199 + "'", int9 == 199);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3871 + "'", int12 == 3871);
    }

    @Test
    public void test6211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6211");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 19);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(859, 454);
        int int12 = sumWithoutArithmeticOperators0.getSum(1253, 461);
        int int15 = sumWithoutArithmeticOperators0.getSum(288, 309);
        int int18 = sumWithoutArithmeticOperators0.getSum(582, 271);
        int int21 = sumWithoutArithmeticOperators0.getSum(1764, 286);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 191);
        int int27 = sumWithoutArithmeticOperators0.getSum(15658, 699);
        int int30 = sumWithoutArithmeticOperators0.getSum(2601, 457);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1313 + "'", int9 == 1313);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1714 + "'", int12 == 1714);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 597 + "'", int15 == 597);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853 + "'", int18 == 853);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2050 + "'", int21 == 2050);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 191 + "'", int24 == 191);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16357 + "'", int27 == 16357);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3058 + "'", int30 == 3058);
    }

    @Test
    public void test6212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6212");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(416, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(785, 453);
        int int21 = sumWithoutArithmeticOperators0.getSum(107, 188);
        int int24 = sumWithoutArithmeticOperators0.getSum(1362, 2713);
        int int27 = sumWithoutArithmeticOperators0.getSum(13001, 735);
        int int30 = sumWithoutArithmeticOperators0.getSum(6352, 1001);
        int int33 = sumWithoutArithmeticOperators0.getSum(51932, 42);
        int int36 = sumWithoutArithmeticOperators0.getSum(10032, 1496);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 526 + "'", int15 == 526);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1238 + "'", int18 == 1238);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4075 + "'", int24 == 4075);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 13736 + "'", int27 == 13736);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7353 + "'", int30 == 7353);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 51974 + "'", int33 == 51974);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 11528 + "'", int36 == 11528);
    }

    @Test
    public void test6213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6213");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) '#', (int) (short) 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(186, 100);
        int int21 = sumWithoutArithmeticOperators0.getSum(469, 202);
        int int24 = sumWithoutArithmeticOperators0.getSum(66, 1121);
        int int27 = sumWithoutArithmeticOperators0.getSum(4260, 4268);
        int int30 = sumWithoutArithmeticOperators0.getSum(0, 1458);
        int int33 = sumWithoutArithmeticOperators0.getSum(3249, 5478);
        int int36 = sumWithoutArithmeticOperators0.getSum(10234, 3100);
        int int39 = sumWithoutArithmeticOperators0.getSum(1402, 18185);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 286 + "'", int18 == 286);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 671 + "'", int21 == 671);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1187 + "'", int24 == 1187);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8528 + "'", int27 == 8528);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1458 + "'", int30 == 1458);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8727 + "'", int33 == 8727);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 13334 + "'", int36 == 13334);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 19587 + "'", int39 == 19587);
    }

    @Test
    public void test6214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6214");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(51, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(375, 352);
        int int18 = sumWithoutArithmeticOperators0.getSum(215, (int) '#');
        int int21 = sumWithoutArithmeticOperators0.getSum(42, 724);
        int int24 = sumWithoutArithmeticOperators0.getSum(19, 460);
        int int27 = sumWithoutArithmeticOperators0.getSum(10914, 0);
        int int30 = sumWithoutArithmeticOperators0.getSum(18142, 1);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 727 + "'", int15 == 727);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 250 + "'", int18 == 250);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 766 + "'", int21 == 766);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 479 + "'", int24 == 479);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10914 + "'", int27 == 10914);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 18143 + "'", int30 == 18143);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test6215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6215");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum(44, 671);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 13757);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 715 + "'", int9 == 715);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 13757 + "'", int12 == 13757);
    }

    @Test
    public void test6216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6216");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(955, 89);
        int int18 = sumWithoutArithmeticOperators0.getSum(278, 725);
        int int21 = sumWithoutArithmeticOperators0.getSum(212, 708);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 6402);
        int int27 = sumWithoutArithmeticOperators0.getSum(14971, 10231);
        int int30 = sumWithoutArithmeticOperators0.getSum(1343, 791);
        int int33 = sumWithoutArithmeticOperators0.getSum(2963, 25670);
        int int36 = sumWithoutArithmeticOperators0.getSum(2226, 1301);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1044 + "'", int15 == 1044);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1003 + "'", int18 == 1003);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 920 + "'", int21 == 920);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6402 + "'", int24 == 6402);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 25202 + "'", int27 == 25202);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2134 + "'", int30 == 2134);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 28633 + "'", int33 == 28633);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3527 + "'", int36 == 3527);
    }

    @Test
    public void test6217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6217");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(250, 195);
        int int9 = sumWithoutArithmeticOperators0.getSum(134, 151);
        int int12 = sumWithoutArithmeticOperators0.getSum(1842, 3652);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 445 + "'", int6 == 445);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 285 + "'", int9 == 285);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5494 + "'", int12 == 5494);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6218");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 499);
        int int18 = sumWithoutArithmeticOperators0.getSum(6050, 2805);
        int int21 = sumWithoutArithmeticOperators0.getSum(1169, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(8331, 3733);
        int int27 = sumWithoutArithmeticOperators0.getSum(1920, 0);
        int int30 = sumWithoutArithmeticOperators0.getSum(0, 109);
        int int33 = sumWithoutArithmeticOperators0.getSum(12442, 9156);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 499 + "'", int15 == 499);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8855 + "'", int18 == 8855);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1169 + "'", int21 == 1169);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12064 + "'", int24 == 12064);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1920 + "'", int27 == 1920);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 109 + "'", int30 == 109);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 21598 + "'", int33 == 21598);
    }

    @Test
    public void test6219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6219");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 165);
        int int12 = sumWithoutArithmeticOperators0.getSum(152, 108);
        int int15 = sumWithoutArithmeticOperators0.getSum(788, 360);
        int int18 = sumWithoutArithmeticOperators0.getSum(44, 2347);
        int int21 = sumWithoutArithmeticOperators0.getSum(2563, 3409);
        int int24 = sumWithoutArithmeticOperators0.getSum(13148, 1592);
        int int27 = sumWithoutArithmeticOperators0.getSum(5103, 523);
        int int30 = sumWithoutArithmeticOperators0.getSum(6660, 47744);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 294 + "'", int9 == 294);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 260 + "'", int12 == 260);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1148 + "'", int15 == 1148);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2391 + "'", int18 == 2391);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5972 + "'", int21 == 5972);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14740 + "'", int24 == 14740);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5626 + "'", int27 == 5626);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 54404 + "'", int30 == 54404);
    }

    @Test
    public void test6220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6220");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(217, 238);
        int int21 = sumWithoutArithmeticOperators0.getSum(156, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(593, 1374);
        int int27 = sumWithoutArithmeticOperators0.getSum(1920, 4177);
        int int30 = sumWithoutArithmeticOperators0.getSum(8325, 699);
        int int33 = sumWithoutArithmeticOperators0.getSum((int) 'a', 4192);
        int int36 = sumWithoutArithmeticOperators0.getSum(5851, 17534);
        int int39 = sumWithoutArithmeticOperators0.getSum(2716, 28974);
        int int42 = sumWithoutArithmeticOperators0.getSum(633, 12197);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 455 + "'", int18 == 455);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 156 + "'", int21 == 156);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1967 + "'", int24 == 1967);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6097 + "'", int27 == 6097);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9024 + "'", int30 == 9024);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4289 + "'", int33 == 4289);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 23385 + "'", int36 == 23385);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 31690 + "'", int39 == 31690);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 12830 + "'", int42 == 12830);
    }

    @Test
    public void test6221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6221");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(9, 217);
        int int18 = sumWithoutArithmeticOperators0.getSum(934, 766);
        int int21 = sumWithoutArithmeticOperators0.getSum(216, 215);
        int int24 = sumWithoutArithmeticOperators0.getSum(1072, 705);
        int int27 = sumWithoutArithmeticOperators0.getSum(1192, 780);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 226 + "'", int15 == 226);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1700 + "'", int18 == 1700);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 431 + "'", int21 == 431);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1777 + "'", int24 == 1777);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1972 + "'", int27 == 1972);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6222");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(354, 1848);
        int int15 = sumWithoutArithmeticOperators0.getSum(32, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(2495, 6580);
        int int21 = sumWithoutArithmeticOperators0.getSum(12265, 105);
        int int24 = sumWithoutArithmeticOperators0.getSum(324, 0);
        int int27 = sumWithoutArithmeticOperators0.getSum(5675, 3369);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2202 + "'", int12 == 2202);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 142 + "'", int15 == 142);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9075 + "'", int18 == 9075);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12370 + "'", int21 == 12370);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 324 + "'", int24 == 324);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9044 + "'", int27 == 9044);
    }

    @Test
    public void test6223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6223");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(40, 269);
        int int6 = sumWithoutArithmeticOperators0.getSum(202, 523);
        int int9 = sumWithoutArithmeticOperators0.getSum(362, 1680);
        int int12 = sumWithoutArithmeticOperators0.getSum(9017, 5215);
        int int15 = sumWithoutArithmeticOperators0.getSum(13588, 2079);
        int int18 = sumWithoutArithmeticOperators0.getSum(3786, 1329);
        int int21 = sumWithoutArithmeticOperators0.getSum(2008, 10473);
        int int24 = sumWithoutArithmeticOperators0.getSum(55893, 3173);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 309 + "'", int3 == 309);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 725 + "'", int6 == 725);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2042 + "'", int9 == 2042);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 14232 + "'", int12 == 14232);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15667 + "'", int15 == 15667);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5115 + "'", int18 == 5115);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12481 + "'", int21 == 12481);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 59066 + "'", int24 == 59066);
    }

    @Test
    public void test6224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6224");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(33, 163);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (byte) 100);
        int int21 = sumWithoutArithmeticOperators0.getSum(499, (int) (byte) -1);
        int int24 = sumWithoutArithmeticOperators0.getSum(725, (int) (short) 10);
        int int27 = sumWithoutArithmeticOperators0.getSum(546, 54);
        int int30 = sumWithoutArithmeticOperators0.getSum(360, 1249);
        int int33 = sumWithoutArithmeticOperators0.getSum(925, 4471);
        int int36 = sumWithoutArithmeticOperators0.getSum(3502, 1074);
        int int39 = sumWithoutArithmeticOperators0.getSum(27867, 1733);
        int int42 = sumWithoutArithmeticOperators0.getSum(4793, 18358);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 498 + "'", int21 == 498);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 735 + "'", int24 == 735);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 600 + "'", int27 == 600);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1609 + "'", int30 == 1609);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5396 + "'", int33 == 5396);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4576 + "'", int36 == 4576);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 29600 + "'", int39 == 29600);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 23151 + "'", int42 == 23151);
    }

    @Test
    public void test6225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6225");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(859, 321);
        int int18 = sumWithoutArithmeticOperators0.getSum(576, 2810);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 1576);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1180 + "'", int15 == 1180);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3386 + "'", int18 == 3386);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1576 + "'", int21 == 1576);
    }

    @Test
    public void test6226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6226");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(9, 217);
        int int18 = sumWithoutArithmeticOperators0.getSum(934, 766);
        int int21 = sumWithoutArithmeticOperators0.getSum(216, 215);
        int int24 = sumWithoutArithmeticOperators0.getSum(620, 565);
        int int27 = sumWithoutArithmeticOperators0.getSum(10929, 10745);
        int int30 = sumWithoutArithmeticOperators0.getSum(2511, 110);
        int int33 = sumWithoutArithmeticOperators0.getSum(3804, 4079);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 226 + "'", int15 == 226);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1700 + "'", int18 == 1700);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 431 + "'", int21 == 431);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1185 + "'", int24 == 1185);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 21674 + "'", int27 == 21674);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2621 + "'", int30 == 2621);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 7883 + "'", int33 == 7883);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test6227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6227");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(110, 376);
        int int12 = sumWithoutArithmeticOperators0.getSum(84, 200);
        int int15 = sumWithoutArithmeticOperators0.getSum(14692, 3345);
        int int18 = sumWithoutArithmeticOperators0.getSum(3037, 863);
        int int21 = sumWithoutArithmeticOperators0.getSum(16708, 4975);
        int int24 = sumWithoutArithmeticOperators0.getSum(16834, 20357);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 486 + "'", int9 == 486);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 284 + "'", int12 == 284);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18037 + "'", int15 == 18037);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3900 + "'", int18 == 3900);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 21683 + "'", int21 == 21683);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 37191 + "'", int24 == 37191);
    }

    @Test
    public void test6228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6228");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(238, 152);
        int int15 = sumWithoutArithmeticOperators0.getSum(665, 10493);
        int int18 = sumWithoutArithmeticOperators0.getSum(17253, 30882);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 390 + "'", int12 == 390);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11158 + "'", int15 == 11158);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48135 + "'", int18 == 48135);
    }

    @Test
    public void test6229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6229");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(526, 727);
        int int18 = sumWithoutArithmeticOperators0.getSum(592, 734);
        int int21 = sumWithoutArithmeticOperators0.getSum(9920, 3461);
        int int24 = sumWithoutArithmeticOperators0.getSum(1602, 1583);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1253 + "'", int15 == 1253);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1326 + "'", int18 == 1326);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13381 + "'", int21 == 13381);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3185 + "'", int24 == 3185);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6230");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(163, 36);
        int int12 = sumWithoutArithmeticOperators0.getSum(269, 196);
        int int15 = sumWithoutArithmeticOperators0.getSum(1105, 471);
        int int18 = sumWithoutArithmeticOperators0.getSum(12795, 19834);
        int int21 = sumWithoutArithmeticOperators0.getSum(1087, 6216);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 199 + "'", int9 == 199);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 465 + "'", int12 == 465);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1576 + "'", int15 == 1576);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32629 + "'", int18 == 32629);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7303 + "'", int21 == 7303);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6231");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(163, 52);
        int int15 = sumWithoutArithmeticOperators0.getSum(107, 210);
        int int18 = sumWithoutArithmeticOperators0.getSum(99, 149);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 1430);
        int int24 = sumWithoutArithmeticOperators0.getSum(7460, 469);
        int int27 = sumWithoutArithmeticOperators0.getSum(10876, 1347);
        int int30 = sumWithoutArithmeticOperators0.getSum(1320, 2198);
        int int33 = sumWithoutArithmeticOperators0.getSum(12993, 6582);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 215 + "'", int12 == 215);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 317 + "'", int15 == 317);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 248 + "'", int18 == 248);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1430 + "'", int21 == 1430);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7929 + "'", int24 == 7929);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 12223 + "'", int27 == 12223);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3518 + "'", int30 == 3518);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 19575 + "'", int33 == 19575);
    }

    @Test
    public void test6232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6232");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(11, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(286, 9);
        int int24 = sumWithoutArithmeticOperators0.getSum(156, (int) (byte) 10);
        int int27 = sumWithoutArithmeticOperators0.getSum(455, 330);
        int int30 = sumWithoutArithmeticOperators0.getSum(200, 162);
        int int33 = sumWithoutArithmeticOperators0.getSum(1108, 151);
        int int36 = sumWithoutArithmeticOperators0.getSum(1686, 1714);
        int int39 = sumWithoutArithmeticOperators0.getSum(647, 249);
        int int42 = sumWithoutArithmeticOperators0.getSum(7020, 3116);
        java.lang.Class<?> wildcardClass43 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 166 + "'", int24 == 166);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 785 + "'", int27 == 785);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 362 + "'", int30 == 362);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1259 + "'", int33 == 1259);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3400 + "'", int36 == 3400);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 896 + "'", int39 == 896);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10136 + "'", int42 == 10136);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test6233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6233");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(5566, 1705);
        int int15 = sumWithoutArithmeticOperators0.getSum(3637, 708);
        int int18 = sumWithoutArithmeticOperators0.getSum(14626, 40568);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7271 + "'", int12 == 7271);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4345 + "'", int15 == 4345);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 55194 + "'", int18 == 55194);
    }

    @Test
    public void test6234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6234");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 180);
        int int18 = sumWithoutArithmeticOperators0.getSum(1080, 974);
        int int21 = sumWithoutArithmeticOperators0.getSum(1296, 260);
        int int24 = sumWithoutArithmeticOperators0.getSum(465, 542);
        int int27 = sumWithoutArithmeticOperators0.getSum(5734, 19528);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 180 + "'", int15 == 180);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2054 + "'", int18 == 2054);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1556 + "'", int21 == 1556);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1007 + "'", int24 == 1007);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 25262 + "'", int27 == 25262);
    }

    @Test
    public void test6235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6235");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(210, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(317, 110);
        int int24 = sumWithoutArithmeticOperators0.getSum(1698, 116);
        int int27 = sumWithoutArithmeticOperators0.getSum(6869, 6372);
        int int30 = sumWithoutArithmeticOperators0.getSum(28374, 1623);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 246 + "'", int18 == 246);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 427 + "'", int21 == 427);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1814 + "'", int24 == 1814);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 13241 + "'", int27 == 13241);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 29997 + "'", int30 == 29997);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test6236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6236");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(266, 295);
        int int15 = sumWithoutArithmeticOperators0.getSum(1067, (int) 'a');
        int int18 = sumWithoutArithmeticOperators0.getSum(3188, 1762);
        int int21 = sumWithoutArithmeticOperators0.getSum(1869, 3770);
        int int24 = sumWithoutArithmeticOperators0.getSum(5189, 766);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 561 + "'", int12 == 561);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1164 + "'", int15 == 1164);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4950 + "'", int18 == 4950);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5639 + "'", int21 == 5639);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5955 + "'", int24 == 5955);
    }

    @Test
    public void test6237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6237");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(162, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(100, 32);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 84);
        int int24 = sumWithoutArithmeticOperators0.getSum(289, 376);
        int int27 = sumWithoutArithmeticOperators0.getSum(7637, 3936);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 132 + "'", int18 == 132);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 84 + "'", int21 == 84);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 665 + "'", int24 == 665);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 11573 + "'", int27 == 11573);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6238");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(2279, 615);
        int int15 = sumWithoutArithmeticOperators0.getSum(3726, 132);
        int int18 = sumWithoutArithmeticOperators0.getSum(2601, 1623);
        int int21 = sumWithoutArithmeticOperators0.getSum(1664, 16935);
        int int24 = sumWithoutArithmeticOperators0.getSum(17994, 10231);
        int int27 = sumWithoutArithmeticOperators0.getSum(2456, 228);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2894 + "'", int12 == 2894);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3858 + "'", int15 == 3858);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4224 + "'", int18 == 4224);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18599 + "'", int21 == 18599);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 28225 + "'", int24 == 28225);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2684 + "'", int27 == 2684);
    }

    @Test
    public void test6239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6239");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(257, 250);
        int int12 = sumWithoutArithmeticOperators0.getSum(13677, 1029);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 1244);
        int int18 = sumWithoutArithmeticOperators0.getSum(631, 13898);
        int int21 = sumWithoutArithmeticOperators0.getSum(15086, 10081);
        int int24 = sumWithoutArithmeticOperators0.getSum(2205, 41159);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 507 + "'", int9 == 507);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 14706 + "'", int12 == 14706);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1244 + "'", int15 == 1244);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 14529 + "'", int18 == 14529);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 25167 + "'", int21 == 25167);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 43364 + "'", int24 == 43364);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6240");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 98);
        int int9 = sumWithoutArithmeticOperators0.getSum(3744, 507);
        int int12 = sumWithoutArithmeticOperators0.getSum(1280, 1180);
        int int15 = sumWithoutArithmeticOperators0.getSum(2653, 380);
        int int18 = sumWithoutArithmeticOperators0.getSum(1661, 2210);
        int int21 = sumWithoutArithmeticOperators0.getSum(7490, 9797);
        int int24 = sumWithoutArithmeticOperators0.getSum(38249, 29818);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 108 + "'", int6 == 108);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4251 + "'", int9 == 4251);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2460 + "'", int12 == 2460);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3033 + "'", int15 == 3033);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3871 + "'", int18 == 3871);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 17287 + "'", int21 == 17287);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 68067 + "'", int24 == 68067);
    }

    @Test
    public void test6241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6241");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(101, 21);
        int int18 = sumWithoutArithmeticOperators0.getSum(89, 180);
        int int21 = sumWithoutArithmeticOperators0.getSum(199, (int) '4');
        int int24 = sumWithoutArithmeticOperators0.getSum(122, 0);
        int int27 = sumWithoutArithmeticOperators0.getSum(3445, 975);
        int int30 = sumWithoutArithmeticOperators0.getSum(242, 1402);
        int int33 = sumWithoutArithmeticOperators0.getSum(872, 202);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 269 + "'", int18 == 269);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 251 + "'", int21 == 251);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 122 + "'", int24 == 122);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4420 + "'", int27 == 4420);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1644 + "'", int30 == 1644);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1074 + "'", int33 == 1074);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test6242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6242");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(125, 245);
        int int9 = sumWithoutArithmeticOperators0.getSum(6177, 4687);
        int int12 = sumWithoutArithmeticOperators0.getSum(6402, 1601);
        int int15 = sumWithoutArithmeticOperators0.getSum(18889, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(7373, 10677);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 370 + "'", int6 == 370);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10864 + "'", int9 == 10864);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8003 + "'", int12 == 8003);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18889 + "'", int15 == 18889);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18050 + "'", int18 == 18050);
    }

    @Test
    public void test6243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6243");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 101);
        int int18 = sumWithoutArithmeticOperators0.getSum(128, 1119);
        int int21 = sumWithoutArithmeticOperators0.getSum(216, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(3382, 362);
        int int27 = sumWithoutArithmeticOperators0.getSum(105, 1133);
        int int30 = sumWithoutArithmeticOperators0.getSum(8887, 14990);
        int int33 = sumWithoutArithmeticOperators0.getSum(2841, 9078);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 154 + "'", int15 == 154);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1247 + "'", int18 == 1247);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 216 + "'", int21 == 216);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3744 + "'", int24 == 3744);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1238 + "'", int27 == 1238);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 23877 + "'", int30 == 23877);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 11919 + "'", int33 == 11919);
    }

    @Test
    public void test6244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6244");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(3455, 3665);
        int int9 = sumWithoutArithmeticOperators0.getSum(5583, 27915);
        int int12 = sumWithoutArithmeticOperators0.getSum(2468, 20160);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7120 + "'", int6 == 7120);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 33498 + "'", int9 == 33498);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 22628 + "'", int12 == 22628);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6245");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(110, 376);
        int int12 = sumWithoutArithmeticOperators0.getSum(1172, 3707);
        int int15 = sumWithoutArithmeticOperators0.getSum(1688, 3319);
        int int18 = sumWithoutArithmeticOperators0.getSum(217, 592);
        int int21 = sumWithoutArithmeticOperators0.getSum(8052, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(14523, 7986);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 486 + "'", int9 == 486);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4879 + "'", int12 == 4879);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5007 + "'", int15 == 5007);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 809 + "'", int18 == 809);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8052 + "'", int21 == 8052);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 22509 + "'", int24 == 22509);
    }

    @Test
    public void test6246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6246");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(18, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) ' ', (int) (byte) 10);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 17);
        int int24 = sumWithoutArithmeticOperators0.getSum(3463, 1292);
        int int27 = sumWithoutArithmeticOperators0.getSum(763, 1709);
        int int30 = sumWithoutArithmeticOperators0.getSum(15137, 30354);
        int int33 = sumWithoutArithmeticOperators0.getSum(1147, 20713);
        int int36 = sumWithoutArithmeticOperators0.getSum(5473, 972);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 42 + "'", int18 == 42);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 17 + "'", int21 == 17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4755 + "'", int24 == 4755);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2472 + "'", int27 == 2472);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 45491 + "'", int30 == 45491);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 21860 + "'", int33 == 21860);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 6445 + "'", int36 == 6445);
    }

    @Test
    public void test6247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6247");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(51, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(375, 352);
        int int18 = sumWithoutArithmeticOperators0.getSum(215, (int) '#');
        int int21 = sumWithoutArithmeticOperators0.getSum(42, 724);
        int int24 = sumWithoutArithmeticOperators0.getSum(8052, 905);
        int int27 = sumWithoutArithmeticOperators0.getSum(626, 19792);
        int int30 = sumWithoutArithmeticOperators0.getSum(15319, 1547);
        int int33 = sumWithoutArithmeticOperators0.getSum(5708, 4369);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 727 + "'", int15 == 727);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 250 + "'", int18 == 250);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 766 + "'", int21 == 766);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8957 + "'", int24 == 8957);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20418 + "'", int27 == 20418);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 16866 + "'", int30 == 16866);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10077 + "'", int33 == 10077);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test6248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6248");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 18);
        int int9 = sumWithoutArithmeticOperators0.getSum(2339, 5977);
        int int12 = sumWithoutArithmeticOperators0.getSum(5577, 1560);
        int int15 = sumWithoutArithmeticOperators0.getSum(9656, 1425);
        int int18 = sumWithoutArithmeticOperators0.getSum(8277, 10828);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8316 + "'", int9 == 8316);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7137 + "'", int12 == 7137);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11081 + "'", int15 == 11081);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 19105 + "'", int18 == 19105);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6249");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(40, 269);
        int int6 = sumWithoutArithmeticOperators0.getSum(202, 523);
        int int9 = sumWithoutArithmeticOperators0.getSum(362, 1680);
        int int12 = sumWithoutArithmeticOperators0.getSum(9017, 5215);
        int int15 = sumWithoutArithmeticOperators0.getSum(13588, 2079);
        int int18 = sumWithoutArithmeticOperators0.getSum(4719, 453);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 309 + "'", int3 == 309);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 725 + "'", int6 == 725);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2042 + "'", int9 == 2042);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 14232 + "'", int12 == 14232);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15667 + "'", int15 == 15667);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5172 + "'", int18 == 5172);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6250");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(162, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(156, 491);
        int int21 = sumWithoutArithmeticOperators0.getSum(1291, 352);
        int int24 = sumWithoutArithmeticOperators0.getSum(2251, 1373);
        int int27 = sumWithoutArithmeticOperators0.getSum(5883, 1432);
        int int30 = sumWithoutArithmeticOperators0.getSum(265, 14692);
        int int33 = sumWithoutArithmeticOperators0.getSum(22054, 15975);
        int int36 = sumWithoutArithmeticOperators0.getSum(590, 11427);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 647 + "'", int18 == 647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1643 + "'", int21 == 1643);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3624 + "'", int24 == 3624);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7315 + "'", int27 == 7315);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 14957 + "'", int30 == 14957);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 38029 + "'", int33 == 38029);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 12017 + "'", int36 == 12017);
    }

    @Test
    public void test6251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6251");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(110, 53);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 7);
        int int24 = sumWithoutArithmeticOperators0.getSum(1187, (int) (byte) -1);
        int int27 = sumWithoutArithmeticOperators0.getSum(1738, 1934);
        int int30 = sumWithoutArithmeticOperators0.getSum(24985, 16409);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1186 + "'", int24 == 1186);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3672 + "'", int27 == 3672);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 41394 + "'", int30 == 41394);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test6252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6252");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(51, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(375, 352);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 165);
        int int21 = sumWithoutArithmeticOperators0.getSum(109, 52);
        int int24 = sumWithoutArithmeticOperators0.getSum(3707, 4847);
        int int27 = sumWithoutArithmeticOperators0.getSum(6812, 0);
        int int30 = sumWithoutArithmeticOperators0.getSum(567, 3707);
        int int33 = sumWithoutArithmeticOperators0.getSum(7353, 42);
        int int36 = sumWithoutArithmeticOperators0.getSum(1313, 4830);
        java.lang.Class<?> wildcardClass37 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 727 + "'", int15 == 727);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 165 + "'", int18 == 165);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 161 + "'", int21 == 161);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8554 + "'", int24 == 8554);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6812 + "'", int27 == 6812);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4274 + "'", int30 == 4274);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 7395 + "'", int33 == 7395);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 6143 + "'", int36 == 6143);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test6253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6253");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(19, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(51, 109);
        int int21 = sumWithoutArithmeticOperators0.getSum(311, 19);
        int int24 = sumWithoutArithmeticOperators0.getSum(3958, 1562);
        int int27 = sumWithoutArithmeticOperators0.getSum(1020, 2742);
        int int30 = sumWithoutArithmeticOperators0.getSum(17430, 34132);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 129 + "'", int15 == 129);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 160 + "'", int18 == 160);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 330 + "'", int21 == 330);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5520 + "'", int24 == 5520);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3762 + "'", int27 == 3762);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 51562 + "'", int30 == 51562);
    }

    @Test
    public void test6254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6254");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(526, 727);
        int int18 = sumWithoutArithmeticOperators0.getSum(1967, 810);
        int int21 = sumWithoutArithmeticOperators0.getSum(8, 5379);
        int int24 = sumWithoutArithmeticOperators0.getSum(5624, 1582);
        int int27 = sumWithoutArithmeticOperators0.getSum(0, 671);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1253 + "'", int15 == 1253);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2777 + "'", int18 == 2777);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5387 + "'", int21 == 5387);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7206 + "'", int24 == 7206);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 671 + "'", int27 == 671);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6255");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(11, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(286, 9);
        int int24 = sumWithoutArithmeticOperators0.getSum(110, 266);
        int int27 = sumWithoutArithmeticOperators0.getSum(1, 40);
        int int30 = sumWithoutArithmeticOperators0.getSum(56, 250);
        int int33 = sumWithoutArithmeticOperators0.getSum(321, 461);
        int int36 = sumWithoutArithmeticOperators0.getSum(3936, 1407);
        int int39 = sumWithoutArithmeticOperators0.getSum(0, 5215);
        int int42 = sumWithoutArithmeticOperators0.getSum(2727, 192);
        int int45 = sumWithoutArithmeticOperators0.getSum(18636, 5105);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 376 + "'", int24 == 376);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 41 + "'", int27 == 41);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 306 + "'", int30 == 306);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 782 + "'", int33 == 782);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5343 + "'", int36 == 5343);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 5215 + "'", int39 == 5215);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2919 + "'", int42 == 2919);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 23741 + "'", int45 == 23741);
    }

    @Test
    public void test6256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6256");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(9, 217);
        int int18 = sumWithoutArithmeticOperators0.getSum(132, 499);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 179);
        int int24 = sumWithoutArithmeticOperators0.getSum(4562, 7020);
        int int27 = sumWithoutArithmeticOperators0.getSum(1620, 45328);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 226 + "'", int15 == 226);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 631 + "'", int18 == 631);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 179 + "'", int21 == 179);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11582 + "'", int24 == 11582);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 46948 + "'", int27 == 46948);
    }

    @Test
    public void test6257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6257");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(163, 52);
        int int15 = sumWithoutArithmeticOperators0.getSum(9458, 8723);
        int int18 = sumWithoutArithmeticOperators0.getSum(26401, 14630);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 215 + "'", int12 == 215);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18181 + "'", int15 == 18181);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 41031 + "'", int18 == 41031);
    }

    @Test
    public void test6258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6258");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum((-1), 290);
        int int21 = sumWithoutArithmeticOperators0.getSum(170, (int) (byte) 10);
        int int24 = sumWithoutArithmeticOperators0.getSum(6015, 3509);
        int int27 = sumWithoutArithmeticOperators0.getSum(15301, 13774);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 289 + "'", int18 == 289);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 180 + "'", int21 == 180);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9524 + "'", int24 == 9524);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 29075 + "'", int27 == 29075);
    }

    @Test
    public void test6259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6259");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(107, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, 1106);
        int int18 = sumWithoutArithmeticOperators0.getSum(4145, 3758);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1206 + "'", int15 == 1206);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7903 + "'", int18 == 7903);
    }

    @Test
    public void test6260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6260");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(101, 21);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(243, 1133);
        int int24 = sumWithoutArithmeticOperators0.getSum(377, 734);
        int int27 = sumWithoutArithmeticOperators0.getSum(4847, 15602);
        int int30 = sumWithoutArithmeticOperators0.getSum(24091, 4075);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 162 + "'", int18 == 162);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1376 + "'", int21 == 1376);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1111 + "'", int24 == 1111);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20449 + "'", int27 == 20449);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 28166 + "'", int30 == 28166);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test6261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6261");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(17, 19);
        int int21 = sumWithoutArithmeticOperators0.getSum(1376, 54);
        int int24 = sumWithoutArithmeticOperators0.getSum(7227, 3224);
        int int27 = sumWithoutArithmeticOperators0.getSum(0, 5274);
        int int30 = sumWithoutArithmeticOperators0.getSum(16885, 2190);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1430 + "'", int21 == 1430);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10451 + "'", int24 == 10451);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5274 + "'", int27 == 5274);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 19075 + "'", int30 == 19075);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test6262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6262");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(18, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) ' ', (int) (byte) 10);
        int int21 = sumWithoutArithmeticOperators0.getSum((int) '#', 156);
        int int24 = sumWithoutArithmeticOperators0.getSum(638, 461);
        int int27 = sumWithoutArithmeticOperators0.getSum(0, 9500);
        int int30 = sumWithoutArithmeticOperators0.getSum(817, 4260);
        int int33 = sumWithoutArithmeticOperators0.getSum(3617, 924);
        int int36 = sumWithoutArithmeticOperators0.getSum(39920, 13777);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 42 + "'", int18 == 42);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 191 + "'", int21 == 191);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1099 + "'", int24 == 1099);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9500 + "'", int27 == 9500);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5077 + "'", int30 == 5077);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4541 + "'", int33 == 4541);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 53697 + "'", int36 == 53697);
    }

    @Test
    public void test6263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6263");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(11, (int) (short) 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(2589, 216);
        int int21 = sumWithoutArithmeticOperators0.getSum(570, 9265);
        int int24 = sumWithoutArithmeticOperators0.getSum(6742, 11832);
        int int27 = sumWithoutArithmeticOperators0.getSum(524, 3130);
        int int30 = sumWithoutArithmeticOperators0.getSum(3617, 6908);
        int int33 = sumWithoutArithmeticOperators0.getSum(20342, 16222);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2805 + "'", int18 == 2805);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9835 + "'", int21 == 9835);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 18574 + "'", int24 == 18574);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3654 + "'", int27 == 3654);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10525 + "'", int30 == 10525);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 36564 + "'", int33 == 36564);
    }

    @Test
    public void test6264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6264");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(110, 53);
        int int21 = sumWithoutArithmeticOperators0.getSum(162, 321);
        int int24 = sumWithoutArithmeticOperators0.getSum(407, 228);
        int int27 = sumWithoutArithmeticOperators0.getSum(317, 486);
        int int30 = sumWithoutArithmeticOperators0.getSum(651, 227);
        int int33 = sumWithoutArithmeticOperators0.getSum(542, 1357);
        int int36 = sumWithoutArithmeticOperators0.getSum(104, 14000);
        int int39 = sumWithoutArithmeticOperators0.getSum(30994, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 483 + "'", int21 == 483);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 635 + "'", int24 == 635);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 803 + "'", int27 == 803);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 878 + "'", int30 == 878);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1899 + "'", int33 == 1899);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 14104 + "'", int36 == 14104);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 30994 + "'", int39 == 30994);
    }

    @Test
    public void test6265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6265");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(9, 217);
        int int18 = sumWithoutArithmeticOperators0.getSum(132, 499);
        int int21 = sumWithoutArithmeticOperators0.getSum(4879, 2316);
        int int24 = sumWithoutArithmeticOperators0.getSum(12554, 11571);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 226 + "'", int15 == 226);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 631 + "'", int18 == 631);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7195 + "'", int21 == 7195);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 24125 + "'", int24 == 24125);
    }

    @Test
    public void test6266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6266");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 210);
        int int18 = sumWithoutArithmeticOperators0.getSum(1238, 116);
        int int21 = sumWithoutArithmeticOperators0.getSum(840, 2042);
        int int24 = sumWithoutArithmeticOperators0.getSum(17432, 51299);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 254 + "'", int15 == 254);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1354 + "'", int18 == 1354);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2882 + "'", int21 == 2882);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 68731 + "'", int24 == 68731);
    }

    @Test
    public void test6267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6267");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 101);
        int int18 = sumWithoutArithmeticOperators0.getSum(209, 107);
        int int21 = sumWithoutArithmeticOperators0.getSum(6811, 416);
        int int24 = sumWithoutArithmeticOperators0.getSum(13175, 24825);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 154 + "'", int15 == 154);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 316 + "'", int18 == 316);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7227 + "'", int21 == 7227);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 38000 + "'", int24 == 38000);
    }

    @Test
    public void test6268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6268");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 486);
        int int12 = sumWithoutArithmeticOperators0.getSum(725, 911);
        int int15 = sumWithoutArithmeticOperators0.getSum(724, 1074);
        int int18 = sumWithoutArithmeticOperators0.getSum(6167, 628);
        int int21 = sumWithoutArithmeticOperators0.getSum(2071, 7400);
        int int24 = sumWithoutArithmeticOperators0.getSum(4178, 5478);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 486 + "'", int9 == 486);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1636 + "'", int12 == 1636);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1798 + "'", int15 == 1798);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6795 + "'", int18 == 6795);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9471 + "'", int21 == 9471);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9656 + "'", int24 == 9656);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6269");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(100, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(2165, 1724);
        int int21 = sumWithoutArithmeticOperators0.getSum(4105, 542);
        int int24 = sumWithoutArithmeticOperators0.getSum(1106, 2449);
        int int27 = sumWithoutArithmeticOperators0.getSum(5534, 5475);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3889 + "'", int18 == 3889);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4647 + "'", int21 == 4647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3555 + "'", int24 == 3555);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 11009 + "'", int27 == 11009);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6270");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(11, (int) (short) 0);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int21 = sumWithoutArithmeticOperators0.getSum(665, 783);
        int int24 = sumWithoutArithmeticOperators0.getSum(1670, 822);
        int int27 = sumWithoutArithmeticOperators0.getSum(21763, 4057);
        int int30 = sumWithoutArithmeticOperators0.getSum(5604, 0);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1448 + "'", int21 == 1448);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2492 + "'", int24 == 2492);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 25820 + "'", int27 == 25820);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5604 + "'", int30 == 5604);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test6271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6271");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(101, 21);
        int int18 = sumWithoutArithmeticOperators0.getSum(89, 180);
        int int21 = sumWithoutArithmeticOperators0.getSum(199, (int) '4');
        int int24 = sumWithoutArithmeticOperators0.getSum(122, 0);
        int int27 = sumWithoutArithmeticOperators0.getSum(3445, 975);
        int int30 = sumWithoutArithmeticOperators0.getSum(242, 1402);
        int int33 = sumWithoutArithmeticOperators0.getSum(127, 61415);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 269 + "'", int18 == 269);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 251 + "'", int21 == 251);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 122 + "'", int24 == 122);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4420 + "'", int27 == 4420);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1644 + "'", int30 == 1644);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 61542 + "'", int33 == 61542);
    }

    @Test
    public void test6272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6272");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(19, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(51, 109);
        int int21 = sumWithoutArithmeticOperators0.getSum(11, 40);
        int int24 = sumWithoutArithmeticOperators0.getSum(587, 195);
        int int27 = sumWithoutArithmeticOperators0.getSum(707, 12435);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 129 + "'", int15 == 129);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 160 + "'", int18 == 160);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 51 + "'", int21 == 51);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 782 + "'", int24 == 782);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 13142 + "'", int27 == 13142);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6273");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(705, 15640);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16345 + "'", int12 == 16345);
    }

    @Test
    public void test6274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6274");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) ' ', 35);
        int int6 = sumWithoutArithmeticOperators0.getSum(1253, 1133);
        int int9 = sumWithoutArithmeticOperators0.getSum(524, 166);
        int int12 = sumWithoutArithmeticOperators0.getSum(824, 4193);
        int int15 = sumWithoutArithmeticOperators0.getSum(2887, 3238);
        int int18 = sumWithoutArithmeticOperators0.getSum(8633, 25195);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 67 + "'", int3 == 67);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2386 + "'", int6 == 2386);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 690 + "'", int9 == 690);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5017 + "'", int12 == 5017);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6125 + "'", int15 == 6125);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 33828 + "'", int18 == 33828);
    }

    @Test
    public void test6275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6275");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum((-1), 290);
        int int21 = sumWithoutArithmeticOperators0.getSum(170, (int) (byte) 10);
        int int24 = sumWithoutArithmeticOperators0.getSum(8343, 672);
        int int27 = sumWithoutArithmeticOperators0.getSum(3936, 1713);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 289 + "'", int18 == 289);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 180 + "'", int21 == 180);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9015 + "'", int24 == 9015);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5649 + "'", int27 == 5649);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6276");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 18);
        int int9 = sumWithoutArithmeticOperators0.getSum(36, 160);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 108);
        int int15 = sumWithoutArithmeticOperators0.getSum(859, 249);
        int int18 = sumWithoutArithmeticOperators0.getSum(555, 473);
        int int21 = sumWithoutArithmeticOperators0.getSum(622, 1202);
        int int24 = sumWithoutArithmeticOperators0.getSum(9450, 0);
        int int27 = sumWithoutArithmeticOperators0.getSum(905, 2394);
        int int30 = sumWithoutArithmeticOperators0.getSum(0, 5099);
        int int33 = sumWithoutArithmeticOperators0.getSum(20418, 22861);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 196 + "'", int9 == 196);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1108 + "'", int15 == 1108);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1028 + "'", int18 == 1028);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1824 + "'", int21 == 1824);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9450 + "'", int24 == 9450);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3299 + "'", int27 == 3299);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5099 + "'", int30 == 5099);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 43279 + "'", int33 == 43279);
    }

    @Test
    public void test6277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6277");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum(44, 671);
        int int12 = sumWithoutArithmeticOperators0.getSum(785, 422);
        int int15 = sumWithoutArithmeticOperators0.getSum(5352, 156);
        int int18 = sumWithoutArithmeticOperators0.getSum(23533, 4560);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 715 + "'", int9 == 715);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1207 + "'", int12 == 1207);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5508 + "'", int15 == 5508);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 28093 + "'", int18 == 28093);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6278");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 98);
        int int9 = sumWithoutArithmeticOperators0.getSum(1281, 246);
        int int12 = sumWithoutArithmeticOperators0.getSum(7460, 5352);
        int int15 = sumWithoutArithmeticOperators0.getSum(6199, 5127);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 108 + "'", int6 == 108);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1527 + "'", int9 == 1527);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12812 + "'", int12 == 12812);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11326 + "'", int15 == 11326);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6279");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(11, (int) (short) 0);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int21 = sumWithoutArithmeticOperators0.getSum(727, 460);
        int int24 = sumWithoutArithmeticOperators0.getSum(746, 705);
        int int27 = sumWithoutArithmeticOperators0.getSum(1631, 5892);
        int int30 = sumWithoutArithmeticOperators0.getSum(763, 1793);
        int int33 = sumWithoutArithmeticOperators0.getSum(2495, 9185);
        int int36 = sumWithoutArithmeticOperators0.getSum(15130, 1963);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1187 + "'", int21 == 1187);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1451 + "'", int24 == 1451);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7523 + "'", int27 == 7523);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2556 + "'", int30 == 2556);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 11680 + "'", int33 == 11680);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 17093 + "'", int36 == 17093);
    }

    @Test
    public void test6280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6280");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(19, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(51, 109);
        int int21 = sumWithoutArithmeticOperators0.getSum(11, 40);
        int int24 = sumWithoutArithmeticOperators0.getSum(587, 195);
        int int27 = sumWithoutArithmeticOperators0.getSum(15821, 925);
        int int30 = sumWithoutArithmeticOperators0.getSum(16719, 18142);
        int int33 = sumWithoutArithmeticOperators0.getSum(6059, 1111);
        int int36 = sumWithoutArithmeticOperators0.getSum(41751, 7268);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 129 + "'", int15 == 129);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 160 + "'", int18 == 160);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 51 + "'", int21 == 51);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 782 + "'", int24 == 782);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16746 + "'", int27 == 16746);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 34861 + "'", int30 == 34861);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 7170 + "'", int33 == 7170);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 49019 + "'", int36 == 49019);
    }

    @Test
    public void test6281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6281");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) '#', (int) (short) 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(52, (int) (short) 1);
        int int21 = sumWithoutArithmeticOperators0.getSum(35, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 463);
        int int27 = sumWithoutArithmeticOperators0.getSum(55, 1236);
        int int30 = sumWithoutArithmeticOperators0.getSum(465, 180);
        int int33 = sumWithoutArithmeticOperators0.getSum(195, 533);
        int int36 = sumWithoutArithmeticOperators0.getSum(249, 0);
        int int39 = sumWithoutArithmeticOperators0.getSum(315, 2187);
        int int42 = sumWithoutArithmeticOperators0.getSum(9454, 45549);
        java.lang.Class<?> wildcardClass43 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53 + "'", int18 == 53);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 463 + "'", int24 == 463);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1291 + "'", int27 == 1291);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 645 + "'", int30 == 645);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 728 + "'", int33 == 728);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 249 + "'", int36 == 249);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2502 + "'", int39 == 2502);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 55003 + "'", int42 == 55003);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test6282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6282");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(163, 36);
        int int12 = sumWithoutArithmeticOperators0.getSum(8, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(4076, 1685);
        int int18 = sumWithoutArithmeticOperators0.getSum(12379, 41424);
        int int21 = sumWithoutArithmeticOperators0.getSum(2502, 1456);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 199 + "'", int9 == 199);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5761 + "'", int15 == 5761);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53803 + "'", int18 == 53803);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3958 + "'", int21 == 3958);
    }

    @Test
    public void test6283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6283");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(16007, 3465);
        int int21 = sumWithoutArithmeticOperators0.getSum(5675, 109);
        int int24 = sumWithoutArithmeticOperators0.getSum(275, 25001);
        int int27 = sumWithoutArithmeticOperators0.getSum(39418, 3555);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 19472 + "'", int18 == 19472);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5784 + "'", int21 == 5784);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 25276 + "'", int24 == 25276);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 42973 + "'", int27 == 42973);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6284");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(11, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(286, 9);
        int int24 = sumWithoutArithmeticOperators0.getSum(156, (int) (byte) 10);
        int int27 = sumWithoutArithmeticOperators0.getSum(455, 330);
        int int30 = sumWithoutArithmeticOperators0.getSum(10, 46);
        int int33 = sumWithoutArithmeticOperators0.getSum(275, 1313);
        int int36 = sumWithoutArithmeticOperators0.getSum(216, (int) 'a');
        int int39 = sumWithoutArithmeticOperators0.getSum(2308, 2935);
        int int42 = sumWithoutArithmeticOperators0.getSum(1044, 5125);
        int int45 = sumWithoutArithmeticOperators0.getSum(2512, 9337);
        int int48 = sumWithoutArithmeticOperators0.getSum(56777, 8793);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 166 + "'", int24 == 166);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 785 + "'", int27 == 785);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 56 + "'", int30 == 56);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1588 + "'", int33 == 1588);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 313 + "'", int36 == 313);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 5243 + "'", int39 == 5243);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 6169 + "'", int42 == 6169);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 11849 + "'", int45 == 11849);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 65570 + "'", int48 == 65570);
    }

    @Test
    public void test6285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6285");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) '#', (int) (short) 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) 'a', 156);
        int int21 = sumWithoutArithmeticOperators0.getSum(238, 84);
        int int24 = sumWithoutArithmeticOperators0.getSum(638, 36);
        int int27 = sumWithoutArithmeticOperators0.getSum(33624, 25848);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 253 + "'", int18 == 253);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 322 + "'", int21 == 322);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 674 + "'", int24 == 674);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 59472 + "'", int27 == 59472);
    }

    @Test
    public void test6286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6286");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(19, 21);
        int int9 = sumWithoutArithmeticOperators0.getSum(53, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(286, 125);
        int int15 = sumWithoutArithmeticOperators0.getSum(295, 325);
        int int18 = sumWithoutArithmeticOperators0.getSum(905, 407);
        int int21 = sumWithoutArithmeticOperators0.getSum(1685, 2251);
        int int24 = sumWithoutArithmeticOperators0.getSum(3770, 5369);
        int int27 = sumWithoutArithmeticOperators0.getSum(438, 5465);
        int int30 = sumWithoutArithmeticOperators0.getSum(805, 7070);
        int int33 = sumWithoutArithmeticOperators0.getSum(26807, 6617);
        int int36 = sumWithoutArithmeticOperators0.getSum(2782, 10253);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 411 + "'", int12 == 411);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 620 + "'", int15 == 620);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1312 + "'", int18 == 1312);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3936 + "'", int21 == 3936);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9139 + "'", int24 == 9139);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5903 + "'", int27 == 5903);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7875 + "'", int30 == 7875);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 33424 + "'", int33 == 33424);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 13035 + "'", int36 == 13035);
    }

    @Test
    public void test6287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6287");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(859, 321);
        int int18 = sumWithoutArithmeticOperators0.getSum(1438, 29075);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1180 + "'", int15 == 1180);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 30513 + "'", int18 == 30513);
    }

    @Test
    public void test6288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6288");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(238, 152);
        int int15 = sumWithoutArithmeticOperators0.getSum(245, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(134, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(180, 421);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 2938);
        int int27 = sumWithoutArithmeticOperators0.getSum(3946, 354);
        int int30 = sumWithoutArithmeticOperators0.getSum(38070, 3309);
        int int33 = sumWithoutArithmeticOperators0.getSum(13044, 21604);
        int int36 = sumWithoutArithmeticOperators0.getSum(739, 9471);
        int int39 = sumWithoutArithmeticOperators0.getSum(63585, 27311);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 390 + "'", int12 == 390);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 407 + "'", int15 == 407);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 170 + "'", int18 == 170);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 601 + "'", int21 == 601);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2938 + "'", int24 == 2938);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4300 + "'", int27 == 4300);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 41379 + "'", int30 == 41379);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 34648 + "'", int33 == 34648);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10210 + "'", int36 == 10210);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 90896 + "'", int39 == 90896);
    }

    @Test
    public void test6289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6289");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) ' ', 35);
        int int6 = sumWithoutArithmeticOperators0.getSum(98, 180);
        int int9 = sumWithoutArithmeticOperators0.getSum(3025, 1245);
        int int12 = sumWithoutArithmeticOperators0.getSum(3412, 246);
        int int15 = sumWithoutArithmeticOperators0.getSum(1244, (int) '4');
        int int18 = sumWithoutArithmeticOperators0.getSum(2619, 791);
        int int21 = sumWithoutArithmeticOperators0.getSum(20666, 39108);
        int int24 = sumWithoutArithmeticOperators0.getSum(18214, 22793);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 67 + "'", int3 == 67);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 278 + "'", int6 == 278);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4270 + "'", int9 == 4270);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3658 + "'", int12 == 3658);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1296 + "'", int15 == 1296);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3410 + "'", int18 == 3410);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 59774 + "'", int21 == 59774);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 41007 + "'", int24 == 41007);
    }

    @Test
    public void test6290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6290");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(100, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(2165, 1724);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 445);
        int int24 = sumWithoutArithmeticOperators0.getSum(227, 63);
        int int27 = sumWithoutArithmeticOperators0.getSum(108, 180);
        int int30 = sumWithoutArithmeticOperators0.getSum(9205, 9820);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3889 + "'", int18 == 3889);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 445 + "'", int21 == 445);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 290 + "'", int24 == 290);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 288 + "'", int27 == 288);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 19025 + "'", int30 == 19025);
    }

    @Test
    public void test6291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6291");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(306, 180);
        int int9 = sumWithoutArithmeticOperators0.getSum(736, 1241);
        int int12 = sumWithoutArithmeticOperators0.getSum(1379, 2394);
        int int15 = sumWithoutArithmeticOperators0.getSum(13444, 807);
        int int18 = sumWithoutArithmeticOperators0.getSum(28046, 1733);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 486 + "'", int6 == 486);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1977 + "'", int9 == 1977);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3773 + "'", int12 == 3773);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 14251 + "'", int15 == 14251);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 29779 + "'", int18 == 29779);
    }

    @Test
    public void test6292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6292");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(18, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 108);
        int int21 = sumWithoutArithmeticOperators0.getSum(825, 1491);
        int int24 = sumWithoutArithmeticOperators0.getSum(2230, (int) (short) 1);
        int int27 = sumWithoutArithmeticOperators0.getSum(1047, 344);
        int int30 = sumWithoutArithmeticOperators0.getSum(44, 4152);
        int int33 = sumWithoutArithmeticOperators0.getSum(14225, 1556);
        int int36 = sumWithoutArithmeticOperators0.getSum(1490, 9483);
        int int39 = sumWithoutArithmeticOperators0.getSum(4543, 13492);
        java.lang.Class<?> wildcardClass40 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 109 + "'", int18 == 109);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2316 + "'", int21 == 2316);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2231 + "'", int24 == 2231);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1391 + "'", int27 == 1391);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4196 + "'", int30 == 4196);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 15781 + "'", int33 == 15781);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10973 + "'", int36 == 10973);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 18035 + "'", int39 == 18035);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test6293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6293");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 101);
        int int18 = sumWithoutArithmeticOperators0.getSum(209, 107);
        int int21 = sumWithoutArithmeticOperators0.getSum(40, 125);
        int int24 = sumWithoutArithmeticOperators0.getSum(10993, 16390);
        int int27 = sumWithoutArithmeticOperators0.getSum(445, 18525);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 154 + "'", int15 == 154);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 316 + "'", int18 == 316);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 165 + "'", int21 == 165);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 27383 + "'", int24 == 27383);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 18970 + "'", int27 == 18970);
    }

    @Test
    public void test6294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6294");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(651, 938);
        int int18 = sumWithoutArithmeticOperators0.getSum(265, 671);
        int int21 = sumWithoutArithmeticOperators0.getSum(3406, 1748);
        int int24 = sumWithoutArithmeticOperators0.getSum(7311, 45101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1589 + "'", int15 == 1589);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 936 + "'", int18 == 936);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5154 + "'", int21 == 5154);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52412 + "'", int24 == 52412);
    }

    @Test
    public void test6295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6295");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(19, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(51, 109);
        int int21 = sumWithoutArithmeticOperators0.getSum(2054, 7740);
        int int24 = sumWithoutArithmeticOperators0.getSum(938, 12734);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 129 + "'", int15 == 129);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 160 + "'", int18 == 160);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9794 + "'", int21 == 9794);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13672 + "'", int24 == 13672);
    }

    @Test
    public void test6296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6296");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(101, 21);
        int int18 = sumWithoutArithmeticOperators0.getSum(89, 180);
        int int21 = sumWithoutArithmeticOperators0.getSum(199, (int) '4');
        int int24 = sumWithoutArithmeticOperators0.getSum((int) '#', 1133);
        int int27 = sumWithoutArithmeticOperators0.getSum(2219, 1236);
        int int30 = sumWithoutArithmeticOperators0.getSum(18, 6437);
        int int33 = sumWithoutArithmeticOperators0.getSum(885, 3383);
        int int36 = sumWithoutArithmeticOperators0.getSum(5691, 2389);
        int int39 = sumWithoutArithmeticOperators0.getSum(4950, 710);
        int int42 = sumWithoutArithmeticOperators0.getSum(352, 1029);
        int int45 = sumWithoutArithmeticOperators0.getSum(1664, 4936);
        int int48 = sumWithoutArithmeticOperators0.getSum(2894, 1935);
        int int51 = sumWithoutArithmeticOperators0.getSum(2894, 538);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 269 + "'", int18 == 269);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 251 + "'", int21 == 251);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1168 + "'", int24 == 1168);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3455 + "'", int27 == 3455);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6455 + "'", int30 == 6455);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4268 + "'", int33 == 4268);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 8080 + "'", int36 == 8080);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 5660 + "'", int39 == 5660);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1381 + "'", int42 == 1381);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 6600 + "'", int45 == 6600);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 4829 + "'", int48 == 4829);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3432 + "'", int51 == 3432);
    }

    @Test
    public void test6297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6297");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) ' ', 35);
        int int6 = sumWithoutArithmeticOperators0.getSum(1253, 1133);
        int int9 = sumWithoutArithmeticOperators0.getSum(524, 166);
        int int12 = sumWithoutArithmeticOperators0.getSum(824, 4193);
        int int15 = sumWithoutArithmeticOperators0.getSum(4768, 987);
        int int18 = sumWithoutArithmeticOperators0.getSum(5761, 5004);
        int int21 = sumWithoutArithmeticOperators0.getSum(13166, 7594);
        int int24 = sumWithoutArithmeticOperators0.getSum(2508, 1724);
        int int27 = sumWithoutArithmeticOperators0.getSum(0, 7569);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 67 + "'", int3 == 67);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2386 + "'", int6 == 2386);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 690 + "'", int9 == 690);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5017 + "'", int12 == 5017);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5755 + "'", int15 == 5755);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10765 + "'", int18 == 10765);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20760 + "'", int21 == 20760);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4232 + "'", int24 == 4232);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7569 + "'", int27 == 7569);
    }

    @Test
    public void test6298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6298");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) -1);
        int int21 = sumWithoutArithmeticOperators0.getSum(7, (int) (short) 100);
        int int24 = sumWithoutArithmeticOperators0.getSum(786, 125);
        int int27 = sumWithoutArithmeticOperators0.getSum(452, 1394);
        int int30 = sumWithoutArithmeticOperators0.getSum(12064, 301);
        int int33 = sumWithoutArithmeticOperators0.getSum(33348, 6572);
        int int36 = sumWithoutArithmeticOperators0.getSum(1331, 24850);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 107 + "'", int21 == 107);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 911 + "'", int24 == 911);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1846 + "'", int27 == 1846);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 12365 + "'", int30 == 12365);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 39920 + "'", int33 == 39920);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 26181 + "'", int36 == 26181);
    }

    @Test
    public void test6299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6299");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(955, 89);
        int int18 = sumWithoutArithmeticOperators0.getSum(278, 725);
        int int21 = sumWithoutArithmeticOperators0.getSum(601, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(3175, 2391);
        int int27 = sumWithoutArithmeticOperators0.getSum(306, 1305);
        int int30 = sumWithoutArithmeticOperators0.getSum(3468, 22168);
        int int33 = sumWithoutArithmeticOperators0.getSum(3973, 44307);
        int int36 = sumWithoutArithmeticOperators0.getSum(37158, 21598);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1044 + "'", int15 == 1044);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1003 + "'", int18 == 1003);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 601 + "'", int21 == 601);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5566 + "'", int24 == 5566);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1611 + "'", int27 == 1611);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 25636 + "'", int30 == 25636);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 48280 + "'", int33 == 48280);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 58756 + "'", int36 == 58756);
    }

    @Test
    public void test6300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6300");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '#', 555);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 122);
        int int18 = sumWithoutArithmeticOperators0.getSum(302, 486);
        int int21 = sumWithoutArithmeticOperators0.getSum(3922, 1285);
        int int24 = sumWithoutArithmeticOperators0.getSum(5475, 14961);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 590 + "'", int12 == 590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 788 + "'", int18 == 788);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5207 + "'", int21 == 5207);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20436 + "'", int24 == 20436);
    }

    @Test
    public void test6301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6301");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(163, 17);
        int int18 = sumWithoutArithmeticOperators0.getSum(284, 271);
        int int21 = sumWithoutArithmeticOperators0.getSum(53, (int) (short) -1);
        int int24 = sumWithoutArithmeticOperators0.getSum(7594, 2707);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 180 + "'", int15 == 180);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 555 + "'", int18 == 555);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10301 + "'", int24 == 10301);
    }

    @Test
    public void test6302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6302");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(911, 432);
        int int12 = sumWithoutArithmeticOperators0.getSum(955, 382);
        int int15 = sumWithoutArithmeticOperators0.getSum(2223, 422);
        int int18 = sumWithoutArithmeticOperators0.getSum(2224, 15714);
        int int21 = sumWithoutArithmeticOperators0.getSum(4721, 28736);
        int int24 = sumWithoutArithmeticOperators0.getSum(999, 3946);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1343 + "'", int9 == 1343);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1337 + "'", int12 == 1337);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2645 + "'", int15 == 2645);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17938 + "'", int18 == 17938);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 33457 + "'", int21 == 33457);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4945 + "'", int24 == 4945);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6303");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(51, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(375, 352);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 165);
        int int21 = sumWithoutArithmeticOperators0.getSum(7084, 248);
        int int24 = sumWithoutArithmeticOperators0.getSum(2601, 3420);
        int int27 = sumWithoutArithmeticOperators0.getSum(18070, 12722);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 727 + "'", int15 == 727);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 165 + "'", int18 == 165);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7332 + "'", int21 == 7332);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6021 + "'", int24 == 6021);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 30792 + "'", int27 == 30792);
    }

    @Test
    public void test6304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6304");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(238, 152);
        int int15 = sumWithoutArithmeticOperators0.getSum(726, 3125);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 390 + "'", int12 == 390);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3851 + "'", int15 == 3851);
    }

    @Test
    public void test6305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6305");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 202);
        int int15 = sumWithoutArithmeticOperators0.getSum(2316, 1793);
        int int18 = sumWithoutArithmeticOperators0.getSum(16221, 11416);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 202 + "'", int12 == 202);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4109 + "'", int15 == 4109);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 27637 + "'", int18 == 27637);
    }

    @Test
    public void test6306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6306");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 10);
        int int15 = sumWithoutArithmeticOperators0.getSum(488, 1236);
        int int18 = sumWithoutArithmeticOperators0.getSum(1364, 364);
        int int21 = sumWithoutArithmeticOperators0.getSum(853, 3922);
        int int24 = sumWithoutArithmeticOperators0.getSum(5961, 21607);
        int int27 = sumWithoutArithmeticOperators0.getSum(671, 15406);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1724 + "'", int15 == 1724);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1728 + "'", int18 == 1728);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4775 + "'", int21 == 4775);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 27568 + "'", int24 == 27568);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16077 + "'", int27 == 16077);
    }

    @Test
    public void test6307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6307");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 84);
        int int12 = sumWithoutArithmeticOperators0.getSum(20436, 12474);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 84 + "'", int9 == 84);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32910 + "'", int12 == 32910);
    }

    @Test
    public void test6308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6308");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 210);
        int int18 = sumWithoutArithmeticOperators0.getSum(199, (int) (byte) 10);
        int int21 = sumWithoutArithmeticOperators0.getSum(251, 445);
        int int24 = sumWithoutArithmeticOperators0.getSum(7007, 71641);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 254 + "'", int15 == 254);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 209 + "'", int18 == 209);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 696 + "'", int21 == 696);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 78648 + "'", int24 == 78648);
    }

    @Test
    public void test6309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6309");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(635, 151);
        int int18 = sumWithoutArithmeticOperators0.getSum(1105, 1121);
        int int21 = sumWithoutArithmeticOperators0.getSum(2049, 975);
        int int24 = sumWithoutArithmeticOperators0.getSum(166, 1375);
        int int27 = sumWithoutArithmeticOperators0.getSum(1754, 11919);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 786 + "'", int15 == 786);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2226 + "'", int18 == 2226);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3024 + "'", int21 == 3024);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1541 + "'", int24 == 1541);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 13673 + "'", int27 == 13673);
    }

    @Test
    public void test6310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6310");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(11, (int) (short) 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(245, 56);
        int int21 = sumWithoutArithmeticOperators0.getSum(3678, 472);
        int int24 = sumWithoutArithmeticOperators0.getSum(5105, 3483);
        int int27 = sumWithoutArithmeticOperators0.getSum(243, 1169);
        int int30 = sumWithoutArithmeticOperators0.getSum(13843, 3817);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 301 + "'", int18 == 301);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4150 + "'", int21 == 4150);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8588 + "'", int24 == 8588);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1412 + "'", int27 == 1412);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 17660 + "'", int30 == 17660);
    }

    @Test
    public void test6311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6311");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(17, 200);
        int int6 = sumWithoutArithmeticOperators0.getSum(3329, 879);
        int int9 = sumWithoutArithmeticOperators0.getSum(122, 26761);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 217 + "'", int3 == 217);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4208 + "'", int6 == 4208);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 26883 + "'", int9 == 26883);
    }

    @Test
    public void test6312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6312");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(100, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 345);
        int int21 = sumWithoutArithmeticOperators0.getSum(1680, 840);
        int int24 = sumWithoutArithmeticOperators0.getSum(625, 739);
        int int27 = sumWithoutArithmeticOperators0.getSum(7925, 1192);
        int int30 = sumWithoutArithmeticOperators0.getSum(14352, 5983);
        int int33 = sumWithoutArithmeticOperators0.getSum(0, 6204);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 345 + "'", int18 == 345);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2520 + "'", int21 == 2520);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1364 + "'", int24 == 1364);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9117 + "'", int27 == 9117);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 20335 + "'", int30 == 20335);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6204 + "'", int33 == 6204);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test6313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6313");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(163, 52);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 200);
        int int18 = sumWithoutArithmeticOperators0.getSum(885, 876);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 6177);
        int int24 = sumWithoutArithmeticOperators0.getSum(76, 606);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 215 + "'", int12 == 215);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1761 + "'", int18 == 1761);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6177 + "'", int21 == 6177);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 682 + "'", int24 == 682);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6314");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 165);
        int int12 = sumWithoutArithmeticOperators0.getSum(152, 108);
        int int15 = sumWithoutArithmeticOperators0.getSum(788, 360);
        int int18 = sumWithoutArithmeticOperators0.getSum(44, 2347);
        int int21 = sumWithoutArithmeticOperators0.getSum(345, 2919);
        int int24 = sumWithoutArithmeticOperators0.getSum(7400, 2394);
        int int27 = sumWithoutArithmeticOperators0.getSum(6437, 1238);
        int int30 = sumWithoutArithmeticOperators0.getSum(14073, 3624);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 294 + "'", int9 == 294);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 260 + "'", int12 == 260);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1148 + "'", int15 == 1148);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2391 + "'", int18 == 2391);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3264 + "'", int21 == 3264);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9794 + "'", int24 == 9794);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7675 + "'", int27 == 7675);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 17697 + "'", int30 == 17697);
    }

    @Test
    public void test6315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6315");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(11, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(286, 9);
        int int24 = sumWithoutArithmeticOperators0.getSum(110, 266);
        int int27 = sumWithoutArithmeticOperators0.getSum(1, 40);
        int int30 = sumWithoutArithmeticOperators0.getSum(212, 789);
        int int33 = sumWithoutArithmeticOperators0.getSum(3882, 13451);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 376 + "'", int24 == 376);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 41 + "'", int27 == 41);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1001 + "'", int30 == 1001);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 17333 + "'", int33 == 17333);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test6316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6316");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 499);
        int int18 = sumWithoutArithmeticOperators0.getSum(6050, 2805);
        int int21 = sumWithoutArithmeticOperators0.getSum(7723, 3536);
        int int24 = sumWithoutArithmeticOperators0.getSum(23468, 22787);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 499 + "'", int15 == 499);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8855 + "'", int18 == 8855);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11259 + "'", int21 == 11259);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 46255 + "'", int24 == 46255);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6317");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(8622, 8968);
        int int6 = sumWithoutArithmeticOperators0.getSum(3595, 4810);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 17590 + "'", int3 == 17590);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8405 + "'", int6 == 8405);
    }

    @Test
    public void test6318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6318");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(11, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(286, 9);
        int int24 = sumWithoutArithmeticOperators0.getSum(110, 266);
        int int27 = sumWithoutArithmeticOperators0.getSum(1, 40);
        int int30 = sumWithoutArithmeticOperators0.getSum(1252, 3595);
        int int33 = sumWithoutArithmeticOperators0.getSum(1105, 152);
        int int36 = sumWithoutArithmeticOperators0.getSum(10528, 5154);
        int int39 = sumWithoutArithmeticOperators0.getSum(4436, 22835);
        int int42 = sumWithoutArithmeticOperators0.getSum(15511, 26616);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 376 + "'", int24 == 376);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 41 + "'", int27 == 41);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4847 + "'", int30 == 4847);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1257 + "'", int33 == 1257);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 15682 + "'", int36 == 15682);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 27271 + "'", int39 == 27271);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 42127 + "'", int42 == 42127);
    }

    @Test
    public void test6319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6319");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(11, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(286, 9);
        int int24 = sumWithoutArithmeticOperators0.getSum(110, 266);
        int int27 = sumWithoutArithmeticOperators0.getSum(1, 40);
        int int30 = sumWithoutArithmeticOperators0.getSum(56, 250);
        int int33 = sumWithoutArithmeticOperators0.getSum(321, 461);
        int int36 = sumWithoutArithmeticOperators0.getSum(51, 1262);
        int int39 = sumWithoutArithmeticOperators0.getSum(134, 8395);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 376 + "'", int24 == 376);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 41 + "'", int27 == 41);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 306 + "'", int30 == 306);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 782 + "'", int33 == 782);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1313 + "'", int36 == 1313);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 8529 + "'", int39 == 8529);
    }

    @Test
    public void test6320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6320");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(110, 376);
        int int12 = sumWithoutArithmeticOperators0.getSum(1172, 3707);
        int int15 = sumWithoutArithmeticOperators0.getSum(1688, 3319);
        int int18 = sumWithoutArithmeticOperators0.getSum(217, 592);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 1067);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 4905);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 486 + "'", int9 == 486);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4879 + "'", int12 == 4879);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5007 + "'", int15 == 5007);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 809 + "'", int18 == 809);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1067 + "'", int21 == 1067);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4905 + "'", int24 == 4905);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6321");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(160, 465);
        int int12 = sumWithoutArithmeticOperators0.getSum(9265, 697);
        int int15 = sumWithoutArithmeticOperators0.getSum(3842, 382);
        int int18 = sumWithoutArithmeticOperators0.getSum(8855, 6020);
        int int21 = sumWithoutArithmeticOperators0.getSum(3143, 24448);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 625 + "'", int9 == 625);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9962 + "'", int12 == 9962);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4224 + "'", int15 == 4224);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 14875 + "'", int18 == 14875);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27591 + "'", int21 == 27591);
    }

    @Test
    public void test6322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6322");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(162, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(596, 1623);
        int int12 = sumWithoutArithmeticOperators0.getSum(4456, 4739);
        int int15 = sumWithoutArithmeticOperators0.getSum(5408, 3218);
        int int18 = sumWithoutArithmeticOperators0.getSum(8619, 2491);
        int int21 = sumWithoutArithmeticOperators0.getSum(6951, 4890);
        int int24 = sumWithoutArithmeticOperators0.getSum(5172, 4311);
        int int27 = sumWithoutArithmeticOperators0.getSum(6659, 8642);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2219 + "'", int9 == 2219);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9195 + "'", int12 == 9195);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8626 + "'", int15 == 8626);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11110 + "'", int18 == 11110);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11841 + "'", int21 == 11841);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9483 + "'", int24 == 9483);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15301 + "'", int27 == 15301);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6323");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(238, 152);
        int int15 = sumWithoutArithmeticOperators0.getSum(245, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(134, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(170, 67);
        int int24 = sumWithoutArithmeticOperators0.getSum(2136, 3072);
        int int27 = sumWithoutArithmeticOperators0.getSum(524, 3665);
        int int30 = sumWithoutArithmeticOperators0.getSum(18, 2965);
        int int33 = sumWithoutArithmeticOperators0.getSum(65572, 16260);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 390 + "'", int12 == 390);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 407 + "'", int15 == 407);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 170 + "'", int18 == 170);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 237 + "'", int21 == 237);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5208 + "'", int24 == 5208);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4189 + "'", int27 == 4189);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2983 + "'", int30 == 2983);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 81832 + "'", int33 == 81832);
    }

    @Test
    public void test6324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6324");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(11, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(286, 9);
        int int24 = sumWithoutArithmeticOperators0.getSum(156, (int) (byte) 10);
        int int27 = sumWithoutArithmeticOperators0.getSum(455, 330);
        int int30 = sumWithoutArithmeticOperators0.getSum(200, 162);
        int int33 = sumWithoutArithmeticOperators0.getSum(1108, 151);
        int int36 = sumWithoutArithmeticOperators0.getSum(1686, 1714);
        int int39 = sumWithoutArithmeticOperators0.getSum(647, 249);
        int int42 = sumWithoutArithmeticOperators0.getSum(5983, 9992);
        int int45 = sumWithoutArithmeticOperators0.getSum(4562, 6591);
        int int48 = sumWithoutArithmeticOperators0.getSum(3328, 938);
        int int51 = sumWithoutArithmeticOperators0.getSum(622, 14677);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 166 + "'", int24 == 166);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 785 + "'", int27 == 785);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 362 + "'", int30 == 362);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1259 + "'", int33 == 1259);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3400 + "'", int36 == 3400);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 896 + "'", int39 == 896);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 15975 + "'", int42 == 15975);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 11153 + "'", int45 == 11153);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 4266 + "'", int48 == 4266);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 15299 + "'", int51 == 15299);
    }

    @Test
    public void test6325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6325");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(306, 180);
        int int9 = sumWithoutArithmeticOperators0.getSum(10458, 375);
        int int12 = sumWithoutArithmeticOperators0.getSum(3670, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(24266, 11553);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 486 + "'", int6 == 486);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10833 + "'", int9 == 10833);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3670 + "'", int12 == 3670);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35819 + "'", int15 == 35819);
    }

    @Test
    public void test6326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6326");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 18);
        int int9 = sumWithoutArithmeticOperators0.getSum(36, 160);
        int int12 = sumWithoutArithmeticOperators0.getSum(686, 2696);
        int int15 = sumWithoutArithmeticOperators0.getSum(798, 1798);
        int int18 = sumWithoutArithmeticOperators0.getSum(708, 567);
        int int21 = sumWithoutArithmeticOperators0.getSum(13148, 9649);
        int int24 = sumWithoutArithmeticOperators0.getSum(21405, 14154);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 196 + "'", int9 == 196);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3382 + "'", int12 == 3382);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2596 + "'", int15 == 2596);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1275 + "'", int18 == 1275);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 22797 + "'", int21 == 22797);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35559 + "'", int24 == 35559);
    }

    @Test
    public void test6327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6327");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(196, (int) ' ');
        int int15 = sumWithoutArithmeticOperators0.getSum(1133, 269);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 592);
        int int21 = sumWithoutArithmeticOperators0.getSum(1698, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(697, 249);
        int int27 = sumWithoutArithmeticOperators0.getSum(2427, 39527);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 228 + "'", int12 == 228);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1402 + "'", int15 == 1402);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 592 + "'", int18 == 592);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1698 + "'", int21 == 1698);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 946 + "'", int24 == 946);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 41954 + "'", int27 == 41954);
    }

    @Test
    public void test6328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6328");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(11, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(286, 9);
        int int24 = sumWithoutArithmeticOperators0.getSum(110, 266);
        int int27 = sumWithoutArithmeticOperators0.getSum(445, 18);
        int int30 = sumWithoutArithmeticOperators0.getSum(9568, 4180);
        int int33 = sumWithoutArithmeticOperators0.getSum(55145, 122);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 376 + "'", int24 == 376);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 463 + "'", int27 == 463);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 13748 + "'", int30 == 13748);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 55267 + "'", int33 == 55267);
    }

    @Test
    public void test6329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6329");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 19);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(859, 454);
        int int12 = sumWithoutArithmeticOperators0.getSum(707, 3175);
        int int15 = sumWithoutArithmeticOperators0.getSum(3165, 5377);
        int int18 = sumWithoutArithmeticOperators0.getSum(2071, 27485);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1313 + "'", int9 == 1313);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3882 + "'", int12 == 3882);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8542 + "'", int15 == 8542);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 29556 + "'", int18 == 29556);
    }

    @Test
    public void test6330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6330");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(210, 1);
        int int15 = sumWithoutArithmeticOperators0.getSum(226, 17);
        int int18 = sumWithoutArithmeticOperators0.getSum(275, 337);
        int int21 = sumWithoutArithmeticOperators0.getSum(16357, 32861);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 211 + "'", int12 == 211);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 243 + "'", int15 == 243);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 612 + "'", int18 == 612);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 49218 + "'", int21 == 49218);
    }

    @Test
    public void test6331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6331");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(321, 56);
        int int9 = sumWithoutArithmeticOperators0.getSum(189, 766);
        int int12 = sumWithoutArithmeticOperators0.getSum(290, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(1108, 725);
        int int18 = sumWithoutArithmeticOperators0.getSum(3665, 15508);
        int int21 = sumWithoutArithmeticOperators0.getSum(5302, 17483);
        int int24 = sumWithoutArithmeticOperators0.getSum(27988, 86402);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 377 + "'", int6 == 377);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 955 + "'", int9 == 955);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 311 + "'", int12 == 311);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1833 + "'", int15 == 1833);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 19173 + "'", int18 == 19173);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 22785 + "'", int21 == 22785);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 114390 + "'", int24 == 114390);
    }

    @Test
    public void test6332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6332");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(18, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) ' ', (int) (byte) 10);
        int int21 = sumWithoutArithmeticOperators0.getSum((int) '#', 156);
        int int24 = sumWithoutArithmeticOperators0.getSum(638, 461);
        int int27 = sumWithoutArithmeticOperators0.getSum(8249, 0);
        int int30 = sumWithoutArithmeticOperators0.getSum(12413, 375);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 42 + "'", int18 == 42);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 191 + "'", int21 == 191);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1099 + "'", int24 == 1099);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8249 + "'", int27 == 8249);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 12788 + "'", int30 == 12788);
    }

    @Test
    public void test6333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6333");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '#', 555);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 122);
        int int18 = sumWithoutArithmeticOperators0.getSum(10, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(89, 727);
        int int24 = sumWithoutArithmeticOperators0.getSum(822, 10876);
        int int27 = sumWithoutArithmeticOperators0.getSum(3218, 2049);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 590 + "'", int12 == 590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 46 + "'", int18 == 46);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 816 + "'", int21 == 816);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11698 + "'", int24 == 11698);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5267 + "'", int27 == 5267);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6334");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 165);
        int int12 = sumWithoutArithmeticOperators0.getSum(152, 108);
        int int15 = sumWithoutArithmeticOperators0.getSum(117, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(1428, 4263);
        int int21 = sumWithoutArithmeticOperators0.getSum(8829, 1432);
        int int24 = sumWithoutArithmeticOperators0.getSum(3355, 30710);
        int int27 = sumWithoutArithmeticOperators0.getSum(11947, 5017);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 294 + "'", int9 == 294);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 260 + "'", int12 == 260);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 117 + "'", int15 == 117);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5691 + "'", int18 == 5691);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10261 + "'", int21 == 10261);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 34065 + "'", int24 == 34065);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16964 + "'", int27 == 16964);
    }

    @Test
    public void test6335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6335");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(9, 217);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 41);
        int int21 = sumWithoutArithmeticOperators0.getSum(290, 1121);
        int int24 = sumWithoutArithmeticOperators0.getSum(22531, 11552);
        int int27 = sumWithoutArithmeticOperators0.getSum(15506, 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 226 + "'", int15 == 226);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1411 + "'", int21 == 1411);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 34083 + "'", int24 == 34083);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15552 + "'", int27 == 15552);
    }

    @Test
    public void test6336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6336");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(345, 269);
        int int9 = sumWithoutArithmeticOperators0.getSum(2456, 3564);
        int int12 = sumWithoutArithmeticOperators0.getSum(483, 14209);
        int int15 = sumWithoutArithmeticOperators0.getSum(5206, 9877);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 614 + "'", int6 == 614);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6020 + "'", int9 == 6020);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 14692 + "'", int12 == 14692);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15083 + "'", int15 == 15083);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6337");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(526, 727);
        int int18 = sumWithoutArithmeticOperators0.getSum(1967, 810);
        int int21 = sumWithoutArithmeticOperators0.getSum(321, 376);
        int int24 = sumWithoutArithmeticOperators0.getSum(6271, 22290);
        int int27 = sumWithoutArithmeticOperators0.getSum(16669, 7809);
        int int30 = sumWithoutArithmeticOperators0.getSum(12814, 3346);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1253 + "'", int15 == 1253);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2777 + "'", int18 == 2777);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 697 + "'", int21 == 697);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 28561 + "'", int24 == 28561);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 24478 + "'", int27 == 24478);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 16160 + "'", int30 == 16160);
    }

    @Test
    public void test6338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6338");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(271, 1398);
        int int18 = sumWithoutArithmeticOperators0.getSum(9454, 10970);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1669 + "'", int15 == 1669);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20424 + "'", int18 == 20424);
    }

    @Test
    public void test6339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6339");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(122, 67);
        int int18 = sumWithoutArithmeticOperators0.getSum(473, 360);
        int int21 = sumWithoutArithmeticOperators0.getSum(2512, 615);
        int int24 = sumWithoutArithmeticOperators0.getSum(2817, 1105);
        int int27 = sumWithoutArithmeticOperators0.getSum(3177, 9704);
        int int30 = sumWithoutArithmeticOperators0.getSum(931, 576);
        int int33 = sumWithoutArithmeticOperators0.getSum(5076, 15051);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 189 + "'", int15 == 189);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 833 + "'", int18 == 833);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3127 + "'", int21 == 3127);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3922 + "'", int24 == 3922);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 12881 + "'", int27 == 12881);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1507 + "'", int30 == 1507);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 20127 + "'", int33 == 20127);
    }

    @Test
    public void test6340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6340");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(217, 238);
        int int21 = sumWithoutArithmeticOperators0.getSum(156, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(593, 1374);
        int int27 = sumWithoutArithmeticOperators0.getSum(1589, 1046);
        int int30 = sumWithoutArithmeticOperators0.getSum(10945, 3595);
        int int33 = sumWithoutArithmeticOperators0.getSum(1654, 23944);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 455 + "'", int18 == 455);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 156 + "'", int21 == 156);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1967 + "'", int24 == 1967);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2635 + "'", int27 == 2635);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 14540 + "'", int30 == 14540);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 25598 + "'", int33 == 25598);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test6341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6341");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(19, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(51, 109);
        int int21 = sumWithoutArithmeticOperators0.getSum(11, 40);
        int int24 = sumWithoutArithmeticOperators0.getSum(587, 195);
        int int27 = sumWithoutArithmeticOperators0.getSum(15821, 925);
        int int30 = sumWithoutArithmeticOperators0.getSum(16719, 18142);
        int int33 = sumWithoutArithmeticOperators0.getSum(6059, 1111);
        int int36 = sumWithoutArithmeticOperators0.getSum(12534, 33135);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 129 + "'", int15 == 129);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 160 + "'", int18 == 160);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 51 + "'", int21 == 51);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 782 + "'", int24 == 782);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16746 + "'", int27 == 16746);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 34861 + "'", int30 == 34861);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 7170 + "'", int33 == 7170);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 45669 + "'", int36 == 45669);
    }

    @Test
    public void test6342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6342");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(110, 53);
        int int21 = sumWithoutArithmeticOperators0.getSum(567, 132);
        int int24 = sumWithoutArithmeticOperators0.getSum(498, 576);
        int int27 = sumWithoutArithmeticOperators0.getSum(1111, 938);
        int int30 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, 3410);
        int int33 = sumWithoutArithmeticOperators0.getSum(0, 4037);
        int int36 = sumWithoutArithmeticOperators0.getSum(3841, 1971);
        int int39 = sumWithoutArithmeticOperators0.getSum(955, 2935);
        java.lang.Class<?> wildcardClass40 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 699 + "'", int21 == 699);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1074 + "'", int24 == 1074);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2049 + "'", int27 == 2049);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3510 + "'", int30 == 3510);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4037 + "'", int33 == 4037);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5812 + "'", int36 == 5812);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3890 + "'", int39 == 3890);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test6343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6343");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(18, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) ' ', (int) (byte) 10);
        int int21 = sumWithoutArithmeticOperators0.getSum((int) '#', 156);
        int int24 = sumWithoutArithmeticOperators0.getSum(104, 4270);
        int int27 = sumWithoutArithmeticOperators0.getSum(5604, 2541);
        int int30 = sumWithoutArithmeticOperators0.getSum(377, 7637);
        int int33 = sumWithoutArithmeticOperators0.getSum(10491, 84);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 42 + "'", int18 == 42);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 191 + "'", int21 == 191);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4374 + "'", int24 == 4374);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8145 + "'", int27 == 8145);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8014 + "'", int30 == 8014);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10575 + "'", int33 == 10575);
    }

    @Test
    public void test6344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6344");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(345, 269);
        int int9 = sumWithoutArithmeticOperators0.getSum(2456, 3564);
        int int12 = sumWithoutArithmeticOperators0.getSum(7951, 1383);
        int int15 = sumWithoutArithmeticOperators0.getSum(4960, 27224);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 614 + "'", int6 == 614);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6020 + "'", int9 == 6020);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9334 + "'", int12 == 9334);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32184 + "'", int15 == 32184);
    }

    @Test
    public void test6345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6345");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(955, 89);
        int int18 = sumWithoutArithmeticOperators0.getSum(278, 725);
        int int21 = sumWithoutArithmeticOperators0.getSum(191, 421);
        int int24 = sumWithoutArithmeticOperators0.getSum(1564, 52);
        int int27 = sumWithoutArithmeticOperators0.getSum(4503, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1044 + "'", int15 == 1044);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1003 + "'", int18 == 1003);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 612 + "'", int21 == 612);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1616 + "'", int24 == 1616);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4503 + "'", int27 == 4503);
    }

    @Test
    public void test6346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6346");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(97, 168);
        int int15 = sumWithoutArithmeticOperators0.getSum(590, 2512);
        int int18 = sumWithoutArithmeticOperators0.getSum(455, 2837);
        int int21 = sumWithoutArithmeticOperators0.getSum(2456, 2965);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 4178);
        int int27 = sumWithoutArithmeticOperators0.getSum(1973, 5071);
        int int30 = sumWithoutArithmeticOperators0.getSum(0, 6550);
        int int33 = sumWithoutArithmeticOperators0.getSum(15086, 6100);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 265 + "'", int12 == 265);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3102 + "'", int15 == 3102);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3292 + "'", int18 == 3292);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5421 + "'", int21 == 5421);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4178 + "'", int24 == 4178);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7044 + "'", int27 == 7044);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6550 + "'", int30 == 6550);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 21186 + "'", int33 == 21186);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test6347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6347");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(19, 21);
        int int9 = sumWithoutArithmeticOperators0.getSum(53, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(286, 125);
        int int15 = sumWithoutArithmeticOperators0.getSum(295, 325);
        int int18 = sumWithoutArithmeticOperators0.getSum(905, 407);
        int int21 = sumWithoutArithmeticOperators0.getSum(1685, 2251);
        int int24 = sumWithoutArithmeticOperators0.getSum(3770, 5369);
        int int27 = sumWithoutArithmeticOperators0.getSum(431, 1859);
        int int30 = sumWithoutArithmeticOperators0.getSum(783, 1849);
        int int33 = sumWithoutArithmeticOperators0.getSum(576, 24275);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 411 + "'", int12 == 411);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 620 + "'", int15 == 620);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1312 + "'", int18 == 1312);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3936 + "'", int21 == 3936);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9139 + "'", int24 == 9139);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2290 + "'", int27 == 2290);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2632 + "'", int30 == 2632);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 24851 + "'", int33 == 24851);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test6348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6348");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(211, 245);
        int int15 = sumWithoutArithmeticOperators0.getSum(382, 32);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 1781);
        int int21 = sumWithoutArithmeticOperators0.getSum(11110, 302);
        int int24 = sumWithoutArithmeticOperators0.getSum(25688, 21124);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 456 + "'", int12 == 456);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 414 + "'", int15 == 414);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1781 + "'", int18 == 1781);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11412 + "'", int21 == 11412);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 46812 + "'", int24 == 46812);
    }

    @Test
    public void test6349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6349");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(859, 321);
        int int18 = sumWithoutArithmeticOperators0.getSum(576, 2810);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 7277);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 6707);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1180 + "'", int15 == 1180);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3386 + "'", int18 == 3386);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7277 + "'", int21 == 7277);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6707 + "'", int24 == 6707);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6350");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(107, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(354, 727);
        int int18 = sumWithoutArithmeticOperators0.getSum(15686, 9984);
        int int21 = sumWithoutArithmeticOperators0.getSum(2310, 3824);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1081 + "'", int15 == 1081);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 25670 + "'", int18 == 25670);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6134 + "'", int21 == 6134);
    }

    @Test
    public void test6351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6351");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(11, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(286, 9);
        int int24 = sumWithoutArithmeticOperators0.getSum(110, 266);
        int int27 = sumWithoutArithmeticOperators0.getSum(1, 40);
        int int30 = sumWithoutArithmeticOperators0.getSum(1252, 3595);
        int int33 = sumWithoutArithmeticOperators0.getSum(1105, 152);
        int int36 = sumWithoutArithmeticOperators0.getSum(10528, 5154);
        int int39 = sumWithoutArithmeticOperators0.getSum(4436, 22835);
        java.lang.Class<?> wildcardClass40 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 376 + "'", int24 == 376);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 41 + "'", int27 == 41);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4847 + "'", int30 == 4847);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1257 + "'", int33 == 1257);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 15682 + "'", int36 == 15682);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 27271 + "'", int39 == 27271);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test6352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6352");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(238, 152);
        int int15 = sumWithoutArithmeticOperators0.getSum(245, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(134, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(12054, 7160);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 390 + "'", int12 == 390);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 407 + "'", int15 == 407);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 170 + "'", int18 == 170);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19214 + "'", int21 == 19214);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6353");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(321, 56);
        int int9 = sumWithoutArithmeticOperators0.getSum(277, 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(625, 55);
        int int15 = sumWithoutArithmeticOperators0.getSum(543, 767);
        int int18 = sumWithoutArithmeticOperators0.getSum(919, 10478);
        int int21 = sumWithoutArithmeticOperators0.getSum(186, 22247);
        int int24 = sumWithoutArithmeticOperators0.getSum(10077, 26829);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 377 + "'", int6 == 377);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 377 + "'", int9 == 377);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 680 + "'", int12 == 680);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1310 + "'", int15 == 1310);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11397 + "'", int18 == 11397);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 22433 + "'", int21 == 22433);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 36906 + "'", int24 == 36906);
    }

    @Test
    public void test6354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6354");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(11, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(286, 9);
        int int24 = sumWithoutArithmeticOperators0.getSum((int) ' ', 44);
        int int27 = sumWithoutArithmeticOperators0.getSum(202, 143);
        int int30 = sumWithoutArithmeticOperators0.getSum(29678, 8853);
        int int33 = sumWithoutArithmeticOperators0.getSum(38069, 2037);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 76 + "'", int24 == 76);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 345 + "'", int27 == 345);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 38531 + "'", int30 == 38531);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 40106 + "'", int33 == 40106);
    }

    @Test
    public void test6355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6355");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(162, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(156, 491);
        int int21 = sumWithoutArithmeticOperators0.getSum(41, 1128);
        int int24 = sumWithoutArithmeticOperators0.getSum(25148, 25100);
        int int27 = sumWithoutArithmeticOperators0.getSum(2611, 5740);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 647 + "'", int18 == 647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1169 + "'", int21 == 1169);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 50248 + "'", int24 == 50248);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8351 + "'", int27 == 8351);
    }

    @Test
    public void test6356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6356");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(686, 1579);
        int int12 = sumWithoutArithmeticOperators0.getSum(8, 1244);
        int int15 = sumWithoutArithmeticOperators0.getSum(24579, 14890);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2265 + "'", int9 == 2265);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1252 + "'", int12 == 1252);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 39469 + "'", int15 == 39469);
    }

    @Test
    public void test6357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6357");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(97, 168);
        int int15 = sumWithoutArithmeticOperators0.getSum(590, 2512);
        int int18 = sumWithoutArithmeticOperators0.getSum(455, 2837);
        int int21 = sumWithoutArithmeticOperators0.getSum(2456, 2965);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 4178);
        int int27 = sumWithoutArithmeticOperators0.getSum(7091, 196);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 265 + "'", int12 == 265);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3102 + "'", int15 == 3102);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3292 + "'", int18 == 3292);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5421 + "'", int21 == 5421);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4178 + "'", int24 == 4178);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7287 + "'", int27 == 7287);
    }
}

