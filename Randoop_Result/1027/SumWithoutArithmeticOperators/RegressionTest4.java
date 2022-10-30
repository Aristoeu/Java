package SumWithoutArithmeticOperators;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(574, 1268);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 161 + "'", int15 == 161);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1842 + "'", int18 == 1842);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
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
        int int39 = sumWithoutArithmeticOperators0.getSum(1701, 1231);
        int int42 = sumWithoutArithmeticOperators0.getSum(14259, 1689);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2932 + "'", int39 == 2932);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 15948 + "'", int42 == 15948);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(217, 238);
        int int21 = sumWithoutArithmeticOperators0.getSum(199, 427);
        int int24 = sumWithoutArithmeticOperators0.getSum(9185, 6164);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 455 + "'", int18 == 455);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 626 + "'", int21 == 626);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15349 + "'", int24 == 15349);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) '#', (int) (short) 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(52, (int) (short) 1);
        int int21 = sumWithoutArithmeticOperators0.getSum(3297, 168);
        int int24 = sumWithoutArithmeticOperators0.getSum(9835, 575);
        int int27 = sumWithoutArithmeticOperators0.getSum(3104, 746);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53 + "'", int18 == 53);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3465 + "'", int21 == 3465);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10410 + "'", int24 == 10410);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3850 + "'", int27 == 3850);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 18);
        int int9 = sumWithoutArithmeticOperators0.getSum(36, 160);
        int int12 = sumWithoutArithmeticOperators0.getSum(1623, 760);
        int int15 = sumWithoutArithmeticOperators0.getSum(2817, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(6543, 9992);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 196 + "'", int9 == 196);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2383 + "'", int12 == 2383);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2817 + "'", int15 == 2817);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16535 + "'", int18 == 16535);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(40, 269);
        int int6 = sumWithoutArithmeticOperators0.getSum(202, 523);
        int int9 = sumWithoutArithmeticOperators0.getSum(286, 1337);
        int int12 = sumWithoutArithmeticOperators0.getSum(1313, 217);
        int int15 = sumWithoutArithmeticOperators0.getSum(1268, 8554);
        int int18 = sumWithoutArithmeticOperators0.getSum(14540, 659);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 309 + "'", int3 == 309);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 725 + "'", int6 == 725);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1623 + "'", int9 == 1623);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1530 + "'", int12 == 1530);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9822 + "'", int15 == 9822);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15199 + "'", int18 == 15199);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(211, 245);
        int int15 = sumWithoutArithmeticOperators0.getSum(382, 32);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 1781);
        int int21 = sumWithoutArithmeticOperators0.getSum(11110, 302);
        int int24 = sumWithoutArithmeticOperators0.getSum(3124, 11882);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 456 + "'", int12 == 456);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 414 + "'", int15 == 414);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1781 + "'", int18 == 1781);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11412 + "'", int21 == 11412);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15006 + "'", int24 == 15006);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(101, 21);
        int int18 = sumWithoutArithmeticOperators0.getSum(89, 180);
        int int21 = sumWithoutArithmeticOperators0.getSum(199, (int) '4');
        int int24 = sumWithoutArithmeticOperators0.getSum(122, 0);
        int int27 = sumWithoutArithmeticOperators0.getSum(508, 2656);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 269 + "'", int18 == 269);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 251 + "'", int21 == 251);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 122 + "'", int24 == 122);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3164 + "'", int27 == 3164);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(227, 250);
        int int39 = sumWithoutArithmeticOperators0.getSum(4177, 44);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 477 + "'", int36 == 477);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4221 + "'", int39 == 4221);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(122, 67);
        int int18 = sumWithoutArithmeticOperators0.getSum(294, 213);
        int int21 = sumWithoutArithmeticOperators0.getSum(1329, 10223);
        int int24 = sumWithoutArithmeticOperators0.getSum(2750, 1447);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 189 + "'", int15 == 189);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 507 + "'", int18 == 507);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11552 + "'", int21 == 11552);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4197 + "'", int24 == 4197);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum(1245, 708);
        int int15 = sumWithoutArithmeticOperators0.getSum(3400, 278);
        int int18 = sumWithoutArithmeticOperators0.getSum(1096, 3672);
        int int21 = sumWithoutArithmeticOperators0.getSum(363, 4810);
        int int24 = sumWithoutArithmeticOperators0.getSum(5577, 14767);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1953 + "'", int12 == 1953);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3678 + "'", int15 == 3678);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4768 + "'", int18 == 4768);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5173 + "'", int21 == 5173);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20344 + "'", int24 == 20344);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(635, 151);
        int int18 = sumWithoutArithmeticOperators0.getSum(1105, 1121);
        int int21 = sumWithoutArithmeticOperators0.getSum(664, 1541);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 786 + "'", int15 == 786);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2226 + "'", int18 == 2226);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2205 + "'", int21 == 2205);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(1636, 245);
        int int15 = sumWithoutArithmeticOperators0.getSum(2146, 5583);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1881 + "'", int12 == 1881);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7729 + "'", int15 == 7729);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 199);
        int int12 = sumWithoutArithmeticOperators0.getSum(324, 614);
        int int15 = sumWithoutArithmeticOperators0.getSum(498, 461);
        int int18 = sumWithoutArithmeticOperators0.getSum(4671, 1001);
        int int21 = sumWithoutArithmeticOperators0.getSum(1909, 10223);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 199 + "'", int9 == 199);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 938 + "'", int12 == 938);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 959 + "'", int15 == 959);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5672 + "'", int18 == 5672);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12132 + "'", int21 == 12132);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(196, (int) ' ');
        int int15 = sumWithoutArithmeticOperators0.getSum(266, 853);
        int int18 = sumWithoutArithmeticOperators0.getSum(46, 101);
        int int21 = sumWithoutArithmeticOperators0.getSum(52, 696);
        int int24 = sumWithoutArithmeticOperators0.getSum(3445, 1764);
        int int27 = sumWithoutArithmeticOperators0.getSum(42, 1374);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 228 + "'", int12 == 228);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1119 + "'", int15 == 1119);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 147 + "'", int18 == 147);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 748 + "'", int21 == 748);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5209 + "'", int24 == 5209);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1416 + "'", int27 == 1416);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 18);
        int int9 = sumWithoutArithmeticOperators0.getSum(36, 160);
        int int12 = sumWithoutArithmeticOperators0.getSum(686, 2696);
        int int15 = sumWithoutArithmeticOperators0.getSum(798, 1798);
        int int18 = sumWithoutArithmeticOperators0.getSum(2426, 696);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 196 + "'", int9 == 196);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3382 + "'", int12 == 3382);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2596 + "'", int15 == 2596);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3122 + "'", int18 == 3122);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(18, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 108);
        int int21 = sumWithoutArithmeticOperators0.getSum(17, 266);
        int int24 = sumWithoutArithmeticOperators0.getSum(543, 1001);
        int int27 = sumWithoutArithmeticOperators0.getSum(1953, 1096);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 109 + "'", int18 == 109);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 283 + "'", int21 == 283);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1544 + "'", int24 == 1544);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3049 + "'", int27 == 3049);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(51, 66);
        int int15 = sumWithoutArithmeticOperators0.getSum(211, 488);
        int int18 = sumWithoutArithmeticOperators0.getSum(266, 1111);
        int int21 = sumWithoutArithmeticOperators0.getSum(13255, 238);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 117 + "'", int12 == 117);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 699 + "'", int15 == 699);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1377 + "'", int18 == 1377);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13493 + "'", int21 == 13493);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(345, 269);
        int int9 = sumWithoutArithmeticOperators0.getSum(221, 490);
        int int12 = sumWithoutArithmeticOperators0.getSum(785, 2512);
        int int15 = sumWithoutArithmeticOperators0.getSum(210, 2924);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 614 + "'", int6 == 614);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 711 + "'", int9 == 711);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3297 + "'", int12 == 3297);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3134 + "'", int15 == 3134);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(3397, 129);
        int int36 = sumWithoutArithmeticOperators0.getSum(3095, 466);
        int int39 = sumWithoutArithmeticOperators0.getSum(876, 847);
        int int42 = sumWithoutArithmeticOperators0.getSum(4650, 1253);
        java.lang.Class<?> wildcardClass43 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3526 + "'", int33 == 3526);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3561 + "'", int36 == 3561);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1723 + "'", int39 == 1723);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 5903 + "'", int42 == 5903);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(238, 152);
        int int15 = sumWithoutArithmeticOperators0.getSum(245, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(134, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(422, 33);
        int int24 = sumWithoutArithmeticOperators0.getSum(524, 1398);
        int int27 = sumWithoutArithmeticOperators0.getSum(243, 5189);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 390 + "'", int12 == 390);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 407 + "'", int15 == 407);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 170 + "'", int18 == 170);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 455 + "'", int21 == 455);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1922 + "'", int24 == 1922);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5432 + "'", int27 == 5432);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 18);
        int int9 = sumWithoutArithmeticOperators0.getSum(36, 160);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 108);
        int int15 = sumWithoutArithmeticOperators0.getSum(859, 249);
        int int18 = sumWithoutArithmeticOperators0.getSum(555, 473);
        int int21 = sumWithoutArithmeticOperators0.getSum(622, 1202);
        int int24 = sumWithoutArithmeticOperators0.getSum(9450, 0);
        int int27 = sumWithoutArithmeticOperators0.getSum(4542, 16327);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 196 + "'", int9 == 196);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1108 + "'", int15 == 1108);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1028 + "'", int18 == 1028);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1824 + "'", int21 == 1824);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9450 + "'", int24 == 9450);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20869 + "'", int27 == 20869);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
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
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1313 + "'", int9 == 1313);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1714 + "'", int12 == 1714);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 597 + "'", int15 == 597);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853 + "'", int18 == 853);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2050 + "'", int21 == 2050);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 191 + "'", int24 == 191);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16357 + "'", int27 == 16357);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(321, 56);
        int int9 = sumWithoutArithmeticOperators0.getSum(117, 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(715, 471);
        int int15 = sumWithoutArithmeticOperators0.getSum(4177, 6930);
        int int18 = sumWithoutArithmeticOperators0.getSum(3316, 1059);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 377 + "'", int6 == 377);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 217 + "'", int9 == 217);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1186 + "'", int12 == 1186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11107 + "'", int15 == 11107);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4375 + "'", int18 == 4375);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(162, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(156, 491);
        int int21 = sumWithoutArithmeticOperators0.getSum(41, 1128);
        int int24 = sumWithoutArithmeticOperators0.getSum(1297, 34);
        int int27 = sumWithoutArithmeticOperators0.getSum(0, 1171);
        int int30 = sumWithoutArithmeticOperators0.getSum(2518, 3551);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 647 + "'", int18 == 647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1169 + "'", int21 == 1169);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1331 + "'", int24 == 1331);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1171 + "'", int27 == 1171);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6069 + "'", int30 == 6069);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(526, 727);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 1511);
        int int21 = sumWithoutArithmeticOperators0.getSum(6391, 789);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1253 + "'", int15 == 1253);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1511 + "'", int18 == 1511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7180 + "'", int21 == 7180);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(2590, 66);
        java.lang.Class<?> wildcardClass4 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2656 + "'", int3 == 2656);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(352, 375);
        int int18 = sumWithoutArithmeticOperators0.getSum(122, 1327);
        int int21 = sumWithoutArithmeticOperators0.getSum(1376, 1337);
        int int24 = sumWithoutArithmeticOperators0.getSum(763, 2762);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 727 + "'", int15 == 727);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1449 + "'", int18 == 1449);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2713 + "'", int21 == 2713);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3525 + "'", int24 == 3525);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(162, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(596, 1623);
        int int12 = sumWithoutArithmeticOperators0.getSum(4456, 4739);
        int int15 = sumWithoutArithmeticOperators0.getSum(5408, 3218);
        int int18 = sumWithoutArithmeticOperators0.getSum(8619, 2491);
        int int21 = sumWithoutArithmeticOperators0.getSum(5279, 7516);
        int int24 = sumWithoutArithmeticOperators0.getSum(3134, 863);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2219 + "'", int9 == 2219);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9195 + "'", int12 == 9195);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8626 + "'", int15 == 8626);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11110 + "'", int18 == 11110);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12795 + "'", int21 == 12795);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3997 + "'", int24 == 3997);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(97, 168);
        int int15 = sumWithoutArithmeticOperators0.getSum(590, 2512);
        int int18 = sumWithoutArithmeticOperators0.getSum(507, 785);
        int int21 = sumWithoutArithmeticOperators0.getSum(1186, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(9102, 11892);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 265 + "'", int12 == 265);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3102 + "'", int15 == 3102);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1292 + "'", int18 == 1292);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1186 + "'", int21 == 1186);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20994 + "'", int24 == 20994);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 89);
        int int12 = sumWithoutArithmeticOperators0.getSum(925, 5036);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 90 + "'", int9 == 90);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5961 + "'", int12 == 5961);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(100, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 345);
        int int21 = sumWithoutArithmeticOperators0.getSum(1680, 840);
        int int24 = sumWithoutArithmeticOperators0.getSum(625, 739);
        int int27 = sumWithoutArithmeticOperators0.getSum(824, 623);
        int int30 = sumWithoutArithmeticOperators0.getSum(2938, 4415);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 345 + "'", int18 == 345);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2520 + "'", int21 == 2520);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1364 + "'", int24 == 1364);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1447 + "'", int27 == 1447);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7353 + "'", int30 == 7353);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum(4687, (int) (short) 100);
        java.lang.Class<?> wildcardClass10 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4787 + "'", int9 == 4787);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(40, 269);
        int int6 = sumWithoutArithmeticOperators0.getSum(6164, 1430);
        int int9 = sumWithoutArithmeticOperators0.getSum(3569, 1512);
        int int12 = sumWithoutArithmeticOperators0.getSum(637, 627);
        int int15 = sumWithoutArithmeticOperators0.getSum(2231, 3410);
        int int18 = sumWithoutArithmeticOperators0.getSum(26783, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 309 + "'", int3 == 309);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7594 + "'", int6 == 7594);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5081 + "'", int9 == 5081);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1264 + "'", int12 == 1264);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5641 + "'", int15 == 5641);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 26783 + "'", int18 == 26783);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '#', 555);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 122);
        int int18 = sumWithoutArithmeticOperators0.getSum(1922, 781);
        int int21 = sumWithoutArithmeticOperators0.getSum(1744, 925);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 590 + "'", int12 == 590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2703 + "'", int18 == 2703);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2669 + "'", int21 == 2669);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) ' ', 35);
        int int6 = sumWithoutArithmeticOperators0.getSum(1253, 1133);
        int int9 = sumWithoutArithmeticOperators0.getSum(524, 166);
        int int12 = sumWithoutArithmeticOperators0.getSum(2986, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(283, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(10355, 18);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 67 + "'", int3 == 67);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2386 + "'", int6 == 2386);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 690 + "'", int9 == 690);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2986 + "'", int12 == 2986);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 283 + "'", int15 == 283);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10373 + "'", int18 == 10373);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(18, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) ' ', (int) (byte) 10);
        int int21 = sumWithoutArithmeticOperators0.getSum(711, 2520);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 42 + "'", int18 == 42);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3231 + "'", int21 == 3231);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(201, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(1848, 1744);
        int int18 = sumWithoutArithmeticOperators0.getSum(4380, 10062);
        int int21 = sumWithoutArithmeticOperators0.getSum(5432, 22942);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 212 + "'", int12 == 212);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3592 + "'", int15 == 3592);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 14442 + "'", int18 == 14442);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 28374 + "'", int21 == 28374);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(162, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(100, 32);
        int int21 = sumWithoutArithmeticOperators0.getSum(260, 11);
        int int24 = sumWithoutArithmeticOperators0.getSum(3889, 3383);
        int int27 = sumWithoutArithmeticOperators0.getSum(4677, 1480);
        int int30 = sumWithoutArithmeticOperators0.getSum(2619, 41);
        int int33 = sumWithoutArithmeticOperators0.getSum(122, 14842);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 132 + "'", int18 == 132);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 271 + "'", int21 == 271);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7272 + "'", int24 == 7272);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6157 + "'", int27 == 6157);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2660 + "'", int30 == 2660);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 14964 + "'", int33 == 14964);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(9, 217);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 41);
        int int21 = sumWithoutArithmeticOperators0.getSum(290, 1121);
        int int24 = sumWithoutArithmeticOperators0.getSum(166, 597);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 226 + "'", int15 == 226);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1411 + "'", int21 == 1411);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 763 + "'", int24 == 763);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(18, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) ' ', (int) (byte) 10);
        int int21 = sumWithoutArithmeticOperators0.getSum((int) '#', 156);
        int int24 = sumWithoutArithmeticOperators0.getSum(638, 461);
        int int27 = sumWithoutArithmeticOperators0.getSum(473, 1191);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 42 + "'", int18 == 42);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 191 + "'", int21 == 191);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1099 + "'", int24 == 1099);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1664 + "'", int27 == 1664);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(19, 21);
        int int9 = sumWithoutArithmeticOperators0.getSum(53, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(286, 125);
        int int15 = sumWithoutArithmeticOperators0.getSum(295, 325);
        int int18 = sumWithoutArithmeticOperators0.getSum(905, 407);
        int int21 = sumWithoutArithmeticOperators0.getSum(1685, 2251);
        int int24 = sumWithoutArithmeticOperators0.getSum(6409, 1592);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 411 + "'", int12 == 411);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 620 + "'", int15 == 620);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1312 + "'", int18 == 1312);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3936 + "'", int21 == 3936);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8001 + "'", int24 == 8001);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(100, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(722, 789);
        int int21 = sumWithoutArithmeticOperators0.getSum(567, 1171);
        int int24 = sumWithoutArithmeticOperators0.getSum(888, 1511);
        int int27 = sumWithoutArithmeticOperators0.getSum(281, 650);
        int int30 = sumWithoutArithmeticOperators0.getSum(848, 1376);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1511 + "'", int18 == 1511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1738 + "'", int21 == 1738);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2399 + "'", int24 == 2399);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 931 + "'", int27 == 931);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2224 + "'", int30 == 2224);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum(54, 680);
        int int15 = sumWithoutArithmeticOperators0.getSum(978, 165);
        int int18 = sumWithoutArithmeticOperators0.getSum(7558, 3024);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(4859, 2631);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 734 + "'", int12 == 734);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1143 + "'", int15 == 1143);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10582 + "'", int18 == 10582);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7490 + "'", int24 == 7490);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(19, 21);
        int int9 = sumWithoutArithmeticOperators0.getSum(53, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(4089, 414);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4503 + "'", int12 == 4503);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 165);
        int int12 = sumWithoutArithmeticOperators0.getSum(152, 108);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 55);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, 785);
        int int21 = sumWithoutArithmeticOperators0.getSum(1046, 810);
        int int24 = sumWithoutArithmeticOperators0.getSum(733, 2108);
        int int27 = sumWithoutArithmeticOperators0.getSum(1410, 570);
        int int30 = sumWithoutArithmeticOperators0.getSum(878, 1364);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 294 + "'", int9 == 294);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 260 + "'", int12 == 260);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 54 + "'", int15 == 54);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 786 + "'", int18 == 786);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1856 + "'", int21 == 1856);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2841 + "'", int24 == 2841);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1980 + "'", int27 == 1980);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2242 + "'", int30 == 2242);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(110, 53);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 7);
        int int24 = sumWithoutArithmeticOperators0.getSum(1187, (int) (byte) -1);
        int int27 = sumWithoutArithmeticOperators0.getSum(265, 498);
        int int30 = sumWithoutArithmeticOperators0.getSum(674, 271);
        int int33 = sumWithoutArithmeticOperators0.getSum(2358, 3619);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1186 + "'", int24 == 1186);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 763 + "'", int27 == 763);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 945 + "'", int30 == 945);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5977 + "'", int33 == 5977);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1106 + "'", int18 == 1106);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5432 + "'", int21 == 5432);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3751 + "'", int24 == 3751);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6123 + "'", int27 == 6123);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(1291, 1384);
        int int18 = sumWithoutArithmeticOperators0.getSum(938, 414);
        int int21 = sumWithoutArithmeticOperators0.getSum(9086, 6044);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2675 + "'", int15 == 2675);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1352 + "'", int18 == 1352);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15130 + "'", int21 == 15130);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(725, 42);
        int int15 = sumWithoutArithmeticOperators0.getSum(269, 368);
        int int18 = sumWithoutArithmeticOperators0.getSum(7925, 629);
        int int21 = sumWithoutArithmeticOperators0.getSum(4456, 1670);
        int int24 = sumWithoutArithmeticOperators0.getSum(950, 13656);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 767 + "'", int12 == 767);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 637 + "'", int15 == 637);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8554 + "'", int18 == 8554);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6126 + "'", int21 == 6126);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14606 + "'", int24 == 14606);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) ' ', 9);
        int int15 = sumWithoutArithmeticOperators0.getSum(253, 483);
        int int18 = sumWithoutArithmeticOperators0.getSum(243, 125);
        int int21 = sumWithoutArithmeticOperators0.getSum(3997, 2085);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 41 + "'", int12 == 41);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 736 + "'", int15 == 736);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 368 + "'", int18 == 368);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6082 + "'", int21 == 6082);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(17, 200);
        int int6 = sumWithoutArithmeticOperators0.getSum(853, 427);
        int int9 = sumWithoutArithmeticOperators0.getSum(1171, 254);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1430);
        int int15 = sumWithoutArithmeticOperators0.getSum(7466, 1114);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 217 + "'", int3 == 217);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1280 + "'", int6 == 1280);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1425 + "'", int9 == 1425);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1440 + "'", int12 == 1440);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8580 + "'", int15 == 8580);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(11, (int) (short) 0);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int21 = sumWithoutArithmeticOperators0.getSum(727, 460);
        int int24 = sumWithoutArithmeticOperators0.getSum(2383, 445);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1187 + "'", int21 == 1187);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2828 + "'", int24 == 2828);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(18, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(686, 125);
        int int21 = sumWithoutArithmeticOperators0.getSum(3080, 12178);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 811 + "'", int18 == 811);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15258 + "'", int21 == 15258);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 89);
        int int12 = sumWithoutArithmeticOperators0.getSum(1023, 665);
        int int15 = sumWithoutArithmeticOperators0.getSum(202, 9193);
        int int18 = sumWithoutArithmeticOperators0.getSum(486, 14708);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 90 + "'", int9 == 90);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1688 + "'", int12 == 1688);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9395 + "'", int15 == 9395);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15194 + "'", int18 == 15194);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(9519, 868);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10387 + "'", int15 == 10387);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
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
        java.lang.Class<?> wildcardClass37 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(266, 295);
        int int15 = sumWithoutArithmeticOperators0.getSum(786, 524);
        int int18 = sumWithoutArithmeticOperators0.getSum(73, 674);
        int int21 = sumWithoutArithmeticOperators0.getSum(1743, 6866);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 561 + "'", int12 == 561);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1310 + "'", int15 == 1310);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 747 + "'", int18 == 747);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8609 + "'", int21 == 8609);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(11, (int) (short) 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(1856, 1670);
        int int21 = sumWithoutArithmeticOperators0.getSum(14476, 1275);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3526 + "'", int18 == 3526);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15751 + "'", int21 == 15751);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(210, 1);
        int int15 = sumWithoutArithmeticOperators0.getSum(226, 17);
        int int18 = sumWithoutArithmeticOperators0.getSum(275, 337);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 211 + "'", int12 == 211);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 243 + "'", int15 == 243);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 612 + "'", int18 == 612);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum(54, 680);
        int int15 = sumWithoutArithmeticOperators0.getSum(978, 165);
        int int18 = sumWithoutArithmeticOperators0.getSum(3658, 734);
        int int21 = sumWithoutArithmeticOperators0.getSum(1377, 3825);
        int int24 = sumWithoutArithmeticOperators0.getSum(20067, 2683);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 734 + "'", int12 == 734);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1143 + "'", int15 == 1143);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4392 + "'", int18 == 4392);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5202 + "'", int21 == 5202);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 22750 + "'", int24 == 22750);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) ' ', 35);
        int int6 = sumWithoutArithmeticOperators0.getSum(98, 180);
        int int9 = sumWithoutArithmeticOperators0.getSum(452, 396);
        java.lang.Class<?> wildcardClass10 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 67 + "'", int3 == 67);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 278 + "'", int6 == 278);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 848 + "'", int9 == 848);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(51, 422);
        int int18 = sumWithoutArithmeticOperators0.getSum(360, 526);
        int int21 = sumWithoutArithmeticOperators0.getSum(2219, 1376);
        int int24 = sumWithoutArithmeticOperators0.getSum(1044, 2498);
        int int27 = sumWithoutArithmeticOperators0.getSum(2541, 12027);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 473 + "'", int15 == 473);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 886 + "'", int18 == 886);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3595 + "'", int21 == 3595);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3542 + "'", int24 == 3542);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 14568 + "'", int27 == 14568);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(196, (int) ' ');
        int int15 = sumWithoutArithmeticOperators0.getSum(1133, 269);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 592);
        int int21 = sumWithoutArithmeticOperators0.getSum(1698, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(697, 249);
        int int27 = sumWithoutArithmeticOperators0.getSum(736, 2593);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 228 + "'", int12 == 228);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1402 + "'", int15 == 1402);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 592 + "'", int18 == 592);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1698 + "'", int21 == 1698);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 946 + "'", int24 == 946);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3329 + "'", int27 == 3329);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(2818, 3264);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 376 + "'", int24 == 376);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 463 + "'", int27 == 463);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6082 + "'", int30 == 6082);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(3397, 129);
        int int36 = sumWithoutArithmeticOperators0.getSum(3095, 466);
        int int39 = sumWithoutArithmeticOperators0.getSum(876, 847);
        int int42 = sumWithoutArithmeticOperators0.getSum(6826, 16867);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3526 + "'", int33 == 3526);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3561 + "'", int36 == 3561);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1723 + "'", int39 == 1723);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 23693 + "'", int42 == 23693);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(266, 295);
        int int15 = sumWithoutArithmeticOperators0.getSum(8969, 1028);
        int int18 = sumWithoutArithmeticOperators0.getSum(11086, 4750);
        int int21 = sumWithoutArithmeticOperators0.getSum(2432, 8829);
        int int24 = sumWithoutArithmeticOperators0.getSum(523, 2841);
        int int27 = sumWithoutArithmeticOperators0.getSum(15714, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 561 + "'", int12 == 561);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9997 + "'", int15 == 9997);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15836 + "'", int18 == 15836);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11261 + "'", int21 == 11261);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3364 + "'", int24 == 3364);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15714 + "'", int27 == 15714);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(101, 21);
        int int18 = sumWithoutArithmeticOperators0.getSum(89, 180);
        int int21 = sumWithoutArithmeticOperators0.getSum(2054, 10910);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 269 + "'", int18 == 269);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12964 + "'", int21 == 12964);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(110, 53);
        int int21 = sumWithoutArithmeticOperators0.getSum(51, 215);
        int int24 = sumWithoutArithmeticOperators0.getSum(66, 1134);
        int int27 = sumWithoutArithmeticOperators0.getSum(932, 4164);
        int int30 = sumWithoutArithmeticOperators0.getSum(16708, 0);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 266 + "'", int21 == 266);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1200 + "'", int24 == 1200);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5096 + "'", int27 == 5096);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 16708 + "'", int30 == 16708);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(9, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(215, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(4742, 313);
        int int21 = sumWithoutArithmeticOperators0.getSum(1351, 6600);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 325 + "'", int15 == 325);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5055 + "'", int18 == 5055);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7951 + "'", int21 == 7951);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(97, 168);
        int int15 = sumWithoutArithmeticOperators0.getSum(3707, 830);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 1101);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 265 + "'", int12 == 265);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4537 + "'", int15 == 4537);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1101 + "'", int18 == 1101);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 210);
        int int18 = sumWithoutArithmeticOperators0.getSum(199, (int) (byte) 10);
        int int21 = sumWithoutArithmeticOperators0.getSum(9337, 8766);
        int int24 = sumWithoutArithmeticOperators0.getSum(1097, 2162);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 254 + "'", int15 == 254);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 209 + "'", int18 == 209);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18103 + "'", int21 == 18103);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3259 + "'", int24 == 3259);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(40, 269);
        int int6 = sumWithoutArithmeticOperators0.getSum(6164, 1430);
        int int9 = sumWithoutArithmeticOperators0.getSum(542, 23135);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 309 + "'", int3 == 309);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7594 + "'", int6 == 7594);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 23677 + "'", int9 == 23677);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 499);
        int int18 = sumWithoutArithmeticOperators0.getSum(6050, 2805);
        int int21 = sumWithoutArithmeticOperators0.getSum(1169, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(4198, (int) (byte) -1);
        int int27 = sumWithoutArithmeticOperators0.getSum(11347, 680);
        int int30 = sumWithoutArithmeticOperators0.getSum(7852, 1001);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 499 + "'", int15 == 499);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8855 + "'", int18 == 8855);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1169 + "'", int21 == 1169);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4197 + "'", int24 == 4197);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 12027 + "'", int27 == 12027);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8853 + "'", int30 == 8853);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(11, (int) (short) 0);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int21 = sumWithoutArithmeticOperators0.getSum(727, 460);
        int int24 = sumWithoutArithmeticOperators0.getSum(1556, 2767);
        int int27 = sumWithoutArithmeticOperators0.getSum(8969, 735);
        int int30 = sumWithoutArithmeticOperators0.getSum(2054, 6513);
        int int33 = sumWithoutArithmeticOperators0.getSum(8338, 7387);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1187 + "'", int21 == 1187);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4323 + "'", int24 == 4323);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9704 + "'", int27 == 9704);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8567 + "'", int30 == 8567);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 15725 + "'", int33 == 15725);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(238, 152);
        int int15 = sumWithoutArithmeticOperators0.getSum(245, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(936, 2060);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 390 + "'", int12 == 390);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 407 + "'", int15 == 407);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2996 + "'", int18 == 2996);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(110, 53);
        int int21 = sumWithoutArithmeticOperators0.getSum(162, 40);
        int int24 = sumWithoutArithmeticOperators0.getSum(150, 955);
        int int27 = sumWithoutArithmeticOperators0.getSum(1738, 110);
        int int30 = sumWithoutArithmeticOperators0.getSum(181, 3116);
        int int33 = sumWithoutArithmeticOperators0.getSum(3619, 2100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 202 + "'", int21 == 202);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1105 + "'", int24 == 1105);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1848 + "'", int27 == 1848);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3297 + "'", int30 == 3297);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5719 + "'", int33 == 5719);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(416, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(785, 453);
        int int21 = sumWithoutArithmeticOperators0.getSum(107, 188);
        int int24 = sumWithoutArithmeticOperators0.getSum(1362, 2713);
        int int27 = sumWithoutArithmeticOperators0.getSum(0, 0);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 526 + "'", int15 == 526);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1238 + "'", int18 == 1238);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4075 + "'", int24 == 4075);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 36);
        int int18 = sumWithoutArithmeticOperators0.getSum(134, 725);
        int int21 = sumWithoutArithmeticOperators0.getSum(129, 186);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int27 = sumWithoutArithmeticOperators0.getSum(89, 5402);
        int int30 = sumWithoutArithmeticOperators0.getSum(235, 763);
        int int33 = sumWithoutArithmeticOperators0.getSum(5978, 107);
        int int36 = sumWithoutArithmeticOperators0.getSum(458, 2887);
        int int39 = sumWithoutArithmeticOperators0.getSum(7073, 352);
        java.lang.Class<?> wildcardClass40 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 859 + "'", int18 == 859);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 315 + "'", int21 == 315);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5491 + "'", int27 == 5491);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 998 + "'", int30 == 998);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6085 + "'", int33 == 6085);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3345 + "'", int36 == 3345);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 7425 + "'", int39 == 7425);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(100, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 345);
        int int21 = sumWithoutArithmeticOperators0.getSum(1680, 840);
        int int24 = sumWithoutArithmeticOperators0.getSum(3192, 1068);
        int int27 = sumWithoutArithmeticOperators0.getSum(0, 237);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 345 + "'", int18 == 345);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2520 + "'", int21 == 2520);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4260 + "'", int24 == 4260);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 237 + "'", int27 == 237);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(209, 154);
        int int18 = sumWithoutArithmeticOperators0.getSum(19, 283);
        int int21 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 453);
        int int24 = sumWithoutArithmeticOperators0.getSum(715, 110);
        int int27 = sumWithoutArithmeticOperators0.getSum(1042, 11645);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 363 + "'", int15 == 363);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 302 + "'", int18 == 302);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 452 + "'", int21 == 452);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 825 + "'", int24 == 825);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 12687 + "'", int27 == 12687);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(162, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(100, 32);
        int int21 = sumWithoutArithmeticOperators0.getSum((int) 'a', 555);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 1440);
        int int27 = sumWithoutArithmeticOperators0.getSum(9195, 773);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 132 + "'", int18 == 132);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 652 + "'", int21 == 652);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1440 + "'", int24 == 1440);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9968 + "'", int27 == 9968);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(11, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(90, 555);
        int int24 = sumWithoutArithmeticOperators0.getSum(152, 7490);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 645 + "'", int21 == 645);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7642 + "'", int24 == 7642);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(416, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(785, 453);
        int int21 = sumWithoutArithmeticOperators0.getSum(189, 277);
        int int24 = sumWithoutArithmeticOperators0.getSum(3726, 8249);
        int int27 = sumWithoutArithmeticOperators0.getSum(1759, 12412);
        int int30 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 461);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 526 + "'", int15 == 526);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1238 + "'", int18 == 1238);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 466 + "'", int21 == 466);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11975 + "'", int24 == 11975);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 14171 + "'", int27 == 14171);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 471 + "'", int30 == 471);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(210, 1);
        int int15 = sumWithoutArithmeticOperators0.getSum(226, 17);
        int int18 = sumWithoutArithmeticOperators0.getSum(125, 825);
        int int21 = sumWithoutArithmeticOperators0.getSum(617, 1315);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 211 + "'", int12 == 211);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 243 + "'", int15 == 243);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 950 + "'", int18 == 950);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1932 + "'", int21 == 1932);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(321, 56);
        int int9 = sumWithoutArithmeticOperators0.getSum(277, 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(625, 55);
        int int15 = sumWithoutArithmeticOperators0.getSum(543, 767);
        int int18 = sumWithoutArithmeticOperators0.getSum(919, 10478);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 377 + "'", int6 == 377);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 377 + "'", int9 == 377);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 680 + "'", int12 == 680);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1310 + "'", int15 == 1310);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11397 + "'", int18 == 11397);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(217, 238);
        int int21 = sumWithoutArithmeticOperators0.getSum(156, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(1798, 4198);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 455 + "'", int18 == 455);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 156 + "'", int21 == 156);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5996 + "'", int24 == 5996);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum(859, 416);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1275 + "'", int12 == 1275);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(306, 180);
        int int9 = sumWithoutArithmeticOperators0.getSum(736, 1241);
        int int12 = sumWithoutArithmeticOperators0.getSum(293, 938);
        int int15 = sumWithoutArithmeticOperators0.getSum(2684, 1291);
        int int18 = sumWithoutArithmeticOperators0.getSum(2427, 201);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 486 + "'", int6 == 486);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1977 + "'", int9 == 1977);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1231 + "'", int12 == 1231);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3975 + "'", int15 == 3975);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2628 + "'", int18 == 2628);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(289, 269);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 343);
        int int18 = sumWithoutArithmeticOperators0.getSum(6059, 2810);
        int int21 = sumWithoutArithmeticOperators0.getSum(3618, 15575);
        int int24 = sumWithoutArithmeticOperators0.getSum(3100, 265);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 558 + "'", int12 == 558);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 343 + "'", int15 == 343);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8869 + "'", int18 == 8869);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19193 + "'", int21 == 19193);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3365 + "'", int24 == 3365);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) '#', (int) (short) 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(52, (int) (short) 1);
        int int21 = sumWithoutArithmeticOperators0.getSum(35, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(499, 1977);
        int int27 = sumWithoutArithmeticOperators0.getSum(2619, 1222);
        int int30 = sumWithoutArithmeticOperators0.getSum(10203, 526);
        int int33 = sumWithoutArithmeticOperators0.getSum(486, 2417);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53 + "'", int18 == 53);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2476 + "'", int24 == 2476);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3841 + "'", int27 == 3841);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10729 + "'", int30 == 10729);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2903 + "'", int33 == 2903);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(533, 343);
        int int33 = sumWithoutArithmeticOperators0.getSum(1653, 7171);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 876 + "'", int30 == 876);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8824 + "'", int33 == 8824);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
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
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(7753, 9483);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 972 + "'", int18 == 972);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2833 + "'", int21 == 2833);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1560 + "'", int24 == 1560);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2017 + "'", int27 == 2017);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 17236 + "'", int30 == 17236);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
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
        int int45 = sumWithoutArithmeticOperators0.getSum(626, 7023);
        int int48 = sumWithoutArithmeticOperators0.getSum(2438, 20125);
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 7649 + "'", int45 == 7649);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 22563 + "'", int48 == 22563);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum(107, 460);
        int int15 = sumWithoutArithmeticOperators0.getSum(746, 666);
        int int18 = sumWithoutArithmeticOperators0.getSum(803, (int) '4');
        int int21 = sumWithoutArithmeticOperators0.getSum(1106, 156);
        int int24 = sumWithoutArithmeticOperators0.getSum(6993, 3542);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 567 + "'", int12 == 567);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1412 + "'", int15 == 1412);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 855 + "'", int18 == 855);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1262 + "'", int21 == 1262);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10535 + "'", int24 == 10535);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(257, 250);
        int int12 = sumWithoutArithmeticOperators0.getSum(278, 2115);
        int int15 = sumWithoutArithmeticOperators0.getSum(5508, 18977);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 1398);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 507 + "'", int9 == 507);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2393 + "'", int12 == 2393);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 24485 + "'", int15 == 24485);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1498 + "'", int18 == 1498);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '#', 555);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 122);
        int int18 = sumWithoutArithmeticOperators0.getSum(10, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(407, 1261);
        int int24 = sumWithoutArithmeticOperators0.getSum(786, 612);
        int int27 = sumWithoutArithmeticOperators0.getSum(0, 1547);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 590 + "'", int12 == 590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 46 + "'", int18 == 46);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1668 + "'", int21 == 1668);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1398 + "'", int24 == 1398);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1547 + "'", int27 == 1547);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 16518 + "'", int36 == 16518);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(3997, 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4060 + "'", int15 == 4060);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(107, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(1059, 1259);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2318 + "'", int15 == 2318);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(277, 17);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 1026);
        int int18 = sumWithoutArithmeticOperators0.getSum(2767, 3397);
        int int21 = sumWithoutArithmeticOperators0.getSum(1473, 791);
        int int24 = sumWithoutArithmeticOperators0.getSum(1383, 84);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 294 + "'", int12 == 294);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1026 + "'", int15 == 1026);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6164 + "'", int18 == 6164);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2264 + "'", int21 == 2264);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1467 + "'", int24 == 1467);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
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
        java.lang.Class<?> wildcardClass40 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(163, 52);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 200);
        int int18 = sumWithoutArithmeticOperators0.getSum(325, 617);
        int int21 = sumWithoutArithmeticOperators0.getSum(453, 592);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 1643);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 215 + "'", int12 == 215);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 942 + "'", int18 == 942);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1045 + "'", int21 == 1045);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1643 + "'", int24 == 1643);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(255, 4075);
        int int18 = sumWithoutArithmeticOperators0.getSum(521, 1073);
        int int21 = sumWithoutArithmeticOperators0.getSum(2190, 4323);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4330 + "'", int15 == 4330);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1594 + "'", int18 == 1594);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6513 + "'", int21 == 6513);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(101, 21);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(728, 151);
        int int24 = sumWithoutArithmeticOperators0.getSum(345, 1394);
        int int27 = sumWithoutArithmeticOperators0.getSum(321, 3401);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 162 + "'", int18 == 162);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 879 + "'", int21 == 879);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1739 + "'", int24 == 1739);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3722 + "'", int27 == 3722);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(110, 376);
        int int12 = sumWithoutArithmeticOperators0.getSum(1172, 3707);
        int int15 = sumWithoutArithmeticOperators0.getSum(647, 2778);
        int int18 = sumWithoutArithmeticOperators0.getSum(6103, 477);
        int int21 = sumWithoutArithmeticOperators0.getSum(10187, 2310);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 486 + "'", int9 == 486);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4879 + "'", int12 == 4879);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3425 + "'", int15 == 3425);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6580 + "'", int18 == 6580);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12497 + "'", int21 == 12497);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) '#', (int) (short) 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) 'a', 156);
        int int21 = sumWithoutArithmeticOperators0.getSum(238, 84);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 2894);
        int int27 = sumWithoutArithmeticOperators0.getSum(2675, 354);
        int int30 = sumWithoutArithmeticOperators0.getSum(4251, 5972);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 253 + "'", int18 == 253);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 322 + "'", int21 == 322);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2894 + "'", int24 == 2894);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3029 + "'", int27 == 3029);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10223 + "'", int30 == 10223);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(18, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) '#', 286);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 469);
        int int24 = sumWithoutArithmeticOperators0.getSum(7272, 2805);
        int int27 = sumWithoutArithmeticOperators0.getSum(1365, 6410);
        int int30 = sumWithoutArithmeticOperators0.getSum(2116, 7195);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 321 + "'", int18 == 321);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 469 + "'", int21 == 469);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10077 + "'", int24 == 10077);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7775 + "'", int27 == 7775);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9311 + "'", int30 == 9311);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(196, (int) ' ');
        int int15 = sumWithoutArithmeticOperators0.getSum(266, 853);
        int int18 = sumWithoutArithmeticOperators0.getSum(46, 101);
        int int21 = sumWithoutArithmeticOperators0.getSum(52, 696);
        int int24 = sumWithoutArithmeticOperators0.getSum(134, 242);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 228 + "'", int12 == 228);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1119 + "'", int15 == 1119);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 147 + "'", int18 == 147);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 748 + "'", int21 == 748);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 376 + "'", int24 == 376);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(210, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(766, 1168);
        int int24 = sumWithoutArithmeticOperators0.getSum(454, 238);
        int int27 = sumWithoutArithmeticOperators0.getSum(1236, 1688);
        int int30 = sumWithoutArithmeticOperators0.getSum(4013, 833);
        int int33 = sumWithoutArithmeticOperators0.getSum(473, 9342);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 246 + "'", int18 == 246);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1934 + "'", int21 == 1934);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 692 + "'", int24 == 692);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2924 + "'", int27 == 2924);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4846 + "'", int30 == 4846);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9815 + "'", int33 == 9815);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(154, 0);
        int int36 = sumWithoutArithmeticOperators0.getSum(2115, 1555);
        java.lang.Class<?> wildcardClass37 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 154 + "'", int33 == 154);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3670 + "'", int36 == 3670);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(9, 2527);
        int int36 = sumWithoutArithmeticOperators0.getSum(1347, 3266);
        java.lang.Class<?> wildcardClass37 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2536 + "'", int33 == 2536);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4613 + "'", int36 == 4613);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
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
        java.lang.Class<?> wildcardClass37 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(1514, 1724);
        int int9 = sumWithoutArithmeticOperators0.getSum(52, 2589);
        int int12 = sumWithoutArithmeticOperators0.getSum(9697, 15130);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3238 + "'", int6 == 3238);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2641 + "'", int9 == 2641);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 24827 + "'", int12 == 24827);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(18, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) '#', 286);
        int int21 = sumWithoutArithmeticOperators0.getSum(202, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(9342, 3649);
        int int27 = sumWithoutArithmeticOperators0.getSum(19404, 3958);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 321 + "'", int18 == 321);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 202 + "'", int21 == 202);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12991 + "'", int24 == 12991);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 23362 + "'", int27 == 23362);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(1432, 1698);
        int int39 = sumWithoutArithmeticOperators0.getSum(3537, 539);
        int int42 = sumWithoutArithmeticOperators0.getSum(1310, (int) (short) 10);
        int int45 = sumWithoutArithmeticOperators0.getSum(7195, 0);
        int int48 = sumWithoutArithmeticOperators0.getSum(1709, 1526);
        java.lang.Class<?> wildcardClass49 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3130 + "'", int36 == 3130);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4076 + "'", int39 == 4076);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1320 + "'", int42 == 1320);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 7195 + "'", int45 == 7195);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3235 + "'", int48 == 3235);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(163, 17);
        int int18 = sumWithoutArithmeticOperators0.getSum(19, 195);
        int int21 = sumWithoutArithmeticOperators0.getSum(483, 56);
        int int24 = sumWithoutArithmeticOperators0.getSum(15795, 7796);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 180 + "'", int15 == 180);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 214 + "'", int18 == 214);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 539 + "'", int21 == 539);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 23591 + "'", int24 == 23591);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(209, 154);
        int int18 = sumWithoutArithmeticOperators0.getSum(19, 283);
        int int21 = sumWithoutArithmeticOperators0.getSum(2933, 438);
        int int24 = sumWithoutArithmeticOperators0.getSum(1045, 0);
        int int27 = sumWithoutArithmeticOperators0.getSum(1514, 1555);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 363 + "'", int15 == 363);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 302 + "'", int18 == 302);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3371 + "'", int21 == 3371);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1045 + "'", int24 == 1045);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3069 + "'", int27 == 3069);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(17858, 2843);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 20701 + "'", int33 == 20701);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
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
        java.lang.Class<?> wildcardClass46 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(465, 324);
        int int18 = sumWithoutArithmeticOperators0.getSum(122, 1);
        int int21 = sumWithoutArithmeticOperators0.getSum(1294, 375);
        int int24 = sumWithoutArithmeticOperators0.getSum(2339, 3744);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 789 + "'", int15 == 789);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 123 + "'", int18 == 123);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1669 + "'", int21 == 1669);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6083 + "'", int24 == 6083);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(266, 295);
        int int15 = sumWithoutArithmeticOperators0.getSum(8969, 1028);
        int int18 = sumWithoutArithmeticOperators0.getSum(1596, 17368);
        int int21 = sumWithoutArithmeticOperators0.getSum(3308, 165);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 561 + "'", int12 == 561);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9997 + "'", int15 == 9997);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18964 + "'", int18 == 18964);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3473 + "'", int21 == 3473);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(101, 21);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 623);
        int int24 = sumWithoutArithmeticOperators0.getSum(1010, 162);
        int int27 = sumWithoutArithmeticOperators0.getSum(924, 4079);
        int int30 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 380);
        int int33 = sumWithoutArithmeticOperators0.getSum(6352, 590);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 162 + "'", int18 == 162);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 623 + "'", int21 == 623);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1172 + "'", int24 == 1172);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5003 + "'", int27 == 5003);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 381 + "'", int30 == 381);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6942 + "'", int33 == 6942);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(2624, 1547);
        int int33 = sumWithoutArithmeticOperators0.getSum(7387, 2498);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 699 + "'", int21 == 699);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1074 + "'", int24 == 1074);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2049 + "'", int27 == 2049);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4171 + "'", int30 == 4171);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9885 + "'", int33 == 9885);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(345, 269);
        int int9 = sumWithoutArithmeticOperators0.getSum(4434, 3124);
        int int12 = sumWithoutArithmeticOperators0.getSum(1293, 1415);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 614 + "'", int6 == 614);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7558 + "'", int9 == 7558);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2708 + "'", int12 == 2708);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum(44, 671);
        int int12 = sumWithoutArithmeticOperators0.getSum(33, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(1814, 7835);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 715 + "'", int9 == 715);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9649 + "'", int15 == 9649);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
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
        int int39 = sumWithoutArithmeticOperators0.getSum(1776, 11174);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 12950 + "'", int39 == 12950);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
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
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 42 + "'", int18 == 42);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 191 + "'", int21 == 191);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1099 + "'", int24 == 1099);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9500 + "'", int27 == 9500);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 36);
        int int18 = sumWithoutArithmeticOperators0.getSum(844, 289);
        int int21 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, 2476);
        int int24 = sumWithoutArithmeticOperators0.getSum(853, 1398);
        int int27 = sumWithoutArithmeticOperators0.getSum(414, 344);
        int int30 = sumWithoutArithmeticOperators0.getSum(616, 3461);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1133 + "'", int18 == 1133);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2476 + "'", int21 == 2476);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2251 + "'", int24 == 2251);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 758 + "'", int27 == 758);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4077 + "'", int30 == 4077);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 36);
        int int18 = sumWithoutArithmeticOperators0.getSum(134, 725);
        int int21 = sumWithoutArithmeticOperators0.getSum(129, 186);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int27 = sumWithoutArithmeticOperators0.getSum(89, 5402);
        int int30 = sumWithoutArithmeticOperators0.getSum(235, 763);
        int int33 = sumWithoutArithmeticOperators0.getSum(5978, 107);
        int int36 = sumWithoutArithmeticOperators0.getSum(458, 2887);
        int int39 = sumWithoutArithmeticOperators0.getSum(16535, 16678);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 859 + "'", int18 == 859);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 315 + "'", int21 == 315);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5491 + "'", int27 == 5491);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 998 + "'", int30 == 998);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6085 + "'", int33 == 6085);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3345 + "'", int36 == 3345);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 33213 + "'", int39 == 33213);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(210, 1);
        int int15 = sumWithoutArithmeticOperators0.getSum(1094, 4189);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 211 + "'", int12 == 211);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5283 + "'", int15 == 5283);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(217, 238);
        int int21 = sumWithoutArithmeticOperators0.getSum(156, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(1252, 2464);
        int int27 = sumWithoutArithmeticOperators0.getSum(1587, 1869);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 455 + "'", int18 == 455);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 156 + "'", int21 == 156);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3716 + "'", int24 == 3716);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3456 + "'", int27 == 3456);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(238, 253);
        int int15 = sumWithoutArithmeticOperators0.getSum(683, 1003);
        int int18 = sumWithoutArithmeticOperators0.getSum(974, 2511);
        int int21 = sumWithoutArithmeticOperators0.getSum(314, 1252);
        int int24 = sumWithoutArithmeticOperators0.getSum(1754, 1275);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 491 + "'", int12 == 491);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1686 + "'", int15 == 1686);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3485 + "'", int18 == 3485);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1566 + "'", int21 == 1566);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3029 + "'", int24 == 3029);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(210, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(766, 1168);
        int int24 = sumWithoutArithmeticOperators0.getSum(454, 238);
        int int27 = sumWithoutArithmeticOperators0.getSum(1236, 1688);
        int int30 = sumWithoutArithmeticOperators0.getSum(456, 2810);
        int int33 = sumWithoutArithmeticOperators0.getSum(98, 3733);
        int int36 = sumWithoutArithmeticOperators0.getSum(5311, 14643);
        java.lang.Class<?> wildcardClass37 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 246 + "'", int18 == 246);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1934 + "'", int21 == 1934);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 692 + "'", int24 == 692);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2924 + "'", int27 == 2924);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3266 + "'", int30 == 3266);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3831 + "'", int33 == 3831);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 19954 + "'", int36 == 19954);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(40, 269);
        int int6 = sumWithoutArithmeticOperators0.getSum(202, 523);
        int int9 = sumWithoutArithmeticOperators0.getSum(286, 1337);
        int int12 = sumWithoutArithmeticOperators0.getSum(89, 1268);
        int int15 = sumWithoutArithmeticOperators0.getSum(1012, 786);
        int int18 = sumWithoutArithmeticOperators0.getSum(2472, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(14073, 6750);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 309 + "'", int3 == 309);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 725 + "'", int6 == 725);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1623 + "'", int9 == 1623);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1357 + "'", int12 == 1357);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1798 + "'", int15 == 1798);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2472 + "'", int18 == 2472);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20823 + "'", int21 == 20823);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(211, 245);
        int int15 = sumWithoutArithmeticOperators0.getSum(697, 290);
        int int18 = sumWithoutArithmeticOperators0.getSum(11577, 14442);
        int int21 = sumWithoutArithmeticOperators0.getSum(4076, 3629);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 456 + "'", int12 == 456);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 987 + "'", int15 == 987);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 26019 + "'", int18 == 26019);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7705 + "'", int21 == 7705);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 10);
        int int15 = sumWithoutArithmeticOperators0.getSum(488, 1236);
        int int18 = sumWithoutArithmeticOperators0.getSum(546, 853);
        int int21 = sumWithoutArithmeticOperators0.getSum(452, 1281);
        int int24 = sumWithoutArithmeticOperators0.getSum(666, 9075);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1724 + "'", int15 == 1724);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1399 + "'", int18 == 1399);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1733 + "'", int21 == 1733);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9741 + "'", int24 == 9741);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(345, 269);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 1254);
        int int12 = sumWithoutArithmeticOperators0.getSum(2692, 1147);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 614 + "'", int6 == 614);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1254 + "'", int9 == 1254);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3839 + "'", int12 == 3839);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum((-1), 290);
        int int21 = sumWithoutArithmeticOperators0.getSum(3564, 5352);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 289 + "'", int18 == 289);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8916 + "'", int21 == 8916);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 18);
        int int9 = sumWithoutArithmeticOperators0.getSum(36, 160);
        int int12 = sumWithoutArithmeticOperators0.getSum(686, 2696);
        int int15 = sumWithoutArithmeticOperators0.getSum(2810, 5491);
        int int18 = sumWithoutArithmeticOperators0.getSum(835, 16007);
        int int21 = sumWithoutArithmeticOperators0.getSum(2683, 2596);
        int int24 = sumWithoutArithmeticOperators0.getSum(9415, 1859);
        int int27 = sumWithoutArithmeticOperators0.getSum(11737, 1038);
        int int30 = sumWithoutArithmeticOperators0.getSum(5981, 934);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 196 + "'", int9 == 196);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3382 + "'", int12 == 3382);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8301 + "'", int15 == 8301);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16842 + "'", int18 == 16842);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5279 + "'", int21 == 5279);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11274 + "'", int24 == 11274);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 12775 + "'", int27 == 12775);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6915 + "'", int30 == 6915);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
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
        int int39 = sumWithoutArithmeticOperators0.getSum(1701, 1231);
        int int42 = sumWithoutArithmeticOperators0.getSum(2094, 0);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 56 + "'", int30 == 56);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1588 + "'", int33 == 1588);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 313 + "'", int36 == 313);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2932 + "'", int39 == 2932);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2094 + "'", int42 == 2094);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(18, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, (int) (short) 100);
        int int21 = sumWithoutArithmeticOperators0.getSum(416, 44);
        int int24 = sumWithoutArithmeticOperators0.getSum(1424, 1074);
        int int27 = sumWithoutArithmeticOperators0.getSum(6951, 974);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 460 + "'", int21 == 460);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2498 + "'", int24 == 2498);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7925 + "'", int27 == 7925);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(260, 195);
        int int15 = sumWithoutArithmeticOperators0.getSum(316, 1491);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(2265, 1748);
        int int24 = sumWithoutArithmeticOperators0.getSum(1379, 1626);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 455 + "'", int12 == 455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1807 + "'", int15 == 1807);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4013 + "'", int21 == 4013);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3005 + "'", int24 == 3005);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(9592, 7382);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16974 + "'", int15 == 16974);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(4788, 16935);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 647 + "'", int18 == 647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1643 + "'", int21 == 1643);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3624 + "'", int24 == 3624);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7315 + "'", int27 == 7315);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 21723 + "'", int30 == 21723);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 89);
        int int12 = sumWithoutArithmeticOperators0.getSum(1023, 665);
        int int15 = sumWithoutArithmeticOperators0.getSum(202, 9193);
        int int18 = sumWithoutArithmeticOperators0.getSum(486, 14708);
        int int21 = sumWithoutArithmeticOperators0.getSum(8026, 626);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 90 + "'", int9 == 90);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1688 + "'", int12 == 1688);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9395 + "'", int15 == 9395);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15194 + "'", int18 == 15194);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8652 + "'", int21 == 8652);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(631, 1278);
        int int18 = sumWithoutArithmeticOperators0.getSum(747, 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 127 + "'", int12 == 127);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1909 + "'", int15 == 1909);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 837 + "'", int18 == 837);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(1038, 3095);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 411 + "'", int12 == 411);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 620 + "'", int15 == 620);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1312 + "'", int18 == 1312);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3936 + "'", int21 == 3936);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9139 + "'", int24 == 9139);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2290 + "'", int27 == 2290);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4133 + "'", int30 == 4133);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(2316, 975);
        java.lang.Class<?> wildcardClass7 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3291 + "'", int6 == 3291);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(40, 269);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 163);
        int int9 = sumWithoutArithmeticOperators0.getSum(10022, 5895);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 309 + "'", int3 == 309);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 184 + "'", int6 == 184);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15917 + "'", int9 == 15917);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(100, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 345);
        int int21 = sumWithoutArithmeticOperators0.getSum(1680, 840);
        int int24 = sumWithoutArithmeticOperators0.getSum(555, 4149);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 345 + "'", int18 == 345);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2520 + "'", int21 == 2520);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4704 + "'", int24 == 4704);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(163, 17);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 186);
        int int21 = sumWithoutArithmeticOperators0.getSum(432, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(3678, 5209);
        int int27 = sumWithoutArithmeticOperators0.getSum(1668, 1701);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 180 + "'", int15 == 180);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 186 + "'", int18 == 186);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 432 + "'", int21 == 432);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8887 + "'", int24 == 8887);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3369 + "'", int27 == 3369);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) ' ', 35);
        int int6 = sumWithoutArithmeticOperators0.getSum(98, 180);
        int int9 = sumWithoutArithmeticOperators0.getSum(3025, 1245);
        int int12 = sumWithoutArithmeticOperators0.getSum(1327, 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(352, 460);
        int int18 = sumWithoutArithmeticOperators0.getSum(4739, 3510);
        int int21 = sumWithoutArithmeticOperators0.getSum(4374, 1040);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 12316);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 67 + "'", int3 == 67);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 278 + "'", int6 == 278);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4270 + "'", int9 == 4270);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1427 + "'", int12 == 1427);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 812 + "'", int15 == 812);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8249 + "'", int18 == 8249);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5414 + "'", int21 == 5414);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12316 + "'", int24 == 12316);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 165);
        int int12 = sumWithoutArithmeticOperators0.getSum(152, 108);
        int int15 = sumWithoutArithmeticOperators0.getSum(117, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(593, 4488);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 294 + "'", int9 == 294);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 260 + "'", int12 == 260);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 117 + "'", int15 == 117);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5081 + "'", int18 == 5081);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(11, (int) (short) 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(245, 56);
        int int21 = sumWithoutArithmeticOperators0.getSum(3627, 91);
        int int24 = sumWithoutArithmeticOperators0.getSum(6085, 4270);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 301 + "'", int18 == 301);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3718 + "'", int21 == 3718);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10355 + "'", int24 == 10355);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(110, 53);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 7);
        int int24 = sumWithoutArithmeticOperators0.getSum(727, 926);
        int int27 = sumWithoutArithmeticOperators0.getSum(3637, 1967);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1653 + "'", int24 == 1653);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5604 + "'", int27 == 5604);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(33, 163);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (byte) 100);
        int int21 = sumWithoutArithmeticOperators0.getSum(2363, 51);
        int int24 = sumWithoutArithmeticOperators0.getSum(2325, 28374);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2414 + "'", int21 == 2414);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 30699 + "'", int24 == 30699);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(162, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(596, 1623);
        int int12 = sumWithoutArithmeticOperators0.getSum(4456, 4739);
        int int15 = sumWithoutArithmeticOperators0.getSum(5408, 3218);
        int int18 = sumWithoutArithmeticOperators0.getSum(8619, 2491);
        int int21 = sumWithoutArithmeticOperators0.getSum(5279, 7516);
        int int24 = sumWithoutArithmeticOperators0.getSum(5719, 23486);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2219 + "'", int9 == 2219);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9195 + "'", int12 == 9195);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8626 + "'", int15 == 8626);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11110 + "'", int18 == 11110);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12795 + "'", int21 == 12795);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 29205 + "'", int24 == 29205);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 10);
        int int15 = sumWithoutArithmeticOperators0.getSum(5007, 1398);
        int int18 = sumWithoutArithmeticOperators0.getSum(8026, 11110);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6405 + "'", int15 == 6405);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 19136 + "'", int18 == 19136);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum((-1), 290);
        int int21 = sumWithoutArithmeticOperators0.getSum(289, 734);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int27 = sumWithoutArithmeticOperators0.getSum(168, 14566);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 289 + "'", int18 == 289);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1023 + "'", int21 == 1023);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 14734 + "'", int27 == 14734);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
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
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) ' ', 35);
        int int6 = sumWithoutArithmeticOperators0.getSum(1253, 1133);
        int int9 = sumWithoutArithmeticOperators0.getSum(524, 166);
        int int12 = sumWithoutArithmeticOperators0.getSum(2986, 0);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 67 + "'", int3 == 67);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2386 + "'", int6 == 2386);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 690 + "'", int9 == 690);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2986 + "'", int12 == 2986);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(11, (int) (short) 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(245, 56);
        int int21 = sumWithoutArithmeticOperators0.getSum(3627, 91);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 301 + "'", int18 == 301);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3718 + "'", int21 == 3718);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(19, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(629, 9);
        int int21 = sumWithoutArithmeticOperators0.getSum(1337, 194);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 1374);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 129 + "'", int15 == 129);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 638 + "'", int18 == 638);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1531 + "'", int21 == 1531);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1374 + "'", int24 == 1374);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(251, 210);
        int int15 = sumWithoutArithmeticOperators0.getSum(246, 9);
        int int18 = sumWithoutArithmeticOperators0.getSum(1168, 216);
        int int21 = sumWithoutArithmeticOperators0.getSum(18309, 5583);
        int int24 = sumWithoutArithmeticOperators0.getSum(2987, 1222);
        int int27 = sumWithoutArithmeticOperators0.getSum(104, 11323);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 461 + "'", int12 == 461);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 255 + "'", int15 == 255);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1384 + "'", int18 == 1384);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 23892 + "'", int21 == 23892);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4209 + "'", int24 == 4209);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 11427 + "'", int27 == 11427);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(277, 17);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 1026);
        int int18 = sumWithoutArithmeticOperators0.getSum(35, 3231);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 294 + "'", int12 == 294);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1026 + "'", int15 == 1026);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3266 + "'", int18 == 3266);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 165);
        int int12 = sumWithoutArithmeticOperators0.getSum(152, 108);
        int int15 = sumWithoutArithmeticOperators0.getSum(788, 360);
        int int18 = sumWithoutArithmeticOperators0.getSum(1180, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 294 + "'", int9 == 294);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 260 + "'", int12 == 260);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1148 + "'", int15 == 1148);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1180 + "'", int18 == 1180);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 165);
        int int12 = sumWithoutArithmeticOperators0.getSum(66, 0);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 294 + "'", int9 == 294);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 66 + "'", int12 == 66);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) ' ', 35);
        int int6 = sumWithoutArithmeticOperators0.getSum(98, 180);
        int int9 = sumWithoutArithmeticOperators0.getSum(3025, 1245);
        int int12 = sumWithoutArithmeticOperators0.getSum(1327, 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(352, 460);
        int int18 = sumWithoutArithmeticOperators0.getSum(4739, 3510);
        int int21 = sumWithoutArithmeticOperators0.getSum(4374, 1040);
        int int24 = sumWithoutArithmeticOperators0.getSum(33213, 1180);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 67 + "'", int3 == 67);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 278 + "'", int6 == 278);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4270 + "'", int9 == 4270);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1427 + "'", int12 == 1427);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 812 + "'", int15 == 812);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8249 + "'", int18 == 8249);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5414 + "'", int21 == 5414);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 34393 + "'", int24 == 34393);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(196, (int) ' ');
        int int15 = sumWithoutArithmeticOperators0.getSum(1128, 108);
        int int18 = sumWithoutArithmeticOperators0.getSum(844, 98);
        int int21 = sumWithoutArithmeticOperators0.getSum(1972, 54);
        int int24 = sumWithoutArithmeticOperators0.getSum(562, 1738);
        int int27 = sumWithoutArithmeticOperators0.getSum(2824, 2684);
        int int30 = sumWithoutArithmeticOperators0.getSum(7597, 16678);
        int int33 = sumWithoutArithmeticOperators0.getSum(7335, 14957);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 228 + "'", int12 == 228);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1236 + "'", int15 == 1236);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 942 + "'", int18 == 942);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2026 + "'", int21 == 2026);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2300 + "'", int24 == 2300);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5508 + "'", int27 == 5508);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 24275 + "'", int30 == 24275);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 22292 + "'", int33 == 22292);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(250, 195);
        int int9 = sumWithoutArithmeticOperators0.getSum(805, 1200);
        java.lang.Class<?> wildcardClass10 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 445 + "'", int6 == 445);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2005 + "'", int9 == 2005);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(5865, 15898);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 21763 + "'", int36 == 21763);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(100, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(722, 789);
        int int21 = sumWithoutArithmeticOperators0.getSum(567, 1171);
        int int24 = sumWithoutArithmeticOperators0.getSum(888, 1511);
        int int27 = sumWithoutArithmeticOperators0.getSum(1926, 1647);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1511 + "'", int18 == 1511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1738 + "'", int21 == 1738);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2399 + "'", int24 == 2399);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3573 + "'", int27 == 3573);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(210, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(317, 110);
        int int24 = sumWithoutArithmeticOperators0.getSum(555, 41);
        int int27 = sumWithoutArithmeticOperators0.getSum(360, 1432);
        int int30 = sumWithoutArithmeticOperators0.getSum(11841, 337);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 246 + "'", int18 == 246);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 427 + "'", int21 == 427);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 596 + "'", int24 == 596);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1792 + "'", int27 == 1792);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 12178 + "'", int30 == 12178);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(110, 53);
        int int21 = sumWithoutArithmeticOperators0.getSum(2597, 6372);
        int int24 = sumWithoutArithmeticOperators0.getSum(27930, 8609);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8969 + "'", int21 == 8969);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 36539 + "'", int24 == 36539);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 486);
        int int12 = sumWithoutArithmeticOperators0.getSum(876, 1869);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 486 + "'", int9 == 486);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2745 + "'", int12 == 2745);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(122, 67);
        int int18 = sumWithoutArithmeticOperators0.getSum(6177, 2941);
        int int21 = sumWithoutArithmeticOperators0.getSum(4171, 0);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 189 + "'", int15 == 189);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9118 + "'", int18 == 9118);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4171 + "'", int21 == 4171);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 89);
        int int12 = sumWithoutArithmeticOperators0.getSum(1023, 665);
        int int15 = sumWithoutArithmeticOperators0.getSum(2879, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 90 + "'", int9 == 90);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1688 + "'", int12 == 1688);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2879 + "'", int15 == 2879);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
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
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 972 + "'", int18 == 972);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2833 + "'", int21 == 2833);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1560 + "'", int24 == 1560);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2017 + "'", int27 == 2017);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(19, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(629, 9);
        int int21 = sumWithoutArithmeticOperators0.getSum(780, 533);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 129 + "'", int15 == 129);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 638 + "'", int18 == 638);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1313 + "'", int21 == 1313);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 36);
        int int18 = sumWithoutArithmeticOperators0.getSum(134, 725);
        int int21 = sumWithoutArithmeticOperators0.getSum(3175, 2386);
        int int24 = sumWithoutArithmeticOperators0.getSum(2824, 150);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 859 + "'", int18 == 859);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5561 + "'", int21 == 5561);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2974 + "'", int24 == 2974);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(162, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(156, 491);
        int int21 = sumWithoutArithmeticOperators0.getSum(1291, 352);
        int int24 = sumWithoutArithmeticOperators0.getSum(6164, 647);
        int int27 = sumWithoutArithmeticOperators0.getSum(876, 1559);
        int int30 = sumWithoutArithmeticOperators0.getSum(6470, 6085);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 647 + "'", int18 == 647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1643 + "'", int21 == 1643);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6811 + "'", int24 == 6811);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2435 + "'", int27 == 2435);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 12555 + "'", int30 == 12555);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 199);
        int int12 = sumWithoutArithmeticOperators0.getSum(324, 614);
        int int15 = sumWithoutArithmeticOperators0.getSum(498, 461);
        int int18 = sumWithoutArithmeticOperators0.getSum(4671, 1001);
        int int21 = sumWithoutArithmeticOperators0.getSum(1909, 10223);
        int int24 = sumWithoutArithmeticOperators0.getSum(4560, 3445);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 199 + "'", int9 == 199);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 938 + "'", int12 == 938);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 959 + "'", int15 == 959);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5672 + "'", int18 == 5672);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12132 + "'", int21 == 12132);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8005 + "'", int24 == 8005);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(1305, 14708);
        java.lang.Class<?> wildcardClass37 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 16013 + "'", int36 == 16013);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(1514, 1724);
        int int9 = sumWithoutArithmeticOperators0.getSum(52, 2589);
        java.lang.Class<?> wildcardClass10 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3238 + "'", int6 == 3238);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2641 + "'", int9 == 2641);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum(44, 671);
        int int12 = sumWithoutArithmeticOperators0.getSum(629, 397);
        int int15 = sumWithoutArithmeticOperators0.getSum(24974, 2956);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 715 + "'", int9 == 715);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1026 + "'", int12 == 1026);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 27930 + "'", int15 == 27930);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(162, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(596, 1623);
        int int12 = sumWithoutArithmeticOperators0.getSum(4456, 4739);
        int int15 = sumWithoutArithmeticOperators0.getSum(5408, 3218);
        int int18 = sumWithoutArithmeticOperators0.getSum(8619, 2491);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2219 + "'", int9 == 2219);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9195 + "'", int12 == 9195);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8626 + "'", int15 == 8626);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11110 + "'", int18 == 11110);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 56);
        int int18 = sumWithoutArithmeticOperators0.getSum(34, 209);
        int int21 = sumWithoutArithmeticOperators0.getSum(149, 2386);
        int int24 = sumWithoutArithmeticOperators0.getSum(10886, 316);
        int int27 = sumWithoutArithmeticOperators0.getSum(288, 878);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 55 + "'", int15 == 55);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 243 + "'", int18 == 243);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2535 + "'", int21 == 2535);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11202 + "'", int24 == 11202);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1166 + "'", int27 == 1166);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(210, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(317, 110);
        int int24 = sumWithoutArithmeticOperators0.getSum(1698, 116);
        int int27 = sumWithoutArithmeticOperators0.getSum(3432, 1398);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 246 + "'", int18 == 246);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 427 + "'", int21 == 427);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1814 + "'", int24 == 1814);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4830 + "'", int27 == 4830);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(18, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) '#', 286);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 469);
        int int24 = sumWithoutArithmeticOperators0.getSum(1526, 1666);
        int int27 = sumWithoutArithmeticOperators0.getSum(2805, 2882);
        int int30 = sumWithoutArithmeticOperators0.getSum(10451, 2593);
        int int33 = sumWithoutArithmeticOperators0.getSum(1337, 4879);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 321 + "'", int18 == 321);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 469 + "'", int21 == 469);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3192 + "'", int24 == 3192);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5687 + "'", int27 == 5687);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 13044 + "'", int30 == 13044);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6216 + "'", int33 == 6216);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(257, 250);
        int int12 = sumWithoutArithmeticOperators0.getSum(221, 360);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 507 + "'", int9 == 507);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 581 + "'", int12 == 581);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(533, 343);
        int int33 = sumWithoutArithmeticOperators0.getSum(150, (int) (byte) -1);
        int int36 = sumWithoutArithmeticOperators0.getSum(1714, 931);
        int int39 = sumWithoutArithmeticOperators0.getSum(0, 3024);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 376 + "'", int24 == 376);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 41 + "'", int27 == 41);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 876 + "'", int30 == 876);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 149 + "'", int33 == 149);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2645 + "'", int36 == 2645);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3024 + "'", int39 == 3024);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(162, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(905, 302);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 844);
        int int15 = sumWithoutArithmeticOperators0.getSum(1297, 1119);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1207 + "'", int9 == 1207);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 844 + "'", int12 == 844);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2416 + "'", int15 == 2416);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(9, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(1028, 1509);
        int int18 = sumWithoutArithmeticOperators0.getSum(2933, 12921);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2537 + "'", int15 == 2537);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15854 + "'", int18 == 15854);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(110, 53);
        int int21 = sumWithoutArithmeticOperators0.getSum(2597, 6372);
        int int24 = sumWithoutArithmeticOperators0.getSum(3166, 2368);
        int int27 = sumWithoutArithmeticOperators0.getSum(2956, 14000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8969 + "'", int21 == 8969);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5534 + "'", int24 == 5534);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16956 + "'", int27 == 16956);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(1112, (-1));
        int int21 = sumWithoutArithmeticOperators0.getSum(1222, 269);
        int int24 = sumWithoutArithmeticOperators0.getSum(791, 2713);
        int int27 = sumWithoutArithmeticOperators0.getSum(1759, 1668);
        int int30 = sumWithoutArithmeticOperators0.getSum(53, 2696);
        int int33 = sumWithoutArithmeticOperators0.getSum(3259, 7516);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1111 + "'", int18 == 1111);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1491 + "'", int21 == 1491);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3504 + "'", int24 == 3504);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3427 + "'", int27 == 3427);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2749 + "'", int30 == 2749);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10775 + "'", int33 == 10775);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(277, 17);
        int int15 = sumWithoutArithmeticOperators0.getSum(812, 735);
        int int18 = sumWithoutArithmeticOperators0.getSum(5402, 6258);
        int int21 = sumWithoutArithmeticOperators0.getSum(1852, 664);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 294 + "'", int12 == 294);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1547 + "'", int15 == 1547);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11660 + "'", int18 == 11660);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2516 + "'", int21 == 2516);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(110, 53);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 7);
        int int24 = sumWithoutArithmeticOperators0.getSum(1187, (int) (byte) -1);
        int int27 = sumWithoutArithmeticOperators0.getSum(1097, 1101);
        int int30 = sumWithoutArithmeticOperators0.getSum(8378, 392);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1186 + "'", int24 == 1186);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2198 + "'", int27 == 2198);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8770 + "'", int30 == 8770);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(266, 295);
        int int15 = sumWithoutArithmeticOperators0.getSum(390, 289);
        int int18 = sumWithoutArithmeticOperators0.getSum(3272, 7020);
        int int21 = sumWithoutArithmeticOperators0.getSum(9931, 1087);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 561 + "'", int12 == 561);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 679 + "'", int15 == 679);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10292 + "'", int18 == 10292);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11018 + "'", int21 == 11018);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '#', 555);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 122);
        int int18 = sumWithoutArithmeticOperators0.getSum(1922, 781);
        int int21 = sumWithoutArithmeticOperators0.getSum(1257, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 590 + "'", int12 == 590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2703 + "'", int18 == 2703);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1257 + "'", int21 == 1257);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(40, 269);
        int int6 = sumWithoutArithmeticOperators0.getSum(555, 4847);
        int int9 = sumWithoutArithmeticOperators0.getSum(2037, 4948);
        java.lang.Class<?> wildcardClass10 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 309 + "'", int3 == 309);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5402 + "'", int6 == 5402);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6985 + "'", int9 == 6985);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) ' ', 35);
        int int6 = sumWithoutArithmeticOperators0.getSum(1253, 1133);
        int int9 = sumWithoutArithmeticOperators0.getSum(524, 166);
        int int12 = sumWithoutArithmeticOperators0.getSum(824, 4193);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 67 + "'", int3 == 67);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2386 + "'", int6 == 2386);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 690 + "'", int9 == 690);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5017 + "'", int12 == 5017);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(289, 269);
        int int15 = sumWithoutArithmeticOperators0.getSum(1254, 974);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 558 + "'", int12 == 558);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2228 + "'", int15 == 2228);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
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
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(101, 21);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 4736);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 162 + "'", int18 == 162);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4736 + "'", int21 == 4736);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(40, 269);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 163);
        int int9 = sumWithoutArithmeticOperators0.getSum(3264, 473);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 309 + "'", int3 == 309);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 184 + "'", int6 == 184);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3737 + "'", int9 == 3737);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(52, 104);
        int int18 = sumWithoutArithmeticOperators0.getSum(590, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(942, (int) (short) 100);
        int int24 = sumWithoutArithmeticOperators0.getSum(2713, 974);
        int int27 = sumWithoutArithmeticOperators0.getSum(2306, 269);
        int int30 = sumWithoutArithmeticOperators0.getSum(4013, 1848);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 156 + "'", int15 == 156);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 590 + "'", int18 == 590);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1042 + "'", int21 == 1042);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3687 + "'", int24 == 3687);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2575 + "'", int27 == 2575);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5861 + "'", int30 == 5861);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(46, 2778);
        int int33 = sumWithoutArithmeticOperators0.getSum(863, 127);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 76 + "'", int24 == 76);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 345 + "'", int27 == 345);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2824 + "'", int30 == 2824);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 990 + "'", int33 == 990);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(6114, 1056);
        int int15 = sumWithoutArithmeticOperators0.getSum(1739, 272);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7170 + "'", int12 == 7170);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2011 + "'", int15 == 2011);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 98);
        int int9 = sumWithoutArithmeticOperators0.getSum(3744, 507);
        int int12 = sumWithoutArithmeticOperators0.getSum(786, 1407);
        int int15 = sumWithoutArithmeticOperators0.getSum(11569, 2210);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 108 + "'", int6 == 108);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4251 + "'", int9 == 4251);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2193 + "'", int12 == 2193);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 13779 + "'", int15 == 13779);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(911, 432);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 34);
        int int15 = sumWithoutArithmeticOperators0.getSum(1241, 1352);
        int int18 = sumWithoutArithmeticOperators0.getSum(13151, 6164);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1343 + "'", int9 == 1343);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2593 + "'", int15 == 2593);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 19315 + "'", int18 == 19315);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 36);
        int int18 = sumWithoutArithmeticOperators0.getSum(844, 289);
        int int21 = sumWithoutArithmeticOperators0.getSum(1555, 1101);
        int int24 = sumWithoutArithmeticOperators0.getSum(3218, 13039);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1133 + "'", int18 == 1133);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2656 + "'", int21 == 2656);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16257 + "'", int24 == 16257);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(160, 465);
        int int12 = sumWithoutArithmeticOperators0.getSum(9265, 697);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 625 + "'", int9 == 625);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9962 + "'", int12 == 9962);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(526, 727);
        int int18 = sumWithoutArithmeticOperators0.getSum(592, 734);
        int int21 = sumWithoutArithmeticOperators0.getSum(9920, 3461);
        int int24 = sumWithoutArithmeticOperators0.getSum(5350, 7800);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1253 + "'", int15 == 1253);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1326 + "'", int18 == 1326);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13381 + "'", int21 == 13381);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13150 + "'", int24 == 13150);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '#', 555);
        int int15 = sumWithoutArithmeticOperators0.getSum(2054, 3654);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 590 + "'", int12 == 590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5708 + "'", int15 == 5708);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(238, 253);
        int int15 = sumWithoutArithmeticOperators0.getSum(683, 1003);
        int int18 = sumWithoutArithmeticOperators0.getSum(2386, 9647);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 491 + "'", int12 == 491);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1686 + "'", int15 == 1686);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 12033 + "'", int18 == 12033);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
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
        int int39 = sumWithoutArithmeticOperators0.getSum(1860, 1573);
        java.lang.Class<?> wildcardClass40 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3433 + "'", int39 == 3433);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(100, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(2165, 1724);
        int int21 = sumWithoutArithmeticOperators0.getSum(692, 998);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 7064);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3889 + "'", int18 == 3889);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1690 + "'", int21 == 1690);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7064 + "'", int24 == 7064);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(162, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(156, 491);
        int int21 = sumWithoutArithmeticOperators0.getSum(4742, 1097);
        int int24 = sumWithoutArithmeticOperators0.getSum(2762, 5755);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 647 + "'", int18 == 647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5839 + "'", int21 == 5839);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8517 + "'", int24 == 8517);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 199);
        int int12 = sumWithoutArithmeticOperators0.getSum(324, 614);
        int int15 = sumWithoutArithmeticOperators0.getSum(498, 461);
        int int18 = sumWithoutArithmeticOperators0.getSum(4671, 1001);
        int int21 = sumWithoutArithmeticOperators0.getSum(1698, 4061);
        int int24 = sumWithoutArithmeticOperators0.getSum(7558, 2805);
        int int27 = sumWithoutArithmeticOperators0.getSum(2749, 19954);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 199 + "'", int9 == 199);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 938 + "'", int12 == 938);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 959 + "'", int15 == 959);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5672 + "'", int18 == 5672);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5759 + "'", int21 == 5759);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10363 + "'", int24 == 10363);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 22703 + "'", int27 == 22703);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(251, 210);
        int int15 = sumWithoutArithmeticOperators0.getSum(66, 277);
        int int18 = sumWithoutArithmeticOperators0.getSum(5681, 3733);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 461 + "'", int12 == 461);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 343 + "'", int15 == 343);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9414 + "'", int18 == 9414);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(18, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 108);
        int int21 = sumWithoutArithmeticOperators0.getSum(683, 141);
        int int24 = sumWithoutArithmeticOperators0.getSum(10223, 30352);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 109 + "'", int18 == 109);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 824 + "'", int21 == 824);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 40575 + "'", int24 == 40575);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(52, 104);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 194);
        int int21 = sumWithoutArithmeticOperators0.getSum(13104, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 156 + "'", int15 == 156);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 194 + "'", int18 == 194);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13104 + "'", int21 == 13104);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(1407, 189);
        int int21 = sumWithoutArithmeticOperators0.getSum(1207, 142);
        int int24 = sumWithoutArithmeticOperators0.getSum(13000, 4054);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 161 + "'", int15 == 161);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1596 + "'", int18 == 1596);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1349 + "'", int21 == 1349);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 17054 + "'", int24 == 17054);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(196, (int) ' ');
        int int15 = sumWithoutArithmeticOperators0.getSum(266, 853);
        int int18 = sumWithoutArithmeticOperators0.getSum(46, 101);
        int int21 = sumWithoutArithmeticOperators0.getSum(52, 696);
        int int24 = sumWithoutArithmeticOperators0.getSum(3445, 1764);
        int int27 = sumWithoutArithmeticOperators0.getSum(5103, 4541);
        int int30 = sumWithoutArithmeticOperators0.getSum(8338, 1562);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 228 + "'", int12 == 228);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1119 + "'", int15 == 1119);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 147 + "'", int18 == 147);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 748 + "'", int21 == 748);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5209 + "'", int24 == 5209);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9644 + "'", int27 == 9644);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9900 + "'", int30 == 9900);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum((-1), 290);
        int int21 = sumWithoutArithmeticOperators0.getSum(289, 734);
        int int24 = sumWithoutArithmeticOperators0.getSum(8469, 1326);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 289 + "'", int18 == 289);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1023 + "'", int21 == 1023);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9795 + "'", int24 == 9795);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(11, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(286, 9);
        int int24 = sumWithoutArithmeticOperators0.getSum(110, 266);
        int int27 = sumWithoutArithmeticOperators0.getSum(1606, 623);
        int int30 = sumWithoutArithmeticOperators0.getSum(1859, 1700);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 376 + "'", int24 == 376);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2229 + "'", int27 == 2229);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3559 + "'", int30 == 3559);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(526, 727);
        int int18 = sumWithoutArithmeticOperators0.getSum(1967, 810);
        int int21 = sumWithoutArithmeticOperators0.getSum(1611, 2502);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1253 + "'", int15 == 1253);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2777 + "'", int18 == 2777);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4113 + "'", int21 == 4113);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(526, 727);
        int int18 = sumWithoutArithmeticOperators0.getSum(592, 734);
        int int21 = sumWithoutArithmeticOperators0.getSum(1556, 692);
        int int24 = sumWithoutArithmeticOperators0.getSum(16269, 0);
        int int27 = sumWithoutArithmeticOperators0.getSum(10493, 2624);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1253 + "'", int15 == 1253);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1326 + "'", int18 == 1326);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2248 + "'", int21 == 2248);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16269 + "'", int24 == 16269);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 13117 + "'", int27 == 13117);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(477, 1987);
        int int36 = sumWithoutArithmeticOperators0.getSum(9, 4650);
        java.lang.Class<?> wildcardClass37 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2464 + "'", int33 == 2464);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4659 + "'", int36 == 4659);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(17, 200);
        int int6 = sumWithoutArithmeticOperators0.getSum(853, 427);
        int int9 = sumWithoutArithmeticOperators0.getSum(1171, 254);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1430);
        int int15 = sumWithoutArithmeticOperators0.getSum(3322, 767);
        int int18 = sumWithoutArithmeticOperators0.getSum(1373, 3652);
        int int21 = sumWithoutArithmeticOperators0.getSum(15751, 7665);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 217 + "'", int3 == 217);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1280 + "'", int6 == 1280);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1425 + "'", int9 == 1425);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1440 + "'", int12 == 1440);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4089 + "'", int15 == 4089);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5025 + "'", int18 == 5025);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 23416 + "'", int21 == 23416);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(416, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(785, 453);
        int int21 = sumWithoutArithmeticOperators0.getSum(189, 277);
        int int24 = sumWithoutArithmeticOperators0.getSum(931, 6020);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 526 + "'", int15 == 526);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1238 + "'", int18 == 1238);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 466 + "'", int21 == 466);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6951 + "'", int24 == 6951);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 56 + "'", int30 == 56);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1588 + "'", int33 == 1588);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 313 + "'", int36 == 313);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 5243 + "'", int39 == 5243);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 6169 + "'", int42 == 6169);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 10);
        int int15 = sumWithoutArithmeticOperators0.getSum(15949, 10858);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 26807 + "'", int15 == 26807);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(19, 21);
        int int9 = sumWithoutArithmeticOperators0.getSum(53, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(286, 125);
        int int15 = sumWithoutArithmeticOperators0.getSum(295, 325);
        int int18 = sumWithoutArithmeticOperators0.getSum(905, 407);
        int int21 = sumWithoutArithmeticOperators0.getSum(1685, 2251);
        int int24 = sumWithoutArithmeticOperators0.getSum(6409, 1592);
        int int27 = sumWithoutArithmeticOperators0.getSum(4773, 3811);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 411 + "'", int12 == 411);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 620 + "'", int15 == 620);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1312 + "'", int18 == 1312);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3936 + "'", int21 == 3936);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8001 + "'", int24 == 8001);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8584 + "'", int27 == 8584);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(162, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(100, 32);
        int int21 = sumWithoutArithmeticOperators0.getSum(3322, 208);
        int int24 = sumWithoutArithmeticOperators0.getSum(4440, 10203);
        int int27 = sumWithoutArithmeticOperators0.getSum(1349, 302);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 132 + "'", int18 == 132);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3530 + "'", int21 == 3530);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14643 + "'", int24 == 14643);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1651 + "'", int27 == 1651);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 165);
        int int12 = sumWithoutArithmeticOperators0.getSum(152, 108);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 55);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, 785);
        int int21 = sumWithoutArithmeticOperators0.getSum(2316, 466);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 294 + "'", int9 == 294);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 260 + "'", int12 == 260);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 54 + "'", int15 == 54);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 786 + "'", int18 == 786);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2782 + "'", int21 == 2782);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(1829, 635);
        int int18 = sumWithoutArithmeticOperators0.getSum(5363, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(1268, 0);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2464 + "'", int15 == 2464);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5363 + "'", int18 == 5363);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1268 + "'", int21 == 1268);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(306, 180);
        int int9 = sumWithoutArithmeticOperators0.getSum(736, 1241);
        int int12 = sumWithoutArithmeticOperators0.getSum(1379, 2394);
        int int15 = sumWithoutArithmeticOperators0.getSum(13444, 807);
        int int18 = sumWithoutArithmeticOperators0.getSum(4070, 788);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 486 + "'", int6 == 486);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1977 + "'", int9 == 1977);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3773 + "'", int12 == 3773);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 14251 + "'", int15 == 14251);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4858 + "'", int18 == 4858);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(163, 52);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 200);
        int int18 = sumWithoutArithmeticOperators0.getSum(325, 617);
        int int21 = sumWithoutArithmeticOperators0.getSum(1511, 1128);
        int int24 = sumWithoutArithmeticOperators0.getSum(1096, 3467);
        int int27 = sumWithoutArithmeticOperators0.getSum(7776, 14606);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 215 + "'", int12 == 215);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 942 + "'", int18 == 942);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2639 + "'", int21 == 2639);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4563 + "'", int24 == 4563);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 22382 + "'", int27 == 22382);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(289, 149);
        int int33 = sumWithoutArithmeticOperators0.getSum(1285, 3420);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 246 + "'", int18 == 246);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 427 + "'", int21 == 427);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 635 + "'", int24 == 635);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 360 + "'", int27 == 360);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 438 + "'", int30 == 438);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4705 + "'", int33 == 4705);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
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
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 253 + "'", int18 == 253);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 322 + "'", int21 == 322);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2894 + "'", int24 == 2894);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2544 + "'", int27 == 2544);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(163, 52);
        int int15 = sumWithoutArithmeticOperators0.getSum(210, 165);
        int int18 = sumWithoutArithmeticOperators0.getSum(149, 67);
        int int21 = sumWithoutArithmeticOperators0.getSum(5341, 3177);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 215 + "'", int12 == 215);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 375 + "'", int15 == 375);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 216 + "'", int18 == 216);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8518 + "'", int21 == 8518);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) -1);
        int int21 = sumWithoutArithmeticOperators0.getSum(266, 11);
        int int24 = sumWithoutArithmeticOperators0.getSum(52, 998);
        int int27 = sumWithoutArithmeticOperators0.getSum(98, 2855);
        int int30 = sumWithoutArithmeticOperators0.getSum(1680, 1087);
        int int33 = sumWithoutArithmeticOperators0.getSum(979, 652);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 277 + "'", int21 == 277);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1050 + "'", int24 == 1050);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2953 + "'", int27 == 2953);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2767 + "'", int30 == 2767);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1631 + "'", int33 == 1631);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(251, 210);
        int int15 = sumWithoutArithmeticOperators0.getSum(246, 9);
        int int18 = sumWithoutArithmeticOperators0.getSum(1128, 246);
        int int21 = sumWithoutArithmeticOperators0.getSum(238, 125);
        int int24 = sumWithoutArithmeticOperators0.getSum(3371, 10105);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 461 + "'", int12 == 461);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 255 + "'", int15 == 255);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1374 + "'", int18 == 1374);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 363 + "'", int21 == 363);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13476 + "'", int24 == 13476);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(217, 238);
        int int21 = sumWithoutArithmeticOperators0.getSum(156, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(789, 33);
        int int27 = sumWithoutArithmeticOperators0.getSum(2596, 2432);
        int int30 = sumWithoutArithmeticOperators0.getSum(211, 1596);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 455 + "'", int18 == 455);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 156 + "'", int21 == 156);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 822 + "'", int24 == 822);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5028 + "'", int27 == 5028);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1807 + "'", int30 == 1807);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 19);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(1121, 708);
        int int12 = sumWithoutArithmeticOperators0.getSum(1688, 1337);
        int int15 = sumWithoutArithmeticOperators0.getSum(2251, 879);
        int int18 = sumWithoutArithmeticOperators0.getSum(847, 1281);
        int int21 = sumWithoutArithmeticOperators0.getSum(6681, 147);
        int int24 = sumWithoutArithmeticOperators0.getSum(5055, 7349);
        int int27 = sumWithoutArithmeticOperators0.getSum(14540, 9724);
        int int30 = sumWithoutArithmeticOperators0.getSum(16091, 11121);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1829 + "'", int9 == 1829);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3025 + "'", int12 == 3025);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3130 + "'", int15 == 3130);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2128 + "'", int18 == 2128);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6828 + "'", int21 == 6828);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12404 + "'", int24 == 12404);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 24264 + "'", int27 == 24264);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 27212 + "'", int30 == 27212);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(51, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(238, (int) '4');
        int int18 = sumWithoutArithmeticOperators0.getSum(455, (int) (short) 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(5169, 575);
        int int24 = sumWithoutArithmeticOperators0.getSum(3309, 0);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 290 + "'", int15 == 290);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 455 + "'", int18 == 455);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5744 + "'", int21 == 5744);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3309 + "'", int24 == 3309);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(210, 1);
        int int15 = sumWithoutArithmeticOperators0.getSum(226, 17);
        int int18 = sumWithoutArithmeticOperators0.getSum(275, 337);
        int int21 = sumWithoutArithmeticOperators0.getSum(143, 542);
        int int24 = sumWithoutArithmeticOperators0.getSum(2727, 2690);
        int int27 = sumWithoutArithmeticOperators0.getSum(343, 0);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 211 + "'", int12 == 211);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 243 + "'", int15 == 243);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 612 + "'", int18 == 612);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 685 + "'", int21 == 685);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5417 + "'", int24 == 5417);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 343 + "'", int27 == 343);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(19, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(51, 109);
        int int21 = sumWithoutArithmeticOperators0.getSum(390, 152);
        int int24 = sumWithoutArithmeticOperators0.getSum(1028, 546);
        int int27 = sumWithoutArithmeticOperators0.getSum(865, 0);
        int int30 = sumWithoutArithmeticOperators0.getSum(936, 2347);
        int int33 = sumWithoutArithmeticOperators0.getSum(8142, 5792);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 129 + "'", int15 == 129);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 160 + "'", int18 == 160);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 542 + "'", int21 == 542);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1574 + "'", int24 == 1574);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 865 + "'", int27 == 865);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3283 + "'", int30 == 3283);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 13934 + "'", int33 == 13934);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(345, 269);
        int int9 = sumWithoutArithmeticOperators0.getSum(3283, 2732);
        java.lang.Class<?> wildcardClass10 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 614 + "'", int6 == 614);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6015 + "'", int9 == 6015);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(51, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(375, 352);
        int int18 = sumWithoutArithmeticOperators0.getSum(215, (int) '#');
        int int21 = sumWithoutArithmeticOperators0.getSum(42, 724);
        int int24 = sumWithoutArithmeticOperators0.getSum(8052, 905);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 727 + "'", int15 == 727);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 250 + "'", int18 == 250);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 766 + "'", int21 == 766);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8957 + "'", int24 == 8957);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(11, (int) (short) 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(1856, 1670);
        int int21 = sumWithoutArithmeticOperators0.getSum(2777, 751);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3526 + "'", int18 == 3526);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3528 + "'", int21 == 3528);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
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
        int int42 = sumWithoutArithmeticOperators0.getSum(22382, 2919);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 25301 + "'", int42 == 25301);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(321, 56);
        int int9 = sumWithoutArithmeticOperators0.getSum(277, 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(625, 55);
        int int15 = sumWithoutArithmeticOperators0.getSum(165, 199);
        int int18 = sumWithoutArithmeticOperators0.getSum(2426, 1281);
        int int21 = sumWithoutArithmeticOperators0.getSum(18890, 9450);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 377 + "'", int6 == 377);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 377 + "'", int9 == 377);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 680 + "'", int12 == 680);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 364 + "'", int15 == 364);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3707 + "'", int18 == 3707);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 28340 + "'", int21 == 28340);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(11, (int) (short) 0);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int21 = sumWithoutArithmeticOperators0.getSum(727, 460);
        int int24 = sumWithoutArithmeticOperators0.getSum(1556, 2767);
        int int27 = sumWithoutArithmeticOperators0.getSum(8969, 735);
        int int30 = sumWithoutArithmeticOperators0.getSum(2054, 6513);
        int int33 = sumWithoutArithmeticOperators0.getSum(1748, 14073);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1187 + "'", int21 == 1187);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4323 + "'", int24 == 4323);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9704 + "'", int27 == 9704);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8567 + "'", int30 == 8567);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 15821 + "'", int33 == 15821);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(18, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) ' ', (int) (byte) 10);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 17);
        int int24 = sumWithoutArithmeticOperators0.getSum(4576, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 42 + "'", int18 == 42);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 17 + "'", int21 == 17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4576 + "'", int24 == 4576);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(100, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(168, 810);
        int int21 = sumWithoutArithmeticOperators0.getSum(652, 56);
        int int24 = sumWithoutArithmeticOperators0.getSum(542, 931);
        int int27 = sumWithoutArithmeticOperators0.getSum(692, 1680);
        int int30 = sumWithoutArithmeticOperators0.getSum(1203, 3261);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 978 + "'", int18 == 978);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 708 + "'", int21 == 708);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1473 + "'", int24 == 1473);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2372 + "'", int27 == 2372);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4464 + "'", int30 == 4464);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(686, 1579);
        int int12 = sumWithoutArithmeticOperators0.getSum(8, 1244);
        int int15 = sumWithoutArithmeticOperators0.getSum(6945, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2265 + "'", int9 == 2265);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1252 + "'", int12 == 1252);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6945 + "'", int15 == 6945);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(747, 1764);
        java.lang.Class<?> wildcardClass7 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2511 + "'", int6 == 2511);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) ' ', 35);
        int int6 = sumWithoutArithmeticOperators0.getSum(98, 180);
        int int9 = sumWithoutArithmeticOperators0.getSum(753, 8855);
        int int12 = sumWithoutArithmeticOperators0.getSum(8731, 192);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 67 + "'", int3 == 67);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 278 + "'", int6 == 278);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9608 + "'", int9 == 9608);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8923 + "'", int12 == 8923);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(725, 42);
        int int15 = sumWithoutArithmeticOperators0.getSum(269, 368);
        int int18 = sumWithoutArithmeticOperators0.getSum(393, 3658);
        int int21 = sumWithoutArithmeticOperators0.getSum(2386, 2026);
        int int24 = sumWithoutArithmeticOperators0.getSum(4985, 9337);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 767 + "'", int12 == 767);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 637 + "'", int15 == 637);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4051 + "'", int18 == 4051);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4412 + "'", int21 == 4412);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14322 + "'", int24 == 14322);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(18, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 108);
        int int21 = sumWithoutArithmeticOperators0.getSum(17, 266);
        int int24 = sumWithoutArithmeticOperators0.getSum(370, 245);
        int int27 = sumWithoutArithmeticOperators0.getSum(253, 309);
        int int30 = sumWithoutArithmeticOperators0.getSum(4380, 645);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 109 + "'", int18 == 109);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 283 + "'", int21 == 283);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 615 + "'", int24 == 615);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 562 + "'", int27 == 562);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5025 + "'", int30 == 5025);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 34);
        int int18 = sumWithoutArithmeticOperators0.getSum(254, 269);
        int int21 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 250);
        int int24 = sumWithoutArithmeticOperators0.getSum(66, (int) (byte) 0);
        int int27 = sumWithoutArithmeticOperators0.getSum(2903, 19360);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 523 + "'", int18 == 523);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 250 + "'", int21 == 250);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 66 + "'", int24 == 66);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 22263 + "'", int27 == 22263);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 486);
        int int12 = sumWithoutArithmeticOperators0.getSum(725, 911);
        int int15 = sumWithoutArithmeticOperators0.getSum(4858, 5188);
        int int18 = sumWithoutArithmeticOperators0.getSum(570, 330);
        int int21 = sumWithoutArithmeticOperators0.getSum(1971, 2932);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 486 + "'", int9 == 486);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1636 + "'", int12 == 1636);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10046 + "'", int15 == 10046);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 900 + "'", int18 == 900);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4903 + "'", int21 == 4903);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(11, (int) (short) 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(245, 56);
        int int21 = sumWithoutArithmeticOperators0.getSum(3678, 472);
        int int24 = sumWithoutArithmeticOperators0.getSum(5105, 3483);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 301 + "'", int18 == 301);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4150 + "'", int21 == 4150);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8588 + "'", int24 == 8588);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(210, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(5115, 3512);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 221 + "'", int12 == 221);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8627 + "'", int15 == 8627);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(163, 52);
        int int15 = sumWithoutArithmeticOperators0.getSum(210, 165);
        int int18 = sumWithoutArithmeticOperators0.getSum(2343, 51);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 215 + "'", int12 == 215);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 375 + "'", int15 == 375);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2394 + "'", int18 == 2394);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(17, 200);
        int int6 = sumWithoutArithmeticOperators0.getSum(853, 427);
        int int9 = sumWithoutArithmeticOperators0.getSum(1171, 254);
        int int12 = sumWithoutArithmeticOperators0.getSum(2777, 690);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 217 + "'", int3 == 217);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1280 + "'", int6 == 1280);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1425 + "'", int9 == 1425);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3467 + "'", int12 == 3467);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(2279, 615);
        int int15 = sumWithoutArithmeticOperators0.getSum(3726, 132);
        int int18 = sumWithoutArithmeticOperators0.getSum(2601, 1623);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2894 + "'", int12 == 2894);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3858 + "'", int15 == 3858);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4224 + "'", int18 == 4224);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(250, 195);
        int int9 = sumWithoutArithmeticOperators0.getSum(533, 735);
        java.lang.Class<?> wildcardClass10 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 445 + "'", int6 == 445);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1268 + "'", int9 == 1268);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '#', 555);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 122);
        int int18 = sumWithoutArithmeticOperators0.getSum(10, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(1379, 696);
        int int24 = sumWithoutArithmeticOperators0.getSum(2226, 1105);
        int int27 = sumWithoutArithmeticOperators0.getSum(1236, 1526);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 590 + "'", int12 == 590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 46 + "'", int18 == 46);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2075 + "'", int21 == 2075);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3331 + "'", int24 == 3331);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2762 + "'", int27 == 2762);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(209, 154);
        int int18 = sumWithoutArithmeticOperators0.getSum(179, 1530);
        int int21 = sumWithoutArithmeticOperators0.getSum(1807, 1326);
        int int24 = sumWithoutArithmeticOperators0.getSum(22549, 2646);
        int int27 = sumWithoutArithmeticOperators0.getSum(5883, 2383);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 363 + "'", int15 == 363);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1709 + "'", int18 == 1709);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3133 + "'", int21 == 3133);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 25195 + "'", int24 == 25195);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8266 + "'", int27 == 8266);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(708, 23135);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 23843 + "'", int15 == 23843);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(9, 217);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 41);
        int int21 = sumWithoutArithmeticOperators0.getSum(290, 1121);
        int int24 = sumWithoutArithmeticOperators0.getSum(699, 1097);
        int int27 = sumWithoutArithmeticOperators0.getSum(2460, 872);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 226 + "'", int15 == 226);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1411 + "'", int21 == 1411);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1796 + "'", int24 == 1796);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3332 + "'", int27 == 3332);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 306 + "'", int30 == 306);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 782 + "'", int33 == 782);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5343 + "'", int36 == 5343);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 5215 + "'", int39 == 5215);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
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
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(9, 217);
        int int18 = sumWithoutArithmeticOperators0.getSum(934, 766);
        int int21 = sumWithoutArithmeticOperators0.getSum(216, 215);
        int int24 = sumWithoutArithmeticOperators0.getSum(1121, 3726);
        int int27 = sumWithoutArithmeticOperators0.getSum(1643, 5352);
        int int30 = sumWithoutArithmeticOperators0.getSum(8716, 1438);
        int int33 = sumWithoutArithmeticOperators0.getSum(2065, 4719);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 226 + "'", int15 == 226);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1700 + "'", int18 == 1700);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 431 + "'", int21 == 431);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4847 + "'", int24 == 4847);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6995 + "'", int27 == 6995);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10154 + "'", int30 == 10154);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6784 + "'", int33 == 6784);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(251, 210);
        int int15 = sumWithoutArithmeticOperators0.getSum(246, 9);
        int int18 = sumWithoutArithmeticOperators0.getSum(1128, 246);
        int int21 = sumWithoutArithmeticOperators0.getSum(9984, 2120);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 461 + "'", int12 == 461);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 255 + "'", int15 == 255);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1374 + "'", int18 == 1374);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12104 + "'", int21 == 12104);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(238, 253);
        int int15 = sumWithoutArithmeticOperators0.getSum(683, 1003);
        int int18 = sumWithoutArithmeticOperators0.getSum(974, 2511);
        int int21 = sumWithoutArithmeticOperators0.getSum(314, 1252);
        int int24 = sumWithoutArithmeticOperators0.getSum(3665, 12662);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 491 + "'", int12 == 491);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1686 + "'", int15 == 1686);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3485 + "'", int18 == 3485);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1566 + "'", int21 == 1566);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16327 + "'", int24 == 16327);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(651, 938);
        int int18 = sumWithoutArithmeticOperators0.getSum(18104, 2037);
        int int21 = sumWithoutArithmeticOperators0.getSum(3850, 886);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1589 + "'", int15 == 1589);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20141 + "'", int18 == 20141);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4736 + "'", int21 == 4736);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(725, 42);
        int int15 = sumWithoutArithmeticOperators0.getSum(269, 368);
        int int18 = sumWithoutArithmeticOperators0.getSum(393, 3658);
        int int21 = sumWithoutArithmeticOperators0.getSum(17475, 932);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 767 + "'", int12 == 767);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 637 + "'", int15 == 637);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4051 + "'", int18 == 4051);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18407 + "'", int21 == 18407);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(100, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(168, 810);
        int int21 = sumWithoutArithmeticOperators0.getSum(652, 56);
        int int24 = sumWithoutArithmeticOperators0.getSum(542, 931);
        int int27 = sumWithoutArithmeticOperators0.getSum(692, 1680);
        int int30 = sumWithoutArithmeticOperators0.getSum(1236, 2894);
        int int33 = sumWithoutArithmeticOperators0.getSum(7008, 8567);
        int int36 = sumWithoutArithmeticOperators0.getSum(5302, 2400);
        int int39 = sumWithoutArithmeticOperators0.getSum(5791, 3551);
        int int42 = sumWithoutArithmeticOperators0.getSum(104, 30248);
        int int45 = sumWithoutArithmeticOperators0.getSum(16919, 13444);
        java.lang.Class<?> wildcardClass46 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 978 + "'", int18 == 978);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 708 + "'", int21 == 708);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1473 + "'", int24 == 1473);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2372 + "'", int27 == 2372);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4130 + "'", int30 == 4130);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 15575 + "'", int33 == 15575);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 7702 + "'", int36 == 7702);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9342 + "'", int39 == 9342);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 30352 + "'", int42 == 30352);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 30363 + "'", int45 == 30363);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(195, 317);
        int int18 = sumWithoutArithmeticOperators0.getSum(196, 1099);
        int int21 = sumWithoutArithmeticOperators0.getSum(4213, 255);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1295 + "'", int18 == 1295);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4468 + "'", int21 == 4468);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(52, 104);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 194);
        int int21 = sumWithoutArithmeticOperators0.getSum(4380, 1670);
        int int24 = sumWithoutArithmeticOperators0.getSum(16907, 7136);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 156 + "'", int15 == 156);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 194 + "'", int18 == 194);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6050 + "'", int21 == 6050);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 24043 + "'", int24 == 24043);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 199);
        int int12 = sumWithoutArithmeticOperators0.getSum(324, 614);
        int int15 = sumWithoutArithmeticOperators0.getSum(533, (int) (short) 10);
        int int18 = sumWithoutArithmeticOperators0.getSum(1748, 1807);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 199 + "'", int9 == 199);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 938 + "'", int12 == 938);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 543 + "'", int15 == 543);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3555 + "'", int18 == 3555);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(210, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(766, 1168);
        int int24 = sumWithoutArithmeticOperators0.getSum(454, 238);
        int int27 = sumWithoutArithmeticOperators0.getSum(1236, 1688);
        int int30 = sumWithoutArithmeticOperators0.getSum(456, 2810);
        int int33 = sumWithoutArithmeticOperators0.getSum(3401, 128);
        int int36 = sumWithoutArithmeticOperators0.getSum(2363, 1653);
        java.lang.Class<?> wildcardClass37 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 246 + "'", int18 == 246);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1934 + "'", int21 == 1934);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 692 + "'", int24 == 692);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2924 + "'", int27 == 2924);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3266 + "'", int30 == 3266);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3529 + "'", int33 == 3529);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4016 + "'", int36 == 4016);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(345, 269);
        int int9 = sumWithoutArithmeticOperators0.getSum(4434, 3124);
        int int12 = sumWithoutArithmeticOperators0.getSum(1293, 1415);
        int int15 = sumWithoutArithmeticOperators0.getSum(6993, 458);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 614 + "'", int6 == 614);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7558 + "'", int9 == 7558);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2708 + "'", int12 == 2708);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7451 + "'", int15 == 7451);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(210, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(766, 1168);
        int int24 = sumWithoutArithmeticOperators0.getSum(42, 100);
        int int27 = sumWithoutArithmeticOperators0.getSum(2727, 9102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 246 + "'", int18 == 246);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1934 + "'", int21 == 1934);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 142 + "'", int24 == 142);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 11829 + "'", int27 == 11829);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) '#', (int) (short) 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(52, (int) (short) 1);
        int int21 = sumWithoutArithmeticOperators0.getSum(1067, 512);
        int int24 = sumWithoutArithmeticOperators0.getSum(3341, 9062);
        int int27 = sumWithoutArithmeticOperators0.getSum(168, 19055);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53 + "'", int18 == 53);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1579 + "'", int21 == 1579);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12403 + "'", int24 == 12403);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 19223 + "'", int27 == 19223);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(3410, 3629);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7039 + "'", int18 == 7039);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(110, 53);
        int int21 = sumWithoutArithmeticOperators0.getSum(51, 215);
        int int24 = sumWithoutArithmeticOperators0.getSum(66, 1134);
        int int27 = sumWithoutArithmeticOperators0.getSum(932, 4164);
        int int30 = sumWithoutArithmeticOperators0.getSum(16708, 0);
        int int33 = sumWithoutArithmeticOperators0.getSum(34846, 0);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 266 + "'", int21 == 266);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1200 + "'", int24 == 1200);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5096 + "'", int27 == 5096);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 16708 + "'", int30 == 16708);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 34846 + "'", int33 == 34846);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) '#', (int) (short) 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(52, (int) (short) 1);
        int int21 = sumWithoutArithmeticOperators0.getSum(35, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(13588, 694);
        int int27 = sumWithoutArithmeticOperators0.getSum(822, 16708);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53 + "'", int18 == 53);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14282 + "'", int24 == 14282);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 17530 + "'", int27 == 17530);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 199);
        int int12 = sumWithoutArithmeticOperators0.getSum(324, 614);
        int int15 = sumWithoutArithmeticOperators0.getSum(1238, 1072);
        int int18 = sumWithoutArithmeticOperators0.getSum(4173, 4070);
        int int21 = sumWithoutArithmeticOperators0.getSum(8853, 4736);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 199 + "'", int9 == 199);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 938 + "'", int12 == 938);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2310 + "'", int15 == 2310);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8243 + "'", int18 == 8243);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13589 + "'", int21 == 13589);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(9, 2527);
        int int36 = sumWithoutArithmeticOperators0.getSum(1347, 3266);
        int int39 = sumWithoutArithmeticOperators0.getSum(201, 26235);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2536 + "'", int33 == 2536);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4613 + "'", int36 == 4613);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 26436 + "'", int39 == 26436);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(325, 240);
        int int18 = sumWithoutArithmeticOperators0.getSum(5645, 12497);
        int int21 = sumWithoutArithmeticOperators0.getSum(5334, 24275);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 565 + "'", int15 == 565);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18142 + "'", int18 == 18142);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 29609 + "'", int21 == 29609);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
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
        java.lang.Class<?> wildcardClass37 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(44, 0);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 44 + "'", int33 == 44);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(6878, 988);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 7866 + "'", int36 == 7866);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
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
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 42 + "'", int18 == 42);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 191 + "'", int21 == 191);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4374 + "'", int24 == 4374);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8145 + "'", int27 == 8145);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(14232, 10535);
        java.lang.Class<?> wildcardClass37 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 24767 + "'", int36 == 24767);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(251, 210);
        int int15 = sumWithoutArithmeticOperators0.getSum(246, 9);
        int int18 = sumWithoutArithmeticOperators0.getSum(1128, 246);
        int int21 = sumWithoutArithmeticOperators0.getSum(2427, 637);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 461 + "'", int12 == 461);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 255 + "'", int15 == 255);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1374 + "'", int18 == 1374);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3064 + "'", int21 == 3064);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 18);
        int int9 = sumWithoutArithmeticOperators0.getSum(2339, 5977);
        int int12 = sumWithoutArithmeticOperators0.getSum(5577, 1560);
        int int15 = sumWithoutArithmeticOperators0.getSum(10077, 4980);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8316 + "'", int9 == 8316);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7137 + "'", int12 == 7137);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15057 + "'", int15 == 15057);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(19, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(51, 109);
        int int21 = sumWithoutArithmeticOperators0.getSum(11, 40);
        int int24 = sumWithoutArithmeticOperators0.getSum(587, 195);
        int int27 = sumWithoutArithmeticOperators0.getSum(46, 269);
        int int30 = sumWithoutArithmeticOperators0.getSum(696, 601);
        int int33 = sumWithoutArithmeticOperators0.getSum(1180, 988);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 129 + "'", int15 == 129);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 160 + "'", int18 == 160);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 51 + "'", int21 == 51);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 782 + "'", int24 == 782);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 315 + "'", int27 == 315);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1297 + "'", int30 == 1297);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2168 + "'", int33 == 2168);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(210, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 6108);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 246 + "'", int18 == 246);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6109 + "'", int21 == 6109);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(97, 168);
        int int15 = sumWithoutArithmeticOperators0.getSum(590, 2512);
        int int18 = sumWithoutArithmeticOperators0.getSum(455, 2837);
        int int21 = sumWithoutArithmeticOperators0.getSum(2456, 2965);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 4178);
        int int27 = sumWithoutArithmeticOperators0.getSum(3401, 2899);
        int int30 = sumWithoutArithmeticOperators0.getSum(728, 6436);
        int int33 = sumWithoutArithmeticOperators0.getSum(12935, 5113);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 265 + "'", int12 == 265);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3102 + "'", int15 == 3102);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3292 + "'", int18 == 3292);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5421 + "'", int21 == 5421);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4178 + "'", int24 == 4178);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6300 + "'", int27 == 6300);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7164 + "'", int30 == 7164);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 18048 + "'", int33 == 18048);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(100, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(168, 810);
        int int21 = sumWithoutArithmeticOperators0.getSum(652, 56);
        int int24 = sumWithoutArithmeticOperators0.getSum(542, 931);
        int int27 = sumWithoutArithmeticOperators0.getSum(692, 1680);
        int int30 = sumWithoutArithmeticOperators0.getSum(1236, 2894);
        int int33 = sumWithoutArithmeticOperators0.getSum(7008, 8567);
        int int36 = sumWithoutArithmeticOperators0.getSum(5302, 2400);
        java.lang.Class<?> wildcardClass37 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 978 + "'", int18 == 978);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 708 + "'", int21 == 708);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1473 + "'", int24 == 1473);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2372 + "'", int27 == 2372);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4130 + "'", int30 == 4130);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 15575 + "'", int33 == 15575);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 7702 + "'", int36 == 7702);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(352, 375);
        int int18 = sumWithoutArithmeticOperators0.getSum(122, 1327);
        int int21 = sumWithoutArithmeticOperators0.getSum(1171, 1019);
        int int24 = sumWithoutArithmeticOperators0.getSum(2464, 728);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 727 + "'", int15 == 727);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1449 + "'", int18 == 1449);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2190 + "'", int21 == 2190);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3192 + "'", int24 == 3192);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(19, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(51, 109);
        int int21 = sumWithoutArithmeticOperators0.getSum(256, 727);
        int int24 = sumWithoutArithmeticOperators0.getSum(811, 2498);
        int int27 = sumWithoutArithmeticOperators0.getSum(275, 105);
        int int30 = sumWithoutArithmeticOperators0.getSum(4488, 0);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 129 + "'", int15 == 129);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 160 + "'", int18 == 160);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 983 + "'", int21 == 983);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3309 + "'", int24 == 3309);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 380 + "'", int27 == 380);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4488 + "'", int30 == 4488);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(196, (int) ' ');
        int int15 = sumWithoutArithmeticOperators0.getSum(1128, 108);
        int int18 = sumWithoutArithmeticOperators0.getSum(844, 98);
        int int21 = sumWithoutArithmeticOperators0.getSum(1972, 54);
        int int24 = sumWithoutArithmeticOperators0.getSum(562, 1738);
        int int27 = sumWithoutArithmeticOperators0.getSum(2824, 2684);
        int int30 = sumWithoutArithmeticOperators0.getSum(7597, 16678);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 228 + "'", int12 == 228);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1236 + "'", int15 == 1236);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 942 + "'", int18 == 942);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2026 + "'", int21 == 2026);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2300 + "'", int24 == 2300);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5508 + "'", int27 == 5508);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 24275 + "'", int30 == 24275);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(11, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(286, 9);
        int int24 = sumWithoutArithmeticOperators0.getSum(156, (int) (byte) 10);
        int int27 = sumWithoutArithmeticOperators0.getSum(0, 4171);
        int int30 = sumWithoutArithmeticOperators0.getSum(2535, 1373);
        int int33 = sumWithoutArithmeticOperators0.getSum(2646, 4869);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 166 + "'", int24 == 166);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4171 + "'", int27 == 4171);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3908 + "'", int30 == 3908);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 7515 + "'", int33 == 7515);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(11, (int) (short) 0);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int21 = sumWithoutArithmeticOperators0.getSum(665, 783);
        int int24 = sumWithoutArithmeticOperators0.getSum(1670, 822);
        int int27 = sumWithoutArithmeticOperators0.getSum(4434, 19360);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1448 + "'", int21 == 1448);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2492 + "'", int24 == 2492);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 23794 + "'", int27 == 23794);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(160, 465);
        int int12 = sumWithoutArithmeticOperators0.getSum(3478, 0);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 625 + "'", int9 == 625);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3478 + "'", int12 == 3478);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 34);
        int int18 = sumWithoutArithmeticOperators0.getSum(254, 269);
        int int21 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 250);
        int int24 = sumWithoutArithmeticOperators0.getSum(3091, 1709);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 523 + "'", int18 == 523);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 250 + "'", int21 == 250);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4800 + "'", int24 == 4800);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) -1);
        int int21 = sumWithoutArithmeticOperators0.getSum(7, (int) (short) 100);
        int int24 = sumWithoutArithmeticOperators0.getSum(546, 699);
        int int27 = sumWithoutArithmeticOperators0.getSum(2264, 156);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 107 + "'", int21 == 107);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1245 + "'", int24 == 1245);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2420 + "'", int27 == 2420);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(196, (int) ' ');
        int int15 = sumWithoutArithmeticOperators0.getSum(266, 853);
        int int18 = sumWithoutArithmeticOperators0.getSum(46, 101);
        int int21 = sumWithoutArithmeticOperators0.getSum(52, 696);
        int int24 = sumWithoutArithmeticOperators0.getSum(134, 242);
        int int27 = sumWithoutArithmeticOperators0.getSum(1029, 7383);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 228 + "'", int12 == 228);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1119 + "'", int15 == 1119);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 147 + "'", int18 == 147);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 748 + "'", int21 == 748);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 376 + "'", int24 == 376);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8412 + "'", int27 == 8412);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) -1);
        int int21 = sumWithoutArithmeticOperators0.getSum(7, (int) (short) 100);
        int int24 = sumWithoutArithmeticOperators0.getSum(11274, 16077);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 107 + "'", int21 == 107);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 27351 + "'", int24 == 27351);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(110, 53);
        int int21 = sumWithoutArithmeticOperators0.getSum(162, 321);
        int int24 = sumWithoutArithmeticOperators0.getSum(407, 228);
        int int27 = sumWithoutArithmeticOperators0.getSum(5670, 4323);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 483 + "'", int21 == 483);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 635 + "'", int24 == 635);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9993 + "'", int27 == 9993);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(255, 4075);
        int int18 = sumWithoutArithmeticOperators0.getSum(603, 979);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4330 + "'", int15 == 4330);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1582 + "'", int18 == 1582);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(1112, (-1));
        int int21 = sumWithoutArithmeticOperators0.getSum(1222, 269);
        int int24 = sumWithoutArithmeticOperators0.getSum(791, 2713);
        int int27 = sumWithoutArithmeticOperators0.getSum(0, 6811);
        int int30 = sumWithoutArithmeticOperators0.getSum(4992, 4070);
        int int33 = sumWithoutArithmeticOperators0.getSum(201, 9821);
        int int36 = sumWithoutArithmeticOperators0.getSum(3619, 13170);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1111 + "'", int18 == 1111);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1491 + "'", int21 == 1491);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3504 + "'", int24 == 3504);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6811 + "'", int27 == 6811);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9062 + "'", int30 == 9062);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10022 + "'", int33 == 10022);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 16789 + "'", int36 == 16789);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(1987, 1496);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3483 + "'", int30 == 3483);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(201, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(523, 382);
        int int18 = sumWithoutArithmeticOperators0.getSum(1111, 2903);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 212 + "'", int12 == 212);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 905 + "'", int15 == 905);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4014 + "'", int18 == 4014);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(5675, 9962);
        int int36 = sumWithoutArithmeticOperators0.getSum(6674, 1425);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 15637 + "'", int33 == 15637);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 8099 + "'", int36 == 8099);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(289, 269);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 343);
        int int18 = sumWithoutArithmeticOperators0.getSum(6059, 2810);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 558 + "'", int12 == 558);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 343 + "'", int15 == 343);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8869 + "'", int18 == 8869);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(101, 21);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(243, 1133);
        int int24 = sumWithoutArithmeticOperators0.getSum(101, 107);
        int int27 = sumWithoutArithmeticOperators0.getSum(6300, 15990);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 162 + "'", int18 == 162);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1376 + "'", int21 == 1376);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 208 + "'", int24 == 208);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 22290 + "'", int27 == 22290);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) -1);
        int int21 = sumWithoutArithmeticOperators0.getSum(266, 11);
        int int24 = sumWithoutArithmeticOperators0.getSum(52, 998);
        int int27 = sumWithoutArithmeticOperators0.getSum(98, 2855);
        int int30 = sumWithoutArithmeticOperators0.getSum(2782, 1903);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 277 + "'", int21 == 277);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1050 + "'", int24 == 1050);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2953 + "'", int27 == 2953);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4685 + "'", int30 == 4685);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 200);
        int int9 = sumWithoutArithmeticOperators0.getSum(156, 36);
        int int12 = sumWithoutArithmeticOperators0.getSum(1987, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(2518, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(3625, 8584);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 210 + "'", int6 == 210);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 192 + "'", int9 == 192);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1987 + "'", int12 == 1987);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2518 + "'", int15 == 2518);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 12209 + "'", int18 == 12209);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(51, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(375, 352);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 165);
        int int21 = sumWithoutArithmeticOperators0.getSum(109, 52);
        int int24 = sumWithoutArithmeticOperators0.getSum(6455, 945);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 727 + "'", int15 == 727);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 165 + "'", int18 == 165);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 161 + "'", int21 == 161);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7400 + "'", int24 == 7400);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(260, 1327);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 7981);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1587 + "'", int9 == 1587);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7981 + "'", int12 == 7981);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(40, 269);
        int int6 = sumWithoutArithmeticOperators0.getSum(152, 465);
        int int9 = sumWithoutArithmeticOperators0.getSum(562, 803);
        int int12 = sumWithoutArithmeticOperators0.getSum(3526, 8853);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 309 + "'", int3 == 309);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 617 + "'", int6 == 617);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1365 + "'", int9 == 1365);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12379 + "'", int12 == 12379);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(11, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(286, 9);
        int int24 = sumWithoutArithmeticOperators0.getSum(110, 266);
        int int27 = sumWithoutArithmeticOperators0.getSum(1606, 623);
        int int30 = sumWithoutArithmeticOperators0.getSum(810, 2675);
        int int33 = sumWithoutArithmeticOperators0.getSum(13151, 2926);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 376 + "'", int24 == 376);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2229 + "'", int27 == 2229);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3485 + "'", int30 == 3485);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 16077 + "'", int33 == 16077);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(162, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(623, 483);
        int int21 = sumWithoutArithmeticOperators0.getSum(4392, 1040);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1106 + "'", int18 == 1106);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5432 + "'", int21 == 5432);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(163, 52);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 200);
        int int18 = sumWithoutArithmeticOperators0.getSum(325, 617);
        int int21 = sumWithoutArithmeticOperators0.getSum(652, 0);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 215 + "'", int12 == 215);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 942 + "'", int18 == 942);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 652 + "'", int21 == 652);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(250, 195);
        int int9 = sumWithoutArithmeticOperators0.getSum(533, 735);
        int int12 = sumWithoutArithmeticOperators0.getSum(5099, 6372);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 445 + "'", int6 == 445);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1268 + "'", int9 == 1268);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11471 + "'", int12 == 11471);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
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
        int int45 = sumWithoutArithmeticOperators0.getSum(711, 161);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 306 + "'", int30 == 306);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 782 + "'", int33 == 782);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5343 + "'", int36 == 5343);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 5215 + "'", int39 == 5215);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2919 + "'", int42 == 2919);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 872 + "'", int45 == 872);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 19);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(1121, 708);
        int int12 = sumWithoutArithmeticOperators0.getSum(1688, 1337);
        int int15 = sumWithoutArithmeticOperators0.getSum(690, 2090);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1829 + "'", int9 == 1829);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3025 + "'", int12 == 3025);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2780 + "'", int15 == 2780);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(2279, 615);
        int int15 = sumWithoutArithmeticOperators0.getSum(3726, 132);
        int int18 = sumWithoutArithmeticOperators0.getSum(4948, 11274);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2894 + "'", int12 == 2894);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3858 + "'", int15 == 3858);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16222 + "'", int18 == 16222);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 200);
        int int9 = sumWithoutArithmeticOperators0.getSum(156, 36);
        int int12 = sumWithoutArithmeticOperators0.getSum(1987, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(542, 4563);
        int int18 = sumWithoutArithmeticOperators0.getSum(89, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(6410, 1019);
        int int24 = sumWithoutArithmeticOperators0.getSum(6962, 14019);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 210 + "'", int6 == 210);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 192 + "'", int9 == 192);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1987 + "'", int12 == 1987);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5105 + "'", int15 == 5105);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 89 + "'", int18 == 89);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7429 + "'", int21 == 7429);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20981 + "'", int24 == 20981);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 10);
        int int15 = sumWithoutArithmeticOperators0.getSum(488, 1236);
        int int18 = sumWithoutArithmeticOperators0.getSum(546, 853);
        int int21 = sumWithoutArithmeticOperators0.getSum(574, 2389);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1724 + "'", int15 == 1724);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1399 + "'", int18 == 1399);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2963 + "'", int21 == 2963);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(289, 149);
        int int33 = sumWithoutArithmeticOperators0.getSum(238, 1351);
        int int36 = sumWithoutArithmeticOperators0.getSum(665, 11872);
        int int39 = sumWithoutArithmeticOperators0.getSum(27422, 10164);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 246 + "'", int18 == 246);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 427 + "'", int21 == 427);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 635 + "'", int24 == 635);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 360 + "'", int27 == 360);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 438 + "'", int30 == 438);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1589 + "'", int33 == 1589);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 12537 + "'", int36 == 12537);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 37586 + "'", int39 == 37586);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(209, 154);
        int int18 = sumWithoutArithmeticOperators0.getSum(19, 283);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 363 + "'", int15 == 363);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 302 + "'", int18 == 302);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(51, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(375, 352);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 165);
        int int21 = sumWithoutArithmeticOperators0.getSum(7084, 248);
        int int24 = sumWithoutArithmeticOperators0.getSum(18890, 14982);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 727 + "'", int15 == 727);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 165 + "'", int18 == 165);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7332 + "'", int21 == 7332);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 33872 + "'", int24 == 33872);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(40, 269);
        int int6 = sumWithoutArithmeticOperators0.getSum(6164, 1430);
        int int9 = sumWithoutArithmeticOperators0.getSum(13677, 2646);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 309 + "'", int3 == 309);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7594 + "'", int6 == 7594);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16323 + "'", int9 == 16323);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(162, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(156, 491);
        int int21 = sumWithoutArithmeticOperators0.getSum(283, 188);
        int int24 = sumWithoutArithmeticOperators0.getSum(11552, 5450);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 647 + "'", int18 == 647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 471 + "'", int21 == 471);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 17002 + "'", int24 == 17002);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(352, 375);
        int int18 = sumWithoutArithmeticOperators0.getSum(122, 1327);
        int int21 = sumWithoutArithmeticOperators0.getSum(1376, 1337);
        int int24 = sumWithoutArithmeticOperators0.getSum(1759, 240);
        int int27 = sumWithoutArithmeticOperators0.getSum(55, 460);
        int int30 = sumWithoutArithmeticOperators0.getSum(1259, 0);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 727 + "'", int15 == 727);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1449 + "'", int18 == 1449);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2713 + "'", int21 == 2713);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1999 + "'", int24 == 1999);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 515 + "'", int27 == 515);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1259 + "'", int30 == 1259);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 101);
        int int18 = sumWithoutArithmeticOperators0.getSum(209, 107);
        int int21 = sumWithoutArithmeticOperators0.getSum(1245, 727);
        int int24 = sumWithoutArithmeticOperators0.getSum(1427, 1101);
        int int27 = sumWithoutArithmeticOperators0.getSum(313, 1536);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 154 + "'", int15 == 154);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 316 + "'", int18 == 316);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1972 + "'", int21 == 1972);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2528 + "'", int24 == 2528);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1849 + "'", int27 == 1849);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(100, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(168, 810);
        int int21 = sumWithoutArithmeticOperators0.getSum(652, 56);
        int int24 = sumWithoutArithmeticOperators0.getSum(542, 931);
        int int27 = sumWithoutArithmeticOperators0.getSum(692, 1680);
        int int30 = sumWithoutArithmeticOperators0.getSum(565, 1668);
        int int33 = sumWithoutArithmeticOperators0.getSum(2926, 583);
        int int36 = sumWithoutArithmeticOperators0.getSum(9220, 3908);
        int int39 = sumWithoutArithmeticOperators0.getSum(2762, 2631);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 978 + "'", int18 == 978);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 708 + "'", int21 == 708);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1473 + "'", int24 == 1473);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2372 + "'", int27 == 2372);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2233 + "'", int30 == 2233);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3509 + "'", int33 == 3509);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 13128 + "'", int36 == 13128);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 5393 + "'", int39 == 5393);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(211, 245);
        int int15 = sumWithoutArithmeticOperators0.getSum(697, 290);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 456 + "'", int12 == 456);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 987 + "'", int15 == 987);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(210, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(766, 1168);
        int int24 = sumWithoutArithmeticOperators0.getSum(454, 238);
        int int27 = sumWithoutArithmeticOperators0.getSum(1236, 1688);
        int int30 = sumWithoutArithmeticOperators0.getSum(456, 2810);
        int int33 = sumWithoutArithmeticOperators0.getSum(98, 3733);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 246 + "'", int18 == 246);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1934 + "'", int21 == 1934);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 692 + "'", int24 == 692);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2924 + "'", int27 == 2924);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3266 + "'", int30 == 3266);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3831 + "'", int33 == 3831);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(217, 238);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 978);
        int int24 = sumWithoutArithmeticOperators0.getSum(6413, 780);
        int int27 = sumWithoutArithmeticOperators0.getSum(6683, 9835);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 455 + "'", int18 == 455);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 978 + "'", int21 == 978);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7193 + "'", int24 == 7193);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16518 + "'", int27 == 16518);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 165);
        int int12 = sumWithoutArithmeticOperators0.getSum(152, 108);
        int int15 = sumWithoutArithmeticOperators0.getSum(788, 360);
        int int18 = sumWithoutArithmeticOperators0.getSum(1180, (int) (short) 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(1701, 1282);
        int int24 = sumWithoutArithmeticOperators0.getSum(697, 18167);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 294 + "'", int9 == 294);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 260 + "'", int12 == 260);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1148 + "'", int15 == 1148);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1180 + "'", int18 == 1180);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2983 + "'", int21 == 2983);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 18864 + "'", int24 == 18864);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(11, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(286, 9);
        int int24 = sumWithoutArithmeticOperators0.getSum((int) ' ', 44);
        int int27 = sumWithoutArithmeticOperators0.getSum(2065, 12568);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 76 + "'", int24 == 76);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 14633 + "'", int27 == 14633);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(163, 52);
        int int15 = sumWithoutArithmeticOperators0.getSum(210, 165);
        int int18 = sumWithoutArithmeticOperators0.getSum(149, 67);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 570);
        int int24 = sumWithoutArithmeticOperators0.getSum(3997, 7034);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 215 + "'", int12 == 215);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 375 + "'", int15 == 375);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 216 + "'", int18 == 216);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 570 + "'", int21 == 570);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11031 + "'", int24 == 11031);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(3116, 766);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3882 + "'", int15 == 3882);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 18);
        int int9 = sumWithoutArithmeticOperators0.getSum(36, 160);
        int int12 = sumWithoutArithmeticOperators0.getSum(686, 2696);
        int int15 = sumWithoutArithmeticOperators0.getSum(2810, 5491);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 196 + "'", int9 == 196);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3382 + "'", int12 == 3382);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8301 + "'", int15 == 8301);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(2713, 9570);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 390 + "'", int12 == 390);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 407 + "'", int15 == 407);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 170 + "'", int18 == 170);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 601 + "'", int21 == 601);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2938 + "'", int24 == 2938);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4300 + "'", int27 == 4300);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 12283 + "'", int30 == 12283);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 19);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(859, 454);
        int int12 = sumWithoutArithmeticOperators0.getSum(149, 188);
        int int15 = sumWithoutArithmeticOperators0.getSum(10582, 2250);
        int int18 = sumWithoutArithmeticOperators0.getSum(543, 2814);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1313 + "'", int9 == 1313);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 337 + "'", int12 == 337);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12832 + "'", int15 == 12832);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3357 + "'", int18 == 3357);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 101);
        int int18 = sumWithoutArithmeticOperators0.getSum(209, 107);
        int int21 = sumWithoutArithmeticOperators0.getSum(1112, 2645);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 154 + "'", int15 == 154);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 316 + "'", int18 == 316);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3757 + "'", int21 == 3757);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
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
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(211, 245);
        int int15 = sumWithoutArithmeticOperators0.getSum(697, 290);
        int int18 = sumWithoutArithmeticOperators0.getSum(1759, 1909);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 932);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 456 + "'", int12 == 456);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 987 + "'", int15 == 987);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3668 + "'", int18 == 3668);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 932 + "'", int21 == 932);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(6326, 117);
        int int9 = sumWithoutArithmeticOperators0.getSum(988, 4127);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6443 + "'", int6 == 6443);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5115 + "'", int9 == 5115);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) ' ', 35);
        int int6 = sumWithoutArithmeticOperators0.getSum(98, 180);
        int int9 = sumWithoutArithmeticOperators0.getSum(3025, 1245);
        java.lang.Class<?> wildcardClass10 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 67 + "'", int3 == 67);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 278 + "'", int6 == 278);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4270 + "'", int9 == 4270);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(955, 89);
        int int18 = sumWithoutArithmeticOperators0.getSum(278, 725);
        int int21 = sumWithoutArithmeticOperators0.getSum(601, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(865, 1724);
        int int27 = sumWithoutArithmeticOperators0.getSum(2415, 1427);
        int int30 = sumWithoutArithmeticOperators0.getSum(558, 16956);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1044 + "'", int15 == 1044);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1003 + "'", int18 == 1003);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 601 + "'", int21 == 601);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2589 + "'", int24 == 2589);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3842 + "'", int27 == 3842);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 17514 + "'", int30 == 17514);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(18, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 108);
        int int21 = sumWithoutArithmeticOperators0.getSum(17, 266);
        int int24 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 376);
        int int27 = sumWithoutArithmeticOperators0.getSum(2703, 364);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 109 + "'", int18 == 109);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 283 + "'", int21 == 283);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 377 + "'", int24 == 377);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3067 + "'", int27 == 3067);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(3825, 1543);
        int int33 = sumWithoutArithmeticOperators0.getSum(9997, 6216);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 226 + "'", int15 == 226);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1700 + "'", int18 == 1700);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 431 + "'", int21 == 431);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1185 + "'", int24 == 1185);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5176 + "'", int27 == 5176);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5368 + "'", int30 == 5368);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 16213 + "'", int33 == 16213);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(289, 269);
        int int15 = sumWithoutArithmeticOperators0.getSum(766, 978);
        int int18 = sumWithoutArithmeticOperators0.getSum(925, 360);
        int int21 = sumWithoutArithmeticOperators0.getSum(2635, 55);
        int int24 = sumWithoutArithmeticOperators0.getSum(2203, 1705);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 558 + "'", int12 == 558);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1744 + "'", int15 == 1744);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1285 + "'", int18 == 1285);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2690 + "'", int21 == 2690);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3908 + "'", int24 == 3908);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(110, 53);
        int int21 = sumWithoutArithmeticOperators0.getSum(162, 321);
        int int24 = sumWithoutArithmeticOperators0.getSum(407, 228);
        int int27 = sumWithoutArithmeticOperators0.getSum(10307, 9117);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 483 + "'", int21 == 483);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 635 + "'", int24 == 635);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 19424 + "'", int27 == 19424);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(11, (int) (short) 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(1856, 1670);
        int int21 = sumWithoutArithmeticOperators0.getSum(90, 4631);
        int int24 = sumWithoutArithmeticOperators0.getSum(2463, 18104);
        int int27 = sumWithoutArithmeticOperators0.getSum(14738, 5150);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3526 + "'", int18 == 3526);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4721 + "'", int21 == 4721);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20567 + "'", int24 == 20567);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 19888 + "'", int27 == 19888);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 202);
        int int15 = sumWithoutArithmeticOperators0.getSum(2316, 1793);
        int int18 = sumWithoutArithmeticOperators0.getSum(162, 10387);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 202 + "'", int12 == 202);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4109 + "'", int15 == 4109);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10549 + "'", int18 == 10549);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(1174, 2363);
        int int9 = sumWithoutArithmeticOperators0.getSum(184, 3406);
        int int12 = sumWithoutArithmeticOperators0.getSum(54, 5096);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3537 + "'", int6 == 3537);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3590 + "'", int9 == 3590);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5150 + "'", int12 == 5150);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(196, (int) ' ');
        int int15 = sumWithoutArithmeticOperators0.getSum(41, 692);
        int int18 = sumWithoutArithmeticOperators0.getSum(144, 109);
        int int21 = sumWithoutArithmeticOperators0.getSum(7460, 1407);
        int int24 = sumWithoutArithmeticOperators0.getSum((int) 'a', 3371);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 228 + "'", int12 == 228);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 733 + "'", int15 == 733);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 253 + "'", int18 == 253);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8867 + "'", int21 == 8867);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3468 + "'", int24 == 3468);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 250);
        int int18 = sumWithoutArithmeticOperators0.getSum(469, 665);
        int int21 = sumWithoutArithmeticOperators0.getSum(1626, 1971);
        int int24 = sumWithoutArithmeticOperators0.getSum(852, 2777);
        int int27 = sumWithoutArithmeticOperators0.getSum(4177, 6616);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 249 + "'", int15 == 249);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1134 + "'", int18 == 1134);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3597 + "'", int21 == 3597);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3629 + "'", int24 == 3629);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10793 + "'", int27 == 10793);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 36);
        int int18 = sumWithoutArithmeticOperators0.getSum(526, 213);
        int int21 = sumWithoutArithmeticOperators0.getSum(311, 786);
        int int24 = sumWithoutArithmeticOperators0.getSum(14282, 3224);
        int int27 = sumWithoutArithmeticOperators0.getSum(8183, 2420);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 739 + "'", int18 == 739);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1097 + "'", int21 == 1097);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 17506 + "'", int24 == 17506);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10603 + "'", int27 == 10603);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) '#', (int) (short) 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(186, 100);
        int int21 = sumWithoutArithmeticOperators0.getSum(465, 151);
        int int24 = sumWithoutArithmeticOperators0.getSum(3529, 379);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 286 + "'", int18 == 286);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 616 + "'", int21 == 616);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3908 + "'", int24 == 3908);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 36);
        int int18 = sumWithoutArithmeticOperators0.getSum(844, 289);
        int int21 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, 2476);
        int int24 = sumWithoutArithmeticOperators0.getSum(2935, 99);
        int int27 = sumWithoutArithmeticOperators0.getSum(1589, 3467);
        int int30 = sumWithoutArithmeticOperators0.getSum(4152, 998);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1133 + "'", int18 == 1133);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2476 + "'", int21 == 2476);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3034 + "'", int24 == 3034);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5056 + "'", int27 == 5056);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5150 + "'", int30 == 5150);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 165);
        int int12 = sumWithoutArithmeticOperators0.getSum(152, 108);
        int int15 = sumWithoutArithmeticOperators0.getSum(788, 360);
        int int18 = sumWithoutArithmeticOperators0.getSum(44, 2347);
        int int21 = sumWithoutArithmeticOperators0.getSum(628, 3762);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 294 + "'", int9 == 294);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 260 + "'", int12 == 260);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1148 + "'", int15 == 1148);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2391 + "'", int18 == 2391);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4390 + "'", int21 == 4390);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(160, 465);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 735);
        int int15 = sumWithoutArithmeticOperators0.getSum(1238, 100);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 625 + "'", int9 == 625);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 735 + "'", int12 == 735);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1338 + "'", int15 == 1338);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(955, 89);
        int int18 = sumWithoutArithmeticOperators0.getSum(278, 725);
        int int21 = sumWithoutArithmeticOperators0.getSum(212, 708);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 6402);
        int int27 = sumWithoutArithmeticOperators0.getSum(11216, 15585);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1044 + "'", int15 == 1044);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1003 + "'", int18 == 1003);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 920 + "'", int21 == 920);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6402 + "'", int24 == 6402);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 26801 + "'", int27 == 26801);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 200);
        int int9 = sumWithoutArithmeticOperators0.getSum(156, 36);
        int int12 = sumWithoutArithmeticOperators0.getSum(1987, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(542, 4563);
        int int18 = sumWithoutArithmeticOperators0.getSum(637, 7000);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(4037, 8985);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 210 + "'", int6 == 210);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 192 + "'", int9 == 192);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1987 + "'", int12 == 1987);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5105 + "'", int15 == 5105);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7637 + "'", int18 == 7637);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13022 + "'", int24 == 13022);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(527, 1723);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2250 + "'", int33 == 2250);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
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
        int int39 = sumWithoutArithmeticOperators0.getSum(10864, 0);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 306 + "'", int30 == 306);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 782 + "'", int33 == 782);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1313 + "'", int36 == 1313);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10864 + "'", int39 == 10864);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(211, 245);
        int int15 = sumWithoutArithmeticOperators0.getSum(382, 32);
        int int18 = sumWithoutArithmeticOperators0.getSum(1168, 1);
        int int21 = sumWithoutArithmeticOperators0.getSum(4323, 3461);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 456 + "'", int12 == 456);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 414 + "'", int15 == 414);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1169 + "'", int18 == 1169);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7784 + "'", int21 == 7784);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(1531, 12662);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 14193 + "'", int33 == 14193);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
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
        int int45 = sumWithoutArithmeticOperators0.getSum(5894, 27930);
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 33824 + "'", int45 == 33824);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum(107, 460);
        int int15 = sumWithoutArithmeticOperators0.getSum(6216, 1467);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 567 + "'", int12 == 567);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7683 + "'", int15 == 7683);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(19, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(1245, 1680);
        int int21 = sumWithoutArithmeticOperators0.getSum(996, 2368);
        int int24 = sumWithoutArithmeticOperators0.getSum(3510, 7400);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 129 + "'", int15 == 129);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2925 + "'", int18 == 2925);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3364 + "'", int21 == 3364);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10910 + "'", int24 == 10910);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(101, 21);
        int int18 = sumWithoutArithmeticOperators0.getSum(89, 180);
        int int21 = sumWithoutArithmeticOperators0.getSum(199, (int) '4');
        int int24 = sumWithoutArithmeticOperators0.getSum(122, 0);
        int int27 = sumWithoutArithmeticOperators0.getSum(1096, 1530);
        int int30 = sumWithoutArithmeticOperators0.getSum(2187, 1451);
        int int33 = sumWithoutArithmeticOperators0.getSum(7687, 726);
        int int36 = sumWithoutArithmeticOperators0.getSum(6300, 3158);
        java.lang.Class<?> wildcardClass37 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 269 + "'", int18 == 269);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 251 + "'", int21 == 251);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 122 + "'", int24 == 122);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2626 + "'", int27 == 2626);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3638 + "'", int30 == 3638);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8413 + "'", int33 == 8413);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 9458 + "'", int36 == 9458);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(217, 238);
        int int21 = sumWithoutArithmeticOperators0.getSum(156, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(1252, 2464);
        int int27 = sumWithoutArithmeticOperators0.getSum(623, 215);
        int int30 = sumWithoutArithmeticOperators0.getSum(9568, 2324);
        int int33 = sumWithoutArithmeticOperators0.getSum(8195, 12738);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 455 + "'", int18 == 455);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 156 + "'", int21 == 156);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3716 + "'", int24 == 3716);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 838 + "'", int27 == 838);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 11892 + "'", int30 == 11892);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 20933 + "'", int33 == 20933);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(201, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(638, 1574);
        int int18 = sumWithoutArithmeticOperators0.getSum(7648, (int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 212 + "'", int12 == 212);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2212 + "'", int15 == 2212);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7658 + "'", int18 == 7658);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(110, 53);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 7);
        int int24 = sumWithoutArithmeticOperators0.getSum(1187, (int) (byte) -1);
        int int27 = sumWithoutArithmeticOperators0.getSum(1449, 1023);
        int int30 = sumWithoutArithmeticOperators0.getSum(0, 10825);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1186 + "'", int24 == 1186);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2472 + "'", int27 == 2472);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10825 + "'", int30 == 10825);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(2617, 896);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3513 + "'", int33 == 3513);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(110, 53);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 7);
        int int24 = sumWithoutArithmeticOperators0.getSum(727, 926);
        int int27 = sumWithoutArithmeticOperators0.getSum(2324, (int) (short) 0);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1653 + "'", int24 == 1653);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2324 + "'", int27 == 2324);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(2053, 9568);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11621 + "'", int15 == 11621);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 19);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(859, 454);
        int int12 = sumWithoutArithmeticOperators0.getSum(1253, 461);
        int int15 = sumWithoutArithmeticOperators0.getSum(288, 309);
        int int18 = sumWithoutArithmeticOperators0.getSum(582, 271);
        int int21 = sumWithoutArithmeticOperators0.getSum(3297, 11323);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1313 + "'", int9 == 1313);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1714 + "'", int12 == 1714);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 597 + "'", int15 == 597);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853 + "'", int18 == 853);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14620 + "'", int21 == 14620);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(465, 324);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(269, 301);
        int int24 = sumWithoutArithmeticOperators0.getSum(2716, 694);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 789 + "'", int15 == 789);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 570 + "'", int21 == 570);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3410 + "'", int24 == 3410);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 19);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(859, 454);
        int int12 = sumWithoutArithmeticOperators0.getSum(397, 388);
        int int15 = sumWithoutArithmeticOperators0.getSum(685, 5017);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1313 + "'", int9 == 1313);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 785 + "'", int12 == 785);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5702 + "'", int15 == 5702);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(19, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(1245, 1680);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 129 + "'", int15 == 129);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2925 + "'", int18 == 2925);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(210, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(154, 574);
        int int24 = sumWithoutArithmeticOperators0.getSum(11892, 7163);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 246 + "'", int18 == 246);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 728 + "'", int21 == 728);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19055 + "'", int24 == 19055);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 210);
        int int18 = sumWithoutArithmeticOperators0.getSum(1238, 116);
        int int21 = sumWithoutArithmeticOperators0.getSum(840, 2042);
        int int24 = sumWithoutArithmeticOperators0.getSum(10833, 4323);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 254 + "'", int15 == 254);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1354 + "'", int18 == 1354);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2882 + "'", int21 == 2882);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15156 + "'", int24 == 15156);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(266, 295);
        int int15 = sumWithoutArithmeticOperators0.getSum(1067, (int) 'a');
        int int18 = sumWithoutArithmeticOperators0.getSum(3188, 1762);
        int int21 = sumWithoutArithmeticOperators0.getSum(6812, (int) 'a');
        int int24 = sumWithoutArithmeticOperators0.getSum(7008, 2407);
        int int27 = sumWithoutArithmeticOperators0.getSum(1379, 3371);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 561 + "'", int12 == 561);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1164 + "'", int15 == 1164);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4950 + "'", int18 == 4950);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6909 + "'", int21 == 6909);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9415 + "'", int24 == 9415);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4750 + "'", int27 == 4750);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) ' ', 35);
        int int6 = sumWithoutArithmeticOperators0.getSum(98, 180);
        int int9 = sumWithoutArithmeticOperators0.getSum(3025, 1245);
        int int12 = sumWithoutArithmeticOperators0.getSum(3412, 246);
        int int15 = sumWithoutArithmeticOperators0.getSum(6474, 3236);
        int int18 = sumWithoutArithmeticOperators0.getSum(6250, 760);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 67 + "'", int3 == 67);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 278 + "'", int6 == 278);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4270 + "'", int9 == 4270);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3658 + "'", int12 == 3658);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9710 + "'", int15 == 9710);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7010 + "'", int18 == 7010);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(4999, 5972);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10971 + "'", int12 == 10971);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(533, 343);
        int int33 = sumWithoutArithmeticOperators0.getSum(189, 1003);
        int int36 = sumWithoutArithmeticOperators0.getSum(5414, 9576);
        int int39 = sumWithoutArithmeticOperators0.getSum(5169, 2708);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 876 + "'", int30 == 876);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1192 + "'", int33 == 1192);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 14990 + "'", int36 == 14990);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 7877 + "'", int39 == 7877);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(289, 269);
        int int15 = sumWithoutArithmeticOperators0.getSum(766, 978);
        int int18 = sumWithoutArithmeticOperators0.getSum(2308, 4076);
        int int21 = sumWithoutArithmeticOperators0.getSum(2073, 2948);
        int int24 = sumWithoutArithmeticOperators0.getSum(20067, 18977);
        int int27 = sumWithoutArithmeticOperators0.getSum(2264, 1602);
        int int30 = sumWithoutArithmeticOperators0.getSum(8325, 753);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 558 + "'", int12 == 558);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1744 + "'", int15 == 1744);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6384 + "'", int18 == 6384);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5021 + "'", int21 == 5021);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 39044 + "'", int24 == 39044);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3866 + "'", int27 == 3866);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9078 + "'", int30 == 9078);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) '#', (int) (short) 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) 'a', 156);
        int int21 = sumWithoutArithmeticOperators0.getSum(1503, 285);
        int int24 = sumWithoutArithmeticOperators0.getSum(5007, 4251);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 253 + "'", int18 == 253);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1788 + "'", int21 == 1788);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9258 + "'", int24 == 9258);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(9, 217);
        int int18 = sumWithoutArithmeticOperators0.getSum(934, 766);
        int int21 = sumWithoutArithmeticOperators0.getSum(216, 215);
        int int24 = sumWithoutArithmeticOperators0.getSum(1072, 705);
        int int27 = sumWithoutArithmeticOperators0.getSum(1846, 11930);
        int int30 = sumWithoutArithmeticOperators0.getSum(0, 2248);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 226 + "'", int15 == 226);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1700 + "'", int18 == 1700);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 431 + "'", int21 == 431);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1777 + "'", int24 == 1777);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 13776 + "'", int27 == 13776);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2248 + "'", int30 == 2248);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(217, 238);
        int int21 = sumWithoutArithmeticOperators0.getSum(2512, 6681);
        int int24 = sumWithoutArithmeticOperators0.getSum(4476, 6410);
        int int27 = sumWithoutArithmeticOperators0.getSum(2690, 699);
        int int30 = sumWithoutArithmeticOperators0.getSum(17531, 9891);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 455 + "'", int18 == 455);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9193 + "'", int21 == 9193);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10886 + "'", int24 == 10886);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3389 + "'", int27 == 3389);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 27422 + "'", int30 == 27422);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(110, 376);
        int int12 = sumWithoutArithmeticOperators0.getSum(1172, 3707);
        int int15 = sumWithoutArithmeticOperators0.getSum(1291, 5369);
        int int18 = sumWithoutArithmeticOperators0.getSum(11, 2060);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 486 + "'", int9 == 486);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4879 + "'", int12 == 4879);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6660 + "'", int15 == 6660);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2071 + "'", int18 == 2071);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(210, 1);
        int int15 = sumWithoutArithmeticOperators0.getSum(226, 17);
        int int18 = sumWithoutArithmeticOperators0.getSum(275, 337);
        int int21 = sumWithoutArithmeticOperators0.getSum(143, 542);
        int int24 = sumWithoutArithmeticOperators0.getSum(2727, 2690);
        int int27 = sumWithoutArithmeticOperators0.getSum(6036, 1688);
        int int30 = sumWithoutArithmeticOperators0.getSum(6811, 1920);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 211 + "'", int12 == 211);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 243 + "'", int15 == 243);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 612 + "'", int18 == 612);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 685 + "'", int21 == 685);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5417 + "'", int24 == 5417);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7724 + "'", int27 == 7724);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8731 + "'", int30 == 8731);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(195, 317);
        int int18 = sumWithoutArithmeticOperators0.getSum(76, 499);
        int int21 = sumWithoutArithmeticOperators0.getSum(844, 555);
        int int24 = sumWithoutArithmeticOperators0.getSum(3949, 4164);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 575 + "'", int18 == 575);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1399 + "'", int21 == 1399);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8113 + "'", int24 == 8113);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 165);
        int int12 = sumWithoutArithmeticOperators0.getSum(152, 108);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 55);
        int int18 = sumWithoutArithmeticOperators0.getSum(52, 108);
        int int21 = sumWithoutArithmeticOperators0.getSum(3595, (int) ' ');
        int int24 = sumWithoutArithmeticOperators0.getSum(558, 1859);
        int int27 = sumWithoutArithmeticOperators0.getSum(5534, 20701);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 294 + "'", int9 == 294);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 260 + "'", int12 == 260);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 54 + "'", int15 == 54);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 160 + "'", int18 == 160);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3627 + "'", int21 == 3627);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2417 + "'", int24 == 2417);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 26235 + "'", int27 == 26235);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(343, 1574);
        int int9 = sumWithoutArithmeticOperators0.getSum(3302, 2343);
        int int12 = sumWithoutArithmeticOperators0.getSum(1664, 14209);
        int int15 = sumWithoutArithmeticOperators0.getSum(104, 3629);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1917 + "'", int6 == 1917);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5645 + "'", int9 == 5645);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15873 + "'", int12 == 15873);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3733 + "'", int15 == 3733);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(354, 1848);
        int int15 = sumWithoutArithmeticOperators0.getSum(32, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(2495, 6580);
        int int21 = sumWithoutArithmeticOperators0.getSum(12265, 105);
        int int24 = sumWithoutArithmeticOperators0.getSum(8731, 5493);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2202 + "'", int12 == 2202);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 142 + "'", int15 == 142);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9075 + "'", int18 == 9075);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12370 + "'", int21 == 12370);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14224 + "'", int24 == 14224);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) ' ', 9);
        int int15 = sumWithoutArithmeticOperators0.getSum(253, 483);
        int int18 = sumWithoutArithmeticOperators0.getSum(243, 125);
        int int21 = sumWithoutArithmeticOperators0.getSum(302, 6357);
        int int24 = sumWithoutArithmeticOperators0.getSum(863, 2492);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 41 + "'", int12 == 41);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 736 + "'", int15 == 736);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 368 + "'", int18 == 368);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6659 + "'", int21 == 6659);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3355 + "'", int24 == 3355);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(63, 868);
        int int12 = sumWithoutArithmeticOperators0.getSum(1507, 15357);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 931 + "'", int9 == 931);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16864 + "'", int12 == 16864);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(19, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(51, 109);
        int int21 = sumWithoutArithmeticOperators0.getSum(256, 727);
        int int24 = sumWithoutArithmeticOperators0.getSum(1364, 3665);
        int int27 = sumWithoutArithmeticOperators0.getSum(14073, 186);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 129 + "'", int15 == 129);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 160 + "'", int18 == 160);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 983 + "'", int21 == 983);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5029 + "'", int24 == 5029);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 14259 + "'", int27 == 14259);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(18, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, (int) (short) 100);
        int int21 = sumWithoutArithmeticOperators0.getSum(416, 44);
        int int24 = sumWithoutArithmeticOperators0.getSum(154, 35);
        int int27 = sumWithoutArithmeticOperators0.getSum(542, 180);
        int int30 = sumWithoutArithmeticOperators0.getSum(5465, 1848);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 460 + "'", int21 == 460);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 189 + "'", int24 == 189);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 722 + "'", int27 == 722);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7313 + "'", int30 == 7313);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(163, 17);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 186);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 377);
        int int24 = sumWithoutArithmeticOperators0.getSum(9497, 0);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 180 + "'", int15 == 180);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 186 + "'", int18 == 186);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 377 + "'", int21 == 377);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9497 + "'", int24 == 9497);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(15258, 32);
        int int33 = sumWithoutArithmeticOperators0.getSum(12096, 4571);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 253 + "'", int18 == 253);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 322 + "'", int21 == 322);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2894 + "'", int24 == 2894);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2544 + "'", int27 == 2544);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 15290 + "'", int30 == 15290);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 16667 + "'", int33 == 16667);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(162, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(2388, 390);
        int int12 = sumWithoutArithmeticOperators0.getSum(555, 12935);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2778 + "'", int9 == 2778);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 13490 + "'", int12 == 13490);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) -1);
        int int21 = sumWithoutArithmeticOperators0.getSum(266, 11);
        int int24 = sumWithoutArithmeticOperators0.getSum(51, 163);
        int int27 = sumWithoutArithmeticOperators0.getSum(90, 191);
        int int30 = sumWithoutArithmeticOperators0.getSum(416, 959);
        int int33 = sumWithoutArithmeticOperators0.getSum(2306, 2229);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 277 + "'", int21 == 277);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 214 + "'", int24 == 214);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 281 + "'", int27 == 281);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1375 + "'", int30 == 1375);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4535 + "'", int33 == 4535);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(17, 200);
        int int6 = sumWithoutArithmeticOperators0.getSum(853, 427);
        int int9 = sumWithoutArithmeticOperators0.getSum(1171, 254);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1430);
        int int15 = sumWithoutArithmeticOperators0.getSum(1295, 2368);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 217 + "'", int3 == 217);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1280 + "'", int6 == 1280);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1425 + "'", int9 == 1425);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1440 + "'", int12 == 1440);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3663 + "'", int15 == 3663);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(1833, 4989);
        int int39 = sumWithoutArithmeticOperators0.getSum(161, 4057);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 6822 + "'", int36 == 6822);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4218 + "'", int39 == 4218);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(955, 89);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 55);
        int int21 = sumWithoutArithmeticOperators0.getSum(3266, 1411);
        int int24 = sumWithoutArithmeticOperators0.getSum(3936, 2231);
        int int27 = sumWithoutArithmeticOperators0.getSum(3855, 1514);
        int int30 = sumWithoutArithmeticOperators0.getSum(4145, 15112);
        int int33 = sumWithoutArithmeticOperators0.getSum(11263, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1044 + "'", int15 == 1044);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 56 + "'", int18 == 56);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4677 + "'", int21 == 4677);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6167 + "'", int24 == 6167);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5369 + "'", int27 == 5369);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 19257 + "'", int30 == 19257);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 11263 + "'", int33 == 11263);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(465, 324);
        int int18 = sumWithoutArithmeticOperators0.getSum(122, 1);
        int int21 = sumWithoutArithmeticOperators0.getSum(1709, 1688);
        int int24 = sumWithoutArithmeticOperators0.getSum(20064, 2619);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 789 + "'", int15 == 789);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 123 + "'", int18 == 123);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3397 + "'", int21 == 3397);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 22683 + "'", int24 == 22683);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(1042, 2049);
        int int33 = sumWithoutArithmeticOperators0.getSum(3034, 15898);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 253 + "'", int18 == 253);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 322 + "'", int21 == 322);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2894 + "'", int24 == 2894);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2544 + "'", int27 == 2544);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3091 + "'", int30 == 3091);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 18932 + "'", int33 == 18932);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
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
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(209, 154);
        int int18 = sumWithoutArithmeticOperators0.getSum(19, 283);
        int int21 = sumWithoutArithmeticOperators0.getSum(2933, 438);
        int int24 = sumWithoutArithmeticOperators0.getSum(3201, 4464);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 363 + "'", int15 == 363);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 302 + "'", int18 == 302);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3371 + "'", int21 == 3371);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7665 + "'", int24 == 7665);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
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
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53 + "'", int18 == 53);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2998 + "'", int24 == 2998);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 17052 + "'", int27 == 17052);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(325, 240);
        int int18 = sumWithoutArithmeticOperators0.getSum(1582, 7098);
        int int21 = sumWithoutArithmeticOperators0.getSum(3346, 15349);
        int int24 = sumWithoutArithmeticOperators0.getSum(546, 1203);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 565 + "'", int15 == 565);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8680 + "'", int18 == 8680);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18695 + "'", int21 == 18695);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1749 + "'", int24 == 1749);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(2889, 16318);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 19207 + "'", int36 == 19207);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 486);
        int int12 = sumWithoutArithmeticOperators0.getSum(725, 911);
        int int15 = sumWithoutArithmeticOperators0.getSum(724, 1074);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 486 + "'", int9 == 486);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1636 + "'", int12 == 1636);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1798 + "'", int15 == 1798);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 10);
        int int15 = sumWithoutArithmeticOperators0.getSum(3668, 5341);
        int int18 = sumWithoutArithmeticOperators0.getSum(6914, 16357);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9009 + "'", int15 == 9009);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 23271 + "'", int18 == 23271);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(352, 375);
        int int18 = sumWithoutArithmeticOperators0.getSum(9920, 1511);
        int int21 = sumWithoutArithmeticOperators0.getSum(7163, 8652);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 727 + "'", int15 == 727);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11431 + "'", int18 == 11431);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15815 + "'", int21 == 15815);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(6405, 144);
        int int33 = sumWithoutArithmeticOperators0.getSum(0, 2759);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 162 + "'", int18 == 162);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1376 + "'", int21 == 1376);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1111 + "'", int24 == 1111);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1748 + "'", int27 == 1748);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6549 + "'", int30 == 6549);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2759 + "'", int33 == 2759);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(33, 163);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (byte) 100);
        int int21 = sumWithoutArithmeticOperators0.getSum(40, 3360);
        int int24 = sumWithoutArithmeticOperators0.getSum(11323, 4985);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3400 + "'", int21 == 3400);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16308 + "'", int24 == 16308);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(122, 67);
        int int18 = sumWithoutArithmeticOperators0.getSum(473, 360);
        int int21 = sumWithoutArithmeticOperators0.getSum(2512, 615);
        int int24 = sumWithoutArithmeticOperators0.getSum(1326, 1169);
        int int27 = sumWithoutArithmeticOperators0.getSum(4374, 612);
        int int30 = sumWithoutArithmeticOperators0.getSum(934, 2619);
        int int33 = sumWithoutArithmeticOperators0.getSum(22858, 2415);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 189 + "'", int15 == 189);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 833 + "'", int18 == 833);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3127 + "'", int21 == 3127);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2495 + "'", int24 == 2495);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4986 + "'", int27 == 4986);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3553 + "'", int30 == 3553);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 25273 + "'", int33 == 25273);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(40, 269);
        int int6 = sumWithoutArithmeticOperators0.getSum(202, 523);
        int int9 = sumWithoutArithmeticOperators0.getSum(936, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 309 + "'", int3 == 309);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 725 + "'", int6 == 725);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 936 + "'", int9 == 936);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
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
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 499 + "'", int15 == 499);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8855 + "'", int18 == 8855);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1169 + "'", int21 == 1169);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12064 + "'", int24 == 12064);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1920 + "'", int27 == 1920);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(154, 0);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 154 + "'", int33 == 154);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(638, 1527);
        int int33 = sumWithoutArithmeticOperators0.getSum(15658, 212);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 166 + "'", int24 == 166);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 785 + "'", int27 == 785);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2165 + "'", int30 == 2165);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 15870 + "'", int33 == 15870);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(523, (int) ' ');
        int int18 = sumWithoutArithmeticOperators0.getSum(98, 144);
        int int21 = sumWithoutArithmeticOperators0.getSum(581, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(803, 7169);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 555 + "'", int15 == 555);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 242 + "'", int18 == 242);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 581 + "'", int21 == 581);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7972 + "'", int24 == 7972);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(210, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(317, 110);
        int int24 = sumWithoutArithmeticOperators0.getSum(352, 283);
        int int27 = sumWithoutArithmeticOperators0.getSum(253, 397);
        int int30 = sumWithoutArithmeticOperators0.getSum(8691, 7193);
        int int33 = sumWithoutArithmeticOperators0.getSum(14630, 10638);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 246 + "'", int18 == 246);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 427 + "'", int21 == 427);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 635 + "'", int24 == 635);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 650 + "'", int27 == 650);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 15884 + "'", int30 == 15884);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 25268 + "'", int33 == 25268);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(289, 149);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 246 + "'", int18 == 246);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 427 + "'", int21 == 427);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 635 + "'", int24 == 635);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 360 + "'", int27 == 360);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 438 + "'", int30 == 438);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(209, 154);
        int int18 = sumWithoutArithmeticOperators0.getSum(19, 283);
        int int21 = sumWithoutArithmeticOperators0.getSum(596, 1527);
        int int24 = sumWithoutArithmeticOperators0.getSum(7558, 2011);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 363 + "'", int15 == 363);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 302 + "'", int18 == 302);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2123 + "'", int21 == 2123);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9569 + "'", int24 == 9569);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(100, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(2165, 1724);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 445);
        int int24 = sumWithoutArithmeticOperators0.getSum(221, 1480);
        int int27 = sumWithoutArithmeticOperators0.getSum(10579, 4507);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3889 + "'", int18 == 3889);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 445 + "'", int21 == 445);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1701 + "'", int24 == 1701);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15086 + "'", int27 == 15086);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(51, 422);
        int int18 = sumWithoutArithmeticOperators0.getSum(238, 614);
        int int21 = sumWithoutArithmeticOperators0.getSum(11992, 23732);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 473 + "'", int15 == 473);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 852 + "'", int18 == 852);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35724 + "'", int21 == 35724);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(260, 195);
        int int15 = sumWithoutArithmeticOperators0.getSum(316, 1491);
        int int18 = sumWithoutArithmeticOperators0.getSum(393, 17);
        int int21 = sumWithoutArithmeticOperators0.getSum(490, 6015);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 455 + "'", int12 == 455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1807 + "'", int15 == 1807);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 410 + "'", int18 == 410);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6505 + "'", int21 == 6505);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(238, 152);
        int int15 = sumWithoutArithmeticOperators0.getSum(245, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(134, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(422, 33);
        int int24 = sumWithoutArithmeticOperators0.getSum(524, 1398);
        int int27 = sumWithoutArithmeticOperators0.getSum(4710, 1134);
        int int30 = sumWithoutArithmeticOperators0.getSum(1326, 4412);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 390 + "'", int12 == 390);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 407 + "'", int15 == 407);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 170 + "'", int18 == 170);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 455 + "'", int21 == 455);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1922 + "'", int24 == 1922);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5844 + "'", int27 == 5844);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5738 + "'", int30 == 5738);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(3397, 129);
        int int36 = sumWithoutArithmeticOperators0.getSum(3095, 466);
        int int39 = sumWithoutArithmeticOperators0.getSum(84, 10320);
        java.lang.Class<?> wildcardClass40 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3526 + "'", int33 == 3526);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3561 + "'", int36 == 3561);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10404 + "'", int39 == 10404);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(19, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(51, 109);
        int int21 = sumWithoutArithmeticOperators0.getSum(256, 727);
        int int24 = sumWithoutArithmeticOperators0.getSum(1364, 3665);
        int int27 = sumWithoutArithmeticOperators0.getSum(14073, 186);
        int int30 = sumWithoutArithmeticOperators0.getSum(7769, 853);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 129 + "'", int15 == 129);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 160 + "'", int18 == 160);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 983 + "'", int21 == 983);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5029 + "'", int24 == 5029);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 14259 + "'", int27 == 14259);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8622 + "'", int30 == 8622);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 56);
        int int18 = sumWithoutArithmeticOperators0.getSum(34, 209);
        int int21 = sumWithoutArithmeticOperators0.getSum(149, 2386);
        int int24 = sumWithoutArithmeticOperators0.getSum(14770, 7396);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 55 + "'", int15 == 55);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 243 + "'", int18 == 243);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2535 + "'", int21 == 2535);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 22166 + "'", int24 == 22166);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(526, 727);
        int int18 = sumWithoutArithmeticOperators0.getSum(1967, 810);
        int int21 = sumWithoutArithmeticOperators0.getSum(1480, 1636);
        int int24 = sumWithoutArithmeticOperators0.getSum(170, 1373);
        int int27 = sumWithoutArithmeticOperators0.getSum(23794, 472);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1253 + "'", int15 == 1253);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2777 + "'", int18 == 2777);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3116 + "'", int21 == 3116);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1543 + "'", int24 == 1543);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 24266 + "'", int27 == 24266);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 0);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 161 + "'", int15 == 161);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum(44, 671);
        int int12 = sumWithoutArithmeticOperators0.getSum(629, 397);
        int int15 = sumWithoutArithmeticOperators0.getSum(15130, 4975);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 715 + "'", int9 == 715);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1026 + "'", int12 == 1026);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20105 + "'", int15 == 20105);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(725, 42);
        int int15 = sumWithoutArithmeticOperators0.getSum(269, 368);
        int int18 = sumWithoutArithmeticOperators0.getSum(393, 3658);
        int int21 = sumWithoutArithmeticOperators0.getSum(1347, 10568);
        int int24 = sumWithoutArithmeticOperators0.getSum(1685, 14633);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 767 + "'", int12 == 767);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 637 + "'", int15 == 637);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4051 + "'", int18 == 4051);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11915 + "'", int21 == 11915);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16318 + "'", int24 == 16318);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(955, 89);
        int int18 = sumWithoutArithmeticOperators0.getSum(278, 725);
        int int21 = sumWithoutArithmeticOperators0.getSum(601, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(865, 1724);
        int int27 = sumWithoutArithmeticOperators0.getSum(565, 0);
        int int30 = sumWithoutArithmeticOperators0.getSum(4773, 117);
        int int33 = sumWithoutArithmeticOperators0.getSum(13128, 1843);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1044 + "'", int15 == 1044);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1003 + "'", int18 == 1003);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 601 + "'", int21 == 601);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2589 + "'", int24 == 2589);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 565 + "'", int27 == 565);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4890 + "'", int30 == 4890);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 14971 + "'", int33 == 14971);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(512, (int) (byte) -1);
        int int33 = sumWithoutArithmeticOperators0.getSum(1623, 17475);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 498 + "'", int21 == 498);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 735 + "'", int24 == 735);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 600 + "'", int27 == 600);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 511 + "'", int30 == 511);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 19098 + "'", int33 == 19098);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(455, 4879);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5334 + "'", int33 == 5334);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(5577, 217);
        int int18 = sumWithoutArithmeticOperators0.getSum(7926, 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5794 + "'", int15 == 5794);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7943 + "'", int18 == 7943);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(163, 52);
        int int15 = sumWithoutArithmeticOperators0.getSum(107, 210);
        int int18 = sumWithoutArithmeticOperators0.getSum(11552, 2863);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 215 + "'", int12 == 215);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 317 + "'", int15 == 317);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 14415 + "'", int18 == 14415);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(1373, 186);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1559 + "'", int18 == 1559);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(1257, 1427);
        java.lang.Class<?> wildcardClass10 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2684 + "'", int9 == 2684);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(9, 217);
        int int18 = sumWithoutArithmeticOperators0.getSum(132, 499);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 179);
        int int24 = sumWithoutArithmeticOperators0.getSum(4562, 7020);
        int int27 = sumWithoutArithmeticOperators0.getSum(13117, 6962);
        int int30 = sumWithoutArithmeticOperators0.getSum(14322, 15500);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 226 + "'", int15 == 226);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 631 + "'", int18 == 631);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 179 + "'", int21 == 179);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11582 + "'", int24 == 11582);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20079 + "'", int27 == 20079);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 29822 + "'", int30 == 29822);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(635, 151);
        int int18 = sumWithoutArithmeticOperators0.getSum(1105, 1121);
        int int21 = sumWithoutArithmeticOperators0.getSum(2049, 975);
        int int24 = sumWithoutArithmeticOperators0.getSum(11216, 8331);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 786 + "'", int15 == 786);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2226 + "'", int18 == 2226);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3024 + "'", int21 == 3024);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19547 + "'", int24 == 19547);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(306, 180);
        int int9 = sumWithoutArithmeticOperators0.getSum(10458, 375);
        int int12 = sumWithoutArithmeticOperators0.getSum(3389, 4420);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 486 + "'", int6 == 486);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10833 + "'", int9 == 10833);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7809 + "'", int12 == 7809);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(955, 89);
        int int18 = sumWithoutArithmeticOperators0.getSum(278, 725);
        int int21 = sumWithoutArithmeticOperators0.getSum(4619, 2207);
        int int24 = sumWithoutArithmeticOperators0.getSum(5473, 26326);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1044 + "'", int15 == 1044);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1003 + "'", int18 == 1003);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6826 + "'", int21 == 6826);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 31799 + "'", int24 == 31799);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(5675, 9962);
        int int36 = sumWithoutArithmeticOperators0.getSum(3410, 0);
        int int39 = sumWithoutArithmeticOperators0.getSum(7795, 8614);
        int int42 = sumWithoutArithmeticOperators0.getSum(15511, 6732);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 15637 + "'", int33 == 15637);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3410 + "'", int36 == 3410);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 16409 + "'", int39 == 16409);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 22243 + "'", int42 == 22243);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(19, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(2941, 1690);
        int int21 = sumWithoutArithmeticOperators0.getSum(6878, 23877);
        int int24 = sumWithoutArithmeticOperators0.getSum(11992, 150);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 129 + "'", int15 == 129);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4631 + "'", int18 == 4631);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30755 + "'", int21 == 30755);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12142 + "'", int24 == 12142);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(2624, 1547);
        int int33 = sumWithoutArithmeticOperators0.getSum(2891, 1238);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 699 + "'", int21 == 699);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1074 + "'", int24 == 1074);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2049 + "'", int27 == 2049);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4171 + "'", int30 == 4171);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4129 + "'", int33 == 4129);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(17, 200);
        int int6 = sumWithoutArithmeticOperators0.getSum(853, 427);
        int int9 = sumWithoutArithmeticOperators0.getSum(1171, 254);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1430);
        int int15 = sumWithoutArithmeticOperators0.getSum(7466, 1114);
        int int18 = sumWithoutArithmeticOperators0.getSum(18780, 1425);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 217 + "'", int3 == 217);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1280 + "'", int6 == 1280);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1425 + "'", int9 == 1425);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1440 + "'", int12 == 1440);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8580 + "'", int15 == 8580);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20205 + "'", int18 == 20205);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) -1);
        int int21 = sumWithoutArithmeticOperators0.getSum(7, (int) (short) 100);
        int int24 = sumWithoutArithmeticOperators0.getSum(546, 699);
        int int27 = sumWithoutArithmeticOperators0.getSum(202, 1934);
        int int30 = sumWithoutArithmeticOperators0.getSum(84, 5105);
        int int33 = sumWithoutArithmeticOperators0.getSum(4905, 5402);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 107 + "'", int21 == 107);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1245 + "'", int24 == 1245);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2136 + "'", int27 == 2136);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5189 + "'", int30 == 5189);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10307 + "'", int33 == 10307);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(955, 89);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 55);
        int int21 = sumWithoutArithmeticOperators0.getSum(3266, 1411);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 4537);
        int int27 = sumWithoutArithmeticOperators0.getSum(6549, 3638);
        int int30 = sumWithoutArithmeticOperators0.getSum(2684, 7271);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1044 + "'", int15 == 1044);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 56 + "'", int18 == 56);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4677 + "'", int21 == 4677);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4537 + "'", int24 == 4537);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10187 + "'", int27 == 10187);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9955 + "'", int30 == 9955);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 36);
        int int18 = sumWithoutArithmeticOperators0.getSum(844, 289);
        int int21 = sumWithoutArithmeticOperators0.getSum(35, 90);
        int int24 = sumWithoutArithmeticOperators0.getSum(1374, 1207);
        int int27 = sumWithoutArithmeticOperators0.getSum(1644, 1106);
        int int30 = sumWithoutArithmeticOperators0.getSum(23213, 227);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1133 + "'", int18 == 1133);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 125 + "'", int21 == 125);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2581 + "'", int24 == 2581);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2750 + "'", int27 == 2750);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 23440 + "'", int30 == 23440);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 199);
        int int12 = sumWithoutArithmeticOperators0.getSum(156, 460);
        int int15 = sumWithoutArithmeticOperators0.getSum(1449, 983);
        int int18 = sumWithoutArithmeticOperators0.getSum(12935, 26859);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 199 + "'", int9 == 199);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 616 + "'", int12 == 616);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2432 + "'", int15 == 2432);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 39794 + "'", int18 == 39794);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(9, 217);
        int int18 = sumWithoutArithmeticOperators0.getSum(934, 766);
        int int21 = sumWithoutArithmeticOperators0.getSum(216, 215);
        int int24 = sumWithoutArithmeticOperators0.getSum(1121, 3726);
        int int27 = sumWithoutArithmeticOperators0.getSum(1643, 5352);
        int int30 = sumWithoutArithmeticOperators0.getSum(8716, 1438);
        int int33 = sumWithoutArithmeticOperators0.getSum(10014, 6437);
        int int36 = sumWithoutArithmeticOperators0.getSum(3685, 1293);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 226 + "'", int15 == 226);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1700 + "'", int18 == 1700);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 431 + "'", int21 == 431);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4847 + "'", int24 == 4847);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6995 + "'", int27 == 6995);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10154 + "'", int30 == 10154);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 16451 + "'", int33 == 16451);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4978 + "'", int36 == 4978);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(18, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 108);
        int int21 = sumWithoutArithmeticOperators0.getSum(17, 266);
        int int24 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 376);
        int int27 = sumWithoutArithmeticOperators0.getSum(711, 8554);
        int int30 = sumWithoutArithmeticOperators0.getSum(452, 1937);
        int int33 = sumWithoutArithmeticOperators0.getSum(570, 3467);
        int int36 = sumWithoutArithmeticOperators0.getSum(3455, 460);
        int int39 = sumWithoutArithmeticOperators0.getSum(1410, 11107);
        java.lang.Class<?> wildcardClass40 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 109 + "'", int18 == 109);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 283 + "'", int21 == 283);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 377 + "'", int24 == 377);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9265 + "'", int27 == 9265);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2389 + "'", int30 == 2389);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4037 + "'", int33 == 4037);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3915 + "'", int36 == 3915);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 12517 + "'", int39 == 12517);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(5190, 562);
        int int36 = sumWithoutArithmeticOperators0.getSum(19707, 2324);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5752 + "'", int33 == 5752);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 22031 + "'", int36 == 22031);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(162, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(156, 491);
        int int21 = sumWithoutArithmeticOperators0.getSum(41, 1128);
        int int24 = sumWithoutArithmeticOperators0.getSum(1297, 34);
        int int27 = sumWithoutArithmeticOperators0.getSum(0, 1171);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 647 + "'", int18 == 647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1169 + "'", int21 == 1169);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1331 + "'", int24 == 1331);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1171 + "'", int27 == 1171);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(40, 269);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 163);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 3102);
        java.lang.Class<?> wildcardClass10 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 309 + "'", int3 == 309);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 184 + "'", int6 == 184);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3102 + "'", int9 == 3102);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(51, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(354, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(14540, 490);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 454 + "'", int15 == 454);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15030 + "'", int18 == 15030);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(911, 432);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 34);
        int int15 = sumWithoutArithmeticOperators0.getSum(1241, 1352);
        int int18 = sumWithoutArithmeticOperators0.getSum(3451, 211);
        int int21 = sumWithoutArithmeticOperators0.getSum(2587, 3890);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1343 + "'", int9 == 1343);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2593 + "'", int15 == 2593);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3662 + "'", int18 == 3662);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6477 + "'", int21 == 6477);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(635, 151);
        int int18 = sumWithoutArithmeticOperators0.getSum(1105, 1121);
        int int21 = sumWithoutArithmeticOperators0.getSum(2049, 975);
        int int24 = sumWithoutArithmeticOperators0.getSum(166, 1375);
        int int27 = sumWithoutArithmeticOperators0.getSum(1285, 250);
        int int30 = sumWithoutArithmeticOperators0.getSum(6911, 1278);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 786 + "'", int15 == 786);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2226 + "'", int18 == 2226);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3024 + "'", int21 == 3024);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1541 + "'", int24 == 1541);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1535 + "'", int27 == 1535);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8189 + "'", int30 == 8189);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) -1);
        int int21 = sumWithoutArithmeticOperators0.getSum(266, 11);
        int int24 = sumWithoutArithmeticOperators0.getSum(51, 163);
        int int27 = sumWithoutArithmeticOperators0.getSum(149, 469);
        int int30 = sumWithoutArithmeticOperators0.getSum(132, 3346);
        int int33 = sumWithoutArithmeticOperators0.getSum(14692, 3412);
        int int36 = sumWithoutArithmeticOperators0.getSum(9311, 3427);
        java.lang.Class<?> wildcardClass37 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 277 + "'", int21 == 277);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 214 + "'", int24 == 214);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 618 + "'", int27 == 618);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3478 + "'", int30 == 3478);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 18104 + "'", int33 == 18104);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 12738 + "'", int36 == 12738);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 34);
        int int18 = sumWithoutArithmeticOperators0.getSum(254, 269);
        int int21 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 250);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 523 + "'", int18 == 523);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 250 + "'", int21 == 250);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(238, 152);
        int int15 = sumWithoutArithmeticOperators0.getSum(245, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(134, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 2219);
        int int24 = sumWithoutArithmeticOperators0.getSum(18076, 4543);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 390 + "'", int12 == 390);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 407 + "'", int15 == 407);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 170 + "'", int18 == 170);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2219 + "'", int21 == 2219);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 22619 + "'", int24 == 22619);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 19);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(1121, 708);
        int int12 = sumWithoutArithmeticOperators0.getSum(3445, 1680);
        int int15 = sumWithoutArithmeticOperators0.getSum(3283, 946);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1829 + "'", int9 == 1829);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5125 + "'", int12 == 5125);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4229 + "'", int15 == 4229);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) ' ', 35);
        int int6 = sumWithoutArithmeticOperators0.getSum(98, 180);
        int int9 = sumWithoutArithmeticOperators0.getSum(955, 317);
        int int12 = sumWithoutArithmeticOperators0.getSum(587, 216);
        int int15 = sumWithoutArithmeticOperators0.getSum(11960, 5408);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 67 + "'", int3 == 67);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 278 + "'", int6 == 278);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1272 + "'", int9 == 1272);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 803 + "'", int12 == 803);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 17368 + "'", int15 == 17368);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(210, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(766, 1168);
        int int24 = sumWithoutArithmeticOperators0.getSum(454, 238);
        int int27 = sumWithoutArithmeticOperators0.getSum(1236, 1688);
        int int30 = sumWithoutArithmeticOperators0.getSum(456, 2810);
        int int33 = sumWithoutArithmeticOperators0.getSum(3401, 128);
        int int36 = sumWithoutArithmeticOperators0.getSum(5983, 0);
        int int39 = sumWithoutArithmeticOperators0.getSum(2762, 7594);
        java.lang.Class<?> wildcardClass40 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 246 + "'", int18 == 246);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1934 + "'", int21 == 1934);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 692 + "'", int24 == 692);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2924 + "'", int27 == 2924);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3266 + "'", int30 == 3266);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3529 + "'", int33 == 3529);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5983 + "'", int36 == 5983);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10356 + "'", int39 == 10356);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(161, 84);
        int int21 = sumWithoutArithmeticOperators0.getSum(767, 243);
        int int24 = sumWithoutArithmeticOperators0.getSum(180, (int) (byte) 1);
        int int27 = sumWithoutArithmeticOperators0.getSum(210, 2624);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1010 + "'", int21 == 1010);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 181 + "'", int24 == 181);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2834 + "'", int27 == 2834);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(321, 56);
        int int9 = sumWithoutArithmeticOperators0.getSum(277, 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(625, 55);
        int int15 = sumWithoutArithmeticOperators0.getSum(165, 199);
        int int18 = sumWithoutArithmeticOperators0.getSum(13104, 1133);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 377 + "'", int6 == 377);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 377 + "'", int9 == 377);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 680 + "'", int12 == 680);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 364 + "'", int15 == 364);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 14237 + "'", int18 == 14237);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(101, 21);
        int int18 = sumWithoutArithmeticOperators0.getSum(89, 180);
        int int21 = sumWithoutArithmeticOperators0.getSum(199, (int) '4');
        int int24 = sumWithoutArithmeticOperators0.getSum(2713, 382);
        int int27 = sumWithoutArithmeticOperators0.getSum(1121, 1351);
        int int30 = sumWithoutArithmeticOperators0.getSum(3625, 1953);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 269 + "'", int18 == 269);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 251 + "'", int21 == 251);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3095 + "'", int24 == 3095);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2472 + "'", int27 == 2472);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5578 + "'", int30 == 5578);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(101, 21);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(728, 151);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 162 + "'", int18 == 162);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 879 + "'", int21 == 879);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(162, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(2388, 390);
        int int12 = sumWithoutArithmeticOperators0.getSum(1296, 7231);
        int int15 = sumWithoutArithmeticOperators0.getSum(10889, 2368);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2778 + "'", int9 == 2778);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8527 + "'", int12 == 8527);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 13257 + "'", int15 == 13257);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(526, 727);
        int int18 = sumWithoutArithmeticOperators0.getSum(1186, 2128);
        int int21 = sumWithoutArithmeticOperators0.getSum(253, 12740);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1253 + "'", int15 == 1253);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3314 + "'", int18 == 3314);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12993 + "'", int21 == 12993);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(191, 555);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 746 + "'", int18 == 746);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(4739, 32);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4771 + "'", int15 == 4771);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(2310, 2123);
        java.lang.Class<?> wildcardClass7 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4433 + "'", int6 == 4433);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(209, 154);
        int int18 = sumWithoutArithmeticOperators0.getSum(19, 283);
        int int21 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 453);
        int int24 = sumWithoutArithmeticOperators0.getSum(1241, 1606);
        int int27 = sumWithoutArithmeticOperators0.getSum(4771, 758);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 363 + "'", int15 == 363);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 302 + "'", int18 == 302);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 452 + "'", int21 == 452);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2847 + "'", int24 == 2847);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5529 + "'", int27 == 5529);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }
}

