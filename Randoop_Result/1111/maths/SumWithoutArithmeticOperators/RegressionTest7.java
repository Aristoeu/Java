package maths.SumWithoutArithmeticOperators;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
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
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(211, 245);
        int int15 = sumWithoutArithmeticOperators0.getSum(382, 32);
        int int18 = sumWithoutArithmeticOperators0.getSum(1168, 1);
        int int21 = sumWithoutArithmeticOperators0.getSum(4323, 3461);
        int int24 = sumWithoutArithmeticOperators0.getSum(725, 5812);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 456 + "'", int12 == 456);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 414 + "'", int15 == 414);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1169 + "'", int18 == 1169);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7784 + "'", int21 == 7784);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6537 + "'", int24 == 6537);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(747, 1764);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 983);
        java.lang.Class<?> wildcardClass10 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2511 + "'", int6 == 2511);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 983 + "'", int9 == 983);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(163, 17);
        int int18 = sumWithoutArithmeticOperators0.getSum(284, 271);
        int int21 = sumWithoutArithmeticOperators0.getSum(1241, 1106);
        int int24 = sumWithoutArithmeticOperators0.getSum(237, 2042);
        int int27 = sumWithoutArithmeticOperators0.getSum(4594, 18274);
        int int30 = sumWithoutArithmeticOperators0.getSum(9485, 1411);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 180 + "'", int15 == 180);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 555 + "'", int18 == 555);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2347 + "'", int21 == 2347);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2279 + "'", int24 == 2279);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 22868 + "'", int27 == 22868);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10896 + "'", int30 == 10896);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 19);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(859, 454);
        int int12 = sumWithoutArithmeticOperators0.getSum(149, 188);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1313 + "'", int9 == 1313);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 337 + "'", int12 == 337);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(97, 168);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 122);
        int int18 = sumWithoutArithmeticOperators0.getSum(473, 221);
        int int21 = sumWithoutArithmeticOperators0.getSum(2635, 16431);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 265 + "'", int12 == 265);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 694 + "'", int18 == 694);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19066 + "'", int21 == 19066);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(21463, 2079);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 23542 + "'", int33 == 23542);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(195, 317);
        int int18 = sumWithoutArithmeticOperators0.getSum(76, 499);
        int int21 = sumWithoutArithmeticOperators0.getSum(844, 555);
        int int24 = sumWithoutArithmeticOperators0.getSum(5471, 1670);
        int int27 = sumWithoutArithmeticOperators0.getSum(830, 25048);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 575 + "'", int18 == 575);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1399 + "'", int21 == 1399);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7141 + "'", int24 == 7141);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 25878 + "'", int27 == 25878);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
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
        int int45 = sumWithoutArithmeticOperators0.getSum(32013, 414);
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 32427 + "'", int45 == 32427);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(255, 4075);
        int int18 = sumWithoutArithmeticOperators0.getSum(603, 979);
        int int21 = sumWithoutArithmeticOperators0.getSum(63376, 3852);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4330 + "'", int15 == 4330);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1582 + "'", int18 == 1582);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 67228 + "'", int21 == 67228);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(3188, 1432);
        int int33 = sumWithoutArithmeticOperators0.getSum(1761, 0);
        int int36 = sumWithoutArithmeticOperators0.getSum(4672, 15156);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 455 + "'", int18 == 455);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 156 + "'", int21 == 156);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1967 + "'", int24 == 1967);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6097 + "'", int27 == 6097);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4620 + "'", int30 == 4620);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1761 + "'", int33 == 1761);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 19828 + "'", int36 == 19828);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(42, 321);
        int int12 = sumWithoutArithmeticOperators0.getSum(265, 734);
        int int15 = sumWithoutArithmeticOperators0.getSum(2833, 20152);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 363 + "'", int9 == 363);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 999 + "'", int12 == 999);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 22985 + "'", int15 == 22985);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(391, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(1448, 2449);
        int int15 = sumWithoutArithmeticOperators0.getSum(491, 2393);
        int int18 = sumWithoutArithmeticOperators0.getSum(2435, 15585);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 391 + "'", int9 == 391);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3897 + "'", int12 == 3897);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2884 + "'", int15 == 2884);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18020 + "'", int18 == 18020);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(41, 1241);
        int int33 = sumWithoutArithmeticOperators0.getSum(19834, 19413);
        int int36 = sumWithoutArithmeticOperators0.getSum(5604, 6159);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 107 + "'", int21 == 107);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 911 + "'", int24 == 911);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1846 + "'", int27 == 1846);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1282 + "'", int30 == 1282);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 39247 + "'", int33 == 39247);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 11763 + "'", int36 == 11763);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(1670, 8476);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 460 + "'", int21 == 460);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 490 + "'", int24 == 490);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6812 + "'", int27 == 6812);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10146 + "'", int30 == 10146);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(1829, 635);
        int int18 = sumWithoutArithmeticOperators0.getSum(5363, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(1268, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(3501, 310);
        int int27 = sumWithoutArithmeticOperators0.getSum(3497, 11180);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2464 + "'", int15 == 2464);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5363 + "'", int18 == 5363);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1268 + "'", int21 == 1268);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3811 + "'", int24 == 3811);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 14677 + "'", int27 == 14677);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 199);
        int int12 = sumWithoutArithmeticOperators0.getSum(324, 614);
        int int15 = sumWithoutArithmeticOperators0.getSum(498, 461);
        int int18 = sumWithoutArithmeticOperators0.getSum(4671, 1001);
        int int21 = sumWithoutArithmeticOperators0.getSum(1698, 4061);
        int int24 = sumWithoutArithmeticOperators0.getSum(3936, 4268);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 199 + "'", int9 == 199);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 938 + "'", int12 == 938);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 959 + "'", int15 == 959);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5672 + "'", int18 == 5672);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5759 + "'", int21 == 5759);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8204 + "'", int24 == 8204);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
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
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 56);
        int int18 = sumWithoutArithmeticOperators0.getSum(34, 209);
        int int21 = sumWithoutArithmeticOperators0.getSum(149, 2386);
        int int24 = sumWithoutArithmeticOperators0.getSum(12946, 14529);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 55 + "'", int15 == 55);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 243 + "'", int18 == 243);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2535 + "'", int21 == 2535);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 27475 + "'", int24 == 27475);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(9, 9);
        int int9 = sumWithoutArithmeticOperators0.getSum(4013, 213);
        int int12 = sumWithoutArithmeticOperators0.getSum(19770, 7353);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4226 + "'", int9 == 4226);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27123 + "'", int12 == 27123);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(217, 238);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 978);
        int int24 = sumWithoutArithmeticOperators0.getSum(7962, 1514);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 455 + "'", int18 == 455);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 978 + "'", int21 == 978);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9476 + "'", int24 == 9476);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 18);
        int int9 = sumWithoutArithmeticOperators0.getSum(15442, 7603);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 23045 + "'", int9 == 23045);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(465, 324);
        int int18 = sumWithoutArithmeticOperators0.getSum(122, 1);
        int int21 = sumWithoutArithmeticOperators0.getSum(1294, 375);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 789 + "'", int15 == 789);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 123 + "'", int18 == 123);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1669 + "'", int21 == 1669);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(6015, 1725);
        int int33 = sumWithoutArithmeticOperators0.getSum(2914, 5350);
        int int36 = sumWithoutArithmeticOperators0.getSum(30352, 7523);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1253 + "'", int15 == 1253);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1326 + "'", int18 == 1326);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2248 + "'", int21 == 2248);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16269 + "'", int24 == 16269);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 13117 + "'", int27 == 13117);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7740 + "'", int30 == 7740);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8264 + "'", int33 == 8264);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 37875 + "'", int36 == 37875);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(238, 152);
        int int15 = sumWithoutArithmeticOperators0.getSum(245, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(134, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(170, 67);
        int int24 = sumWithoutArithmeticOperators0.getSum(1909, 1046);
        int int27 = sumWithoutArithmeticOperators0.getSum(3882, 11714);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 390 + "'", int12 == 390);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 407 + "'", int15 == 407);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 170 + "'", int18 == 170);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 237 + "'", int21 == 237);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2955 + "'", int24 == 2955);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15596 + "'", int27 == 15596);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 89);
        int int12 = sumWithoutArithmeticOperators0.getSum(1023, 665);
        int int15 = sumWithoutArithmeticOperators0.getSum(202, 9193);
        int int18 = sumWithoutArithmeticOperators0.getSum(486, 14708);
        int int21 = sumWithoutArithmeticOperators0.getSum(8026, 626);
        int int24 = sumWithoutArithmeticOperators0.getSum(7400, 2331);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 90 + "'", int9 == 90);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1688 + "'", int12 == 1688);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9395 + "'", int15 == 9395);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15194 + "'", int18 == 15194);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8652 + "'", int21 == 8652);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9731 + "'", int24 == 9731);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(306, 180);
        int int9 = sumWithoutArithmeticOperators0.getSum(10458, 375);
        int int12 = sumWithoutArithmeticOperators0.getSum(3670, 0);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 486 + "'", int6 == 486);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10833 + "'", int9 == 10833);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3670 + "'", int12 == 3670);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(255, 4075);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 2407);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4330 + "'", int15 == 4330);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2407 + "'", int18 == 2407);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(210, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 6108);
        int int24 = sumWithoutArithmeticOperators0.getSum(2818, 1562);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 246 + "'", int18 == 246);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6109 + "'", int21 == 6109);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4380 + "'", int24 == 4380);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(163, 52);
        int int15 = sumWithoutArithmeticOperators0.getSum(9458, 8723);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 215 + "'", int12 == 215);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18181 + "'", int15 == 18181);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(101, 21);
        int int18 = sumWithoutArithmeticOperators0.getSum(89, 180);
        int int21 = sumWithoutArithmeticOperators0.getSum(199, (int) '4');
        int int24 = sumWithoutArithmeticOperators0.getSum(2713, 382);
        int int27 = sumWithoutArithmeticOperators0.getSum(3346, 2713);
        int int30 = sumWithoutArithmeticOperators0.getSum(5665, 24351);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 269 + "'", int18 == 269);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 251 + "'", int21 == 251);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3095 + "'", int24 == 3095);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6059 + "'", int27 == 6059);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 30016 + "'", int30 == 30016);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(11, (int) (short) 0);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int21 = sumWithoutArithmeticOperators0.getSum(727, 460);
        int int24 = sumWithoutArithmeticOperators0.getSum(14259, 3512);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1187 + "'", int21 == 1187);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 17771 + "'", int24 == 17771);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(289, 269);
        int int15 = sumWithoutArithmeticOperators0.getSum(766, 978);
        int int18 = sumWithoutArithmeticOperators0.getSum(925, 360);
        int int21 = sumWithoutArithmeticOperators0.getSum(1206, 199);
        int int24 = sumWithoutArithmeticOperators0.getSum(17, 686);
        int int27 = sumWithoutArithmeticOperators0.getSum(24024, 11915);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 558 + "'", int12 == 558);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1744 + "'", int15 == 1744);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1285 + "'", int18 == 1285);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1405 + "'", int21 == 1405);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 703 + "'", int24 == 703);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35939 + "'", int27 == 35939);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(17, 19);
        int int21 = sumWithoutArithmeticOperators0.getSum(1376, 54);
        int int24 = sumWithoutArithmeticOperators0.getSum(7227, 3224);
        int int27 = sumWithoutArithmeticOperators0.getSum(10303, 1313);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1430 + "'", int21 == 1430);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10451 + "'", int24 == 10451);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 11616 + "'", int27 == 11616);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 101);
        int int18 = sumWithoutArithmeticOperators0.getSum(416, 911);
        int int21 = sumWithoutArithmeticOperators0.getSum(1623, 1187);
        int int24 = sumWithoutArithmeticOperators0.getSum(1643, 3934);
        int int27 = sumWithoutArithmeticOperators0.getSum(15478, 17140);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 154 + "'", int15 == 154);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1327 + "'", int18 == 1327);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2810 + "'", int21 == 2810);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5577 + "'", int24 == 5577);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32618 + "'", int27 == 32618);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) '#', (int) (short) 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(101, 42);
        int int21 = sumWithoutArithmeticOperators0.getSum(99, 289);
        int int24 = sumWithoutArithmeticOperators0.getSum(19, 97);
        int int27 = sumWithoutArithmeticOperators0.getSum(746, 301);
        int int30 = sumWithoutArithmeticOperators0.getSum(5965, 33970);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 143 + "'", int18 == 143);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 388 + "'", int21 == 388);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 116 + "'", int24 == 116);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1047 + "'", int27 == 1047);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 39935 + "'", int30 == 39935);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(321, 56);
        int int9 = sumWithoutArithmeticOperators0.getSum(277, 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(625, 55);
        int int15 = sumWithoutArithmeticOperators0.getSum(543, 767);
        int int18 = sumWithoutArithmeticOperators0.getSum(3297, 9962);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 377 + "'", int6 == 377);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 377 + "'", int9 == 377);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 680 + "'", int12 == 680);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1310 + "'", int15 == 1310);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13259 + "'", int18 == 13259);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(51, 422);
        int int18 = sumWithoutArithmeticOperators0.getSum(9349, 4197);
        int int21 = sumWithoutArithmeticOperators0.getSum(10, 1272);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 473 + "'", int15 == 473);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13546 + "'", int18 == 13546);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1282 + "'", int21 == 1282);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(122, 67);
        int int18 = sumWithoutArithmeticOperators0.getSum(473, 360);
        int int21 = sumWithoutArithmeticOperators0.getSum(2512, 615);
        int int24 = sumWithoutArithmeticOperators0.getSum(6326, 2300);
        int int27 = sumWithoutArithmeticOperators0.getSum(13355, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 189 + "'", int15 == 189);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 833 + "'", int18 == 833);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3127 + "'", int21 == 3127);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8626 + "'", int24 == 8626);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 13355 + "'", int27 == 13355);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(11, (int) (short) 0);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int21 = sumWithoutArithmeticOperators0.getSum(727, 460);
        int int24 = sumWithoutArithmeticOperators0.getSum(14375, 2207);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1187 + "'", int21 == 1187);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16582 + "'", int24 == 16582);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(18, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(5208, 188);
        int int21 = sumWithoutArithmeticOperators0.getSum(256, 377);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5396 + "'", int18 == 5396);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 633 + "'", int21 == 633);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(3406, 570);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3976 + "'", int36 == 3976);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(18, 345);
        int int12 = sumWithoutArithmeticOperators0.getSum(4771, 8731);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 363 + "'", int9 == 363);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 13502 + "'", int12 == 13502);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
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
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(101, 21);
        int int18 = sumWithoutArithmeticOperators0.getSum(89, 180);
        int int21 = sumWithoutArithmeticOperators0.getSum(199, (int) '4');
        int int24 = sumWithoutArithmeticOperators0.getSum(652, 469);
        int int27 = sumWithoutArithmeticOperators0.getSum(210, 40);
        int int30 = sumWithoutArithmeticOperators0.getSum(13001, 885);
        int int33 = sumWithoutArithmeticOperators0.getSum(9822, 7955);
        int int36 = sumWithoutArithmeticOperators0.getSum(1562, 1111);
        java.lang.Class<?> wildcardClass37 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 269 + "'", int18 == 269);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 251 + "'", int21 == 251);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1121 + "'", int24 == 1121);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 250 + "'", int27 == 250);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 13886 + "'", int30 == 13886);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 17777 + "'", int33 == 17777);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2673 + "'", int36 == 2673);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(17, 200);
        int int6 = sumWithoutArithmeticOperators0.getSum(853, 427);
        int int9 = sumWithoutArithmeticOperators0.getSum(1171, 254);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1430);
        int int15 = sumWithoutArithmeticOperators0.getSum(3322, 767);
        int int18 = sumWithoutArithmeticOperators0.getSum(7170, 458);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 217 + "'", int3 == 217);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1280 + "'", int6 == 1280);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1425 + "'", int9 == 1425);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1440 + "'", int12 == 1440);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4089 + "'", int15 == 4089);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7628 + "'", int18 == 7628);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) '#', (int) (short) 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) 'a', 156);
        int int21 = sumWithoutArithmeticOperators0.getSum(238, 84);
        int int24 = sumWithoutArithmeticOperators0.getSum(638, 36);
        int int27 = sumWithoutArithmeticOperators0.getSum(278, 6158);
        int int30 = sumWithoutArithmeticOperators0.getSum(35424, 2646);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 253 + "'", int18 == 253);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 322 + "'", int21 == 322);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 674 + "'", int24 == 674);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6436 + "'", int27 == 6436);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 38070 + "'", int30 == 38070);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 18);
        int int9 = sumWithoutArithmeticOperators0.getSum(36, 160);
        int int12 = sumWithoutArithmeticOperators0.getSum(1623, 760);
        int int15 = sumWithoutArithmeticOperators0.getSum(2817, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(421, 1019);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 196 + "'", int9 == 196);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2383 + "'", int12 == 2383);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2817 + "'", int15 == 2817);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1440 + "'", int18 == 1440);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 36);
        int int18 = sumWithoutArithmeticOperators0.getSum(526, 213);
        int int21 = sumWithoutArithmeticOperators0.getSum(271, 253);
        int int24 = sumWithoutArithmeticOperators0.getSum(1709, 592);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 739 + "'", int18 == 739);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 524 + "'", int21 == 524);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2301 + "'", int24 == 2301);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(19, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(51, 109);
        int int21 = sumWithoutArithmeticOperators0.getSum(390, 152);
        int int24 = sumWithoutArithmeticOperators0.getSum(1028, 546);
        int int27 = sumWithoutArithmeticOperators0.getSum(5125, 853);
        int int30 = sumWithoutArithmeticOperators0.getSum(6580, 580);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 129 + "'", int15 == 129);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 160 + "'", int18 == 160);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 542 + "'", int21 == 542);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1574 + "'", int24 == 1574);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5978 + "'", int27 == 5978);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7160 + "'", int30 == 7160);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(217, 238);
        int int21 = sumWithoutArithmeticOperators0.getSum(156, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(593, 1374);
        int int27 = sumWithoutArithmeticOperators0.getSum(199, (int) (byte) 10);
        int int30 = sumWithoutArithmeticOperators0.getSum(149, 454);
        int int33 = sumWithoutArithmeticOperators0.getSum(1192, (int) (short) 10);
        int int36 = sumWithoutArithmeticOperators0.getSum(6388, 2597);
        int int39 = sumWithoutArithmeticOperators0.getSum(4330, 1547);
        java.lang.Class<?> wildcardClass40 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 455 + "'", int18 == 455);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 156 + "'", int21 == 156);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1967 + "'", int24 == 1967);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 209 + "'", int27 == 209);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 603 + "'", int30 == 603);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1202 + "'", int33 == 1202);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 8985 + "'", int36 == 8985);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 5877 + "'", int39 == 5877);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(294, (int) (short) -1);
        int int21 = sumWithoutArithmeticOperators0.getSum(614, 734);
        int int24 = sumWithoutArithmeticOperators0.getSum(3665, 2998);
        int int27 = sumWithoutArithmeticOperators0.getSum(0, 3842);
        int int30 = sumWithoutArithmeticOperators0.getSum(1881, 127);
        int int33 = sumWithoutArithmeticOperators0.getSum(2581, 17560);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 293 + "'", int18 == 293);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1348 + "'", int21 == 1348);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6663 + "'", int24 == 6663);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3842 + "'", int27 == 3842);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2008 + "'", int30 == 2008);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 20141 + "'", int33 == 20141);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 200);
        int int9 = sumWithoutArithmeticOperators0.getSum(156, 36);
        int int12 = sumWithoutArithmeticOperators0.getSum(1987, 0);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 210 + "'", int6 == 210);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 192 + "'", int9 == 192);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1987 + "'", int12 == 1987);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 36);
        int int18 = sumWithoutArithmeticOperators0.getSum(134, 725);
        int int21 = sumWithoutArithmeticOperators0.getSum(4810, 576);
        int int24 = sumWithoutArithmeticOperators0.getSum(9139, 18076);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 859 + "'", int18 == 859);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5386 + "'", int21 == 5386);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 27215 + "'", int24 == 27215);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 10);
        int int15 = sumWithoutArithmeticOperators0.getSum(488, 1236);
        int int18 = sumWithoutArithmeticOperators0.getSum(546, 853);
        int int21 = sumWithoutArithmeticOperators0.getSum(452, 1281);
        int int24 = sumWithoutArithmeticOperators0.getSum(666, 9075);
        int int27 = sumWithoutArithmeticOperators0.getSum(711, 10525);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1724 + "'", int15 == 1724);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1399 + "'", int18 == 1399);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1733 + "'", int21 == 1733);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9741 + "'", int24 == 9741);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 11236 + "'", int27 == 11236);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 18);
        int int9 = sumWithoutArithmeticOperators0.getSum(36, 160);
        int int12 = sumWithoutArithmeticOperators0.getSum(686, 2696);
        int int15 = sumWithoutArithmeticOperators0.getSum(798, 1798);
        int int18 = sumWithoutArithmeticOperators0.getSum(708, 567);
        int int21 = sumWithoutArithmeticOperators0.getSum(13148, 9649);
        int int24 = sumWithoutArithmeticOperators0.getSum(3526, 522);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 196 + "'", int9 == 196);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3382 + "'", int12 == 3382);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2596 + "'", int15 == 2596);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1275 + "'", int18 == 1275);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 22797 + "'", int21 == 22797);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4048 + "'", int24 == 4048);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum(44, 671);
        int int12 = sumWithoutArithmeticOperators0.getSum(8803, 4623);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 715 + "'", int9 == 715);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 13426 + "'", int12 == 13426);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(325, 240);
        int int18 = sumWithoutArithmeticOperators0.getSum(5645, 12497);
        int int21 = sumWithoutArithmeticOperators0.getSum(10378, 6617);
        int int24 = sumWithoutArithmeticOperators0.getSum(3582, 1074);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 565 + "'", int15 == 565);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18142 + "'", int18 == 18142);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16995 + "'", int21 == 16995);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4656 + "'", int24 == 4656);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(6413, 445);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 647 + "'", int18 == 647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1643 + "'", int21 == 1643);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6811 + "'", int24 == 6811);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2435 + "'", int27 == 2435);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6858 + "'", int30 == 6858);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 89);
        int int12 = sumWithoutArithmeticOperators0.getSum(27215, 3147);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 90 + "'", int9 == 90);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 30362 + "'", int12 == 30362);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 10);
        int int15 = sumWithoutArithmeticOperators0.getSum(488, 1236);
        int int18 = sumWithoutArithmeticOperators0.getSum(1364, 364);
        int int21 = sumWithoutArithmeticOperators0.getSum(853, 3922);
        int int24 = sumWithoutArithmeticOperators0.getSum(5756, 24827);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1724 + "'", int15 == 1724);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1728 + "'", int18 == 1728);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4775 + "'", int21 == 4775);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 30583 + "'", int24 == 30583);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(0, 979);
        int int33 = sumWithoutArithmeticOperators0.getSum(615, 1547);
        int int36 = sumWithoutArithmeticOperators0.getSum(7795, 6272);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 979 + "'", int30 == 979);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2162 + "'", int33 == 2162);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 14067 + "'", int36 == 14067);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
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
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(161, 84);
        int int21 = sumWithoutArithmeticOperators0.getSum(1999, 526);
        int int24 = sumWithoutArithmeticOperators0.getSum(1275, 14692);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2525 + "'", int21 == 2525);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15967 + "'", int24 == 15967);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(28166, 1164);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 29330 + "'", int33 == 29330);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 101);
        int int18 = sumWithoutArithmeticOperators0.getSum(416, 911);
        int int21 = sumWithoutArithmeticOperators0.getSum(1748, 1253);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 154 + "'", int15 == 154);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1327 + "'", int18 == 1327);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3001 + "'", int21 == 3001);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(523, (int) ' ');
        int int18 = sumWithoutArithmeticOperators0.getSum(486, 107);
        int int21 = sumWithoutArithmeticOperators0.getSum(309, 803);
        int int24 = sumWithoutArithmeticOperators0.getSum(1714, 2368);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 555 + "'", int15 == 555);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 593 + "'", int18 == 593);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1112 + "'", int21 == 1112);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4082 + "'", int24 == 4082);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(4105, 9968);
        int int33 = sumWithoutArithmeticOperators0.getSum(3727, 3831);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3889 + "'", int18 == 3889);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 445 + "'", int21 == 445);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 290 + "'", int24 == 290);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 288 + "'", int27 == 288);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 14073 + "'", int30 == 14073);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 7558 + "'", int33 == 7558);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(238, 253);
        int int15 = sumWithoutArithmeticOperators0.getSum(683, 1003);
        int int18 = sumWithoutArithmeticOperators0.getSum(2386, 9647);
        int int21 = sumWithoutArithmeticOperators0.getSum(1363, 5350);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 491 + "'", int12 == 491);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1686 + "'", int15 == 1686);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 12033 + "'", int18 == 12033);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6713 + "'", int21 == 6713);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
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
        java.lang.Class<?> wildcardClass37 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 89);
        int int12 = sumWithoutArithmeticOperators0.getSum(1023, 665);
        int int15 = sumWithoutArithmeticOperators0.getSum(202, 9193);
        int int18 = sumWithoutArithmeticOperators0.getSum(486, 14708);
        int int21 = sumWithoutArithmeticOperators0.getSum(379, 1373);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 3737);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 90 + "'", int9 == 90);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1688 + "'", int12 == 1688);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9395 + "'", int15 == 9395);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15194 + "'", int18 == 15194);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1752 + "'", int21 == 1752);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3737 + "'", int24 == 3737);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(238, 253);
        int int15 = sumWithoutArithmeticOperators0.getSum(683, 1003);
        int int18 = sumWithoutArithmeticOperators0.getSum(974, 2511);
        int int21 = sumWithoutArithmeticOperators0.getSum(859, 1709);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 491 + "'", int12 == 491);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1686 + "'", int15 == 1686);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3485 + "'", int18 == 3485);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2568 + "'", int21 == 2568);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(238, 152);
        int int15 = sumWithoutArithmeticOperators0.getSum(245, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(134, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(170, 67);
        int int24 = sumWithoutArithmeticOperators0.getSum(2136, 3072);
        int int27 = sumWithoutArithmeticOperators0.getSum(168, 3959);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 390 + "'", int12 == 390);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 407 + "'", int15 == 407);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 170 + "'", int18 == 170);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 237 + "'", int21 == 237);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5208 + "'", int24 == 5208);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4127 + "'", int27 == 4127);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(9, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(614, 1541);
        int int18 = sumWithoutArithmeticOperators0.getSum(1643, 1530);
        int int21 = sumWithoutArithmeticOperators0.getSum(188, 12812);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2155 + "'", int15 == 2155);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3173 + "'", int18 == 3173);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13000 + "'", int21 == 13000);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(33, 163);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (byte) 100);
        int int21 = sumWithoutArithmeticOperators0.getSum(40, 3360);
        int int24 = sumWithoutArithmeticOperators0.getSum(3275, 9646);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3400 + "'", int21 == 3400);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12921 + "'", int24 == 12921);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(33, 163);
        int int18 = sumWithoutArithmeticOperators0.getSum(788, 1555);
        int int21 = sumWithoutArithmeticOperators0.getSum(905, 6250);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2343 + "'", int18 == 2343);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7155 + "'", int21 == 7155);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(1380, 0);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1380 + "'", int33 == 1380);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(196, (int) ' ');
        int int15 = sumWithoutArithmeticOperators0.getSum(1128, 108);
        int int18 = sumWithoutArithmeticOperators0.getSum(844, 98);
        int int21 = sumWithoutArithmeticOperators0.getSum(2231, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(6114, 1759);
        int int27 = sumWithoutArithmeticOperators0.getSum(278, 11960);
        int int30 = sumWithoutArithmeticOperators0.getSum(19424, 7516);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 228 + "'", int12 == 228);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1236 + "'", int15 == 1236);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 942 + "'", int18 == 942);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2231 + "'", int21 == 2231);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7873 + "'", int24 == 7873);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 12238 + "'", int27 == 12238);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 26940 + "'", int30 == 26940);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(859, 321);
        int int18 = sumWithoutArithmeticOperators0.getSum(576, 2810);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 7277);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 6707);
        int int27 = sumWithoutArithmeticOperators0.getSum(1191, 1375);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1180 + "'", int15 == 1180);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3386 + "'", int18 == 3386);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7277 + "'", int21 == 7277);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6707 + "'", int24 == 6707);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2566 + "'", int27 == 2566);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(40, 269);
        int int6 = sumWithoutArithmeticOperators0.getSum(6164, 1430);
        int int9 = sumWithoutArithmeticOperators0.getSum(3569, 1512);
        int int12 = sumWithoutArithmeticOperators0.getSum(637, 627);
        int int15 = sumWithoutArithmeticOperators0.getSum(2231, 3410);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 309 + "'", int3 == 309);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7594 + "'", int6 == 7594);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5081 + "'", int9 == 5081);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1264 + "'", int12 == 1264);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5641 + "'", int15 == 5641);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(18, 345);
        int int12 = sumWithoutArithmeticOperators0.getSum(974, 55);
        int int15 = sumWithoutArithmeticOperators0.getSum(6177, 0);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 363 + "'", int9 == 363);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1029 + "'", int12 == 1029);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6177 + "'", int15 == 6177);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(200, (int) (byte) 0);
        int int9 = sumWithoutArithmeticOperators0.getSum(281, 460);
        int int12 = sumWithoutArithmeticOperators0.getSum(490, 3863);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 741 + "'", int9 == 741);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4353 + "'", int12 == 4353);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(110, 53);
        int int21 = sumWithoutArithmeticOperators0.getSum(51, 215);
        int int24 = sumWithoutArithmeticOperators0.getSum(680, 616);
        int int27 = sumWithoutArithmeticOperators0.getSum(90, 972);
        int int30 = sumWithoutArithmeticOperators0.getSum(2889, 0);
        int int33 = sumWithoutArithmeticOperators0.getSum(23591, 213);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 266 + "'", int21 == 266);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1296 + "'", int24 == 1296);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1062 + "'", int27 == 1062);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2889 + "'", int30 == 2889);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 23804 + "'", int33 == 23804);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
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
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 18);
        int int9 = sumWithoutArithmeticOperators0.getSum(36, 160);
        int int12 = sumWithoutArithmeticOperators0.getSum(686, 2696);
        int int15 = sumWithoutArithmeticOperators0.getSum(2810, 5491);
        int int18 = sumWithoutArithmeticOperators0.getSum(835, 16007);
        int int21 = sumWithoutArithmeticOperators0.getSum(2683, 2596);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 196 + "'", int9 == 196);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3382 + "'", int12 == 3382);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8301 + "'", int15 == 8301);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16842 + "'", int18 == 16842);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5279 + "'", int21 == 5279);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(217, 238);
        int int21 = sumWithoutArithmeticOperators0.getSum(199, 427);
        int int24 = sumWithoutArithmeticOperators0.getSum(1268, 8080);
        int int27 = sumWithoutArithmeticOperators0.getSum(28561, 10292);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 455 + "'", int18 == 455);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 626 + "'", int21 == 626);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9348 + "'", int24 == 9348);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 38853 + "'", int27 == 38853);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(257, 250);
        int int12 = sumWithoutArithmeticOperators0.getSum(221, 360);
        int int15 = sumWithoutArithmeticOperators0.getSum(885, (int) '#');
        int int18 = sumWithoutArithmeticOperators0.getSum(13806, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(11552, 822);
        int int24 = sumWithoutArithmeticOperators0.getSum(671, 11566);
        int int27 = sumWithoutArithmeticOperators0.getSum(8642, 6495);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 507 + "'", int9 == 507);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 581 + "'", int12 == 581);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 920 + "'", int15 == 920);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13806 + "'", int18 == 13806);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12374 + "'", int21 == 12374);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12237 + "'", int24 == 12237);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15137 + "'", int27 == 15137);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(238, 152);
        int int15 = sumWithoutArithmeticOperators0.getSum(2472, 1180);
        int int18 = sumWithoutArithmeticOperators0.getSum(454, 15536);
        int int21 = sumWithoutArithmeticOperators0.getSum(3744, 651);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 390 + "'", int12 == 390);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3652 + "'", int15 == 3652);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15990 + "'", int18 == 15990);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4395 + "'", int21 == 4395);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(51, 422);
        int int18 = sumWithoutArithmeticOperators0.getSum(238, 614);
        int int21 = sumWithoutArithmeticOperators0.getSum(427, 149);
        int int24 = sumWithoutArithmeticOperators0.getSum(21374, 9815);
        int int27 = sumWithoutArithmeticOperators0.getSum(0, 2301);
        int int30 = sumWithoutArithmeticOperators0.getSum(368, 8528);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 473 + "'", int15 == 473);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 852 + "'", int18 == 852);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 576 + "'", int21 == 576);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 31189 + "'", int24 == 31189);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2301 + "'", int27 == 2301);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8896 + "'", int30 == 8896);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 36);
        int int18 = sumWithoutArithmeticOperators0.getSum(844, 289);
        int int21 = sumWithoutArithmeticOperators0.getSum(601, 9797);
        int int24 = sumWithoutArithmeticOperators0.getSum(6811, 5755);
        int int27 = sumWithoutArithmeticOperators0.getSum(1099, 19648);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1133 + "'", int18 == 1133);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10398 + "'", int21 == 10398);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12566 + "'", int24 == 12566);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20747 + "'", int27 == 20747);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(3249, 3555);
        int int36 = sumWithoutArithmeticOperators0.getSum(1491, 1191);
        int int39 = sumWithoutArithmeticOperators0.getSum(3465, 10405);
        int int42 = sumWithoutArithmeticOperators0.getSum(18163, 1887);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6804 + "'", int33 == 6804);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2682 + "'", int36 == 2682);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 13870 + "'", int39 == 13870);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 20050 + "'", int42 == 20050);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(51, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(238, (int) '4');
        int int18 = sumWithoutArithmeticOperators0.getSum(1044, 84);
        int int21 = sumWithoutArithmeticOperators0.getSum(2051, 11258);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 290 + "'", int15 == 290);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1128 + "'", int18 == 1128);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13309 + "'", int21 == 13309);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(11, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(73, 163);
        int int24 = sumWithoutArithmeticOperators0.getSum(194, 1067);
        int int27 = sumWithoutArithmeticOperators0.getSum(1106, 1842);
        int int30 = sumWithoutArithmeticOperators0.getSum(16269, 6280);
        int int33 = sumWithoutArithmeticOperators0.getSum(830, 14971);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 236 + "'", int21 == 236);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1261 + "'", int24 == 1261);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2948 + "'", int27 == 2948);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 22549 + "'", int30 == 22549);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 15801 + "'", int33 == 15801);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(63, 868);
        int int12 = sumWithoutArithmeticOperators0.getSum(9075, 9144);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 931 + "'", int9 == 931);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 18219 + "'", int12 == 18219);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(100, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 345);
        int int21 = sumWithoutArithmeticOperators0.getSum(1680, 840);
        int int24 = sumWithoutArithmeticOperators0.getSum(625, 739);
        int int27 = sumWithoutArithmeticOperators0.getSum(876, 1987);
        int int30 = sumWithoutArithmeticOperators0.getSum(876, 2911);
        int int33 = sumWithoutArithmeticOperators0.getSum(3528, 10910);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 345 + "'", int18 == 345);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2520 + "'", int21 == 2520);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1364 + "'", int24 == 1364);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2863 + "'", int27 == 2863);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3787 + "'", int30 == 3787);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 14438 + "'", int33 == 14438);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(163, 52);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 200);
        int int18 = sumWithoutArithmeticOperators0.getSum(325, 617);
        int int21 = sumWithoutArithmeticOperators0.getSum(1511, 1128);
        int int24 = sumWithoutArithmeticOperators0.getSum(2026, 2529);
        int int27 = sumWithoutArithmeticOperators0.getSum(8567, 1999);
        int int30 = sumWithoutArithmeticOperators0.getSum(2308, 1171);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 215 + "'", int12 == 215);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 942 + "'", int18 == 942);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2639 + "'", int21 == 2639);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4555 + "'", int24 == 4555);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10566 + "'", int27 == 10566);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3479 + "'", int30 == 3479);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) '#', (int) (short) 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(101, 42);
        int int21 = sumWithoutArithmeticOperators0.getSum(1383, 11160);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 143 + "'", int18 == 143);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12543 + "'", int21 == 12543);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 19);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(859, 454);
        int int12 = sumWithoutArithmeticOperators0.getSum(1253, 461);
        int int15 = sumWithoutArithmeticOperators0.getSum(288, 309);
        int int18 = sumWithoutArithmeticOperators0.getSum(582, 271);
        int int21 = sumWithoutArithmeticOperators0.getSum(9794, 9797);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1313 + "'", int9 == 1313);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1714 + "'", int12 == 1714);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 597 + "'", int15 == 597);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853 + "'", int18 == 853);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19591 + "'", int21 == 19591);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(2683, 0);
        int int36 = sumWithoutArithmeticOperators0.getSum(23213, 878);
        int int39 = sumWithoutArithmeticOperators0.getSum(108, 9697);
        int int42 = sumWithoutArithmeticOperators0.getSum(1163, 2231);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2683 + "'", int33 == 2683);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 24091 + "'", int36 == 24091);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9805 + "'", int39 == 9805);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3394 + "'", int42 == 3394);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 18);
        int int9 = sumWithoutArithmeticOperators0.getSum(36, 160);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 108);
        int int15 = sumWithoutArithmeticOperators0.getSum(859, 249);
        int int18 = sumWithoutArithmeticOperators0.getSum(330, 911);
        int int21 = sumWithoutArithmeticOperators0.getSum(2115, 1171);
        int int24 = sumWithoutArithmeticOperators0.getSum(830, 736);
        int int27 = sumWithoutArithmeticOperators0.getSum(12566, 9242);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 196 + "'", int9 == 196);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1108 + "'", int15 == 1108);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1241 + "'", int18 == 1241);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3286 + "'", int21 == 3286);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1566 + "'", int24 == 1566);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 21808 + "'", int27 == 21808);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(523, (int) ' ');
        int int18 = sumWithoutArithmeticOperators0.getSum(98, 144);
        int int21 = sumWithoutArithmeticOperators0.getSum(581, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(14767, 1820);
        int int27 = sumWithoutArithmeticOperators0.getSum(2596, 15309);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 555 + "'", int15 == 555);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 242 + "'", int18 == 242);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 581 + "'", int21 == 581);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16587 + "'", int24 == 16587);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 17905 + "'", int27 == 17905);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(19, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(51, 109);
        int int21 = sumWithoutArithmeticOperators0.getSum(390, 152);
        int int24 = sumWithoutArithmeticOperators0.getSum(1028, 546);
        int int27 = sumWithoutArithmeticOperators0.getSum((int) ' ', 791);
        int int30 = sumWithoutArithmeticOperators0.getSum(0, 5341);
        int int33 = sumWithoutArithmeticOperators0.getSum(2945, 12561);
        int int36 = sumWithoutArithmeticOperators0.getSum(411, 4613);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 129 + "'", int15 == 129);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 160 + "'", int18 == 160);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 542 + "'", int21 == 542);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1574 + "'", int24 == 1574);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 823 + "'", int27 == 823);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5341 + "'", int30 == 5341);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 15506 + "'", int33 == 15506);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5024 + "'", int36 == 5024);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(277, 17);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 1026);
        int int18 = sumWithoutArithmeticOperators0.getSum(2767, 3397);
        int int21 = sumWithoutArithmeticOperators0.getSum(8356, 16904);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 294 + "'", int12 == 294);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1026 + "'", int15 == 1026);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6164 + "'", int18 == 6164);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 25260 + "'", int21 == 25260);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(211, 245);
        int int15 = sumWithoutArithmeticOperators0.getSum(697, 290);
        int int18 = sumWithoutArithmeticOperators0.getSum(11577, 14442);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 456 + "'", int12 == 456);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 987 + "'", int15 == 987);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 26019 + "'", int18 == 26019);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
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
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(238, 253);
        int int15 = sumWithoutArithmeticOperators0.getSum(683, 1003);
        int int18 = sumWithoutArithmeticOperators0.getSum(974, 2511);
        int int21 = sumWithoutArithmeticOperators0.getSum(1559, 526);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 491 + "'", int12 == 491);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1686 + "'", int15 == 1686);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3485 + "'", int18 == 3485);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2085 + "'", int21 == 2085);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(16631, 9992);
        int int36 = sumWithoutArithmeticOperators0.getSum(18407, 11947);
        int int39 = sumWithoutArithmeticOperators0.getSum(22604, 5162);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 26623 + "'", int33 == 26623);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 30354 + "'", int36 == 30354);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 27766 + "'", int39 == 27766);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
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
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(452, 255);
        int int36 = sumWithoutArithmeticOperators0.getSum(314, 674);
        int int39 = sumWithoutArithmeticOperators0.getSum(0, 844);
        java.lang.Class<?> wildcardClass40 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 707 + "'", int33 == 707);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 988 + "'", int36 == 988);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 844 + "'", int39 == 844);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum(44, 671);
        int int12 = sumWithoutArithmeticOperators0.getSum(629, 397);
        int int15 = sumWithoutArithmeticOperators0.getSum(920, 507);
        int int18 = sumWithoutArithmeticOperators0.getSum(2456, 12935);
        int int21 = sumWithoutArithmeticOperators0.getSum(14624, 179);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 715 + "'", int9 == 715);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1026 + "'", int12 == 1026);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1427 + "'", int15 == 1427);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15391 + "'", int18 == 15391);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14803 + "'", int21 == 14803);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(163, 52);
        int int15 = sumWithoutArithmeticOperators0.getSum(107, 210);
        int int18 = sumWithoutArithmeticOperators0.getSum(21, 975);
        int int21 = sumWithoutArithmeticOperators0.getSum(151, 315);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 5190);
        int int27 = sumWithoutArithmeticOperators0.getSum(7983, 1537);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 215 + "'", int12 == 215);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 317 + "'", int15 == 317);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 996 + "'", int18 == 996);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 466 + "'", int21 == 466);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5190 + "'", int24 == 5190);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9520 + "'", int27 == 9520);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
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
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 226 + "'", int15 == 226);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1700 + "'", int18 == 1700);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 431 + "'", int21 == 431);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1777 + "'", int24 == 1777);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 13776 + "'", int27 == 13776);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '#', 555);
        int int15 = sumWithoutArithmeticOperators0.getSum(593, 3946);
        int int18 = sumWithoutArithmeticOperators0.getSum(9500, 2054);
        int int21 = sumWithoutArithmeticOperators0.getSum(265, 208);
        int int24 = sumWithoutArithmeticOperators0.getSum(2221, 2047);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 590 + "'", int12 == 590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4539 + "'", int15 == 4539);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11554 + "'", int18 == 11554);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 473 + "'", int21 == 473);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4268 + "'", int24 == 4268);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
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
        int int42 = sumWithoutArithmeticOperators0.getSum(7972, 10098);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 18070 + "'", int42 == 18070);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 200);
        int int9 = sumWithoutArithmeticOperators0.getSum(1305, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(42826, 1292);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 210 + "'", int6 == 210);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1305 + "'", int9 == 1305);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 44118 + "'", int12 == 44118);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(15167, 2190);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 17357 + "'", int33 == 17357);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
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
        int int42 = sumWithoutArithmeticOperators0.getSum(2696, 2578);
        int int45 = sumWithoutArithmeticOperators0.getSum(1967, 0);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 5274 + "'", int42 == 5274);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1967 + "'", int45 == 1967);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(51, 66);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 117 + "'", int12 == 117);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 18);
        int int18 = sumWithoutArithmeticOperators0.getSum(90, (int) (byte) 1);
        int int21 = sumWithoutArithmeticOperators0.getSum(104, 3561);
        int int24 = sumWithoutArithmeticOperators0.getSum(617, 562);
        int int27 = sumWithoutArithmeticOperators0.getSum(1448, 13614);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 91 + "'", int18 == 91);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3665 + "'", int21 == 3665);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1179 + "'", int24 == 1179);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15062 + "'", int27 == 15062);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(19, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(2941, 1690);
        int int21 = sumWithoutArithmeticOperators0.getSum(6878, 23877);
        int int24 = sumWithoutArithmeticOperators0.getSum(1917, 12283);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 129 + "'", int15 == 129);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4631 + "'", int18 == 4631);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30755 + "'", int21 == 30755);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14200 + "'", int24 == 14200);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(1012, 3102);
        int int33 = sumWithoutArithmeticOperators0.getSum(2520, 7272);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4114 + "'", int30 == 4114);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9792 + "'", int33 == 9792);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(163, 52);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 200);
        int int18 = sumWithoutArithmeticOperators0.getSum(885, 876);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 16471);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 215 + "'", int12 == 215);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1761 + "'", int18 == 1761);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16471 + "'", int21 == 16471);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(100, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(2165, 1724);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 445);
        int int24 = sumWithoutArithmeticOperators0.getSum(1291, 5744);
        int int27 = sumWithoutArithmeticOperators0.getSum(2036, 8300);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3889 + "'", int18 == 3889);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 445 + "'", int21 == 445);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7035 + "'", int24 == 7035);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10336 + "'", int27 == 10336);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(546, 36);
        int int36 = sumWithoutArithmeticOperators0.getSum(616, 620);
        int int39 = sumWithoutArithmeticOperators0.getSum(12625, 1957);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 582 + "'", int33 == 582);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1236 + "'", int36 == 1236);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 14582 + "'", int39 == 14582);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(33, 163);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (byte) 100);
        int int21 = sumWithoutArithmeticOperators0.getSum(202, 1833);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2035 + "'", int21 == 2035);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(321, 56);
        int int9 = sumWithoutArithmeticOperators0.getSum(277, 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(625, 55);
        int int15 = sumWithoutArithmeticOperators0.getSum(543, 767);
        int int18 = sumWithoutArithmeticOperators0.getSum(13361, 4231);
        int int21 = sumWithoutArithmeticOperators0.getSum(4817, 3158);
        int int24 = sumWithoutArithmeticOperators0.getSum(32618, 17282);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 377 + "'", int6 == 377);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 377 + "'", int9 == 377);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 680 + "'", int12 == 680);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1310 + "'", int15 == 1310);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17592 + "'", int18 == 17592);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7975 + "'", int21 == 7975);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 49900 + "'", int24 == 49900);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(101, 21);
        int int18 = sumWithoutArithmeticOperators0.getSum(89, 180);
        int int21 = sumWithoutArithmeticOperators0.getSum(199, (int) '4');
        int int24 = sumWithoutArithmeticOperators0.getSum(652, 469);
        int int27 = sumWithoutArithmeticOperators0.getSum(210, 40);
        int int30 = sumWithoutArithmeticOperators0.getSum(13001, 885);
        int int33 = sumWithoutArithmeticOperators0.getSum(9822, 7955);
        int int36 = sumWithoutArithmeticOperators0.getSum(4149, 18977);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 269 + "'", int18 == 269);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 251 + "'", int21 == 251);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1121 + "'", int24 == 1121);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 250 + "'", int27 == 250);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 13886 + "'", int30 == 13886);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 17777 + "'", int33 == 17777);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 23126 + "'", int36 == 23126);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(4560, 7071);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 249 + "'", int15 == 249);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1134 + "'", int18 == 1134);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3597 + "'", int21 == 3597);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3629 + "'", int24 == 3629);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10793 + "'", int27 == 10793);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 11631 + "'", int30 == 11631);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(2075, 6437);
        int int21 = sumWithoutArithmeticOperators0.getSum(13319, 16238);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8512 + "'", int18 == 8512);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 29557 + "'", int21 == 29557);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(195, 317);
        int int18 = sumWithoutArithmeticOperators0.getSum(76, 499);
        int int21 = sumWithoutArithmeticOperators0.getSum(844, 555);
        int int24 = sumWithoutArithmeticOperators0.getSum(3949, 4164);
        int int27 = sumWithoutArithmeticOperators0.getSum(10491, 4231);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 575 + "'", int18 == 575);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1399 + "'", int21 == 1399);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8113 + "'", int24 == 8113);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 14722 + "'", int27 == 14722);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 84);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 1336);
        int int15 = sumWithoutArithmeticOperators0.getSum(12479, 5055);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 84 + "'", int9 == 84);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1336 + "'", int12 == 1336);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 17534 + "'", int15 == 17534);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) '#', (int) (short) 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(52, (int) (short) 1);
        int int21 = sumWithoutArithmeticOperators0.getSum(257, 289);
        int int24 = sumWithoutArithmeticOperators0.getSum(375, 671);
        int int27 = sumWithoutArithmeticOperators0.getSum(1547, 1231);
        int int30 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53 + "'", int18 == 53);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 546 + "'", int21 == 546);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1046 + "'", int24 == 1046);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2778 + "'", int27 == 2778);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 107 + "'", int21 == 107);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4667 + "'", int24 == 4667);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1332 + "'", int33 == 1332);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(5150, 8301);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 226 + "'", int15 == 226);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1700 + "'", int18 == 1700);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 431 + "'", int21 == 431);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1777 + "'", int24 == 1777);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10014 + "'", int27 == 10014);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 13451 + "'", int30 == 13451);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 36);
        int int18 = sumWithoutArithmeticOperators0.getSum(844, 289);
        int int21 = sumWithoutArithmeticOperators0.getSum(7661, 11809);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1133 + "'", int18 == 1133);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19470 + "'", int21 == 19470);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(52, 104);
        int int18 = sumWithoutArithmeticOperators0.getSum(590, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(132, 108);
        int int24 = sumWithoutArithmeticOperators0.getSum(1278, 101);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 156 + "'", int15 == 156);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 590 + "'", int18 == 590);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 240 + "'", int21 == 240);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1379 + "'", int24 == 1379);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(51, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(375, 352);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 165);
        int int21 = sumWithoutArithmeticOperators0.getSum(109, 52);
        int int24 = sumWithoutArithmeticOperators0.getSum(7645, 1010);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 727 + "'", int15 == 727);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 165 + "'", int18 == 165);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 161 + "'", int21 == 161);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8655 + "'", int24 == 8655);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(955, 89);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 55);
        int int21 = sumWithoutArithmeticOperators0.getSum(6388, 620);
        int int24 = sumWithoutArithmeticOperators0.getSum(12143, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1044 + "'", int15 == 1044);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 56 + "'", int18 == 56);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7008 + "'", int21 == 7008);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12143 + "'", int24 == 12143);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 180);
        int int18 = sumWithoutArithmeticOperators0.getSum(1080, 974);
        int int21 = sumWithoutArithmeticOperators0.getSum(1296, 260);
        int int24 = sumWithoutArithmeticOperators0.getSum(465, 542);
        int int27 = sumWithoutArithmeticOperators0.getSum(7343, 3127);
        int int30 = sumWithoutArithmeticOperators0.getSum(25186, 19133);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 180 + "'", int15 == 180);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2054 + "'", int18 == 2054);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1556 + "'", int21 == 1556);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1007 + "'", int24 == 1007);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10470 + "'", int27 == 10470);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 44319 + "'", int30 == 44319);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(51, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(3564, 5421);
        int int18 = sumWithoutArithmeticOperators0.getSum(944, 5545);
        int int21 = sumWithoutArithmeticOperators0.getSum(11259, 9078);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8985 + "'", int15 == 8985);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6489 + "'", int18 == 6489);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20337 + "'", int21 == 20337);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 101);
        int int18 = sumWithoutArithmeticOperators0.getSum(209, 107);
        int int21 = sumWithoutArithmeticOperators0.getSum(1245, 727);
        int int24 = sumWithoutArithmeticOperators0.getSum(2168, 4750);
        int int27 = sumWithoutArithmeticOperators0.getSum(3085, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 154 + "'", int15 == 154);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 316 + "'", int18 == 316);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1972 + "'", int21 == 1972);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6918 + "'", int24 == 6918);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3085 + "'", int27 == 3085);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(125, 245);
        int int9 = sumWithoutArithmeticOperators0.getSum(4433, 2339);
        int int12 = sumWithoutArithmeticOperators0.getSum(9835, 14282);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 370 + "'", int6 == 370);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6772 + "'", int9 == 6772);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 24117 + "'", int12 == 24117);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum(44, 671);
        int int12 = sumWithoutArithmeticOperators0.getSum(629, 397);
        int int15 = sumWithoutArithmeticOperators0.getSum(920, 507);
        int int18 = sumWithoutArithmeticOperators0.getSum(2941, 4079);
        int int21 = sumWithoutArithmeticOperators0.getSum(8476, 3627);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 715 + "'", int9 == 715);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1026 + "'", int12 == 1026);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1427 + "'", int15 == 1427);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7020 + "'", int18 == 7020);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12103 + "'", int21 == 12103);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(8803, 9139);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 17942 + "'", int33 == 17942);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(574, 1268);
        int int21 = sumWithoutArithmeticOperators0.getSum(11121, 2750);
        int int24 = sumWithoutArithmeticOperators0.getSum(542, 13934);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 161 + "'", int15 == 161);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1842 + "'", int18 == 1842);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13871 + "'", int21 == 13871);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14476 + "'", int24 == 14476);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(16091, 227);
        int int39 = sumWithoutArithmeticOperators0.getSum(3975, 765);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 16318 + "'", int36 == 16318);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4740 + "'", int39 == 4740);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(3933, 5061);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1186 + "'", int24 == 1186);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 763 + "'", int27 == 763);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8994 + "'", int30 == 8994);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(10404, 8086);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 727 + "'", int15 == 727);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 250 + "'", int18 == 250);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 766 + "'", int21 == 766);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8957 + "'", int24 == 8957);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20418 + "'", int27 == 20418);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 18490 + "'", int30 == 18490);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 19);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(1121, 708);
        int int12 = sumWithoutArithmeticOperators0.getSum(3445, 1680);
        int int15 = sumWithoutArithmeticOperators0.getSum(2262, 788);
        int int18 = sumWithoutArithmeticOperators0.getSum(524, 12265);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1829 + "'", int9 == 1829);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5125 + "'", int12 == 5125);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3050 + "'", int15 == 3050);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 12789 + "'", int18 == 12789);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(3340, 6925);
        int int18 = sumWithoutArithmeticOperators0.getSum(1482, 5025);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10265 + "'", int15 == 10265);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6507 + "'", int18 == 6507);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 10);
        int int15 = sumWithoutArithmeticOperators0.getSum(488, 1236);
        int int18 = sumWithoutArithmeticOperators0.getSum(452, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 576);
        int int24 = sumWithoutArithmeticOperators0.getSum(1001, 1347);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1724 + "'", int15 == 1724);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 604 + "'", int18 == 604);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 576 + "'", int21 == 576);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2348 + "'", int24 == 2348);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(160, 465);
        int int12 = sumWithoutArithmeticOperators0.getSum(3809, 11795);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 625 + "'", int9 == 625);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15604 + "'", int12 == 15604);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(6623, 13777);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 20400 + "'", int33 == 20400);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(1012, 7074);
        int int33 = sumWithoutArithmeticOperators0.getSum(4838, 3677);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1044 + "'", int15 == 1044);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 56 + "'", int18 == 56);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4677 + "'", int21 == 4677);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4537 + "'", int24 == 4537);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3949 + "'", int27 == 3949);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8086 + "'", int30 == 8086);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8515 + "'", int33 == 8515);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 6489);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6489 + "'", int15 == 6489);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(100, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(722, 789);
        int int21 = sumWithoutArithmeticOperators0.getSum(567, 1171);
        int int24 = sumWithoutArithmeticOperators0.getSum(1192, 2427);
        int int27 = sumWithoutArithmeticOperators0.getSum(2986, 0);
        int int30 = sumWithoutArithmeticOperators0.getSum(6108, 837);
        int int33 = sumWithoutArithmeticOperators0.getSum(7477, 4543);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1511 + "'", int18 == 1511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1738 + "'", int21 == 1738);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3619 + "'", int24 == 3619);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2986 + "'", int27 == 2986);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6945 + "'", int30 == 6945);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 12020 + "'", int33 == 12020);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(1134, 4216);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5350 + "'", int33 == 5350);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(635, 151);
        int int18 = sumWithoutArithmeticOperators0.getSum(1105, 1121);
        int int21 = sumWithoutArithmeticOperators0.getSum(25268, 23094);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 786 + "'", int15 == 786);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2226 + "'", int18 == 2226);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 48362 + "'", int21 == 48362);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(11, (int) (short) 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(245, 56);
        int int21 = sumWithoutArithmeticOperators0.getSum(3678, 472);
        int int24 = sumWithoutArithmeticOperators0.getSum(5105, 3483);
        int int27 = sumWithoutArithmeticOperators0.getSum(23340, 1971);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 301 + "'", int18 == 301);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4150 + "'", int21 == 4150);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8588 + "'", int24 == 8588);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 25311 + "'", int27 == 25311);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(40, 269);
        int int6 = sumWithoutArithmeticOperators0.getSum(1172, 1391);
        int int9 = sumWithoutArithmeticOperators0.getSum(4374, 2492);
        int int12 = sumWithoutArithmeticOperators0.getSum(13330, 5769);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 309 + "'", int3 == 309);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2563 + "'", int6 == 2563);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6866 + "'", int9 == 6866);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19099 + "'", int12 == 19099);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum(44, 671);
        int int12 = sumWithoutArithmeticOperators0.getSum(629, 397);
        int int15 = sumWithoutArithmeticOperators0.getSum(920, 507);
        int int18 = sumWithoutArithmeticOperators0.getSum(2456, 12935);
        int int21 = sumWithoutArithmeticOperators0.getSum(14624, 179);
        int int24 = sumWithoutArithmeticOperators0.getSum(1128, 4877);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 715 + "'", int9 == 715);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1026 + "'", int12 == 1026);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1427 + "'", int15 == 1427);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15391 + "'", int18 == 15391);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14803 + "'", int21 == 14803);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6005 + "'", int24 == 6005);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(289, 269);
        int int15 = sumWithoutArithmeticOperators0.getSum(766, 978);
        int int18 = sumWithoutArithmeticOperators0.getSum(925, 360);
        int int21 = sumWithoutArithmeticOperators0.getSum(1206, 199);
        int int24 = sumWithoutArithmeticOperators0.getSum(17, 686);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 558 + "'", int12 == 558);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1744 + "'", int15 == 1744);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1285 + "'", int18 == 1285);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1405 + "'", int21 == 1405);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 703 + "'", int24 == 703);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(33, 1407);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1440 + "'", int33 == 1440);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 101);
        int int18 = sumWithoutArithmeticOperators0.getSum(128, 1119);
        int int21 = sumWithoutArithmeticOperators0.getSum(216, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum((-1), 20344);
        int int27 = sumWithoutArithmeticOperators0.getSum(0, 31424);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 154 + "'", int15 == 154);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1247 + "'", int18 == 1247);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 216 + "'", int21 == 216);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20343 + "'", int24 == 20343);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 31424 + "'", int27 == 31424);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
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
        int int39 = sumWithoutArithmeticOperators0.getSum(3034, 3139);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3340 + "'", int33 == 3340);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 24767 + "'", int36 == 24767);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 6173 + "'", int39 == 6173);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(11, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(631, 255);
        int int18 = sumWithoutArithmeticOperators0.getSum(835, 575);
        int int21 = sumWithoutArithmeticOperators0.getSum(1762, 289);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 1796);
        int int27 = sumWithoutArithmeticOperators0.getSum(32, 18837);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 886 + "'", int15 == 886);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1410 + "'", int18 == 1410);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2051 + "'", int21 == 2051);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1796 + "'", int24 == 1796);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 18869 + "'", int27 == 18869);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(651, 3322);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 129 + "'", int15 == 129);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 160 + "'", int18 == 160);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 542 + "'", int21 == 542);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1574 + "'", int24 == 1574);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 865 + "'", int27 == 865);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3973 + "'", int30 == 3973);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(352, 375);
        int int18 = sumWithoutArithmeticOperators0.getSum(122, 1327);
        int int21 = sumWithoutArithmeticOperators0.getSum(11335, 1602);
        int int24 = sumWithoutArithmeticOperators0.getSum(14740, 8095);
        int int27 = sumWithoutArithmeticOperators0.getSum(2116, 12937);
        int int30 = sumWithoutArithmeticOperators0.getSum(6300, 11553);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 727 + "'", int15 == 727);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1449 + "'", int18 == 1449);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12937 + "'", int21 == 12937);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 22835 + "'", int24 == 22835);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15053 + "'", int27 == 15053);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 17853 + "'", int30 == 17853);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 10);
        int int15 = sumWithoutArithmeticOperators0.getSum(5007, 1398);
        int int18 = sumWithoutArithmeticOperators0.getSum(236, 160);
        int int21 = sumWithoutArithmeticOperators0.getSum(1910, 18210);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6405 + "'", int15 == 6405);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 396 + "'", int18 == 396);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20120 + "'", int21 == 20120);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(352, 375);
        int int18 = sumWithoutArithmeticOperators0.getSum(122, 1327);
        int int21 = sumWithoutArithmeticOperators0.getSum(2018, 242);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 727 + "'", int15 == 727);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1449 + "'", int18 == 1449);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2260 + "'", int21 == 2260);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(251, 210);
        int int15 = sumWithoutArithmeticOperators0.getSum(246, 9);
        int int18 = sumWithoutArithmeticOperators0.getSum(1128, 246);
        int int21 = sumWithoutArithmeticOperators0.getSum(238, 125);
        int int24 = sumWithoutArithmeticOperators0.getSum(14237, 3542);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 461 + "'", int12 == 461);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 255 + "'", int15 == 255);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1374 + "'", int18 == 1374);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 363 + "'", int21 == 363);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 17779 + "'", int24 == 17779);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(2683, 0);
        int int36 = sumWithoutArithmeticOperators0.getSum(23213, 878);
        int int39 = sumWithoutArithmeticOperators0.getSum(7885, 3332);
        java.lang.Class<?> wildcardClass40 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2683 + "'", int33 == 2683);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 24091 + "'", int36 == 24091);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 11217 + "'", int39 == 11217);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(3389, 1203);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 226 + "'", int15 == 226);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1700 + "'", int18 == 1700);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 431 + "'", int21 == 431);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1777 + "'", int24 == 1777);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 13776 + "'", int27 == 13776);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4592 + "'", int30 == 4592);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
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
        java.lang.Class<?> wildcardClass37 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(33, 163);
        int int18 = sumWithoutArithmeticOperators0.getSum(788, 1555);
        int int21 = sumWithoutArithmeticOperators0.getSum(54, 325);
        int int24 = sumWithoutArithmeticOperators0.getSum(12283, 965);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2343 + "'", int18 == 2343);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 379 + "'", int21 == 379);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13248 + "'", int24 == 13248);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(11, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(286, 9);
        int int24 = sumWithoutArithmeticOperators0.getSum(110, 266);
        int int27 = sumWithoutArithmeticOperators0.getSum(452, 22421);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 376 + "'", int24 == 376);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 22873 + "'", int27 == 22873);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(110, 376);
        int int12 = sumWithoutArithmeticOperators0.getSum(1172, 3707);
        int int15 = sumWithoutArithmeticOperators0.getSum(1688, 3319);
        int int18 = sumWithoutArithmeticOperators0.getSum(217, 592);
        int int21 = sumWithoutArithmeticOperators0.getSum(8052, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(11707, 22352);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 486 + "'", int9 == 486);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4879 + "'", int12 == 4879);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5007 + "'", int15 == 5007);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 809 + "'", int18 == 809);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8052 + "'", int21 == 8052);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 34059 + "'", int24 == 34059);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 56);
        int int18 = sumWithoutArithmeticOperators0.getSum(2240, 10864);
        int int21 = sumWithoutArithmeticOperators0.getSum(2372, 1788);
        int int24 = sumWithoutArithmeticOperators0.getSum(19744, 12575);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 55 + "'", int15 == 55);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13104 + "'", int18 == 13104);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4160 + "'", int21 == 4160);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32319 + "'", int24 == 32319);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(1670, 8476);
        int int33 = sumWithoutArithmeticOperators0.getSum(5752, 7195);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 460 + "'", int21 == 460);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 490 + "'", int24 == 490);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6812 + "'", int27 == 6812);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10146 + "'", int30 == 10146);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 12947 + "'", int33 == 12947);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(266, 295);
        int int15 = sumWithoutArithmeticOperators0.getSum(1067, (int) 'a');
        int int18 = sumWithoutArithmeticOperators0.getSum(3188, 1762);
        int int21 = sumWithoutArithmeticOperators0.getSum(6812, (int) 'a');
        int int24 = sumWithoutArithmeticOperators0.getSum(7008, 2407);
        int int27 = sumWithoutArithmeticOperators0.getSum(1148, 7195);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 561 + "'", int12 == 561);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1164 + "'", int15 == 1164);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4950 + "'", int18 == 4950);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6909 + "'", int21 == 6909);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9415 + "'", int24 == 9415);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8343 + "'", int27 == 8343);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(1574, 1748);
        int int33 = sumWithoutArithmeticOperators0.getSum(978, 1530);
        int int36 = sumWithoutArithmeticOperators0.getSum(8962, 266);
        java.lang.Class<?> wildcardClass37 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 724 + "'", int24 == 724);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 431 + "'", int27 == 431);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3322 + "'", int30 == 3322);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2508 + "'", int33 == 2508);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 9228 + "'", int36 == 9228);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(40, 269);
        int int6 = sumWithoutArithmeticOperators0.getSum(202, 523);
        int int9 = sumWithoutArithmeticOperators0.getSum(1455, 9650);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 309 + "'", int3 == 309);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 725 + "'", int6 == 725);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11105 + "'", int9 == 11105);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(955, 89);
        int int18 = sumWithoutArithmeticOperators0.getSum(278, 725);
        int int21 = sumWithoutArithmeticOperators0.getSum(191, 421);
        int int24 = sumWithoutArithmeticOperators0.getSum(101, 4051);
        int int27 = sumWithoutArithmeticOperators0.getSum(13247, 3461);
        int int30 = sumWithoutArithmeticOperators0.getSum(15575, 7029);
        int int33 = sumWithoutArithmeticOperators0.getSum(10261, (int) (byte) 1);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1044 + "'", int15 == 1044);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1003 + "'", int18 == 1003);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 612 + "'", int21 == 612);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4152 + "'", int24 == 4152);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16708 + "'", int27 == 16708);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 22604 + "'", int30 == 22604);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10262 + "'", int33 == 10262);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(100, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(2165, 1724);
        int int21 = sumWithoutArithmeticOperators0.getSum(4105, 542);
        int int24 = sumWithoutArithmeticOperators0.getSum(1106, 2449);
        int int27 = sumWithoutArithmeticOperators0.getSum(3493, 4690);
        int int30 = sumWithoutArithmeticOperators0.getSum(7997, 2917);
        int int33 = sumWithoutArithmeticOperators0.getSum(20343, 6173);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3889 + "'", int18 == 3889);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4647 + "'", int21 == 4647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3555 + "'", int24 == 3555);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8183 + "'", int27 == 8183);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10914 + "'", int30 == 10914);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 26516 + "'", int33 == 26516);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
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
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 101);
        int int18 = sumWithoutArithmeticOperators0.getSum(209, 107);
        int int21 = sumWithoutArithmeticOperators0.getSum(1238, 3218);
        int int24 = sumWithoutArithmeticOperators0.getSum(6085, 215);
        int int27 = sumWithoutArithmeticOperators0.getSum(5189, 38455);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 154 + "'", int15 == 154);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 316 + "'", int18 == 316);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4456 + "'", int21 == 4456);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6300 + "'", int24 == 6300);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 43644 + "'", int27 == 43644);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 250);
        int int18 = sumWithoutArithmeticOperators0.getSum(469, 665);
        int int21 = sumWithoutArithmeticOperators0.getSum(1626, 1971);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 736);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 249 + "'", int15 == 249);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1134 + "'", int18 == 1134);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3597 + "'", int21 == 3597);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 736 + "'", int24 == 736);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
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
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(9, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(614, 1541);
        int int18 = sumWithoutArithmeticOperators0.getSum(1643, 1530);
        int int21 = sumWithoutArithmeticOperators0.getSum(227, 5191);
        int int24 = sumWithoutArithmeticOperators0.getSum(19164, 24414);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2155 + "'", int15 == 2155);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3173 + "'", int18 == 3173);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5418 + "'", int21 == 5418);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 43578 + "'", int24 == 43578);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(5377, 7625);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 294 + "'", int9 == 294);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 260 + "'", int12 == 260);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 54 + "'", int15 == 54);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 160 + "'", int18 == 160);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3627 + "'", int21 == 3627);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2417 + "'", int24 == 2417);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 26235 + "'", int27 == 26235);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 13002 + "'", int30 == 13002);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(110, 53);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 7);
        int int24 = sumWithoutArithmeticOperators0.getSum(269, 455);
        int int27 = sumWithoutArithmeticOperators0.getSum(590, 240);
        int int30 = sumWithoutArithmeticOperators0.getSum(12220, 4251);
        int int33 = sumWithoutArithmeticOperators0.getSum(18932, 363);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 724 + "'", int24 == 724);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 830 + "'", int27 == 830);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 16471 + "'", int30 == 16471);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 19295 + "'", int33 == 19295);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(6455, 221);
        int int33 = sumWithoutArithmeticOperators0.getSum(3762, 30019);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 286 + "'", int18 == 286);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 671 + "'", int21 == 671);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1187 + "'", int24 == 1187);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8528 + "'", int27 == 8528);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6676 + "'", int30 == 6676);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 33781 + "'", int33 == 33781);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(163, 36);
        int int12 = sumWithoutArithmeticOperators0.getSum(269, 196);
        int int15 = sumWithoutArithmeticOperators0.getSum(19, 217);
        int int18 = sumWithoutArithmeticOperators0.getSum(7795, 7648);
        int int21 = sumWithoutArithmeticOperators0.getSum(13934, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(2324, 10234);
        int int27 = sumWithoutArithmeticOperators0.getSum(9644, 7702);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 199 + "'", int9 == 199);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 465 + "'", int12 == 465);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 236 + "'", int15 == 236);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15443 + "'", int18 == 15443);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13934 + "'", int21 == 13934);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12558 + "'", int24 == 12558);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 17346 + "'", int27 == 17346);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) ' ', 9);
        int int15 = sumWithoutArithmeticOperators0.getSum(253, 483);
        int int18 = sumWithoutArithmeticOperators0.getSum(12096, 651);
        int int21 = sumWithoutArithmeticOperators0.getSum(129, 7723);
        int int24 = sumWithoutArithmeticOperators0.getSum(788, 4905);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 41 + "'", int12 == 41);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 736 + "'", int15 == 736);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 12747 + "'", int18 == 12747);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7852 + "'", int21 == 7852);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5693 + "'", int24 == 5693);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(101, 21);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 623);
        int int24 = sumWithoutArithmeticOperators0.getSum(1010, 162);
        int int27 = sumWithoutArithmeticOperators0.getSum(197, 377);
        int int30 = sumWithoutArithmeticOperators0.getSum(3564, 728);
        int int33 = sumWithoutArithmeticOperators0.getSum(597, 4292);
        int int36 = sumWithoutArithmeticOperators0.getSum(150, 4977);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 162 + "'", int18 == 162);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 623 + "'", int21 == 623);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1172 + "'", int24 == 1172);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 574 + "'", int27 == 574);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4292 + "'", int30 == 4292);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4889 + "'", int33 == 4889);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5127 + "'", int36 == 5127);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 36);
        int int18 = sumWithoutArithmeticOperators0.getSum(647, 325);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 671);
        int int24 = sumWithoutArithmeticOperators0.getSum(2653, 9307);
        int int27 = sumWithoutArithmeticOperators0.getSum(2265, 15527);
        int int30 = sumWithoutArithmeticOperators0.getSum(4847, 12167);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 972 + "'", int18 == 972);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 671 + "'", int21 == 671);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11960 + "'", int24 == 11960);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 17792 + "'", int27 == 17792);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 17014 + "'", int30 == 17014);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 19);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(859, 454);
        int int12 = sumWithoutArithmeticOperators0.getSum(1253, 461);
        int int15 = sumWithoutArithmeticOperators0.getSum(288, 309);
        int int18 = sumWithoutArithmeticOperators0.getSum(582, 271);
        int int21 = sumWithoutArithmeticOperators0.getSum(1764, 286);
        int int24 = sumWithoutArithmeticOperators0.getSum(11930, 8642);
        int int27 = sumWithoutArithmeticOperators0.getSum(4177, 407);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1313 + "'", int9 == 1313);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1714 + "'", int12 == 1714);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 597 + "'", int15 == 597);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853 + "'", int18 == 853);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2050 + "'", int21 == 2050);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20572 + "'", int24 == 20572);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4584 + "'", int27 == 4584);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(238, 253);
        int int15 = sumWithoutArithmeticOperators0.getSum(19707, 3569);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 11050);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 491 + "'", int12 == 491);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 23276 + "'", int15 == 23276);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11050 + "'", int18 == 11050);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(196, (int) ' ');
        int int15 = sumWithoutArithmeticOperators0.getSum(266, 853);
        int int18 = sumWithoutArithmeticOperators0.getSum(46, 101);
        int int21 = sumWithoutArithmeticOperators0.getSum(52, 696);
        int int24 = sumWithoutArithmeticOperators0.getSum(134, 242);
        int int27 = sumWithoutArithmeticOperators0.getSum(8817, 12662);
        int int30 = sumWithoutArithmeticOperators0.getSum(4629, 16978);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 228 + "'", int12 == 228);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1119 + "'", int15 == 1119);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 147 + "'", int18 == 147);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 748 + "'", int21 == 748);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 376 + "'", int24 == 376);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 21479 + "'", int27 == 21479);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 21607 + "'", int30 == 21607);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(635, 151);
        int int18 = sumWithoutArithmeticOperators0.getSum(734, 3577);
        int int21 = sumWithoutArithmeticOperators0.getSum(1582, 161);
        int int24 = sumWithoutArithmeticOperators0.getSum(3125, 4999);
        int int27 = sumWithoutArithmeticOperators0.getSum(11937, 2415);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 786 + "'", int15 == 786);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4311 + "'", int18 == 4311);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1743 + "'", int21 == 1743);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8124 + "'", int24 == 8124);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 14352 + "'", int27 == 14352);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 200);
        int int9 = sumWithoutArithmeticOperators0.getSum(156, 36);
        int int12 = sumWithoutArithmeticOperators0.getSum(1987, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(2518, 0);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 210 + "'", int6 == 210);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 192 + "'", int9 == 192);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1987 + "'", int12 == 1987);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2518 + "'", int15 == 2518);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 199);
        int int12 = sumWithoutArithmeticOperators0.getSum(324, 614);
        int int15 = sumWithoutArithmeticOperators0.getSum(498, 461);
        int int18 = sumWithoutArithmeticOperators0.getSum(4671, 1001);
        int int21 = sumWithoutArithmeticOperators0.getSum(1698, 4061);
        int int24 = sumWithoutArithmeticOperators0.getSum(7558, 2805);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 199 + "'", int9 == 199);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 938 + "'", int12 == 938);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 959 + "'", int15 == 959);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5672 + "'", int18 == 5672);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5759 + "'", int21 == 5759);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10363 + "'", int24 == 10363);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(19, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(51, 109);
        int int21 = sumWithoutArithmeticOperators0.getSum(390, 152);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 36924);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 129 + "'", int15 == 129);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 160 + "'", int18 == 160);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 542 + "'", int21 == 542);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 36924 + "'", int24 == 36924);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum((-1), 290);
        int int21 = sumWithoutArithmeticOperators0.getSum(13877, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 289 + "'", int18 == 289);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13877 + "'", int21 == 13877);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(260, 195);
        int int15 = sumWithoutArithmeticOperators0.getSum(552, 3382);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 455 + "'", int12 == 455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3934 + "'", int15 == 3934);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(3158, 5573);
        int int36 = sumWithoutArithmeticOperators0.getSum(10272, 9520);
        int int39 = sumWithoutArithmeticOperators0.getSum(8204, 16199);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8731 + "'", int33 == 8731);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 19792 + "'", int36 == 19792);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 24403 + "'", int39 == 24403);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 165);
        int int12 = sumWithoutArithmeticOperators0.getSum(152, 108);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 55);
        int int18 = sumWithoutArithmeticOperators0.getSum(52, 108);
        int int21 = sumWithoutArithmeticOperators0.getSum(4445, 5103);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 294 + "'", int9 == 294);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 260 + "'", int12 == 260);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 54 + "'", int15 == 54);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 160 + "'", int18 == 160);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9548 + "'", int21 == 9548);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(3942, 15088);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 972 + "'", int18 == 972);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2833 + "'", int21 == 2833);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1560 + "'", int24 == 1560);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2017 + "'", int27 == 2017);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 19030 + "'", int30 == 19030);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(1171, 21848);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 107 + "'", int21 == 107);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1245 + "'", int24 == 1245);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2136 + "'", int27 == 2136);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 23019 + "'", int30 == 23019);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(122, 67);
        int int18 = sumWithoutArithmeticOperators0.getSum(160, 1680);
        int int21 = sumWithoutArithmeticOperators0.getSum(5105, 8899);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 189 + "'", int15 == 189);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1840 + "'", int18 == 1840);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14004 + "'", int21 == 14004);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(9, 217);
        int int18 = sumWithoutArithmeticOperators0.getSum(934, 766);
        int int21 = sumWithoutArithmeticOperators0.getSum(216, 215);
        int int24 = sumWithoutArithmeticOperators0.getSum(1072, 705);
        int int27 = sumWithoutArithmeticOperators0.getSum(13898, 5753);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 226 + "'", int15 == 226);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1700 + "'", int18 == 1700);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 431 + "'", int21 == 431);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1777 + "'", int24 == 1777);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 19651 + "'", int27 == 19651);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(98, (int) 'a');
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, 955);
        int int15 = sumWithoutArithmeticOperators0.getSum(28736, 11530);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 195 + "'", int9 == 195);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 955 + "'", int12 == 955);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 40266 + "'", int15 == 40266);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(110, 53);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 7);
        int int24 = sumWithoutArithmeticOperators0.getSum(269, 455);
        int int27 = sumWithoutArithmeticOperators0.getSum(543, 84);
        int int30 = sumWithoutArithmeticOperators0.getSum(1133, 414);
        int int33 = sumWithoutArithmeticOperators0.getSum(2308, 2894);
        int int36 = sumWithoutArithmeticOperators0.getSum(288, 1119);
        int int39 = sumWithoutArithmeticOperators0.getSum(1059, 7272);
        int int42 = sumWithoutArithmeticOperators0.getSum(4831, 3424);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 724 + "'", int24 == 724);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 627 + "'", int27 == 627);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1547 + "'", int30 == 1547);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5202 + "'", int33 == 5202);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1407 + "'", int36 == 1407);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 8331 + "'", int39 == 8331);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 8255 + "'", int42 == 8255);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(257, 250);
        int int12 = sumWithoutArithmeticOperators0.getSum(13677, 1029);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 1244);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 507 + "'", int9 == 507);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 14706 + "'", int12 == 14706);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1244 + "'", int15 == 1244);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(19, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(51, 109);
        int int21 = sumWithoutArithmeticOperators0.getSum(390, 152);
        int int24 = sumWithoutArithmeticOperators0.getSum(1028, 546);
        int int27 = sumWithoutArithmeticOperators0.getSum((int) ' ', 791);
        int int30 = sumWithoutArithmeticOperators0.getSum(0, 5341);
        int int33 = sumWithoutArithmeticOperators0.getSum(2945, 12561);
        int int36 = sumWithoutArithmeticOperators0.getSum(129, 7293);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 129 + "'", int15 == 129);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 160 + "'", int18 == 160);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 542 + "'", int21 == 542);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1574 + "'", int24 == 1574);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 823 + "'", int27 == 823);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5341 + "'", int30 == 5341);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 15506 + "'", int33 == 15506);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 7422 + "'", int36 == 7422);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(162, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(623, 483);
        int int21 = sumWithoutArithmeticOperators0.getSum(4392, 1040);
        int int24 = sumWithoutArithmeticOperators0.getSum(13107, 144);
        int int27 = sumWithoutArithmeticOperators0.getSum(123, 931);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1106 + "'", int18 == 1106);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5432 + "'", int21 == 5432);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13251 + "'", int24 == 13251);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1054 + "'", int27 == 1054);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(2460, 3742);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6202 + "'", int33 == 6202);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
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
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(19, 21);
        int int9 = sumWithoutArithmeticOperators0.getSum(186, 6405);
        java.lang.Class<?> wildcardClass10 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6591 + "'", int9 == 6591);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(110, 376);
        int int12 = sumWithoutArithmeticOperators0.getSum(1172, 3707);
        int int15 = sumWithoutArithmeticOperators0.getSum(1688, 3319);
        int int18 = sumWithoutArithmeticOperators0.getSum(4739, 3133);
        int int21 = sumWithoutArithmeticOperators0.getSum(7753, 628);
        int int24 = sumWithoutArithmeticOperators0.getSum(246, 12568);
        int int27 = sumWithoutArithmeticOperators0.getSum(2556, 7516);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 486 + "'", int9 == 486);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4879 + "'", int12 == 4879);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5007 + "'", int15 == 5007);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7872 + "'", int18 == 7872);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8381 + "'", int21 == 8381);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12814 + "'", int24 == 12814);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10072 + "'", int27 == 10072);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(416, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(785, 453);
        int int21 = sumWithoutArithmeticOperators0.getSum(189, 277);
        int int24 = sumWithoutArithmeticOperators0.getSum(4890, 6050);
        int int27 = sumWithoutArithmeticOperators0.getSum(227, 20567);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 526 + "'", int15 == 526);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1238 + "'", int18 == 1238);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 466 + "'", int21 == 466);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10940 + "'", int24 == 10940);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20794 + "'", int27 == 20794);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(19, 21);
        int int9 = sumWithoutArithmeticOperators0.getSum(53, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(286, 125);
        int int15 = sumWithoutArithmeticOperators0.getSum(295, 325);
        int int18 = sumWithoutArithmeticOperators0.getSum(260, 2675);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 411 + "'", int12 == 411);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 620 + "'", int15 == 620);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2935 + "'", int18 == 2935);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(452, 255);
        int int36 = sumWithoutArithmeticOperators0.getSum(314, 674);
        int int39 = sumWithoutArithmeticOperators0.getSum(4337, 0);
        int int42 = sumWithoutArithmeticOperators0.getSum(10077, 14228);
        java.lang.Class<?> wildcardClass43 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 707 + "'", int33 == 707);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 988 + "'", int36 == 988);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4337 + "'", int39 == 4337);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 24305 + "'", int42 == 24305);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(19, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(51, 109);
        int int21 = sumWithoutArithmeticOperators0.getSum(256, 727);
        int int24 = sumWithoutArithmeticOperators0.getSum(454, 0);
        int int27 = sumWithoutArithmeticOperators0.getSum(627, 2116);
        int int30 = sumWithoutArithmeticOperators0.getSum(0, 9703);
        int int33 = sumWithoutArithmeticOperators0.getSum(3319, 1282);
        int int36 = sumWithoutArithmeticOperators0.getSum(116, 7625);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 129 + "'", int15 == 129);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 160 + "'", int18 == 160);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 983 + "'", int21 == 983);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 454 + "'", int24 == 454);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2743 + "'", int27 == 2743);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9703 + "'", int30 == 9703);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4601 + "'", int33 == 4601);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 7741 + "'", int36 == 7741);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(3597, 963);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4560 + "'", int36 == 4560);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(161, 84);
        int int21 = sumWithoutArithmeticOperators0.getSum(767, 243);
        int int24 = sumWithoutArithmeticOperators0.getSum(4164, 11347);
        int int27 = sumWithoutArithmeticOperators0.getSum(1192, 7625);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1010 + "'", int21 == 1010);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15511 + "'", int24 == 15511);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8817 + "'", int27 == 8817);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 200);
        int int9 = sumWithoutArithmeticOperators0.getSum(156, 36);
        int int12 = sumWithoutArithmeticOperators0.getSum(2049, 1268);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 210 + "'", int6 == 210);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 192 + "'", int9 == 192);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3317 + "'", int12 == 3317);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 19);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(1121, 708);
        int int12 = sumWithoutArithmeticOperators0.getSum(3445, 1680);
        int int15 = sumWithoutArithmeticOperators0.getSum(116, 1503);
        int int18 = sumWithoutArithmeticOperators0.getSum(2065, 4152);
        int int21 = sumWithoutArithmeticOperators0.getSum(1538, 26570);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1829 + "'", int9 == 1829);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5125 + "'", int12 == 5125);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1619 + "'", int15 == 1619);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6217 + "'", int18 == 6217);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 28108 + "'", int21 == 28108);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) ' ', 35);
        int int6 = sumWithoutArithmeticOperators0.getSum(315, 445);
        int int9 = sumWithoutArithmeticOperators0.getSum(2155, 11656);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 67 + "'", int3 == 67);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 760 + "'", int6 == 760);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 13811 + "'", int9 == 13811);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 199);
        int int12 = sumWithoutArithmeticOperators0.getSum(324, 614);
        int int15 = sumWithoutArithmeticOperators0.getSum(533, (int) (short) 10);
        int int18 = sumWithoutArithmeticOperators0.getSum(1748, 1807);
        int int21 = sumWithoutArithmeticOperators0.getSum(8301, 6507);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 199 + "'", int9 == 199);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 938 + "'", int12 == 938);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 543 + "'", int15 == 543);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3555 + "'", int18 == 3555);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14808 + "'", int21 == 14808);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(257, 250);
        int int12 = sumWithoutArithmeticOperators0.getSum(221, 360);
        int int15 = sumWithoutArithmeticOperators0.getSum(885, (int) '#');
        int int18 = sumWithoutArithmeticOperators0.getSum(6951, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(466, 11992);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 507 + "'", int9 == 507);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 581 + "'", int12 == 581);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 920 + "'", int15 == 920);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6951 + "'", int18 == 6951);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12458 + "'", int21 == 12458);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(251, 210);
        int int15 = sumWithoutArithmeticOperators0.getSum(66, 277);
        int int18 = sumWithoutArithmeticOperators0.getSum(5681, 3733);
        int int21 = sumWithoutArithmeticOperators0.getSum(9195, 5281);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 461 + "'", int12 == 461);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 343 + "'", int15 == 343);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9414 + "'", int18 == 9414);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14476 + "'", int21 == 14476);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(345, 269);
        int int9 = sumWithoutArithmeticOperators0.getSum(2456, 3564);
        int int12 = sumWithoutArithmeticOperators0.getSum(483, 14209);
        int int15 = sumWithoutArithmeticOperators0.getSum(7929, 151);
        int int18 = sumWithoutArithmeticOperators0.getSum(2223, 7597);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 614 + "'", int6 == 614);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6020 + "'", int9 == 6020);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 14692 + "'", int12 == 14692);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8080 + "'", int15 == 8080);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9820 + "'", int18 == 9820);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
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
        int int42 = sumWithoutArithmeticOperators0.getSum(8804, 2891);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 11695 + "'", int42 == 11695);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(2279, 615);
        int int15 = sumWithoutArithmeticOperators0.getSum(20294, 1080);
        int int18 = sumWithoutArithmeticOperators0.getSum(12935, 739);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2894 + "'", int12 == 2894);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 21374 + "'", int15 == 21374);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13674 + "'", int18 == 13674);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(40, 269);
        int int6 = sumWithoutArithmeticOperators0.getSum(202, 523);
        int int9 = sumWithoutArithmeticOperators0.getSum(286, 1337);
        int int12 = sumWithoutArithmeticOperators0.getSum(11589, 18104);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 309 + "'", int3 == 309);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 725 + "'", int6 == 725);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1623 + "'", int9 == 1623);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 29693 + "'", int12 == 29693);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(100, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 345);
        int int21 = sumWithoutArithmeticOperators0.getSum(1680, 840);
        int int24 = sumWithoutArithmeticOperators0.getSum(625, 739);
        int int27 = sumWithoutArithmeticOperators0.getSum(2262, 1148);
        int int30 = sumWithoutArithmeticOperators0.getSum(110, 11050);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 345 + "'", int18 == 345);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2520 + "'", int21 == 2520);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1364 + "'", int24 == 1364);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3410 + "'", int27 == 3410);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 11160 + "'", int30 == 11160);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(51, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(238, (int) '4');
        int int18 = sumWithoutArithmeticOperators0.getSum(1044, 84);
        int int21 = sumWithoutArithmeticOperators0.getSum(859, 9);
        int int24 = sumWithoutArithmeticOperators0.getSum(11901, 6301);
        int int27 = sumWithoutArithmeticOperators0.getSum(9592, 10510);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 290 + "'", int15 == 290);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1128 + "'", int18 == 1128);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 868 + "'", int21 == 868);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 18202 + "'", int24 == 18202);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20102 + "'", int27 == 20102);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 101);
        int int18 = sumWithoutArithmeticOperators0.getSum(1087, 2108);
        int int21 = sumWithoutArithmeticOperators0.getSum(1380, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(12103, 8580);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 154 + "'", int15 == 154);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3195 + "'", int18 == 3195);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1380 + "'", int21 == 1380);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20683 + "'", int24 == 20683);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 161 + "'", int15 == 161);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1596 + "'", int18 == 1596);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1349 + "'", int21 == 1349);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16132 + "'", int24 == 16132);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4523 + "'", int27 == 4523);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(163, 52);
        int int15 = sumWithoutArithmeticOperators0.getSum(210, 165);
        int int18 = sumWithoutArithmeticOperators0.getSum(2772, 214);
        int int21 = sumWithoutArithmeticOperators0.getSum(180, 27567);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 215 + "'", int12 == 215);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 375 + "'", int15 == 375);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2986 + "'", int18 == 2986);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27747 + "'", int21 == 27747);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(306, 180);
        int int9 = sumWithoutArithmeticOperators0.getSum(10458, 375);
        int int12 = sumWithoutArithmeticOperators0.getSum(3389, 4420);
        int int15 = sumWithoutArithmeticOperators0.getSum(15349, 2300);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 486 + "'", int6 == 486);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10833 + "'", int9 == 10833);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7809 + "'", int12 == 7809);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 17649 + "'", int15 == 17649);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 56);
        int int18 = sumWithoutArithmeticOperators0.getSum(2240, 10864);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 55 + "'", int15 == 55);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13104 + "'", int18 == 13104);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) ' ', 35);
        int int6 = sumWithoutArithmeticOperators0.getSum(1253, 1133);
        int int9 = sumWithoutArithmeticOperators0.getSum(524, 166);
        int int12 = sumWithoutArithmeticOperators0.getSum(824, 4193);
        int int15 = sumWithoutArithmeticOperators0.getSum(7660, 9155);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 67 + "'", int3 == 67);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2386 + "'", int6 == 2386);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 690 + "'", int9 == 690);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5017 + "'", int12 == 5017);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16815 + "'", int15 == 16815);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(266, 295);
        int int15 = sumWithoutArithmeticOperators0.getSum(1067, (int) 'a');
        int int18 = sumWithoutArithmeticOperators0.getSum(3188, 1762);
        int int21 = sumWithoutArithmeticOperators0.getSum(4576, 10501);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 561 + "'", int12 == 561);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1164 + "'", int15 == 1164);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4950 + "'", int18 == 4950);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15077 + "'", int21 == 15077);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(4560, 4595);
        int int33 = sumWithoutArithmeticOperators0.getSum(0, 382);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 390 + "'", int12 == 390);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 407 + "'", int15 == 407);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 170 + "'", int18 == 170);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 601 + "'", int21 == 601);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2938 + "'", int24 == 2938);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4300 + "'", int27 == 4300);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9155 + "'", int30 == 9155);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 382 + "'", int33 == 382);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(1574, 3049);
        int int33 = sumWithoutArithmeticOperators0.getSum(3804, 13241);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 156 + "'", int15 == 156);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 590 + "'", int18 == 590);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1042 + "'", int21 == 1042);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3687 + "'", int24 == 3687);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2575 + "'", int27 == 2575);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4623 + "'", int30 == 4623);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 17045 + "'", int33 == 17045);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(17, 200);
        int int6 = sumWithoutArithmeticOperators0.getSum(377, 210);
        java.lang.Class<?> wildcardClass7 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 217 + "'", int3 == 217);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 587 + "'", int6 == 587);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(40, 269);
        int int6 = sumWithoutArithmeticOperators0.getSum(202, 523);
        int int9 = sumWithoutArithmeticOperators0.getSum(362, 1680);
        int int12 = sumWithoutArithmeticOperators0.getSum(3091, 2537);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 309 + "'", int3 == 309);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 725 + "'", int6 == 725);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2042 + "'", int9 == 2042);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5628 + "'", int12 == 5628);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(465, 324);
        int int18 = sumWithoutArithmeticOperators0.getSum(1275, 2117);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 789 + "'", int15 == 789);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3392 + "'", int18 == 3392);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(163, 36);
        int int12 = sumWithoutArithmeticOperators0.getSum(8, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(453, 526);
        int int18 = sumWithoutArithmeticOperators0.getSum(3617, 488);
        int int21 = sumWithoutArithmeticOperators0.getSum(3152, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(11259, 0);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 199 + "'", int9 == 199);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 979 + "'", int15 == 979);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4105 + "'", int18 == 4105);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3152 + "'", int21 == 3152);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11259 + "'", int24 == 11259);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) '#', (int) (short) 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) 'a', 156);
        int int21 = sumWithoutArithmeticOperators0.getSum(238, 84);
        int int24 = sumWithoutArithmeticOperators0.getSum(99, 456);
        int int27 = sumWithoutArithmeticOperators0.getSum(2161, 330);
        int int30 = sumWithoutArithmeticOperators0.getSum(7277, 12237);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 253 + "'", int18 == 253);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 322 + "'", int21 == 322);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 555 + "'", int24 == 555);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2491 + "'", int27 == 2491);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 19514 + "'", int30 == 19514);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(100, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(722, 789);
        int int21 = sumWithoutArithmeticOperators0.getSum(567, 1171);
        int int24 = sumWithoutArithmeticOperators0.getSum(1192, 2427);
        int int27 = sumWithoutArithmeticOperators0.getSum(2986, 0);
        int int30 = sumWithoutArithmeticOperators0.getSum(6108, 837);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1511 + "'", int18 == 1511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1738 + "'", int21 == 1738);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3619 + "'", int24 == 3619);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2986 + "'", int27 == 2986);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6945 + "'", int30 == 6945);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(255, 4075);
        int int18 = sumWithoutArithmeticOperators0.getSum(521, 1073);
        int int21 = sumWithoutArithmeticOperators0.getSum(9024, 3331);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4330 + "'", int15 == 4330);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1594 + "'", int18 == 1594);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12355 + "'", int21 == 12355);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(100, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(722, 789);
        int int21 = sumWithoutArithmeticOperators0.getSum(567, 1171);
        int int24 = sumWithoutArithmeticOperators0.getSum(14854, 10525);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1511 + "'", int18 == 1511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1738 + "'", int21 == 1738);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 25379 + "'", int24 == 25379);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(238, 152);
        int int15 = sumWithoutArithmeticOperators0.getSum(245, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(134, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(90, 844);
        int int24 = sumWithoutArithmeticOperators0.getSum(15436, 352);
        int int27 = sumWithoutArithmeticOperators0.getSum(4445, 17427);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 390 + "'", int12 == 390);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 407 + "'", int15 == 407);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 170 + "'", int18 == 170);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 934 + "'", int21 == 934);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15788 + "'", int24 == 15788);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 21872 + "'", int27 == 21872);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(289, 269);
        int int15 = sumWithoutArithmeticOperators0.getSum(766, 978);
        int int18 = sumWithoutArithmeticOperators0.getSum(2308, 4076);
        int int21 = sumWithoutArithmeticOperators0.getSum(2073, 2948);
        int int24 = sumWithoutArithmeticOperators0.getSum(20067, 18977);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 558 + "'", int12 == 558);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1744 + "'", int15 == 1744);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6384 + "'", int18 == 6384);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5021 + "'", int21 == 5021);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 39044 + "'", int24 == 39044);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 18);
        int int9 = sumWithoutArithmeticOperators0.getSum(36, 160);
        int int12 = sumWithoutArithmeticOperators0.getSum(686, 2696);
        int int15 = sumWithoutArithmeticOperators0.getSum(2810, 5491);
        int int18 = sumWithoutArithmeticOperators0.getSum(835, 16007);
        int int21 = sumWithoutArithmeticOperators0.getSum(13886, 6663);
        int int24 = sumWithoutArithmeticOperators0.getSum(453, 13000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 196 + "'", int9 == 196);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3382 + "'", int12 == 3382);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8301 + "'", int15 == 8301);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16842 + "'", int18 == 16842);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20549 + "'", int21 == 20549);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13453 + "'", int24 == 13453);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(24116, 1096);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 306 + "'", int30 == 306);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 782 + "'", int33 == 782);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 25212 + "'", int36 == 25212);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 165);
        int int12 = sumWithoutArithmeticOperators0.getSum(152, 108);
        int int15 = sumWithoutArithmeticOperators0.getSum(788, 360);
        int int18 = sumWithoutArithmeticOperators0.getSum(44, 2347);
        int int21 = sumWithoutArithmeticOperators0.getSum(345, 2919);
        int int24 = sumWithoutArithmeticOperators0.getSum(824, 26623);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 294 + "'", int9 == 294);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 260 + "'", int12 == 260);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1148 + "'", int15 == 1148);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2391 + "'", int18 == 2391);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3264 + "'", int21 == 3264);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 27447 + "'", int24 == 27447);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(40, 269);
        int int6 = sumWithoutArithmeticOperators0.getSum(202, 523);
        int int9 = sumWithoutArithmeticOperators0.getSum(362, 1680);
        int int12 = sumWithoutArithmeticOperators0.getSum(9017, 5215);
        int int15 = sumWithoutArithmeticOperators0.getSum(22942, 24049);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 309 + "'", int3 == 309);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 725 + "'", int6 == 725);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2042 + "'", int9 == 2042);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 14232 + "'", int12 == 14232);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 46991 + "'", int15 == 46991);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 250);
        int int18 = sumWithoutArithmeticOperators0.getSum(469, 665);
        int int21 = sumWithoutArithmeticOperators0.getSum(1626, 1971);
        int int24 = sumWithoutArithmeticOperators0.getSum(852, 2777);
        int int27 = sumWithoutArithmeticOperators0.getSum(13440, 10504);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 249 + "'", int15 == 249);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1134 + "'", int18 == 1134);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3597 + "'", int21 == 3597);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3629 + "'", int24 == 3629);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 23944 + "'", int27 == 23944);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(110, 53);
        int int21 = sumWithoutArithmeticOperators0.getSum(162, 40);
        int int24 = sumWithoutArithmeticOperators0.getSum(2368, 798);
        int int27 = sumWithoutArithmeticOperators0.getSum(15106, 10864);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 202 + "'", int21 == 202);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3166 + "'", int24 == 3166);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 25970 + "'", int27 == 25970);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(4390, (int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4490 + "'", int33 == 4490);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(163, 17);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 186);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 377);
        int int24 = sumWithoutArithmeticOperators0.getSum(9497, 0);
        int int27 = sumWithoutArithmeticOperators0.getSum(9877, 8356);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 180 + "'", int15 == 180);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 186 + "'", int18 == 186);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 377 + "'", int21 == 377);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9497 + "'", int24 == 9497);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 18233 + "'", int27 == 18233);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(1012, 3102);
        int int33 = sumWithoutArithmeticOperators0.getSum(2520, 7272);
        int int36 = sumWithoutArithmeticOperators0.getSum(5087, 13890);
        java.lang.Class<?> wildcardClass37 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 483 + "'", int21 == 483);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 635 + "'", int24 == 635);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 708 + "'", int27 == 708);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4114 + "'", int30 == 4114);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9792 + "'", int33 == 9792);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 18977 + "'", int36 == 18977);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(465, 324);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(269, 301);
        int int24 = sumWithoutArithmeticOperators0.getSum(10889, 285);
        int int27 = sumWithoutArithmeticOperators0.getSum(17990, 18932);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 789 + "'", int15 == 789);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 570 + "'", int21 == 570);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11174 + "'", int24 == 11174);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 36922 + "'", int27 == 36922);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(201, 1252);
        int int21 = sumWithoutArithmeticOperators0.getSum(1174, 1337);
        int int24 = sumWithoutArithmeticOperators0.getSum(2476, 3804);
        int int27 = sumWithoutArithmeticOperators0.getSum(390, 6177);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1453 + "'", int18 == 1453);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2511 + "'", int21 == 2511);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6280 + "'", int24 == 6280);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6567 + "'", int27 == 6567);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(110, 376);
        int int12 = sumWithoutArithmeticOperators0.getSum(1172, 3707);
        int int15 = sumWithoutArithmeticOperators0.getSum(1688, 3319);
        int int18 = sumWithoutArithmeticOperators0.getSum(4739, 3133);
        int int21 = sumWithoutArithmeticOperators0.getSum(7753, 628);
        int int24 = sumWithoutArithmeticOperators0.getSum(246, 12568);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 486 + "'", int9 == 486);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4879 + "'", int12 == 4879);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5007 + "'", int15 == 5007);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7872 + "'", int18 == 7872);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8381 + "'", int21 == 8381);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12814 + "'", int24 == 12814);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 129 + "'", int15 == 129);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 160 + "'", int18 == 160);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 51 + "'", int21 == 51);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 782 + "'", int24 == 782);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 13142 + "'", int27 == 13142);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(200, (int) (byte) 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 129);
        int int12 = sumWithoutArithmeticOperators0.getSum(317, 4215);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 128 + "'", int9 == 128);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4532 + "'", int12 == 4532);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum(4687, (int) (short) 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(39108, 11158);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4787 + "'", int9 == 4787);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50266 + "'", int12 == 50266);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) -1);
        int int21 = sumWithoutArithmeticOperators0.getSum(7, (int) (short) 100);
        int int24 = sumWithoutArithmeticOperators0.getSum(9, 0);
        int int27 = sumWithoutArithmeticOperators0.getSum(265, 938);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 107 + "'", int21 == 107);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1203 + "'", int27 == 1203);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(289, 269);
        int int15 = sumWithoutArithmeticOperators0.getSum(766, 978);
        int int18 = sumWithoutArithmeticOperators0.getSum(925, 360);
        int int21 = sumWithoutArithmeticOperators0.getSum(265, 2782);
        int int24 = sumWithoutArithmeticOperators0.getSum(1001, 5249);
        int int27 = sumWithoutArithmeticOperators0.getSum(28565, 10775);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 558 + "'", int12 == 558);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1744 + "'", int15 == 1744);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1285 + "'", int18 == 1285);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3047 + "'", int21 == 3047);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6250 + "'", int24 == 6250);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 39340 + "'", int27 == 39340);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 200);
        int int9 = sumWithoutArithmeticOperators0.getSum(156, 36);
        int int12 = sumWithoutArithmeticOperators0.getSum(1987, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(542, 4563);
        int int18 = sumWithoutArithmeticOperators0.getSum(637, 7000);
        int int21 = sumWithoutArithmeticOperators0.getSum(1698, 8255);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 210 + "'", int6 == 210);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 192 + "'", int9 == 192);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1987 + "'", int12 == 1987);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5105 + "'", int15 == 5105);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7637 + "'", int18 == 7637);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9953 + "'", int21 == 9953);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 200);
        int int9 = sumWithoutArithmeticOperators0.getSum(156, 36);
        int int12 = sumWithoutArithmeticOperators0.getSum(1987, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(24941, 8378);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 210 + "'", int6 == 210);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 192 + "'", int9 == 192);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1987 + "'", int12 == 1987);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33319 + "'", int15 == 33319);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(23213, 7920);
        int int33 = sumWithoutArithmeticOperators0.getSum(2867, 2108);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 345 + "'", int18 == 345);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2520 + "'", int21 == 2520);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4260 + "'", int24 == 4260);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 237 + "'", int27 == 237);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 31133 + "'", int30 == 31133);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4975 + "'", int33 == 4975);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(40, 269);
        int int6 = sumWithoutArithmeticOperators0.getSum(152, 465);
        int int9 = sumWithoutArithmeticOperators0.getSum(9307, 15667);
        int int12 = sumWithoutArithmeticOperators0.getSum(19629, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 309 + "'", int3 == 309);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 617 + "'", int6 == 617);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 24974 + "'", int9 == 24974);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19661 + "'", int12 == 19661);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(1473, 942);
        int int21 = sumWithoutArithmeticOperators0.getSum(645, 1394);
        int int24 = sumWithoutArithmeticOperators0.getSum(3235, 5877);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2415 + "'", int18 == 2415);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2039 + "'", int21 == 2039);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9112 + "'", int24 == 9112);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(163, 36);
        int int12 = sumWithoutArithmeticOperators0.getSum(269, 196);
        int int15 = sumWithoutArithmeticOperators0.getSum(19, 217);
        int int18 = sumWithoutArithmeticOperators0.getSum(7795, 7648);
        int int21 = sumWithoutArithmeticOperators0.getSum(13934, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(8603, 988);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 199 + "'", int9 == 199);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 465 + "'", int12 == 465);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 236 + "'", int15 == 236);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15443 + "'", int18 == 15443);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13934 + "'", int21 == 13934);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9591 + "'", int24 == 9591);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(162, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(99, 596);
        int int12 = sumWithoutArithmeticOperators0.getSum(2745, 7185);
        int int15 = sumWithoutArithmeticOperators0.getSum(20035, 8325);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 197 + "'", int6 == 197);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 695 + "'", int9 == 695);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9930 + "'", int12 == 9930);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 28360 + "'", int15 == 28360);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(122, 67);
        int int18 = sumWithoutArithmeticOperators0.getSum(473, 360);
        int int21 = sumWithoutArithmeticOperators0.getSum(10971, 2919);
        int int24 = sumWithoutArithmeticOperators0.getSum(1999, 569);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 189 + "'", int15 == 189);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 833 + "'", int18 == 833);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13890 + "'", int21 == 13890);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2568 + "'", int24 == 2568);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(1105, 3340);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 306 + "'", int30 == 306);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 782 + "'", int33 == 782);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4445 + "'", int36 == 4445);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(1583, 31189);
        int int39 = sumWithoutArithmeticOperators0.getSum(19133, 4476);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32772 + "'", int36 == 32772);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 23609 + "'", int39 == 23609);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) '#', (int) (short) 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(3792, 3266);
        int int21 = sumWithoutArithmeticOperators0.getSum(33079, 25311);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7058 + "'", int18 == 7058);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 58390 + "'", int21 == 58390);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(3707, 12655);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53 + "'", int18 == 53);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 463 + "'", int24 == 463);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1291 + "'", int27 == 1291);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 16362 + "'", int30 == 16362);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(1453, 1547);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 499 + "'", int15 == 499);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8855 + "'", int18 == 8855);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1169 + "'", int21 == 1169);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12064 + "'", int24 == 12064);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1920 + "'", int27 == 1920);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3000 + "'", int30 == 3000);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 15637 + "'", int33 == 15637);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3410 + "'", int36 == 3410);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 16409 + "'", int39 == 16409);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(6074, 7395);
        int int36 = sumWithoutArithmeticOperators0.getSum(10651, 4959);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 13469 + "'", int33 == 13469);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 15610 + "'", int36 == 15610);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(40, 269);
        int int6 = sumWithoutArithmeticOperators0.getSum(152, 465);
        int int9 = sumWithoutArithmeticOperators0.getSum(562, 803);
        int int12 = sumWithoutArithmeticOperators0.getSum(7039, 846);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 309 + "'", int3 == 309);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 617 + "'", int6 == 617);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1365 + "'", int9 == 1365);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7885 + "'", int12 == 7885);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 199);
        int int12 = sumWithoutArithmeticOperators0.getSum(156, 460);
        int int15 = sumWithoutArithmeticOperators0.getSum(1449, 983);
        int int18 = sumWithoutArithmeticOperators0.getSum(294, 486);
        int int21 = sumWithoutArithmeticOperators0.getSum(1602, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(4560, 15083);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 199 + "'", int9 == 199);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 616 + "'", int12 == 616);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2432 + "'", int15 == 2432);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 780 + "'", int18 == 780);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1602 + "'", int21 == 1602);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19643 + "'", int24 == 19643);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(217, 238);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 978);
        int int24 = sumWithoutArithmeticOperators0.getSum(3331, 5025);
        int int27 = sumWithoutArithmeticOperators0.getSum(631, 1362);
        int int30 = sumWithoutArithmeticOperators0.getSum(3619, 22083);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 455 + "'", int18 == 455);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 978 + "'", int21 == 978);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8356 + "'", int24 == 8356);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1993 + "'", int27 == 1993);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 25702 + "'", int30 == 25702);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(3188, 1432);
        int int33 = sumWithoutArithmeticOperators0.getSum(1761, 0);
        int int36 = sumWithoutArithmeticOperators0.getSum(208, 10953);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 455 + "'", int18 == 455);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 156 + "'", int21 == 156);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1967 + "'", int24 == 1967);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6097 + "'", int27 == 6097);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4620 + "'", int30 == 4620);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1761 + "'", int33 == 1761);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 11161 + "'", int36 == 11161);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(13361, 4672);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 18033 + "'", int33 == 18033);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(9183, 1096);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 294 + "'", int9 == 294);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 260 + "'", int12 == 260);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 54 + "'", int15 == 54);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 786 + "'", int18 == 786);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1856 + "'", int21 == 1856);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2841 + "'", int24 == 2841);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1980 + "'", int27 == 1980);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10279 + "'", int30 == 10279);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 18);
        int int9 = sumWithoutArithmeticOperators0.getSum(36, 160);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 108);
        int int15 = sumWithoutArithmeticOperators0.getSum(859, 249);
        int int18 = sumWithoutArithmeticOperators0.getSum(330, 911);
        int int21 = sumWithoutArithmeticOperators0.getSum(2115, 1171);
        int int24 = sumWithoutArithmeticOperators0.getSum(830, 736);
        int int27 = sumWithoutArithmeticOperators0.getSum(5212, 647);
        int int30 = sumWithoutArithmeticOperators0.getSum(3025, 7503);
        int int33 = sumWithoutArithmeticOperators0.getSum(9078, 4721);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 196 + "'", int9 == 196);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1108 + "'", int15 == 1108);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1241 + "'", int18 == 1241);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3286 + "'", int21 == 3286);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1566 + "'", int24 == 1566);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5859 + "'", int27 == 5859);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10528 + "'", int30 == 10528);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 13799 + "'", int33 == 13799);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(11, (int) (short) 0);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int21 = sumWithoutArithmeticOperators0.getSum(727, 460);
        int int24 = sumWithoutArithmeticOperators0.getSum(746, 705);
        int int27 = sumWithoutArithmeticOperators0.getSum(15714, 3492);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1187 + "'", int21 == 1187);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1451 + "'", int24 == 1451);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 19206 + "'", int27 == 19206);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
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
        int int42 = sumWithoutArithmeticOperators0.getSum(490, 6301);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 6791 + "'", int42 == 6791);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(6742, 4270);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 246 + "'", int18 == 246);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1934 + "'", int21 == 1934);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 692 + "'", int24 == 692);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2924 + "'", int27 == 2924);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 11012 + "'", int30 == 11012);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 202);
        int int15 = sumWithoutArithmeticOperators0.getSum(209, 260);
        int int18 = sumWithoutArithmeticOperators0.getSum(186, 504);
        int int21 = sumWithoutArithmeticOperators0.getSum(911, 19479);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 202 + "'", int12 == 202);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 469 + "'", int15 == 469);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 690 + "'", int18 == 690);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20390 + "'", int21 == 20390);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(53, 36);
        int int18 = sumWithoutArithmeticOperators0.getSum(727, 228);
        int int21 = sumWithoutArithmeticOperators0.getSum(416, 5761);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 695);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 955 + "'", int18 == 955);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6177 + "'", int21 == 6177);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 695 + "'", int24 == 695);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 18);
        int int9 = sumWithoutArithmeticOperators0.getSum(36, 160);
        int int12 = sumWithoutArithmeticOperators0.getSum(686, 2696);
        int int15 = sumWithoutArithmeticOperators0.getSum(2810, 5491);
        int int18 = sumWithoutArithmeticOperators0.getSum(835, 16007);
        int int21 = sumWithoutArithmeticOperators0.getSum(2683, 2596);
        int int24 = sumWithoutArithmeticOperators0.getSum(9415, 1859);
        int int27 = sumWithoutArithmeticOperators0.getSum(9548, 250);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 196 + "'", int9 == 196);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3382 + "'", int12 == 3382);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8301 + "'", int15 == 8301);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16842 + "'", int18 == 16842);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5279 + "'", int21 == 5279);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11274 + "'", int24 == 11274);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9798 + "'", int27 == 9798);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) -1);
        int int21 = sumWithoutArithmeticOperators0.getSum(7335, 2626);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9961 + "'", int21 == 9961);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '#', 555);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 122);
        int int18 = sumWithoutArithmeticOperators0.getSum(10, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(407, 1261);
        int int24 = sumWithoutArithmeticOperators0.getSum(786, 612);
        int int27 = sumWithoutArithmeticOperators0.getSum(6814, 3291);
        int int30 = sumWithoutArithmeticOperators0.getSum(4089, 0);
        int int33 = sumWithoutArithmeticOperators0.getSum(33970, 9997);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 590 + "'", int12 == 590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 46 + "'", int18 == 46);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1668 + "'", int21 == 1668);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1398 + "'", int24 == 1398);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10105 + "'", int27 == 10105);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4089 + "'", int30 == 4089);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 43967 + "'", int33 == 43967);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
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
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 210);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, 416);
        int int21 = sumWithoutArithmeticOperators0.getSum(432, 2165);
        int int24 = sumWithoutArithmeticOperators0.getSum(1080, 410);
        int int27 = sumWithoutArithmeticOperators0.getSum(603, 2492);
        int int30 = sumWithoutArithmeticOperators0.getSum(25387, 11737);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 254 + "'", int15 == 254);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 416 + "'", int18 == 416);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2597 + "'", int21 == 2597);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1490 + "'", int24 == 1490);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3095 + "'", int27 == 3095);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 37124 + "'", int30 == 37124);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(859, 321);
        int int18 = sumWithoutArithmeticOperators0.getSum(209, 213);
        int int21 = sumWithoutArithmeticOperators0.getSum(8216, 8824);
        int int24 = sumWithoutArithmeticOperators0.getSum(9792, 19257);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1180 + "'", int15 == 1180);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 422 + "'", int18 == 422);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 17040 + "'", int21 == 17040);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 29049 + "'", int24 == 29049);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
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
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) ' ', 35);
        int int6 = sumWithoutArithmeticOperators0.getSum(98, 180);
        int int9 = sumWithoutArithmeticOperators0.getSum(955, 317);
        int int12 = sumWithoutArithmeticOperators0.getSum(1186, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(612, 7070);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 67 + "'", int3 == 67);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 278 + "'", int6 == 278);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1272 + "'", int9 == 1272);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1186 + "'", int12 == 1186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7682 + "'", int15 == 7682);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(11, (int) (short) 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(1856, 1670);
        int int21 = sumWithoutArithmeticOperators0.getSum(2438, 1527);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3526 + "'", int18 == 3526);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3965 + "'", int21 == 3965);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(18, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 108);
        int int21 = sumWithoutArithmeticOperators0.getSum(683, 141);
        int int24 = sumWithoutArithmeticOperators0.getSum(10833, 692);
        int int27 = sumWithoutArithmeticOperators0.getSum(12054, 29572);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 109 + "'", int18 == 109);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 824 + "'", int21 == 824);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11525 + "'", int24 == 11525);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 41626 + "'", int27 == 41626);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
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
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 321 + "'", int18 == 321);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 469 + "'", int21 == 469);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10077 + "'", int24 == 10077);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7775 + "'", int27 == 7775);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(51, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(238, (int) '4');
        int int18 = sumWithoutArithmeticOperators0.getSum(116, 587);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 290 + "'", int15 == 290);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 703 + "'", int18 == 703);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(33, 163);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (byte) 100);
        int int21 = sumWithoutArithmeticOperators0.getSum(499, (int) (byte) -1);
        int int24 = sumWithoutArithmeticOperators0.getSum(725, (int) (short) 10);
        int int27 = sumWithoutArithmeticOperators0.getSum(10062, 5017);
        int int30 = sumWithoutArithmeticOperators0.getSum(15877, 5864);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 498 + "'", int21 == 498);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 735 + "'", int24 == 735);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15079 + "'", int27 == 15079);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 21741 + "'", int30 == 21741);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(33, 163);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (byte) 100);
        int int21 = sumWithoutArithmeticOperators0.getSum(499, (int) (byte) -1);
        int int24 = sumWithoutArithmeticOperators0.getSum(522, 3095);
        int int27 = sumWithoutArithmeticOperators0.getSum(1442, 5055);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 498 + "'", int21 == 498);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3617 + "'", int24 == 3617);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6497 + "'", int27 == 6497);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(238, 152);
        int int15 = sumWithoutArithmeticOperators0.getSum(245, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(134, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(180, 421);
        int int24 = sumWithoutArithmeticOperators0.getSum(4879, 0);
        int int27 = sumWithoutArithmeticOperators0.getSum(17747, 1285);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 390 + "'", int12 == 390);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 407 + "'", int15 == 407);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 170 + "'", int18 == 170);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 601 + "'", int21 == 601);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4879 + "'", int24 == 4879);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 19032 + "'", int27 == 19032);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(19, 21);
        int int9 = sumWithoutArithmeticOperators0.getSum(53, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(286, 125);
        int int15 = sumWithoutArithmeticOperators0.getSum(295, 325);
        int int18 = sumWithoutArithmeticOperators0.getSum(37875, 5176);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 411 + "'", int12 == 411);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 620 + "'", int15 == 620);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 43051 + "'", int18 == 43051);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
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
        int int30 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 807);
        int int33 = sumWithoutArithmeticOperators0.getSum(0, 1133);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 817 + "'", int30 == 817);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1133 + "'", int33 == 1133);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(101, 21);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 623);
        int int24 = sumWithoutArithmeticOperators0.getSum(4224, 156);
        int int27 = sumWithoutArithmeticOperators0.getSum(0, 6993);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 162 + "'", int18 == 162);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 623 + "'", int21 == 623);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4380 + "'", int24 == 4380);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6993 + "'", int27 == 6993);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(196, (int) ' ');
        int int15 = sumWithoutArithmeticOperators0.getSum(1128, 108);
        int int18 = sumWithoutArithmeticOperators0.getSum(123, 309);
        int int21 = sumWithoutArithmeticOperators0.getSum(31133, 1946);
        int int24 = sumWithoutArithmeticOperators0.getSum(3890, 17082);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 228 + "'", int12 == 228);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1236 + "'", int15 == 1236);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 432 + "'", int18 == 432);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 33079 + "'", int21 == 33079);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20972 + "'", int24 == 20972);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(196, (int) ' ');
        int int15 = sumWithoutArithmeticOperators0.getSum(1128, 108);
        int int18 = sumWithoutArithmeticOperators0.getSum(844, 98);
        int int21 = sumWithoutArithmeticOperators0.getSum(2231, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(4130, 1044);
        int int27 = sumWithoutArithmeticOperators0.getSum(6384, 6271);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 228 + "'", int12 == 228);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1236 + "'", int15 == 1236);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 942 + "'", int18 == 942);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2231 + "'", int21 == 2231);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5174 + "'", int24 == 5174);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 12655 + "'", int27 == 12655);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) ' ', 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) -1);
        int int21 = sumWithoutArithmeticOperators0.getSum(7, (int) (short) 100);
        int int24 = sumWithoutArithmeticOperators0.getSum(786, 125);
        int int27 = sumWithoutArithmeticOperators0.getSum(19404, 8478);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 107 + "'", int21 == 107);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 911 + "'", int24 == 911);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 27882 + "'", int27 == 27882);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(3550, 1829);
        int int18 = sumWithoutArithmeticOperators0.getSum(3733, 2161);
        int int21 = sumWithoutArithmeticOperators0.getSum(23276, 3485);
        int int24 = sumWithoutArithmeticOperators0.getSum(5325, 3942);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5379 + "'", int15 == 5379);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5894 + "'", int18 == 5894);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 26761 + "'", int21 == 26761);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9267 + "'", int24 == 9267);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 18);
        int int18 = sumWithoutArithmeticOperators0.getSum(13150, 5493);
        int int21 = sumWithoutArithmeticOperators0.getSum(5428, 631);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18643 + "'", int18 == 18643);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6059 + "'", int21 == 6059);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(163, 52);
        int int15 = sumWithoutArithmeticOperators0.getSum(107, 210);
        int int18 = sumWithoutArithmeticOperators0.getSum(21, 975);
        int int21 = sumWithoutArithmeticOperators0.getSum(272, 76);
        int int24 = sumWithoutArithmeticOperators0.getSum(5877, 0);
        int int27 = sumWithoutArithmeticOperators0.getSum(15795, 5844);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 215 + "'", int12 == 215);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 317 + "'", int15 == 317);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 996 + "'", int18 == 996);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 348 + "'", int21 == 348);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5877 + "'", int24 == 5877);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 21639 + "'", int27 == 21639);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(6660, 3932);
        int int39 = sumWithoutArithmeticOperators0.getSum(1897, 0);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10592 + "'", int36 == 10592);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1897 + "'", int39 == 1897);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(201, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(1848, 1744);
        int int18 = sumWithoutArithmeticOperators0.getSum(4380, 10062);
        int int21 = sumWithoutArithmeticOperators0.getSum(5202, 214);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 212 + "'", int12 == 212);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3592 + "'", int15 == 3592);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 14442 + "'", int18 == 14442);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5416 + "'", int21 == 5416);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(211, 245);
        int int15 = sumWithoutArithmeticOperators0.getSum(697, 290);
        int int18 = sumWithoutArithmeticOperators0.getSum(5691, 201);
        int int21 = sumWithoutArithmeticOperators0.getSum(1121, 1133);
        int int24 = sumWithoutArithmeticOperators0.getSum(8816, 8019);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 456 + "'", int12 == 456);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 987 + "'", int15 == 987);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5892 + "'", int18 == 5892);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2254 + "'", int21 == 2254);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16835 + "'", int24 == 16835);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum(44, 671);
        int int12 = sumWithoutArithmeticOperators0.getSum(629, 397);
        int int15 = sumWithoutArithmeticOperators0.getSum(24974, 2956);
        int int18 = sumWithoutArithmeticOperators0.getSum(301, 1869);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 715 + "'", int9 == 715);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1026 + "'", int12 == 1026);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 27930 + "'", int15 == 27930);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2170 + "'", int18 == 2170);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 200);
        int int9 = sumWithoutArithmeticOperators0.getSum(156, 36);
        int int12 = sumWithoutArithmeticOperators0.getSum(1987, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(542, 4563);
        int int18 = sumWithoutArithmeticOperators0.getSum(89, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(6410, 1019);
        int int24 = sumWithoutArithmeticOperators0.getSum(36924, 13690);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 210 + "'", int6 == 210);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 192 + "'", int9 == 192);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1987 + "'", int12 == 1987);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5105 + "'", int15 == 5105);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 89 + "'", int18 == 89);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7429 + "'", int21 == 7429);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 50614 + "'", int24 == 50614);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(3196, 2170);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 306 + "'", int30 == 306);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 15637 + "'", int33 == 15637);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5366 + "'", int36 == 5366);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(725, 42);
        int int15 = sumWithoutArithmeticOperators0.getSum(269, 368);
        int int18 = sumWithoutArithmeticOperators0.getSum(2049, 10568);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 767 + "'", int12 == 767);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 637 + "'", int15 == 637);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 12617 + "'", int18 == 12617);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(51, 422);
        int int18 = sumWithoutArithmeticOperators0.getSum(567, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(1980, 2383);
        int int24 = sumWithoutArithmeticOperators0.getSum(7795, 5595);
        int int27 = sumWithoutArithmeticOperators0.getSum(30231, 1283);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 473 + "'", int15 == 473);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 567 + "'", int18 == 567);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4363 + "'", int21 == 4363);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13390 + "'", int24 == 13390);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 31514 + "'", int27 == 31514);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(210, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(317, 110);
        int int24 = sumWithoutArithmeticOperators0.getSum(388, 240);
        int int27 = sumWithoutArithmeticOperators0.getSum(6732, 1278);
        int int30 = sumWithoutArithmeticOperators0.getSum(9036, 1543);
        int int33 = sumWithoutArithmeticOperators0.getSum(2818, 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 246 + "'", int18 == 246);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 427 + "'", int21 == 427);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 628 + "'", int24 == 628);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8010 + "'", int27 == 8010);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10579 + "'", int30 == 10579);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2919 + "'", int33 == 2919);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(955, 89);
        int int18 = sumWithoutArithmeticOperators0.getSum(278, 725);
        int int21 = sumWithoutArithmeticOperators0.getSum(191, 421);
        int int24 = sumWithoutArithmeticOperators0.getSum(3841, 753);
        int int27 = sumWithoutArithmeticOperators0.getSum(2681, 4631);
        int int30 = sumWithoutArithmeticOperators0.getSum(3319, 1050);
        int int33 = sumWithoutArithmeticOperators0.getSum(4133, 24423);
        int int36 = sumWithoutArithmeticOperators0.getSum(13469, 1937);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1044 + "'", int15 == 1044);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1003 + "'", int18 == 1003);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 612 + "'", int21 == 612);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4594 + "'", int24 == 4594);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7312 + "'", int27 == 7312);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4369 + "'", int30 == 4369);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 28556 + "'", int33 == 28556);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 15406 + "'", int36 == 15406);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 486);
        int int12 = sumWithoutArithmeticOperators0.getSum(725, 911);
        int int15 = sumWithoutArithmeticOperators0.getSum(798, 1527);
        int int18 = sumWithoutArithmeticOperators0.getSum(13877, 6915);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 486 + "'", int9 == 486);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1636 + "'", int12 == 1636);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2325 + "'", int15 == 2325);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20792 + "'", int18 == 20792);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(13006, 3529);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 16535 + "'", int36 == 16535);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(6074, 7395);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 13469 + "'", int33 == 13469);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(101, 21);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(868, 253);
        int int24 = sumWithoutArithmeticOperators0.getSum(66, 1416);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 162 + "'", int18 == 162);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1121 + "'", int21 == 1121);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1482 + "'", int24 == 1482);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(162, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(156, 491);
        int int21 = sumWithoutArithmeticOperators0.getSum(5534, 2492);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 647 + "'", int18 == 647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8026 + "'", int21 == 8026);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(40, 269);
        int int6 = sumWithoutArithmeticOperators0.getSum(152, 465);
        int int9 = sumWithoutArithmeticOperators0.getSum(652, 162);
        int int12 = sumWithoutArithmeticOperators0.getSum(2456, 9238);
        int int15 = sumWithoutArithmeticOperators0.getSum(10535, 4089);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 309 + "'", int3 == 309);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 617 + "'", int6 == 617);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 814 + "'", int9 == 814);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11694 + "'", int12 == 11694);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 14624 + "'", int15 == 14624);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(2279, 615);
        int int15 = sumWithoutArithmeticOperators0.getSum(3726, 132);
        int int18 = sumWithoutArithmeticOperators0.getSum(10272, 18515);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2894 + "'", int12 == 2894);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3858 + "'", int15 == 3858);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 28787 + "'", int18 == 28787);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 10);
        int int15 = sumWithoutArithmeticOperators0.getSum(488, 1236);
        int int18 = sumWithoutArithmeticOperators0.getSum(3072, 19235);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1724 + "'", int15 == 1724);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 22307 + "'", int18 == 22307);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 19);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(859, 454);
        int int12 = sumWithoutArithmeticOperators0.getSum(1253, 461);
        int int15 = sumWithoutArithmeticOperators0.getSum(288, 309);
        int int18 = sumWithoutArithmeticOperators0.getSum(582, 271);
        int int21 = sumWithoutArithmeticOperators0.getSum(2727, 40564);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1313 + "'", int9 == 1313);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1714 + "'", int12 == 1714);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 597 + "'", int15 == 597);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853 + "'", int18 == 853);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 43291 + "'", int21 == 43291);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(911, 432);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 34);
        int int15 = sumWithoutArithmeticOperators0.getSum(1241, 1352);
        int int18 = sumWithoutArithmeticOperators0.getSum(13151, 6164);
        int int21 = sumWithoutArithmeticOperators0.getSum(15500, 1932);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1343 + "'", int9 == 1343);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2593 + "'", int15 == 2593);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 19315 + "'", int18 == 19315);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 17432 + "'", int21 == 17432);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 18);
        int int9 = sumWithoutArithmeticOperators0.getSum(2339, 5977);
        int int12 = sumWithoutArithmeticOperators0.getSum(3249, 243);
        int int15 = sumWithoutArithmeticOperators0.getSum(28360, 19591);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8316 + "'", int9 == 8316);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3492 + "'", int12 == 3492);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 47951 + "'", int15 == 47951);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(209, 154);
        int int18 = sumWithoutArithmeticOperators0.getSum(19, 283);
        int int21 = sumWithoutArithmeticOperators0.getSum(596, 1527);
        int int24 = sumWithoutArithmeticOperators0.getSum(289, 0);
        int int27 = sumWithoutArithmeticOperators0.getSum(6836, 3678);
        int int30 = sumWithoutArithmeticOperators0.getSum(11323, 10537);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 363 + "'", int15 == 363);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 302 + "'", int18 == 302);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2123 + "'", int21 == 2123);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 289 + "'", int24 == 289);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10514 + "'", int27 == 10514);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 21860 + "'", int30 == 21860);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(51, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(238, (int) '4');
        int int18 = sumWithoutArithmeticOperators0.getSum(1044, 84);
        int int21 = sumWithoutArithmeticOperators0.getSum(379, 246);
        int int24 = sumWithoutArithmeticOperators0.getSum(816, 7715);
        int int27 = sumWithoutArithmeticOperators0.getSum(1643, 5460);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 290 + "'", int15 == 290);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1128 + "'", int18 == 1128);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 625 + "'", int21 == 625);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8531 + "'", int24 == 8531);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7103 + "'", int27 == 7103);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(41, 1241);
        int int33 = sumWithoutArithmeticOperators0.getSum(4198, 1241);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 107 + "'", int21 == 107);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 911 + "'", int24 == 911);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1846 + "'", int27 == 1846);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1282 + "'", int30 == 1282);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5439 + "'", int33 == 5439);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(110, 53);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 7);
        int int24 = sumWithoutArithmeticOperators0.getSum(269, 455);
        int int27 = sumWithoutArithmeticOperators0.getSum(543, 84);
        int int30 = sumWithoutArithmeticOperators0.getSum(1133, 414);
        int int33 = sumWithoutArithmeticOperators0.getSum(2353, 6114);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 724 + "'", int24 == 724);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 627 + "'", int27 == 627);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1547 + "'", int30 == 1547);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8467 + "'", int33 == 8467);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(163, 36);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 4208);
        int int15 = sumWithoutArithmeticOperators0.getSum(1980, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(20788, 22797);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 199 + "'", int9 == 199);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4208 + "'", int12 == 4208);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1980 + "'", int15 == 1980);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 43585 + "'", int18 == 43585);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(465, 324);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(1222, 11885);
        int int24 = sumWithoutArithmeticOperators0.getSum(199, 3698);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 789 + "'", int15 == 789);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13107 + "'", int21 == 13107);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3897 + "'", int24 == 3897);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(19, 21);
        int int9 = sumWithoutArithmeticOperators0.getSum(53, 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(286, 125);
        int int15 = sumWithoutArithmeticOperators0.getSum(3050, 382);
        int int18 = sumWithoutArithmeticOperators0.getSum(3452, 1254);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 411 + "'", int12 == 411);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3432 + "'", int15 == 3432);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4706 + "'", int18 == 4706);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(40, 269);
        int int6 = sumWithoutArithmeticOperators0.getSum(152, 465);
        int int9 = sumWithoutArithmeticOperators0.getSum(652, 162);
        int int12 = sumWithoutArithmeticOperators0.getSum(2456, 9238);
        int int15 = sumWithoutArithmeticOperators0.getSum(12664, 4221);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 309 + "'", int3 == 309);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 617 + "'", int6 == 617);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 814 + "'", int9 == 814);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11694 + "'", int12 == 11694);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16885 + "'", int15 == 16885);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(5981, 3502);
        int int33 = sumWithoutArithmeticOperators0.getSum(2925, 3124);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9483 + "'", int30 == 9483);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6049 + "'", int33 == 6049);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(321, 56);
        int int9 = sumWithoutArithmeticOperators0.getSum(189, 766);
        int int12 = sumWithoutArithmeticOperators0.getSum(290, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(407, 847);
        int int18 = sumWithoutArithmeticOperators0.getSum(360, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(14415, 1380);
        int int24 = sumWithoutArithmeticOperators0.getSum(24135, 17098);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 377 + "'", int6 == 377);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 955 + "'", int9 == 955);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 311 + "'", int12 == 311);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1254 + "'", int15 == 1254);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15795 + "'", int21 == 15795);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 41233 + "'", int24 == 41233);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
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
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(416, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 1430);
        int int21 = sumWithoutArithmeticOperators0.getSum(7098, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 526 + "'", int15 == 526);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1430 + "'", int18 == 1430);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7098 + "'", int21 == 7098);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(6702, 5853);
        int int36 = sumWithoutArithmeticOperators0.getSum(8853, 1133);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 12555 + "'", int33 == 12555);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 9986 + "'", int36 == 9986);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(107, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(354, 727);
        int int18 = sumWithoutArithmeticOperators0.getSum(15686, 9984);
        int int21 = sumWithoutArithmeticOperators0.getSum(17747, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1081 + "'", int15 == 1081);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 25670 + "'", int18 == 25670);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 17747 + "'", int21 == 17747);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(3550, 1829);
        int int18 = sumWithoutArithmeticOperators0.getSum(3733, 2161);
        int int21 = sumWithoutArithmeticOperators0.getSum(1264, 3331);
        int int24 = sumWithoutArithmeticOperators0.getSum(7460, 3698);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5379 + "'", int15 == 5379);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5894 + "'", int18 == 5894);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4595 + "'", int21 == 4595);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11158 + "'", int24 == 11158);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(122, 67);
        int int18 = sumWithoutArithmeticOperators0.getSum(473, 360);
        int int21 = sumWithoutArithmeticOperators0.getSum(2512, 615);
        int int24 = sumWithoutArithmeticOperators0.getSum(6326, 2300);
        int int27 = sumWithoutArithmeticOperators0.getSum(8626, 1312);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 189 + "'", int15 == 189);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 833 + "'", int18 == 833);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3127 + "'", int21 == 3127);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8626 + "'", int24 == 8626);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9938 + "'", int27 == 9938);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(33, 163);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (byte) 100);
        int int21 = sumWithoutArithmeticOperators0.getSum(499, (int) (byte) -1);
        int int24 = sumWithoutArithmeticOperators0.getSum(160, 293);
        int int27 = sumWithoutArithmeticOperators0.getSum(600, 235);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 498 + "'", int21 == 498);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 453 + "'", int24 == 453);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 835 + "'", int27 == 835);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(306, 180);
        int int9 = sumWithoutArithmeticOperators0.getSum(736, 1241);
        int int12 = sumWithoutArithmeticOperators0.getSum(1379, 2394);
        int int15 = sumWithoutArithmeticOperators0.getSum(13444, 807);
        int int18 = sumWithoutArithmeticOperators0.getSum(3569, 310);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 486 + "'", int6 == 486);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1977 + "'", int9 == 1977);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3773 + "'", int12 == 3773);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 14251 + "'", int15 == 14251);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3879 + "'", int18 == 3879);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(9, 217);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 41);
        int int21 = sumWithoutArithmeticOperators0.getSum(290, 1121);
        int int24 = sumWithoutArithmeticOperators0.getSum(699, 1097);
        int int27 = sumWithoutArithmeticOperators0.getSum(14738, 753);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 226 + "'", int15 == 226);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1411 + "'", int21 == 1411);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1796 + "'", int24 == 1796);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15491 + "'", int27 == 15491);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(52, 104);
        int int18 = sumWithoutArithmeticOperators0.getSum(590, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(1934, 5343);
        int int24 = sumWithoutArithmeticOperators0.getSum(5660, 4037);
        int int27 = sumWithoutArithmeticOperators0.getSum(1074, 3927);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 156 + "'", int15 == 156);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 590 + "'", int18 == 590);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7277 + "'", int21 == 7277);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9697 + "'", int24 == 9697);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5001 + "'", int27 == 5001);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(97, 168);
        int int15 = sumWithoutArithmeticOperators0.getSum(376, 972);
        int int18 = sumWithoutArithmeticOperators0.getSum(1400, 3034);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 265 + "'", int12 == 265);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1348 + "'", int15 == 1348);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4434 + "'", int18 == 4434);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 499);
        int int18 = sumWithoutArithmeticOperators0.getSum(156, 100);
        int int21 = sumWithoutArithmeticOperators0.getSum((int) ' ', 2887);
        int int24 = sumWithoutArithmeticOperators0.getSum(4830, 8614);
        int int27 = sumWithoutArithmeticOperators0.getSum(561, 15667);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 499 + "'", int15 == 499);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 256 + "'", int18 == 256);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2919 + "'", int21 == 2919);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13444 + "'", int24 == 13444);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16228 + "'", int27 == 16228);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(195, 317);
        int int18 = sumWithoutArithmeticOperators0.getSum(76, 499);
        int int21 = sumWithoutArithmeticOperators0.getSum(100, 127);
        int int24 = sumWithoutArithmeticOperators0.getSum(6044, 25048);
        int int27 = sumWithoutArithmeticOperators0.getSum(1106, 14808);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 512 + "'", int15 == 512);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 575 + "'", int18 == 575);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 227 + "'", int21 == 227);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 31092 + "'", int24 == 31092);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15914 + "'", int27 == 15914);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(4488, 2438);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6926 + "'", int30 == 6926);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 165);
        int int12 = sumWithoutArithmeticOperators0.getSum(152, 108);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 55);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, 785);
        int int21 = sumWithoutArithmeticOperators0.getSum(1046, 810);
        int int24 = sumWithoutArithmeticOperators0.getSum(733, 2108);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 294 + "'", int9 == 294);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 260 + "'", int12 == 260);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 54 + "'", int15 == 54);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 786 + "'", int18 == 786);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1856 + "'", int21 == 1856);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2841 + "'", int24 == 2841);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(17, 19);
        int int21 = sumWithoutArithmeticOperators0.getSum(4620, 2767);
        int int24 = sumWithoutArithmeticOperators0.getSum(1738, 8183);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7387 + "'", int21 == 7387);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9921 + "'", int24 == 9921);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(15815, 33915);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 483 + "'", int21 == 483);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 635 + "'", int24 == 635);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9993 + "'", int27 == 9993);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 49730 + "'", int30 == 49730);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(6409, 29572);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 727 + "'", int15 == 727);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1449 + "'", int18 == 1449);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2190 + "'", int21 == 2190);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3192 + "'", int24 == 3192);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 944 + "'", int27 == 944);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35981 + "'", int30 == 35981);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) ' ', 35);
        int int6 = sumWithoutArithmeticOperators0.getSum(1253, 1133);
        int int9 = sumWithoutArithmeticOperators0.getSum(524, 166);
        int int12 = sumWithoutArithmeticOperators0.getSum(824, 4193);
        int int15 = sumWithoutArithmeticOperators0.getSum(5978, 1405);
        int int18 = sumWithoutArithmeticOperators0.getSum(311, 2228);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 67 + "'", int3 == 67);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2386 + "'", int6 == 2386);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 690 + "'", int9 == 690);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5017 + "'", int12 == 5017);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7383 + "'", int15 == 7383);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2539 + "'", int18 == 2539);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(12832, 0);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 12832 + "'", int33 == 12832);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 180);
        int int18 = sumWithoutArithmeticOperators0.getSum(1080, 974);
        int int21 = sumWithoutArithmeticOperators0.getSum(1296, 260);
        int int24 = sumWithoutArithmeticOperators0.getSum(21463, 12533);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 180 + "'", int15 == 180);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2054 + "'", int18 == 2054);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1556 + "'", int21 == 1556);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 33996 + "'", int24 == 33996);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(465, 324);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(269, 301);
        int int24 = sumWithoutArithmeticOperators0.getSum(2716, 694);
        int int27 = sumWithoutArithmeticOperators0.getSum(84, 7396);
        int int30 = sumWithoutArithmeticOperators0.getSum(21798, 7185);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 789 + "'", int15 == 789);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 570 + "'", int21 == 570);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3410 + "'", int24 == 3410);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7480 + "'", int27 == 7480);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 28983 + "'", int30 == 28983);
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(51, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(238, (int) '4');
        int int18 = sumWithoutArithmeticOperators0.getSum(455, (int) (short) 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(5169, 575);
        int int24 = sumWithoutArithmeticOperators0.getSum(7392, 10970);
        int int27 = sumWithoutArithmeticOperators0.getSum(566, 5465);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 290 + "'", int15 == 290);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 455 + "'", int18 == 455);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5744 + "'", int21 == 5744);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 18362 + "'", int24 == 18362);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6031 + "'", int27 == 6031);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(2817, 6945);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 9762 + "'", int36 == 9762);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(955, 89);
        int int18 = sumWithoutArithmeticOperators0.getSum(278, 725);
        int int21 = sumWithoutArithmeticOperators0.getSum(181, 674);
        int int24 = sumWithoutArithmeticOperators0.getSum(567, 959);
        int int27 = sumWithoutArithmeticOperators0.getSum(7616, 14438);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1044 + "'", int15 == 1044);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1003 + "'", int18 == 1003);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 855 + "'", int21 == 855);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1526 + "'", int24 == 1526);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 22054 + "'", int27 == 22054);
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(6866, 9524);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 16390 + "'", int30 == 16390);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(107, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, 1106);
        int int18 = sumWithoutArithmeticOperators0.getSum(615, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(7164, 1275);
        int int24 = sumWithoutArithmeticOperators0.getSum(6271, 13354);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1206 + "'", int15 == 1206);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 615 + "'", int18 == 615);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8439 + "'", int21 == 8439);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19625 + "'", int24 == 19625);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(2982, 3483);
        int int33 = sumWithoutArithmeticOperators0.getSum(4208, 4395);
        int int36 = sumWithoutArithmeticOperators0.getSum(2039, 17357);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 345 + "'", int18 == 345);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2520 + "'", int21 == 2520);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1364 + "'", int24 == 1364);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9117 + "'", int27 == 9117);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6465 + "'", int30 == 6465);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8603 + "'", int33 == 8603);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 19396 + "'", int36 == 19396);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
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
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(122, 67);
        int int18 = sumWithoutArithmeticOperators0.getSum(789, 51);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 9017);
        int int24 = sumWithoutArithmeticOperators0.getSum(195, 7603);
        int int27 = sumWithoutArithmeticOperators0.getSum(19413, 12054);
        int int30 = sumWithoutArithmeticOperators0.getSum(4061, 16091);
        int int33 = sumWithoutArithmeticOperators0.getSum(7164, 3965);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 189 + "'", int15 == 189);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 840 + "'", int18 == 840);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9017 + "'", int21 == 9017);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7798 + "'", int24 == 7798);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 31467 + "'", int27 == 31467);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 20152 + "'", int30 == 20152);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 11129 + "'", int33 == 11129);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(18, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 108);
        int int21 = sumWithoutArithmeticOperators0.getSum(17, 266);
        int int24 = sumWithoutArithmeticOperators0.getSum(370, 245);
        int int27 = sumWithoutArithmeticOperators0.getSum(36539, 14200);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 109 + "'", int18 == 109);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 283 + "'", int21 == 283);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 615 + "'", int24 == 615);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 50739 + "'", int27 == 50739);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(101, 21);
        int int18 = sumWithoutArithmeticOperators0.getSum(89, 180);
        int int21 = sumWithoutArithmeticOperators0.getSum(199, (int) '4');
        int int24 = sumWithoutArithmeticOperators0.getSum(2713, 382);
        int int27 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 498);
        int int30 = sumWithoutArithmeticOperators0.getSum(3102, 9646);
        java.lang.Class<?> wildcardClass31 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 269 + "'", int18 == 269);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 251 + "'", int21 == 251);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3095 + "'", int24 == 3095);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 508 + "'", int27 == 508);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 12748 + "'", int30 == 12748);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 210);
        int int18 = sumWithoutArithmeticOperators0.getSum(199, (int) (byte) 10);
        int int21 = sumWithoutArithmeticOperators0.getSum(9337, 8766);
        int int24 = sumWithoutArithmeticOperators0.getSum(12125, 7039);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 254 + "'", int15 == 254);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 209 + "'", int18 == 209);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18103 + "'", int21 == 18103);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19164 + "'", int24 == 19164);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(122, 67);
        int int18 = sumWithoutArithmeticOperators0.getSum(6177, 2941);
        int int21 = sumWithoutArithmeticOperators0.getSum(1922, 51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 189 + "'", int15 == 189);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9118 + "'", int18 == 9118);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1973 + "'", int21 == 1973);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(163, 52);
        int int15 = sumWithoutArithmeticOperators0.getSum(2933, 2748);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 215 + "'", int12 == 215);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5681 + "'", int15 == 5681);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(201, 1252);
        int int21 = sumWithoutArithmeticOperators0.getSum(189, 3537);
        int int24 = sumWithoutArithmeticOperators0.getSum(7517, 8793);
        int int27 = sumWithoutArithmeticOperators0.getSum(466, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 63 + "'", int12 == 63);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1453 + "'", int18 == 1453);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3726 + "'", int21 == 3726);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16310 + "'", int24 == 16310);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 466 + "'", int27 == 466);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
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
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(34, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum(1305, 1222);
        int int12 = sumWithoutArithmeticOperators0.getSum(4771, 798);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2527 + "'", int9 == 2527);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5569 + "'", int12 == 5569);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 199);
        int int12 = sumWithoutArithmeticOperators0.getSum(324, 614);
        int int15 = sumWithoutArithmeticOperators0.getSum(1238, 1072);
        int int18 = sumWithoutArithmeticOperators0.getSum(1840, 2119);
        int int21 = sumWithoutArithmeticOperators0.getSum(31514, 8626);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 199 + "'", int9 == 199);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 938 + "'", int12 == 938);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2310 + "'", int15 == 2310);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3959 + "'", int18 == 3959);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 40140 + "'", int21 == 40140);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(19, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(51, 109);
        int int21 = sumWithoutArithmeticOperators0.getSum(11, 40);
        int int24 = sumWithoutArithmeticOperators0.getSum(2805, 2443);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 129 + "'", int15 == 129);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 160 + "'", int18 == 160);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 51 + "'", int21 == 51);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5248 + "'", int24 == 5248);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(51, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(375, 352);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 165);
        int int21 = sumWithoutArithmeticOperators0.getSum(109, 52);
        int int24 = sumWithoutArithmeticOperators0.getSum(3382, 1);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 727 + "'", int15 == 727);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 165 + "'", int18 == 165);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 161 + "'", int21 == 161);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3383 + "'", int24 == 3383);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 210);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, 416);
        int int21 = sumWithoutArithmeticOperators0.getSum(432, 2165);
        int int24 = sumWithoutArithmeticOperators0.getSum(1080, 410);
        int int27 = sumWithoutArithmeticOperators0.getSum(4260, 1313);
        int int30 = sumWithoutArithmeticOperators0.getSum(7687, 22604);
        int int33 = sumWithoutArithmeticOperators0.getSum(2987, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 254 + "'", int15 == 254);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 416 + "'", int18 == 416);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2597 + "'", int21 == 2597);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1490 + "'", int24 == 1490);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5573 + "'", int27 == 5573);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 30291 + "'", int30 == 30291);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2987 + "'", int33 == 2987);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) '#', (int) (short) 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(52, (int) (short) 1);
        int int21 = sumWithoutArithmeticOperators0.getSum(1067, 512);
        int int24 = sumWithoutArithmeticOperators0.getSum(2251, 491);
        int int27 = sumWithoutArithmeticOperators0.getSum(32772, 18103);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53 + "'", int18 == 53);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1579 + "'", int21 == 1579);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2742 + "'", int24 == 2742);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 50875 + "'", int27 == 50875);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(18, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 108);
        int int21 = sumWithoutArithmeticOperators0.getSum(825, 1491);
        int int24 = sumWithoutArithmeticOperators0.getSum(7873, 4539);
        int int27 = sumWithoutArithmeticOperators0.getSum(8804, 26761);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 109 + "'", int18 == 109);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2316 + "'", int21 == 2316);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12412 + "'", int24 == 12412);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35565 + "'", int27 == 35565);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 34);
        int int18 = sumWithoutArithmeticOperators0.getSum(254, 269);
        int int21 = sumWithoutArithmeticOperators0.getSum(942, 33);
        int int24 = sumWithoutArithmeticOperators0.getSum(998, 0);
        int int27 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 15392);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 523 + "'", int18 == 523);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 975 + "'", int21 == 975);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 998 + "'", int24 == 998);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15402 + "'", int27 == 15402);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(9024, 4817);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 132 + "'", int18 == 132);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 271 + "'", int21 == 271);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7272 + "'", int24 == 7272);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6157 + "'", int27 == 6157);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 13841 + "'", int30 == 13841);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(217, 238);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 978);
        int int24 = sumWithoutArithmeticOperators0.getSum(7962, 1514);
        int int27 = sumWithoutArithmeticOperators0.getSum(8985, 14677);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 455 + "'", int18 == 455);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 978 + "'", int21 == 978);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9476 + "'", int24 == 9476);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 23662 + "'", int27 == 23662);
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(110, 53);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 7);
        int int24 = sumWithoutArithmeticOperators0.getSum(269, 455);
        int int27 = sumWithoutArithmeticOperators0.getSum(590, 240);
        int int30 = sumWithoutArithmeticOperators0.getSum(12220, 4251);
        int int33 = sumWithoutArithmeticOperators0.getSum(11530, 20708);
        int int36 = sumWithoutArithmeticOperators0.getSum(2889, 1904);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 724 + "'", int24 == 724);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 830 + "'", int27 == 830);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 16471 + "'", int30 == 16471);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32238 + "'", int33 == 32238);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4793 + "'", int36 == 4793);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(955, 89);
        int int18 = sumWithoutArithmeticOperators0.getSum(278, 725);
        int int21 = sumWithoutArithmeticOperators0.getSum(191, 421);
        int int24 = sumWithoutArithmeticOperators0.getSum(351, 2049);
        int int27 = sumWithoutArithmeticOperators0.getSum(1455, 345);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1044 + "'", int15 == 1044);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1003 + "'", int18 == 1003);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 612 + "'", int21 == 612);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2400 + "'", int24 == 2400);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1800 + "'", int27 == 1800);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(15803, 1661);
        int int33 = sumWithoutArithmeticOperators0.getSum(746, 23389);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 156 + "'", int15 == 156);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 590 + "'", int18 == 590);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1042 + "'", int21 == 1042);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3687 + "'", int24 == 3687);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2575 + "'", int27 == 2575);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 17464 + "'", int30 == 17464);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 24135 + "'", int33 == 24135);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(40, 269);
        int int6 = sumWithoutArithmeticOperators0.getSum(202, 523);
        int int9 = sumWithoutArithmeticOperators0.getSum(362, 1680);
        int int12 = sumWithoutArithmeticOperators0.getSum(5566, 1427);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 309 + "'", int3 == 309);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 725 + "'", int6 == 725);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2042 + "'", int9 == 2042);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6993 + "'", int12 == 6993);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(52, 104);
        int int18 = sumWithoutArithmeticOperators0.getSum(590, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(1934, 5343);
        int int24 = sumWithoutArithmeticOperators0.getSum(5660, 4037);
        int int27 = sumWithoutArithmeticOperators0.getSum(9299, 0);
        int int30 = sumWithoutArithmeticOperators0.getSum(2867, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 156 + "'", int15 == 156);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 590 + "'", int18 == 590);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7277 + "'", int21 == 7277);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9697 + "'", int24 == 9697);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9299 + "'", int27 == 9299);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2867 + "'", int30 == 2867);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(3383, 1451);
        int int36 = sumWithoutArithmeticOperators0.getSum(7490, 3309);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4834 + "'", int33 == 4834);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10799 + "'", int36 == 10799);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(110, 53);
        int int21 = sumWithoutArithmeticOperators0.getSum(162, 40);
        int int24 = sumWithoutArithmeticOperators0.getSum(2368, 798);
        int int27 = sumWithoutArithmeticOperators0.getSum(944, 3946);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 202 + "'", int21 == 202);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3166 + "'", int24 == 3166);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4890 + "'", int27 == 4890);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum(2924, 7267);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 127 + "'", int12 == 127);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10191 + "'", int15 == 10191);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 202);
        int int15 = sumWithoutArithmeticOperators0.getSum(209, 260);
        int int18 = sumWithoutArithmeticOperators0.getSum(186, 504);
        int int21 = sumWithoutArithmeticOperators0.getSum(1451, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(235, 6474);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 202 + "'", int12 == 202);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 469 + "'", int15 == 469);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 690 + "'", int18 == 690);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1451 + "'", int21 == 1451);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6709 + "'", int24 == 6709);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 100);
        int int12 = sumWithoutArithmeticOperators0.getSum(251, 210);
        int int15 = sumWithoutArithmeticOperators0.getSum(246, 9);
        int int18 = sumWithoutArithmeticOperators0.getSum(3340, 12374);
        int int21 = sumWithoutArithmeticOperators0.getSum(4656, 13166);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 461 + "'", int12 == 461);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 255 + "'", int15 == 255);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15714 + "'", int18 == 15714);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 17822 + "'", int21 == 17822);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(1953, 10);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 5084);
        int int18 = sumWithoutArithmeticOperators0.getSum(2727, 48629);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1963 + "'", int12 == 1963);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5084 + "'", int15 == 5084);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51356 + "'", int18 == 51356);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum(390, 109);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 56);
        int int18 = sumWithoutArithmeticOperators0.getSum(34, 209);
        int int21 = sumWithoutArithmeticOperators0.getSum(149, 2386);
        int int24 = sumWithoutArithmeticOperators0.getSum(10886, 316);
        int int27 = sumWithoutArithmeticOperators0.getSum(1038, 1285);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 499 + "'", int12 == 499);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 55 + "'", int15 == 55);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 243 + "'", int18 == 243);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2535 + "'", int21 == 2535);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11202 + "'", int24 == 11202);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2323 + "'", int27 == 2323);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 486);
        int int12 = sumWithoutArithmeticOperators0.getSum(1427, 8120);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 486 + "'", int9 == 486);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9547 + "'", int12 == 9547);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(1503, 322);
        int int36 = sumWithoutArithmeticOperators0.getSum(35565, 27766);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1825 + "'", int33 == 1825);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 63331 + "'", int36 == 63331);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(911, 432);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 34);
        int int15 = sumWithoutArithmeticOperators0.getSum(1241, 1352);
        int int18 = sumWithoutArithmeticOperators0.getSum(3451, 211);
        int int21 = sumWithoutArithmeticOperators0.getSum(10458, 17404);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1343 + "'", int9 == 1343);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2593 + "'", int15 == 2593);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3662 + "'", int18 == 3662);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27862 + "'", int21 == 27862);
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(19, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(51, 109);
        int int21 = sumWithoutArithmeticOperators0.getSum(256, 727);
        int int24 = sumWithoutArithmeticOperators0.getSum(11161, 1005);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 129 + "'", int15 == 129);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 160 + "'", int18 == 160);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 983 + "'", int21 == 983);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12166 + "'", int24 == 12166);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(0, 199);
        int int12 = sumWithoutArithmeticOperators0.getSum(324, 614);
        int int15 = sumWithoutArithmeticOperators0.getSum(533, (int) (short) 10);
        int int18 = sumWithoutArithmeticOperators0.getSum(1748, 1807);
        int int21 = sumWithoutArithmeticOperators0.getSum(432, 1252);
        int int24 = sumWithoutArithmeticOperators0.getSum(5744, 16599);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 199 + "'", int9 == 199);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 938 + "'", int12 == 938);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 543 + "'", int15 == 543);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3555 + "'", int18 == 3555);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1684 + "'", int21 == 1684);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 22343 + "'", int24 == 22343);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(162, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(100, 32);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 84);
        int int24 = sumWithoutArithmeticOperators0.getSum(1044, 8010);
        int int27 = sumWithoutArithmeticOperators0.getSum(6384, 11695);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 132 + "'", int18 == 132);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 84 + "'", int21 == 84);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9054 + "'", int24 == 9054);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 18079 + "'", int27 == 18079);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(17, 200);
        int int6 = sumWithoutArithmeticOperators0.getSum(853, 427);
        int int9 = sumWithoutArithmeticOperators0.getSum(1171, 254);
        int int12 = sumWithoutArithmeticOperators0.getSum(4986, 11645);
        int int15 = sumWithoutArithmeticOperators0.getSum(6858, 143);
        java.lang.Class<?> wildcardClass16 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 217 + "'", int3 == 217);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1280 + "'", int6 == 1280);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1425 + "'", int9 == 1425);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16631 + "'", int12 == 16631);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7001 + "'", int15 == 7001);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(51, 53);
        int int15 = sumWithoutArithmeticOperators0.getSum(6477, 6930);
        int int18 = sumWithoutArithmeticOperators0.getSum(1278, 1114);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 13407 + "'", int15 == 13407);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2392 + "'", int18 == 2392);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(955, 89);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 55);
        int int21 = sumWithoutArithmeticOperators0.getSum(479, 786);
        int int24 = sumWithoutArithmeticOperators0.getSum(16667, 14620);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1044 + "'", int15 == 1044);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 56 + "'", int18 == 56);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1265 + "'", int21 == 1265);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 31287 + "'", int24 == 31287);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(163, 52);
        int int15 = sumWithoutArithmeticOperators0.getSum(210, 165);
        int int18 = sumWithoutArithmeticOperators0.getSum(149, 67);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 570);
        int int24 = sumWithoutArithmeticOperators0.getSum(19629, 19479);
        int int27 = sumWithoutArithmeticOperators0.getSum(22750, 8521);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 215 + "'", int12 == 215);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 375 + "'", int15 == 375);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 216 + "'", int18 == 216);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 570 + "'", int21 == 570);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 39108 + "'", int24 == 39108);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 31271 + "'", int27 == 31271);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 34);
        int int18 = sumWithoutArithmeticOperators0.getSum(354, 453);
        int int21 = sumWithoutArithmeticOperators0.getSum(170, 352);
        int int24 = sumWithoutArithmeticOperators0.getSum(1686, 2368);
        int int27 = sumWithoutArithmeticOperators0.getSum(16269, 1589);
        int int30 = sumWithoutArithmeticOperators0.getSum(0, 50072);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 807 + "'", int18 == 807);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 522 + "'", int21 == 522);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4054 + "'", int24 == 4054);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 17858 + "'", int27 == 17858);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 50072 + "'", int30 == 50072);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, (int) (short) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(635, 151);
        int int18 = sumWithoutArithmeticOperators0.getSum(1336, 2117);
        int int21 = sumWithoutArithmeticOperators0.getSum(5978, 4113);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 786 + "'", int15 == 786);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3453 + "'", int18 == 3453);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10091 + "'", int21 == 10091);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(52, 89);
        int int9 = sumWithoutArithmeticOperators0.getSum(499, 208);
        int int12 = sumWithoutArithmeticOperators0.getSum(1963, 1336);
        int int15 = sumWithoutArithmeticOperators0.getSum(1843, 4260);
        int int18 = sumWithoutArithmeticOperators0.getSum(40266, 8277);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 141 + "'", int6 == 141);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 707 + "'", int9 == 707);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3299 + "'", int12 == 3299);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6103 + "'", int15 == 6103);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48543 + "'", int18 == 48543);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(33, 163);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (byte) 100);
        int int21 = sumWithoutArithmeticOperators0.getSum(2363, 51);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2414 + "'", int21 == 2414);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
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
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 226 + "'", int15 == 226);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1700 + "'", int18 == 1700);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 431 + "'", int21 == 431);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1185 + "'", int24 == 1185);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 21674 + "'", int27 == 21674);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(238, 152);
        int int15 = sumWithoutArithmeticOperators0.getSum(254, 98);
        int int18 = sumWithoutArithmeticOperators0.getSum(2008, 7480);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 390 + "'", int12 == 390);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 352 + "'", int15 == 352);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9488 + "'", int18 == 9488);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(0, 4619);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4619 + "'", int33 == 4619);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(100, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(2165, 1724);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 445);
        int int24 = sumWithoutArithmeticOperators0.getSum(1291, 5744);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3889 + "'", int18 == 3889);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 445 + "'", int21 == 445);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7035 + "'", int24 == 7035);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
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
        int int39 = sumWithoutArithmeticOperators0.getSum(5061, 1842);
        int int42 = sumWithoutArithmeticOperators0.getSum(29609, 3176);
        int int45 = sumWithoutArithmeticOperators0.getSum(6815, 12578);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 6903 + "'", int39 == 6903);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 32785 + "'", int42 == 32785);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 19393 + "'", int45 == 19393);
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) ' ', 35);
        int int6 = sumWithoutArithmeticOperators0.getSum(98, 180);
        int int9 = sumWithoutArithmeticOperators0.getSum(3025, 1245);
        int int12 = sumWithoutArithmeticOperators0.getSum(3412, 246);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 67 + "'", int3 == 67);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 278 + "'", int6 == 278);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4270 + "'", int9 == 4270);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3658 + "'", int12 == 3658);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(163, 52);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 200);
        int int18 = sumWithoutArithmeticOperators0.getSum(325, 617);
        int int21 = sumWithoutArithmeticOperators0.getSum(1511, 1128);
        int int24 = sumWithoutArithmeticOperators0.getSum(1062, 2464);
        int int27 = sumWithoutArithmeticOperators0.getSum(5889, 463);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 215 + "'", int12 == 215);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 942 + "'", int18 == 942);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2639 + "'", int21 == 2639);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3526 + "'", int24 == 3526);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6352 + "'", int27 == 6352);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
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
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(196, (int) ' ');
        int int15 = sumWithoutArithmeticOperators0.getSum(266, 853);
        int int18 = sumWithoutArithmeticOperators0.getSum(46, 101);
        int int21 = sumWithoutArithmeticOperators0.getSum(22032, 471);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 228 + "'", int12 == 228);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1119 + "'", int15 == 1119);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 147 + "'", int18 == 147);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 22503 + "'", int21 == 22503);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
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
        int int30 = sumWithoutArithmeticOperators0.getSum((int) 'a', 8);
        int int33 = sumWithoutArithmeticOperators0.getSum(13923, 0);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 105 + "'", int30 == 105);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 13923 + "'", int33 == 13923);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(162, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(623, 483);
        int int21 = sumWithoutArithmeticOperators0.getSum(9559, 2155);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 147);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1106 + "'", int18 == 1106);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11714 + "'", int21 == 11714);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 147 + "'", int24 == 147);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(210, 1);
        int int15 = sumWithoutArithmeticOperators0.getSum(226, 17);
        int int18 = sumWithoutArithmeticOperators0.getSum(650, 5595);
        int int21 = sumWithoutArithmeticOperators0.getSum(9337, 2251);
        int int24 = sumWithoutArithmeticOperators0.getSum(6926, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 211 + "'", int12 == 211);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 243 + "'", int15 == 243);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6245 + "'", int18 == 6245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11588 + "'", int21 == 11588);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6926 + "'", int24 == 6926);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(162, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(100, 32);
        int int21 = sumWithoutArithmeticOperators0.getSum(260, 11);
        int int24 = sumWithoutArithmeticOperators0.getSum(3889, 3383);
        int int27 = sumWithoutArithmeticOperators0.getSum(2601, 9017);
        int int30 = sumWithoutArithmeticOperators0.getSum(11347, 11892);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 132 + "'", int18 == 132);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 271 + "'", int21 == 271);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7272 + "'", int24 == 7272);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 11618 + "'", int27 == 11618);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 23239 + "'", int30 == 23239);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(163, 17);
        int int18 = sumWithoutArithmeticOperators0.getSum(284, 271);
        int int21 = sumWithoutArithmeticOperators0.getSum(1241, 1106);
        int int24 = sumWithoutArithmeticOperators0.getSum(195, 40);
        int int27 = sumWithoutArithmeticOperators0.getSum(8890, 6869);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 180 + "'", int15 == 180);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 555 + "'", int18 == 555);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2347 + "'", int21 == 2347);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 235 + "'", int24 == 235);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15759 + "'", int27 == 15759);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum(1245, 708);
        int int15 = sumWithoutArithmeticOperators0.getSum(3400, 278);
        int int18 = sumWithoutArithmeticOperators0.getSum(1096, 3672);
        int int21 = sumWithoutArithmeticOperators0.getSum(16310, 15730);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1953 + "'", int12 == 1953);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3678 + "'", int15 == 3678);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4768 + "'", int18 == 4768);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32040 + "'", int21 == 32040);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(162, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(156, 491);
        int int21 = sumWithoutArithmeticOperators0.getSum(41, 1128);
        int int24 = sumWithoutArithmeticOperators0.getSum(1297, 34);
        int int27 = sumWithoutArithmeticOperators0.getSum((int) (byte) 0, 1044);
        int int30 = sumWithoutArithmeticOperators0.getSum(1843, 2626);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 647 + "'", int18 == 647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1169 + "'", int21 == 1169);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1331 + "'", int24 == 1331);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1044 + "'", int27 == 1044);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4469 + "'", int30 == 4469);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(3261, 200);
        int int21 = sumWithoutArithmeticOperators0.getSum(22382, 5107);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3461 + "'", int18 == 3461);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27489 + "'", int21 == 27489);
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) ' ', 35);
        int int6 = sumWithoutArithmeticOperators0.getSum(98, 180);
        int int9 = sumWithoutArithmeticOperators0.getSum(3025, 1245);
        int int12 = sumWithoutArithmeticOperators0.getSum(3412, 246);
        int int15 = sumWithoutArithmeticOperators0.getSum(6474, 3236);
        int int18 = sumWithoutArithmeticOperators0.getSum(490, 2653);
        java.lang.Class<?> wildcardClass19 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 67 + "'", int3 == 67);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 278 + "'", int6 == 278);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4270 + "'", int9 == 4270);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3658 + "'", int12 == 3658);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9710 + "'", int15 == 9710);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3143 + "'", int18 == 3143);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(289, 269);
        int int15 = sumWithoutArithmeticOperators0.getSum(766, 978);
        int int18 = sumWithoutArithmeticOperators0.getSum(2308, 4076);
        int int21 = sumWithoutArithmeticOperators0.getSum(2073, 2948);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 558 + "'", int12 == 558);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1744 + "'", int15 == 1744);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6384 + "'", int18 == 6384);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5021 + "'", int21 == 5021);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(911, 432);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 34);
        int int15 = sumWithoutArithmeticOperators0.getSum(1241, 1352);
        int int18 = sumWithoutArithmeticOperators0.getSum(13151, 6164);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 5055);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1343 + "'", int9 == 1343);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2593 + "'", int15 == 2593);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 19315 + "'", int18 == 19315);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5055 + "'", int21 == 5055);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(163, 52);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 200);
        int int18 = sumWithoutArithmeticOperators0.getSum(325, 617);
        int int21 = sumWithoutArithmeticOperators0.getSum(19055, 1653);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 215 + "'", int12 == 215);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 942 + "'", int18 == 942);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20708 + "'", int21 == 20708);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 165);
        int int12 = sumWithoutArithmeticOperators0.getSum(152, 108);
        int int15 = sumWithoutArithmeticOperators0.getSum(117, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(1428, 4263);
        int int21 = sumWithoutArithmeticOperators0.getSum(8829, 1432);
        int int24 = sumWithoutArithmeticOperators0.getSum(1206, 830);
        int int27 = sumWithoutArithmeticOperators0.getSum(34707, 4620);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 294 + "'", int9 == 294);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 260 + "'", int12 == 260);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 117 + "'", int15 == 117);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5691 + "'", int18 == 5691);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10261 + "'", int21 == 10261);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2036 + "'", int24 == 2036);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 39327 + "'", int27 == 39327);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
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
        int int39 = sumWithoutArithmeticOperators0.getSum(23643, 6600);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 30243 + "'", int39 == 30243);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(2566, 8838);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 196 + "'", int9 == 196);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1108 + "'", int15 == 1108);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1028 + "'", int18 == 1028);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1824 + "'", int21 == 1824);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9450 + "'", int24 == 9450);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3299 + "'", int27 == 3299);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 11404 + "'", int30 == 11404);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(18, (int) (byte) -1);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 180);
        int int18 = sumWithoutArithmeticOperators0.getSum(12881, 3976);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 180 + "'", int15 == 180);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16857 + "'", int18 == 16857);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 35);
        int int18 = sumWithoutArithmeticOperators0.getSum(210, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(352, (int) (byte) 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(8969, 1776);
        int int27 = sumWithoutArithmeticOperators0.getSum(4213, 1007);
        int int30 = sumWithoutArithmeticOperators0.getSum(783, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 246 + "'", int18 == 246);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 352 + "'", int21 == 352);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10745 + "'", int24 == 10745);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5220 + "'", int27 == 5220);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 784 + "'", int30 == 784);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(163, 52);
        int int15 = sumWithoutArithmeticOperators0.getSum(107, 210);
        int int18 = sumWithoutArithmeticOperators0.getSum(99, 149);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 1430);
        int int24 = sumWithoutArithmeticOperators0.getSum(7460, 469);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 215 + "'", int12 == 215);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 317 + "'", int15 == 317);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 248 + "'", int18 == 248);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1430 + "'", int21 == 1430);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7929 + "'", int24 == 7929);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(129, 109);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '#', 555);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 122);
        int int18 = sumWithoutArithmeticOperators0.getSum(10, 36);
        int int21 = sumWithoutArithmeticOperators0.getSum(407, 1261);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 11794);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 238 + "'", int9 == 238);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 590 + "'", int12 == 590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 46 + "'", int18 == 46);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1668 + "'", int21 == 1668);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11794 + "'", int24 == 11794);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(161, 84);
        int int21 = sumWithoutArithmeticOperators0.getSum(767, 243);
        int int24 = sumWithoutArithmeticOperators0.getSum(1337, 3382);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1010 + "'", int21 == 1010);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4719 + "'", int24 == 4719);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(209, 154);
        int int18 = sumWithoutArithmeticOperators0.getSum(19, 283);
        int int21 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 453);
        int int24 = sumWithoutArithmeticOperators0.getSum(696, 0);
        int int27 = sumWithoutArithmeticOperators0.getSum(4434, 306);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 363 + "'", int15 == 363);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 302 + "'", int18 == 302);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 452 + "'", int21 == 452);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 696 + "'", int24 == 696);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4740 + "'", int27 == 4740);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(161, 84);
        int int21 = sumWithoutArithmeticOperators0.getSum(767, 243);
        int int24 = sumWithoutArithmeticOperators0.getSum(180, (int) (byte) 1);
        int int27 = sumWithoutArithmeticOperators0.getSum(1281, 1937);
        int int30 = sumWithoutArithmeticOperators0.getSum(2070, 6945);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 245 + "'", int18 == 245);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1010 + "'", int21 == 1010);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 181 + "'", int24 == 181);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3218 + "'", int27 == 3218);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9015 + "'", int30 == 9015);
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (short) 100, 34);
        int int12 = sumWithoutArithmeticOperators0.getSum(144, 21);
        int int15 = sumWithoutArithmeticOperators0.getSum(52, 104);
        int int18 = sumWithoutArithmeticOperators0.getSum(590, 0);
        int int21 = sumWithoutArithmeticOperators0.getSum(3517, 868);
        int int24 = sumWithoutArithmeticOperators0.getSum(293, 13390);
        int int27 = sumWithoutArithmeticOperators0.getSum(6167, 4401);
        int int30 = sumWithoutArithmeticOperators0.getSum(9968, 2914);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 134 + "'", int9 == 134);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 156 + "'", int15 == 156);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 590 + "'", int18 == 590);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4385 + "'", int21 == 4385);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13683 + "'", int24 == 13683);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10568 + "'", int27 == 10568);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 12882 + "'", int30 == 12882);
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(110, 53);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 7);
        int int24 = sumWithoutArithmeticOperators0.getSum(269, 455);
        int int27 = sumWithoutArithmeticOperators0.getSum(543, 84);
        int int30 = sumWithoutArithmeticOperators0.getSum(1133, 414);
        int int33 = sumWithoutArithmeticOperators0.getSum(2308, 2894);
        int int36 = sumWithoutArithmeticOperators0.getSum(926, 1846);
        java.lang.Class<?> wildcardClass37 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 724 + "'", int24 == 724);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 627 + "'", int27 == 627);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1547 + "'", int30 == 1547);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5202 + "'", int33 == 5202);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2772 + "'", int36 == 2772);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(9, (int) '#');
        int int12 = sumWithoutArithmeticOperators0.getSum(163, 52);
        int int15 = sumWithoutArithmeticOperators0.getSum(0, 200);
        int int18 = sumWithoutArithmeticOperators0.getSum(885, 876);
        int int21 = sumWithoutArithmeticOperators0.getSum(0, 16471);
        int int24 = sumWithoutArithmeticOperators0.getSum(16885, 13285);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 152 + "'", int6 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 215 + "'", int12 == 215);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1761 + "'", int18 == 1761);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16471 + "'", int21 == 16471);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 30170 + "'", int24 == 30170);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
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
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(100, 0);
        int int18 = sumWithoutArithmeticOperators0.getSum(722, 789);
        int int21 = sumWithoutArithmeticOperators0.getSum(567, 1171);
        int int24 = sumWithoutArithmeticOperators0.getSum(888, 1511);
        int int27 = sumWithoutArithmeticOperators0.getSum((int) ' ', 14010);
        int int30 = sumWithoutArithmeticOperators0.getSum(1364, 2914);
        int int33 = sumWithoutArithmeticOperators0.getSum(9931, 1743);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1511 + "'", int18 == 1511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1738 + "'", int21 == 1738);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2399 + "'", int24 == 2399);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 14042 + "'", int27 == 14042);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4278 + "'", int30 == 4278);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 11674 + "'", int33 == 11674);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) '#', (int) (short) 1);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 253);
        int int21 = sumWithoutArithmeticOperators0.getSum(1128, 552);
        int int24 = sumWithoutArithmeticOperators0.getSum(6858, 4672);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 253 + "'", int18 == 253);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1680 + "'", int21 == 1680);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11530 + "'", int24 == 11530);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(352, 375);
        int int18 = sumWithoutArithmeticOperators0.getSum(122, 1327);
        int int21 = sumWithoutArithmeticOperators0.getSum(11335, 1602);
        int int24 = sumWithoutArithmeticOperators0.getSum(14740, 8095);
        int int27 = sumWithoutArithmeticOperators0.getSum(2116, 12937);
        int int30 = sumWithoutArithmeticOperators0.getSum(0, 25940);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 727 + "'", int15 == 727);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1449 + "'", int18 == 1449);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12937 + "'", int21 == 12937);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 22835 + "'", int24 == 22835);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15053 + "'", int27 == 15053);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 25940 + "'", int30 == 25940);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(40, 269);
        int int6 = sumWithoutArithmeticOperators0.getSum(555, 4847);
        int int9 = sumWithoutArithmeticOperators0.getSum(1792, 33613);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 309 + "'", int3 == 309);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5402 + "'", int6 == 5402);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35405 + "'", int9 == 35405);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(10, 0);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 1, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(21, 11);
        int int15 = sumWithoutArithmeticOperators0.getSum(101, 21);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 152);
        int int21 = sumWithoutArithmeticOperators0.getSum(868, 253);
        int int24 = sumWithoutArithmeticOperators0.getSum(8010, 42869);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 122 + "'", int15 == 122);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 162 + "'", int18 == 162);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1121 + "'", int21 == 1121);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 50879 + "'", int24 == 50879);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
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
        int int39 = sumWithoutArithmeticOperators0.getSum(9671, 14446);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 24117 + "'", int39 == 24117);
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(162, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(623, 483);
        int int21 = sumWithoutArithmeticOperators0.getSum(9559, 2155);
        int int24 = sumWithoutArithmeticOperators0.getSum(5188, 21604);
        int int27 = sumWithoutArithmeticOperators0.getSum(154, 23416);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 324 + "'", int15 == 324);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1106 + "'", int18 == 1106);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11714 + "'", int21 == 11714);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 26792 + "'", int24 == 26792);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 23570 + "'", int27 == 23570);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(955, 89);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 55);
        int int21 = sumWithoutArithmeticOperators0.getSum(6388, 620);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1044 + "'", int15 == 1044);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 56 + "'", int18 == 56);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7008 + "'", int21 == 7008);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 19);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(859, 454);
        int int12 = sumWithoutArithmeticOperators0.getSum(1253, 461);
        int int15 = sumWithoutArithmeticOperators0.getSum(288, 309);
        int int18 = sumWithoutArithmeticOperators0.getSum(582, 271);
        int int21 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 51);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 2426);
        int int27 = sumWithoutArithmeticOperators0.getSum(16362, 7687);
        int int30 = sumWithoutArithmeticOperators0.getSum(6671, 1467);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1313 + "'", int9 == 1313);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1714 + "'", int12 == 1714);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 597 + "'", int15 == 597);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853 + "'", int18 == 853);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 51 + "'", int21 == 51);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2426 + "'", int24 == 2426);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 24049 + "'", int27 == 24049);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8138 + "'", int30 == 8138);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
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
        int int36 = sumWithoutArithmeticOperators0.getSum(562, 191);
        int int39 = sumWithoutArithmeticOperators0.getSum(15062, 11471);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 753 + "'", int36 == 753);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 26533 + "'", int39 == 26533);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(266, 295);
        int int15 = sumWithoutArithmeticOperators0.getSum(1067, (int) 'a');
        int int18 = sumWithoutArithmeticOperators0.getSum(3188, 1762);
        int int21 = sumWithoutArithmeticOperators0.getSum(1869, 3770);
        int int24 = sumWithoutArithmeticOperators0.getSum(1364, 19707);
        int int27 = sumWithoutArithmeticOperators0.getSum(0, 1331);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 561 + "'", int12 == 561);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1164 + "'", int15 == 1164);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4950 + "'", int18 == 4950);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5639 + "'", int21 == 5639);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 21071 + "'", int24 == 21071);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1331 + "'", int27 == 1331);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(40, 269);
        int int6 = sumWithoutArithmeticOperators0.getSum(6164, 1430);
        int int9 = sumWithoutArithmeticOperators0.getSum(3569, 1512);
        int int12 = sumWithoutArithmeticOperators0.getSum(5061, 1654);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 309 + "'", int3 == 309);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7594 + "'", int6 == 7594);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5081 + "'", int9 == 5081);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6715 + "'", int12 == 6715);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(618, 302);
        int int12 = sumWithoutArithmeticOperators0.getSum(4412, 498);
        int int15 = sumWithoutArithmeticOperators0.getSum(10864, 3364);
        int int18 = sumWithoutArithmeticOperators0.getSum(3433, 499);
        int int21 = sumWithoutArithmeticOperators0.getSum(10203, 10303);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 920 + "'", int9 == 920);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4910 + "'", int12 == 4910);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 14228 + "'", int15 == 14228);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3932 + "'", int18 == 3932);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20506 + "'", int21 == 20506);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 98);
        int int9 = sumWithoutArithmeticOperators0.getSum(3744, 507);
        int int12 = sumWithoutArithmeticOperators0.getSum(2076, 356);
        int int15 = sumWithoutArithmeticOperators0.getSum(3618, 28105);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 108 + "'", int6 == 108);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4251 + "'", int9 == 4251);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2432 + "'", int12 == 2432);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 31723 + "'", int15 == 31723);
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum(11, 10);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) '4', (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((-1), 35);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 250);
        int int18 = sumWithoutArithmeticOperators0.getSum(0, 213);
        int int21 = sumWithoutArithmeticOperators0.getSum(1668, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(11975, 0);
        int int27 = sumWithoutArithmeticOperators0.getSum(0, 852);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 249 + "'", int15 == 249);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 213 + "'", int18 == 213);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1668 + "'", int21 == 1668);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11975 + "'", int24 == 11975);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 852 + "'", int27 == 852);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
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
        int int30 = sumWithoutArithmeticOperators0.getSum((int) 'a', 8);
        int int33 = sumWithoutArithmeticOperators0.getSum(13923, 0);
        int int36 = sumWithoutArithmeticOperators0.getSum(3130, 7073);
        int int39 = sumWithoutArithmeticOperators0.getSum(2645, 1842);
        int int42 = sumWithoutArithmeticOperators0.getSum(17404, 7654);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 163 + "'", int18 == 163);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 295 + "'", int21 == 295);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 166 + "'", int24 == 166);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 785 + "'", int27 == 785);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 105 + "'", int30 == 105);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 13923 + "'", int33 == 13923);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10203 + "'", int36 == 10203);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4487 + "'", int39 == 4487);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 25058 + "'", int42 == 25058);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 10);
        int int15 = sumWithoutArithmeticOperators0.getSum(488, 1236);
        int int18 = sumWithoutArithmeticOperators0.getSum(546, 853);
        int int21 = sumWithoutArithmeticOperators0.getSum(452, 1281);
        int int24 = sumWithoutArithmeticOperators0.getSum(3882, 1003);
        int int27 = sumWithoutArithmeticOperators0.getSum(5734, 0);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1724 + "'", int15 == 1724);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1399 + "'", int18 == 1399);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1733 + "'", int21 == 1733);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4885 + "'", int24 == 4885);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5734 + "'", int27 == 5734);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(911, 432);
        int int12 = sumWithoutArithmeticOperators0.getSum(0, 34);
        int int15 = sumWithoutArithmeticOperators0.getSum(7558, 1097);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1343 + "'", int9 == 1343);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8655 + "'", int15 == 8655);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (short) 100);
        int int15 = sumWithoutArithmeticOperators0.getSum(955, 89);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) (short) 1, 55);
        int int21 = sumWithoutArithmeticOperators0.getSum(479, 786);
        int int24 = sumWithoutArithmeticOperators0.getSum(1294, 4470);
        int int27 = sumWithoutArithmeticOperators0.getSum(15994, 141);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1044 + "'", int15 == 1044);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 56 + "'", int18 == 56);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1265 + "'", int21 == 1265);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5764 + "'", int24 == 5764);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16135 + "'", int27 == 16135);
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(235, 2899);
        java.lang.Class<?> wildcardClass34 = sumWithoutArithmeticOperators0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3134 + "'", int33 == 3134);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(217, 238);
        int int21 = sumWithoutArithmeticOperators0.getSum(199, 427);
        int int24 = sumWithoutArithmeticOperators0.getSum(9710, 322);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 455 + "'", int18 == 455);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 626 + "'", int21 == 626);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10032 + "'", int24 == 10032);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) 0, 11);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, (int) (short) 100);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) 100, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(32, (int) '4');
        int int15 = sumWithoutArithmeticOperators0.getSum(44, 100);
        int int18 = sumWithoutArithmeticOperators0.getSum(217, 238);
        int int21 = sumWithoutArithmeticOperators0.getSum(156, 0);
        int int24 = sumWithoutArithmeticOperators0.getSum(593, 1374);
        int int27 = sumWithoutArithmeticOperators0.getSum(10566, 786);
        int int30 = sumWithoutArithmeticOperators0.getSum(471, 17592);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 144 + "'", int15 == 144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 455 + "'", int18 == 455);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 156 + "'", int21 == 156);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1967 + "'", int24 == 1967);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 11352 + "'", int27 == 11352);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 18063 + "'", int30 == 18063);
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum(21, (int) (byte) 0);
        int int12 = sumWithoutArithmeticOperators0.getSum(107, 0);
        int int15 = sumWithoutArithmeticOperators0.getSum(289, 555);
        int int18 = sumWithoutArithmeticOperators0.getSum(1926, 4985);
        int int21 = sumWithoutArithmeticOperators0.getSum(15949, 1044);
        int int24 = sumWithoutArithmeticOperators0.getSum(1467, 0);
        java.lang.Class<?> wildcardClass25 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 844 + "'", int15 == 844);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6911 + "'", int18 == 6911);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16993 + "'", int21 == 16993);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1467 + "'", int24 == 1467);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(33, 163);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) 'a', (int) (byte) 100);
        int int21 = sumWithoutArithmeticOperators0.getSum(499, (int) (byte) -1);
        int int24 = sumWithoutArithmeticOperators0.getSum(0, 245);
        int int27 = sumWithoutArithmeticOperators0.getSum(246, 7523);
        int int30 = sumWithoutArithmeticOperators0.getSum(17295, 7396);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 196 + "'", int15 == 196);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 197 + "'", int18 == 197);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 498 + "'", int21 == 498);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 245 + "'", int24 == 245);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7769 + "'", int27 == 7769);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 24691 + "'", int30 == 24691);
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(0, 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(109, 460);
        int int9 = sumWithoutArithmeticOperators0.getSum(615, 6280);
        java.lang.Class<?> wildcardClass10 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 569 + "'", int6 == 569);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6895 + "'", int9 == 6895);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
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
        int int30 = sumWithoutArithmeticOperators0.getSum(1587, 3619);
        int int33 = sumWithoutArithmeticOperators0.getSum(147, 0);
        int int36 = sumWithoutArithmeticOperators0.getSum(12946, 1713);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 109 + "'", int18 == 109);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 283 + "'", int21 == 283);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 377 + "'", int24 == 377);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1922 + "'", int27 == 1922);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5206 + "'", int30 == 5206);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 147 + "'", int33 == 147);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 14659 + "'", int36 == 14659);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum(10, (int) (byte) 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(321, 56);
        int int9 = sumWithoutArithmeticOperators0.getSum(2824, 7193);
        int int12 = sumWithoutArithmeticOperators0.getSum(5190, 11236);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 377 + "'", int6 == 377);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10017 + "'", int9 == 10017);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16426 + "'", int12 == 16426);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(44, 32);
        int int21 = sumWithoutArithmeticOperators0.getSum(25011, 3095);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 161 + "'", int15 == 161);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 76 + "'", int18 == 76);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 28106 + "'", int21 == 28106);
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (short) 10, 1);
        int int9 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, (int) (short) 10);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) '4', 134);
        int int15 = sumWithoutArithmeticOperators0.getSum(18, 1);
        int int18 = sumWithoutArithmeticOperators0.getSum((int) ' ', (int) (byte) 10);
        int int21 = sumWithoutArithmeticOperators0.getSum(1473, 281);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 186 + "'", int12 == 186);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 42 + "'", int18 == 42);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1754 + "'", int21 == 1754);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
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
        int int33 = sumWithoutArithmeticOperators0.getSum(6778, 3479);
        int int36 = sumWithoutArithmeticOperators0.getSum(4601, 3116);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10257 + "'", int33 == 10257);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 7717 + "'", int36 == 7717);
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) (short) -1, 19);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 35);
        int int9 = sumWithoutArithmeticOperators0.getSum(859, 454);
        int int12 = sumWithoutArithmeticOperators0.getSum(1253, 461);
        int int15 = sumWithoutArithmeticOperators0.getSum(288, 309);
        int int18 = sumWithoutArithmeticOperators0.getSum(582, 271);
        int int21 = sumWithoutArithmeticOperators0.getSum(486, 7366);
        java.lang.Class<?> wildcardClass22 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1313 + "'", int9 == 1313);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1714 + "'", int12 == 1714);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 597 + "'", int15 == 597);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853 + "'", int18 == 853);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7852 + "'", int21 == 7852);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(21, 2250);
        int int9 = sumWithoutArithmeticOperators0.getSum(760, 6076);
        int int12 = sumWithoutArithmeticOperators0.getSum(23914, 3266);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2271 + "'", int6 == 2271);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6836 + "'", int9 == 6836);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27180 + "'", int12 == 27180);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum((int) (byte) -1, 35);
        int int15 = sumWithoutArithmeticOperators0.getSum(19, 110);
        int int18 = sumWithoutArithmeticOperators0.getSum(51, 109);
        int int21 = sumWithoutArithmeticOperators0.getSum(11, 40);
        int int24 = sumWithoutArithmeticOperators0.getSum(587, 195);
        int int27 = sumWithoutArithmeticOperators0.getSum(3034, 3757);
        java.lang.Class<?> wildcardClass28 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 129 + "'", int15 == 129);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 160 + "'", int18 == 160);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 51 + "'", int21 == 51);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 782 + "'", int24 == 782);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6791 + "'", int27 == 6791);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '#', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum(0, 100);
        int int9 = sumWithoutArithmeticOperators0.getSum(35, (int) (short) 1);
        int int12 = sumWithoutArithmeticOperators0.getSum(238, 152);
        int int15 = sumWithoutArithmeticOperators0.getSum(245, 162);
        int int18 = sumWithoutArithmeticOperators0.getSum(936, 2060);
        int int21 = sumWithoutArithmeticOperators0.getSum(29330, 1005);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 390 + "'", int12 == 390);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 407 + "'", int15 == 407);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2996 + "'", int18 == 2996);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30335 + "'", int21 == 30335);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        com.thealgorithms.maths.SumWithoutArithmeticOperators sumWithoutArithmeticOperators0 = new com.thealgorithms.maths.SumWithoutArithmeticOperators();
        int int3 = sumWithoutArithmeticOperators0.getSum((int) '4', 0);
        int int6 = sumWithoutArithmeticOperators0.getSum((int) (byte) 10, 98);
        int int9 = sumWithoutArithmeticOperators0.getSum(3744, 507);
        int int12 = sumWithoutArithmeticOperators0.getSum(2076, 356);
        java.lang.Class<?> wildcardClass13 = sumWithoutArithmeticOperators0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 108 + "'", int6 == 108);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4251 + "'", int9 == 4251);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2432 + "'", int12 == 2432);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }
}

